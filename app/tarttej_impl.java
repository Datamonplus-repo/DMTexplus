package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tarttej_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         n65ArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A7949Par_Art = (short)(GXutil.lval( httpContext.GetPar( "Par_Art"))) ;
         A10551Par_NVar = (short)(GXutil.lval( httpContext.GetPar( "Par_NVar"))) ;
         n10551Par_NVar = false ;
         AV35FlagR = (byte)(GXutil.lval( httpContext.GetPar( "FlagR"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35FlagR", GXutil.str( AV35FlagR, 1, 0));
         AV34Msg_err = httpContext.GetPar( "Msg_err") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Msg_err", AV34Msg_err);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_15_10L1112( A396EmprCod, A252CliCod, A65ArtCod, A7949Par_Art, A10551Par_NVar, AV35FlagR, AV34Msg_err) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_21") == 0 )
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
         gxload_21( A396EmprCod, A7949Par_Art) ;
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
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = httpContext.GetPar( "ArtCod") ;
            n65ArtCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "DATOS TEJEDURIA", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtArtDsc_Internalname ;
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
      nRC_GXsfl_65 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_65"))) ;
      nGXsfl_65_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_65_idx"))) ;
      sGXsfl_65_idx = httpContext.GetPar( "sGXsfl_65_idx") ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      AV8UsurCod = httpContext.GetPar( "UsurCod") ;
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

   public tarttej_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tarttej_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tarttej_impl.class ));
   }

   public tarttej_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTTEJ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTTEJ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTTEJ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTTEJ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TARTTEJ.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTTEJ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTTEJ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTTEJ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTTEJ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTTEJ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTTEJ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTTEJ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTTEJ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTTEJ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTTEJ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTTEJ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion Articulo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTTEJ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTTEJ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Mat Maq", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTTEJ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMat_Maq_Internalname, GXutil.rtrim( A6953Mat_Maq), GXutil.rtrim( localUtil.format( A6953Mat_Maq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMat_Maq_Jsonclick, 0, "", "", "", "", "", 1, edtMat_Maq_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTTEJ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Usuario Modif", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTTEJ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMat_UsuM_Internalname, GXutil.rtrim( A10561Mat_UsuM), GXutil.rtrim( localUtil.format( A10561Mat_UsuM, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMat_UsuM_Jsonclick, 0, "", "", "", "", "", 1, edtMat_UsuM_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTTEJ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Fecha Modif", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTTEJ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMat_FecM_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMat_FecM_Internalname, localUtil.ttoc( A10562Mat_FecM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10562Mat_FecM, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMat_FecM_Jsonclick, 0, "", "", "", "", "", 1, edtMat_FecM_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTTEJ.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMat_FecM_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMat_FecM_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TARTTEJ.htm");
      httpContext.writeTextNL( "</div>") ;
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
         nBlankRcdCount1112 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1112 = (short)(1) ;
            scanStart10L1112( ) ;
            while ( RcdFound1112 != 0 )
            {
               init_level_properties1112( ) ;
               getByPrimaryKey10L1112( ) ;
               addRow10L1112( ) ;
               scanNext10L1112( ) ;
            }
            scanEnd10L1112( ) ;
            nBlankRcdCount1112 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B6953Mat_Maq = A6953Mat_Maq ;
         n6953Mat_Maq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6953Mat_Maq", A6953Mat_Maq);
         standaloneNotModal10L1112( ) ;
         standaloneModal10L1112( ) ;
         sMode1112 = Gx_mode ;
         while ( nGXsfl_65_idx < nRC_GXsfl_65 )
         {
            bGXsfl_65_Refreshing = true ;
            readRow10L1112( ) ;
            edtavnRcdDeleted_1112_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1112_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1112_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1112_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtPar_Art_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_ART_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPar_Art_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_Art_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtPar_Dsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_DSC_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPar_Dsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_Dsc_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtPar_ValTj_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_VALTJ_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPar_ValTj_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_ValTj_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtPar_ObsTj_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_OBSTJ_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPar_ObsTj_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_ObsTj_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtPar_TUsM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_TUSM_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPar_TUsM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_TUsM_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtPar_TFcM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_TFCM_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPar_TFcM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_TFcM_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtPar_TUsA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_TUSA_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPar_TUsA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_TUsA_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtPar_TFcA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_TFCA_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPar_TFcA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_TFcA_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtPar_NVar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_NVAR_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPar_NVar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_NVar_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtPar_NVarT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_NVART_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPar_NVarT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_NVarT_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            if ( ( nRcdExists_1112 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal10L1112( ) ;
            }
            sendRow10L1112( ) ;
            bGXsfl_65_Refreshing = false ;
         }
         Gx_mode = sMode1112 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A6953Mat_Maq = B6953Mat_Maq ;
         n6953Mat_Maq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6953Mat_Maq", A6953Mat_Maq);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1112 = (short)(5) ;
         nRcdExists_1112 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart10L1112( ) ;
            while ( RcdFound1112 != 0 )
            {
               sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_651112( ) ;
               init_level_properties1112( ) ;
               standaloneNotModal10L1112( ) ;
               getByPrimaryKey10L1112( ) ;
               standaloneModal10L1112( ) ;
               addRow10L1112( ) ;
               scanNext10L1112( ) ;
            }
            scanEnd10L1112( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1112 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_651112( ) ;
      initAll10L1112( ) ;
      init_level_properties1112( ) ;
      B6953Mat_Maq = A6953Mat_Maq ;
      n6953Mat_Maq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6953Mat_Maq", A6953Mat_Maq);
      nRcdExists_1112 = (short)(0) ;
      nIsMod_1112 = (short)(0) ;
      nRcdDeleted_1112 = (short)(0) ;
      nBlankRcdCount1112 = (short)(nBlankRcdUsr1112+nBlankRcdCount1112) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1112 > 0 )
      {
         standaloneNotModal10L1112( ) ;
         standaloneModal10L1112( ) ;
         addRow10L1112( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtPar_Art_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1112 = (short)(nBlankRcdCount1112-1) ;
      }
      Gx_mode = sMode1112 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A6953Mat_Maq = B6953Mat_Maq ;
      n6953Mat_Maq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6953Mat_Maq", A6953Mat_Maq);
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTTEJ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTTEJ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTTEJ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTTEJ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TARTTEJ.htm");
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
         Z10562Mat_FecM = localUtil.ctot( httpContext.cgiGet( "Z10562Mat_FecM"), 0) ;
         Z69ArtDsc = httpContext.cgiGet( "Z69ArtDsc") ;
         Z6953Mat_Maq = httpContext.cgiGet( "Z6953Mat_Maq") ;
         Z10561Mat_UsuM = httpContext.cgiGet( "Z10561Mat_UsuM") ;
         O6953Mat_Maq = httpContext.cgiGet( "O6953Mat_Maq") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_65 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_65"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
         AV32Modif = httpContext.cgiGet( "vMODIF") ;
         Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV34Msg_err = httpContext.cgiGet( "vMSG_ERR") ;
         AV35FlagR = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         A6953Mat_Maq = httpContext.cgiGet( edtMat_Maq_Internalname) ;
         n6953Mat_Maq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6953Mat_Maq", A6953Mat_Maq);
         A10561Mat_UsuM = httpContext.cgiGet( edtMat_UsuM_Internalname) ;
         n10561Mat_UsuM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10561Mat_UsuM", A10561Mat_UsuM);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtMat_FecM_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "MAT_FECM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMat_FecM_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10562Mat_FecM = GXutil.resetTime( GXutil.nullDate() );
            n10562Mat_FecM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10562Mat_FecM", localUtil.ttoc( A10562Mat_FecM, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A10562Mat_FecM = localUtil.ctot( httpContext.cgiGet( edtMat_FecM_Internalname)) ;
            n10562Mat_FecM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10562Mat_FecM", localUtil.ttoc( A10562Mat_FecM, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = httpContext.GetPar( "ArtCod") ;
            n65ArtCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
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
            initAll10L10( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1112_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1112_Enabled), 5, 0), !bGXsfl_65_Refreshing);
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
      disableAttributes10L10( ) ;
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

   public void confirm_10L0( )
   {
      beforeValidate10L10( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls10L10( ) ;
         }
         else
         {
            checkExtendedTable10L10( ) ;
            if ( AnyError == 0 )
            {
               zm10L10( 18) ;
               zm10L10( 19) ;
            }
            closeExtendedTableCursors10L10( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode10 = Gx_mode ;
         confirm_10L1112( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode10 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues10L0( ) ;
      }
   }

   public void confirm_10L1112( )
   {
      sV32Modif = OV32Modif ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRow10L1112( ) ;
         if ( ( nRcdExists_1112 != 0 ) || ( nIsMod_1112 != 0 ) )
         {
            getKey10L1112( ) ;
            if ( ( nRcdExists_1112 == 0 ) && ( nRcdDeleted_1112 == 0 ) )
            {
               if ( RcdFound1112 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate10L1112( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable10L1112( ) ;
                     if ( AnyError == 0 )
                     {
                        zm10L1112( 21) ;
                     }
                     closeExtendedTableCursors10L1112( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     OV32Modif = AV32Modif ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
                  }
               }
               else
               {
                  GXCCtl = "PAR_ART_" + sGXsfl_65_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPar_Art_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1112 != 0 )
               {
                  if ( nRcdDeleted_1112 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey10L1112( ) ;
                     load10L1112( ) ;
                     beforeValidate10L1112( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls10L1112( ) ;
                        OV32Modif = AV32Modif ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
                     }
                  }
                  else
                  {
                     if ( nIsMod_1112 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate10L1112( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable10L1112( ) ;
                           if ( AnyError == 0 )
                           {
                              zm10L1112( 21) ;
                           }
                           closeExtendedTableCursors10L1112( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           OV32Modif = AV32Modif ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1112 == 0 )
                  {
                     GXCCtl = "PAR_ART_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPar_Art_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1112_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1112, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPar_Art_Internalname, GXutil.ltrim( localUtil.ntoc( A7949Par_Art, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPar_Dsc_Internalname, GXutil.rtrim( A7950Par_Dsc)) ;
         httpContext.changePostValue( edtPar_ValTj_Internalname, GXutil.rtrim( A7954Par_ValTj)) ;
         httpContext.changePostValue( edtPar_ObsTj_Internalname, A7955Par_ObsTj) ;
         httpContext.changePostValue( edtPar_TUsM_Internalname, GXutil.rtrim( A10563Par_TUsM)) ;
         httpContext.changePostValue( edtPar_TFcM_Internalname, localUtil.ttoc( A10564Par_TFcM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtPar_TUsA_Internalname, GXutil.rtrim( A10565Par_TUsA)) ;
         httpContext.changePostValue( edtPar_TFcA_Internalname, localUtil.ttoc( A10566Par_TFcA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtPar_NVar_Internalname, GXutil.ltrim( localUtil.ntoc( A10551Par_NVar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPar_NVarT_Internalname, GXutil.rtrim( A10552Par_NVarT)) ;
         httpContext.changePostValue( "ZT_"+"Z7949Par_Art_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7949Par_Art, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10563Par_TUsM_"+sGXsfl_65_idx, GXutil.rtrim( Z10563Par_TUsM)) ;
         httpContext.changePostValue( "ZT_"+"Z10564Par_TFcM_"+sGXsfl_65_idx, localUtil.ttoc( Z10564Par_TFcM, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10566Par_TFcA_"+sGXsfl_65_idx, localUtil.ttoc( Z10566Par_TFcA, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10565Par_TUsA_"+sGXsfl_65_idx, GXutil.rtrim( Z10565Par_TUsA)) ;
         httpContext.changePostValue( "ZT_"+"Z7954Par_ValTj_"+sGXsfl_65_idx, GXutil.rtrim( Z7954Par_ValTj)) ;
         httpContext.changePostValue( "ZT_"+"Z7955Par_ObsTj_"+sGXsfl_65_idx, Z7955Par_ObsTj) ;
         httpContext.changePostValue( "T7954Par_ValTj_"+sGXsfl_65_idx, GXutil.rtrim( O7954Par_ValTj)) ;
         httpContext.changePostValue( "T7949Par_Art_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( O7949Par_Art, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1112_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1112, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1112_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1112, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1112_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1112, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1112 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1112_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1112_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_ART_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_Art_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_DSC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_Dsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_VALTJ_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_ValTj_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_OBSTJ_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_ObsTj_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_TUSM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_TUsM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_TFCM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_TFcM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_TUSA_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_TUsA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_TFCA_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_TFcA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_NVAR_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_NVar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_NVART_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_NVarT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      OV32Modif = sV32Modif ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption10L0( )
   {
   }

   public void zm10L10( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10562Mat_FecM = T010L6_A10562Mat_FecM[0] ;
            Z69ArtDsc = T010L6_A69ArtDsc[0] ;
            Z6953Mat_Maq = T010L6_A6953Mat_Maq[0] ;
            Z10561Mat_UsuM = T010L6_A10561Mat_UsuM[0] ;
         }
         else
         {
            Z10562Mat_FecM = A10562Mat_FecM ;
            Z69ArtDsc = A69ArtDsc ;
            Z6953Mat_Maq = A6953Mat_Maq ;
            Z10561Mat_UsuM = A10561Mat_UsuM ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z65ArtCod = A65ArtCod ;
         Z10562Mat_FecM = A10562Mat_FecM ;
         Z69ArtDsc = A69ArtDsc ;
         Z6953Mat_Maq = A6953Mat_Maq ;
         Z10561Mat_UsuM = A10561Mat_UsuM ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      if ( 1 < 0 )
      {
         AV8UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      }
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      /* Using cursor T010L7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T010L7_A407EmprNom[0] ;
      n407EmprNom = T010L7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T010L8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T010L8_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
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

   public void load10L10( )
   {
      /* Using cursor T010L9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A10562Mat_FecM = T010L9_A10562Mat_FecM[0] ;
         n10562Mat_FecM = T010L9_n10562Mat_FecM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10562Mat_FecM", localUtil.ttoc( A10562Mat_FecM, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A407EmprNom = T010L9_A407EmprNom[0] ;
         n407EmprNom = T010L9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T010L9_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A69ArtDsc = T010L9_A69ArtDsc[0] ;
         n69ArtDsc = T010L9_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A6953Mat_Maq = T010L9_A6953Mat_Maq[0] ;
         n6953Mat_Maq = T010L9_n6953Mat_Maq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6953Mat_Maq", A6953Mat_Maq);
         A10561Mat_UsuM = T010L9_A10561Mat_UsuM[0] ;
         n10561Mat_UsuM = T010L9_n10561Mat_UsuM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10561Mat_UsuM", A10561Mat_UsuM);
         zm10L10( -17) ;
      }
      pr_default.close(7);
      onLoadActions10L10( ) ;
   }

   public void onLoadActions10L10( )
   {
   }

   public void checkExtendedTable10L10( )
   {
      nIsDirty_10 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors10L10( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey10L10( )
   {
      /* Using cursor T010L10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
      else
      {
         RcdFound10 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T010L6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T010L6_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T010L6_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010L6_A252CliCod[0] == A252CliCod ) )
      {
         zm10L10( 17) ;
         RcdFound10 = (short)(1) ;
         A10562Mat_FecM = T010L6_A10562Mat_FecM[0] ;
         n10562Mat_FecM = T010L6_n10562Mat_FecM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10562Mat_FecM", localUtil.ttoc( A10562Mat_FecM, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A69ArtDsc = T010L6_A69ArtDsc[0] ;
         n69ArtDsc = T010L6_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A6953Mat_Maq = T010L6_A6953Mat_Maq[0] ;
         n6953Mat_Maq = T010L6_n6953Mat_Maq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6953Mat_Maq", A6953Mat_Maq);
         A10561Mat_UsuM = T010L6_A10561Mat_UsuM[0] ;
         n10561Mat_UsuM = T010L6_n10561Mat_UsuM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10561Mat_UsuM", A10561Mat_UsuM);
         O6953Mat_Maq = A6953Mat_Maq ;
         n6953Mat_Maq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6953Mat_Maq", A6953Mat_Maq);
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load10L10( ) ;
         if ( AnyError == 1 )
         {
            RcdFound10 = (short)(0) ;
            initializeNonKey10L10( ) ;
         }
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound10 = (short)(0) ;
         initializeNonKey10L10( ) ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey10L10( ) ;
      if ( RcdFound10 == 0 )
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
      RcdFound10 = (short)(0) ;
      /* Using cursor T010L11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T010L11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010L11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T010L11_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T010L11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010L11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T010L11_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound10 = (short)(0) ;
      /* Using cursor T010L12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T010L12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010L12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T010L12_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T010L12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010L12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T010L12_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey10L10( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         AV32Modif = OV32Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
         GX_FocusControl = edtArtDsc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert10L10( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound10 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               AV32Modif = OV32Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtArtDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               AV32Modif = OV32Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
               update10L10( ) ;
               GX_FocusControl = edtArtDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               AV32Modif = OV32Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
               GX_FocusControl = edtArtDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert10L10( ) ;
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
                  AV32Modif = OV32Modif ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
                  GX_FocusControl = edtArtDsc_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert10L10( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         AV32Modif = OV32Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtArtDsc_Internalname ;
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
      getKey10L10( ) ;
      if ( RcdFound10 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tarttej");
      GX_FocusControl = edtArtDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_10L0( ) ;
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
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtArtDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart10L10( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArtDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd10L10( ) ;
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
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArtDsc_Internalname ;
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
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArtDsc_Internalname ;
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
      scanStart10L10( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound10 != 0 )
         {
            scanNext10L10( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArtDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd10L10( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency10L10( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T010L5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTICU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || !( GXutil.dateCompare(Z10562Mat_FecM, T010L5_A10562Mat_FecM[0]) ) || ( GXutil.strcmp(Z69ArtDsc, T010L5_A69ArtDsc[0]) != 0 ) || ( GXutil.strcmp(Z6953Mat_Maq, T010L5_A6953Mat_Maq[0]) != 0 ) || ( GXutil.strcmp(Z10561Mat_UsuM, T010L5_A10561Mat_UsuM[0]) != 0 ) )
         {
            if ( !( GXutil.dateCompare(Z10562Mat_FecM, T010L5_A10562Mat_FecM[0]) ) )
            {
               GXutil.writeLogln("tarttej:[seudo value changed for attri]"+"Mat_FecM");
               GXutil.writeLogRaw("Old: ",Z10562Mat_FecM);
               GXutil.writeLogRaw("Current: ",T010L5_A10562Mat_FecM[0]);
            }
            if ( GXutil.strcmp(Z69ArtDsc, T010L5_A69ArtDsc[0]) != 0 )
            {
               GXutil.writeLogln("tarttej:[seudo value changed for attri]"+"ArtDsc");
               GXutil.writeLogRaw("Old: ",Z69ArtDsc);
               GXutil.writeLogRaw("Current: ",T010L5_A69ArtDsc[0]);
            }
            if ( GXutil.strcmp(Z6953Mat_Maq, T010L5_A6953Mat_Maq[0]) != 0 )
            {
               GXutil.writeLogln("tarttej:[seudo value changed for attri]"+"Mat_Maq");
               GXutil.writeLogRaw("Old: ",Z6953Mat_Maq);
               GXutil.writeLogRaw("Current: ",T010L5_A6953Mat_Maq[0]);
            }
            if ( GXutil.strcmp(Z10561Mat_UsuM, T010L5_A10561Mat_UsuM[0]) != 0 )
            {
               GXutil.writeLogln("tarttej:[seudo value changed for attri]"+"Mat_UsuM");
               GXutil.writeLogRaw("Old: ",Z10561Mat_UsuM);
               GXutil.writeLogRaw("Current: ",T010L5_A10561Mat_UsuM[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPARTICU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert10L10( )
   {
      beforeValidate10L10( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10L10( ) ;
      }
      if ( AnyError == 0 )
      {
         zm10L10( 0) ;
         checkOptimisticConcurrency10L10( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10L10( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert10L10( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010L13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n10562Mat_FecM), A10562Mat_FecM, Boolean.valueOf(n69ArtDsc), A69ArtDsc, Boolean.valueOf(n6953Mat_Maq), A6953Mat_Maq, Boolean.valueOf(n10561Mat_UsuM), A10561Mat_UsuM, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
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
                        processLevel10L10( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption10L0( ) ;
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
            load10L10( ) ;
         }
         endLevel10L10( ) ;
      }
      closeExtendedTableCursors10L10( ) ;
   }

   public void update10L10( )
   {
      beforeValidate10L10( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10L10( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10L10( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10L10( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate10L10( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010L14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n10562Mat_FecM), A10562Mat_FecM, Boolean.valueOf(n69ArtDsc), A69ArtDsc, Boolean.valueOf(n6953Mat_Maq), A6953Mat_Maq, Boolean.valueOf(n10561Mat_UsuM), A10561Mat_UsuM, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTICU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate10L10( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char1[0] = A396EmprCod ;
                     GXv_int2[0] = A252CliCod ;
                     GXv_char3[0] = A65ArtCod ;
                     new app.txparticuupdateredundancy(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3) ;
                     tarttej_impl.this.A396EmprCod = GXv_char1[0] ;
                     tarttej_impl.this.A252CliCod = GXv_int2[0] ;
                     tarttej_impl.this.A65ArtCod = GXv_char3[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel10L10( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption10L0( ) ;
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
         endLevel10L10( ) ;
      }
      closeExtendedTableCursors10L10( ) ;
   }

   public void deferredUpdate10L10( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate10L10( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10L10( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls10L10( ) ;
         afterConfirm10L10( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete10L10( ) ;
            if ( AnyError == 0 )
            {
               AV32Modif = OV32Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
               scanStart10L1112( ) ;
               while ( RcdFound1112 != 0 )
               {
                  getByPrimaryKey10L1112( ) ;
                  delete10L1112( ) ;
                  scanNext10L1112( ) ;
                  OV32Modif = AV32Modif ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
               }
               scanEnd10L1112( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010L15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound10 == 0 )
                        {
                           initAll10L10( ) ;
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
                        resetCaption10L0( ) ;
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
      sMode10 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel10L10( ) ;
      Gx_mode = sMode10 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls10L10( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T010L16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Familia Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T010L17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T010L18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T010L19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Consumos Lab. JBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T010L20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MEZCLAS CLIENTE MATERIAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T010L21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS COMPOSICION MEZCLAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T010L22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "recest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T010L23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T010L24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPEDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T010L25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCARC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T010L26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO PRECIOS ARTICULO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T010L27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INCREMENTO PRECIO INTENSIDAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T010L28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECIO GLOBA COLOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T010L29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TR02JL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T010L30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLATFA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T010L31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTMQT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T010L32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PVPNITp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T010L33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEJART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T010L34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TNART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T010L35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TNARTp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T010L36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARTINa", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T010L37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTMAT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T010L38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T010L39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ESTAD.CLIENTE/ART/T.ART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T010L40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Modelos de Confección", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T010L41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "WebEmp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T010L42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ACATEXGB.WEBDIS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T010L43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSerie", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T010L44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRECO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T010L45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINPRE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T010L46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PedPro", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T010L47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T010L48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T010L49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANBRL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T010L50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECAP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T010L51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARSER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T010L52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cod Calidad por Articulo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T010L53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTINT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T010L54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T010L55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T010L56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPREPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T010L57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T010L58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRETCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T010L59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
      }
   }

   public void processNestedLevel10L1112( )
   {
      sV32Modif = OV32Modif ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRow10L1112( ) ;
         if ( ( nRcdExists_1112 != 0 ) || ( nIsMod_1112 != 0 ) )
         {
            standaloneNotModal10L1112( ) ;
            getKey10L1112( ) ;
            if ( ( nRcdExists_1112 == 0 ) && ( nRcdDeleted_1112 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert10L1112( ) ;
            }
            else
            {
               if ( RcdFound1112 != 0 )
               {
                  if ( ( nRcdDeleted_1112 != 0 ) && ( nRcdExists_1112 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete10L1112( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1112 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update10L1112( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1112 == 0 )
                  {
                     GXCCtl = "PAR_ART_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPar_Art_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            OV32Modif = AV32Modif ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
         }
         httpContext.changePostValue( edtavnRcdDeleted_1112_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1112, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPar_Art_Internalname, GXutil.ltrim( localUtil.ntoc( A7949Par_Art, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPar_Dsc_Internalname, GXutil.rtrim( A7950Par_Dsc)) ;
         httpContext.changePostValue( edtPar_ValTj_Internalname, GXutil.rtrim( A7954Par_ValTj)) ;
         httpContext.changePostValue( edtPar_ObsTj_Internalname, A7955Par_ObsTj) ;
         httpContext.changePostValue( edtPar_TUsM_Internalname, GXutil.rtrim( A10563Par_TUsM)) ;
         httpContext.changePostValue( edtPar_TFcM_Internalname, localUtil.ttoc( A10564Par_TFcM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtPar_TUsA_Internalname, GXutil.rtrim( A10565Par_TUsA)) ;
         httpContext.changePostValue( edtPar_TFcA_Internalname, localUtil.ttoc( A10566Par_TFcA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtPar_NVar_Internalname, GXutil.ltrim( localUtil.ntoc( A10551Par_NVar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPar_NVarT_Internalname, GXutil.rtrim( A10552Par_NVarT)) ;
         httpContext.changePostValue( "ZT_"+"Z7949Par_Art_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7949Par_Art, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10563Par_TUsM_"+sGXsfl_65_idx, GXutil.rtrim( Z10563Par_TUsM)) ;
         httpContext.changePostValue( "ZT_"+"Z10564Par_TFcM_"+sGXsfl_65_idx, localUtil.ttoc( Z10564Par_TFcM, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10566Par_TFcA_"+sGXsfl_65_idx, localUtil.ttoc( Z10566Par_TFcA, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10565Par_TUsA_"+sGXsfl_65_idx, GXutil.rtrim( Z10565Par_TUsA)) ;
         httpContext.changePostValue( "ZT_"+"Z7954Par_ValTj_"+sGXsfl_65_idx, GXutil.rtrim( Z7954Par_ValTj)) ;
         httpContext.changePostValue( "ZT_"+"Z7955Par_ObsTj_"+sGXsfl_65_idx, Z7955Par_ObsTj) ;
         httpContext.changePostValue( "T7954Par_ValTj_"+sGXsfl_65_idx, GXutil.rtrim( O7954Par_ValTj)) ;
         httpContext.changePostValue( "T7949Par_Art_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( O7949Par_Art, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1112_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1112, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1112_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1112, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1112_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1112, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1112 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1112_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1112_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_ART_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_Art_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_DSC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_Dsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_VALTJ_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_ValTj_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_OBSTJ_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_ObsTj_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_TUSM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_TUsM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_TFCM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_TFcM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_TUSA_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_TUsA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_TFCA_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_TFcA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_NVAR_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_NVar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAR_NVART_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_NVarT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll10L1112( ) ;
      if ( AnyError != 0 )
      {
         OV32Modif = sV32Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
      }
      nRcdExists_1112 = (short)(0) ;
      nIsMod_1112 = (short)(0) ;
      nRcdDeleted_1112 = (short)(0) ;
   }

   public void processLevel10L10( )
   {
      /* Save parent mode. */
      sMode10 = Gx_mode ;
      processNestedLevel10L1112( ) ;
      if ( AnyError != 0 )
      {
         OV32Modif = sV32Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
      }
      /* Restore parent mode. */
      Gx_mode = sMode10 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel10L10( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete10L10( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tarttej");
         if ( AnyError == 0 )
         {
            confirmValues10L0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tarttej");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart10L10( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A252CliCod = A252CliCod ;
      this.A65ArtCod = A65ArtCod ;
      /* Scan By routine */
      /* Using cursor T010L60 */
      pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(58) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext10L10( )
   {
      /* Scan next routine */
      pr_default.readNext(58);
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(58) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
   }

   public void scanEnd10L10( )
   {
      pr_default.close(58);
   }

   public void afterConfirm10L10( )
   {
      /* After Confirm Rules */
      if ( true /* Level */ && true /* After */ )
      {
         AV32Modif = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
      }
      if ( true /* After */ && ( GXutil.strcmp(A6953Mat_Maq, O6953Mat_Maq) != 0 ) )
      {
         A10562Mat_FecM = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n10562Mat_FecM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10562Mat_FecM", localUtil.ttoc( A10562Mat_FecM, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( true /* After */ && ( GXutil.strcmp(A6953Mat_Maq, O6953Mat_Maq) != 0 ) )
      {
         A10561Mat_UsuM = AV8UsurCod ;
         n10561Mat_UsuM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10561Mat_UsuM", A10561Mat_UsuM);
      }
   }

   public void beforeInsert10L10( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate10L10( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete10L10( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete10L10( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate10L10( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes10L10( )
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
      edtMat_Maq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_Maq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_Maq_Enabled), 5, 0), true);
      edtMat_UsuM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_UsuM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_UsuM_Enabled), 5, 0), true);
      edtMat_FecM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_FecM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_FecM_Enabled), 5, 0), true);
   }

   public void zm10L1112( int GX_JID )
   {
      if ( ( GX_JID == 20 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10563Par_TUsM = T010L3_A10563Par_TUsM[0] ;
            Z10564Par_TFcM = T010L3_A10564Par_TFcM[0] ;
            Z10566Par_TFcA = T010L3_A10566Par_TFcA[0] ;
            Z10565Par_TUsA = T010L3_A10565Par_TUsA[0] ;
            Z7954Par_ValTj = T010L3_A7954Par_ValTj[0] ;
            Z7955Par_ObsTj = T010L3_A7955Par_ObsTj[0] ;
         }
         else
         {
            Z10563Par_TUsM = A10563Par_TUsM ;
            Z10564Par_TFcM = A10564Par_TFcM ;
            Z10566Par_TFcA = A10566Par_TFcA ;
            Z10565Par_TUsA = A10565Par_TUsA ;
            Z7954Par_ValTj = A7954Par_ValTj ;
            Z7955Par_ObsTj = A7955Par_ObsTj ;
         }
      }
      if ( GX_JID == -20 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z10563Par_TUsM = A10563Par_TUsM ;
         Z10564Par_TFcM = A10564Par_TFcM ;
         Z10566Par_TFcA = A10566Par_TFcA ;
         Z10565Par_TUsA = A10565Par_TUsA ;
         Z7954Par_ValTj = A7954Par_ValTj ;
         Z7955Par_ObsTj = A7955Par_ObsTj ;
         Z396EmprCod = A396EmprCod ;
         Z7949Par_Art = A7949Par_Art ;
         Z7950Par_Dsc = A7950Par_Dsc ;
         Z10551Par_NVar = A10551Par_NVar ;
         Z10552Par_NVarT = A10552Par_NVarT ;
      }
   }

   public void standaloneNotModal10L1112( )
   {
      edtPar_TFcM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_TFcM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_TFcM_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtPar_TUsM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_TUsM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_TUsM_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtPar_TFcA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_TFcA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_TFcA_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtPar_TUsA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_TUsA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_TUsA_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void standaloneModal10L1112( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         AV32Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A10566Par_TFcA) && ( Gx_BScreen == 0 ) )
      {
         A10566Par_TFcA = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n10566Par_TFcA = false ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A10565Par_TUsA)==0) && ( Gx_BScreen == 0 ) )
      {
         A10565Par_TUsA = AV8UsurCod ;
         n10565Par_TUsA = false ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPar_Art_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPar_Art_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_Art_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      else
      {
         edtPar_Art_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPar_Art_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_Art_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
   }

   public void load10L1112( )
   {
      /* Using cursor T010L61 */
      pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Short.valueOf(A7949Par_Art)});
      if ( (pr_default.getStatus(59) != 101) )
      {
         RcdFound1112 = (short)(1) ;
         A10563Par_TUsM = T010L61_A10563Par_TUsM[0] ;
         n10563Par_TUsM = T010L61_n10563Par_TUsM[0] ;
         A10564Par_TFcM = T010L61_A10564Par_TFcM[0] ;
         n10564Par_TFcM = T010L61_n10564Par_TFcM[0] ;
         A10566Par_TFcA = T010L61_A10566Par_TFcA[0] ;
         n10566Par_TFcA = T010L61_n10566Par_TFcA[0] ;
         A10565Par_TUsA = T010L61_A10565Par_TUsA[0] ;
         n10565Par_TUsA = T010L61_n10565Par_TUsA[0] ;
         A7950Par_Dsc = T010L61_A7950Par_Dsc[0] ;
         n7950Par_Dsc = T010L61_n7950Par_Dsc[0] ;
         A7954Par_ValTj = T010L61_A7954Par_ValTj[0] ;
         n7954Par_ValTj = T010L61_n7954Par_ValTj[0] ;
         A7955Par_ObsTj = T010L61_A7955Par_ObsTj[0] ;
         n7955Par_ObsTj = T010L61_n7955Par_ObsTj[0] ;
         A10551Par_NVar = T010L61_A10551Par_NVar[0] ;
         n10551Par_NVar = T010L61_n10551Par_NVar[0] ;
         A10552Par_NVarT = T010L61_A10552Par_NVarT[0] ;
         n10552Par_NVarT = T010L61_n10552Par_NVarT[0] ;
         zm10L1112( -20) ;
      }
      pr_default.close(59);
      onLoadActions10L1112( ) ;
   }

   public void onLoadActions10L1112( )
   {
   }

   public void checkExtendedTable10L1112( )
   {
      nIsDirty_1112 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal10L1112( ) ;
      /* Using cursor T010L4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A7949Par_Art)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PAR_ART_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTPAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPar_Art_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A7950Par_Dsc = T010L4_A7950Par_Dsc[0] ;
      n7950Par_Dsc = T010L4_n7950Par_Dsc[0] ;
      A10551Par_NVar = T010L4_A10551Par_NVar[0] ;
      n10551Par_NVar = T010L4_n10551Par_NVar[0] ;
      A10552Par_NVarT = T010L4_A10552Par_NVarT[0] ;
      n10552Par_NVarT = T010L4_n10552Par_NVarT[0] ;
      pr_default.close(2);
      if ( true /* After */ && ( A7949Par_Art > 0 ) && ( A10551Par_NVar > 0 ) )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int2[0] = A252CliCod ;
         GXv_char1[0] = A65ArtCod ;
         GXv_int4[0] = A7949Par_Art ;
         GXv_int5[0] = A10551Par_NVar ;
         GXv_int6[0] = AV35FlagR ;
         GXv_char7[0] = AV34Msg_err ;
         new app.partpar1(remoteHandle, context).execute( GXv_char3, GXv_int2, GXv_char1, GXv_int4, GXv_int5, GXv_int6, GXv_char7) ;
         tarttej_impl.this.A396EmprCod = GXv_char3[0] ;
         tarttej_impl.this.A252CliCod = GXv_int2[0] ;
         tarttej_impl.this.A65ArtCod = GXv_char1[0] ;
         tarttej_impl.this.A7949Par_Art = GXv_int4[0] ;
         tarttej_impl.this.A10551Par_NVar = GXv_int5[0] ;
         tarttej_impl.this.AV35FlagR = GXv_int6[0] ;
         tarttej_impl.this.AV34Msg_err = GXv_char7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV35FlagR", GXutil.str( AV35FlagR, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Msg_err", AV34Msg_err);
      }
      if ( ( AV35FlagR == 1 ) && true /* After */ && ( A7949Par_Art > 0 ) && ( A10551Par_NVar > 0 ) )
      {
         GXCCtl = "PAR_ART_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(AV34Msg_err, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPar_Art_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors10L1112( )
   {
      pr_default.close(2);
   }

   public void enableDisable10L1112( )
   {
   }

   public void gxload_21( String A396EmprCod ,
                          short A7949Par_Art )
   {
      /* Using cursor T010L62 */
      pr_default.execute(60, new Object[] {A396EmprCod, Short.valueOf(A7949Par_Art)});
      if ( (pr_default.getStatus(60) == 101) )
      {
         GXCCtl = "PAR_ART_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTPAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPar_Art_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A7950Par_Dsc = T010L62_A7950Par_Dsc[0] ;
      n7950Par_Dsc = T010L62_n7950Par_Dsc[0] ;
      A10551Par_NVar = T010L62_A10551Par_NVar[0] ;
      n10551Par_NVar = T010L62_n10551Par_NVar[0] ;
      A10552Par_NVarT = T010L62_A10552Par_NVarT[0] ;
      n10552Par_NVarT = T010L62_n10552Par_NVarT[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7950Par_Dsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A10551Par_NVar, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10552Par_NVarT))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(60) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(60);
   }

   public void getKey10L1112( )
   {
      /* Using cursor T010L63 */
      pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Short.valueOf(A7949Par_Art)});
      if ( (pr_default.getStatus(61) != 101) )
      {
         RcdFound1112 = (short)(1) ;
      }
      else
      {
         RcdFound1112 = (short)(0) ;
      }
      pr_default.close(61);
   }

   public void getByPrimaryKey10L1112( )
   {
      /* Using cursor T010L3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Short.valueOf(A7949Par_Art)});
      if ( (pr_default.getStatus(1) != 101) && ( T010L3_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T010L3_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T010L3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm10L1112( 20) ;
         RcdFound1112 = (short)(1) ;
         initializeNonKey10L1112( ) ;
         A10563Par_TUsM = T010L3_A10563Par_TUsM[0] ;
         n10563Par_TUsM = T010L3_n10563Par_TUsM[0] ;
         A10564Par_TFcM = T010L3_A10564Par_TFcM[0] ;
         n10564Par_TFcM = T010L3_n10564Par_TFcM[0] ;
         A10566Par_TFcA = T010L3_A10566Par_TFcA[0] ;
         n10566Par_TFcA = T010L3_n10566Par_TFcA[0] ;
         A10565Par_TUsA = T010L3_A10565Par_TUsA[0] ;
         n10565Par_TUsA = T010L3_n10565Par_TUsA[0] ;
         A7954Par_ValTj = T010L3_A7954Par_ValTj[0] ;
         n7954Par_ValTj = T010L3_n7954Par_ValTj[0] ;
         A7955Par_ObsTj = T010L3_A7955Par_ObsTj[0] ;
         n7955Par_ObsTj = T010L3_n7955Par_ObsTj[0] ;
         A7949Par_Art = T010L3_A7949Par_Art[0] ;
         O7954Par_ValTj = A7954Par_ValTj ;
         n7954Par_ValTj = false ;
         O7949Par_Art = A7949Par_Art ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z7949Par_Art = A7949Par_Art ;
         sMode1112 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal10L1112( ) ;
         load10L1112( ) ;
         Gx_mode = sMode1112 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1112 = (short)(0) ;
         initializeNonKey10L1112( ) ;
         sMode1112 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal10L1112( ) ;
         Gx_mode = sMode1112 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes10L1112( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency10L1112( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T010L2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Short.valueOf(A7949Par_Art)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTTEJ"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10563Par_TUsM, T010L2_A10563Par_TUsM[0]) != 0 ) || !( GXutil.dateCompare(Z10564Par_TFcM, T010L2_A10564Par_TFcM[0]) ) || !( GXutil.dateCompare(Z10566Par_TFcA, T010L2_A10566Par_TFcA[0]) ) || ( GXutil.strcmp(Z10565Par_TUsA, T010L2_A10565Par_TUsA[0]) != 0 ) || ( GXutil.strcmp(Z7954Par_ValTj, T010L2_A7954Par_ValTj[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7955Par_ObsTj, T010L2_A7955Par_ObsTj[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z10563Par_TUsM, T010L2_A10563Par_TUsM[0]) != 0 )
            {
               GXutil.writeLogln("tarttej:[seudo value changed for attri]"+"Par_TUsM");
               GXutil.writeLogRaw("Old: ",Z10563Par_TUsM);
               GXutil.writeLogRaw("Current: ",T010L2_A10563Par_TUsM[0]);
            }
            if ( !( GXutil.dateCompare(Z10564Par_TFcM, T010L2_A10564Par_TFcM[0]) ) )
            {
               GXutil.writeLogln("tarttej:[seudo value changed for attri]"+"Par_TFcM");
               GXutil.writeLogRaw("Old: ",Z10564Par_TFcM);
               GXutil.writeLogRaw("Current: ",T010L2_A10564Par_TFcM[0]);
            }
            if ( !( GXutil.dateCompare(Z10566Par_TFcA, T010L2_A10566Par_TFcA[0]) ) )
            {
               GXutil.writeLogln("tarttej:[seudo value changed for attri]"+"Par_TFcA");
               GXutil.writeLogRaw("Old: ",Z10566Par_TFcA);
               GXutil.writeLogRaw("Current: ",T010L2_A10566Par_TFcA[0]);
            }
            if ( GXutil.strcmp(Z10565Par_TUsA, T010L2_A10565Par_TUsA[0]) != 0 )
            {
               GXutil.writeLogln("tarttej:[seudo value changed for attri]"+"Par_TUsA");
               GXutil.writeLogRaw("Old: ",Z10565Par_TUsA);
               GXutil.writeLogRaw("Current: ",T010L2_A10565Par_TUsA[0]);
            }
            if ( GXutil.strcmp(Z7954Par_ValTj, T010L2_A7954Par_ValTj[0]) != 0 )
            {
               GXutil.writeLogln("tarttej:[seudo value changed for attri]"+"Par_ValTj");
               GXutil.writeLogRaw("Old: ",Z7954Par_ValTj);
               GXutil.writeLogRaw("Current: ",T010L2_A7954Par_ValTj[0]);
            }
            if ( GXutil.strcmp(Z7955Par_ObsTj, T010L2_A7955Par_ObsTj[0]) != 0 )
            {
               GXutil.writeLogln("tarttej:[seudo value changed for attri]"+"Par_ObsTj");
               GXutil.writeLogRaw("Old: ",Z7955Par_ObsTj);
               GXutil.writeLogRaw("Current: ",T010L2_A7955Par_ObsTj[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPARTTEJ"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert10L1112( )
   {
      beforeValidate10L1112( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10L1112( ) ;
      }
      if ( AnyError == 0 )
      {
         zm10L1112( 0) ;
         checkOptimisticConcurrency10L1112( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10L1112( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert10L1112( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010L64 */
                  pr_default.execute(62, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n10563Par_TUsM), A10563Par_TUsM, Boolean.valueOf(n10564Par_TFcM), A10564Par_TFcM, Boolean.valueOf(n10566Par_TFcA), A10566Par_TFcA, Boolean.valueOf(n10565Par_TUsA), A10565Par_TUsA, Boolean.valueOf(n7954Par_ValTj), A7954Par_ValTj, Boolean.valueOf(n7955Par_ObsTj), A7955Par_ObsTj, A396EmprCod, Short.valueOf(A7949Par_Art)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTTEJ");
                  if ( (pr_default.getStatus(62) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( ( ( ( ( A7949Par_Art != O7949Par_Art ) ) && true /* After */ ) || true /* After */ || isDlt( )  ) && true /* Level */ )
                     {
                        AV32Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
                     }
                     else
                     {
                        if ( ( ( ( ( GXutil.strcmp(A7954Par_ValTj, O7954Par_ValTj) != 0 ) ) && true /* After */ ) || true /* After */ || isDlt( )  ) && true /* Level */ )
                        {
                           AV32Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
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
            load10L1112( ) ;
         }
         endLevel10L1112( ) ;
      }
      closeExtendedTableCursors10L1112( ) ;
   }

   public void update10L1112( )
   {
      beforeValidate10L1112( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10L1112( ) ;
      }
      if ( ( nIsMod_1112 != 0 ) || ( nIsDirty_1112 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency10L1112( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm10L1112( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate10L1112( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T010L65 */
                     pr_default.execute(63, new Object[] {Boolean.valueOf(n10563Par_TUsM), A10563Par_TUsM, Boolean.valueOf(n10564Par_TFcM), A10564Par_TFcM, Boolean.valueOf(n10566Par_TFcA), A10566Par_TFcA, Boolean.valueOf(n10565Par_TUsA), A10565Par_TUsA, Boolean.valueOf(n7954Par_ValTj), A7954Par_ValTj, Boolean.valueOf(n7955Par_ObsTj), A7955Par_ObsTj, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Short.valueOf(A7949Par_Art)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTTEJ");
                     if ( (pr_default.getStatus(63) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTTEJ"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate10L1112( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char7[0] = A396EmprCod ;
                        GXv_int2[0] = A252CliCod ;
                        GXv_char3[0] = A65ArtCod ;
                        new app.txparticuupdateredundancy(remoteHandle, context).execute( GXv_char7, GXv_int2, GXv_char3) ;
                        tarttej_impl.this.A396EmprCod = GXv_char7[0] ;
                        tarttej_impl.this.A252CliCod = GXv_int2[0] ;
                        tarttej_impl.this.A65ArtCod = GXv_char3[0] ;
                        /* Start of After( update) rules */
                        if ( ( ( ( ( A7949Par_Art != O7949Par_Art ) ) && true /* After */ ) || true /* After */ || isDlt( )  ) && true /* Level */ )
                        {
                           AV32Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
                        }
                        else
                        {
                           if ( ( ( ( ( GXutil.strcmp(A7954Par_ValTj, O7954Par_ValTj) != 0 ) ) && true /* After */ ) || true /* After */ || isDlt( )  ) && true /* Level */ )
                           {
                              AV32Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
                           }
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey10L1112( ) ;
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
            endLevel10L1112( ) ;
         }
      }
      closeExtendedTableCursors10L1112( ) ;
   }

   public void deferredUpdate10L1112( )
   {
   }

   public void delete10L1112( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate10L1112( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10L1112( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls10L1112( ) ;
         afterConfirm10L1112( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete10L1112( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T010L66 */
               pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Short.valueOf(A7949Par_Art)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTTEJ");
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
      sMode1112 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel10L1112( ) ;
      Gx_mode = sMode1112 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls10L1112( )
   {
      standaloneModal10L1112( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T010L67 */
         pr_default.execute(65, new Object[] {A396EmprCod, Short.valueOf(A7949Par_Art)});
         A7950Par_Dsc = T010L67_A7950Par_Dsc[0] ;
         n7950Par_Dsc = T010L67_n7950Par_Dsc[0] ;
         A10551Par_NVar = T010L67_A10551Par_NVar[0] ;
         n10551Par_NVar = T010L67_n10551Par_NVar[0] ;
         A10552Par_NVarT = T010L67_A10552Par_NVarT[0] ;
         n10552Par_NVarT = T010L67_n10552Par_NVarT[0] ;
         pr_default.close(65);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T010L68 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Short.valueOf(A7949Par_Art)});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TNARTp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
      }
   }

   public void endLevel10L1112( )
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

   public void scanStart10L1112( )
   {
      /* Scan By routine */
      /* Using cursor T010L69 */
      pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      RcdFound1112 = (short)(0) ;
      if ( (pr_default.getStatus(67) != 101) )
      {
         RcdFound1112 = (short)(1) ;
         A7949Par_Art = T010L69_A7949Par_Art[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext10L1112( )
   {
      /* Scan next routine */
      pr_default.readNext(67);
      RcdFound1112 = (short)(0) ;
      if ( (pr_default.getStatus(67) != 101) )
      {
         RcdFound1112 = (short)(1) ;
         A7949Par_Art = T010L69_A7949Par_Art[0] ;
      }
   }

   public void scanEnd10L1112( )
   {
      pr_default.close(67);
   }

   public void afterConfirm10L1112( )
   {
      /* After Confirm Rules */
      if ( true /* After */ && ( GXutil.strcmp(A7954Par_ValTj, O7954Par_ValTj) != 0 ) )
      {
         A10563Par_TUsM = AV8UsurCod ;
         n10563Par_TUsM = false ;
      }
      if ( true /* After */ && ( GXutil.strcmp(A7954Par_ValTj, O7954Par_ValTj) != 0 ) )
      {
         A10564Par_TFcM = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n10564Par_TFcM = false ;
      }
   }

   public void beforeInsert10L1112( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate10L1112( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete10L1112( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete10L1112( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate10L1112( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes10L1112( )
   {
      edtPar_Art_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_Art_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_Art_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtPar_Dsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_Dsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_Dsc_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtPar_ValTj_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_ValTj_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_ValTj_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtPar_ObsTj_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_ObsTj_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_ObsTj_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtPar_TUsM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_TUsM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_TUsM_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtPar_TFcM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_TFcM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_TFcM_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtPar_TUsA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_TUsA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_TUsA_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtPar_TFcA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_TFcA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_TFcA_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtPar_NVar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_NVar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_NVar_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtPar_NVarT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_NVarT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_NVarT_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void send_integrity_lvl_hashes10L1112( )
   {
   }

   public void send_integrity_lvl_hashes10L10( )
   {
   }

   public void subsflControlProps_651112( )
   {
      edtavnRcdDeleted_1112_Internalname = "vNRCDDELETED_1112_"+sGXsfl_65_idx ;
      edtPar_Art_Internalname = "PAR_ART_"+sGXsfl_65_idx ;
      edtPar_Dsc_Internalname = "PAR_DSC_"+sGXsfl_65_idx ;
      edtPar_ValTj_Internalname = "PAR_VALTJ_"+sGXsfl_65_idx ;
      edtPar_ObsTj_Internalname = "PAR_OBSTJ_"+sGXsfl_65_idx ;
      edtPar_TUsM_Internalname = "PAR_TUSM_"+sGXsfl_65_idx ;
      edtPar_TFcM_Internalname = "PAR_TFCM_"+sGXsfl_65_idx ;
      edtPar_TUsA_Internalname = "PAR_TUSA_"+sGXsfl_65_idx ;
      edtPar_TFcA_Internalname = "PAR_TFCA_"+sGXsfl_65_idx ;
      edtPar_NVar_Internalname = "PAR_NVAR_"+sGXsfl_65_idx ;
      edtPar_NVarT_Internalname = "PAR_NVART_"+sGXsfl_65_idx ;
   }

   public void subsflControlProps_fel_651112( )
   {
      edtavnRcdDeleted_1112_Internalname = "vNRCDDELETED_1112_"+sGXsfl_65_fel_idx ;
      edtPar_Art_Internalname = "PAR_ART_"+sGXsfl_65_fel_idx ;
      edtPar_Dsc_Internalname = "PAR_DSC_"+sGXsfl_65_fel_idx ;
      edtPar_ValTj_Internalname = "PAR_VALTJ_"+sGXsfl_65_fel_idx ;
      edtPar_ObsTj_Internalname = "PAR_OBSTJ_"+sGXsfl_65_fel_idx ;
      edtPar_TUsM_Internalname = "PAR_TUSM_"+sGXsfl_65_fel_idx ;
      edtPar_TFcM_Internalname = "PAR_TFCM_"+sGXsfl_65_fel_idx ;
      edtPar_TUsA_Internalname = "PAR_TUSA_"+sGXsfl_65_fel_idx ;
      edtPar_TFcA_Internalname = "PAR_TFCA_"+sGXsfl_65_fel_idx ;
      edtPar_NVar_Internalname = "PAR_NVAR_"+sGXsfl_65_fel_idx ;
      edtPar_NVarT_Internalname = "PAR_NVART_"+sGXsfl_65_fel_idx ;
   }

   public void addRow10L1112( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651112( ) ;
      sendRow10L1112( ) ;
   }

   public void sendRow10L1112( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1112_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1112_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1112, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1112_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1112), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1112), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1112_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1112_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1112_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPar_Art_Internalname,GXutil.ltrim( localUtil.ntoc( A7949Par_Art, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7949Par_Art), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPar_Art_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPar_Art_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPar_Dsc_Internalname,GXutil.rtrim( A7950Par_Dsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPar_Dsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPar_Dsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1112_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPar_ValTj_Internalname,GXutil.rtrim( A7954Par_ValTj),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPar_ValTj_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPar_ValTj_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1112_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPar_ObsTj_Internalname,A7955Par_ObsTj,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,70);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPar_ObsTj_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPar_ObsTj_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(400),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPar_TUsM_Internalname,GXutil.rtrim( A10563Par_TUsM),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPar_TUsM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPar_TUsM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPar_TFcM_Internalname,localUtil.ttoc( A10564Par_TFcM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10564Par_TFcM, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPar_TFcM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPar_TFcM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPar_TUsA_Internalname,GXutil.rtrim( A10565Par_TUsA),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPar_TUsA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPar_TUsA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPar_TFcA_Internalname,localUtil.ttoc( A10566Par_TFcA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10566Par_TFcA, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPar_TFcA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPar_TFcA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPar_NVar_Internalname,GXutil.ltrim( localUtil.ntoc( A10551Par_NVar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPar_NVar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10551Par_NVar), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10551Par_NVar), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPar_NVar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPar_NVar_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPar_NVarT_Internalname,GXutil.rtrim( A10552Par_NVarT),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPar_NVarT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPar_NVarT_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes10L1112( ) ;
      GXCCtl = "Z7949Par_Art_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7949Par_Art, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10563Par_TUsM_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10563Par_TUsM));
      GXCCtl = "Z10564Par_TFcM_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z10564Par_TFcM, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z10566Par_TFcA_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z10566Par_TFcA, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z10565Par_TUsA_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10565Par_TUsA));
      GXCCtl = "Z7954Par_ValTj_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7954Par_ValTj));
      GXCCtl = "Z7955Par_ObsTj_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z7955Par_ObsTj);
      GXCCtl = "O7954Par_ValTj_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O7954Par_ValTj));
      GXCCtl = "O7949Par_Art_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O7949Par_Art, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1112_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1112, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1112_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1112, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1112_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1112, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1112_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1112_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAR_ART_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_Art_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAR_DSC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_Dsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAR_VALTJ_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_ValTj_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAR_OBSTJ_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_ObsTj_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAR_TUSM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_TUsM_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAR_TFCM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_TFcM_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAR_TUSA_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_TUsA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAR_TFCA_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_TFcA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAR_NVAR_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_NVar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAR_NVART_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_NVarT_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow10L1112( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651112( ) ;
      edtavnRcdDeleted_1112_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1112_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPar_Art_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_ART_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPar_Dsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_DSC_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPar_ValTj_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_VALTJ_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPar_ObsTj_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_OBSTJ_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPar_TUsM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_TUSM_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPar_TFcM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_TFCM_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPar_TUsA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_TUSA_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPar_TFcA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_TFCA_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPar_NVar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_NVAR_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPar_NVarT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAR_NVART_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1112_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1112_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1112");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1112_Internalname ;
         wbErr = true ;
         nRcdDeleted_1112 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1112 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1112_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPar_Art_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPar_Art_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PAR_ART_" + sGXsfl_65_idx ;
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
      A7954Par_ValTj = httpContext.cgiGet( edtPar_ValTj_Internalname) ;
      n7954Par_ValTj = false ;
      A7955Par_ObsTj = httpContext.cgiGet( edtPar_ObsTj_Internalname) ;
      n7955Par_ObsTj = false ;
      A10563Par_TUsM = httpContext.cgiGet( edtPar_TUsM_Internalname) ;
      n10563Par_TUsM = false ;
      A10564Par_TFcM = localUtil.ctot( httpContext.cgiGet( edtPar_TFcM_Internalname)) ;
      n10564Par_TFcM = false ;
      A10565Par_TUsA = httpContext.cgiGet( edtPar_TUsA_Internalname) ;
      n10565Par_TUsA = false ;
      A10566Par_TFcA = localUtil.ctot( httpContext.cgiGet( edtPar_TFcA_Internalname)) ;
      n10566Par_TFcA = false ;
      A10551Par_NVar = (short)(localUtil.ctol( httpContext.cgiGet( edtPar_NVar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n10551Par_NVar = false ;
      A10552Par_NVarT = httpContext.cgiGet( edtPar_NVarT_Internalname) ;
      n10552Par_NVarT = false ;
      GXCCtl = "Z7949Par_Art_" + sGXsfl_65_idx ;
      Z7949Par_Art = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10563Par_TUsM_" + sGXsfl_65_idx ;
      Z10563Par_TUsM = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10564Par_TFcM_" + sGXsfl_65_idx ;
      Z10564Par_TFcM = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z10566Par_TFcA_" + sGXsfl_65_idx ;
      Z10566Par_TFcA = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z10565Par_TUsA_" + sGXsfl_65_idx ;
      Z10565Par_TUsA = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7954Par_ValTj_" + sGXsfl_65_idx ;
      Z7954Par_ValTj = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7955Par_ObsTj_" + sGXsfl_65_idx ;
      Z7955Par_ObsTj = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O7954Par_ValTj_" + sGXsfl_65_idx ;
      O7954Par_ValTj = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O7949Par_Art_" + sGXsfl_65_idx ;
      O7949Par_Art = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1112_" + sGXsfl_65_idx ;
      nRcdDeleted_1112 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1112_" + sGXsfl_65_idx ;
      nRcdExists_1112 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1112_" + sGXsfl_65_idx ;
      nIsMod_1112 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPar_TFcA_Enabled = edtPar_TFcA_Enabled ;
      defedtPar_TUsA_Enabled = edtPar_TUsA_Enabled ;
      defedtPar_TFcM_Enabled = edtPar_TFcM_Enabled ;
      defedtPar_TUsM_Enabled = edtPar_TUsM_Enabled ;
      defedtPar_Art_Enabled = edtPar_Art_Enabled ;
   }

   public void confirmValues10L0( )
   {
      nGXsfl_65_idx = 0 ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651112( ) ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_651112( ) ;
         httpContext.changePostValue( "Z7949Par_Art_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z7949Par_Art_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7949Par_Art_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z10563Par_TUsM_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z10563Par_TUsM_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10563Par_TUsM_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z10564Par_TFcM_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z10564Par_TFcM_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10564Par_TFcM_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z10566Par_TFcA_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z10566Par_TFcA_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10566Par_TFcA_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z10565Par_TUsA_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z10565Par_TUsA_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10565Par_TUsA_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z7954Par_ValTj_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z7954Par_ValTj_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7954Par_ValTj_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z7955Par_ObsTj_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z7955Par_ObsTj_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7955Par_ObsTj_"+sGXsfl_65_idx) ;
      }
      httpContext.changePostValue( "O7954Par_ValTj", httpContext.cgiGet( "T7954Par_ValTj")) ;
      httpContext.deletePostValue( "T7954Par_ValTj") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tarttej", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod))}, new String[] {"EmprCod","CliCod","ArtCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10562Mat_FecM", localUtil.ttoc( Z10562Mat_FecM, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6953Mat_Maq", GXutil.rtrim( Z6953Mat_Maq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10561Mat_UsuM", GXutil.rtrim( Z10561Mat_UsuM));
      app.GxWebStd.gx_hidden_field( httpContext, "O6953Mat_Maq", GXutil.rtrim( O6953Mat_Maq));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_65", GXutil.ltrim( localUtil.ntoc( nGXsfl_65_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODIF", GXutil.rtrim( AV32Modif));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ERR", GXutil.rtrim( AV34Msg_err));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGR", GXutil.ltrim( localUtil.ntoc( AV35FlagR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tarttej", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod))}, new String[] {"EmprCod","CliCod","ArtCod"})  ;
   }

   public String getPgmname( )
   {
      return "TARTTEJ" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "DATOS TEJEDURIA", "") ;
   }

   public void initializeNonKey10L10( )
   {
      AV32Modif = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
      A10562Mat_FecM = GXutil.resetTime( GXutil.nullDate() );
      n10562Mat_FecM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10562Mat_FecM", localUtil.ttoc( A10562Mat_FecM, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A69ArtDsc = "" ;
      n69ArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      A6953Mat_Maq = "" ;
      n6953Mat_Maq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6953Mat_Maq", A6953Mat_Maq);
      A10561Mat_UsuM = "" ;
      n10561Mat_UsuM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10561Mat_UsuM", A10561Mat_UsuM);
      O6953Mat_Maq = A6953Mat_Maq ;
      n6953Mat_Maq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6953Mat_Maq", A6953Mat_Maq);
      Z10562Mat_FecM = GXutil.resetTime( GXutil.nullDate() );
      Z69ArtDsc = "" ;
      Z6953Mat_Maq = "" ;
      Z10561Mat_UsuM = "" ;
   }

   public void initAll10L10( )
   {
      initializeNonKey10L10( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey10L1112( )
   {
      A10563Par_TUsM = "" ;
      n10563Par_TUsM = false ;
      A10564Par_TFcM = GXutil.resetTime( GXutil.nullDate() );
      n10564Par_TFcM = false ;
      AV34Msg_err = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Msg_err", AV34Msg_err);
      AV35FlagR = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35FlagR", GXutil.str( AV35FlagR, 1, 0));
      A7950Par_Dsc = "" ;
      n7950Par_Dsc = false ;
      A7954Par_ValTj = "" ;
      n7954Par_ValTj = false ;
      A7955Par_ObsTj = "" ;
      n7955Par_ObsTj = false ;
      A10551Par_NVar = (short)(0) ;
      n10551Par_NVar = false ;
      A10552Par_NVarT = "" ;
      n10552Par_NVarT = false ;
      A10566Par_TFcA = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n10566Par_TFcA = false ;
      A10565Par_TUsA = AV8UsurCod ;
      n10565Par_TUsA = false ;
      O7954Par_ValTj = A7954Par_ValTj ;
      n7954Par_ValTj = false ;
      Z10563Par_TUsM = "" ;
      Z10564Par_TFcM = GXutil.resetTime( GXutil.nullDate() );
      Z10566Par_TFcA = GXutil.resetTime( GXutil.nullDate() );
      Z10565Par_TUsA = "" ;
      Z7954Par_ValTj = "" ;
      Z7955Par_ObsTj = "" ;
   }

   public void initAll10L1112( )
   {
      A7949Par_Art = (short)(0) ;
      initializeNonKey10L1112( ) ;
   }

   public void standaloneModalInsert10L1112( )
   {
      A10566Par_TFcA = i10566Par_TFcA ;
      n10566Par_TFcA = false ;
      A10565Par_TUsA = i10565Par_TUsA ;
      n10565Par_TUsA = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241535074", true, true);
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
      httpContext.AddJavascriptSource("tarttej.js", "?20268241535075", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1112( )
   {
      edtPar_TFcA_Enabled = defedtPar_TFcA_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_TFcA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_TFcA_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtPar_TUsA_Enabled = defedtPar_TUsA_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_TUsA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_TUsA_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtPar_TFcM_Enabled = defedtPar_TFcM_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_TFcM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_TFcM_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtPar_TUsM_Enabled = defedtPar_TUsM_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_TUsM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_TUsM_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtPar_Art_Enabled = defedtPar_Art_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_Art_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_Art_Enabled), 5, 0), !bGXsfl_65_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1112, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1112_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7954Par_ValTj));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_ValTj_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A7955Par_ObsTj);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_ObsTj_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10563Par_TUsM));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_TUsM_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A10564Par_TFcM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_TFcM_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10565Par_TUsA));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_TUsA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A10566Par_TFcA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_TFcA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10551Par_NVar, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_NVar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10552Par_NVarT));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPar_NVarT_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtMat_Maq_Internalname = "MAT_MAQ" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtMat_UsuM_Internalname = "MAT_USUM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtMat_FecM_Internalname = "MAT_FECM" ;
      edtavnRcdDeleted_1112_Internalname = "vNRCDDELETED_1112" ;
      edtPar_Art_Internalname = "PAR_ART" ;
      edtPar_Dsc_Internalname = "PAR_DSC" ;
      edtPar_ValTj_Internalname = "PAR_VALTJ" ;
      edtPar_ObsTj_Internalname = "PAR_OBSTJ" ;
      edtPar_TUsM_Internalname = "PAR_TUSM" ;
      edtPar_TFcM_Internalname = "PAR_TFCM" ;
      edtPar_TUsA_Internalname = "PAR_TUSA" ;
      edtPar_TFcA_Internalname = "PAR_TFCA" ;
      edtPar_NVar_Internalname = "PAR_NVAR" ;
      edtPar_NVarT_Internalname = "PAR_NVART" ;
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
      Form.setCaption( httpContext.getMessage( "DATOS TEJEDURIA", "") );
      edtPar_NVarT_Jsonclick = "" ;
      edtPar_NVar_Jsonclick = "" ;
      edtPar_TFcA_Jsonclick = "" ;
      edtPar_TUsA_Jsonclick = "" ;
      edtPar_TFcM_Jsonclick = "" ;
      edtPar_TUsM_Jsonclick = "" ;
      edtPar_ObsTj_Jsonclick = "" ;
      edtPar_ValTj_Jsonclick = "" ;
      edtPar_Dsc_Jsonclick = "" ;
      edtPar_Art_Jsonclick = "" ;
      edtavnRcdDeleted_1112_Jsonclick = "" ;
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
      edtPar_NVarT_Enabled = 0 ;
      edtPar_NVar_Enabled = 0 ;
      edtPar_TFcA_Enabled = 0 ;
      edtPar_TUsA_Enabled = 0 ;
      edtPar_TFcM_Enabled = 0 ;
      edtPar_TUsM_Enabled = 0 ;
      edtPar_ObsTj_Enabled = 1 ;
      edtPar_ValTj_Enabled = 1 ;
      edtPar_Dsc_Enabled = 0 ;
      edtPar_Art_Enabled = 1 ;
      edtavnRcdDeleted_1112_Enabled = 1 ;
      edtMat_FecM_Jsonclick = "" ;
      edtMat_FecM_Backcolor = (int)(0xFFFFFF) ;
      edtMat_FecM_Enabled = 1 ;
      edtMat_UsuM_Jsonclick = "" ;
      edtMat_UsuM_Backcolor = (int)(0xFFFFFF) ;
      edtMat_UsuM_Enabled = 1 ;
      edtMat_Maq_Jsonclick = "" ;
      edtMat_Maq_Backcolor = (int)(0xFFFFFF) ;
      edtMat_Maq_Enabled = 1 ;
      edtArtDsc_Jsonclick = "" ;
      edtArtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtArtDsc_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
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

   public void xc_15_10L1112( String A396EmprCod ,
                              int A252CliCod ,
                              String A65ArtCod ,
                              short A7949Par_Art ,
                              short A10551Par_NVar ,
                              byte AV35FlagR ,
                              String AV34Msg_err )
   {
      if ( true /* After */ && ( A7949Par_Art > 0 ) && ( A10551Par_NVar > 0 ) )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_int2[0] = A252CliCod ;
         GXv_char3[0] = A65ArtCod ;
         GXv_int5[0] = A7949Par_Art ;
         GXv_int4[0] = A10551Par_NVar ;
         GXv_int6[0] = AV35FlagR ;
         GXv_char1[0] = AV34Msg_err ;
         new app.partpar1(remoteHandle, context).execute( GXv_char7, GXv_int2, GXv_char3, GXv_int5, GXv_int4, GXv_int6, GXv_char1) ;
         A396EmprCod = GXv_char7[0] ;
         A252CliCod = GXv_int2[0] ;
         A65ArtCod = GXv_char3[0] ;
         A7949Par_Art = GXv_int5[0] ;
         A10551Par_NVar = GXv_int4[0] ;
         AV35FlagR = GXv_int6[0] ;
         AV34Msg_err = GXv_char1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV35FlagR", GXutil.str( AV35FlagR, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Msg_err", AV34Msg_err);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A65ArtCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A7949Par_Art, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A10551Par_NVar, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV35FlagR, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV34Msg_err))+"\"") ;
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
      subsflControlProps_651112( ) ;
      while ( nGXsfl_65_idx <= nRC_GXsfl_65 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal10L1112( ) ;
         standaloneModal10L1112( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow10L1112( ) ;
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_651112( ) ;
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
      /* Using cursor T010L70 */
      pr_default.execute(68, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(68) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T010L70_A407EmprNom[0] ;
      n407EmprNom = T010L70_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(68);
      /* Using cursor T010L71 */
      pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(69) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T010L71_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(69);
      GX_FocusControl = edtArtDsc_Internalname ;
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

   public void valid_Artcod( )
   {
      n252CliCod = false ;
      n65ArtCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10562Mat_FecM", localUtil.ttoc( A10562Mat_FecM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A6953Mat_Maq", GXutil.rtrim( A6953Mat_Maq));
      httpContext.ajax_rsp_assign_attri("", false, "A10561Mat_UsuM", GXutil.rtrim( A10561Mat_UsuM));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10562Mat_FecM", localUtil.ttoc( Z10562Mat_FecM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6953Mat_Maq", GXutil.rtrim( Z6953Mat_Maq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10561Mat_UsuM", GXutil.rtrim( Z10561Mat_UsuM));
      httpContext.ajax_rsp_assign_attri("", false, "O6953Mat_Maq", GXutil.rtrim( O6953Mat_Maq));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Par_art( )
   {
      n65ArtCod = false ;
      n252CliCod = false ;
      n7950Par_Dsc = false ;
      n10551Par_NVar = false ;
      n10552Par_NVarT = false ;
      /* Using cursor T010L67 */
      pr_default.execute(65, new Object[] {A396EmprCod, Short.valueOf(A7949Par_Art)});
      if ( (pr_default.getStatus(65) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTPAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PAR_ART");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPar_Art_Internalname ;
      }
      A7950Par_Dsc = T010L67_A7950Par_Dsc[0] ;
      n7950Par_Dsc = T010L67_n7950Par_Dsc[0] ;
      A10551Par_NVar = T010L67_A10551Par_NVar[0] ;
      n10551Par_NVar = T010L67_n10551Par_NVar[0] ;
      A10552Par_NVarT = T010L67_A10552Par_NVarT[0] ;
      n10552Par_NVarT = T010L67_n10552Par_NVarT[0] ;
      pr_default.close(65);
      if ( true /* After */ && ( A7949Par_Art > 0 ) && ( A10551Par_NVar > 0 ) )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_int2[0] = A252CliCod ;
         GXv_char3[0] = A65ArtCod ;
         GXv_int5[0] = A7949Par_Art ;
         GXv_int4[0] = A10551Par_NVar ;
         GXv_int6[0] = AV35FlagR ;
         GXv_char1[0] = AV34Msg_err ;
         new app.partpar1(remoteHandle, context).execute( GXv_char7, GXv_int2, GXv_char3, GXv_int5, GXv_int4, GXv_int6, GXv_char1) ;
         tarttej_impl.this.A396EmprCod = GXv_char7[0] ;
         A396EmprCod = this.A396EmprCod ;
         tarttej_impl.this.A252CliCod = GXv_int2[0] ;
         A252CliCod = this.A252CliCod ;
         tarttej_impl.this.A65ArtCod = GXv_char3[0] ;
         A65ArtCod = this.A65ArtCod ;
         tarttej_impl.this.A7949Par_Art = GXv_int5[0] ;
         A7949Par_Art = this.A7949Par_Art ;
         tarttej_impl.this.A10551Par_NVar = GXv_int4[0] ;
         A10551Par_NVar = this.A10551Par_NVar ;
         tarttej_impl.this.AV35FlagR = GXv_int6[0] ;
         AV35FlagR = this.AV35FlagR ;
         tarttej_impl.this.AV34Msg_err = GXv_char1[0] ;
         AV34Msg_err = this.AV34Msg_err ;
      }
      if ( ( AV35FlagR == 1 ) && true /* After */ && ( A7949Par_Art > 0 ) && ( A10551Par_NVar > 0 ) )
      {
         httpContext.GX_msglist.addItem(AV34Msg_err, 1, "PAR_ART");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPar_Art_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7950Par_Dsc", GXutil.rtrim( A7950Par_Dsc));
      httpContext.ajax_rsp_assign_attri("", false, "A10552Par_NVarT", GXutil.rtrim( A10552Par_NVarT));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", GXutil.rtrim( A65ArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A7949Par_Art", GXutil.ltrim( localUtil.ntoc( A7949Par_Art, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10551Par_NVar", GXutil.ltrim( localUtil.ntoc( A10551Par_NVar, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV35FlagR", GXutil.ltrim( localUtil.ntoc( AV35FlagR, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV34Msg_err", GXutil.rtrim( AV34Msg_err));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''}]");
      setEventMetadata("VALID_ARTCOD",",oparms:[{av:'A10562Mat_FecM',fld:'MAT_FECM',pic:'99/99/99 99:99'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'A6953Mat_Maq',fld:'MAT_MAQ',pic:''},{av:'A10561Mat_UsuM',fld:'MAT_USUM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z10562Mat_FecM'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z69ArtDsc'},{av:'Z6953Mat_Maq'},{av:'Z10561Mat_UsuM'},{av:'O6953Mat_Maq'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MAT_MAQ","{handler:'valid_Mat_maq',iparms:[]");
      setEventMetadata("VALID_MAT_MAQ",",oparms:[]}");
      setEventMetadata("VALID_PAR_ART","{handler:'valid_Par_art',iparms:[{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7949Par_Art',fld:'PAR_ART',pic:'ZZZ9'},{av:'A7950Par_Dsc',fld:'PAR_DSC',pic:''},{av:'A10551Par_NVar',fld:'PAR_NVAR',pic:'ZZZ9'},{av:'A10552Par_NVarT',fld:'PAR_NVART',pic:''},{av:'AV34Msg_err',fld:'vMSG_ERR',pic:''},{av:'AV35FlagR',fld:'vFLAGR',pic:'9'}]");
      setEventMetadata("VALID_PAR_ART",",oparms:[{av:'A7950Par_Dsc',fld:'PAR_DSC',pic:''},{av:'A10552Par_NVarT',fld:'PAR_NVART',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A7949Par_Art',fld:'PAR_ART',pic:'ZZZ9'},{av:'A10551Par_NVar',fld:'PAR_NVAR',pic:'ZZZ9'},{av:'AV35FlagR',fld:'vFLAGR',pic:'9'},{av:'AV34Msg_err',fld:'vMSG_ERR',pic:''}]}");
      setEventMetadata("VALID_PAR_VALTJ","{handler:'valid_Par_valtj',iparms:[]");
      setEventMetadata("VALID_PAR_VALTJ",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Par_nvart',iparms:[]");
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
      pr_default.close(65);
      pr_default.close(69);
      pr_default.close(68);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA65ArtCod = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z10562Mat_FecM = GXutil.resetTime( GXutil.nullDate() );
      Z69ArtDsc = "" ;
      Z6953Mat_Maq = "" ;
      Z10561Mat_UsuM = "" ;
      O6953Mat_Maq = "" ;
      Z10563Par_TUsM = "" ;
      Z10564Par_TFcM = GXutil.resetTime( GXutil.nullDate() );
      Z10566Par_TFcA = GXutil.resetTime( GXutil.nullDate() );
      Z10565Par_TUsA = "" ;
      Z7954Par_ValTj = "" ;
      Z7955Par_ObsTj = "" ;
      O7954Par_ValTj = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      AV34Msg_err = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      AV8UsurCod = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A69ArtDsc = "" ;
      lblTextblock7_Jsonclick = "" ;
      A6953Mat_Maq = "" ;
      lblTextblock8_Jsonclick = "" ;
      A10561Mat_UsuM = "" ;
      lblTextblock9_Jsonclick = "" ;
      A10562Mat_FecM = GXutil.resetTime( GXutil.nullDate() );
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B6953Mat_Maq = "" ;
      sMode1112 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV32Modif = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode10 = "" ;
      sV32Modif = "" ;
      OV32Modif = "" ;
      GXCCtl = "" ;
      A7950Par_Dsc = "" ;
      A7954Par_ValTj = "" ;
      A7955Par_ObsTj = "" ;
      A10563Par_TUsM = "" ;
      A10564Par_TFcM = GXutil.resetTime( GXutil.nullDate() );
      A10565Par_TUsA = "" ;
      A10566Par_TFcA = GXutil.resetTime( GXutil.nullDate() );
      A10552Par_NVarT = "" ;
      T7954Par_ValTj = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T010L7_A407EmprNom = new String[] {""} ;
      T010L7_n407EmprNom = new boolean[] {false} ;
      T010L8_A279CliNom = new String[] {""} ;
      T010L9_A65ArtCod = new String[] {""} ;
      T010L9_n65ArtCod = new boolean[] {false} ;
      T010L9_A10562Mat_FecM = new java.util.Date[] {GXutil.nullDate()} ;
      T010L9_n10562Mat_FecM = new boolean[] {false} ;
      T010L9_A407EmprNom = new String[] {""} ;
      T010L9_n407EmprNom = new boolean[] {false} ;
      T010L9_A279CliNom = new String[] {""} ;
      T010L9_A69ArtDsc = new String[] {""} ;
      T010L9_n69ArtDsc = new boolean[] {false} ;
      T010L9_A6953Mat_Maq = new String[] {""} ;
      T010L9_n6953Mat_Maq = new boolean[] {false} ;
      T010L9_A10561Mat_UsuM = new String[] {""} ;
      T010L9_n10561Mat_UsuM = new boolean[] {false} ;
      T010L9_A396EmprCod = new String[] {""} ;
      T010L9_A252CliCod = new int[1] ;
      T010L9_n252CliCod = new boolean[] {false} ;
      T010L10_A396EmprCod = new String[] {""} ;
      T010L10_A252CliCod = new int[1] ;
      T010L10_n252CliCod = new boolean[] {false} ;
      T010L10_A65ArtCod = new String[] {""} ;
      T010L10_n65ArtCod = new boolean[] {false} ;
      T010L6_A65ArtCod = new String[] {""} ;
      T010L6_n65ArtCod = new boolean[] {false} ;
      T010L6_A10562Mat_FecM = new java.util.Date[] {GXutil.nullDate()} ;
      T010L6_n10562Mat_FecM = new boolean[] {false} ;
      T010L6_A69ArtDsc = new String[] {""} ;
      T010L6_n69ArtDsc = new boolean[] {false} ;
      T010L6_A6953Mat_Maq = new String[] {""} ;
      T010L6_n6953Mat_Maq = new boolean[] {false} ;
      T010L6_A10561Mat_UsuM = new String[] {""} ;
      T010L6_n10561Mat_UsuM = new boolean[] {false} ;
      T010L6_A396EmprCod = new String[] {""} ;
      T010L6_A252CliCod = new int[1] ;
      T010L6_n252CliCod = new boolean[] {false} ;
      T010L11_A396EmprCod = new String[] {""} ;
      T010L11_A252CliCod = new int[1] ;
      T010L11_n252CliCod = new boolean[] {false} ;
      T010L11_A65ArtCod = new String[] {""} ;
      T010L11_n65ArtCod = new boolean[] {false} ;
      T010L12_A396EmprCod = new String[] {""} ;
      T010L12_A252CliCod = new int[1] ;
      T010L12_n252CliCod = new boolean[] {false} ;
      T010L12_A65ArtCod = new String[] {""} ;
      T010L12_n65ArtCod = new boolean[] {false} ;
      T010L5_A65ArtCod = new String[] {""} ;
      T010L5_n65ArtCod = new boolean[] {false} ;
      T010L5_A10562Mat_FecM = new java.util.Date[] {GXutil.nullDate()} ;
      T010L5_n10562Mat_FecM = new boolean[] {false} ;
      T010L5_A69ArtDsc = new String[] {""} ;
      T010L5_n69ArtDsc = new boolean[] {false} ;
      T010L5_A6953Mat_Maq = new String[] {""} ;
      T010L5_n6953Mat_Maq = new boolean[] {false} ;
      T010L5_A10561Mat_UsuM = new String[] {""} ;
      T010L5_n10561Mat_UsuM = new boolean[] {false} ;
      T010L5_A396EmprCod = new String[] {""} ;
      T010L5_A252CliCod = new int[1] ;
      T010L5_n252CliCod = new boolean[] {false} ;
      T010L16_A396EmprCod = new String[] {""} ;
      T010L16_A252CliCod = new int[1] ;
      T010L16_n252CliCod = new boolean[] {false} ;
      T010L16_A65ArtCod = new String[] {""} ;
      T010L16_n65ArtCod = new boolean[] {false} ;
      T010L16_A499GrpFamCod = new byte[1] ;
      T010L17_A396EmprCod = new String[] {""} ;
      T010L17_A252CliCod = new int[1] ;
      T010L17_n252CliCod = new boolean[] {false} ;
      T010L17_A12814ARTConID = new String[] {""} ;
      T010L17_A65ArtCod = new String[] {""} ;
      T010L17_n65ArtCod = new boolean[] {false} ;
      T010L18_A396EmprCod = new String[] {""} ;
      T010L18_A252CliCod = new int[1] ;
      T010L18_n252CliCod = new boolean[] {false} ;
      T010L18_A65ArtCod = new String[] {""} ;
      T010L18_n65ArtCod = new boolean[] {false} ;
      T010L18_A12363SocInt = new byte[1] ;
      T010L19_A396EmprCod = new String[] {""} ;
      T010L19_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T010L19_A5728JBCLLin = new short[1] ;
      T010L20_A396EmprCod = new String[] {""} ;
      T010L20_A252CliCod = new int[1] ;
      T010L20_n252CliCod = new boolean[] {false} ;
      T010L20_A5809MMezCod = new String[] {""} ;
      T010L20_A65ArtCod = new String[] {""} ;
      T010L20_n65ArtCod = new boolean[] {false} ;
      T010L21_A396EmprCod = new String[] {""} ;
      T010L21_A252CliCod = new int[1] ;
      T010L21_n252CliCod = new boolean[] {false} ;
      T010L21_A5234MezCod = new String[] {""} ;
      T010L21_A5240MezLin = new byte[1] ;
      T010L22_A396EmprCod = new String[] {""} ;
      T010L22_A252CliCod = new int[1] ;
      T010L22_n252CliCod = new boolean[] {false} ;
      T010L22_A65ArtCod = new String[] {""} ;
      T010L22_n65ArtCod = new boolean[] {false} ;
      T010L22_A4116estreclim = new int[1] ;
      T010L23_A396EmprCod = new String[] {""} ;
      T010L23_A252CliCod = new int[1] ;
      T010L23_n252CliCod = new boolean[] {false} ;
      T010L23_A65ArtCod = new String[] {""} ;
      T010L23_n65ArtCod = new boolean[] {false} ;
      T010L23_A4061EstNomCol = new String[] {""} ;
      T010L24_A396EmprCod = new String[] {""} ;
      T010L24_A9705ErpNped = new String[] {""} ;
      T010L24_A8652ErpLin = new short[1] ;
      T010L25_A396EmprCod = new String[] {""} ;
      T010L25_A252CliCod = new int[1] ;
      T010L25_n252CliCod = new boolean[] {false} ;
      T010L25_A65ArtCod = new String[] {""} ;
      T010L25_n65ArtCod = new boolean[] {false} ;
      T010L25_A7266CAAqP = new String[] {""} ;
      T010L26_A396EmprCod = new String[] {""} ;
      T010L26_A252CliCod = new int[1] ;
      T010L26_n252CliCod = new boolean[] {false} ;
      T010L26_A65ArtCod = new String[] {""} ;
      T010L26_n65ArtCod = new boolean[] {false} ;
      T010L26_A11084H_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T010L27_A396EmprCod = new String[] {""} ;
      T010L27_A252CliCod = new int[1] ;
      T010L27_n252CliCod = new boolean[] {false} ;
      T010L27_A65ArtCod = new String[] {""} ;
      T010L27_n65ArtCod = new boolean[] {false} ;
      T010L27_A10972Int_cod = new byte[1] ;
      T010L28_A396EmprCod = new String[] {""} ;
      T010L28_A252CliCod = new int[1] ;
      T010L28_n252CliCod = new boolean[] {false} ;
      T010L28_A65ArtCod = new String[] {""} ;
      T010L28_n65ArtCod = new boolean[] {false} ;
      T010L28_A10577Pg_Procod = new String[] {""} ;
      T010L29_A396EmprCod = new String[] {""} ;
      T010L29_A252CliCod = new int[1] ;
      T010L29_n252CliCod = new boolean[] {false} ;
      T010L29_A65ArtCod = new String[] {""} ;
      T010L29_n65ArtCod = new boolean[] {false} ;
      T010L29_A10272Hz_cod = new String[] {""} ;
      T010L30_A396EmprCod = new String[] {""} ;
      T010L30_A252CliCod = new int[1] ;
      T010L30_n252CliCod = new boolean[] {false} ;
      T010L30_A65ArtCod = new String[] {""} ;
      T010L30_n65ArtCod = new boolean[] {false} ;
      T010L30_A10041ArtSH = new String[] {""} ;
      T010L31_A396EmprCod = new String[] {""} ;
      T010L31_A252CliCod = new int[1] ;
      T010L31_n252CliCod = new boolean[] {false} ;
      T010L31_A65ArtCod = new String[] {""} ;
      T010L31_n65ArtCod = new boolean[] {false} ;
      T010L31_A8427TipoCt = new String[] {""} ;
      T010L31_A8428CapMxMq = new int[1] ;
      T010L32_A396EmprCod = new String[] {""} ;
      T010L32_A252CliCod = new int[1] ;
      T010L32_n252CliCod = new boolean[] {false} ;
      T010L32_A65ArtCod = new String[] {""} ;
      T010L32_n65ArtCod = new boolean[] {false} ;
      T010L32_A8342CodPred = new short[1] ;
      T010L33_A396EmprCod = new String[] {""} ;
      T010L33_A252CliCod = new int[1] ;
      T010L33_n252CliCod = new boolean[] {false} ;
      T010L33_A65ArtCod = new String[] {""} ;
      T010L33_n65ArtCod = new boolean[] {false} ;
      T010L33_A8089ArtcodTj = new String[] {""} ;
      T010L34_A396EmprCod = new String[] {""} ;
      T010L34_A252CliCod = new int[1] ;
      T010L34_n252CliCod = new boolean[] {false} ;
      T010L34_A65ArtCod = new String[] {""} ;
      T010L34_n65ArtCod = new boolean[] {false} ;
      T010L34_A7956Mq_CodM = new String[] {""} ;
      T010L35_A396EmprCod = new String[] {""} ;
      T010L35_A252CliCod = new int[1] ;
      T010L35_n252CliCod = new boolean[] {false} ;
      T010L35_A65ArtCod = new String[] {""} ;
      T010L35_n65ArtCod = new boolean[] {false} ;
      T010L35_A7956Mq_CodM = new String[] {""} ;
      T010L35_A7783Mq_LinP = new short[1] ;
      T010L35_A7949Par_Art = new short[1] ;
      T010L36_A396EmprCod = new String[] {""} ;
      T010L36_A252CliCod = new int[1] ;
      T010L36_n252CliCod = new boolean[] {false} ;
      T010L36_A65ArtCod = new String[] {""} ;
      T010L36_n65ArtCod = new boolean[] {false} ;
      T010L36_A7135Lin_fast = new short[1] ;
      T010L37_A396EmprCod = new String[] {""} ;
      T010L37_A252CliCod = new int[1] ;
      T010L37_n252CliCod = new boolean[] {false} ;
      T010L37_A65ArtCod = new String[] {""} ;
      T010L37_n65ArtCod = new boolean[] {false} ;
      T010L37_A6954Mat_lin = new short[1] ;
      T010L38_A396EmprCod = new String[] {""} ;
      T010L38_A602MaqCod = new String[] {""} ;
      T010L38_A6078MaqCliCod = new int[1] ;
      T010L38_A6079MaqArtCod = new String[] {""} ;
      T010L39_A396EmprCod = new String[] {""} ;
      T010L39_A252CliCod = new int[1] ;
      T010L39_n252CliCod = new boolean[] {false} ;
      T010L39_A65ArtCod = new String[] {""} ;
      T010L39_n65ArtCod = new boolean[] {false} ;
      T010L39_A5382EstCatAny = new short[1] ;
      T010L39_A5383EstCatSer = new String[] {""} ;
      T010L39_A5384EstCatTip = new short[1] ;
      T010L40_A396EmprCod = new String[] {""} ;
      T010L40_A252CliCod = new int[1] ;
      T010L40_n252CliCod = new boolean[] {false} ;
      T010L40_A65ArtCod = new String[] {""} ;
      T010L40_n65ArtCod = new boolean[] {false} ;
      T010L40_A4658MdlCod = new String[] {""} ;
      T010L41_A396EmprCod = new String[] {""} ;
      T010L41_A252CliCod = new int[1] ;
      T010L41_n252CliCod = new boolean[] {false} ;
      T010L41_A4175WebEmpCod = new String[] {""} ;
      T010L42_A396EmprCod = new String[] {""} ;
      T010L42_A252CliCod = new int[1] ;
      T010L42_n252CliCod = new boolean[] {false} ;
      T010L42_A4079WEBDISCOD = new String[] {""} ;
      T010L43_A396EmprCod = new String[] {""} ;
      T010L43_A252CliCod = new int[1] ;
      T010L43_n252CliCod = new boolean[] {false} ;
      T010L43_A65ArtCod = new String[] {""} ;
      T010L43_n65ArtCod = new boolean[] {false} ;
      T010L43_A4058CCFColNom = new String[] {""} ;
      T010L43_A4059CCFColNum = new int[1] ;
      T010L44_A396EmprCod = new String[] {""} ;
      T010L44_A252CliCod = new int[1] ;
      T010L44_n252CliCod = new boolean[] {false} ;
      T010L44_A65ArtCod = new String[] {""} ;
      T010L44_n65ArtCod = new boolean[] {false} ;
      T010L44_A1177Dibujo = new String[] {""} ;
      T010L44_A1790DibIntCod = new int[1] ;
      T010L45_A396EmprCod = new String[] {""} ;
      T010L45_A252CliCod = new int[1] ;
      T010L45_n252CliCod = new boolean[] {false} ;
      T010L45_A65ArtCod = new String[] {""} ;
      T010L45_n65ArtCod = new boolean[] {false} ;
      T010L45_A1080LinPre = new byte[1] ;
      T010L46_A396EmprCod = new String[] {""} ;
      T010L46_A3814PePCod = new long[1] ;
      T010L47_A396EmprCod = new String[] {""} ;
      T010L47_A3413OpeManCod = new byte[1] ;
      T010L47_A3430PreManNMt = new String[] {""} ;
      T010L47_A252CliCod = new int[1] ;
      T010L47_n252CliCod = new boolean[] {false} ;
      T010L47_A65ArtCod = new String[] {""} ;
      T010L47_n65ArtCod = new boolean[] {false} ;
      T010L48_A396EmprCod = new String[] {""} ;
      T010L48_A3415ParManNum = new int[1] ;
      T010L49_A396EmprCod = new String[] {""} ;
      T010L49_A3331LanBroCod = new byte[1] ;
      T010L49_A3333LanBroLin = new short[1] ;
      T010L50_A396EmprCod = new String[] {""} ;
      T010L50_A252CliCod = new int[1] ;
      T010L50_n252CliCod = new boolean[] {false} ;
      T010L50_A65ArtCod = new String[] {""} ;
      T010L50_n65ArtCod = new boolean[] {false} ;
      T010L50_A3319ArtCapKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010L51_A396EmprCod = new String[] {""} ;
      T010L51_A252CliCod = new int[1] ;
      T010L51_n252CliCod = new boolean[] {false} ;
      T010L51_A65ArtCod = new String[] {""} ;
      T010L51_n65ArtCod = new boolean[] {false} ;
      T010L51_A3288CCalCod = new String[] {""} ;
      T010L52_A396EmprCod = new String[] {""} ;
      T010L52_A252CliCod = new int[1] ;
      T010L52_n252CliCod = new boolean[] {false} ;
      T010L52_A65ArtCod = new String[] {""} ;
      T010L52_n65ArtCod = new boolean[] {false} ;
      T010L52_A3033CCCod = new String[] {""} ;
      T010L53_A396EmprCod = new String[] {""} ;
      T010L53_A252CliCod = new int[1] ;
      T010L53_n252CliCod = new boolean[] {false} ;
      T010L53_A65ArtCod = new String[] {""} ;
      T010L53_n65ArtCod = new boolean[] {false} ;
      T010L53_A2937RecIntCod = new byte[1] ;
      T010L54_A396EmprCod = new String[] {""} ;
      T010L54_A252CliCod = new int[1] ;
      T010L54_n252CliCod = new boolean[] {false} ;
      T010L54_A65ArtCod = new String[] {""} ;
      T010L54_n65ArtCod = new boolean[] {false} ;
      T010L54_A2931Limite2 = new short[1] ;
      T010L55_A396EmprCod = new String[] {""} ;
      T010L55_A252CliCod = new int[1] ;
      T010L55_n252CliCod = new boolean[] {false} ;
      T010L55_A65ArtCod = new String[] {""} ;
      T010L55_n65ArtCod = new boolean[] {false} ;
      T010L55_A71ArtEstAny = new short[1] ;
      T010L55_A2756ArtEstSer = new String[] {""} ;
      T010L56_A396EmprCod = new String[] {""} ;
      T010L56_A252CliCod = new int[1] ;
      T010L56_n252CliCod = new boolean[] {false} ;
      T010L56_A1504CliProCod = new String[] {""} ;
      T010L56_A65ArtCod = new String[] {""} ;
      T010L56_n65ArtCod = new boolean[] {false} ;
      T010L57_A396EmprCod = new String[] {""} ;
      T010L57_A252CliCod = new int[1] ;
      T010L57_n252CliCod = new boolean[] {false} ;
      T010L57_A65ArtCod = new String[] {""} ;
      T010L57_n65ArtCod = new boolean[] {false} ;
      T010L57_A598LinRec = new byte[1] ;
      T010L58_A396EmprCod = new String[] {""} ;
      T010L58_A252CliCod = new int[1] ;
      T010L58_n252CliCod = new boolean[] {false} ;
      T010L58_A65ArtCod = new String[] {""} ;
      T010L58_n65ArtCod = new boolean[] {false} ;
      T010L58_A831TipColCod = new byte[1] ;
      T010L59_A396EmprCod = new String[] {""} ;
      T010L59_A252CliCod = new int[1] ;
      T010L59_n252CliCod = new boolean[] {false} ;
      T010L59_A65ArtCod = new String[] {""} ;
      T010L59_n65ArtCod = new boolean[] {false} ;
      T010L59_A758ProCod = new String[] {""} ;
      T010L60_A396EmprCod = new String[] {""} ;
      T010L60_A252CliCod = new int[1] ;
      T010L60_n252CliCod = new boolean[] {false} ;
      T010L60_A65ArtCod = new String[] {""} ;
      T010L60_n65ArtCod = new boolean[] {false} ;
      Z7950Par_Dsc = "" ;
      Z10552Par_NVarT = "" ;
      T010L61_A252CliCod = new int[1] ;
      T010L61_n252CliCod = new boolean[] {false} ;
      T010L61_A65ArtCod = new String[] {""} ;
      T010L61_n65ArtCod = new boolean[] {false} ;
      T010L61_A10563Par_TUsM = new String[] {""} ;
      T010L61_n10563Par_TUsM = new boolean[] {false} ;
      T010L61_A10564Par_TFcM = new java.util.Date[] {GXutil.nullDate()} ;
      T010L61_n10564Par_TFcM = new boolean[] {false} ;
      T010L61_A10566Par_TFcA = new java.util.Date[] {GXutil.nullDate()} ;
      T010L61_n10566Par_TFcA = new boolean[] {false} ;
      T010L61_A10565Par_TUsA = new String[] {""} ;
      T010L61_n10565Par_TUsA = new boolean[] {false} ;
      T010L61_A7950Par_Dsc = new String[] {""} ;
      T010L61_n7950Par_Dsc = new boolean[] {false} ;
      T010L61_A7954Par_ValTj = new String[] {""} ;
      T010L61_n7954Par_ValTj = new boolean[] {false} ;
      T010L61_A7955Par_ObsTj = new String[] {""} ;
      T010L61_n7955Par_ObsTj = new boolean[] {false} ;
      T010L61_A10551Par_NVar = new short[1] ;
      T010L61_n10551Par_NVar = new boolean[] {false} ;
      T010L61_A10552Par_NVarT = new String[] {""} ;
      T010L61_n10552Par_NVarT = new boolean[] {false} ;
      T010L61_A396EmprCod = new String[] {""} ;
      T010L61_A7949Par_Art = new short[1] ;
      T010L4_A7950Par_Dsc = new String[] {""} ;
      T010L4_n7950Par_Dsc = new boolean[] {false} ;
      T010L4_A10551Par_NVar = new short[1] ;
      T010L4_n10551Par_NVar = new boolean[] {false} ;
      T010L4_A10552Par_NVarT = new String[] {""} ;
      T010L4_n10552Par_NVarT = new boolean[] {false} ;
      T010L62_A7950Par_Dsc = new String[] {""} ;
      T010L62_n7950Par_Dsc = new boolean[] {false} ;
      T010L62_A10551Par_NVar = new short[1] ;
      T010L62_n10551Par_NVar = new boolean[] {false} ;
      T010L62_A10552Par_NVarT = new String[] {""} ;
      T010L62_n10552Par_NVarT = new boolean[] {false} ;
      T010L63_A396EmprCod = new String[] {""} ;
      T010L63_A252CliCod = new int[1] ;
      T010L63_n252CliCod = new boolean[] {false} ;
      T010L63_A65ArtCod = new String[] {""} ;
      T010L63_n65ArtCod = new boolean[] {false} ;
      T010L63_A7949Par_Art = new short[1] ;
      T010L3_A252CliCod = new int[1] ;
      T010L3_n252CliCod = new boolean[] {false} ;
      T010L3_A65ArtCod = new String[] {""} ;
      T010L3_n65ArtCod = new boolean[] {false} ;
      T010L3_A10563Par_TUsM = new String[] {""} ;
      T010L3_n10563Par_TUsM = new boolean[] {false} ;
      T010L3_A10564Par_TFcM = new java.util.Date[] {GXutil.nullDate()} ;
      T010L3_n10564Par_TFcM = new boolean[] {false} ;
      T010L3_A10566Par_TFcA = new java.util.Date[] {GXutil.nullDate()} ;
      T010L3_n10566Par_TFcA = new boolean[] {false} ;
      T010L3_A10565Par_TUsA = new String[] {""} ;
      T010L3_n10565Par_TUsA = new boolean[] {false} ;
      T010L3_A7954Par_ValTj = new String[] {""} ;
      T010L3_n7954Par_ValTj = new boolean[] {false} ;
      T010L3_A7955Par_ObsTj = new String[] {""} ;
      T010L3_n7955Par_ObsTj = new boolean[] {false} ;
      T010L3_A396EmprCod = new String[] {""} ;
      T010L3_A7949Par_Art = new short[1] ;
      T010L2_A252CliCod = new int[1] ;
      T010L2_n252CliCod = new boolean[] {false} ;
      T010L2_A65ArtCod = new String[] {""} ;
      T010L2_n65ArtCod = new boolean[] {false} ;
      T010L2_A10563Par_TUsM = new String[] {""} ;
      T010L2_n10563Par_TUsM = new boolean[] {false} ;
      T010L2_A10564Par_TFcM = new java.util.Date[] {GXutil.nullDate()} ;
      T010L2_n10564Par_TFcM = new boolean[] {false} ;
      T010L2_A10566Par_TFcA = new java.util.Date[] {GXutil.nullDate()} ;
      T010L2_n10566Par_TFcA = new boolean[] {false} ;
      T010L2_A10565Par_TUsA = new String[] {""} ;
      T010L2_n10565Par_TUsA = new boolean[] {false} ;
      T010L2_A7954Par_ValTj = new String[] {""} ;
      T010L2_n7954Par_ValTj = new boolean[] {false} ;
      T010L2_A7955Par_ObsTj = new String[] {""} ;
      T010L2_n7955Par_ObsTj = new boolean[] {false} ;
      T010L2_A396EmprCod = new String[] {""} ;
      T010L2_A7949Par_Art = new short[1] ;
      T010L67_A7950Par_Dsc = new String[] {""} ;
      T010L67_n7950Par_Dsc = new boolean[] {false} ;
      T010L67_A10551Par_NVar = new short[1] ;
      T010L67_n10551Par_NVar = new boolean[] {false} ;
      T010L67_A10552Par_NVarT = new String[] {""} ;
      T010L67_n10552Par_NVarT = new boolean[] {false} ;
      T010L68_A396EmprCod = new String[] {""} ;
      T010L68_A252CliCod = new int[1] ;
      T010L68_n252CliCod = new boolean[] {false} ;
      T010L68_A65ArtCod = new String[] {""} ;
      T010L68_n65ArtCod = new boolean[] {false} ;
      T010L68_A7956Mq_CodM = new String[] {""} ;
      T010L68_A7783Mq_LinP = new short[1] ;
      T010L68_A7949Par_Art = new short[1] ;
      T010L69_A396EmprCod = new String[] {""} ;
      T010L69_A252CliCod = new int[1] ;
      T010L69_n252CliCod = new boolean[] {false} ;
      T010L69_A65ArtCod = new String[] {""} ;
      T010L69_n65ArtCod = new boolean[] {false} ;
      T010L69_A7949Par_Art = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i10566Par_TFcA = GXutil.resetTime( GXutil.nullDate() );
      i10565Par_TUsA = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T010L70_A407EmprNom = new String[] {""} ;
      T010L70_n407EmprNom = new boolean[] {false} ;
      T010L71_A279CliNom = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ10562Mat_FecM = GXutil.resetTime( GXutil.nullDate() );
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ69ArtDsc = "" ;
      ZZ6953Mat_Maq = "" ;
      ZZ10561Mat_UsuM = "" ;
      ZO6953Mat_Maq = "" ;
      GXv_char7 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new short[1] ;
      GXv_int4 = new short[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char1 = new String[1] ;
      ZV34Msg_err = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tarttej__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tarttej__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tarttej__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tarttej__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tarttej__default(),
         new Object[] {
             new Object[] {
            T010L2_A252CliCod, T010L2_A65ArtCod, T010L2_A10563Par_TUsM, T010L2_n10563Par_TUsM, T010L2_A10564Par_TFcM, T010L2_n10564Par_TFcM, T010L2_A10566Par_TFcA, T010L2_n10566Par_TFcA, T010L2_A10565Par_TUsA, T010L2_n10565Par_TUsA,
            T010L2_A7954Par_ValTj, T010L2_n7954Par_ValTj, T010L2_A7955Par_ObsTj, T010L2_n7955Par_ObsTj, T010L2_A396EmprCod, T010L2_A7949Par_Art
            }
            , new Object[] {
            T010L3_A252CliCod, T010L3_A65ArtCod, T010L3_A10563Par_TUsM, T010L3_n10563Par_TUsM, T010L3_A10564Par_TFcM, T010L3_n10564Par_TFcM, T010L3_A10566Par_TFcA, T010L3_n10566Par_TFcA, T010L3_A10565Par_TUsA, T010L3_n10565Par_TUsA,
            T010L3_A7954Par_ValTj, T010L3_n7954Par_ValTj, T010L3_A7955Par_ObsTj, T010L3_n7955Par_ObsTj, T010L3_A396EmprCod, T010L3_A7949Par_Art
            }
            , new Object[] {
            T010L4_A7950Par_Dsc, T010L4_n7950Par_Dsc, T010L4_A10551Par_NVar, T010L4_n10551Par_NVar, T010L4_A10552Par_NVarT, T010L4_n10552Par_NVarT
            }
            , new Object[] {
            T010L5_A65ArtCod, T010L5_A10562Mat_FecM, T010L5_n10562Mat_FecM, T010L5_A69ArtDsc, T010L5_n69ArtDsc, T010L5_A6953Mat_Maq, T010L5_n6953Mat_Maq, T010L5_A10561Mat_UsuM, T010L5_n10561Mat_UsuM, T010L5_A396EmprCod,
            T010L5_A252CliCod
            }
            , new Object[] {
            T010L6_A65ArtCod, T010L6_A10562Mat_FecM, T010L6_n10562Mat_FecM, T010L6_A69ArtDsc, T010L6_n69ArtDsc, T010L6_A6953Mat_Maq, T010L6_n6953Mat_Maq, T010L6_A10561Mat_UsuM, T010L6_n10561Mat_UsuM, T010L6_A396EmprCod,
            T010L6_A252CliCod
            }
            , new Object[] {
            T010L7_A407EmprNom, T010L7_n407EmprNom
            }
            , new Object[] {
            T010L8_A279CliNom
            }
            , new Object[] {
            T010L9_A65ArtCod, T010L9_A10562Mat_FecM, T010L9_n10562Mat_FecM, T010L9_A407EmprNom, T010L9_n407EmprNom, T010L9_A279CliNom, T010L9_A69ArtDsc, T010L9_n69ArtDsc, T010L9_A6953Mat_Maq, T010L9_n6953Mat_Maq,
            T010L9_A10561Mat_UsuM, T010L9_n10561Mat_UsuM, T010L9_A396EmprCod, T010L9_A252CliCod
            }
            , new Object[] {
            T010L10_A396EmprCod, T010L10_A252CliCod, T010L10_A65ArtCod
            }
            , new Object[] {
            T010L11_A396EmprCod, T010L11_A252CliCod, T010L11_A65ArtCod
            }
            , new Object[] {
            T010L12_A396EmprCod, T010L12_A252CliCod, T010L12_A65ArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T010L16_A396EmprCod, T010L16_A252CliCod, T010L16_A65ArtCod, T010L16_A499GrpFamCod
            }
            , new Object[] {
            T010L17_A396EmprCod, T010L17_A252CliCod, T010L17_A12814ARTConID, T010L17_A65ArtCod
            }
            , new Object[] {
            T010L18_A396EmprCod, T010L18_A252CliCod, T010L18_A65ArtCod, T010L18_A12363SocInt
            }
            , new Object[] {
            T010L19_A396EmprCod, T010L19_A4929Inc_Dia, T010L19_A5728JBCLLin
            }
            , new Object[] {
            T010L20_A396EmprCod, T010L20_A252CliCod, T010L20_A5809MMezCod, T010L20_A65ArtCod
            }
            , new Object[] {
            T010L21_A396EmprCod, T010L21_A252CliCod, T010L21_A5234MezCod, T010L21_A5240MezLin
            }
            , new Object[] {
            T010L22_A396EmprCod, T010L22_A252CliCod, T010L22_A65ArtCod, T010L22_A4116estreclim
            }
            , new Object[] {
            T010L23_A396EmprCod, T010L23_A252CliCod, T010L23_A65ArtCod, T010L23_A4061EstNomCol
            }
            , new Object[] {
            T010L24_A396EmprCod, T010L24_A9705ErpNped, T010L24_A8652ErpLin
            }
            , new Object[] {
            T010L25_A396EmprCod, T010L25_A252CliCod, T010L25_A65ArtCod, T010L25_A7266CAAqP
            }
            , new Object[] {
            T010L26_A396EmprCod, T010L26_A252CliCod, T010L26_A65ArtCod, T010L26_A11084H_DiaA
            }
            , new Object[] {
            T010L27_A396EmprCod, T010L27_A252CliCod, T010L27_A65ArtCod, T010L27_A10972Int_cod
            }
            , new Object[] {
            T010L28_A396EmprCod, T010L28_A252CliCod, T010L28_A65ArtCod, T010L28_A10577Pg_Procod
            }
            , new Object[] {
            T010L29_A396EmprCod, T010L29_A252CliCod, T010L29_A65ArtCod, T010L29_A10272Hz_cod
            }
            , new Object[] {
            T010L30_A396EmprCod, T010L30_A252CliCod, T010L30_A65ArtCod, T010L30_A10041ArtSH
            }
            , new Object[] {
            T010L31_A396EmprCod, T010L31_A252CliCod, T010L31_A65ArtCod, T010L31_A8427TipoCt, T010L31_A8428CapMxMq
            }
            , new Object[] {
            T010L32_A396EmprCod, T010L32_A252CliCod, T010L32_A65ArtCod, T010L32_A8342CodPred
            }
            , new Object[] {
            T010L33_A396EmprCod, T010L33_A252CliCod, T010L33_A65ArtCod, T010L33_A8089ArtcodTj
            }
            , new Object[] {
            T010L34_A396EmprCod, T010L34_A252CliCod, T010L34_A65ArtCod, T010L34_A7956Mq_CodM
            }
            , new Object[] {
            T010L35_A396EmprCod, T010L35_A252CliCod, T010L35_A65ArtCod, T010L35_A7956Mq_CodM, T010L35_A7783Mq_LinP, T010L35_A7949Par_Art
            }
            , new Object[] {
            T010L36_A396EmprCod, T010L36_A252CliCod, T010L36_A65ArtCod, T010L36_A7135Lin_fast
            }
            , new Object[] {
            T010L37_A396EmprCod, T010L37_A252CliCod, T010L37_A65ArtCod, T010L37_A6954Mat_lin
            }
            , new Object[] {
            T010L38_A396EmprCod, T010L38_A602MaqCod, T010L38_A6078MaqCliCod, T010L38_A6079MaqArtCod
            }
            , new Object[] {
            T010L39_A396EmprCod, T010L39_A252CliCod, T010L39_A65ArtCod, T010L39_A5382EstCatAny, T010L39_A5383EstCatSer, T010L39_A5384EstCatTip
            }
            , new Object[] {
            T010L40_A396EmprCod, T010L40_A252CliCod, T010L40_A65ArtCod, T010L40_A4658MdlCod
            }
            , new Object[] {
            T010L41_A396EmprCod, T010L41_A252CliCod, T010L41_A4175WebEmpCod
            }
            , new Object[] {
            T010L42_A396EmprCod, T010L42_A252CliCod, T010L42_A4079WEBDISCOD
            }
            , new Object[] {
            T010L43_A396EmprCod, T010L43_A252CliCod, T010L43_A65ArtCod, T010L43_A4058CCFColNom, T010L43_A4059CCFColNum
            }
            , new Object[] {
            T010L44_A396EmprCod, T010L44_A252CliCod, T010L44_A65ArtCod, T010L44_A1177Dibujo, T010L44_A1790DibIntCod
            }
            , new Object[] {
            T010L45_A396EmprCod, T010L45_A252CliCod, T010L45_A65ArtCod, T010L45_A1080LinPre
            }
            , new Object[] {
            T010L46_A396EmprCod, T010L46_A3814PePCod
            }
            , new Object[] {
            T010L47_A396EmprCod, T010L47_A3413OpeManCod, T010L47_A3430PreManNMt, T010L47_A252CliCod, T010L47_A65ArtCod
            }
            , new Object[] {
            T010L48_A396EmprCod, T010L48_A3415ParManNum
            }
            , new Object[] {
            T010L49_A396EmprCod, T010L49_A3331LanBroCod, T010L49_A3333LanBroLin
            }
            , new Object[] {
            T010L50_A396EmprCod, T010L50_A252CliCod, T010L50_A65ArtCod, T010L50_A3319ArtCapKgs
            }
            , new Object[] {
            T010L51_A396EmprCod, T010L51_A252CliCod, T010L51_A65ArtCod, T010L51_A3288CCalCod
            }
            , new Object[] {
            T010L52_A396EmprCod, T010L52_A252CliCod, T010L52_A65ArtCod, T010L52_A3033CCCod
            }
            , new Object[] {
            T010L53_A396EmprCod, T010L53_A252CliCod, T010L53_A65ArtCod, T010L53_A2937RecIntCod
            }
            , new Object[] {
            T010L54_A396EmprCod, T010L54_A252CliCod, T010L54_A65ArtCod, T010L54_A2931Limite2
            }
            , new Object[] {
            T010L55_A396EmprCod, T010L55_A252CliCod, T010L55_A65ArtCod, T010L55_A71ArtEstAny, T010L55_A2756ArtEstSer
            }
            , new Object[] {
            T010L56_A396EmprCod, T010L56_A252CliCod, T010L56_A1504CliProCod, T010L56_A65ArtCod
            }
            , new Object[] {
            T010L57_A396EmprCod, T010L57_A252CliCod, T010L57_A65ArtCod, T010L57_A598LinRec
            }
            , new Object[] {
            T010L58_A396EmprCod, T010L58_A252CliCod, T010L58_A65ArtCod, T010L58_A831TipColCod
            }
            , new Object[] {
            T010L59_A396EmprCod, T010L59_A252CliCod, T010L59_A65ArtCod, T010L59_A758ProCod
            }
            , new Object[] {
            T010L60_A396EmprCod, T010L60_A252CliCod, T010L60_A65ArtCod
            }
            , new Object[] {
            T010L61_A252CliCod, T010L61_A65ArtCod, T010L61_A10563Par_TUsM, T010L61_n10563Par_TUsM, T010L61_A10564Par_TFcM, T010L61_n10564Par_TFcM, T010L61_A10566Par_TFcA, T010L61_n10566Par_TFcA, T010L61_A10565Par_TUsA, T010L61_n10565Par_TUsA,
            T010L61_A7950Par_Dsc, T010L61_n7950Par_Dsc, T010L61_A7954Par_ValTj, T010L61_n7954Par_ValTj, T010L61_A7955Par_ObsTj, T010L61_n7955Par_ObsTj, T010L61_A10551Par_NVar, T010L61_n10551Par_NVar, T010L61_A10552Par_NVarT, T010L61_n10552Par_NVarT,
            T010L61_A396EmprCod, T010L61_A7949Par_Art
            }
            , new Object[] {
            T010L62_A7950Par_Dsc, T010L62_n7950Par_Dsc, T010L62_A10551Par_NVar, T010L62_n10551Par_NVar, T010L62_A10552Par_NVarT, T010L62_n10552Par_NVarT
            }
            , new Object[] {
            T010L63_A396EmprCod, T010L63_A252CliCod, T010L63_A65ArtCod, T010L63_A7949Par_Art
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T010L67_A7950Par_Dsc, T010L67_n7950Par_Dsc, T010L67_A10551Par_NVar, T010L67_n10551Par_NVar, T010L67_A10552Par_NVarT, T010L67_n10552Par_NVarT
            }
            , new Object[] {
            T010L68_A396EmprCod, T010L68_A252CliCod, T010L68_A65ArtCod, T010L68_A7956Mq_CodM, T010L68_A7783Mq_LinP, T010L68_A7949Par_Art
            }
            , new Object[] {
            T010L69_A396EmprCod, T010L69_A252CliCod, T010L69_A65ArtCod, T010L69_A7949Par_Art
            }
            , new Object[] {
            T010L70_A407EmprNom, T010L70_n407EmprNom
            }
            , new Object[] {
            T010L71_A279CliNom
            }
         }
      );
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
      Z10565Par_TUsA = "" ;
      n10565Par_TUsA = false ;
      A10565Par_TUsA = "" ;
      n10565Par_TUsA = false ;
      i10565Par_TUsA = "" ;
      n10565Par_TUsA = false ;
      Z10566Par_TFcA = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n10566Par_TFcA = false ;
      A10566Par_TFcA = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n10566Par_TFcA = false ;
      i10566Par_TFcA = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n10566Par_TFcA = false ;
   }

   private byte GxWebError ;
   private byte AV35FlagR ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte GXv_int6[] ;
   private byte ZV35FlagR ;
   private short Z7949Par_Art ;
   private short O7949Par_Art ;
   private short nRcdDeleted_1112 ;
   private short nRcdExists_1112 ;
   private short nIsMod_1112 ;
   private short A7949Par_Art ;
   private short A10551Par_NVar ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1112 ;
   private short RcdFound1112 ;
   private short nBlankRcdUsr1112 ;
   private short T7949Par_Art ;
   private short RcdFound10 ;
   private short nIsDirty_10 ;
   private short Z10551Par_NVar ;
   private short nIsDirty_1112 ;
   private short GXv_int5[] ;
   private short GXv_int4[] ;
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
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtArtDsc_Enabled ;
   private int edtMat_Maq_Enabled ;
   private int edtMat_UsuM_Enabled ;
   private int edtMat_FecM_Enabled ;
   private int edtavnRcdDeleted_1112_Enabled ;
   private int edtPar_Art_Enabled ;
   private int edtPar_Dsc_Enabled ;
   private int edtPar_ValTj_Enabled ;
   private int edtPar_ObsTj_Enabled ;
   private int edtPar_TUsM_Enabled ;
   private int edtPar_TFcM_Enabled ;
   private int edtPar_TUsA_Enabled ;
   private int edtPar_TFcA_Enabled ;
   private int edtPar_NVar_Enabled ;
   private int edtPar_NVarT_Enabled ;
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
   private int defedtPar_TFcA_Enabled ;
   private int defedtPar_TUsA_Enabled ;
   private int defedtPar_TFcM_Enabled ;
   private int defedtPar_TUsM_Enabled ;
   private int defedtPar_Art_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtMat_FecM_Backcolor ;
   private int edtMat_UsuM_Backcolor ;
   private int edtMat_Maq_Backcolor ;
   private int edtArtDsc_Backcolor ;
   private int edtArtCod_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int GXv_int2[] ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA65ArtCod ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z69ArtDsc ;
   private String Z6953Mat_Maq ;
   private String Z10561Mat_UsuM ;
   private String O6953Mat_Maq ;
   private String Z10563Par_TUsM ;
   private String Z10565Par_TUsA ;
   private String Z7954Par_ValTj ;
   private String O7954Par_ValTj ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV34Msg_err ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtArtDsc_Internalname ;
   private String sGXsfl_65_idx="0001" ;
   private String AV8UsurCod ;
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
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String A69ArtDsc ;
   private String edtArtDsc_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtMat_Maq_Internalname ;
   private String A6953Mat_Maq ;
   private String edtMat_Maq_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtMat_UsuM_Internalname ;
   private String A10561Mat_UsuM ;
   private String edtMat_UsuM_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtMat_FecM_Internalname ;
   private String edtMat_FecM_Jsonclick ;
   private String B6953Mat_Maq ;
   private String sMode1112 ;
   private String edtavnRcdDeleted_1112_Internalname ;
   private String edtPar_Art_Internalname ;
   private String edtPar_Dsc_Internalname ;
   private String edtPar_ValTj_Internalname ;
   private String edtPar_ObsTj_Internalname ;
   private String edtPar_TUsM_Internalname ;
   private String edtPar_TFcM_Internalname ;
   private String edtPar_TUsA_Internalname ;
   private String edtPar_TFcA_Internalname ;
   private String edtPar_NVar_Internalname ;
   private String edtPar_NVarT_Internalname ;
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
   private String AV32Modif ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode10 ;
   private String sV32Modif ;
   private String OV32Modif ;
   private String GXCCtl ;
   private String A7950Par_Dsc ;
   private String A7954Par_ValTj ;
   private String A10563Par_TUsM ;
   private String A10565Par_TUsA ;
   private String A10552Par_NVarT ;
   private String T7954Par_ValTj ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z7950Par_Dsc ;
   private String Z10552Par_NVarT ;
   private String sGXsfl_65_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1112_Jsonclick ;
   private String edtPar_Art_Jsonclick ;
   private String edtPar_Dsc_Jsonclick ;
   private String edtPar_ValTj_Jsonclick ;
   private String edtPar_ObsTj_Jsonclick ;
   private String edtPar_TUsM_Jsonclick ;
   private String edtPar_TFcM_Jsonclick ;
   private String edtPar_TUsA_Jsonclick ;
   private String edtPar_TFcA_Jsonclick ;
   private String edtPar_NVar_Jsonclick ;
   private String edtPar_NVarT_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i10565Par_TUsA ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ69ArtDsc ;
   private String ZZ6953Mat_Maq ;
   private String ZZ10561Mat_UsuM ;
   private String ZO6953Mat_Maq ;
   private String GXv_char7[] ;
   private String GXv_char3[] ;
   private String GXv_char1[] ;
   private String ZV34Msg_err ;
   private java.util.Date Z10562Mat_FecM ;
   private java.util.Date Z10564Par_TFcM ;
   private java.util.Date Z10566Par_TFcA ;
   private java.util.Date A10562Mat_FecM ;
   private java.util.Date A10564Par_TFcM ;
   private java.util.Date A10566Par_TFcA ;
   private java.util.Date i10566Par_TFcA ;
   private java.util.Date ZZ10562Mat_FecM ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean n65ArtCod ;
   private boolean n10551Par_NVar ;
   private boolean wbErr ;
   private boolean n6953Mat_Maq ;
   private boolean bGXsfl_65_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n69ArtDsc ;
   private boolean n10561Mat_UsuM ;
   private boolean n10562Mat_FecM ;
   private boolean n10566Par_TFcA ;
   private boolean n10565Par_TUsA ;
   private boolean n10563Par_TUsM ;
   private boolean n10564Par_TFcM ;
   private boolean n7950Par_Dsc ;
   private boolean n7954Par_ValTj ;
   private boolean n7955Par_ObsTj ;
   private boolean n10552Par_NVarT ;
   private boolean Gx_longc ;
   private String Z7955Par_ObsTj ;
   private String A7955Par_ObsTj ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T010L7_A407EmprNom ;
   private boolean[] T010L7_n407EmprNom ;
   private String[] T010L8_A279CliNom ;
   private String[] T010L9_A65ArtCod ;
   private boolean[] T010L9_n65ArtCod ;
   private java.util.Date[] T010L9_A10562Mat_FecM ;
   private boolean[] T010L9_n10562Mat_FecM ;
   private String[] T010L9_A407EmprNom ;
   private boolean[] T010L9_n407EmprNom ;
   private String[] T010L9_A279CliNom ;
   private String[] T010L9_A69ArtDsc ;
   private boolean[] T010L9_n69ArtDsc ;
   private String[] T010L9_A6953Mat_Maq ;
   private boolean[] T010L9_n6953Mat_Maq ;
   private String[] T010L9_A10561Mat_UsuM ;
   private boolean[] T010L9_n10561Mat_UsuM ;
   private String[] T010L9_A396EmprCod ;
   private int[] T010L9_A252CliCod ;
   private boolean[] T010L9_n252CliCod ;
   private String[] T010L10_A396EmprCod ;
   private int[] T010L10_A252CliCod ;
   private boolean[] T010L10_n252CliCod ;
   private String[] T010L10_A65ArtCod ;
   private boolean[] T010L10_n65ArtCod ;
   private String[] T010L6_A65ArtCod ;
   private boolean[] T010L6_n65ArtCod ;
   private java.util.Date[] T010L6_A10562Mat_FecM ;
   private boolean[] T010L6_n10562Mat_FecM ;
   private String[] T010L6_A69ArtDsc ;
   private boolean[] T010L6_n69ArtDsc ;
   private String[] T010L6_A6953Mat_Maq ;
   private boolean[] T010L6_n6953Mat_Maq ;
   private String[] T010L6_A10561Mat_UsuM ;
   private boolean[] T010L6_n10561Mat_UsuM ;
   private String[] T010L6_A396EmprCod ;
   private int[] T010L6_A252CliCod ;
   private boolean[] T010L6_n252CliCod ;
   private String[] T010L11_A396EmprCod ;
   private int[] T010L11_A252CliCod ;
   private boolean[] T010L11_n252CliCod ;
   private String[] T010L11_A65ArtCod ;
   private boolean[] T010L11_n65ArtCod ;
   private String[] T010L12_A396EmprCod ;
   private int[] T010L12_A252CliCod ;
   private boolean[] T010L12_n252CliCod ;
   private String[] T010L12_A65ArtCod ;
   private boolean[] T010L12_n65ArtCod ;
   private String[] T010L5_A65ArtCod ;
   private boolean[] T010L5_n65ArtCod ;
   private java.util.Date[] T010L5_A10562Mat_FecM ;
   private boolean[] T010L5_n10562Mat_FecM ;
   private String[] T010L5_A69ArtDsc ;
   private boolean[] T010L5_n69ArtDsc ;
   private String[] T010L5_A6953Mat_Maq ;
   private boolean[] T010L5_n6953Mat_Maq ;
   private String[] T010L5_A10561Mat_UsuM ;
   private boolean[] T010L5_n10561Mat_UsuM ;
   private String[] T010L5_A396EmprCod ;
   private int[] T010L5_A252CliCod ;
   private boolean[] T010L5_n252CliCod ;
   private String[] T010L16_A396EmprCod ;
   private int[] T010L16_A252CliCod ;
   private boolean[] T010L16_n252CliCod ;
   private String[] T010L16_A65ArtCod ;
   private boolean[] T010L16_n65ArtCod ;
   private byte[] T010L16_A499GrpFamCod ;
   private String[] T010L17_A396EmprCod ;
   private int[] T010L17_A252CliCod ;
   private boolean[] T010L17_n252CliCod ;
   private String[] T010L17_A12814ARTConID ;
   private String[] T010L17_A65ArtCod ;
   private boolean[] T010L17_n65ArtCod ;
   private String[] T010L18_A396EmprCod ;
   private int[] T010L18_A252CliCod ;
   private boolean[] T010L18_n252CliCod ;
   private String[] T010L18_A65ArtCod ;
   private boolean[] T010L18_n65ArtCod ;
   private byte[] T010L18_A12363SocInt ;
   private String[] T010L19_A396EmprCod ;
   private java.util.Date[] T010L19_A4929Inc_Dia ;
   private short[] T010L19_A5728JBCLLin ;
   private String[] T010L20_A396EmprCod ;
   private int[] T010L20_A252CliCod ;
   private boolean[] T010L20_n252CliCod ;
   private String[] T010L20_A5809MMezCod ;
   private String[] T010L20_A65ArtCod ;
   private boolean[] T010L20_n65ArtCod ;
   private String[] T010L21_A396EmprCod ;
   private int[] T010L21_A252CliCod ;
   private boolean[] T010L21_n252CliCod ;
   private String[] T010L21_A5234MezCod ;
   private byte[] T010L21_A5240MezLin ;
   private String[] T010L22_A396EmprCod ;
   private int[] T010L22_A252CliCod ;
   private boolean[] T010L22_n252CliCod ;
   private String[] T010L22_A65ArtCod ;
   private boolean[] T010L22_n65ArtCod ;
   private int[] T010L22_A4116estreclim ;
   private String[] T010L23_A396EmprCod ;
   private int[] T010L23_A252CliCod ;
   private boolean[] T010L23_n252CliCod ;
   private String[] T010L23_A65ArtCod ;
   private boolean[] T010L23_n65ArtCod ;
   private String[] T010L23_A4061EstNomCol ;
   private String[] T010L24_A396EmprCod ;
   private String[] T010L24_A9705ErpNped ;
   private short[] T010L24_A8652ErpLin ;
   private String[] T010L25_A396EmprCod ;
   private int[] T010L25_A252CliCod ;
   private boolean[] T010L25_n252CliCod ;
   private String[] T010L25_A65ArtCod ;
   private boolean[] T010L25_n65ArtCod ;
   private String[] T010L25_A7266CAAqP ;
   private String[] T010L26_A396EmprCod ;
   private int[] T010L26_A252CliCod ;
   private boolean[] T010L26_n252CliCod ;
   private String[] T010L26_A65ArtCod ;
   private boolean[] T010L26_n65ArtCod ;
   private java.util.Date[] T010L26_A11084H_DiaA ;
   private String[] T010L27_A396EmprCod ;
   private int[] T010L27_A252CliCod ;
   private boolean[] T010L27_n252CliCod ;
   private String[] T010L27_A65ArtCod ;
   private boolean[] T010L27_n65ArtCod ;
   private byte[] T010L27_A10972Int_cod ;
   private String[] T010L28_A396EmprCod ;
   private int[] T010L28_A252CliCod ;
   private boolean[] T010L28_n252CliCod ;
   private String[] T010L28_A65ArtCod ;
   private boolean[] T010L28_n65ArtCod ;
   private String[] T010L28_A10577Pg_Procod ;
   private String[] T010L29_A396EmprCod ;
   private int[] T010L29_A252CliCod ;
   private boolean[] T010L29_n252CliCod ;
   private String[] T010L29_A65ArtCod ;
   private boolean[] T010L29_n65ArtCod ;
   private String[] T010L29_A10272Hz_cod ;
   private String[] T010L30_A396EmprCod ;
   private int[] T010L30_A252CliCod ;
   private boolean[] T010L30_n252CliCod ;
   private String[] T010L30_A65ArtCod ;
   private boolean[] T010L30_n65ArtCod ;
   private String[] T010L30_A10041ArtSH ;
   private String[] T010L31_A396EmprCod ;
   private int[] T010L31_A252CliCod ;
   private boolean[] T010L31_n252CliCod ;
   private String[] T010L31_A65ArtCod ;
   private boolean[] T010L31_n65ArtCod ;
   private String[] T010L31_A8427TipoCt ;
   private int[] T010L31_A8428CapMxMq ;
   private String[] T010L32_A396EmprCod ;
   private int[] T010L32_A252CliCod ;
   private boolean[] T010L32_n252CliCod ;
   private String[] T010L32_A65ArtCod ;
   private boolean[] T010L32_n65ArtCod ;
   private short[] T010L32_A8342CodPred ;
   private String[] T010L33_A396EmprCod ;
   private int[] T010L33_A252CliCod ;
   private boolean[] T010L33_n252CliCod ;
   private String[] T010L33_A65ArtCod ;
   private boolean[] T010L33_n65ArtCod ;
   private String[] T010L33_A8089ArtcodTj ;
   private String[] T010L34_A396EmprCod ;
   private int[] T010L34_A252CliCod ;
   private boolean[] T010L34_n252CliCod ;
   private String[] T010L34_A65ArtCod ;
   private boolean[] T010L34_n65ArtCod ;
   private String[] T010L34_A7956Mq_CodM ;
   private String[] T010L35_A396EmprCod ;
   private int[] T010L35_A252CliCod ;
   private boolean[] T010L35_n252CliCod ;
   private String[] T010L35_A65ArtCod ;
   private boolean[] T010L35_n65ArtCod ;
   private String[] T010L35_A7956Mq_CodM ;
   private short[] T010L35_A7783Mq_LinP ;
   private short[] T010L35_A7949Par_Art ;
   private String[] T010L36_A396EmprCod ;
   private int[] T010L36_A252CliCod ;
   private boolean[] T010L36_n252CliCod ;
   private String[] T010L36_A65ArtCod ;
   private boolean[] T010L36_n65ArtCod ;
   private short[] T010L36_A7135Lin_fast ;
   private String[] T010L37_A396EmprCod ;
   private int[] T010L37_A252CliCod ;
   private boolean[] T010L37_n252CliCod ;
   private String[] T010L37_A65ArtCod ;
   private boolean[] T010L37_n65ArtCod ;
   private short[] T010L37_A6954Mat_lin ;
   private String[] T010L38_A396EmprCod ;
   private String[] T010L38_A602MaqCod ;
   private int[] T010L38_A6078MaqCliCod ;
   private String[] T010L38_A6079MaqArtCod ;
   private String[] T010L39_A396EmprCod ;
   private int[] T010L39_A252CliCod ;
   private boolean[] T010L39_n252CliCod ;
   private String[] T010L39_A65ArtCod ;
   private boolean[] T010L39_n65ArtCod ;
   private short[] T010L39_A5382EstCatAny ;
   private String[] T010L39_A5383EstCatSer ;
   private short[] T010L39_A5384EstCatTip ;
   private String[] T010L40_A396EmprCod ;
   private int[] T010L40_A252CliCod ;
   private boolean[] T010L40_n252CliCod ;
   private String[] T010L40_A65ArtCod ;
   private boolean[] T010L40_n65ArtCod ;
   private String[] T010L40_A4658MdlCod ;
   private String[] T010L41_A396EmprCod ;
   private int[] T010L41_A252CliCod ;
   private boolean[] T010L41_n252CliCod ;
   private String[] T010L41_A4175WebEmpCod ;
   private String[] T010L42_A396EmprCod ;
   private int[] T010L42_A252CliCod ;
   private boolean[] T010L42_n252CliCod ;
   private String[] T010L42_A4079WEBDISCOD ;
   private String[] T010L43_A396EmprCod ;
   private int[] T010L43_A252CliCod ;
   private boolean[] T010L43_n252CliCod ;
   private String[] T010L43_A65ArtCod ;
   private boolean[] T010L43_n65ArtCod ;
   private String[] T010L43_A4058CCFColNom ;
   private int[] T010L43_A4059CCFColNum ;
   private String[] T010L44_A396EmprCod ;
   private int[] T010L44_A252CliCod ;
   private boolean[] T010L44_n252CliCod ;
   private String[] T010L44_A65ArtCod ;
   private boolean[] T010L44_n65ArtCod ;
   private String[] T010L44_A1177Dibujo ;
   private int[] T010L44_A1790DibIntCod ;
   private String[] T010L45_A396EmprCod ;
   private int[] T010L45_A252CliCod ;
   private boolean[] T010L45_n252CliCod ;
   private String[] T010L45_A65ArtCod ;
   private boolean[] T010L45_n65ArtCod ;
   private byte[] T010L45_A1080LinPre ;
   private String[] T010L46_A396EmprCod ;
   private long[] T010L46_A3814PePCod ;
   private String[] T010L47_A396EmprCod ;
   private byte[] T010L47_A3413OpeManCod ;
   private String[] T010L47_A3430PreManNMt ;
   private int[] T010L47_A252CliCod ;
   private boolean[] T010L47_n252CliCod ;
   private String[] T010L47_A65ArtCod ;
   private boolean[] T010L47_n65ArtCod ;
   private String[] T010L48_A396EmprCod ;
   private int[] T010L48_A3415ParManNum ;
   private String[] T010L49_A396EmprCod ;
   private byte[] T010L49_A3331LanBroCod ;
   private short[] T010L49_A3333LanBroLin ;
   private String[] T010L50_A396EmprCod ;
   private int[] T010L50_A252CliCod ;
   private boolean[] T010L50_n252CliCod ;
   private String[] T010L50_A65ArtCod ;
   private boolean[] T010L50_n65ArtCod ;
   private java.math.BigDecimal[] T010L50_A3319ArtCapKgs ;
   private String[] T010L51_A396EmprCod ;
   private int[] T010L51_A252CliCod ;
   private boolean[] T010L51_n252CliCod ;
   private String[] T010L51_A65ArtCod ;
   private boolean[] T010L51_n65ArtCod ;
   private String[] T010L51_A3288CCalCod ;
   private String[] T010L52_A396EmprCod ;
   private int[] T010L52_A252CliCod ;
   private boolean[] T010L52_n252CliCod ;
   private String[] T010L52_A65ArtCod ;
   private boolean[] T010L52_n65ArtCod ;
   private String[] T010L52_A3033CCCod ;
   private String[] T010L53_A396EmprCod ;
   private int[] T010L53_A252CliCod ;
   private boolean[] T010L53_n252CliCod ;
   private String[] T010L53_A65ArtCod ;
   private boolean[] T010L53_n65ArtCod ;
   private byte[] T010L53_A2937RecIntCod ;
   private String[] T010L54_A396EmprCod ;
   private int[] T010L54_A252CliCod ;
   private boolean[] T010L54_n252CliCod ;
   private String[] T010L54_A65ArtCod ;
   private boolean[] T010L54_n65ArtCod ;
   private short[] T010L54_A2931Limite2 ;
   private String[] T010L55_A396EmprCod ;
   private int[] T010L55_A252CliCod ;
   private boolean[] T010L55_n252CliCod ;
   private String[] T010L55_A65ArtCod ;
   private boolean[] T010L55_n65ArtCod ;
   private short[] T010L55_A71ArtEstAny ;
   private String[] T010L55_A2756ArtEstSer ;
   private String[] T010L56_A396EmprCod ;
   private int[] T010L56_A252CliCod ;
   private boolean[] T010L56_n252CliCod ;
   private String[] T010L56_A1504CliProCod ;
   private String[] T010L56_A65ArtCod ;
   private boolean[] T010L56_n65ArtCod ;
   private String[] T010L57_A396EmprCod ;
   private int[] T010L57_A252CliCod ;
   private boolean[] T010L57_n252CliCod ;
   private String[] T010L57_A65ArtCod ;
   private boolean[] T010L57_n65ArtCod ;
   private byte[] T010L57_A598LinRec ;
   private String[] T010L58_A396EmprCod ;
   private int[] T010L58_A252CliCod ;
   private boolean[] T010L58_n252CliCod ;
   private String[] T010L58_A65ArtCod ;
   private boolean[] T010L58_n65ArtCod ;
   private byte[] T010L58_A831TipColCod ;
   private String[] T010L59_A396EmprCod ;
   private int[] T010L59_A252CliCod ;
   private boolean[] T010L59_n252CliCod ;
   private String[] T010L59_A65ArtCod ;
   private boolean[] T010L59_n65ArtCod ;
   private String[] T010L59_A758ProCod ;
   private String[] T010L60_A396EmprCod ;
   private int[] T010L60_A252CliCod ;
   private boolean[] T010L60_n252CliCod ;
   private String[] T010L60_A65ArtCod ;
   private boolean[] T010L60_n65ArtCod ;
   private int[] T010L61_A252CliCod ;
   private boolean[] T010L61_n252CliCod ;
   private String[] T010L61_A65ArtCod ;
   private boolean[] T010L61_n65ArtCod ;
   private String[] T010L61_A10563Par_TUsM ;
   private boolean[] T010L61_n10563Par_TUsM ;
   private java.util.Date[] T010L61_A10564Par_TFcM ;
   private boolean[] T010L61_n10564Par_TFcM ;
   private java.util.Date[] T010L61_A10566Par_TFcA ;
   private boolean[] T010L61_n10566Par_TFcA ;
   private String[] T010L61_A10565Par_TUsA ;
   private boolean[] T010L61_n10565Par_TUsA ;
   private String[] T010L61_A7950Par_Dsc ;
   private boolean[] T010L61_n7950Par_Dsc ;
   private String[] T010L61_A7954Par_ValTj ;
   private boolean[] T010L61_n7954Par_ValTj ;
   private String[] T010L61_A7955Par_ObsTj ;
   private boolean[] T010L61_n7955Par_ObsTj ;
   private short[] T010L61_A10551Par_NVar ;
   private boolean[] T010L61_n10551Par_NVar ;
   private String[] T010L61_A10552Par_NVarT ;
   private boolean[] T010L61_n10552Par_NVarT ;
   private String[] T010L61_A396EmprCod ;
   private short[] T010L61_A7949Par_Art ;
   private String[] T010L4_A7950Par_Dsc ;
   private boolean[] T010L4_n7950Par_Dsc ;
   private short[] T010L4_A10551Par_NVar ;
   private boolean[] T010L4_n10551Par_NVar ;
   private String[] T010L4_A10552Par_NVarT ;
   private boolean[] T010L4_n10552Par_NVarT ;
   private String[] T010L62_A7950Par_Dsc ;
   private boolean[] T010L62_n7950Par_Dsc ;
   private short[] T010L62_A10551Par_NVar ;
   private boolean[] T010L62_n10551Par_NVar ;
   private String[] T010L62_A10552Par_NVarT ;
   private boolean[] T010L62_n10552Par_NVarT ;
   private String[] T010L63_A396EmprCod ;
   private int[] T010L63_A252CliCod ;
   private boolean[] T010L63_n252CliCod ;
   private String[] T010L63_A65ArtCod ;
   private boolean[] T010L63_n65ArtCod ;
   private short[] T010L63_A7949Par_Art ;
   private int[] T010L3_A252CliCod ;
   private boolean[] T010L3_n252CliCod ;
   private String[] T010L3_A65ArtCod ;
   private boolean[] T010L3_n65ArtCod ;
   private String[] T010L3_A10563Par_TUsM ;
   private boolean[] T010L3_n10563Par_TUsM ;
   private java.util.Date[] T010L3_A10564Par_TFcM ;
   private boolean[] T010L3_n10564Par_TFcM ;
   private java.util.Date[] T010L3_A10566Par_TFcA ;
   private boolean[] T010L3_n10566Par_TFcA ;
   private String[] T010L3_A10565Par_TUsA ;
   private boolean[] T010L3_n10565Par_TUsA ;
   private String[] T010L3_A7954Par_ValTj ;
   private boolean[] T010L3_n7954Par_ValTj ;
   private String[] T010L3_A7955Par_ObsTj ;
   private boolean[] T010L3_n7955Par_ObsTj ;
   private String[] T010L3_A396EmprCod ;
   private short[] T010L3_A7949Par_Art ;
   private int[] T010L2_A252CliCod ;
   private boolean[] T010L2_n252CliCod ;
   private String[] T010L2_A65ArtCod ;
   private boolean[] T010L2_n65ArtCod ;
   private String[] T010L2_A10563Par_TUsM ;
   private boolean[] T010L2_n10563Par_TUsM ;
   private java.util.Date[] T010L2_A10564Par_TFcM ;
   private boolean[] T010L2_n10564Par_TFcM ;
   private java.util.Date[] T010L2_A10566Par_TFcA ;
   private boolean[] T010L2_n10566Par_TFcA ;
   private String[] T010L2_A10565Par_TUsA ;
   private boolean[] T010L2_n10565Par_TUsA ;
   private String[] T010L2_A7954Par_ValTj ;
   private boolean[] T010L2_n7954Par_ValTj ;
   private String[] T010L2_A7955Par_ObsTj ;
   private boolean[] T010L2_n7955Par_ObsTj ;
   private String[] T010L2_A396EmprCod ;
   private short[] T010L2_A7949Par_Art ;
   private String[] T010L67_A7950Par_Dsc ;
   private boolean[] T010L67_n7950Par_Dsc ;
   private short[] T010L67_A10551Par_NVar ;
   private boolean[] T010L67_n10551Par_NVar ;
   private String[] T010L67_A10552Par_NVarT ;
   private boolean[] T010L67_n10552Par_NVarT ;
   private String[] T010L68_A396EmprCod ;
   private int[] T010L68_A252CliCod ;
   private boolean[] T010L68_n252CliCod ;
   private String[] T010L68_A65ArtCod ;
   private boolean[] T010L68_n65ArtCod ;
   private String[] T010L68_A7956Mq_CodM ;
   private short[] T010L68_A7783Mq_LinP ;
   private short[] T010L68_A7949Par_Art ;
   private String[] T010L69_A396EmprCod ;
   private int[] T010L69_A252CliCod ;
   private boolean[] T010L69_n252CliCod ;
   private String[] T010L69_A65ArtCod ;
   private boolean[] T010L69_n65ArtCod ;
   private short[] T010L69_A7949Par_Art ;
   private String[] T010L70_A407EmprNom ;
   private boolean[] T010L70_n407EmprNom ;
   private String[] T010L71_A279CliNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tarttej__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tarttej__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tarttej__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tarttej__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tarttej__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T010L2", "SELECT CliCod, ArtCod, Par_TUsM, Par_TFcM, Par_TFcA, Par_TUsA, Par_ValTj, Par_ObsTj, EmprCod, Par_Art FROM TXPARTTEJ WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Par_Art = ?  FOR UPDATE OF Par_TUsM, Par_TFcM, Par_TFcA, Par_TUsA, Par_ValTj, Par_ObsTj NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010L3", "SELECT CliCod, ArtCod, Par_TUsM, Par_TFcM, Par_TFcA, Par_TUsA, Par_ValTj, Par_ObsTj, EmprCod, Par_Art FROM TXPARTTEJ WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Par_Art = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010L4", "SELECT Par_Dsc, Par_NVar, Par_NVarT FROM TXPARTPAR WHERE EmprCod = ? AND Par_Art = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L5", "SELECT ArtCod, Mat_FecM, ArtDsc, Mat_Maq, Mat_UsuM, EmprCod, CliCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?  FOR UPDATE OF Mat_FecM, ArtDsc, Mat_Maq, Mat_UsuM NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L6", "SELECT ArtCod, Mat_FecM, ArtDsc, Mat_Maq, Mat_UsuM, EmprCod, CliCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L8", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L9", "SELECT /*+ FIRST_ROWS(1) */ TM1.ArtCod, TM1.Mat_FecM, T2.EmprNom, T3.CliNom, TM1.ArtDsc, TM1.Mat_Maq, TM1.Mat_UsuM, TM1.EmprCod, TM1.CliCod FROM ((TXPARTICU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T010L13", "INSERT INTO TXPARTICU(ArtCod, Mat_FecM, ArtDsc, Mat_Maq, Mat_UsuM, EmprCod, CliCod, ArtMat, TipArtCod, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtTipLar, ArtCorOri, ArtEncOri, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtObs, ArtObsFac, ArtPreKgm, ArtPreMtr, ArtPreDef, ULinRec, ArtNMtr, ArtPml, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoN, ArtRdoA, ArtNumTex1, ArtNumTex2, NumTexCod, ArtFacAbs, ArtCosBase, ArtPle2, ArtObsLon, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtPreCap, ArtAnu, ArtFecCre, ArtPrMEst, ULinPre, ClasCod, ArtPmPPza, ArtUsrCod, ArtFecMod, ArtPreUlAc, ArtPreUsrM, ArtPelAnh, ArtAcaAnh, ArtAcaMar, ArtAcaBak, ArtLotMaq, ArtCruMts, ArtCruKgs, ArtCruEnr, ArtLotPza, ArtLotMts, ArtLotKgs, ArtAcaFor, ArtRb, ArtValMtr, ArtCodExt, ArtComer, ClaTubCod, ClaBolCod, ArtRdoCru1, ArtRdoCru2, ArtLu, ArtFacTor, Mat_UltL, UltLinFT, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtBlo, ArtCla, CapKgs1, CapKgs2, CapKgs3, CapKgs4, CapKgs5, CapKgs6, CapKgs7, CapKgs8, CapKgs9, CapKgs10, ArtFabsH, ArtFabsT, ArtNProg, ArtVbd, ArtVbn, ArtAb, ArtObsGrm, ArtObsAnc, ArtCdb, ArtGalga, ArtPlatina, ArtPgd, ArtTh, Art_Cd, CapUsuM, CapFecM, CapUsuA, CapFecA, ArtHilos, ArtPasad, ArtAncC, ArtGrm2C, ArtRdoC, ArtPreObs, ArtFacUti, ArtPreEst, ArtDefEst, ArtNumTip, ArtPreUnd, Mat_ObsG, ArtMT, ArtTRabs, ArtKgMn, ArtElgAnc, ArtElgLar, ArtRdoCru, ArtEncLarg, ArtEncAnc, ArtObsOtra, ArtRdto4, Artdsc2, ArtgrComp, ArtKgspp, ArtPrepp, ArtActivo) VALUES(?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, ' ')", GX_NOMASK, "TXPARTICU")
         ,new UpdateCursor("T010L14", "UPDATE TXPARTICU SET Mat_FecM=?, ArtDsc=?, Mat_Maq=?, Mat_UsuM=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK, "TXPARTICU")
         ,new UpdateCursor("T010L15", "DELETE FROM TXPARTICU  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK, "TXPARTICU")
         ,new ForEachCursor("T010L16", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, GrpFamCod FROM TXPEstTa0 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L17", "SELECT * FROM (SELECT EmprCod, CliCod, ARTConID, ArtCod FROM TXPARTCo1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L18", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, SocInt FROM TXPSOCRAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L19", "SELECT * FROM (SELECT EmprCod, Inc_Dia, JBCLLin FROM TXPJBConL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L20", "SELECT * FROM (SELECT EmprCod, CliCod, MMezCod, ArtCod FROM TXPMEZCL1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L21", "SELECT * FROM (SELECT EmprCod, CliCod, MezCod, MezLin FROM TXPLMZCLA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L22", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, estreclim FROM TXPrecest WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L23", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, EstNomCol FROM TXPCESTAM WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L24", "SELECT * FROM (SELECT EmprCod, ErpNped, ErpLin FROM TXPCPEDCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L25", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CAAqP FROM TXPPCARC WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L26", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, H_DiaA FROM TXPHPREAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L27", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Int_cod FROM TXPINCINT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L28", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Pg_Procod FROM TXPPGCOLO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L29", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Hz_cod FROM TXPTR02JL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L30", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtSH FROM TXPCLATFA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L31", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipoCt, CapMxMq FROM TXPARTMQT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L32", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CodPred FROM TXPPVPNIT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L33", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtcodTj FROM TXPTEJART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L34", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mq_CodM FROM TXPTNART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L35", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mq_CodM, Mq_LinP, Par_Art FROM TXPTNARTp WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L36", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Lin_fast FROM TXPPARTIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L37", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mat_lin FROM TXPARTMAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L38", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCliCod = ? AND MaqArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L39", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip FROM TXPESTCAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L40", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, MdlCod FROM TXPModels WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L41", "SELECT * FROM (SELECT EmprCod, CliCod, WebEmpCod FROM TXPWEBEMP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L42", "SELECT * FROM (SELECT EmprCod, CliCod, WEBDISCOD FROM TXPWebDis WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L43", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum FROM TXPCCSeri WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L44", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Dibujo, DibIntCod FROM TXPCPRECO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L45", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinPre FROM TXPLINPRE WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L46", "SELECT * FROM (SELECT EmprCod, PePCod FROM TXPPedPro WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L47", "SELECT * FROM (SELECT EmprCod, OpeManCod, PreManNMt, CliCod, ArtCod FROM TXPPREMAN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L48", "SELECT * FROM (SELECT EmprCod, ParManNum FROM TXPPARMAN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L49", "SELECT * FROM (SELECT EmprCod, LanBroCod, LanBroLin FROM TXPLANBRL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L50", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtCapKgs FROM TXPPRECAP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L51", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCalCod FROM TXPPARSER WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L52", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCCod FROM TXPCCArt WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L53", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, RecIntCod FROM TXPARTINT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L54", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Limite2 FROM TXPRECARB WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L55", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer FROM TXPCESART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L56", "SELECT * FROM (SELECT EmprCod, CliCod, CliProCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L57", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinRec FROM TXPRECARG WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L58", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipColCod FROM TXPPRETCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L59", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L60", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L61", "SELECT T1.CliCod, T1.ArtCod, T1.Par_TUsM, T1.Par_TFcM, T1.Par_TFcA, T1.Par_TUsA, T2.Par_Dsc, T1.Par_ValTj, T1.Par_ObsTj, T2.Par_NVar, T2.Par_NVarT, T1.EmprCod, T1.Par_Art FROM (TXPARTTEJ T1 INNER JOIN TXPARTPAR T2 ON T2.EmprCod = T1.EmprCod AND T2.Par_Art = T1.Par_Art) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.Par_Art = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.Par_Art ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010L62", "SELECT Par_Dsc, Par_NVar, Par_NVarT FROM TXPARTPAR WHERE EmprCod = ? AND Par_Art = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010L63", "SELECT EmprCod, CliCod, ArtCod, Par_Art FROM TXPARTTEJ WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Par_Art = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T010L64", "INSERT INTO TXPARTTEJ(CliCod, ArtCod, Par_TUsM, Par_TFcM, Par_TFcA, Par_TUsA, Par_ValTj, Par_ObsTj, EmprCod, Par_Art) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPARTTEJ")
         ,new UpdateCursor("T010L65", "UPDATE TXPARTTEJ SET Par_TUsM=?, Par_TFcM=?, Par_TFcA=?, Par_TUsA=?, Par_ValTj=?, Par_ObsTj=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Par_Art = ?", GX_NOMASK, "TXPARTTEJ")
         ,new UpdateCursor("T010L66", "DELETE FROM TXPARTTEJ  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Par_Art = ?", GX_NOMASK, "TXPARTTEJ")
         ,new ForEachCursor("T010L67", "SELECT Par_Dsc, Par_NVar, Par_NVarT FROM TXPARTPAR WHERE EmprCod = ? AND Par_Art = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010L68", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mq_CodM, Mq_LinP, Par_Art FROM TXPTNARTp WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Par_Art = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010L69", "SELECT EmprCod, CliCod, ArtCod, Par_Art FROM TXPARTTEJ WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, Par_Art ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010L70", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010L71", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 40);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 3);
               ((short[]) buf[15])[0] = rslt.getShort(10);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 40);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 3);
               ((short[]) buf[15])[0] = rslt.getShort(10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 80);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 15);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((int[]) buf[10])[0] = rslt.getInt(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((int[]) buf[10])[0] = rslt.getInt(7);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((String[]) buf[6])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 3);
               ((int[]) buf[13])[0] = rslt.getInt(9);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 59 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 80);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 40);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 3);
               ((short[]) buf[21])[0] = rslt.getShort(13);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 80);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 15);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 80);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 15);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               stmt.setShort(4, ((Number) parms[5]).shortValue());
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
               stmt.setShort(4, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 8 :
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setString(3, (String)parms[5], 26);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 20);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 10);
               }
               stmt.setString(6, (String)parms[10], 3);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[12]).intValue());
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 26);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 20);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 10);
               }
               stmt.setString(5, (String)parms[8], 3);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 16);
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
               return;
            case 25 :
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
               return;
            case 27 :
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
            case 28 :
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
               return;
            case 32 :
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
               return;
            case 35 :
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
               return;
            case 37 :
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
            case 38 :
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
               return;
            case 40 :
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
               return;
            case 42 :
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
            case 46 :
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
            case 47 :
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
            case 48 :
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
            case 49 :
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
            case 50 :
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
            case 51 :
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
            case 52 :
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
            case 53 :
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
            case 54 :
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
            case 55 :
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
            case 56 :
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
            case 57 :
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
            case 58 :
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
            case 59 :
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
               stmt.setShort(4, ((Number) parms[5]).shortValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 61 :
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
               stmt.setShort(4, ((Number) parms[5]).shortValue());
               return;
            case 62 :
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
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 10);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 40);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 400);
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setShort(10, ((Number) parms[17]).shortValue());
               return;
            case 63 :
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
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 10);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 40);
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
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[14]).intValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 16);
               }
               stmt.setShort(10, ((Number) parms[17]).shortValue());
               return;
            case 64 :
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
               stmt.setShort(4, ((Number) parms[5]).shortValue());
               return;
            case 65 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 66 :
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
               stmt.setShort(4, ((Number) parms[5]).shortValue());
               return;
            case 67 :
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
            case 68 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 69 :
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
      }
   }

}

