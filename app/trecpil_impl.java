package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trecpil_impl extends GXDataArea
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
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A1504CliProCod = httpContext.GetPar( "CliProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
            A65ArtCod = httpContext.GetPar( "ArtCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A583IntCod = (byte)(GXutil.lval( httpContext.GetPar( "IntCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "RECARGOS", ""), (short)(0)) ;
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
      A1730MinPreULin = (byte)(GXutil.lval( httpContext.GetPar( "MinPreULin"))) ;
      n1730MinPreULin = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public trecpil_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trecpil_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trecpil_impl.class ));
   }

   public trecpil_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECPIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECPIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECPIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECPIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TRECPIL.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRECPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRECPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Proceso", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliProCod_Internalname, GXutil.rtrim( A1504CliProCod), GXutil.rtrim( localUtil.format( A1504CliProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliProCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRECPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRECPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Código Intensidad", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtIntCod_Internalname, GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtIntCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntCod_Jsonclick, 0, "", "", "", "", "", 1, edtIntCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRECPIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Ultma Linea Precios", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMinPreULin_Internalname, GXutil.ltrim( localUtil.ntoc( A1730MinPreULin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMinPreULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1730MinPreULin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1730MinPreULin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMinPreULin_Jsonclick, 0, "", "", "", "", "", 1, edtMinPreULin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRECPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRECPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Descripcion Articulo", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRECPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Descripción Intensidad", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtIntDsc_Internalname, GXutil.rtrim( A584IntDsc), GXutil.rtrim( localUtil.format( A584IntDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntDsc_Jsonclick, 0, "", "", "", "", "", 1, edtIntDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRECPIL.htm");
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
         nBlankRcdCount236 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_236 = (short)(1) ;
            scanStart5O236( ) ;
            while ( RcdFound236 != 0 )
            {
               init_level_properties236( ) ;
               getByPrimaryKey5O236( ) ;
               addRow5O236( ) ;
               scanNext5O236( ) ;
            }
            scanEnd5O236( ) ;
            nBlankRcdCount236 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B1730MinPreULin = A1730MinPreULin ;
         n1730MinPreULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
         standaloneNotModal5O236( ) ;
         standaloneModal5O236( ) ;
         sMode236 = Gx_mode ;
         while ( nGXsfl_65_idx < nRC_GXsfl_65 )
         {
            bGXsfl_65_Refreshing = true ;
            readRow5O236( ) ;
            edtavnRcdDeleted_236_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_236_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_236_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_236_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMinPreLin_Title = httpContext.cgiGet( "MINPRELIN_"+sGXsfl_65_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtMinPreLin_Internalname, "Title", edtMinPreLin_Title, !bGXsfl_65_Refreshing);
            edtMinPreLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MINPRELIN_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMinPreLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMinPreLin_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMinPreUni_Title = httpContext.cgiGet( "MINPREUNI_"+sGXsfl_65_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtMinPreUni_Internalname, "Title", edtMinPreUni_Title, !bGXsfl_65_Refreshing);
            edtMinPreUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MINPREUNI_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMinPreUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMinPreUni_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMaxPreUni_Title = httpContext.cgiGet( "MAXPREUNI_"+sGXsfl_65_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaxPreUni_Internalname, "Title", edtMaxPreUni_Title, !bGXsfl_65_Refreshing);
            edtMaxPreUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAXPREUNI_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaxPreUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaxPreUni_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMinPreKgm_Title = httpContext.cgiGet( "MINPREKGM_"+sGXsfl_65_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtMinPreKgm_Internalname, "Title", edtMinPreKgm_Title, !bGXsfl_65_Refreshing);
            edtMinPreKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MINPREKGM_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMinPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMinPreKgm_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMinPreMtr_Title = httpContext.cgiGet( "MINPREMTR_"+sGXsfl_65_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtMinPreMtr_Internalname, "Title", edtMinPreMtr_Title, !bGXsfl_65_Refreshing);
            edtMinPreMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MINPREMTR_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMinPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMinPreMtr_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            if ( ( nRcdExists_236 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal5O236( ) ;
            }
            sendRow5O236( ) ;
            bGXsfl_65_Refreshing = false ;
         }
         Gx_mode = sMode236 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1730MinPreULin = B1730MinPreULin ;
         n1730MinPreULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount236 = (short)(5) ;
         nRcdExists_236 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart5O236( ) ;
            while ( RcdFound236 != 0 )
            {
               sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_65236( ) ;
               init_level_properties236( ) ;
               standaloneNotModal5O236( ) ;
               getByPrimaryKey5O236( ) ;
               standaloneModal5O236( ) ;
               addRow5O236( ) ;
               scanNext5O236( ) ;
            }
            scanEnd5O236( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode236 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_65236( ) ;
      initAll5O236( ) ;
      init_level_properties236( ) ;
      B1730MinPreULin = A1730MinPreULin ;
      n1730MinPreULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
      nRcdExists_236 = (short)(0) ;
      nIsMod_236 = (short)(0) ;
      nRcdDeleted_236 = (short)(0) ;
      nBlankRcdCount236 = (short)(nBlankRcdUsr236+nBlankRcdCount236) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount236 > 0 )
      {
         standaloneNotModal5O236( ) ;
         standaloneModal5O236( ) ;
         addRow5O236( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMinPreUni_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount236 = (short)(nBlankRcdCount236-1) ;
      }
      Gx_mode = sMode236 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A1730MinPreULin = B1730MinPreULin ;
      n1730MinPreULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECPIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECPIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECPIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECPIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TRECPIL.htm");
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
      e115O2 ();
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
            Z1504CliProCod = httpContext.cgiGet( "Z1504CliProCod") ;
            Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
            Z583IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z583IntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1730MinPreULin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1730MinPreULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O1730MinPreULin = (byte)(localUtil.ctol( httpContext.cgiGet( "O1730MinPreULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_65 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_65"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV35Lit7 = httpContext.cgiGet( "vLIT7") ;
            AV36Lit8 = httpContext.cgiGet( "vLIT8") ;
            AV37Lit9 = httpContext.cgiGet( "vLIT9") ;
            AV20Lit10 = httpContext.cgiGet( "vLIT10") ;
            AV21Lit11 = httpContext.cgiGet( "vLIT11") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A1504CliProCod = httpContext.cgiGet( edtCliProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
            A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A583IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
            A1730MinPreULin = (byte)(localUtil.ctol( httpContext.cgiGet( edtMinPreULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1730MinPreULin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
            n69ArtDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
            A584IntDsc = httpContext.cgiGet( edtIntDsc_Internalname) ;
            n584IntDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
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
               A1504CliProCod = httpContext.GetPar( "CliProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
               A65ArtCod = httpContext.GetPar( "ArtCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A583IntCod = (byte)(GXutil.lval( httpContext.GetPar( "IntCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
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
                        e115O2 ();
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
            initAll5O213( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_236_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_236_Enabled), 5, 0), !bGXsfl_65_Refreshing);
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
      disableAttributes5O213( ) ;
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

   public void confirm_5O0( )
   {
      beforeValidate5O213( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls5O213( ) ;
         }
         else
         {
            checkExtendedTable5O213( ) ;
            if ( AnyError == 0 )
            {
               zm5O213( 13) ;
               zm5O213( 14) ;
               zm5O213( 15) ;
               zm5O213( 16) ;
            }
            closeExtendedTableCursors5O213( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode213 = Gx_mode ;
         confirm_5O236( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode213 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode213 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues5O0( ) ;
      }
   }

   public void confirm_5O236( )
   {
      s1730MinPreULin = O1730MinPreULin ;
      n1730MinPreULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRow5O236( ) ;
         if ( ( nRcdExists_236 != 0 ) || ( nIsMod_236 != 0 ) )
         {
            getKey5O236( ) ;
            if ( ( nRcdExists_236 == 0 ) && ( nRcdDeleted_236 == 0 ) )
            {
               if ( RcdFound236 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate5O236( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable5O236( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors5O236( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O1730MinPreULin = A1730MinPreULin ;
                     n1730MinPreULin = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound236 != 0 )
               {
                  if ( nRcdDeleted_236 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey5O236( ) ;
                     load5O236( ) ;
                     beforeValidate5O236( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls5O236( ) ;
                        O1730MinPreULin = A1730MinPreULin ;
                        n1730MinPreULin = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_236 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate5O236( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable5O236( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors5O236( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O1730MinPreULin = A1730MinPreULin ;
                           n1730MinPreULin = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_236 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_236_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_236, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMinPreLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1728MinPreLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMinPreUni_Internalname, GXutil.ltrim( localUtil.ntoc( A1731MinPreUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaxPreUni_Internalname, GXutil.ltrim( localUtil.ntoc( A1726MaxPreUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMinPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A1727MinPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMinPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1729MinPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1728MinPreLin_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z1728MinPreLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1731MinPreUni_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z1731MinPreUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1726MaxPreUni_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z1726MaxPreUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1727MinPreKgm_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z1727MinPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1729MinPreMtr_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z1729MinPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_236_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_236, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_236_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_236, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_236_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_236, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_236 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_236_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_236_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MINPRELIN_"+sGXsfl_65_idx+"Title", GXutil.rtrim( edtMinPreLin_Title)) ;
            httpContext.changePostValue( "MINPRELIN_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMinPreLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MINPREUNI_"+sGXsfl_65_idx+"Title", GXutil.rtrim( edtMinPreUni_Title)) ;
            httpContext.changePostValue( "MINPREUNI_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMinPreUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAXPREUNI_"+sGXsfl_65_idx+"Title", GXutil.rtrim( edtMaxPreUni_Title)) ;
            httpContext.changePostValue( "MAXPREUNI_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaxPreUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MINPREKGM_"+sGXsfl_65_idx+"Title", GXutil.rtrim( edtMinPreKgm_Title)) ;
            httpContext.changePostValue( "MINPREKGM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMinPreKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MINPREMTR_"+sGXsfl_65_idx+"Title", GXutil.rtrim( edtMinPreMtr_Title)) ;
            httpContext.changePostValue( "MINPREMTR_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMinPreMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O1730MinPreULin = s1730MinPreULin ;
      n1730MinPreULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption5O0( )
   {
   }

   public void e115O2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV39Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Station", AV39Station);
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV38EmprNom ;
      GXv_char3[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV39Station, GXv_char1, GXv_char2, GXv_char3) ;
      trecpil_impl.this.A396EmprCod = GXv_char1[0] ;
      trecpil_impl.this.AV38EmprNom = GXv_char2[0] ;
      trecpil_impl.this.AV17UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV38EmprNom", AV38EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char4 = AV16Lit0 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char3) ;
      trecpil_impl.this.GXt_char4 = GXv_char3[0] ;
      AV16Lit0 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit0", AV16Lit0);
      GXt_char4 = AV18LitFe ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
      trecpil_impl.this.GXt_char4 = GXv_char3[0] ;
      AV18LitFe = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18LitFe", AV18LitFe);
      GXt_char4 = AV19Lit1 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1152_", ""), (byte)(99), GXv_char3) ;
      trecpil_impl.this.GXt_char4 = GXv_char3[0] ;
      AV19Lit1 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit1", AV19Lit1);
      GXt_char4 = AV31Lit3 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char3) ;
      trecpil_impl.this.GXt_char4 = GXv_char3[0] ;
      AV31Lit3 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Lit3", AV31Lit3);
      GXt_char4 = AV32Lit4 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char3) ;
      trecpil_impl.this.GXt_char4 = GXv_char3[0] ;
      AV32Lit4 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Lit4", AV32Lit4);
      GXt_char4 = AV33Lit5 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN388_", ""), (byte)(99), GXv_char3) ;
      trecpil_impl.this.GXt_char4 = GXv_char3[0] ;
      AV33Lit5 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Lit5", AV33Lit5);
      GXt_char4 = AV34Lit6 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1193_", ""), (byte)(99), GXv_char3) ;
      trecpil_impl.this.GXt_char4 = GXv_char3[0] ;
      AV34Lit6 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Lit6", AV34Lit6);
      GXt_char4 = AV35Lit7 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1211_", ""), (byte)(99), GXv_char3) ;
      trecpil_impl.this.GXt_char4 = GXv_char3[0] ;
      AV35Lit7 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Lit7", AV35Lit7);
      GXt_char4 = AV36Lit8 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT398_", ""), (byte)(99), GXv_char3) ;
      trecpil_impl.this.GXt_char4 = GXv_char3[0] ;
      AV36Lit8 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Lit8", AV36Lit8);
      GXt_char4 = AV37Lit9 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT397_", ""), (byte)(99), GXv_char3) ;
      trecpil_impl.this.GXt_char4 = GXv_char3[0] ;
      AV37Lit9 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Lit9", AV37Lit9);
      GXt_char4 = AV20Lit10 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1340_", ""), (byte)(99), GXv_char3) ;
      trecpil_impl.this.GXt_char4 = GXv_char3[0] ;
      GXt_char5 = AV20Lit10 ;
      GXv_char2[0] = GXt_char5 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1198_", ""), (byte)(99), GXv_char2) ;
      trecpil_impl.this.GXt_char5 = GXv_char2[0] ;
      AV20Lit10 = GXutil.trim( GXt_char4) + " " + GXt_char5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit10", AV20Lit10);
      GXt_char5 = AV21Lit11 ;
      GXv_char3[0] = GXt_char5 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1193_", ""), (byte)(99), GXv_char3) ;
      trecpil_impl.this.GXt_char5 = GXv_char3[0] ;
      GXt_char4 = AV21Lit11 ;
      GXv_char2[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN227_", ""), (byte)(99), GXv_char2) ;
      trecpil_impl.this.GXt_char4 = GXv_char2[0] ;
      AV21Lit11 = GXutil.trim( GXt_char5) + " " + GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit11", AV21Lit11);
   }

   public void zm5O213( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1730MinPreULin = T005O5_A1730MinPreULin[0] ;
         }
         else
         {
            Z1730MinPreULin = A1730MinPreULin ;
         }
      }
      if ( GX_JID == -12 )
      {
         Z1730MinPreULin = A1730MinPreULin ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z583IntCod = A583IntCod ;
         Z1504CliProCod = A1504CliProCod ;
         Z279CliNom = A279CliNom ;
         Z69ArtDsc = A69ArtDsc ;
         Z584IntDsc = A584IntDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtMinPreULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMinPreULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMinPreULin_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtMinPreULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMinPreULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMinPreULin_Enabled), 5, 0), true);
      /* Using cursor T005O6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T005O6_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(4);
      /* Using cursor T005O7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
      A69ArtDsc = T005O7_A69ArtDsc[0] ;
      n69ArtDsc = T005O7_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(5);
      /* Using cursor T005O9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPREPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(7);
      /* Using cursor T005O8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTENS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
         AnyError = (short)(1) ;
      }
      A584IntDsc = T005O8_A584IntDsc[0] ;
      n584IntDsc = T005O8_n584IntDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
      pr_default.close(6);
      edtMinPreLin_Title = AV35Lit7 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMinPreLin_Internalname, "Title", edtMinPreLin_Title, !bGXsfl_65_Refreshing);
      edtMinPreUni_Title = AV36Lit8 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMinPreUni_Internalname, "Title", edtMinPreUni_Title, !bGXsfl_65_Refreshing);
      edtMaxPreUni_Title = AV37Lit9 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaxPreUni_Internalname, "Title", edtMaxPreUni_Title, !bGXsfl_65_Refreshing);
      edtMinPreKgm_Title = AV20Lit10 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMinPreKgm_Internalname, "Title", edtMinPreKgm_Title, !bGXsfl_65_Refreshing);
      edtMinPreMtr_Title = AV21Lit11 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMinPreMtr_Internalname, "Title", edtMinPreMtr_Title, !bGXsfl_65_Refreshing);
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

   public void load5O213( )
   {
      /* Using cursor T005O10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound213 = (short)(1) ;
         A1730MinPreULin = T005O10_A1730MinPreULin[0] ;
         n1730MinPreULin = T005O10_n1730MinPreULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
         A279CliNom = T005O10_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A69ArtDsc = T005O10_A69ArtDsc[0] ;
         n69ArtDsc = T005O10_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A584IntDsc = T005O10_A584IntDsc[0] ;
         n584IntDsc = T005O10_n584IntDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
         zm5O213( -12) ;
      }
      pr_default.close(8);
      onLoadActions5O213( ) ;
   }

   public void onLoadActions5O213( )
   {
   }

   public void checkExtendedTable5O213( )
   {
      nIsDirty_213 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors5O213( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey5O213( )
   {
      /* Using cursor T005O11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound213 = (short)(1) ;
      }
      else
      {
         RcdFound213 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T005O5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T005O5_A396EmprCod[0], A396EmprCod) == 0 ) && ( T005O5_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T005O5_A65ArtCod[0], A65ArtCod) == 0 ) && ( T005O5_A583IntCod[0] == A583IntCod ) && ( GXutil.strcmp(T005O5_A1504CliProCod[0], A1504CliProCod) == 0 ) )
      {
         zm5O213( 12) ;
         RcdFound213 = (short)(1) ;
         A1730MinPreULin = T005O5_A1730MinPreULin[0] ;
         n1730MinPreULin = T005O5_n1730MinPreULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
         O1730MinPreULin = A1730MinPreULin ;
         n1730MinPreULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z1504CliProCod = A1504CliProCod ;
         Z65ArtCod = A65ArtCod ;
         Z583IntCod = A583IntCod ;
         sMode213 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load5O213( ) ;
         if ( AnyError == 1 )
         {
            RcdFound213 = (short)(0) ;
            initializeNonKey5O213( ) ;
         }
         Gx_mode = sMode213 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound213 = (short)(0) ;
         initializeNonKey5O213( ) ;
         sMode213 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode213 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey5O213( ) ;
      if ( RcdFound213 == 0 )
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
      RcdFound213 = (short)(0) ;
      /* Using cursor T005O12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T005O12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T005O12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T005O12_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( GXutil.strcmp(T005O12_A65ArtCod[0], A65ArtCod) == 0 ) && ( T005O12_A583IntCod[0] == A583IntCod ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T005O12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T005O12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T005O12_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( GXutil.strcmp(T005O12_A65ArtCod[0], A65ArtCod) == 0 ) && ( T005O12_A583IntCod[0] == A583IntCod ) )
         {
            RcdFound213 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound213 = (short)(0) ;
      /* Using cursor T005O13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T005O13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T005O13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T005O13_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( GXutil.strcmp(T005O13_A65ArtCod[0], A65ArtCod) == 0 ) && ( T005O13_A583IntCod[0] == A583IntCod ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T005O13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T005O13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T005O13_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( GXutil.strcmp(T005O13_A65ArtCod[0], A65ArtCod) == 0 ) && ( T005O13_A583IntCod[0] == A583IntCod ) )
         {
            RcdFound213 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey5O213( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A1730MinPreULin = O1730MinPreULin ;
         n1730MinPreULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
         insert5O213( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound213 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A1504CliProCod, Z1504CliProCod) != 0 ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A583IntCod != Z583IntCod ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A1730MinPreULin = O1730MinPreULin ;
               n1730MinPreULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A1730MinPreULin = O1730MinPreULin ;
               n1730MinPreULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
               update5O213( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A1504CliProCod, Z1504CliProCod) != 0 ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A583IntCod != Z583IntCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A1730MinPreULin = O1730MinPreULin ;
               n1730MinPreULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
               insert5O213( ) ;
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
                  A1730MinPreULin = O1730MinPreULin ;
                  n1730MinPreULin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
                  insert5O213( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A1504CliProCod, Z1504CliProCod) != 0 ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A583IntCod != Z583IntCod ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A1730MinPreULin = O1730MinPreULin ;
         n1730MinPreULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
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
      getKey5O213( ) ;
      if ( RcdFound213 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A1504CliProCod, Z1504CliProCod) != 0 ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A583IntCod != Z583IntCod ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A1504CliProCod, Z1504CliProCod) != 0 ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A583IntCod != Z583IntCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "trecpil");
   }

   public void insert_check( )
   {
      confirm_5O0( ) ;
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
      if ( RcdFound213 == 0 )
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
      scanStart5O213( ) ;
      if ( RcdFound213 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd5O213( ) ;
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
      if ( RcdFound213 == 0 )
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
      if ( RcdFound213 == 0 )
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
      scanStart5O213( ) ;
      if ( RcdFound213 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound213 != 0 )
         {
            scanNext5O213( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd5O213( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency5O213( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T005O4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPREPR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z1730MinPreULin != T005O4_A1730MinPreULin[0] ) )
         {
            if ( Z1730MinPreULin != T005O4_A1730MinPreULin[0] )
            {
               GXutil.writeLogln("trecpil:[seudo value changed for attri]"+"MinPreULin");
               GXutil.writeLogRaw("Old: ",Z1730MinPreULin);
               GXutil.writeLogRaw("Current: ",T005O4_A1730MinPreULin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLPREPR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert5O213( )
   {
      beforeValidate5O213( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable5O213( ) ;
      }
      if ( AnyError == 0 )
      {
         zm5O213( 0) ;
         checkOptimisticConcurrency5O213( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm5O213( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert5O213( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T005O14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n1730MinPreULin), Byte.valueOf(A1730MinPreULin), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A583IntCod), A1504CliProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPREPR");
                  if ( (pr_default.getStatus(12) == 1) )
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
                        processLevel5O213( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption5O0( ) ;
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
            load5O213( ) ;
         }
         endLevel5O213( ) ;
      }
      closeExtendedTableCursors5O213( ) ;
   }

   public void update5O213( )
   {
      beforeValidate5O213( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable5O213( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency5O213( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm5O213( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate5O213( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T005O15 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n1730MinPreULin), Byte.valueOf(A1730MinPreULin), A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A583IntCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPREPR");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPREPR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate5O213( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel5O213( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption5O0( ) ;
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
         endLevel5O213( ) ;
      }
      closeExtendedTableCursors5O213( ) ;
   }

   public void deferredUpdate5O213( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate5O213( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency5O213( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls5O213( ) ;
         afterConfirm5O213( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete5O213( ) ;
            if ( AnyError == 0 )
            {
               A1730MinPreULin = O1730MinPreULin ;
               n1730MinPreULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
               scanStart5O236( ) ;
               while ( RcdFound236 != 0 )
               {
                  getByPrimaryKey5O236( ) ;
                  delete5O236( ) ;
                  scanNext5O236( ) ;
                  O1730MinPreULin = A1730MinPreULin ;
                  n1730MinPreULin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
               }
               scanEnd5O236( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T005O16 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A583IntCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPREPR");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound213 == 0 )
                        {
                           initAll5O213( ) ;
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
                        resetCaption5O0( ) ;
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
      sMode213 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel5O213( ) ;
      Gx_mode = sMode213 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls5O213( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel5O236( )
   {
      s1730MinPreULin = O1730MinPreULin ;
      n1730MinPreULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRow5O236( ) ;
         if ( ( nRcdExists_236 != 0 ) || ( nIsMod_236 != 0 ) )
         {
            standaloneNotModal5O236( ) ;
            getKey5O236( ) ;
            if ( ( nRcdExists_236 == 0 ) && ( nRcdDeleted_236 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert5O236( ) ;
            }
            else
            {
               if ( RcdFound236 != 0 )
               {
                  if ( ( nRcdDeleted_236 != 0 ) && ( nRcdExists_236 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete5O236( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_236 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update5O236( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_236 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            O1730MinPreULin = A1730MinPreULin ;
            n1730MinPreULin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_236_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_236, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMinPreLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1728MinPreLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMinPreUni_Internalname, GXutil.ltrim( localUtil.ntoc( A1731MinPreUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaxPreUni_Internalname, GXutil.ltrim( localUtil.ntoc( A1726MaxPreUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMinPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A1727MinPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMinPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1729MinPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1728MinPreLin_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z1728MinPreLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1731MinPreUni_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z1731MinPreUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1726MaxPreUni_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z1726MaxPreUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1727MinPreKgm_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z1727MinPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1729MinPreMtr_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z1729MinPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_236_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_236, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_236_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_236, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_236_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_236, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_236 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_236_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_236_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MINPRELIN_"+sGXsfl_65_idx+"Title", GXutil.rtrim( edtMinPreLin_Title)) ;
            httpContext.changePostValue( "MINPRELIN_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMinPreLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MINPREUNI_"+sGXsfl_65_idx+"Title", GXutil.rtrim( edtMinPreUni_Title)) ;
            httpContext.changePostValue( "MINPREUNI_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMinPreUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAXPREUNI_"+sGXsfl_65_idx+"Title", GXutil.rtrim( edtMaxPreUni_Title)) ;
            httpContext.changePostValue( "MAXPREUNI_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaxPreUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MINPREKGM_"+sGXsfl_65_idx+"Title", GXutil.rtrim( edtMinPreKgm_Title)) ;
            httpContext.changePostValue( "MINPREKGM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMinPreKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MINPREMTR_"+sGXsfl_65_idx+"Title", GXutil.rtrim( edtMinPreMtr_Title)) ;
            httpContext.changePostValue( "MINPREMTR_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMinPreMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll5O236( ) ;
      if ( AnyError != 0 )
      {
         O1730MinPreULin = s1730MinPreULin ;
         n1730MinPreULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
      }
      nRcdExists_236 = (short)(0) ;
      nIsMod_236 = (short)(0) ;
      nRcdDeleted_236 = (short)(0) ;
   }

   public void processLevel5O213( )
   {
      /* Save parent mode. */
      sMode213 = Gx_mode ;
      processNestedLevel5O236( ) ;
      if ( AnyError != 0 )
      {
         O1730MinPreULin = s1730MinPreULin ;
         n1730MinPreULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode213 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T005O17 */
      pr_default.execute(15, new Object[] {Boolean.valueOf(n1730MinPreULin), Byte.valueOf(A1730MinPreULin), A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A583IntCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPREPR");
   }

   public void endLevel5O213( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete5O213( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "trecpil");
         if ( AnyError == 0 )
         {
            confirmValues5O0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "trecpil");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart5O213( )
   {
      /* Scan By routine */
      /* Using cursor T005O18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A583IntCod)});
      RcdFound213 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound213 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext5O213( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound213 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound213 = (short)(1) ;
      }
   }

   public void scanEnd5O213( )
   {
      pr_default.close(16);
   }

   public void afterConfirm5O213( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert5O213( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate5O213( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete5O213( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete5O213( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate5O213( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes5O213( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliProCod_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtIntCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Enabled), 5, 0), true);
      edtMinPreULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMinPreULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMinPreULin_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Enabled), 5, 0), true);
      edtIntDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDsc_Enabled), 5, 0), true);
   }

   public void zm5O236( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1731MinPreUni = T005O3_A1731MinPreUni[0] ;
            Z1726MaxPreUni = T005O3_A1726MaxPreUni[0] ;
            Z1727MinPreKgm = T005O3_A1727MinPreKgm[0] ;
            Z1729MinPreMtr = T005O3_A1729MinPreMtr[0] ;
         }
         else
         {
            Z1731MinPreUni = A1731MinPreUni ;
            Z1726MaxPreUni = A1726MaxPreUni ;
            Z1727MinPreKgm = A1727MinPreKgm ;
            Z1729MinPreMtr = A1729MinPreMtr ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z252CliCod = A252CliCod ;
         Z1504CliProCod = A1504CliProCod ;
         Z65ArtCod = A65ArtCod ;
         Z1728MinPreLin = A1728MinPreLin ;
         Z1731MinPreUni = A1731MinPreUni ;
         Z1726MaxPreUni = A1726MaxPreUni ;
         Z1727MinPreKgm = A1727MinPreKgm ;
         Z1729MinPreMtr = A1729MinPreMtr ;
         Z396EmprCod = A396EmprCod ;
         Z583IntCod = A583IntCod ;
      }
   }

   public void standaloneNotModal5O236( )
   {
      edtMinPreLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMinPreLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMinPreLin_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMinPreULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMinPreULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMinPreULin_Enabled), 5, 0), true);
      edtMinPreULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMinPreULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMinPreULin_Enabled), 5, 0), true);
   }

   public void standaloneModal5O236( )
   {
      if ( isIns( )  )
      {
         A1730MinPreULin = (byte)(O1730MinPreULin+10) ;
         n1730MinPreULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A1728MinPreLin = A1730MinPreULin ;
      }
   }

   public void load5O236( )
   {
      /* Using cursor T005O19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A583IntCod), Byte.valueOf(A1728MinPreLin)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound236 = (short)(1) ;
         A1731MinPreUni = T005O19_A1731MinPreUni[0] ;
         n1731MinPreUni = T005O19_n1731MinPreUni[0] ;
         A1726MaxPreUni = T005O19_A1726MaxPreUni[0] ;
         n1726MaxPreUni = T005O19_n1726MaxPreUni[0] ;
         A1727MinPreKgm = T005O19_A1727MinPreKgm[0] ;
         n1727MinPreKgm = T005O19_n1727MinPreKgm[0] ;
         A1729MinPreMtr = T005O19_A1729MinPreMtr[0] ;
         n1729MinPreMtr = T005O19_n1729MinPreMtr[0] ;
         zm5O236( -17) ;
      }
      pr_default.close(17);
      onLoadActions5O236( ) ;
   }

   public void onLoadActions5O236( )
   {
   }

   public void checkExtendedTable5O236( )
   {
      nIsDirty_236 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal5O236( ) ;
      if ( DecimalUtil.compareTo(A1731MinPreUni, A1726MaxPreUni) > 0 )
      {
         GXCCtl = "MINPREUNI_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Limite inicial superior al final", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMinPreUni_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors5O236( )
   {
   }

   public void enableDisable5O236( )
   {
   }

   public void getKey5O236( )
   {
      /* Using cursor T005O20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A583IntCod), Byte.valueOf(A1728MinPreLin)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound236 = (short)(1) ;
      }
      else
      {
         RcdFound236 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey5O236( )
   {
      /* Using cursor T005O3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A583IntCod), Byte.valueOf(A1728MinPreLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T005O3_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T005O3_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( GXutil.strcmp(T005O3_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T005O3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T005O3_A583IntCod[0] == A583IntCod ) )
      {
         zm5O236( 17) ;
         RcdFound236 = (short)(1) ;
         initializeNonKey5O236( ) ;
         A1728MinPreLin = T005O3_A1728MinPreLin[0] ;
         A1731MinPreUni = T005O3_A1731MinPreUni[0] ;
         n1731MinPreUni = T005O3_n1731MinPreUni[0] ;
         A1726MaxPreUni = T005O3_A1726MaxPreUni[0] ;
         n1726MaxPreUni = T005O3_n1726MaxPreUni[0] ;
         A1727MinPreKgm = T005O3_A1727MinPreKgm[0] ;
         n1727MinPreKgm = T005O3_n1727MinPreKgm[0] ;
         A1729MinPreMtr = T005O3_A1729MinPreMtr[0] ;
         n1729MinPreMtr = T005O3_n1729MinPreMtr[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z1504CliProCod = A1504CliProCod ;
         Z65ArtCod = A65ArtCod ;
         Z583IntCod = A583IntCod ;
         Z1728MinPreLin = A1728MinPreLin ;
         sMode236 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal5O236( ) ;
         load5O236( ) ;
         Gx_mode = sMode236 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound236 = (short)(0) ;
         initializeNonKey5O236( ) ;
         sMode236 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal5O236( ) ;
         Gx_mode = sMode236 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes5O236( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency5O236( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T005O2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A583IntCod), Byte.valueOf(A1728MinPreLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECPIL"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z1731MinPreUni, T005O2_A1731MinPreUni[0]) != 0 ) || ( DecimalUtil.compareTo(Z1726MaxPreUni, T005O2_A1726MaxPreUni[0]) != 0 ) || ( DecimalUtil.compareTo(Z1727MinPreKgm, T005O2_A1727MinPreKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z1729MinPreMtr, T005O2_A1729MinPreMtr[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z1731MinPreUni, T005O2_A1731MinPreUni[0]) != 0 )
            {
               GXutil.writeLogln("trecpil:[seudo value changed for attri]"+"MinPreUni");
               GXutil.writeLogRaw("Old: ",Z1731MinPreUni);
               GXutil.writeLogRaw("Current: ",T005O2_A1731MinPreUni[0]);
            }
            if ( DecimalUtil.compareTo(Z1726MaxPreUni, T005O2_A1726MaxPreUni[0]) != 0 )
            {
               GXutil.writeLogln("trecpil:[seudo value changed for attri]"+"MaxPreUni");
               GXutil.writeLogRaw("Old: ",Z1726MaxPreUni);
               GXutil.writeLogRaw("Current: ",T005O2_A1726MaxPreUni[0]);
            }
            if ( DecimalUtil.compareTo(Z1727MinPreKgm, T005O2_A1727MinPreKgm[0]) != 0 )
            {
               GXutil.writeLogln("trecpil:[seudo value changed for attri]"+"MinPreKgm");
               GXutil.writeLogRaw("Old: ",Z1727MinPreKgm);
               GXutil.writeLogRaw("Current: ",T005O2_A1727MinPreKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z1729MinPreMtr, T005O2_A1729MinPreMtr[0]) != 0 )
            {
               GXutil.writeLogln("trecpil:[seudo value changed for attri]"+"MinPreMtr");
               GXutil.writeLogRaw("Old: ",Z1729MinPreMtr);
               GXutil.writeLogRaw("Current: ",T005O2_A1729MinPreMtr[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPRECPIL"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert5O236( )
   {
      beforeValidate5O236( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable5O236( ) ;
      }
      if ( AnyError == 0 )
      {
         zm5O236( 0) ;
         checkOptimisticConcurrency5O236( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm5O236( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert5O236( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T005O21 */
                  pr_default.execute(19, new Object[] {Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A1728MinPreLin), Boolean.valueOf(n1731MinPreUni), A1731MinPreUni, Boolean.valueOf(n1726MaxPreUni), A1726MaxPreUni, Boolean.valueOf(n1727MinPreKgm), A1727MinPreKgm, Boolean.valueOf(n1729MinPreMtr), A1729MinPreMtr, A396EmprCod, Byte.valueOf(A583IntCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECPIL");
                  if ( (pr_default.getStatus(19) == 1) )
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
            load5O236( ) ;
         }
         endLevel5O236( ) ;
      }
      closeExtendedTableCursors5O236( ) ;
   }

   public void update5O236( )
   {
      beforeValidate5O236( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable5O236( ) ;
      }
      if ( ( nIsMod_236 != 0 ) || ( nIsDirty_236 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency5O236( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm5O236( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate5O236( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T005O22 */
                     pr_default.execute(20, new Object[] {Boolean.valueOf(n1731MinPreUni), A1731MinPreUni, Boolean.valueOf(n1726MaxPreUni), A1726MaxPreUni, Boolean.valueOf(n1727MinPreKgm), A1727MinPreKgm, Boolean.valueOf(n1729MinPreMtr), A1729MinPreMtr, A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A583IntCod), Byte.valueOf(A1728MinPreLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECPIL");
                     if ( (pr_default.getStatus(20) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECPIL"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate5O236( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey5O236( ) ;
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
            endLevel5O236( ) ;
         }
      }
      closeExtendedTableCursors5O236( ) ;
   }

   public void deferredUpdate5O236( )
   {
   }

   public void delete5O236( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate5O236( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency5O236( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls5O236( ) ;
         afterConfirm5O236( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete5O236( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T005O23 */
               pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A583IntCod), Byte.valueOf(A1728MinPreLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECPIL");
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
      sMode236 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel5O236( ) ;
      Gx_mode = sMode236 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls5O236( )
   {
      standaloneModal5O236( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel5O236( )
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

   public void scanStart5O236( )
   {
      /* Scan By routine */
      /* Using cursor T005O24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A583IntCod)});
      RcdFound236 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound236 = (short)(1) ;
         A1728MinPreLin = T005O24_A1728MinPreLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext5O236( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound236 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound236 = (short)(1) ;
         A1728MinPreLin = T005O24_A1728MinPreLin[0] ;
      }
   }

   public void scanEnd5O236( )
   {
      pr_default.close(22);
   }

   public void afterConfirm5O236( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert5O236( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate5O236( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete5O236( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete5O236( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate5O236( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes5O236( )
   {
      edtMinPreLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMinPreLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMinPreLin_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMinPreUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMinPreUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMinPreUni_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMaxPreUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaxPreUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaxPreUni_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMinPreKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMinPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMinPreKgm_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMinPreMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMinPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMinPreMtr_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void send_integrity_lvl_hashes5O236( )
   {
   }

   public void send_integrity_lvl_hashes5O213( )
   {
   }

   public void subsflControlProps_65236( )
   {
      edtavnRcdDeleted_236_Internalname = "vNRCDDELETED_236_"+sGXsfl_65_idx ;
      edtMinPreLin_Internalname = "MINPRELIN_"+sGXsfl_65_idx ;
      edtMinPreUni_Internalname = "MINPREUNI_"+sGXsfl_65_idx ;
      edtMaxPreUni_Internalname = "MAXPREUNI_"+sGXsfl_65_idx ;
      edtMinPreKgm_Internalname = "MINPREKGM_"+sGXsfl_65_idx ;
      edtMinPreMtr_Internalname = "MINPREMTR_"+sGXsfl_65_idx ;
   }

   public void subsflControlProps_fel_65236( )
   {
      edtavnRcdDeleted_236_Internalname = "vNRCDDELETED_236_"+sGXsfl_65_fel_idx ;
      edtMinPreLin_Internalname = "MINPRELIN_"+sGXsfl_65_fel_idx ;
      edtMinPreUni_Internalname = "MINPREUNI_"+sGXsfl_65_fel_idx ;
      edtMaxPreUni_Internalname = "MAXPREUNI_"+sGXsfl_65_fel_idx ;
      edtMinPreKgm_Internalname = "MINPREKGM_"+sGXsfl_65_fel_idx ;
      edtMinPreMtr_Internalname = "MINPREMTR_"+sGXsfl_65_fel_idx ;
   }

   public void addRow5O236( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_65236( ) ;
      sendRow5O236( ) ;
   }

   public void sendRow5O236( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_236_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_236_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_236, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_236_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_236), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_236), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_236_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_236_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMinPreLin_Internalname,GXutil.ltrim( localUtil.ntoc( A1728MinPreLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMinPreLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1728MinPreLin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1728MinPreLin), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMinPreLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMinPreLin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_236_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMinPreUni_Internalname,GXutil.ltrim( localUtil.ntoc( A1731MinPreUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMinPreUni_Enabled!=0) ? localUtil.format( A1731MinPreUni, "ZZZZZ9.99") : localUtil.format( A1731MinPreUni, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMinPreUni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMinPreUni_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_236_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaxPreUni_Internalname,GXutil.ltrim( localUtil.ntoc( A1726MaxPreUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMaxPreUni_Enabled!=0) ? localUtil.format( A1726MaxPreUni, "ZZZZZ9.99") : localUtil.format( A1726MaxPreUni, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaxPreUni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaxPreUni_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_236_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMinPreKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A1727MinPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMinPreKgm_Enabled!=0) ? localUtil.format( A1727MinPreKgm, "ZZZZZZ9.999") : localUtil.format( A1727MinPreKgm, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,70);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMinPreKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMinPreKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_236_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMinPreMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1729MinPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMinPreMtr_Enabled!=0) ? localUtil.format( A1729MinPreMtr, "ZZZZZZ9.999") : localUtil.format( A1729MinPreMtr, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMinPreMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMinPreMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes5O236( ) ;
      GXCCtl = "Z1728MinPreLin_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1728MinPreLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1731MinPreUni_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1731MinPreUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1726MaxPreUni_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1726MaxPreUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1727MinPreKgm_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1727MinPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1729MinPreMtr_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1729MinPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_236_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_236, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_236_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_236, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_236_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_236, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_236_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_236_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MINPRELIN_"+sGXsfl_65_idx+"Title", GXutil.rtrim( edtMinPreLin_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "MINPRELIN_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMinPreLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MINPREUNI_"+sGXsfl_65_idx+"Title", GXutil.rtrim( edtMinPreUni_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "MINPREUNI_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMinPreUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAXPREUNI_"+sGXsfl_65_idx+"Title", GXutil.rtrim( edtMaxPreUni_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "MAXPREUNI_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaxPreUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MINPREKGM_"+sGXsfl_65_idx+"Title", GXutil.rtrim( edtMinPreKgm_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "MINPREKGM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMinPreKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MINPREMTR_"+sGXsfl_65_idx+"Title", GXutil.rtrim( edtMinPreMtr_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "MINPREMTR_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMinPreMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow5O236( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_65236( ) ;
      edtavnRcdDeleted_236_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_236_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMinPreLin_Title = httpContext.cgiGet( "MINPRELIN_"+sGXsfl_65_idx+"Title") ;
      edtMinPreLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MINPRELIN_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMinPreUni_Title = httpContext.cgiGet( "MINPREUNI_"+sGXsfl_65_idx+"Title") ;
      edtMinPreUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MINPREUNI_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaxPreUni_Title = httpContext.cgiGet( "MAXPREUNI_"+sGXsfl_65_idx+"Title") ;
      edtMaxPreUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAXPREUNI_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMinPreKgm_Title = httpContext.cgiGet( "MINPREKGM_"+sGXsfl_65_idx+"Title") ;
      edtMinPreKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MINPREKGM_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMinPreMtr_Title = httpContext.cgiGet( "MINPREMTR_"+sGXsfl_65_idx+"Title") ;
      edtMinPreMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MINPREMTR_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_236_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_236_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_236");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_236_Internalname ;
         wbErr = true ;
         nRcdDeleted_236 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_236 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_236_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A1728MinPreLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtMinPreLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMinPreUni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMinPreUni_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "MINPREUNI_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMinPreUni_Internalname ;
         wbErr = true ;
         A1731MinPreUni = DecimalUtil.ZERO ;
         n1731MinPreUni = false ;
      }
      else
      {
         A1731MinPreUni = localUtil.ctond( httpContext.cgiGet( edtMinPreUni_Internalname)) ;
         n1731MinPreUni = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaxPreUni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaxPreUni_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "MAXPREUNI_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaxPreUni_Internalname ;
         wbErr = true ;
         A1726MaxPreUni = DecimalUtil.ZERO ;
         n1726MaxPreUni = false ;
      }
      else
      {
         A1726MaxPreUni = localUtil.ctond( httpContext.cgiGet( edtMaxPreUni_Internalname)) ;
         n1726MaxPreUni = false ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMinPreKgm_Internalname)), DecimalUtil.stringToDec("-999999.99999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMinPreKgm_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "MINPREKGM_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMinPreKgm_Internalname ;
         wbErr = true ;
         A1727MinPreKgm = DecimalUtil.ZERO ;
         n1727MinPreKgm = false ;
      }
      else
      {
         A1727MinPreKgm = localUtil.ctond( httpContext.cgiGet( edtMinPreKgm_Internalname)) ;
         n1727MinPreKgm = false ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMinPreMtr_Internalname)), DecimalUtil.stringToDec("-999999.99999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMinPreMtr_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "MINPREMTR_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMinPreMtr_Internalname ;
         wbErr = true ;
         A1729MinPreMtr = DecimalUtil.ZERO ;
         n1729MinPreMtr = false ;
      }
      else
      {
         A1729MinPreMtr = localUtil.ctond( httpContext.cgiGet( edtMinPreMtr_Internalname)) ;
         n1729MinPreMtr = false ;
      }
      GXCCtl = "Z1728MinPreLin_" + sGXsfl_65_idx ;
      Z1728MinPreLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1731MinPreUni_" + sGXsfl_65_idx ;
      Z1731MinPreUni = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1726MaxPreUni_" + sGXsfl_65_idx ;
      Z1726MaxPreUni = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1727MinPreKgm_" + sGXsfl_65_idx ;
      Z1727MinPreKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1729MinPreMtr_" + sGXsfl_65_idx ;
      Z1729MinPreMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_236_" + sGXsfl_65_idx ;
      nRcdDeleted_236 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_236_" + sGXsfl_65_idx ;
      nRcdExists_236 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_236_" + sGXsfl_65_idx ;
      nIsMod_236 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMinPreLin_Enabled = edtMinPreLin_Enabled ;
   }

   public void confirmValues5O0( )
   {
      nGXsfl_65_idx = 0 ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_65236( ) ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_65236( ) ;
         httpContext.changePostValue( "Z1728MinPreLin_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z1728MinPreLin_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1728MinPreLin_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z1731MinPreUni_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z1731MinPreUni_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1731MinPreUni_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z1726MaxPreUni_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z1726MaxPreUni_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1726MaxPreUni_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z1727MinPreKgm_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z1727MinPreKgm_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1727MinPreKgm_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z1729MinPreMtr_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z1729MinPreMtr_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1729MinPreMtr_"+sGXsfl_65_idx) ;
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
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.trecpil", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A1504CliProCod)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.ltrimstr(A583IntCod,2,0))}, new String[] {"EmprCod","CliCod","CliProCod","ArtCod","IntCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z1504CliProCod", GXutil.rtrim( Z1504CliProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z583IntCod", GXutil.ltrim( localUtil.ntoc( Z583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1730MinPreULin", GXutil.ltrim( localUtil.ntoc( Z1730MinPreULin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1730MinPreULin", GXutil.ltrim( localUtil.ntoc( O1730MinPreULin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_65", GXutil.ltrim( localUtil.ntoc( nGXsfl_65_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT7", GXutil.rtrim( AV35Lit7));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT8", GXutil.rtrim( AV36Lit8));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT9", GXutil.rtrim( AV37Lit9));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT10", GXutil.rtrim( AV20Lit10));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT11", GXutil.rtrim( AV21Lit11));
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
      return formatLink("app.trecpil", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A1504CliProCod)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.ltrimstr(A583IntCod,2,0))}, new String[] {"EmprCod","CliCod","CliProCod","ArtCod","IntCod"})  ;
   }

   public String getPgmname( )
   {
      return "TRECPIL" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "RECARGOS", "") ;
   }

   public void initializeNonKey5O213( )
   {
      A1730MinPreULin = (byte)(0) ;
      n1730MinPreULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
      O1730MinPreULin = A1730MinPreULin ;
      n1730MinPreULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
      Z1730MinPreULin = (byte)(0) ;
   }

   public void initAll5O213( )
   {
      initializeNonKey5O213( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey5O236( )
   {
      A1731MinPreUni = DecimalUtil.ZERO ;
      n1731MinPreUni = false ;
      A1726MaxPreUni = DecimalUtil.ZERO ;
      n1726MaxPreUni = false ;
      A1727MinPreKgm = DecimalUtil.ZERO ;
      n1727MinPreKgm = false ;
      A1729MinPreMtr = DecimalUtil.ZERO ;
      n1729MinPreMtr = false ;
      Z1731MinPreUni = DecimalUtil.ZERO ;
      Z1726MaxPreUni = DecimalUtil.ZERO ;
      Z1727MinPreKgm = DecimalUtil.ZERO ;
      Z1729MinPreMtr = DecimalUtil.ZERO ;
   }

   public void initAll5O236( )
   {
      A1728MinPreLin = (byte)(0) ;
      initializeNonKey5O236( ) ;
   }

   public void standaloneModalInsert5O236( )
   {
      A1730MinPreULin = i1730MinPreULin ;
      n1730MinPreULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1730MinPreULin), 2, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101624100", true, true);
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
      httpContext.AddJavascriptSource("trecpil.js", "?20266101624101", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties236( )
   {
      edtMinPreLin_Enabled = defedtMinPreLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMinPreLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMinPreLin_Enabled), 5, 0), !bGXsfl_65_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_236, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_236_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1728MinPreLin, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtMinPreLin_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMinPreLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1731MinPreUni, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtMinPreUni_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMinPreUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1726MaxPreUni, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtMaxPreUni_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaxPreUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1727MinPreKgm, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtMinPreKgm_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMinPreKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1729MinPreMtr, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtMinPreMtr_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMinPreMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliProCod_Internalname = "CLIPROCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtArtCod_Internalname = "ARTCOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtIntCod_Internalname = "INTCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtMinPreULin_Internalname = "MINPREULIN" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtIntDsc_Internalname = "INTDSC" ;
      edtavnRcdDeleted_236_Internalname = "vNRCDDELETED_236" ;
      edtMinPreLin_Internalname = "MINPRELIN" ;
      edtMinPreUni_Internalname = "MINPREUNI" ;
      edtMaxPreUni_Internalname = "MAXPREUNI" ;
      edtMinPreKgm_Internalname = "MINPREKGM" ;
      edtMinPreMtr_Internalname = "MINPREMTR" ;
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
      Form.setCaption( httpContext.getMessage( "RECARGOS", "") );
      edtMinPreMtr_Jsonclick = "" ;
      edtMinPreKgm_Jsonclick = "" ;
      edtMaxPreUni_Jsonclick = "" ;
      edtMinPreUni_Jsonclick = "" ;
      edtMinPreLin_Jsonclick = "" ;
      edtavnRcdDeleted_236_Jsonclick = "" ;
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
      edtMinPreMtr_Enabled = 1 ;
      edtMinPreMtr_Title = httpContext.getMessage( "MinPreMtr", "") ;
      edtMinPreKgm_Enabled = 1 ;
      edtMinPreKgm_Title = httpContext.getMessage( "MinPreKgm", "") ;
      edtMaxPreUni_Enabled = 1 ;
      edtMaxPreUni_Title = httpContext.getMessage( "MaxPreUni", "") ;
      edtMinPreUni_Enabled = 1 ;
      edtMinPreUni_Title = httpContext.getMessage( "Unidades", "") ;
      edtMinPreLin_Enabled = 0 ;
      edtMinPreLin_Title = httpContext.getMessage( "Linea Recargo", "") ;
      edtavnRcdDeleted_236_Enabled = 1 ;
      edtIntDsc_Jsonclick = "" ;
      edtIntDsc_Backcolor = (int)(0xFFFFFF) ;
      edtIntDsc_Enabled = 0 ;
      edtArtDsc_Jsonclick = "" ;
      edtArtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtArtDsc_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtMinPreULin_Jsonclick = "" ;
      edtMinPreULin_Backcolor = (int)(0xFFFFFF) ;
      edtMinPreULin_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtIntCod_Jsonclick = "" ;
      edtIntCod_Backcolor = (int)(0xFFFFFF) ;
      edtIntCod_Enabled = 0 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtArtCod_Enabled = 0 ;
      edtCliProCod_Jsonclick = "" ;
      edtCliProCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliProCod_Enabled = 0 ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_65236( ) ;
      while ( nGXsfl_65_idx <= nRC_GXsfl_65 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal5O236( ) ;
         standaloneModal5O236( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow5O236( ) ;
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_65236( ) ;
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
      /* Using cursor T005O25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T005O25_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(23);
      /* Using cursor T005O26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
      A69ArtDsc = T005O26_A69ArtDsc[0] ;
      n69ArtDsc = T005O26_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(24);
      /* Using cursor T005O27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPREPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(25);
      /* Using cursor T005O28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTENS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
         AnyError = (short)(1) ;
      }
      A584IntDsc = T005O28_A584IntDsc[0] ;
      n584IntDsc = T005O28_n584IntDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
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

   public void valid_Intcod( )
   {
      n1730MinPreULin = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1730MinPreULin", GXutil.ltrim( localUtil.ntoc( A1730MinPreULin, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", GXutil.rtrim( A584IntDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1504CliProCod", GXutil.rtrim( Z1504CliProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z583IntCod", GXutil.ltrim( localUtil.ntoc( Z583IntCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1730MinPreULin", GXutil.ltrim( localUtil.ntoc( Z1730MinPreULin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z584IntDsc", GXutil.rtrim( Z584IntDsc));
      httpContext.ajax_rsp_assign_attri("", false, "O1730MinPreULin", GXutil.ltrim( localUtil.ntoc( O1730MinPreULin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1504CliProCod',fld:'CLIPROCOD',pic:''},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A583IntCod',fld:'INTCOD',pic:'Z9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_CLIPROCOD","{handler:'valid_Cliprocod',iparms:[]");
      setEventMetadata("VALID_CLIPROCOD",",oparms:[]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[]");
      setEventMetadata("VALID_ARTCOD",",oparms:[]}");
      setEventMetadata("VALID_INTCOD","{handler:'valid_Intcod',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A1730MinPreULin',fld:'MINPREULIN',pic:'Z9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1504CliProCod',fld:'CLIPROCOD',pic:''},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A583IntCod',fld:'INTCOD',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV35Lit7',fld:'vLIT7',pic:''},{av:'AV36Lit8',fld:'vLIT8',pic:''},{av:'AV37Lit9',fld:'vLIT9',pic:''},{av:'AV20Lit10',fld:'vLIT10',pic:''},{av:'AV21Lit11',fld:'vLIT11',pic:''}]");
      setEventMetadata("VALID_INTCOD",",oparms:[{av:'A1730MinPreULin',fld:'MINPREULIN',pic:'Z9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'A584IntDsc',fld:'INTDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z1504CliProCod'},{av:'Z65ArtCod'},{av:'Z583IntCod'},{av:'Z1730MinPreULin'},{av:'Z279CliNom'},{av:'Z69ArtDsc'},{av:'Z584IntDsc'},{av:'O1730MinPreULin'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MINPREULIN","{handler:'valid_Minpreulin',iparms:[]");
      setEventMetadata("VALID_MINPREULIN",",oparms:[]}");
      setEventMetadata("VALID_MINPRELIN","{handler:'valid_Minprelin',iparms:[]");
      setEventMetadata("VALID_MINPRELIN",",oparms:[]}");
      setEventMetadata("VALID_MINPREUNI","{handler:'valid_Minpreuni',iparms:[]");
      setEventMetadata("VALID_MINPREUNI",",oparms:[]}");
      setEventMetadata("VALID_MAXPREUNI","{handler:'valid_Maxpreuni',iparms:[]");
      setEventMetadata("VALID_MAXPREUNI",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Minpremtr',iparms:[]");
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
      pr_default.close(26);
      pr_default.close(25);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA1504CliProCod = "" ;
      wcpOA65ArtCod = "" ;
      Z396EmprCod = "" ;
      Z1504CliProCod = "" ;
      Z65ArtCod = "" ;
      Z1731MinPreUni = DecimalUtil.ZERO ;
      Z1726MaxPreUni = DecimalUtil.ZERO ;
      Z1727MinPreKgm = DecimalUtil.ZERO ;
      Z1729MinPreMtr = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A1504CliProCod = "" ;
      A65ArtCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock8_Jsonclick = "" ;
      A69ArtDsc = "" ;
      lblTextblock9_Jsonclick = "" ;
      A584IntDsc = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode236 = "" ;
      Gx_mode = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV35Lit7 = "" ;
      AV36Lit8 = "" ;
      AV37Lit9 = "" ;
      AV20Lit10 = "" ;
      AV21Lit11 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode213 = "" ;
      A1731MinPreUni = DecimalUtil.ZERO ;
      A1726MaxPreUni = DecimalUtil.ZERO ;
      A1727MinPreKgm = DecimalUtil.ZERO ;
      A1729MinPreMtr = DecimalUtil.ZERO ;
      AV39Station = "" ;
      GXv_char1 = new String[1] ;
      AV38EmprNom = "" ;
      AV17UsurCod = "" ;
      AV16Lit0 = "" ;
      AV18LitFe = "" ;
      AV19Lit1 = "" ;
      AV31Lit3 = "" ;
      AV32Lit4 = "" ;
      AV33Lit5 = "" ;
      AV34Lit6 = "" ;
      GXt_char5 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char4 = "" ;
      GXv_char2 = new String[1] ;
      Z279CliNom = "" ;
      Z69ArtDsc = "" ;
      Z584IntDsc = "" ;
      T005O6_A279CliNom = new String[] {""} ;
      T005O7_A69ArtDsc = new String[] {""} ;
      T005O7_n69ArtDsc = new boolean[] {false} ;
      T005O9_A396EmprCod = new String[] {""} ;
      T005O8_A584IntDsc = new String[] {""} ;
      T005O8_n584IntDsc = new boolean[] {false} ;
      T005O10_A1730MinPreULin = new byte[1] ;
      T005O10_n1730MinPreULin = new boolean[] {false} ;
      T005O10_A279CliNom = new String[] {""} ;
      T005O10_A69ArtDsc = new String[] {""} ;
      T005O10_n69ArtDsc = new boolean[] {false} ;
      T005O10_A584IntDsc = new String[] {""} ;
      T005O10_n584IntDsc = new boolean[] {false} ;
      T005O10_A396EmprCod = new String[] {""} ;
      T005O10_A252CliCod = new int[1] ;
      T005O10_A65ArtCod = new String[] {""} ;
      T005O10_A583IntCod = new byte[1] ;
      T005O10_A1504CliProCod = new String[] {""} ;
      T005O11_A396EmprCod = new String[] {""} ;
      T005O11_A252CliCod = new int[1] ;
      T005O11_A1504CliProCod = new String[] {""} ;
      T005O11_A65ArtCod = new String[] {""} ;
      T005O11_A583IntCod = new byte[1] ;
      T005O5_A1730MinPreULin = new byte[1] ;
      T005O5_n1730MinPreULin = new boolean[] {false} ;
      T005O5_A396EmprCod = new String[] {""} ;
      T005O5_A252CliCod = new int[1] ;
      T005O5_A65ArtCod = new String[] {""} ;
      T005O5_A583IntCod = new byte[1] ;
      T005O5_A1504CliProCod = new String[] {""} ;
      T005O12_A396EmprCod = new String[] {""} ;
      T005O12_A252CliCod = new int[1] ;
      T005O12_A1504CliProCod = new String[] {""} ;
      T005O12_A65ArtCod = new String[] {""} ;
      T005O12_A583IntCod = new byte[1] ;
      T005O13_A396EmprCod = new String[] {""} ;
      T005O13_A252CliCod = new int[1] ;
      T005O13_A1504CliProCod = new String[] {""} ;
      T005O13_A65ArtCod = new String[] {""} ;
      T005O13_A583IntCod = new byte[1] ;
      T005O4_A1730MinPreULin = new byte[1] ;
      T005O4_n1730MinPreULin = new boolean[] {false} ;
      T005O4_A396EmprCod = new String[] {""} ;
      T005O4_A252CliCod = new int[1] ;
      T005O4_A65ArtCod = new String[] {""} ;
      T005O4_A583IntCod = new byte[1] ;
      T005O4_A1504CliProCod = new String[] {""} ;
      T005O18_A396EmprCod = new String[] {""} ;
      T005O18_A252CliCod = new int[1] ;
      T005O18_A1504CliProCod = new String[] {""} ;
      T005O18_A65ArtCod = new String[] {""} ;
      T005O18_A583IntCod = new byte[1] ;
      T005O19_A252CliCod = new int[1] ;
      T005O19_A1504CliProCod = new String[] {""} ;
      T005O19_A65ArtCod = new String[] {""} ;
      T005O19_A1728MinPreLin = new byte[1] ;
      T005O19_A1731MinPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005O19_n1731MinPreUni = new boolean[] {false} ;
      T005O19_A1726MaxPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005O19_n1726MaxPreUni = new boolean[] {false} ;
      T005O19_A1727MinPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005O19_n1727MinPreKgm = new boolean[] {false} ;
      T005O19_A1729MinPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005O19_n1729MinPreMtr = new boolean[] {false} ;
      T005O19_A396EmprCod = new String[] {""} ;
      T005O19_A583IntCod = new byte[1] ;
      GXCCtl = "" ;
      T005O20_A396EmprCod = new String[] {""} ;
      T005O20_A252CliCod = new int[1] ;
      T005O20_A1504CliProCod = new String[] {""} ;
      T005O20_A65ArtCod = new String[] {""} ;
      T005O20_A583IntCod = new byte[1] ;
      T005O20_A1728MinPreLin = new byte[1] ;
      T005O3_A252CliCod = new int[1] ;
      T005O3_A1504CliProCod = new String[] {""} ;
      T005O3_A65ArtCod = new String[] {""} ;
      T005O3_A1728MinPreLin = new byte[1] ;
      T005O3_A1731MinPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005O3_n1731MinPreUni = new boolean[] {false} ;
      T005O3_A1726MaxPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005O3_n1726MaxPreUni = new boolean[] {false} ;
      T005O3_A1727MinPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005O3_n1727MinPreKgm = new boolean[] {false} ;
      T005O3_A1729MinPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005O3_n1729MinPreMtr = new boolean[] {false} ;
      T005O3_A396EmprCod = new String[] {""} ;
      T005O3_A583IntCod = new byte[1] ;
      T005O2_A252CliCod = new int[1] ;
      T005O2_A1504CliProCod = new String[] {""} ;
      T005O2_A65ArtCod = new String[] {""} ;
      T005O2_A1728MinPreLin = new byte[1] ;
      T005O2_A1731MinPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005O2_n1731MinPreUni = new boolean[] {false} ;
      T005O2_A1726MaxPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005O2_n1726MaxPreUni = new boolean[] {false} ;
      T005O2_A1727MinPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005O2_n1727MinPreKgm = new boolean[] {false} ;
      T005O2_A1729MinPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005O2_n1729MinPreMtr = new boolean[] {false} ;
      T005O2_A396EmprCod = new String[] {""} ;
      T005O2_A583IntCod = new byte[1] ;
      T005O24_A396EmprCod = new String[] {""} ;
      T005O24_A252CliCod = new int[1] ;
      T005O24_A1504CliProCod = new String[] {""} ;
      T005O24_A65ArtCod = new String[] {""} ;
      T005O24_A583IntCod = new byte[1] ;
      T005O24_A1728MinPreLin = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T005O25_A279CliNom = new String[] {""} ;
      T005O26_A69ArtDsc = new String[] {""} ;
      T005O26_n69ArtDsc = new boolean[] {false} ;
      T005O27_A396EmprCod = new String[] {""} ;
      T005O28_A584IntDsc = new String[] {""} ;
      T005O28_n584IntDsc = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ1504CliProCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ279CliNom = "" ;
      ZZ69ArtDsc = "" ;
      ZZ584IntDsc = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.trecpil__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.trecpil__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.trecpil__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trecpil__default(),
         new Object[] {
             new Object[] {
            T005O2_A252CliCod, T005O2_A1504CliProCod, T005O2_A65ArtCod, T005O2_A1728MinPreLin, T005O2_A1731MinPreUni, T005O2_n1731MinPreUni, T005O2_A1726MaxPreUni, T005O2_n1726MaxPreUni, T005O2_A1727MinPreKgm, T005O2_n1727MinPreKgm,
            T005O2_A1729MinPreMtr, T005O2_n1729MinPreMtr, T005O2_A396EmprCod, T005O2_A583IntCod
            }
            , new Object[] {
            T005O3_A252CliCod, T005O3_A1504CliProCod, T005O3_A65ArtCod, T005O3_A1728MinPreLin, T005O3_A1731MinPreUni, T005O3_n1731MinPreUni, T005O3_A1726MaxPreUni, T005O3_n1726MaxPreUni, T005O3_A1727MinPreKgm, T005O3_n1727MinPreKgm,
            T005O3_A1729MinPreMtr, T005O3_n1729MinPreMtr, T005O3_A396EmprCod, T005O3_A583IntCod
            }
            , new Object[] {
            T005O4_A1730MinPreULin, T005O4_n1730MinPreULin, T005O4_A396EmprCod, T005O4_A252CliCod, T005O4_A65ArtCod, T005O4_A583IntCod, T005O4_A1504CliProCod
            }
            , new Object[] {
            T005O5_A1730MinPreULin, T005O5_n1730MinPreULin, T005O5_A396EmprCod, T005O5_A252CliCod, T005O5_A65ArtCod, T005O5_A583IntCod, T005O5_A1504CliProCod
            }
            , new Object[] {
            T005O6_A279CliNom
            }
            , new Object[] {
            T005O7_A69ArtDsc, T005O7_n69ArtDsc
            }
            , new Object[] {
            T005O8_A584IntDsc, T005O8_n584IntDsc
            }
            , new Object[] {
            T005O9_A396EmprCod
            }
            , new Object[] {
            T005O10_A1730MinPreULin, T005O10_n1730MinPreULin, T005O10_A279CliNom, T005O10_A69ArtDsc, T005O10_n69ArtDsc, T005O10_A584IntDsc, T005O10_n584IntDsc, T005O10_A396EmprCod, T005O10_A252CliCod, T005O10_A65ArtCod,
            T005O10_A583IntCod, T005O10_A1504CliProCod
            }
            , new Object[] {
            T005O11_A396EmprCod, T005O11_A252CliCod, T005O11_A1504CliProCod, T005O11_A65ArtCod, T005O11_A583IntCod
            }
            , new Object[] {
            T005O12_A396EmprCod, T005O12_A252CliCod, T005O12_A1504CliProCod, T005O12_A65ArtCod, T005O12_A583IntCod
            }
            , new Object[] {
            T005O13_A396EmprCod, T005O13_A252CliCod, T005O13_A1504CliProCod, T005O13_A65ArtCod, T005O13_A583IntCod
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
            T005O18_A396EmprCod, T005O18_A252CliCod, T005O18_A1504CliProCod, T005O18_A65ArtCod, T005O18_A583IntCod
            }
            , new Object[] {
            T005O19_A252CliCod, T005O19_A1504CliProCod, T005O19_A65ArtCod, T005O19_A1728MinPreLin, T005O19_A1731MinPreUni, T005O19_n1731MinPreUni, T005O19_A1726MaxPreUni, T005O19_n1726MaxPreUni, T005O19_A1727MinPreKgm, T005O19_n1727MinPreKgm,
            T005O19_A1729MinPreMtr, T005O19_n1729MinPreMtr, T005O19_A396EmprCod, T005O19_A583IntCod
            }
            , new Object[] {
            T005O20_A396EmprCod, T005O20_A252CliCod, T005O20_A1504CliProCod, T005O20_A65ArtCod, T005O20_A583IntCod, T005O20_A1728MinPreLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T005O24_A396EmprCod, T005O24_A252CliCod, T005O24_A1504CliProCod, T005O24_A65ArtCod, T005O24_A583IntCod, T005O24_A1728MinPreLin
            }
            , new Object[] {
            T005O25_A279CliNom
            }
            , new Object[] {
            T005O26_A69ArtDsc, T005O26_n69ArtDsc
            }
            , new Object[] {
            T005O27_A396EmprCod
            }
            , new Object[] {
            T005O28_A584IntDsc, T005O28_n584IntDsc
            }
         }
      );
      Z583IntCod = (byte)(0) ;
      A583IntCod = (byte)(0) ;
      Z65ArtCod = "" ;
      A65ArtCod = "" ;
      Z1504CliProCod = "" ;
      A1504CliProCod = "" ;
      Z252CliCod = 0 ;
      A252CliCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte wcpOA583IntCod ;
   private byte Z583IntCod ;
   private byte Z1730MinPreULin ;
   private byte O1730MinPreULin ;
   private byte Z1728MinPreLin ;
   private byte GxWebError ;
   private byte A583IntCod ;
   private byte nKeyPressed ;
   private byte A1730MinPreULin ;
   private byte Gx_BScreen ;
   private byte B1730MinPreULin ;
   private byte s1730MinPreULin ;
   private byte A1728MinPreLin ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i1730MinPreULin ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ583IntCod ;
   private byte ZZ1730MinPreULin ;
   private byte ZO1730MinPreULin ;
   private short nRcdDeleted_236 ;
   private short nRcdExists_236 ;
   private short nIsMod_236 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount236 ;
   private short RcdFound236 ;
   private short nBlankRcdUsr236 ;
   private short RcdFound213 ;
   private short nIsDirty_213 ;
   private short nIsDirty_236 ;
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
   private int edtCliCod_Enabled ;
   private int edtCliProCod_Enabled ;
   private int edtArtCod_Enabled ;
   private int edtIntCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtMinPreULin_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtArtDsc_Enabled ;
   private int edtIntDsc_Enabled ;
   private int edtavnRcdDeleted_236_Enabled ;
   private int edtMinPreLin_Enabled ;
   private int edtMinPreUni_Enabled ;
   private int edtMaxPreUni_Enabled ;
   private int edtMinPreKgm_Enabled ;
   private int edtMinPreMtr_Enabled ;
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
   private int defedtMinPreLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtIntDsc_Backcolor ;
   private int edtArtDsc_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtMinPreULin_Backcolor ;
   private int edtIntCod_Backcolor ;
   private int edtArtCod_Backcolor ;
   private int edtCliProCod_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z1731MinPreUni ;
   private java.math.BigDecimal Z1726MaxPreUni ;
   private java.math.BigDecimal Z1727MinPreKgm ;
   private java.math.BigDecimal Z1729MinPreMtr ;
   private java.math.BigDecimal A1731MinPreUni ;
   private java.math.BigDecimal A1726MaxPreUni ;
   private java.math.BigDecimal A1727MinPreKgm ;
   private java.math.BigDecimal A1729MinPreMtr ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA1504CliProCod ;
   private String wcpOA65ArtCod ;
   private String Z396EmprCod ;
   private String Z1504CliProCod ;
   private String Z65ArtCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A1504CliProCod ;
   private String A65ArtCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_65_idx="0001" ;
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
   private String edtCliProCod_Internalname ;
   private String edtCliProCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtArtCod_Internalname ;
   private String edtArtCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtIntCod_Internalname ;
   private String edtIntCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtMinPreULin_Internalname ;
   private String edtMinPreULin_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtArtDsc_Internalname ;
   private String A69ArtDsc ;
   private String edtArtDsc_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtIntDsc_Internalname ;
   private String A584IntDsc ;
   private String edtIntDsc_Jsonclick ;
   private String sMode236 ;
   private String Gx_mode ;
   private String edtavnRcdDeleted_236_Internalname ;
   private String edtMinPreLin_Title ;
   private String edtMinPreLin_Internalname ;
   private String edtMinPreUni_Title ;
   private String edtMinPreUni_Internalname ;
   private String edtMaxPreUni_Title ;
   private String edtMaxPreUni_Internalname ;
   private String edtMinPreKgm_Title ;
   private String edtMinPreKgm_Internalname ;
   private String edtMinPreMtr_Title ;
   private String edtMinPreMtr_Internalname ;
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
   private String AV35Lit7 ;
   private String AV36Lit8 ;
   private String AV37Lit9 ;
   private String AV20Lit10 ;
   private String AV21Lit11 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode213 ;
   private String AV39Station ;
   private String GXv_char1[] ;
   private String AV38EmprNom ;
   private String AV17UsurCod ;
   private String AV16Lit0 ;
   private String AV18LitFe ;
   private String AV19Lit1 ;
   private String AV31Lit3 ;
   private String AV32Lit4 ;
   private String AV33Lit5 ;
   private String AV34Lit6 ;
   private String GXt_char5 ;
   private String GXv_char3[] ;
   private String GXt_char4 ;
   private String GXv_char2[] ;
   private String Z279CliNom ;
   private String Z69ArtDsc ;
   private String Z584IntDsc ;
   private String GXCCtl ;
   private String sGXsfl_65_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_236_Jsonclick ;
   private String edtMinPreLin_Jsonclick ;
   private String edtMinPreUni_Jsonclick ;
   private String edtMaxPreUni_Jsonclick ;
   private String edtMinPreKgm_Jsonclick ;
   private String edtMinPreMtr_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ1504CliProCod ;
   private String ZZ65ArtCod ;
   private String ZZ279CliNom ;
   private String ZZ69ArtDsc ;
   private String ZZ584IntDsc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n1730MinPreULin ;
   private boolean bGXsfl_65_Refreshing=false ;
   private boolean n69ArtDsc ;
   private boolean n584IntDsc ;
   private boolean returnInSub ;
   private boolean n1731MinPreUni ;
   private boolean n1726MaxPreUni ;
   private boolean n1727MinPreKgm ;
   private boolean n1729MinPreMtr ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T005O6_A279CliNom ;
   private String[] T005O7_A69ArtDsc ;
   private boolean[] T005O7_n69ArtDsc ;
   private String[] T005O9_A396EmprCod ;
   private String[] T005O8_A584IntDsc ;
   private boolean[] T005O8_n584IntDsc ;
   private byte[] T005O10_A1730MinPreULin ;
   private boolean[] T005O10_n1730MinPreULin ;
   private String[] T005O10_A279CliNom ;
   private String[] T005O10_A69ArtDsc ;
   private boolean[] T005O10_n69ArtDsc ;
   private String[] T005O10_A584IntDsc ;
   private boolean[] T005O10_n584IntDsc ;
   private String[] T005O10_A396EmprCod ;
   private int[] T005O10_A252CliCod ;
   private String[] T005O10_A65ArtCod ;
   private byte[] T005O10_A583IntCod ;
   private String[] T005O10_A1504CliProCod ;
   private String[] T005O11_A396EmprCod ;
   private int[] T005O11_A252CliCod ;
   private String[] T005O11_A1504CliProCod ;
   private String[] T005O11_A65ArtCod ;
   private byte[] T005O11_A583IntCod ;
   private byte[] T005O5_A1730MinPreULin ;
   private boolean[] T005O5_n1730MinPreULin ;
   private String[] T005O5_A396EmprCod ;
   private int[] T005O5_A252CliCod ;
   private String[] T005O5_A65ArtCod ;
   private byte[] T005O5_A583IntCod ;
   private String[] T005O5_A1504CliProCod ;
   private String[] T005O12_A396EmprCod ;
   private int[] T005O12_A252CliCod ;
   private String[] T005O12_A1504CliProCod ;
   private String[] T005O12_A65ArtCod ;
   private byte[] T005O12_A583IntCod ;
   private String[] T005O13_A396EmprCod ;
   private int[] T005O13_A252CliCod ;
   private String[] T005O13_A1504CliProCod ;
   private String[] T005O13_A65ArtCod ;
   private byte[] T005O13_A583IntCod ;
   private byte[] T005O4_A1730MinPreULin ;
   private boolean[] T005O4_n1730MinPreULin ;
   private String[] T005O4_A396EmprCod ;
   private int[] T005O4_A252CliCod ;
   private String[] T005O4_A65ArtCod ;
   private byte[] T005O4_A583IntCod ;
   private String[] T005O4_A1504CliProCod ;
   private String[] T005O18_A396EmprCod ;
   private int[] T005O18_A252CliCod ;
   private String[] T005O18_A1504CliProCod ;
   private String[] T005O18_A65ArtCod ;
   private byte[] T005O18_A583IntCod ;
   private int[] T005O19_A252CliCod ;
   private String[] T005O19_A1504CliProCod ;
   private String[] T005O19_A65ArtCod ;
   private byte[] T005O19_A1728MinPreLin ;
   private java.math.BigDecimal[] T005O19_A1731MinPreUni ;
   private boolean[] T005O19_n1731MinPreUni ;
   private java.math.BigDecimal[] T005O19_A1726MaxPreUni ;
   private boolean[] T005O19_n1726MaxPreUni ;
   private java.math.BigDecimal[] T005O19_A1727MinPreKgm ;
   private boolean[] T005O19_n1727MinPreKgm ;
   private java.math.BigDecimal[] T005O19_A1729MinPreMtr ;
   private boolean[] T005O19_n1729MinPreMtr ;
   private String[] T005O19_A396EmprCod ;
   private byte[] T005O19_A583IntCod ;
   private String[] T005O20_A396EmprCod ;
   private int[] T005O20_A252CliCod ;
   private String[] T005O20_A1504CliProCod ;
   private String[] T005O20_A65ArtCod ;
   private byte[] T005O20_A583IntCod ;
   private byte[] T005O20_A1728MinPreLin ;
   private int[] T005O3_A252CliCod ;
   private String[] T005O3_A1504CliProCod ;
   private String[] T005O3_A65ArtCod ;
   private byte[] T005O3_A1728MinPreLin ;
   private java.math.BigDecimal[] T005O3_A1731MinPreUni ;
   private boolean[] T005O3_n1731MinPreUni ;
   private java.math.BigDecimal[] T005O3_A1726MaxPreUni ;
   private boolean[] T005O3_n1726MaxPreUni ;
   private java.math.BigDecimal[] T005O3_A1727MinPreKgm ;
   private boolean[] T005O3_n1727MinPreKgm ;
   private java.math.BigDecimal[] T005O3_A1729MinPreMtr ;
   private boolean[] T005O3_n1729MinPreMtr ;
   private String[] T005O3_A396EmprCod ;
   private byte[] T005O3_A583IntCod ;
   private int[] T005O2_A252CliCod ;
   private String[] T005O2_A1504CliProCod ;
   private String[] T005O2_A65ArtCod ;
   private byte[] T005O2_A1728MinPreLin ;
   private java.math.BigDecimal[] T005O2_A1731MinPreUni ;
   private boolean[] T005O2_n1731MinPreUni ;
   private java.math.BigDecimal[] T005O2_A1726MaxPreUni ;
   private boolean[] T005O2_n1726MaxPreUni ;
   private java.math.BigDecimal[] T005O2_A1727MinPreKgm ;
   private boolean[] T005O2_n1727MinPreKgm ;
   private java.math.BigDecimal[] T005O2_A1729MinPreMtr ;
   private boolean[] T005O2_n1729MinPreMtr ;
   private String[] T005O2_A396EmprCod ;
   private byte[] T005O2_A583IntCod ;
   private String[] T005O24_A396EmprCod ;
   private int[] T005O24_A252CliCod ;
   private String[] T005O24_A1504CliProCod ;
   private String[] T005O24_A65ArtCod ;
   private byte[] T005O24_A583IntCod ;
   private byte[] T005O24_A1728MinPreLin ;
   private String[] T005O25_A279CliNom ;
   private String[] T005O26_A69ArtDsc ;
   private boolean[] T005O26_n69ArtDsc ;
   private String[] T005O27_A396EmprCod ;
   private String[] T005O28_A584IntDsc ;
   private boolean[] T005O28_n584IntDsc ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class trecpil__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trecpil__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trecpil__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trecpil__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T005O2", "SELECT CliCod, CliProCod, ArtCod, MinPreLin, MinPreUni, MaxPreUni, MinPreKgm, MinPreMtr, EmprCod, IntCod FROM TXPRECPIL WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND IntCod = ? AND MinPreLin = ?  FOR UPDATE OF MinPreUni, MaxPreUni, MinPreKgm, MinPreMtr NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005O3", "SELECT CliCod, CliProCod, ArtCod, MinPreLin, MinPreUni, MaxPreUni, MinPreKgm, MinPreMtr, EmprCod, IntCod FROM TXPRECPIL WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND IntCod = ? AND MinPreLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005O4", "SELECT MinPreULin, EmprCod, CliCod, ArtCod, IntCod, CliProCod FROM TXPLPREPR WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND IntCod = ?  FOR UPDATE OF MinPreULin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005O5", "SELECT MinPreULin, EmprCod, CliCod, ArtCod, IntCod, CliProCod FROM TXPLPREPR WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005O6", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005O7", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005O8", "SELECT IntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005O9", "SELECT EmprCod FROM TXPCPREPR WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005O10", "SELECT /*+ FIRST_ROWS(1) */ TM1.MinPreULin, T2.CliNom, T3.ArtDsc, T4.IntDsc, TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.IntCod, TM1.CliProCod FROM (((TXPLPREPR TM1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = TM1.EmprCod AND T2.CliCod = TM1.CliCod) INNER JOIN TXPARTICU T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod AND T3.ArtCod = TM1.ArtCod) INNER JOIN TXPINTENS T4 ON T4.EmprCod = TM1.EmprCod AND T4.IntCod = TM1.IntCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.CliProCod = ? and TM1.ArtCod = ? and TM1.IntCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.CliProCod, TM1.ArtCod, TM1.IntCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005O11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, CliProCod, ArtCod, IntCod FROM TXPLPREPR WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005O12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, CliProCod, ArtCod, IntCod FROM TXPLPREPR WHERE EmprCod = ? and CliCod = ? and CliProCod = ? and ArtCod = ? and IntCod = ? ORDER BY EmprCod, CliCod, CliProCod, ArtCod, IntCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005O13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, CliProCod, ArtCod, IntCod FROM TXPLPREPR WHERE EmprCod = ? and CliCod = ? and CliProCod = ? and ArtCod = ? and IntCod = ? ORDER BY EmprCod DESC, CliCod DESC, CliProCod DESC, ArtCod DESC, IntCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T005O14", "INSERT INTO TXPLPREPR(MinPreULin, EmprCod, CliCod, ArtCod, IntCod, CliProCod, ProPreMtr, ProPreKgm, ProPreDcM, ProPreDcK, ProPreFAc, ProPreFAn, ProPreMAn, ProPreKAn) VALUES(?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0)", GX_NOMASK, "TXPLPREPR")
         ,new UpdateCursor("T005O15", "UPDATE TXPLPREPR SET MinPreULin=?  WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND IntCod = ?", GX_NOMASK, "TXPLPREPR")
         ,new UpdateCursor("T005O16", "DELETE FROM TXPLPREPR  WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND IntCod = ?", GX_NOMASK, "TXPLPREPR")
         ,new UpdateCursor("T005O17", "UPDATE TXPLPREPR SET MinPreULin=?  WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND IntCod = ?", GX_NOMASK, "TXPLPREPR")
         ,new ForEachCursor("T005O18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, CliProCod, ArtCod, IntCod FROM TXPLPREPR WHERE EmprCod = ? and CliCod = ? and CliProCod = ? and ArtCod = ? and IntCod = ? ORDER BY EmprCod, CliCod, CliProCod, ArtCod, IntCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005O19", "SELECT CliCod, CliProCod, ArtCod, MinPreLin, MinPreUni, MaxPreUni, MinPreKgm, MinPreMtr, EmprCod, IntCod FROM TXPRECPIL WHERE EmprCod = ? and CliCod = ? and CliProCod = ? and ArtCod = ? and IntCod = ? and MinPreLin = ? ORDER BY EmprCod, CliCod, CliProCod, ArtCod, IntCod, MinPreLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005O20", "SELECT EmprCod, CliCod, CliProCod, ArtCod, IntCod, MinPreLin FROM TXPRECPIL WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND IntCod = ? AND MinPreLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T005O21", "INSERT INTO TXPRECPIL(CliCod, CliProCod, ArtCod, MinPreLin, MinPreUni, MaxPreUni, MinPreKgm, MinPreMtr, EmprCod, IntCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPRECPIL")
         ,new UpdateCursor("T005O22", "UPDATE TXPRECPIL SET MinPreUni=?, MaxPreUni=?, MinPreKgm=?, MinPreMtr=?  WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND IntCod = ? AND MinPreLin = ?", GX_NOMASK, "TXPRECPIL")
         ,new UpdateCursor("T005O23", "DELETE FROM TXPRECPIL  WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND IntCod = ? AND MinPreLin = ?", GX_NOMASK, "TXPRECPIL")
         ,new ForEachCursor("T005O24", "SELECT EmprCod, CliCod, CliProCod, ArtCod, IntCod, MinPreLin FROM TXPRECPIL WHERE EmprCod = ? and CliCod = ? and CliProCod = ? and ArtCod = ? and IntCod = ? ORDER BY EmprCod, CliCod, CliProCod, ArtCod, IntCod, MinPreLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005O25", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005O26", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005O27", "SELECT EmprCod FROM TXPCPREPR WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005O28", "SELECT IntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 16);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 8);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 17 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 26 :
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 12 :
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
               stmt.setString(4, (String)parms[4], 16);
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 8);
               return;
            case 13 :
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
               stmt.setString(4, (String)parms[4], 8);
               stmt.setString(5, (String)parms[5], 16);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
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
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 8);
               stmt.setString(5, (String)parms[5], 16);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 19 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 5);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[11], 5);
               }
               stmt.setString(9, (String)parms[12], 3);
               stmt.setByte(10, ((Number) parms[13]).byteValue());
               return;
            case 20 :
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
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 5);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 5);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setString(7, (String)parms[10], 8);
               stmt.setString(8, (String)parms[11], 16);
               stmt.setByte(9, ((Number) parms[12]).byteValue());
               stmt.setByte(10, ((Number) parms[13]).byteValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

