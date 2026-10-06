package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tforaca_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         n758ProCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         AV20Msg_err = httpContext.GetPar( "Msg_err") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Msg_err", AV20Msg_err);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_3_TC476( A396EmprCod, A758ProCod, A457FasCod, AV20Msg_err) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A396EmprCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_17") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4898ArtProCod = httpContext.GetPar( "ArtProCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_17( A396EmprCod, A4898ArtProCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
      {
         gxnrgrid2_newrow_invoke( ) ;
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
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = httpContext.GetPar( "ArtCod") ;
            n65ArtCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A758ProCod = httpContext.GetPar( "ProCod") ;
            n758ProCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "FORMULAS DE ACABADO", ""), (short)(0)) ;
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
      edtArtProFac_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtProFac_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProFac_Visible), 5, 0), !bGXsfl_60_Refreshing);
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

   public void gxnrgrid2_newrow_invoke( )
   {
      nRC_GXsfl_92 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_92"))) ;
      nGXsfl_92_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_92_idx"))) ;
      sGXsfl_92_idx = httpContext.GetPar( "sGXsfl_92_idx") ;
      A4894ArtProULin = (short)(GXutil.lval( httpContext.GetPar( "ArtProULin"))) ;
      n4894ArtProULin = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid2_newrow( ) ;
      /* End function gxnrGrid2_newrow_invoke */
   }

   public tforaca_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tforaca_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tforaca_impl.class ));
   }

   public tforaca_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TFORACA.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion Articulo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Descripcion Proceso", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol60( ) ;
      /* Save parent mode. */
      sMode476 = Gx_mode ;
      nGXsfl_60_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount476 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_476 = (short)(1) ;
            scanStartTC476( ) ;
            while ( RcdFound476 != 0 )
            {
               init_level_properties476( ) ;
               getByPrimaryKeyTC476( ) ;
               addRowTC476( ) ;
               scanNextTC476( ) ;
            }
            scanEndTC476( ) ;
            nBlankRcdCount476 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalTC476( ) ;
         standaloneModalTC476( ) ;
         sMode476 = Gx_mode ;
         while ( nGXsfl_60_idx < nRC_GXsfl_60 )
         {
            bGXsfl_60_Refreshing = true ;
            readRowTC476( ) ;
            edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtFasForMul_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASFORMUL_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasForMul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasForMul_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtArtProULin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTPROULIN_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtArtProULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProULin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtArtProFac_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTPROFAC_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtArtProFac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProFac_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtArtProFac_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "ARTPROFAC_"+sGXsfl_60_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtArtProFac_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProFac_Visible), 5, 0), !bGXsfl_60_Refreshing);
            if ( ( nRcdExists_476 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalTC476( ) ;
            }
            sendRowTC476( ) ;
            bGXsfl_60_Refreshing = false ;
         }
         Gx_mode = sMode476 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount476 = (short)(5) ;
         nRcdExists_476 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartTC476( ) ;
            while ( RcdFound476 != 0 )
            {
               sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_60476( ) ;
               init_level_properties476( ) ;
               standaloneNotModalTC476( ) ;
               getByPrimaryKeyTC476( ) ;
               standaloneModalTC476( ) ;
               addRowTC476( ) ;
               scanNextTC476( ) ;
            }
            scanEndTC476( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode476 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_60476( ) ;
      initAllTC476( ) ;
      init_level_properties476( ) ;
      nRcdExists_476 = (short)(0) ;
      nIsMod_476 = (short)(0) ;
      nRcdDeleted_476 = (short)(0) ;
      nBlankRcdCount476 = (short)(nBlankRcdUsr476+nBlankRcdCount476) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount476 > 0 )
      {
         standaloneNotModalTC476( ) ;
         standaloneModalTC476( ) ;
         addRowTC476( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtFasCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount476 = (short)(nBlankRcdCount476-1) ;
      }
      Gx_mode = sMode476 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* Restore parent mode. */
      Gx_mode = sMode476 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TFORACA.htm");
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
      e11TC2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
            Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_60 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_60"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV23Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV20Msg_err = httpContext.cgiGet( "vMSG_ERR") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
            n65ArtCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
            n69ArtDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            n758ProCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            /* Check if conditions changed and reset current page numbers */
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = httpContext.GetPar( "ArtCod") ;
               n65ArtCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A758ProCod = httpContext.GetPar( "ProCod") ;
               n758ProCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
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
                        e11TC2 ();
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
            initAllTC11( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_723_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_723_Enabled), 5, 0), !bGXsfl_92_Refreshing);
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
      disableAttributesTC11( ) ;
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

   public void confirm_TC0( )
   {
      beforeValidateTC11( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsTC11( ) ;
         }
         else
         {
            checkExtendedTableTC11( ) ;
            if ( AnyError == 0 )
            {
               zmTC11( 10) ;
               zmTC11( 11) ;
               zmTC11( 12) ;
               zmTC11( 13) ;
            }
            closeExtendedTableCursorsTC11( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode11 = Gx_mode ;
         confirm_TC476( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode11 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesTC0( ) ;
      }
   }

   public void confirm_TC723( )
   {
      s4894ArtProULin = O4894ArtProULin ;
      n4894ArtProULin = false ;
      nGXsfl_92_idx = 0 ;
      while ( nGXsfl_92_idx < nRC_GXsfl_92 )
      {
         readRowTC723( ) ;
         if ( ( nRcdExists_723 != 0 ) || ( nIsMod_723 != 0 ) )
         {
            getKeyTC723( ) ;
            if ( ( nRcdExists_723 == 0 ) && ( nRcdDeleted_723 == 0 ) )
            {
               if ( RcdFound723 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateTC723( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableTC723( ) ;
                     if ( AnyError == 0 )
                     {
                        zmTC723( 17) ;
                     }
                     closeExtendedTableCursorsTC723( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O4894ArtProULin = A4894ArtProULin ;
                     n4894ArtProULin = false ;
                  }
               }
               else
               {
                  GXCCtl = "FASCOD_" + sGXsfl_60_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFasCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound723 != 0 )
               {
                  if ( nRcdDeleted_723 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyTC723( ) ;
                     loadTC723( ) ;
                     beforeValidateTC723( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsTC723( ) ;
                        O4894ArtProULin = A4894ArtProULin ;
                        n4894ArtProULin = false ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_723 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateTC723( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableTC723( ) ;
                           if ( AnyError == 0 )
                           {
                              zmTC723( 17) ;
                           }
                           closeExtendedTableCursorsTC723( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O4894ArtProULin = A4894ArtProULin ;
                           n4894ArtProULin = false ;
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_723 == 0 )
                  {
                     GXCCtl = "FASCOD_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFasCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_723_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_723, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtArtProLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4897ArtProLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtArtProCod_Internalname, GXutil.rtrim( A4898ArtProCod)) ;
         httpContext.changePostValue( edtArtProDsc_Internalname, GXutil.rtrim( A4899ArtProDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z4897ArtProLin_"+sGXsfl_92_idx, GXutil.ltrim( localUtil.ntoc( Z4897ArtProLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4898ArtProCod_"+sGXsfl_92_idx, GXutil.rtrim( Z4898ArtProCod)) ;
         httpContext.changePostValue( "nRcdDeleted_723_"+sGXsfl_92_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_723, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_723_"+sGXsfl_92_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_723, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_723_"+sGXsfl_92_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_723, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_723 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_723_"+sGXsfl_92_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_723_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTPROLIN_"+sGXsfl_92_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTPROCOD_"+sGXsfl_92_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTPRODSC_"+sGXsfl_92_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O4894ArtProULin = s4894ArtProULin ;
      n4894ArtProULin = false ;
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_TC476( )
   {
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRowTC476( ) ;
         if ( ( nRcdExists_476 != 0 ) || ( nIsMod_476 != 0 ) )
         {
            getKeyTC476( ) ;
            if ( ( nRcdExists_476 == 0 ) && ( nRcdDeleted_476 == 0 ) )
            {
               if ( RcdFound476 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateTC476( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableTC476( ) ;
                     if ( AnyError == 0 )
                     {
                        zmTC476( 15) ;
                     }
                     closeExtendedTableCursorsTC476( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode476 = Gx_mode ;
                        confirm_TC723( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode476 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode476 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                  }
               }
               else
               {
                  GXCCtl = "FASCOD_" + sGXsfl_60_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFasCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound476 != 0 )
               {
                  if ( nRcdDeleted_476 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyTC476( ) ;
                     loadTC476( ) ;
                     beforeValidateTC476( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsTC476( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_476 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateTC476( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableTC476( ) ;
                           if ( AnyError == 0 )
                           {
                              zmTC476( 15) ;
                           }
                           closeExtendedTableCursorsTC476( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode476 = Gx_mode ;
                              confirm_TC723( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode476 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode476 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_476 == 0 )
                  {
                     GXCCtl = "FASCOD_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFasCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( edtFasForMul_Internalname, GXutil.rtrim( A4286FasForMul)) ;
         httpContext.changePostValue( edtArtProULin_Internalname, GXutil.ltrim( localUtil.ntoc( A4894ArtProULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtArtProFac_Internalname, GXutil.ltrim( localUtil.ntoc( A4896ArtProFac, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_60_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4894ArtProULin_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z4894ArtProULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4896ArtProFac_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z4896ArtProFac, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4894ArtProULin_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O4894ArtProULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_92_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_92, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_476_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_476_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_476_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_476 != 0 )
         {
            httpContext.changePostValue( "FASCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASFORMUL_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForMul_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTPROULIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProULin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTPROFAC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProFac_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTPROFAC_"+sGXsfl_60_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtArtProFac_Visible, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionTC0( )
   {
   }

   public void e11TC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(8), GXv_char2) ;
      tforaca_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tforaca_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXt_char1 = AV13Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      tforaca_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Lit1", AV13Lit1);
      GXt_char1 = AV18Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV23Pgmname, (byte)(99), GXv_char2) ;
      tforaca_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit2", AV18Lit2);
      GXt_char1 = AV14Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1355_", ""), (byte)(99), GXv_char2) ;
      tforaca_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit3", AV14Lit3);
      GXt_char1 = AV15Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char2) ;
      tforaca_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit4", AV15Lit4);
      GXt_char1 = AV16Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN748_", ""), (byte)(99), GXv_char2) ;
      tforaca_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit5", AV16Lit5);
      GXt_char1 = AV17Lit41 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1373_", ""), (byte)(99), GXv_char2) ;
      tforaca_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit41 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit41", AV17Lit41);
      GXv_char2[0] = AV10EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tforaca_impl.this.AV10EmprCod = GXv_char2[0] ;
      tforaca_impl.this.AV11EmprNom = GXv_char3[0] ;
      tforaca_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_int5 = AV19Filasur ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "FILASU", ""), GXv_int6) ;
      tforaca_impl.this.GXt_int5 = GXv_int6[0] ;
      AV19Filasur = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Filasur", GXutil.str( AV19Filasur, 1, 0));
      GXt_int5 = AV21Eliot ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "ELIOT", ""), GXv_int6) ;
      tforaca_impl.this.GXt_int5 = GXv_int6[0] ;
      AV21Eliot = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Eliot", GXutil.str( AV21Eliot, 1, 0));
      if ( AV21Eliot == 1 )
      {
         /* * Property Visible not supported in */
         /* * Property Visible not supported in */
         /* * Property Visible not supported in */
         /* * Property Visible not supported in */
         /*
            Assignment error:
            ================
            Expression: [ t('0',3) ]
            Target    : [ t('Lit41',23),t('Visible',3) ]
            ForType   : 29
            Type      : []
         */
         edtArtProFac_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtProFac_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProFac_Visible), 5, 0), !bGXsfl_60_Refreshing);
      }
   }

   public void zmTC11( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -9 )
      {
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z69ArtDsc = A69ArtDsc ;
         Z759ProDsc = A759ProDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV23Pgmname = "TFORACA" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Pgmname", AV23Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      /* Using cursor T00TC10 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00TC10_A407EmprNom[0] ;
      n407EmprNom = T00TC10_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(8);
      /* Using cursor T00TC11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T00TC11_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(9);
      /* Using cursor T00TC12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
      A69ArtDsc = T00TC12_A69ArtDsc[0] ;
      n69ArtDsc = T00TC12_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(10);
      /* Using cursor T00TC13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T00TC13_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(11);
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

   public void loadTC11( )
   {
      /* Using cursor T00TC14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A407EmprNom = T00TC14_A407EmprNom[0] ;
         n407EmprNom = T00TC14_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T00TC14_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A69ArtDsc = T00TC14_A69ArtDsc[0] ;
         n69ArtDsc = T00TC14_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A759ProDsc = T00TC14_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         zmTC11( -9) ;
      }
      pr_default.close(12);
      onLoadActionsTC11( ) ;
   }

   public void onLoadActionsTC11( )
   {
   }

   public void checkExtendedTableTC11( )
   {
      nIsDirty_11 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursorsTC11( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyTC11( )
   {
      /* Using cursor T00TC15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound11 = (short)(1) ;
      }
      else
      {
         RcdFound11 = (short)(0) ;
      }
      pr_default.close(13);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00TC9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T00TC9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00TC9_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00TC9_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T00TC9_A758ProCod[0], A758ProCod) == 0 ) )
      {
         zmTC11( 9) ;
         RcdFound11 = (short)(1) ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadTC11( ) ;
         if ( AnyError == 1 )
         {
            RcdFound11 = (short)(0) ;
            initializeNonKeyTC11( ) ;
         }
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound11 = (short)(0) ;
         initializeNonKeyTC11( ) ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(7);
   }

   public void getEqualNoModal( )
   {
      getKeyTC11( ) ;
      if ( RcdFound11 == 0 )
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
      RcdFound11 = (short)(0) ;
      /* Using cursor T00TC16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( GXutil.strcmp(T00TC16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00TC16_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00TC16_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T00TC16_A758ProCod[0], A758ProCod) == 0 ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( GXutil.strcmp(T00TC16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00TC16_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00TC16_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T00TC16_A758ProCod[0], A758ProCod) == 0 ) )
         {
            RcdFound11 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void move_previous( )
   {
      RcdFound11 = (short)(0) ;
      /* Using cursor T00TC17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( GXutil.strcmp(T00TC17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00TC17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00TC17_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T00TC17_A758ProCod[0], A758ProCod) == 0 ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( GXutil.strcmp(T00TC17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00TC17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00TC17_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T00TC17_A758ProCod[0], A758ProCod) == 0 ) )
         {
            RcdFound11 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyTC11( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insertTC11( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound11 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateTC11( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               insertTC11( ) ;
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
                  insertTC11( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
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
      getKeyTC11( ) ;
      if ( RcdFound11 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tforaca");
   }

   public void insert_check( )
   {
      confirm_TC0( ) ;
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
      if ( RcdFound11 == 0 )
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
      scanStartTC11( ) ;
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndTC11( ) ;
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
      if ( RcdFound11 == 0 )
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
      if ( RcdFound11 == 0 )
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
      scanStartTC11( ) ;
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound11 != 0 )
         {
            scanNextTC11( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndTC11( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyTC11( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00TC8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTLIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(6) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPARTLIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertTC11( )
   {
      beforeValidateTC11( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableTC11( ) ;
      }
      if ( AnyError == 0 )
      {
         zmTC11( 0) ;
         checkOptimisticConcurrencyTC11( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmTC11( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertTC11( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00TC18 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
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
                        processLevelTC11( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionTC0( ) ;
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
            loadTC11( ) ;
         }
         endLevelTC11( ) ;
      }
      closeExtendedTableCursorsTC11( ) ;
   }

   public void updateTC11( )
   {
      beforeValidateTC11( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableTC11( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyTC11( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmTC11( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateTC11( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPARTLIN */
                  deferredUpdateTC11( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelTC11( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionTC0( ) ;
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
         endLevelTC11( ) ;
      }
      closeExtendedTableCursorsTC11( ) ;
   }

   public void deferredUpdateTC11( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateTC11( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyTC11( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsTC11( ) ;
         afterConfirmTC11( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteTC11( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00TC19 */
               pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound11 == 0 )
                     {
                        initAllTC11( ) ;
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
                     resetCaptionTC0( ) ;
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
      sMode11 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelTC11( ) ;
      Gx_mode = sMode11 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsTC11( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00TC20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pedidos Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T00TC21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CAPFMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T00TC22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T00TC23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Procesos p/Modelo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T00TC24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cabezal de parametro", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
      }
   }

   public void processNestedLevelTC476( )
   {
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRowTC476( ) ;
         if ( ( nRcdExists_476 != 0 ) || ( nIsMod_476 != 0 ) )
         {
            standaloneNotModalTC476( ) ;
            getKeyTC476( ) ;
            if ( ( nRcdExists_476 == 0 ) && ( nRcdDeleted_476 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertTC476( ) ;
            }
            else
            {
               if ( RcdFound476 != 0 )
               {
                  if ( ( nRcdDeleted_476 != 0 ) && ( nRcdExists_476 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteTC476( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_476 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateTC476( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_476 == 0 )
                  {
                     GXCCtl = "FASCOD_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFasCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( edtFasForMul_Internalname, GXutil.rtrim( A4286FasForMul)) ;
         httpContext.changePostValue( edtArtProULin_Internalname, GXutil.ltrim( localUtil.ntoc( A4894ArtProULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtArtProFac_Internalname, GXutil.ltrim( localUtil.ntoc( A4896ArtProFac, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_60_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4894ArtProULin_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z4894ArtProULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4896ArtProFac_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z4896ArtProFac, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4894ArtProULin_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O4894ArtProULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_92_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_92, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_476_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_476_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_476_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_476 != 0 )
         {
            httpContext.changePostValue( "FASCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASFORMUL_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForMul_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTPROULIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProULin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTPROFAC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProFac_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTPROFAC_"+sGXsfl_60_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtArtProFac_Visible, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllTC476( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_476 = (short)(0) ;
      nIsMod_476 = (short)(0) ;
      nRcdDeleted_476 = (short)(0) ;
   }

   public void processLevelTC11( )
   {
      /* Save parent mode. */
      sMode11 = Gx_mode ;
      processNestedLevelTC476( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode11 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelTC11( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(6);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteTC11( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tforaca");
         if ( AnyError == 0 )
         {
            confirmValuesTC0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tforaca");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartTC11( )
   {
      /* Scan By routine */
      /* Using cursor T00TC25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
      RcdFound11 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound11 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextTC11( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound11 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound11 = (short)(1) ;
      }
   }

   public void scanEndTC11( )
   {
      pr_default.close(23);
   }

   public void afterConfirmTC11( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertTC11( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateTC11( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteTC11( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteTC11( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateTC11( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesTC11( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
   }

   public void zmTC476( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4894ArtProULin = T00TC6_A4894ArtProULin[0] ;
            Z4896ArtProFac = T00TC6_A4896ArtProFac[0] ;
         }
         else
         {
            Z4894ArtProULin = A4894ArtProULin ;
            Z4896ArtProFac = A4896ArtProFac ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         Z4894ArtProULin = A4894ArtProULin ;
         Z4896ArtProFac = A4896ArtProFac ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z460FasDsc = A460FasDsc ;
         Z4286FasForMul = A4286FasForMul ;
      }
   }

   public void standaloneNotModalTC476( )
   {
      edtArtProULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtProULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProULin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void standaloneModalTC476( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtFasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtFasCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
   }

   public void loadTC476( )
   {
      /* Using cursor T00TC26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod, A457FasCod});
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound476 = (short)(1) ;
         A460FasDsc = T00TC26_A460FasDsc[0] ;
         A4286FasForMul = T00TC26_A4286FasForMul[0] ;
         n4286FasForMul = T00TC26_n4286FasForMul[0] ;
         A4894ArtProULin = T00TC26_A4894ArtProULin[0] ;
         n4894ArtProULin = T00TC26_n4894ArtProULin[0] ;
         A4896ArtProFac = T00TC26_A4896ArtProFac[0] ;
         n4896ArtProFac = T00TC26_n4896ArtProFac[0] ;
         zmTC476( -14) ;
      }
      pr_default.close(24);
      onLoadActionsTC476( ) ;
   }

   public void onLoadActionsTC476( )
   {
   }

   public void checkExtendedTableTC476( )
   {
      nIsDirty_476 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalTC476( ) ;
      /* Using cursor T00TC7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T00TC7_A460FasDsc[0] ;
      A4286FasForMul = T00TC7_A4286FasForMul[0] ;
      n4286FasForMul = T00TC7_n4286FasForMul[0] ;
      pr_default.close(5);
      if ( GXutil.strcmp(A4286FasForMul, httpContext.getMessage( "N", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Fase con Formula=N", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursorsTC476( )
   {
      pr_default.close(5);
   }

   public void enableDisableTC476( )
   {
   }

   public void gxload_15( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T00TC27 */
      pr_default.execute(25, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T00TC27_A460FasDsc[0] ;
      A4286FasForMul = T00TC27_A4286FasForMul[0] ;
      n4286FasForMul = T00TC27_n4286FasForMul[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4286FasForMul))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(25) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(25);
   }

   public void getKeyTC476( )
   {
      /* Using cursor T00TC28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod, A457FasCod});
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound476 = (short)(1) ;
      }
      else
      {
         RcdFound476 = (short)(0) ;
      }
      pr_default.close(26);
   }

   public void getByPrimaryKeyTC476( )
   {
      /* Using cursor T00TC6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod, A457FasCod});
      if ( (pr_default.getStatus(4) != 101) && ( T00TC6_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00TC6_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T00TC6_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T00TC6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmTC476( 14) ;
         RcdFound476 = (short)(1) ;
         initializeNonKeyTC476( ) ;
         A4894ArtProULin = T00TC6_A4894ArtProULin[0] ;
         n4894ArtProULin = T00TC6_n4894ArtProULin[0] ;
         A4896ArtProFac = T00TC6_A4896ArtProFac[0] ;
         n4896ArtProFac = T00TC6_n4896ArtProFac[0] ;
         A457FasCod = T00TC6_A457FasCod[0] ;
         O4894ArtProULin = A4894ArtProULin ;
         n4894ArtProULin = false ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         Z457FasCod = A457FasCod ;
         sMode476 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalTC476( ) ;
         loadTC476( ) ;
         Gx_mode = sMode476 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound476 = (short)(0) ;
         initializeNonKeyTC476( ) ;
         sMode476 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalTC476( ) ;
         Gx_mode = sMode476 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesTC476( ) ;
      }
      pr_default.close(4);
   }

   public void checkOptimisticConcurrencyTC476( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00TC5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod, A457FasCod});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPSERPAU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z4894ArtProULin != T00TC5_A4894ArtProULin[0] ) || ( DecimalUtil.compareTo(Z4896ArtProFac, T00TC5_A4896ArtProFac[0]) != 0 ) )
         {
            if ( Z4894ArtProULin != T00TC5_A4894ArtProULin[0] )
            {
               GXutil.writeLogln("tforaca:[seudo value changed for attri]"+"ArtProULin");
               GXutil.writeLogRaw("Old: ",Z4894ArtProULin);
               GXutil.writeLogRaw("Current: ",T00TC5_A4894ArtProULin[0]);
            }
            if ( DecimalUtil.compareTo(Z4896ArtProFac, T00TC5_A4896ArtProFac[0]) != 0 )
            {
               GXutil.writeLogln("tforaca:[seudo value changed for attri]"+"ArtProFac");
               GXutil.writeLogRaw("Old: ",Z4896ArtProFac);
               GXutil.writeLogRaw("Current: ",T00TC5_A4896ArtProFac[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPSERPAU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertTC476( )
   {
      beforeValidateTC476( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableTC476( ) ;
      }
      if ( AnyError == 0 )
      {
         zmTC476( 0) ;
         checkOptimisticConcurrencyTC476( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmTC476( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertTC476( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00TC29 */
                  pr_default.execute(27, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod, Boolean.valueOf(n4894ArtProULin), Short.valueOf(A4894ArtProULin), Boolean.valueOf(n4896ArtProFac), A4896ArtProFac, A396EmprCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAU");
                  if ( (pr_default.getStatus(27) == 1) )
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
                        processLevelTC476( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
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
            loadTC476( ) ;
         }
         endLevelTC476( ) ;
      }
      closeExtendedTableCursorsTC476( ) ;
   }

   public void updateTC476( )
   {
      beforeValidateTC476( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableTC476( ) ;
      }
      if ( ( nIsMod_476 != 0 ) || ( nIsDirty_476 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyTC476( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmTC476( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateTC476( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00TC30 */
                     pr_default.execute(28, new Object[] {Boolean.valueOf(n4894ArtProULin), Short.valueOf(A4894ArtProULin), Boolean.valueOf(n4896ArtProFac), A4896ArtProFac, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod, A457FasCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAU");
                     if ( (pr_default.getStatus(28) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPSERPAU"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateTC476( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevelTC476( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKeyTC476( ) ;
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
            endLevelTC476( ) ;
         }
      }
      closeExtendedTableCursorsTC476( ) ;
   }

   public void deferredUpdateTC476( )
   {
   }

   public void deleteTC476( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateTC476( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyTC476( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsTC476( ) ;
         afterConfirmTC476( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteTC476( ) ;
            if ( AnyError == 0 )
            {
               A4894ArtProULin = O4894ArtProULin ;
               n4894ArtProULin = false ;
               scanStartTC723( ) ;
               while ( RcdFound723 != 0 )
               {
                  getByPrimaryKeyTC723( ) ;
                  deleteTC723( ) ;
                  scanNextTC723( ) ;
                  O4894ArtProULin = A4894ArtProULin ;
                  n4894ArtProULin = false ;
               }
               scanEndTC723( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00TC31 */
                  pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAU");
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
      }
      sMode476 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelTC476( ) ;
      Gx_mode = sMode476 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsTC476( )
   {
      standaloneModalTC476( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00TC32 */
         pr_default.execute(30, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T00TC32_A460FasDsc[0] ;
         A4286FasForMul = T00TC32_A4286FasForMul[0] ;
         n4286FasForMul = T00TC32_n4286FasForMul[0] ;
         pr_default.close(30);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00TC33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod, A457FasCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Parametro por Fase-Serie-Clien", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
      }
   }

   public void processNestedLevelTC723( )
   {
      s4894ArtProULin = O4894ArtProULin ;
      n4894ArtProULin = false ;
      nGXsfl_92_idx = 0 ;
      while ( nGXsfl_92_idx < nRC_GXsfl_92 )
      {
         readRowTC723( ) ;
         if ( ( nRcdExists_723 != 0 ) || ( nIsMod_723 != 0 ) )
         {
            standaloneNotModalTC723( ) ;
            getKeyTC723( ) ;
            if ( ( nRcdExists_723 == 0 ) && ( nRcdDeleted_723 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertTC723( ) ;
            }
            else
            {
               if ( RcdFound723 != 0 )
               {
                  if ( ( nRcdDeleted_723 != 0 ) && ( nRcdExists_723 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteTC723( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_723 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateTC723( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_723 == 0 )
                  {
                     GXCCtl = "FASCOD_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFasCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O4894ArtProULin = A4894ArtProULin ;
            n4894ArtProULin = false ;
         }
         httpContext.changePostValue( edtavnRcdDeleted_723_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_723, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtArtProLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4897ArtProLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtArtProCod_Internalname, GXutil.rtrim( A4898ArtProCod)) ;
         httpContext.changePostValue( edtArtProDsc_Internalname, GXutil.rtrim( A4899ArtProDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z4897ArtProLin_"+sGXsfl_92_idx, GXutil.ltrim( localUtil.ntoc( Z4897ArtProLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4898ArtProCod_"+sGXsfl_92_idx, GXutil.rtrim( Z4898ArtProCod)) ;
         httpContext.changePostValue( "nRcdDeleted_723_"+sGXsfl_92_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_723, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_723_"+sGXsfl_92_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_723, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_723_"+sGXsfl_92_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_723, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_723 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_723_"+sGXsfl_92_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_723_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTPROLIN_"+sGXsfl_92_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTPROCOD_"+sGXsfl_92_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTPRODSC_"+sGXsfl_92_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllTC723( ) ;
      if ( AnyError != 0 )
      {
         O4894ArtProULin = s4894ArtProULin ;
         n4894ArtProULin = false ;
      }
      nRcdExists_723 = (short)(0) ;
      nIsMod_723 = (short)(0) ;
      nRcdDeleted_723 = (short)(0) ;
   }

   public void processLevelTC476( )
   {
      /* Save parent mode. */
      sMode476 = Gx_mode ;
      processNestedLevelTC723( ) ;
      if ( AnyError != 0 )
      {
         O4894ArtProULin = s4894ArtProULin ;
         n4894ArtProULin = false ;
      }
      /* Restore parent mode. */
      Gx_mode = sMode476 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T00TC34 */
      pr_default.execute(32, new Object[] {Boolean.valueOf(n4894ArtProULin), Short.valueOf(A4894ArtProULin), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod, A457FasCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAU");
   }

   public void endLevelTC476( )
   {
      pr_default.close(3);
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartTC476( )
   {
      /* Scan By routine */
      /* Using cursor T00TC35 */
      pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
      RcdFound476 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound476 = (short)(1) ;
         A457FasCod = T00TC35_A457FasCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextTC476( )
   {
      /* Scan next routine */
      pr_default.readNext(33);
      RcdFound476 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound476 = (short)(1) ;
         A457FasCod = T00TC35_A457FasCod[0] ;
      }
   }

   public void scanEndTC476( )
   {
      pr_default.close(33);
   }

   public void afterConfirmTC476( )
   {
      /* After Confirm Rules */
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A758ProCod ;
         GXv_char2[0] = A457FasCod ;
         GXv_char7[0] = AV20Msg_err ;
         new app.pbusdis(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_char7) ;
         tforaca_impl.this.A396EmprCod = GXv_char4[0] ;
         tforaca_impl.this.A758ProCod = GXv_char3[0] ;
         tforaca_impl.this.A457FasCod = GXv_char2[0] ;
         tforaca_impl.this.AV20Msg_err = GXv_char7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV20Msg_err", AV20Msg_err);
      }
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(AV20Msg_err, " ") != 0 ) )
      {
         httpContext.GX_msglist.addItem(AV20Msg_err, 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsertTC476( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateTC476( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteTC476( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteTC476( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateTC476( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesTC476( )
   {
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtFasForMul_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasForMul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasForMul_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtArtProULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtProULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProULin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtArtProFac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtProFac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProFac_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void zmTC723( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4898ArtProCod = T00TC3_A4898ArtProCod[0] ;
         }
         else
         {
            Z4898ArtProCod = A4898ArtProCod ;
         }
      }
      if ( GX_JID == -16 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         Z4897ArtProLin = A4897ArtProLin ;
         Z4898ArtProCod = A4898ArtProCod ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z4899ArtProDsc = A4899ArtProDsc ;
      }
   }

   public void standaloneNotModalTC723( )
   {
      edtArtProULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtProULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProULin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void standaloneModalTC723( )
   {
      if ( isIns( )  )
      {
         A4894ArtProULin = (short)(O4894ArtProULin+10) ;
         n4894ArtProULin = false ;
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A4897ArtProLin = A4894ArtProULin ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtArtProLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProLin_Enabled), 5, 0), !bGXsfl_92_Refreshing);
      }
      else
      {
         edtArtProLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProLin_Enabled), 5, 0), !bGXsfl_92_Refreshing);
      }
   }

   public void loadTC723( )
   {
      /* Using cursor T00TC36 */
      pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod, A457FasCod, Short.valueOf(A4897ArtProLin)});
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound723 = (short)(1) ;
         A4898ArtProCod = T00TC36_A4898ArtProCod[0] ;
         A4899ArtProDsc = T00TC36_A4899ArtProDsc[0] ;
         n4899ArtProDsc = T00TC36_n4899ArtProDsc[0] ;
         zmTC723( -16) ;
      }
      pr_default.close(34);
      onLoadActionsTC723( ) ;
   }

   public void onLoadActionsTC723( )
   {
   }

   public void checkExtendedTableTC723( )
   {
      nIsDirty_723 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalTC723( ) ;
      /* Using cursor T00TC4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A4898ArtProCod});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A4899ArtProDsc = T00TC4_A4899ArtProDsc[0] ;
         n4899ArtProDsc = T00TC4_n4899ArtProDsc[0] ;
      }
      else
      {
         nIsDirty_723 = (short)(1) ;
         A4899ArtProDsc = "N/E" ;
         n4899ArtProDsc = false ;
      }
      pr_default.close(2);
      if ( GXutil.strcmp(A4899ArtProDsc, httpContext.getMessage( "N/E", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No Existe el Proceso Formula", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursorsTC723( )
   {
      pr_default.close(2);
   }

   public void enableDisableTC723( )
   {
   }

   public void gxload_17( String A396EmprCod ,
                          String A4898ArtProCod )
   {
      /* Using cursor T00TC37 */
      pr_default.execute(35, new Object[] {A396EmprCod, A4898ArtProCod});
      if ( (pr_default.getStatus(35) != 101) )
      {
         A4899ArtProDsc = T00TC37_A4899ArtProDsc[0] ;
         n4899ArtProDsc = T00TC37_n4899ArtProDsc[0] ;
      }
      else
      {
         A4899ArtProDsc = "N/E" ;
         n4899ArtProDsc = false ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4899ArtProDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(35) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(35);
   }

   public void getKeyTC723( )
   {
      /* Using cursor T00TC38 */
      pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod, A457FasCod, Short.valueOf(A4897ArtProLin)});
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound723 = (short)(1) ;
      }
      else
      {
         RcdFound723 = (short)(0) ;
      }
      pr_default.close(36);
   }

   public void getByPrimaryKeyTC723( )
   {
      /* Using cursor T00TC3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod, A457FasCod, Short.valueOf(A4897ArtProLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T00TC3_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00TC3_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T00TC3_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T00TC3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmTC723( 16) ;
         RcdFound723 = (short)(1) ;
         initializeNonKeyTC723( ) ;
         A4897ArtProLin = T00TC3_A4897ArtProLin[0] ;
         A4898ArtProCod = T00TC3_A4898ArtProCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         Z457FasCod = A457FasCod ;
         Z4897ArtProLin = A4897ArtProLin ;
         sMode723 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalTC723( ) ;
         loadTC723( ) ;
         Gx_mode = sMode723 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound723 = (short)(0) ;
         initializeNonKeyTC723( ) ;
         sMode723 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalTC723( ) ;
         Gx_mode = sMode723 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesTC723( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyTC723( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00TC2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod, A457FasCod, Short.valueOf(A4897ArtProLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPArtFor"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4898ArtProCod, T00TC2_A4898ArtProCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4898ArtProCod, T00TC2_A4898ArtProCod[0]) != 0 )
            {
               GXutil.writeLogln("tforaca:[seudo value changed for attri]"+"ArtProCod");
               GXutil.writeLogRaw("Old: ",Z4898ArtProCod);
               GXutil.writeLogRaw("Current: ",T00TC2_A4898ArtProCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPArtFor"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertTC723( )
   {
      beforeValidateTC723( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableTC723( ) ;
      }
      if ( AnyError == 0 )
      {
         zmTC723( 0) ;
         checkOptimisticConcurrencyTC723( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmTC723( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertTC723( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00TC39 */
                  pr_default.execute(37, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A4897ArtProLin), A4898ArtProCod, A396EmprCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPArtFor");
                  if ( (pr_default.getStatus(37) == 1) )
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
            loadTC723( ) ;
         }
         endLevelTC723( ) ;
      }
      closeExtendedTableCursorsTC723( ) ;
   }

   public void updateTC723( )
   {
      beforeValidateTC723( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableTC723( ) ;
      }
      if ( ( nIsMod_723 != 0 ) || ( nIsDirty_723 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyTC723( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmTC723( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateTC723( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00TC40 */
                     pr_default.execute(38, new Object[] {A4898ArtProCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod, A457FasCod, Short.valueOf(A4897ArtProLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPArtFor");
                     if ( (pr_default.getStatus(38) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPArtFor"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateTC723( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyTC723( ) ;
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
            endLevelTC723( ) ;
         }
      }
      closeExtendedTableCursorsTC723( ) ;
   }

   public void deferredUpdateTC723( )
   {
   }

   public void deleteTC723( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateTC723( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyTC723( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsTC723( ) ;
         afterConfirmTC723( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteTC723( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00TC41 */
               pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod, A457FasCod, Short.valueOf(A4897ArtProLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPArtFor");
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
      sMode723 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelTC723( ) ;
      Gx_mode = sMode723 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsTC723( )
   {
      standaloneModalTC723( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00TC42 */
         pr_default.execute(40, new Object[] {A396EmprCod, A4898ArtProCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            A4899ArtProDsc = T00TC42_A4899ArtProDsc[0] ;
            n4899ArtProDsc = T00TC42_n4899ArtProDsc[0] ;
         }
         else
         {
            A4899ArtProDsc = "N/E" ;
            n4899ArtProDsc = false ;
         }
         pr_default.close(40);
      }
   }

   public void endLevelTC723( )
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

   public void scanStartTC723( )
   {
      /* Scan By routine */
      /* Using cursor T00TC43 */
      pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod, A457FasCod});
      RcdFound723 = (short)(0) ;
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound723 = (short)(1) ;
         A4897ArtProLin = T00TC43_A4897ArtProLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextTC723( )
   {
      /* Scan next routine */
      pr_default.readNext(41);
      RcdFound723 = (short)(0) ;
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound723 = (short)(1) ;
         A4897ArtProLin = T00TC43_A4897ArtProLin[0] ;
      }
   }

   public void scanEndTC723( )
   {
      pr_default.close(41);
   }

   public void afterConfirmTC723( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertTC723( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateTC723( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteTC723( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteTC723( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateTC723( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesTC723( )
   {
      edtArtProLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProLin_Enabled), 5, 0), !bGXsfl_92_Refreshing);
      edtArtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProCod_Enabled), 5, 0), !bGXsfl_92_Refreshing);
      edtArtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProDsc_Enabled), 5, 0), !bGXsfl_92_Refreshing);
   }

   public void send_integrity_lvl_hashesTC723( )
   {
   }

   public void send_integrity_lvl_hashesTC476( )
   {
   }

   public void send_integrity_lvl_hashesTC11( )
   {
   }

   public void subsflControlProps_60476( )
   {
      lblTextblock9_Internalname = "TEXTBLOCK9_"+sGXsfl_60_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_60_idx ;
      lblTextblock10_Internalname = "TEXTBLOCK10_"+sGXsfl_60_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_60_idx ;
      lblTextblock11_Internalname = "TEXTBLOCK11_"+sGXsfl_60_idx ;
      edtFasForMul_Internalname = "FASFORMUL_"+sGXsfl_60_idx ;
      lblTextblock12_Internalname = "TEXTBLOCK12_"+sGXsfl_60_idx ;
      edtArtProULin_Internalname = "ARTPROULIN_"+sGXsfl_60_idx ;
      lblTextblock13_Internalname = "TEXTBLOCK13_"+sGXsfl_60_idx ;
      edtArtProFac_Internalname = "ARTPROFAC_"+sGXsfl_60_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_60_idx ;
   }

   public void subsflControlProps_fel_60476( )
   {
      lblTextblock9_Internalname = "TEXTBLOCK9_"+sGXsfl_60_fel_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_60_fel_idx ;
      lblTextblock10_Internalname = "TEXTBLOCK10_"+sGXsfl_60_fel_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_60_fel_idx ;
      lblTextblock11_Internalname = "TEXTBLOCK11_"+sGXsfl_60_fel_idx ;
      edtFasForMul_Internalname = "FASFORMUL_"+sGXsfl_60_fel_idx ;
      lblTextblock12_Internalname = "TEXTBLOCK12_"+sGXsfl_60_fel_idx ;
      edtArtProULin_Internalname = "ARTPROULIN_"+sGXsfl_60_fel_idx ;
      lblTextblock13_Internalname = "TEXTBLOCK13_"+sGXsfl_60_fel_idx ;
      edtArtProFac_Internalname = "ARTPROFAC_"+sGXsfl_60_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_60_fel_idx ;
   }

   public void addRowTC476( )
   {
      nRC_GXsfl_92 = 0 ;
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60476( ) ;
      sendRowTC476( ) ;
   }

   public void sendRowTC476( )
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
      /* Start of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_60_idx+"\">") ;
      }
      if ( GRID1_IsPaging == 0 )
      {
         GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_60_idx ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable3_Internalname+"_"+sGXsfl_60_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock9_Internalname,httpContext.getMessage( "Codigo Fase", ""),"","",lblTextblock9_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_476_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtFasCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock10_Internalname,httpContext.getMessage( "Descripcion de Fase", ""),"","",lblTextblock10_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtFasDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(28),"chr",Integer.valueOf(1),"row",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock11_Internalname,httpContext.getMessage( "Formula", ""),"","",lblTextblock11_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasForMul_Internalname,GXutil.rtrim( A4286FasForMul),GXutil.rtrim( localUtil.format( A4286FasForMul, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasForMul_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtFasForMul_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock12_Internalname,httpContext.getMessage( "Ultima Línea", ""),"","",lblTextblock12_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtProULin_Internalname,GXutil.ltrim( localUtil.ntoc( A4894ArtProULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtArtProULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4894ArtProULin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4894ArtProULin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtProULin_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtArtProULin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock13_Internalname,httpContext.getMessage( "Factor", ""),"","",lblTextblock13_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_476_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtProFac_Internalname,GXutil.ltrim( localUtil.ntoc( A4896ArtProFac, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtArtProFac_Enabled!=0) ? localUtil.format( A4896ArtProFac, "ZZZZ9.99") : localUtil.format( A4896ArtProFac, "ZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtProFac_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(edtArtProFac_Visible),Integer.valueOf(edtArtProFac_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /*  Child Grid Control  */
      Grid1Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Grid2Container"});
      if ( isAjaxCallMode( ) )
      {
         Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Grid2Container.Clear();
      }
      startgridcontrol92( ) ;
      nGXsfl_92_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount723 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_723 = (short)(1) ;
            scanStartTC723( ) ;
            while ( RcdFound723 != 0 )
            {
               init_level_properties723( ) ;
               getByPrimaryKeyTC723( ) ;
               addRowTC723( ) ;
               scanNextTC723( ) ;
            }
            scanEndTC723( ) ;
            nBlankRcdCount723 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B4894ArtProULin = A4894ArtProULin ;
         n4894ArtProULin = false ;
         standaloneNotModalTC723( ) ;
         standaloneModalTC723( ) ;
         sMode723 = Gx_mode ;
         while ( nGXsfl_92_idx < nRC_GXsfl_92 )
         {
            bGXsfl_92_Refreshing = true ;
            readRowTC723( ) ;
            edtavnRcdDeleted_723_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_723_"+sGXsfl_92_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_723_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_723_Enabled), 5, 0), !bGXsfl_92_Refreshing);
            edtArtProLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTPROLIN_"+sGXsfl_92_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtArtProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProLin_Enabled), 5, 0), !bGXsfl_92_Refreshing);
            edtArtProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTPROCOD_"+sGXsfl_92_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtArtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProCod_Enabled), 5, 0), !bGXsfl_92_Refreshing);
            edtArtProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTPRODSC_"+sGXsfl_92_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtArtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProDsc_Enabled), 5, 0), !bGXsfl_92_Refreshing);
            if ( ( nRcdExists_723 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalTC723( ) ;
            }
            sendRowTC723( ) ;
            bGXsfl_92_Refreshing = false ;
         }
         Gx_mode = sMode723 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A4894ArtProULin = B4894ArtProULin ;
         n4894ArtProULin = false ;
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount723 = (short)(5) ;
         nRcdExists_723 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartTC723( ) ;
            while ( RcdFound723 != 0 )
            {
               sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx+1), 4, 0), (short)(4), "0") + sGXsfl_60_idx ;
               subsflControlProps_92723( ) ;
               init_level_properties723( ) ;
               standaloneNotModalTC723( ) ;
               getByPrimaryKeyTC723( ) ;
               standaloneModalTC723( ) ;
               addRowTC723( ) ;
               scanNextTC723( ) ;
            }
            scanEndTC723( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode723 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx+1), 4, 0), (short)(4), "0") + sGXsfl_60_idx ;
      subsflControlProps_92723( ) ;
      initAllTC723( ) ;
      init_level_properties723( ) ;
      B4894ArtProULin = A4894ArtProULin ;
      n4894ArtProULin = false ;
      nRcdExists_723 = (short)(0) ;
      nIsMod_723 = (short)(0) ;
      nRcdDeleted_723 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 60 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_60_idx, ".")) == 0 ) )
      {
         nBlankRcdCount723 = (short)(nBlankRcdUsr723+nBlankRcdCount723) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount723 > 0 )
      {
         standaloneNotModalTC723( ) ;
         standaloneModalTC723( ) ;
         addRowTC723( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtArtProLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount723 = (short)(nBlankRcdCount723-1) ;
      }
      Gx_mode = sMode723 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A4894ArtProULin = B4894ArtProULin ;
      n4894ArtProULin = false ;
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_60_idx, Grid2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid1Row.AddGrid("Grid2", Grid2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_60_idx, Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_60_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      /* End of table */
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesTC476( ) ;
      GXCCtl = "Z457FasCod_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z457FasCod));
      GXCCtl = "Z4894ArtProULin_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4894ArtProULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4896ArtProFac_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4896ArtProFac, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O4894ArtProULin_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O4894ArtProULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_92_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_92_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_476_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_476_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_476_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vGXBSCREEN_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASFORMUL_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForMul_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTPROULIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProULin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTPROFAC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProFac_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTPROFAC_"+sGXsfl_60_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtArtProFac_Visible, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_60_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowTC476( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60476( ) ;
      edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasForMul_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASFORMUL_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtArtProULin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTPROULIN_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtArtProFac_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTPROFAC_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtArtProFac_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "ARTPROFAC_"+sGXsfl_60_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
      A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
      A4286FasForMul = GXutil.upper( httpContext.cgiGet( edtFasForMul_Internalname)) ;
      n4286FasForMul = false ;
      A4894ArtProULin = (short)(localUtil.ctol( httpContext.cgiGet( edtArtProULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n4894ArtProULin = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtArtProFac_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtArtProFac_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
      {
         GXCCtl = "ARTPROFAC_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtArtProFac_Internalname ;
         wbErr = true ;
         A4896ArtProFac = DecimalUtil.ZERO ;
         n4896ArtProFac = false ;
      }
      else
      {
         A4896ArtProFac = localUtil.ctond( httpContext.cgiGet( edtArtProFac_Internalname)) ;
         n4896ArtProFac = false ;
      }
      GXCCtl = "Z457FasCod_" + sGXsfl_60_idx ;
      Z457FasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4894ArtProULin_" + sGXsfl_60_idx ;
      Z4894ArtProULin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4896ArtProFac_" + sGXsfl_60_idx ;
      Z4896ArtProFac = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O4894ArtProULin_" + sGXsfl_60_idx ;
      O4894ArtProULin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_92_" + sGXsfl_60_idx ;
      nRC_GXsfl_92 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_476_" + sGXsfl_60_idx ;
      nRcdDeleted_476 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_476_" + sGXsfl_60_idx ;
      nRcdExists_476 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_476_" + sGXsfl_60_idx ;
      nIsMod_476 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "vGXBSCREEN_" + sGXsfl_60_idx ;
      Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_92_" + sGXsfl_60_idx ;
      nRC_GXsfl_92 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_92723( )
   {
      edtavnRcdDeleted_723_Internalname = "vNRCDDELETED_723_"+sGXsfl_92_idx ;
      edtArtProLin_Internalname = "ARTPROLIN_"+sGXsfl_92_idx ;
      edtArtProCod_Internalname = "ARTPROCOD_"+sGXsfl_92_idx ;
      edtArtProDsc_Internalname = "ARTPRODSC_"+sGXsfl_92_idx ;
   }

   public void subsflControlProps_fel_92723( )
   {
      edtavnRcdDeleted_723_Internalname = "vNRCDDELETED_723_"+sGXsfl_92_fel_idx ;
      edtArtProLin_Internalname = "ARTPROLIN_"+sGXsfl_92_fel_idx ;
      edtArtProCod_Internalname = "ARTPROCOD_"+sGXsfl_92_fel_idx ;
      edtArtProDsc_Internalname = "ARTPRODSC_"+sGXsfl_92_fel_idx ;
   }

   public void addRowTC723( )
   {
      nGXsfl_92_idx = (int)(nGXsfl_92_idx+1) ;
      sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx), 4, 0), (short)(4), "0") + sGXsfl_60_idx ;
      subsflControlProps_92723( ) ;
      sendRowTC723( ) ;
   }

   public void sendRowTC723( )
   {
      Grid2Row = GXWebRow.GetNew(context) ;
      if ( subGrid2_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         subGrid2_Backcolor = subGrid2_Allbackcolor ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Uniform" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
         subGrid2_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid2_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_92_idx) % (2))) == 0 )
         {
            subGrid2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Even" ;
            }
         }
         else
         {
            subGrid2_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_723_" + sGXsfl_92_idx + "',1);gx.fn.setControlValue('nIsMod_476_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_92_idx + "',92)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_723_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_723, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_723_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_723), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_723), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,93);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_723_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_723_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(92),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_723_" + sGXsfl_92_idx + "',1);gx.fn.setControlValue('nIsMod_476_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_92_idx + "',92)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtProLin_Internalname,GXutil.ltrim( localUtil.ntoc( A4897ArtProLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4897ArtProLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,94);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtProLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtArtProLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(92),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_723_" + sGXsfl_92_idx + "',1);gx.fn.setControlValue('nIsMod_476_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_92_idx + "',92)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtProCod_Internalname,GXutil.rtrim( A4898ArtProCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,95);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtArtProCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(92),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtProDsc_Internalname,GXutil.rtrim( A4899ArtProDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtProDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtArtProDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(92),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashesTC723( ) ;
      GXCCtl = "Z4897ArtProLin_" + sGXsfl_92_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4897ArtProLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4898ArtProCod_" + sGXsfl_92_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4898ArtProCod));
      GXCCtl = "nRcdDeleted_723_" + sGXsfl_92_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_723, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_723_" + sGXsfl_92_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_723, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_723_" + sGXsfl_92_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_723, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_723_"+sGXsfl_92_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_723_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTPROLIN_"+sGXsfl_92_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTPROCOD_"+sGXsfl_92_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTPRODSC_"+sGXsfl_92_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRowTC723( )
   {
      nGXsfl_92_idx = (int)(nGXsfl_92_idx+1) ;
      sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx), 4, 0), (short)(4), "0") + sGXsfl_60_idx ;
      subsflControlProps_92723( ) ;
      edtavnRcdDeleted_723_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_723_"+sGXsfl_92_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtArtProLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTPROLIN_"+sGXsfl_92_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtArtProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTPROCOD_"+sGXsfl_92_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtArtProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTPRODSC_"+sGXsfl_92_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_723_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_723_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_723");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_723_Internalname ;
         wbErr = true ;
         nRcdDeleted_723 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_723 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_723_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ARTPROLIN_" + sGXsfl_92_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtArtProLin_Internalname ;
         wbErr = true ;
         A4897ArtProLin = (short)(0) ;
      }
      else
      {
         A4897ArtProLin = (short)(localUtil.ctol( httpContext.cgiGet( edtArtProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A4898ArtProCod = httpContext.cgiGet( edtArtProCod_Internalname) ;
      A4899ArtProDsc = httpContext.cgiGet( edtArtProDsc_Internalname) ;
      n4899ArtProDsc = false ;
      GXCCtl = "Z4897ArtProLin_" + sGXsfl_92_idx ;
      Z4897ArtProLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4898ArtProCod_" + sGXsfl_92_idx ;
      Z4898ArtProCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_723_" + sGXsfl_92_idx ;
      nRcdDeleted_723 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_723_" + sGXsfl_92_idx ;
      nRcdExists_723 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_723_" + sGXsfl_92_idx ;
      nIsMod_723 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtArtProLin_Enabled = edtArtProLin_Enabled ;
      defedtArtProULin_Enabled = edtArtProULin_Enabled ;
      defedtFasCod_Enabled = edtFasCod_Enabled ;
   }

   public void confirmValuesTC0( )
   {
      nGXsfl_60_idx = 0 ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60476( ) ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_60476( ) ;
         httpContext.changePostValue( "Z457FasCod_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z457FasCod_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z4894ArtProULin_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z4894ArtProULin_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4894ArtProULin_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z4896ArtProFac_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z4896ArtProFac_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4896ArtProFac_"+sGXsfl_60_idx) ;
      }
      nGXsfl_92_idx = 0 ;
      sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx), 4, 0), (short)(4), "0") + sGXsfl_60_idx ;
      subsflControlProps_92723( ) ;
      while ( nGXsfl_92_idx < nRC_GXsfl_92 )
      {
         nGXsfl_92_idx = (int)(nGXsfl_92_idx+1) ;
         sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx), 4, 0), (short)(4), "0") + sGXsfl_60_idx ;
         subsflControlProps_92723( ) ;
         httpContext.changePostValue( "Z4897ArtProLin_"+sGXsfl_92_idx, httpContext.cgiGet( "ZT_"+"Z4897ArtProLin_"+sGXsfl_92_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4897ArtProLin_"+sGXsfl_92_idx) ;
         httpContext.changePostValue( "Z4898ArtProCod_"+sGXsfl_92_idx, httpContext.cgiGet( "ZT_"+"Z4898ArtProCod_"+sGXsfl_92_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4898ArtProCod_"+sGXsfl_92_idx) ;
      }
      httpContext.changePostValue( "O4894ArtProULin", httpContext.cgiGet( "T4894ArtProULin")) ;
      httpContext.deletePostValue( "T4894ArtProULin") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tforaca", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.rtrim(A758ProCod))}, new String[] {"EmprCod","CliCod","ArtCod","ProCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_60", GXutil.ltrim( localUtil.ntoc( nGXsfl_60_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV23Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ERR", GXutil.rtrim( AV20Msg_err));
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
      return formatLink("app.tforaca", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.rtrim(A758ProCod))}, new String[] {"EmprCod","CliCod","ArtCod","ProCod"})  ;
   }

   public String getPgmname( )
   {
      return "TFORACA" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "FORMULAS DE ACABADO", "") ;
   }

   public void initializeNonKeyTC11( )
   {
   }

   public void initAllTC11( )
   {
      initializeNonKeyTC11( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyTC476( )
   {
      AV20Msg_err = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Msg_err", AV20Msg_err);
      A460FasDsc = "" ;
      A4286FasForMul = "" ;
      n4286FasForMul = false ;
      A4894ArtProULin = (short)(0) ;
      n4894ArtProULin = false ;
      A4896ArtProFac = DecimalUtil.ZERO ;
      n4896ArtProFac = false ;
      O4894ArtProULin = A4894ArtProULin ;
      n4894ArtProULin = false ;
      Z4894ArtProULin = (short)(0) ;
      Z4896ArtProFac = DecimalUtil.ZERO ;
   }

   public void initAllTC476( )
   {
      A457FasCod = "" ;
      initializeNonKeyTC476( ) ;
   }

   public void standaloneModalInsertTC476( )
   {
   }

   public void initializeNonKeyTC723( )
   {
      A4899ArtProDsc = "" ;
      n4899ArtProDsc = false ;
      A4898ArtProCod = "" ;
      Z4898ArtProCod = "" ;
   }

   public void initAllTC723( )
   {
      A4897ArtProLin = (short)(0) ;
      initializeNonKeyTC723( ) ;
   }

   public void standaloneModalInsertTC723( )
   {
      A4894ArtProULin = i4894ArtProULin ;
      n4894ArtProULin = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824153287", true, true);
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
      httpContext.AddJavascriptSource("tforaca.js", "?2026824153288", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties476( )
   {
      edtArtProULin_Enabled = defedtArtProULin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtProULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProULin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtFasCod_Enabled = defedtFasCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void init_level_properties723( )
   {
      edtArtProLin_Enabled = defedtArtProLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProLin_Enabled), 5, 0), !bGXsfl_92_Refreshing);
   }

   public void startgridcontrol60( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Class", "FreeStyleGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock9_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock10_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock11_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4286FasForMul));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForMul_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock12_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4894ArtProULin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProULin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock13_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4896ArtProFac, (byte)(8), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProFac_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtArtProFac_Visible, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol92( )
   {
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("Header", subGrid2_Header);
      Grid2Container.AddObjectProperty("Class", "");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_723, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_723_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4897ArtProLin, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A4898ArtProCod));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A4899ArtProDsc));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtArtCod_Internalname = "ARTCOD" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtProCod_Internalname = "PROCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtProDsc_Internalname = "PRODSC" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtFasCod_Internalname = "FASCOD" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtFasDsc_Internalname = "FASDSC" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtFasForMul_Internalname = "FASFORMUL" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtArtProULin_Internalname = "ARTPROULIN" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtArtProFac_Internalname = "ARTPROFAC" ;
      edtavnRcdDeleted_723_Internalname = "vNRCDDELETED_723" ;
      edtArtProLin_Internalname = "ARTPROLIN" ;
      edtArtProCod_Internalname = "ARTPROCOD" ;
      edtArtProDsc_Internalname = "ARTPRODSC" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
      subGrid2_Internalname = "GRID2" ;
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
      subGrid2_Allowcollapsing = (byte)(0) ;
      subGrid2_Allowselection = (byte)(0) ;
      subGrid2_Header = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      lblTextblock13_Caption = httpContext.getMessage( "Factor", "") ;
      lblTextblock12_Caption = httpContext.getMessage( "Ultima Línea", "") ;
      lblTextblock11_Caption = httpContext.getMessage( "Formula", "") ;
      lblTextblock10_Caption = httpContext.getMessage( "Descripcion de Fase", "") ;
      lblTextblock9_Caption = httpContext.getMessage( "Codigo Fase", "") ;
      subGrid1_Borderwidth = (short)(1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "FORMULAS DE ACABADO", "") );
      edtArtProDsc_Jsonclick = "" ;
      edtArtProCod_Jsonclick = "" ;
      edtArtProLin_Jsonclick = "" ;
      edtavnRcdDeleted_723_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtArtProFac_Jsonclick = "" ;
      edtArtProULin_Jsonclick = "" ;
      edtFasForMul_Jsonclick = "" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtArtProDsc_Enabled = 0 ;
      edtArtProCod_Enabled = 1 ;
      edtArtProLin_Enabled = 1 ;
      edtavnRcdDeleted_723_Enabled = 1 ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtArtProFac_Enabled = 1 ;
      edtArtProULin_Enabled = 0 ;
      edtFasForMul_Enabled = 0 ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Enabled = 1 ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Backcolor = (int)(0xFFFFFF) ;
      edtProDsc_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Backcolor = (int)(0xFFFFFF) ;
      edtProCod_Enabled = 0 ;
      edtArtDsc_Jsonclick = "" ;
      edtArtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtArtDsc_Enabled = 0 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtArtCod_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
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
      edtArtProFac_Visible = 1 ;
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

   public void xc_3_TC476( String A396EmprCod ,
                           String A758ProCod ,
                           String A457FasCod ,
                           String AV20Msg_err )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_char4[0] = A758ProCod ;
         GXv_char3[0] = A457FasCod ;
         GXv_char2[0] = AV20Msg_err ;
         new app.pbusdis(remoteHandle, context).execute( GXv_char7, GXv_char4, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char7[0] ;
         A758ProCod = GXv_char4[0] ;
         A457FasCod = GXv_char3[0] ;
         AV20Msg_err = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV20Msg_err", AV20Msg_err);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A758ProCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A457FasCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV20Msg_err))+"\"") ;
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
      subsflControlProps_60476( ) ;
      while ( nGXsfl_60_idx <= nRC_GXsfl_60 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalTC476( ) ;
         standaloneModalTC476( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowTC476( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_60476( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_92723( ) ;
      while ( nGXsfl_92_idx <= nRC_GXsfl_92 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalTC476( ) ;
         standaloneModalTC476( ) ;
         standaloneNotModalTC723( ) ;
         standaloneModalTC723( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowTC723( ) ;
         nGXsfl_92_idx = (int)(nGXsfl_92_idx+1) ;
         sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx), 4, 0), (short)(4), "0") + sGXsfl_60_idx ;
         subsflControlProps_92723( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid2Container)) ;
      /* End function gxnrGrid2_newrow */
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
      /* Using cursor T00TC44 */
      pr_default.execute(42, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(42) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00TC44_A407EmprNom[0] ;
      n407EmprNom = T00TC44_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(42);
      /* Using cursor T00TC45 */
      pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(43) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T00TC45_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(43);
      /* Using cursor T00TC46 */
      pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(44) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
      A69ArtDsc = T00TC46_A69ArtDsc[0] ;
      n69ArtDsc = T00TC46_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(44);
      /* Using cursor T00TC47 */
      pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(45) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T00TC47_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(45);
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

   public void valid_Procod( )
   {
      n252CliCod = false ;
      n65ArtCod = false ;
      n758ProCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z759ProDsc", GXutil.rtrim( Z759ProDsc));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Fascod( )
   {
      n4286FasForMul = false ;
      /* Using cursor T00TC32 */
      pr_default.execute(30, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      A460FasDsc = T00TC32_A460FasDsc[0] ;
      A4286FasForMul = T00TC32_A4286FasForMul[0] ;
      n4286FasForMul = T00TC32_n4286FasForMul[0] ;
      pr_default.close(30);
      if ( GXutil.strcmp(A4286FasForMul, httpContext.getMessage( "N", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Fase con Formula=N", ""), 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4286FasForMul", GXutil.rtrim( A4286FasForMul));
   }

   public void valid_Artprocod( )
   {
      n4899ArtProDsc = false ;
      /* Using cursor T00TC42 */
      pr_default.execute(40, new Object[] {A396EmprCod, A4898ArtProCod});
      if ( (pr_default.getStatus(40) != 101) )
      {
         A4899ArtProDsc = T00TC42_A4899ArtProDsc[0] ;
         n4899ArtProDsc = T00TC42_n4899ArtProDsc[0] ;
      }
      else
      {
         A4899ArtProDsc = "N/E" ;
         n4899ArtProDsc = false ;
      }
      pr_default.close(40);
      if ( GXutil.strcmp(A4899ArtProDsc, httpContext.getMessage( "N/E", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No Existe el Proceso Formula", ""), 1, "ARTPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtArtProCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4899ArtProDsc", GXutil.rtrim( A4899ArtProDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[]");
      setEventMetadata("VALID_ARTCOD",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'edtArtProFac_Visible',ctrl:'ARTPROFAC',prop:'Visible'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z758ProCod'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z69ArtDsc'},{av:'Z759ProDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A4286FasForMul',fld:'FASFORMUL',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A4286FasForMul',fld:'FASFORMUL',pic:'@!'}]}");
      setEventMetadata("VALID_FASFORMUL","{handler:'valid_Fasformul',iparms:[]");
      setEventMetadata("VALID_FASFORMUL",",oparms:[]}");
      setEventMetadata("VALID_ARTPROULIN","{handler:'valid_Artproulin',iparms:[]");
      setEventMetadata("VALID_ARTPROULIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Artprofac',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_ARTPROLIN","{handler:'valid_Artprolin',iparms:[]");
      setEventMetadata("VALID_ARTPROLIN",",oparms:[]}");
      setEventMetadata("VALID_ARTPROCOD","{handler:'valid_Artprocod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4898ArtProCod',fld:'ARTPROCOD',pic:''},{av:'A4899ArtProDsc',fld:'ARTPRODSC',pic:''}]");
      setEventMetadata("VALID_ARTPROCOD",",oparms:[{av:'A4899ArtProDsc',fld:'ARTPRODSC',pic:''}]}");
      setEventMetadata("VALID_ARTPRODSC","{handler:'valid_Artprodsc',iparms:[]");
      setEventMetadata("VALID_ARTPRODSC",",oparms:[]}");
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
      pr_default.close(40);
      pr_default.close(30);
      pr_default.close(44);
      pr_default.close(43);
      pr_default.close(42);
      pr_default.close(45);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA65ArtCod = "" ;
      wcpOA758ProCod = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z758ProCod = "" ;
      Z457FasCod = "" ;
      Z4896ArtProFac = DecimalUtil.ZERO ;
      Z4898ArtProCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      AV20Msg_err = "" ;
      A4898ArtProCod = "" ;
      A65ArtCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
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
      lblTextblock4_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A69ArtDsc = "" ;
      lblTextblock7_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A759ProDsc = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode476 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV23Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode11 = "" ;
      GXCCtl = "" ;
      A4899ArtProDsc = "" ;
      A460FasDsc = "" ;
      A4286FasForMul = "" ;
      A4896ArtProFac = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV9LitFe = "" ;
      AV12Station = "" ;
      AV13Lit1 = "" ;
      AV18Lit2 = "" ;
      AV14Lit3 = "" ;
      AV15Lit4 = "" ;
      AV16Lit5 = "" ;
      AV17Lit41 = "" ;
      GXt_char1 = "" ;
      AV10EmprCod = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z69ArtDsc = "" ;
      Z759ProDsc = "" ;
      T00TC10_A407EmprNom = new String[] {""} ;
      T00TC10_n407EmprNom = new boolean[] {false} ;
      T00TC11_A279CliNom = new String[] {""} ;
      T00TC12_A69ArtDsc = new String[] {""} ;
      T00TC12_n69ArtDsc = new boolean[] {false} ;
      T00TC13_A759ProDsc = new String[] {""} ;
      T00TC14_A407EmprNom = new String[] {""} ;
      T00TC14_n407EmprNom = new boolean[] {false} ;
      T00TC14_A279CliNom = new String[] {""} ;
      T00TC14_A69ArtDsc = new String[] {""} ;
      T00TC14_n69ArtDsc = new boolean[] {false} ;
      T00TC14_A759ProDsc = new String[] {""} ;
      T00TC14_A396EmprCod = new String[] {""} ;
      T00TC14_A252CliCod = new int[1] ;
      T00TC14_n252CliCod = new boolean[] {false} ;
      T00TC14_A65ArtCod = new String[] {""} ;
      T00TC14_n65ArtCod = new boolean[] {false} ;
      T00TC14_A758ProCod = new String[] {""} ;
      T00TC14_n758ProCod = new boolean[] {false} ;
      T00TC15_A396EmprCod = new String[] {""} ;
      T00TC15_A252CliCod = new int[1] ;
      T00TC15_n252CliCod = new boolean[] {false} ;
      T00TC15_A65ArtCod = new String[] {""} ;
      T00TC15_n65ArtCod = new boolean[] {false} ;
      T00TC15_A758ProCod = new String[] {""} ;
      T00TC15_n758ProCod = new boolean[] {false} ;
      T00TC9_A396EmprCod = new String[] {""} ;
      T00TC9_A252CliCod = new int[1] ;
      T00TC9_n252CliCod = new boolean[] {false} ;
      T00TC9_A65ArtCod = new String[] {""} ;
      T00TC9_n65ArtCod = new boolean[] {false} ;
      T00TC9_A758ProCod = new String[] {""} ;
      T00TC9_n758ProCod = new boolean[] {false} ;
      T00TC16_A396EmprCod = new String[] {""} ;
      T00TC16_A252CliCod = new int[1] ;
      T00TC16_n252CliCod = new boolean[] {false} ;
      T00TC16_A65ArtCod = new String[] {""} ;
      T00TC16_n65ArtCod = new boolean[] {false} ;
      T00TC16_A758ProCod = new String[] {""} ;
      T00TC16_n758ProCod = new boolean[] {false} ;
      T00TC17_A396EmprCod = new String[] {""} ;
      T00TC17_A252CliCod = new int[1] ;
      T00TC17_n252CliCod = new boolean[] {false} ;
      T00TC17_A65ArtCod = new String[] {""} ;
      T00TC17_n65ArtCod = new boolean[] {false} ;
      T00TC17_A758ProCod = new String[] {""} ;
      T00TC17_n758ProCod = new boolean[] {false} ;
      T00TC8_A396EmprCod = new String[] {""} ;
      T00TC8_A252CliCod = new int[1] ;
      T00TC8_n252CliCod = new boolean[] {false} ;
      T00TC8_A65ArtCod = new String[] {""} ;
      T00TC8_n65ArtCod = new boolean[] {false} ;
      T00TC8_A758ProCod = new String[] {""} ;
      T00TC8_n758ProCod = new boolean[] {false} ;
      T00TC20_A396EmprCod = new String[] {""} ;
      T00TC20_A11604PArtId = new int[1] ;
      T00TC21_A396EmprCod = new String[] {""} ;
      T00TC21_A252CliCod = new int[1] ;
      T00TC21_n252CliCod = new boolean[] {false} ;
      T00TC21_A65ArtCod = new String[] {""} ;
      T00TC21_n65ArtCod = new boolean[] {false} ;
      T00TC21_A758ProCod = new String[] {""} ;
      T00TC21_n758ProCod = new boolean[] {false} ;
      T00TC21_A9836FasCodM = new String[] {""} ;
      T00TC22_A396EmprCod = new String[] {""} ;
      T00TC22_A252CliCod = new int[1] ;
      T00TC22_n252CliCod = new boolean[] {false} ;
      T00TC22_A65ArtCod = new String[] {""} ;
      T00TC22_n65ArtCod = new boolean[] {false} ;
      T00TC22_A758ProCod = new String[] {""} ;
      T00TC22_n758ProCod = new boolean[] {false} ;
      T00TC22_A6986NumLinPro = new short[1] ;
      T00TC23_A396EmprCod = new String[] {""} ;
      T00TC23_A252CliCod = new int[1] ;
      T00TC23_n252CliCod = new boolean[] {false} ;
      T00TC23_A65ArtCod = new String[] {""} ;
      T00TC23_n65ArtCod = new boolean[] {false} ;
      T00TC23_A4658MdlCod = new String[] {""} ;
      T00TC23_A758ProCod = new String[] {""} ;
      T00TC23_n758ProCod = new boolean[] {false} ;
      T00TC24_A396EmprCod = new String[] {""} ;
      T00TC24_A252CliCod = new int[1] ;
      T00TC24_n252CliCod = new boolean[] {false} ;
      T00TC24_A65ArtCod = new String[] {""} ;
      T00TC24_n65ArtCod = new boolean[] {false} ;
      T00TC24_A758ProCod = new String[] {""} ;
      T00TC24_n758ProCod = new boolean[] {false} ;
      T00TC24_A457FasCod = new String[] {""} ;
      T00TC25_A396EmprCod = new String[] {""} ;
      T00TC25_A252CliCod = new int[1] ;
      T00TC25_n252CliCod = new boolean[] {false} ;
      T00TC25_A65ArtCod = new String[] {""} ;
      T00TC25_n65ArtCod = new boolean[] {false} ;
      T00TC25_A758ProCod = new String[] {""} ;
      T00TC25_n758ProCod = new boolean[] {false} ;
      Z460FasDsc = "" ;
      Z4286FasForMul = "" ;
      T00TC26_A252CliCod = new int[1] ;
      T00TC26_n252CliCod = new boolean[] {false} ;
      T00TC26_A65ArtCod = new String[] {""} ;
      T00TC26_n65ArtCod = new boolean[] {false} ;
      T00TC26_A758ProCod = new String[] {""} ;
      T00TC26_n758ProCod = new boolean[] {false} ;
      T00TC26_A460FasDsc = new String[] {""} ;
      T00TC26_A4286FasForMul = new String[] {""} ;
      T00TC26_n4286FasForMul = new boolean[] {false} ;
      T00TC26_A4894ArtProULin = new short[1] ;
      T00TC26_n4894ArtProULin = new boolean[] {false} ;
      T00TC26_A4896ArtProFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TC26_n4896ArtProFac = new boolean[] {false} ;
      T00TC26_A396EmprCod = new String[] {""} ;
      T00TC26_A457FasCod = new String[] {""} ;
      T00TC7_A460FasDsc = new String[] {""} ;
      T00TC7_A4286FasForMul = new String[] {""} ;
      T00TC7_n4286FasForMul = new boolean[] {false} ;
      T00TC27_A460FasDsc = new String[] {""} ;
      T00TC27_A4286FasForMul = new String[] {""} ;
      T00TC27_n4286FasForMul = new boolean[] {false} ;
      T00TC28_A396EmprCod = new String[] {""} ;
      T00TC28_A252CliCod = new int[1] ;
      T00TC28_n252CliCod = new boolean[] {false} ;
      T00TC28_A65ArtCod = new String[] {""} ;
      T00TC28_n65ArtCod = new boolean[] {false} ;
      T00TC28_A758ProCod = new String[] {""} ;
      T00TC28_n758ProCod = new boolean[] {false} ;
      T00TC28_A457FasCod = new String[] {""} ;
      T00TC6_A252CliCod = new int[1] ;
      T00TC6_n252CliCod = new boolean[] {false} ;
      T00TC6_A65ArtCod = new String[] {""} ;
      T00TC6_n65ArtCod = new boolean[] {false} ;
      T00TC6_A758ProCod = new String[] {""} ;
      T00TC6_n758ProCod = new boolean[] {false} ;
      T00TC6_A4894ArtProULin = new short[1] ;
      T00TC6_n4894ArtProULin = new boolean[] {false} ;
      T00TC6_A4896ArtProFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TC6_n4896ArtProFac = new boolean[] {false} ;
      T00TC6_A396EmprCod = new String[] {""} ;
      T00TC6_A457FasCod = new String[] {""} ;
      T00TC5_A252CliCod = new int[1] ;
      T00TC5_n252CliCod = new boolean[] {false} ;
      T00TC5_A65ArtCod = new String[] {""} ;
      T00TC5_n65ArtCod = new boolean[] {false} ;
      T00TC5_A758ProCod = new String[] {""} ;
      T00TC5_n758ProCod = new boolean[] {false} ;
      T00TC5_A4894ArtProULin = new short[1] ;
      T00TC5_n4894ArtProULin = new boolean[] {false} ;
      T00TC5_A4896ArtProFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TC5_n4896ArtProFac = new boolean[] {false} ;
      T00TC5_A396EmprCod = new String[] {""} ;
      T00TC5_A457FasCod = new String[] {""} ;
      T00TC32_A460FasDsc = new String[] {""} ;
      T00TC32_A4286FasForMul = new String[] {""} ;
      T00TC32_n4286FasForMul = new boolean[] {false} ;
      T00TC33_A396EmprCod = new String[] {""} ;
      T00TC33_A252CliCod = new int[1] ;
      T00TC33_n252CliCod = new boolean[] {false} ;
      T00TC33_A65ArtCod = new String[] {""} ;
      T00TC33_n65ArtCod = new boolean[] {false} ;
      T00TC33_A758ProCod = new String[] {""} ;
      T00TC33_n758ProCod = new boolean[] {false} ;
      T00TC33_A457FasCod = new String[] {""} ;
      T00TC33_A1664ParFasCod = new short[1] ;
      T00TC35_A396EmprCod = new String[] {""} ;
      T00TC35_A252CliCod = new int[1] ;
      T00TC35_n252CliCod = new boolean[] {false} ;
      T00TC35_A65ArtCod = new String[] {""} ;
      T00TC35_n65ArtCod = new boolean[] {false} ;
      T00TC35_A758ProCod = new String[] {""} ;
      T00TC35_n758ProCod = new boolean[] {false} ;
      T00TC35_A457FasCod = new String[] {""} ;
      Z4899ArtProDsc = "" ;
      T00TC36_A764ProForCod = new String[] {""} ;
      T00TC36_A252CliCod = new int[1] ;
      T00TC36_n252CliCod = new boolean[] {false} ;
      T00TC36_A65ArtCod = new String[] {""} ;
      T00TC36_n65ArtCod = new boolean[] {false} ;
      T00TC36_A758ProCod = new String[] {""} ;
      T00TC36_n758ProCod = new boolean[] {false} ;
      T00TC36_A4897ArtProLin = new short[1] ;
      T00TC36_A4898ArtProCod = new String[] {""} ;
      T00TC36_A396EmprCod = new String[] {""} ;
      T00TC36_A457FasCod = new String[] {""} ;
      T00TC36_A4899ArtProDsc = new String[] {""} ;
      T00TC36_n4899ArtProDsc = new boolean[] {false} ;
      T00TC4_A4899ArtProDsc = new String[] {""} ;
      T00TC4_n4899ArtProDsc = new boolean[] {false} ;
      T00TC37_A4899ArtProDsc = new String[] {""} ;
      T00TC37_n4899ArtProDsc = new boolean[] {false} ;
      T00TC38_A396EmprCod = new String[] {""} ;
      T00TC38_A252CliCod = new int[1] ;
      T00TC38_n252CliCod = new boolean[] {false} ;
      T00TC38_A65ArtCod = new String[] {""} ;
      T00TC38_n65ArtCod = new boolean[] {false} ;
      T00TC38_A758ProCod = new String[] {""} ;
      T00TC38_n758ProCod = new boolean[] {false} ;
      T00TC38_A457FasCod = new String[] {""} ;
      T00TC38_A4897ArtProLin = new short[1] ;
      T00TC3_A252CliCod = new int[1] ;
      T00TC3_n252CliCod = new boolean[] {false} ;
      T00TC3_A65ArtCod = new String[] {""} ;
      T00TC3_n65ArtCod = new boolean[] {false} ;
      T00TC3_A758ProCod = new String[] {""} ;
      T00TC3_n758ProCod = new boolean[] {false} ;
      T00TC3_A4897ArtProLin = new short[1] ;
      T00TC3_A4898ArtProCod = new String[] {""} ;
      T00TC3_A396EmprCod = new String[] {""} ;
      T00TC3_A457FasCod = new String[] {""} ;
      sMode723 = "" ;
      T00TC2_A252CliCod = new int[1] ;
      T00TC2_n252CliCod = new boolean[] {false} ;
      T00TC2_A65ArtCod = new String[] {""} ;
      T00TC2_n65ArtCod = new boolean[] {false} ;
      T00TC2_A758ProCod = new String[] {""} ;
      T00TC2_n758ProCod = new boolean[] {false} ;
      T00TC2_A4897ArtProLin = new short[1] ;
      T00TC2_A4898ArtProCod = new String[] {""} ;
      T00TC2_A396EmprCod = new String[] {""} ;
      T00TC2_A457FasCod = new String[] {""} ;
      T00TC42_A4899ArtProDsc = new String[] {""} ;
      T00TC42_n4899ArtProDsc = new boolean[] {false} ;
      T00TC43_A396EmprCod = new String[] {""} ;
      T00TC43_A252CliCod = new int[1] ;
      T00TC43_n252CliCod = new boolean[] {false} ;
      T00TC43_A65ArtCod = new String[] {""} ;
      T00TC43_n65ArtCod = new boolean[] {false} ;
      T00TC43_A758ProCod = new String[] {""} ;
      T00TC43_n758ProCod = new boolean[] {false} ;
      T00TC43_A457FasCod = new String[] {""} ;
      T00TC43_A4897ArtProLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblTextblock9_Jsonclick = "" ;
      ROClassString = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      GXv_char7 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      T00TC44_A407EmprNom = new String[] {""} ;
      T00TC44_n407EmprNom = new boolean[] {false} ;
      T00TC45_A279CliNom = new String[] {""} ;
      T00TC46_A69ArtDsc = new String[] {""} ;
      T00TC46_n69ArtDsc = new boolean[] {false} ;
      T00TC47_A759ProDsc = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ758ProCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ69ArtDsc = "" ;
      ZZ759ProDsc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tforaca__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tforaca__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tforaca__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tforaca__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tforaca__default(),
         new Object[] {
             new Object[] {
            T00TC2_A252CliCod, T00TC2_A65ArtCod, T00TC2_A758ProCod, T00TC2_A4897ArtProLin, T00TC2_A4898ArtProCod, T00TC2_A396EmprCod, T00TC2_A457FasCod
            }
            , new Object[] {
            T00TC3_A252CliCod, T00TC3_A65ArtCod, T00TC3_A758ProCod, T00TC3_A4897ArtProLin, T00TC3_A4898ArtProCod, T00TC3_A396EmprCod, T00TC3_A457FasCod
            }
            , new Object[] {
            T00TC4_A4899ArtProDsc, T00TC4_n4899ArtProDsc
            }
            , new Object[] {
            T00TC5_A252CliCod, T00TC5_A65ArtCod, T00TC5_A758ProCod, T00TC5_A4894ArtProULin, T00TC5_n4894ArtProULin, T00TC5_A4896ArtProFac, T00TC5_n4896ArtProFac, T00TC5_A396EmprCod, T00TC5_A457FasCod
            }
            , new Object[] {
            T00TC6_A252CliCod, T00TC6_A65ArtCod, T00TC6_A758ProCod, T00TC6_A4894ArtProULin, T00TC6_n4894ArtProULin, T00TC6_A4896ArtProFac, T00TC6_n4896ArtProFac, T00TC6_A396EmprCod, T00TC6_A457FasCod
            }
            , new Object[] {
            T00TC7_A460FasDsc, T00TC7_A4286FasForMul, T00TC7_n4286FasForMul
            }
            , new Object[] {
            T00TC8_A396EmprCod, T00TC8_A252CliCod, T00TC8_A65ArtCod, T00TC8_A758ProCod
            }
            , new Object[] {
            T00TC9_A396EmprCod, T00TC9_A252CliCod, T00TC9_A65ArtCod, T00TC9_A758ProCod
            }
            , new Object[] {
            T00TC10_A407EmprNom, T00TC10_n407EmprNom
            }
            , new Object[] {
            T00TC11_A279CliNom
            }
            , new Object[] {
            T00TC12_A69ArtDsc, T00TC12_n69ArtDsc
            }
            , new Object[] {
            T00TC13_A759ProDsc
            }
            , new Object[] {
            T00TC14_A407EmprNom, T00TC14_n407EmprNom, T00TC14_A279CliNom, T00TC14_A69ArtDsc, T00TC14_n69ArtDsc, T00TC14_A759ProDsc, T00TC14_A396EmprCod, T00TC14_A252CliCod, T00TC14_A65ArtCod, T00TC14_A758ProCod
            }
            , new Object[] {
            T00TC15_A396EmprCod, T00TC15_A252CliCod, T00TC15_A65ArtCod, T00TC15_A758ProCod
            }
            , new Object[] {
            T00TC16_A396EmprCod, T00TC16_A252CliCod, T00TC16_A65ArtCod, T00TC16_A758ProCod
            }
            , new Object[] {
            T00TC17_A396EmprCod, T00TC17_A252CliCod, T00TC17_A65ArtCod, T00TC17_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00TC20_A396EmprCod, T00TC20_A11604PArtId
            }
            , new Object[] {
            T00TC21_A396EmprCod, T00TC21_A252CliCod, T00TC21_A65ArtCod, T00TC21_A758ProCod, T00TC21_A9836FasCodM
            }
            , new Object[] {
            T00TC22_A396EmprCod, T00TC22_A252CliCod, T00TC22_A65ArtCod, T00TC22_A758ProCod, T00TC22_A6986NumLinPro
            }
            , new Object[] {
            T00TC23_A396EmprCod, T00TC23_A252CliCod, T00TC23_A65ArtCod, T00TC23_A4658MdlCod, T00TC23_A758ProCod
            }
            , new Object[] {
            T00TC24_A396EmprCod, T00TC24_A252CliCod, T00TC24_A65ArtCod, T00TC24_A758ProCod, T00TC24_A457FasCod
            }
            , new Object[] {
            T00TC25_A396EmprCod, T00TC25_A252CliCod, T00TC25_A65ArtCod, T00TC25_A758ProCod
            }
            , new Object[] {
            T00TC26_A252CliCod, T00TC26_A65ArtCod, T00TC26_A758ProCod, T00TC26_A460FasDsc, T00TC26_A4286FasForMul, T00TC26_n4286FasForMul, T00TC26_A4894ArtProULin, T00TC26_n4894ArtProULin, T00TC26_A4896ArtProFac, T00TC26_n4896ArtProFac,
            T00TC26_A396EmprCod, T00TC26_A457FasCod
            }
            , new Object[] {
            T00TC27_A460FasDsc, T00TC27_A4286FasForMul, T00TC27_n4286FasForMul
            }
            , new Object[] {
            T00TC28_A396EmprCod, T00TC28_A252CliCod, T00TC28_A65ArtCod, T00TC28_A758ProCod, T00TC28_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00TC32_A460FasDsc, T00TC32_A4286FasForMul, T00TC32_n4286FasForMul
            }
            , new Object[] {
            T00TC33_A396EmprCod, T00TC33_A252CliCod, T00TC33_A65ArtCod, T00TC33_A758ProCod, T00TC33_A457FasCod, T00TC33_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            T00TC35_A396EmprCod, T00TC35_A252CliCod, T00TC35_A65ArtCod, T00TC35_A758ProCod, T00TC35_A457FasCod
            }
            , new Object[] {
            T00TC36_A764ProForCod, T00TC36_A252CliCod, T00TC36_A65ArtCod, T00TC36_A758ProCod, T00TC36_A4897ArtProLin, T00TC36_A4898ArtProCod, T00TC36_A396EmprCod, T00TC36_A457FasCod, T00TC36_A4899ArtProDsc, T00TC36_n4899ArtProDsc
            }
            , new Object[] {
            T00TC37_A4899ArtProDsc, T00TC37_n4899ArtProDsc
            }
            , new Object[] {
            T00TC38_A396EmprCod, T00TC38_A252CliCod, T00TC38_A65ArtCod, T00TC38_A758ProCod, T00TC38_A457FasCod, T00TC38_A4897ArtProLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00TC42_A4899ArtProDsc, T00TC42_n4899ArtProDsc
            }
            , new Object[] {
            T00TC43_A396EmprCod, T00TC43_A252CliCod, T00TC43_A65ArtCod, T00TC43_A758ProCod, T00TC43_A457FasCod, T00TC43_A4897ArtProLin
            }
            , new Object[] {
            T00TC44_A407EmprNom, T00TC44_n407EmprNom
            }
            , new Object[] {
            T00TC45_A279CliNom
            }
            , new Object[] {
            T00TC46_A69ArtDsc, T00TC46_n69ArtDsc
            }
            , new Object[] {
            T00TC47_A759ProDsc
            }
         }
      );
      Z758ProCod = "" ;
      n758ProCod = false ;
      A758ProCod = "" ;
      n758ProCod = false ;
      Z65ArtCod = "" ;
      n65ArtCod = false ;
      A65ArtCod = "" ;
      n65ArtCod = false ;
      Z252CliCod = 0 ;
      n252CliCod = false ;
      A252CliCod = 0 ;
      n252CliCod = false ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV23Pgmname = "TFORACA" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte AV19Filasur ;
   private byte AV21Eliot ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private short Z4894ArtProULin ;
   private short O4894ArtProULin ;
   private short nRcdDeleted_476 ;
   private short nRcdExists_476 ;
   private short nIsMod_476 ;
   private short Z4897ArtProLin ;
   private short nRcdDeleted_723 ;
   private short nRcdExists_723 ;
   private short nIsMod_723 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4894ArtProULin ;
   private short nBlankRcdCount476 ;
   private short RcdFound476 ;
   private short nBlankRcdUsr476 ;
   private short s4894ArtProULin ;
   private short RcdFound723 ;
   private short A4897ArtProLin ;
   private short T4894ArtProULin ;
   private short RcdFound11 ;
   private short nIsDirty_11 ;
   private short nIsDirty_476 ;
   private short nIsDirty_723 ;
   private short nBlankRcdCount723 ;
   private short B4894ArtProULin ;
   private short nBlankRcdUsr723 ;
   private short i4894ArtProULin ;
   private short subGrid1_Borderwidth ;
   private int wcpOA252CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_60 ;
   private int nGXsfl_60_idx=1 ;
   private int nRC_GXsfl_92 ;
   private int nGXsfl_92_idx=1 ;
   private int A252CliCod ;
   private int trnEnded ;
   private int edtArtProFac_Visible ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtArtCod_Enabled ;
   private int edtArtDsc_Enabled ;
   private int edtProCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtFasForMul_Enabled ;
   private int edtArtProULin_Enabled ;
   private int edtArtProFac_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int edtavnRcdDeleted_723_Enabled ;
   private int edtArtProLin_Enabled ;
   private int edtArtProCod_Enabled ;
   private int edtArtProDsc_Enabled ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtArtProLin_Enabled ;
   private int defedtArtProULin_Enabled ;
   private int defedtFasCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtProDsc_Backcolor ;
   private int edtProCod_Backcolor ;
   private int edtArtDsc_Backcolor ;
   private int edtArtCod_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private java.math.BigDecimal Z4896ArtProFac ;
   private java.math.BigDecimal A4896ArtProFac ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA65ArtCod ;
   private String wcpOA758ProCod ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z758ProCod ;
   private String Z457FasCod ;
   private String Z4898ArtProCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String AV20Msg_err ;
   private String A4898ArtProCod ;
   private String A65ArtCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_60_idx="0001" ;
   private String edtArtProFac_Internalname ;
   private String Gx_mode ;
   private String sGXsfl_92_idx="0001" ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtArtCod_Internalname ;
   private String edtArtCod_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtArtDsc_Internalname ;
   private String A69ArtDsc ;
   private String edtArtDsc_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String sMode476 ;
   private String edtFasCod_Internalname ;
   private String edtFasDsc_Internalname ;
   private String edtFasForMul_Internalname ;
   private String edtArtProULin_Internalname ;
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
   private String AV23Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String edtavnRcdDeleted_723_Internalname ;
   private String sMode11 ;
   private String GXCCtl ;
   private String edtArtProLin_Internalname ;
   private String edtArtProCod_Internalname ;
   private String edtArtProDsc_Internalname ;
   private String A4899ArtProDsc ;
   private String A460FasDsc ;
   private String A4286FasForMul ;
   private String AV7Lit0 ;
   private String AV9LitFe ;
   private String AV12Station ;
   private String AV13Lit1 ;
   private String AV18Lit2 ;
   private String AV14Lit3 ;
   private String AV15Lit4 ;
   private String AV16Lit5 ;
   private String AV17Lit41 ;
   private String GXt_char1 ;
   private String AV10EmprCod ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z69ArtDsc ;
   private String Z759ProDsc ;
   private String Z460FasDsc ;
   private String Z4286FasForMul ;
   private String Z4899ArtProDsc ;
   private String sMode723 ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock13_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_60_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable3_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String ROClassString ;
   private String edtFasCod_Jsonclick ;
   private String lblTextblock10_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String lblTextblock11_Jsonclick ;
   private String edtFasForMul_Jsonclick ;
   private String lblTextblock12_Jsonclick ;
   private String edtArtProULin_Jsonclick ;
   private String lblTextblock13_Jsonclick ;
   private String edtArtProFac_Jsonclick ;
   private String sGXsfl_92_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_723_Jsonclick ;
   private String edtArtProLin_Jsonclick ;
   private String edtArtProCod_Jsonclick ;
   private String edtArtProDsc_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String lblTextblock9_Caption ;
   private String lblTextblock10_Caption ;
   private String lblTextblock11_Caption ;
   private String lblTextblock12_Caption ;
   private String lblTextblock13_Caption ;
   private String subGrid2_Header ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ758ProCod ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ69ArtDsc ;
   private String ZZ759ProDsc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n758ProCod ;
   private boolean n252CliCod ;
   private boolean n65ArtCod ;
   private boolean wbErr ;
   private boolean bGXsfl_60_Refreshing=false ;
   private boolean n4894ArtProULin ;
   private boolean n407EmprNom ;
   private boolean n69ArtDsc ;
   private boolean bGXsfl_92_Refreshing=false ;
   private boolean returnInSub ;
   private boolean n4286FasForMul ;
   private boolean n4896ArtProFac ;
   private boolean n4899ArtProDsc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00TC10_A407EmprNom ;
   private boolean[] T00TC10_n407EmprNom ;
   private String[] T00TC11_A279CliNom ;
   private String[] T00TC12_A69ArtDsc ;
   private boolean[] T00TC12_n69ArtDsc ;
   private String[] T00TC13_A759ProDsc ;
   private String[] T00TC14_A407EmprNom ;
   private boolean[] T00TC14_n407EmprNom ;
   private String[] T00TC14_A279CliNom ;
   private String[] T00TC14_A69ArtDsc ;
   private boolean[] T00TC14_n69ArtDsc ;
   private String[] T00TC14_A759ProDsc ;
   private String[] T00TC14_A396EmprCod ;
   private int[] T00TC14_A252CliCod ;
   private boolean[] T00TC14_n252CliCod ;
   private String[] T00TC14_A65ArtCod ;
   private boolean[] T00TC14_n65ArtCod ;
   private String[] T00TC14_A758ProCod ;
   private boolean[] T00TC14_n758ProCod ;
   private String[] T00TC15_A396EmprCod ;
   private int[] T00TC15_A252CliCod ;
   private boolean[] T00TC15_n252CliCod ;
   private String[] T00TC15_A65ArtCod ;
   private boolean[] T00TC15_n65ArtCod ;
   private String[] T00TC15_A758ProCod ;
   private boolean[] T00TC15_n758ProCod ;
   private String[] T00TC9_A396EmprCod ;
   private int[] T00TC9_A252CliCod ;
   private boolean[] T00TC9_n252CliCod ;
   private String[] T00TC9_A65ArtCod ;
   private boolean[] T00TC9_n65ArtCod ;
   private String[] T00TC9_A758ProCod ;
   private boolean[] T00TC9_n758ProCod ;
   private String[] T00TC16_A396EmprCod ;
   private int[] T00TC16_A252CliCod ;
   private boolean[] T00TC16_n252CliCod ;
   private String[] T00TC16_A65ArtCod ;
   private boolean[] T00TC16_n65ArtCod ;
   private String[] T00TC16_A758ProCod ;
   private boolean[] T00TC16_n758ProCod ;
   private String[] T00TC17_A396EmprCod ;
   private int[] T00TC17_A252CliCod ;
   private boolean[] T00TC17_n252CliCod ;
   private String[] T00TC17_A65ArtCod ;
   private boolean[] T00TC17_n65ArtCod ;
   private String[] T00TC17_A758ProCod ;
   private boolean[] T00TC17_n758ProCod ;
   private String[] T00TC8_A396EmprCod ;
   private int[] T00TC8_A252CliCod ;
   private boolean[] T00TC8_n252CliCod ;
   private String[] T00TC8_A65ArtCod ;
   private boolean[] T00TC8_n65ArtCod ;
   private String[] T00TC8_A758ProCod ;
   private boolean[] T00TC8_n758ProCod ;
   private String[] T00TC20_A396EmprCod ;
   private int[] T00TC20_A11604PArtId ;
   private String[] T00TC21_A396EmprCod ;
   private int[] T00TC21_A252CliCod ;
   private boolean[] T00TC21_n252CliCod ;
   private String[] T00TC21_A65ArtCod ;
   private boolean[] T00TC21_n65ArtCod ;
   private String[] T00TC21_A758ProCod ;
   private boolean[] T00TC21_n758ProCod ;
   private String[] T00TC21_A9836FasCodM ;
   private String[] T00TC22_A396EmprCod ;
   private int[] T00TC22_A252CliCod ;
   private boolean[] T00TC22_n252CliCod ;
   private String[] T00TC22_A65ArtCod ;
   private boolean[] T00TC22_n65ArtCod ;
   private String[] T00TC22_A758ProCod ;
   private boolean[] T00TC22_n758ProCod ;
   private short[] T00TC22_A6986NumLinPro ;
   private String[] T00TC23_A396EmprCod ;
   private int[] T00TC23_A252CliCod ;
   private boolean[] T00TC23_n252CliCod ;
   private String[] T00TC23_A65ArtCod ;
   private boolean[] T00TC23_n65ArtCod ;
   private String[] T00TC23_A4658MdlCod ;
   private String[] T00TC23_A758ProCod ;
   private boolean[] T00TC23_n758ProCod ;
   private String[] T00TC24_A396EmprCod ;
   private int[] T00TC24_A252CliCod ;
   private boolean[] T00TC24_n252CliCod ;
   private String[] T00TC24_A65ArtCod ;
   private boolean[] T00TC24_n65ArtCod ;
   private String[] T00TC24_A758ProCod ;
   private boolean[] T00TC24_n758ProCod ;
   private String[] T00TC24_A457FasCod ;
   private String[] T00TC25_A396EmprCod ;
   private int[] T00TC25_A252CliCod ;
   private boolean[] T00TC25_n252CliCod ;
   private String[] T00TC25_A65ArtCod ;
   private boolean[] T00TC25_n65ArtCod ;
   private String[] T00TC25_A758ProCod ;
   private boolean[] T00TC25_n758ProCod ;
   private int[] T00TC26_A252CliCod ;
   private boolean[] T00TC26_n252CliCod ;
   private String[] T00TC26_A65ArtCod ;
   private boolean[] T00TC26_n65ArtCod ;
   private String[] T00TC26_A758ProCod ;
   private boolean[] T00TC26_n758ProCod ;
   private String[] T00TC26_A460FasDsc ;
   private String[] T00TC26_A4286FasForMul ;
   private boolean[] T00TC26_n4286FasForMul ;
   private short[] T00TC26_A4894ArtProULin ;
   private boolean[] T00TC26_n4894ArtProULin ;
   private java.math.BigDecimal[] T00TC26_A4896ArtProFac ;
   private boolean[] T00TC26_n4896ArtProFac ;
   private String[] T00TC26_A396EmprCod ;
   private String[] T00TC26_A457FasCod ;
   private String[] T00TC7_A460FasDsc ;
   private String[] T00TC7_A4286FasForMul ;
   private boolean[] T00TC7_n4286FasForMul ;
   private String[] T00TC27_A460FasDsc ;
   private String[] T00TC27_A4286FasForMul ;
   private boolean[] T00TC27_n4286FasForMul ;
   private String[] T00TC28_A396EmprCod ;
   private int[] T00TC28_A252CliCod ;
   private boolean[] T00TC28_n252CliCod ;
   private String[] T00TC28_A65ArtCod ;
   private boolean[] T00TC28_n65ArtCod ;
   private String[] T00TC28_A758ProCod ;
   private boolean[] T00TC28_n758ProCod ;
   private String[] T00TC28_A457FasCod ;
   private int[] T00TC6_A252CliCod ;
   private boolean[] T00TC6_n252CliCod ;
   private String[] T00TC6_A65ArtCod ;
   private boolean[] T00TC6_n65ArtCod ;
   private String[] T00TC6_A758ProCod ;
   private boolean[] T00TC6_n758ProCod ;
   private short[] T00TC6_A4894ArtProULin ;
   private boolean[] T00TC6_n4894ArtProULin ;
   private java.math.BigDecimal[] T00TC6_A4896ArtProFac ;
   private boolean[] T00TC6_n4896ArtProFac ;
   private String[] T00TC6_A396EmprCod ;
   private String[] T00TC6_A457FasCod ;
   private int[] T00TC5_A252CliCod ;
   private boolean[] T00TC5_n252CliCod ;
   private String[] T00TC5_A65ArtCod ;
   private boolean[] T00TC5_n65ArtCod ;
   private String[] T00TC5_A758ProCod ;
   private boolean[] T00TC5_n758ProCod ;
   private short[] T00TC5_A4894ArtProULin ;
   private boolean[] T00TC5_n4894ArtProULin ;
   private java.math.BigDecimal[] T00TC5_A4896ArtProFac ;
   private boolean[] T00TC5_n4896ArtProFac ;
   private String[] T00TC5_A396EmprCod ;
   private String[] T00TC5_A457FasCod ;
   private String[] T00TC32_A460FasDsc ;
   private String[] T00TC32_A4286FasForMul ;
   private boolean[] T00TC32_n4286FasForMul ;
   private String[] T00TC33_A396EmprCod ;
   private int[] T00TC33_A252CliCod ;
   private boolean[] T00TC33_n252CliCod ;
   private String[] T00TC33_A65ArtCod ;
   private boolean[] T00TC33_n65ArtCod ;
   private String[] T00TC33_A758ProCod ;
   private boolean[] T00TC33_n758ProCod ;
   private String[] T00TC33_A457FasCod ;
   private short[] T00TC33_A1664ParFasCod ;
   private String[] T00TC35_A396EmprCod ;
   private int[] T00TC35_A252CliCod ;
   private boolean[] T00TC35_n252CliCod ;
   private String[] T00TC35_A65ArtCod ;
   private boolean[] T00TC35_n65ArtCod ;
   private String[] T00TC35_A758ProCod ;
   private boolean[] T00TC35_n758ProCod ;
   private String[] T00TC35_A457FasCod ;
   private String[] T00TC36_A764ProForCod ;
   private int[] T00TC36_A252CliCod ;
   private boolean[] T00TC36_n252CliCod ;
   private String[] T00TC36_A65ArtCod ;
   private boolean[] T00TC36_n65ArtCod ;
   private String[] T00TC36_A758ProCod ;
   private boolean[] T00TC36_n758ProCod ;
   private short[] T00TC36_A4897ArtProLin ;
   private String[] T00TC36_A4898ArtProCod ;
   private String[] T00TC36_A396EmprCod ;
   private String[] T00TC36_A457FasCod ;
   private String[] T00TC36_A4899ArtProDsc ;
   private boolean[] T00TC36_n4899ArtProDsc ;
   private String[] T00TC4_A4899ArtProDsc ;
   private boolean[] T00TC4_n4899ArtProDsc ;
   private String[] T00TC37_A4899ArtProDsc ;
   private boolean[] T00TC37_n4899ArtProDsc ;
   private String[] T00TC38_A396EmprCod ;
   private int[] T00TC38_A252CliCod ;
   private boolean[] T00TC38_n252CliCod ;
   private String[] T00TC38_A65ArtCod ;
   private boolean[] T00TC38_n65ArtCod ;
   private String[] T00TC38_A758ProCod ;
   private boolean[] T00TC38_n758ProCod ;
   private String[] T00TC38_A457FasCod ;
   private short[] T00TC38_A4897ArtProLin ;
   private int[] T00TC3_A252CliCod ;
   private boolean[] T00TC3_n252CliCod ;
   private String[] T00TC3_A65ArtCod ;
   private boolean[] T00TC3_n65ArtCod ;
   private String[] T00TC3_A758ProCod ;
   private boolean[] T00TC3_n758ProCod ;
   private short[] T00TC3_A4897ArtProLin ;
   private String[] T00TC3_A4898ArtProCod ;
   private String[] T00TC3_A396EmprCod ;
   private String[] T00TC3_A457FasCod ;
   private int[] T00TC2_A252CliCod ;
   private boolean[] T00TC2_n252CliCod ;
   private String[] T00TC2_A65ArtCod ;
   private boolean[] T00TC2_n65ArtCod ;
   private String[] T00TC2_A758ProCod ;
   private boolean[] T00TC2_n758ProCod ;
   private short[] T00TC2_A4897ArtProLin ;
   private String[] T00TC2_A4898ArtProCod ;
   private String[] T00TC2_A396EmprCod ;
   private String[] T00TC2_A457FasCod ;
   private String[] T00TC42_A4899ArtProDsc ;
   private boolean[] T00TC42_n4899ArtProDsc ;
   private String[] T00TC43_A396EmprCod ;
   private int[] T00TC43_A252CliCod ;
   private boolean[] T00TC43_n252CliCod ;
   private String[] T00TC43_A65ArtCod ;
   private boolean[] T00TC43_n65ArtCod ;
   private String[] T00TC43_A758ProCod ;
   private boolean[] T00TC43_n758ProCod ;
   private String[] T00TC43_A457FasCod ;
   private short[] T00TC43_A4897ArtProLin ;
   private String[] T00TC44_A407EmprNom ;
   private boolean[] T00TC44_n407EmprNom ;
   private String[] T00TC45_A279CliNom ;
   private String[] T00TC46_A69ArtDsc ;
   private boolean[] T00TC46_n69ArtDsc ;
   private String[] T00TC47_A759ProDsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tforaca__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tforaca__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tforaca__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tforaca__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tforaca__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00TC2", "SELECT CliCod, ArtCod, ProCod, ArtProLin, ArtProCod, EmprCod, FasCod FROM TXPArtFor WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? AND ArtProLin = ?  FOR UPDATE OF ArtProCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TC3", "SELECT CliCod, ArtCod, ProCod, ArtProLin, ArtProCod, EmprCod, FasCod FROM TXPArtFor WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? AND ArtProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TC4", "SELECT COALESCE( ProForDsc, 'N/E') AS ArtProDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TC5", "SELECT CliCod, ArtCod, ProCod, ArtProULin, ArtProFac, EmprCod, FasCod FROM TXPSERPAU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ?  FOR UPDATE OF ArtProULin, ArtProFac NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TC6", "SELECT CliCod, ArtCod, ProCod, ArtProULin, ArtProFac, EmprCod, FasCod FROM TXPSERPAU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TC7", "SELECT FasDsc, FasForMul FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TC8", "SELECT EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?  FOR UPDATE OF EmprCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TC9", "SELECT EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TC10", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TC11", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TC12", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TC13", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TC14", "SELECT /*+ FIRST_ROWS(1) */ T2.EmprNom, T3.CliNom, T4.ArtDsc, T5.ProDsc, TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.ProCod FROM ((((TXPARTLIN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.ArtCod = TM1.ArtCod) INNER JOIN TXPPROCES T5 ON T5.EmprCod = TM1.EmprCod AND T5.ProCod = TM1.ProCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? and TM1.ProCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.ProCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TC15", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TC16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TC17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC, ProCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00TC18", "INSERT INTO TXPARTLIN(EmprCod, CliCod, ArtCod, ProCod, Art_GrmA, Art_AncA, Art_Merma, Art_PmlA, Art_Eanc, Art_Elar, Art_Enc, Art_Cor, Art_Rdo, Art_Rdpc, Art_Fabs, Art_AncB, Art_GrmB, Art_GrmC, Art_AncC, Art_PmlC, Art_GrmP, Art_PmlP, Art_AncP, Art_RdoP, Art_Dsc, Art_Und, Art_Obs, Art_ets, Art_els, DscCFa, ProAct, ProUserA, ProFecA, ProUserM, ProFecM, ProFabs, ProSta, ProStFec, Art_Tipo) VALUES(?, ?, ?, ?, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ')", GX_NOMASK, "TXPARTLIN")
         ,new UpdateCursor("T00TC19", "DELETE FROM TXPARTLIN  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?", GX_NOMASK, "TXPARTLIN")
         ,new ForEachCursor("T00TC20", "SELECT * FROM (SELECT EmprCod, PArtId FROM TXPPedAEs WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TC21", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod, FasCodM FROM TXPCAPFMP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TC22", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod, NumLinPro FROM TXPPARART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TC23", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, MdlCod, ProCod FROM TXPModPro WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TC24", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TC25", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TC26", "SELECT T1.CliCod, T1.ArtCod, T1.ProCod, T2.FasDsc, T2.FasForMul, T1.ArtProULin, T1.ArtProFac, T1.EmprCod, T1.FasCod FROM (TXPSERPAU T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.ProCod = ? and T1.FasCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod, T1.FasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TC27", "SELECT FasDsc, FasForMul FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TC28", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00TC29", "INSERT INTO TXPSERPAU(CliCod, ArtCod, ProCod, ArtProULin, ArtProFac, EmprCod, FasCod, ArtProFacT, CCTCod, ArtFasFac, ArtFasPyS, ArtFasPpp, ArtFasVel, ArtFasNPs) VALUES(?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPSERPAU")
         ,new UpdateCursor("T00TC30", "UPDATE TXPSERPAU SET ArtProULin=?, ArtProFac=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ?", GX_NOMASK, "TXPSERPAU")
         ,new UpdateCursor("T00TC31", "DELETE FROM TXPSERPAU  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ?", GX_NOMASK, "TXPSERPAU")
         ,new ForEachCursor("T00TC32", "SELECT FasDsc, FasForMul FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TC33", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod, ParFasCod FROM TXPSERPAR WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00TC34", "UPDATE TXPSERPAU SET ArtProULin=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ?", GX_NOMASK, "TXPSERPAU")
         ,new ForEachCursor("T00TC35", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TC36", "SELECT T2.ProForCod, T1.CliCod, T1.ArtCod, T1.ProCod, T1.ArtProLin, T1.ArtProCod, T1.EmprCod, T1.FasCod, COALESCE( T2.ProForDsc, 'N/E') AS ArtProDsc FROM (TXPArtFor T1 LEFT JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ArtProCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.ProCod = ? and T1.FasCod = ? and T1.ArtProLin = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod, T1.FasCod, T1.ArtProLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TC37", "SELECT COALESCE( ProForDsc, 'N/E') AS ArtProDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TC38", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod, ArtProLin FROM TXPArtFor WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? AND ArtProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00TC39", "INSERT INTO TXPArtFor(CliCod, ArtCod, ProCod, ArtProLin, ArtProCod, EmprCod, FasCod) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPArtFor")
         ,new UpdateCursor("T00TC40", "UPDATE TXPArtFor SET ArtProCod=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? AND ArtProLin = ?", GX_NOMASK, "TXPArtFor")
         ,new UpdateCursor("T00TC41", "DELETE FROM TXPArtFor  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? AND ArtProLin = ?", GX_NOMASK, "TXPArtFor")
         ,new ForEachCursor("T00TC42", "SELECT COALESCE( ProForDsc, 'N/E') AS ArtProDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TC43", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod, ArtProLin FROM TXPArtFor WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod, ArtProLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TC44", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TC45", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TC46", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TC47", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((String[]) buf[8])[0] = rslt.getString(7, 8);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((String[]) buf[8])[0] = rslt.getString(7, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 40);
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 24 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 28);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 3);
               ((String[]) buf[11])[0] = rslt.getString(9, 8);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
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
                  stmt.setString(4, (String)parms[6], 8);
               }
               stmt.setString(5, (String)parms[7], 8);
               stmt.setShort(6, ((Number) parms[8]).shortValue());
               return;
            case 1 :
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
                  stmt.setString(4, (String)parms[6], 8);
               }
               stmt.setString(5, (String)parms[7], 8);
               stmt.setShort(6, ((Number) parms[8]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
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
                  stmt.setString(4, (String)parms[6], 8);
               }
               stmt.setString(5, (String)parms[7], 8);
               return;
            case 4 :
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
                  stmt.setString(4, (String)parms[6], 8);
               }
               stmt.setString(5, (String)parms[7], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 6 :
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
                  stmt.setString(4, (String)parms[6], 8);
               }
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
                  stmt.setString(4, (String)parms[6], 8);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
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
            case 10 :
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
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 12 :
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
                  stmt.setString(4, (String)parms[6], 8);
               }
               return;
            case 13 :
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
                  stmt.setString(4, (String)parms[6], 8);
               }
               return;
            case 14 :
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
                  stmt.setString(4, (String)parms[6], 8);
               }
               return;
            case 15 :
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
                  stmt.setString(4, (String)parms[6], 8);
               }
               return;
            case 16 :
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
                  stmt.setString(4, (String)parms[6], 8);
               }
               return;
            case 17 :
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
                  stmt.setString(4, (String)parms[6], 8);
               }
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
                  stmt.setString(4, (String)parms[6], 8);
               }
               return;
            case 19 :
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
                  stmt.setString(4, (String)parms[6], 8);
               }
               return;
            case 20 :
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
                  stmt.setString(4, (String)parms[6], 8);
               }
               return;
            case 21 :
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
                  stmt.setString(4, (String)parms[6], 8);
               }
               return;
            case 22 :
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
                  stmt.setString(4, (String)parms[6], 8);
               }
               return;
            case 23 :
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
                  stmt.setString(4, (String)parms[6], 8);
               }
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
                  stmt.setString(4, (String)parms[6], 8);
               }
               stmt.setString(5, (String)parms[7], 8);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 26 :
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
                  stmt.setString(4, (String)parms[6], 8);
               }
               stmt.setString(5, (String)parms[7], 8);
               return;
            case 27 :
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
                  stmt.setString(3, (String)parms[5], 8);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setString(7, (String)parms[11], 8);
               return;
            case 28 :
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
               stmt.setString(3, (String)parms[4], 3);
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 16);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 8);
               }
               stmt.setString(7, (String)parms[11], 8);
               return;
            case 29 :
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
                  stmt.setString(4, (String)parms[6], 8);
               }
               stmt.setString(5, (String)parms[7], 8);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 31 :
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
                  stmt.setString(4, (String)parms[6], 8);
               }
               stmt.setString(5, (String)parms[7], 8);
               return;
            case 32 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 16);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 8);
               }
               stmt.setString(6, (String)parms[9], 8);
               return;
            case 33 :
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
                  stmt.setString(4, (String)parms[6], 8);
               }
               return;
            case 34 :
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
                  stmt.setString(4, (String)parms[6], 8);
               }
               stmt.setString(5, (String)parms[7], 8);
               stmt.setShort(6, ((Number) parms[8]).shortValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 36 :
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
                  stmt.setString(4, (String)parms[6], 8);
               }
               stmt.setString(5, (String)parms[7], 8);
               stmt.setShort(6, ((Number) parms[8]).shortValue());
               return;
            case 37 :
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
                  stmt.setString(3, (String)parms[5], 8);
               }
               stmt.setShort(4, ((Number) parms[6]).shortValue());
               stmt.setString(5, (String)parms[7], 8);
               stmt.setString(6, (String)parms[8], 3);
               stmt.setString(7, (String)parms[9], 8);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 3);
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
                  stmt.setString(5, (String)parms[7], 8);
               }
               stmt.setString(6, (String)parms[8], 8);
               stmt.setShort(7, ((Number) parms[9]).shortValue());
               return;
            case 39 :
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
                  stmt.setString(4, (String)parms[6], 8);
               }
               stmt.setString(5, (String)parms[7], 8);
               stmt.setShort(6, ((Number) parms[8]).shortValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 41 :
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
                  stmt.setString(4, (String)parms[6], 8);
               }
               stmt.setString(5, (String)parms[7], 8);
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 43 :
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
            case 44 :
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
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
      }
   }

}

