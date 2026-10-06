package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttnartp_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"MQ_DSCM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7956Mq_CodM = httpContext.GetPar( "Mq_CodM") ;
         httpContext.ajax_rsp_assign_attri("", false, "A7956Mq_CodM", A7956Mq_CodM);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asamq_dscm10K1117( A396EmprCod, A7956Mq_CodM) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_18") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7949Par_Art = (short)(GXutil.lval( httpContext.GetPar( "Par_Art"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_18( A396EmprCod, A7949Par_Art) ;
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
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = httpContext.GetPar( "ArtCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A7956Mq_CodM = httpContext.GetPar( "Mq_CodM") ;
            httpContext.ajax_rsp_assign_attri("", false, "A7956Mq_CodM", A7956Mq_CodM);
            A7783Mq_LinP = (short)(GXutil.lval( httpContext.GetPar( "Mq_LinP"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7783Mq_LinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7783Mq_LinP), 4, 0));
            AV36Modif = httpContext.GetPar( "Modif") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36Modif", AV36Modif);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PARAMETROS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMq_PesI_Internalname ;
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
      nRC_GXsfl_80 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_80"))) ;
      nGXsfl_80_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_80_idx"))) ;
      sGXsfl_80_idx = httpContext.GetPar( "sGXsfl_80_idx") ;
      AV17UsurCod = httpContext.GetPar( "UsurCod") ;
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

   public ttnartp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttnartp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttnartp_impl.class ));
   }

   public ttnartp_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTNARTp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTNARTp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTNARTp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTNARTp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTNARTp.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTNARTp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTNARTp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTNARTp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTNARTp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTNARTp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTNARTp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTNARTp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTNARTp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTNARTp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTNARTp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion Articulo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTNARTp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTNARTp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTNARTp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMq_CodM_Internalname, GXutil.rtrim( A7956Mq_CodM), GXutil.rtrim( localUtil.format( A7956Mq_CodM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMq_CodM_Jsonclick, 0, "", "", "", "", "", 1, edtMq_CodM_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTNARTp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Descripcion Maquina", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTNARTp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMq_DscM_Internalname, GXutil.rtrim( A7957Mq_DscM), GXutil.rtrim( localUtil.format( A7957Mq_DscM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMq_DscM_Jsonclick, 0, "", "", "", "", "", 1, edtMq_DscM_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTNARTp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Linea", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTNARTp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMq_LinP_Internalname, GXutil.ltrim( localUtil.ntoc( A7783Mq_LinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMq_LinP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7783Mq_LinP), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7783Mq_LinP), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMq_LinP_Jsonclick, 0, "", "", "", "", "", 1, edtMq_LinP_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTNARTp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTNARTp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Kgs Iniciales", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTNARTp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMq_PesI_Internalname, GXutil.ltrim( localUtil.ntoc( A7784Mq_PesI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMq_PesI_Enabled!=0) ? localUtil.format( A7784Mq_PesI, "ZZZZZ9.99") : localUtil.format( A7784Mq_PesI, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMq_PesI_Jsonclick, 0, "", "", "", "", "", 1, edtMq_PesI_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTNARTp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Kgs Finales", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTNARTp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMq_PesF_Internalname, GXutil.ltrim( localUtil.ntoc( A7785Mq_PesF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMq_PesF_Enabled!=0) ? localUtil.format( A7785Mq_PesF, "ZZZZZ9.99") : localUtil.format( A7785Mq_PesF, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMq_PesF_Jsonclick, 0, "", "", "", "", "", 1, edtMq_PesF_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTNARTp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTNARTp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMq_ObsT_Internalname, A7786Mq_ObsT, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", (short)(0), 1, edtMq_ObsT_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "32768", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TTNARTp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol80( ) ;
      nGXsfl_80_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1125 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1125 = (short)(1) ;
            scanStart10K1125( ) ;
            while ( RcdFound1125 != 0 )
            {
               init_level_properties1125( ) ;
               getByPrimaryKey10K1125( ) ;
               addRow10K1125( ) ;
               scanNext10K1125( ) ;
            }
            scanEnd10K1125( ) ;
            nBlankRcdCount1125 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal10K1125( ) ;
         standaloneModal10K1125( ) ;
         sMode1125 = Gx_mode ;
         while ( nGXsfl_80_idx < nRC_GXsfl_80 )
         {
            bGXsfl_80_Refreshing = true ;
            readRow10K1125( ) ;
            edtavnRcdDeleted_1125_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1125_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1125_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1125_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtPar_Art_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_ART_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPar_Art_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_Art_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtPar_Dsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_DSC_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPar_Dsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_Dsc_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtPar_Valor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_VALOR_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPar_Valor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_Valor_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtPar_Obs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_OBS_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPar_Obs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_Obs_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtPar_UsuA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_USUA_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPar_UsuA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_UsuA_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtPar_FecA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_FECA_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPar_FecA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_FecA_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtPar_UsuM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_USUM_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPar_UsuM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_UsuM_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtPar_FecM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_FECM_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPar_FecM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_FecM_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            if ( ( nRcdExists_1125 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal10K1125( ) ;
            }
            sendRow10K1125( ) ;
            bGXsfl_80_Refreshing = false ;
         }
         Gx_mode = sMode1125 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1125 = (short)(5) ;
         nRcdExists_1125 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart10K1125( ) ;
            while ( RcdFound1125 != 0 )
            {
               sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_801125( ) ;
               init_level_properties1125( ) ;
               standaloneNotModal10K1125( ) ;
               getByPrimaryKey10K1125( ) ;
               standaloneModal10K1125( ) ;
               addRow10K1125( ) ;
               scanNext10K1125( ) ;
            }
            scanEnd10K1125( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1125 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_801125( ) ;
      initAll10K1125( ) ;
      init_level_properties1125( ) ;
      nRcdExists_1125 = (short)(0) ;
      nIsMod_1125 = (short)(0) ;
      nRcdDeleted_1125 = (short)(0) ;
      nBlankRcdCount1125 = (short)(nBlankRcdUsr1125+nBlankRcdCount1125) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1125 > 0 )
      {
         standaloneNotModal10K1125( ) ;
         standaloneModal10K1125( ) ;
         addRow10K1125( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtPar_Art_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1125 = (short)(nBlankRcdCount1125-1) ;
      }
      Gx_mode = sMode1125 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTNARTp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTNARTp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTNARTp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTNARTp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTNARTp.htm");
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
      e1110K2 ();
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
            Z7956Mq_CodM = httpContext.cgiGet( "Z7956Mq_CodM") ;
            Z7783Mq_LinP = (short)(localUtil.ctol( httpContext.cgiGet( "Z7783Mq_LinP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7784Mq_PesI = localUtil.ctond( httpContext.cgiGet( "Z7784Mq_PesI")) ;
            Z7785Mq_PesF = localUtil.ctond( httpContext.cgiGet( "Z7785Mq_PesF")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_80 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_80"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV38Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV36Modif = httpContext.cgiGet( "vMODIF") ;
            AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
            n69ArtDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
            A7956Mq_CodM = httpContext.cgiGet( edtMq_CodM_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7956Mq_CodM", A7956Mq_CodM);
            A7957Mq_DscM = httpContext.cgiGet( edtMq_DscM_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7957Mq_DscM", A7957Mq_DscM);
            A7783Mq_LinP = (short)(localUtil.ctol( httpContext.cgiGet( edtMq_LinP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7783Mq_LinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7783Mq_LinP), 4, 0));
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMq_PesI_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMq_PesI_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MQ_PESI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMq_PesI_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7784Mq_PesI = DecimalUtil.ZERO ;
               n7784Mq_PesI = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7784Mq_PesI", GXutil.ltrimstr( A7784Mq_PesI, 9, 2));
            }
            else
            {
               A7784Mq_PesI = localUtil.ctond( httpContext.cgiGet( edtMq_PesI_Internalname)) ;
               n7784Mq_PesI = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7784Mq_PesI", GXutil.ltrimstr( A7784Mq_PesI, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMq_PesF_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMq_PesF_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MQ_PESF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMq_PesF_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7785Mq_PesF = DecimalUtil.ZERO ;
               n7785Mq_PesF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7785Mq_PesF", GXutil.ltrimstr( A7785Mq_PesF, 9, 2));
            }
            else
            {
               A7785Mq_PesF = localUtil.ctond( httpContext.cgiGet( edtMq_PesF_Internalname)) ;
               n7785Mq_PesF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7785Mq_PesF", GXutil.ltrimstr( A7785Mq_PesF, 9, 2));
            }
            A7786Mq_ObsT = httpContext.cgiGet( edtMq_ObsT_Internalname) ;
            n7786Mq_ObsT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7786Mq_ObsT", A7786Mq_ObsT);
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = httpContext.GetPar( "ArtCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A7956Mq_CodM = httpContext.GetPar( "Mq_CodM") ;
               httpContext.ajax_rsp_assign_attri("", false, "A7956Mq_CodM", A7956Mq_CodM);
               A7783Mq_LinP = (short)(GXutil.lval( httpContext.GetPar( "Mq_LinP"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7783Mq_LinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7783Mq_LinP), 4, 0));
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
                        e1110K2 ();
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
            initAll10K1117( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1125_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1125_Enabled), 5, 0), !bGXsfl_80_Refreshing);
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
      disableAttributes10K1117( ) ;
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

   public void confirm_10K0( )
   {
      beforeValidate10K1117( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls10K1117( ) ;
         }
         else
         {
            checkExtendedTable10K1117( ) ;
            if ( AnyError == 0 )
            {
               zm10K1117( 13) ;
               zm10K1117( 14) ;
               zm10K1117( 15) ;
               zm10K1117( 16) ;
            }
            closeExtendedTableCursors10K1117( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1117 = Gx_mode ;
         confirm_10K1125( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1117 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1117 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues10K0( ) ;
      }
   }

   public void confirm_10K1125( )
   {
      sV36Modif = OV36Modif ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Modif", AV36Modif);
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRow10K1125( ) ;
         if ( ( nRcdExists_1125 != 0 ) || ( nIsMod_1125 != 0 ) )
         {
            getKey10K1125( ) ;
            if ( ( nRcdExists_1125 == 0 ) && ( nRcdDeleted_1125 == 0 ) )
            {
               if ( RcdFound1125 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate10K1125( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable10K1125( ) ;
                     if ( AnyError == 0 )
                     {
                        zm10K1125( 18) ;
                     }
                     closeExtendedTableCursors10K1125( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     OV36Modif = AV36Modif ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV36Modif", AV36Modif);
                  }
               }
               else
               {
                  GXCCtl = "PAR_ART_" + sGXsfl_80_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPar_Art_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1125 != 0 )
               {
                  if ( nRcdDeleted_1125 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey10K1125( ) ;
                     load10K1125( ) ;
                     beforeValidate10K1125( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls10K1125( ) ;
                        OV36Modif = AV36Modif ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV36Modif", AV36Modif);
                     }
                  }
                  else
                  {
                     if ( nIsMod_1125 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate10K1125( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable10K1125( ) ;
                           if ( AnyError == 0 )
                           {
                              zm10K1125( 18) ;
                           }
                           closeExtendedTableCursors10K1125( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           OV36Modif = AV36Modif ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV36Modif", AV36Modif);
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1125 == 0 )
                  {
                     GXCCtl = "PAR_ART_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPar_Art_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1125_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPar_Art_Internalname, GXutil.ltrim( localUtil.ntoc( A7949Par_Art, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPar_Dsc_Internalname, GXutil.rtrim( A7950Par_Dsc)) ;
         httpContext.changePostValue( edtPar_Valor_Internalname, GXutil.rtrim( A7952Par_Valor)) ;
         httpContext.changePostValue( edtPar_Obs_Internalname, A7953Par_Obs) ;
         httpContext.changePostValue( edtPar_UsuA_Internalname, GXutil.rtrim( A10573Par_UsuA)) ;
         httpContext.changePostValue( edtPar_FecA_Internalname, localUtil.ttoc( A10574Par_FecA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtPar_UsuM_Internalname, GXutil.rtrim( A10575Par_UsuM)) ;
         httpContext.changePostValue( edtPar_FecM_Internalname, localUtil.ttoc( A10576Par_FecM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z7949Par_Art_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z7949Par_Art, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10573Par_UsuA_"+sGXsfl_80_idx, GXutil.rtrim( Z10573Par_UsuA)) ;
         httpContext.changePostValue( "ZT_"+"Z10574Par_FecA_"+sGXsfl_80_idx, localUtil.ttoc( Z10574Par_FecA, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10575Par_UsuM_"+sGXsfl_80_idx, GXutil.rtrim( Z10575Par_UsuM)) ;
         httpContext.changePostValue( "ZT_"+"Z10576Par_FecM_"+sGXsfl_80_idx, localUtil.ttoc( Z10576Par_FecM, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z7952Par_Valor_"+sGXsfl_80_idx, GXutil.rtrim( Z7952Par_Valor)) ;
         httpContext.changePostValue( "ZT_"+"Z7953Par_Obs_"+sGXsfl_80_idx, Z7953Par_Obs) ;
         httpContext.changePostValue( "T7952Par_Valor_"+sGXsfl_80_idx, GXutil.rtrim( O7952Par_Valor)) ;
         httpContext.changePostValue( "T7949Par_Art_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( O7949Par_Art, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1125_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1125_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1125_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1125 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1125_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1125_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_ART_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_Art_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_DSC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_Dsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_VALOR_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_Valor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_OBS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_Obs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_USUA_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_UsuA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_FECA_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_FecA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_USUM_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_UsuM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_FECM_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_FecM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      OV36Modif = sV36Modif ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Modif", AV36Modif);
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption10K0( )
   {
   }

   public void e1110K2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV22Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV16EmprNom ;
      GXv_char3[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char1, GXv_char2, GXv_char3) ;
      ttnartp_impl.this.A396EmprCod = GXv_char1[0] ;
      ttnartp_impl.this.AV16EmprNom = GXv_char2[0] ;
      ttnartp_impl.this.AV17UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char4 = AV24LitFe ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
      ttnartp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV24LitFe = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24LitFe", AV24LitFe);
      GXt_char4 = AV23Lit0 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char3) ;
      ttnartp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV23Lit0 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit0", AV23Lit0);
      GXt_char4 = AV18Lit1 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char3) ;
      ttnartp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV18Lit1 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit1", AV18Lit1);
      GXt_char4 = AV19Lit2 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV38Pgmname, (byte)(99), GXv_char3) ;
      ttnartp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV19Lit2 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit2", AV19Lit2);
      GXt_char4 = AV20Lit3 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1355_", ""), (byte)(99), GXv_char3) ;
      ttnartp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV20Lit3 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit3", AV20Lit3);
      GXt_char4 = AV21Lit4 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char3) ;
      ttnartp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV21Lit4 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit4", AV21Lit4);
      GXt_char4 = AV27Lit5 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN748_", ""), (byte)(99), GXv_char3) ;
      ttnartp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV27Lit5 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Lit5", AV27Lit5);
      GXt_char4 = AV28Lit6 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN007", ""), (byte)(99), GXv_char3) ;
      ttnartp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV28Lit6 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Lit6", AV28Lit6);
      GXt_char4 = AV30Lit7 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1480_", ""), (byte)(99), GXv_char3) ;
      ttnartp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV30Lit7 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Lit7", AV30Lit7);
      GXt_char4 = AV29Lit8 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1189_", ""), (byte)(99), GXv_char3) ;
      ttnartp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV29Lit8 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Lit8", AV29Lit8);
      GXt_char4 = AV31Lit9 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1156_", ""), (byte)(99), GXv_char3) ;
      ttnartp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV31Lit9 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Lit9", AV31Lit9);
      GXt_char4 = AV32Lit10 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT783_", ""), (byte)(99), GXv_char3) ;
      ttnartp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV32Lit10 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Lit10", AV32Lit10);
      AV34Lit11 = httpContext.getMessage( "Maquina", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Lit11", AV34Lit11);
      AV35Lit12 = httpContext.getMessage( "Linea", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Lit12", AV35Lit12);
   }

   public void zm10K1117( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7784Mq_PesI = T010K6_A7784Mq_PesI[0] ;
            Z7785Mq_PesF = T010K6_A7785Mq_PesF[0] ;
         }
         else
         {
            Z7784Mq_PesI = A7784Mq_PesI ;
            Z7785Mq_PesF = A7785Mq_PesF ;
         }
      }
      if ( GX_JID == -12 )
      {
         Z7783Mq_LinP = A7783Mq_LinP ;
         Z7784Mq_PesI = A7784Mq_PesI ;
         Z7785Mq_PesF = A7785Mq_PesF ;
         Z7786Mq_ObsT = A7786Mq_ObsT ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z7956Mq_CodM = A7956Mq_CodM ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z69ArtDsc = A69ArtDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV38Pgmname = "TTNARTp" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Pgmname", AV38Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      /* Using cursor T010K7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T010K7_A407EmprNom[0] ;
      n407EmprNom = T010K7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T010K8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T010K8_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(6);
      /* Using cursor T010K9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
      A69ArtDsc = T010K9_A69ArtDsc[0] ;
      n69ArtDsc = T010K9_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(7);
      /* Using cursor T010K10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TNART", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MQ_CODM");
         AnyError = (short)(1) ;
      }
      pr_default.close(8);
      GXt_char4 = A7957Mq_DscM ;
      GXv_char3[0] = GXt_char4 ;
      new app.pobtmaq(remoteHandle, context).execute( A396EmprCod, A7956Mq_CodM, GXv_char3) ;
      ttnartp_impl.this.GXt_char4 = GXv_char3[0] ;
      A7957Mq_DscM = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7957Mq_DscM", A7957Mq_DscM);
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

   public void load10K1117( )
   {
      /* Using cursor T010K11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1117 = (short)(1) ;
         A7786Mq_ObsT = T010K11_A7786Mq_ObsT[0] ;
         n7786Mq_ObsT = T010K11_n7786Mq_ObsT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7786Mq_ObsT", A7786Mq_ObsT);
         A407EmprNom = T010K11_A407EmprNom[0] ;
         n407EmprNom = T010K11_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T010K11_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A69ArtDsc = T010K11_A69ArtDsc[0] ;
         n69ArtDsc = T010K11_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A7784Mq_PesI = T010K11_A7784Mq_PesI[0] ;
         n7784Mq_PesI = T010K11_n7784Mq_PesI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7784Mq_PesI", GXutil.ltrimstr( A7784Mq_PesI, 9, 2));
         A7785Mq_PesF = T010K11_A7785Mq_PesF[0] ;
         n7785Mq_PesF = T010K11_n7785Mq_PesF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7785Mq_PesF", GXutil.ltrimstr( A7785Mq_PesF, 9, 2));
         zm10K1117( -12) ;
      }
      pr_default.close(9);
      onLoadActions10K1117( ) ;
   }

   public void onLoadActions10K1117( )
   {
   }

   public void checkExtendedTable10K1117( )
   {
      nIsDirty_1117 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors10K1117( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey10K1117( )
   {
      /* Using cursor T010K12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1117 = (short)(1) ;
      }
      else
      {
         RcdFound1117 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T010K6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP)});
      if ( (pr_default.getStatus(4) != 101) && ( T010K6_A7783Mq_LinP[0] == A7783Mq_LinP ) && ( GXutil.strcmp(T010K6_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010K6_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T010K6_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T010K6_A7956Mq_CodM[0], A7956Mq_CodM) == 0 ) )
      {
         zm10K1117( 12) ;
         RcdFound1117 = (short)(1) ;
         A7786Mq_ObsT = T010K6_A7786Mq_ObsT[0] ;
         n7786Mq_ObsT = T010K6_n7786Mq_ObsT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7786Mq_ObsT", A7786Mq_ObsT);
         A7784Mq_PesI = T010K6_A7784Mq_PesI[0] ;
         n7784Mq_PesI = T010K6_n7784Mq_PesI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7784Mq_PesI", GXutil.ltrimstr( A7784Mq_PesI, 9, 2));
         A7785Mq_PesF = T010K6_A7785Mq_PesF[0] ;
         n7785Mq_PesF = T010K6_n7785Mq_PesF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7785Mq_PesF", GXutil.ltrimstr( A7785Mq_PesF, 9, 2));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z7956Mq_CodM = A7956Mq_CodM ;
         Z7783Mq_LinP = A7783Mq_LinP ;
         sMode1117 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load10K1117( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1117 = (short)(0) ;
            initializeNonKey10K1117( ) ;
         }
         Gx_mode = sMode1117 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1117 = (short)(0) ;
         initializeNonKey10K1117( ) ;
         sMode1117 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1117 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey10K1117( ) ;
      if ( RcdFound1117 == 0 )
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
      RcdFound1117 = (short)(0) ;
      /* Using cursor T010K13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T010K13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010K13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T010K13_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T010K13_A7956Mq_CodM[0], A7956Mq_CodM) == 0 ) && ( T010K13_A7783Mq_LinP[0] == A7783Mq_LinP ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T010K13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010K13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T010K13_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T010K13_A7956Mq_CodM[0], A7956Mq_CodM) == 0 ) && ( T010K13_A7783Mq_LinP[0] == A7783Mq_LinP ) )
         {
            RcdFound1117 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound1117 = (short)(0) ;
      /* Using cursor T010K14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T010K14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010K14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T010K14_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T010K14_A7956Mq_CodM[0], A7956Mq_CodM) == 0 ) && ( T010K14_A7783Mq_LinP[0] == A7783Mq_LinP ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T010K14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010K14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T010K14_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T010K14_A7956Mq_CodM[0], A7956Mq_CodM) == 0 ) && ( T010K14_A7783Mq_LinP[0] == A7783Mq_LinP ) )
         {
            RcdFound1117 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey10K1117( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         AV36Modif = OV36Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Modif", AV36Modif);
         GX_FocusControl = edtMq_PesI_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert10K1117( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1117 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A7956Mq_CodM, Z7956Mq_CodM) != 0 ) || ( A7783Mq_LinP != Z7783Mq_LinP ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               AV36Modif = OV36Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV36Modif", AV36Modif);
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMq_PesI_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               AV36Modif = OV36Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV36Modif", AV36Modif);
               update10K1117( ) ;
               GX_FocusControl = edtMq_PesI_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A7956Mq_CodM, Z7956Mq_CodM) != 0 ) || ( A7783Mq_LinP != Z7783Mq_LinP ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               AV36Modif = OV36Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV36Modif", AV36Modif);
               GX_FocusControl = edtMq_PesI_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert10K1117( ) ;
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
                  AV36Modif = OV36Modif ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV36Modif", AV36Modif);
                  GX_FocusControl = edtMq_PesI_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert10K1117( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A7956Mq_CodM, Z7956Mq_CodM) != 0 ) || ( A7783Mq_LinP != Z7783Mq_LinP ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         AV36Modif = OV36Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Modif", AV36Modif);
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMq_PesI_Internalname ;
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
      getKey10K1117( ) ;
      if ( RcdFound1117 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A7956Mq_CodM, Z7956Mq_CodM) != 0 ) || ( A7783Mq_LinP != Z7783Mq_LinP ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A7956Mq_CodM, Z7956Mq_CodM) != 0 ) || ( A7783Mq_LinP != Z7783Mq_LinP ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttnartp");
      GX_FocusControl = edtMq_PesI_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_10K0( ) ;
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
      if ( RcdFound1117 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMq_PesI_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart10K1117( ) ;
      if ( RcdFound1117 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMq_PesI_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd10K1117( ) ;
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
      if ( RcdFound1117 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMq_PesI_Internalname ;
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
      if ( RcdFound1117 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMq_PesI_Internalname ;
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
      scanStart10K1117( ) ;
      if ( RcdFound1117 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1117 != 0 )
         {
            scanNext10K1117( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMq_PesI_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd10K1117( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency10K1117( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T010K5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTNART1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( DecimalUtil.compareTo(Z7784Mq_PesI, T010K5_A7784Mq_PesI[0]) != 0 ) || ( DecimalUtil.compareTo(Z7785Mq_PesF, T010K5_A7785Mq_PesF[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z7784Mq_PesI, T010K5_A7784Mq_PesI[0]) != 0 )
            {
               GXutil.writeLogln("ttnartp:[seudo value changed for attri]"+"Mq_PesI");
               GXutil.writeLogRaw("Old: ",Z7784Mq_PesI);
               GXutil.writeLogRaw("Current: ",T010K5_A7784Mq_PesI[0]);
            }
            if ( DecimalUtil.compareTo(Z7785Mq_PesF, T010K5_A7785Mq_PesF[0]) != 0 )
            {
               GXutil.writeLogln("ttnartp:[seudo value changed for attri]"+"Mq_PesF");
               GXutil.writeLogRaw("Old: ",Z7785Mq_PesF);
               GXutil.writeLogRaw("Current: ",T010K5_A7785Mq_PesF[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTNART1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert10K1117( )
   {
      beforeValidate10K1117( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10K1117( ) ;
      }
      if ( AnyError == 0 )
      {
         zm10K1117( 0) ;
         checkOptimisticConcurrency10K1117( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10K1117( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert10K1117( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010K15 */
                  pr_default.execute(13, new Object[] {Short.valueOf(A7783Mq_LinP), Boolean.valueOf(n7784Mq_PesI), A7784Mq_PesI, Boolean.valueOf(n7785Mq_PesF), A7785Mq_PesF, Boolean.valueOf(n7786Mq_ObsT), A7786Mq_ObsT, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTNART1");
                  if ( (pr_default.getStatus(13) == 1) )
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
                        processLevel10K1117( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption10K0( ) ;
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
            load10K1117( ) ;
         }
         endLevel10K1117( ) ;
      }
      closeExtendedTableCursors10K1117( ) ;
   }

   public void update10K1117( )
   {
      beforeValidate10K1117( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10K1117( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10K1117( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10K1117( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate10K1117( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010K16 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n7784Mq_PesI), A7784Mq_PesI, Boolean.valueOf(n7785Mq_PesF), A7785Mq_PesF, Boolean.valueOf(n7786Mq_ObsT), A7786Mq_ObsT, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTNART1");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTNART1"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate10K1117( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel10K1117( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption10K0( ) ;
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
         endLevel10K1117( ) ;
      }
      closeExtendedTableCursors10K1117( ) ;
   }

   public void deferredUpdate10K1117( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate10K1117( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10K1117( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls10K1117( ) ;
         afterConfirm10K1117( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete10K1117( ) ;
            if ( AnyError == 0 )
            {
               AV36Modif = OV36Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV36Modif", AV36Modif);
               scanStart10K1125( ) ;
               while ( RcdFound1125 != 0 )
               {
                  getByPrimaryKey10K1125( ) ;
                  delete10K1125( ) ;
                  scanNext10K1125( ) ;
                  OV36Modif = AV36Modif ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV36Modif", AV36Modif);
               }
               scanEnd10K1125( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010K17 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTNART1");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1117 == 0 )
                        {
                           initAll10K1117( ) ;
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
                        resetCaption10K0( ) ;
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
      sMode1117 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel10K1117( ) ;
      Gx_mode = sMode1117 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls10K1117( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel10K1125( )
   {
      sV36Modif = OV36Modif ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Modif", AV36Modif);
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRow10K1125( ) ;
         if ( ( nRcdExists_1125 != 0 ) || ( nIsMod_1125 != 0 ) )
         {
            standaloneNotModal10K1125( ) ;
            getKey10K1125( ) ;
            if ( ( nRcdExists_1125 == 0 ) && ( nRcdDeleted_1125 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert10K1125( ) ;
            }
            else
            {
               if ( RcdFound1125 != 0 )
               {
                  if ( ( nRcdDeleted_1125 != 0 ) && ( nRcdExists_1125 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete10K1125( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1125 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update10K1125( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1125 == 0 )
                  {
                     GXCCtl = "PAR_ART_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPar_Art_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            OV36Modif = AV36Modif ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36Modif", AV36Modif);
         }
         httpContext.changePostValue( edtavnRcdDeleted_1125_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPar_Art_Internalname, GXutil.ltrim( localUtil.ntoc( A7949Par_Art, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPar_Dsc_Internalname, GXutil.rtrim( A7950Par_Dsc)) ;
         httpContext.changePostValue( edtPar_Valor_Internalname, GXutil.rtrim( A7952Par_Valor)) ;
         httpContext.changePostValue( edtPar_Obs_Internalname, A7953Par_Obs) ;
         httpContext.changePostValue( edtPar_UsuA_Internalname, GXutil.rtrim( A10573Par_UsuA)) ;
         httpContext.changePostValue( edtPar_FecA_Internalname, localUtil.ttoc( A10574Par_FecA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtPar_UsuM_Internalname, GXutil.rtrim( A10575Par_UsuM)) ;
         httpContext.changePostValue( edtPar_FecM_Internalname, localUtil.ttoc( A10576Par_FecM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z7949Par_Art_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z7949Par_Art, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10573Par_UsuA_"+sGXsfl_80_idx, GXutil.rtrim( Z10573Par_UsuA)) ;
         httpContext.changePostValue( "ZT_"+"Z10574Par_FecA_"+sGXsfl_80_idx, localUtil.ttoc( Z10574Par_FecA, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10575Par_UsuM_"+sGXsfl_80_idx, GXutil.rtrim( Z10575Par_UsuM)) ;
         httpContext.changePostValue( "ZT_"+"Z10576Par_FecM_"+sGXsfl_80_idx, localUtil.ttoc( Z10576Par_FecM, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z7952Par_Valor_"+sGXsfl_80_idx, GXutil.rtrim( Z7952Par_Valor)) ;
         httpContext.changePostValue( "ZT_"+"Z7953Par_Obs_"+sGXsfl_80_idx, Z7953Par_Obs) ;
         httpContext.changePostValue( "T7952Par_Valor_"+sGXsfl_80_idx, GXutil.rtrim( O7952Par_Valor)) ;
         httpContext.changePostValue( "T7949Par_Art_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( O7949Par_Art, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1125_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1125_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1125_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1125 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1125_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1125_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_ART_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_Art_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_DSC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_Dsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_VALOR_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_Valor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_OBS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_Obs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_USUA_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_UsuA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_FECA_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_FecA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_USUM_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_UsuM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_FECM_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_FecM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll10K1125( ) ;
      if ( AnyError != 0 )
      {
         OV36Modif = sV36Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Modif", AV36Modif);
      }
      nRcdExists_1125 = (short)(0) ;
      nIsMod_1125 = (short)(0) ;
      nRcdDeleted_1125 = (short)(0) ;
   }

   public void processLevel10K1117( )
   {
      /* Save parent mode. */
      sMode1117 = Gx_mode ;
      processNestedLevel10K1125( ) ;
      if ( AnyError != 0 )
      {
         OV36Modif = sV36Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Modif", AV36Modif);
      }
      /* Restore parent mode. */
      Gx_mode = sMode1117 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel10K1117( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete10K1117( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttnartp");
         if ( AnyError == 0 )
         {
            confirmValues10K0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttnartp");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart10K1117( )
   {
      /* Scan By routine */
      /* Using cursor T010K18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP)});
      RcdFound1117 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1117 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext10K1117( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound1117 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1117 = (short)(1) ;
      }
   }

   public void scanEnd10K1117( )
   {
      pr_default.close(16);
   }

   public void afterConfirm10K1117( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert10K1117( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate10K1117( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete10K1117( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete10K1117( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate10K1117( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes10K1117( )
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
      edtMq_CodM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_CodM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_CodM_Enabled), 5, 0), true);
      edtMq_DscM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_DscM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_DscM_Enabled), 5, 0), true);
      edtMq_LinP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_LinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_LinP_Enabled), 5, 0), true);
      edtMq_PesI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_PesI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_PesI_Enabled), 5, 0), true);
      edtMq_PesF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_PesF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_PesF_Enabled), 5, 0), true);
      edtMq_ObsT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_ObsT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_ObsT_Enabled), 5, 0), true);
   }

   public void zm10K1125( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10573Par_UsuA = T010K3_A10573Par_UsuA[0] ;
            Z10574Par_FecA = T010K3_A10574Par_FecA[0] ;
            Z10575Par_UsuM = T010K3_A10575Par_UsuM[0] ;
            Z10576Par_FecM = T010K3_A10576Par_FecM[0] ;
            Z7952Par_Valor = T010K3_A7952Par_Valor[0] ;
            Z7953Par_Obs = T010K3_A7953Par_Obs[0] ;
         }
         else
         {
            Z10573Par_UsuA = A10573Par_UsuA ;
            Z10574Par_FecA = A10574Par_FecA ;
            Z10575Par_UsuM = A10575Par_UsuM ;
            Z10576Par_FecM = A10576Par_FecM ;
            Z7952Par_Valor = A7952Par_Valor ;
            Z7953Par_Obs = A7953Par_Obs ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z7956Mq_CodM = A7956Mq_CodM ;
         Z7783Mq_LinP = A7783Mq_LinP ;
         Z10573Par_UsuA = A10573Par_UsuA ;
         Z10574Par_FecA = A10574Par_FecA ;
         Z10575Par_UsuM = A10575Par_UsuM ;
         Z10576Par_FecM = A10576Par_FecM ;
         Z7952Par_Valor = A7952Par_Valor ;
         Z7953Par_Obs = A7953Par_Obs ;
         Z396EmprCod = A396EmprCod ;
         Z7949Par_Art = A7949Par_Art ;
         Z7950Par_Dsc = A7950Par_Dsc ;
      }
   }

   public void standaloneNotModal10K1125( )
   {
      edtPar_FecA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_FecA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_FecA_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtPar_FecM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_FecM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_FecM_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtPar_UsuA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_UsuA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_UsuA_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtPar_UsuM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_UsuM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_UsuM_Enabled), 5, 0), !bGXsfl_80_Refreshing);
   }

   public void standaloneModal10K1125( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         AV36Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Modif", AV36Modif);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10573Par_UsuA)==0) && ( Gx_BScreen == 0 ) )
      {
         A10573Par_UsuA = AV17UsurCod ;
         n10573Par_UsuA = false ;
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A10574Par_FecA) && ( Gx_BScreen == 0 ) )
      {
         A10574Par_FecA = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n10574Par_FecA = false ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPar_Art_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPar_Art_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_Art_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
      else
      {
         edtPar_Art_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPar_Art_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_Art_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
   }

   public void load10K1125( )
   {
      /* Using cursor T010K19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP), Short.valueOf(A7949Par_Art)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1125 = (short)(1) ;
         A10573Par_UsuA = T010K19_A10573Par_UsuA[0] ;
         n10573Par_UsuA = T010K19_n10573Par_UsuA[0] ;
         A10574Par_FecA = T010K19_A10574Par_FecA[0] ;
         n10574Par_FecA = T010K19_n10574Par_FecA[0] ;
         A10575Par_UsuM = T010K19_A10575Par_UsuM[0] ;
         n10575Par_UsuM = T010K19_n10575Par_UsuM[0] ;
         A10576Par_FecM = T010K19_A10576Par_FecM[0] ;
         n10576Par_FecM = T010K19_n10576Par_FecM[0] ;
         A7950Par_Dsc = T010K19_A7950Par_Dsc[0] ;
         n7950Par_Dsc = T010K19_n7950Par_Dsc[0] ;
         A7952Par_Valor = T010K19_A7952Par_Valor[0] ;
         n7952Par_Valor = T010K19_n7952Par_Valor[0] ;
         A7953Par_Obs = T010K19_A7953Par_Obs[0] ;
         n7953Par_Obs = T010K19_n7953Par_Obs[0] ;
         zm10K1125( -17) ;
      }
      pr_default.close(17);
      onLoadActions10K1125( ) ;
   }

   public void onLoadActions10K1125( )
   {
   }

   public void checkExtendedTable10K1125( )
   {
      nIsDirty_1125 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal10K1125( ) ;
      /* Using cursor T010K4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A7949Par_Art)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PAR_ART_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTPAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPar_Art_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A7950Par_Dsc = T010K4_A7950Par_Dsc[0] ;
      n7950Par_Dsc = T010K4_n7950Par_Dsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors10K1125( )
   {
      pr_default.close(2);
   }

   public void enableDisable10K1125( )
   {
   }

   public void gxload_18( String A396EmprCod ,
                          short A7949Par_Art )
   {
      /* Using cursor T010K20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Short.valueOf(A7949Par_Art)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         GXCCtl = "PAR_ART_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTPAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPar_Art_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A7950Par_Dsc = T010K20_A7950Par_Dsc[0] ;
      n7950Par_Dsc = T010K20_n7950Par_Dsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7950Par_Dsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void getKey10K1125( )
   {
      /* Using cursor T010K21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP), Short.valueOf(A7949Par_Art)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1125 = (short)(1) ;
      }
      else
      {
         RcdFound1125 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey10K1125( )
   {
      /* Using cursor T010K3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP), Short.valueOf(A7949Par_Art)});
      if ( (pr_default.getStatus(1) != 101) && ( T010K3_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T010K3_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T010K3_A7956Mq_CodM[0], A7956Mq_CodM) == 0 ) && ( T010K3_A7783Mq_LinP[0] == A7783Mq_LinP ) && ( GXutil.strcmp(T010K3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm10K1125( 17) ;
         RcdFound1125 = (short)(1) ;
         initializeNonKey10K1125( ) ;
         A10573Par_UsuA = T010K3_A10573Par_UsuA[0] ;
         n10573Par_UsuA = T010K3_n10573Par_UsuA[0] ;
         A10574Par_FecA = T010K3_A10574Par_FecA[0] ;
         n10574Par_FecA = T010K3_n10574Par_FecA[0] ;
         A10575Par_UsuM = T010K3_A10575Par_UsuM[0] ;
         n10575Par_UsuM = T010K3_n10575Par_UsuM[0] ;
         A10576Par_FecM = T010K3_A10576Par_FecM[0] ;
         n10576Par_FecM = T010K3_n10576Par_FecM[0] ;
         A7952Par_Valor = T010K3_A7952Par_Valor[0] ;
         n7952Par_Valor = T010K3_n7952Par_Valor[0] ;
         A7953Par_Obs = T010K3_A7953Par_Obs[0] ;
         n7953Par_Obs = T010K3_n7953Par_Obs[0] ;
         A7949Par_Art = T010K3_A7949Par_Art[0] ;
         O7952Par_Valor = A7952Par_Valor ;
         n7952Par_Valor = false ;
         O7949Par_Art = A7949Par_Art ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z7956Mq_CodM = A7956Mq_CodM ;
         Z7783Mq_LinP = A7783Mq_LinP ;
         Z7949Par_Art = A7949Par_Art ;
         sMode1125 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal10K1125( ) ;
         load10K1125( ) ;
         Gx_mode = sMode1125 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1125 = (short)(0) ;
         initializeNonKey10K1125( ) ;
         sMode1125 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal10K1125( ) ;
         Gx_mode = sMode1125 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes10K1125( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency10K1125( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T010K2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP), Short.valueOf(A7949Par_Art)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTNARTp"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10573Par_UsuA, T010K2_A10573Par_UsuA[0]) != 0 ) || !( GXutil.dateCompare(Z10574Par_FecA, T010K2_A10574Par_FecA[0]) ) || ( GXutil.strcmp(Z10575Par_UsuM, T010K2_A10575Par_UsuM[0]) != 0 ) || !( GXutil.dateCompare(Z10576Par_FecM, T010K2_A10576Par_FecM[0]) ) || ( GXutil.strcmp(Z7952Par_Valor, T010K2_A7952Par_Valor[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7953Par_Obs, T010K2_A7953Par_Obs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z10573Par_UsuA, T010K2_A10573Par_UsuA[0]) != 0 )
            {
               GXutil.writeLogln("ttnartp:[seudo value changed for attri]"+"Par_UsuA");
               GXutil.writeLogRaw("Old: ",Z10573Par_UsuA);
               GXutil.writeLogRaw("Current: ",T010K2_A10573Par_UsuA[0]);
            }
            if ( !( GXutil.dateCompare(Z10574Par_FecA, T010K2_A10574Par_FecA[0]) ) )
            {
               GXutil.writeLogln("ttnartp:[seudo value changed for attri]"+"Par_FecA");
               GXutil.writeLogRaw("Old: ",Z10574Par_FecA);
               GXutil.writeLogRaw("Current: ",T010K2_A10574Par_FecA[0]);
            }
            if ( GXutil.strcmp(Z10575Par_UsuM, T010K2_A10575Par_UsuM[0]) != 0 )
            {
               GXutil.writeLogln("ttnartp:[seudo value changed for attri]"+"Par_UsuM");
               GXutil.writeLogRaw("Old: ",Z10575Par_UsuM);
               GXutil.writeLogRaw("Current: ",T010K2_A10575Par_UsuM[0]);
            }
            if ( !( GXutil.dateCompare(Z10576Par_FecM, T010K2_A10576Par_FecM[0]) ) )
            {
               GXutil.writeLogln("ttnartp:[seudo value changed for attri]"+"Par_FecM");
               GXutil.writeLogRaw("Old: ",Z10576Par_FecM);
               GXutil.writeLogRaw("Current: ",T010K2_A10576Par_FecM[0]);
            }
            if ( GXutil.strcmp(Z7952Par_Valor, T010K2_A7952Par_Valor[0]) != 0 )
            {
               GXutil.writeLogln("ttnartp:[seudo value changed for attri]"+"Par_Valor");
               GXutil.writeLogRaw("Old: ",Z7952Par_Valor);
               GXutil.writeLogRaw("Current: ",T010K2_A7952Par_Valor[0]);
            }
            if ( GXutil.strcmp(Z7953Par_Obs, T010K2_A7953Par_Obs[0]) != 0 )
            {
               GXutil.writeLogln("ttnartp:[seudo value changed for attri]"+"Par_Obs");
               GXutil.writeLogRaw("Old: ",Z7953Par_Obs);
               GXutil.writeLogRaw("Current: ",T010K2_A7953Par_Obs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTNARTp"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert10K1125( )
   {
      beforeValidate10K1125( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10K1125( ) ;
      }
      if ( AnyError == 0 )
      {
         zm10K1125( 0) ;
         checkOptimisticConcurrency10K1125( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10K1125( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert10K1125( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010K22 */
                  pr_default.execute(20, new Object[] {Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP), Boolean.valueOf(n10573Par_UsuA), A10573Par_UsuA, Boolean.valueOf(n10574Par_FecA), A10574Par_FecA, Boolean.valueOf(n10575Par_UsuM), A10575Par_UsuM, Boolean.valueOf(n10576Par_FecM), A10576Par_FecM, Boolean.valueOf(n7952Par_Valor), A7952Par_Valor, Boolean.valueOf(n7953Par_Obs), A7953Par_Obs, A396EmprCod, Short.valueOf(A7949Par_Art)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTNARTp");
                  if ( (pr_default.getStatus(20) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( ( ( ( ( A7949Par_Art != O7949Par_Art ) ) && true /* After */ ) || true /* After */ || isDlt( )  ) && true /* Level */ )
                     {
                        AV36Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV36Modif", AV36Modif);
                     }
                     else
                     {
                        if ( ( ( ( ( GXutil.strcmp(A7952Par_Valor, O7952Par_Valor) != 0 ) ) && true /* After */ ) || true /* After */ || isDlt( )  ) && true /* Level */ )
                        {
                           AV36Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV36Modif", AV36Modif);
                        }
                     }
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
            load10K1125( ) ;
         }
         endLevel10K1125( ) ;
      }
      closeExtendedTableCursors10K1125( ) ;
   }

   public void update10K1125( )
   {
      beforeValidate10K1125( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10K1125( ) ;
      }
      if ( ( nIsMod_1125 != 0 ) || ( nIsDirty_1125 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency10K1125( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm10K1125( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate10K1125( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T010K23 */
                     pr_default.execute(21, new Object[] {Boolean.valueOf(n10573Par_UsuA), A10573Par_UsuA, Boolean.valueOf(n10574Par_FecA), A10574Par_FecA, Boolean.valueOf(n10575Par_UsuM), A10575Par_UsuM, Boolean.valueOf(n10576Par_FecM), A10576Par_FecM, Boolean.valueOf(n7952Par_Valor), A7952Par_Valor, Boolean.valueOf(n7953Par_Obs), A7953Par_Obs, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP), Short.valueOf(A7949Par_Art)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTNARTp");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTNARTp"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate10K1125( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( ( ( ( ( A7949Par_Art != O7949Par_Art ) ) && true /* After */ ) || true /* After */ || isDlt( )  ) && true /* Level */ )
                        {
                           AV36Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV36Modif", AV36Modif);
                        }
                        else
                        {
                           if ( ( ( ( ( GXutil.strcmp(A7952Par_Valor, O7952Par_Valor) != 0 ) ) && true /* After */ ) || true /* After */ || isDlt( )  ) && true /* Level */ )
                           {
                              AV36Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV36Modif", AV36Modif);
                           }
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey10K1125( ) ;
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
            endLevel10K1125( ) ;
         }
      }
      closeExtendedTableCursors10K1125( ) ;
   }

   public void deferredUpdate10K1125( )
   {
   }

   public void delete10K1125( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate10K1125( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10K1125( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls10K1125( ) ;
         afterConfirm10K1125( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete10K1125( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T010K24 */
               pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP), Short.valueOf(A7949Par_Art)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTNARTp");
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
      sMode1125 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel10K1125( ) ;
      Gx_mode = sMode1125 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls10K1125( )
   {
      standaloneModal10K1125( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T010K25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Short.valueOf(A7949Par_Art)});
         A7950Par_Dsc = T010K25_A7950Par_Dsc[0] ;
         n7950Par_Dsc = T010K25_n7950Par_Dsc[0] ;
         pr_default.close(23);
      }
   }

   public void endLevel10K1125( )
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

   public void scanStart10K1125( )
   {
      /* Scan By routine */
      /* Using cursor T010K26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP)});
      RcdFound1125 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1125 = (short)(1) ;
         A7949Par_Art = T010K26_A7949Par_Art[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext10K1125( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound1125 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1125 = (short)(1) ;
         A7949Par_Art = T010K26_A7949Par_Art[0] ;
      }
   }

   public void scanEnd10K1125( )
   {
      pr_default.close(24);
   }

   public void afterConfirm10K1125( )
   {
      /* After Confirm Rules */
      if ( true /* After */ && ( ( GXutil.strcmp(A7952Par_Valor, O7952Par_Valor) != 0 ) ) )
      {
         A10575Par_UsuM = AV17UsurCod ;
         n10575Par_UsuM = false ;
      }
      if ( true /* After */ && ( ( GXutil.strcmp(A7952Par_Valor, O7952Par_Valor) != 0 ) ) )
      {
         A10576Par_FecM = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n10576Par_FecM = false ;
      }
   }

   public void beforeInsert10K1125( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate10K1125( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete10K1125( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete10K1125( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate10K1125( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes10K1125( )
   {
      edtPar_Art_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_Art_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_Art_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtPar_Dsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_Dsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_Dsc_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtPar_Valor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_Valor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_Valor_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtPar_Obs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_Obs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_Obs_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtPar_UsuA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_UsuA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_UsuA_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtPar_FecA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_FecA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_FecA_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtPar_UsuM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_UsuM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_UsuM_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtPar_FecM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_FecM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_FecM_Enabled), 5, 0), !bGXsfl_80_Refreshing);
   }

   public void send_integrity_lvl_hashes10K1125( )
   {
   }

   public void send_integrity_lvl_hashes10K1117( )
   {
   }

   public void subsflControlProps_801125( )
   {
      edtavnRcdDeleted_1125_Internalname = "vNRCDDELETED_1125_"+sGXsfl_80_idx ;
      edtPar_Art_Internalname = "PAR_ART_"+sGXsfl_80_idx ;
      edtPar_Dsc_Internalname = "PAR_DSC_"+sGXsfl_80_idx ;
      edtPar_Valor_Internalname = "PAR_VALOR_"+sGXsfl_80_idx ;
      edtPar_Obs_Internalname = "PAR_OBS_"+sGXsfl_80_idx ;
      edtPar_UsuA_Internalname = "PAR_USUA_"+sGXsfl_80_idx ;
      edtPar_FecA_Internalname = "PAR_FECA_"+sGXsfl_80_idx ;
      edtPar_UsuM_Internalname = "PAR_USUM_"+sGXsfl_80_idx ;
      edtPar_FecM_Internalname = "PAR_FECM_"+sGXsfl_80_idx ;
   }

   public void subsflControlProps_fel_801125( )
   {
      edtavnRcdDeleted_1125_Internalname = "vNRCDDELETED_1125_"+sGXsfl_80_fel_idx ;
      edtPar_Art_Internalname = "PAR_ART_"+sGXsfl_80_fel_idx ;
      edtPar_Dsc_Internalname = "PAR_DSC_"+sGXsfl_80_fel_idx ;
      edtPar_Valor_Internalname = "PAR_VALOR_"+sGXsfl_80_fel_idx ;
      edtPar_Obs_Internalname = "PAR_OBS_"+sGXsfl_80_fel_idx ;
      edtPar_UsuA_Internalname = "PAR_USUA_"+sGXsfl_80_fel_idx ;
      edtPar_FecA_Internalname = "PAR_FECA_"+sGXsfl_80_fel_idx ;
      edtPar_UsuM_Internalname = "PAR_USUM_"+sGXsfl_80_fel_idx ;
      edtPar_FecM_Internalname = "PAR_FECM_"+sGXsfl_80_fel_idx ;
   }

   public void addRow10K1125( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801125( ) ;
      sendRow10K1125( ) ;
   }

   public void sendRow10K1125( )
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
         if ( ((int)((nGXsfl_80_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1125_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1125_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1125_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1125), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1125), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1125_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1125_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1125_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPar_Art_Internalname,GXutil.ltrim( localUtil.ntoc( A7949Par_Art, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7949Par_Art), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPar_Art_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPar_Art_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPar_Dsc_Internalname,GXutil.rtrim( A7950Par_Dsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPar_Dsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPar_Dsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1125_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPar_Valor_Internalname,GXutil.rtrim( A7952Par_Valor),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPar_Valor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPar_Valor_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1125_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPar_Obs_Internalname,A7953Par_Obs,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPar_Obs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPar_Obs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(400),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPar_UsuA_Internalname,GXutil.rtrim( A10573Par_UsuA),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPar_UsuA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPar_UsuA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPar_FecA_Internalname,localUtil.ttoc( A10574Par_FecA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10574Par_FecA, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPar_FecA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPar_FecA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPar_UsuM_Internalname,GXutil.rtrim( A10575Par_UsuM),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPar_UsuM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPar_UsuM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPar_FecM_Internalname,localUtil.ttoc( A10576Par_FecM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10576Par_FecM, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPar_FecM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPar_FecM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes10K1125( ) ;
      GXCCtl = "Z7949Par_Art_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7949Par_Art, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10573Par_UsuA_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10573Par_UsuA));
      GXCCtl = "Z10574Par_FecA_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z10574Par_FecA, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z10575Par_UsuM_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10575Par_UsuM));
      GXCCtl = "Z10576Par_FecM_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z10576Par_FecM, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z7952Par_Valor_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7952Par_Valor));
      GXCCtl = "Z7953Par_Obs_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z7953Par_Obs);
      GXCCtl = "O7952Par_Valor_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O7952Par_Valor));
      GXCCtl = "O7949Par_Art_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O7949Par_Art, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1125_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1125_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1125_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODIF_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV36Modif));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1125_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1125_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAR_ART_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_Art_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAR_DSC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_Dsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAR_VALOR_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_Valor_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAR_OBS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_Obs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAR_USUA_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_UsuA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAR_FECA_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_FecA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAR_USUM_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_UsuM_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAR_FECM_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_FecM_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow10K1125( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801125( ) ;
      edtavnRcdDeleted_1125_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1125_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPar_Art_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_ART_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPar_Dsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_DSC_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPar_Valor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_VALOR_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPar_Obs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_OBS_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPar_UsuA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_USUA_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPar_FecA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_FECA_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPar_UsuM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_USUM_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPar_FecM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_FECM_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1125_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1125_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1125");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1125_Internalname ;
         wbErr = true ;
         nRcdDeleted_1125 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1125 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1125_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPar_Art_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPar_Art_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PAR_ART_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPar_Art_Internalname ;
         wbErr = true ;
         A7949Par_Art = (short)(0) ;
      }
      else
      {
         A7949Par_Art = (short)(localUtil.ctol( httpContext.cgiGet( edtPar_Art_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A7950Par_Dsc = httpContext.cgiGet( edtPar_Dsc_Internalname) ;
      n7950Par_Dsc = false ;
      A7952Par_Valor = httpContext.cgiGet( edtPar_Valor_Internalname) ;
      n7952Par_Valor = false ;
      A7953Par_Obs = httpContext.cgiGet( edtPar_Obs_Internalname) ;
      n7953Par_Obs = false ;
      A10573Par_UsuA = httpContext.cgiGet( edtPar_UsuA_Internalname) ;
      n10573Par_UsuA = false ;
      A10574Par_FecA = localUtil.ctot( httpContext.cgiGet( edtPar_FecA_Internalname)) ;
      n10574Par_FecA = false ;
      A10575Par_UsuM = httpContext.cgiGet( edtPar_UsuM_Internalname) ;
      n10575Par_UsuM = false ;
      A10576Par_FecM = localUtil.ctot( httpContext.cgiGet( edtPar_FecM_Internalname)) ;
      n10576Par_FecM = false ;
      GXCCtl = "Z7949Par_Art_" + sGXsfl_80_idx ;
      Z7949Par_Art = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10573Par_UsuA_" + sGXsfl_80_idx ;
      Z10573Par_UsuA = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10574Par_FecA_" + sGXsfl_80_idx ;
      Z10574Par_FecA = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z10575Par_UsuM_" + sGXsfl_80_idx ;
      Z10575Par_UsuM = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10576Par_FecM_" + sGXsfl_80_idx ;
      Z10576Par_FecM = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z7952Par_Valor_" + sGXsfl_80_idx ;
      Z7952Par_Valor = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7953Par_Obs_" + sGXsfl_80_idx ;
      Z7953Par_Obs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O7952Par_Valor_" + sGXsfl_80_idx ;
      O7952Par_Valor = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O7949Par_Art_" + sGXsfl_80_idx ;
      O7949Par_Art = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1125_" + sGXsfl_80_idx ;
      nRcdDeleted_1125 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1125_" + sGXsfl_80_idx ;
      nRcdExists_1125 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1125_" + sGXsfl_80_idx ;
      nIsMod_1125 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPar_FecM_Enabled = edtPar_FecM_Enabled ;
      defedtPar_UsuM_Enabled = edtPar_UsuM_Enabled ;
      defedtPar_FecA_Enabled = edtPar_FecA_Enabled ;
      defedtPar_UsuA_Enabled = edtPar_UsuA_Enabled ;
      defedtPar_Art_Enabled = edtPar_Art_Enabled ;
   }

   public void confirmValues10K0( )
   {
      nGXsfl_80_idx = 0 ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801125( ) ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_801125( ) ;
         httpContext.changePostValue( "Z7949Par_Art_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z7949Par_Art_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7949Par_Art_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z10573Par_UsuA_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z10573Par_UsuA_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10573Par_UsuA_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z10574Par_FecA_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z10574Par_FecA_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10574Par_FecA_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z10575Par_UsuM_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z10575Par_UsuM_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10575Par_UsuM_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z10576Par_FecM_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z10576Par_FecM_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10576Par_FecM_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z7952Par_Valor_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z7952Par_Valor_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7952Par_Valor_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z7953Par_Obs_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z7953Par_Obs_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7953Par_Obs_"+sGXsfl_80_idx) ;
      }
      httpContext.changePostValue( "O7952Par_Valor", httpContext.cgiGet( "T7952Par_Valor")) ;
      httpContext.deletePostValue( "T7952Par_Valor") ;
      httpContext.changePostValue( "O7949Par_Art", httpContext.cgiGet( "T7949Par_Art")) ;
      httpContext.deletePostValue( "T7949Par_Art") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttnartp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.rtrim(A7956Mq_CodM)),GXutil.URLEncode(GXutil.ltrimstr(A7783Mq_LinP,4,0)),GXutil.URLEncode(GXutil.rtrim(AV36Modif))}, new String[] {"EmprCod","CliCod","ArtCod","Mq_CodM","Mq_LinP","Modif"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z7956Mq_CodM", GXutil.rtrim( Z7956Mq_CodM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7783Mq_LinP", GXutil.ltrim( localUtil.ntoc( Z7783Mq_LinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7784Mq_PesI", GXutil.ltrim( localUtil.ntoc( Z7784Mq_PesI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7785Mq_PesF", GXutil.ltrim( localUtil.ntoc( Z7785Mq_PesF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_80", GXutil.ltrim( localUtil.ntoc( nGXsfl_80_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV38Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODIF", GXutil.rtrim( AV36Modif));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
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
      return formatLink("app.ttnartp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.rtrim(A7956Mq_CodM)),GXutil.URLEncode(GXutil.ltrimstr(A7783Mq_LinP,4,0)),GXutil.URLEncode(GXutil.rtrim(AV36Modif))}, new String[] {"EmprCod","CliCod","ArtCod","Mq_CodM","Mq_LinP","Modif"})  ;
   }

   public String getPgmname( )
   {
      return "TTNARTp" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PARAMETROS", "") ;
   }

   public void initializeNonKey10K1117( )
   {
      A7784Mq_PesI = DecimalUtil.ZERO ;
      n7784Mq_PesI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7784Mq_PesI", GXutil.ltrimstr( A7784Mq_PesI, 9, 2));
      A7785Mq_PesF = DecimalUtil.ZERO ;
      n7785Mq_PesF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7785Mq_PesF", GXutil.ltrimstr( A7785Mq_PesF, 9, 2));
      A7786Mq_ObsT = "" ;
      n7786Mq_ObsT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7786Mq_ObsT", A7786Mq_ObsT);
      Z7784Mq_PesI = DecimalUtil.ZERO ;
      Z7785Mq_PesF = DecimalUtil.ZERO ;
   }

   public void initAll10K1117( )
   {
      initializeNonKey10K1117( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey10K1125( )
   {
      A10575Par_UsuM = "" ;
      n10575Par_UsuM = false ;
      A10576Par_FecM = GXutil.resetTime( GXutil.nullDate() );
      n10576Par_FecM = false ;
      A7950Par_Dsc = "" ;
      n7950Par_Dsc = false ;
      A7952Par_Valor = "" ;
      n7952Par_Valor = false ;
      A7953Par_Obs = "" ;
      n7953Par_Obs = false ;
      A10573Par_UsuA = AV17UsurCod ;
      n10573Par_UsuA = false ;
      A10574Par_FecA = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n10574Par_FecA = false ;
      O7952Par_Valor = A7952Par_Valor ;
      n7952Par_Valor = false ;
      Z10573Par_UsuA = "" ;
      Z10574Par_FecA = GXutil.resetTime( GXutil.nullDate() );
      Z10575Par_UsuM = "" ;
      Z10576Par_FecM = GXutil.resetTime( GXutil.nullDate() );
      Z7952Par_Valor = "" ;
      Z7953Par_Obs = "" ;
   }

   public void initAll10K1125( )
   {
      A7949Par_Art = (short)(0) ;
      initializeNonKey10K1125( ) ;
   }

   public void standaloneModalInsert10K1125( )
   {
      A10573Par_UsuA = i10573Par_UsuA ;
      n10573Par_UsuA = false ;
      A10574Par_FecA = i10574Par_FecA ;
      n10574Par_FecA = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241534692", true, true);
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
      httpContext.AddJavascriptSource("ttnartp.js", "?20268241534692", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1125( )
   {
      edtPar_FecM_Enabled = defedtPar_FecM_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_FecM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_FecM_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtPar_UsuM_Enabled = defedtPar_UsuM_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_UsuM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_UsuM_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtPar_FecA_Enabled = defedtPar_FecA_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_FecA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_FecA_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtPar_UsuA_Enabled = defedtPar_UsuA_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_UsuA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_UsuA_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtPar_Art_Enabled = defedtPar_Art_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_Art_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_Art_Enabled), 5, 0), !bGXsfl_80_Refreshing);
   }

   public void startgridcontrol80( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1125, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1125_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7949Par_Art, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_Art_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7950Par_Dsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_Dsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7952Par_Valor));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_Valor_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A7953Par_Obs);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_Obs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10573Par_UsuA));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_UsuA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A10574Par_FecA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_FecA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10575Par_UsuM));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_UsuM_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A10576Par_FecM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_FecM_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtArtCod_Internalname = "ARTCOD" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtMq_CodM_Internalname = "MQ_CODM" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtMq_DscM_Internalname = "MQ_DSCM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtMq_LinP_Internalname = "MQ_LINP" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtMq_PesI_Internalname = "MQ_PESI" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtMq_PesF_Internalname = "MQ_PESF" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtMq_ObsT_Internalname = "MQ_OBST" ;
      edtavnRcdDeleted_1125_Internalname = "vNRCDDELETED_1125" ;
      edtPar_Art_Internalname = "PAR_ART" ;
      edtPar_Dsc_Internalname = "PAR_DSC" ;
      edtPar_Valor_Internalname = "PAR_VALOR" ;
      edtPar_Obs_Internalname = "PAR_OBS" ;
      edtPar_UsuA_Internalname = "PAR_USUA" ;
      edtPar_FecA_Internalname = "PAR_FECA" ;
      edtPar_UsuM_Internalname = "PAR_USUM" ;
      edtPar_FecM_Internalname = "PAR_FECM" ;
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
      Form.setCaption( httpContext.getMessage( "PARAMETROS", "") );
      edtPar_FecM_Jsonclick = "" ;
      edtPar_UsuM_Jsonclick = "" ;
      edtPar_FecA_Jsonclick = "" ;
      edtPar_UsuA_Jsonclick = "" ;
      edtPar_Obs_Jsonclick = "" ;
      edtPar_Valor_Jsonclick = "" ;
      edtPar_Dsc_Jsonclick = "" ;
      edtPar_Art_Jsonclick = "" ;
      edtavnRcdDeleted_1125_Jsonclick = "" ;
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
      edtPar_FecM_Enabled = 0 ;
      edtPar_UsuM_Enabled = 0 ;
      edtPar_FecA_Enabled = 0 ;
      edtPar_UsuA_Enabled = 0 ;
      edtPar_Obs_Enabled = 1 ;
      edtPar_Valor_Enabled = 1 ;
      edtPar_Dsc_Enabled = 0 ;
      edtPar_Art_Enabled = 1 ;
      edtavnRcdDeleted_1125_Enabled = 1 ;
      edtMq_ObsT_Backcolor = (int)(0xFFFFFF) ;
      edtMq_ObsT_Enabled = 1 ;
      edtMq_PesF_Jsonclick = "" ;
      edtMq_PesF_Backcolor = (int)(0xFFFFFF) ;
      edtMq_PesF_Enabled = 1 ;
      edtMq_PesI_Jsonclick = "" ;
      edtMq_PesI_Backcolor = (int)(0xFFFFFF) ;
      edtMq_PesI_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtMq_LinP_Jsonclick = "" ;
      edtMq_LinP_Backcolor = (int)(0xFFFFFF) ;
      edtMq_LinP_Enabled = 0 ;
      edtMq_DscM_Jsonclick = "" ;
      edtMq_DscM_Backcolor = (int)(0xFFFFFF) ;
      edtMq_DscM_Enabled = 0 ;
      edtMq_CodM_Jsonclick = "" ;
      edtMq_CodM_Backcolor = (int)(0xFFFFFF) ;
      edtMq_CodM_Enabled = 0 ;
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

   public void gx1asamq_dscm10K1117( String A396EmprCod ,
                                     String A7956Mq_CodM )
   {
      GXt_char4 = A7957Mq_DscM ;
      GXv_char3[0] = GXt_char4 ;
      new app.pobtmaq(remoteHandle, context).execute( A396EmprCod, A7956Mq_CodM, GXv_char3) ;
      ttnartp_impl.this.GXt_char4 = GXv_char3[0] ;
      A7957Mq_DscM = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7957Mq_DscM", A7957Mq_DscM);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7957Mq_DscM))+"\"") ;
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
      subsflControlProps_801125( ) ;
      while ( nGXsfl_80_idx <= nRC_GXsfl_80 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal10K1125( ) ;
         standaloneModal10K1125( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow10K1125( ) ;
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_801125( ) ;
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
      /* Using cursor T010K27 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T010K27_A407EmprNom[0] ;
      n407EmprNom = T010K27_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(25);
      /* Using cursor T010K28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T010K28_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(26);
      /* Using cursor T010K29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
      A69ArtDsc = T010K29_A69ArtDsc[0] ;
      n69ArtDsc = T010K29_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(27);
      /* Using cursor T010K30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TNART", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MQ_CODM");
         AnyError = (short)(1) ;
      }
      pr_default.close(28);
      GX_FocusControl = edtMq_PesI_Internalname ;
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

   public void valid_Mq_linp( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7957Mq_DscM", GXutil.rtrim( A7957Mq_DscM));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A7784Mq_PesI", GXutil.ltrim( localUtil.ntoc( A7784Mq_PesI, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7785Mq_PesF", GXutil.ltrim( localUtil.ntoc( A7785Mq_PesF, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7786Mq_ObsT", A7786Mq_ObsT);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7956Mq_CodM", GXutil.rtrim( Z7956Mq_CodM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7783Mq_LinP", GXutil.ltrim( localUtil.ntoc( Z7783Mq_LinP, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7957Mq_DscM", GXutil.rtrim( Z7957Mq_DscM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7784Mq_PesI", GXutil.ltrim( localUtil.ntoc( Z7784Mq_PesI, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7785Mq_PesF", GXutil.ltrim( localUtil.ntoc( Z7785Mq_PesF, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7786Mq_ObsT", Z7786Mq_ObsT);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Par_art( )
   {
      n7950Par_Dsc = false ;
      /* Using cursor T010K25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Short.valueOf(A7949Par_Art)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTPAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PAR_ART");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPar_Art_Internalname ;
      }
      A7950Par_Dsc = T010K25_A7950Par_Dsc[0] ;
      n7950Par_Dsc = T010K25_n7950Par_Dsc[0] ;
      pr_default.close(23);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7950Par_Dsc", GXutil.rtrim( A7950Par_Dsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A7956Mq_CodM',fld:'MQ_CODM',pic:''},{av:'A7783Mq_LinP',fld:'MQ_LINP',pic:'ZZZ9'},{av:'AV36Modif',fld:'vMODIF',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[]");
      setEventMetadata("VALID_ARTCOD",",oparms:[]}");
      setEventMetadata("VALID_MQ_CODM","{handler:'valid_Mq_codm',iparms:[]");
      setEventMetadata("VALID_MQ_CODM",",oparms:[]}");
      setEventMetadata("VALID_MQ_LINP","{handler:'valid_Mq_linp',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A7956Mq_CodM',fld:'MQ_CODM',pic:''},{av:'A7783Mq_LinP',fld:'MQ_LINP',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MQ_LINP",",oparms:[{av:'A7957Mq_DscM',fld:'MQ_DSCM',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'A7784Mq_PesI',fld:'MQ_PESI',pic:'ZZZZZ9.99'},{av:'A7785Mq_PesF',fld:'MQ_PESF',pic:'ZZZZZ9.99'},{av:'A7786Mq_ObsT',fld:'MQ_OBST',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z7956Mq_CodM'},{av:'Z7783Mq_LinP'},{av:'Z7957Mq_DscM'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z69ArtDsc'},{av:'Z7784Mq_PesI'},{av:'Z7785Mq_PesF'},{av:'Z7786Mq_ObsT'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_PAR_ART","{handler:'valid_Par_art',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7949Par_Art',fld:'PAR_ART',pic:'ZZZ9'},{av:'A7950Par_Dsc',fld:'PAR_DSC',pic:''}]");
      setEventMetadata("VALID_PAR_ART",",oparms:[{av:'A7950Par_Dsc',fld:'PAR_DSC',pic:''}]}");
      setEventMetadata("VALID_PAR_VALOR","{handler:'valid_Par_valor',iparms:[]");
      setEventMetadata("VALID_PAR_VALOR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Par_fecm',iparms:[]");
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
      pr_default.close(27);
      pr_default.close(26);
      pr_default.close(25);
      pr_default.close(28);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA65ArtCod = "" ;
      wcpOA7956Mq_CodM = "" ;
      wcpOAV36Modif = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z7956Mq_CodM = "" ;
      Z7784Mq_PesI = DecimalUtil.ZERO ;
      Z7785Mq_PesF = DecimalUtil.ZERO ;
      Z10573Par_UsuA = "" ;
      Z10574Par_FecA = GXutil.resetTime( GXutil.nullDate() );
      Z10575Par_UsuM = "" ;
      Z10576Par_FecM = GXutil.resetTime( GXutil.nullDate() );
      Z7952Par_Valor = "" ;
      Z7953Par_Obs = "" ;
      O7952Par_Valor = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A7956Mq_CodM = "" ;
      A65ArtCod = "" ;
      AV36Modif = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      AV17UsurCod = "" ;
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
      lblTextblock8_Jsonclick = "" ;
      A7957Mq_DscM = "" ;
      lblTextblock9_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A7784Mq_PesI = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      A7785Mq_PesF = DecimalUtil.ZERO ;
      lblTextblock12_Jsonclick = "" ;
      A7786Mq_ObsT = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1125 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV38Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1117 = "" ;
      sV36Modif = "" ;
      GXCCtl = "" ;
      A7950Par_Dsc = "" ;
      A7952Par_Valor = "" ;
      A7953Par_Obs = "" ;
      A10573Par_UsuA = "" ;
      A10574Par_FecA = GXutil.resetTime( GXutil.nullDate() );
      A10575Par_UsuM = "" ;
      A10576Par_FecM = GXutil.resetTime( GXutil.nullDate() );
      T7952Par_Valor = "" ;
      AV22Station = "" ;
      GXv_char1 = new String[1] ;
      AV16EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV24LitFe = "" ;
      AV23Lit0 = "" ;
      AV18Lit1 = "" ;
      AV19Lit2 = "" ;
      AV20Lit3 = "" ;
      AV21Lit4 = "" ;
      AV27Lit5 = "" ;
      AV28Lit6 = "" ;
      AV30Lit7 = "" ;
      AV29Lit8 = "" ;
      AV31Lit9 = "" ;
      AV32Lit10 = "" ;
      AV34Lit11 = "" ;
      AV35Lit12 = "" ;
      Z7786Mq_ObsT = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z69ArtDsc = "" ;
      T010K7_A407EmprNom = new String[] {""} ;
      T010K7_n407EmprNom = new boolean[] {false} ;
      T010K8_A279CliNom = new String[] {""} ;
      T010K9_A69ArtDsc = new String[] {""} ;
      T010K9_n69ArtDsc = new boolean[] {false} ;
      T010K10_A396EmprCod = new String[] {""} ;
      T010K11_A7786Mq_ObsT = new String[] {""} ;
      T010K11_n7786Mq_ObsT = new boolean[] {false} ;
      T010K11_A7783Mq_LinP = new short[1] ;
      T010K11_A407EmprNom = new String[] {""} ;
      T010K11_n407EmprNom = new boolean[] {false} ;
      T010K11_A279CliNom = new String[] {""} ;
      T010K11_A69ArtDsc = new String[] {""} ;
      T010K11_n69ArtDsc = new boolean[] {false} ;
      T010K11_A7784Mq_PesI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010K11_n7784Mq_PesI = new boolean[] {false} ;
      T010K11_A7785Mq_PesF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010K11_n7785Mq_PesF = new boolean[] {false} ;
      T010K11_A396EmprCod = new String[] {""} ;
      T010K11_A252CliCod = new int[1] ;
      T010K11_A65ArtCod = new String[] {""} ;
      T010K11_A7956Mq_CodM = new String[] {""} ;
      T010K12_A396EmprCod = new String[] {""} ;
      T010K12_A252CliCod = new int[1] ;
      T010K12_A65ArtCod = new String[] {""} ;
      T010K12_A7956Mq_CodM = new String[] {""} ;
      T010K12_A7783Mq_LinP = new short[1] ;
      T010K6_A7786Mq_ObsT = new String[] {""} ;
      T010K6_n7786Mq_ObsT = new boolean[] {false} ;
      T010K6_A7783Mq_LinP = new short[1] ;
      T010K6_A7784Mq_PesI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010K6_n7784Mq_PesI = new boolean[] {false} ;
      T010K6_A7785Mq_PesF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010K6_n7785Mq_PesF = new boolean[] {false} ;
      T010K6_A396EmprCod = new String[] {""} ;
      T010K6_A252CliCod = new int[1] ;
      T010K6_A65ArtCod = new String[] {""} ;
      T010K6_A7956Mq_CodM = new String[] {""} ;
      T010K13_A396EmprCod = new String[] {""} ;
      T010K13_A252CliCod = new int[1] ;
      T010K13_A65ArtCod = new String[] {""} ;
      T010K13_A7956Mq_CodM = new String[] {""} ;
      T010K13_A7783Mq_LinP = new short[1] ;
      T010K14_A396EmprCod = new String[] {""} ;
      T010K14_A252CliCod = new int[1] ;
      T010K14_A65ArtCod = new String[] {""} ;
      T010K14_A7956Mq_CodM = new String[] {""} ;
      T010K14_A7783Mq_LinP = new short[1] ;
      T010K5_A7786Mq_ObsT = new String[] {""} ;
      T010K5_n7786Mq_ObsT = new boolean[] {false} ;
      T010K5_A7783Mq_LinP = new short[1] ;
      T010K5_A7784Mq_PesI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010K5_n7784Mq_PesI = new boolean[] {false} ;
      T010K5_A7785Mq_PesF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010K5_n7785Mq_PesF = new boolean[] {false} ;
      T010K5_A396EmprCod = new String[] {""} ;
      T010K5_A252CliCod = new int[1] ;
      T010K5_A65ArtCod = new String[] {""} ;
      T010K5_A7956Mq_CodM = new String[] {""} ;
      T010K18_A396EmprCod = new String[] {""} ;
      T010K18_A252CliCod = new int[1] ;
      T010K18_A65ArtCod = new String[] {""} ;
      T010K18_A7956Mq_CodM = new String[] {""} ;
      T010K18_A7783Mq_LinP = new short[1] ;
      Z7950Par_Dsc = "" ;
      T010K19_A252CliCod = new int[1] ;
      T010K19_A65ArtCod = new String[] {""} ;
      T010K19_A7956Mq_CodM = new String[] {""} ;
      T010K19_A7783Mq_LinP = new short[1] ;
      T010K19_A10573Par_UsuA = new String[] {""} ;
      T010K19_n10573Par_UsuA = new boolean[] {false} ;
      T010K19_A10574Par_FecA = new java.util.Date[] {GXutil.nullDate()} ;
      T010K19_n10574Par_FecA = new boolean[] {false} ;
      T010K19_A10575Par_UsuM = new String[] {""} ;
      T010K19_n10575Par_UsuM = new boolean[] {false} ;
      T010K19_A10576Par_FecM = new java.util.Date[] {GXutil.nullDate()} ;
      T010K19_n10576Par_FecM = new boolean[] {false} ;
      T010K19_A7950Par_Dsc = new String[] {""} ;
      T010K19_n7950Par_Dsc = new boolean[] {false} ;
      T010K19_A7952Par_Valor = new String[] {""} ;
      T010K19_n7952Par_Valor = new boolean[] {false} ;
      T010K19_A7953Par_Obs = new String[] {""} ;
      T010K19_n7953Par_Obs = new boolean[] {false} ;
      T010K19_A396EmprCod = new String[] {""} ;
      T010K19_A7949Par_Art = new short[1] ;
      T010K4_A7950Par_Dsc = new String[] {""} ;
      T010K4_n7950Par_Dsc = new boolean[] {false} ;
      T010K20_A7950Par_Dsc = new String[] {""} ;
      T010K20_n7950Par_Dsc = new boolean[] {false} ;
      T010K21_A396EmprCod = new String[] {""} ;
      T010K21_A252CliCod = new int[1] ;
      T010K21_A65ArtCod = new String[] {""} ;
      T010K21_A7956Mq_CodM = new String[] {""} ;
      T010K21_A7783Mq_LinP = new short[1] ;
      T010K21_A7949Par_Art = new short[1] ;
      T010K3_A252CliCod = new int[1] ;
      T010K3_A65ArtCod = new String[] {""} ;
      T010K3_A7956Mq_CodM = new String[] {""} ;
      T010K3_A7783Mq_LinP = new short[1] ;
      T010K3_A10573Par_UsuA = new String[] {""} ;
      T010K3_n10573Par_UsuA = new boolean[] {false} ;
      T010K3_A10574Par_FecA = new java.util.Date[] {GXutil.nullDate()} ;
      T010K3_n10574Par_FecA = new boolean[] {false} ;
      T010K3_A10575Par_UsuM = new String[] {""} ;
      T010K3_n10575Par_UsuM = new boolean[] {false} ;
      T010K3_A10576Par_FecM = new java.util.Date[] {GXutil.nullDate()} ;
      T010K3_n10576Par_FecM = new boolean[] {false} ;
      T010K3_A7952Par_Valor = new String[] {""} ;
      T010K3_n7952Par_Valor = new boolean[] {false} ;
      T010K3_A7953Par_Obs = new String[] {""} ;
      T010K3_n7953Par_Obs = new boolean[] {false} ;
      T010K3_A396EmprCod = new String[] {""} ;
      T010K3_A7949Par_Art = new short[1] ;
      T010K2_A252CliCod = new int[1] ;
      T010K2_A65ArtCod = new String[] {""} ;
      T010K2_A7956Mq_CodM = new String[] {""} ;
      T010K2_A7783Mq_LinP = new short[1] ;
      T010K2_A10573Par_UsuA = new String[] {""} ;
      T010K2_n10573Par_UsuA = new boolean[] {false} ;
      T010K2_A10574Par_FecA = new java.util.Date[] {GXutil.nullDate()} ;
      T010K2_n10574Par_FecA = new boolean[] {false} ;
      T010K2_A10575Par_UsuM = new String[] {""} ;
      T010K2_n10575Par_UsuM = new boolean[] {false} ;
      T010K2_A10576Par_FecM = new java.util.Date[] {GXutil.nullDate()} ;
      T010K2_n10576Par_FecM = new boolean[] {false} ;
      T010K2_A7952Par_Valor = new String[] {""} ;
      T010K2_n7952Par_Valor = new boolean[] {false} ;
      T010K2_A7953Par_Obs = new String[] {""} ;
      T010K2_n7953Par_Obs = new boolean[] {false} ;
      T010K2_A396EmprCod = new String[] {""} ;
      T010K2_A7949Par_Art = new short[1] ;
      T010K25_A7950Par_Dsc = new String[] {""} ;
      T010K25_n7950Par_Dsc = new boolean[] {false} ;
      T010K26_A396EmprCod = new String[] {""} ;
      T010K26_A252CliCod = new int[1] ;
      T010K26_A65ArtCod = new String[] {""} ;
      T010K26_A7956Mq_CodM = new String[] {""} ;
      T010K26_A7783Mq_LinP = new short[1] ;
      T010K26_A7949Par_Art = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i10573Par_UsuA = "" ;
      i10574Par_FecA = GXutil.resetTime( GXutil.nullDate() );
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXt_char4 = "" ;
      GXv_char3 = new String[1] ;
      T010K27_A407EmprNom = new String[] {""} ;
      T010K27_n407EmprNom = new boolean[] {false} ;
      T010K28_A279CliNom = new String[] {""} ;
      T010K29_A69ArtDsc = new String[] {""} ;
      T010K29_n69ArtDsc = new boolean[] {false} ;
      T010K30_A396EmprCod = new String[] {""} ;
      Z7957Mq_DscM = "" ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ7956Mq_CodM = "" ;
      ZZ7957Mq_DscM = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ69ArtDsc = "" ;
      ZZ7784Mq_PesI = DecimalUtil.ZERO ;
      ZZ7785Mq_PesF = DecimalUtil.ZERO ;
      ZZ7786Mq_ObsT = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttnartp__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttnartp__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttnartp__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttnartp__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttnartp__default(),
         new Object[] {
             new Object[] {
            T010K2_A252CliCod, T010K2_A65ArtCod, T010K2_A7956Mq_CodM, T010K2_A7783Mq_LinP, T010K2_A10573Par_UsuA, T010K2_n10573Par_UsuA, T010K2_A10574Par_FecA, T010K2_n10574Par_FecA, T010K2_A10575Par_UsuM, T010K2_n10575Par_UsuM,
            T010K2_A10576Par_FecM, T010K2_n10576Par_FecM, T010K2_A7952Par_Valor, T010K2_n7952Par_Valor, T010K2_A7953Par_Obs, T010K2_n7953Par_Obs, T010K2_A396EmprCod, T010K2_A7949Par_Art
            }
            , new Object[] {
            T010K3_A252CliCod, T010K3_A65ArtCod, T010K3_A7956Mq_CodM, T010K3_A7783Mq_LinP, T010K3_A10573Par_UsuA, T010K3_n10573Par_UsuA, T010K3_A10574Par_FecA, T010K3_n10574Par_FecA, T010K3_A10575Par_UsuM, T010K3_n10575Par_UsuM,
            T010K3_A10576Par_FecM, T010K3_n10576Par_FecM, T010K3_A7952Par_Valor, T010K3_n7952Par_Valor, T010K3_A7953Par_Obs, T010K3_n7953Par_Obs, T010K3_A396EmprCod, T010K3_A7949Par_Art
            }
            , new Object[] {
            T010K4_A7950Par_Dsc, T010K4_n7950Par_Dsc
            }
            , new Object[] {
            T010K5_A7786Mq_ObsT, T010K5_n7786Mq_ObsT, T010K5_A7783Mq_LinP, T010K5_A7784Mq_PesI, T010K5_n7784Mq_PesI, T010K5_A7785Mq_PesF, T010K5_n7785Mq_PesF, T010K5_A396EmprCod, T010K5_A252CliCod, T010K5_A65ArtCod,
            T010K5_A7956Mq_CodM
            }
            , new Object[] {
            T010K6_A7786Mq_ObsT, T010K6_n7786Mq_ObsT, T010K6_A7783Mq_LinP, T010K6_A7784Mq_PesI, T010K6_n7784Mq_PesI, T010K6_A7785Mq_PesF, T010K6_n7785Mq_PesF, T010K6_A396EmprCod, T010K6_A252CliCod, T010K6_A65ArtCod,
            T010K6_A7956Mq_CodM
            }
            , new Object[] {
            T010K7_A407EmprNom, T010K7_n407EmprNom
            }
            , new Object[] {
            T010K8_A279CliNom
            }
            , new Object[] {
            T010K9_A69ArtDsc, T010K9_n69ArtDsc
            }
            , new Object[] {
            T010K10_A396EmprCod
            }
            , new Object[] {
            T010K11_A7786Mq_ObsT, T010K11_n7786Mq_ObsT, T010K11_A7783Mq_LinP, T010K11_A407EmprNom, T010K11_n407EmprNom, T010K11_A279CliNom, T010K11_A69ArtDsc, T010K11_n69ArtDsc, T010K11_A7784Mq_PesI, T010K11_n7784Mq_PesI,
            T010K11_A7785Mq_PesF, T010K11_n7785Mq_PesF, T010K11_A396EmprCod, T010K11_A252CliCod, T010K11_A65ArtCod, T010K11_A7956Mq_CodM
            }
            , new Object[] {
            T010K12_A396EmprCod, T010K12_A252CliCod, T010K12_A65ArtCod, T010K12_A7956Mq_CodM, T010K12_A7783Mq_LinP
            }
            , new Object[] {
            T010K13_A396EmprCod, T010K13_A252CliCod, T010K13_A65ArtCod, T010K13_A7956Mq_CodM, T010K13_A7783Mq_LinP
            }
            , new Object[] {
            T010K14_A396EmprCod, T010K14_A252CliCod, T010K14_A65ArtCod, T010K14_A7956Mq_CodM, T010K14_A7783Mq_LinP
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T010K18_A396EmprCod, T010K18_A252CliCod, T010K18_A65ArtCod, T010K18_A7956Mq_CodM, T010K18_A7783Mq_LinP
            }
            , new Object[] {
            T010K19_A252CliCod, T010K19_A65ArtCod, T010K19_A7956Mq_CodM, T010K19_A7783Mq_LinP, T010K19_A10573Par_UsuA, T010K19_n10573Par_UsuA, T010K19_A10574Par_FecA, T010K19_n10574Par_FecA, T010K19_A10575Par_UsuM, T010K19_n10575Par_UsuM,
            T010K19_A10576Par_FecM, T010K19_n10576Par_FecM, T010K19_A7950Par_Dsc, T010K19_n7950Par_Dsc, T010K19_A7952Par_Valor, T010K19_n7952Par_Valor, T010K19_A7953Par_Obs, T010K19_n7953Par_Obs, T010K19_A396EmprCod, T010K19_A7949Par_Art
            }
            , new Object[] {
            T010K20_A7950Par_Dsc, T010K20_n7950Par_Dsc
            }
            , new Object[] {
            T010K21_A396EmprCod, T010K21_A252CliCod, T010K21_A65ArtCod, T010K21_A7956Mq_CodM, T010K21_A7783Mq_LinP, T010K21_A7949Par_Art
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T010K25_A7950Par_Dsc, T010K25_n7950Par_Dsc
            }
            , new Object[] {
            T010K26_A396EmprCod, T010K26_A252CliCod, T010K26_A65ArtCod, T010K26_A7956Mq_CodM, T010K26_A7783Mq_LinP, T010K26_A7949Par_Art
            }
            , new Object[] {
            T010K27_A407EmprNom, T010K27_n407EmprNom
            }
            , new Object[] {
            T010K28_A279CliNom
            }
            , new Object[] {
            T010K29_A69ArtDsc, T010K29_n69ArtDsc
            }
            , new Object[] {
            T010K30_A396EmprCod
            }
         }
      );
      Z7783Mq_LinP = (short)(0) ;
      A7783Mq_LinP = (short)(0) ;
      Z7956Mq_CodM = "" ;
      A7956Mq_CodM = "" ;
      Z65ArtCod = "" ;
      A65ArtCod = "" ;
      Z252CliCod = 0 ;
      A252CliCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV38Pgmname = "TTNARTp" ;
      Z10574Par_FecA = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n10574Par_FecA = false ;
      A10574Par_FecA = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n10574Par_FecA = false ;
      i10574Par_FecA = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n10574Par_FecA = false ;
      Z10573Par_UsuA = "" ;
      n10573Par_UsuA = false ;
      A10573Par_UsuA = "" ;
      n10573Par_UsuA = false ;
      i10573Par_UsuA = "" ;
      n10573Par_UsuA = false ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short wcpOA7783Mq_LinP ;
   private short Z7783Mq_LinP ;
   private short Z7949Par_Art ;
   private short O7949Par_Art ;
   private short nRcdDeleted_1125 ;
   private short nRcdExists_1125 ;
   private short nIsMod_1125 ;
   private short A7949Par_Art ;
   private short A7783Mq_LinP ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1125 ;
   private short RcdFound1125 ;
   private short nBlankRcdUsr1125 ;
   private short T7949Par_Art ;
   private short RcdFound1117 ;
   private short nIsDirty_1117 ;
   private short nIsDirty_1125 ;
   private short ZZ7783Mq_LinP ;
   private int wcpOA252CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_80 ;
   private int nGXsfl_80_idx=1 ;
   private int A252CliCod ;
   private int trnEnded ;
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
   private int edtMq_CodM_Enabled ;
   private int edtMq_DscM_Enabled ;
   private int edtMq_LinP_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtMq_PesI_Enabled ;
   private int edtMq_PesF_Enabled ;
   private int edtMq_ObsT_Enabled ;
   private int edtavnRcdDeleted_1125_Enabled ;
   private int edtPar_Art_Enabled ;
   private int edtPar_Dsc_Enabled ;
   private int edtPar_Valor_Enabled ;
   private int edtPar_Obs_Enabled ;
   private int edtPar_UsuA_Enabled ;
   private int edtPar_FecA_Enabled ;
   private int edtPar_UsuM_Enabled ;
   private int edtPar_FecM_Enabled ;
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
   private int defedtPar_FecM_Enabled ;
   private int defedtPar_UsuM_Enabled ;
   private int defedtPar_FecA_Enabled ;
   private int defedtPar_UsuA_Enabled ;
   private int defedtPar_Art_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtMq_ObsT_Backcolor ;
   private int edtMq_PesF_Backcolor ;
   private int edtMq_PesI_Backcolor ;
   private int edtMq_LinP_Backcolor ;
   private int edtMq_DscM_Backcolor ;
   private int edtMq_CodM_Backcolor ;
   private int edtArtDsc_Backcolor ;
   private int edtArtCod_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z7784Mq_PesI ;
   private java.math.BigDecimal Z7785Mq_PesF ;
   private java.math.BigDecimal A7784Mq_PesI ;
   private java.math.BigDecimal A7785Mq_PesF ;
   private java.math.BigDecimal ZZ7784Mq_PesI ;
   private java.math.BigDecimal ZZ7785Mq_PesF ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA65ArtCod ;
   private String wcpOA7956Mq_CodM ;
   private String wcpOAV36Modif ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z7956Mq_CodM ;
   private String Z10573Par_UsuA ;
   private String Z10575Par_UsuM ;
   private String Z7952Par_Valor ;
   private String O7952Par_Valor ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A7956Mq_CodM ;
   private String A65ArtCod ;
   private String AV36Modif ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMq_PesI_Internalname ;
   private String sGXsfl_80_idx="0001" ;
   private String AV17UsurCod ;
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
   private String edtMq_CodM_Internalname ;
   private String edtMq_CodM_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtMq_DscM_Internalname ;
   private String A7957Mq_DscM ;
   private String edtMq_DscM_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtMq_LinP_Internalname ;
   private String edtMq_LinP_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtMq_PesI_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtMq_PesF_Internalname ;
   private String edtMq_PesF_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtMq_ObsT_Internalname ;
   private String sMode1125 ;
   private String edtavnRcdDeleted_1125_Internalname ;
   private String edtPar_Art_Internalname ;
   private String edtPar_Dsc_Internalname ;
   private String edtPar_Valor_Internalname ;
   private String edtPar_Obs_Internalname ;
   private String edtPar_UsuA_Internalname ;
   private String edtPar_FecA_Internalname ;
   private String edtPar_UsuM_Internalname ;
   private String edtPar_FecM_Internalname ;
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
   private String AV38Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1117 ;
   private String sV36Modif ;
   private String OV36Modif ;
   private String GXCCtl ;
   private String A7950Par_Dsc ;
   private String A7952Par_Valor ;
   private String A10573Par_UsuA ;
   private String A10575Par_UsuM ;
   private String T7952Par_Valor ;
   private String AV22Station ;
   private String GXv_char1[] ;
   private String AV16EmprNom ;
   private String GXv_char2[] ;
   private String AV24LitFe ;
   private String AV23Lit0 ;
   private String AV18Lit1 ;
   private String AV19Lit2 ;
   private String AV20Lit3 ;
   private String AV21Lit4 ;
   private String AV27Lit5 ;
   private String AV28Lit6 ;
   private String AV30Lit7 ;
   private String AV29Lit8 ;
   private String AV31Lit9 ;
   private String AV32Lit10 ;
   private String AV34Lit11 ;
   private String AV35Lit12 ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z69ArtDsc ;
   private String Z7950Par_Dsc ;
   private String sGXsfl_80_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1125_Jsonclick ;
   private String edtPar_Art_Jsonclick ;
   private String edtPar_Dsc_Jsonclick ;
   private String edtPar_Valor_Jsonclick ;
   private String edtPar_Obs_Jsonclick ;
   private String edtPar_UsuA_Jsonclick ;
   private String edtPar_FecA_Jsonclick ;
   private String edtPar_UsuM_Jsonclick ;
   private String edtPar_FecM_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i10573Par_UsuA ;
   private String subGrid1_Header ;
   private String GXt_char4 ;
   private String GXv_char3[] ;
   private String Z7957Mq_DscM ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ7956Mq_CodM ;
   private String ZZ7957Mq_DscM ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ69ArtDsc ;
   private java.util.Date Z10574Par_FecA ;
   private java.util.Date Z10576Par_FecM ;
   private java.util.Date A10574Par_FecA ;
   private java.util.Date A10576Par_FecM ;
   private java.util.Date i10574Par_FecA ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_80_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n69ArtDsc ;
   private boolean n7784Mq_PesI ;
   private boolean n7785Mq_PesF ;
   private boolean n7786Mq_ObsT ;
   private boolean returnInSub ;
   private boolean n10573Par_UsuA ;
   private boolean n10574Par_FecA ;
   private boolean n10575Par_UsuM ;
   private boolean n10576Par_FecM ;
   private boolean n7950Par_Dsc ;
   private boolean n7952Par_Valor ;
   private boolean n7953Par_Obs ;
   private boolean Gx_longc ;
   private String A7786Mq_ObsT ;
   private String Z7786Mq_ObsT ;
   private String ZZ7786Mq_ObsT ;
   private String Z7953Par_Obs ;
   private String A7953Par_Obs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T010K7_A407EmprNom ;
   private boolean[] T010K7_n407EmprNom ;
   private String[] T010K8_A279CliNom ;
   private String[] T010K9_A69ArtDsc ;
   private boolean[] T010K9_n69ArtDsc ;
   private String[] T010K10_A396EmprCod ;
   private String[] T010K11_A7786Mq_ObsT ;
   private boolean[] T010K11_n7786Mq_ObsT ;
   private short[] T010K11_A7783Mq_LinP ;
   private String[] T010K11_A407EmprNom ;
   private boolean[] T010K11_n407EmprNom ;
   private String[] T010K11_A279CliNom ;
   private String[] T010K11_A69ArtDsc ;
   private boolean[] T010K11_n69ArtDsc ;
   private java.math.BigDecimal[] T010K11_A7784Mq_PesI ;
   private boolean[] T010K11_n7784Mq_PesI ;
   private java.math.BigDecimal[] T010K11_A7785Mq_PesF ;
   private boolean[] T010K11_n7785Mq_PesF ;
   private String[] T010K11_A396EmprCod ;
   private int[] T010K11_A252CliCod ;
   private String[] T010K11_A65ArtCod ;
   private String[] T010K11_A7956Mq_CodM ;
   private String[] T010K12_A396EmprCod ;
   private int[] T010K12_A252CliCod ;
   private String[] T010K12_A65ArtCod ;
   private String[] T010K12_A7956Mq_CodM ;
   private short[] T010K12_A7783Mq_LinP ;
   private String[] T010K6_A7786Mq_ObsT ;
   private boolean[] T010K6_n7786Mq_ObsT ;
   private short[] T010K6_A7783Mq_LinP ;
   private java.math.BigDecimal[] T010K6_A7784Mq_PesI ;
   private boolean[] T010K6_n7784Mq_PesI ;
   private java.math.BigDecimal[] T010K6_A7785Mq_PesF ;
   private boolean[] T010K6_n7785Mq_PesF ;
   private String[] T010K6_A396EmprCod ;
   private int[] T010K6_A252CliCod ;
   private String[] T010K6_A65ArtCod ;
   private String[] T010K6_A7956Mq_CodM ;
   private String[] T010K13_A396EmprCod ;
   private int[] T010K13_A252CliCod ;
   private String[] T010K13_A65ArtCod ;
   private String[] T010K13_A7956Mq_CodM ;
   private short[] T010K13_A7783Mq_LinP ;
   private String[] T010K14_A396EmprCod ;
   private int[] T010K14_A252CliCod ;
   private String[] T010K14_A65ArtCod ;
   private String[] T010K14_A7956Mq_CodM ;
   private short[] T010K14_A7783Mq_LinP ;
   private String[] T010K5_A7786Mq_ObsT ;
   private boolean[] T010K5_n7786Mq_ObsT ;
   private short[] T010K5_A7783Mq_LinP ;
   private java.math.BigDecimal[] T010K5_A7784Mq_PesI ;
   private boolean[] T010K5_n7784Mq_PesI ;
   private java.math.BigDecimal[] T010K5_A7785Mq_PesF ;
   private boolean[] T010K5_n7785Mq_PesF ;
   private String[] T010K5_A396EmprCod ;
   private int[] T010K5_A252CliCod ;
   private String[] T010K5_A65ArtCod ;
   private String[] T010K5_A7956Mq_CodM ;
   private String[] T010K18_A396EmprCod ;
   private int[] T010K18_A252CliCod ;
   private String[] T010K18_A65ArtCod ;
   private String[] T010K18_A7956Mq_CodM ;
   private short[] T010K18_A7783Mq_LinP ;
   private int[] T010K19_A252CliCod ;
   private String[] T010K19_A65ArtCod ;
   private String[] T010K19_A7956Mq_CodM ;
   private short[] T010K19_A7783Mq_LinP ;
   private String[] T010K19_A10573Par_UsuA ;
   private boolean[] T010K19_n10573Par_UsuA ;
   private java.util.Date[] T010K19_A10574Par_FecA ;
   private boolean[] T010K19_n10574Par_FecA ;
   private String[] T010K19_A10575Par_UsuM ;
   private boolean[] T010K19_n10575Par_UsuM ;
   private java.util.Date[] T010K19_A10576Par_FecM ;
   private boolean[] T010K19_n10576Par_FecM ;
   private String[] T010K19_A7950Par_Dsc ;
   private boolean[] T010K19_n7950Par_Dsc ;
   private String[] T010K19_A7952Par_Valor ;
   private boolean[] T010K19_n7952Par_Valor ;
   private String[] T010K19_A7953Par_Obs ;
   private boolean[] T010K19_n7953Par_Obs ;
   private String[] T010K19_A396EmprCod ;
   private short[] T010K19_A7949Par_Art ;
   private String[] T010K4_A7950Par_Dsc ;
   private boolean[] T010K4_n7950Par_Dsc ;
   private String[] T010K20_A7950Par_Dsc ;
   private boolean[] T010K20_n7950Par_Dsc ;
   private String[] T010K21_A396EmprCod ;
   private int[] T010K21_A252CliCod ;
   private String[] T010K21_A65ArtCod ;
   private String[] T010K21_A7956Mq_CodM ;
   private short[] T010K21_A7783Mq_LinP ;
   private short[] T010K21_A7949Par_Art ;
   private int[] T010K3_A252CliCod ;
   private String[] T010K3_A65ArtCod ;
   private String[] T010K3_A7956Mq_CodM ;
   private short[] T010K3_A7783Mq_LinP ;
   private String[] T010K3_A10573Par_UsuA ;
   private boolean[] T010K3_n10573Par_UsuA ;
   private java.util.Date[] T010K3_A10574Par_FecA ;
   private boolean[] T010K3_n10574Par_FecA ;
   private String[] T010K3_A10575Par_UsuM ;
   private boolean[] T010K3_n10575Par_UsuM ;
   private java.util.Date[] T010K3_A10576Par_FecM ;
   private boolean[] T010K3_n10576Par_FecM ;
   private String[] T010K3_A7952Par_Valor ;
   private boolean[] T010K3_n7952Par_Valor ;
   private String[] T010K3_A7953Par_Obs ;
   private boolean[] T010K3_n7953Par_Obs ;
   private String[] T010K3_A396EmprCod ;
   private short[] T010K3_A7949Par_Art ;
   private int[] T010K2_A252CliCod ;
   private String[] T010K2_A65ArtCod ;
   private String[] T010K2_A7956Mq_CodM ;
   private short[] T010K2_A7783Mq_LinP ;
   private String[] T010K2_A10573Par_UsuA ;
   private boolean[] T010K2_n10573Par_UsuA ;
   private java.util.Date[] T010K2_A10574Par_FecA ;
   private boolean[] T010K2_n10574Par_FecA ;
   private String[] T010K2_A10575Par_UsuM ;
   private boolean[] T010K2_n10575Par_UsuM ;
   private java.util.Date[] T010K2_A10576Par_FecM ;
   private boolean[] T010K2_n10576Par_FecM ;
   private String[] T010K2_A7952Par_Valor ;
   private boolean[] T010K2_n7952Par_Valor ;
   private String[] T010K2_A7953Par_Obs ;
   private boolean[] T010K2_n7953Par_Obs ;
   private String[] T010K2_A396EmprCod ;
   private short[] T010K2_A7949Par_Art ;
   private String[] T010K25_A7950Par_Dsc ;
   private boolean[] T010K25_n7950Par_Dsc ;
   private String[] T010K26_A396EmprCod ;
   private int[] T010K26_A252CliCod ;
   private String[] T010K26_A65ArtCod ;
   private String[] T010K26_A7956Mq_CodM ;
   private short[] T010K26_A7783Mq_LinP ;
   private short[] T010K26_A7949Par_Art ;
   private String[] T010K27_A407EmprNom ;
   private boolean[] T010K27_n407EmprNom ;
   private String[] T010K28_A279CliNom ;
   private String[] T010K29_A69ArtDsc ;
   private boolean[] T010K29_n69ArtDsc ;
   private String[] T010K30_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttnartp__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttnartp__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttnartp__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttnartp__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttnartp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T010K2", "SELECT CliCod, ArtCod, Mq_CodM, Mq_LinP, Par_UsuA, Par_FecA, Par_UsuM, Par_FecM, Par_Valor, Par_Obs, EmprCod, Par_Art FROM TXPTNARTp WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ? AND Mq_LinP = ? AND Par_Art = ?  FOR UPDATE OF Par_UsuA, Par_FecA, Par_UsuM, Par_FecM, Par_Valor, Par_Obs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010K3", "SELECT CliCod, ArtCod, Mq_CodM, Mq_LinP, Par_UsuA, Par_FecA, Par_UsuM, Par_FecM, Par_Valor, Par_Obs, EmprCod, Par_Art FROM TXPTNARTp WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ? AND Mq_LinP = ? AND Par_Art = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010K4", "SELECT Par_Dsc FROM TXPARTPAR WHERE EmprCod = ? AND Par_Art = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010K5", "SELECT Mq_ObsT, Mq_LinP, Mq_PesI, Mq_PesF, EmprCod, CliCod, ArtCod, Mq_CodM FROM TXPTNART1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ? AND Mq_LinP = ?  FOR UPDATE OF Mq_PesI, Mq_PesF, Mq_ObsT NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010K6", "SELECT Mq_ObsT, Mq_LinP, Mq_PesI, Mq_PesF, EmprCod, CliCod, ArtCod, Mq_CodM FROM TXPTNART1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ? AND Mq_LinP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010K7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010K8", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010K9", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010K10", "SELECT EmprCod FROM TXPTNART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010K11", "SELECT /*+ FIRST_ROWS(1) */ TM1.Mq_ObsT, TM1.Mq_LinP, T2.EmprNom, T3.CliNom, T4.ArtDsc, TM1.Mq_PesI, TM1.Mq_PesF, TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.Mq_CodM FROM (((TXPTNART1 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.ArtCod = TM1.ArtCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? and TM1.Mq_CodM = ? and TM1.Mq_LinP = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.Mq_CodM, TM1.Mq_LinP ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010K12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, Mq_CodM, Mq_LinP FROM TXPTNART1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ? AND Mq_LinP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010K13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, Mq_CodM, Mq_LinP FROM TXPTNART1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Mq_CodM = ? and Mq_LinP = ? ORDER BY EmprCod, CliCod, ArtCod, Mq_CodM, Mq_LinP) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010K14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, Mq_CodM, Mq_LinP FROM TXPTNART1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Mq_CodM = ? and Mq_LinP = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC, Mq_CodM DESC, Mq_LinP DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T010K15", "INSERT INTO TXPTNART1(Mq_LinP, Mq_PesI, Mq_PesF, Mq_ObsT, EmprCod, CliCod, ArtCod, Mq_CodM, Mq_UsA, Mq_FcA, Mq_UsM, Mq_FcM) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPTNART1")
         ,new UpdateCursor("T010K16", "UPDATE TXPTNART1 SET Mq_PesI=?, Mq_PesF=?, Mq_ObsT=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ? AND Mq_LinP = ?", GX_NOMASK, "TXPTNART1")
         ,new UpdateCursor("T010K17", "DELETE FROM TXPTNART1  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ? AND Mq_LinP = ?", GX_NOMASK, "TXPTNART1")
         ,new ForEachCursor("T010K18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod, Mq_CodM, Mq_LinP FROM TXPTNART1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Mq_CodM = ? and Mq_LinP = ? ORDER BY EmprCod, CliCod, ArtCod, Mq_CodM, Mq_LinP ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010K19", "SELECT T1.CliCod, T1.ArtCod, T1.Mq_CodM, T1.Mq_LinP, T1.Par_UsuA, T1.Par_FecA, T1.Par_UsuM, T1.Par_FecM, T2.Par_Dsc, T1.Par_Valor, T1.Par_Obs, T1.EmprCod, T1.Par_Art FROM (TXPTNARTp T1 INNER JOIN TXPARTPAR T2 ON T2.EmprCod = T1.EmprCod AND T2.Par_Art = T1.Par_Art) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.Mq_CodM = ? and T1.Mq_LinP = ? and T1.Par_Art = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.Mq_CodM, T1.Mq_LinP, T1.Par_Art ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010K20", "SELECT Par_Dsc FROM TXPARTPAR WHERE EmprCod = ? AND Par_Art = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010K21", "SELECT EmprCod, CliCod, ArtCod, Mq_CodM, Mq_LinP, Par_Art FROM TXPTNARTp WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ? AND Mq_LinP = ? AND Par_Art = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T010K22", "INSERT INTO TXPTNARTp(CliCod, ArtCod, Mq_CodM, Mq_LinP, Par_UsuA, Par_FecA, Par_UsuM, Par_FecM, Par_Valor, Par_Obs, EmprCod, Par_Art) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTNARTp")
         ,new UpdateCursor("T010K23", "UPDATE TXPTNARTp SET Par_UsuA=?, Par_FecA=?, Par_UsuM=?, Par_FecM=?, Par_Valor=?, Par_Obs=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ? AND Mq_LinP = ? AND Par_Art = ?", GX_NOMASK, "TXPTNARTp")
         ,new UpdateCursor("T010K24", "DELETE FROM TXPTNARTp  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ? AND Mq_LinP = ? AND Par_Art = ?", GX_NOMASK, "TXPTNARTp")
         ,new ForEachCursor("T010K25", "SELECT Par_Dsc FROM TXPARTPAR WHERE EmprCod = ? AND Par_Art = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010K26", "SELECT EmprCod, CliCod, ArtCod, Mq_CodM, Mq_LinP, Par_Art FROM TXPTNARTp WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Mq_CodM = ? and Mq_LinP = ? ORDER BY EmprCod, CliCod, ArtCod, Mq_CodM, Mq_LinP, Par_Art ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010K27", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010K28", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010K29", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010K30", "SELECT EmprCod FROM TXPTNART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 100);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 3);
               ((short[]) buf[17])[0] = rslt.getShort(12);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 100);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 3);
               ((short[]) buf[17])[0] = rslt.getShort(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 80);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 16);
               ((String[]) buf[10])[0] = rslt.getString(8, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 16);
               ((String[]) buf[10])[0] = rslt.getString(8, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((String[]) buf[6])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 3);
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((String[]) buf[14])[0] = rslt.getString(10, 16);
               ((String[]) buf[15])[0] = rslt.getString(11, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 17 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 80);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 100);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 3);
               ((short[]) buf[19])[0] = rslt.getShort(13);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 80);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 80);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 13 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
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
                  stmt.setNull( 4 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(4, (String)parms[6]);
               }
               stmt.setString(5, (String)parms[7], 3);
               stmt.setInt(6, ((Number) parms[8]).intValue());
               stmt.setString(7, (String)parms[9], 16);
               stmt.setString(8, (String)parms[10], 6);
               return;
            case 14 :
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
                  stmt.setNull( 3 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(3, (String)parms[5]);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setString(6, (String)parms[8], 16);
               stmt.setString(7, (String)parms[9], 6);
               stmt.setShort(8, ((Number) parms[10]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 20 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 10);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 10);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[11], false);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[13], 100);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[15], 400);
               }
               stmt.setString(11, (String)parms[16], 3);
               stmt.setShort(12, ((Number) parms[17]).shortValue());
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], false);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 10);
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
                  stmt.setString(5, (String)parms[9], 100);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 400);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setInt(8, ((Number) parms[13]).intValue());
               stmt.setString(9, (String)parms[14], 16);
               stmt.setString(10, (String)parms[15], 6);
               stmt.setShort(11, ((Number) parms[16]).shortValue());
               stmt.setShort(12, ((Number) parms[17]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               return;
      }
   }

}

