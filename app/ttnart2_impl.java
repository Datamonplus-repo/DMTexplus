package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttnart2_impl extends GXDataArea
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
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_10_10M1117( ) ;
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
         gx1asamq_dscm10M1116( A396EmprCod, A7956Mq_CodM) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ENTRADA PESO", ""), (short)(0)) ;
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
      nRC_GXsfl_65 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_65"))) ;
      nGXsfl_65_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_65_idx"))) ;
      sGXsfl_65_idx = httpContext.GetPar( "sGXsfl_65_idx") ;
      A7782Mq_ULinP = (short)(GXutil.lval( httpContext.GetPar( "Mq_ULinP"))) ;
      n7782Mq_ULinP = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      AV17UsurCod = httpContext.GetPar( "UsurCod") ;
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

   public ttnart2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttnart2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttnart2_impl.class ));
   }

   public ttnart2_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTNART2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTNART2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTNART2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTNART2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTNART2.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTNART2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTNART2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTNART2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTNART2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTNART2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTNART2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTNART2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTNART2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTNART2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTNART2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion Articulo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTNART2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTNART2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTNART2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMq_CodM_Internalname, GXutil.rtrim( A7956Mq_CodM), GXutil.rtrim( localUtil.format( A7956Mq_CodM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMq_CodM_Jsonclick, 0, "", "", "", "", "", 1, edtMq_CodM_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTNART2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTNART2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Descripcion Maquina", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTNART2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMq_DscM_Internalname, GXutil.rtrim( A7957Mq_DscM), GXutil.rtrim( localUtil.format( A7957Mq_DscM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMq_DscM_Jsonclick, 0, "", "", "", "", "", 1, edtMq_DscM_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTNART2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTNART2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMq_ULinP_Internalname, GXutil.ltrim( localUtil.ntoc( A7782Mq_ULinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMq_ULinP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7782Mq_ULinP), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7782Mq_ULinP), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMq_ULinP_Jsonclick, 0, "", "", "", "", "", 1, edtMq_ULinP_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTNART2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol65( ) ;
      nGXsfl_65_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1117 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1117 = (short)(1) ;
            scanStart10M1117( ) ;
            while ( RcdFound1117 != 0 )
            {
               init_level_properties1117( ) ;
               getByPrimaryKey10M1117( ) ;
               addRow10M1117( ) ;
               scanNext10M1117( ) ;
            }
            scanEnd10M1117( ) ;
            nBlankRcdCount1117 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B7782Mq_ULinP = A7782Mq_ULinP ;
         n7782Mq_ULinP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
         standaloneNotModal10M1117( ) ;
         standaloneModal10M1117( ) ;
         sMode1117 = Gx_mode ;
         while ( nGXsfl_65_idx < nRC_GXsfl_65 )
         {
            bGXsfl_65_Refreshing = true ;
            readRow10M1117( ) ;
            edtavnRcdDeleted_1117_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1117_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1117_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1117_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMq_LinP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_LINP_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMq_LinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_LinP_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMq_PesI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_PESI_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMq_PesI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_PesI_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMq_PesF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_PESF_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMq_PesF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_PesF_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMq_ObsT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_OBST_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMq_ObsT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_ObsT_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMq_UsA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_USA_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMq_UsA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_UsA_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMq_FcA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_FCA_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMq_FcA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_FcA_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMq_UsM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_USM_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMq_UsM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_UsM_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMq_FcM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_FCM_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMq_FcM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_FcM_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            if ( ( nRcdExists_1117 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal10M1117( ) ;
            }
            sendRow10M1117( ) ;
            bGXsfl_65_Refreshing = false ;
         }
         Gx_mode = sMode1117 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A7782Mq_ULinP = B7782Mq_ULinP ;
         n7782Mq_ULinP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1117 = (short)(5) ;
         nRcdExists_1117 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart10M1117( ) ;
            while ( RcdFound1117 != 0 )
            {
               sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_651117( ) ;
               init_level_properties1117( ) ;
               standaloneNotModal10M1117( ) ;
               getByPrimaryKey10M1117( ) ;
               standaloneModal10M1117( ) ;
               addRow10M1117( ) ;
               scanNext10M1117( ) ;
            }
            scanEnd10M1117( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1117 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_651117( ) ;
      initAll10M1117( ) ;
      init_level_properties1117( ) ;
      B7782Mq_ULinP = A7782Mq_ULinP ;
      n7782Mq_ULinP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
      nRcdExists_1117 = (short)(0) ;
      nIsMod_1117 = (short)(0) ;
      nRcdDeleted_1117 = (short)(0) ;
      nBlankRcdCount1117 = (short)(nBlankRcdUsr1117+nBlankRcdCount1117) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1117 > 0 )
      {
         standaloneNotModal10M1117( ) ;
         standaloneModal10M1117( ) ;
         addRow10M1117( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMq_LinP_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1117 = (short)(nBlankRcdCount1117-1) ;
      }
      Gx_mode = sMode1117 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A7782Mq_ULinP = B7782Mq_ULinP ;
      n7782Mq_ULinP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTNART2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTNART2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTNART2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTNART2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTNART2.htm");
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
      e1110M2 ();
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
            Z7782Mq_ULinP = (short)(localUtil.ctol( httpContext.cgiGet( "Z7782Mq_ULinP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O7782Mq_ULinP = (short)(localUtil.ctol( httpContext.cgiGet( "O7782Mq_ULinP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_65 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_65"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV38Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV36Modif = httpContext.cgiGet( "vMODIF") ;
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
            A7782Mq_ULinP = (short)(localUtil.ctol( httpContext.cgiGet( edtMq_ULinP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7782Mq_ULinP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
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
                        e1110M2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'ENTRADA PARAMETROS'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Entrada PARAMETROS' */
                        e1210M2 ();
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
            initAll10M1116( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1117_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1117_Enabled), 5, 0), !bGXsfl_65_Refreshing);
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
      disableAttributes10M1116( ) ;
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

   public void confirm_10M0( )
   {
      beforeValidate10M1116( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls10M1116( ) ;
         }
         else
         {
            checkExtendedTable10M1116( ) ;
            if ( AnyError == 0 )
            {
               zm10M1116( 12) ;
               zm10M1116( 13) ;
               zm10M1116( 14) ;
            }
            closeExtendedTableCursors10M1116( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1116 = Gx_mode ;
         confirm_10M1117( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1116 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1116 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues10M0( ) ;
      }
   }

   public void confirm_10M1117( )
   {
      s7782Mq_ULinP = O7782Mq_ULinP ;
      n7782Mq_ULinP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRow10M1117( ) ;
         if ( ( nRcdExists_1117 != 0 ) || ( nIsMod_1117 != 0 ) )
         {
            getKey10M1117( ) ;
            if ( ( nRcdExists_1117 == 0 ) && ( nRcdDeleted_1117 == 0 ) )
            {
               if ( RcdFound1117 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate10M1117( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable10M1117( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors10M1117( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O7782Mq_ULinP = A7782Mq_ULinP ;
                     n7782Mq_ULinP = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "MQ_LINP_" + sGXsfl_65_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMq_LinP_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1117 != 0 )
               {
                  if ( nRcdDeleted_1117 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey10M1117( ) ;
                     load10M1117( ) ;
                     beforeValidate10M1117( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls10M1117( ) ;
                        O7782Mq_ULinP = A7782Mq_ULinP ;
                        n7782Mq_ULinP = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1117 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate10M1117( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable10M1117( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors10M1117( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O7782Mq_ULinP = A7782Mq_ULinP ;
                           n7782Mq_ULinP = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1117 == 0 )
                  {
                     GXCCtl = "MQ_LINP_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMq_LinP_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1117_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1117, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_LinP_Internalname, GXutil.ltrim( localUtil.ntoc( A7783Mq_LinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_PesI_Internalname, GXutil.ltrim( localUtil.ntoc( A7784Mq_PesI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_PesF_Internalname, GXutil.ltrim( localUtil.ntoc( A7785Mq_PesF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_ObsT_Internalname, A7786Mq_ObsT) ;
         httpContext.changePostValue( edtMq_UsA_Internalname, GXutil.rtrim( A10569Mq_UsA)) ;
         httpContext.changePostValue( edtMq_FcA_Internalname, localUtil.ttoc( A10570Mq_FcA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMq_UsM_Internalname, GXutil.rtrim( A10571Mq_UsM)) ;
         httpContext.changePostValue( edtMq_FcM_Internalname, localUtil.ttoc( A10572Mq_FcM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z7783Mq_LinP_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7783Mq_LinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10569Mq_UsA_"+sGXsfl_65_idx, GXutil.rtrim( Z10569Mq_UsA)) ;
         httpContext.changePostValue( "ZT_"+"Z10570Mq_FcA_"+sGXsfl_65_idx, localUtil.ttoc( Z10570Mq_FcA, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10571Mq_UsM_"+sGXsfl_65_idx, GXutil.rtrim( Z10571Mq_UsM)) ;
         httpContext.changePostValue( "ZT_"+"Z10572Mq_FcM_"+sGXsfl_65_idx, localUtil.ttoc( Z10572Mq_FcM, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z7784Mq_PesI_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7784Mq_PesI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7785Mq_PesF_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7785Mq_PesF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T7785Mq_PesF_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( O7785Mq_PesF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T7784Mq_PesI_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( O7784Mq_PesI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1117_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1117, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1117_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1117, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1117_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1117, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1117 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1117_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1117_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_LINP_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_LinP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_PESI_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_PesI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_PESF_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_PesF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_OBST_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_ObsT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_USA_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_UsA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_FCA_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_FcA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_USM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_UsM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_FCM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_FcM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O7782Mq_ULinP = s7782Mq_ULinP ;
      n7782Mq_ULinP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption10M0( )
   {
   }

   public void e1110M2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV22Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV16EmprNom ;
      GXv_char3[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char1, GXv_char2, GXv_char3) ;
      ttnart2_impl.this.A396EmprCod = GXv_char1[0] ;
      ttnart2_impl.this.AV16EmprNom = GXv_char2[0] ;
      ttnart2_impl.this.AV17UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char4 = AV24LitFe ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
      ttnart2_impl.this.GXt_char4 = GXv_char3[0] ;
      AV24LitFe = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24LitFe", AV24LitFe);
      GXt_char4 = AV23Lit0 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char3) ;
      ttnart2_impl.this.GXt_char4 = GXv_char3[0] ;
      AV23Lit0 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit0", AV23Lit0);
      GXt_char4 = AV18Lit1 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char3) ;
      ttnart2_impl.this.GXt_char4 = GXv_char3[0] ;
      AV18Lit1 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit1", AV18Lit1);
      GXt_char4 = AV19Lit2 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV38Pgmname, (byte)(99), GXv_char3) ;
      ttnart2_impl.this.GXt_char4 = GXv_char3[0] ;
      AV19Lit2 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit2", AV19Lit2);
      GXt_char4 = AV20Lit3 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1355_", ""), (byte)(99), GXv_char3) ;
      ttnart2_impl.this.GXt_char4 = GXv_char3[0] ;
      AV20Lit3 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit3", AV20Lit3);
      GXt_char4 = AV21Lit4 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char3) ;
      ttnart2_impl.this.GXt_char4 = GXv_char3[0] ;
      AV21Lit4 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit4", AV21Lit4);
      GXt_char4 = AV27Lit5 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN748_", ""), (byte)(99), GXv_char3) ;
      ttnart2_impl.this.GXt_char4 = GXv_char3[0] ;
      AV27Lit5 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Lit5", AV27Lit5);
      GXt_char4 = AV28Lit6 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN007", ""), (byte)(99), GXv_char3) ;
      ttnart2_impl.this.GXt_char4 = GXv_char3[0] ;
      AV28Lit6 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Lit6", AV28Lit6);
      GXt_char4 = AV30Lit7 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1480_", ""), (byte)(99), GXv_char3) ;
      ttnart2_impl.this.GXt_char4 = GXv_char3[0] ;
      AV30Lit7 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Lit7", AV30Lit7);
      GXt_char4 = AV29Lit8 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1189_", ""), (byte)(99), GXv_char3) ;
      ttnart2_impl.this.GXt_char4 = GXv_char3[0] ;
      AV29Lit8 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Lit8", AV29Lit8);
      GXt_char4 = AV31Lit9 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1156_", ""), (byte)(99), GXv_char3) ;
      ttnart2_impl.this.GXt_char4 = GXv_char3[0] ;
      AV31Lit9 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Lit9", AV31Lit9);
      GXt_char4 = AV32Lit10 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT783_", ""), (byte)(99), GXv_char3) ;
      ttnart2_impl.this.GXt_char4 = GXv_char3[0] ;
      AV32Lit10 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Lit10", AV32Lit10);
      AV34Lit11 = httpContext.getMessage( "Maquina", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Lit11", AV34Lit11);
      AV35Lit12 = httpContext.getMessage( "Linea", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Lit12", AV35Lit12);
   }

   public void e1210M2( )
   {
      /* 'Entrada PARAMETROS' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         callWebObject(formatLink("app.ttnartp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.rtrim(A7956Mq_CodM)),GXutil.URLEncode(GXutil.ltrimstr(A7783Mq_LinP,4,0)),GXutil.URLEncode(GXutil.rtrim(AV36Modif))}, new String[] {"EmprCod","CliCod","ArtCod","Mq_CodM","Mq_LinP","Modif"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /*  Sending Event outputs  */
   }

   public void zm10M1116( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7782Mq_ULinP = T010M5_A7782Mq_ULinP[0] ;
         }
         else
         {
            Z7782Mq_ULinP = A7782Mq_ULinP ;
         }
      }
      if ( GX_JID == -11 )
      {
         Z7956Mq_CodM = A7956Mq_CodM ;
         Z7782Mq_ULinP = A7782Mq_ULinP ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z69ArtDsc = A69ArtDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtMq_ULinP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_ULinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_ULinP_Enabled), 5, 0), true);
      AV38Pgmname = "TTNART2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Pgmname", AV38Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtMq_ULinP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_ULinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_ULinP_Enabled), 5, 0), true);
      /* Using cursor T010M6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T010M6_A407EmprNom[0] ;
      n407EmprNom = T010M6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T010M7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T010M7_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
      /* Using cursor T010M8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
      A69ArtDsc = T010M8_A69ArtDsc[0] ;
      n69ArtDsc = T010M8_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(6);
      GXt_char4 = A7957Mq_DscM ;
      GXv_char3[0] = GXt_char4 ;
      new app.pobtmaq(remoteHandle, context).execute( A396EmprCod, A7956Mq_CodM, GXv_char3) ;
      ttnart2_impl.this.GXt_char4 = GXv_char3[0] ;
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

   public void load10M1116( )
   {
      /* Using cursor T010M9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1116 = (short)(1) ;
         A407EmprNom = T010M9_A407EmprNom[0] ;
         n407EmprNom = T010M9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T010M9_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A69ArtDsc = T010M9_A69ArtDsc[0] ;
         n69ArtDsc = T010M9_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A7782Mq_ULinP = T010M9_A7782Mq_ULinP[0] ;
         n7782Mq_ULinP = T010M9_n7782Mq_ULinP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
         zm10M1116( -11) ;
      }
      pr_default.close(7);
      onLoadActions10M1116( ) ;
   }

   public void onLoadActions10M1116( )
   {
   }

   public void checkExtendedTable10M1116( )
   {
      nIsDirty_1116 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors10M1116( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey10M1116( )
   {
      /* Using cursor T010M10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1116 = (short)(1) ;
      }
      else
      {
         RcdFound1116 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T010M5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T010M5_A7956Mq_CodM[0], A7956Mq_CodM) == 0 ) && ( GXutil.strcmp(T010M5_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010M5_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T010M5_A65ArtCod[0], A65ArtCod) == 0 ) )
      {
         zm10M1116( 11) ;
         RcdFound1116 = (short)(1) ;
         A7782Mq_ULinP = T010M5_A7782Mq_ULinP[0] ;
         n7782Mq_ULinP = T010M5_n7782Mq_ULinP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
         O7782Mq_ULinP = A7782Mq_ULinP ;
         n7782Mq_ULinP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z7956Mq_CodM = A7956Mq_CodM ;
         sMode1116 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load10M1116( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1116 = (short)(0) ;
            initializeNonKey10M1116( ) ;
         }
         Gx_mode = sMode1116 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1116 = (short)(0) ;
         initializeNonKey10M1116( ) ;
         sMode1116 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1116 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey10M1116( ) ;
      if ( RcdFound1116 == 0 )
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
      RcdFound1116 = (short)(0) ;
      /* Using cursor T010M11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T010M11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010M11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T010M11_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T010M11_A7956Mq_CodM[0], A7956Mq_CodM) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T010M11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010M11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T010M11_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T010M11_A7956Mq_CodM[0], A7956Mq_CodM) == 0 ) )
         {
            RcdFound1116 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1116 = (short)(0) ;
      /* Using cursor T010M12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T010M12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010M12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T010M12_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T010M12_A7956Mq_CodM[0], A7956Mq_CodM) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T010M12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010M12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T010M12_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T010M12_A7956Mq_CodM[0], A7956Mq_CodM) == 0 ) )
         {
            RcdFound1116 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey10M1116( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A7782Mq_ULinP = O7782Mq_ULinP ;
         n7782Mq_ULinP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
         insert10M1116( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1116 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A7956Mq_CodM, Z7956Mq_CodM) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A7782Mq_ULinP = O7782Mq_ULinP ;
               n7782Mq_ULinP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A7782Mq_ULinP = O7782Mq_ULinP ;
               n7782Mq_ULinP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
               update10M1116( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A7956Mq_CodM, Z7956Mq_CodM) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A7782Mq_ULinP = O7782Mq_ULinP ;
               n7782Mq_ULinP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
               insert10M1116( ) ;
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
                  A7782Mq_ULinP = O7782Mq_ULinP ;
                  n7782Mq_ULinP = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
                  insert10M1116( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A7956Mq_CodM, Z7956Mq_CodM) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A7782Mq_ULinP = O7782Mq_ULinP ;
         n7782Mq_ULinP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
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
      getKey10M1116( ) ;
      if ( RcdFound1116 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A7956Mq_CodM, Z7956Mq_CodM) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A7956Mq_CodM, Z7956Mq_CodM) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttnart2");
   }

   public void insert_check( )
   {
      confirm_10M0( ) ;
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
      if ( RcdFound1116 == 0 )
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
      scanStart10M1116( ) ;
      if ( RcdFound1116 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd10M1116( ) ;
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
      if ( RcdFound1116 == 0 )
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
      if ( RcdFound1116 == 0 )
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
      scanStart10M1116( ) ;
      if ( RcdFound1116 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1116 != 0 )
         {
            scanNext10M1116( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd10M1116( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency10M1116( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T010M4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTNART"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z7782Mq_ULinP != T010M4_A7782Mq_ULinP[0] ) )
         {
            if ( Z7782Mq_ULinP != T010M4_A7782Mq_ULinP[0] )
            {
               GXutil.writeLogln("ttnart2:[seudo value changed for attri]"+"Mq_ULinP");
               GXutil.writeLogRaw("Old: ",Z7782Mq_ULinP);
               GXutil.writeLogRaw("Current: ",T010M4_A7782Mq_ULinP[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTNART"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert10M1116( )
   {
      beforeValidate10M1116( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10M1116( ) ;
      }
      if ( AnyError == 0 )
      {
         zm10M1116( 0) ;
         checkOptimisticConcurrency10M1116( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10M1116( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert10M1116( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010M13 */
                  pr_default.execute(11, new Object[] {A7956Mq_CodM, Boolean.valueOf(n7782Mq_ULinP), Short.valueOf(A7782Mq_ULinP), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTNART");
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
                        processLevel10M1116( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption10M0( ) ;
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
            load10M1116( ) ;
         }
         endLevel10M1116( ) ;
      }
      closeExtendedTableCursors10M1116( ) ;
   }

   public void update10M1116( )
   {
      beforeValidate10M1116( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10M1116( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10M1116( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10M1116( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate10M1116( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010M14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n7782Mq_ULinP), Short.valueOf(A7782Mq_ULinP), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTNART");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTNART"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate10M1116( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel10M1116( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption10M0( ) ;
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
         endLevel10M1116( ) ;
      }
      closeExtendedTableCursors10M1116( ) ;
   }

   public void deferredUpdate10M1116( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate10M1116( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10M1116( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls10M1116( ) ;
         afterConfirm10M1116( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete10M1116( ) ;
            if ( AnyError == 0 )
            {
               A7782Mq_ULinP = O7782Mq_ULinP ;
               n7782Mq_ULinP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
               scanStart10M1117( ) ;
               while ( RcdFound1117 != 0 )
               {
                  getByPrimaryKey10M1117( ) ;
                  delete10M1117( ) ;
                  scanNext10M1117( ) ;
                  O7782Mq_ULinP = A7782Mq_ULinP ;
                  n7782Mq_ULinP = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
               }
               scanEnd10M1117( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010M15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTNART");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1116 == 0 )
                        {
                           initAll10M1116( ) ;
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
                        resetCaption10M0( ) ;
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
      sMode1116 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel10M1116( ) ;
      Gx_mode = sMode1116 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls10M1116( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T010M16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TNARTp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
   }

   public void processNestedLevel10M1117( )
   {
      s7782Mq_ULinP = O7782Mq_ULinP ;
      n7782Mq_ULinP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRow10M1117( ) ;
         if ( ( nRcdExists_1117 != 0 ) || ( nIsMod_1117 != 0 ) )
         {
            standaloneNotModal10M1117( ) ;
            getKey10M1117( ) ;
            if ( ( nRcdExists_1117 == 0 ) && ( nRcdDeleted_1117 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert10M1117( ) ;
            }
            else
            {
               if ( RcdFound1117 != 0 )
               {
                  if ( ( nRcdDeleted_1117 != 0 ) && ( nRcdExists_1117 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete10M1117( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1117 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update10M1117( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1117 == 0 )
                  {
                     GXCCtl = "MQ_LINP_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMq_LinP_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O7782Mq_ULinP = A7782Mq_ULinP ;
            n7782Mq_ULinP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1117_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1117, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_LinP_Internalname, GXutil.ltrim( localUtil.ntoc( A7783Mq_LinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_PesI_Internalname, GXutil.ltrim( localUtil.ntoc( A7784Mq_PesI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_PesF_Internalname, GXutil.ltrim( localUtil.ntoc( A7785Mq_PesF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_ObsT_Internalname, A7786Mq_ObsT) ;
         httpContext.changePostValue( edtMq_UsA_Internalname, GXutil.rtrim( A10569Mq_UsA)) ;
         httpContext.changePostValue( edtMq_FcA_Internalname, localUtil.ttoc( A10570Mq_FcA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMq_UsM_Internalname, GXutil.rtrim( A10571Mq_UsM)) ;
         httpContext.changePostValue( edtMq_FcM_Internalname, localUtil.ttoc( A10572Mq_FcM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z7783Mq_LinP_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7783Mq_LinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10569Mq_UsA_"+sGXsfl_65_idx, GXutil.rtrim( Z10569Mq_UsA)) ;
         httpContext.changePostValue( "ZT_"+"Z10570Mq_FcA_"+sGXsfl_65_idx, localUtil.ttoc( Z10570Mq_FcA, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10571Mq_UsM_"+sGXsfl_65_idx, GXutil.rtrim( Z10571Mq_UsM)) ;
         httpContext.changePostValue( "ZT_"+"Z10572Mq_FcM_"+sGXsfl_65_idx, localUtil.ttoc( Z10572Mq_FcM, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z7784Mq_PesI_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7784Mq_PesI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7785Mq_PesF_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7785Mq_PesF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T7785Mq_PesF_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( O7785Mq_PesF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T7784Mq_PesI_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( O7784Mq_PesI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1117_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1117, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1117_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1117, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1117_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1117, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1117 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1117_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1117_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_LINP_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_LinP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_PESI_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_PesI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_PESF_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_PesF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_OBST_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_ObsT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_USA_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_UsA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_FCA_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_FcA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_USM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_UsM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_FCM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_FcM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll10M1117( ) ;
      if ( AnyError != 0 )
      {
         O7782Mq_ULinP = s7782Mq_ULinP ;
         n7782Mq_ULinP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
      }
      nRcdExists_1117 = (short)(0) ;
      nIsMod_1117 = (short)(0) ;
      nRcdDeleted_1117 = (short)(0) ;
   }

   public void processLevel10M1116( )
   {
      /* Save parent mode. */
      sMode1116 = Gx_mode ;
      processNestedLevel10M1117( ) ;
      if ( AnyError != 0 )
      {
         O7782Mq_ULinP = s7782Mq_ULinP ;
         n7782Mq_ULinP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1116 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T010M17 */
      pr_default.execute(15, new Object[] {Boolean.valueOf(n7782Mq_ULinP), Short.valueOf(A7782Mq_ULinP), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTNART");
   }

   public void endLevel10M1116( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete10M1116( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttnart2");
         if ( AnyError == 0 )
         {
            confirmValues10M0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttnart2");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart10M1116( )
   {
      /* Scan By routine */
      /* Using cursor T010M18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM});
      RcdFound1116 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1116 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext10M1116( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound1116 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1116 = (short)(1) ;
      }
   }

   public void scanEnd10M1116( )
   {
      pr_default.close(16);
   }

   public void afterConfirm10M1116( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert10M1116( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate10M1116( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete10M1116( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete10M1116( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate10M1116( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes10M1116( )
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
      edtMq_ULinP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_ULinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_ULinP_Enabled), 5, 0), true);
   }

   public void zm10M1117( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10569Mq_UsA = T010M3_A10569Mq_UsA[0] ;
            Z10570Mq_FcA = T010M3_A10570Mq_FcA[0] ;
            Z10571Mq_UsM = T010M3_A10571Mq_UsM[0] ;
            Z10572Mq_FcM = T010M3_A10572Mq_FcM[0] ;
            Z7784Mq_PesI = T010M3_A7784Mq_PesI[0] ;
            Z7785Mq_PesF = T010M3_A7785Mq_PesF[0] ;
         }
         else
         {
            Z10569Mq_UsA = A10569Mq_UsA ;
            Z10570Mq_FcA = A10570Mq_FcA ;
            Z10571Mq_UsM = A10571Mq_UsM ;
            Z10572Mq_FcM = A10572Mq_FcM ;
            Z7784Mq_PesI = A7784Mq_PesI ;
            Z7785Mq_PesF = A7785Mq_PesF ;
         }
      }
      if ( GX_JID == -15 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z7956Mq_CodM = A7956Mq_CodM ;
         Z7783Mq_LinP = A7783Mq_LinP ;
         Z10569Mq_UsA = A10569Mq_UsA ;
         Z10570Mq_FcA = A10570Mq_FcA ;
         Z10571Mq_UsM = A10571Mq_UsM ;
         Z10572Mq_FcM = A10572Mq_FcM ;
         Z7784Mq_PesI = A7784Mq_PesI ;
         Z7785Mq_PesF = A7785Mq_PesF ;
         Z7786Mq_ObsT = A7786Mq_ObsT ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal10M1117( )
   {
      edtMq_ULinP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_ULinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_ULinP_Enabled), 5, 0), true);
      edtMq_ULinP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_ULinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_ULinP_Enabled), 5, 0), true);
   }

   public void standaloneModal10M1117( )
   {
      if ( isIns( )  )
      {
         A7782Mq_ULinP = (short)(O7782Mq_ULinP+1) ;
         n7782Mq_ULinP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A7783Mq_LinP = A7782Mq_ULinP ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A10569Mq_UsA)==0) && ( Gx_BScreen == 0 ) )
      {
         A10569Mq_UsA = AV17UsurCod ;
         n10569Mq_UsA = false ;
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A10570Mq_FcA) && ( Gx_BScreen == 0 ) )
      {
         A10570Mq_FcA = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n10570Mq_FcA = false ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMq_LinP_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMq_LinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_LinP_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      else
      {
         edtMq_LinP_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMq_LinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_LinP_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
   }

   public void load10M1117( )
   {
      /* Using cursor T010M19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1117 = (short)(1) ;
         A7786Mq_ObsT = T010M19_A7786Mq_ObsT[0] ;
         n7786Mq_ObsT = T010M19_n7786Mq_ObsT[0] ;
         A10569Mq_UsA = T010M19_A10569Mq_UsA[0] ;
         n10569Mq_UsA = T010M19_n10569Mq_UsA[0] ;
         A10570Mq_FcA = T010M19_A10570Mq_FcA[0] ;
         n10570Mq_FcA = T010M19_n10570Mq_FcA[0] ;
         A10571Mq_UsM = T010M19_A10571Mq_UsM[0] ;
         n10571Mq_UsM = T010M19_n10571Mq_UsM[0] ;
         A10572Mq_FcM = T010M19_A10572Mq_FcM[0] ;
         n10572Mq_FcM = T010M19_n10572Mq_FcM[0] ;
         A7784Mq_PesI = T010M19_A7784Mq_PesI[0] ;
         n7784Mq_PesI = T010M19_n7784Mq_PesI[0] ;
         A7785Mq_PesF = T010M19_A7785Mq_PesF[0] ;
         n7785Mq_PesF = T010M19_n7785Mq_PesF[0] ;
         zm10M1117( -15) ;
      }
      pr_default.close(17);
      onLoadActions10M1117( ) ;
   }

   public void onLoadActions10M1117( )
   {
   }

   public void checkExtendedTable10M1117( )
   {
      nIsDirty_1117 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal10M1117( ) ;
   }

   public void closeExtendedTableCursors10M1117( )
   {
   }

   public void enableDisable10M1117( )
   {
   }

   public void getKey10M1117( )
   {
      /* Using cursor T010M20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1117 = (short)(1) ;
      }
      else
      {
         RcdFound1117 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey10M1117( )
   {
      /* Using cursor T010M3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP)});
      if ( (pr_default.getStatus(1) != 101) && ( T010M3_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T010M3_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T010M3_A7956Mq_CodM[0], A7956Mq_CodM) == 0 ) && ( GXutil.strcmp(T010M3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm10M1117( 15) ;
         RcdFound1117 = (short)(1) ;
         initializeNonKey10M1117( ) ;
         A7786Mq_ObsT = T010M3_A7786Mq_ObsT[0] ;
         n7786Mq_ObsT = T010M3_n7786Mq_ObsT[0] ;
         A7783Mq_LinP = T010M3_A7783Mq_LinP[0] ;
         A10569Mq_UsA = T010M3_A10569Mq_UsA[0] ;
         n10569Mq_UsA = T010M3_n10569Mq_UsA[0] ;
         A10570Mq_FcA = T010M3_A10570Mq_FcA[0] ;
         n10570Mq_FcA = T010M3_n10570Mq_FcA[0] ;
         A10571Mq_UsM = T010M3_A10571Mq_UsM[0] ;
         n10571Mq_UsM = T010M3_n10571Mq_UsM[0] ;
         A10572Mq_FcM = T010M3_A10572Mq_FcM[0] ;
         n10572Mq_FcM = T010M3_n10572Mq_FcM[0] ;
         A7784Mq_PesI = T010M3_A7784Mq_PesI[0] ;
         n7784Mq_PesI = T010M3_n7784Mq_PesI[0] ;
         A7785Mq_PesF = T010M3_A7785Mq_PesF[0] ;
         n7785Mq_PesF = T010M3_n7785Mq_PesF[0] ;
         O7785Mq_PesF = A7785Mq_PesF ;
         n7785Mq_PesF = false ;
         O7784Mq_PesI = A7784Mq_PesI ;
         n7784Mq_PesI = false ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z7956Mq_CodM = A7956Mq_CodM ;
         Z7783Mq_LinP = A7783Mq_LinP ;
         sMode1117 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal10M1117( ) ;
         load10M1117( ) ;
         Gx_mode = sMode1117 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1117 = (short)(0) ;
         initializeNonKey10M1117( ) ;
         sMode1117 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal10M1117( ) ;
         Gx_mode = sMode1117 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes10M1117( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency10M1117( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T010M2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTNART1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10569Mq_UsA, T010M2_A10569Mq_UsA[0]) != 0 ) || !( GXutil.dateCompare(Z10570Mq_FcA, T010M2_A10570Mq_FcA[0]) ) || ( GXutil.strcmp(Z10571Mq_UsM, T010M2_A10571Mq_UsM[0]) != 0 ) || !( GXutil.dateCompare(Z10572Mq_FcM, T010M2_A10572Mq_FcM[0]) ) || ( DecimalUtil.compareTo(Z7784Mq_PesI, T010M2_A7784Mq_PesI[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z7785Mq_PesF, T010M2_A7785Mq_PesF[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z10569Mq_UsA, T010M2_A10569Mq_UsA[0]) != 0 )
            {
               GXutil.writeLogln("ttnart2:[seudo value changed for attri]"+"Mq_UsA");
               GXutil.writeLogRaw("Old: ",Z10569Mq_UsA);
               GXutil.writeLogRaw("Current: ",T010M2_A10569Mq_UsA[0]);
            }
            if ( !( GXutil.dateCompare(Z10570Mq_FcA, T010M2_A10570Mq_FcA[0]) ) )
            {
               GXutil.writeLogln("ttnart2:[seudo value changed for attri]"+"Mq_FcA");
               GXutil.writeLogRaw("Old: ",Z10570Mq_FcA);
               GXutil.writeLogRaw("Current: ",T010M2_A10570Mq_FcA[0]);
            }
            if ( GXutil.strcmp(Z10571Mq_UsM, T010M2_A10571Mq_UsM[0]) != 0 )
            {
               GXutil.writeLogln("ttnart2:[seudo value changed for attri]"+"Mq_UsM");
               GXutil.writeLogRaw("Old: ",Z10571Mq_UsM);
               GXutil.writeLogRaw("Current: ",T010M2_A10571Mq_UsM[0]);
            }
            if ( !( GXutil.dateCompare(Z10572Mq_FcM, T010M2_A10572Mq_FcM[0]) ) )
            {
               GXutil.writeLogln("ttnart2:[seudo value changed for attri]"+"Mq_FcM");
               GXutil.writeLogRaw("Old: ",Z10572Mq_FcM);
               GXutil.writeLogRaw("Current: ",T010M2_A10572Mq_FcM[0]);
            }
            if ( DecimalUtil.compareTo(Z7784Mq_PesI, T010M2_A7784Mq_PesI[0]) != 0 )
            {
               GXutil.writeLogln("ttnart2:[seudo value changed for attri]"+"Mq_PesI");
               GXutil.writeLogRaw("Old: ",Z7784Mq_PesI);
               GXutil.writeLogRaw("Current: ",T010M2_A7784Mq_PesI[0]);
            }
            if ( DecimalUtil.compareTo(Z7785Mq_PesF, T010M2_A7785Mq_PesF[0]) != 0 )
            {
               GXutil.writeLogln("ttnart2:[seudo value changed for attri]"+"Mq_PesF");
               GXutil.writeLogRaw("Old: ",Z7785Mq_PesF);
               GXutil.writeLogRaw("Current: ",T010M2_A7785Mq_PesF[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTNART1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert10M1117( )
   {
      beforeValidate10M1117( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10M1117( ) ;
      }
      if ( AnyError == 0 )
      {
         zm10M1117( 0) ;
         checkOptimisticConcurrency10M1117( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10M1117( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert10M1117( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010M21 */
                  pr_default.execute(19, new Object[] {Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP), Boolean.valueOf(n10569Mq_UsA), A10569Mq_UsA, Boolean.valueOf(n10570Mq_FcA), A10570Mq_FcA, Boolean.valueOf(n10571Mq_UsM), A10571Mq_UsM, Boolean.valueOf(n10572Mq_FcM), A10572Mq_FcM, Boolean.valueOf(n7784Mq_PesI), A7784Mq_PesI, Boolean.valueOf(n7785Mq_PesF), A7785Mq_PesF, Boolean.valueOf(n7786Mq_ObsT), A7786Mq_ObsT, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTNART1");
                  if ( (pr_default.getStatus(19) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( ( A7783Mq_LinP > 0 ) && ( A7784Mq_PesI.doubleValue() > 0 ) && ( A7785Mq_PesF.doubleValue() > 0 ) && true /* After */ )
                     {
                        httpContext.wjLoc = formatLink("app.ttnartp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.rtrim(A7956Mq_CodM)),GXutil.URLEncode(GXutil.ltrimstr(A7783Mq_LinP,4,0)),GXutil.URLEncode(GXutil.rtrim(AV36Modif))}, new String[] {"EmprCod","CliCod","ArtCod","Mq_CodM","Mq_LinP","Modif"})  ;
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
            load10M1117( ) ;
         }
         endLevel10M1117( ) ;
      }
      closeExtendedTableCursors10M1117( ) ;
   }

   public void update10M1117( )
   {
      beforeValidate10M1117( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10M1117( ) ;
      }
      if ( ( nIsMod_1117 != 0 ) || ( nIsDirty_1117 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency10M1117( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm10M1117( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate10M1117( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T010M22 */
                     pr_default.execute(20, new Object[] {Boolean.valueOf(n10569Mq_UsA), A10569Mq_UsA, Boolean.valueOf(n10570Mq_FcA), A10570Mq_FcA, Boolean.valueOf(n10571Mq_UsM), A10571Mq_UsM, Boolean.valueOf(n10572Mq_FcM), A10572Mq_FcM, Boolean.valueOf(n7784Mq_PesI), A7784Mq_PesI, Boolean.valueOf(n7785Mq_PesF), A7785Mq_PesF, Boolean.valueOf(n7786Mq_ObsT), A7786Mq_ObsT, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTNART1");
                     if ( (pr_default.getStatus(20) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTNART1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate10M1117( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey10M1117( ) ;
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
            endLevel10M1117( ) ;
         }
      }
      closeExtendedTableCursors10M1117( ) ;
   }

   public void deferredUpdate10M1117( )
   {
   }

   public void delete10M1117( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate10M1117( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10M1117( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls10M1117( ) ;
         afterConfirm10M1117( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete10M1117( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T010M23 */
               pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTNART1");
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
      sMode1117 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel10M1117( ) ;
      Gx_mode = sMode1117 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls10M1117( )
   {
      standaloneModal10M1117( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T010M24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TNARTp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
      }
   }

   public void endLevel10M1117( )
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

   public void scanStart10M1117( )
   {
      /* Scan By routine */
      /* Using cursor T010M25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM});
      RcdFound1117 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1117 = (short)(1) ;
         A7783Mq_LinP = T010M25_A7783Mq_LinP[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext10M1117( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound1117 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1117 = (short)(1) ;
         A7783Mq_LinP = T010M25_A7783Mq_LinP[0] ;
      }
   }

   public void scanEnd10M1117( )
   {
      pr_default.close(23);
   }

   public void afterConfirm10M1117( )
   {
      /* After Confirm Rules */
      if ( true /* After */ && ( ( DecimalUtil.compareTo(A7784Mq_PesI, O7784Mq_PesI) != 0 ) || ( DecimalUtil.compareTo(A7785Mq_PesF, O7785Mq_PesF) != 0 ) ) )
      {
         A10571Mq_UsM = AV17UsurCod ;
         n10571Mq_UsM = false ;
      }
      if ( true /* After */ && ( ( DecimalUtil.compareTo(A7784Mq_PesI, O7784Mq_PesI) != 0 ) || ( DecimalUtil.compareTo(A7785Mq_PesF, O7785Mq_PesF) != 0 ) ) )
      {
         A10572Mq_FcM = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n10572Mq_FcM = false ;
      }
   }

   public void beforeInsert10M1117( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate10M1117( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete10M1117( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete10M1117( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate10M1117( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes10M1117( )
   {
      edtMq_LinP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_LinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_LinP_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMq_PesI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_PesI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_PesI_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMq_PesF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_PesF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_PesF_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMq_ObsT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_ObsT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_ObsT_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMq_UsA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_UsA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_UsA_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMq_FcA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_FcA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_FcA_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMq_UsM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_UsM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_UsM_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMq_FcM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_FcM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_FcM_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void send_integrity_lvl_hashes10M1117( )
   {
   }

   public void send_integrity_lvl_hashes10M1116( )
   {
   }

   public void subsflControlProps_651117( )
   {
      edtavnRcdDeleted_1117_Internalname = "vNRCDDELETED_1117_"+sGXsfl_65_idx ;
      edtMq_LinP_Internalname = "MQ_LINP_"+sGXsfl_65_idx ;
      edtMq_PesI_Internalname = "MQ_PESI_"+sGXsfl_65_idx ;
      edtMq_PesF_Internalname = "MQ_PESF_"+sGXsfl_65_idx ;
      edtMq_ObsT_Internalname = "MQ_OBST_"+sGXsfl_65_idx ;
      edtMq_UsA_Internalname = "MQ_USA_"+sGXsfl_65_idx ;
      edtMq_FcA_Internalname = "MQ_FCA_"+sGXsfl_65_idx ;
      edtMq_UsM_Internalname = "MQ_USM_"+sGXsfl_65_idx ;
      edtMq_FcM_Internalname = "MQ_FCM_"+sGXsfl_65_idx ;
   }

   public void subsflControlProps_fel_651117( )
   {
      edtavnRcdDeleted_1117_Internalname = "vNRCDDELETED_1117_"+sGXsfl_65_fel_idx ;
      edtMq_LinP_Internalname = "MQ_LINP_"+sGXsfl_65_fel_idx ;
      edtMq_PesI_Internalname = "MQ_PESI_"+sGXsfl_65_fel_idx ;
      edtMq_PesF_Internalname = "MQ_PESF_"+sGXsfl_65_fel_idx ;
      edtMq_ObsT_Internalname = "MQ_OBST_"+sGXsfl_65_fel_idx ;
      edtMq_UsA_Internalname = "MQ_USA_"+sGXsfl_65_fel_idx ;
      edtMq_FcA_Internalname = "MQ_FCA_"+sGXsfl_65_fel_idx ;
      edtMq_UsM_Internalname = "MQ_USM_"+sGXsfl_65_fel_idx ;
      edtMq_FcM_Internalname = "MQ_FCM_"+sGXsfl_65_fel_idx ;
   }

   public void addRow10M1117( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651117( ) ;
      sendRow10M1117( ) ;
   }

   public void sendRow10M1117( )
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
         if ( ((int)((nGXsfl_65_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1117_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1117_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1117, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1117_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1117), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1117), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1117_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1117_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1117_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMq_LinP_Internalname,GXutil.ltrim( localUtil.ntoc( A7783Mq_LinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7783Mq_LinP), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMq_LinP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMq_LinP_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1117_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMq_PesI_Internalname,GXutil.ltrim( localUtil.ntoc( A7784Mq_PesI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMq_PesI_Enabled!=0) ? localUtil.format( A7784Mq_PesI, "ZZZZZ9.99") : localUtil.format( A7784Mq_PesI, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMq_PesI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMq_PesI_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1117_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMq_PesF_Internalname,GXutil.ltrim( localUtil.ntoc( A7785Mq_PesF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMq_PesF_Enabled!=0) ? localUtil.format( A7785Mq_PesF, "ZZZZZ9.99") : localUtil.format( A7785Mq_PesF, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMq_PesF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMq_PesF_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1117_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMq_ObsT_Internalname,A7786Mq_ObsT,A7786Mq_ObsT,TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,70);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMq_ObsT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMq_ObsT_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(32768),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1117_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMq_UsA_Internalname,GXutil.rtrim( A10569Mq_UsA),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMq_UsA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMq_UsA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1117_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMq_FcA_Internalname,localUtil.ttoc( A10570Mq_FcA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10570Mq_FcA, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMq_FcA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMq_FcA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1117_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMq_UsM_Internalname,GXutil.rtrim( A10571Mq_UsM),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMq_UsM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMq_UsM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1117_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMq_FcM_Internalname,localUtil.ttoc( A10572Mq_FcM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10572Mq_FcM, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMq_FcM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMq_FcM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes10M1117( ) ;
      GXCCtl = "Z7783Mq_LinP_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7783Mq_LinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10569Mq_UsA_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10569Mq_UsA));
      GXCCtl = "Z10570Mq_FcA_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z10570Mq_FcA, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z10571Mq_UsM_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10571Mq_UsM));
      GXCCtl = "Z10572Mq_FcM_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z10572Mq_FcM, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z7784Mq_PesI_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7784Mq_PesI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7785Mq_PesF_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7785Mq_PesF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O7785Mq_PesF_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O7785Mq_PesF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O7784Mq_PesI_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O7784Mq_PesI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1117_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1117, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1117_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1117, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1117_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1117, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vMODIF_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV36Modif));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1117_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1117_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQ_LINP_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_LinP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQ_PESI_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_PesI_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQ_PESF_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_PesF_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQ_OBST_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_ObsT_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQ_USA_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_UsA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQ_FCA_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_FcA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQ_USM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_UsM_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQ_FCM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_FcM_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow10M1117( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651117( ) ;
      edtavnRcdDeleted_1117_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1117_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMq_LinP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_LINP_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMq_PesI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_PESI_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMq_PesF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_PESF_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMq_ObsT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_OBST_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMq_UsA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_USA_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMq_FcA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_FCA_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMq_UsM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_USM_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMq_FcM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_FCM_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1117_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1117_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1117");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1117_Internalname ;
         wbErr = true ;
         nRcdDeleted_1117 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1117 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1117_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMq_LinP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMq_LinP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "MQ_LINP_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMq_LinP_Internalname ;
         wbErr = true ;
         A7783Mq_LinP = (short)(0) ;
      }
      else
      {
         A7783Mq_LinP = (short)(localUtil.ctol( httpContext.cgiGet( edtMq_LinP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMq_PesI_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMq_PesI_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "MQ_PESI_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMq_PesI_Internalname ;
         wbErr = true ;
         A7784Mq_PesI = DecimalUtil.ZERO ;
         n7784Mq_PesI = false ;
      }
      else
      {
         A7784Mq_PesI = localUtil.ctond( httpContext.cgiGet( edtMq_PesI_Internalname)) ;
         n7784Mq_PesI = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMq_PesF_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMq_PesF_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "MQ_PESF_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMq_PesF_Internalname ;
         wbErr = true ;
         A7785Mq_PesF = DecimalUtil.ZERO ;
         n7785Mq_PesF = false ;
      }
      else
      {
         A7785Mq_PesF = localUtil.ctond( httpContext.cgiGet( edtMq_PesF_Internalname)) ;
         n7785Mq_PesF = false ;
      }
      A7786Mq_ObsT = httpContext.cgiGet( edtMq_ObsT_Internalname) ;
      n7786Mq_ObsT = false ;
      A10569Mq_UsA = httpContext.cgiGet( edtMq_UsA_Internalname) ;
      n10569Mq_UsA = false ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtMq_FcA_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "MQ_FCA_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMq_FcA_Internalname ;
         wbErr = true ;
         A10570Mq_FcA = GXutil.resetTime( GXutil.nullDate() );
         n10570Mq_FcA = false ;
      }
      else
      {
         A10570Mq_FcA = localUtil.ctot( httpContext.cgiGet( edtMq_FcA_Internalname)) ;
         n10570Mq_FcA = false ;
      }
      A10571Mq_UsM = httpContext.cgiGet( edtMq_UsM_Internalname) ;
      n10571Mq_UsM = false ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtMq_FcM_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "MQ_FCM_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMq_FcM_Internalname ;
         wbErr = true ;
         A10572Mq_FcM = GXutil.resetTime( GXutil.nullDate() );
         n10572Mq_FcM = false ;
      }
      else
      {
         A10572Mq_FcM = localUtil.ctot( httpContext.cgiGet( edtMq_FcM_Internalname)) ;
         n10572Mq_FcM = false ;
      }
      GXCCtl = "Z7783Mq_LinP_" + sGXsfl_65_idx ;
      Z7783Mq_LinP = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10569Mq_UsA_" + sGXsfl_65_idx ;
      Z10569Mq_UsA = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10570Mq_FcA_" + sGXsfl_65_idx ;
      Z10570Mq_FcA = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z10571Mq_UsM_" + sGXsfl_65_idx ;
      Z10571Mq_UsM = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10572Mq_FcM_" + sGXsfl_65_idx ;
      Z10572Mq_FcM = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z7784Mq_PesI_" + sGXsfl_65_idx ;
      Z7784Mq_PesI = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7785Mq_PesF_" + sGXsfl_65_idx ;
      Z7785Mq_PesF = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O7785Mq_PesF_" + sGXsfl_65_idx ;
      O7785Mq_PesF = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O7784Mq_PesI_" + sGXsfl_65_idx ;
      O7784Mq_PesI = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1117_" + sGXsfl_65_idx ;
      nRcdDeleted_1117 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1117_" + sGXsfl_65_idx ;
      nRcdExists_1117 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1117_" + sGXsfl_65_idx ;
      nIsMod_1117 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMq_LinP_Enabled = edtMq_LinP_Enabled ;
   }

   public void confirmValues10M0( )
   {
      nGXsfl_65_idx = 0 ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651117( ) ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_651117( ) ;
         httpContext.changePostValue( "Z7783Mq_LinP_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z7783Mq_LinP_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7783Mq_LinP_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z10569Mq_UsA_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z10569Mq_UsA_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10569Mq_UsA_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z10570Mq_FcA_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z10570Mq_FcA_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10570Mq_FcA_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z10571Mq_UsM_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z10571Mq_UsM_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10571Mq_UsM_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z10572Mq_FcM_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z10572Mq_FcM_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10572Mq_FcM_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z7784Mq_PesI_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z7784Mq_PesI_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7784Mq_PesI_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z7785Mq_PesF_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z7785Mq_PesF_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7785Mq_PesF_"+sGXsfl_65_idx) ;
      }
      httpContext.changePostValue( "O7785Mq_PesF", httpContext.cgiGet( "T7785Mq_PesF")) ;
      httpContext.deletePostValue( "T7785Mq_PesF") ;
      httpContext.changePostValue( "O7784Mq_PesI", httpContext.cgiGet( "T7784Mq_PesI")) ;
      httpContext.deletePostValue( "T7784Mq_PesI") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttnart2", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.rtrim(A7956Mq_CodM)),GXutil.URLEncode(GXutil.rtrim(AV36Modif))}, new String[] {"EmprCod","CliCod","ArtCod","Mq_CodM","Modif"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z7782Mq_ULinP", GXutil.ltrim( localUtil.ntoc( Z7782Mq_ULinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O7782Mq_ULinP", GXutil.ltrim( localUtil.ntoc( O7782Mq_ULinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_65", GXutil.ltrim( localUtil.ntoc( nGXsfl_65_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV38Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODIF", GXutil.rtrim( AV36Modif));
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
      return formatLink("app.ttnart2", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.rtrim(A7956Mq_CodM)),GXutil.URLEncode(GXutil.rtrim(AV36Modif))}, new String[] {"EmprCod","CliCod","ArtCod","Mq_CodM","Modif"})  ;
   }

   public String getPgmname( )
   {
      return "TTNART2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ENTRADA PESO", "") ;
   }

   public void initializeNonKey10M1116( )
   {
      A7782Mq_ULinP = (short)(0) ;
      n7782Mq_ULinP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
      O7782Mq_ULinP = A7782Mq_ULinP ;
      n7782Mq_ULinP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
      Z7782Mq_ULinP = (short)(0) ;
   }

   public void initAll10M1116( )
   {
      initializeNonKey10M1116( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey10M1117( )
   {
      A10571Mq_UsM = "" ;
      n10571Mq_UsM = false ;
      A10572Mq_FcM = GXutil.resetTime( GXutil.nullDate() );
      n10572Mq_FcM = false ;
      A7784Mq_PesI = DecimalUtil.ZERO ;
      n7784Mq_PesI = false ;
      A7785Mq_PesF = DecimalUtil.ZERO ;
      n7785Mq_PesF = false ;
      A7786Mq_ObsT = "" ;
      n7786Mq_ObsT = false ;
      A10569Mq_UsA = AV17UsurCod ;
      n10569Mq_UsA = false ;
      A10570Mq_FcA = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n10570Mq_FcA = false ;
      O7785Mq_PesF = A7785Mq_PesF ;
      n7785Mq_PesF = false ;
      O7784Mq_PesI = A7784Mq_PesI ;
      n7784Mq_PesI = false ;
      Z10569Mq_UsA = "" ;
      Z10570Mq_FcA = GXutil.resetTime( GXutil.nullDate() );
      Z10571Mq_UsM = "" ;
      Z10572Mq_FcM = GXutil.resetTime( GXutil.nullDate() );
      Z7784Mq_PesI = DecimalUtil.ZERO ;
      Z7785Mq_PesF = DecimalUtil.ZERO ;
   }

   public void initAll10M1117( )
   {
      A7783Mq_LinP = (short)(0) ;
      initializeNonKey10M1117( ) ;
   }

   public void standaloneModalInsert10M1117( )
   {
      A7782Mq_ULinP = i7782Mq_ULinP ;
      n7782Mq_ULinP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7782Mq_ULinP), 4, 0));
      A10569Mq_UsA = i10569Mq_UsA ;
      n10569Mq_UsA = false ;
      A10570Mq_FcA = i10570Mq_FcA ;
      n10570Mq_FcA = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241534040", true, true);
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
      httpContext.AddJavascriptSource("ttnart2.js", "?20268241534041", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1117( )
   {
      edtMq_LinP_Enabled = defedtMq_LinP_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_LinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_LinP_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void startgridcontrol65( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1117, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1117_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7783Mq_LinP, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_LinP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7784Mq_PesI, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_PesI_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7785Mq_PesF, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_PesF_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A7786Mq_ObsT);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_ObsT_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10569Mq_UsA));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_UsA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A10570Mq_FcA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_FcA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10571Mq_UsM));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_UsM_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A10572Mq_FcM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_FcM_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtMq_DscM_Internalname = "MQ_DSCM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtMq_ULinP_Internalname = "MQ_ULINP" ;
      edtavnRcdDeleted_1117_Internalname = "vNRCDDELETED_1117" ;
      edtMq_LinP_Internalname = "MQ_LINP" ;
      edtMq_PesI_Internalname = "MQ_PESI" ;
      edtMq_PesF_Internalname = "MQ_PESF" ;
      edtMq_ObsT_Internalname = "MQ_OBST" ;
      edtMq_UsA_Internalname = "MQ_USA" ;
      edtMq_FcA_Internalname = "MQ_FCA" ;
      edtMq_UsM_Internalname = "MQ_USM" ;
      edtMq_FcM_Internalname = "MQ_FCM" ;
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
      Form.setCaption( httpContext.getMessage( "ENTRADA PESO", "") );
      edtMq_FcM_Jsonclick = "" ;
      edtMq_UsM_Jsonclick = "" ;
      edtMq_FcA_Jsonclick = "" ;
      edtMq_UsA_Jsonclick = "" ;
      edtMq_ObsT_Jsonclick = "" ;
      edtMq_PesF_Jsonclick = "" ;
      edtMq_PesI_Jsonclick = "" ;
      edtMq_LinP_Jsonclick = "" ;
      edtavnRcdDeleted_1117_Jsonclick = "" ;
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
      edtMq_FcM_Enabled = 1 ;
      edtMq_UsM_Enabled = 1 ;
      edtMq_FcA_Enabled = 1 ;
      edtMq_UsA_Enabled = 1 ;
      edtMq_ObsT_Enabled = 1 ;
      edtMq_PesF_Enabled = 1 ;
      edtMq_PesI_Enabled = 1 ;
      edtMq_LinP_Enabled = 1 ;
      edtavnRcdDeleted_1117_Enabled = 1 ;
      edtMq_ULinP_Jsonclick = "" ;
      edtMq_ULinP_Backcolor = (int)(0xFFFFFF) ;
      edtMq_ULinP_Enabled = 0 ;
      edtMq_DscM_Jsonclick = "" ;
      edtMq_DscM_Backcolor = (int)(0xFFFFFF) ;
      edtMq_DscM_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
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

   public void gx1asamq_dscm10M1116( String A396EmprCod ,
                                     String A7956Mq_CodM )
   {
      GXt_char4 = A7957Mq_DscM ;
      GXv_char3[0] = GXt_char4 ;
      new app.pobtmaq(remoteHandle, context).execute( A396EmprCod, A7956Mq_CodM, GXv_char3) ;
      ttnart2_impl.this.GXt_char4 = GXv_char3[0] ;
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

   public void xc_10_10M1117( )
   {
      if ( ( A7783Mq_LinP > 0 ) && ( A7784Mq_PesI.doubleValue() > 0 ) && ( A7785Mq_PesF.doubleValue() > 0 ) && true /* After */ )
      {
         httpContext.wjLoc = formatLink("app.ttnartp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.rtrim(A7956Mq_CodM)),GXutil.URLEncode(GXutil.ltrimstr(A7783Mq_LinP,4,0)),GXutil.URLEncode(GXutil.rtrim(AV36Modif))}, new String[] {"EmprCod","CliCod","ArtCod","Mq_CodM","Mq_LinP","Modif"})  ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_651117( ) ;
      while ( nGXsfl_65_idx <= nRC_GXsfl_65 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal10M1117( ) ;
         standaloneModal10M1117( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow10M1117( ) ;
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_651117( ) ;
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
      /* Using cursor T010M26 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T010M26_A407EmprNom[0] ;
      n407EmprNom = T010M26_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(24);
      /* Using cursor T010M27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T010M27_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(25);
      /* Using cursor T010M28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
      A69ArtDsc = T010M28_A69ArtDsc[0] ;
      n69ArtDsc = T010M28_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(26);
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

   public void valid_Mq_codm( )
   {
      n7782Mq_ULinP = false ;
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
      httpContext.ajax_rsp_assign_attri("", false, "A7782Mq_ULinP", GXutil.ltrim( localUtil.ntoc( A7782Mq_ULinP, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7956Mq_CodM", GXutil.rtrim( Z7956Mq_CodM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7957Mq_DscM", GXutil.rtrim( Z7957Mq_DscM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7782Mq_ULinP", GXutil.ltrim( localUtil.ntoc( Z7782Mq_ULinP, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O7782Mq_ULinP", GXutil.ltrim( localUtil.ntoc( O7782Mq_ULinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A7956Mq_CodM',fld:'MQ_CODM',pic:''},{av:'AV36Modif',fld:'vMODIF',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'ENTRADA PARAMETROS'","{handler:'e1210M2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A7956Mq_CodM',fld:'MQ_CODM',pic:''},{av:'A7783Mq_LinP',fld:'MQ_LINP',pic:'ZZZ9'},{av:'AV36Modif',fld:'vMODIF',pic:''}]");
      setEventMetadata("'ENTRADA PARAMETROS'",",oparms:[{av:'AV36Modif',fld:'vMODIF',pic:''},{av:'A7783Mq_LinP',fld:'MQ_LINP',pic:'ZZZ9'},{av:'A7956Mq_CodM',fld:'MQ_CODM',pic:''},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[]");
      setEventMetadata("VALID_ARTCOD",",oparms:[]}");
      setEventMetadata("VALID_MQ_CODM","{handler:'valid_Mq_codm',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A7782Mq_ULinP',fld:'MQ_ULINP',pic:'ZZZ9'},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV36Modif',fld:'vMODIF',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A7956Mq_CodM',fld:'MQ_CODM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MQ_CODM",",oparms:[{av:'A7957Mq_DscM',fld:'MQ_DSCM',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'A7782Mq_ULinP',fld:'MQ_ULINP',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z7956Mq_CodM'},{av:'Z7957Mq_DscM'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z69ArtDsc'},{av:'Z7782Mq_ULinP'},{av:'O7782Mq_ULinP'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MQ_ULINP","{handler:'valid_Mq_ulinp',iparms:[]");
      setEventMetadata("VALID_MQ_ULINP",",oparms:[]}");
      setEventMetadata("VALID_MQ_LINP","{handler:'valid_Mq_linp',iparms:[]");
      setEventMetadata("VALID_MQ_LINP",",oparms:[]}");
      setEventMetadata("VALID_MQ_PESI","{handler:'valid_Mq_pesi',iparms:[]");
      setEventMetadata("VALID_MQ_PESI",",oparms:[]}");
      setEventMetadata("VALID_MQ_PESF","{handler:'valid_Mq_pesf',iparms:[]");
      setEventMetadata("VALID_MQ_PESF",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Mq_fcm',iparms:[]");
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
      pr_default.close(26);
      pr_default.close(25);
      pr_default.close(24);
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
      Z10569Mq_UsA = "" ;
      Z10570Mq_FcA = GXutil.resetTime( GXutil.nullDate() );
      Z10571Mq_UsM = "" ;
      Z10572Mq_FcM = GXutil.resetTime( GXutil.nullDate() );
      Z7784Mq_PesI = DecimalUtil.ZERO ;
      Z7785Mq_PesF = DecimalUtil.ZERO ;
      O7785Mq_PesF = DecimalUtil.ZERO ;
      O7784Mq_PesI = DecimalUtil.ZERO ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A7957Mq_DscM = "" ;
      lblTextblock9_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1117 = "" ;
      GX_FocusControl = "" ;
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
      sMode1116 = "" ;
      GXCCtl = "" ;
      A7784Mq_PesI = DecimalUtil.ZERO ;
      A7785Mq_PesF = DecimalUtil.ZERO ;
      A7786Mq_ObsT = "" ;
      A10569Mq_UsA = "" ;
      A10570Mq_FcA = GXutil.resetTime( GXutil.nullDate() );
      A10571Mq_UsM = "" ;
      A10572Mq_FcM = GXutil.resetTime( GXutil.nullDate() );
      T7785Mq_PesF = DecimalUtil.ZERO ;
      T7784Mq_PesI = DecimalUtil.ZERO ;
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
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z69ArtDsc = "" ;
      T010M6_A407EmprNom = new String[] {""} ;
      T010M6_n407EmprNom = new boolean[] {false} ;
      T010M7_A279CliNom = new String[] {""} ;
      T010M8_A69ArtDsc = new String[] {""} ;
      T010M8_n69ArtDsc = new boolean[] {false} ;
      T010M9_A7956Mq_CodM = new String[] {""} ;
      T010M9_A407EmprNom = new String[] {""} ;
      T010M9_n407EmprNom = new boolean[] {false} ;
      T010M9_A279CliNom = new String[] {""} ;
      T010M9_A69ArtDsc = new String[] {""} ;
      T010M9_n69ArtDsc = new boolean[] {false} ;
      T010M9_A7782Mq_ULinP = new short[1] ;
      T010M9_n7782Mq_ULinP = new boolean[] {false} ;
      T010M9_A396EmprCod = new String[] {""} ;
      T010M9_A252CliCod = new int[1] ;
      T010M9_A65ArtCod = new String[] {""} ;
      T010M10_A396EmprCod = new String[] {""} ;
      T010M10_A252CliCod = new int[1] ;
      T010M10_A65ArtCod = new String[] {""} ;
      T010M10_A7956Mq_CodM = new String[] {""} ;
      T010M5_A7956Mq_CodM = new String[] {""} ;
      T010M5_A7782Mq_ULinP = new short[1] ;
      T010M5_n7782Mq_ULinP = new boolean[] {false} ;
      T010M5_A396EmprCod = new String[] {""} ;
      T010M5_A252CliCod = new int[1] ;
      T010M5_A65ArtCod = new String[] {""} ;
      T010M11_A396EmprCod = new String[] {""} ;
      T010M11_A252CliCod = new int[1] ;
      T010M11_A65ArtCod = new String[] {""} ;
      T010M11_A7956Mq_CodM = new String[] {""} ;
      T010M12_A396EmprCod = new String[] {""} ;
      T010M12_A252CliCod = new int[1] ;
      T010M12_A65ArtCod = new String[] {""} ;
      T010M12_A7956Mq_CodM = new String[] {""} ;
      T010M4_A7956Mq_CodM = new String[] {""} ;
      T010M4_A7782Mq_ULinP = new short[1] ;
      T010M4_n7782Mq_ULinP = new boolean[] {false} ;
      T010M4_A396EmprCod = new String[] {""} ;
      T010M4_A252CliCod = new int[1] ;
      T010M4_A65ArtCod = new String[] {""} ;
      T010M16_A396EmprCod = new String[] {""} ;
      T010M16_A252CliCod = new int[1] ;
      T010M16_A65ArtCod = new String[] {""} ;
      T010M16_A7956Mq_CodM = new String[] {""} ;
      T010M16_A7783Mq_LinP = new short[1] ;
      T010M16_A7949Par_Art = new short[1] ;
      T010M18_A396EmprCod = new String[] {""} ;
      T010M18_A252CliCod = new int[1] ;
      T010M18_A65ArtCod = new String[] {""} ;
      T010M18_A7956Mq_CodM = new String[] {""} ;
      Z7786Mq_ObsT = "" ;
      T010M19_A7786Mq_ObsT = new String[] {""} ;
      T010M19_n7786Mq_ObsT = new boolean[] {false} ;
      T010M19_A252CliCod = new int[1] ;
      T010M19_A65ArtCod = new String[] {""} ;
      T010M19_A7956Mq_CodM = new String[] {""} ;
      T010M19_A7783Mq_LinP = new short[1] ;
      T010M19_A10569Mq_UsA = new String[] {""} ;
      T010M19_n10569Mq_UsA = new boolean[] {false} ;
      T010M19_A10570Mq_FcA = new java.util.Date[] {GXutil.nullDate()} ;
      T010M19_n10570Mq_FcA = new boolean[] {false} ;
      T010M19_A10571Mq_UsM = new String[] {""} ;
      T010M19_n10571Mq_UsM = new boolean[] {false} ;
      T010M19_A10572Mq_FcM = new java.util.Date[] {GXutil.nullDate()} ;
      T010M19_n10572Mq_FcM = new boolean[] {false} ;
      T010M19_A7784Mq_PesI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010M19_n7784Mq_PesI = new boolean[] {false} ;
      T010M19_A7785Mq_PesF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010M19_n7785Mq_PesF = new boolean[] {false} ;
      T010M19_A396EmprCod = new String[] {""} ;
      T010M20_A396EmprCod = new String[] {""} ;
      T010M20_A252CliCod = new int[1] ;
      T010M20_A65ArtCod = new String[] {""} ;
      T010M20_A7956Mq_CodM = new String[] {""} ;
      T010M20_A7783Mq_LinP = new short[1] ;
      T010M3_A7786Mq_ObsT = new String[] {""} ;
      T010M3_n7786Mq_ObsT = new boolean[] {false} ;
      T010M3_A252CliCod = new int[1] ;
      T010M3_A65ArtCod = new String[] {""} ;
      T010M3_A7956Mq_CodM = new String[] {""} ;
      T010M3_A7783Mq_LinP = new short[1] ;
      T010M3_A10569Mq_UsA = new String[] {""} ;
      T010M3_n10569Mq_UsA = new boolean[] {false} ;
      T010M3_A10570Mq_FcA = new java.util.Date[] {GXutil.nullDate()} ;
      T010M3_n10570Mq_FcA = new boolean[] {false} ;
      T010M3_A10571Mq_UsM = new String[] {""} ;
      T010M3_n10571Mq_UsM = new boolean[] {false} ;
      T010M3_A10572Mq_FcM = new java.util.Date[] {GXutil.nullDate()} ;
      T010M3_n10572Mq_FcM = new boolean[] {false} ;
      T010M3_A7784Mq_PesI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010M3_n7784Mq_PesI = new boolean[] {false} ;
      T010M3_A7785Mq_PesF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010M3_n7785Mq_PesF = new boolean[] {false} ;
      T010M3_A396EmprCod = new String[] {""} ;
      T010M2_A7786Mq_ObsT = new String[] {""} ;
      T010M2_n7786Mq_ObsT = new boolean[] {false} ;
      T010M2_A252CliCod = new int[1] ;
      T010M2_A65ArtCod = new String[] {""} ;
      T010M2_A7956Mq_CodM = new String[] {""} ;
      T010M2_A7783Mq_LinP = new short[1] ;
      T010M2_A10569Mq_UsA = new String[] {""} ;
      T010M2_n10569Mq_UsA = new boolean[] {false} ;
      T010M2_A10570Mq_FcA = new java.util.Date[] {GXutil.nullDate()} ;
      T010M2_n10570Mq_FcA = new boolean[] {false} ;
      T010M2_A10571Mq_UsM = new String[] {""} ;
      T010M2_n10571Mq_UsM = new boolean[] {false} ;
      T010M2_A10572Mq_FcM = new java.util.Date[] {GXutil.nullDate()} ;
      T010M2_n10572Mq_FcM = new boolean[] {false} ;
      T010M2_A7784Mq_PesI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010M2_n7784Mq_PesI = new boolean[] {false} ;
      T010M2_A7785Mq_PesF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010M2_n7785Mq_PesF = new boolean[] {false} ;
      T010M2_A396EmprCod = new String[] {""} ;
      T010M24_A396EmprCod = new String[] {""} ;
      T010M24_A252CliCod = new int[1] ;
      T010M24_A65ArtCod = new String[] {""} ;
      T010M24_A7956Mq_CodM = new String[] {""} ;
      T010M24_A7783Mq_LinP = new short[1] ;
      T010M24_A7949Par_Art = new short[1] ;
      T010M25_A396EmprCod = new String[] {""} ;
      T010M25_A252CliCod = new int[1] ;
      T010M25_A65ArtCod = new String[] {""} ;
      T010M25_A7956Mq_CodM = new String[] {""} ;
      T010M25_A7783Mq_LinP = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i10569Mq_UsA = "" ;
      i10570Mq_FcA = GXutil.resetTime( GXutil.nullDate() );
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXt_char4 = "" ;
      GXv_char3 = new String[1] ;
      T010M26_A407EmprNom = new String[] {""} ;
      T010M26_n407EmprNom = new boolean[] {false} ;
      T010M27_A279CliNom = new String[] {""} ;
      T010M28_A69ArtDsc = new String[] {""} ;
      T010M28_n69ArtDsc = new boolean[] {false} ;
      Z7957Mq_DscM = "" ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ7956Mq_CodM = "" ;
      ZZ7957Mq_DscM = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ69ArtDsc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttnart2__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttnart2__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttnart2__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttnart2__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttnart2__default(),
         new Object[] {
             new Object[] {
            T010M2_A7786Mq_ObsT, T010M2_n7786Mq_ObsT, T010M2_A252CliCod, T010M2_A65ArtCod, T010M2_A7956Mq_CodM, T010M2_A7783Mq_LinP, T010M2_A10569Mq_UsA, T010M2_n10569Mq_UsA, T010M2_A10570Mq_FcA, T010M2_n10570Mq_FcA,
            T010M2_A10571Mq_UsM, T010M2_n10571Mq_UsM, T010M2_A10572Mq_FcM, T010M2_n10572Mq_FcM, T010M2_A7784Mq_PesI, T010M2_n7784Mq_PesI, T010M2_A7785Mq_PesF, T010M2_n7785Mq_PesF, T010M2_A396EmprCod
            }
            , new Object[] {
            T010M3_A7786Mq_ObsT, T010M3_n7786Mq_ObsT, T010M3_A252CliCod, T010M3_A65ArtCod, T010M3_A7956Mq_CodM, T010M3_A7783Mq_LinP, T010M3_A10569Mq_UsA, T010M3_n10569Mq_UsA, T010M3_A10570Mq_FcA, T010M3_n10570Mq_FcA,
            T010M3_A10571Mq_UsM, T010M3_n10571Mq_UsM, T010M3_A10572Mq_FcM, T010M3_n10572Mq_FcM, T010M3_A7784Mq_PesI, T010M3_n7784Mq_PesI, T010M3_A7785Mq_PesF, T010M3_n7785Mq_PesF, T010M3_A396EmprCod
            }
            , new Object[] {
            T010M4_A7956Mq_CodM, T010M4_A7782Mq_ULinP, T010M4_n7782Mq_ULinP, T010M4_A396EmprCod, T010M4_A252CliCod, T010M4_A65ArtCod
            }
            , new Object[] {
            T010M5_A7956Mq_CodM, T010M5_A7782Mq_ULinP, T010M5_n7782Mq_ULinP, T010M5_A396EmprCod, T010M5_A252CliCod, T010M5_A65ArtCod
            }
            , new Object[] {
            T010M6_A407EmprNom, T010M6_n407EmprNom
            }
            , new Object[] {
            T010M7_A279CliNom
            }
            , new Object[] {
            T010M8_A69ArtDsc, T010M8_n69ArtDsc
            }
            , new Object[] {
            T010M9_A7956Mq_CodM, T010M9_A407EmprNom, T010M9_n407EmprNom, T010M9_A279CliNom, T010M9_A69ArtDsc, T010M9_n69ArtDsc, T010M9_A7782Mq_ULinP, T010M9_n7782Mq_ULinP, T010M9_A396EmprCod, T010M9_A252CliCod,
            T010M9_A65ArtCod
            }
            , new Object[] {
            T010M10_A396EmprCod, T010M10_A252CliCod, T010M10_A65ArtCod, T010M10_A7956Mq_CodM
            }
            , new Object[] {
            T010M11_A396EmprCod, T010M11_A252CliCod, T010M11_A65ArtCod, T010M11_A7956Mq_CodM
            }
            , new Object[] {
            T010M12_A396EmprCod, T010M12_A252CliCod, T010M12_A65ArtCod, T010M12_A7956Mq_CodM
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T010M16_A396EmprCod, T010M16_A252CliCod, T010M16_A65ArtCod, T010M16_A7956Mq_CodM, T010M16_A7783Mq_LinP, T010M16_A7949Par_Art
            }
            , new Object[] {
            }
            , new Object[] {
            T010M18_A396EmprCod, T010M18_A252CliCod, T010M18_A65ArtCod, T010M18_A7956Mq_CodM
            }
            , new Object[] {
            T010M19_A7786Mq_ObsT, T010M19_n7786Mq_ObsT, T010M19_A252CliCod, T010M19_A65ArtCod, T010M19_A7956Mq_CodM, T010M19_A7783Mq_LinP, T010M19_A10569Mq_UsA, T010M19_n10569Mq_UsA, T010M19_A10570Mq_FcA, T010M19_n10570Mq_FcA,
            T010M19_A10571Mq_UsM, T010M19_n10571Mq_UsM, T010M19_A10572Mq_FcM, T010M19_n10572Mq_FcM, T010M19_A7784Mq_PesI, T010M19_n7784Mq_PesI, T010M19_A7785Mq_PesF, T010M19_n7785Mq_PesF, T010M19_A396EmprCod
            }
            , new Object[] {
            T010M20_A396EmprCod, T010M20_A252CliCod, T010M20_A65ArtCod, T010M20_A7956Mq_CodM, T010M20_A7783Mq_LinP
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T010M24_A396EmprCod, T010M24_A252CliCod, T010M24_A65ArtCod, T010M24_A7956Mq_CodM, T010M24_A7783Mq_LinP, T010M24_A7949Par_Art
            }
            , new Object[] {
            T010M25_A396EmprCod, T010M25_A252CliCod, T010M25_A65ArtCod, T010M25_A7956Mq_CodM, T010M25_A7783Mq_LinP
            }
            , new Object[] {
            T010M26_A407EmprNom, T010M26_n407EmprNom
            }
            , new Object[] {
            T010M27_A279CliNom
            }
            , new Object[] {
            T010M28_A69ArtDsc, T010M28_n69ArtDsc
            }
         }
      );
      Z7956Mq_CodM = "" ;
      A7956Mq_CodM = "" ;
      Z65ArtCod = "" ;
      A65ArtCod = "" ;
      Z252CliCod = 0 ;
      A252CliCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV38Pgmname = "TTNART2" ;
      Z10570Mq_FcA = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n10570Mq_FcA = false ;
      A10570Mq_FcA = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n10570Mq_FcA = false ;
      i10570Mq_FcA = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n10570Mq_FcA = false ;
      Z10569Mq_UsA = "" ;
      n10569Mq_UsA = false ;
      A10569Mq_UsA = "" ;
      n10569Mq_UsA = false ;
      i10569Mq_UsA = "" ;
      n10569Mq_UsA = false ;
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
   private short Z7782Mq_ULinP ;
   private short O7782Mq_ULinP ;
   private short Z7783Mq_LinP ;
   private short nRcdDeleted_1117 ;
   private short nRcdExists_1117 ;
   private short nIsMod_1117 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A7782Mq_ULinP ;
   private short nBlankRcdCount1117 ;
   private short RcdFound1117 ;
   private short B7782Mq_ULinP ;
   private short nBlankRcdUsr1117 ;
   private short s7782Mq_ULinP ;
   private short A7783Mq_LinP ;
   private short RcdFound1116 ;
   private short nIsDirty_1116 ;
   private short nIsDirty_1117 ;
   private short i7782Mq_ULinP ;
   private short ZZ7782Mq_ULinP ;
   private short ZO7782Mq_ULinP ;
   private int wcpOA252CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_65 ;
   private int nGXsfl_65_idx=1 ;
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
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtMq_DscM_Enabled ;
   private int edtMq_ULinP_Enabled ;
   private int edtavnRcdDeleted_1117_Enabled ;
   private int edtMq_LinP_Enabled ;
   private int edtMq_PesI_Enabled ;
   private int edtMq_PesF_Enabled ;
   private int edtMq_ObsT_Enabled ;
   private int edtMq_UsA_Enabled ;
   private int edtMq_FcA_Enabled ;
   private int edtMq_UsM_Enabled ;
   private int edtMq_FcM_Enabled ;
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
   private int defedtMq_LinP_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtMq_ULinP_Backcolor ;
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
   private java.math.BigDecimal O7785Mq_PesF ;
   private java.math.BigDecimal O7784Mq_PesI ;
   private java.math.BigDecimal A7784Mq_PesI ;
   private java.math.BigDecimal A7785Mq_PesF ;
   private java.math.BigDecimal T7785Mq_PesF ;
   private java.math.BigDecimal T7784Mq_PesI ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA65ArtCod ;
   private String wcpOA7956Mq_CodM ;
   private String wcpOAV36Modif ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z7956Mq_CodM ;
   private String Z10569Mq_UsA ;
   private String Z10571Mq_UsM ;
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
   private String sGXsfl_65_idx="0001" ;
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
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtMq_DscM_Internalname ;
   private String A7957Mq_DscM ;
   private String edtMq_DscM_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtMq_ULinP_Internalname ;
   private String edtMq_ULinP_Jsonclick ;
   private String sMode1117 ;
   private String edtavnRcdDeleted_1117_Internalname ;
   private String edtMq_LinP_Internalname ;
   private String edtMq_PesI_Internalname ;
   private String edtMq_PesF_Internalname ;
   private String edtMq_ObsT_Internalname ;
   private String edtMq_UsA_Internalname ;
   private String edtMq_FcA_Internalname ;
   private String edtMq_UsM_Internalname ;
   private String edtMq_FcM_Internalname ;
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
   private String AV38Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1116 ;
   private String GXCCtl ;
   private String A10569Mq_UsA ;
   private String A10571Mq_UsM ;
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
   private String sGXsfl_65_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1117_Jsonclick ;
   private String edtMq_LinP_Jsonclick ;
   private String edtMq_PesI_Jsonclick ;
   private String edtMq_PesF_Jsonclick ;
   private String edtMq_ObsT_Jsonclick ;
   private String edtMq_UsA_Jsonclick ;
   private String edtMq_FcA_Jsonclick ;
   private String edtMq_UsM_Jsonclick ;
   private String edtMq_FcM_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i10569Mq_UsA ;
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
   private java.util.Date Z10570Mq_FcA ;
   private java.util.Date Z10572Mq_FcM ;
   private java.util.Date A10570Mq_FcA ;
   private java.util.Date A10572Mq_FcM ;
   private java.util.Date i10570Mq_FcA ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n7782Mq_ULinP ;
   private boolean bGXsfl_65_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n69ArtDsc ;
   private boolean returnInSub ;
   private boolean n10569Mq_UsA ;
   private boolean n10570Mq_FcA ;
   private boolean n7786Mq_ObsT ;
   private boolean n10571Mq_UsM ;
   private boolean n10572Mq_FcM ;
   private boolean n7784Mq_PesI ;
   private boolean n7785Mq_PesF ;
   private boolean Gx_longc ;
   private String A7786Mq_ObsT ;
   private String Z7786Mq_ObsT ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T010M6_A407EmprNom ;
   private boolean[] T010M6_n407EmprNom ;
   private String[] T010M7_A279CliNom ;
   private String[] T010M8_A69ArtDsc ;
   private boolean[] T010M8_n69ArtDsc ;
   private String[] T010M9_A7956Mq_CodM ;
   private String[] T010M9_A407EmprNom ;
   private boolean[] T010M9_n407EmprNom ;
   private String[] T010M9_A279CliNom ;
   private String[] T010M9_A69ArtDsc ;
   private boolean[] T010M9_n69ArtDsc ;
   private short[] T010M9_A7782Mq_ULinP ;
   private boolean[] T010M9_n7782Mq_ULinP ;
   private String[] T010M9_A396EmprCod ;
   private int[] T010M9_A252CliCod ;
   private String[] T010M9_A65ArtCod ;
   private String[] T010M10_A396EmprCod ;
   private int[] T010M10_A252CliCod ;
   private String[] T010M10_A65ArtCod ;
   private String[] T010M10_A7956Mq_CodM ;
   private String[] T010M5_A7956Mq_CodM ;
   private short[] T010M5_A7782Mq_ULinP ;
   private boolean[] T010M5_n7782Mq_ULinP ;
   private String[] T010M5_A396EmprCod ;
   private int[] T010M5_A252CliCod ;
   private String[] T010M5_A65ArtCod ;
   private String[] T010M11_A396EmprCod ;
   private int[] T010M11_A252CliCod ;
   private String[] T010M11_A65ArtCod ;
   private String[] T010M11_A7956Mq_CodM ;
   private String[] T010M12_A396EmprCod ;
   private int[] T010M12_A252CliCod ;
   private String[] T010M12_A65ArtCod ;
   private String[] T010M12_A7956Mq_CodM ;
   private String[] T010M4_A7956Mq_CodM ;
   private short[] T010M4_A7782Mq_ULinP ;
   private boolean[] T010M4_n7782Mq_ULinP ;
   private String[] T010M4_A396EmprCod ;
   private int[] T010M4_A252CliCod ;
   private String[] T010M4_A65ArtCod ;
   private String[] T010M16_A396EmprCod ;
   private int[] T010M16_A252CliCod ;
   private String[] T010M16_A65ArtCod ;
   private String[] T010M16_A7956Mq_CodM ;
   private short[] T010M16_A7783Mq_LinP ;
   private short[] T010M16_A7949Par_Art ;
   private String[] T010M18_A396EmprCod ;
   private int[] T010M18_A252CliCod ;
   private String[] T010M18_A65ArtCod ;
   private String[] T010M18_A7956Mq_CodM ;
   private String[] T010M19_A7786Mq_ObsT ;
   private boolean[] T010M19_n7786Mq_ObsT ;
   private int[] T010M19_A252CliCod ;
   private String[] T010M19_A65ArtCod ;
   private String[] T010M19_A7956Mq_CodM ;
   private short[] T010M19_A7783Mq_LinP ;
   private String[] T010M19_A10569Mq_UsA ;
   private boolean[] T010M19_n10569Mq_UsA ;
   private java.util.Date[] T010M19_A10570Mq_FcA ;
   private boolean[] T010M19_n10570Mq_FcA ;
   private String[] T010M19_A10571Mq_UsM ;
   private boolean[] T010M19_n10571Mq_UsM ;
   private java.util.Date[] T010M19_A10572Mq_FcM ;
   private boolean[] T010M19_n10572Mq_FcM ;
   private java.math.BigDecimal[] T010M19_A7784Mq_PesI ;
   private boolean[] T010M19_n7784Mq_PesI ;
   private java.math.BigDecimal[] T010M19_A7785Mq_PesF ;
   private boolean[] T010M19_n7785Mq_PesF ;
   private String[] T010M19_A396EmprCod ;
   private String[] T010M20_A396EmprCod ;
   private int[] T010M20_A252CliCod ;
   private String[] T010M20_A65ArtCod ;
   private String[] T010M20_A7956Mq_CodM ;
   private short[] T010M20_A7783Mq_LinP ;
   private String[] T010M3_A7786Mq_ObsT ;
   private boolean[] T010M3_n7786Mq_ObsT ;
   private int[] T010M3_A252CliCod ;
   private String[] T010M3_A65ArtCod ;
   private String[] T010M3_A7956Mq_CodM ;
   private short[] T010M3_A7783Mq_LinP ;
   private String[] T010M3_A10569Mq_UsA ;
   private boolean[] T010M3_n10569Mq_UsA ;
   private java.util.Date[] T010M3_A10570Mq_FcA ;
   private boolean[] T010M3_n10570Mq_FcA ;
   private String[] T010M3_A10571Mq_UsM ;
   private boolean[] T010M3_n10571Mq_UsM ;
   private java.util.Date[] T010M3_A10572Mq_FcM ;
   private boolean[] T010M3_n10572Mq_FcM ;
   private java.math.BigDecimal[] T010M3_A7784Mq_PesI ;
   private boolean[] T010M3_n7784Mq_PesI ;
   private java.math.BigDecimal[] T010M3_A7785Mq_PesF ;
   private boolean[] T010M3_n7785Mq_PesF ;
   private String[] T010M3_A396EmprCod ;
   private String[] T010M2_A7786Mq_ObsT ;
   private boolean[] T010M2_n7786Mq_ObsT ;
   private int[] T010M2_A252CliCod ;
   private String[] T010M2_A65ArtCod ;
   private String[] T010M2_A7956Mq_CodM ;
   private short[] T010M2_A7783Mq_LinP ;
   private String[] T010M2_A10569Mq_UsA ;
   private boolean[] T010M2_n10569Mq_UsA ;
   private java.util.Date[] T010M2_A10570Mq_FcA ;
   private boolean[] T010M2_n10570Mq_FcA ;
   private String[] T010M2_A10571Mq_UsM ;
   private boolean[] T010M2_n10571Mq_UsM ;
   private java.util.Date[] T010M2_A10572Mq_FcM ;
   private boolean[] T010M2_n10572Mq_FcM ;
   private java.math.BigDecimal[] T010M2_A7784Mq_PesI ;
   private boolean[] T010M2_n7784Mq_PesI ;
   private java.math.BigDecimal[] T010M2_A7785Mq_PesF ;
   private boolean[] T010M2_n7785Mq_PesF ;
   private String[] T010M2_A396EmprCod ;
   private String[] T010M24_A396EmprCod ;
   private int[] T010M24_A252CliCod ;
   private String[] T010M24_A65ArtCod ;
   private String[] T010M24_A7956Mq_CodM ;
   private short[] T010M24_A7783Mq_LinP ;
   private short[] T010M24_A7949Par_Art ;
   private String[] T010M25_A396EmprCod ;
   private int[] T010M25_A252CliCod ;
   private String[] T010M25_A65ArtCod ;
   private String[] T010M25_A7956Mq_CodM ;
   private short[] T010M25_A7783Mq_LinP ;
   private String[] T010M26_A407EmprNom ;
   private boolean[] T010M26_n407EmprNom ;
   private String[] T010M27_A279CliNom ;
   private String[] T010M28_A69ArtDsc ;
   private boolean[] T010M28_n69ArtDsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttnart2__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttnart2__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttnart2__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttnart2__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttnart2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T010M2", "SELECT Mq_ObsT, CliCod, ArtCod, Mq_CodM, Mq_LinP, Mq_UsA, Mq_FcA, Mq_UsM, Mq_FcM, Mq_PesI, Mq_PesF, EmprCod FROM TXPTNART1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ? AND Mq_LinP = ?  FOR UPDATE OF Mq_UsA, Mq_FcA, Mq_UsM, Mq_FcM, Mq_PesI, Mq_PesF, Mq_ObsT NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010M3", "SELECT Mq_ObsT, CliCod, ArtCod, Mq_CodM, Mq_LinP, Mq_UsA, Mq_FcA, Mq_UsM, Mq_FcM, Mq_PesI, Mq_PesF, EmprCod FROM TXPTNART1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ? AND Mq_LinP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010M4", "SELECT Mq_CodM, Mq_ULinP, EmprCod, CliCod, ArtCod FROM TXPTNART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ?  FOR UPDATE OF Mq_ULinP NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010M5", "SELECT Mq_CodM, Mq_ULinP, EmprCod, CliCod, ArtCod FROM TXPTNART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010M6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010M7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010M8", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010M9", "SELECT /*+ FIRST_ROWS(1) */ TM1.Mq_CodM, T2.EmprNom, T3.CliNom, T4.ArtDsc, TM1.Mq_ULinP, TM1.EmprCod, TM1.CliCod, TM1.ArtCod FROM (((TXPTNART TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.ArtCod = TM1.ArtCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? and TM1.Mq_CodM = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.Mq_CodM ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010M10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, Mq_CodM FROM TXPTNART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010M11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, Mq_CodM FROM TXPTNART WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Mq_CodM = ? ORDER BY EmprCod, CliCod, ArtCod, Mq_CodM) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010M12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, Mq_CodM FROM TXPTNART WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Mq_CodM = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC, Mq_CodM DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T010M13", "INSERT INTO TXPTNART(Mq_CodM, Mq_ULinP, EmprCod, CliCod, ArtCod, Mq_UsuA, Mq_FecA) VALUES(?, ?, ?, ?, ?, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPTNART")
         ,new UpdateCursor("T010M14", "UPDATE TXPTNART SET Mq_ULinP=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ?", GX_NOMASK, "TXPTNART")
         ,new UpdateCursor("T010M15", "DELETE FROM TXPTNART  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ?", GX_NOMASK, "TXPTNART")
         ,new ForEachCursor("T010M16", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mq_CodM, Mq_LinP, Par_Art FROM TXPTNARTp WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T010M17", "UPDATE TXPTNART SET Mq_ULinP=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ?", GX_NOMASK, "TXPTNART")
         ,new ForEachCursor("T010M18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod, Mq_CodM FROM TXPTNART WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Mq_CodM = ? ORDER BY EmprCod, CliCod, ArtCod, Mq_CodM ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010M19", "SELECT Mq_ObsT, CliCod, ArtCod, Mq_CodM, Mq_LinP, Mq_UsA, Mq_FcA, Mq_UsM, Mq_FcM, Mq_PesI, Mq_PesF, EmprCod FROM TXPTNART1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Mq_CodM = ? and Mq_LinP = ? ORDER BY EmprCod, CliCod, ArtCod, Mq_CodM, Mq_LinP ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010M20", "SELECT EmprCod, CliCod, ArtCod, Mq_CodM, Mq_LinP FROM TXPTNART1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ? AND Mq_LinP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T010M21", "INSERT INTO TXPTNART1(CliCod, ArtCod, Mq_CodM, Mq_LinP, Mq_UsA, Mq_FcA, Mq_UsM, Mq_FcM, Mq_PesI, Mq_PesF, Mq_ObsT, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTNART1")
         ,new UpdateCursor("T010M22", "UPDATE TXPTNART1 SET Mq_UsA=?, Mq_FcA=?, Mq_UsM=?, Mq_FcM=?, Mq_PesI=?, Mq_PesF=?, Mq_ObsT=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ? AND Mq_LinP = ?", GX_NOMASK, "TXPTNART1")
         ,new UpdateCursor("T010M23", "DELETE FROM TXPTNART1  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ? AND Mq_LinP = ?", GX_NOMASK, "TXPTNART1")
         ,new ForEachCursor("T010M24", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mq_CodM, Mq_LinP, Par_Art FROM TXPTNARTp WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ? AND Mq_LinP = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010M25", "SELECT EmprCod, CliCod, ArtCod, Mq_CodM, Mq_LinP FROM TXPTNART1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Mq_CodM = ? ORDER BY EmprCod, CliCod, ArtCod, Mq_CodM, Mq_LinP ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010M26", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010M27", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010M28", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
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
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 6);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setString(5, (String)parms[5], 16);
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
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 15 :
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
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 6);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 19 :
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
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(11, (String)parms[17]);
               }
               stmt.setString(12, (String)parms[18], 3);
               return;
            case 20 :
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
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(7, (String)parms[13]);
               }
               stmt.setString(8, (String)parms[14], 3);
               stmt.setInt(9, ((Number) parms[15]).intValue());
               stmt.setString(10, (String)parms[16], 16);
               stmt.setString(11, (String)parms[17], 6);
               stmt.setShort(12, ((Number) parms[18]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

