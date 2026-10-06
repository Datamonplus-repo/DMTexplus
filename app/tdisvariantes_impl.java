package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdisvariantes_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel9"+"_"+"DISPIEMTR") == 0 )
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
         gx9asadispiemtr1O334( A396EmprCod, A361DisCod, A365DisDes) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel10"+"_"+"DISPIEKGM") == 0 )
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
         gx10asadispiekgm1O334( A396EmprCod, A361DisCod, A365DisDes) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Cominaciones / Variantes /Pintas", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtDisArtAnh_Internalname ;
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
      nRC_GXsfl_95 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_95"))) ;
      nGXsfl_95_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_95_idx"))) ;
      sGXsfl_95_idx = httpContext.GetPar( "sGXsfl_95_idx") ;
      A362DisColNom = httpContext.GetPar( "DisColNom") ;
      n362DisColNom = false ;
      A2525DisComULin = (byte)(GXutil.lval( httpContext.GetPar( "DisComULin"))) ;
      n2525DisComULin = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      A334DisArtAnh = (short)(GXutil.lval( httpContext.GetPar( "DisArtAnh"))) ;
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

   public tdisvariantes_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdisvariantes_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdisvariantes_impl.class ));
   }

   public tdisvariantes_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisVariantes.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisVariantes.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisVariantes.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisVariantes.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDisVariantes.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDisVariantes.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Ultima linea Combinacion", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisComULin_Internalname, GXutil.ltrim( localUtil.ntoc( A2525DisComULin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisComULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2525DisComULin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A2525DisComULin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisComULin_Jsonclick, 0, "", "", "", "", "", 1, edtDisComULin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Dibujo del Cliente", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibCli_Internalname, GXutil.rtrim( A1013DibCli), GXutil.rtrim( localUtil.format( A1013DibCli, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibCli_Jsonclick, 0, "", "", "", "", "", 1, edtDibCli_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Dibujo Interno", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibInt_Internalname, GXutil.ltrim( localUtil.ntoc( A1014DibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDibInt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibInt_Jsonclick, 0, "", "", "", "", "", 1, edtDibInt_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Articulo Disposicion", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtCod_Internalname, GXutil.rtrim( A335DisArtCod), GXutil.rtrim( localUtil.format( A335DisArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisColNom_Internalname, GXutil.rtrim( A362DisColNom), GXutil.rtrim( localUtil.format( A362DisColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisColNom_Jsonclick, 0, "", "", "", "", "", 1, edtDisColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Metros Realizados", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibMetRea_Internalname, GXutil.ltrim( localUtil.ntoc( A1018DibMetRea, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDibMetRea_Enabled!=0) ? localUtil.format( A1018DibMetRea, "ZZZZZ9.99") : localUtil.format( A1018DibMetRea, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibMetRea_Jsonclick, 0, "", "", "", "", "", 1, edtDibMetRea_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Ancho Acabado", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A334DisArtAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtAnh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A334DisArtAnh), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A334DisArtAnh), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtAnh_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtAnh_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Metros Dispuestos / Dispos.", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisPieMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A385DisPieMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPieMtr_Enabled!=0) ? localUtil.format( A385DisPieMtr, "ZZZZZ9.99") : localUtil.format( A385DisPieMtr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPieMtr_Jsonclick, 0, "", "", "", "", "", 1, edtDisPieMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Kilos Dispuestos Dispos.", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisPieKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A381DisPieKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPieKgm_Enabled!=0) ? localUtil.format( A381DisPieKgm, "ZZZZZ9.99") : localUtil.format( A381DisPieKgm, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPieKgm_Jsonclick, 0, "", "", "", "", "", 1, edtDisPieKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Total piezas dispuestas", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisPiePie_Internalname, GXutil.ltrim( localUtil.ntoc( A387DisPiePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPiePie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A387DisPiePie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A387DisPiePie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPiePie_Jsonclick, 0, "", "", "", "", "", 1, edtDisPiePie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDisVariantes.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol95( ) ;
      nGXsfl_95_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount551 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_551 = (short)(1) ;
            scanStart1O3551( ) ;
            while ( RcdFound551 != 0 )
            {
               init_level_properties551( ) ;
               getByPrimaryKey1O3551( ) ;
               addRow1O3551( ) ;
               scanNext1O3551( ) ;
            }
            scanEnd1O3551( ) ;
            nBlankRcdCount551 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B1018DibMetRea = A1018DibMetRea ;
         n1018DibMetRea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
         B2525DisComULin = A2525DisComULin ;
         n2525DisComULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         standaloneNotModal1O3551( ) ;
         standaloneModal1O3551( ) ;
         sMode551 = Gx_mode ;
         while ( nGXsfl_95_idx < nRC_GXsfl_95 )
         {
            bGXsfl_95_Refreshing = true ;
            readRow1O3551( ) ;
            edtavnRcdDeleted_551_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_551_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_551_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_551_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtDisComLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMLIN_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtDisComCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMCOD_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtFonCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FONCOD_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtDisComAnh_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMANH_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComAnh_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtDisComMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMMTR_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComMtr_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtDisComPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMPIE_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComPie_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtDisComObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMOBS_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComObs_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            if ( ( nRcdExists_551 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1O3551( ) ;
            }
            sendRow1O3551( ) ;
            bGXsfl_95_Refreshing = false ;
         }
         Gx_mode = sMode551 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1018DibMetRea = B1018DibMetRea ;
         n1018DibMetRea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
         A2525DisComULin = B2525DisComULin ;
         n2525DisComULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount551 = (short)(5) ;
         nRcdExists_551 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1O3551( ) ;
            while ( RcdFound551 != 0 )
            {
               sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_95551( ) ;
               init_level_properties551( ) ;
               standaloneNotModal1O3551( ) ;
               getByPrimaryKey1O3551( ) ;
               standaloneModal1O3551( ) ;
               addRow1O3551( ) ;
               scanNext1O3551( ) ;
            }
            scanEnd1O3551( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode551 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_95551( ) ;
      initAll1O3551( ) ;
      init_level_properties551( ) ;
      B1018DibMetRea = A1018DibMetRea ;
      n1018DibMetRea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
      B2525DisComULin = A2525DisComULin ;
      n2525DisComULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      nRcdExists_551 = (short)(0) ;
      nIsMod_551 = (short)(0) ;
      nRcdDeleted_551 = (short)(0) ;
      nBlankRcdCount551 = (short)(nBlankRcdUsr551+nBlankRcdCount551) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount551 > 0 )
      {
         standaloneNotModal1O3551( ) ;
         standaloneModal1O3551( ) ;
         addRow1O3551( ) ;
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
      A1018DibMetRea = B1018DibMetRea ;
      n1018DibMetRea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
      A2525DisComULin = B2525DisComULin ;
      n2525DisComULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisVariantes.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisVariantes.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisVariantes.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisVariantes.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDisVariantes.htm");
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
      e111O32 ();
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
            Z2525DisComULin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2525DisComULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z335DisArtCod = httpContext.cgiGet( "Z335DisArtCod") ;
            Z362DisColNom = httpContext.cgiGet( "Z362DisColNom") ;
            Z334DisArtAnh = (short)(localUtil.ctol( httpContext.cgiGet( "Z334DisArtAnh"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1013DibCli = httpContext.cgiGet( "Z1013DibCli") ;
            Z1014DibInt = (int)(localUtil.ctol( httpContext.cgiGet( "Z1014DibInt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z365DisDes = httpContext.cgiGet( "Z365DisDes") ;
            Z1018DibMetRea = localUtil.ctond( httpContext.cgiGet( "Z1018DibMetRea")) ;
            A365DisDes = httpContext.cgiGet( "Z365DisDes") ;
            O1018DibMetRea = localUtil.ctond( httpContext.cgiGet( "O1018DibMetRea")) ;
            O2525DisComULin = (byte)(localUtil.ctol( httpContext.cgiGet( "O2525DisComULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_95 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_95"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A365DisDes = httpContext.cgiGet( "DISDES") ;
            AV34Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A1013DibCli = httpContext.cgiGet( edtDibCli_Internalname) ;
            n1013DibCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
            A1014DibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1014DibInt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            A335DisArtCod = httpContext.cgiGet( edtDisArtCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
            A362DisColNom = httpContext.cgiGet( edtDisColNom_Internalname) ;
            n362DisColNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
            A1018DibMetRea = localUtil.ctond( httpContext.cgiGet( edtDibMetRea_Internalname)) ;
            n1018DibMetRea = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISARTANH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDisArtAnh_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A334DisArtAnh = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A334DisArtAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A334DisArtAnh), 3, 0));
            }
            else
            {
               A334DisArtAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A334DisArtAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A334DisArtAnh), 3, 0));
            }
            A385DisPieMtr = localUtil.ctond( httpContext.cgiGet( edtDisPieMtr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
            A381DisPieKgm = localUtil.ctond( httpContext.cgiGet( edtDisPieKgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
            A387DisPiePie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPiePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n387DisPiePie = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TDisVariantes");
            A1013DibCli = httpContext.cgiGet( edtDibCli_Internalname) ;
            n1013DibCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
            forbiddenHiddens.add("DibCli", GXutil.rtrim( localUtil.format( A1013DibCli, "")));
            A1014DibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1014DibInt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            forbiddenHiddens.add("DibInt", localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9"));
            A335DisArtCod = httpContext.cgiGet( edtDisArtCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
            forbiddenHiddens.add("DisArtCod", GXutil.rtrim( localUtil.format( A335DisArtCod, "")));
            A362DisColNom = httpContext.cgiGet( edtDisColNom_Internalname) ;
            n362DisColNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
            forbiddenHiddens.add("DisColNom", GXutil.rtrim( localUtil.format( A362DisColNom, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tdisvariantes:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                        e111O32 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BUSCAR COMBINACION'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Buscar Combinacion' */
                        e121O32 ();
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
            initAll1O334( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_551_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_551_Enabled), 5, 0), !bGXsfl_95_Refreshing);
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
      disableAttributes1O334( ) ;
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

   public void confirm_1O30( )
   {
      beforeValidate1O334( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1O334( ) ;
         }
         else
         {
            checkExtendedTable1O334( ) ;
            if ( AnyError == 0 )
            {
               zm1O334( 21) ;
               zm1O334( 22) ;
               zm1O334( 23) ;
               zm1O334( 24) ;
            }
            closeExtendedTableCursors1O334( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode34 = Gx_mode ;
         confirm_1O3551( ) ;
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
         confirmValues1O30( ) ;
      }
   }

   public void confirm_1O3551( )
   {
      s1018DibMetRea = O1018DibMetRea ;
      n1018DibMetRea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
      s2525DisComULin = O2525DisComULin ;
      n2525DisComULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      nGXsfl_95_idx = 0 ;
      while ( nGXsfl_95_idx < nRC_GXsfl_95 )
      {
         readRow1O3551( ) ;
         if ( ( nRcdExists_551 != 0 ) || ( nIsMod_551 != 0 ) )
         {
            getKey1O3551( ) ;
            if ( ( nRcdExists_551 == 0 ) && ( nRcdDeleted_551 == 0 ) )
            {
               if ( RcdFound551 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1O3551( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1O3551( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1O3551( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O1018DibMetRea = A1018DibMetRea ;
                     n1018DibMetRea = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
                     O2525DisComULin = A2525DisComULin ;
                     n2525DisComULin = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
                  }
               }
               else
               {
                  GXCCtl = "DISCOMLIN_" + sGXsfl_95_idx ;
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
                     getByPrimaryKey1O3551( ) ;
                     load1O3551( ) ;
                     beforeValidate1O3551( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1O3551( ) ;
                        O1018DibMetRea = A1018DibMetRea ;
                        n1018DibMetRea = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
                        O2525DisComULin = A2525DisComULin ;
                        n2525DisComULin = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_551 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1O3551( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1O3551( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1O3551( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O1018DibMetRea = A1018DibMetRea ;
                           n1018DibMetRea = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
                           O2525DisComULin = A2525DisComULin ;
                           n2525DisComULin = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_551 == 0 )
                  {
                     GXCCtl = "DISCOMLIN_" + sGXsfl_95_idx ;
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
         httpContext.changePostValue( edtDisComAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A1057DisComAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComPie_Internalname, GXutil.ltrim( localUtil.ntoc( A1059DisComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComObs_Internalname, GXutil.rtrim( A7735DisComObs)) ;
         httpContext.changePostValue( "ZT_"+"Z2524DisComLin_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1056DisComCod_"+sGXsfl_95_idx, GXutil.rtrim( Z1056DisComCod)) ;
         httpContext.changePostValue( "ZT_"+"Z1032FonCod_"+sGXsfl_95_idx, GXutil.rtrim( Z1032FonCod)) ;
         httpContext.changePostValue( "ZT_"+"Z1057DisComAnh_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z1057DisComAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1058DisComMtr_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1059DisComPie_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z1059DisComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7735DisComObs_"+sGXsfl_95_idx, GXutil.rtrim( Z7735DisComObs)) ;
         httpContext.changePostValue( "T1058DisComMtr_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( O1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_551_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_551_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_551_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_551 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_551_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_551_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMLIN_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMCOD_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FONCOD_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFonCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMANH_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComAnh_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMMTR_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMPIE_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMOBS_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O1018DibMetRea = s1018DibMetRea ;
      n1018DibMetRea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
      O2525DisComULin = s2525DisComULin ;
      n2525DisComULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1O30( )
   {
   }

   public void e111O32( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tdisvariantes_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV34Pgmname, (byte)(99), GXv_char2) ;
      tdisvariantes_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tdisvariantes_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdisvariantes_impl.this.A396EmprCod = GXv_char2[0] ;
      tdisvariantes_impl.this.AV11EmprNom = GXv_char3[0] ;
      tdisvariantes_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e121O32( )
   {
      /* 'Buscar Combinacion' Routine */
      returnInSub = false ;
      /*  Sending Event outputs  */
   }

   public void zm1O334( int GX_JID )
   {
      if ( ( GX_JID == 20 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2525DisComULin = T01O35_A2525DisComULin[0] ;
            Z335DisArtCod = T01O35_A335DisArtCod[0] ;
            Z362DisColNom = T01O35_A362DisColNom[0] ;
            Z334DisArtAnh = T01O35_A334DisArtAnh[0] ;
            Z252CliCod = T01O35_A252CliCod[0] ;
            Z1013DibCli = T01O35_A1013DibCli[0] ;
            Z1014DibInt = T01O35_A1014DibInt[0] ;
            Z365DisDes = T01O35_A365DisDes[0] ;
         }
         else
         {
            Z2525DisComULin = A2525DisComULin ;
            Z335DisArtCod = A335DisArtCod ;
            Z362DisColNom = A362DisColNom ;
            Z334DisArtAnh = A334DisArtAnh ;
            Z252CliCod = A252CliCod ;
            Z1013DibCli = A1013DibCli ;
            Z1014DibInt = A1014DibInt ;
            Z365DisDes = A365DisDes ;
         }
      }
      if ( ( GX_JID == 23 ) || ( GX_JID == 0 ) )
      {
         Z1018DibMetRea = T01O39_A1018DibMetRea[0] ;
      }
      if ( GX_JID == -20 )
      {
         Z361DisCod = A361DisCod ;
         Z2525DisComULin = A2525DisComULin ;
         Z335DisArtCod = A335DisArtCod ;
         Z362DisColNom = A362DisColNom ;
         Z334DisArtAnh = A334DisArtAnh ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z1013DibCli = A1013DibCli ;
         Z1014DibInt = A1014DibInt ;
         Z365DisDes = A365DisDes ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z1018DibMetRea = A1018DibMetRea ;
         Z387DisPiePie = A387DisPiePie ;
      }
   }

   public void standaloneNotModal( )
   {
      edtDisComULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComULin_Enabled), 5, 0), true);
      edtDibMetRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibMetRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibMetRea_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtDisArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtCod_Enabled), 5, 0), true);
      edtDisColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisColNom_Enabled), 5, 0), true);
      edtDibCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCli_Enabled), 5, 0), true);
      edtDibInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibInt_Enabled), 5, 0), true);
      AV34Pgmname = "TDisVariantes" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtDisComULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComULin_Enabled), 5, 0), true);
      edtDibMetRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibMetRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibMetRea_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtDisArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtCod_Enabled), 5, 0), true);
      edtDisColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisColNom_Enabled), 5, 0), true);
      edtDibCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCli_Enabled), 5, 0), true);
      edtDibInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibInt_Enabled), 5, 0), true);
      /* Using cursor T01O36 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01O36_A407EmprNom[0] ;
      n407EmprNom = T01O36_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01O311 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A387DisPiePie = T01O311_A387DisPiePie[0] ;
         n387DisPiePie = T01O311_n387DisPiePie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
      }
      else
      {
         A387DisPiePie = (short)(0) ;
         n387DisPiePie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
      }
      pr_default.close(8);
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
      /* Using cursor T01O37 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01O37_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
      /* Using cursor T01O39 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
      zm1O334( 23) ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A1013DibCli)==0) || (0==A252CliCod) || (0==A1014DibInt) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDIBUJ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DIBINT");
            AnyError = (short)(1) ;
         }
      }
      A1018DibMetRea = T01O39_A1018DibMetRea[0] ;
      n1018DibMetRea = T01O39_n1018DibMetRea[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
      O1018DibMetRea = A1018DibMetRea ;
      n1018DibMetRea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
      pr_default.close(6);
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
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
      {
         A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
         }
         else
         {
            A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
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

   public void load1O334( )
   {
      /* Using cursor T01O313 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A407EmprNom = T01O313_A407EmprNom[0] ;
         n407EmprNom = T01O313_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A2525DisComULin = T01O313_A2525DisComULin[0] ;
         n2525DisComULin = T01O313_n2525DisComULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         A279CliNom = T01O313_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A335DisArtCod = T01O313_A335DisArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
         A362DisColNom = T01O313_A362DisColNom[0] ;
         n362DisColNom = T01O313_n362DisColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
         A1018DibMetRea = T01O313_A1018DibMetRea[0] ;
         n1018DibMetRea = T01O313_n1018DibMetRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
         A334DisArtAnh = T01O313_A334DisArtAnh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A334DisArtAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A334DisArtAnh), 3, 0));
         A252CliCod = T01O313_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1013DibCli = T01O313_A1013DibCli[0] ;
         n1013DibCli = T01O313_n1013DibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A1014DibInt = T01O313_A1014DibInt[0] ;
         n1014DibInt = T01O313_n1014DibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A387DisPiePie = T01O313_A387DisPiePie[0] ;
         n387DisPiePie = T01O313_n387DisPiePie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
         A365DisDes = T01O313_A365DisDes[0] ;
         zm1O334( -20) ;
      }
      pr_default.close(9);
      onLoadActions1O334( ) ;
   }

   public void onLoadActions1O334( )
   {
      O1018DibMetRea = A1018DibMetRea ;
      n1018DibMetRea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
   }

   public void checkExtendedTable1O334( )
   {
      nIsDirty_34 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1O334( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1O334( )
   {
      /* Using cursor T01O314 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
      else
      {
         RcdFound34 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01O35 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(3) != 101) && ( T01O35_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01O35_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1O334( 20) ;
         RcdFound34 = (short)(1) ;
         A2525DisComULin = T01O35_A2525DisComULin[0] ;
         n2525DisComULin = T01O35_n2525DisComULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         A335DisArtCod = T01O35_A335DisArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
         A362DisColNom = T01O35_A362DisColNom[0] ;
         n362DisColNom = T01O35_n362DisColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
         A334DisArtAnh = T01O35_A334DisArtAnh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A334DisArtAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A334DisArtAnh), 3, 0));
         A252CliCod = T01O35_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1013DibCli = T01O35_A1013DibCli[0] ;
         n1013DibCli = T01O35_n1013DibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A1014DibInt = T01O35_A1014DibInt[0] ;
         n1014DibInt = T01O35_n1014DibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A365DisDes = T01O35_A365DisDes[0] ;
         O2525DisComULin = A2525DisComULin ;
         n2525DisComULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1O334( ) ;
         if ( AnyError == 1 )
         {
            RcdFound34 = (short)(0) ;
            initializeNonKey1O334( ) ;
         }
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound34 = (short)(0) ;
         initializeNonKey1O334( ) ;
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
      getKey1O334( ) ;
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
      /* Using cursor T01O315 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T01O315_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01O315_A361DisCod[0] == A361DisCod ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T01O315_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01O315_A361DisCod[0] == A361DisCod ) )
         {
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound34 = (short)(0) ;
      /* Using cursor T01O316 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T01O316_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01O316_A361DisCod[0] == A361DisCod ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T01O316_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01O316_A361DisCod[0] == A361DisCod ) )
         {
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1O334( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A1018DibMetRea = O1018DibMetRea ;
         n1018DibMetRea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
         A2525DisComULin = O2525DisComULin ;
         n2525DisComULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         GX_FocusControl = edtDisArtAnh_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1O334( ) ;
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
               A1018DibMetRea = O1018DibMetRea ;
               n1018DibMetRea = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
               A2525DisComULin = O2525DisComULin ;
               n2525DisComULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtDisArtAnh_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A1018DibMetRea = O1018DibMetRea ;
               n1018DibMetRea = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
               A2525DisComULin = O2525DisComULin ;
               n2525DisComULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
               update1O334( ) ;
               GX_FocusControl = edtDisArtAnh_Internalname ;
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
               A1018DibMetRea = O1018DibMetRea ;
               n1018DibMetRea = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
               A2525DisComULin = O2525DisComULin ;
               n2525DisComULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
               GX_FocusControl = edtDisArtAnh_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1O334( ) ;
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
                  A1018DibMetRea = O1018DibMetRea ;
                  n1018DibMetRea = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
                  A2525DisComULin = O2525DisComULin ;
                  n2525DisComULin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
                  GX_FocusControl = edtDisArtAnh_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1O334( ) ;
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
         A1018DibMetRea = O1018DibMetRea ;
         n1018DibMetRea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
         A2525DisComULin = O2525DisComULin ;
         n2525DisComULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtDisArtAnh_Internalname ;
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
      getKey1O334( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdisvariantes");
      GX_FocusControl = edtDisArtAnh_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1O30( ) ;
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
      GX_FocusControl = edtDisArtAnh_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1O334( ) ;
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDisArtAnh_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1O334( ) ;
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
      GX_FocusControl = edtDisArtAnh_Internalname ;
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
      GX_FocusControl = edtDisArtAnh_Internalname ;
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
      scanStart1O334( ) ;
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound34 != 0 )
         {
            scanNext1O334( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDisArtAnh_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1O334( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1O334( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01O34 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( Z2525DisComULin != T01O34_A2525DisComULin[0] ) || ( GXutil.strcmp(Z335DisArtCod, T01O34_A335DisArtCod[0]) != 0 ) || ( GXutil.strcmp(Z362DisColNom, T01O34_A362DisColNom[0]) != 0 ) || ( Z334DisArtAnh != T01O34_A334DisArtAnh[0] ) || ( Z252CliCod != T01O34_A252CliCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z1013DibCli, T01O34_A1013DibCli[0]) != 0 ) || ( Z1014DibInt != T01O34_A1014DibInt[0] ) || ( GXutil.strcmp(Z365DisDes, T01O34_A365DisDes[0]) != 0 ) )
         {
            if ( Z2525DisComULin != T01O34_A2525DisComULin[0] )
            {
               GXutil.writeLogln("tdisvariantes:[seudo value changed for attri]"+"DisComULin");
               GXutil.writeLogRaw("Old: ",Z2525DisComULin);
               GXutil.writeLogRaw("Current: ",T01O34_A2525DisComULin[0]);
            }
            if ( GXutil.strcmp(Z335DisArtCod, T01O34_A335DisArtCod[0]) != 0 )
            {
               GXutil.writeLogln("tdisvariantes:[seudo value changed for attri]"+"DisArtCod");
               GXutil.writeLogRaw("Old: ",Z335DisArtCod);
               GXutil.writeLogRaw("Current: ",T01O34_A335DisArtCod[0]);
            }
            if ( GXutil.strcmp(Z362DisColNom, T01O34_A362DisColNom[0]) != 0 )
            {
               GXutil.writeLogln("tdisvariantes:[seudo value changed for attri]"+"DisColNom");
               GXutil.writeLogRaw("Old: ",Z362DisColNom);
               GXutil.writeLogRaw("Current: ",T01O34_A362DisColNom[0]);
            }
            if ( Z334DisArtAnh != T01O34_A334DisArtAnh[0] )
            {
               GXutil.writeLogln("tdisvariantes:[seudo value changed for attri]"+"DisArtAnh");
               GXutil.writeLogRaw("Old: ",Z334DisArtAnh);
               GXutil.writeLogRaw("Current: ",T01O34_A334DisArtAnh[0]);
            }
            if ( Z252CliCod != T01O34_A252CliCod[0] )
            {
               GXutil.writeLogln("tdisvariantes:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01O34_A252CliCod[0]);
            }
            if ( GXutil.strcmp(Z1013DibCli, T01O34_A1013DibCli[0]) != 0 )
            {
               GXutil.writeLogln("tdisvariantes:[seudo value changed for attri]"+"DibCli");
               GXutil.writeLogRaw("Old: ",Z1013DibCli);
               GXutil.writeLogRaw("Current: ",T01O34_A1013DibCli[0]);
            }
            if ( Z1014DibInt != T01O34_A1014DibInt[0] )
            {
               GXutil.writeLogln("tdisvariantes:[seudo value changed for attri]"+"DibInt");
               GXutil.writeLogRaw("Old: ",Z1014DibInt);
               GXutil.writeLogRaw("Current: ",T01O34_A1014DibInt[0]);
            }
            if ( GXutil.strcmp(Z365DisDes, T01O34_A365DisDes[0]) != 0 )
            {
               GXutil.writeLogln("tdisvariantes:[seudo value changed for attri]"+"DisDes");
               GXutil.writeLogRaw("Old: ",Z365DisDes);
               GXutil.writeLogRaw("Current: ",T01O34_A365DisDes[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISPOS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01O317 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(13) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCDIBUJ"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         if ( false || ( DecimalUtil.compareTo(Z1018DibMetRea, T01O317_A1018DibMetRea[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z1018DibMetRea, T01O317_A1018DibMetRea[0]) != 0 )
            {
               GXutil.writeLogln("tdisvariantes:[seudo value changed for attri]"+"DibMetRea");
               GXutil.writeLogRaw("Old: ",Z1018DibMetRea);
               GXutil.writeLogRaw("Current: ",T01O317_A1018DibMetRea[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCDIBUJ"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1O334( )
   {
      beforeValidate1O334( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1O334( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1O334( 0) ;
         checkOptimisticConcurrency1O334( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1O334( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1O334( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01O318 */
                  pr_default.execute(14, new Object[] {Integer.valueOf(A361DisCod), Boolean.valueOf(n2525DisComULin), Byte.valueOf(A2525DisComULin), A335DisArtCod, Boolean.valueOf(n362DisColNom), A362DisColNom, Short.valueOf(A334DisArtAnh), A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), A365DisDes});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
                  if ( (pr_default.getStatus(14) == 1) )
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
                        processLevel1O334( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1O30( ) ;
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
            load1O334( ) ;
         }
         endLevel1O334( ) ;
      }
      closeExtendedTableCursors1O334( ) ;
   }

   public void update1O334( )
   {
      beforeValidate1O334( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1O334( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1O334( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1O334( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1O334( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01O319 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n2525DisComULin), Byte.valueOf(A2525DisComULin), A335DisArtCod, Boolean.valueOf(n362DisColNom), A362DisColNom, Short.valueOf(A334DisArtAnh), Integer.valueOf(A252CliCod), Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), A365DisDes, A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1O334( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int5[0] = A361DisCod ;
                     new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int5) ;
                     tdisvariantes_impl.this.A396EmprCod = GXv_char4[0] ;
                     tdisvariantes_impl.this.A361DisCod = GXv_int5[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1O334( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1O30( ) ;
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
         endLevel1O334( ) ;
      }
      closeExtendedTableCursors1O334( ) ;
   }

   public void deferredUpdate1O334( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1O334( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1O334( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1O334( ) ;
         afterConfirm1O334( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1O334( ) ;
            if ( AnyError == 0 )
            {
               A1018DibMetRea = O1018DibMetRea ;
               n1018DibMetRea = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
               A2525DisComULin = O2525DisComULin ;
               n2525DisComULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
               scanStart1O3551( ) ;
               while ( RcdFound551 != 0 )
               {
                  getByPrimaryKey1O3551( ) ;
                  delete1O3551( ) ;
                  scanNext1O3551( ) ;
                  O1018DibMetRea = A1018DibMetRea ;
                  n1018DibMetRea = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
                  O2525DisComULin = A2525DisComULin ;
                  n2525DisComULin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
               }
               scanEnd1O3551( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01O320 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
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
                           initAll1O334( ) ;
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
                        resetCaption1O30( ) ;
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
      endLevel1O334( ) ;
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1O334( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01O321 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Accesorios Tinte", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01O322 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normativas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01O323 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01O324 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01O325 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DisPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01O326 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISACC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01O327 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISREF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01O328 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSERV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01O329 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01O330 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISDEF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01O331 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
      }
   }

   public void processNestedLevel1O3551( )
   {
      s1018DibMetRea = O1018DibMetRea ;
      n1018DibMetRea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
      s2525DisComULin = O2525DisComULin ;
      n2525DisComULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      nGXsfl_95_idx = 0 ;
      while ( nGXsfl_95_idx < nRC_GXsfl_95 )
      {
         readRow1O3551( ) ;
         if ( ( nRcdExists_551 != 0 ) || ( nIsMod_551 != 0 ) )
         {
            standaloneNotModal1O3551( ) ;
            getKey1O3551( ) ;
            if ( ( nRcdExists_551 == 0 ) && ( nRcdDeleted_551 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1O3551( ) ;
            }
            else
            {
               if ( RcdFound551 != 0 )
               {
                  if ( ( nRcdDeleted_551 != 0 ) && ( nRcdExists_551 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1O3551( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_551 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1O3551( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_551 == 0 )
                  {
                     GXCCtl = "DISCOMLIN_" + sGXsfl_95_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisComLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O1018DibMetRea = A1018DibMetRea ;
            n1018DibMetRea = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
            O2525DisComULin = A2525DisComULin ;
            n2525DisComULin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_551_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComCod_Internalname, GXutil.rtrim( A1056DisComCod)) ;
         httpContext.changePostValue( edtFonCod_Internalname, GXutil.rtrim( A1032FonCod)) ;
         httpContext.changePostValue( edtDisComAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A1057DisComAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComPie_Internalname, GXutil.ltrim( localUtil.ntoc( A1059DisComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComObs_Internalname, GXutil.rtrim( A7735DisComObs)) ;
         httpContext.changePostValue( "ZT_"+"Z2524DisComLin_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1056DisComCod_"+sGXsfl_95_idx, GXutil.rtrim( Z1056DisComCod)) ;
         httpContext.changePostValue( "ZT_"+"Z1032FonCod_"+sGXsfl_95_idx, GXutil.rtrim( Z1032FonCod)) ;
         httpContext.changePostValue( "ZT_"+"Z1057DisComAnh_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z1057DisComAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1058DisComMtr_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1059DisComPie_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z1059DisComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7735DisComObs_"+sGXsfl_95_idx, GXutil.rtrim( Z7735DisComObs)) ;
         httpContext.changePostValue( "T1058DisComMtr_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( O1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_551_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_551_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_551_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_551 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_551_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_551_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMLIN_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMCOD_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FONCOD_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFonCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMANH_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComAnh_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMMTR_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMPIE_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMOBS_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1O3551( ) ;
      if ( AnyError != 0 )
      {
         O1018DibMetRea = s1018DibMetRea ;
         n1018DibMetRea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
         O2525DisComULin = s2525DisComULin ;
         n2525DisComULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      }
      nRcdExists_551 = (short)(0) ;
      nIsMod_551 = (short)(0) ;
      nRcdDeleted_551 = (short)(0) ;
   }

   public void processLevel1O334( )
   {
      /* Save parent mode. */
      sMode34 = Gx_mode ;
      processNestedLevel1O3551( ) ;
      if ( AnyError != 0 )
      {
         O1018DibMetRea = s1018DibMetRea ;
         n1018DibMetRea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
         O2525DisComULin = s2525DisComULin ;
         n2525DisComULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01O332 */
      pr_default.execute(28, new Object[] {Boolean.valueOf(n2525DisComULin), Byte.valueOf(A2525DisComULin), A396EmprCod, Integer.valueOf(A361DisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
      /* Using cursor T01O333 */
      pr_default.execute(29, new Object[] {Boolean.valueOf(n1018DibMetRea), A1018DibMetRea, A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDIBUJ");
   }

   public void endLevel1O334( )
   {
      pr_default.close(2);
      pr_default.close(13);
      if ( AnyError == 0 )
      {
         beforeComplete1O334( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdisvariantes");
         if ( AnyError == 0 )
         {
            confirmValues1O30( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdisvariantes");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1O334( )
   {
      /* Scan By routine */
      /* Using cursor T01O334 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1O334( )
   {
      /* Scan next routine */
      pr_default.readNext(30);
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
   }

   public void scanEnd1O334( )
   {
      pr_default.close(30);
   }

   public void afterConfirm1O334( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1O334( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1O334( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1O334( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1O334( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1O334( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1O334( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtDisComULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComULin_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtDibCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCli_Enabled), 5, 0), true);
      edtDibInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibInt_Enabled), 5, 0), true);
      edtDisArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtCod_Enabled), 5, 0), true);
      edtDisColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisColNom_Enabled), 5, 0), true);
      edtDibMetRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibMetRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibMetRea_Enabled), 5, 0), true);
      edtDisArtAnh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtAnh_Enabled), 5, 0), true);
      edtDisPieMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisPieMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPieMtr_Enabled), 5, 0), true);
      edtDisPieKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisPieKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPieKgm_Enabled), 5, 0), true);
      edtDisPiePie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisPiePie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPiePie_Enabled), 5, 0), true);
   }

   public void zm1O3551( int GX_JID )
   {
      if ( ( GX_JID == 25 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1057DisComAnh = T01O33_A1057DisComAnh[0] ;
            Z1058DisComMtr = T01O33_A1058DisComMtr[0] ;
            Z1059DisComPie = T01O33_A1059DisComPie[0] ;
            Z7735DisComObs = T01O33_A7735DisComObs[0] ;
         }
         else
         {
            Z1057DisComAnh = A1057DisComAnh ;
            Z1058DisComMtr = A1058DisComMtr ;
            Z1059DisComPie = A1059DisComPie ;
            Z7735DisComObs = A7735DisComObs ;
         }
      }
      if ( GX_JID == -25 )
      {
         Z361DisCod = A361DisCod ;
         Z2524DisComLin = A2524DisComLin ;
         Z1056DisComCod = A1056DisComCod ;
         Z1057DisComAnh = A1057DisComAnh ;
         Z1058DisComMtr = A1058DisComMtr ;
         Z1059DisComPie = A1059DisComPie ;
         Z7735DisComObs = A7735DisComObs ;
         Z396EmprCod = A396EmprCod ;
         Z1032FonCod = A1032FonCod ;
      }
   }

   public void standaloneNotModal1O3551( )
   {
      edtDisComULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComULin_Enabled), 5, 0), true);
      edtDibMetRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibMetRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibMetRea_Enabled), 5, 0), true);
      edtDisComULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComULin_Enabled), 5, 0), true);
      edtDibMetRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibMetRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibMetRea_Enabled), 5, 0), true);
   }

   public void standaloneModal1O3551( )
   {
      if ( isIns( )  )
      {
         A2525DisComULin = (byte)(O2525DisComULin+1) ;
         n2525DisComULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      }
      if ( isIns( )  )
      {
         A1032FonCod = GXutil.substring( A362DisColNom, 1, 12) ;
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A2524DisComLin = A2525DisComULin ;
      }
      if ( isIns( )  && (0==A1057DisComAnh) && ( Gx_BScreen == 0 ) )
      {
         A1057DisComAnh = A334DisArtAnh ;
         n1057DisComAnh = false ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDisComLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      }
      else
      {
         edtDisComLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDisComCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      }
      else
      {
         edtDisComCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtFonCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      }
      else
      {
         edtFonCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      }
   }

   public void load1O3551( )
   {
      /* Using cursor T01O335 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound551 = (short)(1) ;
         A1057DisComAnh = T01O335_A1057DisComAnh[0] ;
         n1057DisComAnh = T01O335_n1057DisComAnh[0] ;
         A1058DisComMtr = T01O335_A1058DisComMtr[0] ;
         n1058DisComMtr = T01O335_n1058DisComMtr[0] ;
         A1059DisComPie = T01O335_A1059DisComPie[0] ;
         n1059DisComPie = T01O335_n1059DisComPie[0] ;
         A7735DisComObs = T01O335_A7735DisComObs[0] ;
         n7735DisComObs = T01O335_n7735DisComObs[0] ;
         zm1O3551( -25) ;
      }
      pr_default.close(31);
      onLoadActions1O3551( ) ;
   }

   public void onLoadActions1O3551( )
   {
      if ( isDlt( )  )
      {
         A1018DibMetRea = O1018DibMetRea.subtract(O1058DisComMtr) ;
         n1018DibMetRea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A1018DibMetRea = O1018DibMetRea.add(A1058DisComMtr).subtract(O1058DisComMtr) ;
            n1018DibMetRea = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
         }
      }
   }

   public void checkExtendedTable1O3551( )
   {
      nIsDirty_551 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1O3551( ) ;
      if ( isDlt( )  )
      {
         nIsDirty_551 = (short)(1) ;
         A1018DibMetRea = O1018DibMetRea.subtract(O1058DisComMtr) ;
         n1018DibMetRea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_551 = (short)(1) ;
            A1018DibMetRea = O1018DibMetRea.add(A1058DisComMtr).subtract(O1058DisComMtr) ;
            n1018DibMetRea = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
         }
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1058DisComMtr)==0) )
      {
         GXCCtl = "DISCOMMTR_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero de metros nulo", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisComMtr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (0==A1059DisComPie) )
      {
         GXCCtl = "DISCOMPIE_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero de piezas nulo", ""), 0, GXCCtl);
      }
   }

   public void closeExtendedTableCursors1O3551( )
   {
   }

   public void enableDisable1O3551( )
   {
   }

   public void getKey1O3551( )
   {
      /* Using cursor T01O336 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound551 = (short)(1) ;
      }
      else
      {
         RcdFound551 = (short)(0) ;
      }
      pr_default.close(32);
   }

   public void getByPrimaryKey1O3551( )
   {
      /* Using cursor T01O33 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      if ( (pr_default.getStatus(1) != 101) && ( T01O33_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01O33_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1O3551( 25) ;
         RcdFound551 = (short)(1) ;
         initializeNonKey1O3551( ) ;
         A2524DisComLin = T01O33_A2524DisComLin[0] ;
         A1056DisComCod = T01O33_A1056DisComCod[0] ;
         A1057DisComAnh = T01O33_A1057DisComAnh[0] ;
         n1057DisComAnh = T01O33_n1057DisComAnh[0] ;
         A1058DisComMtr = T01O33_A1058DisComMtr[0] ;
         n1058DisComMtr = T01O33_n1058DisComMtr[0] ;
         A1059DisComPie = T01O33_A1059DisComPie[0] ;
         n1059DisComPie = T01O33_n1059DisComPie[0] ;
         A7735DisComObs = T01O33_A7735DisComObs[0] ;
         n7735DisComObs = T01O33_n7735DisComObs[0] ;
         A1032FonCod = T01O33_A1032FonCod[0] ;
         O1058DisComMtr = A1058DisComMtr ;
         n1058DisComMtr = false ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z2524DisComLin = A2524DisComLin ;
         Z1056DisComCod = A1056DisComCod ;
         Z1032FonCod = A1032FonCod ;
         sMode551 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1O3551( ) ;
         load1O3551( ) ;
         Gx_mode = sMode551 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound551 = (short)(0) ;
         initializeNonKey1O3551( ) ;
         sMode551 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1O3551( ) ;
         Gx_mode = sMode551 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1O3551( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1O3551( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01O32 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISCOM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z1057DisComAnh != T01O32_A1057DisComAnh[0] ) || ( DecimalUtil.compareTo(Z1058DisComMtr, T01O32_A1058DisComMtr[0]) != 0 ) || ( Z1059DisComPie != T01O32_A1059DisComPie[0] ) || ( GXutil.strcmp(Z7735DisComObs, T01O32_A7735DisComObs[0]) != 0 ) )
         {
            if ( Z1057DisComAnh != T01O32_A1057DisComAnh[0] )
            {
               GXutil.writeLogln("tdisvariantes:[seudo value changed for attri]"+"DisComAnh");
               GXutil.writeLogRaw("Old: ",Z1057DisComAnh);
               GXutil.writeLogRaw("Current: ",T01O32_A1057DisComAnh[0]);
            }
            if ( DecimalUtil.compareTo(Z1058DisComMtr, T01O32_A1058DisComMtr[0]) != 0 )
            {
               GXutil.writeLogln("tdisvariantes:[seudo value changed for attri]"+"DisComMtr");
               GXutil.writeLogRaw("Old: ",Z1058DisComMtr);
               GXutil.writeLogRaw("Current: ",T01O32_A1058DisComMtr[0]);
            }
            if ( Z1059DisComPie != T01O32_A1059DisComPie[0] )
            {
               GXutil.writeLogln("tdisvariantes:[seudo value changed for attri]"+"DisComPie");
               GXutil.writeLogRaw("Old: ",Z1059DisComPie);
               GXutil.writeLogRaw("Current: ",T01O32_A1059DisComPie[0]);
            }
            if ( GXutil.strcmp(Z7735DisComObs, T01O32_A7735DisComObs[0]) != 0 )
            {
               GXutil.writeLogln("tdisvariantes:[seudo value changed for attri]"+"DisComObs");
               GXutil.writeLogRaw("Old: ",Z7735DisComObs);
               GXutil.writeLogRaw("Current: ",T01O32_A7735DisComObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISCOM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1O3551( )
   {
      beforeValidate1O3551( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1O3551( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1O3551( 0) ;
         checkOptimisticConcurrency1O3551( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1O3551( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1O3551( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01O337 */
                  pr_default.execute(33, new Object[] {Integer.valueOf(A361DisCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, Boolean.valueOf(n1057DisComAnh), Short.valueOf(A1057DisComAnh), Boolean.valueOf(n1058DisComMtr), A1058DisComMtr, Boolean.valueOf(n1059DisComPie), Short.valueOf(A1059DisComPie), Boolean.valueOf(n7735DisComObs), A7735DisComObs, A396EmprCod, A1032FonCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISCOM");
                  if ( (pr_default.getStatus(33) == 1) )
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
            load1O3551( ) ;
         }
         endLevel1O3551( ) ;
      }
      closeExtendedTableCursors1O3551( ) ;
   }

   public void update1O3551( )
   {
      beforeValidate1O3551( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1O3551( ) ;
      }
      if ( ( nIsMod_551 != 0 ) || ( nIsDirty_551 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1O3551( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1O3551( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1O3551( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01O338 */
                     pr_default.execute(34, new Object[] {Boolean.valueOf(n1057DisComAnh), Short.valueOf(A1057DisComAnh), Boolean.valueOf(n1058DisComMtr), A1058DisComMtr, Boolean.valueOf(n1059DisComPie), Short.valueOf(A1059DisComPie), Boolean.valueOf(n7735DisComObs), A7735DisComObs, A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISCOM");
                     if ( (pr_default.getStatus(34) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISCOM"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1O3551( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int5[0] = A361DisCod ;
                        new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int5) ;
                        tdisvariantes_impl.this.A396EmprCod = GXv_char4[0] ;
                        tdisvariantes_impl.this.A361DisCod = GXv_int5[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1O3551( ) ;
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
            endLevel1O3551( ) ;
         }
      }
      closeExtendedTableCursors1O3551( ) ;
   }

   public void deferredUpdate1O3551( )
   {
   }

   public void delete1O3551( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1O3551( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1O3551( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1O3551( ) ;
         afterConfirm1O3551( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1O3551( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01O339 */
               pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
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
      endLevel1O3551( ) ;
      Gx_mode = sMode551 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1O3551( )
   {
      standaloneModal1O3551( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isDlt( )  )
         {
            A1018DibMetRea = O1018DibMetRea.subtract(O1058DisComMtr) ;
            n1018DibMetRea = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A1018DibMetRea = O1018DibMetRea.add(A1058DisComMtr).subtract(O1058DisComMtr) ;
               n1018DibMetRea = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
            }
         }
      }
   }

   public void endLevel1O3551( )
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

   public void scanStart1O3551( )
   {
      /* Scan By routine */
      /* Using cursor T01O340 */
      pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound551 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound551 = (short)(1) ;
         A2524DisComLin = T01O340_A2524DisComLin[0] ;
         A1056DisComCod = T01O340_A1056DisComCod[0] ;
         A1032FonCod = T01O340_A1032FonCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1O3551( )
   {
      /* Scan next routine */
      pr_default.readNext(36);
      RcdFound551 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound551 = (short)(1) ;
         A2524DisComLin = T01O340_A2524DisComLin[0] ;
         A1056DisComCod = T01O340_A1056DisComCod[0] ;
         A1032FonCod = T01O340_A1032FonCod[0] ;
      }
   }

   public void scanEnd1O3551( )
   {
      pr_default.close(36);
   }

   public void afterConfirm1O3551( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1O3551( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1O3551( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1O3551( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1O3551( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1O3551( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1O3551( )
   {
      edtDisComLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtDisComCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtFonCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtDisComAnh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComAnh_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtDisComMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComMtr_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtDisComPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComPie_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtDisComObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComObs_Enabled), 5, 0), !bGXsfl_95_Refreshing);
   }

   public void send_integrity_lvl_hashes1O3551( )
   {
   }

   public void send_integrity_lvl_hashes1O334( )
   {
   }

   public void subsflControlProps_95551( )
   {
      edtavnRcdDeleted_551_Internalname = "vNRCDDELETED_551_"+sGXsfl_95_idx ;
      edtDisComLin_Internalname = "DISCOMLIN_"+sGXsfl_95_idx ;
      edtDisComCod_Internalname = "DISCOMCOD_"+sGXsfl_95_idx ;
      edtFonCod_Internalname = "FONCOD_"+sGXsfl_95_idx ;
      edtDisComAnh_Internalname = "DISCOMANH_"+sGXsfl_95_idx ;
      edtDisComMtr_Internalname = "DISCOMMTR_"+sGXsfl_95_idx ;
      edtDisComPie_Internalname = "DISCOMPIE_"+sGXsfl_95_idx ;
      edtDisComObs_Internalname = "DISCOMOBS_"+sGXsfl_95_idx ;
   }

   public void subsflControlProps_fel_95551( )
   {
      edtavnRcdDeleted_551_Internalname = "vNRCDDELETED_551_"+sGXsfl_95_fel_idx ;
      edtDisComLin_Internalname = "DISCOMLIN_"+sGXsfl_95_fel_idx ;
      edtDisComCod_Internalname = "DISCOMCOD_"+sGXsfl_95_fel_idx ;
      edtFonCod_Internalname = "FONCOD_"+sGXsfl_95_fel_idx ;
      edtDisComAnh_Internalname = "DISCOMANH_"+sGXsfl_95_fel_idx ;
      edtDisComMtr_Internalname = "DISCOMMTR_"+sGXsfl_95_fel_idx ;
      edtDisComPie_Internalname = "DISCOMPIE_"+sGXsfl_95_fel_idx ;
      edtDisComObs_Internalname = "DISCOMOBS_"+sGXsfl_95_fel_idx ;
   }

   public void addRow1O3551( )
   {
      nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_95551( ) ;
      sendRow1O3551( ) ;
   }

   public void sendRow1O3551( )
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
         if ( ((int)((nGXsfl_95_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_551_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_551_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_551_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_551), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_551), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_551_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_551_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_551_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComLin_Internalname,GXutil.ltrim( localUtil.ntoc( A2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2524DisComLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,97);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_551_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComCod_Internalname,GXutil.rtrim( A1056DisComCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,98);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_551_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFonCod_Internalname,GXutil.rtrim( A1032FonCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFonCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFonCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_551_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComAnh_Internalname,GXutil.ltrim( localUtil.ntoc( A1057DisComAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisComAnh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1057DisComAnh), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1057DisComAnh), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,100);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComAnh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComAnh_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_551_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisComMtr_Enabled!=0) ? localUtil.format( A1058DisComMtr, "ZZZZZ9.99") : localUtil.format( A1058DisComMtr, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,101);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_551_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComPie_Internalname,GXutil.ltrim( localUtil.ntoc( A1059DisComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisComPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1059DisComPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1059DisComPie), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,102);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComPie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_551_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComObs_Internalname,GXutil.rtrim( A7735DisComObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,103);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1O3551( ) ;
      GXCCtl = "Z2524DisComLin_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1056DisComCod_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1056DisComCod));
      GXCCtl = "Z1032FonCod_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1032FonCod));
      GXCCtl = "Z1057DisComAnh_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1057DisComAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1058DisComMtr_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1059DisComPie_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1059DisComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7735DisComObs_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7735DisComObs));
      GXCCtl = "O1058DisComMtr_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_551_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_551_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_551_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_551_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_551_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMLIN_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMCOD_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FONCOD_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFonCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMANH_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComAnh_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMMTR_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMPIE_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMOBS_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1O3551( )
   {
      nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_95551( ) ;
      edtavnRcdDeleted_551_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_551_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMLIN_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMCOD_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFonCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FONCOD_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComAnh_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMANH_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMMTR_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMPIE_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMOBS_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         GXCCtl = "DISCOMLIN_" + sGXsfl_95_idx ;
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
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisComAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisComAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DISCOMANH_" + sGXsfl_95_idx ;
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
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisComMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisComMtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "DISCOMMTR_" + sGXsfl_95_idx ;
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
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisComPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisComPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DISCOMPIE_" + sGXsfl_95_idx ;
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
      A7735DisComObs = httpContext.cgiGet( edtDisComObs_Internalname) ;
      n7735DisComObs = false ;
      GXCCtl = "Z2524DisComLin_" + sGXsfl_95_idx ;
      Z2524DisComLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1056DisComCod_" + sGXsfl_95_idx ;
      Z1056DisComCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1032FonCod_" + sGXsfl_95_idx ;
      Z1032FonCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1057DisComAnh_" + sGXsfl_95_idx ;
      Z1057DisComAnh = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1058DisComMtr_" + sGXsfl_95_idx ;
      Z1058DisComMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1059DisComPie_" + sGXsfl_95_idx ;
      Z1059DisComPie = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7735DisComObs_" + sGXsfl_95_idx ;
      Z7735DisComObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O1058DisComMtr_" + sGXsfl_95_idx ;
      O1058DisComMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_551_" + sGXsfl_95_idx ;
      nRcdDeleted_551 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_551_" + sGXsfl_95_idx ;
      nRcdExists_551 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_551_" + sGXsfl_95_idx ;
      nIsMod_551 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtFonCod_Enabled = edtFonCod_Enabled ;
      defedtDisComCod_Enabled = edtDisComCod_Enabled ;
      defedtDisComLin_Enabled = edtDisComLin_Enabled ;
   }

   public void confirmValues1O30( )
   {
      nGXsfl_95_idx = 0 ;
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_95551( ) ;
      while ( nGXsfl_95_idx < nRC_GXsfl_95 )
      {
         nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
         sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_95551( ) ;
         httpContext.changePostValue( "Z2524DisComLin_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z2524DisComLin_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2524DisComLin_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z1056DisComCod_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z1056DisComCod_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1056DisComCod_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z1032FonCod_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z1032FonCod_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1032FonCod_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z1057DisComAnh_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z1057DisComAnh_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1057DisComAnh_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z1058DisComMtr_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z1058DisComMtr_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1058DisComMtr_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z1059DisComPie_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z1059DisComPie_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1059DisComPie_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z7735DisComObs_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z7735DisComObs_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7735DisComObs_"+sGXsfl_95_idx) ;
      }
      httpContext.changePostValue( "O1058DisComMtr", httpContext.cgiGet( "T1058DisComMtr")) ;
      httpContext.deletePostValue( "T1058DisComMtr") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdisvariantes", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"EmprCod","DisCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TDisVariantes");
      forbiddenHiddens.add("DibCli", GXutil.rtrim( localUtil.format( A1013DibCli, "")));
      forbiddenHiddens.add("DibInt", localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9"));
      forbiddenHiddens.add("DisArtCod", GXutil.rtrim( localUtil.format( A335DisArtCod, "")));
      forbiddenHiddens.add("DisColNom", GXutil.rtrim( localUtil.format( A362DisColNom, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tdisvariantes:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2525DisComULin", GXutil.ltrim( localUtil.ntoc( Z2525DisComULin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z335DisArtCod", GXutil.rtrim( Z335DisArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z362DisColNom", GXutil.rtrim( Z362DisColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z334DisArtAnh", GXutil.ltrim( localUtil.ntoc( Z334DisArtAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1013DibCli", GXutil.rtrim( Z1013DibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1014DibInt", GXutil.ltrim( localUtil.ntoc( Z1014DibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z365DisDes", GXutil.rtrim( Z365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1018DibMetRea", GXutil.ltrim( localUtil.ntoc( Z1018DibMetRea, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1018DibMetRea", GXutil.ltrim( localUtil.ntoc( O1018DibMetRea, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O2525DisComULin", GXutil.ltrim( localUtil.ntoc( O2525DisComULin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_95", GXutil.ltrim( localUtil.ntoc( nGXsfl_95_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
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
      return formatLink("app.tdisvariantes", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"EmprCod","DisCod"})  ;
   }

   public String getPgmname( )
   {
      return "TDisVariantes" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Cominaciones / Variantes /Pintas", "") ;
   }

   public void initializeNonKey1O334( )
   {
      A2525DisComULin = (byte)(0) ;
      n2525DisComULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A1013DibCli = "" ;
      n1013DibCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
      A1014DibInt = 0 ;
      n1014DibInt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
      A335DisArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
      A362DisColNom = "" ;
      n362DisColNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
      A1018DibMetRea = DecimalUtil.ZERO ;
      n1018DibMetRea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
      A334DisArtAnh = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A334DisArtAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A334DisArtAnh), 3, 0));
      A385DisPieMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
      A381DisPieKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
      O1018DibMetRea = A1018DibMetRea ;
      n1018DibMetRea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
      O2525DisComULin = A2525DisComULin ;
      n2525DisComULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      Z2525DisComULin = (byte)(0) ;
      Z335DisArtCod = "" ;
      Z362DisColNom = "" ;
      Z334DisArtAnh = (short)(0) ;
      Z252CliCod = 0 ;
      Z1013DibCli = "" ;
      Z1014DibInt = 0 ;
      Z365DisDes = "" ;
      Z1018DibMetRea = DecimalUtil.ZERO ;
   }

   public void initAll1O334( )
   {
      initializeNonKey1O334( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1O3551( )
   {
      A1058DisComMtr = DecimalUtil.ZERO ;
      n1058DisComMtr = false ;
      A1059DisComPie = (short)(0) ;
      n1059DisComPie = false ;
      A7735DisComObs = "" ;
      n7735DisComObs = false ;
      A1057DisComAnh = A334DisArtAnh ;
      n1057DisComAnh = false ;
      O1058DisComMtr = A1058DisComMtr ;
      n1058DisComMtr = false ;
      Z1057DisComAnh = (short)(0) ;
      Z1058DisComMtr = DecimalUtil.ZERO ;
      Z1059DisComPie = (short)(0) ;
      Z7735DisComObs = "" ;
   }

   public void initAll1O3551( )
   {
      A2524DisComLin = (byte)(0) ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      initializeNonKey1O3551( ) ;
   }

   public void standaloneModalInsert1O3551( )
   {
      A2525DisComULin = i2525DisComULin ;
      n2525DisComULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      A1057DisComAnh = i1057DisComAnh ;
      n1057DisComAnh = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415104984", true, true);
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
      httpContext.AddJavascriptSource("tdisvariantes.js", "?202682415104985", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties551( )
   {
      edtFonCod_Enabled = defedtFonCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtDisComCod_Enabled = defedtDisComCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtDisComLin_Enabled = defedtDisComLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), !bGXsfl_95_Refreshing);
   }

   public void startgridcontrol95( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1057DisComAnh, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComAnh_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1058DisComMtr, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1059DisComPie, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComPie_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtDibCli_Internalname = "DIBCLI" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtDibInt_Internalname = "DIBINT" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtDisArtCod_Internalname = "DISARTCOD" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtDisColNom_Internalname = "DISCOLNOM" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtDibMetRea_Internalname = "DIBMETREA" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtDisArtAnh_Internalname = "DISARTANH" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtDisPieMtr_Internalname = "DISPIEMTR" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtDisPieKgm_Internalname = "DISPIEKGM" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtDisPiePie_Internalname = "DISPIEPIE" ;
      edtavnRcdDeleted_551_Internalname = "vNRCDDELETED_551" ;
      edtDisComLin_Internalname = "DISCOMLIN" ;
      edtDisComCod_Internalname = "DISCOMCOD" ;
      edtFonCod_Internalname = "FONCOD" ;
      edtDisComAnh_Internalname = "DISCOMANH" ;
      edtDisComMtr_Internalname = "DISCOMMTR" ;
      edtDisComPie_Internalname = "DISCOMPIE" ;
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
      Form.setCaption( httpContext.getMessage( "Cominaciones / Variantes /Pintas", "") );
      edtDisComObs_Jsonclick = "" ;
      edtDisComPie_Jsonclick = "" ;
      edtDisComMtr_Jsonclick = "" ;
      edtDisComAnh_Jsonclick = "" ;
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
      edtDisComPie_Enabled = 1 ;
      edtDisComMtr_Enabled = 1 ;
      edtDisComAnh_Enabled = 1 ;
      edtFonCod_Enabled = 1 ;
      edtDisComCod_Enabled = 1 ;
      edtDisComLin_Enabled = 1 ;
      edtavnRcdDeleted_551_Enabled = 1 ;
      edtDisPiePie_Jsonclick = "" ;
      edtDisPiePie_Backcolor = (int)(0xFFFFFF) ;
      edtDisPiePie_Enabled = 0 ;
      edtDisPieKgm_Jsonclick = "" ;
      edtDisPieKgm_Backcolor = (int)(0xFFFFFF) ;
      edtDisPieKgm_Enabled = 0 ;
      edtDisPieMtr_Jsonclick = "" ;
      edtDisPieMtr_Backcolor = (int)(0xFFFFFF) ;
      edtDisPieMtr_Enabled = 0 ;
      edtDisArtAnh_Jsonclick = "" ;
      edtDisArtAnh_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtAnh_Enabled = 1 ;
      edtDibMetRea_Jsonclick = "" ;
      edtDibMetRea_Backcolor = (int)(0xFFFFFF) ;
      edtDibMetRea_Enabled = 0 ;
      edtDisColNom_Jsonclick = "" ;
      edtDisColNom_Backcolor = (int)(0xFFFFFF) ;
      edtDisColNom_Enabled = 0 ;
      edtDisArtCod_Jsonclick = "" ;
      edtDisArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtCod_Enabled = 0 ;
      edtDibInt_Jsonclick = "" ;
      edtDibInt_Backcolor = (int)(0xFFFFFF) ;
      edtDibInt_Enabled = 0 ;
      edtDibCli_Jsonclick = "" ;
      edtDibCli_Backcolor = (int)(0xFFFFFF) ;
      edtDibCli_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
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

   public void gx9asadispiemtr1O334( String A396EmprCod ,
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

   public void gx10asadispiekgm1O334( String A396EmprCod ,
                                      int A361DisCod ,
                                      String A365DisDes )
   {
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
      {
         A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
         }
         else
         {
            A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A381DisPieKgm, (byte)(9), (byte)(2), ".", "")))+"\"") ;
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
      subsflControlProps_95551( ) ;
      while ( nGXsfl_95_idx <= nRC_GXsfl_95 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1O3551( ) ;
         standaloneModal1O3551( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1O3551( ) ;
         nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
         sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_95551( ) ;
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
      /* Using cursor T01O341 */
      pr_default.execute(37, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(37) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01O341_A407EmprNom[0] ;
      n407EmprNom = T01O341_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(37);
      /* Using cursor T01O343 */
      pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(38) != 101) )
      {
         A387DisPiePie = T01O343_A387DisPiePie[0] ;
         n387DisPiePie = T01O343_n387DisPiePie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
      }
      else
      {
         A387DisPiePie = (short)(0) ;
         n387DisPiePie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
      }
      pr_default.close(38);
      GX_FocusControl = edtDisArtAnh_Internalname ;
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
      n362DisColNom = false ;
      n1013DibCli = false ;
      n1014DibInt = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrim( localUtil.ntoc( A2525DisComULin, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", GXutil.rtrim( A1013DibCli));
      httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrim( localUtil.ntoc( A1014DibInt, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", GXutil.rtrim( A335DisArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", GXutil.rtrim( A362DisColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrim( localUtil.ntoc( A1018DibMetRea, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A334DisArtAnh", GXutil.ltrim( localUtil.ntoc( A334DisArtAnh, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrim( localUtil.ntoc( A385DisPieMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrim( localUtil.ntoc( A381DisPieKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A387DisPiePie", GXutil.ltrim( localUtil.ntoc( A387DisPiePie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2525DisComULin", GXutil.ltrim( localUtil.ntoc( Z2525DisComULin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1013DibCli", GXutil.rtrim( Z1013DibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1014DibInt", GXutil.ltrim( localUtil.ntoc( Z1014DibInt, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z335DisArtCod", GXutil.rtrim( Z335DisArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z362DisColNom", GXutil.rtrim( Z362DisColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1018DibMetRea", GXutil.ltrim( localUtil.ntoc( Z1018DibMetRea, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z334DisArtAnh", GXutil.ltrim( localUtil.ntoc( Z334DisArtAnh, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z385DisPieMtr", GXutil.ltrim( localUtil.ntoc( Z385DisPieMtr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z381DisPieKgm", GXutil.ltrim( localUtil.ntoc( Z381DisPieKgm, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z387DisPiePie", GXutil.ltrim( localUtil.ntoc( Z387DisPiePie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O1018DibMetRea", GXutil.ltrim( localUtil.ntoc( O1018DibMetRea, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O2525DisComULin", GXutil.ltrim( localUtil.ntoc( O2525DisComULin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A362DisColNom',fld:'DISCOLNOM',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'BUSCAR COMBINACION'","{handler:'e121O32',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("'BUSCAR COMBINACION'",",oparms:[{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A334DisArtAnh',fld:'DISARTANH',pic:'ZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A2525DisComULin',fld:'DISCOMULIN',pic:'Z9'},{av:'A362DisColNom',fld:'DISCOLNOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_DISCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A2525DisComULin',fld:'DISCOMULIN',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A362DisColNom',fld:'DISCOLNOM',pic:''},{av:'A1018DibMetRea',fld:'DIBMETREA',pic:'ZZZZZ9.99'},{av:'A334DisArtAnh',fld:'DISARTANH',pic:'ZZ9'},{av:'A385DisPieMtr',fld:'DISPIEMTR',pic:'ZZZZZ9.99'},{av:'A381DisPieKgm',fld:'DISPIEKGM',pic:'ZZZZZ9.99'},{av:'A387DisPiePie',fld:'DISPIEPIE',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z361DisCod'},{av:'Z407EmprNom'},{av:'Z2525DisComULin'},{av:'Z252CliCod'},{av:'Z279CliNom'},{av:'Z1013DibCli'},{av:'Z1014DibInt'},{av:'Z335DisArtCod'},{av:'Z362DisColNom'},{av:'Z1018DibMetRea'},{av:'Z334DisArtAnh'},{av:'Z385DisPieMtr'},{av:'Z381DisPieKgm'},{av:'Z387DisPiePie'},{av:'O1018DibMetRea'},{av:'O2525DisComULin'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_DISCOMULIN","{handler:'valid_Discomulin',iparms:[]");
      setEventMetadata("VALID_DISCOMULIN",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_DIBCLI","{handler:'valid_Dibcli',iparms:[]");
      setEventMetadata("VALID_DIBCLI",",oparms:[]}");
      setEventMetadata("VALID_DIBINT","{handler:'valid_Dibint',iparms:[]");
      setEventMetadata("VALID_DIBINT",",oparms:[]}");
      setEventMetadata("VALID_DISCOLNOM","{handler:'valid_Discolnom',iparms:[]");
      setEventMetadata("VALID_DISCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_DISARTANH","{handler:'valid_Disartanh',iparms:[]");
      setEventMetadata("VALID_DISARTANH",",oparms:[]}");
      setEventMetadata("VALID_DISCOMLIN","{handler:'valid_Discomlin',iparms:[]");
      setEventMetadata("VALID_DISCOMLIN",",oparms:[]}");
      setEventMetadata("VALID_DISCOMCOD","{handler:'valid_Discomcod',iparms:[]");
      setEventMetadata("VALID_DISCOMCOD",",oparms:[]}");
      setEventMetadata("VALID_FONCOD","{handler:'valid_Foncod',iparms:[]");
      setEventMetadata("VALID_FONCOD",",oparms:[]}");
      setEventMetadata("VALID_DISCOMMTR","{handler:'valid_Discommtr',iparms:[]");
      setEventMetadata("VALID_DISCOMMTR",",oparms:[]}");
      setEventMetadata("VALID_DISCOMPIE","{handler:'valid_Discompie',iparms:[]");
      setEventMetadata("VALID_DISCOMPIE",",oparms:[]}");
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
      pr_default.close(37);
      pr_default.close(7);
      pr_default.close(38);
   }

   /* Aggregate/select formulas */
   public java.math.BigDecimal getDisPieKgm1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X595Kilos = DecimalUtil.ZERO ;
      /* Using cursor T01O344 */
      pr_default.execute(39, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(39) != 101) )
      {
         X595Kilos = T01O344_A595Kilos[0] ;
      }
      pr_default.close(39);
      return X595Kilos ;
   }

   public java.math.BigDecimal getDisPieKgm0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X382DisPieKil = DecimalUtil.ZERO ;
      /* Using cursor T01O345 */
      pr_default.execute(40, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(40) != 101) )
      {
         X382DisPieKil = T01O345_A382DisPieKil[0] ;
      }
      pr_default.close(40);
      return X382DisPieKil ;
   }

   public java.math.BigDecimal getDisPieMtr1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X631Metros = DecimalUtil.doubleToDec(0) ;
      /* Using cursor T01O346 */
      pr_default.execute(41, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(41) != 101) )
      {
         X631Metros = T01O346_A631Metros[0] ;
      }
      pr_default.close(41);
      return X631Metros ;
   }

   public java.math.BigDecimal getDisPieMtr0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X384DisPieMet = DecimalUtil.doubleToDec(0) ;
      /* Using cursor T01O347 */
      pr_default.execute(42, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(42) != 101) )
      {
         X384DisPieMet = T01O347_A384DisPieMet[0] ;
      }
      pr_default.close(42);
      return X384DisPieMet ;
   }

   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z335DisArtCod = "" ;
      Z362DisColNom = "" ;
      Z1013DibCli = "" ;
      Z365DisDes = "" ;
      Z1018DibMetRea = DecimalUtil.ZERO ;
      O1018DibMetRea = DecimalUtil.ZERO ;
      Z1056DisComCod = "" ;
      Z1032FonCod = "" ;
      Z1058DisComMtr = DecimalUtil.ZERO ;
      Z7735DisComObs = "" ;
      O1058DisComMtr = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A365DisDes = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A362DisColNom = "" ;
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
      lblTextblock6_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock7_Jsonclick = "" ;
      A1013DibCli = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A335DisArtCod = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      A1018DibMetRea = DecimalUtil.ZERO ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A385DisPieMtr = DecimalUtil.ZERO ;
      lblTextblock14_Jsonclick = "" ;
      A381DisPieKgm = DecimalUtil.ZERO ;
      lblTextblock15_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B1018DibMetRea = DecimalUtil.ZERO ;
      sMode551 = "" ;
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
      sMode34 = "" ;
      s1018DibMetRea = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      A1058DisComMtr = DecimalUtil.ZERO ;
      A7735DisComObs = "" ;
      T1058DisComMtr = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T01O36_A407EmprNom = new String[] {""} ;
      T01O36_n407EmprNom = new boolean[] {false} ;
      T01O311_A387DisPiePie = new short[1] ;
      T01O311_n387DisPiePie = new boolean[] {false} ;
      T01O37_A279CliNom = new String[] {""} ;
      T01O39_A1018DibMetRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O39_n1018DibMetRea = new boolean[] {false} ;
      T01O313_A361DisCod = new int[1] ;
      T01O313_A407EmprNom = new String[] {""} ;
      T01O313_n407EmprNom = new boolean[] {false} ;
      T01O313_A2525DisComULin = new byte[1] ;
      T01O313_n2525DisComULin = new boolean[] {false} ;
      T01O313_A279CliNom = new String[] {""} ;
      T01O313_A335DisArtCod = new String[] {""} ;
      T01O313_A362DisColNom = new String[] {""} ;
      T01O313_n362DisColNom = new boolean[] {false} ;
      T01O313_A1018DibMetRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O313_n1018DibMetRea = new boolean[] {false} ;
      T01O313_A334DisArtAnh = new short[1] ;
      T01O313_A396EmprCod = new String[] {""} ;
      T01O313_A252CliCod = new int[1] ;
      T01O313_A1013DibCli = new String[] {""} ;
      T01O313_n1013DibCli = new boolean[] {false} ;
      T01O313_A1014DibInt = new int[1] ;
      T01O313_n1014DibInt = new boolean[] {false} ;
      T01O313_A387DisPiePie = new short[1] ;
      T01O313_n387DisPiePie = new boolean[] {false} ;
      T01O313_A365DisDes = new String[] {""} ;
      T01O314_A396EmprCod = new String[] {""} ;
      T01O314_A361DisCod = new int[1] ;
      T01O35_A361DisCod = new int[1] ;
      T01O35_A2525DisComULin = new byte[1] ;
      T01O35_n2525DisComULin = new boolean[] {false} ;
      T01O35_A335DisArtCod = new String[] {""} ;
      T01O35_A362DisColNom = new String[] {""} ;
      T01O35_n362DisColNom = new boolean[] {false} ;
      T01O35_A334DisArtAnh = new short[1] ;
      T01O35_A396EmprCod = new String[] {""} ;
      T01O35_A252CliCod = new int[1] ;
      T01O35_A1013DibCli = new String[] {""} ;
      T01O35_n1013DibCli = new boolean[] {false} ;
      T01O35_A1014DibInt = new int[1] ;
      T01O35_n1014DibInt = new boolean[] {false} ;
      T01O35_A365DisDes = new String[] {""} ;
      T01O315_A396EmprCod = new String[] {""} ;
      T01O315_A361DisCod = new int[1] ;
      T01O316_A396EmprCod = new String[] {""} ;
      T01O316_A361DisCod = new int[1] ;
      T01O34_A361DisCod = new int[1] ;
      T01O34_A2525DisComULin = new byte[1] ;
      T01O34_n2525DisComULin = new boolean[] {false} ;
      T01O34_A335DisArtCod = new String[] {""} ;
      T01O34_A362DisColNom = new String[] {""} ;
      T01O34_n362DisColNom = new boolean[] {false} ;
      T01O34_A334DisArtAnh = new short[1] ;
      T01O34_A396EmprCod = new String[] {""} ;
      T01O34_A252CliCod = new int[1] ;
      T01O34_A1013DibCli = new String[] {""} ;
      T01O34_n1013DibCli = new boolean[] {false} ;
      T01O34_A1014DibInt = new int[1] ;
      T01O34_n1014DibInt = new boolean[] {false} ;
      T01O34_A365DisDes = new String[] {""} ;
      T01O317_A1018DibMetRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O317_n1018DibMetRea = new boolean[] {false} ;
      T01O321_A396EmprCod = new String[] {""} ;
      T01O321_A361DisCod = new int[1] ;
      T01O321_A13376DisTraID = new String[] {""} ;
      T01O322_A396EmprCod = new String[] {""} ;
      T01O322_A361DisCod = new int[1] ;
      T01O322_A13213DisNormID = new String[] {""} ;
      T01O323_A396EmprCod = new String[] {""} ;
      T01O323_A361DisCod = new int[1] ;
      T01O323_A13081DisDGLin = new byte[1] ;
      T01O323_A13082DisDGDibCl = new String[] {""} ;
      T01O323_A13083DisDGDibIn = new int[1] ;
      T01O323_A13084DisDGComb = new String[] {""} ;
      T01O323_A13085DisDGFondo = new String[] {""} ;
      T01O324_A396EmprCod = new String[] {""} ;
      T01O324_A361DisCod = new int[1] ;
      T01O324_A7068DisNotLin = new byte[1] ;
      T01O325_A396EmprCod = new String[] {""} ;
      T01O325_A361DisCod = new int[1] ;
      T01O325_A10197ProEspCod = new String[] {""} ;
      T01O326_A396EmprCod = new String[] {""} ;
      T01O326_A361DisCod = new int[1] ;
      T01O326_A4594AccCod = new short[1] ;
      T01O327_A396EmprCod = new String[] {""} ;
      T01O327_A361DisCod = new int[1] ;
      T01O327_A3398DisRefBarC = new int[1] ;
      T01O327_A3399DisRefBCRe = new byte[1] ;
      T01O327_A3400DisRefBCPa = new String[] {""} ;
      T01O327_A3607DisRefBPie = new String[] {""} ;
      T01O328_A396EmprCod = new String[] {""} ;
      T01O328_A361DisCod = new int[1] ;
      T01O328_A376DisObsLin = new byte[1] ;
      T01O329_A396EmprCod = new String[] {""} ;
      T01O329_A361DisCod = new int[1] ;
      T01O329_A758ProCod = new String[] {""} ;
      T01O330_A396EmprCod = new String[] {""} ;
      T01O330_A361DisCod = new int[1] ;
      T01O330_A833TipDefCod = new short[1] ;
      T01O331_A396EmprCod = new String[] {""} ;
      T01O331_A361DisCod = new int[1] ;
      T01O331_A44AlbRecCod = new int[1] ;
      T01O334_A396EmprCod = new String[] {""} ;
      T01O334_A361DisCod = new int[1] ;
      T01O335_A361DisCod = new int[1] ;
      T01O335_A2524DisComLin = new byte[1] ;
      T01O335_A1056DisComCod = new String[] {""} ;
      T01O335_A1057DisComAnh = new short[1] ;
      T01O335_n1057DisComAnh = new boolean[] {false} ;
      T01O335_A1058DisComMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O335_n1058DisComMtr = new boolean[] {false} ;
      T01O335_A1059DisComPie = new short[1] ;
      T01O335_n1059DisComPie = new boolean[] {false} ;
      T01O335_A7735DisComObs = new String[] {""} ;
      T01O335_n7735DisComObs = new boolean[] {false} ;
      T01O335_A396EmprCod = new String[] {""} ;
      T01O335_A1032FonCod = new String[] {""} ;
      T01O336_A396EmprCod = new String[] {""} ;
      T01O336_A361DisCod = new int[1] ;
      T01O336_A2524DisComLin = new byte[1] ;
      T01O336_A1056DisComCod = new String[] {""} ;
      T01O336_A1032FonCod = new String[] {""} ;
      T01O33_A361DisCod = new int[1] ;
      T01O33_A2524DisComLin = new byte[1] ;
      T01O33_A1056DisComCod = new String[] {""} ;
      T01O33_A1057DisComAnh = new short[1] ;
      T01O33_n1057DisComAnh = new boolean[] {false} ;
      T01O33_A1058DisComMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O33_n1058DisComMtr = new boolean[] {false} ;
      T01O33_A1059DisComPie = new short[1] ;
      T01O33_n1059DisComPie = new boolean[] {false} ;
      T01O33_A7735DisComObs = new String[] {""} ;
      T01O33_n7735DisComObs = new boolean[] {false} ;
      T01O33_A396EmprCod = new String[] {""} ;
      T01O33_A1032FonCod = new String[] {""} ;
      T01O32_A361DisCod = new int[1] ;
      T01O32_A2524DisComLin = new byte[1] ;
      T01O32_A1056DisComCod = new String[] {""} ;
      T01O32_A1057DisComAnh = new short[1] ;
      T01O32_n1057DisComAnh = new boolean[] {false} ;
      T01O32_A1058DisComMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O32_n1058DisComMtr = new boolean[] {false} ;
      T01O32_A1059DisComPie = new short[1] ;
      T01O32_n1059DisComPie = new boolean[] {false} ;
      T01O32_A7735DisComObs = new String[] {""} ;
      T01O32_n7735DisComObs = new boolean[] {false} ;
      T01O32_A396EmprCod = new String[] {""} ;
      T01O32_A1032FonCod = new String[] {""} ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      T01O340_A396EmprCod = new String[] {""} ;
      T01O340_A361DisCod = new int[1] ;
      T01O340_A2524DisComLin = new byte[1] ;
      T01O340_A1056DisComCod = new String[] {""} ;
      T01O340_A1032FonCod = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01O341_A407EmprNom = new String[] {""} ;
      T01O341_n407EmprNom = new boolean[] {false} ;
      T01O343_A387DisPiePie = new short[1] ;
      T01O343_n387DisPiePie = new boolean[] {false} ;
      Z385DisPieMtr = DecimalUtil.ZERO ;
      Z381DisPieKgm = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ1013DibCli = "" ;
      ZZ335DisArtCod = "" ;
      ZZ362DisColNom = "" ;
      ZZ1018DibMetRea = DecimalUtil.ZERO ;
      ZZ385DisPieMtr = DecimalUtil.ZERO ;
      ZZ381DisPieKgm = DecimalUtil.ZERO ;
      ZO1018DibMetRea = DecimalUtil.ZERO ;
      X595Kilos = DecimalUtil.ZERO ;
      T01O344_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X382DisPieKil = DecimalUtil.ZERO ;
      T01O345_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X631Metros = DecimalUtil.ZERO ;
      T01O346_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X384DisPieMet = DecimalUtil.ZERO ;
      T01O347_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdisvariantes__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdisvariantes__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdisvariantes__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdisvariantes__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdisvariantes__default(),
         new Object[] {
             new Object[] {
            T01O32_A361DisCod, T01O32_A2524DisComLin, T01O32_A1056DisComCod, T01O32_A1057DisComAnh, T01O32_n1057DisComAnh, T01O32_A1058DisComMtr, T01O32_n1058DisComMtr, T01O32_A1059DisComPie, T01O32_n1059DisComPie, T01O32_A7735DisComObs,
            T01O32_n7735DisComObs, T01O32_A396EmprCod, T01O32_A1032FonCod
            }
            , new Object[] {
            T01O33_A361DisCod, T01O33_A2524DisComLin, T01O33_A1056DisComCod, T01O33_A1057DisComAnh, T01O33_n1057DisComAnh, T01O33_A1058DisComMtr, T01O33_n1058DisComMtr, T01O33_A1059DisComPie, T01O33_n1059DisComPie, T01O33_A7735DisComObs,
            T01O33_n7735DisComObs, T01O33_A396EmprCod, T01O33_A1032FonCod
            }
            , new Object[] {
            T01O34_A361DisCod, T01O34_A2525DisComULin, T01O34_n2525DisComULin, T01O34_A335DisArtCod, T01O34_A362DisColNom, T01O34_n362DisColNom, T01O34_A334DisArtAnh, T01O34_A396EmprCod, T01O34_A252CliCod, T01O34_A1013DibCli,
            T01O34_n1013DibCli, T01O34_A1014DibInt, T01O34_n1014DibInt, T01O34_A365DisDes
            }
            , new Object[] {
            T01O35_A361DisCod, T01O35_A2525DisComULin, T01O35_n2525DisComULin, T01O35_A335DisArtCod, T01O35_A362DisColNom, T01O35_n362DisColNom, T01O35_A334DisArtAnh, T01O35_A396EmprCod, T01O35_A252CliCod, T01O35_A1013DibCli,
            T01O35_n1013DibCli, T01O35_A1014DibInt, T01O35_n1014DibInt, T01O35_A365DisDes
            }
            , new Object[] {
            T01O36_A407EmprNom, T01O36_n407EmprNom
            }
            , new Object[] {
            T01O37_A279CliNom
            }
            , new Object[] {
            T01O38_A1018DibMetRea, T01O38_n1018DibMetRea
            }
            , new Object[] {
            T01O39_A1018DibMetRea, T01O39_n1018DibMetRea
            }
            , new Object[] {
            T01O311_A387DisPiePie, T01O311_n387DisPiePie
            }
            , new Object[] {
            T01O313_A361DisCod, T01O313_A407EmprNom, T01O313_n407EmprNom, T01O313_A2525DisComULin, T01O313_n2525DisComULin, T01O313_A279CliNom, T01O313_A335DisArtCod, T01O313_A362DisColNom, T01O313_n362DisColNom, T01O313_A1018DibMetRea,
            T01O313_n1018DibMetRea, T01O313_A334DisArtAnh, T01O313_A396EmprCod, T01O313_A252CliCod, T01O313_A1013DibCli, T01O313_n1013DibCli, T01O313_A1014DibInt, T01O313_n1014DibInt, T01O313_A387DisPiePie, T01O313_n387DisPiePie,
            T01O313_A365DisDes
            }
            , new Object[] {
            T01O314_A396EmprCod, T01O314_A361DisCod
            }
            , new Object[] {
            T01O315_A396EmprCod, T01O315_A361DisCod
            }
            , new Object[] {
            T01O316_A396EmprCod, T01O316_A361DisCod
            }
            , new Object[] {
            T01O317_A1018DibMetRea, T01O317_n1018DibMetRea
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01O321_A396EmprCod, T01O321_A361DisCod, T01O321_A13376DisTraID
            }
            , new Object[] {
            T01O322_A396EmprCod, T01O322_A361DisCod, T01O322_A13213DisNormID
            }
            , new Object[] {
            T01O323_A396EmprCod, T01O323_A361DisCod, T01O323_A13081DisDGLin, T01O323_A13082DisDGDibCl, T01O323_A13083DisDGDibIn, T01O323_A13084DisDGComb, T01O323_A13085DisDGFondo
            }
            , new Object[] {
            T01O324_A396EmprCod, T01O324_A361DisCod, T01O324_A7068DisNotLin
            }
            , new Object[] {
            T01O325_A396EmprCod, T01O325_A361DisCod, T01O325_A10197ProEspCod
            }
            , new Object[] {
            T01O326_A396EmprCod, T01O326_A361DisCod, T01O326_A4594AccCod
            }
            , new Object[] {
            T01O327_A396EmprCod, T01O327_A361DisCod, T01O327_A3398DisRefBarC, T01O327_A3399DisRefBCRe, T01O327_A3400DisRefBCPa, T01O327_A3607DisRefBPie
            }
            , new Object[] {
            T01O328_A396EmprCod, T01O328_A361DisCod, T01O328_A376DisObsLin
            }
            , new Object[] {
            T01O329_A396EmprCod, T01O329_A361DisCod, T01O329_A758ProCod
            }
            , new Object[] {
            T01O330_A396EmprCod, T01O330_A361DisCod, T01O330_A833TipDefCod
            }
            , new Object[] {
            T01O331_A396EmprCod, T01O331_A361DisCod, T01O331_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01O334_A396EmprCod, T01O334_A361DisCod
            }
            , new Object[] {
            T01O335_A361DisCod, T01O335_A2524DisComLin, T01O335_A1056DisComCod, T01O335_A1057DisComAnh, T01O335_n1057DisComAnh, T01O335_A1058DisComMtr, T01O335_n1058DisComMtr, T01O335_A1059DisComPie, T01O335_n1059DisComPie, T01O335_A7735DisComObs,
            T01O335_n7735DisComObs, T01O335_A396EmprCod, T01O335_A1032FonCod
            }
            , new Object[] {
            T01O336_A396EmprCod, T01O336_A361DisCod, T01O336_A2524DisComLin, T01O336_A1056DisComCod, T01O336_A1032FonCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01O340_A396EmprCod, T01O340_A361DisCod, T01O340_A2524DisComLin, T01O340_A1056DisComCod, T01O340_A1032FonCod
            }
            , new Object[] {
            T01O341_A407EmprNom, T01O341_n407EmprNom
            }
            , new Object[] {
            T01O343_A387DisPiePie, T01O343_n387DisPiePie
            }
            , new Object[] {
            T01O344_A595Kilos
            }
            , new Object[] {
            T01O345_A382DisPieKil
            }
            , new Object[] {
            T01O346_A631Metros
            }
            , new Object[] {
            T01O347_A384DisPieMet
            }
         }
      );
      Z361DisCod = 0 ;
      E361DisCod = 0 ;
      A361DisCod = 0 ;
      Z396EmprCod = "" ;
      E396EmprCod = "" ;
      A396EmprCod = "" ;
      AV34Pgmname = "TDisVariantes" ;
      Z1057DisComAnh = (short)(0) ;
      n1057DisComAnh = false ;
      A1057DisComAnh = (short)(0) ;
      n1057DisComAnh = false ;
      i1057DisComAnh = (short)(0) ;
      n1057DisComAnh = false ;
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
   private short Z334DisArtAnh ;
   private short Z1057DisComAnh ;
   private short Z1059DisComPie ;
   private short nRcdDeleted_551 ;
   private short nRcdExists_551 ;
   private short nIsMod_551 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A334DisArtAnh ;
   private short A387DisPiePie ;
   private short nBlankRcdCount551 ;
   private short RcdFound551 ;
   private short nBlankRcdUsr551 ;
   private short A1057DisComAnh ;
   private short A1059DisComPie ;
   private short Z387DisPiePie ;
   private short RcdFound34 ;
   private short nIsDirty_34 ;
   private short nIsDirty_551 ;
   private short i1057DisComAnh ;
   private short ZZ334DisArtAnh ;
   private short ZZ387DisPiePie ;
   private int wcpOA361DisCod ;
   private int Z361DisCod ;
   private int Z252CliCod ;
   private int Z1014DibInt ;
   private int nRC_GXsfl_95 ;
   private int nGXsfl_95_idx=1 ;
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
   private int edtDisComULin_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtDibCli_Enabled ;
   private int A1014DibInt ;
   private int edtDibInt_Enabled ;
   private int edtDisArtCod_Enabled ;
   private int edtDisColNom_Enabled ;
   private int edtDibMetRea_Enabled ;
   private int edtDisArtAnh_Enabled ;
   private int edtDisPieMtr_Enabled ;
   private int edtDisPieKgm_Enabled ;
   private int edtDisPiePie_Enabled ;
   private int edtavnRcdDeleted_551_Enabled ;
   private int edtDisComLin_Enabled ;
   private int edtDisComCod_Enabled ;
   private int edtFonCod_Enabled ;
   private int edtDisComAnh_Enabled ;
   private int edtDisComMtr_Enabled ;
   private int edtDisComPie_Enabled ;
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
   private int GX_JID ;
   private int GXv_int5[] ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtFonCod_Enabled ;
   private int defedtDisComCod_Enabled ;
   private int defedtDisComLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtDisPiePie_Backcolor ;
   private int edtDisPieKgm_Backcolor ;
   private int edtDisPieMtr_Backcolor ;
   private int edtDisArtAnh_Backcolor ;
   private int edtDibMetRea_Backcolor ;
   private int edtDisColNom_Backcolor ;
   private int edtDisArtCod_Backcolor ;
   private int edtDibInt_Backcolor ;
   private int edtDibCli_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtDisComULin_Backcolor ;
   private int edtDisCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ361DisCod ;
   private int ZZ252CliCod ;
   private int ZZ1014DibInt ;
   private int E361DisCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z1018DibMetRea ;
   private java.math.BigDecimal O1018DibMetRea ;
   private java.math.BigDecimal Z1058DisComMtr ;
   private java.math.BigDecimal O1058DisComMtr ;
   private java.math.BigDecimal A1018DibMetRea ;
   private java.math.BigDecimal A385DisPieMtr ;
   private java.math.BigDecimal A381DisPieKgm ;
   private java.math.BigDecimal B1018DibMetRea ;
   private java.math.BigDecimal s1018DibMetRea ;
   private java.math.BigDecimal A1058DisComMtr ;
   private java.math.BigDecimal T1058DisComMtr ;
   private java.math.BigDecimal Z385DisPieMtr ;
   private java.math.BigDecimal Z381DisPieKgm ;
   private java.math.BigDecimal ZZ1018DibMetRea ;
   private java.math.BigDecimal ZZ385DisPieMtr ;
   private java.math.BigDecimal ZZ381DisPieKgm ;
   private java.math.BigDecimal ZO1018DibMetRea ;
   private java.math.BigDecimal X595Kilos ;
   private java.math.BigDecimal X382DisPieKil ;
   private java.math.BigDecimal X631Metros ;
   private java.math.BigDecimal X384DisPieMet ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String Z335DisArtCod ;
   private String Z362DisColNom ;
   private String Z1013DibCli ;
   private String Z365DisDes ;
   private String Z1056DisComCod ;
   private String Z1032FonCod ;
   private String Z7735DisComObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A365DisDes ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtDisArtAnh_Internalname ;
   private String sGXsfl_95_idx="0001" ;
   private String A362DisColNom ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtDibCli_Internalname ;
   private String A1013DibCli ;
   private String edtDibCli_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtDibInt_Internalname ;
   private String edtDibInt_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtDisArtCod_Internalname ;
   private String A335DisArtCod ;
   private String edtDisArtCod_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtDisColNom_Internalname ;
   private String edtDisColNom_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtDibMetRea_Internalname ;
   private String edtDibMetRea_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtDisArtAnh_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtDisPieMtr_Internalname ;
   private String edtDisPieMtr_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtDisPieKgm_Internalname ;
   private String edtDisPieKgm_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtDisPiePie_Internalname ;
   private String edtDisPiePie_Jsonclick ;
   private String sMode551 ;
   private String edtavnRcdDeleted_551_Internalname ;
   private String edtDisComLin_Internalname ;
   private String edtDisComCod_Internalname ;
   private String edtFonCod_Internalname ;
   private String edtDisComAnh_Internalname ;
   private String edtDisComMtr_Internalname ;
   private String edtDisComPie_Internalname ;
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
   private String AV34Pgmname ;
   private String hsh ;
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
   private String A7735DisComObs ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String GXv_char4[] ;
   private String sGXsfl_95_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_551_Jsonclick ;
   private String edtDisComLin_Jsonclick ;
   private String edtDisComCod_Jsonclick ;
   private String edtFonCod_Jsonclick ;
   private String edtDisComAnh_Jsonclick ;
   private String edtDisComMtr_Jsonclick ;
   private String edtDisComPie_Jsonclick ;
   private String edtDisComObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ1013DibCli ;
   private String ZZ335DisArtCod ;
   private String ZZ362DisColNom ;
   private String E396EmprCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n362DisColNom ;
   private boolean n2525DisComULin ;
   private boolean n1018DibMetRea ;
   private boolean bGXsfl_95_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n1013DibCli ;
   private boolean n1014DibInt ;
   private boolean n387DisPiePie ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n1057DisComAnh ;
   private boolean n1058DisComMtr ;
   private boolean n1059DisComPie ;
   private boolean n7735DisComObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01O36_A407EmprNom ;
   private boolean[] T01O36_n407EmprNom ;
   private short[] T01O311_A387DisPiePie ;
   private boolean[] T01O311_n387DisPiePie ;
   private String[] T01O37_A279CliNom ;
   private java.math.BigDecimal[] T01O39_A1018DibMetRea ;
   private boolean[] T01O39_n1018DibMetRea ;
   private int[] T01O313_A361DisCod ;
   private String[] T01O313_A407EmprNom ;
   private boolean[] T01O313_n407EmprNom ;
   private byte[] T01O313_A2525DisComULin ;
   private boolean[] T01O313_n2525DisComULin ;
   private String[] T01O313_A279CliNom ;
   private String[] T01O313_A335DisArtCod ;
   private String[] T01O313_A362DisColNom ;
   private boolean[] T01O313_n362DisColNom ;
   private java.math.BigDecimal[] T01O313_A1018DibMetRea ;
   private boolean[] T01O313_n1018DibMetRea ;
   private short[] T01O313_A334DisArtAnh ;
   private String[] T01O313_A396EmprCod ;
   private int[] T01O313_A252CliCod ;
   private String[] T01O313_A1013DibCli ;
   private boolean[] T01O313_n1013DibCli ;
   private int[] T01O313_A1014DibInt ;
   private boolean[] T01O313_n1014DibInt ;
   private short[] T01O313_A387DisPiePie ;
   private boolean[] T01O313_n387DisPiePie ;
   private String[] T01O313_A365DisDes ;
   private String[] T01O314_A396EmprCod ;
   private int[] T01O314_A361DisCod ;
   private int[] T01O35_A361DisCod ;
   private byte[] T01O35_A2525DisComULin ;
   private boolean[] T01O35_n2525DisComULin ;
   private String[] T01O35_A335DisArtCod ;
   private String[] T01O35_A362DisColNom ;
   private boolean[] T01O35_n362DisColNom ;
   private short[] T01O35_A334DisArtAnh ;
   private String[] T01O35_A396EmprCod ;
   private int[] T01O35_A252CliCod ;
   private String[] T01O35_A1013DibCli ;
   private boolean[] T01O35_n1013DibCli ;
   private int[] T01O35_A1014DibInt ;
   private boolean[] T01O35_n1014DibInt ;
   private String[] T01O35_A365DisDes ;
   private String[] T01O315_A396EmprCod ;
   private int[] T01O315_A361DisCod ;
   private String[] T01O316_A396EmprCod ;
   private int[] T01O316_A361DisCod ;
   private int[] T01O34_A361DisCod ;
   private byte[] T01O34_A2525DisComULin ;
   private boolean[] T01O34_n2525DisComULin ;
   private String[] T01O34_A335DisArtCod ;
   private String[] T01O34_A362DisColNom ;
   private boolean[] T01O34_n362DisColNom ;
   private short[] T01O34_A334DisArtAnh ;
   private String[] T01O34_A396EmprCod ;
   private int[] T01O34_A252CliCod ;
   private String[] T01O34_A1013DibCli ;
   private boolean[] T01O34_n1013DibCli ;
   private int[] T01O34_A1014DibInt ;
   private boolean[] T01O34_n1014DibInt ;
   private String[] T01O34_A365DisDes ;
   private java.math.BigDecimal[] T01O317_A1018DibMetRea ;
   private boolean[] T01O317_n1018DibMetRea ;
   private String[] T01O321_A396EmprCod ;
   private int[] T01O321_A361DisCod ;
   private String[] T01O321_A13376DisTraID ;
   private String[] T01O322_A396EmprCod ;
   private int[] T01O322_A361DisCod ;
   private String[] T01O322_A13213DisNormID ;
   private String[] T01O323_A396EmprCod ;
   private int[] T01O323_A361DisCod ;
   private byte[] T01O323_A13081DisDGLin ;
   private String[] T01O323_A13082DisDGDibCl ;
   private int[] T01O323_A13083DisDGDibIn ;
   private String[] T01O323_A13084DisDGComb ;
   private String[] T01O323_A13085DisDGFondo ;
   private String[] T01O324_A396EmprCod ;
   private int[] T01O324_A361DisCod ;
   private byte[] T01O324_A7068DisNotLin ;
   private String[] T01O325_A396EmprCod ;
   private int[] T01O325_A361DisCod ;
   private String[] T01O325_A10197ProEspCod ;
   private String[] T01O326_A396EmprCod ;
   private int[] T01O326_A361DisCod ;
   private short[] T01O326_A4594AccCod ;
   private String[] T01O327_A396EmprCod ;
   private int[] T01O327_A361DisCod ;
   private int[] T01O327_A3398DisRefBarC ;
   private byte[] T01O327_A3399DisRefBCRe ;
   private String[] T01O327_A3400DisRefBCPa ;
   private String[] T01O327_A3607DisRefBPie ;
   private String[] T01O328_A396EmprCod ;
   private int[] T01O328_A361DisCod ;
   private byte[] T01O328_A376DisObsLin ;
   private String[] T01O329_A396EmprCod ;
   private int[] T01O329_A361DisCod ;
   private String[] T01O329_A758ProCod ;
   private String[] T01O330_A396EmprCod ;
   private int[] T01O330_A361DisCod ;
   private short[] T01O330_A833TipDefCod ;
   private String[] T01O331_A396EmprCod ;
   private int[] T01O331_A361DisCod ;
   private int[] T01O331_A44AlbRecCod ;
   private String[] T01O334_A396EmprCod ;
   private int[] T01O334_A361DisCod ;
   private int[] T01O335_A361DisCod ;
   private byte[] T01O335_A2524DisComLin ;
   private String[] T01O335_A1056DisComCod ;
   private short[] T01O335_A1057DisComAnh ;
   private boolean[] T01O335_n1057DisComAnh ;
   private java.math.BigDecimal[] T01O335_A1058DisComMtr ;
   private boolean[] T01O335_n1058DisComMtr ;
   private short[] T01O335_A1059DisComPie ;
   private boolean[] T01O335_n1059DisComPie ;
   private String[] T01O335_A7735DisComObs ;
   private boolean[] T01O335_n7735DisComObs ;
   private String[] T01O335_A396EmprCod ;
   private String[] T01O335_A1032FonCod ;
   private String[] T01O336_A396EmprCod ;
   private int[] T01O336_A361DisCod ;
   private byte[] T01O336_A2524DisComLin ;
   private String[] T01O336_A1056DisComCod ;
   private String[] T01O336_A1032FonCod ;
   private int[] T01O33_A361DisCod ;
   private byte[] T01O33_A2524DisComLin ;
   private String[] T01O33_A1056DisComCod ;
   private short[] T01O33_A1057DisComAnh ;
   private boolean[] T01O33_n1057DisComAnh ;
   private java.math.BigDecimal[] T01O33_A1058DisComMtr ;
   private boolean[] T01O33_n1058DisComMtr ;
   private short[] T01O33_A1059DisComPie ;
   private boolean[] T01O33_n1059DisComPie ;
   private String[] T01O33_A7735DisComObs ;
   private boolean[] T01O33_n7735DisComObs ;
   private String[] T01O33_A396EmprCod ;
   private String[] T01O33_A1032FonCod ;
   private int[] T01O32_A361DisCod ;
   private byte[] T01O32_A2524DisComLin ;
   private String[] T01O32_A1056DisComCod ;
   private short[] T01O32_A1057DisComAnh ;
   private boolean[] T01O32_n1057DisComAnh ;
   private java.math.BigDecimal[] T01O32_A1058DisComMtr ;
   private boolean[] T01O32_n1058DisComMtr ;
   private short[] T01O32_A1059DisComPie ;
   private boolean[] T01O32_n1059DisComPie ;
   private String[] T01O32_A7735DisComObs ;
   private boolean[] T01O32_n7735DisComObs ;
   private String[] T01O32_A396EmprCod ;
   private String[] T01O32_A1032FonCod ;
   private String[] T01O340_A396EmprCod ;
   private int[] T01O340_A361DisCod ;
   private byte[] T01O340_A2524DisComLin ;
   private String[] T01O340_A1056DisComCod ;
   private String[] T01O340_A1032FonCod ;
   private String[] T01O341_A407EmprNom ;
   private boolean[] T01O341_n407EmprNom ;
   private short[] T01O343_A387DisPiePie ;
   private boolean[] T01O343_n387DisPiePie ;
   private java.math.BigDecimal[] T01O344_A595Kilos ;
   private java.math.BigDecimal[] T01O345_A382DisPieKil ;
   private java.math.BigDecimal[] T01O346_A631Metros ;
   private java.math.BigDecimal[] T01O347_A384DisPieMet ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private java.math.BigDecimal[] T01O38_A1018DibMetRea ;
   private boolean[] T01O38_n1018DibMetRea ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdisvariantes__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisvariantes__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisvariantes__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisvariantes__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisvariantes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01O32", "SELECT DisCod, DisComLin, DisComCod, DisComAnh, DisComMtr, DisComPie, DisComObs, EmprCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? AND DisCod = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?  FOR UPDATE OF DisComAnh, DisComMtr, DisComPie, DisComObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O33", "SELECT DisCod, DisComLin, DisComCod, DisComAnh, DisComMtr, DisComPie, DisComObs, EmprCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? AND DisCod = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O34", "SELECT DisCod, DisComULin, DisArtCod, DisColNom, DisArtAnh, EmprCod, CliCod, DibCli, DibInt, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ?  FOR UPDATE OF DisComULin, DisArtCod, DisColNom, DisArtAnh, CliCod, DibCli, DibInt, DisDes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O35", "SELECT DisCod, DisComULin, DisArtCod, DisColNom, DisArtAnh, EmprCod, CliCod, DibCli, DibInt, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O36", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O37", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O38", "SELECT DibMetRea FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?  FOR UPDATE OF DibMetRea NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O39", "SELECT DibMetRea FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O311", "SELECT COALESCE( T1.DisPiePie, 0) AS DisPiePie FROM (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O313", "SELECT /*+ FIRST_ROWS(1) */ TM1.DisCod, T2.EmprNom, TM1.DisComULin, T3.CliNom, TM1.DisArtCod, TM1.DisColNom, T4.DibMetRea, TM1.DisArtAnh, TM1.EmprCod, TM1.CliCod, TM1.DibCli, TM1.DibInt, COALESCE( T5.DisPiePie, 0) AS DisPiePie, TM1.DisDes FROM ((((TXPDISPOS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN TXPCDIBUJ T4 ON T4.EmprCod = TM1.EmprCod AND T4.DibCli = TM1.DibCli AND T4.CliCod = TM1.CliCod AND T4.DibInt = TM1.DibInt) LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T5 ON T5.EmprCod = TM1.EmprCod AND T5.DisCod = TM1.DisCod) WHERE TM1.EmprCod = ? and TM1.DisCod = ? ORDER BY TM1.EmprCod, TM1.DisCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O314", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O315", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O316", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod DESC, DisCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O317", "SELECT DibMetRea FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?  FOR UPDATE OF DibMetRea NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01O318", "INSERT INTO TXPDISPOS(DisCod, DisComULin, DisArtCod, DisColNom, DisArtAnh, EmprCod, CliCod, DibCli, DibInt, DisDes, DisNumPie, DisNumUni, DisUniMed, DisArtPes, PriCod, DisCliNum, DisFecCli, DisFec, DisFecEnt, DisColNum, DisTipCol, DisArtDsc, DisEnt, DisObsULin, DisArtMat, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtOpe, DisArtTr1, DisArtPt1, DisArtTr2, DisArtPt2, DisArtTr3, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtPu1, DisArtUr2, DisArtPu2, DisArtUr3, DisArtPu3, DisEst, DisPreKgm, DisPreMtr, DisPieLan, DisKgmLan, DisMtrLan, DisNMtr, DisNMez, DisNumTen, MaqCodDis, PartCod, TipConCod, DisNomCli, DisNumCli, DisEncCom, DisEncAnh, DisGraCru, DisArtAn1, DisArtAcb, DisArtAc2, DisLoc, DisPart, DisGraAca, DisRdoN, DisRdoA, DisRes, DisTipDis, DisNumBas, DisCliDes, DisManCod, DisOpeAnt, DisCodTex, DisNumTex1, DisNumTex2, DisNumLot, DisKgsLot, DisMtrLot, DisPla, DisPle2, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisFac, DisManCod1, DisManCod2, DisNumTon, DisFecLan, RetCod, DisArtMer, EmpesCod, DisNumCol, DisObs, DisEnv, DisTin, DisNPzas, DisNPzasL, DisUsrCod, DisPelAnh, DisCruMts, DisCruKgs, DisCruEnr, DisLotMts, DisLotKgs, DisAcaBak, DisAcaAnh, DisAcaMar, DisMdlCod, DisTam, DisHorEnt, DisHorReg, DisDishCod, DisNroCor, DisEncCli, DibColDib, DisTipEst, DisGraCob, DisCom, DisEstTip, DisAcc, DisTipCor, DisObsGrm, DisObsAnc, DisAntp, DisAntpT, DisVolMaq, DisRbMaq, DisDto, DisFacSep, DisFacGra, DisOrdSep, DisOrdGra, DisDesCol, DisGraTam, DisRec, DisMaqEst, DisExp, DisFEnt, DisDest, DisFchT, DisItem1, DisItem2, DisItem3, DisItem4, DisItem5, DisItem6, Cod_Idtx, DisFecPed, DisLotPza, DisLotMaq, DisAcaFor, DibColCol, DisDibCoCN, DibColColN, DisDibCoDN, DisUltNot, DisParCod, DisParReo, DisParPar, DisMemo1, DisMemo2, MarcaId, DisOrdComp, DisCnoEncO, Nxt_modelo, CpteId, Nxt_statio, DesaID, DptoID, Nxt_artcli, RevenID, DisPriorid, DisTpEstam, DisProdID, DisOEKOTEX, DisLineaID, DisCanalID, DisLinPrd, DisDGUltli, DisRGB, DisRdto4, DisTallUlt, DisIdtx2, DisArtDsc2, DisPrePz) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0)", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T01O319", "UPDATE TXPDISPOS SET DisComULin=?, DisArtCod=?, DisColNom=?, DisArtAnh=?, CliCod=?, DibCli=?, DibInt=?, DisDes=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T01O320", "DELETE FROM TXPDISPOS  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new ForEachCursor("T01O321", "SELECT * FROM (SELECT EmprCod, DisCod, DisTraID FROM TXPDISATI WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O322", "SELECT * FROM (SELECT EmprCod, DisCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O323", "SELECT * FROM (SELECT EmprCod, DisCod, DisDGLin, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo FROM TXPDIGCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O324", "SELECT * FROM (SELECT EmprCod, DisCod, DisNotLin FROM TXPDISNOT WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O325", "SELECT * FROM (SELECT EmprCod, DisCod, ProEspCod FROM TXPDisPE WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O326", "SELECT * FROM (SELECT EmprCod, DisCod, AccCod FROM TXPDISACC WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O327", "SELECT * FROM (SELECT EmprCod, DisCod, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie FROM TXPDISREF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O328", "SELECT * FROM (SELECT EmprCod, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O329", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O330", "SELECT * FROM (SELECT EmprCod, DisCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O331", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01O332", "UPDATE TXPDISPOS SET DisComULin=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T01O333", "UPDATE TXPCDIBUJ SET DibMetRea=?  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?", GX_NOMASK, "TXPCDIBUJ")
         ,new ForEachCursor("T01O334", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O335", "SELECT DisCod, DisComLin, DisComCod, DisComAnh, DisComMtr, DisComPie, DisComObs, EmprCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? and DisCod = ? and DisComLin = ? and DisComCod = ? and FonCod = ? ORDER BY EmprCod, DisCod, DisComLin, DisComCod, FonCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O336", "SELECT EmprCod, DisCod, DisComLin, DisComCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? AND DisCod = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01O337", "INSERT INTO TXPDISCOM(DisCod, DisComLin, DisComCod, DisComAnh, DisComMtr, DisComPie, DisComObs, EmprCod, FonCod, DisComDibC, DisComDibI) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0)", GX_NOMASK, "TXPDISCOM")
         ,new UpdateCursor("T01O338", "UPDATE TXPDISCOM SET DisComAnh=?, DisComMtr=?, DisComPie=?, DisComObs=?  WHERE EmprCod = ? AND DisCod = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK, "TXPDISCOM")
         ,new UpdateCursor("T01O339", "DELETE FROM TXPDISCOM  WHERE EmprCod = ? AND DisCod = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK, "TXPDISCOM")
         ,new ForEachCursor("T01O340", "SELECT EmprCod, DisCod, DisComLin, DisComCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisComLin, DisComCod, FonCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O341", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O343", "SELECT COALESCE( T1.DisPiePie, 0) AS DisPiePie FROM (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O344", "SELECT SUM(Kilos) AS GXC5 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O345", "SELECT SUM(DisPieKil) AS GXC4 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O346", "SELECT SUM(Metros) AS GXC2 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O347", "SELECT SUM(DisPieMet) AS GXC1 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 70);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 3);
               ((String[]) buf[12])[0] = rslt.getString(9, 12);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 70);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 3);
               ((String[]) buf[12])[0] = rslt.getString(9, 12);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 1);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((String[]) buf[7])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((String[]) buf[14])[0] = rslt.getString(11, 16);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(13);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 5);
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
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 70);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 3);
               ((String[]) buf[12])[0] = rslt.getString(9, 12);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 38 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 39 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 40 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 41 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 42 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               return;
            case 14 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 13);
               }
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               stmt.setString(6, (String)parms[7], 3);
               stmt.setInt(7, ((Number) parms[8]).intValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[10], 16);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[12]).intValue());
               }
               stmt.setString(10, (String)parms[13], 1);
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 16);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 13);
               }
               stmt.setShort(4, ((Number) parms[5]).shortValue());
               stmt.setInt(5, ((Number) parms[6]).intValue());
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
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[10]).intValue());
               }
               stmt.setString(8, (String)parms[11], 1);
               stmt.setString(9, (String)parms[12], 3);
               stmt.setInt(10, ((Number) parms[13]).intValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 28 :
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
            case 29 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setInt(4, ((Number) parms[5]).intValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 33 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 12);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 2);
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
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 70);
               }
               stmt.setString(8, (String)parms[11], 3);
               stmt.setString(9, (String)parms[12], 12);
               return;
            case 34 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
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
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 70);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setByte(7, ((Number) parms[10]).byteValue());
               stmt.setString(8, (String)parms[11], 12);
               stmt.setString(9, (String)parms[12], 12);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

