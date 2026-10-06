package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpfsmac_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"FASDSCM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9836FasCodM = httpContext.GetPar( "FasCodM") ;
         httpContext.ajax_rsp_assign_attri("", false, "A9836FasCodM", A9836FasCodM);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asafasdscm15L1303( A396EmprCod, A9836FasCodM) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"MAQDSCD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9830MaqCodC = httpContext.GetPar( "MaqCodC") ;
         httpContext.ajax_rsp_assign_attri("", false, "A9830MaqCodC", A9830MaqCodC);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asamaqdscd15L1303( A396EmprCod, A9830MaqCodC) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"DSC_PARX") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9865Cod_parX = (short)(GXutil.lval( httpContext.GetPar( "Cod_parX"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asadsc_parx15L1304( A396EmprCod, A9865Cod_parX) ;
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
            A758ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A9836FasCodM = httpContext.GetPar( "FasCodM") ;
            httpContext.ajax_rsp_assign_attri("", false, "A9836FasCodM", A9836FasCodM);
            A9830MaqCodC = httpContext.GetPar( "MaqCodC") ;
            httpContext.ajax_rsp_assign_attri("", false, "A9830MaqCodC", A9830MaqCodC);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PARAMETROS POR ANCHOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMaqAncA_Internalname ;
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
      nRC_GXsfl_85 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_85"))) ;
      nGXsfl_85_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_85_idx"))) ;
      sGXsfl_85_idx = httpContext.GetPar( "sGXsfl_85_idx") ;
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

   public tpfsmac_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpfsmac_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpfsmac_impl.class ));
   }

   public tpfsmac_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPFSMAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPFSMAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPFSMAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPFSMAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPFSMAC.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPFSMAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPFSMAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPFSMAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPFSMAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPFSMAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPFSMAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPFSMAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPFSMAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPFSMAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPFSMAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion Articulo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPFSMAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPFSMAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPFSMAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPFSMAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Descripcion Proceso", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPFSMAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPFSMAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Codigo", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPFSMAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCodM_Internalname, GXutil.rtrim( A9836FasCodM), GXutil.rtrim( localUtil.format( A9836FasCodM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCodM_Jsonclick, 0, "", "", "", "", "", 1, edtFasCodM_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPFSMAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPFSMAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDscM_Internalname, GXutil.rtrim( A9837FasDscM), GXutil.rtrim( localUtil.format( A9837FasDscM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDscM_Jsonclick, 0, "", "", "", "", "", 1, edtFasDscM_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPFSMAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPFSMAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCodC_Internalname, GXutil.rtrim( A9830MaqCodC), GXutil.rtrim( localUtil.format( A9830MaqCodC, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCodC_Jsonclick, 0, "", "", "", "", "", 1, edtMaqCodC_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPFSMAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPFSMAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqDscD_Internalname, GXutil.rtrim( A9831MaqDscD), GXutil.rtrim( localUtil.format( A9831MaqDscD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqDscD_Jsonclick, 0, "", "", "", "", "", 1, edtMaqDscD_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPFSMAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Ancho", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPFSMAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqAncA_Internalname, GXutil.ltrim( localUtil.ntoc( A9864MaqAncA, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqAncA_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9864MaqAncA), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9864MaqAncA), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,80);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqAncA_Jsonclick, 0, "", "", "", "", "", 1, edtMaqAncA_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPFSMAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPFSMAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol85( ) ;
      nGXsfl_85_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1304 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1304 = (short)(1) ;
            scanStart15L1304( ) ;
            while ( RcdFound1304 != 0 )
            {
               init_level_properties1304( ) ;
               getByPrimaryKey15L1304( ) ;
               addRow15L1304( ) ;
               scanNext15L1304( ) ;
            }
            scanEnd15L1304( ) ;
            nBlankRcdCount1304 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal15L1304( ) ;
         standaloneModal15L1304( ) ;
         sMode1304 = Gx_mode ;
         while ( nGXsfl_85_idx < nRC_GXsfl_85 )
         {
            bGXsfl_85_Refreshing = true ;
            readRow15L1304( ) ;
            edtavnRcdDeleted_1304_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1304_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1304_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1304_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtCod_parX_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COD_PARX_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCod_parX_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCod_parX_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtDsc_ParX_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DSC_PARX_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDsc_ParX_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDsc_ParX_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtParValX_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARVALX_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParValX_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParValX_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtParObsX_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAROBSX_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParObsX_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParObsX_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtItm_ord4_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ITM_ORD4_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtItm_ord4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtItm_ord4_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            if ( ( nRcdExists_1304 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal15L1304( ) ;
            }
            sendRow15L1304( ) ;
            bGXsfl_85_Refreshing = false ;
         }
         Gx_mode = sMode1304 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1304 = (short)(5) ;
         nRcdExists_1304 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart15L1304( ) ;
            while ( RcdFound1304 != 0 )
            {
               sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_851304( ) ;
               init_level_properties1304( ) ;
               standaloneNotModal15L1304( ) ;
               getByPrimaryKey15L1304( ) ;
               standaloneModal15L1304( ) ;
               addRow15L1304( ) ;
               scanNext15L1304( ) ;
            }
            scanEnd15L1304( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1304 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_851304( ) ;
      initAll15L1304( ) ;
      init_level_properties1304( ) ;
      nRcdExists_1304 = (short)(0) ;
      nIsMod_1304 = (short)(0) ;
      nRcdDeleted_1304 = (short)(0) ;
      nBlankRcdCount1304 = (short)(nBlankRcdUsr1304+nBlankRcdCount1304) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1304 > 0 )
      {
         standaloneNotModal15L1304( ) ;
         standaloneModal15L1304( ) ;
         addRow15L1304( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCod_parX_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1304 = (short)(nBlankRcdCount1304-1) ;
      }
      Gx_mode = sMode1304 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPFSMAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPFSMAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPFSMAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPFSMAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPFSMAC.htm");
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
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
         Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
         Z9836FasCodM = httpContext.cgiGet( "Z9836FasCodM") ;
         Z9830MaqCodC = httpContext.cgiGet( "Z9830MaqCodC") ;
         Z9864MaqAncA = (short)(localUtil.ctol( httpContext.cgiGet( "Z9864MaqAncA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_85 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_85"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A9836FasCodM = httpContext.cgiGet( edtFasCodM_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9836FasCodM", A9836FasCodM);
         A9837FasDscM = httpContext.cgiGet( edtFasDscM_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9837FasDscM", A9837FasDscM);
         A9830MaqCodC = httpContext.cgiGet( edtMaqCodC_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9830MaqCodC", A9830MaqCodC);
         A9831MaqDscD = httpContext.cgiGet( edtMaqDscD_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9831MaqDscD", A9831MaqDscD);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqAncA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqAncA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQANCA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMaqAncA_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9864MaqAncA = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9864MaqAncA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9864MaqAncA), 3, 0));
         }
         else
         {
            A9864MaqAncA = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqAncA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9864MaqAncA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9864MaqAncA), 3, 0));
         }
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
            A758ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A9836FasCodM = httpContext.GetPar( "FasCodM") ;
            httpContext.ajax_rsp_assign_attri("", false, "A9836FasCodM", A9836FasCodM);
            A9830MaqCodC = httpContext.GetPar( "MaqCodC") ;
            httpContext.ajax_rsp_assign_attri("", false, "A9830MaqCodC", A9830MaqCodC);
            A9864MaqAncA = (short)(GXutil.lval( httpContext.GetPar( "MaqAncA"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9864MaqAncA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9864MaqAncA), 3, 0));
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
            initAll15L1303( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1304_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1304_Enabled), 5, 0), !bGXsfl_85_Refreshing);
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
      disableAttributes15L1303( ) ;
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

   public void confirm_15L0( )
   {
      beforeValidate15L1303( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls15L1303( ) ;
         }
         else
         {
            checkExtendedTable15L1303( ) ;
            if ( AnyError == 0 )
            {
               zm15L1303( 5) ;
               zm15L1303( 6) ;
               zm15L1303( 7) ;
               zm15L1303( 8) ;
               zm15L1303( 9) ;
            }
            closeExtendedTableCursors15L1303( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1303 = Gx_mode ;
         confirm_15L1304( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1303 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1303 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues15L0( ) ;
      }
   }

   public void confirm_15L1304( )
   {
      nGXsfl_85_idx = 0 ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         readRow15L1304( ) ;
         if ( ( nRcdExists_1304 != 0 ) || ( nIsMod_1304 != 0 ) )
         {
            getKey15L1304( ) ;
            if ( ( nRcdExists_1304 == 0 ) && ( nRcdDeleted_1304 == 0 ) )
            {
               if ( RcdFound1304 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate15L1304( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable15L1304( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors15L1304( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "COD_PARX_" + sGXsfl_85_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCod_parX_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1304 != 0 )
               {
                  if ( nRcdDeleted_1304 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey15L1304( ) ;
                     load15L1304( ) ;
                     beforeValidate15L1304( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls15L1304( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1304 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate15L1304( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable15L1304( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors15L1304( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1304 == 0 )
                  {
                     GXCCtl = "COD_PARX_" + sGXsfl_85_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCod_parX_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1304_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1304, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCod_parX_Internalname, GXutil.ltrim( localUtil.ntoc( A9865Cod_parX, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDsc_ParX_Internalname, GXutil.rtrim( A9866Dsc_ParX)) ;
         httpContext.changePostValue( edtParValX_Internalname, GXutil.rtrim( A9867ParValX)) ;
         httpContext.changePostValue( edtParObsX_Internalname, A9868ParObsX) ;
         httpContext.changePostValue( edtItm_ord4_Internalname, GXutil.ltrim( localUtil.ntoc( A10264Itm_ord4, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9865Cod_parX_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z9865Cod_parX, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9867ParValX_"+sGXsfl_85_idx, GXutil.rtrim( Z9867ParValX)) ;
         httpContext.changePostValue( "ZT_"+"Z9868ParObsX_"+sGXsfl_85_idx, Z9868ParObsX) ;
         httpContext.changePostValue( "ZT_"+"Z10264Itm_ord4_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z10264Itm_ord4, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1304_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1304, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1304_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1304, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1304_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1304, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1304 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1304_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1304_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COD_PARX_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCod_parX_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DSC_PARX_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDsc_ParX_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARVALX_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParValX_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAROBSX_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParObsX_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ITM_ORD4_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtItm_ord4_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption15L0( )
   {
   }

   public void zm15L1303( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -4 )
      {
         Z9864MaqAncA = A9864MaqAncA ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         Z9836FasCodM = A9836FasCodM ;
         Z9830MaqCodC = A9830MaqCodC ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z69ArtDsc = A69ArtDsc ;
         Z759ProDsc = A759ProDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T015L6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T015L6_A407EmprNom[0] ;
      n407EmprNom = T015L6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T015L7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T015L7_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
      /* Using cursor T015L8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
      A69ArtDsc = T015L8_A69ArtDsc[0] ;
      n69ArtDsc = T015L8_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(6);
      /* Using cursor T015L9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T015L9_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(7);
      GXt_char1 = A9837FasDscM ;
      GXv_char2[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A9836FasCodM, GXv_char2) ;
      tpfsmac_impl.this.GXt_char1 = GXv_char2[0] ;
      A9837FasDscM = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9837FasDscM", A9837FasDscM);
      /* Using cursor T015L10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CAPFM1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCODC");
         AnyError = (short)(1) ;
      }
      pr_default.close(8);
      GXt_char1 = A9831MaqDscD ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = A9830MaqCodC ;
      GXv_char4[0] = GXt_char1 ;
      new app.pmaqdsc(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
      tpfsmac_impl.this.A396EmprCod = GXv_char2[0] ;
      tpfsmac_impl.this.A9830MaqCodC = GXv_char3[0] ;
      tpfsmac_impl.this.GXt_char1 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A9830MaqCodC", A9830MaqCodC);
      A9831MaqDscD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9831MaqDscD", A9831MaqDscD);
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

   public void load15L1303( )
   {
      /* Using cursor T015L11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A9864MaqAncA)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1303 = (short)(1) ;
         A407EmprNom = T015L11_A407EmprNom[0] ;
         n407EmprNom = T015L11_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T015L11_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A69ArtDsc = T015L11_A69ArtDsc[0] ;
         n69ArtDsc = T015L11_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A759ProDsc = T015L11_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         zm15L1303( -4) ;
      }
      pr_default.close(9);
      onLoadActions15L1303( ) ;
   }

   public void onLoadActions15L1303( )
   {
   }

   public void checkExtendedTable15L1303( )
   {
      nIsDirty_1303 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors15L1303( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey15L1303( )
   {
      /* Using cursor T015L12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A9864MaqAncA)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1303 = (short)(1) ;
      }
      else
      {
         RcdFound1303 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T015L5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A9864MaqAncA)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T015L5_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015L5_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T015L5_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T015L5_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T015L5_A9836FasCodM[0], A9836FasCodM) == 0 ) && ( GXutil.strcmp(T015L5_A9830MaqCodC[0], A9830MaqCodC) == 0 ) )
      {
         zm15L1303( 4) ;
         RcdFound1303 = (short)(1) ;
         A9864MaqAncA = T015L5_A9864MaqAncA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9864MaqAncA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9864MaqAncA), 3, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         Z9836FasCodM = A9836FasCodM ;
         Z9830MaqCodC = A9830MaqCodC ;
         Z9864MaqAncA = A9864MaqAncA ;
         sMode1303 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load15L1303( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1303 = (short)(0) ;
            initializeNonKey15L1303( ) ;
         }
         Gx_mode = sMode1303 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1303 = (short)(0) ;
         initializeNonKey15L1303( ) ;
         sMode1303 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1303 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey15L1303( ) ;
      if ( RcdFound1303 == 0 )
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
      RcdFound1303 = (short)(0) ;
      /* Using cursor T015L13 */
      pr_default.execute(11, new Object[] {Short.valueOf(A9864MaqAncA), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T015L13_A9864MaqAncA[0] < A9864MaqAncA ) ) && ( GXutil.strcmp(T015L13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015L13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T015L13_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T015L13_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T015L13_A9836FasCodM[0], A9836FasCodM) == 0 ) && ( GXutil.strcmp(T015L13_A9830MaqCodC[0], A9830MaqCodC) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T015L13_A9864MaqAncA[0] > A9864MaqAncA ) ) && ( GXutil.strcmp(T015L13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015L13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T015L13_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T015L13_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T015L13_A9836FasCodM[0], A9836FasCodM) == 0 ) && ( GXutil.strcmp(T015L13_A9830MaqCodC[0], A9830MaqCodC) == 0 ) )
         {
            A9864MaqAncA = T015L13_A9864MaqAncA[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9864MaqAncA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9864MaqAncA), 3, 0));
            RcdFound1303 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound1303 = (short)(0) ;
      /* Using cursor T015L14 */
      pr_default.execute(12, new Object[] {Short.valueOf(A9864MaqAncA), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( T015L14_A9864MaqAncA[0] > A9864MaqAncA ) ) && ( GXutil.strcmp(T015L14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015L14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T015L14_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T015L14_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T015L14_A9836FasCodM[0], A9836FasCodM) == 0 ) && ( GXutil.strcmp(T015L14_A9830MaqCodC[0], A9830MaqCodC) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( T015L14_A9864MaqAncA[0] < A9864MaqAncA ) ) && ( GXutil.strcmp(T015L14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015L14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T015L14_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T015L14_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T015L14_A9836FasCodM[0], A9836FasCodM) == 0 ) && ( GXutil.strcmp(T015L14_A9830MaqCodC[0], A9830MaqCodC) == 0 ) )
         {
            A9864MaqAncA = T015L14_A9864MaqAncA[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9864MaqAncA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9864MaqAncA), 3, 0));
            RcdFound1303 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey15L1303( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMaqAncA_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert15L1303( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1303 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( GXutil.strcmp(A9836FasCodM, Z9836FasCodM) != 0 ) || ( GXutil.strcmp(A9830MaqCodC, Z9830MaqCodC) != 0 ) || ( A9864MaqAncA != Z9864MaqAncA ) )
            {
               A9864MaqAncA = Z9864MaqAncA ;
               httpContext.ajax_rsp_assign_attri("", false, "A9864MaqAncA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9864MaqAncA), 3, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMaqAncA_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update15L1303( ) ;
               GX_FocusControl = edtMaqAncA_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( GXutil.strcmp(A9836FasCodM, Z9836FasCodM) != 0 ) || ( GXutil.strcmp(A9830MaqCodC, Z9830MaqCodC) != 0 ) || ( A9864MaqAncA != Z9864MaqAncA ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMaqAncA_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert15L1303( ) ;
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
                  GX_FocusControl = edtMaqAncA_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert15L1303( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( GXutil.strcmp(A9836FasCodM, Z9836FasCodM) != 0 ) || ( GXutil.strcmp(A9830MaqCodC, Z9830MaqCodC) != 0 ) || ( A9864MaqAncA != Z9864MaqAncA ) )
      {
         A9864MaqAncA = Z9864MaqAncA ;
         httpContext.ajax_rsp_assign_attri("", false, "A9864MaqAncA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9864MaqAncA), 3, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMaqAncA_Internalname ;
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
      getKey15L1303( ) ;
      if ( RcdFound1303 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( GXutil.strcmp(A9836FasCodM, Z9836FasCodM) != 0 ) || ( GXutil.strcmp(A9830MaqCodC, Z9830MaqCodC) != 0 ) || ( A9864MaqAncA != Z9864MaqAncA ) )
         {
            A9864MaqAncA = Z9864MaqAncA ;
            httpContext.ajax_rsp_assign_attri("", false, "A9864MaqAncA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9864MaqAncA), 3, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( GXutil.strcmp(A9836FasCodM, Z9836FasCodM) != 0 ) || ( GXutil.strcmp(A9830MaqCodC, Z9830MaqCodC) != 0 ) || ( A9864MaqAncA != Z9864MaqAncA ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpfsmac");
   }

   public void insert_check( )
   {
      confirm_15L0( ) ;
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
      if ( RcdFound1303 == 0 )
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
      scanStart15L1303( ) ;
      if ( RcdFound1303 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd15L1303( ) ;
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
      if ( RcdFound1303 == 0 )
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
      if ( RcdFound1303 == 0 )
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
      scanStart15L1303( ) ;
      if ( RcdFound1303 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1303 != 0 )
         {
            scanNext15L1303( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd15L1303( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency15L1303( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T015L4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A9864MaqAncA)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPFSMQA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPFSMQA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert15L1303( )
   {
      beforeValidate15L1303( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15L1303( ) ;
      }
      if ( AnyError == 0 )
      {
         zm15L1303( 0) ;
         checkOptimisticConcurrency15L1303( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15L1303( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert15L1303( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015L15 */
                  pr_default.execute(13, new Object[] {Short.valueOf(A9864MaqAncA), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPFSMQA");
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
                        processLevel15L1303( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption15L0( ) ;
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
            load15L1303( ) ;
         }
         endLevel15L1303( ) ;
      }
      closeExtendedTableCursors15L1303( ) ;
   }

   public void update15L1303( )
   {
      beforeValidate15L1303( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15L1303( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15L1303( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15L1303( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate15L1303( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPPFSMQA */
                  deferredUpdate15L1303( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel15L1303( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption15L0( ) ;
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
         endLevel15L1303( ) ;
      }
      closeExtendedTableCursors15L1303( ) ;
   }

   public void deferredUpdate15L1303( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate15L1303( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15L1303( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls15L1303( ) ;
         afterConfirm15L1303( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete15L1303( ) ;
            if ( AnyError == 0 )
            {
               scanStart15L1304( ) ;
               while ( RcdFound1304 != 0 )
               {
                  getByPrimaryKey15L1304( ) ;
                  delete15L1304( ) ;
                  scanNext15L1304( ) ;
               }
               scanEnd15L1304( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015L16 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A9864MaqAncA)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPFSMQA");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1303 == 0 )
                        {
                           initAll15L1303( ) ;
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
                        resetCaption15L0( ) ;
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
      sMode1303 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel15L1303( ) ;
      Gx_mode = sMode1303 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls15L1303( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel15L1304( )
   {
      nGXsfl_85_idx = 0 ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         readRow15L1304( ) ;
         if ( ( nRcdExists_1304 != 0 ) || ( nIsMod_1304 != 0 ) )
         {
            standaloneNotModal15L1304( ) ;
            getKey15L1304( ) ;
            if ( ( nRcdExists_1304 == 0 ) && ( nRcdDeleted_1304 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert15L1304( ) ;
            }
            else
            {
               if ( RcdFound1304 != 0 )
               {
                  if ( ( nRcdDeleted_1304 != 0 ) && ( nRcdExists_1304 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete15L1304( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1304 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update15L1304( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1304 == 0 )
                  {
                     GXCCtl = "COD_PARX_" + sGXsfl_85_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCod_parX_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1304_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1304, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCod_parX_Internalname, GXutil.ltrim( localUtil.ntoc( A9865Cod_parX, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDsc_ParX_Internalname, GXutil.rtrim( A9866Dsc_ParX)) ;
         httpContext.changePostValue( edtParValX_Internalname, GXutil.rtrim( A9867ParValX)) ;
         httpContext.changePostValue( edtParObsX_Internalname, A9868ParObsX) ;
         httpContext.changePostValue( edtItm_ord4_Internalname, GXutil.ltrim( localUtil.ntoc( A10264Itm_ord4, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9865Cod_parX_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z9865Cod_parX, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9867ParValX_"+sGXsfl_85_idx, GXutil.rtrim( Z9867ParValX)) ;
         httpContext.changePostValue( "ZT_"+"Z9868ParObsX_"+sGXsfl_85_idx, Z9868ParObsX) ;
         httpContext.changePostValue( "ZT_"+"Z10264Itm_ord4_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z10264Itm_ord4, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1304_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1304, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1304_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1304, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1304_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1304, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1304 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1304_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1304_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COD_PARX_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCod_parX_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DSC_PARX_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDsc_ParX_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARVALX_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParValX_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAROBSX_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParObsX_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ITM_ORD4_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtItm_ord4_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll15L1304( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1304 = (short)(0) ;
      nIsMod_1304 = (short)(0) ;
      nRcdDeleted_1304 = (short)(0) ;
   }

   public void processLevel15L1303( )
   {
      /* Save parent mode. */
      sMode1303 = Gx_mode ;
      processNestedLevel15L1304( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1303 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel15L1303( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete15L1303( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpfsmac");
         if ( AnyError == 0 )
         {
            confirmValues15L0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpfsmac");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart15L1303( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A252CliCod = A252CliCod ;
      this.A65ArtCod = A65ArtCod ;
      this.A758ProCod = A758ProCod ;
      this.A9836FasCodM = A9836FasCodM ;
      this.A9830MaqCodC = A9830MaqCodC ;
      /* Scan By routine */
      /* Using cursor T015L17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC});
      RcdFound1303 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1303 = (short)(1) ;
         A9864MaqAncA = T015L17_A9864MaqAncA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9864MaqAncA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9864MaqAncA), 3, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext15L1303( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1303 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1303 = (short)(1) ;
         A9864MaqAncA = T015L17_A9864MaqAncA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9864MaqAncA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9864MaqAncA), 3, 0));
      }
   }

   public void scanEnd15L1303( )
   {
      pr_default.close(15);
   }

   public void afterConfirm15L1303( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert15L1303( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate15L1303( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete15L1303( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete15L1303( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate15L1303( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes15L1303( )
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
      edtFasCodM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCodM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCodM_Enabled), 5, 0), true);
      edtFasDscM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDscM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDscM_Enabled), 5, 0), true);
      edtMaqCodC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCodC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodC_Enabled), 5, 0), true);
      edtMaqDscD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDscD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDscD_Enabled), 5, 0), true);
      edtMaqAncA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqAncA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqAncA_Enabled), 5, 0), true);
   }

   public void zm15L1304( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9867ParValX = T015L3_A9867ParValX[0] ;
            Z9868ParObsX = T015L3_A9868ParObsX[0] ;
            Z10264Itm_ord4 = T015L3_A10264Itm_ord4[0] ;
         }
         else
         {
            Z9867ParValX = A9867ParValX ;
            Z9868ParObsX = A9868ParObsX ;
            Z10264Itm_ord4 = A10264Itm_ord4 ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         Z9836FasCodM = A9836FasCodM ;
         Z9830MaqCodC = A9830MaqCodC ;
         Z9864MaqAncA = A9864MaqAncA ;
         Z9865Cod_parX = A9865Cod_parX ;
         Z9867ParValX = A9867ParValX ;
         Z9868ParObsX = A9868ParObsX ;
         Z10264Itm_ord4 = A10264Itm_ord4 ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal15L1304( )
   {
   }

   public void standaloneModal15L1304( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCod_parX_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCod_parX_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCod_parX_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      else
      {
         edtCod_parX_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCod_parX_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCod_parX_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
   }

   public void load15L1304( )
   {
      /* Using cursor T015L18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A9864MaqAncA), Short.valueOf(A9865Cod_parX)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1304 = (short)(1) ;
         A9867ParValX = T015L18_A9867ParValX[0] ;
         n9867ParValX = T015L18_n9867ParValX[0] ;
         A9868ParObsX = T015L18_A9868ParObsX[0] ;
         n9868ParObsX = T015L18_n9868ParObsX[0] ;
         A10264Itm_ord4 = T015L18_A10264Itm_ord4[0] ;
         n10264Itm_ord4 = T015L18_n10264Itm_ord4[0] ;
         zm15L1304( -10) ;
      }
      pr_default.close(16);
      onLoadActions15L1304( ) ;
   }

   public void onLoadActions15L1304( )
   {
      GXt_char1 = A9866Dsc_ParX ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A9865Cod_parX ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexparfs(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3) ;
      tpfsmac_impl.this.A396EmprCod = GXv_char4[0] ;
      tpfsmac_impl.this.A9865Cod_parX = GXv_int5[0] ;
      tpfsmac_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9866Dsc_ParX = GXt_char1 ;
   }

   public void checkExtendedTable15L1304( )
   {
      nIsDirty_1304 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal15L1304( ) ;
      nIsDirty_1304 = (short)(1) ;
      GXt_char1 = A9866Dsc_ParX ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A9865Cod_parX ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexparfs(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3) ;
      tpfsmac_impl.this.A396EmprCod = GXv_char4[0] ;
      tpfsmac_impl.this.A9865Cod_parX = GXv_int5[0] ;
      tpfsmac_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9866Dsc_ParX = GXt_char1 ;
   }

   public void closeExtendedTableCursors15L1304( )
   {
   }

   public void enableDisable15L1304( )
   {
   }

   public void getKey15L1304( )
   {
      /* Using cursor T015L19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A9864MaqAncA), Short.valueOf(A9865Cod_parX)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1304 = (short)(1) ;
      }
      else
      {
         RcdFound1304 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey15L1304( )
   {
      /* Using cursor T015L3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A9864MaqAncA), Short.valueOf(A9865Cod_parX)});
      if ( (pr_default.getStatus(1) != 101) && ( T015L3_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T015L3_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T015L3_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T015L3_A9836FasCodM[0], A9836FasCodM) == 0 ) && ( GXutil.strcmp(T015L3_A9830MaqCodC[0], A9830MaqCodC) == 0 ) && ( GXutil.strcmp(T015L3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm15L1304( 10) ;
         RcdFound1304 = (short)(1) ;
         initializeNonKey15L1304( ) ;
         A9865Cod_parX = T015L3_A9865Cod_parX[0] ;
         A9867ParValX = T015L3_A9867ParValX[0] ;
         n9867ParValX = T015L3_n9867ParValX[0] ;
         A9868ParObsX = T015L3_A9868ParObsX[0] ;
         n9868ParObsX = T015L3_n9868ParObsX[0] ;
         A10264Itm_ord4 = T015L3_A10264Itm_ord4[0] ;
         n10264Itm_ord4 = T015L3_n10264Itm_ord4[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         Z9836FasCodM = A9836FasCodM ;
         Z9830MaqCodC = A9830MaqCodC ;
         Z9864MaqAncA = A9864MaqAncA ;
         Z9865Cod_parX = A9865Cod_parX ;
         sMode1304 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal15L1304( ) ;
         load15L1304( ) ;
         Gx_mode = sMode1304 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1304 = (short)(0) ;
         initializeNonKey15L1304( ) ;
         sMode1304 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal15L1304( ) ;
         Gx_mode = sMode1304 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes15L1304( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency15L1304( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T015L2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A9864MaqAncA), Short.valueOf(A9865Cod_parX)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPFSMAC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z9867ParValX, T015L2_A9867ParValX[0]) != 0 ) || ( GXutil.strcmp(Z9868ParObsX, T015L2_A9868ParObsX[0]) != 0 ) || ( Z10264Itm_ord4 != T015L2_A10264Itm_ord4[0] ) )
         {
            if ( GXutil.strcmp(Z9867ParValX, T015L2_A9867ParValX[0]) != 0 )
            {
               GXutil.writeLogln("tpfsmac:[seudo value changed for attri]"+"ParValX");
               GXutil.writeLogRaw("Old: ",Z9867ParValX);
               GXutil.writeLogRaw("Current: ",T015L2_A9867ParValX[0]);
            }
            if ( GXutil.strcmp(Z9868ParObsX, T015L2_A9868ParObsX[0]) != 0 )
            {
               GXutil.writeLogln("tpfsmac:[seudo value changed for attri]"+"ParObsX");
               GXutil.writeLogRaw("Old: ",Z9868ParObsX);
               GXutil.writeLogRaw("Current: ",T015L2_A9868ParObsX[0]);
            }
            if ( Z10264Itm_ord4 != T015L2_A10264Itm_ord4[0] )
            {
               GXutil.writeLogln("tpfsmac:[seudo value changed for attri]"+"Itm_ord4");
               GXutil.writeLogRaw("Old: ",Z10264Itm_ord4);
               GXutil.writeLogRaw("Current: ",T015L2_A10264Itm_ord4[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPFSMAC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert15L1304( )
   {
      beforeValidate15L1304( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15L1304( ) ;
      }
      if ( AnyError == 0 )
      {
         zm15L1304( 0) ;
         checkOptimisticConcurrency15L1304( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15L1304( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert15L1304( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015L20 */
                  pr_default.execute(18, new Object[] {Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A9864MaqAncA), Short.valueOf(A9865Cod_parX), Boolean.valueOf(n9867ParValX), A9867ParValX, Boolean.valueOf(n9868ParObsX), A9868ParObsX, Boolean.valueOf(n10264Itm_ord4), Short.valueOf(A10264Itm_ord4), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPFSMAC");
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
            load15L1304( ) ;
         }
         endLevel15L1304( ) ;
      }
      closeExtendedTableCursors15L1304( ) ;
   }

   public void update15L1304( )
   {
      beforeValidate15L1304( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15L1304( ) ;
      }
      if ( ( nIsMod_1304 != 0 ) || ( nIsDirty_1304 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency15L1304( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm15L1304( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate15L1304( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T015L21 */
                     pr_default.execute(19, new Object[] {Boolean.valueOf(n9867ParValX), A9867ParValX, Boolean.valueOf(n9868ParObsX), A9868ParObsX, Boolean.valueOf(n10264Itm_ord4), Short.valueOf(A10264Itm_ord4), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A9864MaqAncA), Short.valueOf(A9865Cod_parX)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPFSMAC");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPFSMAC"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate15L1304( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey15L1304( ) ;
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
            endLevel15L1304( ) ;
         }
      }
      closeExtendedTableCursors15L1304( ) ;
   }

   public void deferredUpdate15L1304( )
   {
   }

   public void delete15L1304( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate15L1304( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15L1304( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls15L1304( ) ;
         afterConfirm15L1304( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete15L1304( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T015L22 */
               pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A9864MaqAncA), Short.valueOf(A9865Cod_parX)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPFSMAC");
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
      sMode1304 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel15L1304( ) ;
      Gx_mode = sMode1304 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls15L1304( )
   {
      standaloneModal15L1304( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A9866Dsc_ParX ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A9865Cod_parX ;
         GXv_char3[0] = GXt_char1 ;
         new app.pexparfs(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3) ;
         tpfsmac_impl.this.A396EmprCod = GXv_char4[0] ;
         tpfsmac_impl.this.A9865Cod_parX = GXv_int5[0] ;
         tpfsmac_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9866Dsc_ParX = GXt_char1 ;
      }
   }

   public void endLevel15L1304( )
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

   public void scanStart15L1304( )
   {
      /* Scan By routine */
      /* Using cursor T015L23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A9864MaqAncA)});
      RcdFound1304 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1304 = (short)(1) ;
         A9865Cod_parX = T015L23_A9865Cod_parX[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext15L1304( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound1304 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1304 = (short)(1) ;
         A9865Cod_parX = T015L23_A9865Cod_parX[0] ;
      }
   }

   public void scanEnd15L1304( )
   {
      pr_default.close(21);
   }

   public void afterConfirm15L1304( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert15L1304( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate15L1304( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete15L1304( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete15L1304( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate15L1304( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes15L1304( )
   {
      edtCod_parX_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCod_parX_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCod_parX_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtDsc_ParX_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDsc_ParX_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDsc_ParX_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtParValX_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParValX_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParValX_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtParObsX_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParObsX_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParObsX_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtItm_ord4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtItm_ord4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtItm_ord4_Enabled), 5, 0), !bGXsfl_85_Refreshing);
   }

   public void send_integrity_lvl_hashes15L1304( )
   {
   }

   public void send_integrity_lvl_hashes15L1303( )
   {
   }

   public void subsflControlProps_851304( )
   {
      edtavnRcdDeleted_1304_Internalname = "vNRCDDELETED_1304_"+sGXsfl_85_idx ;
      edtCod_parX_Internalname = "COD_PARX_"+sGXsfl_85_idx ;
      edtDsc_ParX_Internalname = "DSC_PARX_"+sGXsfl_85_idx ;
      edtParValX_Internalname = "PARVALX_"+sGXsfl_85_idx ;
      edtParObsX_Internalname = "PAROBSX_"+sGXsfl_85_idx ;
      edtItm_ord4_Internalname = "ITM_ORD4_"+sGXsfl_85_idx ;
   }

   public void subsflControlProps_fel_851304( )
   {
      edtavnRcdDeleted_1304_Internalname = "vNRCDDELETED_1304_"+sGXsfl_85_fel_idx ;
      edtCod_parX_Internalname = "COD_PARX_"+sGXsfl_85_fel_idx ;
      edtDsc_ParX_Internalname = "DSC_PARX_"+sGXsfl_85_fel_idx ;
      edtParValX_Internalname = "PARVALX_"+sGXsfl_85_fel_idx ;
      edtParObsX_Internalname = "PAROBSX_"+sGXsfl_85_fel_idx ;
      edtItm_ord4_Internalname = "ITM_ORD4_"+sGXsfl_85_fel_idx ;
   }

   public void addRow15L1304( )
   {
      nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_851304( ) ;
      sendRow15L1304( ) ;
   }

   public void sendRow15L1304( )
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
         if ( ((int)((nGXsfl_85_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1304_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1304_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1304, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1304_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1304), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1304), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1304_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1304_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1304_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCod_parX_Internalname,GXutil.ltrim( localUtil.ntoc( A9865Cod_parX, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9865Cod_parX), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,87);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCod_parX_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCod_parX_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDsc_ParX_Internalname,GXutil.rtrim( A9866Dsc_ParX),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDsc_ParX_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDsc_ParX_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1304_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParValX_Internalname,GXutil.rtrim( A9867ParValX),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParValX_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtParValX_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1304_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParObsX_Internalname,A9868ParObsX,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,90);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParObsX_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtParObsX_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(400),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1304_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtItm_ord4_Internalname,GXutil.ltrim( localUtil.ntoc( A10264Itm_ord4, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtItm_ord4_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10264Itm_ord4), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10264Itm_ord4), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtItm_ord4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtItm_ord4_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes15L1304( ) ;
      GXCCtl = "Z9865Cod_parX_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9865Cod_parX, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9867ParValX_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9867ParValX));
      GXCCtl = "Z9868ParObsX_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z9868ParObsX);
      GXCCtl = "Z10264Itm_ord4_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10264Itm_ord4, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1304_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1304, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1304_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1304, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1304_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1304, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1304_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1304_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COD_PARX_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCod_parX_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DSC_PARX_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDsc_ParX_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARVALX_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParValX_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAROBSX_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParObsX_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ITM_ORD4_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtItm_ord4_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow15L1304( )
   {
      nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_851304( ) ;
      edtavnRcdDeleted_1304_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1304_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCod_parX_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COD_PARX_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDsc_ParX_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DSC_PARX_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParValX_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARVALX_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParObsX_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAROBSX_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtItm_ord4_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ITM_ORD4_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1304_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1304_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1304");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1304_Internalname ;
         wbErr = true ;
         nRcdDeleted_1304 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1304 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1304_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCod_parX_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCod_parX_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "COD_PARX_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCod_parX_Internalname ;
         wbErr = true ;
         A9865Cod_parX = (short)(0) ;
      }
      else
      {
         A9865Cod_parX = (short)(localUtil.ctol( httpContext.cgiGet( edtCod_parX_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A9866Dsc_ParX = httpContext.cgiGet( edtDsc_ParX_Internalname) ;
      A9867ParValX = httpContext.cgiGet( edtParValX_Internalname) ;
      n9867ParValX = false ;
      A9868ParObsX = httpContext.cgiGet( edtParObsX_Internalname) ;
      n9868ParObsX = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtItm_ord4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtItm_ord4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ITM_ORD4_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtItm_ord4_Internalname ;
         wbErr = true ;
         A10264Itm_ord4 = (short)(0) ;
         n10264Itm_ord4 = false ;
      }
      else
      {
         A10264Itm_ord4 = (short)(localUtil.ctol( httpContext.cgiGet( edtItm_ord4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10264Itm_ord4 = false ;
      }
      GXCCtl = "Z9865Cod_parX_" + sGXsfl_85_idx ;
      Z9865Cod_parX = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9867ParValX_" + sGXsfl_85_idx ;
      Z9867ParValX = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9868ParObsX_" + sGXsfl_85_idx ;
      Z9868ParObsX = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10264Itm_ord4_" + sGXsfl_85_idx ;
      Z10264Itm_ord4 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1304_" + sGXsfl_85_idx ;
      nRcdDeleted_1304 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1304_" + sGXsfl_85_idx ;
      nRcdExists_1304 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1304_" + sGXsfl_85_idx ;
      nIsMod_1304 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCod_parX_Enabled = edtCod_parX_Enabled ;
   }

   public void confirmValues15L0( )
   {
      nGXsfl_85_idx = 0 ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_851304( ) ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
         sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_851304( ) ;
         httpContext.changePostValue( "Z9865Cod_parX_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z9865Cod_parX_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9865Cod_parX_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z9867ParValX_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z9867ParValX_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9867ParValX_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z9868ParObsX_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z9868ParObsX_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9868ParObsX_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z10264Itm_ord4_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z10264Itm_ord4_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10264Itm_ord4_"+sGXsfl_85_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpfsmac", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.rtrim(A9836FasCodM)),GXutil.URLEncode(GXutil.rtrim(A9830MaqCodC))}, new String[] {"EmprCod","CliCod","ArtCod","ProCod","FasCodM","MaqCodC"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z9836FasCodM", GXutil.rtrim( Z9836FasCodM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9830MaqCodC", GXutil.rtrim( Z9830MaqCodC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9864MaqAncA", GXutil.ltrim( localUtil.ntoc( Z9864MaqAncA, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_85", GXutil.ltrim( localUtil.ntoc( nGXsfl_85_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tpfsmac", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.rtrim(A9836FasCodM)),GXutil.URLEncode(GXutil.rtrim(A9830MaqCodC))}, new String[] {"EmprCod","CliCod","ArtCod","ProCod","FasCodM","MaqCodC"})  ;
   }

   public String getPgmname( )
   {
      return "TPFSMAC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PARAMETROS POR ANCHOS", "") ;
   }

   public void initializeNonKey15L1303( )
   {
   }

   public void initAll15L1303( )
   {
      A9864MaqAncA = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A9864MaqAncA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9864MaqAncA), 3, 0));
      initializeNonKey15L1303( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey15L1304( )
   {
      A9866Dsc_ParX = "" ;
      A9867ParValX = "" ;
      n9867ParValX = false ;
      A9868ParObsX = "" ;
      n9868ParObsX = false ;
      A10264Itm_ord4 = (short)(0) ;
      n10264Itm_ord4 = false ;
      Z9867ParValX = "" ;
      Z9868ParObsX = "" ;
      Z10264Itm_ord4 = (short)(0) ;
   }

   public void initAll15L1304( )
   {
      A9865Cod_parX = (short)(0) ;
      initializeNonKey15L1304( ) ;
   }

   public void standaloneModalInsert15L1304( )
   {
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241543330", true, true);
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
      httpContext.AddJavascriptSource("tpfsmac.js", "?20268241543331", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1304( )
   {
      edtCod_parX_Enabled = defedtCod_parX_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCod_parX_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCod_parX_Enabled), 5, 0), !bGXsfl_85_Refreshing);
   }

   public void startgridcontrol85( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1304, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1304_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9865Cod_parX, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCod_parX_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9866Dsc_ParX));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDsc_ParX_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9867ParValX));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParValX_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A9868ParObsX);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParObsX_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10264Itm_ord4, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtItm_ord4_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtProCod_Internalname = "PROCOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtProDsc_Internalname = "PRODSC" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtFasCodM_Internalname = "FASCODM" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtFasDscM_Internalname = "FASDSCM" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtMaqCodC_Internalname = "MAQCODC" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtMaqDscD_Internalname = "MAQDSCD" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtMaqAncA_Internalname = "MAQANCA" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      edtavnRcdDeleted_1304_Internalname = "vNRCDDELETED_1304" ;
      edtCod_parX_Internalname = "COD_PARX" ;
      edtDsc_ParX_Internalname = "DSC_PARX" ;
      edtParValX_Internalname = "PARVALX" ;
      edtParObsX_Internalname = "PAROBSX" ;
      edtItm_ord4_Internalname = "ITM_ORD4" ;
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
      Form.setCaption( httpContext.getMessage( "PARAMETROS POR ANCHOS", "") );
      edtItm_ord4_Jsonclick = "" ;
      edtParObsX_Jsonclick = "" ;
      edtParValX_Jsonclick = "" ;
      edtDsc_ParX_Jsonclick = "" ;
      edtCod_parX_Jsonclick = "" ;
      edtavnRcdDeleted_1304_Jsonclick = "" ;
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
      edtItm_ord4_Enabled = 1 ;
      edtParObsX_Enabled = 1 ;
      edtParValX_Enabled = 1 ;
      edtDsc_ParX_Enabled = 0 ;
      edtCod_parX_Enabled = 1 ;
      edtavnRcdDeleted_1304_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtMaqAncA_Jsonclick = "" ;
      edtMaqAncA_Backcolor = (int)(0xFFFFFF) ;
      edtMaqAncA_Enabled = 1 ;
      edtMaqDscD_Jsonclick = "" ;
      edtMaqDscD_Backcolor = (int)(0xFFFFFF) ;
      edtMaqDscD_Enabled = 0 ;
      edtMaqCodC_Jsonclick = "" ;
      edtMaqCodC_Backcolor = (int)(0xFFFFFF) ;
      edtMaqCodC_Enabled = 0 ;
      edtFasDscM_Jsonclick = "" ;
      edtFasDscM_Backcolor = (int)(0xFFFFFF) ;
      edtFasDscM_Enabled = 0 ;
      edtFasCodM_Jsonclick = "" ;
      edtFasCodM_Backcolor = (int)(0xFFFFFF) ;
      edtFasCodM_Enabled = 0 ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Backcolor = (int)(0xFFFFFF) ;
      edtProDsc_Enabled = 0 ;
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

   public void gx1asafasdscm15L1303( String A396EmprCod ,
                                     String A9836FasCodM )
   {
      GXt_char1 = A9837FasDscM ;
      GXv_char4[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A9836FasCodM, GXv_char4) ;
      tpfsmac_impl.this.GXt_char1 = GXv_char4[0] ;
      A9837FasDscM = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9837FasDscM", A9837FasDscM);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9837FasDscM))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx2asamaqdscd15L1303( String A396EmprCod ,
                                     String A9830MaqCodC )
   {
      GXt_char1 = A9831MaqDscD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A9830MaqCodC ;
      GXv_char2[0] = GXt_char1 ;
      new app.pmaqdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tpfsmac_impl.this.A396EmprCod = GXv_char4[0] ;
      tpfsmac_impl.this.A9830MaqCodC = GXv_char3[0] ;
      tpfsmac_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A9830MaqCodC", A9830MaqCodC);
      A9831MaqDscD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9831MaqDscD", A9831MaqDscD);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9831MaqDscD))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx3asadsc_parx15L1304( String A396EmprCod ,
                                      short A9865Cod_parX )
   {
      GXt_char1 = A9866Dsc_ParX ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A9865Cod_parX ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexparfs(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3) ;
      tpfsmac_impl.this.A396EmprCod = GXv_char4[0] ;
      tpfsmac_impl.this.A9865Cod_parX = GXv_int5[0] ;
      tpfsmac_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9866Dsc_ParX = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9866Dsc_ParX))+"\"") ;
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
      subsflControlProps_851304( ) ;
      while ( nGXsfl_85_idx <= nRC_GXsfl_85 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal15L1304( ) ;
         standaloneModal15L1304( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow15L1304( ) ;
         nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
         sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_851304( ) ;
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
      /* Using cursor T015L24 */
      pr_default.execute(22, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T015L24_A407EmprNom[0] ;
      n407EmprNom = T015L24_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(22);
      /* Using cursor T015L25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T015L25_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(23);
      /* Using cursor T015L26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
      A69ArtDsc = T015L26_A69ArtDsc[0] ;
      n69ArtDsc = T015L26_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(24);
      /* Using cursor T015L27 */
      pr_default.execute(25, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T015L27_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(25);
      /* Using cursor T015L28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CAPFM1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCODC");
         AnyError = (short)(1) ;
      }
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

   public void valid_Maqanca( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9831MaqDscD", GXutil.rtrim( A9831MaqDscD));
      httpContext.ajax_rsp_assign_attri("", false, "A9837FasDscM", GXutil.rtrim( A9837FasDscM));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9836FasCodM", GXutil.rtrim( Z9836FasCodM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9830MaqCodC", GXutil.rtrim( Z9830MaqCodC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9864MaqAncA", GXutil.ltrim( localUtil.ntoc( Z9864MaqAncA, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9831MaqDscD", GXutil.rtrim( Z9831MaqDscD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9837FasDscM", GXutil.rtrim( Z9837FasDscM));
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

   public void valid_Cod_parx( )
   {
      GXt_char1 = A9866Dsc_ParX ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A9865Cod_parX ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexparfs(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3) ;
      tpfsmac_impl.this.A396EmprCod = GXv_char4[0] ;
      tpfsmac_impl.this.A9865Cod_parX = GXv_int5[0] ;
      tpfsmac_impl.this.GXt_char1 = GXv_char3[0] ;
      A9866Dsc_ParX = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9866Dsc_ParX", GXutil.rtrim( A9866Dsc_ParX));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A9836FasCodM',fld:'FASCODM',pic:''},{av:'A9830MaqCodC',fld:'MAQCODC',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[]");
      setEventMetadata("VALID_ARTCOD",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
      setEventMetadata("VALID_FASCODM","{handler:'valid_Fascodm',iparms:[]");
      setEventMetadata("VALID_FASCODM",",oparms:[]}");
      setEventMetadata("VALID_MAQCODC","{handler:'valid_Maqcodc',iparms:[]");
      setEventMetadata("VALID_MAQCODC",",oparms:[]}");
      setEventMetadata("VALID_MAQANCA","{handler:'valid_Maqanca',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A9836FasCodM',fld:'FASCODM',pic:''},{av:'A9830MaqCodC',fld:'MAQCODC',pic:''},{av:'A9864MaqAncA',fld:'MAQANCA',pic:'ZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MAQANCA",",oparms:[{av:'A9831MaqDscD',fld:'MAQDSCD',pic:''},{av:'A9837FasDscM',fld:'FASDSCM',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z758ProCod'},{av:'Z9836FasCodM'},{av:'Z9830MaqCodC'},{av:'Z9864MaqAncA'},{av:'Z9831MaqDscD'},{av:'Z9837FasDscM'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z69ArtDsc'},{av:'Z759ProDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_COD_PARX","{handler:'valid_Cod_parx',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9865Cod_parX',fld:'COD_PARX',pic:'ZZZ9'},{av:'A9866Dsc_ParX',fld:'DSC_PARX',pic:''}]");
      setEventMetadata("VALID_COD_PARX",",oparms:[{av:'A9866Dsc_ParX',fld:'DSC_PARX',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Itm_ord4',iparms:[]");
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
      pr_default.close(23);
      pr_default.close(22);
      pr_default.close(25);
      pr_default.close(26);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA65ArtCod = "" ;
      wcpOA758ProCod = "" ;
      wcpOA9836FasCodM = "" ;
      wcpOA9830MaqCodC = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z758ProCod = "" ;
      Z9836FasCodM = "" ;
      Z9830MaqCodC = "" ;
      Z9867ParValX = "" ;
      Z9868ParObsX = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A9836FasCodM = "" ;
      A9830MaqCodC = "" ;
      A65ArtCod = "" ;
      A758ProCod = "" ;
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
      lblTextblock4_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A69ArtDsc = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A759ProDsc = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A9837FasDscM = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A9831MaqDscD = "" ;
      lblTextblock13_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1304 = "" ;
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
      sMode1303 = "" ;
      GXCCtl = "" ;
      A9866Dsc_ParX = "" ;
      A9867ParValX = "" ;
      A9868ParObsX = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z69ArtDsc = "" ;
      Z759ProDsc = "" ;
      T015L6_A407EmprNom = new String[] {""} ;
      T015L6_n407EmprNom = new boolean[] {false} ;
      T015L7_A279CliNom = new String[] {""} ;
      T015L8_A69ArtDsc = new String[] {""} ;
      T015L8_n69ArtDsc = new boolean[] {false} ;
      T015L9_A759ProDsc = new String[] {""} ;
      T015L10_A396EmprCod = new String[] {""} ;
      T015L11_A9864MaqAncA = new short[1] ;
      T015L11_A407EmprNom = new String[] {""} ;
      T015L11_n407EmprNom = new boolean[] {false} ;
      T015L11_A279CliNom = new String[] {""} ;
      T015L11_A69ArtDsc = new String[] {""} ;
      T015L11_n69ArtDsc = new boolean[] {false} ;
      T015L11_A759ProDsc = new String[] {""} ;
      T015L11_A396EmprCod = new String[] {""} ;
      T015L11_A252CliCod = new int[1] ;
      T015L11_A65ArtCod = new String[] {""} ;
      T015L11_A758ProCod = new String[] {""} ;
      T015L11_A9836FasCodM = new String[] {""} ;
      T015L11_A9830MaqCodC = new String[] {""} ;
      T015L12_A396EmprCod = new String[] {""} ;
      T015L12_A252CliCod = new int[1] ;
      T015L12_A65ArtCod = new String[] {""} ;
      T015L12_A758ProCod = new String[] {""} ;
      T015L12_A9836FasCodM = new String[] {""} ;
      T015L12_A9830MaqCodC = new String[] {""} ;
      T015L12_A9864MaqAncA = new short[1] ;
      T015L5_A9864MaqAncA = new short[1] ;
      T015L5_A396EmprCod = new String[] {""} ;
      T015L5_A252CliCod = new int[1] ;
      T015L5_A65ArtCod = new String[] {""} ;
      T015L5_A758ProCod = new String[] {""} ;
      T015L5_A9836FasCodM = new String[] {""} ;
      T015L5_A9830MaqCodC = new String[] {""} ;
      T015L13_A396EmprCod = new String[] {""} ;
      T015L13_A252CliCod = new int[1] ;
      T015L13_A65ArtCod = new String[] {""} ;
      T015L13_A758ProCod = new String[] {""} ;
      T015L13_A9836FasCodM = new String[] {""} ;
      T015L13_A9830MaqCodC = new String[] {""} ;
      T015L13_A9864MaqAncA = new short[1] ;
      T015L14_A396EmprCod = new String[] {""} ;
      T015L14_A252CliCod = new int[1] ;
      T015L14_A65ArtCod = new String[] {""} ;
      T015L14_A758ProCod = new String[] {""} ;
      T015L14_A9836FasCodM = new String[] {""} ;
      T015L14_A9830MaqCodC = new String[] {""} ;
      T015L14_A9864MaqAncA = new short[1] ;
      T015L4_A9864MaqAncA = new short[1] ;
      T015L4_A396EmprCod = new String[] {""} ;
      T015L4_A252CliCod = new int[1] ;
      T015L4_A65ArtCod = new String[] {""} ;
      T015L4_A758ProCod = new String[] {""} ;
      T015L4_A9836FasCodM = new String[] {""} ;
      T015L4_A9830MaqCodC = new String[] {""} ;
      T015L17_A396EmprCod = new String[] {""} ;
      T015L17_A252CliCod = new int[1] ;
      T015L17_A65ArtCod = new String[] {""} ;
      T015L17_A758ProCod = new String[] {""} ;
      T015L17_A9836FasCodM = new String[] {""} ;
      T015L17_A9830MaqCodC = new String[] {""} ;
      T015L17_A9864MaqAncA = new short[1] ;
      T015L18_A252CliCod = new int[1] ;
      T015L18_A65ArtCod = new String[] {""} ;
      T015L18_A758ProCod = new String[] {""} ;
      T015L18_A9836FasCodM = new String[] {""} ;
      T015L18_A9830MaqCodC = new String[] {""} ;
      T015L18_A9864MaqAncA = new short[1] ;
      T015L18_A9865Cod_parX = new short[1] ;
      T015L18_A9867ParValX = new String[] {""} ;
      T015L18_n9867ParValX = new boolean[] {false} ;
      T015L18_A9868ParObsX = new String[] {""} ;
      T015L18_n9868ParObsX = new boolean[] {false} ;
      T015L18_A10264Itm_ord4 = new short[1] ;
      T015L18_n10264Itm_ord4 = new boolean[] {false} ;
      T015L18_A396EmprCod = new String[] {""} ;
      T015L19_A396EmprCod = new String[] {""} ;
      T015L19_A252CliCod = new int[1] ;
      T015L19_A65ArtCod = new String[] {""} ;
      T015L19_A758ProCod = new String[] {""} ;
      T015L19_A9836FasCodM = new String[] {""} ;
      T015L19_A9830MaqCodC = new String[] {""} ;
      T015L19_A9864MaqAncA = new short[1] ;
      T015L19_A9865Cod_parX = new short[1] ;
      T015L3_A252CliCod = new int[1] ;
      T015L3_A65ArtCod = new String[] {""} ;
      T015L3_A758ProCod = new String[] {""} ;
      T015L3_A9836FasCodM = new String[] {""} ;
      T015L3_A9830MaqCodC = new String[] {""} ;
      T015L3_A9864MaqAncA = new short[1] ;
      T015L3_A9865Cod_parX = new short[1] ;
      T015L3_A9867ParValX = new String[] {""} ;
      T015L3_n9867ParValX = new boolean[] {false} ;
      T015L3_A9868ParObsX = new String[] {""} ;
      T015L3_n9868ParObsX = new boolean[] {false} ;
      T015L3_A10264Itm_ord4 = new short[1] ;
      T015L3_n10264Itm_ord4 = new boolean[] {false} ;
      T015L3_A396EmprCod = new String[] {""} ;
      T015L2_A252CliCod = new int[1] ;
      T015L2_A65ArtCod = new String[] {""} ;
      T015L2_A758ProCod = new String[] {""} ;
      T015L2_A9836FasCodM = new String[] {""} ;
      T015L2_A9830MaqCodC = new String[] {""} ;
      T015L2_A9864MaqAncA = new short[1] ;
      T015L2_A9865Cod_parX = new short[1] ;
      T015L2_A9867ParValX = new String[] {""} ;
      T015L2_n9867ParValX = new boolean[] {false} ;
      T015L2_A9868ParObsX = new String[] {""} ;
      T015L2_n9868ParObsX = new boolean[] {false} ;
      T015L2_A10264Itm_ord4 = new short[1] ;
      T015L2_n10264Itm_ord4 = new boolean[] {false} ;
      T015L2_A396EmprCod = new String[] {""} ;
      T015L23_A396EmprCod = new String[] {""} ;
      T015L23_A252CliCod = new int[1] ;
      T015L23_A65ArtCod = new String[] {""} ;
      T015L23_A758ProCod = new String[] {""} ;
      T015L23_A9836FasCodM = new String[] {""} ;
      T015L23_A9830MaqCodC = new String[] {""} ;
      T015L23_A9864MaqAncA = new short[1] ;
      T015L23_A9865Cod_parX = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_char2 = new String[1] ;
      T015L24_A407EmprNom = new String[] {""} ;
      T015L24_n407EmprNom = new boolean[] {false} ;
      T015L25_A279CliNom = new String[] {""} ;
      T015L26_A69ArtDsc = new String[] {""} ;
      T015L26_n69ArtDsc = new boolean[] {false} ;
      T015L27_A759ProDsc = new String[] {""} ;
      T015L28_A396EmprCod = new String[] {""} ;
      Z9831MaqDscD = "" ;
      Z9837FasDscM = "" ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ758ProCod = "" ;
      ZZ9836FasCodM = "" ;
      ZZ9830MaqCodC = "" ;
      ZZ9831MaqDscD = "" ;
      ZZ9837FasDscM = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ69ArtDsc = "" ;
      ZZ759ProDsc = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new short[1] ;
      GXv_char3 = new String[1] ;
      Z9866Dsc_ParX = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tpfsmac__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpfsmac__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpfsmac__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpfsmac__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpfsmac__default(),
         new Object[] {
             new Object[] {
            T015L2_A252CliCod, T015L2_A65ArtCod, T015L2_A758ProCod, T015L2_A9836FasCodM, T015L2_A9830MaqCodC, T015L2_A9864MaqAncA, T015L2_A9865Cod_parX, T015L2_A9867ParValX, T015L2_n9867ParValX, T015L2_A9868ParObsX,
            T015L2_n9868ParObsX, T015L2_A10264Itm_ord4, T015L2_n10264Itm_ord4, T015L2_A396EmprCod
            }
            , new Object[] {
            T015L3_A252CliCod, T015L3_A65ArtCod, T015L3_A758ProCod, T015L3_A9836FasCodM, T015L3_A9830MaqCodC, T015L3_A9864MaqAncA, T015L3_A9865Cod_parX, T015L3_A9867ParValX, T015L3_n9867ParValX, T015L3_A9868ParObsX,
            T015L3_n9868ParObsX, T015L3_A10264Itm_ord4, T015L3_n10264Itm_ord4, T015L3_A396EmprCod
            }
            , new Object[] {
            T015L4_A9864MaqAncA, T015L4_A396EmprCod, T015L4_A252CliCod, T015L4_A65ArtCod, T015L4_A758ProCod, T015L4_A9836FasCodM, T015L4_A9830MaqCodC
            }
            , new Object[] {
            T015L5_A9864MaqAncA, T015L5_A396EmprCod, T015L5_A252CliCod, T015L5_A65ArtCod, T015L5_A758ProCod, T015L5_A9836FasCodM, T015L5_A9830MaqCodC
            }
            , new Object[] {
            T015L6_A407EmprNom, T015L6_n407EmprNom
            }
            , new Object[] {
            T015L7_A279CliNom
            }
            , new Object[] {
            T015L8_A69ArtDsc, T015L8_n69ArtDsc
            }
            , new Object[] {
            T015L9_A759ProDsc
            }
            , new Object[] {
            T015L10_A396EmprCod
            }
            , new Object[] {
            T015L11_A9864MaqAncA, T015L11_A407EmprNom, T015L11_n407EmprNom, T015L11_A279CliNom, T015L11_A69ArtDsc, T015L11_n69ArtDsc, T015L11_A759ProDsc, T015L11_A396EmprCod, T015L11_A252CliCod, T015L11_A65ArtCod,
            T015L11_A758ProCod, T015L11_A9836FasCodM, T015L11_A9830MaqCodC
            }
            , new Object[] {
            T015L12_A396EmprCod, T015L12_A252CliCod, T015L12_A65ArtCod, T015L12_A758ProCod, T015L12_A9836FasCodM, T015L12_A9830MaqCodC, T015L12_A9864MaqAncA
            }
            , new Object[] {
            T015L13_A396EmprCod, T015L13_A252CliCod, T015L13_A65ArtCod, T015L13_A758ProCod, T015L13_A9836FasCodM, T015L13_A9830MaqCodC, T015L13_A9864MaqAncA
            }
            , new Object[] {
            T015L14_A396EmprCod, T015L14_A252CliCod, T015L14_A65ArtCod, T015L14_A758ProCod, T015L14_A9836FasCodM, T015L14_A9830MaqCodC, T015L14_A9864MaqAncA
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015L17_A396EmprCod, T015L17_A252CliCod, T015L17_A65ArtCod, T015L17_A758ProCod, T015L17_A9836FasCodM, T015L17_A9830MaqCodC, T015L17_A9864MaqAncA
            }
            , new Object[] {
            T015L18_A252CliCod, T015L18_A65ArtCod, T015L18_A758ProCod, T015L18_A9836FasCodM, T015L18_A9830MaqCodC, T015L18_A9864MaqAncA, T015L18_A9865Cod_parX, T015L18_A9867ParValX, T015L18_n9867ParValX, T015L18_A9868ParObsX,
            T015L18_n9868ParObsX, T015L18_A10264Itm_ord4, T015L18_n10264Itm_ord4, T015L18_A396EmprCod
            }
            , new Object[] {
            T015L19_A396EmprCod, T015L19_A252CliCod, T015L19_A65ArtCod, T015L19_A758ProCod, T015L19_A9836FasCodM, T015L19_A9830MaqCodC, T015L19_A9864MaqAncA, T015L19_A9865Cod_parX
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015L23_A396EmprCod, T015L23_A252CliCod, T015L23_A65ArtCod, T015L23_A758ProCod, T015L23_A9836FasCodM, T015L23_A9830MaqCodC, T015L23_A9864MaqAncA, T015L23_A9865Cod_parX
            }
            , new Object[] {
            T015L24_A407EmprNom, T015L24_n407EmprNom
            }
            , new Object[] {
            T015L25_A279CliNom
            }
            , new Object[] {
            T015L26_A69ArtDsc, T015L26_n69ArtDsc
            }
            , new Object[] {
            T015L27_A759ProDsc
            }
            , new Object[] {
            T015L28_A396EmprCod
            }
         }
      );
      Z9830MaqCodC = "" ;
      A9830MaqCodC = "" ;
      Z9836FasCodM = "" ;
      A9836FasCodM = "" ;
      Z758ProCod = "" ;
      A758ProCod = "" ;
      Z65ArtCod = "" ;
      A65ArtCod = "" ;
      Z252CliCod = 0 ;
      A252CliCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
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
   private short Z9864MaqAncA ;
   private short Z9865Cod_parX ;
   private short Z10264Itm_ord4 ;
   private short nRcdDeleted_1304 ;
   private short nRcdExists_1304 ;
   private short nIsMod_1304 ;
   private short A9865Cod_parX ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A9864MaqAncA ;
   private short nBlankRcdCount1304 ;
   private short RcdFound1304 ;
   private short nBlankRcdUsr1304 ;
   private short A10264Itm_ord4 ;
   private short RcdFound1303 ;
   private short nIsDirty_1303 ;
   private short nIsDirty_1304 ;
   private short ZZ9864MaqAncA ;
   private short GXv_int5[] ;
   private int wcpOA252CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_85 ;
   private int nGXsfl_85_idx=1 ;
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
   private int edtProCod_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtFasCodM_Enabled ;
   private int edtFasDscM_Enabled ;
   private int edtMaqCodC_Enabled ;
   private int edtMaqDscD_Enabled ;
   private int edtMaqAncA_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtavnRcdDeleted_1304_Enabled ;
   private int edtCod_parX_Enabled ;
   private int edtDsc_ParX_Enabled ;
   private int edtParValX_Enabled ;
   private int edtParObsX_Enabled ;
   private int edtItm_ord4_Enabled ;
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
   private int defedtCod_parX_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtMaqAncA_Backcolor ;
   private int edtMaqDscD_Backcolor ;
   private int edtMaqCodC_Backcolor ;
   private int edtFasDscM_Backcolor ;
   private int edtFasCodM_Backcolor ;
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
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA65ArtCod ;
   private String wcpOA758ProCod ;
   private String wcpOA9836FasCodM ;
   private String wcpOA9830MaqCodC ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z758ProCod ;
   private String Z9836FasCodM ;
   private String Z9830MaqCodC ;
   private String Z9867ParValX ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A9836FasCodM ;
   private String A9830MaqCodC ;
   private String A65ArtCod ;
   private String A758ProCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMaqAncA_Internalname ;
   private String sGXsfl_85_idx="0001" ;
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
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtFasCodM_Internalname ;
   private String edtFasCodM_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtFasDscM_Internalname ;
   private String A9837FasDscM ;
   private String edtFasDscM_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtMaqCodC_Internalname ;
   private String edtMaqCodC_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtMaqDscD_Internalname ;
   private String A9831MaqDscD ;
   private String edtMaqDscD_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtMaqAncA_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String sMode1304 ;
   private String edtavnRcdDeleted_1304_Internalname ;
   private String edtCod_parX_Internalname ;
   private String edtDsc_ParX_Internalname ;
   private String edtParValX_Internalname ;
   private String edtParObsX_Internalname ;
   private String edtItm_ord4_Internalname ;
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
   private String sMode1303 ;
   private String GXCCtl ;
   private String A9866Dsc_ParX ;
   private String A9867ParValX ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z69ArtDsc ;
   private String Z759ProDsc ;
   private String sGXsfl_85_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1304_Jsonclick ;
   private String edtCod_parX_Jsonclick ;
   private String edtDsc_ParX_Jsonclick ;
   private String edtParValX_Jsonclick ;
   private String edtParObsX_Jsonclick ;
   private String edtItm_ord4_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String GXv_char2[] ;
   private String Z9831MaqDscD ;
   private String Z9837FasDscM ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ758ProCod ;
   private String ZZ9836FasCodM ;
   private String ZZ9830MaqCodC ;
   private String ZZ9831MaqDscD ;
   private String ZZ9837FasDscM ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ69ArtDsc ;
   private String ZZ759ProDsc ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String Z9866Dsc_ParX ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_85_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n69ArtDsc ;
   private boolean n9867ParValX ;
   private boolean n9868ParObsX ;
   private boolean n10264Itm_ord4 ;
   private String Z9868ParObsX ;
   private String A9868ParObsX ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T015L6_A407EmprNom ;
   private boolean[] T015L6_n407EmprNom ;
   private String[] T015L7_A279CliNom ;
   private String[] T015L8_A69ArtDsc ;
   private boolean[] T015L8_n69ArtDsc ;
   private String[] T015L9_A759ProDsc ;
   private String[] T015L10_A396EmprCod ;
   private short[] T015L11_A9864MaqAncA ;
   private String[] T015L11_A407EmprNom ;
   private boolean[] T015L11_n407EmprNom ;
   private String[] T015L11_A279CliNom ;
   private String[] T015L11_A69ArtDsc ;
   private boolean[] T015L11_n69ArtDsc ;
   private String[] T015L11_A759ProDsc ;
   private String[] T015L11_A396EmprCod ;
   private int[] T015L11_A252CliCod ;
   private String[] T015L11_A65ArtCod ;
   private String[] T015L11_A758ProCod ;
   private String[] T015L11_A9836FasCodM ;
   private String[] T015L11_A9830MaqCodC ;
   private String[] T015L12_A396EmprCod ;
   private int[] T015L12_A252CliCod ;
   private String[] T015L12_A65ArtCod ;
   private String[] T015L12_A758ProCod ;
   private String[] T015L12_A9836FasCodM ;
   private String[] T015L12_A9830MaqCodC ;
   private short[] T015L12_A9864MaqAncA ;
   private short[] T015L5_A9864MaqAncA ;
   private String[] T015L5_A396EmprCod ;
   private int[] T015L5_A252CliCod ;
   private String[] T015L5_A65ArtCod ;
   private String[] T015L5_A758ProCod ;
   private String[] T015L5_A9836FasCodM ;
   private String[] T015L5_A9830MaqCodC ;
   private String[] T015L13_A396EmprCod ;
   private int[] T015L13_A252CliCod ;
   private String[] T015L13_A65ArtCod ;
   private String[] T015L13_A758ProCod ;
   private String[] T015L13_A9836FasCodM ;
   private String[] T015L13_A9830MaqCodC ;
   private short[] T015L13_A9864MaqAncA ;
   private String[] T015L14_A396EmprCod ;
   private int[] T015L14_A252CliCod ;
   private String[] T015L14_A65ArtCod ;
   private String[] T015L14_A758ProCod ;
   private String[] T015L14_A9836FasCodM ;
   private String[] T015L14_A9830MaqCodC ;
   private short[] T015L14_A9864MaqAncA ;
   private short[] T015L4_A9864MaqAncA ;
   private String[] T015L4_A396EmprCod ;
   private int[] T015L4_A252CliCod ;
   private String[] T015L4_A65ArtCod ;
   private String[] T015L4_A758ProCod ;
   private String[] T015L4_A9836FasCodM ;
   private String[] T015L4_A9830MaqCodC ;
   private String[] T015L17_A396EmprCod ;
   private int[] T015L17_A252CliCod ;
   private String[] T015L17_A65ArtCod ;
   private String[] T015L17_A758ProCod ;
   private String[] T015L17_A9836FasCodM ;
   private String[] T015L17_A9830MaqCodC ;
   private short[] T015L17_A9864MaqAncA ;
   private int[] T015L18_A252CliCod ;
   private String[] T015L18_A65ArtCod ;
   private String[] T015L18_A758ProCod ;
   private String[] T015L18_A9836FasCodM ;
   private String[] T015L18_A9830MaqCodC ;
   private short[] T015L18_A9864MaqAncA ;
   private short[] T015L18_A9865Cod_parX ;
   private String[] T015L18_A9867ParValX ;
   private boolean[] T015L18_n9867ParValX ;
   private String[] T015L18_A9868ParObsX ;
   private boolean[] T015L18_n9868ParObsX ;
   private short[] T015L18_A10264Itm_ord4 ;
   private boolean[] T015L18_n10264Itm_ord4 ;
   private String[] T015L18_A396EmprCod ;
   private String[] T015L19_A396EmprCod ;
   private int[] T015L19_A252CliCod ;
   private String[] T015L19_A65ArtCod ;
   private String[] T015L19_A758ProCod ;
   private String[] T015L19_A9836FasCodM ;
   private String[] T015L19_A9830MaqCodC ;
   private short[] T015L19_A9864MaqAncA ;
   private short[] T015L19_A9865Cod_parX ;
   private int[] T015L3_A252CliCod ;
   private String[] T015L3_A65ArtCod ;
   private String[] T015L3_A758ProCod ;
   private String[] T015L3_A9836FasCodM ;
   private String[] T015L3_A9830MaqCodC ;
   private short[] T015L3_A9864MaqAncA ;
   private short[] T015L3_A9865Cod_parX ;
   private String[] T015L3_A9867ParValX ;
   private boolean[] T015L3_n9867ParValX ;
   private String[] T015L3_A9868ParObsX ;
   private boolean[] T015L3_n9868ParObsX ;
   private short[] T015L3_A10264Itm_ord4 ;
   private boolean[] T015L3_n10264Itm_ord4 ;
   private String[] T015L3_A396EmprCod ;
   private int[] T015L2_A252CliCod ;
   private String[] T015L2_A65ArtCod ;
   private String[] T015L2_A758ProCod ;
   private String[] T015L2_A9836FasCodM ;
   private String[] T015L2_A9830MaqCodC ;
   private short[] T015L2_A9864MaqAncA ;
   private short[] T015L2_A9865Cod_parX ;
   private String[] T015L2_A9867ParValX ;
   private boolean[] T015L2_n9867ParValX ;
   private String[] T015L2_A9868ParObsX ;
   private boolean[] T015L2_n9868ParObsX ;
   private short[] T015L2_A10264Itm_ord4 ;
   private boolean[] T015L2_n10264Itm_ord4 ;
   private String[] T015L2_A396EmprCod ;
   private String[] T015L23_A396EmprCod ;
   private int[] T015L23_A252CliCod ;
   private String[] T015L23_A65ArtCod ;
   private String[] T015L23_A758ProCod ;
   private String[] T015L23_A9836FasCodM ;
   private String[] T015L23_A9830MaqCodC ;
   private short[] T015L23_A9864MaqAncA ;
   private short[] T015L23_A9865Cod_parX ;
   private String[] T015L24_A407EmprNom ;
   private boolean[] T015L24_n407EmprNom ;
   private String[] T015L25_A279CliNom ;
   private String[] T015L26_A69ArtDsc ;
   private boolean[] T015L26_n69ArtDsc ;
   private String[] T015L27_A759ProDsc ;
   private String[] T015L28_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpfsmac__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpfsmac__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpfsmac__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpfsmac__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpfsmac__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T015L2", "SELECT CliCod, ArtCod, ProCod, FasCodM, MaqCodC, MaqAncA, Cod_parX, ParValX, ParObsX, Itm_ord4, EmprCod FROM TXPPFSMAC WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ? AND MaqAncA = ? AND Cod_parX = ?  FOR UPDATE OF ParValX, ParObsX, Itm_ord4 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015L3", "SELECT CliCod, ArtCod, ProCod, FasCodM, MaqCodC, MaqAncA, Cod_parX, ParValX, ParObsX, Itm_ord4, EmprCod FROM TXPPFSMAC WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ? AND MaqAncA = ? AND Cod_parX = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015L4", "SELECT MaqAncA, EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC FROM TXPPFSMQA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ? AND MaqAncA = ?  FOR UPDATE OF MaqAncA NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015L5", "SELECT MaqAncA, EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC FROM TXPPFSMQA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ? AND MaqAncA = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015L6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015L7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015L8", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015L9", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015L10", "SELECT EmprCod FROM TXPCAPFM1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015L11", "SELECT /*+ FIRST_ROWS(100) */ TM1.MaqAncA, T2.EmprNom, T3.CliNom, T4.ArtDsc, T5.ProDsc, TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.ProCod, TM1.FasCodM, TM1.MaqCodC FROM ((((TXPPFSMQA TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.ArtCod = TM1.ArtCod) INNER JOIN TXPPROCES T5 ON T5.EmprCod = TM1.EmprCod AND T5.ProCod = TM1.ProCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? and TM1.ProCod = ? and TM1.FasCodM = ? and TM1.MaqCodC = ? and TM1.MaqAncA = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.ProCod, TM1.FasCodM, TM1.MaqCodC, TM1.MaqAncA ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015L12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, MaqAncA FROM TXPPFSMQA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ? AND MaqAncA = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015L13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, MaqAncA FROM TXPPFSMQA WHERE ( MaqAncA > ?) and EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ? and MaqCodC = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, MaqAncA) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015L14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, MaqAncA FROM TXPPFSMQA WHERE ( MaqAncA < ?) and EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ? and MaqCodC = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC, ProCod DESC, FasCodM DESC, MaqCodC DESC, MaqAncA DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T015L15", "INSERT INTO TXPPFSMQA(MaqAncA, EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPFSMQA")
         ,new UpdateCursor("T015L16", "DELETE FROM TXPPFSMQA  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ? AND MaqAncA = ?", GX_NOMASK, "TXPPFSMQA")
         ,new ForEachCursor("T015L17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, MaqAncA FROM TXPPFSMQA WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ? and MaqCodC = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, MaqAncA ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015L18", "SELECT CliCod, ArtCod, ProCod, FasCodM, MaqCodC, MaqAncA, Cod_parX, ParValX, ParObsX, Itm_ord4, EmprCod FROM TXPPFSMAC WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ? and MaqCodC = ? and MaqAncA = ? and Cod_parX = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, MaqAncA, Cod_parX ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015L19", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, MaqAncA, Cod_parX FROM TXPPFSMAC WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ? AND MaqAncA = ? AND Cod_parX = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T015L20", "INSERT INTO TXPPFSMAC(CliCod, ArtCod, ProCod, FasCodM, MaqCodC, MaqAncA, Cod_parX, ParValX, ParObsX, Itm_ord4, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPFSMAC")
         ,new UpdateCursor("T015L21", "UPDATE TXPPFSMAC SET ParValX=?, ParObsX=?, Itm_ord4=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ? AND MaqAncA = ? AND Cod_parX = ?", GX_NOMASK, "TXPPFSMAC")
         ,new UpdateCursor("T015L22", "DELETE FROM TXPPFSMAC  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ? AND MaqAncA = ? AND Cod_parX = ?", GX_NOMASK, "TXPPFSMAC")
         ,new ForEachCursor("T015L23", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, MaqAncA, Cod_parX FROM TXPPFSMAC WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ? and MaqCodC = ? and MaqAncA = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, MaqAncA, Cod_parX ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015L24", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015L25", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015L26", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015L27", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015L28", "SELECT EmprCod FROM TXPCAPFM1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 40);
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               ((String[]) buf[12])[0] = rslt.getString(11, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 26 :
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
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 12 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 13 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 8);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[10], 400);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[12]).shortValue());
               }
               stmt.setString(11, (String)parms[13], 3);
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 400);
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
               stmt.setString(6, (String)parms[8], 16);
               stmt.setString(7, (String)parms[9], 8);
               stmt.setString(8, (String)parms[10], 8);
               stmt.setString(9, (String)parms[11], 6);
               stmt.setShort(10, ((Number) parms[12]).shortValue());
               stmt.setShort(11, ((Number) parms[13]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               return;
      }
   }

}

