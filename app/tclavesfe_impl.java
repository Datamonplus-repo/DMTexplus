package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tclavesfe_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"CLAVEPRDDS") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11714ClavePrd = httpContext.GetPar( "ClavePrd") ;
         n11714ClavePrd = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asaclaveprdds1HC1637( A396EmprCod, A11714ClavePrd) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A2144UniEstCod = httpContext.GetPar( "UniEstCod") ;
         n2144UniEstCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A2144UniEstCod) ;
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
            A2141SerEst = httpContext.GetPar( "SerEst") ;
            httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
            A1013DibCli = httpContext.GetPar( "DibCli") ;
            httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
            A1014DibInt = (int)(GXutil.lval( httpContext.GetPar( "DibInt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            A2074ColCom = httpContext.GetPar( "ColCom") ;
            httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
            A2078ColFon = httpContext.GetPar( "ColFon") ;
            httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Claves Formulas Estampacion", ""), (short)(0)) ;
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
      A11717ClaveIdUlt = (short)(GXutil.lval( httpContext.GetPar( "ClaveIdUlt"))) ;
      n11717ClaveIdUlt = false ;
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

   public tclavesfe_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tclavesfe_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tclavesfe_impl.class ));
   }

   public tclavesfe_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLAVESFE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLAVESFE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLAVESFE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLAVESFE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCLAVESFE.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLAVESFE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLAVESFE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLAVESFE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLAVESFE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLAVESFE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSerEst_Internalname, GXutil.rtrim( A2141SerEst), GXutil.rtrim( localUtil.format( A2141SerEst, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSerEst_Jsonclick, 0, "", "", "", "", "", 1, edtSerEst_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLAVESFE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Dibujo del Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLAVESFE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibCli_Internalname, GXutil.rtrim( A1013DibCli), GXutil.rtrim( localUtil.format( A1013DibCli, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibCli_Jsonclick, 0, "", "", "", "", "", 1, edtDibCli_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLAVESFE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Dibujo Interno", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLAVESFE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibInt_Internalname, GXutil.ltrim( localUtil.ntoc( A1014DibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDibInt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibInt_Jsonclick, 0, "", "", "", "", "", 1, edtDibInt_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLAVESFE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Combinacion", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLAVESFE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtColCom_Internalname, GXutil.rtrim( A2074ColCom), GXutil.rtrim( localUtil.format( A2074ColCom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColCom_Jsonclick, 0, "", "", "", "", "", 1, edtColCom_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLAVESFE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Fondo", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLAVESFE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtColFon_Internalname, GXutil.rtrim( A2078ColFon), GXutil.rtrim( localUtil.format( A2078ColFon, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColFon_Jsonclick, 0, "", "", "", "", "", 1, edtColFon_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLAVESFE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLAVESFE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLAVESFE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLAVESFE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Ultima Linea Clave", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLAVESFE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtClaveIdUlt_Internalname, GXutil.ltrim( localUtil.ntoc( A11717ClaveIdUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtClaveIdUlt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11717ClaveIdUlt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11717ClaveIdUlt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClaveIdUlt_Jsonclick, 0, "", "", "", "", "", 1, edtClaveIdUlt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLAVESFE.htm");
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
         nBlankRcdCount1637 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1637 = (short)(1) ;
            scanStart1HC1637( ) ;
            while ( RcdFound1637 != 0 )
            {
               init_level_properties1637( ) ;
               getByPrimaryKey1HC1637( ) ;
               addRow1HC1637( ) ;
               scanNext1HC1637( ) ;
            }
            scanEnd1HC1637( ) ;
            nBlankRcdCount1637 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B11717ClaveIdUlt = A11717ClaveIdUlt ;
         n11717ClaveIdUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
         standaloneNotModal1HC1637( ) ;
         standaloneModal1HC1637( ) ;
         sMode1637 = Gx_mode ;
         while ( nGXsfl_65_idx < nRC_GXsfl_65 )
         {
            bGXsfl_65_Refreshing = true ;
            readRow1HC1637( ) ;
            edtavnRcdDeleted_1637_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1637_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1637_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1637_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtClaveID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLAVEID_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtClaveID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClaveID_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtClavePrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLAVEPRD_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtClavePrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClavePrd_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtClavePrdDs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLAVEPRDDS_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtClavePrdDs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClavePrdDs_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtClaveCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLAVECANT_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtClaveCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClaveCant_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtUniEstCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UNIESTCOD_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtUniEstCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUniEstCod_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtClaveDs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLAVEDS_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtClaveDs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClaveDs_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            if ( ( nRcdExists_1637 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1HC1637( ) ;
            }
            sendRow1HC1637( ) ;
            bGXsfl_65_Refreshing = false ;
         }
         Gx_mode = sMode1637 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A11717ClaveIdUlt = B11717ClaveIdUlt ;
         n11717ClaveIdUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1637 = (short)(5) ;
         nRcdExists_1637 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1HC1637( ) ;
            while ( RcdFound1637 != 0 )
            {
               sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_651637( ) ;
               init_level_properties1637( ) ;
               standaloneNotModal1HC1637( ) ;
               getByPrimaryKey1HC1637( ) ;
               standaloneModal1HC1637( ) ;
               addRow1HC1637( ) ;
               scanNext1HC1637( ) ;
            }
            scanEnd1HC1637( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1637 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_651637( ) ;
      initAll1HC1637( ) ;
      init_level_properties1637( ) ;
      B11717ClaveIdUlt = A11717ClaveIdUlt ;
      n11717ClaveIdUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
      nRcdExists_1637 = (short)(0) ;
      nIsMod_1637 = (short)(0) ;
      nRcdDeleted_1637 = (short)(0) ;
      nBlankRcdCount1637 = (short)(nBlankRcdUsr1637+nBlankRcdCount1637) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1637 > 0 )
      {
         standaloneNotModal1HC1637( ) ;
         standaloneModal1HC1637( ) ;
         addRow1HC1637( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtClaveID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1637 = (short)(nBlankRcdCount1637-1) ;
      }
      Gx_mode = sMode1637 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A11717ClaveIdUlt = B11717ClaveIdUlt ;
      n11717ClaveIdUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLAVESFE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLAVESFE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLAVESFE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLAVESFE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCLAVESFE.htm");
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
      e111HC2 ();
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
            Z2141SerEst = httpContext.cgiGet( "Z2141SerEst") ;
            Z1013DibCli = httpContext.cgiGet( "Z1013DibCli") ;
            Z1014DibInt = (int)(localUtil.ctol( httpContext.cgiGet( "Z1014DibInt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2074ColCom = httpContext.cgiGet( "Z2074ColCom") ;
            Z2078ColFon = httpContext.cgiGet( "Z2078ColFon") ;
            Z11717ClaveIdUlt = (short)(localUtil.ctol( httpContext.cgiGet( "Z11717ClaveIdUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O11717ClaveIdUlt = (short)(localUtil.ctol( httpContext.cgiGet( "O11717ClaveIdUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_65 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_65"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A2141SerEst = httpContext.cgiGet( edtSerEst_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
            A1013DibCli = httpContext.cgiGet( edtDibCli_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
            A1014DibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            A2074ColCom = httpContext.cgiGet( edtColCom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
            A2078ColFon = httpContext.cgiGet( edtColFon_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A11717ClaveIdUlt = (short)(localUtil.ctol( httpContext.cgiGet( edtClaveIdUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11717ClaveIdUlt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
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
               A2141SerEst = httpContext.GetPar( "SerEst") ;
               httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
               A1013DibCli = httpContext.GetPar( "DibCli") ;
               httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
               A1014DibInt = (int)(GXutil.lval( httpContext.GetPar( "DibInt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
               A2074ColCom = httpContext.GetPar( "ColCom") ;
               httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
               A2078ColFon = httpContext.GetPar( "ColFon") ;
               httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
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
                        e111HC2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'CREAR CLAVE'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Crear Clave' */
                        e121HC2 ();
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
            initAll1HC556( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1637_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1637_Enabled), 5, 0), !bGXsfl_65_Refreshing);
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
      disableAttributes1HC556( ) ;
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

   public void confirm_1HC0( )
   {
      beforeValidate1HC556( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1HC556( ) ;
         }
         else
         {
            checkExtendedTable1HC556( ) ;
            if ( AnyError == 0 )
            {
               zm1HC556( 11) ;
               zm1HC556( 12) ;
            }
            closeExtendedTableCursors1HC556( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode556 = Gx_mode ;
         confirm_1HC1637( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode556 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode556 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1HC0( ) ;
      }
   }

   public void confirm_1HC1637( )
   {
      s11717ClaveIdUlt = O11717ClaveIdUlt ;
      n11717ClaveIdUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRow1HC1637( ) ;
         if ( ( nRcdExists_1637 != 0 ) || ( nIsMod_1637 != 0 ) )
         {
            getKey1HC1637( ) ;
            if ( ( nRcdExists_1637 == 0 ) && ( nRcdDeleted_1637 == 0 ) )
            {
               if ( RcdFound1637 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1HC1637( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1HC1637( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1HC1637( 14) ;
                     }
                     closeExtendedTableCursors1HC1637( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O11717ClaveIdUlt = A11717ClaveIdUlt ;
                     n11717ClaveIdUlt = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "CLAVEID_" + sGXsfl_65_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtClaveID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1637 != 0 )
               {
                  if ( nRcdDeleted_1637 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1HC1637( ) ;
                     load1HC1637( ) ;
                     beforeValidate1HC1637( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1HC1637( ) ;
                        O11717ClaveIdUlt = A11717ClaveIdUlt ;
                        n11717ClaveIdUlt = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1637 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1HC1637( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1HC1637( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1HC1637( 14) ;
                           }
                           closeExtendedTableCursors1HC1637( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O11717ClaveIdUlt = A11717ClaveIdUlt ;
                           n11717ClaveIdUlt = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1637 == 0 )
                  {
                     GXCCtl = "CLAVEID_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtClaveID_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1637_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1637, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtClaveID_Internalname, GXutil.ltrim( localUtil.ntoc( A11712ClaveID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtClavePrd_Internalname, GXutil.rtrim( A11714ClavePrd)) ;
         httpContext.changePostValue( edtClavePrdDs_Internalname, GXutil.rtrim( A11715ClavePrdDs)) ;
         httpContext.changePostValue( edtClaveCant_Internalname, GXutil.ltrim( localUtil.ntoc( A11716ClaveCant, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtUniEstCod_Internalname, GXutil.rtrim( A2144UniEstCod)) ;
         httpContext.changePostValue( edtClaveDs_Internalname, GXutil.rtrim( A11713ClaveDs)) ;
         httpContext.changePostValue( "ZT_"+"Z11712ClaveID_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z11712ClaveID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11714ClavePrd_"+sGXsfl_65_idx, GXutil.rtrim( Z11714ClavePrd)) ;
         httpContext.changePostValue( "ZT_"+"Z11716ClaveCant_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z11716ClaveCant, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11713ClaveDs_"+sGXsfl_65_idx, GXutil.rtrim( Z11713ClaveDs)) ;
         httpContext.changePostValue( "ZT_"+"Z2144UniEstCod_"+sGXsfl_65_idx, GXutil.rtrim( Z2144UniEstCod)) ;
         httpContext.changePostValue( "nRcdDeleted_1637_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1637, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1637_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1637, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1637_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1637, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1637 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1637_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1637_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLAVEID_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClaveID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLAVEPRD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClavePrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLAVEPRDDS_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClavePrdDs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLAVECANT_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClaveCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UNIESTCOD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUniEstCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLAVEDS_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClaveDs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O11717ClaveIdUlt = s11717ClaveIdUlt ;
      n11717ClaveIdUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1HC0( )
   {
   }

   public void e111HC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tclavesfe_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV34Pgmname, (byte)(99), GXv_char2) ;
      tclavesfe_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tclavesfe_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tclavesfe_impl.this.A396EmprCod = GXv_char2[0] ;
      tclavesfe_impl.this.AV11EmprNom = GXv_char3[0] ;
      tclavesfe_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e121HC2( )
   {
      /* 'Crear Clave' Routine */
      returnInSub = false ;
      if ( ( A11712ClaveID > 0 ) && ( GXutil.strcmp(A11714ClavePrd, " ") != 0 ) && ( GXutil.strcmp(A11715ClavePrdDs, httpContext.getMessage( "Error", "")) != 0 ) )
      {
      }
      /*  Sending Event outputs  */
   }

   public void zm1HC556( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11717ClaveIdUlt = T01HC6_A11717ClaveIdUlt[0] ;
         }
         else
         {
            Z11717ClaveIdUlt = A11717ClaveIdUlt ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z2141SerEst = A2141SerEst ;
         Z2074ColCom = A2074ColCom ;
         Z2078ColFon = A2078ColFon ;
         Z11717ClaveIdUlt = A11717ClaveIdUlt ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z1013DibCli = A1013DibCli ;
         Z1014DibInt = A1014DibInt ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtClaveIdUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClaveIdUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClaveIdUlt_Enabled), 5, 0), true);
      AV34Pgmname = "TCLAVESFE" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtClaveIdUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClaveIdUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClaveIdUlt_Enabled), 5, 0), true);
      /* Using cursor T01HC7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01HC7_A407EmprNom[0] ;
      n407EmprNom = T01HC7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T01HC8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDIBUJ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DIBINT");
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

   public void load1HC556( )
   {
      /* Using cursor T01HC9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound556 = (short)(1) ;
         A407EmprNom = T01HC9_A407EmprNom[0] ;
         n407EmprNom = T01HC9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A11717ClaveIdUlt = T01HC9_A11717ClaveIdUlt[0] ;
         n11717ClaveIdUlt = T01HC9_n11717ClaveIdUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
         zm1HC556( -10) ;
      }
      pr_default.close(7);
      onLoadActions1HC556( ) ;
   }

   public void onLoadActions1HC556( )
   {
   }

   public void checkExtendedTable1HC556( )
   {
      nIsDirty_556 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1HC556( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1HC556( )
   {
      /* Using cursor T01HC10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound556 = (short)(1) ;
      }
      else
      {
         RcdFound556 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01HC6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01HC6_A2141SerEst[0], A2141SerEst) == 0 ) && ( GXutil.strcmp(T01HC6_A2074ColCom[0], A2074ColCom) == 0 ) && ( GXutil.strcmp(T01HC6_A2078ColFon[0], A2078ColFon) == 0 ) && ( GXutil.strcmp(T01HC6_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HC6_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01HC6_A1013DibCli[0], A1013DibCli) == 0 ) && ( T01HC6_A1014DibInt[0] == A1014DibInt ) )
      {
         zm1HC556( 10) ;
         RcdFound556 = (short)(1) ;
         A11717ClaveIdUlt = T01HC6_A11717ClaveIdUlt[0] ;
         n11717ClaveIdUlt = T01HC6_n11717ClaveIdUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
         O11717ClaveIdUlt = A11717ClaveIdUlt ;
         n11717ClaveIdUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z2141SerEst = A2141SerEst ;
         Z1013DibCli = A1013DibCli ;
         Z1014DibInt = A1014DibInt ;
         Z2074ColCom = A2074ColCom ;
         Z2078ColFon = A2078ColFon ;
         sMode556 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1HC556( ) ;
         if ( AnyError == 1 )
         {
            RcdFound556 = (short)(0) ;
            initializeNonKey1HC556( ) ;
         }
         Gx_mode = sMode556 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound556 = (short)(0) ;
         initializeNonKey1HC556( ) ;
         sMode556 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode556 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1HC556( ) ;
      if ( RcdFound556 == 0 )
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
      RcdFound556 = (short)(0) ;
      /* Using cursor T01HC11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01HC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HC11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01HC11_A2141SerEst[0], A2141SerEst) == 0 ) && ( GXutil.strcmp(T01HC11_A1013DibCli[0], A1013DibCli) == 0 ) && ( T01HC11_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01HC11_A2074ColCom[0], A2074ColCom) == 0 ) && ( GXutil.strcmp(T01HC11_A2078ColFon[0], A2078ColFon) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01HC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HC11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01HC11_A2141SerEst[0], A2141SerEst) == 0 ) && ( GXutil.strcmp(T01HC11_A1013DibCli[0], A1013DibCli) == 0 ) && ( T01HC11_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01HC11_A2074ColCom[0], A2074ColCom) == 0 ) && ( GXutil.strcmp(T01HC11_A2078ColFon[0], A2078ColFon) == 0 ) )
         {
            RcdFound556 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound556 = (short)(0) ;
      /* Using cursor T01HC12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01HC12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HC12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01HC12_A2141SerEst[0], A2141SerEst) == 0 ) && ( GXutil.strcmp(T01HC12_A1013DibCli[0], A1013DibCli) == 0 ) && ( T01HC12_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01HC12_A2074ColCom[0], A2074ColCom) == 0 ) && ( GXutil.strcmp(T01HC12_A2078ColFon[0], A2078ColFon) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01HC12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HC12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01HC12_A2141SerEst[0], A2141SerEst) == 0 ) && ( GXutil.strcmp(T01HC12_A1013DibCli[0], A1013DibCli) == 0 ) && ( T01HC12_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01HC12_A2074ColCom[0], A2074ColCom) == 0 ) && ( GXutil.strcmp(T01HC12_A2078ColFon[0], A2078ColFon) == 0 ) )
         {
            RcdFound556 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1HC556( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A11717ClaveIdUlt = O11717ClaveIdUlt ;
         n11717ClaveIdUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
         insert1HC556( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound556 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A2141SerEst, Z2141SerEst) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A1014DibInt != Z1014DibInt ) || ( GXutil.strcmp(A2074ColCom, Z2074ColCom) != 0 ) || ( GXutil.strcmp(A2078ColFon, Z2078ColFon) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A11717ClaveIdUlt = O11717ClaveIdUlt ;
               n11717ClaveIdUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A11717ClaveIdUlt = O11717ClaveIdUlt ;
               n11717ClaveIdUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
               update1HC556( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A2141SerEst, Z2141SerEst) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A1014DibInt != Z1014DibInt ) || ( GXutil.strcmp(A2074ColCom, Z2074ColCom) != 0 ) || ( GXutil.strcmp(A2078ColFon, Z2078ColFon) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A11717ClaveIdUlt = O11717ClaveIdUlt ;
               n11717ClaveIdUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
               insert1HC556( ) ;
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
                  A11717ClaveIdUlt = O11717ClaveIdUlt ;
                  n11717ClaveIdUlt = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
                  insert1HC556( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A2141SerEst, Z2141SerEst) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A1014DibInt != Z1014DibInt ) || ( GXutil.strcmp(A2074ColCom, Z2074ColCom) != 0 ) || ( GXutil.strcmp(A2078ColFon, Z2078ColFon) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A11717ClaveIdUlt = O11717ClaveIdUlt ;
         n11717ClaveIdUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
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
      getKey1HC556( ) ;
      if ( RcdFound556 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A2141SerEst, Z2141SerEst) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A1014DibInt != Z1014DibInt ) || ( GXutil.strcmp(A2074ColCom, Z2074ColCom) != 0 ) || ( GXutil.strcmp(A2078ColFon, Z2078ColFon) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A2141SerEst, Z2141SerEst) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A1014DibInt != Z1014DibInt ) || ( GXutil.strcmp(A2074ColCom, Z2074ColCom) != 0 ) || ( GXutil.strcmp(A2078ColFon, Z2078ColFon) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tclavesfe");
   }

   public void insert_check( )
   {
      confirm_1HC0( ) ;
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
      if ( RcdFound556 == 0 )
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
      scanStart1HC556( ) ;
      if ( RcdFound556 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1HC556( ) ;
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
      if ( RcdFound556 == 0 )
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
      if ( RcdFound556 == 0 )
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
      scanStart1HC556( ) ;
      if ( RcdFound556 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound556 != 0 )
         {
            scanNext1HC556( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1HC556( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1HC556( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01HC5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCFORES"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z11717ClaveIdUlt != T01HC5_A11717ClaveIdUlt[0] ) )
         {
            if ( Z11717ClaveIdUlt != T01HC5_A11717ClaveIdUlt[0] )
            {
               GXutil.writeLogln("tclavesfe:[seudo value changed for attri]"+"ClaveIdUlt");
               GXutil.writeLogRaw("Old: ",Z11717ClaveIdUlt);
               GXutil.writeLogRaw("Current: ",T01HC5_A11717ClaveIdUlt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCFORES"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1HC556( )
   {
      beforeValidate1HC556( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HC556( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1HC556( 0) ;
         checkOptimisticConcurrency1HC556( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HC556( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1HC556( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HC13 */
                  pr_default.execute(11, new Object[] {A2141SerEst, A2074ColCom, A2078ColFon, Boolean.valueOf(n11717ClaveIdUlt), Short.valueOf(A11717ClaveIdUlt), A396EmprCod, Integer.valueOf(A252CliCod), A1013DibCli, Integer.valueOf(A1014DibInt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORES");
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
                        processLevel1HC556( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1HC0( ) ;
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
            load1HC556( ) ;
         }
         endLevel1HC556( ) ;
      }
      closeExtendedTableCursors1HC556( ) ;
   }

   public void update1HC556( )
   {
      beforeValidate1HC556( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HC556( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HC556( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HC556( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1HC556( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HC14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n11717ClaveIdUlt), Short.valueOf(A11717ClaveIdUlt), A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORES");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCFORES"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1HC556( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1HC556( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1HC0( ) ;
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
         endLevel1HC556( ) ;
      }
      closeExtendedTableCursors1HC556( ) ;
   }

   public void deferredUpdate1HC556( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1HC556( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HC556( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1HC556( ) ;
         afterConfirm1HC556( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1HC556( ) ;
            if ( AnyError == 0 )
            {
               A11717ClaveIdUlt = O11717ClaveIdUlt ;
               n11717ClaveIdUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
               scanStart1HC1637( ) ;
               while ( RcdFound1637 != 0 )
               {
                  getByPrimaryKey1HC1637( ) ;
                  delete1HC1637( ) ;
                  scanNext1HC1637( ) ;
                  O11717ClaveIdUlt = A11717ClaveIdUlt ;
                  n11717ClaveIdUlt = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
               }
               scanEnd1HC1637( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HC15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORES");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound556 == 0 )
                        {
                           initAll1HC556( ) ;
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
                        resetCaption1HC0( ) ;
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
      sMode556 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1HC556( ) ;
      Gx_mode = sMode556 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1HC556( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01HC16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FOROBS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01HC17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MFORES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void processNestedLevel1HC1637( )
   {
      s11717ClaveIdUlt = O11717ClaveIdUlt ;
      n11717ClaveIdUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRow1HC1637( ) ;
         if ( ( nRcdExists_1637 != 0 ) || ( nIsMod_1637 != 0 ) )
         {
            standaloneNotModal1HC1637( ) ;
            getKey1HC1637( ) ;
            if ( ( nRcdExists_1637 == 0 ) && ( nRcdDeleted_1637 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1HC1637( ) ;
            }
            else
            {
               if ( RcdFound1637 != 0 )
               {
                  if ( ( nRcdDeleted_1637 != 0 ) && ( nRcdExists_1637 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1HC1637( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1637 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1HC1637( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1637 == 0 )
                  {
                     GXCCtl = "CLAVEID_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtClaveID_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O11717ClaveIdUlt = A11717ClaveIdUlt ;
            n11717ClaveIdUlt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1637_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1637, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtClaveID_Internalname, GXutil.ltrim( localUtil.ntoc( A11712ClaveID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtClavePrd_Internalname, GXutil.rtrim( A11714ClavePrd)) ;
         httpContext.changePostValue( edtClavePrdDs_Internalname, GXutil.rtrim( A11715ClavePrdDs)) ;
         httpContext.changePostValue( edtClaveCant_Internalname, GXutil.ltrim( localUtil.ntoc( A11716ClaveCant, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtUniEstCod_Internalname, GXutil.rtrim( A2144UniEstCod)) ;
         httpContext.changePostValue( edtClaveDs_Internalname, GXutil.rtrim( A11713ClaveDs)) ;
         httpContext.changePostValue( "ZT_"+"Z11712ClaveID_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z11712ClaveID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11714ClavePrd_"+sGXsfl_65_idx, GXutil.rtrim( Z11714ClavePrd)) ;
         httpContext.changePostValue( "ZT_"+"Z11716ClaveCant_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z11716ClaveCant, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11713ClaveDs_"+sGXsfl_65_idx, GXutil.rtrim( Z11713ClaveDs)) ;
         httpContext.changePostValue( "ZT_"+"Z2144UniEstCod_"+sGXsfl_65_idx, GXutil.rtrim( Z2144UniEstCod)) ;
         httpContext.changePostValue( "nRcdDeleted_1637_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1637, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1637_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1637, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1637_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1637, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1637 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1637_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1637_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLAVEID_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClaveID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLAVEPRD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClavePrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLAVEPRDDS_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClavePrdDs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLAVECANT_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClaveCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UNIESTCOD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUniEstCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLAVEDS_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClaveDs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1HC1637( ) ;
      if ( AnyError != 0 )
      {
         O11717ClaveIdUlt = s11717ClaveIdUlt ;
         n11717ClaveIdUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
      }
      nRcdExists_1637 = (short)(0) ;
      nIsMod_1637 = (short)(0) ;
      nRcdDeleted_1637 = (short)(0) ;
   }

   public void processLevel1HC556( )
   {
      /* Save parent mode. */
      sMode556 = Gx_mode ;
      processNestedLevel1HC1637( ) ;
      if ( AnyError != 0 )
      {
         O11717ClaveIdUlt = s11717ClaveIdUlt ;
         n11717ClaveIdUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode556 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01HC18 */
      pr_default.execute(16, new Object[] {Boolean.valueOf(n11717ClaveIdUlt), Short.valueOf(A11717ClaveIdUlt), A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORES");
   }

   public void endLevel1HC556( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeComplete1HC556( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tclavesfe");
         if ( AnyError == 0 )
         {
            confirmValues1HC0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tclavesfe");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1HC556( )
   {
      /* Scan By routine */
      /* Using cursor T01HC19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
      RcdFound556 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound556 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1HC556( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound556 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound556 = (short)(1) ;
      }
   }

   public void scanEnd1HC556( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1HC556( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1HC556( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1HC556( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1HC556( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1HC556( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1HC556( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1HC556( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtSerEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSerEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSerEst_Enabled), 5, 0), true);
      edtDibCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCli_Enabled), 5, 0), true);
      edtDibInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibInt_Enabled), 5, 0), true);
      edtColCom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColCom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColCom_Enabled), 5, 0), true);
      edtColFon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColFon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColFon_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtClaveIdUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClaveIdUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClaveIdUlt_Enabled), 5, 0), true);
   }

   public void zm1HC1637( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11714ClavePrd = T01HC3_A11714ClavePrd[0] ;
            Z11716ClaveCant = T01HC3_A11716ClaveCant[0] ;
            Z11713ClaveDs = T01HC3_A11713ClaveDs[0] ;
            Z2144UniEstCod = T01HC3_A2144UniEstCod[0] ;
         }
         else
         {
            Z11714ClavePrd = A11714ClavePrd ;
            Z11716ClaveCant = A11716ClaveCant ;
            Z11713ClaveDs = A11713ClaveDs ;
            Z2144UniEstCod = A2144UniEstCod ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z252CliCod = A252CliCod ;
         Z2141SerEst = A2141SerEst ;
         Z1013DibCli = A1013DibCli ;
         Z1014DibInt = A1014DibInt ;
         Z2074ColCom = A2074ColCom ;
         Z2078ColFon = A2078ColFon ;
         Z11712ClaveID = A11712ClaveID ;
         Z11714ClavePrd = A11714ClavePrd ;
         Z11716ClaveCant = A11716ClaveCant ;
         Z11713ClaveDs = A11713ClaveDs ;
         Z2144UniEstCod = A2144UniEstCod ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1HC1637( )
   {
      edtClaveDs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClaveDs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClaveDs_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtClaveIdUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClaveIdUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClaveIdUlt_Enabled), 5, 0), true);
      edtClaveIdUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClaveIdUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClaveIdUlt_Enabled), 5, 0), true);
   }

   public void standaloneModal1HC1637( )
   {
      if ( isIns( )  )
      {
         A11717ClaveIdUlt = (short)(O11717ClaveIdUlt+1) ;
         n11717ClaveIdUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A11712ClaveID = A11717ClaveIdUlt ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtClaveID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtClaveID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClaveID_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      else
      {
         edtClaveID_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtClaveID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClaveID_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
   }

   public void load1HC1637( )
   {
      /* Using cursor T01HC20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Short.valueOf(A11712ClaveID)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1637 = (short)(1) ;
         A11714ClavePrd = T01HC20_A11714ClavePrd[0] ;
         n11714ClavePrd = T01HC20_n11714ClavePrd[0] ;
         A11716ClaveCant = T01HC20_A11716ClaveCant[0] ;
         n11716ClaveCant = T01HC20_n11716ClaveCant[0] ;
         A11713ClaveDs = T01HC20_A11713ClaveDs[0] ;
         n11713ClaveDs = T01HC20_n11713ClaveDs[0] ;
         A2144UniEstCod = T01HC20_A2144UniEstCod[0] ;
         n2144UniEstCod = T01HC20_n2144UniEstCod[0] ;
         zm1HC1637( -13) ;
      }
      pr_default.close(18);
      onLoadActions1HC1637( ) ;
   }

   public void onLoadActions1HC1637( )
   {
      GXt_char1 = A11715ClavePrdDs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A11714ClavePrd ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tclavesfe_impl.this.A396EmprCod = GXv_char4[0] ;
      tclavesfe_impl.this.A11714ClavePrd = GXv_char3[0] ;
      tclavesfe_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A11715ClavePrdDs = GXt_char1 ;
   }

   public void checkExtendedTable1HC1637( )
   {
      nIsDirty_1637 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1HC1637( ) ;
      nIsDirty_1637 = (short)(1) ;
      GXt_char1 = A11715ClavePrdDs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A11714ClavePrd ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tclavesfe_impl.this.A396EmprCod = GXv_char4[0] ;
      tclavesfe_impl.this.A11714ClavePrd = GXv_char3[0] ;
      tclavesfe_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A11715ClavePrdDs = GXt_char1 ;
      if ( ( GXutil.strcmp(A11715ClavePrdDs, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ && ( GXutil.strcmp(A11714ClavePrd, " ") != 0 ) )
      {
         GXCCtl = "CLAVEPRD_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Producto Inexistente", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtClavePrd_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(A11714ClavePrd, " ") == 0 ) && true /* After */ )
      {
         GXCCtl = "CLAVEPRD_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Producto Inexistente", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtClavePrd_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01HC4 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "UNIESTCOD_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIEST", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtUniEstCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1HC1637( )
   {
      pr_default.close(2);
   }

   public void enableDisable1HC1637( )
   {
   }

   public void gxload_14( String A2144UniEstCod )
   {
      /* Using cursor T01HC21 */
      pr_default.execute(19, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         GXCCtl = "UNIESTCOD_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIEST", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtUniEstCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void getKey1HC1637( )
   {
      /* Using cursor T01HC22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Short.valueOf(A11712ClaveID)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1637 = (short)(1) ;
      }
      else
      {
         RcdFound1637 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey1HC1637( )
   {
      /* Using cursor T01HC3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Short.valueOf(A11712ClaveID)});
      if ( (pr_default.getStatus(1) != 101) && ( T01HC3_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01HC3_A2141SerEst[0], A2141SerEst) == 0 ) && ( GXutil.strcmp(T01HC3_A1013DibCli[0], A1013DibCli) == 0 ) && ( T01HC3_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01HC3_A2074ColCom[0], A2074ColCom) == 0 ) && ( GXutil.strcmp(T01HC3_A2078ColFon[0], A2078ColFon) == 0 ) && ( GXutil.strcmp(T01HC3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1HC1637( 13) ;
         RcdFound1637 = (short)(1) ;
         initializeNonKey1HC1637( ) ;
         A11712ClaveID = T01HC3_A11712ClaveID[0] ;
         A11714ClavePrd = T01HC3_A11714ClavePrd[0] ;
         n11714ClavePrd = T01HC3_n11714ClavePrd[0] ;
         A11716ClaveCant = T01HC3_A11716ClaveCant[0] ;
         n11716ClaveCant = T01HC3_n11716ClaveCant[0] ;
         A11713ClaveDs = T01HC3_A11713ClaveDs[0] ;
         n11713ClaveDs = T01HC3_n11713ClaveDs[0] ;
         A2144UniEstCod = T01HC3_A2144UniEstCod[0] ;
         n2144UniEstCod = T01HC3_n2144UniEstCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z2141SerEst = A2141SerEst ;
         Z1013DibCli = A1013DibCli ;
         Z1014DibInt = A1014DibInt ;
         Z2074ColCom = A2074ColCom ;
         Z2078ColFon = A2078ColFon ;
         Z11712ClaveID = A11712ClaveID ;
         sMode1637 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1HC1637( ) ;
         load1HC1637( ) ;
         Gx_mode = sMode1637 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1637 = (short)(0) ;
         initializeNonKey1HC1637( ) ;
         sMode1637 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1HC1637( ) ;
         Gx_mode = sMode1637 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1HC1637( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1HC1637( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01HC2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Short.valueOf(A11712ClaveID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPClaves"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z11714ClavePrd, T01HC2_A11714ClavePrd[0]) != 0 ) || ( DecimalUtil.compareTo(Z11716ClaveCant, T01HC2_A11716ClaveCant[0]) != 0 ) || ( GXutil.strcmp(Z11713ClaveDs, T01HC2_A11713ClaveDs[0]) != 0 ) || ( GXutil.strcmp(Z2144UniEstCod, T01HC2_A2144UniEstCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z11714ClavePrd, T01HC2_A11714ClavePrd[0]) != 0 )
            {
               GXutil.writeLogln("tclavesfe:[seudo value changed for attri]"+"ClavePrd");
               GXutil.writeLogRaw("Old: ",Z11714ClavePrd);
               GXutil.writeLogRaw("Current: ",T01HC2_A11714ClavePrd[0]);
            }
            if ( DecimalUtil.compareTo(Z11716ClaveCant, T01HC2_A11716ClaveCant[0]) != 0 )
            {
               GXutil.writeLogln("tclavesfe:[seudo value changed for attri]"+"ClaveCant");
               GXutil.writeLogRaw("Old: ",Z11716ClaveCant);
               GXutil.writeLogRaw("Current: ",T01HC2_A11716ClaveCant[0]);
            }
            if ( GXutil.strcmp(Z11713ClaveDs, T01HC2_A11713ClaveDs[0]) != 0 )
            {
               GXutil.writeLogln("tclavesfe:[seudo value changed for attri]"+"ClaveDs");
               GXutil.writeLogRaw("Old: ",Z11713ClaveDs);
               GXutil.writeLogRaw("Current: ",T01HC2_A11713ClaveDs[0]);
            }
            if ( GXutil.strcmp(Z2144UniEstCod, T01HC2_A2144UniEstCod[0]) != 0 )
            {
               GXutil.writeLogln("tclavesfe:[seudo value changed for attri]"+"UniEstCod");
               GXutil.writeLogRaw("Old: ",Z2144UniEstCod);
               GXutil.writeLogRaw("Current: ",T01HC2_A2144UniEstCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPClaves"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1HC1637( )
   {
      beforeValidate1HC1637( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HC1637( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1HC1637( 0) ;
         checkOptimisticConcurrency1HC1637( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HC1637( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1HC1637( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HC23 */
                  pr_default.execute(21, new Object[] {Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Short.valueOf(A11712ClaveID), Boolean.valueOf(n11714ClavePrd), A11714ClavePrd, Boolean.valueOf(n11716ClaveCant), A11716ClaveCant, Boolean.valueOf(n11713ClaveDs), A11713ClaveDs, Boolean.valueOf(n2144UniEstCod), A2144UniEstCod, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPClaves");
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
            load1HC1637( ) ;
         }
         endLevel1HC1637( ) ;
      }
      closeExtendedTableCursors1HC1637( ) ;
   }

   public void update1HC1637( )
   {
      beforeValidate1HC1637( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HC1637( ) ;
      }
      if ( ( nIsMod_1637 != 0 ) || ( nIsDirty_1637 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1HC1637( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1HC1637( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1HC1637( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01HC24 */
                     pr_default.execute(22, new Object[] {Boolean.valueOf(n11714ClavePrd), A11714ClavePrd, Boolean.valueOf(n11716ClaveCant), A11716ClaveCant, Boolean.valueOf(n11713ClaveDs), A11713ClaveDs, Boolean.valueOf(n2144UniEstCod), A2144UniEstCod, A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Short.valueOf(A11712ClaveID)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPClaves");
                     if ( (pr_default.getStatus(22) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPClaves"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1HC1637( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1HC1637( ) ;
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
            endLevel1HC1637( ) ;
         }
      }
      closeExtendedTableCursors1HC1637( ) ;
   }

   public void deferredUpdate1HC1637( )
   {
   }

   public void delete1HC1637( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1HC1637( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HC1637( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1HC1637( ) ;
         afterConfirm1HC1637( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1HC1637( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01HC25 */
               pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Short.valueOf(A11712ClaveID)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPClaves");
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
      sMode1637 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1HC1637( ) ;
      Gx_mode = sMode1637 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1HC1637( )
   {
      standaloneModal1HC1637( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A11715ClavePrdDs ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A11714ClavePrd ;
         GXv_char2[0] = GXt_char1 ;
         new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         tclavesfe_impl.this.A396EmprCod = GXv_char4[0] ;
         tclavesfe_impl.this.A11714ClavePrd = GXv_char3[0] ;
         tclavesfe_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11715ClavePrdDs = GXt_char1 ;
      }
   }

   public void endLevel1HC1637( )
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

   public void scanStart1HC1637( )
   {
      /* Scan By routine */
      /* Using cursor T01HC26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
      RcdFound1637 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1637 = (short)(1) ;
         A11712ClaveID = T01HC26_A11712ClaveID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1HC1637( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound1637 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1637 = (short)(1) ;
         A11712ClaveID = T01HC26_A11712ClaveID[0] ;
      }
   }

   public void scanEnd1HC1637( )
   {
      pr_default.close(24);
   }

   public void afterConfirm1HC1637( )
   {
      /* After Confirm Rules */
      if ( true /* After */ && ( GXutil.strcmp(A11713ClaveDs, " ") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Falta Clave", ""), 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsert1HC1637( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1HC1637( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1HC1637( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1HC1637( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1HC1637( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1HC1637( )
   {
      edtClaveID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClaveID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClaveID_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtClavePrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClavePrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClavePrd_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtClavePrdDs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClavePrdDs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClavePrdDs_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtClaveCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClaveCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClaveCant_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtUniEstCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUniEstCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUniEstCod_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtClaveDs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClaveDs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClaveDs_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void send_integrity_lvl_hashes1HC1637( )
   {
   }

   public void send_integrity_lvl_hashes1HC556( )
   {
   }

   public void subsflControlProps_651637( )
   {
      edtavnRcdDeleted_1637_Internalname = "vNRCDDELETED_1637_"+sGXsfl_65_idx ;
      edtClaveID_Internalname = "CLAVEID_"+sGXsfl_65_idx ;
      edtClavePrd_Internalname = "CLAVEPRD_"+sGXsfl_65_idx ;
      edtClavePrdDs_Internalname = "CLAVEPRDDS_"+sGXsfl_65_idx ;
      edtClaveCant_Internalname = "CLAVECANT_"+sGXsfl_65_idx ;
      edtUniEstCod_Internalname = "UNIESTCOD_"+sGXsfl_65_idx ;
      edtClaveDs_Internalname = "CLAVEDS_"+sGXsfl_65_idx ;
   }

   public void subsflControlProps_fel_651637( )
   {
      edtavnRcdDeleted_1637_Internalname = "vNRCDDELETED_1637_"+sGXsfl_65_fel_idx ;
      edtClaveID_Internalname = "CLAVEID_"+sGXsfl_65_fel_idx ;
      edtClavePrd_Internalname = "CLAVEPRD_"+sGXsfl_65_fel_idx ;
      edtClavePrdDs_Internalname = "CLAVEPRDDS_"+sGXsfl_65_fel_idx ;
      edtClaveCant_Internalname = "CLAVECANT_"+sGXsfl_65_fel_idx ;
      edtUniEstCod_Internalname = "UNIESTCOD_"+sGXsfl_65_fel_idx ;
      edtClaveDs_Internalname = "CLAVEDS_"+sGXsfl_65_fel_idx ;
   }

   public void addRow1HC1637( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651637( ) ;
      sendRow1HC1637( ) ;
   }

   public void sendRow1HC1637( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1637_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1637_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1637, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1637_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1637), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1637), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1637_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1637_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1637_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtClaveID_Internalname,GXutil.ltrim( localUtil.ntoc( A11712ClaveID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11712ClaveID), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtClaveID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtClaveID_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1637_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtClavePrd_Internalname,GXutil.rtrim( A11714ClavePrd),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtClavePrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtClavePrd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtClavePrdDs_Internalname,GXutil.rtrim( A11715ClavePrdDs),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtClavePrdDs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtClavePrdDs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1637_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtClaveCant_Internalname,GXutil.ltrim( localUtil.ntoc( A11716ClaveCant, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtClaveCant_Enabled!=0) ? localUtil.format( A11716ClaveCant, "ZZZZZ9.999") : localUtil.format( A11716ClaveCant, "ZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,70);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtClaveCant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtClaveCant_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1637_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUniEstCod_Internalname,GXutil.rtrim( A2144UniEstCod),GXutil.rtrim( localUtil.format( A2144UniEstCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUniEstCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtUniEstCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtClaveDs_Internalname,GXutil.rtrim( A11713ClaveDs),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtClaveDs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtClaveDs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1HC1637( ) ;
      GXCCtl = "Z11712ClaveID_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11712ClaveID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11714ClavePrd_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11714ClavePrd));
      GXCCtl = "Z11716ClaveCant_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11716ClaveCant, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11713ClaveDs_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11713ClaveDs));
      GXCCtl = "Z2144UniEstCod_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2144UniEstCod));
      GXCCtl = "nRcdDeleted_1637_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1637, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1637_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1637, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1637_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1637, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1637_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1637_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLAVEID_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClaveID_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLAVEPRD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClavePrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLAVEPRDDS_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClavePrdDs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLAVECANT_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClaveCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UNIESTCOD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUniEstCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLAVEDS_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClaveDs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1HC1637( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651637( ) ;
      edtavnRcdDeleted_1637_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1637_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtClaveID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLAVEID_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtClavePrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLAVEPRD_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtClavePrdDs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLAVEPRDDS_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtClaveCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLAVECANT_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtUniEstCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UNIESTCOD_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtClaveDs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLAVEDS_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1637_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1637_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1637");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1637_Internalname ;
         wbErr = true ;
         nRcdDeleted_1637 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1637 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1637_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtClaveID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtClaveID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "CLAVEID_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtClaveID_Internalname ;
         wbErr = true ;
         A11712ClaveID = (short)(0) ;
      }
      else
      {
         A11712ClaveID = (short)(localUtil.ctol( httpContext.cgiGet( edtClaveID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A11714ClavePrd = httpContext.cgiGet( edtClavePrd_Internalname) ;
      n11714ClavePrd = false ;
      A11715ClavePrdDs = httpContext.cgiGet( edtClavePrdDs_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtClaveCant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtClaveCant_Internalname)), DecimalUtil.stringToDec("999999.999")) > 0 ) ) )
      {
         GXCCtl = "CLAVECANT_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtClaveCant_Internalname ;
         wbErr = true ;
         A11716ClaveCant = DecimalUtil.ZERO ;
         n11716ClaveCant = false ;
      }
      else
      {
         A11716ClaveCant = localUtil.ctond( httpContext.cgiGet( edtClaveCant_Internalname)) ;
         n11716ClaveCant = false ;
      }
      A2144UniEstCod = GXutil.upper( httpContext.cgiGet( edtUniEstCod_Internalname)) ;
      n2144UniEstCod = false ;
      A11713ClaveDs = httpContext.cgiGet( edtClaveDs_Internalname) ;
      n11713ClaveDs = false ;
      GXCCtl = "Z11712ClaveID_" + sGXsfl_65_idx ;
      Z11712ClaveID = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11714ClavePrd_" + sGXsfl_65_idx ;
      Z11714ClavePrd = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11716ClaveCant_" + sGXsfl_65_idx ;
      Z11716ClaveCant = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11713ClaveDs_" + sGXsfl_65_idx ;
      Z11713ClaveDs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2144UniEstCod_" + sGXsfl_65_idx ;
      Z2144UniEstCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1637_" + sGXsfl_65_idx ;
      nRcdDeleted_1637 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1637_" + sGXsfl_65_idx ;
      nRcdExists_1637 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1637_" + sGXsfl_65_idx ;
      nIsMod_1637 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtClaveDs_Enabled = edtClaveDs_Enabled ;
      defedtClaveID_Enabled = edtClaveID_Enabled ;
   }

   public void confirmValues1HC0( )
   {
      nGXsfl_65_idx = 0 ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651637( ) ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_651637( ) ;
         httpContext.changePostValue( "Z11712ClaveID_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z11712ClaveID_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11712ClaveID_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z11714ClavePrd_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z11714ClavePrd_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11714ClavePrd_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z11716ClaveCant_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z11716ClaveCant_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11716ClaveCant_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z11713ClaveDs_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z11713ClaveDs_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11713ClaveDs_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z2144UniEstCod_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z2144UniEstCod_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2144UniEstCod_"+sGXsfl_65_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tclavesfe", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A2141SerEst)),GXutil.URLEncode(GXutil.rtrim(A1013DibCli)),GXutil.URLEncode(GXutil.ltrimstr(A1014DibInt,8,0)),GXutil.URLEncode(GXutil.rtrim(A2074ColCom)),GXutil.URLEncode(GXutil.rtrim(A2078ColFon))}, new String[] {"EmprCod","CliCod","SerEst","DibCli","DibInt","ColCom","ColFon"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z2141SerEst", GXutil.rtrim( Z2141SerEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1013DibCli", GXutil.rtrim( Z1013DibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1014DibInt", GXutil.ltrim( localUtil.ntoc( Z1014DibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2074ColCom", GXutil.rtrim( Z2074ColCom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2078ColFon", GXutil.rtrim( Z2078ColFon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11717ClaveIdUlt", GXutil.ltrim( localUtil.ntoc( Z11717ClaveIdUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O11717ClaveIdUlt", GXutil.ltrim( localUtil.ntoc( O11717ClaveIdUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_65", GXutil.ltrim( localUtil.ntoc( nGXsfl_65_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tclavesfe", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A2141SerEst)),GXutil.URLEncode(GXutil.rtrim(A1013DibCli)),GXutil.URLEncode(GXutil.ltrimstr(A1014DibInt,8,0)),GXutil.URLEncode(GXutil.rtrim(A2074ColCom)),GXutil.URLEncode(GXutil.rtrim(A2078ColFon))}, new String[] {"EmprCod","CliCod","SerEst","DibCli","DibInt","ColCom","ColFon"})  ;
   }

   public String getPgmname( )
   {
      return "TCLAVESFE" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Claves Formulas Estampacion", "") ;
   }

   public void initializeNonKey1HC556( )
   {
      A11717ClaveIdUlt = (short)(0) ;
      n11717ClaveIdUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
      O11717ClaveIdUlt = A11717ClaveIdUlt ;
      n11717ClaveIdUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
      Z11717ClaveIdUlt = (short)(0) ;
   }

   public void initAll1HC556( )
   {
      initializeNonKey1HC556( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1HC1637( )
   {
      A11715ClavePrdDs = "" ;
      A11714ClavePrd = "" ;
      n11714ClavePrd = false ;
      A11716ClaveCant = DecimalUtil.ZERO ;
      n11716ClaveCant = false ;
      A2144UniEstCod = "" ;
      n2144UniEstCod = false ;
      A11713ClaveDs = "" ;
      n11713ClaveDs = false ;
      Z11714ClavePrd = "" ;
      Z11716ClaveCant = DecimalUtil.ZERO ;
      Z11713ClaveDs = "" ;
      Z2144UniEstCod = "" ;
   }

   public void initAll1HC1637( )
   {
      A11712ClaveID = (short)(0) ;
      initializeNonKey1HC1637( ) ;
   }

   public void standaloneModalInsert1HC1637( )
   {
      A11717ClaveIdUlt = i11717ClaveIdUlt ;
      n11717ClaveIdUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11717ClaveIdUlt), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824158370", true, true);
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
      httpContext.AddJavascriptSource("tclavesfe.js", "?2026824158370", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1637( )
   {
      edtClaveDs_Enabled = defedtClaveDs_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtClaveDs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClaveDs_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtClaveID_Enabled = defedtClaveID_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtClaveID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClaveID_Enabled), 5, 0), !bGXsfl_65_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1637, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1637_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11712ClaveID, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtClaveID_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11714ClavePrd));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtClavePrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11715ClavePrdDs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtClavePrdDs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11716ClaveCant, (byte)(10), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtClaveCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2144UniEstCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtUniEstCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11713ClaveDs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtClaveDs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtSerEst_Internalname = "SEREST" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtDibCli_Internalname = "DIBCLI" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtDibInt_Internalname = "DIBINT" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtColCom_Internalname = "COLCOM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtColFon_Internalname = "COLFON" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtClaveIdUlt_Internalname = "CLAVEIDULT" ;
      edtavnRcdDeleted_1637_Internalname = "vNRCDDELETED_1637" ;
      edtClaveID_Internalname = "CLAVEID" ;
      edtClavePrd_Internalname = "CLAVEPRD" ;
      edtClavePrdDs_Internalname = "CLAVEPRDDS" ;
      edtClaveCant_Internalname = "CLAVECANT" ;
      edtUniEstCod_Internalname = "UNIESTCOD" ;
      edtClaveDs_Internalname = "CLAVEDS" ;
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
      Form.setCaption( httpContext.getMessage( "Claves Formulas Estampacion", "") );
      edtClaveDs_Jsonclick = "" ;
      edtUniEstCod_Jsonclick = "" ;
      edtClaveCant_Jsonclick = "" ;
      edtClavePrdDs_Jsonclick = "" ;
      edtClavePrd_Jsonclick = "" ;
      edtClaveID_Jsonclick = "" ;
      edtavnRcdDeleted_1637_Jsonclick = "" ;
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
      edtClaveDs_Enabled = 0 ;
      edtUniEstCod_Enabled = 1 ;
      edtClaveCant_Enabled = 1 ;
      edtClavePrdDs_Enabled = 0 ;
      edtClavePrd_Enabled = 1 ;
      edtClaveID_Enabled = 1 ;
      edtavnRcdDeleted_1637_Enabled = 1 ;
      edtClaveIdUlt_Jsonclick = "" ;
      edtClaveIdUlt_Backcolor = (int)(0xFFFFFF) ;
      edtClaveIdUlt_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtColFon_Jsonclick = "" ;
      edtColFon_Backcolor = (int)(0xFFFFFF) ;
      edtColFon_Enabled = 0 ;
      edtColCom_Jsonclick = "" ;
      edtColCom_Backcolor = (int)(0xFFFFFF) ;
      edtColCom_Enabled = 0 ;
      edtDibInt_Jsonclick = "" ;
      edtDibInt_Backcolor = (int)(0xFFFFFF) ;
      edtDibInt_Enabled = 0 ;
      edtDibCli_Jsonclick = "" ;
      edtDibCli_Backcolor = (int)(0xFFFFFF) ;
      edtDibCli_Enabled = 0 ;
      edtSerEst_Jsonclick = "" ;
      edtSerEst_Backcolor = (int)(0xFFFFFF) ;
      edtSerEst_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
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

   public void gx2asaclaveprdds1HC1637( String A396EmprCod ,
                                        String A11714ClavePrd )
   {
      GXt_char1 = A11715ClavePrdDs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A11714ClavePrd ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tclavesfe_impl.this.A396EmprCod = GXv_char4[0] ;
      tclavesfe_impl.this.A11714ClavePrd = GXv_char3[0] ;
      tclavesfe_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A11715ClavePrdDs = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11715ClavePrdDs))+"\"") ;
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
      subsflControlProps_651637( ) ;
      while ( nGXsfl_65_idx <= nRC_GXsfl_65 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1HC1637( ) ;
         standaloneModal1HC1637( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1HC1637( ) ;
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_651637( ) ;
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
      /* Using cursor T01HC27 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01HC27_A407EmprNom[0] ;
      n407EmprNom = T01HC27_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(25);
      /* Using cursor T01HC28 */
      pr_default.execute(26, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDIBUJ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DIBINT");
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

   public void valid_Colfon( )
   {
      n11717ClaveIdUlt = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A11717ClaveIdUlt", GXutil.ltrim( localUtil.ntoc( A11717ClaveIdUlt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2141SerEst", GXutil.rtrim( Z2141SerEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1013DibCli", GXutil.rtrim( Z1013DibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1014DibInt", GXutil.ltrim( localUtil.ntoc( Z1014DibInt, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2074ColCom", GXutil.rtrim( Z2074ColCom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2078ColFon", GXutil.rtrim( Z2078ColFon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11717ClaveIdUlt", GXutil.ltrim( localUtil.ntoc( Z11717ClaveIdUlt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O11717ClaveIdUlt", GXutil.ltrim( localUtil.ntoc( O11717ClaveIdUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Claveprd( )
   {
      n11714ClavePrd = false ;
      GXt_char1 = A11715ClavePrdDs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A11714ClavePrd ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tclavesfe_impl.this.A396EmprCod = GXv_char4[0] ;
      tclavesfe_impl.this.A11714ClavePrd = GXv_char3[0] ;
      tclavesfe_impl.this.GXt_char1 = GXv_char2[0] ;
      A11715ClavePrdDs = GXt_char1 ;
      if ( ( GXutil.strcmp(A11715ClavePrdDs, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ && ( GXutil.strcmp(A11714ClavePrd, " ") != 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Producto Inexistente", ""), 1, "CLAVEPRD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtClavePrd_Internalname ;
      }
      if ( ( GXutil.strcmp(A11714ClavePrd, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Producto Inexistente", ""), 1, "CLAVEPRD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtClavePrd_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11715ClavePrdDs", GXutil.rtrim( A11715ClavePrdDs));
   }

   public void valid_Uniestcod( )
   {
      n2144UniEstCod = false ;
      /* Using cursor T01HC29 */
      pr_default.execute(27, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIEST", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "UNIESTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUniEstCod_Internalname ;
      }
      pr_default.close(27);
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A2141SerEst',fld:'SEREST',pic:''},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'A2074ColCom',fld:'COLCOM',pic:''},{av:'A2078ColFon',fld:'COLFON',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'CREAR CLAVE'","{handler:'e121HC2',iparms:[{av:'A11712ClaveID',fld:'CLAVEID',pic:'ZZZ9'},{av:'A11714ClavePrd',fld:'CLAVEPRD',pic:''},{av:'A11715ClavePrdDs',fld:'CLAVEPRDDS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11713ClaveDs',fld:'CLAVEDS',pic:''}]");
      setEventMetadata("'CREAR CLAVE'",",oparms:[{av:'A11713ClaveDs',fld:'CLAVEDS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_SEREST","{handler:'valid_Serest',iparms:[]");
      setEventMetadata("VALID_SEREST",",oparms:[]}");
      setEventMetadata("VALID_DIBCLI","{handler:'valid_Dibcli',iparms:[]");
      setEventMetadata("VALID_DIBCLI",",oparms:[]}");
      setEventMetadata("VALID_DIBINT","{handler:'valid_Dibint',iparms:[]");
      setEventMetadata("VALID_DIBINT",",oparms:[]}");
      setEventMetadata("VALID_COLCOM","{handler:'valid_Colcom',iparms:[]");
      setEventMetadata("VALID_COLCOM",",oparms:[]}");
      setEventMetadata("VALID_COLFON","{handler:'valid_Colfon',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A11717ClaveIdUlt',fld:'CLAVEIDULT',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A2141SerEst',fld:'SEREST',pic:''},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'A2074ColCom',fld:'COLCOM',pic:''},{av:'A2078ColFon',fld:'COLFON',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_COLFON",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A11717ClaveIdUlt',fld:'CLAVEIDULT',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z2141SerEst'},{av:'Z1013DibCli'},{av:'Z1014DibInt'},{av:'Z2074ColCom'},{av:'Z2078ColFon'},{av:'Z407EmprNom'},{av:'Z11717ClaveIdUlt'},{av:'O11717ClaveIdUlt'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CLAVEIDULT","{handler:'valid_Claveidult',iparms:[]");
      setEventMetadata("VALID_CLAVEIDULT",",oparms:[]}");
      setEventMetadata("VALID_CLAVEID","{handler:'valid_Claveid',iparms:[]");
      setEventMetadata("VALID_CLAVEID",",oparms:[]}");
      setEventMetadata("VALID_CLAVEPRD","{handler:'valid_Claveprd',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11714ClavePrd',fld:'CLAVEPRD',pic:''},{av:'A11715ClavePrdDs',fld:'CLAVEPRDDS',pic:''}]");
      setEventMetadata("VALID_CLAVEPRD",",oparms:[{av:'A11715ClavePrdDs',fld:'CLAVEPRDDS',pic:''}]}");
      setEventMetadata("VALID_UNIESTCOD","{handler:'valid_Uniestcod',iparms:[{av:'A2144UniEstCod',fld:'UNIESTCOD',pic:'@!'}]");
      setEventMetadata("VALID_UNIESTCOD",",oparms:[]}");
      setEventMetadata("VALID_CLAVEDS","{handler:'valid_Claveds',iparms:[]");
      setEventMetadata("VALID_CLAVEDS",",oparms:[]}");
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
      pr_default.close(27);
      pr_default.close(25);
      pr_default.close(26);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA2141SerEst = "" ;
      wcpOA1013DibCli = "" ;
      wcpOA2074ColCom = "" ;
      wcpOA2078ColFon = "" ;
      Z396EmprCod = "" ;
      Z2141SerEst = "" ;
      Z1013DibCli = "" ;
      Z2074ColCom = "" ;
      Z2078ColFon = "" ;
      Z11714ClavePrd = "" ;
      Z11716ClaveCant = DecimalUtil.ZERO ;
      Z11713ClaveDs = "" ;
      Z2144UniEstCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A11714ClavePrd = "" ;
      A2144UniEstCod = "" ;
      A2141SerEst = "" ;
      A1013DibCli = "" ;
      A2074ColCom = "" ;
      A2078ColFon = "" ;
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
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock9_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1637 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV34Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode556 = "" ;
      GXCCtl = "" ;
      A11715ClavePrdDs = "" ;
      A11716ClaveCant = DecimalUtil.ZERO ;
      A11713ClaveDs = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      T01HC7_A407EmprNom = new String[] {""} ;
      T01HC7_n407EmprNom = new boolean[] {false} ;
      T01HC8_A396EmprCod = new String[] {""} ;
      T01HC9_A2141SerEst = new String[] {""} ;
      T01HC9_A2074ColCom = new String[] {""} ;
      T01HC9_A2078ColFon = new String[] {""} ;
      T01HC9_A407EmprNom = new String[] {""} ;
      T01HC9_n407EmprNom = new boolean[] {false} ;
      T01HC9_A11717ClaveIdUlt = new short[1] ;
      T01HC9_n11717ClaveIdUlt = new boolean[] {false} ;
      T01HC9_A396EmprCod = new String[] {""} ;
      T01HC9_A252CliCod = new int[1] ;
      T01HC9_A1013DibCli = new String[] {""} ;
      T01HC9_A1014DibInt = new int[1] ;
      T01HC10_A396EmprCod = new String[] {""} ;
      T01HC10_A252CliCod = new int[1] ;
      T01HC10_A2141SerEst = new String[] {""} ;
      T01HC10_A1013DibCli = new String[] {""} ;
      T01HC10_A1014DibInt = new int[1] ;
      T01HC10_A2074ColCom = new String[] {""} ;
      T01HC10_A2078ColFon = new String[] {""} ;
      T01HC6_A2141SerEst = new String[] {""} ;
      T01HC6_A2074ColCom = new String[] {""} ;
      T01HC6_A2078ColFon = new String[] {""} ;
      T01HC6_A11717ClaveIdUlt = new short[1] ;
      T01HC6_n11717ClaveIdUlt = new boolean[] {false} ;
      T01HC6_A396EmprCod = new String[] {""} ;
      T01HC6_A252CliCod = new int[1] ;
      T01HC6_A1013DibCli = new String[] {""} ;
      T01HC6_A1014DibInt = new int[1] ;
      T01HC11_A396EmprCod = new String[] {""} ;
      T01HC11_A252CliCod = new int[1] ;
      T01HC11_A2141SerEst = new String[] {""} ;
      T01HC11_A1013DibCli = new String[] {""} ;
      T01HC11_A1014DibInt = new int[1] ;
      T01HC11_A2074ColCom = new String[] {""} ;
      T01HC11_A2078ColFon = new String[] {""} ;
      T01HC12_A396EmprCod = new String[] {""} ;
      T01HC12_A252CliCod = new int[1] ;
      T01HC12_A2141SerEst = new String[] {""} ;
      T01HC12_A1013DibCli = new String[] {""} ;
      T01HC12_A1014DibInt = new int[1] ;
      T01HC12_A2074ColCom = new String[] {""} ;
      T01HC12_A2078ColFon = new String[] {""} ;
      T01HC5_A2141SerEst = new String[] {""} ;
      T01HC5_A2074ColCom = new String[] {""} ;
      T01HC5_A2078ColFon = new String[] {""} ;
      T01HC5_A11717ClaveIdUlt = new short[1] ;
      T01HC5_n11717ClaveIdUlt = new boolean[] {false} ;
      T01HC5_A396EmprCod = new String[] {""} ;
      T01HC5_A252CliCod = new int[1] ;
      T01HC5_A1013DibCli = new String[] {""} ;
      T01HC5_A1014DibInt = new int[1] ;
      T01HC16_A396EmprCod = new String[] {""} ;
      T01HC16_A252CliCod = new int[1] ;
      T01HC16_A2141SerEst = new String[] {""} ;
      T01HC16_A1013DibCli = new String[] {""} ;
      T01HC16_A1014DibInt = new int[1] ;
      T01HC16_A2074ColCom = new String[] {""} ;
      T01HC16_A2078ColFon = new String[] {""} ;
      T01HC16_A2095ForObsLin = new byte[1] ;
      T01HC17_A396EmprCod = new String[] {""} ;
      T01HC17_A252CliCod = new int[1] ;
      T01HC17_A2141SerEst = new String[] {""} ;
      T01HC17_A1013DibCli = new String[] {""} ;
      T01HC17_A1014DibInt = new int[1] ;
      T01HC17_A2074ColCom = new String[] {""} ;
      T01HC17_A2078ColFon = new String[] {""} ;
      T01HC17_A2098MolCod = new byte[1] ;
      T01HC19_A396EmprCod = new String[] {""} ;
      T01HC19_A252CliCod = new int[1] ;
      T01HC19_A2141SerEst = new String[] {""} ;
      T01HC19_A1013DibCli = new String[] {""} ;
      T01HC19_A1014DibInt = new int[1] ;
      T01HC19_A2074ColCom = new String[] {""} ;
      T01HC19_A2078ColFon = new String[] {""} ;
      T01HC20_A252CliCod = new int[1] ;
      T01HC20_A2141SerEst = new String[] {""} ;
      T01HC20_A1013DibCli = new String[] {""} ;
      T01HC20_A1014DibInt = new int[1] ;
      T01HC20_A2074ColCom = new String[] {""} ;
      T01HC20_A2078ColFon = new String[] {""} ;
      T01HC20_A11712ClaveID = new short[1] ;
      T01HC20_A11714ClavePrd = new String[] {""} ;
      T01HC20_n11714ClavePrd = new boolean[] {false} ;
      T01HC20_A11716ClaveCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HC20_n11716ClaveCant = new boolean[] {false} ;
      T01HC20_A11713ClaveDs = new String[] {""} ;
      T01HC20_n11713ClaveDs = new boolean[] {false} ;
      T01HC20_A2144UniEstCod = new String[] {""} ;
      T01HC20_n2144UniEstCod = new boolean[] {false} ;
      T01HC20_A396EmprCod = new String[] {""} ;
      T01HC4_A2144UniEstCod = new String[] {""} ;
      T01HC4_n2144UniEstCod = new boolean[] {false} ;
      T01HC21_A2144UniEstCod = new String[] {""} ;
      T01HC21_n2144UniEstCod = new boolean[] {false} ;
      T01HC22_A396EmprCod = new String[] {""} ;
      T01HC22_A252CliCod = new int[1] ;
      T01HC22_A2141SerEst = new String[] {""} ;
      T01HC22_A1013DibCli = new String[] {""} ;
      T01HC22_A1014DibInt = new int[1] ;
      T01HC22_A2074ColCom = new String[] {""} ;
      T01HC22_A2078ColFon = new String[] {""} ;
      T01HC22_A11712ClaveID = new short[1] ;
      T01HC3_A252CliCod = new int[1] ;
      T01HC3_A2141SerEst = new String[] {""} ;
      T01HC3_A1013DibCli = new String[] {""} ;
      T01HC3_A1014DibInt = new int[1] ;
      T01HC3_A2074ColCom = new String[] {""} ;
      T01HC3_A2078ColFon = new String[] {""} ;
      T01HC3_A11712ClaveID = new short[1] ;
      T01HC3_A11714ClavePrd = new String[] {""} ;
      T01HC3_n11714ClavePrd = new boolean[] {false} ;
      T01HC3_A11716ClaveCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HC3_n11716ClaveCant = new boolean[] {false} ;
      T01HC3_A11713ClaveDs = new String[] {""} ;
      T01HC3_n11713ClaveDs = new boolean[] {false} ;
      T01HC3_A2144UniEstCod = new String[] {""} ;
      T01HC3_n2144UniEstCod = new boolean[] {false} ;
      T01HC3_A396EmprCod = new String[] {""} ;
      T01HC2_A252CliCod = new int[1] ;
      T01HC2_A2141SerEst = new String[] {""} ;
      T01HC2_A1013DibCli = new String[] {""} ;
      T01HC2_A1014DibInt = new int[1] ;
      T01HC2_A2074ColCom = new String[] {""} ;
      T01HC2_A2078ColFon = new String[] {""} ;
      T01HC2_A11712ClaveID = new short[1] ;
      T01HC2_A11714ClavePrd = new String[] {""} ;
      T01HC2_n11714ClavePrd = new boolean[] {false} ;
      T01HC2_A11716ClaveCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HC2_n11716ClaveCant = new boolean[] {false} ;
      T01HC2_A11713ClaveDs = new String[] {""} ;
      T01HC2_n11713ClaveDs = new boolean[] {false} ;
      T01HC2_A2144UniEstCod = new String[] {""} ;
      T01HC2_n2144UniEstCod = new boolean[] {false} ;
      T01HC2_A396EmprCod = new String[] {""} ;
      T01HC26_A396EmprCod = new String[] {""} ;
      T01HC26_A252CliCod = new int[1] ;
      T01HC26_A2141SerEst = new String[] {""} ;
      T01HC26_A1013DibCli = new String[] {""} ;
      T01HC26_A1014DibInt = new int[1] ;
      T01HC26_A2074ColCom = new String[] {""} ;
      T01HC26_A2078ColFon = new String[] {""} ;
      T01HC26_A11712ClaveID = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01HC27_A407EmprNom = new String[] {""} ;
      T01HC27_n407EmprNom = new boolean[] {false} ;
      T01HC28_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ2141SerEst = "" ;
      ZZ1013DibCli = "" ;
      ZZ2074ColCom = "" ;
      ZZ2078ColFon = "" ;
      ZZ407EmprNom = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Z11715ClavePrdDs = "" ;
      T01HC29_A2144UniEstCod = new String[] {""} ;
      T01HC29_n2144UniEstCod = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tclavesfe__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tclavesfe__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tclavesfe__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tclavesfe__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tclavesfe__default(),
         new Object[] {
             new Object[] {
            T01HC2_A252CliCod, T01HC2_A2141SerEst, T01HC2_A1013DibCli, T01HC2_A1014DibInt, T01HC2_A2074ColCom, T01HC2_A2078ColFon, T01HC2_A11712ClaveID, T01HC2_A11714ClavePrd, T01HC2_n11714ClavePrd, T01HC2_A11716ClaveCant,
            T01HC2_n11716ClaveCant, T01HC2_A11713ClaveDs, T01HC2_n11713ClaveDs, T01HC2_A2144UniEstCod, T01HC2_n2144UniEstCod, T01HC2_A396EmprCod
            }
            , new Object[] {
            T01HC3_A252CliCod, T01HC3_A2141SerEst, T01HC3_A1013DibCli, T01HC3_A1014DibInt, T01HC3_A2074ColCom, T01HC3_A2078ColFon, T01HC3_A11712ClaveID, T01HC3_A11714ClavePrd, T01HC3_n11714ClavePrd, T01HC3_A11716ClaveCant,
            T01HC3_n11716ClaveCant, T01HC3_A11713ClaveDs, T01HC3_n11713ClaveDs, T01HC3_A2144UniEstCod, T01HC3_n2144UniEstCod, T01HC3_A396EmprCod
            }
            , new Object[] {
            T01HC4_A2144UniEstCod
            }
            , new Object[] {
            T01HC5_A2141SerEst, T01HC5_A2074ColCom, T01HC5_A2078ColFon, T01HC5_A11717ClaveIdUlt, T01HC5_n11717ClaveIdUlt, T01HC5_A396EmprCod, T01HC5_A252CliCod, T01HC5_A1013DibCli, T01HC5_A1014DibInt
            }
            , new Object[] {
            T01HC6_A2141SerEst, T01HC6_A2074ColCom, T01HC6_A2078ColFon, T01HC6_A11717ClaveIdUlt, T01HC6_n11717ClaveIdUlt, T01HC6_A396EmprCod, T01HC6_A252CliCod, T01HC6_A1013DibCli, T01HC6_A1014DibInt
            }
            , new Object[] {
            T01HC7_A407EmprNom, T01HC7_n407EmprNom
            }
            , new Object[] {
            T01HC8_A396EmprCod
            }
            , new Object[] {
            T01HC9_A2141SerEst, T01HC9_A2074ColCom, T01HC9_A2078ColFon, T01HC9_A407EmprNom, T01HC9_n407EmprNom, T01HC9_A11717ClaveIdUlt, T01HC9_n11717ClaveIdUlt, T01HC9_A396EmprCod, T01HC9_A252CliCod, T01HC9_A1013DibCli,
            T01HC9_A1014DibInt
            }
            , new Object[] {
            T01HC10_A396EmprCod, T01HC10_A252CliCod, T01HC10_A2141SerEst, T01HC10_A1013DibCli, T01HC10_A1014DibInt, T01HC10_A2074ColCom, T01HC10_A2078ColFon
            }
            , new Object[] {
            T01HC11_A396EmprCod, T01HC11_A252CliCod, T01HC11_A2141SerEst, T01HC11_A1013DibCli, T01HC11_A1014DibInt, T01HC11_A2074ColCom, T01HC11_A2078ColFon
            }
            , new Object[] {
            T01HC12_A396EmprCod, T01HC12_A252CliCod, T01HC12_A2141SerEst, T01HC12_A1013DibCli, T01HC12_A1014DibInt, T01HC12_A2074ColCom, T01HC12_A2078ColFon
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01HC16_A396EmprCod, T01HC16_A252CliCod, T01HC16_A2141SerEst, T01HC16_A1013DibCli, T01HC16_A1014DibInt, T01HC16_A2074ColCom, T01HC16_A2078ColFon, T01HC16_A2095ForObsLin
            }
            , new Object[] {
            T01HC17_A396EmprCod, T01HC17_A252CliCod, T01HC17_A2141SerEst, T01HC17_A1013DibCli, T01HC17_A1014DibInt, T01HC17_A2074ColCom, T01HC17_A2078ColFon, T01HC17_A2098MolCod
            }
            , new Object[] {
            }
            , new Object[] {
            T01HC19_A396EmprCod, T01HC19_A252CliCod, T01HC19_A2141SerEst, T01HC19_A1013DibCli, T01HC19_A1014DibInt, T01HC19_A2074ColCom, T01HC19_A2078ColFon
            }
            , new Object[] {
            T01HC20_A252CliCod, T01HC20_A2141SerEst, T01HC20_A1013DibCli, T01HC20_A1014DibInt, T01HC20_A2074ColCom, T01HC20_A2078ColFon, T01HC20_A11712ClaveID, T01HC20_A11714ClavePrd, T01HC20_n11714ClavePrd, T01HC20_A11716ClaveCant,
            T01HC20_n11716ClaveCant, T01HC20_A11713ClaveDs, T01HC20_n11713ClaveDs, T01HC20_A2144UniEstCod, T01HC20_n2144UniEstCod, T01HC20_A396EmprCod
            }
            , new Object[] {
            T01HC21_A2144UniEstCod
            }
            , new Object[] {
            T01HC22_A396EmprCod, T01HC22_A252CliCod, T01HC22_A2141SerEst, T01HC22_A1013DibCli, T01HC22_A1014DibInt, T01HC22_A2074ColCom, T01HC22_A2078ColFon, T01HC22_A11712ClaveID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01HC26_A396EmprCod, T01HC26_A252CliCod, T01HC26_A2141SerEst, T01HC26_A1013DibCli, T01HC26_A1014DibInt, T01HC26_A2074ColCom, T01HC26_A2078ColFon, T01HC26_A11712ClaveID
            }
            , new Object[] {
            T01HC27_A407EmprNom, T01HC27_n407EmprNom
            }
            , new Object[] {
            T01HC28_A396EmprCod
            }
            , new Object[] {
            T01HC29_A2144UniEstCod
            }
         }
      );
      Z2078ColFon = "" ;
      A2078ColFon = "" ;
      Z2074ColCom = "" ;
      A2074ColCom = "" ;
      Z1014DibInt = 0 ;
      A1014DibInt = 0 ;
      Z1013DibCli = "" ;
      A1013DibCli = "" ;
      Z2141SerEst = "" ;
      A2141SerEst = "" ;
      Z252CliCod = 0 ;
      A252CliCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV34Pgmname = "TCLAVESFE" ;
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
   private short Z11717ClaveIdUlt ;
   private short O11717ClaveIdUlt ;
   private short Z11712ClaveID ;
   private short nRcdDeleted_1637 ;
   private short nRcdExists_1637 ;
   private short nIsMod_1637 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A11717ClaveIdUlt ;
   private short nBlankRcdCount1637 ;
   private short RcdFound1637 ;
   private short B11717ClaveIdUlt ;
   private short nBlankRcdUsr1637 ;
   private short s11717ClaveIdUlt ;
   private short A11712ClaveID ;
   private short RcdFound556 ;
   private short nIsDirty_556 ;
   private short nIsDirty_1637 ;
   private short i11717ClaveIdUlt ;
   private short ZZ11717ClaveIdUlt ;
   private short ZO11717ClaveIdUlt ;
   private int wcpOA252CliCod ;
   private int wcpOA1014DibInt ;
   private int Z252CliCod ;
   private int Z1014DibInt ;
   private int nRC_GXsfl_65 ;
   private int nGXsfl_65_idx=1 ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtSerEst_Enabled ;
   private int edtDibCli_Enabled ;
   private int edtDibInt_Enabled ;
   private int edtColCom_Enabled ;
   private int edtColFon_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtClaveIdUlt_Enabled ;
   private int edtavnRcdDeleted_1637_Enabled ;
   private int edtClaveID_Enabled ;
   private int edtClavePrd_Enabled ;
   private int edtClavePrdDs_Enabled ;
   private int edtClaveCant_Enabled ;
   private int edtUniEstCod_Enabled ;
   private int edtClaveDs_Enabled ;
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
   private int defedtClaveDs_Enabled ;
   private int defedtClaveID_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtClaveIdUlt_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtColFon_Backcolor ;
   private int edtColCom_Backcolor ;
   private int edtDibInt_Backcolor ;
   private int edtDibCli_Backcolor ;
   private int edtSerEst_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int ZZ1014DibInt ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z11716ClaveCant ;
   private java.math.BigDecimal A11716ClaveCant ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA2141SerEst ;
   private String wcpOA1013DibCli ;
   private String wcpOA2074ColCom ;
   private String wcpOA2078ColFon ;
   private String Z396EmprCod ;
   private String Z2141SerEst ;
   private String Z1013DibCli ;
   private String Z2074ColCom ;
   private String Z2078ColFon ;
   private String Z11714ClavePrd ;
   private String Z11713ClaveDs ;
   private String Z2144UniEstCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A11714ClavePrd ;
   private String A2144UniEstCod ;
   private String A2141SerEst ;
   private String A1013DibCli ;
   private String A2074ColCom ;
   private String A2078ColFon ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_65_idx="0001" ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtSerEst_Internalname ;
   private String edtSerEst_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtDibCli_Internalname ;
   private String edtDibCli_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtDibInt_Internalname ;
   private String edtDibInt_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtColCom_Internalname ;
   private String edtColCom_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtColFon_Internalname ;
   private String edtColFon_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtClaveIdUlt_Internalname ;
   private String edtClaveIdUlt_Jsonclick ;
   private String sMode1637 ;
   private String edtavnRcdDeleted_1637_Internalname ;
   private String edtClaveID_Internalname ;
   private String edtClavePrd_Internalname ;
   private String edtClavePrdDs_Internalname ;
   private String edtClaveCant_Internalname ;
   private String edtUniEstCod_Internalname ;
   private String edtClaveDs_Internalname ;
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
   private String AV34Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode556 ;
   private String GXCCtl ;
   private String A11715ClavePrdDs ;
   private String A11713ClaveDs ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String sGXsfl_65_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1637_Jsonclick ;
   private String edtClaveID_Jsonclick ;
   private String edtClavePrd_Jsonclick ;
   private String edtClavePrdDs_Jsonclick ;
   private String edtClaveCant_Jsonclick ;
   private String edtUniEstCod_Jsonclick ;
   private String edtClaveDs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ2141SerEst ;
   private String ZZ1013DibCli ;
   private String ZZ2074ColCom ;
   private String ZZ2078ColFon ;
   private String ZZ407EmprNom ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z11715ClavePrdDs ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n11714ClavePrd ;
   private boolean n2144UniEstCod ;
   private boolean wbErr ;
   private boolean n11717ClaveIdUlt ;
   private boolean bGXsfl_65_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n11716ClaveCant ;
   private boolean n11713ClaveDs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01HC7_A407EmprNom ;
   private boolean[] T01HC7_n407EmprNom ;
   private String[] T01HC8_A396EmprCod ;
   private String[] T01HC9_A2141SerEst ;
   private String[] T01HC9_A2074ColCom ;
   private String[] T01HC9_A2078ColFon ;
   private String[] T01HC9_A407EmprNom ;
   private boolean[] T01HC9_n407EmprNom ;
   private short[] T01HC9_A11717ClaveIdUlt ;
   private boolean[] T01HC9_n11717ClaveIdUlt ;
   private String[] T01HC9_A396EmprCod ;
   private int[] T01HC9_A252CliCod ;
   private String[] T01HC9_A1013DibCli ;
   private int[] T01HC9_A1014DibInt ;
   private String[] T01HC10_A396EmprCod ;
   private int[] T01HC10_A252CliCod ;
   private String[] T01HC10_A2141SerEst ;
   private String[] T01HC10_A1013DibCli ;
   private int[] T01HC10_A1014DibInt ;
   private String[] T01HC10_A2074ColCom ;
   private String[] T01HC10_A2078ColFon ;
   private String[] T01HC6_A2141SerEst ;
   private String[] T01HC6_A2074ColCom ;
   private String[] T01HC6_A2078ColFon ;
   private short[] T01HC6_A11717ClaveIdUlt ;
   private boolean[] T01HC6_n11717ClaveIdUlt ;
   private String[] T01HC6_A396EmprCod ;
   private int[] T01HC6_A252CliCod ;
   private String[] T01HC6_A1013DibCli ;
   private int[] T01HC6_A1014DibInt ;
   private String[] T01HC11_A396EmprCod ;
   private int[] T01HC11_A252CliCod ;
   private String[] T01HC11_A2141SerEst ;
   private String[] T01HC11_A1013DibCli ;
   private int[] T01HC11_A1014DibInt ;
   private String[] T01HC11_A2074ColCom ;
   private String[] T01HC11_A2078ColFon ;
   private String[] T01HC12_A396EmprCod ;
   private int[] T01HC12_A252CliCod ;
   private String[] T01HC12_A2141SerEst ;
   private String[] T01HC12_A1013DibCli ;
   private int[] T01HC12_A1014DibInt ;
   private String[] T01HC12_A2074ColCom ;
   private String[] T01HC12_A2078ColFon ;
   private String[] T01HC5_A2141SerEst ;
   private String[] T01HC5_A2074ColCom ;
   private String[] T01HC5_A2078ColFon ;
   private short[] T01HC5_A11717ClaveIdUlt ;
   private boolean[] T01HC5_n11717ClaveIdUlt ;
   private String[] T01HC5_A396EmprCod ;
   private int[] T01HC5_A252CliCod ;
   private String[] T01HC5_A1013DibCli ;
   private int[] T01HC5_A1014DibInt ;
   private String[] T01HC16_A396EmprCod ;
   private int[] T01HC16_A252CliCod ;
   private String[] T01HC16_A2141SerEst ;
   private String[] T01HC16_A1013DibCli ;
   private int[] T01HC16_A1014DibInt ;
   private String[] T01HC16_A2074ColCom ;
   private String[] T01HC16_A2078ColFon ;
   private byte[] T01HC16_A2095ForObsLin ;
   private String[] T01HC17_A396EmprCod ;
   private int[] T01HC17_A252CliCod ;
   private String[] T01HC17_A2141SerEst ;
   private String[] T01HC17_A1013DibCli ;
   private int[] T01HC17_A1014DibInt ;
   private String[] T01HC17_A2074ColCom ;
   private String[] T01HC17_A2078ColFon ;
   private byte[] T01HC17_A2098MolCod ;
   private String[] T01HC19_A396EmprCod ;
   private int[] T01HC19_A252CliCod ;
   private String[] T01HC19_A2141SerEst ;
   private String[] T01HC19_A1013DibCli ;
   private int[] T01HC19_A1014DibInt ;
   private String[] T01HC19_A2074ColCom ;
   private String[] T01HC19_A2078ColFon ;
   private int[] T01HC20_A252CliCod ;
   private String[] T01HC20_A2141SerEst ;
   private String[] T01HC20_A1013DibCli ;
   private int[] T01HC20_A1014DibInt ;
   private String[] T01HC20_A2074ColCom ;
   private String[] T01HC20_A2078ColFon ;
   private short[] T01HC20_A11712ClaveID ;
   private String[] T01HC20_A11714ClavePrd ;
   private boolean[] T01HC20_n11714ClavePrd ;
   private java.math.BigDecimal[] T01HC20_A11716ClaveCant ;
   private boolean[] T01HC20_n11716ClaveCant ;
   private String[] T01HC20_A11713ClaveDs ;
   private boolean[] T01HC20_n11713ClaveDs ;
   private String[] T01HC20_A2144UniEstCod ;
   private boolean[] T01HC20_n2144UniEstCod ;
   private String[] T01HC20_A396EmprCod ;
   private String[] T01HC4_A2144UniEstCod ;
   private boolean[] T01HC4_n2144UniEstCod ;
   private String[] T01HC21_A2144UniEstCod ;
   private boolean[] T01HC21_n2144UniEstCod ;
   private String[] T01HC22_A396EmprCod ;
   private int[] T01HC22_A252CliCod ;
   private String[] T01HC22_A2141SerEst ;
   private String[] T01HC22_A1013DibCli ;
   private int[] T01HC22_A1014DibInt ;
   private String[] T01HC22_A2074ColCom ;
   private String[] T01HC22_A2078ColFon ;
   private short[] T01HC22_A11712ClaveID ;
   private int[] T01HC3_A252CliCod ;
   private String[] T01HC3_A2141SerEst ;
   private String[] T01HC3_A1013DibCli ;
   private int[] T01HC3_A1014DibInt ;
   private String[] T01HC3_A2074ColCom ;
   private String[] T01HC3_A2078ColFon ;
   private short[] T01HC3_A11712ClaveID ;
   private String[] T01HC3_A11714ClavePrd ;
   private boolean[] T01HC3_n11714ClavePrd ;
   private java.math.BigDecimal[] T01HC3_A11716ClaveCant ;
   private boolean[] T01HC3_n11716ClaveCant ;
   private String[] T01HC3_A11713ClaveDs ;
   private boolean[] T01HC3_n11713ClaveDs ;
   private String[] T01HC3_A2144UniEstCod ;
   private boolean[] T01HC3_n2144UniEstCod ;
   private String[] T01HC3_A396EmprCod ;
   private int[] T01HC2_A252CliCod ;
   private String[] T01HC2_A2141SerEst ;
   private String[] T01HC2_A1013DibCli ;
   private int[] T01HC2_A1014DibInt ;
   private String[] T01HC2_A2074ColCom ;
   private String[] T01HC2_A2078ColFon ;
   private short[] T01HC2_A11712ClaveID ;
   private String[] T01HC2_A11714ClavePrd ;
   private boolean[] T01HC2_n11714ClavePrd ;
   private java.math.BigDecimal[] T01HC2_A11716ClaveCant ;
   private boolean[] T01HC2_n11716ClaveCant ;
   private String[] T01HC2_A11713ClaveDs ;
   private boolean[] T01HC2_n11713ClaveDs ;
   private String[] T01HC2_A2144UniEstCod ;
   private boolean[] T01HC2_n2144UniEstCod ;
   private String[] T01HC2_A396EmprCod ;
   private String[] T01HC26_A396EmprCod ;
   private int[] T01HC26_A252CliCod ;
   private String[] T01HC26_A2141SerEst ;
   private String[] T01HC26_A1013DibCli ;
   private int[] T01HC26_A1014DibInt ;
   private String[] T01HC26_A2074ColCom ;
   private String[] T01HC26_A2078ColFon ;
   private short[] T01HC26_A11712ClaveID ;
   private String[] T01HC27_A407EmprNom ;
   private boolean[] T01HC27_n407EmprNom ;
   private String[] T01HC28_A396EmprCod ;
   private String[] T01HC29_A2144UniEstCod ;
   private boolean[] T01HC29_n2144UniEstCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tclavesfe__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclavesfe__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclavesfe__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclavesfe__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclavesfe__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01HC2", "SELECT CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, ClaveID, ClavePrd, ClaveCant, ClaveDs, UniEstCod, EmprCod FROM TXPClaves WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND ClaveID = ?  FOR UPDATE OF ClavePrd, ClaveCant, ClaveDs, UniEstCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HC3", "SELECT CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, ClaveID, ClavePrd, ClaveCant, ClaveDs, UniEstCod, EmprCod FROM TXPClaves WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND ClaveID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HC4", "SELECT UniEstCod FROM TXPUNIEST WHERE UniEstCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HC5", "SELECT SerEst, ColCom, ColFon, ClaveIdUlt, EmprCod, CliCod, DibCli, DibInt FROM TXPCFORES WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ?  FOR UPDATE OF ClaveIdUlt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HC6", "SELECT SerEst, ColCom, ColFon, ClaveIdUlt, EmprCod, CliCod, DibCli, DibInt FROM TXPCFORES WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HC7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HC8", "SELECT EmprCod FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HC9", "SELECT /*+ FIRST_ROWS(1) */ TM1.SerEst, TM1.ColCom, TM1.ColFon, T2.EmprNom, TM1.ClaveIdUlt, TM1.EmprCod, TM1.CliCod, TM1.DibCli, TM1.DibInt FROM (TXPCFORES TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.SerEst = ? and TM1.DibCli = ? and TM1.DibInt = ? and TM1.ColCom = ? and TM1.ColFon = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.SerEst, TM1.DibCli, TM1.DibInt, TM1.ColCom, TM1.ColFon ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HC10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon FROM TXPCFORES WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HC11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon FROM TXPCFORES WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HC12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon FROM TXPCFORES WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? ORDER BY EmprCod DESC, CliCod DESC, SerEst DESC, DibCli DESC, DibInt DESC, ColCom DESC, ColFon DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01HC13", "INSERT INTO TXPCFORES(SerEst, ColCom, ColFon, ClaveIdUlt, EmprCod, CliCod, DibCli, DibInt, ColMolCil, ColEstMba, ForObsULin, IntCod, ColCodExt, ColBmp, GrpFamCod, ColNomCol, ColGrm2, DGCalID, DGPerfID, DGDespID, DGAltCab) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0)", GX_NOMASK, "TXPCFORES")
         ,new UpdateCursor("T01HC14", "UPDATE TXPCFORES SET ClaveIdUlt=?  WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ?", GX_NOMASK, "TXPCFORES")
         ,new UpdateCursor("T01HC15", "DELETE FROM TXPCFORES  WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ?", GX_NOMASK, "TXPCFORES")
         ,new ForEachCursor("T01HC16", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, ForObsLin FROM TXPFOROBS WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HC17", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod FROM TXPMFORES WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01HC18", "UPDATE TXPCFORES SET ClaveIdUlt=?  WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ?", GX_NOMASK, "TXPCFORES")
         ,new ForEachCursor("T01HC19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon FROM TXPCFORES WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HC20", "SELECT CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, ClaveID, ClavePrd, ClaveCant, ClaveDs, UniEstCod, EmprCod FROM TXPClaves WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? and ClaveID = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, ClaveID ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HC21", "SELECT UniEstCod FROM TXPUNIEST WHERE UniEstCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HC22", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, ClaveID FROM TXPClaves WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND ClaveID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01HC23", "INSERT INTO TXPClaves(CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, ClaveID, ClavePrd, ClaveCant, ClaveDs, UniEstCod, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPClaves")
         ,new UpdateCursor("T01HC24", "UPDATE TXPClaves SET ClavePrd=?, ClaveCant=?, ClaveDs=?, UniEstCod=?  WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND ClaveID = ?", GX_NOMASK, "TXPClaves")
         ,new UpdateCursor("T01HC25", "DELETE FROM TXPClaves  WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND ClaveID = ?", GX_NOMASK, "TXPClaves")
         ,new ForEachCursor("T01HC26", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, ClaveID FROM TXPClaves WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, ClaveID ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HC27", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HC28", "SELECT EmprCod FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HC29", "SELECT UniEstCod FROM TXPUNIEST WHERE UniEstCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 100);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 100);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 100);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
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
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setString(2, (String)parms[1], 12);
               stmt.setString(3, (String)parms[2], 12);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               stmt.setString(5, (String)parms[5], 3);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setString(7, (String)parms[7], 16);
               stmt.setInt(8, ((Number) parms[8]).intValue());
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
               stmt.setString(5, (String)parms[5], 16);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setString(7, (String)parms[7], 12);
               stmt.setString(8, (String)parms[8], 12);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
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
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 16);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setString(7, (String)parms[7], 12);
               stmt.setString(8, (String)parms[8], 12);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
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
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 21 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 16);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 12);
               stmt.setString(6, (String)parms[5], 12);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 6);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[10], 3);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[12], 100);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[14], 3);
               }
               stmt.setString(12, (String)parms[15], 3);
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 100);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 3);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setString(7, (String)parms[10], 16);
               stmt.setString(8, (String)parms[11], 16);
               stmt.setInt(9, ((Number) parms[12]).intValue());
               stmt.setString(10, (String)parms[13], 12);
               stmt.setString(11, (String)parms[14], 12);
               stmt.setShort(12, ((Number) parms[15]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
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
               return;
      }
   }

}

