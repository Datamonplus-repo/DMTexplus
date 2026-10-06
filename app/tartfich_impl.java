package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tartfich_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Ficha Tecnica del ARTICULO", ""), (short)(0)) ;
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
      A6952Mat_UltL = (short)(GXutil.lval( httpContext.GetPar( "Mat_UltL"))) ;
      n6952Mat_UltL = false ;
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

   public tartfich_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tartfich_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tartfich_impl.class ));
   }

   public tartfich_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TArtFich.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TArtFich.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TArtFich.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TArtFich.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TArtFich.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TArtFich.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TArtFich.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TArtFich.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TArtFich.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TArtFich.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TArtFich.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TArtFich.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TArtFich.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TArtFich.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TArtFich.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TArtFich.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion Articulo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TArtFich.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TArtFich.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TArtFich.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMat_UltL_Internalname, GXutil.ltrim( localUtil.ntoc( A6952Mat_UltL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMat_UltL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6952Mat_UltL), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6952Mat_UltL), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMat_UltL_Jsonclick, 0, "", "", "", "", "", 1, edtMat_UltL_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TArtFich.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Mat Maq", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TArtFich.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMat_Maq_Internalname, GXutil.rtrim( A6953Mat_Maq), GXutil.rtrim( localUtil.format( A6953Mat_Maq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMat_Maq_Jsonclick, 0, "", "", "", "", "", 1, edtMat_Maq_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TArtFich.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TArtFich.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMat_ObsG_Internalname, A12353Mat_ObsG, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", (short)(0), 1, edtMat_ObsG_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TArtFich.htm");
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
         nBlankRcdCount984 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_984 = (short)(1) ;
            scanStart1K4984( ) ;
            while ( RcdFound984 != 0 )
            {
               init_level_properties984( ) ;
               getByPrimaryKey1K4984( ) ;
               addRow1K4984( ) ;
               scanNext1K4984( ) ;
            }
            scanEnd1K4984( ) ;
            nBlankRcdCount984 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B6952Mat_UltL = A6952Mat_UltL ;
         n6952Mat_UltL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
         standaloneNotModal1K4984( ) ;
         standaloneModal1K4984( ) ;
         sMode984 = Gx_mode ;
         while ( nGXsfl_65_idx < nRC_GXsfl_65 )
         {
            bGXsfl_65_Refreshing = true ;
            readRow1K4984( ) ;
            edtavnRcdDeleted_984_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_984_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_984_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_984_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMat_lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_LIN_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_lin_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMat_Estr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_ESTR_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_Estr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_Estr_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMat_Mate_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_MATE_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_Mate_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_Mate_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMat_Tors_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_TORS_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_Tors_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_Tors_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMat_NomCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_NOMCOL_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_NomCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_NomCol_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMat_NumCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_NUMCOL_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_NumCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_NumCol_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMat_ProvN_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_PROVN_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_ProvN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_ProvN_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMat_Lote_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_LOTE_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_Lote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_Lote_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMat_Porc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_PORC_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_Porc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_Porc_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMat_LM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_LM_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_LM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_LM_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMat_obs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_OBS_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_obs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_obs_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMat_Lu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_LU_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_Lu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_Lu_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMat_NE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_NE_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_NE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_NE_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMat_Dsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_DSC_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_Dsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_Dsc_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMat_Color_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_COLOR_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_Color_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_Color_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMat_NAlim_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_NALIM_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_NAlim_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_NAlim_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            if ( ( nRcdExists_984 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1K4984( ) ;
            }
            sendRow1K4984( ) ;
            bGXsfl_65_Refreshing = false ;
         }
         Gx_mode = sMode984 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A6952Mat_UltL = B6952Mat_UltL ;
         n6952Mat_UltL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount984 = (short)(5) ;
         nRcdExists_984 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1K4984( ) ;
            while ( RcdFound984 != 0 )
            {
               sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_65984( ) ;
               init_level_properties984( ) ;
               standaloneNotModal1K4984( ) ;
               getByPrimaryKey1K4984( ) ;
               standaloneModal1K4984( ) ;
               addRow1K4984( ) ;
               scanNext1K4984( ) ;
            }
            scanEnd1K4984( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode984 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_65984( ) ;
      initAll1K4984( ) ;
      init_level_properties984( ) ;
      B6952Mat_UltL = A6952Mat_UltL ;
      n6952Mat_UltL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
      nRcdExists_984 = (short)(0) ;
      nIsMod_984 = (short)(0) ;
      nRcdDeleted_984 = (short)(0) ;
      nBlankRcdCount984 = (short)(nBlankRcdUsr984+nBlankRcdCount984) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount984 > 0 )
      {
         standaloneNotModal1K4984( ) ;
         standaloneModal1K4984( ) ;
         addRow1K4984( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMat_lin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount984 = (short)(nBlankRcdCount984-1) ;
      }
      Gx_mode = sMode984 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A6952Mat_UltL = B6952Mat_UltL ;
      n6952Mat_UltL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TArtFich.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TArtFich.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TArtFich.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TArtFich.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TArtFich.htm");
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
         Z69ArtDsc = httpContext.cgiGet( "Z69ArtDsc") ;
         Z6952Mat_UltL = (short)(localUtil.ctol( httpContext.cgiGet( "Z6952Mat_UltL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6953Mat_Maq = httpContext.cgiGet( "Z6953Mat_Maq") ;
         Z12353Mat_ObsG = httpContext.cgiGet( "Z12353Mat_ObsG") ;
         O6952Mat_UltL = (short)(localUtil.ctol( httpContext.cgiGet( "O6952Mat_UltL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_65 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_65"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         A6952Mat_UltL = (short)(localUtil.ctol( httpContext.cgiGet( edtMat_UltL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6952Mat_UltL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
         A6953Mat_Maq = httpContext.cgiGet( edtMat_Maq_Internalname) ;
         n6953Mat_Maq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6953Mat_Maq", A6953Mat_Maq);
         A12353Mat_ObsG = httpContext.cgiGet( edtMat_ObsG_Internalname) ;
         n12353Mat_ObsG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12353Mat_ObsG", A12353Mat_ObsG);
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
            initAll1K410( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_984_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_984_Enabled), 5, 0), !bGXsfl_65_Refreshing);
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
      disableAttributes1K410( ) ;
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

   public void confirm_1K40( )
   {
      beforeValidate1K410( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1K410( ) ;
         }
         else
         {
            checkExtendedTable1K410( ) ;
            if ( AnyError == 0 )
            {
               zm1K410( 6) ;
               zm1K410( 7) ;
            }
            closeExtendedTableCursors1K410( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode10 = Gx_mode ;
         confirm_1K4984( ) ;
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
         confirmValues1K40( ) ;
      }
   }

   public void confirm_1K4984( )
   {
      s6952Mat_UltL = O6952Mat_UltL ;
      n6952Mat_UltL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRow1K4984( ) ;
         if ( ( nRcdExists_984 != 0 ) || ( nIsMod_984 != 0 ) )
         {
            getKey1K4984( ) ;
            if ( ( nRcdExists_984 == 0 ) && ( nRcdDeleted_984 == 0 ) )
            {
               if ( RcdFound984 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1K4984( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1K4984( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1K4984( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O6952Mat_UltL = A6952Mat_UltL ;
                     n6952Mat_UltL = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "MAT_LIN_" + sGXsfl_65_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMat_lin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound984 != 0 )
               {
                  if ( nRcdDeleted_984 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1K4984( ) ;
                     load1K4984( ) ;
                     beforeValidate1K4984( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1K4984( ) ;
                        O6952Mat_UltL = A6952Mat_UltL ;
                        n6952Mat_UltL = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_984 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1K4984( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1K4984( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1K4984( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O6952Mat_UltL = A6952Mat_UltL ;
                           n6952Mat_UltL = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_984 == 0 )
                  {
                     GXCCtl = "MAT_LIN_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMat_lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_984_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_984, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMat_lin_Internalname, GXutil.ltrim( localUtil.ntoc( A6954Mat_lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMat_Estr_Internalname, GXutil.rtrim( A6955Mat_Estr)) ;
         httpContext.changePostValue( edtMat_Mate_Internalname, GXutil.rtrim( A6956Mat_Mate)) ;
         httpContext.changePostValue( edtMat_Tors_Internalname, GXutil.rtrim( A6957Mat_Tors)) ;
         httpContext.changePostValue( edtMat_NomCol_Internalname, GXutil.rtrim( A6958Mat_NomCol)) ;
         httpContext.changePostValue( edtMat_NumCol_Internalname, GXutil.ltrim( localUtil.ntoc( A6959Mat_NumCol, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMat_ProvN_Internalname, GXutil.rtrim( A6960Mat_ProvN)) ;
         httpContext.changePostValue( edtMat_Lote_Internalname, GXutil.rtrim( A6961Mat_Lote)) ;
         httpContext.changePostValue( edtMat_Porc_Internalname, GXutil.ltrim( localUtil.ntoc( A6962Mat_Porc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMat_LM_Internalname, GXutil.ltrim( localUtil.ntoc( A6963Mat_LM, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMat_obs_Internalname, A6964Mat_obs) ;
         httpContext.changePostValue( edtMat_Lu_Internalname, GXutil.ltrim( localUtil.ntoc( A12354Mat_Lu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMat_NE_Internalname, GXutil.rtrim( A12355Mat_NE)) ;
         httpContext.changePostValue( edtMat_Dsc_Internalname, A12356Mat_Dsc) ;
         httpContext.changePostValue( edtMat_Color_Internalname, GXutil.rtrim( A12357Mat_Color)) ;
         httpContext.changePostValue( edtMat_NAlim_Internalname, GXutil.rtrim( A12358Mat_NAlim)) ;
         httpContext.changePostValue( "ZT_"+"Z6954Mat_lin_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z6954Mat_lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6955Mat_Estr_"+sGXsfl_65_idx, GXutil.rtrim( Z6955Mat_Estr)) ;
         httpContext.changePostValue( "ZT_"+"Z6956Mat_Mate_"+sGXsfl_65_idx, GXutil.rtrim( Z6956Mat_Mate)) ;
         httpContext.changePostValue( "ZT_"+"Z6957Mat_Tors_"+sGXsfl_65_idx, GXutil.rtrim( Z6957Mat_Tors)) ;
         httpContext.changePostValue( "ZT_"+"Z6958Mat_NomCol_"+sGXsfl_65_idx, GXutil.rtrim( Z6958Mat_NomCol)) ;
         httpContext.changePostValue( "ZT_"+"Z6959Mat_NumCol_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z6959Mat_NumCol, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6960Mat_ProvN_"+sGXsfl_65_idx, GXutil.rtrim( Z6960Mat_ProvN)) ;
         httpContext.changePostValue( "ZT_"+"Z6961Mat_Lote_"+sGXsfl_65_idx, GXutil.rtrim( Z6961Mat_Lote)) ;
         httpContext.changePostValue( "ZT_"+"Z6962Mat_Porc_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z6962Mat_Porc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6963Mat_LM_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z6963Mat_LM, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12354Mat_Lu_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z12354Mat_Lu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12355Mat_NE_"+sGXsfl_65_idx, GXutil.rtrim( Z12355Mat_NE)) ;
         httpContext.changePostValue( "ZT_"+"Z12356Mat_Dsc_"+sGXsfl_65_idx, Z12356Mat_Dsc) ;
         httpContext.changePostValue( "ZT_"+"Z12357Mat_Color_"+sGXsfl_65_idx, GXutil.rtrim( Z12357Mat_Color)) ;
         httpContext.changePostValue( "ZT_"+"Z12358Mat_NAlim_"+sGXsfl_65_idx, GXutil.rtrim( Z12358Mat_NAlim)) ;
         httpContext.changePostValue( "nRcdDeleted_984_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_984, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_984_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_984, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_984_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_984, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_984 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_984_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_984_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_LIN_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_ESTR_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Estr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_MATE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Mate_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_TORS_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Tors_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_NOMCOL_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_NomCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_NUMCOL_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_NumCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_PROVN_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_ProvN_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_LOTE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Lote_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_PORC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Porc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_LM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_LM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_OBS_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_obs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_LU_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Lu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_NE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_NE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_DSC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Dsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_COLOR_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Color_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_NALIM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_NAlim_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O6952Mat_UltL = s6952Mat_UltL ;
      n6952Mat_UltL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1K40( )
   {
   }

   public void zm1K410( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z69ArtDsc = T01K45_A69ArtDsc[0] ;
            Z6952Mat_UltL = T01K45_A6952Mat_UltL[0] ;
            Z6953Mat_Maq = T01K45_A6953Mat_Maq[0] ;
            Z12353Mat_ObsG = T01K45_A12353Mat_ObsG[0] ;
         }
         else
         {
            Z69ArtDsc = A69ArtDsc ;
            Z6952Mat_UltL = A6952Mat_UltL ;
            Z6953Mat_Maq = A6953Mat_Maq ;
            Z12353Mat_ObsG = A12353Mat_ObsG ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z65ArtCod = A65ArtCod ;
         Z69ArtDsc = A69ArtDsc ;
         Z6952Mat_UltL = A6952Mat_UltL ;
         Z6953Mat_Maq = A6953Mat_Maq ;
         Z12353Mat_ObsG = A12353Mat_ObsG ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtMat_UltL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_UltL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_UltL_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtMat_UltL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_UltL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_UltL_Enabled), 5, 0), true);
      /* Using cursor T01K46 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01K46_A407EmprNom[0] ;
      n407EmprNom = T01K46_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01K47 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01K47_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
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

   public void load1K410( )
   {
      /* Using cursor T01K48 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A407EmprNom = T01K48_A407EmprNom[0] ;
         n407EmprNom = T01K48_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01K48_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A69ArtDsc = T01K48_A69ArtDsc[0] ;
         n69ArtDsc = T01K48_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A6952Mat_UltL = T01K48_A6952Mat_UltL[0] ;
         n6952Mat_UltL = T01K48_n6952Mat_UltL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
         A6953Mat_Maq = T01K48_A6953Mat_Maq[0] ;
         n6953Mat_Maq = T01K48_n6953Mat_Maq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6953Mat_Maq", A6953Mat_Maq);
         A12353Mat_ObsG = T01K48_A12353Mat_ObsG[0] ;
         n12353Mat_ObsG = T01K48_n12353Mat_ObsG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12353Mat_ObsG", A12353Mat_ObsG);
         zm1K410( -5) ;
      }
      pr_default.close(6);
      onLoadActions1K410( ) ;
   }

   public void onLoadActions1K410( )
   {
   }

   public void checkExtendedTable1K410( )
   {
      nIsDirty_10 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1K410( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1K410( )
   {
      /* Using cursor T01K49 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
      else
      {
         RcdFound10 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01K45 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01K45_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T01K45_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01K45_A252CliCod[0] == A252CliCod ) )
      {
         zm1K410( 5) ;
         RcdFound10 = (short)(1) ;
         A69ArtDsc = T01K45_A69ArtDsc[0] ;
         n69ArtDsc = T01K45_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A6952Mat_UltL = T01K45_A6952Mat_UltL[0] ;
         n6952Mat_UltL = T01K45_n6952Mat_UltL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
         A6953Mat_Maq = T01K45_A6953Mat_Maq[0] ;
         n6953Mat_Maq = T01K45_n6953Mat_Maq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6953Mat_Maq", A6953Mat_Maq);
         A12353Mat_ObsG = T01K45_A12353Mat_ObsG[0] ;
         n12353Mat_ObsG = T01K45_n12353Mat_ObsG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12353Mat_ObsG", A12353Mat_ObsG);
         O6952Mat_UltL = A6952Mat_UltL ;
         n6952Mat_UltL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1K410( ) ;
         if ( AnyError == 1 )
         {
            RcdFound10 = (short)(0) ;
            initializeNonKey1K410( ) ;
         }
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound10 = (short)(0) ;
         initializeNonKey1K410( ) ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1K410( ) ;
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
      /* Using cursor T01K410 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01K410_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01K410_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01K410_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01K410_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01K410_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01K410_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound10 = (short)(0) ;
      /* Using cursor T01K411 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01K411_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01K411_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01K411_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01K411_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01K411_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01K411_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1K410( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A6952Mat_UltL = O6952Mat_UltL ;
         n6952Mat_UltL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
         GX_FocusControl = edtArtDsc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1K410( ) ;
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
               A6952Mat_UltL = O6952Mat_UltL ;
               n6952Mat_UltL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
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
               A6952Mat_UltL = O6952Mat_UltL ;
               n6952Mat_UltL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
               update1K410( ) ;
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
               A6952Mat_UltL = O6952Mat_UltL ;
               n6952Mat_UltL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
               GX_FocusControl = edtArtDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1K410( ) ;
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
                  A6952Mat_UltL = O6952Mat_UltL ;
                  n6952Mat_UltL = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
                  GX_FocusControl = edtArtDsc_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1K410( ) ;
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
         A6952Mat_UltL = O6952Mat_UltL ;
         n6952Mat_UltL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
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
      getKey1K410( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tartfich");
      GX_FocusControl = edtArtDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1K40( ) ;
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
      scanStart1K410( ) ;
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
      scanEnd1K410( ) ;
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
      scanStart1K410( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound10 != 0 )
         {
            scanNext1K410( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArtDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1K410( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1K410( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01K44 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTICU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z69ArtDsc, T01K44_A69ArtDsc[0]) != 0 ) || ( Z6952Mat_UltL != T01K44_A6952Mat_UltL[0] ) || ( GXutil.strcmp(Z6953Mat_Maq, T01K44_A6953Mat_Maq[0]) != 0 ) || ( GXutil.strcmp(Z12353Mat_ObsG, T01K44_A12353Mat_ObsG[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z69ArtDsc, T01K44_A69ArtDsc[0]) != 0 )
            {
               GXutil.writeLogln("tartfich:[seudo value changed for attri]"+"ArtDsc");
               GXutil.writeLogRaw("Old: ",Z69ArtDsc);
               GXutil.writeLogRaw("Current: ",T01K44_A69ArtDsc[0]);
            }
            if ( Z6952Mat_UltL != T01K44_A6952Mat_UltL[0] )
            {
               GXutil.writeLogln("tartfich:[seudo value changed for attri]"+"Mat_UltL");
               GXutil.writeLogRaw("Old: ",Z6952Mat_UltL);
               GXutil.writeLogRaw("Current: ",T01K44_A6952Mat_UltL[0]);
            }
            if ( GXutil.strcmp(Z6953Mat_Maq, T01K44_A6953Mat_Maq[0]) != 0 )
            {
               GXutil.writeLogln("tartfich:[seudo value changed for attri]"+"Mat_Maq");
               GXutil.writeLogRaw("Old: ",Z6953Mat_Maq);
               GXutil.writeLogRaw("Current: ",T01K44_A6953Mat_Maq[0]);
            }
            if ( GXutil.strcmp(Z12353Mat_ObsG, T01K44_A12353Mat_ObsG[0]) != 0 )
            {
               GXutil.writeLogln("tartfich:[seudo value changed for attri]"+"Mat_ObsG");
               GXutil.writeLogRaw("Old: ",Z12353Mat_ObsG);
               GXutil.writeLogRaw("Current: ",T01K44_A12353Mat_ObsG[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPARTICU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1K410( )
   {
      beforeValidate1K410( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1K410( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1K410( 0) ;
         checkOptimisticConcurrency1K410( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1K410( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1K410( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01K412 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n69ArtDsc), A69ArtDsc, Boolean.valueOf(n6952Mat_UltL), Short.valueOf(A6952Mat_UltL), Boolean.valueOf(n6953Mat_Maq), A6953Mat_Maq, Boolean.valueOf(n12353Mat_ObsG), A12353Mat_ObsG, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
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
                        processLevel1K410( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1K40( ) ;
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
            load1K410( ) ;
         }
         endLevel1K410( ) ;
      }
      closeExtendedTableCursors1K410( ) ;
   }

   public void update1K410( )
   {
      beforeValidate1K410( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1K410( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1K410( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1K410( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1K410( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01K413 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n69ArtDsc), A69ArtDsc, Boolean.valueOf(n6952Mat_UltL), Short.valueOf(A6952Mat_UltL), Boolean.valueOf(n6953Mat_Maq), A6953Mat_Maq, Boolean.valueOf(n12353Mat_ObsG), A12353Mat_ObsG, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTICU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1K410( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char1[0] = A396EmprCod ;
                     GXv_int2[0] = A252CliCod ;
                     GXv_char3[0] = A65ArtCod ;
                     new app.txparticuupdateredundancy(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3) ;
                     tartfich_impl.this.A396EmprCod = GXv_char1[0] ;
                     tartfich_impl.this.A252CliCod = GXv_int2[0] ;
                     tartfich_impl.this.A65ArtCod = GXv_char3[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1K410( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1K40( ) ;
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
         endLevel1K410( ) ;
      }
      closeExtendedTableCursors1K410( ) ;
   }

   public void deferredUpdate1K410( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1K410( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1K410( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1K410( ) ;
         afterConfirm1K410( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1K410( ) ;
            if ( AnyError == 0 )
            {
               A6952Mat_UltL = O6952Mat_UltL ;
               n6952Mat_UltL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
               scanStart1K4984( ) ;
               while ( RcdFound984 != 0 )
               {
                  getByPrimaryKey1K4984( ) ;
                  delete1K4984( ) ;
                  scanNext1K4984( ) ;
                  O6952Mat_UltL = A6952Mat_UltL ;
                  n6952Mat_UltL = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
               }
               scanEnd1K4984( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01K414 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
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
                           initAll1K410( ) ;
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
                        resetCaption1K40( ) ;
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
      endLevel1K410( ) ;
      Gx_mode = sMode10 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1K410( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01K415 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Familia Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01K416 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01K417 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01K418 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Consumos Lab. JBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01K419 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MEZCLAS CLIENTE MATERIAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01K420 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS COMPOSICION MEZCLAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01K421 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "recest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01K422 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01K423 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPEDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01K424 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCARC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01K425 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO PRECIOS ARTICULO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01K426 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INCREMENTO PRECIO INTENSIDAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01K427 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECIO GLOBA COLOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01K428 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TR02JL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01K429 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLATFA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01K430 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTMQT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01K431 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PVPNITp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01K432 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEJART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01K433 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TNART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01K434 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTTEJ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01K435 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARTINa", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01K436 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01K437 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ESTAD.CLIENTE/ART/T.ART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01K438 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Modelos de Confección", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01K439 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "WebEmp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01K440 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ACATEXGB.WEBDIS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01K441 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSerie", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01K442 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRECO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01K443 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINPRE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01K444 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PedPro", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01K445 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01K446 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01K447 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANBRL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01K448 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECAP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01K449 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARSER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01K450 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cod Calidad por Articulo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01K451 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTINT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01K452 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01K453 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01K454 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPREPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01K455 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01K456 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRETCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01K457 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
      }
   }

   public void processNestedLevel1K4984( )
   {
      s6952Mat_UltL = O6952Mat_UltL ;
      n6952Mat_UltL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRow1K4984( ) ;
         if ( ( nRcdExists_984 != 0 ) || ( nIsMod_984 != 0 ) )
         {
            standaloneNotModal1K4984( ) ;
            getKey1K4984( ) ;
            if ( ( nRcdExists_984 == 0 ) && ( nRcdDeleted_984 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1K4984( ) ;
            }
            else
            {
               if ( RcdFound984 != 0 )
               {
                  if ( ( nRcdDeleted_984 != 0 ) && ( nRcdExists_984 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1K4984( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_984 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1K4984( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_984 == 0 )
                  {
                     GXCCtl = "MAT_LIN_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMat_lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O6952Mat_UltL = A6952Mat_UltL ;
            n6952Mat_UltL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_984_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_984, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMat_lin_Internalname, GXutil.ltrim( localUtil.ntoc( A6954Mat_lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMat_Estr_Internalname, GXutil.rtrim( A6955Mat_Estr)) ;
         httpContext.changePostValue( edtMat_Mate_Internalname, GXutil.rtrim( A6956Mat_Mate)) ;
         httpContext.changePostValue( edtMat_Tors_Internalname, GXutil.rtrim( A6957Mat_Tors)) ;
         httpContext.changePostValue( edtMat_NomCol_Internalname, GXutil.rtrim( A6958Mat_NomCol)) ;
         httpContext.changePostValue( edtMat_NumCol_Internalname, GXutil.ltrim( localUtil.ntoc( A6959Mat_NumCol, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMat_ProvN_Internalname, GXutil.rtrim( A6960Mat_ProvN)) ;
         httpContext.changePostValue( edtMat_Lote_Internalname, GXutil.rtrim( A6961Mat_Lote)) ;
         httpContext.changePostValue( edtMat_Porc_Internalname, GXutil.ltrim( localUtil.ntoc( A6962Mat_Porc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMat_LM_Internalname, GXutil.ltrim( localUtil.ntoc( A6963Mat_LM, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMat_obs_Internalname, A6964Mat_obs) ;
         httpContext.changePostValue( edtMat_Lu_Internalname, GXutil.ltrim( localUtil.ntoc( A12354Mat_Lu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMat_NE_Internalname, GXutil.rtrim( A12355Mat_NE)) ;
         httpContext.changePostValue( edtMat_Dsc_Internalname, A12356Mat_Dsc) ;
         httpContext.changePostValue( edtMat_Color_Internalname, GXutil.rtrim( A12357Mat_Color)) ;
         httpContext.changePostValue( edtMat_NAlim_Internalname, GXutil.rtrim( A12358Mat_NAlim)) ;
         httpContext.changePostValue( "ZT_"+"Z6954Mat_lin_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z6954Mat_lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6955Mat_Estr_"+sGXsfl_65_idx, GXutil.rtrim( Z6955Mat_Estr)) ;
         httpContext.changePostValue( "ZT_"+"Z6956Mat_Mate_"+sGXsfl_65_idx, GXutil.rtrim( Z6956Mat_Mate)) ;
         httpContext.changePostValue( "ZT_"+"Z6957Mat_Tors_"+sGXsfl_65_idx, GXutil.rtrim( Z6957Mat_Tors)) ;
         httpContext.changePostValue( "ZT_"+"Z6958Mat_NomCol_"+sGXsfl_65_idx, GXutil.rtrim( Z6958Mat_NomCol)) ;
         httpContext.changePostValue( "ZT_"+"Z6959Mat_NumCol_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z6959Mat_NumCol, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6960Mat_ProvN_"+sGXsfl_65_idx, GXutil.rtrim( Z6960Mat_ProvN)) ;
         httpContext.changePostValue( "ZT_"+"Z6961Mat_Lote_"+sGXsfl_65_idx, GXutil.rtrim( Z6961Mat_Lote)) ;
         httpContext.changePostValue( "ZT_"+"Z6962Mat_Porc_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z6962Mat_Porc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6963Mat_LM_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z6963Mat_LM, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12354Mat_Lu_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z12354Mat_Lu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12355Mat_NE_"+sGXsfl_65_idx, GXutil.rtrim( Z12355Mat_NE)) ;
         httpContext.changePostValue( "ZT_"+"Z12356Mat_Dsc_"+sGXsfl_65_idx, Z12356Mat_Dsc) ;
         httpContext.changePostValue( "ZT_"+"Z12357Mat_Color_"+sGXsfl_65_idx, GXutil.rtrim( Z12357Mat_Color)) ;
         httpContext.changePostValue( "ZT_"+"Z12358Mat_NAlim_"+sGXsfl_65_idx, GXutil.rtrim( Z12358Mat_NAlim)) ;
         httpContext.changePostValue( "nRcdDeleted_984_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_984, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_984_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_984, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_984_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_984, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_984 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_984_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_984_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_LIN_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_ESTR_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Estr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_MATE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Mate_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_TORS_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Tors_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_NOMCOL_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_NomCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_NUMCOL_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_NumCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_PROVN_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_ProvN_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_LOTE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Lote_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_PORC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Porc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_LM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_LM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_OBS_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_obs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_LU_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Lu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_NE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_NE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_DSC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Dsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_COLOR_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Color_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_NALIM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_NAlim_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1K4984( ) ;
      if ( AnyError != 0 )
      {
         O6952Mat_UltL = s6952Mat_UltL ;
         n6952Mat_UltL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
      }
      nRcdExists_984 = (short)(0) ;
      nIsMod_984 = (short)(0) ;
      nRcdDeleted_984 = (short)(0) ;
   }

   public void processLevel1K410( )
   {
      /* Save parent mode. */
      sMode10 = Gx_mode ;
      processNestedLevel1K4984( ) ;
      if ( AnyError != 0 )
      {
         O6952Mat_UltL = s6952Mat_UltL ;
         n6952Mat_UltL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode10 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01K458 */
      pr_default.execute(56, new Object[] {Boolean.valueOf(n6952Mat_UltL), Short.valueOf(A6952Mat_UltL), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
   }

   public void endLevel1K410( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1K410( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tartfich");
         if ( AnyError == 0 )
         {
            confirmValues1K40( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tartfich");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1K410( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A252CliCod = A252CliCod ;
      this.A65ArtCod = A65ArtCod ;
      /* Scan By routine */
      /* Using cursor T01K459 */
      pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(57) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1K410( )
   {
      /* Scan next routine */
      pr_default.readNext(57);
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(57) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
   }

   public void scanEnd1K410( )
   {
      pr_default.close(57);
   }

   public void afterConfirm1K410( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1K410( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1K410( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1K410( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1K410( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1K410( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1K410( )
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
      edtMat_UltL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_UltL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_UltL_Enabled), 5, 0), true);
      edtMat_Maq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_Maq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_Maq_Enabled), 5, 0), true);
      edtMat_ObsG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_ObsG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_ObsG_Enabled), 5, 0), true);
   }

   public void zm1K4984( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6955Mat_Estr = T01K43_A6955Mat_Estr[0] ;
            Z6956Mat_Mate = T01K43_A6956Mat_Mate[0] ;
            Z6957Mat_Tors = T01K43_A6957Mat_Tors[0] ;
            Z6958Mat_NomCol = T01K43_A6958Mat_NomCol[0] ;
            Z6959Mat_NumCol = T01K43_A6959Mat_NumCol[0] ;
            Z6960Mat_ProvN = T01K43_A6960Mat_ProvN[0] ;
            Z6961Mat_Lote = T01K43_A6961Mat_Lote[0] ;
            Z6962Mat_Porc = T01K43_A6962Mat_Porc[0] ;
            Z6963Mat_LM = T01K43_A6963Mat_LM[0] ;
            Z12354Mat_Lu = T01K43_A12354Mat_Lu[0] ;
            Z12355Mat_NE = T01K43_A12355Mat_NE[0] ;
            Z12356Mat_Dsc = T01K43_A12356Mat_Dsc[0] ;
            Z12357Mat_Color = T01K43_A12357Mat_Color[0] ;
            Z12358Mat_NAlim = T01K43_A12358Mat_NAlim[0] ;
         }
         else
         {
            Z6955Mat_Estr = A6955Mat_Estr ;
            Z6956Mat_Mate = A6956Mat_Mate ;
            Z6957Mat_Tors = A6957Mat_Tors ;
            Z6958Mat_NomCol = A6958Mat_NomCol ;
            Z6959Mat_NumCol = A6959Mat_NumCol ;
            Z6960Mat_ProvN = A6960Mat_ProvN ;
            Z6961Mat_Lote = A6961Mat_Lote ;
            Z6962Mat_Porc = A6962Mat_Porc ;
            Z6963Mat_LM = A6963Mat_LM ;
            Z12354Mat_Lu = A12354Mat_Lu ;
            Z12355Mat_NE = A12355Mat_NE ;
            Z12356Mat_Dsc = A12356Mat_Dsc ;
            Z12357Mat_Color = A12357Mat_Color ;
            Z12358Mat_NAlim = A12358Mat_NAlim ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z6954Mat_lin = A6954Mat_lin ;
         Z6955Mat_Estr = A6955Mat_Estr ;
         Z6956Mat_Mate = A6956Mat_Mate ;
         Z6957Mat_Tors = A6957Mat_Tors ;
         Z6958Mat_NomCol = A6958Mat_NomCol ;
         Z6959Mat_NumCol = A6959Mat_NumCol ;
         Z6960Mat_ProvN = A6960Mat_ProvN ;
         Z6961Mat_Lote = A6961Mat_Lote ;
         Z6962Mat_Porc = A6962Mat_Porc ;
         Z6963Mat_LM = A6963Mat_LM ;
         Z6964Mat_obs = A6964Mat_obs ;
         Z12354Mat_Lu = A12354Mat_Lu ;
         Z12355Mat_NE = A12355Mat_NE ;
         Z12356Mat_Dsc = A12356Mat_Dsc ;
         Z12357Mat_Color = A12357Mat_Color ;
         Z12358Mat_NAlim = A12358Mat_NAlim ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1K4984( )
   {
      edtMat_UltL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_UltL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_UltL_Enabled), 5, 0), true);
      edtMat_UltL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_UltL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_UltL_Enabled), 5, 0), true);
   }

   public void standaloneModal1K4984( )
   {
      if ( isIns( )  )
      {
         A6952Mat_UltL = (short)(O6952Mat_UltL+1) ;
         n6952Mat_UltL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A6954Mat_lin = A6952Mat_UltL ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMat_lin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMat_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_lin_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      else
      {
         edtMat_lin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMat_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_lin_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
   }

   public void load1K4984( )
   {
      /* Using cursor T01K460 */
      pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Short.valueOf(A6954Mat_lin)});
      if ( (pr_default.getStatus(58) != 101) )
      {
         RcdFound984 = (short)(1) ;
         A6964Mat_obs = T01K460_A6964Mat_obs[0] ;
         n6964Mat_obs = T01K460_n6964Mat_obs[0] ;
         A6955Mat_Estr = T01K460_A6955Mat_Estr[0] ;
         n6955Mat_Estr = T01K460_n6955Mat_Estr[0] ;
         A6956Mat_Mate = T01K460_A6956Mat_Mate[0] ;
         n6956Mat_Mate = T01K460_n6956Mat_Mate[0] ;
         A6957Mat_Tors = T01K460_A6957Mat_Tors[0] ;
         n6957Mat_Tors = T01K460_n6957Mat_Tors[0] ;
         A6958Mat_NomCol = T01K460_A6958Mat_NomCol[0] ;
         n6958Mat_NomCol = T01K460_n6958Mat_NomCol[0] ;
         A6959Mat_NumCol = T01K460_A6959Mat_NumCol[0] ;
         n6959Mat_NumCol = T01K460_n6959Mat_NumCol[0] ;
         A6960Mat_ProvN = T01K460_A6960Mat_ProvN[0] ;
         n6960Mat_ProvN = T01K460_n6960Mat_ProvN[0] ;
         A6961Mat_Lote = T01K460_A6961Mat_Lote[0] ;
         n6961Mat_Lote = T01K460_n6961Mat_Lote[0] ;
         A6962Mat_Porc = T01K460_A6962Mat_Porc[0] ;
         n6962Mat_Porc = T01K460_n6962Mat_Porc[0] ;
         A6963Mat_LM = T01K460_A6963Mat_LM[0] ;
         n6963Mat_LM = T01K460_n6963Mat_LM[0] ;
         A12354Mat_Lu = T01K460_A12354Mat_Lu[0] ;
         n12354Mat_Lu = T01K460_n12354Mat_Lu[0] ;
         A12355Mat_NE = T01K460_A12355Mat_NE[0] ;
         n12355Mat_NE = T01K460_n12355Mat_NE[0] ;
         A12356Mat_Dsc = T01K460_A12356Mat_Dsc[0] ;
         n12356Mat_Dsc = T01K460_n12356Mat_Dsc[0] ;
         A12357Mat_Color = T01K460_A12357Mat_Color[0] ;
         n12357Mat_Color = T01K460_n12357Mat_Color[0] ;
         A12358Mat_NAlim = T01K460_A12358Mat_NAlim[0] ;
         zm1K4984( -8) ;
      }
      pr_default.close(58);
      onLoadActions1K4984( ) ;
   }

   public void onLoadActions1K4984( )
   {
   }

   public void checkExtendedTable1K4984( )
   {
      nIsDirty_984 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1K4984( ) ;
   }

   public void closeExtendedTableCursors1K4984( )
   {
   }

   public void enableDisable1K4984( )
   {
   }

   public void getKey1K4984( )
   {
      /* Using cursor T01K461 */
      pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Short.valueOf(A6954Mat_lin)});
      if ( (pr_default.getStatus(59) != 101) )
      {
         RcdFound984 = (short)(1) ;
      }
      else
      {
         RcdFound984 = (short)(0) ;
      }
      pr_default.close(59);
   }

   public void getByPrimaryKey1K4984( )
   {
      /* Using cursor T01K43 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Short.valueOf(A6954Mat_lin)});
      if ( (pr_default.getStatus(1) != 101) && ( T01K43_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01K43_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T01K43_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1K4984( 8) ;
         RcdFound984 = (short)(1) ;
         initializeNonKey1K4984( ) ;
         A6964Mat_obs = T01K43_A6964Mat_obs[0] ;
         n6964Mat_obs = T01K43_n6964Mat_obs[0] ;
         A6954Mat_lin = T01K43_A6954Mat_lin[0] ;
         A6955Mat_Estr = T01K43_A6955Mat_Estr[0] ;
         n6955Mat_Estr = T01K43_n6955Mat_Estr[0] ;
         A6956Mat_Mate = T01K43_A6956Mat_Mate[0] ;
         n6956Mat_Mate = T01K43_n6956Mat_Mate[0] ;
         A6957Mat_Tors = T01K43_A6957Mat_Tors[0] ;
         n6957Mat_Tors = T01K43_n6957Mat_Tors[0] ;
         A6958Mat_NomCol = T01K43_A6958Mat_NomCol[0] ;
         n6958Mat_NomCol = T01K43_n6958Mat_NomCol[0] ;
         A6959Mat_NumCol = T01K43_A6959Mat_NumCol[0] ;
         n6959Mat_NumCol = T01K43_n6959Mat_NumCol[0] ;
         A6960Mat_ProvN = T01K43_A6960Mat_ProvN[0] ;
         n6960Mat_ProvN = T01K43_n6960Mat_ProvN[0] ;
         A6961Mat_Lote = T01K43_A6961Mat_Lote[0] ;
         n6961Mat_Lote = T01K43_n6961Mat_Lote[0] ;
         A6962Mat_Porc = T01K43_A6962Mat_Porc[0] ;
         n6962Mat_Porc = T01K43_n6962Mat_Porc[0] ;
         A6963Mat_LM = T01K43_A6963Mat_LM[0] ;
         n6963Mat_LM = T01K43_n6963Mat_LM[0] ;
         A12354Mat_Lu = T01K43_A12354Mat_Lu[0] ;
         n12354Mat_Lu = T01K43_n12354Mat_Lu[0] ;
         A12355Mat_NE = T01K43_A12355Mat_NE[0] ;
         n12355Mat_NE = T01K43_n12355Mat_NE[0] ;
         A12356Mat_Dsc = T01K43_A12356Mat_Dsc[0] ;
         n12356Mat_Dsc = T01K43_n12356Mat_Dsc[0] ;
         A12357Mat_Color = T01K43_A12357Mat_Color[0] ;
         n12357Mat_Color = T01K43_n12357Mat_Color[0] ;
         A12358Mat_NAlim = T01K43_A12358Mat_NAlim[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z6954Mat_lin = A6954Mat_lin ;
         sMode984 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1K4984( ) ;
         load1K4984( ) ;
         Gx_mode = sMode984 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound984 = (short)(0) ;
         initializeNonKey1K4984( ) ;
         sMode984 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1K4984( ) ;
         Gx_mode = sMode984 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1K4984( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1K4984( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01K42 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Short.valueOf(A6954Mat_lin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTMAT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z6955Mat_Estr, T01K42_A6955Mat_Estr[0]) != 0 ) || ( GXutil.strcmp(Z6956Mat_Mate, T01K42_A6956Mat_Mate[0]) != 0 ) || ( GXutil.strcmp(Z6957Mat_Tors, T01K42_A6957Mat_Tors[0]) != 0 ) || ( GXutil.strcmp(Z6958Mat_NomCol, T01K42_A6958Mat_NomCol[0]) != 0 ) || ( Z6959Mat_NumCol != T01K42_A6959Mat_NumCol[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6960Mat_ProvN, T01K42_A6960Mat_ProvN[0]) != 0 ) || ( GXutil.strcmp(Z6961Mat_Lote, T01K42_A6961Mat_Lote[0]) != 0 ) || ( DecimalUtil.compareTo(Z6962Mat_Porc, T01K42_A6962Mat_Porc[0]) != 0 ) || ( DecimalUtil.compareTo(Z6963Mat_LM, T01K42_A6963Mat_LM[0]) != 0 ) || ( DecimalUtil.compareTo(Z12354Mat_Lu, T01K42_A12354Mat_Lu[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12355Mat_NE, T01K42_A12355Mat_NE[0]) != 0 ) || ( GXutil.strcmp(Z12356Mat_Dsc, T01K42_A12356Mat_Dsc[0]) != 0 ) || ( GXutil.strcmp(Z12357Mat_Color, T01K42_A12357Mat_Color[0]) != 0 ) || ( GXutil.strcmp(Z12358Mat_NAlim, T01K42_A12358Mat_NAlim[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z6955Mat_Estr, T01K42_A6955Mat_Estr[0]) != 0 )
            {
               GXutil.writeLogln("tartfich:[seudo value changed for attri]"+"Mat_Estr");
               GXutil.writeLogRaw("Old: ",Z6955Mat_Estr);
               GXutil.writeLogRaw("Current: ",T01K42_A6955Mat_Estr[0]);
            }
            if ( GXutil.strcmp(Z6956Mat_Mate, T01K42_A6956Mat_Mate[0]) != 0 )
            {
               GXutil.writeLogln("tartfich:[seudo value changed for attri]"+"Mat_Mate");
               GXutil.writeLogRaw("Old: ",Z6956Mat_Mate);
               GXutil.writeLogRaw("Current: ",T01K42_A6956Mat_Mate[0]);
            }
            if ( GXutil.strcmp(Z6957Mat_Tors, T01K42_A6957Mat_Tors[0]) != 0 )
            {
               GXutil.writeLogln("tartfich:[seudo value changed for attri]"+"Mat_Tors");
               GXutil.writeLogRaw("Old: ",Z6957Mat_Tors);
               GXutil.writeLogRaw("Current: ",T01K42_A6957Mat_Tors[0]);
            }
            if ( GXutil.strcmp(Z6958Mat_NomCol, T01K42_A6958Mat_NomCol[0]) != 0 )
            {
               GXutil.writeLogln("tartfich:[seudo value changed for attri]"+"Mat_NomCol");
               GXutil.writeLogRaw("Old: ",Z6958Mat_NomCol);
               GXutil.writeLogRaw("Current: ",T01K42_A6958Mat_NomCol[0]);
            }
            if ( Z6959Mat_NumCol != T01K42_A6959Mat_NumCol[0] )
            {
               GXutil.writeLogln("tartfich:[seudo value changed for attri]"+"Mat_NumCol");
               GXutil.writeLogRaw("Old: ",Z6959Mat_NumCol);
               GXutil.writeLogRaw("Current: ",T01K42_A6959Mat_NumCol[0]);
            }
            if ( GXutil.strcmp(Z6960Mat_ProvN, T01K42_A6960Mat_ProvN[0]) != 0 )
            {
               GXutil.writeLogln("tartfich:[seudo value changed for attri]"+"Mat_ProvN");
               GXutil.writeLogRaw("Old: ",Z6960Mat_ProvN);
               GXutil.writeLogRaw("Current: ",T01K42_A6960Mat_ProvN[0]);
            }
            if ( GXutil.strcmp(Z6961Mat_Lote, T01K42_A6961Mat_Lote[0]) != 0 )
            {
               GXutil.writeLogln("tartfich:[seudo value changed for attri]"+"Mat_Lote");
               GXutil.writeLogRaw("Old: ",Z6961Mat_Lote);
               GXutil.writeLogRaw("Current: ",T01K42_A6961Mat_Lote[0]);
            }
            if ( DecimalUtil.compareTo(Z6962Mat_Porc, T01K42_A6962Mat_Porc[0]) != 0 )
            {
               GXutil.writeLogln("tartfich:[seudo value changed for attri]"+"Mat_Porc");
               GXutil.writeLogRaw("Old: ",Z6962Mat_Porc);
               GXutil.writeLogRaw("Current: ",T01K42_A6962Mat_Porc[0]);
            }
            if ( DecimalUtil.compareTo(Z6963Mat_LM, T01K42_A6963Mat_LM[0]) != 0 )
            {
               GXutil.writeLogln("tartfich:[seudo value changed for attri]"+"Mat_LM");
               GXutil.writeLogRaw("Old: ",Z6963Mat_LM);
               GXutil.writeLogRaw("Current: ",T01K42_A6963Mat_LM[0]);
            }
            if ( DecimalUtil.compareTo(Z12354Mat_Lu, T01K42_A12354Mat_Lu[0]) != 0 )
            {
               GXutil.writeLogln("tartfich:[seudo value changed for attri]"+"Mat_Lu");
               GXutil.writeLogRaw("Old: ",Z12354Mat_Lu);
               GXutil.writeLogRaw("Current: ",T01K42_A12354Mat_Lu[0]);
            }
            if ( GXutil.strcmp(Z12355Mat_NE, T01K42_A12355Mat_NE[0]) != 0 )
            {
               GXutil.writeLogln("tartfich:[seudo value changed for attri]"+"Mat_NE");
               GXutil.writeLogRaw("Old: ",Z12355Mat_NE);
               GXutil.writeLogRaw("Current: ",T01K42_A12355Mat_NE[0]);
            }
            if ( GXutil.strcmp(Z12356Mat_Dsc, T01K42_A12356Mat_Dsc[0]) != 0 )
            {
               GXutil.writeLogln("tartfich:[seudo value changed for attri]"+"Mat_Dsc");
               GXutil.writeLogRaw("Old: ",Z12356Mat_Dsc);
               GXutil.writeLogRaw("Current: ",T01K42_A12356Mat_Dsc[0]);
            }
            if ( GXutil.strcmp(Z12357Mat_Color, T01K42_A12357Mat_Color[0]) != 0 )
            {
               GXutil.writeLogln("tartfich:[seudo value changed for attri]"+"Mat_Color");
               GXutil.writeLogRaw("Old: ",Z12357Mat_Color);
               GXutil.writeLogRaw("Current: ",T01K42_A12357Mat_Color[0]);
            }
            if ( GXutil.strcmp(Z12358Mat_NAlim, T01K42_A12358Mat_NAlim[0]) != 0 )
            {
               GXutil.writeLogln("tartfich:[seudo value changed for attri]"+"Mat_NAlim");
               GXutil.writeLogRaw("Old: ",Z12358Mat_NAlim);
               GXutil.writeLogRaw("Current: ",T01K42_A12358Mat_NAlim[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPARTMAT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1K4984( )
   {
      beforeValidate1K4984( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1K4984( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1K4984( 0) ;
         checkOptimisticConcurrency1K4984( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1K4984( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1K4984( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01K462 */
                  pr_default.execute(60, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Short.valueOf(A6954Mat_lin), Boolean.valueOf(n6955Mat_Estr), A6955Mat_Estr, Boolean.valueOf(n6956Mat_Mate), A6956Mat_Mate, Boolean.valueOf(n6957Mat_Tors), A6957Mat_Tors, Boolean.valueOf(n6958Mat_NomCol), A6958Mat_NomCol, Boolean.valueOf(n6959Mat_NumCol), Integer.valueOf(A6959Mat_NumCol), Boolean.valueOf(n6960Mat_ProvN), A6960Mat_ProvN, Boolean.valueOf(n6961Mat_Lote), A6961Mat_Lote, Boolean.valueOf(n6962Mat_Porc), A6962Mat_Porc, Boolean.valueOf(n6963Mat_LM), A6963Mat_LM, Boolean.valueOf(n6964Mat_obs), A6964Mat_obs, Boolean.valueOf(n12354Mat_Lu), A12354Mat_Lu, Boolean.valueOf(n12355Mat_NE), A12355Mat_NE, Boolean.valueOf(n12356Mat_Dsc), A12356Mat_Dsc, Boolean.valueOf(n12357Mat_Color), A12357Mat_Color, A12358Mat_NAlim, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTMAT");
                  if ( (pr_default.getStatus(60) == 1) )
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
            load1K4984( ) ;
         }
         endLevel1K4984( ) ;
      }
      closeExtendedTableCursors1K4984( ) ;
   }

   public void update1K4984( )
   {
      beforeValidate1K4984( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1K4984( ) ;
      }
      if ( ( nIsMod_984 != 0 ) || ( nIsDirty_984 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1K4984( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1K4984( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1K4984( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01K463 */
                     pr_default.execute(61, new Object[] {Boolean.valueOf(n6955Mat_Estr), A6955Mat_Estr, Boolean.valueOf(n6956Mat_Mate), A6956Mat_Mate, Boolean.valueOf(n6957Mat_Tors), A6957Mat_Tors, Boolean.valueOf(n6958Mat_NomCol), A6958Mat_NomCol, Boolean.valueOf(n6959Mat_NumCol), Integer.valueOf(A6959Mat_NumCol), Boolean.valueOf(n6960Mat_ProvN), A6960Mat_ProvN, Boolean.valueOf(n6961Mat_Lote), A6961Mat_Lote, Boolean.valueOf(n6962Mat_Porc), A6962Mat_Porc, Boolean.valueOf(n6963Mat_LM), A6963Mat_LM, Boolean.valueOf(n6964Mat_obs), A6964Mat_obs, Boolean.valueOf(n12354Mat_Lu), A12354Mat_Lu, Boolean.valueOf(n12355Mat_NE), A12355Mat_NE, Boolean.valueOf(n12356Mat_Dsc), A12356Mat_Dsc, Boolean.valueOf(n12357Mat_Color), A12357Mat_Color, A12358Mat_NAlim, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Short.valueOf(A6954Mat_lin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTMAT");
                     if ( (pr_default.getStatus(61) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTMAT"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1K4984( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char3[0] = A396EmprCod ;
                        GXv_int2[0] = A252CliCod ;
                        GXv_char1[0] = A65ArtCod ;
                        new app.txparticuupdateredundancy(remoteHandle, context).execute( GXv_char3, GXv_int2, GXv_char1) ;
                        tartfich_impl.this.A396EmprCod = GXv_char3[0] ;
                        tartfich_impl.this.A252CliCod = GXv_int2[0] ;
                        tartfich_impl.this.A65ArtCod = GXv_char1[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1K4984( ) ;
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
            endLevel1K4984( ) ;
         }
      }
      closeExtendedTableCursors1K4984( ) ;
   }

   public void deferredUpdate1K4984( )
   {
   }

   public void delete1K4984( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1K4984( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1K4984( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1K4984( ) ;
         afterConfirm1K4984( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1K4984( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01K464 */
               pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Short.valueOf(A6954Mat_lin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTMAT");
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
      sMode984 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1K4984( ) ;
      Gx_mode = sMode984 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1K4984( )
   {
      standaloneModal1K4984( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1K4984( )
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

   public void scanStart1K4984( )
   {
      /* Scan By routine */
      /* Using cursor T01K465 */
      pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      RcdFound984 = (short)(0) ;
      if ( (pr_default.getStatus(63) != 101) )
      {
         RcdFound984 = (short)(1) ;
         A6954Mat_lin = T01K465_A6954Mat_lin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1K4984( )
   {
      /* Scan next routine */
      pr_default.readNext(63);
      RcdFound984 = (short)(0) ;
      if ( (pr_default.getStatus(63) != 101) )
      {
         RcdFound984 = (short)(1) ;
         A6954Mat_lin = T01K465_A6954Mat_lin[0] ;
      }
   }

   public void scanEnd1K4984( )
   {
      pr_default.close(63);
   }

   public void afterConfirm1K4984( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1K4984( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1K4984( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1K4984( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1K4984( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1K4984( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1K4984( )
   {
      edtMat_lin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_lin_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMat_Estr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_Estr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_Estr_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMat_Mate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_Mate_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_Mate_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMat_Tors_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_Tors_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_Tors_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMat_NomCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_NomCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_NomCol_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMat_NumCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_NumCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_NumCol_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMat_ProvN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_ProvN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_ProvN_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMat_Lote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_Lote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_Lote_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMat_Porc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_Porc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_Porc_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMat_LM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_LM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_LM_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMat_obs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_obs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_obs_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMat_Lu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_Lu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_Lu_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMat_NE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_NE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_NE_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMat_Dsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_Dsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_Dsc_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMat_Color_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_Color_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_Color_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMat_NAlim_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_NAlim_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_NAlim_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void send_integrity_lvl_hashes1K4984( )
   {
   }

   public void send_integrity_lvl_hashes1K410( )
   {
   }

   public void subsflControlProps_65984( )
   {
      edtavnRcdDeleted_984_Internalname = "vNRCDDELETED_984_"+sGXsfl_65_idx ;
      edtMat_lin_Internalname = "MAT_LIN_"+sGXsfl_65_idx ;
      edtMat_Estr_Internalname = "MAT_ESTR_"+sGXsfl_65_idx ;
      edtMat_Mate_Internalname = "MAT_MATE_"+sGXsfl_65_idx ;
      edtMat_Tors_Internalname = "MAT_TORS_"+sGXsfl_65_idx ;
      edtMat_NomCol_Internalname = "MAT_NOMCOL_"+sGXsfl_65_idx ;
      edtMat_NumCol_Internalname = "MAT_NUMCOL_"+sGXsfl_65_idx ;
      edtMat_ProvN_Internalname = "MAT_PROVN_"+sGXsfl_65_idx ;
      edtMat_Lote_Internalname = "MAT_LOTE_"+sGXsfl_65_idx ;
      edtMat_Porc_Internalname = "MAT_PORC_"+sGXsfl_65_idx ;
      edtMat_LM_Internalname = "MAT_LM_"+sGXsfl_65_idx ;
      edtMat_obs_Internalname = "MAT_OBS_"+sGXsfl_65_idx ;
      edtMat_Lu_Internalname = "MAT_LU_"+sGXsfl_65_idx ;
      edtMat_NE_Internalname = "MAT_NE_"+sGXsfl_65_idx ;
      edtMat_Dsc_Internalname = "MAT_DSC_"+sGXsfl_65_idx ;
      edtMat_Color_Internalname = "MAT_COLOR_"+sGXsfl_65_idx ;
      edtMat_NAlim_Internalname = "MAT_NALIM_"+sGXsfl_65_idx ;
   }

   public void subsflControlProps_fel_65984( )
   {
      edtavnRcdDeleted_984_Internalname = "vNRCDDELETED_984_"+sGXsfl_65_fel_idx ;
      edtMat_lin_Internalname = "MAT_LIN_"+sGXsfl_65_fel_idx ;
      edtMat_Estr_Internalname = "MAT_ESTR_"+sGXsfl_65_fel_idx ;
      edtMat_Mate_Internalname = "MAT_MATE_"+sGXsfl_65_fel_idx ;
      edtMat_Tors_Internalname = "MAT_TORS_"+sGXsfl_65_fel_idx ;
      edtMat_NomCol_Internalname = "MAT_NOMCOL_"+sGXsfl_65_fel_idx ;
      edtMat_NumCol_Internalname = "MAT_NUMCOL_"+sGXsfl_65_fel_idx ;
      edtMat_ProvN_Internalname = "MAT_PROVN_"+sGXsfl_65_fel_idx ;
      edtMat_Lote_Internalname = "MAT_LOTE_"+sGXsfl_65_fel_idx ;
      edtMat_Porc_Internalname = "MAT_PORC_"+sGXsfl_65_fel_idx ;
      edtMat_LM_Internalname = "MAT_LM_"+sGXsfl_65_fel_idx ;
      edtMat_obs_Internalname = "MAT_OBS_"+sGXsfl_65_fel_idx ;
      edtMat_Lu_Internalname = "MAT_LU_"+sGXsfl_65_fel_idx ;
      edtMat_NE_Internalname = "MAT_NE_"+sGXsfl_65_fel_idx ;
      edtMat_Dsc_Internalname = "MAT_DSC_"+sGXsfl_65_fel_idx ;
      edtMat_Color_Internalname = "MAT_COLOR_"+sGXsfl_65_fel_idx ;
      edtMat_NAlim_Internalname = "MAT_NALIM_"+sGXsfl_65_fel_idx ;
   }

   public void addRow1K4984( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_65984( ) ;
      sendRow1K4984( ) ;
   }

   public void sendRow1K4984( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_984_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_984_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_984, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_984_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_984), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_984), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_984_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_984_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_984_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_lin_Internalname,GXutil.ltrim( localUtil.ntoc( A6954Mat_lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6954Mat_lin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_lin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_lin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_984_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_Estr_Internalname,GXutil.rtrim( A6955Mat_Estr),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_Estr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_Estr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_984_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_Mate_Internalname,GXutil.rtrim( A6956Mat_Mate),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_Mate_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_Mate_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_984_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_Tors_Internalname,GXutil.rtrim( A6957Mat_Tors),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,70);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_Tors_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_Tors_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_984_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_NomCol_Internalname,GXutil.rtrim( A6958Mat_NomCol),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_NomCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_NomCol_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_984_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_NumCol_Internalname,GXutil.ltrim( localUtil.ntoc( A6959Mat_NumCol, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMat_NumCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6959Mat_NumCol), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6959Mat_NumCol), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_NumCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_NumCol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_984_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_ProvN_Internalname,GXutil.rtrim( A6960Mat_ProvN),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_ProvN_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_ProvN_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_984_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_Lote_Internalname,GXutil.rtrim( A6961Mat_Lote),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_Lote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_Lote_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_984_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_Porc_Internalname,GXutil.ltrim( localUtil.ntoc( A6962Mat_Porc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMat_Porc_Enabled!=0) ? localUtil.format( A6962Mat_Porc, "ZZ9.99") : localUtil.format( A6962Mat_Porc, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_Porc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_Porc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_984_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_LM_Internalname,GXutil.ltrim( localUtil.ntoc( A6963Mat_LM, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMat_LM_Enabled!=0) ? localUtil.format( A6963Mat_LM, "Z9.99") : localUtil.format( A6963Mat_LM, "Z9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_LM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_LM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_984_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_obs_Internalname,A6964Mat_obs,A6964Mat_obs,TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_obs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_obs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(32768),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_984_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_Lu_Internalname,GXutil.ltrim( localUtil.ntoc( A12354Mat_Lu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMat_Lu_Enabled!=0) ? localUtil.format( A12354Mat_Lu, "ZZ9.99") : localUtil.format( A12354Mat_Lu, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,78);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_Lu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_Lu_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_984_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_NE_Internalname,GXutil.rtrim( A12355Mat_NE),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_NE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_NE_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_984_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_Dsc_Internalname,A12356Mat_Dsc,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,80);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_Dsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_Dsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_984_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_Color_Internalname,GXutil.rtrim( A12357Mat_Color),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_Color_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_Color_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_984_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_NAlim_Internalname,GXutil.rtrim( A12358Mat_NAlim),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_NAlim_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_NAlim_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1K4984( ) ;
      GXCCtl = "Z6954Mat_lin_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6954Mat_lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6955Mat_Estr_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6955Mat_Estr));
      GXCCtl = "Z6956Mat_Mate_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6956Mat_Mate));
      GXCCtl = "Z6957Mat_Tors_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6957Mat_Tors));
      GXCCtl = "Z6958Mat_NomCol_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6958Mat_NomCol));
      GXCCtl = "Z6959Mat_NumCol_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6959Mat_NumCol, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6960Mat_ProvN_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6960Mat_ProvN));
      GXCCtl = "Z6961Mat_Lote_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6961Mat_Lote));
      GXCCtl = "Z6962Mat_Porc_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6962Mat_Porc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6963Mat_LM_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6963Mat_LM, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12354Mat_Lu_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12354Mat_Lu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12355Mat_NE_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12355Mat_NE));
      GXCCtl = "Z12356Mat_Dsc_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z12356Mat_Dsc);
      GXCCtl = "Z12357Mat_Color_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12357Mat_Color));
      GXCCtl = "Z12358Mat_NAlim_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12358Mat_NAlim));
      GXCCtl = "nRcdDeleted_984_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_984, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_984_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_984, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_984_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_984, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_984_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_984_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_LIN_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_ESTR_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Estr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_MATE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Mate_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_TORS_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Tors_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_NOMCOL_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_NomCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_NUMCOL_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_NumCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_PROVN_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_ProvN_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_LOTE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Lote_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_PORC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Porc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_LM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_LM_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_OBS_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_obs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_LU_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Lu_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_NE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_NE_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_DSC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Dsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_COLOR_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Color_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_NALIM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_NAlim_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1K4984( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_65984( ) ;
      edtavnRcdDeleted_984_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_984_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_LIN_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_Estr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_ESTR_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_Mate_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_MATE_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_Tors_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_TORS_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_NomCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_NOMCOL_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_NumCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_NUMCOL_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_ProvN_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_PROVN_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_Lote_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_LOTE_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_Porc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_PORC_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_LM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_LM_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_obs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_OBS_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_Lu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_LU_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_NE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_NE_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_Dsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_DSC_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_Color_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_COLOR_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_NAlim_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_NALIM_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_984_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_984_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_984");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_984_Internalname ;
         wbErr = true ;
         nRcdDeleted_984 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_984 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_984_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMat_lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMat_lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "MAT_LIN_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMat_lin_Internalname ;
         wbErr = true ;
         A6954Mat_lin = (short)(0) ;
      }
      else
      {
         A6954Mat_lin = (short)(localUtil.ctol( httpContext.cgiGet( edtMat_lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A6955Mat_Estr = httpContext.cgiGet( edtMat_Estr_Internalname) ;
      n6955Mat_Estr = false ;
      A6956Mat_Mate = httpContext.cgiGet( edtMat_Mate_Internalname) ;
      n6956Mat_Mate = false ;
      A6957Mat_Tors = httpContext.cgiGet( edtMat_Tors_Internalname) ;
      n6957Mat_Tors = false ;
      A6958Mat_NomCol = httpContext.cgiGet( edtMat_NomCol_Internalname) ;
      n6958Mat_NomCol = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMat_NumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMat_NumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "MAT_NUMCOL_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMat_NumCol_Internalname ;
         wbErr = true ;
         A6959Mat_NumCol = 0 ;
         n6959Mat_NumCol = false ;
      }
      else
      {
         A6959Mat_NumCol = (int)(localUtil.ctol( httpContext.cgiGet( edtMat_NumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6959Mat_NumCol = false ;
      }
      A6960Mat_ProvN = httpContext.cgiGet( edtMat_ProvN_Internalname) ;
      n6960Mat_ProvN = false ;
      A6961Mat_Lote = httpContext.cgiGet( edtMat_Lote_Internalname) ;
      n6961Mat_Lote = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMat_Porc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMat_Porc_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "MAT_PORC_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMat_Porc_Internalname ;
         wbErr = true ;
         A6962Mat_Porc = DecimalUtil.ZERO ;
         n6962Mat_Porc = false ;
      }
      else
      {
         A6962Mat_Porc = localUtil.ctond( httpContext.cgiGet( edtMat_Porc_Internalname)) ;
         n6962Mat_Porc = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMat_LM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMat_LM_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
      {
         GXCCtl = "MAT_LM_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMat_LM_Internalname ;
         wbErr = true ;
         A6963Mat_LM = DecimalUtil.ZERO ;
         n6963Mat_LM = false ;
      }
      else
      {
         A6963Mat_LM = localUtil.ctond( httpContext.cgiGet( edtMat_LM_Internalname)) ;
         n6963Mat_LM = false ;
      }
      A6964Mat_obs = httpContext.cgiGet( edtMat_obs_Internalname) ;
      n6964Mat_obs = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMat_Lu_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMat_Lu_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "MAT_LU_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMat_Lu_Internalname ;
         wbErr = true ;
         A12354Mat_Lu = DecimalUtil.ZERO ;
         n12354Mat_Lu = false ;
      }
      else
      {
         A12354Mat_Lu = localUtil.ctond( httpContext.cgiGet( edtMat_Lu_Internalname)) ;
         n12354Mat_Lu = false ;
      }
      A12355Mat_NE = httpContext.cgiGet( edtMat_NE_Internalname) ;
      n12355Mat_NE = false ;
      A12356Mat_Dsc = httpContext.cgiGet( edtMat_Dsc_Internalname) ;
      n12356Mat_Dsc = false ;
      A12357Mat_Color = httpContext.cgiGet( edtMat_Color_Internalname) ;
      n12357Mat_Color = false ;
      A12358Mat_NAlim = httpContext.cgiGet( edtMat_NAlim_Internalname) ;
      GXCCtl = "Z6954Mat_lin_" + sGXsfl_65_idx ;
      Z6954Mat_lin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6955Mat_Estr_" + sGXsfl_65_idx ;
      Z6955Mat_Estr = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6956Mat_Mate_" + sGXsfl_65_idx ;
      Z6956Mat_Mate = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6957Mat_Tors_" + sGXsfl_65_idx ;
      Z6957Mat_Tors = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6958Mat_NomCol_" + sGXsfl_65_idx ;
      Z6958Mat_NomCol = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6959Mat_NumCol_" + sGXsfl_65_idx ;
      Z6959Mat_NumCol = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6960Mat_ProvN_" + sGXsfl_65_idx ;
      Z6960Mat_ProvN = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6961Mat_Lote_" + sGXsfl_65_idx ;
      Z6961Mat_Lote = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6962Mat_Porc_" + sGXsfl_65_idx ;
      Z6962Mat_Porc = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6963Mat_LM_" + sGXsfl_65_idx ;
      Z6963Mat_LM = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12354Mat_Lu_" + sGXsfl_65_idx ;
      Z12354Mat_Lu = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12355Mat_NE_" + sGXsfl_65_idx ;
      Z12355Mat_NE = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12356Mat_Dsc_" + sGXsfl_65_idx ;
      Z12356Mat_Dsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12357Mat_Color_" + sGXsfl_65_idx ;
      Z12357Mat_Color = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12358Mat_NAlim_" + sGXsfl_65_idx ;
      Z12358Mat_NAlim = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_984_" + sGXsfl_65_idx ;
      nRcdDeleted_984 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_984_" + sGXsfl_65_idx ;
      nRcdExists_984 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_984_" + sGXsfl_65_idx ;
      nIsMod_984 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMat_lin_Enabled = edtMat_lin_Enabled ;
   }

   public void confirmValues1K40( )
   {
      nGXsfl_65_idx = 0 ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_65984( ) ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_65984( ) ;
         httpContext.changePostValue( "Z6954Mat_lin_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z6954Mat_lin_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6954Mat_lin_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z6955Mat_Estr_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z6955Mat_Estr_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6955Mat_Estr_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z6956Mat_Mate_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z6956Mat_Mate_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6956Mat_Mate_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z6957Mat_Tors_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z6957Mat_Tors_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6957Mat_Tors_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z6958Mat_NomCol_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z6958Mat_NomCol_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6958Mat_NomCol_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z6959Mat_NumCol_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z6959Mat_NumCol_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6959Mat_NumCol_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z6960Mat_ProvN_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z6960Mat_ProvN_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6960Mat_ProvN_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z6961Mat_Lote_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z6961Mat_Lote_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6961Mat_Lote_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z6962Mat_Porc_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z6962Mat_Porc_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6962Mat_Porc_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z6963Mat_LM_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z6963Mat_LM_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6963Mat_LM_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z12354Mat_Lu_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z12354Mat_Lu_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12354Mat_Lu_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z12355Mat_NE_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z12355Mat_NE_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12355Mat_NE_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z12356Mat_Dsc_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z12356Mat_Dsc_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12356Mat_Dsc_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z12357Mat_Color_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z12357Mat_Color_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12357Mat_Color_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z12358Mat_NAlim_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z12358Mat_NAlim_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12358Mat_NAlim_"+sGXsfl_65_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tartfich", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod))}, new String[] {"EmprCod","CliCod","ArtCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6952Mat_UltL", GXutil.ltrim( localUtil.ntoc( Z6952Mat_UltL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6953Mat_Maq", GXutil.rtrim( Z6953Mat_Maq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12353Mat_ObsG", Z12353Mat_ObsG);
      app.GxWebStd.gx_hidden_field( httpContext, "O6952Mat_UltL", GXutil.ltrim( localUtil.ntoc( O6952Mat_UltL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_65", GXutil.ltrim( localUtil.ntoc( nGXsfl_65_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tartfich", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod))}, new String[] {"EmprCod","CliCod","ArtCod"})  ;
   }

   public String getPgmname( )
   {
      return "TArtFich" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Ficha Tecnica del ARTICULO", "") ;
   }

   public void initializeNonKey1K410( )
   {
      A69ArtDsc = "" ;
      n69ArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      A6952Mat_UltL = (short)(0) ;
      n6952Mat_UltL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
      A6953Mat_Maq = "" ;
      n6953Mat_Maq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6953Mat_Maq", A6953Mat_Maq);
      A12353Mat_ObsG = "" ;
      n12353Mat_ObsG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12353Mat_ObsG", A12353Mat_ObsG);
      O6952Mat_UltL = A6952Mat_UltL ;
      n6952Mat_UltL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
      Z69ArtDsc = "" ;
      Z6952Mat_UltL = (short)(0) ;
      Z6953Mat_Maq = "" ;
      Z12353Mat_ObsG = "" ;
   }

   public void initAll1K410( )
   {
      initializeNonKey1K410( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1K4984( )
   {
      A6955Mat_Estr = "" ;
      n6955Mat_Estr = false ;
      A6956Mat_Mate = "" ;
      n6956Mat_Mate = false ;
      A6957Mat_Tors = "" ;
      n6957Mat_Tors = false ;
      A6958Mat_NomCol = "" ;
      n6958Mat_NomCol = false ;
      A6959Mat_NumCol = 0 ;
      n6959Mat_NumCol = false ;
      A6960Mat_ProvN = "" ;
      n6960Mat_ProvN = false ;
      A6961Mat_Lote = "" ;
      n6961Mat_Lote = false ;
      A6962Mat_Porc = DecimalUtil.ZERO ;
      n6962Mat_Porc = false ;
      A6963Mat_LM = DecimalUtil.ZERO ;
      n6963Mat_LM = false ;
      A6964Mat_obs = "" ;
      n6964Mat_obs = false ;
      A12354Mat_Lu = DecimalUtil.ZERO ;
      n12354Mat_Lu = false ;
      A12355Mat_NE = "" ;
      n12355Mat_NE = false ;
      A12356Mat_Dsc = "" ;
      n12356Mat_Dsc = false ;
      A12357Mat_Color = "" ;
      n12357Mat_Color = false ;
      A12358Mat_NAlim = "" ;
      Z6955Mat_Estr = "" ;
      Z6956Mat_Mate = "" ;
      Z6957Mat_Tors = "" ;
      Z6958Mat_NomCol = "" ;
      Z6959Mat_NumCol = 0 ;
      Z6960Mat_ProvN = "" ;
      Z6961Mat_Lote = "" ;
      Z6962Mat_Porc = DecimalUtil.ZERO ;
      Z6963Mat_LM = DecimalUtil.ZERO ;
      Z12354Mat_Lu = DecimalUtil.ZERO ;
      Z12355Mat_NE = "" ;
      Z12356Mat_Dsc = "" ;
      Z12357Mat_Color = "" ;
      Z12358Mat_NAlim = "" ;
   }

   public void initAll1K4984( )
   {
      A6954Mat_lin = (short)(0) ;
      initializeNonKey1K4984( ) ;
   }

   public void standaloneModalInsert1K4984( )
   {
      A6952Mat_UltL = i6952Mat_UltL ;
      n6952Mat_UltL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6952Mat_UltL), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241584945", true, true);
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
      httpContext.AddJavascriptSource("tartfich.js", "?20268241584945", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties984( )
   {
      edtMat_lin_Enabled = defedtMat_lin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_lin_Enabled), 5, 0), !bGXsfl_65_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_984, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_984_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6954Mat_lin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6955Mat_Estr));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Estr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6956Mat_Mate));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Mate_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6957Mat_Tors));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Tors_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6958Mat_NomCol));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_NomCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6959Mat_NumCol, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_NumCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6960Mat_ProvN));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_ProvN_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6961Mat_Lote));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Lote_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6962Mat_Porc, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Porc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6963Mat_LM, (byte)(5), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_LM_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A6964Mat_obs);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_obs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12354Mat_Lu, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Lu_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12355Mat_NE));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_NE_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A12356Mat_Dsc);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Dsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12357Mat_Color));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Color_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12358Mat_NAlim));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_NAlim_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtMat_UltL_Internalname = "MAT_ULTL" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtMat_Maq_Internalname = "MAT_MAQ" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtMat_ObsG_Internalname = "MAT_OBSG" ;
      edtavnRcdDeleted_984_Internalname = "vNRCDDELETED_984" ;
      edtMat_lin_Internalname = "MAT_LIN" ;
      edtMat_Estr_Internalname = "MAT_ESTR" ;
      edtMat_Mate_Internalname = "MAT_MATE" ;
      edtMat_Tors_Internalname = "MAT_TORS" ;
      edtMat_NomCol_Internalname = "MAT_NOMCOL" ;
      edtMat_NumCol_Internalname = "MAT_NUMCOL" ;
      edtMat_ProvN_Internalname = "MAT_PROVN" ;
      edtMat_Lote_Internalname = "MAT_LOTE" ;
      edtMat_Porc_Internalname = "MAT_PORC" ;
      edtMat_LM_Internalname = "MAT_LM" ;
      edtMat_obs_Internalname = "MAT_OBS" ;
      edtMat_Lu_Internalname = "MAT_LU" ;
      edtMat_NE_Internalname = "MAT_NE" ;
      edtMat_Dsc_Internalname = "MAT_DSC" ;
      edtMat_Color_Internalname = "MAT_COLOR" ;
      edtMat_NAlim_Internalname = "MAT_NALIM" ;
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
      Form.setCaption( httpContext.getMessage( "Ficha Tecnica del ARTICULO", "") );
      edtMat_NAlim_Jsonclick = "" ;
      edtMat_Color_Jsonclick = "" ;
      edtMat_Dsc_Jsonclick = "" ;
      edtMat_NE_Jsonclick = "" ;
      edtMat_Lu_Jsonclick = "" ;
      edtMat_obs_Jsonclick = "" ;
      edtMat_LM_Jsonclick = "" ;
      edtMat_Porc_Jsonclick = "" ;
      edtMat_Lote_Jsonclick = "" ;
      edtMat_ProvN_Jsonclick = "" ;
      edtMat_NumCol_Jsonclick = "" ;
      edtMat_NomCol_Jsonclick = "" ;
      edtMat_Tors_Jsonclick = "" ;
      edtMat_Mate_Jsonclick = "" ;
      edtMat_Estr_Jsonclick = "" ;
      edtMat_lin_Jsonclick = "" ;
      edtavnRcdDeleted_984_Jsonclick = "" ;
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
      edtMat_NAlim_Enabled = 1 ;
      edtMat_Color_Enabled = 1 ;
      edtMat_Dsc_Enabled = 1 ;
      edtMat_NE_Enabled = 1 ;
      edtMat_Lu_Enabled = 1 ;
      edtMat_obs_Enabled = 1 ;
      edtMat_LM_Enabled = 1 ;
      edtMat_Porc_Enabled = 1 ;
      edtMat_Lote_Enabled = 1 ;
      edtMat_ProvN_Enabled = 1 ;
      edtMat_NumCol_Enabled = 1 ;
      edtMat_NomCol_Enabled = 1 ;
      edtMat_Tors_Enabled = 1 ;
      edtMat_Mate_Enabled = 1 ;
      edtMat_Estr_Enabled = 1 ;
      edtMat_lin_Enabled = 1 ;
      edtavnRcdDeleted_984_Enabled = 1 ;
      edtMat_ObsG_Backcolor = (int)(0xFFFFFF) ;
      edtMat_ObsG_Enabled = 1 ;
      edtMat_Maq_Jsonclick = "" ;
      edtMat_Maq_Backcolor = (int)(0xFFFFFF) ;
      edtMat_Maq_Enabled = 1 ;
      edtMat_UltL_Jsonclick = "" ;
      edtMat_UltL_Backcolor = (int)(0xFFFFFF) ;
      edtMat_UltL_Enabled = 0 ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_65984( ) ;
      while ( nGXsfl_65_idx <= nRC_GXsfl_65 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1K4984( ) ;
         standaloneModal1K4984( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1K4984( ) ;
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_65984( ) ;
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
      /* Using cursor T01K466 */
      pr_default.execute(64, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(64) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01K466_A407EmprNom[0] ;
      n407EmprNom = T01K466_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(64);
      /* Using cursor T01K467 */
      pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(65) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01K467_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(65);
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
      n6952Mat_UltL = false ;
      n252CliCod = false ;
      n65ArtCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A6952Mat_UltL", GXutil.ltrim( localUtil.ntoc( A6952Mat_UltL, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6953Mat_Maq", GXutil.rtrim( A6953Mat_Maq));
      httpContext.ajax_rsp_assign_attri("", false, "A12353Mat_ObsG", A12353Mat_ObsG);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6952Mat_UltL", GXutil.ltrim( localUtil.ntoc( Z6952Mat_UltL, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6953Mat_Maq", GXutil.rtrim( Z6953Mat_Maq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12353Mat_ObsG", Z12353Mat_ObsG);
      httpContext.ajax_rsp_assign_attri("", false, "O6952Mat_UltL", GXutil.ltrim( localUtil.ntoc( O6952Mat_UltL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A6952Mat_UltL',fld:'MAT_ULTL',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ARTCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'A6952Mat_UltL',fld:'MAT_ULTL',pic:'ZZZ9'},{av:'A6953Mat_Maq',fld:'MAT_MAQ',pic:''},{av:'A12353Mat_ObsG',fld:'MAT_OBSG',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z69ArtDsc'},{av:'Z6952Mat_UltL'},{av:'Z6953Mat_Maq'},{av:'Z12353Mat_ObsG'},{av:'O6952Mat_UltL'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MAT_ULTL","{handler:'valid_Mat_ultl',iparms:[]");
      setEventMetadata("VALID_MAT_ULTL",",oparms:[]}");
      setEventMetadata("VALID_MAT_LIN","{handler:'valid_Mat_lin',iparms:[]");
      setEventMetadata("VALID_MAT_LIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Mat_nalim',iparms:[]");
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
      pr_default.close(64);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA65ArtCod = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z69ArtDsc = "" ;
      Z6953Mat_Maq = "" ;
      Z12353Mat_ObsG = "" ;
      Z6955Mat_Estr = "" ;
      Z6956Mat_Mate = "" ;
      Z6957Mat_Tors = "" ;
      Z6958Mat_NomCol = "" ;
      Z6960Mat_ProvN = "" ;
      Z6961Mat_Lote = "" ;
      Z6962Mat_Porc = DecimalUtil.ZERO ;
      Z6963Mat_LM = DecimalUtil.ZERO ;
      Z12354Mat_Lu = DecimalUtil.ZERO ;
      Z12355Mat_NE = "" ;
      Z12356Mat_Dsc = "" ;
      Z12357Mat_Color = "" ;
      Z12358Mat_NAlim = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A69ArtDsc = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A6953Mat_Maq = "" ;
      lblTextblock9_Jsonclick = "" ;
      A12353Mat_ObsG = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode984 = "" ;
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
      sMode10 = "" ;
      GXCCtl = "" ;
      A6955Mat_Estr = "" ;
      A6956Mat_Mate = "" ;
      A6957Mat_Tors = "" ;
      A6958Mat_NomCol = "" ;
      A6960Mat_ProvN = "" ;
      A6961Mat_Lote = "" ;
      A6962Mat_Porc = DecimalUtil.ZERO ;
      A6963Mat_LM = DecimalUtil.ZERO ;
      A6964Mat_obs = "" ;
      A12354Mat_Lu = DecimalUtil.ZERO ;
      A12355Mat_NE = "" ;
      A12356Mat_Dsc = "" ;
      A12357Mat_Color = "" ;
      A12358Mat_NAlim = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T01K46_A407EmprNom = new String[] {""} ;
      T01K46_n407EmprNom = new boolean[] {false} ;
      T01K47_A279CliNom = new String[] {""} ;
      T01K48_A65ArtCod = new String[] {""} ;
      T01K48_n65ArtCod = new boolean[] {false} ;
      T01K48_A407EmprNom = new String[] {""} ;
      T01K48_n407EmprNom = new boolean[] {false} ;
      T01K48_A279CliNom = new String[] {""} ;
      T01K48_A69ArtDsc = new String[] {""} ;
      T01K48_n69ArtDsc = new boolean[] {false} ;
      T01K48_A6952Mat_UltL = new short[1] ;
      T01K48_n6952Mat_UltL = new boolean[] {false} ;
      T01K48_A6953Mat_Maq = new String[] {""} ;
      T01K48_n6953Mat_Maq = new boolean[] {false} ;
      T01K48_A12353Mat_ObsG = new String[] {""} ;
      T01K48_n12353Mat_ObsG = new boolean[] {false} ;
      T01K48_A396EmprCod = new String[] {""} ;
      T01K48_A252CliCod = new int[1] ;
      T01K48_n252CliCod = new boolean[] {false} ;
      T01K49_A396EmprCod = new String[] {""} ;
      T01K49_A252CliCod = new int[1] ;
      T01K49_n252CliCod = new boolean[] {false} ;
      T01K49_A65ArtCod = new String[] {""} ;
      T01K49_n65ArtCod = new boolean[] {false} ;
      T01K45_A65ArtCod = new String[] {""} ;
      T01K45_n65ArtCod = new boolean[] {false} ;
      T01K45_A69ArtDsc = new String[] {""} ;
      T01K45_n69ArtDsc = new boolean[] {false} ;
      T01K45_A6952Mat_UltL = new short[1] ;
      T01K45_n6952Mat_UltL = new boolean[] {false} ;
      T01K45_A6953Mat_Maq = new String[] {""} ;
      T01K45_n6953Mat_Maq = new boolean[] {false} ;
      T01K45_A12353Mat_ObsG = new String[] {""} ;
      T01K45_n12353Mat_ObsG = new boolean[] {false} ;
      T01K45_A396EmprCod = new String[] {""} ;
      T01K45_A252CliCod = new int[1] ;
      T01K45_n252CliCod = new boolean[] {false} ;
      T01K410_A396EmprCod = new String[] {""} ;
      T01K410_A252CliCod = new int[1] ;
      T01K410_n252CliCod = new boolean[] {false} ;
      T01K410_A65ArtCod = new String[] {""} ;
      T01K410_n65ArtCod = new boolean[] {false} ;
      T01K411_A396EmprCod = new String[] {""} ;
      T01K411_A252CliCod = new int[1] ;
      T01K411_n252CliCod = new boolean[] {false} ;
      T01K411_A65ArtCod = new String[] {""} ;
      T01K411_n65ArtCod = new boolean[] {false} ;
      T01K44_A65ArtCod = new String[] {""} ;
      T01K44_n65ArtCod = new boolean[] {false} ;
      T01K44_A69ArtDsc = new String[] {""} ;
      T01K44_n69ArtDsc = new boolean[] {false} ;
      T01K44_A6952Mat_UltL = new short[1] ;
      T01K44_n6952Mat_UltL = new boolean[] {false} ;
      T01K44_A6953Mat_Maq = new String[] {""} ;
      T01K44_n6953Mat_Maq = new boolean[] {false} ;
      T01K44_A12353Mat_ObsG = new String[] {""} ;
      T01K44_n12353Mat_ObsG = new boolean[] {false} ;
      T01K44_A396EmprCod = new String[] {""} ;
      T01K44_A252CliCod = new int[1] ;
      T01K44_n252CliCod = new boolean[] {false} ;
      T01K415_A396EmprCod = new String[] {""} ;
      T01K415_A252CliCod = new int[1] ;
      T01K415_n252CliCod = new boolean[] {false} ;
      T01K415_A65ArtCod = new String[] {""} ;
      T01K415_n65ArtCod = new boolean[] {false} ;
      T01K415_A499GrpFamCod = new byte[1] ;
      T01K416_A396EmprCod = new String[] {""} ;
      T01K416_A252CliCod = new int[1] ;
      T01K416_n252CliCod = new boolean[] {false} ;
      T01K416_A12814ARTConID = new String[] {""} ;
      T01K416_A65ArtCod = new String[] {""} ;
      T01K416_n65ArtCod = new boolean[] {false} ;
      T01K417_A396EmprCod = new String[] {""} ;
      T01K417_A252CliCod = new int[1] ;
      T01K417_n252CliCod = new boolean[] {false} ;
      T01K417_A65ArtCod = new String[] {""} ;
      T01K417_n65ArtCod = new boolean[] {false} ;
      T01K417_A12363SocInt = new byte[1] ;
      T01K418_A396EmprCod = new String[] {""} ;
      T01K418_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01K418_A5728JBCLLin = new short[1] ;
      T01K419_A396EmprCod = new String[] {""} ;
      T01K419_A252CliCod = new int[1] ;
      T01K419_n252CliCod = new boolean[] {false} ;
      T01K419_A5809MMezCod = new String[] {""} ;
      T01K419_A65ArtCod = new String[] {""} ;
      T01K419_n65ArtCod = new boolean[] {false} ;
      T01K420_A396EmprCod = new String[] {""} ;
      T01K420_A252CliCod = new int[1] ;
      T01K420_n252CliCod = new boolean[] {false} ;
      T01K420_A5234MezCod = new String[] {""} ;
      T01K420_A5240MezLin = new byte[1] ;
      T01K421_A396EmprCod = new String[] {""} ;
      T01K421_A252CliCod = new int[1] ;
      T01K421_n252CliCod = new boolean[] {false} ;
      T01K421_A65ArtCod = new String[] {""} ;
      T01K421_n65ArtCod = new boolean[] {false} ;
      T01K421_A4116estreclim = new int[1] ;
      T01K422_A396EmprCod = new String[] {""} ;
      T01K422_A252CliCod = new int[1] ;
      T01K422_n252CliCod = new boolean[] {false} ;
      T01K422_A65ArtCod = new String[] {""} ;
      T01K422_n65ArtCod = new boolean[] {false} ;
      T01K422_A4061EstNomCol = new String[] {""} ;
      T01K423_A396EmprCod = new String[] {""} ;
      T01K423_A9705ErpNped = new String[] {""} ;
      T01K423_A8652ErpLin = new short[1] ;
      T01K424_A396EmprCod = new String[] {""} ;
      T01K424_A252CliCod = new int[1] ;
      T01K424_n252CliCod = new boolean[] {false} ;
      T01K424_A65ArtCod = new String[] {""} ;
      T01K424_n65ArtCod = new boolean[] {false} ;
      T01K424_A7266CAAqP = new String[] {""} ;
      T01K425_A396EmprCod = new String[] {""} ;
      T01K425_A252CliCod = new int[1] ;
      T01K425_n252CliCod = new boolean[] {false} ;
      T01K425_A65ArtCod = new String[] {""} ;
      T01K425_n65ArtCod = new boolean[] {false} ;
      T01K425_A11084H_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T01K426_A396EmprCod = new String[] {""} ;
      T01K426_A252CliCod = new int[1] ;
      T01K426_n252CliCod = new boolean[] {false} ;
      T01K426_A65ArtCod = new String[] {""} ;
      T01K426_n65ArtCod = new boolean[] {false} ;
      T01K426_A10972Int_cod = new byte[1] ;
      T01K427_A396EmprCod = new String[] {""} ;
      T01K427_A252CliCod = new int[1] ;
      T01K427_n252CliCod = new boolean[] {false} ;
      T01K427_A65ArtCod = new String[] {""} ;
      T01K427_n65ArtCod = new boolean[] {false} ;
      T01K427_A10577Pg_Procod = new String[] {""} ;
      T01K428_A396EmprCod = new String[] {""} ;
      T01K428_A252CliCod = new int[1] ;
      T01K428_n252CliCod = new boolean[] {false} ;
      T01K428_A65ArtCod = new String[] {""} ;
      T01K428_n65ArtCod = new boolean[] {false} ;
      T01K428_A10272Hz_cod = new String[] {""} ;
      T01K429_A396EmprCod = new String[] {""} ;
      T01K429_A252CliCod = new int[1] ;
      T01K429_n252CliCod = new boolean[] {false} ;
      T01K429_A65ArtCod = new String[] {""} ;
      T01K429_n65ArtCod = new boolean[] {false} ;
      T01K429_A10041ArtSH = new String[] {""} ;
      T01K430_A396EmprCod = new String[] {""} ;
      T01K430_A252CliCod = new int[1] ;
      T01K430_n252CliCod = new boolean[] {false} ;
      T01K430_A65ArtCod = new String[] {""} ;
      T01K430_n65ArtCod = new boolean[] {false} ;
      T01K430_A8427TipoCt = new String[] {""} ;
      T01K430_A8428CapMxMq = new int[1] ;
      T01K431_A396EmprCod = new String[] {""} ;
      T01K431_A252CliCod = new int[1] ;
      T01K431_n252CliCod = new boolean[] {false} ;
      T01K431_A65ArtCod = new String[] {""} ;
      T01K431_n65ArtCod = new boolean[] {false} ;
      T01K431_A8342CodPred = new short[1] ;
      T01K432_A396EmprCod = new String[] {""} ;
      T01K432_A252CliCod = new int[1] ;
      T01K432_n252CliCod = new boolean[] {false} ;
      T01K432_A65ArtCod = new String[] {""} ;
      T01K432_n65ArtCod = new boolean[] {false} ;
      T01K432_A8089ArtcodTj = new String[] {""} ;
      T01K433_A396EmprCod = new String[] {""} ;
      T01K433_A252CliCod = new int[1] ;
      T01K433_n252CliCod = new boolean[] {false} ;
      T01K433_A65ArtCod = new String[] {""} ;
      T01K433_n65ArtCod = new boolean[] {false} ;
      T01K433_A7956Mq_CodM = new String[] {""} ;
      T01K434_A396EmprCod = new String[] {""} ;
      T01K434_A252CliCod = new int[1] ;
      T01K434_n252CliCod = new boolean[] {false} ;
      T01K434_A65ArtCod = new String[] {""} ;
      T01K434_n65ArtCod = new boolean[] {false} ;
      T01K434_A7949Par_Art = new short[1] ;
      T01K435_A396EmprCod = new String[] {""} ;
      T01K435_A252CliCod = new int[1] ;
      T01K435_n252CliCod = new boolean[] {false} ;
      T01K435_A65ArtCod = new String[] {""} ;
      T01K435_n65ArtCod = new boolean[] {false} ;
      T01K435_A7135Lin_fast = new short[1] ;
      T01K436_A396EmprCod = new String[] {""} ;
      T01K436_A602MaqCod = new String[] {""} ;
      T01K436_A6078MaqCliCod = new int[1] ;
      T01K436_A6079MaqArtCod = new String[] {""} ;
      T01K437_A396EmprCod = new String[] {""} ;
      T01K437_A252CliCod = new int[1] ;
      T01K437_n252CliCod = new boolean[] {false} ;
      T01K437_A65ArtCod = new String[] {""} ;
      T01K437_n65ArtCod = new boolean[] {false} ;
      T01K437_A5382EstCatAny = new short[1] ;
      T01K437_A5383EstCatSer = new String[] {""} ;
      T01K437_A5384EstCatTip = new short[1] ;
      T01K438_A396EmprCod = new String[] {""} ;
      T01K438_A252CliCod = new int[1] ;
      T01K438_n252CliCod = new boolean[] {false} ;
      T01K438_A65ArtCod = new String[] {""} ;
      T01K438_n65ArtCod = new boolean[] {false} ;
      T01K438_A4658MdlCod = new String[] {""} ;
      T01K439_A396EmprCod = new String[] {""} ;
      T01K439_A252CliCod = new int[1] ;
      T01K439_n252CliCod = new boolean[] {false} ;
      T01K439_A4175WebEmpCod = new String[] {""} ;
      T01K440_A396EmprCod = new String[] {""} ;
      T01K440_A252CliCod = new int[1] ;
      T01K440_n252CliCod = new boolean[] {false} ;
      T01K440_A4079WEBDISCOD = new String[] {""} ;
      T01K441_A396EmprCod = new String[] {""} ;
      T01K441_A252CliCod = new int[1] ;
      T01K441_n252CliCod = new boolean[] {false} ;
      T01K441_A65ArtCod = new String[] {""} ;
      T01K441_n65ArtCod = new boolean[] {false} ;
      T01K441_A4058CCFColNom = new String[] {""} ;
      T01K441_A4059CCFColNum = new int[1] ;
      T01K442_A396EmprCod = new String[] {""} ;
      T01K442_A252CliCod = new int[1] ;
      T01K442_n252CliCod = new boolean[] {false} ;
      T01K442_A65ArtCod = new String[] {""} ;
      T01K442_n65ArtCod = new boolean[] {false} ;
      T01K442_A1177Dibujo = new String[] {""} ;
      T01K442_A1790DibIntCod = new int[1] ;
      T01K443_A396EmprCod = new String[] {""} ;
      T01K443_A252CliCod = new int[1] ;
      T01K443_n252CliCod = new boolean[] {false} ;
      T01K443_A65ArtCod = new String[] {""} ;
      T01K443_n65ArtCod = new boolean[] {false} ;
      T01K443_A1080LinPre = new byte[1] ;
      T01K444_A396EmprCod = new String[] {""} ;
      T01K444_A3814PePCod = new long[1] ;
      T01K445_A396EmprCod = new String[] {""} ;
      T01K445_A3413OpeManCod = new byte[1] ;
      T01K445_A3430PreManNMt = new String[] {""} ;
      T01K445_A252CliCod = new int[1] ;
      T01K445_n252CliCod = new boolean[] {false} ;
      T01K445_A65ArtCod = new String[] {""} ;
      T01K445_n65ArtCod = new boolean[] {false} ;
      T01K446_A396EmprCod = new String[] {""} ;
      T01K446_A3415ParManNum = new int[1] ;
      T01K447_A396EmprCod = new String[] {""} ;
      T01K447_A3331LanBroCod = new byte[1] ;
      T01K447_A3333LanBroLin = new short[1] ;
      T01K448_A396EmprCod = new String[] {""} ;
      T01K448_A252CliCod = new int[1] ;
      T01K448_n252CliCod = new boolean[] {false} ;
      T01K448_A65ArtCod = new String[] {""} ;
      T01K448_n65ArtCod = new boolean[] {false} ;
      T01K448_A3319ArtCapKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01K449_A396EmprCod = new String[] {""} ;
      T01K449_A252CliCod = new int[1] ;
      T01K449_n252CliCod = new boolean[] {false} ;
      T01K449_A65ArtCod = new String[] {""} ;
      T01K449_n65ArtCod = new boolean[] {false} ;
      T01K449_A3288CCalCod = new String[] {""} ;
      T01K450_A396EmprCod = new String[] {""} ;
      T01K450_A252CliCod = new int[1] ;
      T01K450_n252CliCod = new boolean[] {false} ;
      T01K450_A65ArtCod = new String[] {""} ;
      T01K450_n65ArtCod = new boolean[] {false} ;
      T01K450_A3033CCCod = new String[] {""} ;
      T01K451_A396EmprCod = new String[] {""} ;
      T01K451_A252CliCod = new int[1] ;
      T01K451_n252CliCod = new boolean[] {false} ;
      T01K451_A65ArtCod = new String[] {""} ;
      T01K451_n65ArtCod = new boolean[] {false} ;
      T01K451_A2937RecIntCod = new byte[1] ;
      T01K452_A396EmprCod = new String[] {""} ;
      T01K452_A252CliCod = new int[1] ;
      T01K452_n252CliCod = new boolean[] {false} ;
      T01K452_A65ArtCod = new String[] {""} ;
      T01K452_n65ArtCod = new boolean[] {false} ;
      T01K452_A2931Limite2 = new short[1] ;
      T01K453_A396EmprCod = new String[] {""} ;
      T01K453_A252CliCod = new int[1] ;
      T01K453_n252CliCod = new boolean[] {false} ;
      T01K453_A65ArtCod = new String[] {""} ;
      T01K453_n65ArtCod = new boolean[] {false} ;
      T01K453_A71ArtEstAny = new short[1] ;
      T01K453_A2756ArtEstSer = new String[] {""} ;
      T01K454_A396EmprCod = new String[] {""} ;
      T01K454_A252CliCod = new int[1] ;
      T01K454_n252CliCod = new boolean[] {false} ;
      T01K454_A1504CliProCod = new String[] {""} ;
      T01K454_A65ArtCod = new String[] {""} ;
      T01K454_n65ArtCod = new boolean[] {false} ;
      T01K455_A396EmprCod = new String[] {""} ;
      T01K455_A252CliCod = new int[1] ;
      T01K455_n252CliCod = new boolean[] {false} ;
      T01K455_A65ArtCod = new String[] {""} ;
      T01K455_n65ArtCod = new boolean[] {false} ;
      T01K455_A598LinRec = new byte[1] ;
      T01K456_A396EmprCod = new String[] {""} ;
      T01K456_A252CliCod = new int[1] ;
      T01K456_n252CliCod = new boolean[] {false} ;
      T01K456_A65ArtCod = new String[] {""} ;
      T01K456_n65ArtCod = new boolean[] {false} ;
      T01K456_A831TipColCod = new byte[1] ;
      T01K457_A396EmprCod = new String[] {""} ;
      T01K457_A252CliCod = new int[1] ;
      T01K457_n252CliCod = new boolean[] {false} ;
      T01K457_A65ArtCod = new String[] {""} ;
      T01K457_n65ArtCod = new boolean[] {false} ;
      T01K457_A758ProCod = new String[] {""} ;
      T01K459_A396EmprCod = new String[] {""} ;
      T01K459_A252CliCod = new int[1] ;
      T01K459_n252CliCod = new boolean[] {false} ;
      T01K459_A65ArtCod = new String[] {""} ;
      T01K459_n65ArtCod = new boolean[] {false} ;
      Z6964Mat_obs = "" ;
      T01K460_A6964Mat_obs = new String[] {""} ;
      T01K460_n6964Mat_obs = new boolean[] {false} ;
      T01K460_A252CliCod = new int[1] ;
      T01K460_n252CliCod = new boolean[] {false} ;
      T01K460_A65ArtCod = new String[] {""} ;
      T01K460_n65ArtCod = new boolean[] {false} ;
      T01K460_A6954Mat_lin = new short[1] ;
      T01K460_A6955Mat_Estr = new String[] {""} ;
      T01K460_n6955Mat_Estr = new boolean[] {false} ;
      T01K460_A6956Mat_Mate = new String[] {""} ;
      T01K460_n6956Mat_Mate = new boolean[] {false} ;
      T01K460_A6957Mat_Tors = new String[] {""} ;
      T01K460_n6957Mat_Tors = new boolean[] {false} ;
      T01K460_A6958Mat_NomCol = new String[] {""} ;
      T01K460_n6958Mat_NomCol = new boolean[] {false} ;
      T01K460_A6959Mat_NumCol = new int[1] ;
      T01K460_n6959Mat_NumCol = new boolean[] {false} ;
      T01K460_A6960Mat_ProvN = new String[] {""} ;
      T01K460_n6960Mat_ProvN = new boolean[] {false} ;
      T01K460_A6961Mat_Lote = new String[] {""} ;
      T01K460_n6961Mat_Lote = new boolean[] {false} ;
      T01K460_A6962Mat_Porc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01K460_n6962Mat_Porc = new boolean[] {false} ;
      T01K460_A6963Mat_LM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01K460_n6963Mat_LM = new boolean[] {false} ;
      T01K460_A12354Mat_Lu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01K460_n12354Mat_Lu = new boolean[] {false} ;
      T01K460_A12355Mat_NE = new String[] {""} ;
      T01K460_n12355Mat_NE = new boolean[] {false} ;
      T01K460_A12356Mat_Dsc = new String[] {""} ;
      T01K460_n12356Mat_Dsc = new boolean[] {false} ;
      T01K460_A12357Mat_Color = new String[] {""} ;
      T01K460_n12357Mat_Color = new boolean[] {false} ;
      T01K460_A12358Mat_NAlim = new String[] {""} ;
      T01K460_A396EmprCod = new String[] {""} ;
      T01K461_A396EmprCod = new String[] {""} ;
      T01K461_A252CliCod = new int[1] ;
      T01K461_n252CliCod = new boolean[] {false} ;
      T01K461_A65ArtCod = new String[] {""} ;
      T01K461_n65ArtCod = new boolean[] {false} ;
      T01K461_A6954Mat_lin = new short[1] ;
      T01K43_A6964Mat_obs = new String[] {""} ;
      T01K43_n6964Mat_obs = new boolean[] {false} ;
      T01K43_A252CliCod = new int[1] ;
      T01K43_n252CliCod = new boolean[] {false} ;
      T01K43_A65ArtCod = new String[] {""} ;
      T01K43_n65ArtCod = new boolean[] {false} ;
      T01K43_A6954Mat_lin = new short[1] ;
      T01K43_A6955Mat_Estr = new String[] {""} ;
      T01K43_n6955Mat_Estr = new boolean[] {false} ;
      T01K43_A6956Mat_Mate = new String[] {""} ;
      T01K43_n6956Mat_Mate = new boolean[] {false} ;
      T01K43_A6957Mat_Tors = new String[] {""} ;
      T01K43_n6957Mat_Tors = new boolean[] {false} ;
      T01K43_A6958Mat_NomCol = new String[] {""} ;
      T01K43_n6958Mat_NomCol = new boolean[] {false} ;
      T01K43_A6959Mat_NumCol = new int[1] ;
      T01K43_n6959Mat_NumCol = new boolean[] {false} ;
      T01K43_A6960Mat_ProvN = new String[] {""} ;
      T01K43_n6960Mat_ProvN = new boolean[] {false} ;
      T01K43_A6961Mat_Lote = new String[] {""} ;
      T01K43_n6961Mat_Lote = new boolean[] {false} ;
      T01K43_A6962Mat_Porc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01K43_n6962Mat_Porc = new boolean[] {false} ;
      T01K43_A6963Mat_LM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01K43_n6963Mat_LM = new boolean[] {false} ;
      T01K43_A12354Mat_Lu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01K43_n12354Mat_Lu = new boolean[] {false} ;
      T01K43_A12355Mat_NE = new String[] {""} ;
      T01K43_n12355Mat_NE = new boolean[] {false} ;
      T01K43_A12356Mat_Dsc = new String[] {""} ;
      T01K43_n12356Mat_Dsc = new boolean[] {false} ;
      T01K43_A12357Mat_Color = new String[] {""} ;
      T01K43_n12357Mat_Color = new boolean[] {false} ;
      T01K43_A12358Mat_NAlim = new String[] {""} ;
      T01K43_A396EmprCod = new String[] {""} ;
      T01K42_A6964Mat_obs = new String[] {""} ;
      T01K42_n6964Mat_obs = new boolean[] {false} ;
      T01K42_A252CliCod = new int[1] ;
      T01K42_n252CliCod = new boolean[] {false} ;
      T01K42_A65ArtCod = new String[] {""} ;
      T01K42_n65ArtCod = new boolean[] {false} ;
      T01K42_A6954Mat_lin = new short[1] ;
      T01K42_A6955Mat_Estr = new String[] {""} ;
      T01K42_n6955Mat_Estr = new boolean[] {false} ;
      T01K42_A6956Mat_Mate = new String[] {""} ;
      T01K42_n6956Mat_Mate = new boolean[] {false} ;
      T01K42_A6957Mat_Tors = new String[] {""} ;
      T01K42_n6957Mat_Tors = new boolean[] {false} ;
      T01K42_A6958Mat_NomCol = new String[] {""} ;
      T01K42_n6958Mat_NomCol = new boolean[] {false} ;
      T01K42_A6959Mat_NumCol = new int[1] ;
      T01K42_n6959Mat_NumCol = new boolean[] {false} ;
      T01K42_A6960Mat_ProvN = new String[] {""} ;
      T01K42_n6960Mat_ProvN = new boolean[] {false} ;
      T01K42_A6961Mat_Lote = new String[] {""} ;
      T01K42_n6961Mat_Lote = new boolean[] {false} ;
      T01K42_A6962Mat_Porc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01K42_n6962Mat_Porc = new boolean[] {false} ;
      T01K42_A6963Mat_LM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01K42_n6963Mat_LM = new boolean[] {false} ;
      T01K42_A12354Mat_Lu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01K42_n12354Mat_Lu = new boolean[] {false} ;
      T01K42_A12355Mat_NE = new String[] {""} ;
      T01K42_n12355Mat_NE = new boolean[] {false} ;
      T01K42_A12356Mat_Dsc = new String[] {""} ;
      T01K42_n12356Mat_Dsc = new boolean[] {false} ;
      T01K42_A12357Mat_Color = new String[] {""} ;
      T01K42_n12357Mat_Color = new boolean[] {false} ;
      T01K42_A12358Mat_NAlim = new String[] {""} ;
      T01K42_A396EmprCod = new String[] {""} ;
      GXv_char3 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char1 = new String[1] ;
      T01K465_A396EmprCod = new String[] {""} ;
      T01K465_A252CliCod = new int[1] ;
      T01K465_n252CliCod = new boolean[] {false} ;
      T01K465_A65ArtCod = new String[] {""} ;
      T01K465_n65ArtCod = new boolean[] {false} ;
      T01K465_A6954Mat_lin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01K466_A407EmprNom = new String[] {""} ;
      T01K466_n407EmprNom = new boolean[] {false} ;
      T01K467_A279CliNom = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ69ArtDsc = "" ;
      ZZ6953Mat_Maq = "" ;
      ZZ12353Mat_ObsG = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tartfich__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tartfich__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tartfich__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tartfich__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tartfich__default(),
         new Object[] {
             new Object[] {
            T01K42_A6964Mat_obs, T01K42_n6964Mat_obs, T01K42_A252CliCod, T01K42_A65ArtCod, T01K42_A6954Mat_lin, T01K42_A6955Mat_Estr, T01K42_n6955Mat_Estr, T01K42_A6956Mat_Mate, T01K42_n6956Mat_Mate, T01K42_A6957Mat_Tors,
            T01K42_n6957Mat_Tors, T01K42_A6958Mat_NomCol, T01K42_n6958Mat_NomCol, T01K42_A6959Mat_NumCol, T01K42_n6959Mat_NumCol, T01K42_A6960Mat_ProvN, T01K42_n6960Mat_ProvN, T01K42_A6961Mat_Lote, T01K42_n6961Mat_Lote, T01K42_A6962Mat_Porc,
            T01K42_n6962Mat_Porc, T01K42_A6963Mat_LM, T01K42_n6963Mat_LM, T01K42_A12354Mat_Lu, T01K42_n12354Mat_Lu, T01K42_A12355Mat_NE, T01K42_n12355Mat_NE, T01K42_A12356Mat_Dsc, T01K42_n12356Mat_Dsc, T01K42_A12357Mat_Color,
            T01K42_n12357Mat_Color, T01K42_A12358Mat_NAlim, T01K42_A396EmprCod
            }
            , new Object[] {
            T01K43_A6964Mat_obs, T01K43_n6964Mat_obs, T01K43_A252CliCod, T01K43_A65ArtCod, T01K43_A6954Mat_lin, T01K43_A6955Mat_Estr, T01K43_n6955Mat_Estr, T01K43_A6956Mat_Mate, T01K43_n6956Mat_Mate, T01K43_A6957Mat_Tors,
            T01K43_n6957Mat_Tors, T01K43_A6958Mat_NomCol, T01K43_n6958Mat_NomCol, T01K43_A6959Mat_NumCol, T01K43_n6959Mat_NumCol, T01K43_A6960Mat_ProvN, T01K43_n6960Mat_ProvN, T01K43_A6961Mat_Lote, T01K43_n6961Mat_Lote, T01K43_A6962Mat_Porc,
            T01K43_n6962Mat_Porc, T01K43_A6963Mat_LM, T01K43_n6963Mat_LM, T01K43_A12354Mat_Lu, T01K43_n12354Mat_Lu, T01K43_A12355Mat_NE, T01K43_n12355Mat_NE, T01K43_A12356Mat_Dsc, T01K43_n12356Mat_Dsc, T01K43_A12357Mat_Color,
            T01K43_n12357Mat_Color, T01K43_A12358Mat_NAlim, T01K43_A396EmprCod
            }
            , new Object[] {
            T01K44_A65ArtCod, T01K44_A69ArtDsc, T01K44_n69ArtDsc, T01K44_A6952Mat_UltL, T01K44_n6952Mat_UltL, T01K44_A6953Mat_Maq, T01K44_n6953Mat_Maq, T01K44_A12353Mat_ObsG, T01K44_n12353Mat_ObsG, T01K44_A396EmprCod,
            T01K44_A252CliCod
            }
            , new Object[] {
            T01K45_A65ArtCod, T01K45_A69ArtDsc, T01K45_n69ArtDsc, T01K45_A6952Mat_UltL, T01K45_n6952Mat_UltL, T01K45_A6953Mat_Maq, T01K45_n6953Mat_Maq, T01K45_A12353Mat_ObsG, T01K45_n12353Mat_ObsG, T01K45_A396EmprCod,
            T01K45_A252CliCod
            }
            , new Object[] {
            T01K46_A407EmprNom, T01K46_n407EmprNom
            }
            , new Object[] {
            T01K47_A279CliNom
            }
            , new Object[] {
            T01K48_A65ArtCod, T01K48_A407EmprNom, T01K48_n407EmprNom, T01K48_A279CliNom, T01K48_A69ArtDsc, T01K48_n69ArtDsc, T01K48_A6952Mat_UltL, T01K48_n6952Mat_UltL, T01K48_A6953Mat_Maq, T01K48_n6953Mat_Maq,
            T01K48_A12353Mat_ObsG, T01K48_n12353Mat_ObsG, T01K48_A396EmprCod, T01K48_A252CliCod
            }
            , new Object[] {
            T01K49_A396EmprCod, T01K49_A252CliCod, T01K49_A65ArtCod
            }
            , new Object[] {
            T01K410_A396EmprCod, T01K410_A252CliCod, T01K410_A65ArtCod
            }
            , new Object[] {
            T01K411_A396EmprCod, T01K411_A252CliCod, T01K411_A65ArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01K415_A396EmprCod, T01K415_A252CliCod, T01K415_A65ArtCod, T01K415_A499GrpFamCod
            }
            , new Object[] {
            T01K416_A396EmprCod, T01K416_A252CliCod, T01K416_A12814ARTConID, T01K416_A65ArtCod
            }
            , new Object[] {
            T01K417_A396EmprCod, T01K417_A252CliCod, T01K417_A65ArtCod, T01K417_A12363SocInt
            }
            , new Object[] {
            T01K418_A396EmprCod, T01K418_A4929Inc_Dia, T01K418_A5728JBCLLin
            }
            , new Object[] {
            T01K419_A396EmprCod, T01K419_A252CliCod, T01K419_A5809MMezCod, T01K419_A65ArtCod
            }
            , new Object[] {
            T01K420_A396EmprCod, T01K420_A252CliCod, T01K420_A5234MezCod, T01K420_A5240MezLin
            }
            , new Object[] {
            T01K421_A396EmprCod, T01K421_A252CliCod, T01K421_A65ArtCod, T01K421_A4116estreclim
            }
            , new Object[] {
            T01K422_A396EmprCod, T01K422_A252CliCod, T01K422_A65ArtCod, T01K422_A4061EstNomCol
            }
            , new Object[] {
            T01K423_A396EmprCod, T01K423_A9705ErpNped, T01K423_A8652ErpLin
            }
            , new Object[] {
            T01K424_A396EmprCod, T01K424_A252CliCod, T01K424_A65ArtCod, T01K424_A7266CAAqP
            }
            , new Object[] {
            T01K425_A396EmprCod, T01K425_A252CliCod, T01K425_A65ArtCod, T01K425_A11084H_DiaA
            }
            , new Object[] {
            T01K426_A396EmprCod, T01K426_A252CliCod, T01K426_A65ArtCod, T01K426_A10972Int_cod
            }
            , new Object[] {
            T01K427_A396EmprCod, T01K427_A252CliCod, T01K427_A65ArtCod, T01K427_A10577Pg_Procod
            }
            , new Object[] {
            T01K428_A396EmprCod, T01K428_A252CliCod, T01K428_A65ArtCod, T01K428_A10272Hz_cod
            }
            , new Object[] {
            T01K429_A396EmprCod, T01K429_A252CliCod, T01K429_A65ArtCod, T01K429_A10041ArtSH
            }
            , new Object[] {
            T01K430_A396EmprCod, T01K430_A252CliCod, T01K430_A65ArtCod, T01K430_A8427TipoCt, T01K430_A8428CapMxMq
            }
            , new Object[] {
            T01K431_A396EmprCod, T01K431_A252CliCod, T01K431_A65ArtCod, T01K431_A8342CodPred
            }
            , new Object[] {
            T01K432_A396EmprCod, T01K432_A252CliCod, T01K432_A65ArtCod, T01K432_A8089ArtcodTj
            }
            , new Object[] {
            T01K433_A396EmprCod, T01K433_A252CliCod, T01K433_A65ArtCod, T01K433_A7956Mq_CodM
            }
            , new Object[] {
            T01K434_A396EmprCod, T01K434_A252CliCod, T01K434_A65ArtCod, T01K434_A7949Par_Art
            }
            , new Object[] {
            T01K435_A396EmprCod, T01K435_A252CliCod, T01K435_A65ArtCod, T01K435_A7135Lin_fast
            }
            , new Object[] {
            T01K436_A396EmprCod, T01K436_A602MaqCod, T01K436_A6078MaqCliCod, T01K436_A6079MaqArtCod
            }
            , new Object[] {
            T01K437_A396EmprCod, T01K437_A252CliCod, T01K437_A65ArtCod, T01K437_A5382EstCatAny, T01K437_A5383EstCatSer, T01K437_A5384EstCatTip
            }
            , new Object[] {
            T01K438_A396EmprCod, T01K438_A252CliCod, T01K438_A65ArtCod, T01K438_A4658MdlCod
            }
            , new Object[] {
            T01K439_A396EmprCod, T01K439_A252CliCod, T01K439_A4175WebEmpCod
            }
            , new Object[] {
            T01K440_A396EmprCod, T01K440_A252CliCod, T01K440_A4079WEBDISCOD
            }
            , new Object[] {
            T01K441_A396EmprCod, T01K441_A252CliCod, T01K441_A65ArtCod, T01K441_A4058CCFColNom, T01K441_A4059CCFColNum
            }
            , new Object[] {
            T01K442_A396EmprCod, T01K442_A252CliCod, T01K442_A65ArtCod, T01K442_A1177Dibujo, T01K442_A1790DibIntCod
            }
            , new Object[] {
            T01K443_A396EmprCod, T01K443_A252CliCod, T01K443_A65ArtCod, T01K443_A1080LinPre
            }
            , new Object[] {
            T01K444_A396EmprCod, T01K444_A3814PePCod
            }
            , new Object[] {
            T01K445_A396EmprCod, T01K445_A3413OpeManCod, T01K445_A3430PreManNMt, T01K445_A252CliCod, T01K445_A65ArtCod
            }
            , new Object[] {
            T01K446_A396EmprCod, T01K446_A3415ParManNum
            }
            , new Object[] {
            T01K447_A396EmprCod, T01K447_A3331LanBroCod, T01K447_A3333LanBroLin
            }
            , new Object[] {
            T01K448_A396EmprCod, T01K448_A252CliCod, T01K448_A65ArtCod, T01K448_A3319ArtCapKgs
            }
            , new Object[] {
            T01K449_A396EmprCod, T01K449_A252CliCod, T01K449_A65ArtCod, T01K449_A3288CCalCod
            }
            , new Object[] {
            T01K450_A396EmprCod, T01K450_A252CliCod, T01K450_A65ArtCod, T01K450_A3033CCCod
            }
            , new Object[] {
            T01K451_A396EmprCod, T01K451_A252CliCod, T01K451_A65ArtCod, T01K451_A2937RecIntCod
            }
            , new Object[] {
            T01K452_A396EmprCod, T01K452_A252CliCod, T01K452_A65ArtCod, T01K452_A2931Limite2
            }
            , new Object[] {
            T01K453_A396EmprCod, T01K453_A252CliCod, T01K453_A65ArtCod, T01K453_A71ArtEstAny, T01K453_A2756ArtEstSer
            }
            , new Object[] {
            T01K454_A396EmprCod, T01K454_A252CliCod, T01K454_A1504CliProCod, T01K454_A65ArtCod
            }
            , new Object[] {
            T01K455_A396EmprCod, T01K455_A252CliCod, T01K455_A65ArtCod, T01K455_A598LinRec
            }
            , new Object[] {
            T01K456_A396EmprCod, T01K456_A252CliCod, T01K456_A65ArtCod, T01K456_A831TipColCod
            }
            , new Object[] {
            T01K457_A396EmprCod, T01K457_A252CliCod, T01K457_A65ArtCod, T01K457_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            T01K459_A396EmprCod, T01K459_A252CliCod, T01K459_A65ArtCod
            }
            , new Object[] {
            T01K460_A6964Mat_obs, T01K460_n6964Mat_obs, T01K460_A252CliCod, T01K460_A65ArtCod, T01K460_A6954Mat_lin, T01K460_A6955Mat_Estr, T01K460_n6955Mat_Estr, T01K460_A6956Mat_Mate, T01K460_n6956Mat_Mate, T01K460_A6957Mat_Tors,
            T01K460_n6957Mat_Tors, T01K460_A6958Mat_NomCol, T01K460_n6958Mat_NomCol, T01K460_A6959Mat_NumCol, T01K460_n6959Mat_NumCol, T01K460_A6960Mat_ProvN, T01K460_n6960Mat_ProvN, T01K460_A6961Mat_Lote, T01K460_n6961Mat_Lote, T01K460_A6962Mat_Porc,
            T01K460_n6962Mat_Porc, T01K460_A6963Mat_LM, T01K460_n6963Mat_LM, T01K460_A12354Mat_Lu, T01K460_n12354Mat_Lu, T01K460_A12355Mat_NE, T01K460_n12355Mat_NE, T01K460_A12356Mat_Dsc, T01K460_n12356Mat_Dsc, T01K460_A12357Mat_Color,
            T01K460_n12357Mat_Color, T01K460_A12358Mat_NAlim, T01K460_A396EmprCod
            }
            , new Object[] {
            T01K461_A396EmprCod, T01K461_A252CliCod, T01K461_A65ArtCod, T01K461_A6954Mat_lin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01K465_A396EmprCod, T01K465_A252CliCod, T01K465_A65ArtCod, T01K465_A6954Mat_lin
            }
            , new Object[] {
            T01K466_A407EmprNom, T01K466_n407EmprNom
            }
            , new Object[] {
            T01K467_A279CliNom
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
   private short Z6952Mat_UltL ;
   private short O6952Mat_UltL ;
   private short Z6954Mat_lin ;
   private short nRcdDeleted_984 ;
   private short nRcdExists_984 ;
   private short nIsMod_984 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A6952Mat_UltL ;
   private short nBlankRcdCount984 ;
   private short RcdFound984 ;
   private short B6952Mat_UltL ;
   private short nBlankRcdUsr984 ;
   private short s6952Mat_UltL ;
   private short A6954Mat_lin ;
   private short RcdFound10 ;
   private short nIsDirty_10 ;
   private short nIsDirty_984 ;
   private short i6952Mat_UltL ;
   private short ZZ6952Mat_UltL ;
   private short ZO6952Mat_UltL ;
   private int wcpOA252CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_65 ;
   private int nGXsfl_65_idx=1 ;
   private int Z6959Mat_NumCol ;
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
   private int edtMat_UltL_Enabled ;
   private int edtMat_Maq_Enabled ;
   private int edtMat_ObsG_Enabled ;
   private int edtavnRcdDeleted_984_Enabled ;
   private int edtMat_lin_Enabled ;
   private int edtMat_Estr_Enabled ;
   private int edtMat_Mate_Enabled ;
   private int edtMat_Tors_Enabled ;
   private int edtMat_NomCol_Enabled ;
   private int edtMat_NumCol_Enabled ;
   private int edtMat_ProvN_Enabled ;
   private int edtMat_Lote_Enabled ;
   private int edtMat_Porc_Enabled ;
   private int edtMat_LM_Enabled ;
   private int edtMat_obs_Enabled ;
   private int edtMat_Lu_Enabled ;
   private int edtMat_NE_Enabled ;
   private int edtMat_Dsc_Enabled ;
   private int edtMat_Color_Enabled ;
   private int edtMat_NAlim_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A6959Mat_NumCol ;
   private int GX_JID ;
   private int GXv_int2[] ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtMat_lin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtMat_ObsG_Backcolor ;
   private int edtMat_Maq_Backcolor ;
   private int edtMat_UltL_Backcolor ;
   private int edtArtDsc_Backcolor ;
   private int edtArtCod_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z6962Mat_Porc ;
   private java.math.BigDecimal Z6963Mat_LM ;
   private java.math.BigDecimal Z12354Mat_Lu ;
   private java.math.BigDecimal A6962Mat_Porc ;
   private java.math.BigDecimal A6963Mat_LM ;
   private java.math.BigDecimal A12354Mat_Lu ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA65ArtCod ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z69ArtDsc ;
   private String Z6953Mat_Maq ;
   private String Z6955Mat_Estr ;
   private String Z6956Mat_Mate ;
   private String Z6957Mat_Tors ;
   private String Z6958Mat_NomCol ;
   private String Z6960Mat_ProvN ;
   private String Z6961Mat_Lote ;
   private String Z12355Mat_NE ;
   private String Z12357Mat_Color ;
   private String Z12358Mat_NAlim ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtArtDsc_Internalname ;
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
   private String edtMat_UltL_Internalname ;
   private String edtMat_UltL_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtMat_Maq_Internalname ;
   private String A6953Mat_Maq ;
   private String edtMat_Maq_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtMat_ObsG_Internalname ;
   private String sMode984 ;
   private String edtavnRcdDeleted_984_Internalname ;
   private String edtMat_lin_Internalname ;
   private String edtMat_Estr_Internalname ;
   private String edtMat_Mate_Internalname ;
   private String edtMat_Tors_Internalname ;
   private String edtMat_NomCol_Internalname ;
   private String edtMat_NumCol_Internalname ;
   private String edtMat_ProvN_Internalname ;
   private String edtMat_Lote_Internalname ;
   private String edtMat_Porc_Internalname ;
   private String edtMat_LM_Internalname ;
   private String edtMat_obs_Internalname ;
   private String edtMat_Lu_Internalname ;
   private String edtMat_NE_Internalname ;
   private String edtMat_Dsc_Internalname ;
   private String edtMat_Color_Internalname ;
   private String edtMat_NAlim_Internalname ;
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
   private String sMode10 ;
   private String GXCCtl ;
   private String A6955Mat_Estr ;
   private String A6956Mat_Mate ;
   private String A6957Mat_Tors ;
   private String A6958Mat_NomCol ;
   private String A6960Mat_ProvN ;
   private String A6961Mat_Lote ;
   private String A12355Mat_NE ;
   private String A12357Mat_Color ;
   private String A12358Mat_NAlim ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String GXv_char3[] ;
   private String GXv_char1[] ;
   private String sGXsfl_65_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_984_Jsonclick ;
   private String edtMat_lin_Jsonclick ;
   private String edtMat_Estr_Jsonclick ;
   private String edtMat_Mate_Jsonclick ;
   private String edtMat_Tors_Jsonclick ;
   private String edtMat_NomCol_Jsonclick ;
   private String edtMat_NumCol_Jsonclick ;
   private String edtMat_ProvN_Jsonclick ;
   private String edtMat_Lote_Jsonclick ;
   private String edtMat_Porc_Jsonclick ;
   private String edtMat_LM_Jsonclick ;
   private String edtMat_obs_Jsonclick ;
   private String edtMat_Lu_Jsonclick ;
   private String edtMat_NE_Jsonclick ;
   private String edtMat_Dsc_Jsonclick ;
   private String edtMat_Color_Jsonclick ;
   private String edtMat_NAlim_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ69ArtDsc ;
   private String ZZ6953Mat_Maq ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean n65ArtCod ;
   private boolean wbErr ;
   private boolean n6952Mat_UltL ;
   private boolean bGXsfl_65_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n69ArtDsc ;
   private boolean n6953Mat_Maq ;
   private boolean n12353Mat_ObsG ;
   private boolean n6964Mat_obs ;
   private boolean n6955Mat_Estr ;
   private boolean n6956Mat_Mate ;
   private boolean n6957Mat_Tors ;
   private boolean n6958Mat_NomCol ;
   private boolean n6959Mat_NumCol ;
   private boolean n6960Mat_ProvN ;
   private boolean n6961Mat_Lote ;
   private boolean n6962Mat_Porc ;
   private boolean n6963Mat_LM ;
   private boolean n12354Mat_Lu ;
   private boolean n12355Mat_NE ;
   private boolean n12356Mat_Dsc ;
   private boolean n12357Mat_Color ;
   private boolean Gx_longc ;
   private String A6964Mat_obs ;
   private String Z6964Mat_obs ;
   private String Z12353Mat_ObsG ;
   private String Z12356Mat_Dsc ;
   private String A12353Mat_ObsG ;
   private String A12356Mat_Dsc ;
   private String ZZ12353Mat_ObsG ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01K46_A407EmprNom ;
   private boolean[] T01K46_n407EmprNom ;
   private String[] T01K47_A279CliNom ;
   private String[] T01K48_A65ArtCod ;
   private boolean[] T01K48_n65ArtCod ;
   private String[] T01K48_A407EmprNom ;
   private boolean[] T01K48_n407EmprNom ;
   private String[] T01K48_A279CliNom ;
   private String[] T01K48_A69ArtDsc ;
   private boolean[] T01K48_n69ArtDsc ;
   private short[] T01K48_A6952Mat_UltL ;
   private boolean[] T01K48_n6952Mat_UltL ;
   private String[] T01K48_A6953Mat_Maq ;
   private boolean[] T01K48_n6953Mat_Maq ;
   private String[] T01K48_A12353Mat_ObsG ;
   private boolean[] T01K48_n12353Mat_ObsG ;
   private String[] T01K48_A396EmprCod ;
   private int[] T01K48_A252CliCod ;
   private boolean[] T01K48_n252CliCod ;
   private String[] T01K49_A396EmprCod ;
   private int[] T01K49_A252CliCod ;
   private boolean[] T01K49_n252CliCod ;
   private String[] T01K49_A65ArtCod ;
   private boolean[] T01K49_n65ArtCod ;
   private String[] T01K45_A65ArtCod ;
   private boolean[] T01K45_n65ArtCod ;
   private String[] T01K45_A69ArtDsc ;
   private boolean[] T01K45_n69ArtDsc ;
   private short[] T01K45_A6952Mat_UltL ;
   private boolean[] T01K45_n6952Mat_UltL ;
   private String[] T01K45_A6953Mat_Maq ;
   private boolean[] T01K45_n6953Mat_Maq ;
   private String[] T01K45_A12353Mat_ObsG ;
   private boolean[] T01K45_n12353Mat_ObsG ;
   private String[] T01K45_A396EmprCod ;
   private int[] T01K45_A252CliCod ;
   private boolean[] T01K45_n252CliCod ;
   private String[] T01K410_A396EmprCod ;
   private int[] T01K410_A252CliCod ;
   private boolean[] T01K410_n252CliCod ;
   private String[] T01K410_A65ArtCod ;
   private boolean[] T01K410_n65ArtCod ;
   private String[] T01K411_A396EmprCod ;
   private int[] T01K411_A252CliCod ;
   private boolean[] T01K411_n252CliCod ;
   private String[] T01K411_A65ArtCod ;
   private boolean[] T01K411_n65ArtCod ;
   private String[] T01K44_A65ArtCod ;
   private boolean[] T01K44_n65ArtCod ;
   private String[] T01K44_A69ArtDsc ;
   private boolean[] T01K44_n69ArtDsc ;
   private short[] T01K44_A6952Mat_UltL ;
   private boolean[] T01K44_n6952Mat_UltL ;
   private String[] T01K44_A6953Mat_Maq ;
   private boolean[] T01K44_n6953Mat_Maq ;
   private String[] T01K44_A12353Mat_ObsG ;
   private boolean[] T01K44_n12353Mat_ObsG ;
   private String[] T01K44_A396EmprCod ;
   private int[] T01K44_A252CliCod ;
   private boolean[] T01K44_n252CliCod ;
   private String[] T01K415_A396EmprCod ;
   private int[] T01K415_A252CliCod ;
   private boolean[] T01K415_n252CliCod ;
   private String[] T01K415_A65ArtCod ;
   private boolean[] T01K415_n65ArtCod ;
   private byte[] T01K415_A499GrpFamCod ;
   private String[] T01K416_A396EmprCod ;
   private int[] T01K416_A252CliCod ;
   private boolean[] T01K416_n252CliCod ;
   private String[] T01K416_A12814ARTConID ;
   private String[] T01K416_A65ArtCod ;
   private boolean[] T01K416_n65ArtCod ;
   private String[] T01K417_A396EmprCod ;
   private int[] T01K417_A252CliCod ;
   private boolean[] T01K417_n252CliCod ;
   private String[] T01K417_A65ArtCod ;
   private boolean[] T01K417_n65ArtCod ;
   private byte[] T01K417_A12363SocInt ;
   private String[] T01K418_A396EmprCod ;
   private java.util.Date[] T01K418_A4929Inc_Dia ;
   private short[] T01K418_A5728JBCLLin ;
   private String[] T01K419_A396EmprCod ;
   private int[] T01K419_A252CliCod ;
   private boolean[] T01K419_n252CliCod ;
   private String[] T01K419_A5809MMezCod ;
   private String[] T01K419_A65ArtCod ;
   private boolean[] T01K419_n65ArtCod ;
   private String[] T01K420_A396EmprCod ;
   private int[] T01K420_A252CliCod ;
   private boolean[] T01K420_n252CliCod ;
   private String[] T01K420_A5234MezCod ;
   private byte[] T01K420_A5240MezLin ;
   private String[] T01K421_A396EmprCod ;
   private int[] T01K421_A252CliCod ;
   private boolean[] T01K421_n252CliCod ;
   private String[] T01K421_A65ArtCod ;
   private boolean[] T01K421_n65ArtCod ;
   private int[] T01K421_A4116estreclim ;
   private String[] T01K422_A396EmprCod ;
   private int[] T01K422_A252CliCod ;
   private boolean[] T01K422_n252CliCod ;
   private String[] T01K422_A65ArtCod ;
   private boolean[] T01K422_n65ArtCod ;
   private String[] T01K422_A4061EstNomCol ;
   private String[] T01K423_A396EmprCod ;
   private String[] T01K423_A9705ErpNped ;
   private short[] T01K423_A8652ErpLin ;
   private String[] T01K424_A396EmprCod ;
   private int[] T01K424_A252CliCod ;
   private boolean[] T01K424_n252CliCod ;
   private String[] T01K424_A65ArtCod ;
   private boolean[] T01K424_n65ArtCod ;
   private String[] T01K424_A7266CAAqP ;
   private String[] T01K425_A396EmprCod ;
   private int[] T01K425_A252CliCod ;
   private boolean[] T01K425_n252CliCod ;
   private String[] T01K425_A65ArtCod ;
   private boolean[] T01K425_n65ArtCod ;
   private java.util.Date[] T01K425_A11084H_DiaA ;
   private String[] T01K426_A396EmprCod ;
   private int[] T01K426_A252CliCod ;
   private boolean[] T01K426_n252CliCod ;
   private String[] T01K426_A65ArtCod ;
   private boolean[] T01K426_n65ArtCod ;
   private byte[] T01K426_A10972Int_cod ;
   private String[] T01K427_A396EmprCod ;
   private int[] T01K427_A252CliCod ;
   private boolean[] T01K427_n252CliCod ;
   private String[] T01K427_A65ArtCod ;
   private boolean[] T01K427_n65ArtCod ;
   private String[] T01K427_A10577Pg_Procod ;
   private String[] T01K428_A396EmprCod ;
   private int[] T01K428_A252CliCod ;
   private boolean[] T01K428_n252CliCod ;
   private String[] T01K428_A65ArtCod ;
   private boolean[] T01K428_n65ArtCod ;
   private String[] T01K428_A10272Hz_cod ;
   private String[] T01K429_A396EmprCod ;
   private int[] T01K429_A252CliCod ;
   private boolean[] T01K429_n252CliCod ;
   private String[] T01K429_A65ArtCod ;
   private boolean[] T01K429_n65ArtCod ;
   private String[] T01K429_A10041ArtSH ;
   private String[] T01K430_A396EmprCod ;
   private int[] T01K430_A252CliCod ;
   private boolean[] T01K430_n252CliCod ;
   private String[] T01K430_A65ArtCod ;
   private boolean[] T01K430_n65ArtCod ;
   private String[] T01K430_A8427TipoCt ;
   private int[] T01K430_A8428CapMxMq ;
   private String[] T01K431_A396EmprCod ;
   private int[] T01K431_A252CliCod ;
   private boolean[] T01K431_n252CliCod ;
   private String[] T01K431_A65ArtCod ;
   private boolean[] T01K431_n65ArtCod ;
   private short[] T01K431_A8342CodPred ;
   private String[] T01K432_A396EmprCod ;
   private int[] T01K432_A252CliCod ;
   private boolean[] T01K432_n252CliCod ;
   private String[] T01K432_A65ArtCod ;
   private boolean[] T01K432_n65ArtCod ;
   private String[] T01K432_A8089ArtcodTj ;
   private String[] T01K433_A396EmprCod ;
   private int[] T01K433_A252CliCod ;
   private boolean[] T01K433_n252CliCod ;
   private String[] T01K433_A65ArtCod ;
   private boolean[] T01K433_n65ArtCod ;
   private String[] T01K433_A7956Mq_CodM ;
   private String[] T01K434_A396EmprCod ;
   private int[] T01K434_A252CliCod ;
   private boolean[] T01K434_n252CliCod ;
   private String[] T01K434_A65ArtCod ;
   private boolean[] T01K434_n65ArtCod ;
   private short[] T01K434_A7949Par_Art ;
   private String[] T01K435_A396EmprCod ;
   private int[] T01K435_A252CliCod ;
   private boolean[] T01K435_n252CliCod ;
   private String[] T01K435_A65ArtCod ;
   private boolean[] T01K435_n65ArtCod ;
   private short[] T01K435_A7135Lin_fast ;
   private String[] T01K436_A396EmprCod ;
   private String[] T01K436_A602MaqCod ;
   private int[] T01K436_A6078MaqCliCod ;
   private String[] T01K436_A6079MaqArtCod ;
   private String[] T01K437_A396EmprCod ;
   private int[] T01K437_A252CliCod ;
   private boolean[] T01K437_n252CliCod ;
   private String[] T01K437_A65ArtCod ;
   private boolean[] T01K437_n65ArtCod ;
   private short[] T01K437_A5382EstCatAny ;
   private String[] T01K437_A5383EstCatSer ;
   private short[] T01K437_A5384EstCatTip ;
   private String[] T01K438_A396EmprCod ;
   private int[] T01K438_A252CliCod ;
   private boolean[] T01K438_n252CliCod ;
   private String[] T01K438_A65ArtCod ;
   private boolean[] T01K438_n65ArtCod ;
   private String[] T01K438_A4658MdlCod ;
   private String[] T01K439_A396EmprCod ;
   private int[] T01K439_A252CliCod ;
   private boolean[] T01K439_n252CliCod ;
   private String[] T01K439_A4175WebEmpCod ;
   private String[] T01K440_A396EmprCod ;
   private int[] T01K440_A252CliCod ;
   private boolean[] T01K440_n252CliCod ;
   private String[] T01K440_A4079WEBDISCOD ;
   private String[] T01K441_A396EmprCod ;
   private int[] T01K441_A252CliCod ;
   private boolean[] T01K441_n252CliCod ;
   private String[] T01K441_A65ArtCod ;
   private boolean[] T01K441_n65ArtCod ;
   private String[] T01K441_A4058CCFColNom ;
   private int[] T01K441_A4059CCFColNum ;
   private String[] T01K442_A396EmprCod ;
   private int[] T01K442_A252CliCod ;
   private boolean[] T01K442_n252CliCod ;
   private String[] T01K442_A65ArtCod ;
   private boolean[] T01K442_n65ArtCod ;
   private String[] T01K442_A1177Dibujo ;
   private int[] T01K442_A1790DibIntCod ;
   private String[] T01K443_A396EmprCod ;
   private int[] T01K443_A252CliCod ;
   private boolean[] T01K443_n252CliCod ;
   private String[] T01K443_A65ArtCod ;
   private boolean[] T01K443_n65ArtCod ;
   private byte[] T01K443_A1080LinPre ;
   private String[] T01K444_A396EmprCod ;
   private long[] T01K444_A3814PePCod ;
   private String[] T01K445_A396EmprCod ;
   private byte[] T01K445_A3413OpeManCod ;
   private String[] T01K445_A3430PreManNMt ;
   private int[] T01K445_A252CliCod ;
   private boolean[] T01K445_n252CliCod ;
   private String[] T01K445_A65ArtCod ;
   private boolean[] T01K445_n65ArtCod ;
   private String[] T01K446_A396EmprCod ;
   private int[] T01K446_A3415ParManNum ;
   private String[] T01K447_A396EmprCod ;
   private byte[] T01K447_A3331LanBroCod ;
   private short[] T01K447_A3333LanBroLin ;
   private String[] T01K448_A396EmprCod ;
   private int[] T01K448_A252CliCod ;
   private boolean[] T01K448_n252CliCod ;
   private String[] T01K448_A65ArtCod ;
   private boolean[] T01K448_n65ArtCod ;
   private java.math.BigDecimal[] T01K448_A3319ArtCapKgs ;
   private String[] T01K449_A396EmprCod ;
   private int[] T01K449_A252CliCod ;
   private boolean[] T01K449_n252CliCod ;
   private String[] T01K449_A65ArtCod ;
   private boolean[] T01K449_n65ArtCod ;
   private String[] T01K449_A3288CCalCod ;
   private String[] T01K450_A396EmprCod ;
   private int[] T01K450_A252CliCod ;
   private boolean[] T01K450_n252CliCod ;
   private String[] T01K450_A65ArtCod ;
   private boolean[] T01K450_n65ArtCod ;
   private String[] T01K450_A3033CCCod ;
   private String[] T01K451_A396EmprCod ;
   private int[] T01K451_A252CliCod ;
   private boolean[] T01K451_n252CliCod ;
   private String[] T01K451_A65ArtCod ;
   private boolean[] T01K451_n65ArtCod ;
   private byte[] T01K451_A2937RecIntCod ;
   private String[] T01K452_A396EmprCod ;
   private int[] T01K452_A252CliCod ;
   private boolean[] T01K452_n252CliCod ;
   private String[] T01K452_A65ArtCod ;
   private boolean[] T01K452_n65ArtCod ;
   private short[] T01K452_A2931Limite2 ;
   private String[] T01K453_A396EmprCod ;
   private int[] T01K453_A252CliCod ;
   private boolean[] T01K453_n252CliCod ;
   private String[] T01K453_A65ArtCod ;
   private boolean[] T01K453_n65ArtCod ;
   private short[] T01K453_A71ArtEstAny ;
   private String[] T01K453_A2756ArtEstSer ;
   private String[] T01K454_A396EmprCod ;
   private int[] T01K454_A252CliCod ;
   private boolean[] T01K454_n252CliCod ;
   private String[] T01K454_A1504CliProCod ;
   private String[] T01K454_A65ArtCod ;
   private boolean[] T01K454_n65ArtCod ;
   private String[] T01K455_A396EmprCod ;
   private int[] T01K455_A252CliCod ;
   private boolean[] T01K455_n252CliCod ;
   private String[] T01K455_A65ArtCod ;
   private boolean[] T01K455_n65ArtCod ;
   private byte[] T01K455_A598LinRec ;
   private String[] T01K456_A396EmprCod ;
   private int[] T01K456_A252CliCod ;
   private boolean[] T01K456_n252CliCod ;
   private String[] T01K456_A65ArtCod ;
   private boolean[] T01K456_n65ArtCod ;
   private byte[] T01K456_A831TipColCod ;
   private String[] T01K457_A396EmprCod ;
   private int[] T01K457_A252CliCod ;
   private boolean[] T01K457_n252CliCod ;
   private String[] T01K457_A65ArtCod ;
   private boolean[] T01K457_n65ArtCod ;
   private String[] T01K457_A758ProCod ;
   private String[] T01K459_A396EmprCod ;
   private int[] T01K459_A252CliCod ;
   private boolean[] T01K459_n252CliCod ;
   private String[] T01K459_A65ArtCod ;
   private boolean[] T01K459_n65ArtCod ;
   private String[] T01K460_A6964Mat_obs ;
   private boolean[] T01K460_n6964Mat_obs ;
   private int[] T01K460_A252CliCod ;
   private boolean[] T01K460_n252CliCod ;
   private String[] T01K460_A65ArtCod ;
   private boolean[] T01K460_n65ArtCod ;
   private short[] T01K460_A6954Mat_lin ;
   private String[] T01K460_A6955Mat_Estr ;
   private boolean[] T01K460_n6955Mat_Estr ;
   private String[] T01K460_A6956Mat_Mate ;
   private boolean[] T01K460_n6956Mat_Mate ;
   private String[] T01K460_A6957Mat_Tors ;
   private boolean[] T01K460_n6957Mat_Tors ;
   private String[] T01K460_A6958Mat_NomCol ;
   private boolean[] T01K460_n6958Mat_NomCol ;
   private int[] T01K460_A6959Mat_NumCol ;
   private boolean[] T01K460_n6959Mat_NumCol ;
   private String[] T01K460_A6960Mat_ProvN ;
   private boolean[] T01K460_n6960Mat_ProvN ;
   private String[] T01K460_A6961Mat_Lote ;
   private boolean[] T01K460_n6961Mat_Lote ;
   private java.math.BigDecimal[] T01K460_A6962Mat_Porc ;
   private boolean[] T01K460_n6962Mat_Porc ;
   private java.math.BigDecimal[] T01K460_A6963Mat_LM ;
   private boolean[] T01K460_n6963Mat_LM ;
   private java.math.BigDecimal[] T01K460_A12354Mat_Lu ;
   private boolean[] T01K460_n12354Mat_Lu ;
   private String[] T01K460_A12355Mat_NE ;
   private boolean[] T01K460_n12355Mat_NE ;
   private String[] T01K460_A12356Mat_Dsc ;
   private boolean[] T01K460_n12356Mat_Dsc ;
   private String[] T01K460_A12357Mat_Color ;
   private boolean[] T01K460_n12357Mat_Color ;
   private String[] T01K460_A12358Mat_NAlim ;
   private String[] T01K460_A396EmprCod ;
   private String[] T01K461_A396EmprCod ;
   private int[] T01K461_A252CliCod ;
   private boolean[] T01K461_n252CliCod ;
   private String[] T01K461_A65ArtCod ;
   private boolean[] T01K461_n65ArtCod ;
   private short[] T01K461_A6954Mat_lin ;
   private String[] T01K43_A6964Mat_obs ;
   private boolean[] T01K43_n6964Mat_obs ;
   private int[] T01K43_A252CliCod ;
   private boolean[] T01K43_n252CliCod ;
   private String[] T01K43_A65ArtCod ;
   private boolean[] T01K43_n65ArtCod ;
   private short[] T01K43_A6954Mat_lin ;
   private String[] T01K43_A6955Mat_Estr ;
   private boolean[] T01K43_n6955Mat_Estr ;
   private String[] T01K43_A6956Mat_Mate ;
   private boolean[] T01K43_n6956Mat_Mate ;
   private String[] T01K43_A6957Mat_Tors ;
   private boolean[] T01K43_n6957Mat_Tors ;
   private String[] T01K43_A6958Mat_NomCol ;
   private boolean[] T01K43_n6958Mat_NomCol ;
   private int[] T01K43_A6959Mat_NumCol ;
   private boolean[] T01K43_n6959Mat_NumCol ;
   private String[] T01K43_A6960Mat_ProvN ;
   private boolean[] T01K43_n6960Mat_ProvN ;
   private String[] T01K43_A6961Mat_Lote ;
   private boolean[] T01K43_n6961Mat_Lote ;
   private java.math.BigDecimal[] T01K43_A6962Mat_Porc ;
   private boolean[] T01K43_n6962Mat_Porc ;
   private java.math.BigDecimal[] T01K43_A6963Mat_LM ;
   private boolean[] T01K43_n6963Mat_LM ;
   private java.math.BigDecimal[] T01K43_A12354Mat_Lu ;
   private boolean[] T01K43_n12354Mat_Lu ;
   private String[] T01K43_A12355Mat_NE ;
   private boolean[] T01K43_n12355Mat_NE ;
   private String[] T01K43_A12356Mat_Dsc ;
   private boolean[] T01K43_n12356Mat_Dsc ;
   private String[] T01K43_A12357Mat_Color ;
   private boolean[] T01K43_n12357Mat_Color ;
   private String[] T01K43_A12358Mat_NAlim ;
   private String[] T01K43_A396EmprCod ;
   private String[] T01K42_A6964Mat_obs ;
   private boolean[] T01K42_n6964Mat_obs ;
   private int[] T01K42_A252CliCod ;
   private boolean[] T01K42_n252CliCod ;
   private String[] T01K42_A65ArtCod ;
   private boolean[] T01K42_n65ArtCod ;
   private short[] T01K42_A6954Mat_lin ;
   private String[] T01K42_A6955Mat_Estr ;
   private boolean[] T01K42_n6955Mat_Estr ;
   private String[] T01K42_A6956Mat_Mate ;
   private boolean[] T01K42_n6956Mat_Mate ;
   private String[] T01K42_A6957Mat_Tors ;
   private boolean[] T01K42_n6957Mat_Tors ;
   private String[] T01K42_A6958Mat_NomCol ;
   private boolean[] T01K42_n6958Mat_NomCol ;
   private int[] T01K42_A6959Mat_NumCol ;
   private boolean[] T01K42_n6959Mat_NumCol ;
   private String[] T01K42_A6960Mat_ProvN ;
   private boolean[] T01K42_n6960Mat_ProvN ;
   private String[] T01K42_A6961Mat_Lote ;
   private boolean[] T01K42_n6961Mat_Lote ;
   private java.math.BigDecimal[] T01K42_A6962Mat_Porc ;
   private boolean[] T01K42_n6962Mat_Porc ;
   private java.math.BigDecimal[] T01K42_A6963Mat_LM ;
   private boolean[] T01K42_n6963Mat_LM ;
   private java.math.BigDecimal[] T01K42_A12354Mat_Lu ;
   private boolean[] T01K42_n12354Mat_Lu ;
   private String[] T01K42_A12355Mat_NE ;
   private boolean[] T01K42_n12355Mat_NE ;
   private String[] T01K42_A12356Mat_Dsc ;
   private boolean[] T01K42_n12356Mat_Dsc ;
   private String[] T01K42_A12357Mat_Color ;
   private boolean[] T01K42_n12357Mat_Color ;
   private String[] T01K42_A12358Mat_NAlim ;
   private String[] T01K42_A396EmprCod ;
   private String[] T01K465_A396EmprCod ;
   private int[] T01K465_A252CliCod ;
   private boolean[] T01K465_n252CliCod ;
   private String[] T01K465_A65ArtCod ;
   private boolean[] T01K465_n65ArtCod ;
   private short[] T01K465_A6954Mat_lin ;
   private String[] T01K466_A407EmprNom ;
   private boolean[] T01K466_n407EmprNom ;
   private String[] T01K467_A279CliNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tartfich__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tartfich__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tartfich__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tartfich__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tartfich__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01K42", "SELECT Mat_obs, CliCod, ArtCod, Mat_lin, Mat_Estr, Mat_Mate, Mat_Tors, Mat_NomCol, Mat_NumCol, Mat_ProvN, Mat_Lote, Mat_Porc, Mat_LM, Mat_Lu, Mat_NE, Mat_Dsc, Mat_Color, Mat_NAlim, EmprCod FROM TXPARTMAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mat_lin = ?  FOR UPDATE OF Mat_Estr, Mat_Mate, Mat_Tors, Mat_NomCol, Mat_NumCol, Mat_ProvN, Mat_Lote, Mat_Porc, Mat_LM, Mat_obs, Mat_Lu, Mat_NE, Mat_Dsc, Mat_Color, Mat_NAlim NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01K43", "SELECT Mat_obs, CliCod, ArtCod, Mat_lin, Mat_Estr, Mat_Mate, Mat_Tors, Mat_NomCol, Mat_NumCol, Mat_ProvN, Mat_Lote, Mat_Porc, Mat_LM, Mat_Lu, Mat_NE, Mat_Dsc, Mat_Color, Mat_NAlim, EmprCod FROM TXPARTMAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mat_lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01K44", "SELECT ArtCod, ArtDsc, Mat_UltL, Mat_Maq, Mat_ObsG, EmprCod, CliCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?  FOR UPDATE OF ArtDsc, Mat_UltL, Mat_Maq, Mat_ObsG NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K45", "SELECT ArtCod, ArtDsc, Mat_UltL, Mat_Maq, Mat_ObsG, EmprCod, CliCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K46", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K47", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K48", "SELECT /*+ FIRST_ROWS(1) */ TM1.ArtCod, T2.EmprNom, T3.CliNom, TM1.ArtDsc, TM1.Mat_UltL, TM1.Mat_Maq, TM1.Mat_ObsG, TM1.EmprCod, TM1.CliCod FROM ((TXPARTICU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K49", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K410", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K411", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01K412", "INSERT INTO TXPARTICU(ArtCod, ArtDsc, Mat_UltL, Mat_Maq, Mat_ObsG, EmprCod, CliCod, ArtMat, TipArtCod, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtTipLar, ArtCorOri, ArtEncOri, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtObs, ArtObsFac, ArtPreKgm, ArtPreMtr, ArtPreDef, ULinRec, ArtNMtr, ArtPml, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoN, ArtRdoA, ArtNumTex1, ArtNumTex2, NumTexCod, ArtFacAbs, ArtCosBase, ArtPle2, ArtObsLon, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtPreCap, ArtAnu, ArtFecCre, ArtPrMEst, ULinPre, ClasCod, ArtPmPPza, ArtUsrCod, ArtFecMod, ArtPreUlAc, ArtPreUsrM, ArtPelAnh, ArtAcaAnh, ArtAcaMar, ArtAcaBak, ArtLotMaq, ArtCruMts, ArtCruKgs, ArtCruEnr, ArtLotPza, ArtLotMts, ArtLotKgs, ArtAcaFor, ArtRb, ArtValMtr, ArtCodExt, ArtComer, ClaTubCod, ClaBolCod, ArtRdoCru1, ArtRdoCru2, ArtLu, ArtFacTor, UltLinFT, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtBlo, ArtCla, CapKgs1, CapKgs2, CapKgs3, CapKgs4, CapKgs5, CapKgs6, CapKgs7, CapKgs8, CapKgs9, CapKgs10, ArtFabsH, ArtFabsT, ArtNProg, ArtVbd, ArtVbn, ArtAb, ArtObsGrm, ArtObsAnc, ArtCdb, ArtGalga, ArtPlatina, ArtPgd, ArtTh, Art_Cd, CapUsuM, CapFecM, Mat_UsuM, Mat_FecM, CapUsuA, CapFecA, ArtHilos, ArtPasad, ArtAncC, ArtGrm2C, ArtRdoC, ArtPreObs, ArtFacUti, ArtPreEst, ArtDefEst, ArtNumTip, ArtPreUnd, ArtMT, ArtTRabs, ArtKgMn, ArtElgAnc, ArtElgLar, ArtRdoCru, ArtEncLarg, ArtEncAnc, ArtObsOtra, ArtRdto4, Artdsc2, ArtgrComp, ArtKgspp, ArtPrepp, ArtActivo) VALUES(?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, ' ')", GX_NOMASK, "TXPARTICU")
         ,new UpdateCursor("T01K413", "UPDATE TXPARTICU SET ArtDsc=?, Mat_UltL=?, Mat_Maq=?, Mat_ObsG=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK, "TXPARTICU")
         ,new UpdateCursor("T01K414", "DELETE FROM TXPARTICU  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK, "TXPARTICU")
         ,new ForEachCursor("T01K415", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, GrpFamCod FROM TXPEstTa0 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K416", "SELECT * FROM (SELECT EmprCod, CliCod, ARTConID, ArtCod FROM TXPARTCo1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K417", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, SocInt FROM TXPSOCRAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K418", "SELECT * FROM (SELECT EmprCod, Inc_Dia, JBCLLin FROM TXPJBConL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K419", "SELECT * FROM (SELECT EmprCod, CliCod, MMezCod, ArtCod FROM TXPMEZCL1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K420", "SELECT * FROM (SELECT EmprCod, CliCod, MezCod, MezLin FROM TXPLMZCLA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K421", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, estreclim FROM TXPrecest WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K422", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, EstNomCol FROM TXPCESTAM WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K423", "SELECT * FROM (SELECT EmprCod, ErpNped, ErpLin FROM TXPCPEDCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K424", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CAAqP FROM TXPPCARC WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K425", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, H_DiaA FROM TXPHPREAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K426", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Int_cod FROM TXPINCINT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K427", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Pg_Procod FROM TXPPGCOLO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K428", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Hz_cod FROM TXPTR02JL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K429", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtSH FROM TXPCLATFA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K430", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipoCt, CapMxMq FROM TXPARTMQT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K431", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CodPred FROM TXPPVPNIT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K432", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtcodTj FROM TXPTEJART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K433", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mq_CodM FROM TXPTNART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K434", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Par_Art FROM TXPARTTEJ WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K435", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Lin_fast FROM TXPPARTIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K436", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCliCod = ? AND MaqArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K437", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip FROM TXPESTCAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K438", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, MdlCod FROM TXPModels WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K439", "SELECT * FROM (SELECT EmprCod, CliCod, WebEmpCod FROM TXPWEBEMP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K440", "SELECT * FROM (SELECT EmprCod, CliCod, WEBDISCOD FROM TXPWebDis WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K441", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum FROM TXPCCSeri WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K442", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Dibujo, DibIntCod FROM TXPCPRECO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K443", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinPre FROM TXPLINPRE WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K444", "SELECT * FROM (SELECT EmprCod, PePCod FROM TXPPedPro WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K445", "SELECT * FROM (SELECT EmprCod, OpeManCod, PreManNMt, CliCod, ArtCod FROM TXPPREMAN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K446", "SELECT * FROM (SELECT EmprCod, ParManNum FROM TXPPARMAN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K447", "SELECT * FROM (SELECT EmprCod, LanBroCod, LanBroLin FROM TXPLANBRL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K448", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtCapKgs FROM TXPPRECAP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K449", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCalCod FROM TXPPARSER WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K450", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCCod FROM TXPCCArt WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K451", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, RecIntCod FROM TXPARTINT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K452", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Limite2 FROM TXPRECARB WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K453", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer FROM TXPCESART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K454", "SELECT * FROM (SELECT EmprCod, CliCod, CliProCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K455", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinRec FROM TXPRECARG WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K456", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipColCod FROM TXPPRETCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K457", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01K458", "UPDATE TXPARTICU SET Mat_UltL=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK, "TXPARTICU")
         ,new ForEachCursor("T01K459", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K460", "SELECT Mat_obs, CliCod, ArtCod, Mat_lin, Mat_Estr, Mat_Mate, Mat_Tors, Mat_NomCol, Mat_NumCol, Mat_ProvN, Mat_Lote, Mat_Porc, Mat_LM, Mat_Lu, Mat_NE, Mat_Dsc, Mat_Color, Mat_NAlim, EmprCod FROM TXPARTMAT WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Mat_lin = ? ORDER BY EmprCod, CliCod, ArtCod, Mat_lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01K461", "SELECT EmprCod, CliCod, ArtCod, Mat_lin FROM TXPARTMAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mat_lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01K462", "INSERT INTO TXPARTMAT(CliCod, ArtCod, Mat_lin, Mat_Estr, Mat_Mate, Mat_Tors, Mat_NomCol, Mat_NumCol, Mat_ProvN, Mat_Lote, Mat_Porc, Mat_LM, Mat_obs, Mat_Lu, Mat_NE, Mat_Dsc, Mat_Color, Mat_NAlim, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPARTMAT")
         ,new UpdateCursor("T01K463", "UPDATE TXPARTMAT SET Mat_Estr=?, Mat_Mate=?, Mat_Tors=?, Mat_NomCol=?, Mat_NumCol=?, Mat_ProvN=?, Mat_Lote=?, Mat_Porc=?, Mat_LM=?, Mat_obs=?, Mat_Lu=?, Mat_NE=?, Mat_Dsc=?, Mat_Color=?, Mat_NAlim=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mat_lin = ?", GX_NOMASK, "TXPARTMAT")
         ,new UpdateCursor("T01K464", "DELETE FROM TXPARTMAT  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mat_lin = ?", GX_NOMASK, "TXPARTMAT")
         ,new ForEachCursor("T01K465", "SELECT EmprCod, CliCod, ArtCod, Mat_lin FROM TXPARTMAT WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, Mat_lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01K466", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01K467", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 40);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 30);
               ((String[]) buf[32])[0] = rslt.getString(19, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 40);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 30);
               ((String[]) buf[32])[0] = rslt.getString(19, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((int[]) buf[10])[0] = rslt.getInt(7);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((int[]) buf[10])[0] = rslt.getInt(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 3);
               ((int[]) buf[13])[0] = rslt.getInt(9);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
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
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 40);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 30);
               ((String[]) buf[32])[0] = rslt.getString(19, 3);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 65 :
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
               return;
            case 5 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 26);
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
                  stmt.setString(4, (String)parms[7], 20);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 200);
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
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
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
                  stmt.setVarchar(4, (String)parms[7], 200);
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
               stmt.setShort(4, ((Number) parms[5]).shortValue());
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
               stmt.setShort(3, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 20);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 40);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 13);
               }
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
                  stmt.setString(9, (String)parms[16], 40);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[18], 20);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(13, (String)parms[24]);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[28], 20);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[30], 200);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[32], 30);
               }
               stmt.setString(18, (String)parms[33], 30);
               stmt.setString(19, (String)parms[34], 3);
               return;
            case 61 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 20);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 40);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 13);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 40);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 20);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(10, (String)parms[19]);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 20);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 200);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 30);
               }
               stmt.setString(15, (String)parms[28], 30);
               stmt.setString(16, (String)parms[29], 3);
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(17, ((Number) parms[31]).intValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[33], 16);
               }
               stmt.setShort(19, ((Number) parms[34]).shortValue());
               return;
            case 62 :
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
            case 63 :
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
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 65 :
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

