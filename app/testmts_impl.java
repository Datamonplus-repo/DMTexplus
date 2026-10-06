package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class testmts_impl extends GXDataArea
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
            A65ArtCod = httpContext.GetPar( "ArtCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A499GrpFamCod = (byte)(GXutil.lval( httpContext.GetPar( "GrpFamCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A499GrpFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A499GrpFamCod), 2, 0));
            A13168NumCilLin = (short)(GXutil.lval( httpContext.GetPar( "NumCilLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13168NumCilLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13168NumCilLin), 4, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tarifas Estampacion, Intervalo Metros", ""), (short)(0)) ;
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
      nRC_GXsfl_79 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_79"))) ;
      nGXsfl_79_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_79_idx"))) ;
      sGXsfl_79_idx = httpContext.GetPar( "sGXsfl_79_idx") ;
      A13175MtsLinUlt = (short)(GXutil.lval( httpContext.GetPar( "MtsLinUlt"))) ;
      n13175MtsLinUlt = false ;
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

   public testmts_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public testmts_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( testmts_impl.class ));
   }

   public testmts_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEstMts.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEstMts.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEstMts.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEstMts.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TEstMts.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEstMts.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEstMts.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEstMts.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEstMts.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEstMts.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEstMts.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEstMts.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEstMts.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEstMts.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEstMts.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion Articulo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEstMts.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEstMts.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Codigo Familia", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEstMts.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGrpFamCod_Internalname, GXutil.ltrim( localUtil.ntoc( A499GrpFamCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGrpFamCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A499GrpFamCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A499GrpFamCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGrpFamCod_Jsonclick, 0, "", "", "", "", "", 1, edtGrpFamCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEstMts.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Descripcion Familia", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEstMts.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGrpFamDsc_Internalname, GXutil.rtrim( A500GrpFamDsc), GXutil.rtrim( localUtil.format( A500GrpFamDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGrpFamDsc_Jsonclick, 0, "", "", "", "", "", 1, edtGrpFamDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEstMts.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtNumCilLin_Internalname, GXutil.ltrim( localUtil.ntoc( A13168NumCilLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNumCilLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13168NumCilLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13168NumCilLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNumCilLin_Jsonclick, 0, "", "", "", "", "", 1, edtNumCilLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEstMts.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEstMts.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Num Cil Min", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEstMts.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtNumCilMin_Internalname, GXutil.ltrim( localUtil.ntoc( A13169NumCilMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNumCilMin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13169NumCilMin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13169NumCilMin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNumCilMin_Jsonclick, 0, "", "", "", "", "", 1, edtNumCilMin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEstMts.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Numero Cilindros Maximos", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEstMts.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtNumCilMax_Internalname, GXutil.ltrim( localUtil.ntoc( A13170NumCilMax, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNumCilMax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13170NumCilMax), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13170NumCilMax), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNumCilMax_Jsonclick, 0, "", "", "", "", "", 1, edtNumCilMax_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEstMts.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Ultima linea Metros Intervalo", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEstMts.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMtsLinUlt_Internalname, GXutil.ltrim( localUtil.ntoc( A13175MtsLinUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMtsLinUlt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13175MtsLinUlt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13175MtsLinUlt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMtsLinUlt_Jsonclick, 0, "", "", "", "", "", 1, edtMtsLinUlt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEstMts.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol79( ) ;
      nGXsfl_79_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1802 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1802 = (short)(1) ;
            scanStart1N21802( ) ;
            while ( RcdFound1802 != 0 )
            {
               init_level_properties1802( ) ;
               getByPrimaryKey1N21802( ) ;
               addRow1N21802( ) ;
               scanNext1N21802( ) ;
            }
            scanEnd1N21802( ) ;
            nBlankRcdCount1802 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B13175MtsLinUlt = A13175MtsLinUlt ;
         n13175MtsLinUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
         standaloneNotModal1N21802( ) ;
         standaloneModal1N21802( ) ;
         sMode1802 = Gx_mode ;
         while ( nGXsfl_79_idx < nRC_GXsfl_79 )
         {
            bGXsfl_79_Refreshing = true ;
            readRow1N21802( ) ;
            edtavnRcdDeleted_1802_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1802_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1802_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1802_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtMtsLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MTSLIN_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMtsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtsLin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtMtsMin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MTSMIN_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMtsMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtsMin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtMtsMax_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MTSMAX_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMtsMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtsMax_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtMtsPrecio_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MTSPRECIO_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMtsPrecio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtsPrecio_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            if ( ( nRcdExists_1802 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1N21802( ) ;
            }
            sendRow1N21802( ) ;
            bGXsfl_79_Refreshing = false ;
         }
         Gx_mode = sMode1802 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A13175MtsLinUlt = B13175MtsLinUlt ;
         n13175MtsLinUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1802 = (short)(5) ;
         nRcdExists_1802 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1N21802( ) ;
            while ( RcdFound1802 != 0 )
            {
               sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_791802( ) ;
               init_level_properties1802( ) ;
               standaloneNotModal1N21802( ) ;
               getByPrimaryKey1N21802( ) ;
               standaloneModal1N21802( ) ;
               addRow1N21802( ) ;
               scanNext1N21802( ) ;
            }
            scanEnd1N21802( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1802 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_791802( ) ;
      initAll1N21802( ) ;
      init_level_properties1802( ) ;
      B13175MtsLinUlt = A13175MtsLinUlt ;
      n13175MtsLinUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
      nRcdExists_1802 = (short)(0) ;
      nIsMod_1802 = (short)(0) ;
      nRcdDeleted_1802 = (short)(0) ;
      nBlankRcdCount1802 = (short)(nBlankRcdUsr1802+nBlankRcdCount1802) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1802 > 0 )
      {
         standaloneNotModal1N21802( ) ;
         standaloneModal1N21802( ) ;
         addRow1N21802( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMtsLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1802 = (short)(nBlankRcdCount1802-1) ;
      }
      Gx_mode = sMode1802 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A13175MtsLinUlt = B13175MtsLinUlt ;
      n13175MtsLinUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEstMts.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEstMts.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEstMts.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEstMts.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TEstMts.htm");
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
      e111N22 ();
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
            Z499GrpFamCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z499GrpFamCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13168NumCilLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z13168NumCilLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13169NumCilMin = (short)(localUtil.ctol( httpContext.cgiGet( "Z13169NumCilMin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13170NumCilMax = (short)(localUtil.ctol( httpContext.cgiGet( "Z13170NumCilMax"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13175MtsLinUlt = (short)(localUtil.ctol( httpContext.cgiGet( "Z13175MtsLinUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O13175MtsLinUlt = (short)(localUtil.ctol( httpContext.cgiGet( "O13175MtsLinUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_79 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_79"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            A499GrpFamCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtGrpFamCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A499GrpFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A499GrpFamCod), 2, 0));
            A500GrpFamDsc = httpContext.cgiGet( edtGrpFamDsc_Internalname) ;
            n500GrpFamDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A500GrpFamDsc", A500GrpFamDsc);
            A13168NumCilLin = (short)(localUtil.ctol( httpContext.cgiGet( edtNumCilLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13168NumCilLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13168NumCilLin), 4, 0));
            A13169NumCilMin = (short)(localUtil.ctol( httpContext.cgiGet( edtNumCilMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13169NumCilMin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13169NumCilMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13169NumCilMin), 4, 0));
            A13170NumCilMax = (short)(localUtil.ctol( httpContext.cgiGet( edtNumCilMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13170NumCilMax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13170NumCilMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13170NumCilMax), 4, 0));
            A13175MtsLinUlt = (short)(localUtil.ctol( httpContext.cgiGet( edtMtsLinUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13175MtsLinUlt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TEstMts");
            A13169NumCilMin = (short)(localUtil.ctol( httpContext.cgiGet( edtNumCilMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13169NumCilMin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13169NumCilMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13169NumCilMin), 4, 0));
            forbiddenHiddens.add("NumCilMin", localUtil.format( DecimalUtil.doubleToDec(A13169NumCilMin), "ZZZ9"));
            A13170NumCilMax = (short)(localUtil.ctol( httpContext.cgiGet( edtNumCilMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13170NumCilMax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13170NumCilMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13170NumCilMax), 4, 0));
            forbiddenHiddens.add("NumCilMax", localUtil.format( DecimalUtil.doubleToDec(A13170NumCilMax), "ZZZ9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("testmts:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = httpContext.GetPar( "ArtCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A499GrpFamCod = (byte)(GXutil.lval( httpContext.GetPar( "GrpFamCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A499GrpFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A499GrpFamCod), 2, 0));
               A13168NumCilLin = (short)(GXutil.lval( httpContext.GetPar( "NumCilLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13168NumCilLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13168NumCilLin), 4, 0));
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
                        e111N22 ();
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
            initAll1N21801( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1802_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1802_Enabled), 5, 0), !bGXsfl_79_Refreshing);
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
      disableAttributes1N21801( ) ;
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

   public void confirm_1N20( )
   {
      beforeValidate1N21801( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1N21801( ) ;
         }
         else
         {
            checkExtendedTable1N21801( ) ;
            if ( AnyError == 0 )
            {
               zm1N21801( 8) ;
               zm1N21801( 9) ;
               zm1N21801( 10) ;
               zm1N21801( 11) ;
               zm1N21801( 12) ;
            }
            closeExtendedTableCursors1N21801( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1801 = Gx_mode ;
         confirm_1N21802( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1801 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1801 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1N20( ) ;
      }
   }

   public void confirm_1N21802( )
   {
      s13175MtsLinUlt = O13175MtsLinUlt ;
      n13175MtsLinUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
      nGXsfl_79_idx = 0 ;
      while ( nGXsfl_79_idx < nRC_GXsfl_79 )
      {
         readRow1N21802( ) ;
         if ( ( nRcdExists_1802 != 0 ) || ( nIsMod_1802 != 0 ) )
         {
            getKey1N21802( ) ;
            if ( ( nRcdExists_1802 == 0 ) && ( nRcdDeleted_1802 == 0 ) )
            {
               if ( RcdFound1802 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1N21802( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1N21802( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1N21802( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O13175MtsLinUlt = A13175MtsLinUlt ;
                     n13175MtsLinUlt = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "MTSLIN_" + sGXsfl_79_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMtsLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1802 != 0 )
               {
                  if ( nRcdDeleted_1802 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1N21802( ) ;
                     load1N21802( ) ;
                     beforeValidate1N21802( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1N21802( ) ;
                        O13175MtsLinUlt = A13175MtsLinUlt ;
                        n13175MtsLinUlt = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1802 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1N21802( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1N21802( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1N21802( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O13175MtsLinUlt = A13175MtsLinUlt ;
                           n13175MtsLinUlt = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1802 == 0 )
                  {
                     GXCCtl = "MTSLIN_" + sGXsfl_79_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMtsLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1802_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1802, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMtsLin_Internalname, GXutil.ltrim( localUtil.ntoc( A13171MtsLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMtsMin_Internalname, GXutil.ltrim( localUtil.ntoc( A13172MtsMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMtsMax_Internalname, GXutil.ltrim( localUtil.ntoc( A13173MtsMax, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMtsPrecio_Internalname, GXutil.ltrim( localUtil.ntoc( A13174MtsPrecio, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13171MtsLin_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z13171MtsLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13172MtsMin_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z13172MtsMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13173MtsMax_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z13173MtsMax, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13174MtsPrecio_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z13174MtsPrecio, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1802_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1802, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1802_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1802, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1802_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1802, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1802 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1802_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1802_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MTSLIN_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtsLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MTSMIN_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtsMin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MTSMAX_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtsMax_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MTSPRECIO_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtsPrecio_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O13175MtsLinUlt = s13175MtsLinUlt ;
      n13175MtsLinUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1N20( )
   {
   }

   public void e111N22( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      testmts_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV34Pgmname, (byte)(99), GXv_char2) ;
      testmts_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      testmts_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      testmts_impl.this.A396EmprCod = GXv_char2[0] ;
      testmts_impl.this.AV11EmprNom = GXv_char3[0] ;
      testmts_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1N21801( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13169NumCilMin = T01N25_A13169NumCilMin[0] ;
            Z13170NumCilMax = T01N25_A13170NumCilMax[0] ;
            Z13175MtsLinUlt = T01N25_A13175MtsLinUlt[0] ;
         }
         else
         {
            Z13169NumCilMin = A13169NumCilMin ;
            Z13170NumCilMax = A13170NumCilMax ;
            Z13175MtsLinUlt = A13175MtsLinUlt ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z13168NumCilLin = A13168NumCilLin ;
         Z13169NumCilMin = A13169NumCilMin ;
         Z13170NumCilMax = A13170NumCilMax ;
         Z13175MtsLinUlt = A13175MtsLinUlt ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z499GrpFamCod = A499GrpFamCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z69ArtDsc = A69ArtDsc ;
         Z500GrpFamDsc = A500GrpFamDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtMtsLinUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtsLinUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtsLinUlt_Enabled), 5, 0), true);
      edtNumCilMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNumCilMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNumCilMin_Enabled), 5, 0), true);
      edtNumCilMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNumCilMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNumCilMax_Enabled), 5, 0), true);
      AV34Pgmname = "TEstMts" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtMtsLinUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtsLinUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtsLinUlt_Enabled), 5, 0), true);
      edtNumCilMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNumCilMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNumCilMin_Enabled), 5, 0), true);
      edtNumCilMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNumCilMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNumCilMax_Enabled), 5, 0), true);
      /* Using cursor T01N26 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01N26_A407EmprNom[0] ;
      n407EmprNom = T01N26_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01N27 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01N27_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
      /* Using cursor T01N28 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
      A69ArtDsc = T01N28_A69ArtDsc[0] ;
      n69ArtDsc = T01N28_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(6);
      /* Using cursor T01N29 */
      pr_default.execute(7, new Object[] {A396EmprCod, Byte.valueOf(A499GrpFamCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRUFAM", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRPFAMCOD");
         AnyError = (short)(1) ;
      }
      A500GrpFamDsc = T01N29_A500GrpFamDsc[0] ;
      n500GrpFamDsc = T01N29_n500GrpFamDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A500GrpFamDsc", A500GrpFamDsc);
      pr_default.close(7);
      /* Using cursor T01N210 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A499GrpFamCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Familia Productos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRPFAMCOD");
         AnyError = (short)(1) ;
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

   public void load1N21801( )
   {
      /* Using cursor T01N211 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A499GrpFamCod), Short.valueOf(A13168NumCilLin)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1801 = (short)(1) ;
         A407EmprNom = T01N211_A407EmprNom[0] ;
         n407EmprNom = T01N211_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01N211_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A69ArtDsc = T01N211_A69ArtDsc[0] ;
         n69ArtDsc = T01N211_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A500GrpFamDsc = T01N211_A500GrpFamDsc[0] ;
         n500GrpFamDsc = T01N211_n500GrpFamDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A500GrpFamDsc", A500GrpFamDsc);
         A13169NumCilMin = T01N211_A13169NumCilMin[0] ;
         n13169NumCilMin = T01N211_n13169NumCilMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13169NumCilMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13169NumCilMin), 4, 0));
         A13170NumCilMax = T01N211_A13170NumCilMax[0] ;
         n13170NumCilMax = T01N211_n13170NumCilMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13170NumCilMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13170NumCilMax), 4, 0));
         A13175MtsLinUlt = T01N211_A13175MtsLinUlt[0] ;
         n13175MtsLinUlt = T01N211_n13175MtsLinUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
         zm1N21801( -7) ;
      }
      pr_default.close(9);
      onLoadActions1N21801( ) ;
   }

   public void onLoadActions1N21801( )
   {
   }

   public void checkExtendedTable1N21801( )
   {
      nIsDirty_1801 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1N21801( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1N21801( )
   {
      /* Using cursor T01N212 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A499GrpFamCod), Short.valueOf(A13168NumCilLin)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1801 = (short)(1) ;
      }
      else
      {
         RcdFound1801 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01N25 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A499GrpFamCod), Short.valueOf(A13168NumCilLin)});
      if ( (pr_default.getStatus(3) != 101) && ( T01N25_A13168NumCilLin[0] == A13168NumCilLin ) && ( GXutil.strcmp(T01N25_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01N25_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01N25_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01N25_A499GrpFamCod[0] == A499GrpFamCod ) )
      {
         zm1N21801( 7) ;
         RcdFound1801 = (short)(1) ;
         A13169NumCilMin = T01N25_A13169NumCilMin[0] ;
         n13169NumCilMin = T01N25_n13169NumCilMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13169NumCilMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13169NumCilMin), 4, 0));
         A13170NumCilMax = T01N25_A13170NumCilMax[0] ;
         n13170NumCilMax = T01N25_n13170NumCilMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13170NumCilMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13170NumCilMax), 4, 0));
         A13175MtsLinUlt = T01N25_A13175MtsLinUlt[0] ;
         n13175MtsLinUlt = T01N25_n13175MtsLinUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
         O13175MtsLinUlt = A13175MtsLinUlt ;
         n13175MtsLinUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z499GrpFamCod = A499GrpFamCod ;
         Z13168NumCilLin = A13168NumCilLin ;
         sMode1801 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1N21801( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1801 = (short)(0) ;
            initializeNonKey1N21801( ) ;
         }
         Gx_mode = sMode1801 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1801 = (short)(0) ;
         initializeNonKey1N21801( ) ;
         sMode1801 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1801 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1N21801( ) ;
      if ( RcdFound1801 == 0 )
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
      RcdFound1801 = (short)(0) ;
      /* Using cursor T01N213 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A499GrpFamCod), Short.valueOf(A13168NumCilLin)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T01N213_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01N213_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01N213_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01N213_A499GrpFamCod[0] == A499GrpFamCod ) && ( T01N213_A13168NumCilLin[0] == A13168NumCilLin ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T01N213_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01N213_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01N213_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01N213_A499GrpFamCod[0] == A499GrpFamCod ) && ( T01N213_A13168NumCilLin[0] == A13168NumCilLin ) )
         {
            RcdFound1801 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound1801 = (short)(0) ;
      /* Using cursor T01N214 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A499GrpFamCod), Short.valueOf(A13168NumCilLin)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T01N214_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01N214_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01N214_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01N214_A499GrpFamCod[0] == A499GrpFamCod ) && ( T01N214_A13168NumCilLin[0] == A13168NumCilLin ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T01N214_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01N214_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01N214_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01N214_A499GrpFamCod[0] == A499GrpFamCod ) && ( T01N214_A13168NumCilLin[0] == A13168NumCilLin ) )
         {
            RcdFound1801 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1N21801( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A13175MtsLinUlt = O13175MtsLinUlt ;
         n13175MtsLinUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
         insert1N21801( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1801 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A499GrpFamCod != Z499GrpFamCod ) || ( A13168NumCilLin != Z13168NumCilLin ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A13175MtsLinUlt = O13175MtsLinUlt ;
               n13175MtsLinUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A13175MtsLinUlt = O13175MtsLinUlt ;
               n13175MtsLinUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
               update1N21801( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A499GrpFamCod != Z499GrpFamCod ) || ( A13168NumCilLin != Z13168NumCilLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A13175MtsLinUlt = O13175MtsLinUlt ;
               n13175MtsLinUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
               insert1N21801( ) ;
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
                  A13175MtsLinUlt = O13175MtsLinUlt ;
                  n13175MtsLinUlt = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
                  insert1N21801( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A499GrpFamCod != Z499GrpFamCod ) || ( A13168NumCilLin != Z13168NumCilLin ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A13175MtsLinUlt = O13175MtsLinUlt ;
         n13175MtsLinUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
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
      getKey1N21801( ) ;
      if ( RcdFound1801 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A499GrpFamCod != Z499GrpFamCod ) || ( A13168NumCilLin != Z13168NumCilLin ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A499GrpFamCod != Z499GrpFamCod ) || ( A13168NumCilLin != Z13168NumCilLin ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "testmts");
   }

   public void insert_check( )
   {
      confirm_1N20( ) ;
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
      if ( RcdFound1801 == 0 )
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
      scanStart1N21801( ) ;
      if ( RcdFound1801 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1N21801( ) ;
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
      if ( RcdFound1801 == 0 )
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
      if ( RcdFound1801 == 0 )
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
      scanStart1N21801( ) ;
      if ( RcdFound1801 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1801 != 0 )
         {
            scanNext1N21801( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1N21801( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1N21801( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01N24 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A499GrpFamCod), Short.valueOf(A13168NumCilLin)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEstTa1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z13169NumCilMin != T01N24_A13169NumCilMin[0] ) || ( Z13170NumCilMax != T01N24_A13170NumCilMax[0] ) || ( Z13175MtsLinUlt != T01N24_A13175MtsLinUlt[0] ) )
         {
            if ( Z13169NumCilMin != T01N24_A13169NumCilMin[0] )
            {
               GXutil.writeLogln("testmts:[seudo value changed for attri]"+"NumCilMin");
               GXutil.writeLogRaw("Old: ",Z13169NumCilMin);
               GXutil.writeLogRaw("Current: ",T01N24_A13169NumCilMin[0]);
            }
            if ( Z13170NumCilMax != T01N24_A13170NumCilMax[0] )
            {
               GXutil.writeLogln("testmts:[seudo value changed for attri]"+"NumCilMax");
               GXutil.writeLogRaw("Old: ",Z13170NumCilMax);
               GXutil.writeLogRaw("Current: ",T01N24_A13170NumCilMax[0]);
            }
            if ( Z13175MtsLinUlt != T01N24_A13175MtsLinUlt[0] )
            {
               GXutil.writeLogln("testmts:[seudo value changed for attri]"+"MtsLinUlt");
               GXutil.writeLogRaw("Old: ",Z13175MtsLinUlt);
               GXutil.writeLogRaw("Current: ",T01N24_A13175MtsLinUlt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPEstTa1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1N21801( )
   {
      beforeValidate1N21801( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N21801( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1N21801( 0) ;
         checkOptimisticConcurrency1N21801( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1N21801( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1N21801( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01N215 */
                  pr_default.execute(13, new Object[] {Short.valueOf(A13168NumCilLin), Boolean.valueOf(n13169NumCilMin), Short.valueOf(A13169NumCilMin), Boolean.valueOf(n13170NumCilMax), Short.valueOf(A13170NumCilMax), Boolean.valueOf(n13175MtsLinUlt), Short.valueOf(A13175MtsLinUlt), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A499GrpFamCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEstTa1");
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
                        processLevel1N21801( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1N20( ) ;
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
            load1N21801( ) ;
         }
         endLevel1N21801( ) ;
      }
      closeExtendedTableCursors1N21801( ) ;
   }

   public void update1N21801( )
   {
      beforeValidate1N21801( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N21801( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1N21801( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1N21801( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1N21801( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01N216 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n13169NumCilMin), Short.valueOf(A13169NumCilMin), Boolean.valueOf(n13170NumCilMax), Short.valueOf(A13170NumCilMax), Boolean.valueOf(n13175MtsLinUlt), Short.valueOf(A13175MtsLinUlt), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A499GrpFamCod), Short.valueOf(A13168NumCilLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEstTa1");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEstTa1"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1N21801( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1N21801( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1N20( ) ;
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
         endLevel1N21801( ) ;
      }
      closeExtendedTableCursors1N21801( ) ;
   }

   public void deferredUpdate1N21801( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1N21801( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1N21801( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1N21801( ) ;
         afterConfirm1N21801( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1N21801( ) ;
            if ( AnyError == 0 )
            {
               A13175MtsLinUlt = O13175MtsLinUlt ;
               n13175MtsLinUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
               scanStart1N21802( ) ;
               while ( RcdFound1802 != 0 )
               {
                  getByPrimaryKey1N21802( ) ;
                  delete1N21802( ) ;
                  scanNext1N21802( ) ;
                  O13175MtsLinUlt = A13175MtsLinUlt ;
                  n13175MtsLinUlt = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
               }
               scanEnd1N21802( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01N217 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A499GrpFamCod), Short.valueOf(A13168NumCilLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEstTa1");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1801 == 0 )
                        {
                           initAll1N21801( ) ;
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
                        resetCaption1N20( ) ;
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
      sMode1801 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1N21801( ) ;
      Gx_mode = sMode1801 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1N21801( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1N21802( )
   {
      s13175MtsLinUlt = O13175MtsLinUlt ;
      n13175MtsLinUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
      nGXsfl_79_idx = 0 ;
      while ( nGXsfl_79_idx < nRC_GXsfl_79 )
      {
         readRow1N21802( ) ;
         if ( ( nRcdExists_1802 != 0 ) || ( nIsMod_1802 != 0 ) )
         {
            standaloneNotModal1N21802( ) ;
            getKey1N21802( ) ;
            if ( ( nRcdExists_1802 == 0 ) && ( nRcdDeleted_1802 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1N21802( ) ;
            }
            else
            {
               if ( RcdFound1802 != 0 )
               {
                  if ( ( nRcdDeleted_1802 != 0 ) && ( nRcdExists_1802 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1N21802( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1802 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1N21802( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1802 == 0 )
                  {
                     GXCCtl = "MTSLIN_" + sGXsfl_79_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMtsLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O13175MtsLinUlt = A13175MtsLinUlt ;
            n13175MtsLinUlt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1802_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1802, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMtsLin_Internalname, GXutil.ltrim( localUtil.ntoc( A13171MtsLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMtsMin_Internalname, GXutil.ltrim( localUtil.ntoc( A13172MtsMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMtsMax_Internalname, GXutil.ltrim( localUtil.ntoc( A13173MtsMax, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMtsPrecio_Internalname, GXutil.ltrim( localUtil.ntoc( A13174MtsPrecio, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13171MtsLin_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z13171MtsLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13172MtsMin_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z13172MtsMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13173MtsMax_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z13173MtsMax, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13174MtsPrecio_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z13174MtsPrecio, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1802_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1802, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1802_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1802, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1802_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1802, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1802 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1802_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1802_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MTSLIN_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtsLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MTSMIN_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtsMin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MTSMAX_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtsMax_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MTSPRECIO_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtsPrecio_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1N21802( ) ;
      if ( AnyError != 0 )
      {
         O13175MtsLinUlt = s13175MtsLinUlt ;
         n13175MtsLinUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
      }
      nRcdExists_1802 = (short)(0) ;
      nIsMod_1802 = (short)(0) ;
      nRcdDeleted_1802 = (short)(0) ;
   }

   public void processLevel1N21801( )
   {
      /* Save parent mode. */
      sMode1801 = Gx_mode ;
      processNestedLevel1N21802( ) ;
      if ( AnyError != 0 )
      {
         O13175MtsLinUlt = s13175MtsLinUlt ;
         n13175MtsLinUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1801 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01N218 */
      pr_default.execute(16, new Object[] {Boolean.valueOf(n13175MtsLinUlt), Short.valueOf(A13175MtsLinUlt), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A499GrpFamCod), Short.valueOf(A13168NumCilLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEstTa1");
   }

   public void endLevel1N21801( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1N21801( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "testmts");
         if ( AnyError == 0 )
         {
            confirmValues1N20( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "testmts");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1N21801( )
   {
      /* Scan By routine */
      /* Using cursor T01N219 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A499GrpFamCod), Short.valueOf(A13168NumCilLin)});
      RcdFound1801 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1801 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1N21801( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound1801 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1801 = (short)(1) ;
      }
   }

   public void scanEnd1N21801( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1N21801( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1N21801( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1N21801( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1N21801( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1N21801( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1N21801( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1N21801( )
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
      edtGrpFamCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrpFamCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpFamCod_Enabled), 5, 0), true);
      edtGrpFamDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrpFamDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpFamDsc_Enabled), 5, 0), true);
      edtNumCilLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNumCilLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNumCilLin_Enabled), 5, 0), true);
      edtNumCilMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNumCilMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNumCilMin_Enabled), 5, 0), true);
      edtNumCilMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNumCilMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNumCilMax_Enabled), 5, 0), true);
      edtMtsLinUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtsLinUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtsLinUlt_Enabled), 5, 0), true);
   }

   public void zm1N21802( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13172MtsMin = T01N23_A13172MtsMin[0] ;
            Z13173MtsMax = T01N23_A13173MtsMax[0] ;
            Z13174MtsPrecio = T01N23_A13174MtsPrecio[0] ;
         }
         else
         {
            Z13172MtsMin = A13172MtsMin ;
            Z13173MtsMax = A13173MtsMax ;
            Z13174MtsPrecio = A13174MtsPrecio ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z499GrpFamCod = A499GrpFamCod ;
         Z13168NumCilLin = A13168NumCilLin ;
         Z13171MtsLin = A13171MtsLin ;
         Z13172MtsMin = A13172MtsMin ;
         Z13173MtsMax = A13173MtsMax ;
         Z13174MtsPrecio = A13174MtsPrecio ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1N21802( )
   {
      edtMtsLinUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtsLinUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtsLinUlt_Enabled), 5, 0), true);
      edtMtsLinUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtsLinUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtsLinUlt_Enabled), 5, 0), true);
   }

   public void standaloneModal1N21802( )
   {
      if ( isIns( )  )
      {
         A13175MtsLinUlt = (short)(O13175MtsLinUlt+1) ;
         n13175MtsLinUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A13171MtsLin = A13175MtsLinUlt ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMtsLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMtsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtsLin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         edtMtsLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMtsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtsLin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      }
   }

   public void load1N21802( )
   {
      /* Using cursor T01N220 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A499GrpFamCod), Short.valueOf(A13168NumCilLin), Short.valueOf(A13171MtsLin)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1802 = (short)(1) ;
         A13172MtsMin = T01N220_A13172MtsMin[0] ;
         n13172MtsMin = T01N220_n13172MtsMin[0] ;
         A13173MtsMax = T01N220_A13173MtsMax[0] ;
         n13173MtsMax = T01N220_n13173MtsMax[0] ;
         A13174MtsPrecio = T01N220_A13174MtsPrecio[0] ;
         n13174MtsPrecio = T01N220_n13174MtsPrecio[0] ;
         zm1N21802( -13) ;
      }
      pr_default.close(18);
      onLoadActions1N21802( ) ;
   }

   public void onLoadActions1N21802( )
   {
   }

   public void checkExtendedTable1N21802( )
   {
      nIsDirty_1802 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1N21802( ) ;
   }

   public void closeExtendedTableCursors1N21802( )
   {
   }

   public void enableDisable1N21802( )
   {
   }

   public void getKey1N21802( )
   {
      /* Using cursor T01N221 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A499GrpFamCod), Short.valueOf(A13168NumCilLin), Short.valueOf(A13171MtsLin)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1802 = (short)(1) ;
      }
      else
      {
         RcdFound1802 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey1N21802( )
   {
      /* Using cursor T01N23 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A499GrpFamCod), Short.valueOf(A13168NumCilLin), Short.valueOf(A13171MtsLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T01N23_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01N23_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01N23_A499GrpFamCod[0] == A499GrpFamCod ) && ( T01N23_A13168NumCilLin[0] == A13168NumCilLin ) && ( GXutil.strcmp(T01N23_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1N21802( 13) ;
         RcdFound1802 = (short)(1) ;
         initializeNonKey1N21802( ) ;
         A13171MtsLin = T01N23_A13171MtsLin[0] ;
         A13172MtsMin = T01N23_A13172MtsMin[0] ;
         n13172MtsMin = T01N23_n13172MtsMin[0] ;
         A13173MtsMax = T01N23_A13173MtsMax[0] ;
         n13173MtsMax = T01N23_n13173MtsMax[0] ;
         A13174MtsPrecio = T01N23_A13174MtsPrecio[0] ;
         n13174MtsPrecio = T01N23_n13174MtsPrecio[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z499GrpFamCod = A499GrpFamCod ;
         Z13168NumCilLin = A13168NumCilLin ;
         Z13171MtsLin = A13171MtsLin ;
         sMode1802 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1N21802( ) ;
         load1N21802( ) ;
         Gx_mode = sMode1802 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1802 = (short)(0) ;
         initializeNonKey1N21802( ) ;
         sMode1802 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1N21802( ) ;
         Gx_mode = sMode1802 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1N21802( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1N21802( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01N22 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A499GrpFamCod), Short.valueOf(A13168NumCilLin), Short.valueOf(A13171MtsLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEstTa2"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z13172MtsMin, T01N22_A13172MtsMin[0]) != 0 ) || ( DecimalUtil.compareTo(Z13173MtsMax, T01N22_A13173MtsMax[0]) != 0 ) || ( DecimalUtil.compareTo(Z13174MtsPrecio, T01N22_A13174MtsPrecio[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z13172MtsMin, T01N22_A13172MtsMin[0]) != 0 )
            {
               GXutil.writeLogln("testmts:[seudo value changed for attri]"+"MtsMin");
               GXutil.writeLogRaw("Old: ",Z13172MtsMin);
               GXutil.writeLogRaw("Current: ",T01N22_A13172MtsMin[0]);
            }
            if ( DecimalUtil.compareTo(Z13173MtsMax, T01N22_A13173MtsMax[0]) != 0 )
            {
               GXutil.writeLogln("testmts:[seudo value changed for attri]"+"MtsMax");
               GXutil.writeLogRaw("Old: ",Z13173MtsMax);
               GXutil.writeLogRaw("Current: ",T01N22_A13173MtsMax[0]);
            }
            if ( DecimalUtil.compareTo(Z13174MtsPrecio, T01N22_A13174MtsPrecio[0]) != 0 )
            {
               GXutil.writeLogln("testmts:[seudo value changed for attri]"+"MtsPrecio");
               GXutil.writeLogRaw("Old: ",Z13174MtsPrecio);
               GXutil.writeLogRaw("Current: ",T01N22_A13174MtsPrecio[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPEstTa2"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1N21802( )
   {
      beforeValidate1N21802( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N21802( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1N21802( 0) ;
         checkOptimisticConcurrency1N21802( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1N21802( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1N21802( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01N222 */
                  pr_default.execute(20, new Object[] {Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A499GrpFamCod), Short.valueOf(A13168NumCilLin), Short.valueOf(A13171MtsLin), Boolean.valueOf(n13172MtsMin), A13172MtsMin, Boolean.valueOf(n13173MtsMax), A13173MtsMax, Boolean.valueOf(n13174MtsPrecio), A13174MtsPrecio, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEstTa2");
                  if ( (pr_default.getStatus(20) == 1) )
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
            load1N21802( ) ;
         }
         endLevel1N21802( ) ;
      }
      closeExtendedTableCursors1N21802( ) ;
   }

   public void update1N21802( )
   {
      beforeValidate1N21802( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N21802( ) ;
      }
      if ( ( nIsMod_1802 != 0 ) || ( nIsDirty_1802 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1N21802( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1N21802( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1N21802( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01N223 */
                     pr_default.execute(21, new Object[] {Boolean.valueOf(n13172MtsMin), A13172MtsMin, Boolean.valueOf(n13173MtsMax), A13173MtsMax, Boolean.valueOf(n13174MtsPrecio), A13174MtsPrecio, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A499GrpFamCod), Short.valueOf(A13168NumCilLin), Short.valueOf(A13171MtsLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEstTa2");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEstTa2"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1N21802( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1N21802( ) ;
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
            endLevel1N21802( ) ;
         }
      }
      closeExtendedTableCursors1N21802( ) ;
   }

   public void deferredUpdate1N21802( )
   {
   }

   public void delete1N21802( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1N21802( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1N21802( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1N21802( ) ;
         afterConfirm1N21802( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1N21802( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01N224 */
               pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A499GrpFamCod), Short.valueOf(A13168NumCilLin), Short.valueOf(A13171MtsLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEstTa2");
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
      sMode1802 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1N21802( ) ;
      Gx_mode = sMode1802 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1N21802( )
   {
      standaloneModal1N21802( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1N21802( )
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

   public void scanStart1N21802( )
   {
      /* Scan By routine */
      /* Using cursor T01N225 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A499GrpFamCod), Short.valueOf(A13168NumCilLin)});
      RcdFound1802 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1802 = (short)(1) ;
         A13171MtsLin = T01N225_A13171MtsLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1N21802( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound1802 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1802 = (short)(1) ;
         A13171MtsLin = T01N225_A13171MtsLin[0] ;
      }
   }

   public void scanEnd1N21802( )
   {
      pr_default.close(23);
   }

   public void afterConfirm1N21802( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1N21802( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1N21802( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1N21802( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1N21802( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1N21802( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1N21802( )
   {
      edtMtsLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtsLin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtMtsMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtsMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtsMin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtMtsMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtsMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtsMax_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtMtsPrecio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtsPrecio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtsPrecio_Enabled), 5, 0), !bGXsfl_79_Refreshing);
   }

   public void send_integrity_lvl_hashes1N21802( )
   {
   }

   public void send_integrity_lvl_hashes1N21801( )
   {
   }

   public void subsflControlProps_791802( )
   {
      edtavnRcdDeleted_1802_Internalname = "vNRCDDELETED_1802_"+sGXsfl_79_idx ;
      edtMtsLin_Internalname = "MTSLIN_"+sGXsfl_79_idx ;
      edtMtsMin_Internalname = "MTSMIN_"+sGXsfl_79_idx ;
      edtMtsMax_Internalname = "MTSMAX_"+sGXsfl_79_idx ;
      edtMtsPrecio_Internalname = "MTSPRECIO_"+sGXsfl_79_idx ;
   }

   public void subsflControlProps_fel_791802( )
   {
      edtavnRcdDeleted_1802_Internalname = "vNRCDDELETED_1802_"+sGXsfl_79_fel_idx ;
      edtMtsLin_Internalname = "MTSLIN_"+sGXsfl_79_fel_idx ;
      edtMtsMin_Internalname = "MTSMIN_"+sGXsfl_79_fel_idx ;
      edtMtsMax_Internalname = "MTSMAX_"+sGXsfl_79_fel_idx ;
      edtMtsPrecio_Internalname = "MTSPRECIO_"+sGXsfl_79_fel_idx ;
   }

   public void addRow1N21802( )
   {
      nGXsfl_79_idx = (int)(nGXsfl_79_idx+1) ;
      sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_791802( ) ;
      sendRow1N21802( ) ;
   }

   public void sendRow1N21802( )
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
         if ( ((int)((nGXsfl_79_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1802_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1802_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1802, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1802_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1802), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1802), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,80);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1802_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1802_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1802_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMtsLin_Internalname,GXutil.ltrim( localUtil.ntoc( A13171MtsLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13171MtsLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMtsLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMtsLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1802_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMtsMin_Internalname,GXutil.ltrim( localUtil.ntoc( A13172MtsMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMtsMin_Enabled!=0) ? localUtil.format( A13172MtsMin, "ZZZZZ9.99") : localUtil.format( A13172MtsMin, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMtsMin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMtsMin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1802_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMtsMax_Internalname,GXutil.ltrim( localUtil.ntoc( A13173MtsMax, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMtsMax_Enabled!=0) ? localUtil.format( A13173MtsMax, "ZZZZZ9.99") : localUtil.format( A13173MtsMax, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMtsMax_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMtsMax_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1802_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMtsPrecio_Internalname,GXutil.ltrim( localUtil.ntoc( A13174MtsPrecio, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMtsPrecio_Enabled!=0) ? localUtil.format( A13174MtsPrecio, "ZZZZZZ9.99999") : localUtil.format( A13174MtsPrecio, "ZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,84);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMtsPrecio_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMtsPrecio_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1N21802( ) ;
      GXCCtl = "Z13171MtsLin_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13171MtsLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13172MtsMin_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13172MtsMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13173MtsMax_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13173MtsMax, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13174MtsPrecio_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13174MtsPrecio, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1802_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1802, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1802_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1802, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1802_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1802, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1802_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1802_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MTSLIN_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtsLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MTSMIN_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtsMin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MTSMAX_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtsMax_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MTSPRECIO_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtsPrecio_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1N21802( )
   {
      nGXsfl_79_idx = (int)(nGXsfl_79_idx+1) ;
      sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_791802( ) ;
      edtavnRcdDeleted_1802_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1802_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMtsLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MTSLIN_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMtsMin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MTSMIN_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMtsMax_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MTSMAX_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMtsPrecio_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MTSPRECIO_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1802_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1802_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1802");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1802_Internalname ;
         wbErr = true ;
         nRcdDeleted_1802 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1802 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1802_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMtsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMtsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "MTSLIN_" + sGXsfl_79_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMtsLin_Internalname ;
         wbErr = true ;
         A13171MtsLin = (short)(0) ;
      }
      else
      {
         A13171MtsLin = (short)(localUtil.ctol( httpContext.cgiGet( edtMtsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMtsMin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMtsMin_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "MTSMIN_" + sGXsfl_79_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMtsMin_Internalname ;
         wbErr = true ;
         A13172MtsMin = DecimalUtil.ZERO ;
         n13172MtsMin = false ;
      }
      else
      {
         A13172MtsMin = localUtil.ctond( httpContext.cgiGet( edtMtsMin_Internalname)) ;
         n13172MtsMin = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMtsMax_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMtsMax_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "MTSMAX_" + sGXsfl_79_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMtsMax_Internalname ;
         wbErr = true ;
         A13173MtsMax = DecimalUtil.ZERO ;
         n13173MtsMax = false ;
      }
      else
      {
         A13173MtsMax = localUtil.ctond( httpContext.cgiGet( edtMtsMax_Internalname)) ;
         n13173MtsMax = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMtsPrecio_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMtsPrecio_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "MTSPRECIO_" + sGXsfl_79_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMtsPrecio_Internalname ;
         wbErr = true ;
         A13174MtsPrecio = DecimalUtil.ZERO ;
         n13174MtsPrecio = false ;
      }
      else
      {
         A13174MtsPrecio = localUtil.ctond( httpContext.cgiGet( edtMtsPrecio_Internalname)) ;
         n13174MtsPrecio = false ;
      }
      GXCCtl = "Z13171MtsLin_" + sGXsfl_79_idx ;
      Z13171MtsLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13172MtsMin_" + sGXsfl_79_idx ;
      Z13172MtsMin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13173MtsMax_" + sGXsfl_79_idx ;
      Z13173MtsMax = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13174MtsPrecio_" + sGXsfl_79_idx ;
      Z13174MtsPrecio = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1802_" + sGXsfl_79_idx ;
      nRcdDeleted_1802 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1802_" + sGXsfl_79_idx ;
      nRcdExists_1802 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1802_" + sGXsfl_79_idx ;
      nIsMod_1802 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMtsLin_Enabled = edtMtsLin_Enabled ;
   }

   public void confirmValues1N20( )
   {
      nGXsfl_79_idx = 0 ;
      sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_791802( ) ;
      while ( nGXsfl_79_idx < nRC_GXsfl_79 )
      {
         nGXsfl_79_idx = (int)(nGXsfl_79_idx+1) ;
         sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_791802( ) ;
         httpContext.changePostValue( "Z13171MtsLin_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z13171MtsLin_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13171MtsLin_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z13172MtsMin_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z13172MtsMin_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13172MtsMin_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z13173MtsMax_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z13173MtsMax_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13173MtsMax_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z13174MtsPrecio_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z13174MtsPrecio_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13174MtsPrecio_"+sGXsfl_79_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.testmts", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.ltrimstr(A499GrpFamCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(A13168NumCilLin,4,0))}, new String[] {"EmprCod","CliCod","ArtCod","GrpFamCod","NumCilLin"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TEstMts");
      forbiddenHiddens.add("NumCilMin", localUtil.format( DecimalUtil.doubleToDec(A13169NumCilMin), "ZZZ9"));
      forbiddenHiddens.add("NumCilMax", localUtil.format( DecimalUtil.doubleToDec(A13170NumCilMax), "ZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("testmts:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z499GrpFamCod", GXutil.ltrim( localUtil.ntoc( Z499GrpFamCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13168NumCilLin", GXutil.ltrim( localUtil.ntoc( Z13168NumCilLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13169NumCilMin", GXutil.ltrim( localUtil.ntoc( Z13169NumCilMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13170NumCilMax", GXutil.ltrim( localUtil.ntoc( Z13170NumCilMax, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13175MtsLinUlt", GXutil.ltrim( localUtil.ntoc( Z13175MtsLinUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O13175MtsLinUlt", GXutil.ltrim( localUtil.ntoc( O13175MtsLinUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_79", GXutil.ltrim( localUtil.ntoc( nGXsfl_79_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.testmts", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.ltrimstr(A499GrpFamCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(A13168NumCilLin,4,0))}, new String[] {"EmprCod","CliCod","ArtCod","GrpFamCod","NumCilLin"})  ;
   }

   public String getPgmname( )
   {
      return "TEstMts" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tarifas Estampacion, Intervalo Metros", "") ;
   }

   public void initializeNonKey1N21801( )
   {
      A13169NumCilMin = (short)(0) ;
      n13169NumCilMin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13169NumCilMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13169NumCilMin), 4, 0));
      A13170NumCilMax = (short)(0) ;
      n13170NumCilMax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13170NumCilMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13170NumCilMax), 4, 0));
      A13175MtsLinUlt = (short)(0) ;
      n13175MtsLinUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
      O13175MtsLinUlt = A13175MtsLinUlt ;
      n13175MtsLinUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
      Z13169NumCilMin = (short)(0) ;
      Z13170NumCilMax = (short)(0) ;
      Z13175MtsLinUlt = (short)(0) ;
   }

   public void initAll1N21801( )
   {
      initializeNonKey1N21801( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1N21802( )
   {
      A13172MtsMin = DecimalUtil.ZERO ;
      n13172MtsMin = false ;
      A13173MtsMax = DecimalUtil.ZERO ;
      n13173MtsMax = false ;
      A13174MtsPrecio = DecimalUtil.ZERO ;
      n13174MtsPrecio = false ;
      Z13172MtsMin = DecimalUtil.ZERO ;
      Z13173MtsMax = DecimalUtil.ZERO ;
      Z13174MtsPrecio = DecimalUtil.ZERO ;
   }

   public void initAll1N21802( )
   {
      A13171MtsLin = (short)(0) ;
      initializeNonKey1N21802( ) ;
   }

   public void standaloneModalInsert1N21802( )
   {
      A13175MtsLinUlt = i13175MtsLinUlt ;
      n13175MtsLinUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13175MtsLinUlt), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241510582", true, true);
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
      httpContext.AddJavascriptSource("testmts.js", "?20268241510582", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1802( )
   {
      edtMtsLin_Enabled = defedtMtsLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtsLin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
   }

   public void startgridcontrol79( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1802, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1802_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13171MtsLin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMtsLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13172MtsMin, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMtsMin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13173MtsMax, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMtsMax_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13174MtsPrecio, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMtsPrecio_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtGrpFamCod_Internalname = "GRPFAMCOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtGrpFamDsc_Internalname = "GRPFAMDSC" ;
      edtNumCilLin_Internalname = "NUMCILLIN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtNumCilMin_Internalname = "NUMCILMIN" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtNumCilMax_Internalname = "NUMCILMAX" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtMtsLinUlt_Internalname = "MTSLINULT" ;
      edtavnRcdDeleted_1802_Internalname = "vNRCDDELETED_1802" ;
      edtMtsLin_Internalname = "MTSLIN" ;
      edtMtsMin_Internalname = "MTSMIN" ;
      edtMtsMax_Internalname = "MTSMAX" ;
      edtMtsPrecio_Internalname = "MTSPRECIO" ;
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
      Form.setCaption( httpContext.getMessage( "Tarifas Estampacion, Intervalo Metros", "") );
      edtMtsPrecio_Jsonclick = "" ;
      edtMtsMax_Jsonclick = "" ;
      edtMtsMin_Jsonclick = "" ;
      edtMtsLin_Jsonclick = "" ;
      edtavnRcdDeleted_1802_Jsonclick = "" ;
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
      edtMtsPrecio_Enabled = 1 ;
      edtMtsMax_Enabled = 1 ;
      edtMtsMin_Enabled = 1 ;
      edtMtsLin_Enabled = 1 ;
      edtavnRcdDeleted_1802_Enabled = 1 ;
      edtMtsLinUlt_Jsonclick = "" ;
      edtMtsLinUlt_Backcolor = (int)(0xFFFFFF) ;
      edtMtsLinUlt_Enabled = 0 ;
      edtNumCilMax_Jsonclick = "" ;
      edtNumCilMax_Backcolor = (int)(0xFFFFFF) ;
      edtNumCilMax_Enabled = 0 ;
      edtNumCilMin_Jsonclick = "" ;
      edtNumCilMin_Backcolor = (int)(0xFFFFFF) ;
      edtNumCilMin_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtNumCilLin_Jsonclick = "" ;
      edtNumCilLin_Backcolor = (int)(0xFFFFFF) ;
      edtNumCilLin_Enabled = 0 ;
      edtGrpFamDsc_Jsonclick = "" ;
      edtGrpFamDsc_Backcolor = (int)(0xFFFFFF) ;
      edtGrpFamDsc_Enabled = 0 ;
      edtGrpFamCod_Jsonclick = "" ;
      edtGrpFamCod_Backcolor = (int)(0xFFFFFF) ;
      edtGrpFamCod_Enabled = 0 ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_791802( ) ;
      while ( nGXsfl_79_idx <= nRC_GXsfl_79 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1N21802( ) ;
         standaloneModal1N21802( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1N21802( ) ;
         nGXsfl_79_idx = (int)(nGXsfl_79_idx+1) ;
         sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_791802( ) ;
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
      /* Using cursor T01N226 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01N226_A407EmprNom[0] ;
      n407EmprNom = T01N226_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(24);
      /* Using cursor T01N227 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01N227_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(25);
      /* Using cursor T01N228 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
      A69ArtDsc = T01N228_A69ArtDsc[0] ;
      n69ArtDsc = T01N228_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(26);
      /* Using cursor T01N229 */
      pr_default.execute(27, new Object[] {A396EmprCod, Byte.valueOf(A499GrpFamCod)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRUFAM", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRPFAMCOD");
         AnyError = (short)(1) ;
      }
      A500GrpFamDsc = T01N229_A500GrpFamDsc[0] ;
      n500GrpFamDsc = T01N229_n500GrpFamDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A500GrpFamDsc", A500GrpFamDsc);
      pr_default.close(27);
      /* Using cursor T01N230 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A499GrpFamCod)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Familia Productos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRPFAMCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(28);
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

   public void valid_Numcillin( )
   {
      n13170NumCilMax = false ;
      n13169NumCilMin = false ;
      n13175MtsLinUlt = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A500GrpFamDsc", GXutil.rtrim( A500GrpFamDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A13169NumCilMin", GXutil.ltrim( localUtil.ntoc( A13169NumCilMin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13170NumCilMax", GXutil.ltrim( localUtil.ntoc( A13170NumCilMax, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13175MtsLinUlt", GXutil.ltrim( localUtil.ntoc( A13175MtsLinUlt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z499GrpFamCod", GXutil.ltrim( localUtil.ntoc( Z499GrpFamCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13168NumCilLin", GXutil.ltrim( localUtil.ntoc( Z13168NumCilLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z500GrpFamDsc", GXutil.rtrim( Z500GrpFamDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13169NumCilMin", GXutil.ltrim( localUtil.ntoc( Z13169NumCilMin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13170NumCilMax", GXutil.ltrim( localUtil.ntoc( Z13170NumCilMax, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13175MtsLinUlt", GXutil.ltrim( localUtil.ntoc( Z13175MtsLinUlt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O13175MtsLinUlt", GXutil.ltrim( localUtil.ntoc( O13175MtsLinUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A499GrpFamCod',fld:'GRPFAMCOD',pic:'Z9'},{av:'A13168NumCilLin',fld:'NUMCILLIN',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A13169NumCilMin',fld:'NUMCILMIN',pic:'ZZZ9'},{av:'A13170NumCilMax',fld:'NUMCILMAX',pic:'ZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[]");
      setEventMetadata("VALID_ARTCOD",",oparms:[]}");
      setEventMetadata("VALID_GRPFAMCOD","{handler:'valid_Grpfamcod',iparms:[]");
      setEventMetadata("VALID_GRPFAMCOD",",oparms:[]}");
      setEventMetadata("VALID_NUMCILLIN","{handler:'valid_Numcillin',iparms:[{av:'A13170NumCilMax',fld:'NUMCILMAX',pic:'ZZZ9'},{av:'A13169NumCilMin',fld:'NUMCILMIN',pic:'ZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A13175MtsLinUlt',fld:'MTSLINULT',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A499GrpFamCod',fld:'GRPFAMCOD',pic:'Z9'},{av:'A13168NumCilLin',fld:'NUMCILLIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_NUMCILLIN",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'A500GrpFamDsc',fld:'GRPFAMDSC',pic:''},{av:'A13169NumCilMin',fld:'NUMCILMIN',pic:'ZZZ9'},{av:'A13170NumCilMax',fld:'NUMCILMAX',pic:'ZZZ9'},{av:'A13175MtsLinUlt',fld:'MTSLINULT',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z499GrpFamCod'},{av:'Z13168NumCilLin'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z69ArtDsc'},{av:'Z500GrpFamDsc'},{av:'Z13169NumCilMin'},{av:'Z13170NumCilMax'},{av:'Z13175MtsLinUlt'},{av:'O13175MtsLinUlt'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MTSLINULT","{handler:'valid_Mtslinult',iparms:[]");
      setEventMetadata("VALID_MTSLINULT",",oparms:[]}");
      setEventMetadata("VALID_MTSLIN","{handler:'valid_Mtslin',iparms:[]");
      setEventMetadata("VALID_MTSLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Mtsprecio',iparms:[]");
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
      pr_default.close(27);
      pr_default.close(28);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA65ArtCod = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z13172MtsMin = DecimalUtil.ZERO ;
      Z13173MtsMax = DecimalUtil.ZERO ;
      Z13174MtsPrecio = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      lblTextblock8_Jsonclick = "" ;
      A500GrpFamDsc = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1802 = "" ;
      GX_FocusControl = "" ;
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
      sMode1801 = "" ;
      GXCCtl = "" ;
      A13172MtsMin = DecimalUtil.ZERO ;
      A13173MtsMax = DecimalUtil.ZERO ;
      A13174MtsPrecio = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z69ArtDsc = "" ;
      Z500GrpFamDsc = "" ;
      T01N26_A407EmprNom = new String[] {""} ;
      T01N26_n407EmprNom = new boolean[] {false} ;
      T01N27_A279CliNom = new String[] {""} ;
      T01N28_A69ArtDsc = new String[] {""} ;
      T01N28_n69ArtDsc = new boolean[] {false} ;
      T01N29_A500GrpFamDsc = new String[] {""} ;
      T01N29_n500GrpFamDsc = new boolean[] {false} ;
      T01N210_A396EmprCod = new String[] {""} ;
      T01N211_A13168NumCilLin = new short[1] ;
      T01N211_A407EmprNom = new String[] {""} ;
      T01N211_n407EmprNom = new boolean[] {false} ;
      T01N211_A279CliNom = new String[] {""} ;
      T01N211_A69ArtDsc = new String[] {""} ;
      T01N211_n69ArtDsc = new boolean[] {false} ;
      T01N211_A500GrpFamDsc = new String[] {""} ;
      T01N211_n500GrpFamDsc = new boolean[] {false} ;
      T01N211_A13169NumCilMin = new short[1] ;
      T01N211_n13169NumCilMin = new boolean[] {false} ;
      T01N211_A13170NumCilMax = new short[1] ;
      T01N211_n13170NumCilMax = new boolean[] {false} ;
      T01N211_A13175MtsLinUlt = new short[1] ;
      T01N211_n13175MtsLinUlt = new boolean[] {false} ;
      T01N211_A396EmprCod = new String[] {""} ;
      T01N211_A252CliCod = new int[1] ;
      T01N211_A65ArtCod = new String[] {""} ;
      T01N211_A499GrpFamCod = new byte[1] ;
      T01N212_A396EmprCod = new String[] {""} ;
      T01N212_A252CliCod = new int[1] ;
      T01N212_A65ArtCod = new String[] {""} ;
      T01N212_A499GrpFamCod = new byte[1] ;
      T01N212_A13168NumCilLin = new short[1] ;
      T01N25_A13168NumCilLin = new short[1] ;
      T01N25_A13169NumCilMin = new short[1] ;
      T01N25_n13169NumCilMin = new boolean[] {false} ;
      T01N25_A13170NumCilMax = new short[1] ;
      T01N25_n13170NumCilMax = new boolean[] {false} ;
      T01N25_A13175MtsLinUlt = new short[1] ;
      T01N25_n13175MtsLinUlt = new boolean[] {false} ;
      T01N25_A396EmprCod = new String[] {""} ;
      T01N25_A252CliCod = new int[1] ;
      T01N25_A65ArtCod = new String[] {""} ;
      T01N25_A499GrpFamCod = new byte[1] ;
      T01N213_A396EmprCod = new String[] {""} ;
      T01N213_A252CliCod = new int[1] ;
      T01N213_A65ArtCod = new String[] {""} ;
      T01N213_A499GrpFamCod = new byte[1] ;
      T01N213_A13168NumCilLin = new short[1] ;
      T01N214_A396EmprCod = new String[] {""} ;
      T01N214_A252CliCod = new int[1] ;
      T01N214_A65ArtCod = new String[] {""} ;
      T01N214_A499GrpFamCod = new byte[1] ;
      T01N214_A13168NumCilLin = new short[1] ;
      T01N24_A13168NumCilLin = new short[1] ;
      T01N24_A13169NumCilMin = new short[1] ;
      T01N24_n13169NumCilMin = new boolean[] {false} ;
      T01N24_A13170NumCilMax = new short[1] ;
      T01N24_n13170NumCilMax = new boolean[] {false} ;
      T01N24_A13175MtsLinUlt = new short[1] ;
      T01N24_n13175MtsLinUlt = new boolean[] {false} ;
      T01N24_A396EmprCod = new String[] {""} ;
      T01N24_A252CliCod = new int[1] ;
      T01N24_A65ArtCod = new String[] {""} ;
      T01N24_A499GrpFamCod = new byte[1] ;
      T01N219_A396EmprCod = new String[] {""} ;
      T01N219_A252CliCod = new int[1] ;
      T01N219_A65ArtCod = new String[] {""} ;
      T01N219_A499GrpFamCod = new byte[1] ;
      T01N219_A13168NumCilLin = new short[1] ;
      T01N220_A252CliCod = new int[1] ;
      T01N220_A65ArtCod = new String[] {""} ;
      T01N220_A499GrpFamCod = new byte[1] ;
      T01N220_A13168NumCilLin = new short[1] ;
      T01N220_A13171MtsLin = new short[1] ;
      T01N220_A13172MtsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N220_n13172MtsMin = new boolean[] {false} ;
      T01N220_A13173MtsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N220_n13173MtsMax = new boolean[] {false} ;
      T01N220_A13174MtsPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N220_n13174MtsPrecio = new boolean[] {false} ;
      T01N220_A396EmprCod = new String[] {""} ;
      T01N221_A396EmprCod = new String[] {""} ;
      T01N221_A252CliCod = new int[1] ;
      T01N221_A65ArtCod = new String[] {""} ;
      T01N221_A499GrpFamCod = new byte[1] ;
      T01N221_A13168NumCilLin = new short[1] ;
      T01N221_A13171MtsLin = new short[1] ;
      T01N23_A252CliCod = new int[1] ;
      T01N23_A65ArtCod = new String[] {""} ;
      T01N23_A499GrpFamCod = new byte[1] ;
      T01N23_A13168NumCilLin = new short[1] ;
      T01N23_A13171MtsLin = new short[1] ;
      T01N23_A13172MtsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N23_n13172MtsMin = new boolean[] {false} ;
      T01N23_A13173MtsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N23_n13173MtsMax = new boolean[] {false} ;
      T01N23_A13174MtsPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N23_n13174MtsPrecio = new boolean[] {false} ;
      T01N23_A396EmprCod = new String[] {""} ;
      T01N22_A252CliCod = new int[1] ;
      T01N22_A65ArtCod = new String[] {""} ;
      T01N22_A499GrpFamCod = new byte[1] ;
      T01N22_A13168NumCilLin = new short[1] ;
      T01N22_A13171MtsLin = new short[1] ;
      T01N22_A13172MtsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N22_n13172MtsMin = new boolean[] {false} ;
      T01N22_A13173MtsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N22_n13173MtsMax = new boolean[] {false} ;
      T01N22_A13174MtsPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N22_n13174MtsPrecio = new boolean[] {false} ;
      T01N22_A396EmprCod = new String[] {""} ;
      T01N225_A396EmprCod = new String[] {""} ;
      T01N225_A252CliCod = new int[1] ;
      T01N225_A65ArtCod = new String[] {""} ;
      T01N225_A499GrpFamCod = new byte[1] ;
      T01N225_A13168NumCilLin = new short[1] ;
      T01N225_A13171MtsLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01N226_A407EmprNom = new String[] {""} ;
      T01N226_n407EmprNom = new boolean[] {false} ;
      T01N227_A279CliNom = new String[] {""} ;
      T01N228_A69ArtDsc = new String[] {""} ;
      T01N228_n69ArtDsc = new boolean[] {false} ;
      T01N229_A500GrpFamDsc = new String[] {""} ;
      T01N229_n500GrpFamDsc = new boolean[] {false} ;
      T01N230_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ69ArtDsc = "" ;
      ZZ500GrpFamDsc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.testmts__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.testmts__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.testmts__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.testmts__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.testmts__default(),
         new Object[] {
             new Object[] {
            T01N22_A252CliCod, T01N22_A65ArtCod, T01N22_A499GrpFamCod, T01N22_A13168NumCilLin, T01N22_A13171MtsLin, T01N22_A13172MtsMin, T01N22_n13172MtsMin, T01N22_A13173MtsMax, T01N22_n13173MtsMax, T01N22_A13174MtsPrecio,
            T01N22_n13174MtsPrecio, T01N22_A396EmprCod
            }
            , new Object[] {
            T01N23_A252CliCod, T01N23_A65ArtCod, T01N23_A499GrpFamCod, T01N23_A13168NumCilLin, T01N23_A13171MtsLin, T01N23_A13172MtsMin, T01N23_n13172MtsMin, T01N23_A13173MtsMax, T01N23_n13173MtsMax, T01N23_A13174MtsPrecio,
            T01N23_n13174MtsPrecio, T01N23_A396EmprCod
            }
            , new Object[] {
            T01N24_A13168NumCilLin, T01N24_A13169NumCilMin, T01N24_n13169NumCilMin, T01N24_A13170NumCilMax, T01N24_n13170NumCilMax, T01N24_A13175MtsLinUlt, T01N24_n13175MtsLinUlt, T01N24_A396EmprCod, T01N24_A252CliCod, T01N24_A65ArtCod,
            T01N24_A499GrpFamCod
            }
            , new Object[] {
            T01N25_A13168NumCilLin, T01N25_A13169NumCilMin, T01N25_n13169NumCilMin, T01N25_A13170NumCilMax, T01N25_n13170NumCilMax, T01N25_A13175MtsLinUlt, T01N25_n13175MtsLinUlt, T01N25_A396EmprCod, T01N25_A252CliCod, T01N25_A65ArtCod,
            T01N25_A499GrpFamCod
            }
            , new Object[] {
            T01N26_A407EmprNom, T01N26_n407EmprNom
            }
            , new Object[] {
            T01N27_A279CliNom
            }
            , new Object[] {
            T01N28_A69ArtDsc, T01N28_n69ArtDsc
            }
            , new Object[] {
            T01N29_A500GrpFamDsc, T01N29_n500GrpFamDsc
            }
            , new Object[] {
            T01N210_A396EmprCod
            }
            , new Object[] {
            T01N211_A13168NumCilLin, T01N211_A407EmprNom, T01N211_n407EmprNom, T01N211_A279CliNom, T01N211_A69ArtDsc, T01N211_n69ArtDsc, T01N211_A500GrpFamDsc, T01N211_n500GrpFamDsc, T01N211_A13169NumCilMin, T01N211_n13169NumCilMin,
            T01N211_A13170NumCilMax, T01N211_n13170NumCilMax, T01N211_A13175MtsLinUlt, T01N211_n13175MtsLinUlt, T01N211_A396EmprCod, T01N211_A252CliCod, T01N211_A65ArtCod, T01N211_A499GrpFamCod
            }
            , new Object[] {
            T01N212_A396EmprCod, T01N212_A252CliCod, T01N212_A65ArtCod, T01N212_A499GrpFamCod, T01N212_A13168NumCilLin
            }
            , new Object[] {
            T01N213_A396EmprCod, T01N213_A252CliCod, T01N213_A65ArtCod, T01N213_A499GrpFamCod, T01N213_A13168NumCilLin
            }
            , new Object[] {
            T01N214_A396EmprCod, T01N214_A252CliCod, T01N214_A65ArtCod, T01N214_A499GrpFamCod, T01N214_A13168NumCilLin
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
            T01N219_A396EmprCod, T01N219_A252CliCod, T01N219_A65ArtCod, T01N219_A499GrpFamCod, T01N219_A13168NumCilLin
            }
            , new Object[] {
            T01N220_A252CliCod, T01N220_A65ArtCod, T01N220_A499GrpFamCod, T01N220_A13168NumCilLin, T01N220_A13171MtsLin, T01N220_A13172MtsMin, T01N220_n13172MtsMin, T01N220_A13173MtsMax, T01N220_n13173MtsMax, T01N220_A13174MtsPrecio,
            T01N220_n13174MtsPrecio, T01N220_A396EmprCod
            }
            , new Object[] {
            T01N221_A396EmprCod, T01N221_A252CliCod, T01N221_A65ArtCod, T01N221_A499GrpFamCod, T01N221_A13168NumCilLin, T01N221_A13171MtsLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01N225_A396EmprCod, T01N225_A252CliCod, T01N225_A65ArtCod, T01N225_A499GrpFamCod, T01N225_A13168NumCilLin, T01N225_A13171MtsLin
            }
            , new Object[] {
            T01N226_A407EmprNom, T01N226_n407EmprNom
            }
            , new Object[] {
            T01N227_A279CliNom
            }
            , new Object[] {
            T01N228_A69ArtDsc, T01N228_n69ArtDsc
            }
            , new Object[] {
            T01N229_A500GrpFamDsc, T01N229_n500GrpFamDsc
            }
            , new Object[] {
            T01N230_A396EmprCod
            }
         }
      );
      Z13168NumCilLin = (short)(0) ;
      A13168NumCilLin = (short)(0) ;
      Z499GrpFamCod = (byte)(0) ;
      A499GrpFamCod = (byte)(0) ;
      Z65ArtCod = "" ;
      A65ArtCod = "" ;
      Z252CliCod = 0 ;
      A252CliCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV34Pgmname = "TEstMts" ;
   }

   private byte wcpOA499GrpFamCod ;
   private byte Z499GrpFamCod ;
   private byte GxWebError ;
   private byte A499GrpFamCod ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ499GrpFamCod ;
   private short wcpOA13168NumCilLin ;
   private short Z13168NumCilLin ;
   private short Z13169NumCilMin ;
   private short Z13170NumCilMax ;
   private short Z13175MtsLinUlt ;
   private short O13175MtsLinUlt ;
   private short Z13171MtsLin ;
   private short nRcdDeleted_1802 ;
   private short nRcdExists_1802 ;
   private short nIsMod_1802 ;
   private short A13168NumCilLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A13175MtsLinUlt ;
   private short A13169NumCilMin ;
   private short A13170NumCilMax ;
   private short nBlankRcdCount1802 ;
   private short RcdFound1802 ;
   private short B13175MtsLinUlt ;
   private short nBlankRcdUsr1802 ;
   private short s13175MtsLinUlt ;
   private short A13171MtsLin ;
   private short RcdFound1801 ;
   private short nIsDirty_1801 ;
   private short nIsDirty_1802 ;
   private short i13175MtsLinUlt ;
   private short ZZ13168NumCilLin ;
   private short ZZ13169NumCilMin ;
   private short ZZ13170NumCilMax ;
   private short ZZ13175MtsLinUlt ;
   private short ZO13175MtsLinUlt ;
   private int wcpOA252CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_79 ;
   private int nGXsfl_79_idx=1 ;
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
   private int edtGrpFamCod_Enabled ;
   private int edtGrpFamDsc_Enabled ;
   private int edtNumCilLin_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtNumCilMin_Enabled ;
   private int edtNumCilMax_Enabled ;
   private int edtMtsLinUlt_Enabled ;
   private int edtavnRcdDeleted_1802_Enabled ;
   private int edtMtsLin_Enabled ;
   private int edtMtsMin_Enabled ;
   private int edtMtsMax_Enabled ;
   private int edtMtsPrecio_Enabled ;
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
   private int defedtMtsLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtMtsLinUlt_Backcolor ;
   private int edtNumCilMax_Backcolor ;
   private int edtNumCilMin_Backcolor ;
   private int edtNumCilLin_Backcolor ;
   private int edtGrpFamDsc_Backcolor ;
   private int edtGrpFamCod_Backcolor ;
   private int edtArtDsc_Backcolor ;
   private int edtArtCod_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z13172MtsMin ;
   private java.math.BigDecimal Z13173MtsMax ;
   private java.math.BigDecimal Z13174MtsPrecio ;
   private java.math.BigDecimal A13172MtsMin ;
   private java.math.BigDecimal A13173MtsMax ;
   private java.math.BigDecimal A13174MtsPrecio ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA65ArtCod ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_79_idx="0001" ;
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
   private String edtGrpFamCod_Internalname ;
   private String edtGrpFamCod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtGrpFamDsc_Internalname ;
   private String A500GrpFamDsc ;
   private String edtGrpFamDsc_Jsonclick ;
   private String edtNumCilLin_Internalname ;
   private String edtNumCilLin_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtNumCilMin_Internalname ;
   private String edtNumCilMin_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtNumCilMax_Internalname ;
   private String edtNumCilMax_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtMtsLinUlt_Internalname ;
   private String edtMtsLinUlt_Jsonclick ;
   private String sMode1802 ;
   private String edtavnRcdDeleted_1802_Internalname ;
   private String edtMtsLin_Internalname ;
   private String edtMtsMin_Internalname ;
   private String edtMtsMax_Internalname ;
   private String edtMtsPrecio_Internalname ;
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
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1801 ;
   private String GXCCtl ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z69ArtDsc ;
   private String Z500GrpFamDsc ;
   private String sGXsfl_79_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1802_Jsonclick ;
   private String edtMtsLin_Jsonclick ;
   private String edtMtsMin_Jsonclick ;
   private String edtMtsMax_Jsonclick ;
   private String edtMtsPrecio_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ69ArtDsc ;
   private String ZZ500GrpFamDsc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n13175MtsLinUlt ;
   private boolean bGXsfl_79_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n69ArtDsc ;
   private boolean n500GrpFamDsc ;
   private boolean n13169NumCilMin ;
   private boolean n13170NumCilMax ;
   private boolean returnInSub ;
   private boolean n13172MtsMin ;
   private boolean n13173MtsMax ;
   private boolean n13174MtsPrecio ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01N26_A407EmprNom ;
   private boolean[] T01N26_n407EmprNom ;
   private String[] T01N27_A279CliNom ;
   private String[] T01N28_A69ArtDsc ;
   private boolean[] T01N28_n69ArtDsc ;
   private String[] T01N29_A500GrpFamDsc ;
   private boolean[] T01N29_n500GrpFamDsc ;
   private String[] T01N210_A396EmprCod ;
   private short[] T01N211_A13168NumCilLin ;
   private String[] T01N211_A407EmprNom ;
   private boolean[] T01N211_n407EmprNom ;
   private String[] T01N211_A279CliNom ;
   private String[] T01N211_A69ArtDsc ;
   private boolean[] T01N211_n69ArtDsc ;
   private String[] T01N211_A500GrpFamDsc ;
   private boolean[] T01N211_n500GrpFamDsc ;
   private short[] T01N211_A13169NumCilMin ;
   private boolean[] T01N211_n13169NumCilMin ;
   private short[] T01N211_A13170NumCilMax ;
   private boolean[] T01N211_n13170NumCilMax ;
   private short[] T01N211_A13175MtsLinUlt ;
   private boolean[] T01N211_n13175MtsLinUlt ;
   private String[] T01N211_A396EmprCod ;
   private int[] T01N211_A252CliCod ;
   private String[] T01N211_A65ArtCod ;
   private byte[] T01N211_A499GrpFamCod ;
   private String[] T01N212_A396EmprCod ;
   private int[] T01N212_A252CliCod ;
   private String[] T01N212_A65ArtCod ;
   private byte[] T01N212_A499GrpFamCod ;
   private short[] T01N212_A13168NumCilLin ;
   private short[] T01N25_A13168NumCilLin ;
   private short[] T01N25_A13169NumCilMin ;
   private boolean[] T01N25_n13169NumCilMin ;
   private short[] T01N25_A13170NumCilMax ;
   private boolean[] T01N25_n13170NumCilMax ;
   private short[] T01N25_A13175MtsLinUlt ;
   private boolean[] T01N25_n13175MtsLinUlt ;
   private String[] T01N25_A396EmprCod ;
   private int[] T01N25_A252CliCod ;
   private String[] T01N25_A65ArtCod ;
   private byte[] T01N25_A499GrpFamCod ;
   private String[] T01N213_A396EmprCod ;
   private int[] T01N213_A252CliCod ;
   private String[] T01N213_A65ArtCod ;
   private byte[] T01N213_A499GrpFamCod ;
   private short[] T01N213_A13168NumCilLin ;
   private String[] T01N214_A396EmprCod ;
   private int[] T01N214_A252CliCod ;
   private String[] T01N214_A65ArtCod ;
   private byte[] T01N214_A499GrpFamCod ;
   private short[] T01N214_A13168NumCilLin ;
   private short[] T01N24_A13168NumCilLin ;
   private short[] T01N24_A13169NumCilMin ;
   private boolean[] T01N24_n13169NumCilMin ;
   private short[] T01N24_A13170NumCilMax ;
   private boolean[] T01N24_n13170NumCilMax ;
   private short[] T01N24_A13175MtsLinUlt ;
   private boolean[] T01N24_n13175MtsLinUlt ;
   private String[] T01N24_A396EmprCod ;
   private int[] T01N24_A252CliCod ;
   private String[] T01N24_A65ArtCod ;
   private byte[] T01N24_A499GrpFamCod ;
   private String[] T01N219_A396EmprCod ;
   private int[] T01N219_A252CliCod ;
   private String[] T01N219_A65ArtCod ;
   private byte[] T01N219_A499GrpFamCod ;
   private short[] T01N219_A13168NumCilLin ;
   private int[] T01N220_A252CliCod ;
   private String[] T01N220_A65ArtCod ;
   private byte[] T01N220_A499GrpFamCod ;
   private short[] T01N220_A13168NumCilLin ;
   private short[] T01N220_A13171MtsLin ;
   private java.math.BigDecimal[] T01N220_A13172MtsMin ;
   private boolean[] T01N220_n13172MtsMin ;
   private java.math.BigDecimal[] T01N220_A13173MtsMax ;
   private boolean[] T01N220_n13173MtsMax ;
   private java.math.BigDecimal[] T01N220_A13174MtsPrecio ;
   private boolean[] T01N220_n13174MtsPrecio ;
   private String[] T01N220_A396EmprCod ;
   private String[] T01N221_A396EmprCod ;
   private int[] T01N221_A252CliCod ;
   private String[] T01N221_A65ArtCod ;
   private byte[] T01N221_A499GrpFamCod ;
   private short[] T01N221_A13168NumCilLin ;
   private short[] T01N221_A13171MtsLin ;
   private int[] T01N23_A252CliCod ;
   private String[] T01N23_A65ArtCod ;
   private byte[] T01N23_A499GrpFamCod ;
   private short[] T01N23_A13168NumCilLin ;
   private short[] T01N23_A13171MtsLin ;
   private java.math.BigDecimal[] T01N23_A13172MtsMin ;
   private boolean[] T01N23_n13172MtsMin ;
   private java.math.BigDecimal[] T01N23_A13173MtsMax ;
   private boolean[] T01N23_n13173MtsMax ;
   private java.math.BigDecimal[] T01N23_A13174MtsPrecio ;
   private boolean[] T01N23_n13174MtsPrecio ;
   private String[] T01N23_A396EmprCod ;
   private int[] T01N22_A252CliCod ;
   private String[] T01N22_A65ArtCod ;
   private byte[] T01N22_A499GrpFamCod ;
   private short[] T01N22_A13168NumCilLin ;
   private short[] T01N22_A13171MtsLin ;
   private java.math.BigDecimal[] T01N22_A13172MtsMin ;
   private boolean[] T01N22_n13172MtsMin ;
   private java.math.BigDecimal[] T01N22_A13173MtsMax ;
   private boolean[] T01N22_n13173MtsMax ;
   private java.math.BigDecimal[] T01N22_A13174MtsPrecio ;
   private boolean[] T01N22_n13174MtsPrecio ;
   private String[] T01N22_A396EmprCod ;
   private String[] T01N225_A396EmprCod ;
   private int[] T01N225_A252CliCod ;
   private String[] T01N225_A65ArtCod ;
   private byte[] T01N225_A499GrpFamCod ;
   private short[] T01N225_A13168NumCilLin ;
   private short[] T01N225_A13171MtsLin ;
   private String[] T01N226_A407EmprNom ;
   private boolean[] T01N226_n407EmprNom ;
   private String[] T01N227_A279CliNom ;
   private String[] T01N228_A69ArtDsc ;
   private boolean[] T01N228_n69ArtDsc ;
   private String[] T01N229_A500GrpFamDsc ;
   private boolean[] T01N229_n500GrpFamDsc ;
   private String[] T01N230_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class testmts__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class testmts__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class testmts__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class testmts__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class testmts__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01N22", "SELECT CliCod, ArtCod, GrpFamCod, NumCilLin, MtsLin, MtsMin, MtsMax, MtsPrecio, EmprCod FROM TXPEstTa2 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND GrpFamCod = ? AND NumCilLin = ? AND MtsLin = ?  FOR UPDATE OF MtsMin, MtsMax, MtsPrecio NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N23", "SELECT CliCod, ArtCod, GrpFamCod, NumCilLin, MtsLin, MtsMin, MtsMax, MtsPrecio, EmprCod FROM TXPEstTa2 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND GrpFamCod = ? AND NumCilLin = ? AND MtsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N24", "SELECT NumCilLin, NumCilMin, NumCilMax, MtsLinUlt, EmprCod, CliCod, ArtCod, GrpFamCod FROM TXPEstTa1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND GrpFamCod = ? AND NumCilLin = ?  FOR UPDATE OF NumCilMin, NumCilMax, MtsLinUlt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N25", "SELECT NumCilLin, NumCilMin, NumCilMax, MtsLinUlt, EmprCod, CliCod, ArtCod, GrpFamCod FROM TXPEstTa1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND GrpFamCod = ? AND NumCilLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N26", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N27", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N28", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N29", "SELECT GrpFamDsc FROM TXPGRUFAM WHERE EmprCod = ? AND GrpFamCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N210", "SELECT EmprCod FROM TXPEstTa0 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND GrpFamCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N211", "SELECT /*+ FIRST_ROWS(1) */ TM1.NumCilLin, T2.EmprNom, T3.CliNom, T4.ArtDsc, T5.GrpFamDsc, TM1.NumCilMin, TM1.NumCilMax, TM1.MtsLinUlt, TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.GrpFamCod FROM ((((TXPEstTa1 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.ArtCod = TM1.ArtCod) INNER JOIN TXPGRUFAM T5 ON T5.EmprCod = TM1.EmprCod AND T5.GrpFamCod = TM1.GrpFamCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? and TM1.GrpFamCod = ? and TM1.NumCilLin = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.GrpFamCod, TM1.NumCilLin ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N212", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, GrpFamCod, NumCilLin FROM TXPEstTa1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND GrpFamCod = ? AND NumCilLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N213", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, GrpFamCod, NumCilLin FROM TXPEstTa1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and GrpFamCod = ? and NumCilLin = ? ORDER BY EmprCod, CliCod, ArtCod, GrpFamCod, NumCilLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N214", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, GrpFamCod, NumCilLin FROM TXPEstTa1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and GrpFamCod = ? and NumCilLin = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC, GrpFamCod DESC, NumCilLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01N215", "INSERT INTO TXPEstTa1(NumCilLin, NumCilMin, NumCilMax, MtsLinUlt, EmprCod, CliCod, ArtCod, GrpFamCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPEstTa1")
         ,new UpdateCursor("T01N216", "UPDATE TXPEstTa1 SET NumCilMin=?, NumCilMax=?, MtsLinUlt=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND GrpFamCod = ? AND NumCilLin = ?", GX_NOMASK, "TXPEstTa1")
         ,new UpdateCursor("T01N217", "DELETE FROM TXPEstTa1  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND GrpFamCod = ? AND NumCilLin = ?", GX_NOMASK, "TXPEstTa1")
         ,new UpdateCursor("T01N218", "UPDATE TXPEstTa1 SET MtsLinUlt=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND GrpFamCod = ? AND NumCilLin = ?", GX_NOMASK, "TXPEstTa1")
         ,new ForEachCursor("T01N219", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod, GrpFamCod, NumCilLin FROM TXPEstTa1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and GrpFamCod = ? and NumCilLin = ? ORDER BY EmprCod, CliCod, ArtCod, GrpFamCod, NumCilLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N220", "SELECT CliCod, ArtCod, GrpFamCod, NumCilLin, MtsLin, MtsMin, MtsMax, MtsPrecio, EmprCod FROM TXPEstTa2 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and GrpFamCod = ? and NumCilLin = ? and MtsLin = ? ORDER BY EmprCod, CliCod, ArtCod, GrpFamCod, NumCilLin, MtsLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N221", "SELECT EmprCod, CliCod, ArtCod, GrpFamCod, NumCilLin, MtsLin FROM TXPEstTa2 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND GrpFamCod = ? AND NumCilLin = ? AND MtsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01N222", "INSERT INTO TXPEstTa2(CliCod, ArtCod, GrpFamCod, NumCilLin, MtsLin, MtsMin, MtsMax, MtsPrecio, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPEstTa2")
         ,new UpdateCursor("T01N223", "UPDATE TXPEstTa2 SET MtsMin=?, MtsMax=?, MtsPrecio=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND GrpFamCod = ? AND NumCilLin = ? AND MtsLin = ?", GX_NOMASK, "TXPEstTa2")
         ,new UpdateCursor("T01N224", "DELETE FROM TXPEstTa2  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND GrpFamCod = ? AND NumCilLin = ? AND MtsLin = ?", GX_NOMASK, "TXPEstTa2")
         ,new ForEachCursor("T01N225", "SELECT EmprCod, CliCod, ArtCod, GrpFamCod, NumCilLin, MtsLin FROM TXPEstTa2 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and GrpFamCod = ? and NumCilLin = ? ORDER BY EmprCod, CliCod, ArtCod, GrpFamCod, NumCilLin, MtsLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N226", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N227", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N228", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N229", "SELECT GrpFamDsc FROM TXPGRUFAM WHERE EmprCod = ? AND GrpFamCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N230", "SELECT EmprCod FROM TXPEstTa0 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND GrpFamCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 16);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 16);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 3);
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((String[]) buf[16])[0] = rslt.getString(11, 16);
               ((byte[]) buf[17])[0] = rslt.getByte(12);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 13 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[6]).shortValue());
               }
               stmt.setString(5, (String)parms[7], 3);
               stmt.setInt(6, ((Number) parms[8]).intValue());
               stmt.setString(7, (String)parms[9], 16);
               stmt.setByte(8, ((Number) parms[10]).byteValue());
               return;
            case 14 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
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
               stmt.setByte(7, ((Number) parms[9]).byteValue());
               stmt.setShort(8, ((Number) parms[10]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 20 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 5);
               }
               stmt.setString(9, (String)parms[11], 3);
               return;
            case 21 :
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
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setString(6, (String)parms[8], 16);
               stmt.setByte(7, ((Number) parms[9]).byteValue());
               stmt.setShort(8, ((Number) parms[10]).shortValue());
               stmt.setShort(9, ((Number) parms[11]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

