package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmezcol_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action23") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         A5824MmezColor = httpContext.GetPar( "MmezColor") ;
         n5824MmezColor = false ;
         A5825MmezColNum = (int)(GXutil.lval( httpContext.GetPar( "MmezColNum"))) ;
         n5825MmezColNum = false ;
         A5826MmezColTip = (byte)(GXutil.lval( httpContext.GetPar( "MmezColTip"))) ;
         n5826MmezColTip = false ;
         AV75OkColor = (byte)(GXutil.lval( httpContext.GetPar( "OkColor"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV75OkColor", GXutil.str( AV75OkColor, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_23_1FR1583( A396EmprCod, A252CliCod, A65ArtCod, A5824MmezColor, A5825MmezColNum, A5826MmezColTip, AV75OkColor) ;
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
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A5809MMezCod = httpContext.GetPar( "MMezCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A5809MMezCod", A5809MMezCod);
            A65ArtCod = httpContext.GetPar( "ArtCod") ;
            A5819MmezArtPor = CommonUtil.decimalVal( httpContext.GetPar( "MmezArtPor"), ".") ;
            n5819MmezArtPor = false ;
            A5820MmezArtKil = CommonUtil.decimalVal( httpContext.GetPar( "MmezArtKil"), ".") ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "COMPOSICION COLORES MEZCLAS", ""), (short)(0)) ;
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
      nRC_GXsfl_70 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_70"))) ;
      nGXsfl_70_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_70_idx"))) ;
      sGXsfl_70_idx = httpContext.GetPar( "sGXsfl_70_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      A5809MMezCod = httpContext.GetPar( "MMezCod") ;
      A5810MMezKgs = CommonUtil.decimalVal( httpContext.GetPar( "MMezKgs"), ".") ;
      n5810MMezKgs = false ;
      A5814MMezPorTot = CommonUtil.decimalVal( httpContext.GetPar( "MMezPorTot"), ".") ;
      n5814MMezPorTot = false ;
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
      nRC_GXsfl_112 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_112"))) ;
      nGXsfl_112_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_112_idx"))) ;
      sGXsfl_112_idx = httpContext.GetPar( "sGXsfl_112_idx") ;
      A5817MmezUltCol = (byte)(GXutil.lval( httpContext.GetPar( "MmezUltCol"))) ;
      n5817MmezUltCol = false ;
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

   public tmezcol_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmezcol_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmezcol_impl.class ));
   }

   public tmezcol_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TMEZCOL.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMEZCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEZCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo de Mezcla", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMezCod_Internalname, GXutil.rtrim( A5809MMezCod), GXutil.rtrim( localUtil.format( A5809MMezCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMezCod_Jsonclick, 0, "", "", "", "", "", 1, edtMMezCod_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMEZCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMEZCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMEZCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Kgs necesarios Materia Mezcla", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMezKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A5810MMezKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMMezKgs_Enabled!=0) ? localUtil.format( A5810MMezKgs, "ZZZZZ9.99") : localUtil.format( A5810MMezKgs, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMezKgs_Jsonclick, 0, "", "", "", "", "", 1, edtMMezKgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEZCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Numero Partida Mezcla", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMezPda_Internalname, GXutil.rtrim( A5811MMezPda), GXutil.rtrim( localUtil.format( A5811MMezPda, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMezPda_Jsonclick, 0, "", "", "", "", "", 1, edtMMezPda_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMEZCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Fecha Partida Mezcla", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtMMezFecPda_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMezFecPda_Internalname, localUtil.format(A5812MMezFecPda, "99/99/99"), localUtil.format( A5812MMezFecPda, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMezFecPda_Jsonclick, 0, "", "", "", "", "", 1, edtMMezFecPda_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEZCOL.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMMezFecPda_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMMezFecPda_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMEZCOL.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Fecha Entrega Cli. Mezclas", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtMMezFecEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMezFecEnt_Internalname, localUtil.format(A5813MMezFecEnt, "99/99/99"), localUtil.format( A5813MMezFecEnt, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMezFecEnt_Jsonclick, 0, "", "", "", "", "", 1, edtMMezFecEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEZCOL.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMMezFecEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMMezFecEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMEZCOL.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Porcentaje Total Mezcla HSS", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMezPorTot_Internalname, GXutil.ltrim( localUtil.ntoc( A5814MMezPorTot, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMMezPorTot_Enabled!=0) ? localUtil.format( A5814MMezPorTot, "ZZ9.99") : localUtil.format( A5814MMezPorTot, "ZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMezPorTot_Jsonclick, 0, "", "", "", "", "", 1, edtMMezPorTot_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEZCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol70( ) ;
      /* Save parent mode. */
      sMode1582 = Gx_mode ;
      nGXsfl_70_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1582 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1582 = (short)(1) ;
            scanStart1FR1582( ) ;
            while ( RcdFound1582 != 0 )
            {
               init_level_properties1582( ) ;
               getByPrimaryKey1FR1582( ) ;
               addRow1FR1582( ) ;
               scanNext1FR1582( ) ;
            }
            scanEnd1FR1582( ) ;
            nBlankRcdCount1582 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1FR1582( ) ;
         standaloneModal1FR1582( ) ;
         sMode1582 = Gx_mode ;
         while ( nGXsfl_70_idx < nRC_GXsfl_70 )
         {
            bGXsfl_70_Refreshing = true ;
            readRow1FR1582( ) ;
            edtArtCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTCOD_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtMMezArtDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZARTDSC_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMMezArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezArtDsc_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtMmezUltCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZULTCOL_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMmezUltCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezUltCol_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtMmezUltPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZULTPAR_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMmezUltPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezUltPar_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtMmezArtPor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZARTPOR_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMmezArtPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezArtPor_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtMmezArtKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZARTKIL_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMmezArtKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezArtKil_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtMmezArtPCT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZARTPCT_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMmezArtPCT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezArtPCT_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            if ( ( nRcdExists_1582 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1FR1582( ) ;
            }
            sendRow1FR1582( ) ;
            bGXsfl_70_Refreshing = false ;
         }
         Gx_mode = sMode1582 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1582 = (short)(5) ;
         nRcdExists_1582 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1FR1582( ) ;
            while ( RcdFound1582 != 0 )
            {
               sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_701582( ) ;
               init_level_properties1582( ) ;
               standaloneNotModal1FR1582( ) ;
               getByPrimaryKey1FR1582( ) ;
               standaloneModal1FR1582( ) ;
               addRow1FR1582( ) ;
               scanNext1FR1582( ) ;
            }
            scanEnd1FR1582( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1582 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_701582( ) ;
      initAll1FR1582( ) ;
      init_level_properties1582( ) ;
      nRcdExists_1582 = (short)(0) ;
      nIsMod_1582 = (short)(0) ;
      nRcdDeleted_1582 = (short)(0) ;
      nBlankRcdCount1582 = (short)(nBlankRcdUsr1582+nBlankRcdCount1582) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1582 > 0 )
      {
         standaloneNotModal1FR1582( ) ;
         standaloneModal1FR1582( ) ;
         addRow1FR1582( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMmezUltPar_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1582 = (short)(nBlankRcdCount1582-1) ;
      }
      Gx_mode = sMode1582 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* Restore parent mode. */
      Gx_mode = sMode1582 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TMEZCOL.htm");
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
      e111FR2 ();
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
            Z5809MMezCod = httpContext.cgiGet( "Z5809MMezCod") ;
            Z5810MMezKgs = localUtil.ctond( httpContext.cgiGet( "Z5810MMezKgs")) ;
            Z5811MMezPda = httpContext.cgiGet( "Z5811MMezPda") ;
            Z5812MMezFecPda = localUtil.ctod( httpContext.cgiGet( "Z5812MMezFecPda"), 0) ;
            Z5813MMezFecEnt = localUtil.ctod( httpContext.cgiGet( "Z5813MMezFecEnt"), 0) ;
            Z5814MMezPorTot = localUtil.ctond( httpContext.cgiGet( "Z5814MMezPorTot")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_70 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_70"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV19Modo = httpContext.cgiGet( "MODO") ;
            AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV19Modo = httpContext.cgiGet( "vMODO") ;
            AV30Lit10 = httpContext.cgiGet( "vLIT10") ;
            AV31Lit11 = httpContext.cgiGet( "vLIT11") ;
            AV32Lit12 = httpContext.cgiGet( "vLIT12") ;
            AV33Lit13 = httpContext.cgiGet( "vLIT13") ;
            AV80Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A5809MMezCod = httpContext.cgiGet( edtMMezCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5809MMezCod", A5809MMezCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A5810MMezKgs = localUtil.ctond( httpContext.cgiGet( edtMMezKgs_Internalname)) ;
            n5810MMezKgs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5810MMezKgs", GXutil.ltrimstr( A5810MMezKgs, 9, 2));
            A5811MMezPda = httpContext.cgiGet( edtMMezPda_Internalname) ;
            n5811MMezPda = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5811MMezPda", A5811MMezPda);
            A5812MMezFecPda = localUtil.ctod( httpContext.cgiGet( edtMMezFecPda_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n5812MMezFecPda = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5812MMezFecPda", localUtil.format(A5812MMezFecPda, "99/99/99"));
            A5813MMezFecEnt = localUtil.ctod( httpContext.cgiGet( edtMMezFecEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n5813MMezFecEnt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5813MMezFecEnt", localUtil.format(A5813MMezFecEnt, "99/99/99"));
            A5814MMezPorTot = localUtil.ctond( httpContext.cgiGet( edtMMezPorTot_Internalname)) ;
            n5814MMezPorTot = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5814MMezPorTot", GXutil.ltrimstr( A5814MMezPorTot, 6, 2));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TMEZCOL");
            A5814MMezPorTot = localUtil.ctond( httpContext.cgiGet( edtMMezPorTot_Internalname)) ;
            n5814MMezPorTot = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5814MMezPorTot", GXutil.ltrimstr( A5814MMezPorTot, 6, 2));
            forbiddenHiddens.add("MMezPorTot", localUtil.format( A5814MMezPorTot, "ZZ9.99"));
            forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV19Modo, "")));
            A5810MMezKgs = localUtil.ctond( httpContext.cgiGet( edtMMezKgs_Internalname)) ;
            n5810MMezKgs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5810MMezKgs", GXutil.ltrimstr( A5810MMezKgs, 9, 2));
            forbiddenHiddens.add("MMezKgs", localUtil.format( A5810MMezKgs, "ZZZZZ9.99"));
            A5811MMezPda = httpContext.cgiGet( edtMMezPda_Internalname) ;
            n5811MMezPda = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5811MMezPda", A5811MMezPda);
            forbiddenHiddens.add("MMezPda", GXutil.rtrim( localUtil.format( A5811MMezPda, "")));
            A5812MMezFecPda = localUtil.ctod( httpContext.cgiGet( edtMMezFecPda_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n5812MMezFecPda = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5812MMezFecPda", localUtil.format(A5812MMezFecPda, "99/99/99"));
            forbiddenHiddens.add("MMezFecPda", localUtil.format(A5812MMezFecPda, "99/99/99"));
            A5813MMezFecEnt = localUtil.ctod( httpContext.cgiGet( edtMMezFecEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n5813MMezFecEnt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5813MMezFecEnt", localUtil.format(A5813MMezFecEnt, "99/99/99"));
            forbiddenHiddens.add("MMezFecEnt", localUtil.format(A5813MMezFecEnt, "99/99/99"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tmezcol:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A5809MMezCod = httpContext.GetPar( "MMezCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A5809MMezCod", A5809MMezCod);
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
                        e111FR2 ();
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
            initAll1FR1581( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1583_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1583_Enabled), 5, 0), !bGXsfl_112_Refreshing);
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
      disableAttributes1FR1581( ) ;
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

   public void confirm_1FR0( )
   {
      beforeValidate1FR1581( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1FR1581( ) ;
         }
         else
         {
            checkExtendedTable1FR1581( ) ;
            if ( AnyError == 0 )
            {
               zm1FR1581( 26) ;
               zm1FR1581( 27) ;
            }
            closeExtendedTableCursors1FR1581( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1581 = Gx_mode ;
         confirm_1FR1582( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1581 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1581 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1FR0( ) ;
      }
   }

   public void confirm_1FR1583( )
   {
      s5817MmezUltCol = O5817MmezUltCol ;
      n5817MmezUltCol = false ;
      s5821MmezArtPCT = O5821MmezArtPCT ;
      n5821MmezArtPCT = false ;
      nGXsfl_112_idx = 0 ;
      while ( nGXsfl_112_idx < nRC_GXsfl_112 )
      {
         readRow1FR1583( ) ;
         if ( ( nRcdExists_1583 != 0 ) || ( nIsMod_1583 != 0 ) )
         {
            getKey1FR1583( ) ;
            if ( ( nRcdExists_1583 == 0 ) && ( nRcdDeleted_1583 == 0 ) )
            {
               if ( RcdFound1583 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1FR1583( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1FR1583( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1FR1583( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O5817MmezUltCol = A5817MmezUltCol ;
                     n5817MmezUltCol = false ;
                     O5821MmezArtPCT = A5821MmezArtPCT ;
                     n5821MmezArtPCT = false ;
                  }
               }
               else
               {
                  GXCCtl = "MMEZLINCOL_" + sGXsfl_112_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMmezLinCol_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1583 != 0 )
               {
                  if ( nRcdDeleted_1583 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1FR1583( ) ;
                     load1FR1583( ) ;
                     beforeValidate1FR1583( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1FR1583( ) ;
                        O5817MmezUltCol = A5817MmezUltCol ;
                        n5817MmezUltCol = false ;
                        O5821MmezArtPCT = A5821MmezArtPCT ;
                        n5821MmezArtPCT = false ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1583 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1FR1583( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1FR1583( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1FR1583( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O5817MmezUltCol = A5817MmezUltCol ;
                           n5817MmezUltCol = false ;
                           O5821MmezArtPCT = A5821MmezArtPCT ;
                           n5821MmezArtPCT = false ;
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1583 == 0 )
                  {
                     GXCCtl = "MMEZLINCOL_" + sGXsfl_112_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMmezLinCol_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1583_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1583, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezLinCol_Internalname, GXutil.ltrim( localUtil.ntoc( A5822MmezLinCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezColPor_Internalname, GXutil.ltrim( localUtil.ntoc( A5823MmezColPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezColor_Internalname, GXutil.rtrim( A5824MmezColor)) ;
         httpContext.changePostValue( edtMmezColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A5825MmezColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezColTip_Internalname, GXutil.ltrim( localUtil.ntoc( A5826MmezColTip, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezColKil_Internalname, GXutil.ltrim( localUtil.ntoc( A5827MmezColKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5822MmezLinCol_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( Z5822MmezLinCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5823MmezColPor_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( Z5823MmezColPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5824MmezColor_"+sGXsfl_112_idx, GXutil.rtrim( Z5824MmezColor)) ;
         httpContext.changePostValue( "ZT_"+"Z5825MmezColNum_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( Z5825MmezColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5826MmezColTip_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( Z5826MmezColTip, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T5823MmezColPor_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( O5823MmezColPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1583_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1583, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1583_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1583, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1583_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1583, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1583 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1583_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1583_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZLINCOL_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezLinCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZCOLPOR_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezColPor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZCOLOR_"+sGXsfl_112_idx+"Title", GXutil.rtrim( edtMmezColor_Title)) ;
            httpContext.changePostValue( "MMEZCOLOR_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezColor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZCOLNUM_"+sGXsfl_112_idx+"Title", GXutil.rtrim( edtMmezColNum_Title)) ;
            httpContext.changePostValue( "MMEZCOLNUM_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZCOLTIP_"+sGXsfl_112_idx+"Title", GXutil.rtrim( edtMmezColTip_Title)) ;
            httpContext.changePostValue( "MMEZCOLTIP_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezColTip_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZCOLKIL_"+sGXsfl_112_idx+"Title", GXutil.rtrim( edtMmezColKil_Title)) ;
            httpContext.changePostValue( "MMEZCOLKIL_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezColKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O5817MmezUltCol = s5817MmezUltCol ;
      n5817MmezUltCol = false ;
      O5821MmezArtPCT = s5821MmezArtPCT ;
      n5821MmezArtPCT = false ;
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1FR1582( )
   {
      s5820MmezArtKil = O5820MmezArtKil ;
      nGXsfl_70_idx = 0 ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRow1FR1582( ) ;
         if ( ( nRcdExists_1582 != 0 ) || ( nIsMod_1582 != 0 ) )
         {
            getKey1FR1582( ) ;
            if ( ( nRcdExists_1582 == 0 ) && ( nRcdDeleted_1582 == 0 ) )
            {
               if ( RcdFound1582 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1FR1582( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1FR1582( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1FR1582( 29) ;
                        zm1FR1582( 30) ;
                     }
                     closeExtendedTableCursors1FR1582( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode1582 = Gx_mode ;
                        confirm_1FR1583( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode1582 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode1582 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     O5820MmezArtKil = A5820MmezArtKil ;
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
               if ( RcdFound1582 != 0 )
               {
                  if ( nRcdDeleted_1582 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1FR1582( ) ;
                     load1FR1582( ) ;
                     beforeValidate1FR1582( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1FR1582( ) ;
                        O5820MmezArtKil = A5820MmezArtKil ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1582 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1FR1582( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1FR1582( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1FR1582( 29) ;
                              zm1FR1582( 30) ;
                           }
                           closeExtendedTableCursors1FR1582( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode1582 = Gx_mode ;
                              confirm_1FR1583( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode1582 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode1582 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                           O5820MmezArtKil = A5820MmezArtKil ;
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1582 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtArtCod_Internalname, GXutil.rtrim( A65ArtCod)) ;
         httpContext.changePostValue( edtMMezArtDsc_Internalname, GXutil.rtrim( A5816MMezArtDsc)) ;
         httpContext.changePostValue( edtMmezUltCol_Internalname, GXutil.ltrim( localUtil.ntoc( A5817MmezUltCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezUltPar_Internalname, GXutil.ltrim( localUtil.ntoc( A5818MmezUltPar, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezArtPor_Internalname, GXutil.ltrim( localUtil.ntoc( A5819MmezArtPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezArtKil_Internalname, GXutil.ltrim( localUtil.ntoc( A5820MmezArtKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezArtPCT_Internalname, GXutil.ltrim( localUtil.ntoc( A5821MmezArtPCT, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5816MMezArtDsc_"+sGXsfl_70_idx, GXutil.rtrim( Z5816MMezArtDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z5817MmezUltCol_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z5817MmezUltCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5818MmezUltPar_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z5818MmezUltPar, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T5817MmezUltCol_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( O5817MmezUltCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T5821MmezArtPCT_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( O5821MmezArtPCT, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_112_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_112, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1582_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1582, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1582_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1582, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1582_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1582, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1582 != 0 )
         {
            httpContext.changePostValue( "ARTCOD_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZARTDSC_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMezArtDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZULTCOL_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezUltCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZULTPAR_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezUltPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZARTPOR_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezArtPor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZARTKIL_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezArtKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZARTPCT_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezArtPCT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O5820MmezArtKil = s5820MmezArtKil ;
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1FR0( )
   {
   }

   public void e111FR2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV63LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tmezcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV63LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63LitFe", AV63LitFe);
      GXt_char1 = AV20Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      tmezcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit0", AV20Lit0);
      GXt_char1 = AV21Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV80Pgmname, (byte)(99), GXv_char2) ;
      tmezcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit1", AV21Lit1);
      GXt_char1 = AV22Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      tmezcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit2", AV22Lit2);
      GXt_char1 = AV23Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1273_", ""), (byte)(99), GXv_char2) ;
      tmezcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit3", AV23Lit3);
      GXt_char1 = AV24Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT5_", ""), (byte)(99), GXv_char2) ;
      tmezcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit4", AV24Lit4);
      GXt_char1 = AV25Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tmezcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lit5", AV25Lit5);
      GXt_char1 = AV26Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1205_", ""), (byte)(99), GXv_char2) ;
      tmezcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lit6", AV26Lit6);
      GXt_char1 = AV27Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN557_", ""), (byte)(99), GXv_char2) ;
      tmezcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Lit7", AV27Lit7);
      GXt_char1 = AV28Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN198_", ""), (byte)(99), GXv_char2) ;
      tmezcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Lit8", AV28Lit8);
      GXt_char1 = AV29Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1301_", ""), (byte)(99), GXv_char2) ;
      tmezcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV29Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Lit9", AV29Lit9);
      GXt_char1 = AV30Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char2) ;
      tmezcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV30Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Lit10", AV30Lit10);
      GXt_char1 = AV31Lit11 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN244_", ""), (byte)(99), GXv_char2) ;
      tmezcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31Lit11 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Lit11", AV31Lit11);
      GXt_char1 = AV32Lit12 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN410_", ""), (byte)(99), GXv_char2) ;
      tmezcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32Lit12 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Lit12", AV32Lit12);
      GXt_char1 = AV33Lit13 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char2) ;
      tmezcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV33Lit13 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Lit13", AV33Lit13);
      GXt_char1 = AV34Lit14 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1120_", ""), (byte)(99), GXv_char2) ;
      tmezcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV34Lit14 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Lit14", AV34Lit14);
      AV35Lit15 = httpContext.getMessage( "Fec.Ent.", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Lit15", AV35Lit15);
      AV36Lit16 = httpContext.getMessage( "% Total", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Lit16", AV36Lit16);
      if ( ( GXutil.strcmp(AV21Lit1, httpContext.getMessage( "TMEZCOL", "")) == 0 ) || ( GXutil.strcmp(AV21Lit1, httpContext.getMessage( "NMEZCOL", "")) == 0 ) )
      {
         AV21Lit1 = httpContext.getMessage( "COMPOSICION COLORES MEZCLA", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Lit1", AV21Lit1);
      }
      AV18Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmezcol_impl.this.A396EmprCod = GXv_char2[0] ;
      tmezcol_impl.this.AV16EmprNom = GXv_char3[0] ;
      tmezcol_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
   }

   public void zm1FR1581( int GX_JID )
   {
      if ( ( GX_JID == 25 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5810MMezKgs = T01FR10_A5810MMezKgs[0] ;
            Z5811MMezPda = T01FR10_A5811MMezPda[0] ;
            Z5812MMezFecPda = T01FR10_A5812MMezFecPda[0] ;
            Z5813MMezFecEnt = T01FR10_A5813MMezFecEnt[0] ;
            Z5814MMezPorTot = T01FR10_A5814MMezPorTot[0] ;
         }
         else
         {
            Z5810MMezKgs = A5810MMezKgs ;
            Z5811MMezPda = A5811MMezPda ;
            Z5812MMezFecPda = A5812MMezFecPda ;
            Z5813MMezFecEnt = A5813MMezFecEnt ;
            Z5814MMezPorTot = A5814MMezPorTot ;
         }
      }
      if ( GX_JID == -25 )
      {
         Z5809MMezCod = A5809MMezCod ;
         Z5810MMezKgs = A5810MMezKgs ;
         Z5811MMezPda = A5811MMezPda ;
         Z5812MMezFecPda = A5812MMezFecPda ;
         Z5813MMezFecEnt = A5813MMezFecEnt ;
         Z5814MMezPorTot = A5814MMezPorTot ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtMMezPorTot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezPorTot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezPorTot_Enabled), 5, 0), true);
      edtMMezPda_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezPda_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezPda_Enabled), 5, 0), true);
      edtMMezFecPda_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezFecPda_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezFecPda_Enabled), 5, 0), true);
      edtMMezFecEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezFecEnt_Enabled), 5, 0), true);
      edtMMezKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezKgs_Enabled), 5, 0), true);
      AV80Pgmname = "TMEZCOL" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80Pgmname", AV80Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtMMezPorTot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezPorTot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezPorTot_Enabled), 5, 0), true);
      edtMMezPda_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezPda_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezPda_Enabled), 5, 0), true);
      edtMMezFecPda_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezFecPda_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezFecPda_Enabled), 5, 0), true);
      edtMMezFecEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezFecEnt_Enabled), 5, 0), true);
      edtMMezKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezKgs_Enabled), 5, 0), true);
      /* Using cursor T01FR11 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FR11_A407EmprNom[0] ;
      n407EmprNom = T01FR11_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(8);
      /* Using cursor T01FR12 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01FR12_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(9);
      edtMmezColor_Title = AV30Lit10 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezColor_Internalname, "Title", edtMmezColor_Title, !bGXsfl_112_Refreshing);
      edtMmezColNum_Title = AV31Lit11 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezColNum_Internalname, "Title", edtMmezColNum_Title, !bGXsfl_112_Refreshing);
      edtMmezColTip_Title = AV32Lit12 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezColTip_Internalname, "Title", edtMmezColTip_Title, !bGXsfl_112_Refreshing);
      edtMmezColKil_Title = AV33Lit13 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezColKil_Internalname, "Title", edtMmezColKil_Title, !bGXsfl_112_Refreshing);
   }

   public void standaloneModal( )
   {
      if ( isUpd( )  )
      {
         AV19Modo = httpContext.getMessage( httpContext.getMessage( "UPD", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Modo", AV19Modo);
      }
      else
      {
         if ( isIns( )  )
         {
            AV19Modo = httpContext.getMessage( httpContext.getMessage( "INS", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19Modo", AV19Modo);
         }
         else
         {
            if ( isDlt( )  )
            {
               AV19Modo = httpContext.getMessage( httpContext.getMessage( "DEL", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19Modo", AV19Modo);
            }
         }
      }
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

   public void load1FR1581( )
   {
      /* Using cursor T01FR13 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1581 = (short)(1) ;
         A407EmprNom = T01FR13_A407EmprNom[0] ;
         n407EmprNom = T01FR13_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01FR13_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A5810MMezKgs = T01FR13_A5810MMezKgs[0] ;
         n5810MMezKgs = T01FR13_n5810MMezKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5810MMezKgs", GXutil.ltrimstr( A5810MMezKgs, 9, 2));
         A5811MMezPda = T01FR13_A5811MMezPda[0] ;
         n5811MMezPda = T01FR13_n5811MMezPda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5811MMezPda", A5811MMezPda);
         A5812MMezFecPda = T01FR13_A5812MMezFecPda[0] ;
         n5812MMezFecPda = T01FR13_n5812MMezFecPda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5812MMezFecPda", localUtil.format(A5812MMezFecPda, "99/99/99"));
         A5813MMezFecEnt = T01FR13_A5813MMezFecEnt[0] ;
         n5813MMezFecEnt = T01FR13_n5813MMezFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5813MMezFecEnt", localUtil.format(A5813MMezFecEnt, "99/99/99"));
         A5814MMezPorTot = T01FR13_A5814MMezPorTot[0] ;
         n5814MMezPorTot = T01FR13_n5814MMezPorTot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5814MMezPorTot", GXutil.ltrimstr( A5814MMezPorTot, 6, 2));
         zm1FR1581( -25) ;
      }
      pr_default.close(10);
      onLoadActions1FR1581( ) ;
   }

   public void onLoadActions1FR1581( )
   {
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
      A5820MmezArtKil = GXutil.roundDecimal( (A5810MMezKgs.multiply(A5819MmezArtPor).divide(A5814MMezPorTot, 18, java.math.RoundingMode.DOWN)), 2) ;
   }

   public void checkExtendedTable1FR1581( )
   {
      nIsDirty_1581 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
      nIsDirty_1581 = (short)(1) ;
      A5820MmezArtKil = GXutil.roundDecimal( (A5810MMezKgs.multiply(A5819MmezArtPor).divide(A5814MMezPorTot, 18, java.math.RoundingMode.DOWN)), 2) ;
   }

   public void closeExtendedTableCursors1FR1581( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1FR1581( )
   {
      /* Using cursor T01FR14 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1581 = (short)(1) ;
      }
      else
      {
         RcdFound1581 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01FR10 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
      if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01FR10_A5809MMezCod[0], A5809MMezCod) == 0 ) && ( GXutil.strcmp(T01FR10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FR10_A252CliCod[0] == A252CliCod ) )
      {
         zm1FR1581( 25) ;
         RcdFound1581 = (short)(1) ;
         A5810MMezKgs = T01FR10_A5810MMezKgs[0] ;
         n5810MMezKgs = T01FR10_n5810MMezKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5810MMezKgs", GXutil.ltrimstr( A5810MMezKgs, 9, 2));
         A5811MMezPda = T01FR10_A5811MMezPda[0] ;
         n5811MMezPda = T01FR10_n5811MMezPda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5811MMezPda", A5811MMezPda);
         A5812MMezFecPda = T01FR10_A5812MMezFecPda[0] ;
         n5812MMezFecPda = T01FR10_n5812MMezFecPda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5812MMezFecPda", localUtil.format(A5812MMezFecPda, "99/99/99"));
         A5813MMezFecEnt = T01FR10_A5813MMezFecEnt[0] ;
         n5813MMezFecEnt = T01FR10_n5813MMezFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5813MMezFecEnt", localUtil.format(A5813MMezFecEnt, "99/99/99"));
         A5814MMezPorTot = T01FR10_A5814MMezPorTot[0] ;
         n5814MMezPorTot = T01FR10_n5814MMezPorTot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5814MMezPorTot", GXutil.ltrimstr( A5814MMezPorTot, 6, 2));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z5809MMezCod = A5809MMezCod ;
         sMode1581 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1FR1581( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1581 = (short)(0) ;
            initializeNonKey1FR1581( ) ;
         }
         Gx_mode = sMode1581 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1581 = (short)(0) ;
         initializeNonKey1FR1581( ) ;
         sMode1581 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1581 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(7);
   }

   public void getEqualNoModal( )
   {
      getKey1FR1581( ) ;
      if ( RcdFound1581 == 0 )
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
      RcdFound1581 = (short)(0) ;
      /* Using cursor T01FR15 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T01FR15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FR15_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FR15_A5809MMezCod[0], A5809MMezCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T01FR15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FR15_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FR15_A5809MMezCod[0], A5809MMezCod) == 0 ) )
         {
            RcdFound1581 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound1581 = (short)(0) ;
      /* Using cursor T01FR16 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( GXutil.strcmp(T01FR16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FR16_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FR16_A5809MMezCod[0], A5809MMezCod) == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( GXutil.strcmp(T01FR16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FR16_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FR16_A5809MMezCod[0], A5809MMezCod) == 0 ) )
         {
            RcdFound1581 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1FR1581( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A5820MmezArtKil = O5820MmezArtKil ;
         insert1FR1581( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1581 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A5809MMezCod, Z5809MMezCod) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A5820MmezArtKil = O5820MmezArtKil ;
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A5820MmezArtKil = O5820MmezArtKil ;
               update1FR1581( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A5809MMezCod, Z5809MMezCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A5820MmezArtKil = O5820MmezArtKil ;
               insert1FR1581( ) ;
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
                  A5820MmezArtKil = O5820MmezArtKil ;
                  insert1FR1581( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A5809MMezCod, Z5809MMezCod) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A5820MmezArtKil = O5820MmezArtKil ;
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
      getKey1FR1581( ) ;
      if ( RcdFound1581 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A5809MMezCod, Z5809MMezCod) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A5809MMezCod, Z5809MMezCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tmezcol");
   }

   public void insert_check( )
   {
      confirm_1FR0( ) ;
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
      if ( RcdFound1581 == 0 )
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
      scanStart1FR1581( ) ;
      if ( RcdFound1581 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1FR1581( ) ;
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
      if ( RcdFound1581 == 0 )
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
      if ( RcdFound1581 == 0 )
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
      scanStart1FR1581( ) ;
      if ( RcdFound1581 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1581 != 0 )
         {
            scanNext1FR1581( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1FR1581( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1FR1581( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FR9 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMEZCLI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(6) == 101) || ( DecimalUtil.compareTo(Z5810MMezKgs, T01FR9_A5810MMezKgs[0]) != 0 ) || ( GXutil.strcmp(Z5811MMezPda, T01FR9_A5811MMezPda[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z5812MMezFecPda), GXutil.resetTime(T01FR9_A5812MMezFecPda[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z5813MMezFecEnt), GXutil.resetTime(T01FR9_A5813MMezFecEnt[0])) ) || ( DecimalUtil.compareTo(Z5814MMezPorTot, T01FR9_A5814MMezPorTot[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z5810MMezKgs, T01FR9_A5810MMezKgs[0]) != 0 )
            {
               GXutil.writeLogln("tmezcol:[seudo value changed for attri]"+"MMezKgs");
               GXutil.writeLogRaw("Old: ",Z5810MMezKgs);
               GXutil.writeLogRaw("Current: ",T01FR9_A5810MMezKgs[0]);
            }
            if ( GXutil.strcmp(Z5811MMezPda, T01FR9_A5811MMezPda[0]) != 0 )
            {
               GXutil.writeLogln("tmezcol:[seudo value changed for attri]"+"MMezPda");
               GXutil.writeLogRaw("Old: ",Z5811MMezPda);
               GXutil.writeLogRaw("Current: ",T01FR9_A5811MMezPda[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5812MMezFecPda), GXutil.resetTime(T01FR9_A5812MMezFecPda[0])) ) )
            {
               GXutil.writeLogln("tmezcol:[seudo value changed for attri]"+"MMezFecPda");
               GXutil.writeLogRaw("Old: ",Z5812MMezFecPda);
               GXutil.writeLogRaw("Current: ",T01FR9_A5812MMezFecPda[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5813MMezFecEnt), GXutil.resetTime(T01FR9_A5813MMezFecEnt[0])) ) )
            {
               GXutil.writeLogln("tmezcol:[seudo value changed for attri]"+"MMezFecEnt");
               GXutil.writeLogRaw("Old: ",Z5813MMezFecEnt);
               GXutil.writeLogRaw("Current: ",T01FR9_A5813MMezFecEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z5814MMezPorTot, T01FR9_A5814MMezPorTot[0]) != 0 )
            {
               GXutil.writeLogln("tmezcol:[seudo value changed for attri]"+"MMezPorTot");
               GXutil.writeLogRaw("Old: ",Z5814MMezPorTot);
               GXutil.writeLogRaw("Current: ",T01FR9_A5814MMezPorTot[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMEZCLI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FR1581( )
   {
      beforeValidate1FR1581( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FR1581( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FR1581( 0) ;
         checkOptimisticConcurrency1FR1581( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FR1581( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FR1581( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FR17 */
                  pr_default.execute(14, new Object[] {A5809MMezCod, Boolean.valueOf(n5810MMezKgs), A5810MMezKgs, Boolean.valueOf(n5811MMezPda), A5811MMezPda, Boolean.valueOf(n5812MMezFecPda), A5812MMezFecPda, Boolean.valueOf(n5813MMezFecEnt), A5813MMezFecEnt, Boolean.valueOf(n5814MMezPorTot), A5814MMezPorTot, A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZCLI");
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
                        processLevel1FR1581( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1FR0( ) ;
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
            load1FR1581( ) ;
         }
         endLevel1FR1581( ) ;
      }
      closeExtendedTableCursors1FR1581( ) ;
   }

   public void update1FR1581( )
   {
      beforeValidate1FR1581( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FR1581( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FR1581( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FR1581( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1FR1581( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FR18 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n5810MMezKgs), A5810MMezKgs, Boolean.valueOf(n5811MMezPda), A5811MMezPda, Boolean.valueOf(n5812MMezFecPda), A5812MMezFecPda, Boolean.valueOf(n5813MMezFecEnt), A5813MMezFecEnt, Boolean.valueOf(n5814MMezPorTot), A5814MMezPorTot, A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZCLI");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMEZCLI"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1FR1581( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1FR1581( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1FR0( ) ;
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
         endLevel1FR1581( ) ;
      }
      closeExtendedTableCursors1FR1581( ) ;
   }

   public void deferredUpdate1FR1581( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FR1581( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FR1581( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FR1581( ) ;
         afterConfirm1FR1581( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FR1581( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01FR19 */
               pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZCLI");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1581 == 0 )
                     {
                        initAll1FR1581( ) ;
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
                     resetCaption1FR0( ) ;
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
      sMode1581 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FR1581( ) ;
      Gx_mode = sMode1581 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FR1581( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( 1 < 0 )
         {
            AV17UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         }
         A5820MmezArtKil = GXutil.roundDecimal( (A5810MMezKgs.multiply(A5819MmezArtPor).divide(A5814MMezPorTot, 18, java.math.RoundingMode.DOWN)), 2) ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01FR20 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MEZCLAS CLIENTE MATERIAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
      }
   }

   public void processNestedLevel1FR1582( )
   {
      s5820MmezArtKil = O5820MmezArtKil ;
      nGXsfl_70_idx = 0 ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRow1FR1582( ) ;
         if ( ( nRcdExists_1582 != 0 ) || ( nIsMod_1582 != 0 ) )
         {
            standaloneNotModal1FR1582( ) ;
            getKey1FR1582( ) ;
            if ( ( nRcdExists_1582 == 0 ) && ( nRcdDeleted_1582 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1FR1582( ) ;
            }
            else
            {
               if ( RcdFound1582 != 0 )
               {
                  if ( ( nRcdDeleted_1582 != 0 ) && ( nRcdExists_1582 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1FR1582( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1582 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1FR1582( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1582 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            O5820MmezArtKil = A5820MmezArtKil ;
         }
         httpContext.changePostValue( edtArtCod_Internalname, GXutil.rtrim( A65ArtCod)) ;
         httpContext.changePostValue( edtMMezArtDsc_Internalname, GXutil.rtrim( A5816MMezArtDsc)) ;
         httpContext.changePostValue( edtMmezUltCol_Internalname, GXutil.ltrim( localUtil.ntoc( A5817MmezUltCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezUltPar_Internalname, GXutil.ltrim( localUtil.ntoc( A5818MmezUltPar, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezArtPor_Internalname, GXutil.ltrim( localUtil.ntoc( A5819MmezArtPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezArtKil_Internalname, GXutil.ltrim( localUtil.ntoc( A5820MmezArtKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezArtPCT_Internalname, GXutil.ltrim( localUtil.ntoc( A5821MmezArtPCT, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5816MMezArtDsc_"+sGXsfl_70_idx, GXutil.rtrim( Z5816MMezArtDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z5817MmezUltCol_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z5817MmezUltCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5818MmezUltPar_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z5818MmezUltPar, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T5817MmezUltCol_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( O5817MmezUltCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T5821MmezArtPCT_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( O5821MmezArtPCT, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_112_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_112, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1582_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1582, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1582_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1582, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1582_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1582, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1582 != 0 )
         {
            httpContext.changePostValue( "ARTCOD_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZARTDSC_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMezArtDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZULTCOL_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezUltCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZULTPAR_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezUltPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZARTPOR_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezArtPor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZARTKIL_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezArtKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZARTPCT_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezArtPCT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1FR1582( ) ;
      if ( AnyError != 0 )
      {
         O5820MmezArtKil = s5820MmezArtKil ;
      }
      nRcdExists_1582 = (short)(0) ;
      nIsMod_1582 = (short)(0) ;
      nRcdDeleted_1582 = (short)(0) ;
   }

   public void processLevel1FR1581( )
   {
      /* Save parent mode. */
      sMode1581 = Gx_mode ;
      processNestedLevel1FR1582( ) ;
      if ( AnyError != 0 )
      {
         O5820MmezArtKil = s5820MmezArtKil ;
      }
      /* Restore parent mode. */
      Gx_mode = sMode1581 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1FR1581( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(6);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1FR1581( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmezcol");
         if ( AnyError == 0 )
         {
            confirmValues1FR0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmezcol");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1FR1581( )
   {
      /* Scan By routine */
      /* Using cursor T01FR21 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
      RcdFound1581 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1581 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FR1581( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound1581 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1581 = (short)(1) ;
      }
   }

   public void scanEnd1FR1581( )
   {
      pr_default.close(18);
   }

   public void afterConfirm1FR1581( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FR1581( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FR1581( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FR1581( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FR1581( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FR1581( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FR1581( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtMMezCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtMMezKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezKgs_Enabled), 5, 0), true);
      edtMMezPda_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezPda_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezPda_Enabled), 5, 0), true);
      edtMMezFecPda_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezFecPda_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezFecPda_Enabled), 5, 0), true);
      edtMMezFecEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezFecEnt_Enabled), 5, 0), true);
      edtMMezPorTot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezPorTot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezPorTot_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtMmezArtPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezArtPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezArtPor_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtMmezArtKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezArtKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezArtKil_Enabled), 5, 0), !bGXsfl_70_Refreshing);
   }

   public void zm1FR1582( int GX_JID )
   {
      if ( ( GX_JID == 28 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5816MMezArtDsc = T01FR5_A5816MMezArtDsc[0] ;
            Z5817MmezUltCol = T01FR5_A5817MmezUltCol[0] ;
            Z5818MmezUltPar = T01FR5_A5818MmezUltPar[0] ;
         }
         else
         {
            Z5816MMezArtDsc = A5816MMezArtDsc ;
            Z5817MmezUltCol = A5817MmezUltCol ;
            Z5818MmezUltPar = A5818MmezUltPar ;
         }
      }
      if ( GX_JID == -28 )
      {
         Z5809MMezCod = A5809MMezCod ;
         Z5816MMezArtDsc = A5816MMezArtDsc ;
         Z5817MmezUltCol = A5817MmezUltCol ;
         Z5818MmezUltPar = A5818MmezUltPar ;
         Z5819MmezArtPor = A5819MmezArtPor ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z5821MmezArtPCT = A5821MmezArtPCT ;
      }
   }

   public void standaloneNotModal1FR1582( )
   {
      edtMMezArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezArtDsc_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtMmezUltCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezUltCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezUltCol_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      /* Using cursor T01FR6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         GXCCtl = "ARTCOD_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
      }
      pr_default.close(4);
      /* Using cursor T01FR8 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A5821MmezArtPCT = T01FR8_A5821MmezArtPCT[0] ;
         n5821MmezArtPCT = T01FR8_n5821MmezArtPCT[0] ;
      }
      else
      {
         A5821MmezArtPCT = DecimalUtil.doubleToDec(0) ;
         n5821MmezArtPCT = false ;
      }
      O5821MmezArtPCT = A5821MmezArtPCT ;
      n5821MmezArtPCT = false ;
      pr_default.close(5);
      A5820MmezArtKil = GXutil.roundDecimal( (A5810MMezKgs.multiply(A5819MmezArtPor).divide(A5814MMezPorTot, 18, java.math.RoundingMode.DOWN)), 2) ;
   }

   public void standaloneModal1FR1582( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtArtCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      }
      else
      {
         edtArtCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      }
   }

   public void load1FR1582( )
   {
      /* Using cursor T01FR23 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod, Boolean.valueOf(n5819MmezArtPor), A5819MmezArtPor});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1582 = (short)(1) ;
         A5816MMezArtDsc = T01FR23_A5816MMezArtDsc[0] ;
         n5816MMezArtDsc = T01FR23_n5816MMezArtDsc[0] ;
         A5817MmezUltCol = T01FR23_A5817MmezUltCol[0] ;
         n5817MmezUltCol = T01FR23_n5817MmezUltCol[0] ;
         A5818MmezUltPar = T01FR23_A5818MmezUltPar[0] ;
         n5818MmezUltPar = T01FR23_n5818MmezUltPar[0] ;
         A5821MmezArtPCT = T01FR23_A5821MmezArtPCT[0] ;
         n5821MmezArtPCT = T01FR23_n5821MmezArtPCT[0] ;
         zm1FR1582( -28) ;
      }
      pr_default.close(19);
      onLoadActions1FR1582( ) ;
   }

   public void onLoadActions1FR1582( )
   {
   }

   public void checkExtendedTable1FR1582( )
   {
      nIsDirty_1582 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1FR1582( ) ;
   }

   public void closeExtendedTableCursors1FR1582( )
   {
   }

   public void enableDisable1FR1582( )
   {
   }

   public void getKey1FR1582( )
   {
      /* Using cursor T01FR24 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1582 = (short)(1) ;
      }
      else
      {
         RcdFound1582 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey1FR1582( )
   {
      /* Using cursor T01FR5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01FR5_A5809MMezCod[0], A5809MMezCod) == 0 ) && ( DecimalUtil.compareTo(T01FR5_A5819MmezArtPor[0], A5819MmezArtPor) == 0 ) && ( GXutil.strcmp(T01FR5_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FR5_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FR5_A65ArtCod[0], A65ArtCod) == 0 ) )
      {
         zm1FR1582( 28) ;
         RcdFound1582 = (short)(1) ;
         initializeNonKey1FR1582( ) ;
         A5816MMezArtDsc = T01FR5_A5816MMezArtDsc[0] ;
         n5816MMezArtDsc = T01FR5_n5816MMezArtDsc[0] ;
         A5817MmezUltCol = T01FR5_A5817MmezUltCol[0] ;
         n5817MmezUltCol = T01FR5_n5817MmezUltCol[0] ;
         A5818MmezUltPar = T01FR5_A5818MmezUltPar[0] ;
         n5818MmezUltPar = T01FR5_n5818MmezUltPar[0] ;
         O5817MmezUltCol = A5817MmezUltCol ;
         n5817MmezUltCol = false ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z5809MMezCod = A5809MMezCod ;
         Z65ArtCod = A65ArtCod ;
         sMode1582 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FR1582( ) ;
         load1FR1582( ) ;
         Gx_mode = sMode1582 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1582 = (short)(0) ;
         initializeNonKey1FR1582( ) ;
         sMode1582 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FR1582( ) ;
         Gx_mode = sMode1582 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1FR1582( ) ;
      }
      pr_default.close(3);
   }

   public void checkOptimisticConcurrency1FR1582( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FR4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMEZCL1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z5816MMezArtDsc, T01FR4_A5816MMezArtDsc[0]) != 0 ) || ( Z5817MmezUltCol != T01FR4_A5817MmezUltCol[0] ) || ( Z5818MmezUltPar != T01FR4_A5818MmezUltPar[0] ) )
         {
            if ( GXutil.strcmp(Z5816MMezArtDsc, T01FR4_A5816MMezArtDsc[0]) != 0 )
            {
               GXutil.writeLogln("tmezcol:[seudo value changed for attri]"+"MMezArtDsc");
               GXutil.writeLogRaw("Old: ",Z5816MMezArtDsc);
               GXutil.writeLogRaw("Current: ",T01FR4_A5816MMezArtDsc[0]);
            }
            if ( Z5817MmezUltCol != T01FR4_A5817MmezUltCol[0] )
            {
               GXutil.writeLogln("tmezcol:[seudo value changed for attri]"+"MmezUltCol");
               GXutil.writeLogRaw("Old: ",Z5817MmezUltCol);
               GXutil.writeLogRaw("Current: ",T01FR4_A5817MmezUltCol[0]);
            }
            if ( Z5818MmezUltPar != T01FR4_A5818MmezUltPar[0] )
            {
               GXutil.writeLogln("tmezcol:[seudo value changed for attri]"+"MmezUltPar");
               GXutil.writeLogRaw("Old: ",Z5818MmezUltPar);
               GXutil.writeLogRaw("Current: ",T01FR4_A5818MmezUltPar[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMEZCL1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FR1582( )
   {
      beforeValidate1FR1582( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FR1582( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FR1582( 0) ;
         checkOptimisticConcurrency1FR1582( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FR1582( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FR1582( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FR25 */
                  pr_default.execute(21, new Object[] {A5809MMezCod, Boolean.valueOf(n5816MMezArtDsc), A5816MMezArtDsc, Boolean.valueOf(n5817MmezUltCol), Byte.valueOf(A5817MmezUltCol), Boolean.valueOf(n5818MmezUltPar), Byte.valueOf(A5818MmezUltPar), Boolean.valueOf(n5819MmezArtPor), A5819MmezArtPor, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZCL1");
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
                        processLevel1FR1582( ) ;
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
            load1FR1582( ) ;
         }
         endLevel1FR1582( ) ;
      }
      closeExtendedTableCursors1FR1582( ) ;
   }

   public void update1FR1582( )
   {
      beforeValidate1FR1582( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FR1582( ) ;
      }
      if ( ( nIsMod_1582 != 0 ) || ( nIsDirty_1582 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1FR1582( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1FR1582( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1FR1582( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01FR26 */
                     pr_default.execute(22, new Object[] {Boolean.valueOf(n5816MMezArtDsc), A5816MMezArtDsc, Boolean.valueOf(n5817MmezUltCol), Byte.valueOf(A5817MmezUltCol), Boolean.valueOf(n5818MmezUltPar), Byte.valueOf(A5818MmezUltPar), Boolean.valueOf(n5819MmezArtPor), A5819MmezArtPor, A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZCL1");
                     if ( (pr_default.getStatus(22) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMEZCL1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1FR1582( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel1FR1582( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey1FR1582( ) ;
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
            endLevel1FR1582( ) ;
         }
      }
      closeExtendedTableCursors1FR1582( ) ;
   }

   public void deferredUpdate1FR1582( )
   {
   }

   public void delete1FR1582( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FR1582( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FR1582( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FR1582( ) ;
         afterConfirm1FR1582( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FR1582( ) ;
            if ( AnyError == 0 )
            {
               A5817MmezUltCol = O5817MmezUltCol ;
               n5817MmezUltCol = false ;
               A5821MmezArtPCT = O5821MmezArtPCT ;
               n5821MmezArtPCT = false ;
               scanStart1FR1583( ) ;
               while ( RcdFound1583 != 0 )
               {
                  getByPrimaryKey1FR1583( ) ;
                  delete1FR1583( ) ;
                  scanNext1FR1583( ) ;
                  O5817MmezUltCol = A5817MmezUltCol ;
                  n5817MmezUltCol = false ;
                  O5821MmezArtPCT = A5821MmezArtPCT ;
                  n5821MmezArtPCT = false ;
               }
               scanEnd1FR1583( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FR27 */
                  pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZCL1");
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
      sMode1582 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FR1582( ) ;
      Gx_mode = sMode1582 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FR1582( )
   {
      standaloneModal1FR1582( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01FR28 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MEZCLAS PARTIDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
      }
   }

   public void processNestedLevel1FR1583( )
   {
      s5817MmezUltCol = O5817MmezUltCol ;
      n5817MmezUltCol = false ;
      s5821MmezArtPCT = O5821MmezArtPCT ;
      n5821MmezArtPCT = false ;
      nGXsfl_112_idx = 0 ;
      while ( nGXsfl_112_idx < nRC_GXsfl_112 )
      {
         readRow1FR1583( ) ;
         if ( ( nRcdExists_1583 != 0 ) || ( nIsMod_1583 != 0 ) )
         {
            standaloneNotModal1FR1583( ) ;
            getKey1FR1583( ) ;
            if ( ( nRcdExists_1583 == 0 ) && ( nRcdDeleted_1583 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1FR1583( ) ;
            }
            else
            {
               if ( RcdFound1583 != 0 )
               {
                  if ( ( nRcdDeleted_1583 != 0 ) && ( nRcdExists_1583 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1FR1583( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1583 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1FR1583( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1583 == 0 )
                  {
                     GXCCtl = "MMEZLINCOL_" + sGXsfl_112_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMmezLinCol_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O5817MmezUltCol = A5817MmezUltCol ;
            n5817MmezUltCol = false ;
            O5821MmezArtPCT = A5821MmezArtPCT ;
            n5821MmezArtPCT = false ;
         }
         httpContext.changePostValue( edtavnRcdDeleted_1583_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1583, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezLinCol_Internalname, GXutil.ltrim( localUtil.ntoc( A5822MmezLinCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezColPor_Internalname, GXutil.ltrim( localUtil.ntoc( A5823MmezColPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezColor_Internalname, GXutil.rtrim( A5824MmezColor)) ;
         httpContext.changePostValue( edtMmezColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A5825MmezColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezColTip_Internalname, GXutil.ltrim( localUtil.ntoc( A5826MmezColTip, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezColKil_Internalname, GXutil.ltrim( localUtil.ntoc( A5827MmezColKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5822MmezLinCol_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( Z5822MmezLinCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5823MmezColPor_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( Z5823MmezColPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5824MmezColor_"+sGXsfl_112_idx, GXutil.rtrim( Z5824MmezColor)) ;
         httpContext.changePostValue( "ZT_"+"Z5825MmezColNum_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( Z5825MmezColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5826MmezColTip_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( Z5826MmezColTip, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T5823MmezColPor_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( O5823MmezColPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1583_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1583, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1583_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1583, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1583_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1583, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1583 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1583_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1583_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZLINCOL_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezLinCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZCOLPOR_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezColPor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZCOLOR_"+sGXsfl_112_idx+"Title", GXutil.rtrim( edtMmezColor_Title)) ;
            httpContext.changePostValue( "MMEZCOLOR_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezColor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZCOLNUM_"+sGXsfl_112_idx+"Title", GXutil.rtrim( edtMmezColNum_Title)) ;
            httpContext.changePostValue( "MMEZCOLNUM_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZCOLTIP_"+sGXsfl_112_idx+"Title", GXutil.rtrim( edtMmezColTip_Title)) ;
            httpContext.changePostValue( "MMEZCOLTIP_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezColTip_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZCOLKIL_"+sGXsfl_112_idx+"Title", GXutil.rtrim( edtMmezColKil_Title)) ;
            httpContext.changePostValue( "MMEZCOLKIL_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezColKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1FR1583( ) ;
      if ( AnyError != 0 )
      {
         O5817MmezUltCol = s5817MmezUltCol ;
         n5817MmezUltCol = false ;
         O5821MmezArtPCT = s5821MmezArtPCT ;
         n5821MmezArtPCT = false ;
      }
      nRcdExists_1583 = (short)(0) ;
      nIsMod_1583 = (short)(0) ;
      nRcdDeleted_1583 = (short)(0) ;
   }

   public void processLevel1FR1582( )
   {
      /* Save parent mode. */
      sMode1582 = Gx_mode ;
      processNestedLevel1FR1583( ) ;
      if ( AnyError != 0 )
      {
         O5817MmezUltCol = s5817MmezUltCol ;
         n5817MmezUltCol = false ;
         O5821MmezArtPCT = s5821MmezArtPCT ;
         n5821MmezArtPCT = false ;
      }
      /* Restore parent mode. */
      Gx_mode = sMode1582 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01FR29 */
      pr_default.execute(25, new Object[] {Boolean.valueOf(n5817MmezUltCol), Byte.valueOf(A5817MmezUltCol), A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZCL1");
   }

   public void endLevel1FR1582( )
   {
      pr_default.close(2);
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1FR1582( )
   {
      /* Scan By routine */
      /* Using cursor T01FR30 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod, Boolean.valueOf(n5819MmezArtPor), A5819MmezArtPor});
      RcdFound1582 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1582 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FR1582( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound1582 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1582 = (short)(1) ;
      }
   }

   public void scanEnd1FR1582( )
   {
      pr_default.close(26);
   }

   public void afterConfirm1FR1582( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FR1582( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FR1582( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FR1582( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FR1582( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FR1582( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FR1582( )
   {
      edtMMezArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezArtDsc_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtMmezUltCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezUltCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezUltCol_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtMmezUltPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezUltPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezUltPar_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtMmezArtPCT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezArtPCT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezArtPCT_Enabled), 5, 0), !bGXsfl_70_Refreshing);
   }

   public void zm1FR1583( int GX_JID )
   {
      if ( ( GX_JID == 31 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5823MmezColPor = T01FR3_A5823MmezColPor[0] ;
            Z5824MmezColor = T01FR3_A5824MmezColor[0] ;
            Z5825MmezColNum = T01FR3_A5825MmezColNum[0] ;
            Z5826MmezColTip = T01FR3_A5826MmezColTip[0] ;
         }
         else
         {
            Z5823MmezColPor = A5823MmezColPor ;
            Z5824MmezColor = A5824MmezColor ;
            Z5825MmezColNum = A5825MmezColNum ;
            Z5826MmezColTip = A5826MmezColTip ;
         }
      }
      if ( GX_JID == -31 )
      {
         Z252CliCod = A252CliCod ;
         Z5809MMezCod = A5809MMezCod ;
         Z65ArtCod = A65ArtCod ;
         Z5822MmezLinCol = A5822MmezLinCol ;
         Z5823MmezColPor = A5823MmezColPor ;
         Z5824MmezColor = A5824MmezColor ;
         Z5825MmezColNum = A5825MmezColNum ;
         Z5826MmezColTip = A5826MmezColTip ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1FR1583( )
   {
      edtMmezUltCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezUltCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezUltCol_Enabled), 5, 0), !bGXsfl_70_Refreshing);
   }

   public void standaloneModal1FR1583( )
   {
      if ( isIns( )  )
      {
         A5817MmezUltCol = (byte)(O5817MmezUltCol+1) ;
         n5817MmezUltCol = false ;
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A5822MmezLinCol = A5817MmezUltCol ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMmezLinCol_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMmezLinCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezLinCol_Enabled), 5, 0), !bGXsfl_112_Refreshing);
      }
      else
      {
         edtMmezLinCol_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMmezLinCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezLinCol_Enabled), 5, 0), !bGXsfl_112_Refreshing);
      }
   }

   public void load1FR1583( )
   {
      /* Using cursor T01FR31 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod, Byte.valueOf(A5822MmezLinCol)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1583 = (short)(1) ;
         A5823MmezColPor = T01FR31_A5823MmezColPor[0] ;
         n5823MmezColPor = T01FR31_n5823MmezColPor[0] ;
         A5824MmezColor = T01FR31_A5824MmezColor[0] ;
         n5824MmezColor = T01FR31_n5824MmezColor[0] ;
         A5825MmezColNum = T01FR31_A5825MmezColNum[0] ;
         n5825MmezColNum = T01FR31_n5825MmezColNum[0] ;
         A5826MmezColTip = T01FR31_A5826MmezColTip[0] ;
         n5826MmezColTip = T01FR31_n5826MmezColTip[0] ;
         zm1FR1583( -31) ;
      }
      pr_default.close(27);
      onLoadActions1FR1583( ) ;
   }

   public void onLoadActions1FR1583( )
   {
      A5827MmezColKil = GXutil.roundDecimal( (A5820MmezArtKil.multiply(A5823MmezColPor).divide(A5819MmezArtPor, 18, java.math.RoundingMode.DOWN)), 2) ;
      if ( isIns( )  )
      {
         A5821MmezArtPCT = O5821MmezArtPCT.add(A5823MmezColPor) ;
         n5821MmezArtPCT = false ;
      }
      else
      {
         if ( isUpd( )  )
         {
            A5821MmezArtPCT = O5821MmezArtPCT.add(A5823MmezColPor).subtract(O5823MmezColPor) ;
            n5821MmezArtPCT = false ;
         }
         else
         {
            if ( isDlt( )  )
            {
               A5821MmezArtPCT = O5821MmezArtPCT.subtract(O5823MmezColPor) ;
               n5821MmezArtPCT = false ;
            }
         }
      }
   }

   public void checkExtendedTable1FR1583( )
   {
      nIsDirty_1583 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1FR1583( ) ;
      if ( DecimalUtil.compareTo(A5823MmezColPor, A5819MmezArtPor) > 0 )
      {
         GXCCtl = "MMEZCOLPOR_" + sGXsfl_112_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. El porcentaje no puede ser superior al % Materia", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMmezColPor_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      nIsDirty_1583 = (short)(1) ;
      A5827MmezColKil = GXutil.roundDecimal( (A5820MmezArtKil.multiply(A5823MmezColPor).divide(A5819MmezArtPor, 18, java.math.RoundingMode.DOWN)), 2) ;
      if ( isIns( )  )
      {
         nIsDirty_1583 = (short)(1) ;
         A5821MmezArtPCT = O5821MmezArtPCT.add(A5823MmezColPor) ;
         n5821MmezArtPCT = false ;
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1583 = (short)(1) ;
            A5821MmezArtPCT = O5821MmezArtPCT.add(A5823MmezColPor).subtract(O5823MmezColPor) ;
            n5821MmezArtPCT = false ;
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1583 = (short)(1) ;
               A5821MmezArtPCT = O5821MmezArtPCT.subtract(O5823MmezColPor) ;
               n5821MmezArtPCT = false ;
            }
         }
      }
      if ( ( DecimalUtil.compareTo(A5821MmezArtPCT, A5819MmezArtPor) > 0 ) && true /* After */ )
      {
         GXCCtl = "MMEZCOLPOR_" + sGXsfl_112_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. La suma de porcentajes no puede ser superior al % Materia", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMmezColPor_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A252CliCod ;
         GXv_char3[0] = A65ArtCod ;
         GXv_char2[0] = A5824MmezColor ;
         GXv_int6[0] = A5825MmezColNum ;
         GXv_int7[0] = A5826MmezColTip ;
         GXv_int8[0] = AV75OkColor ;
         new app.pbuscol(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_char2, GXv_int6, GXv_int7, GXv_int8) ;
         tmezcol_impl.this.A396EmprCod = GXv_char4[0] ;
         tmezcol_impl.this.A252CliCod = GXv_int5[0] ;
         tmezcol_impl.this.A65ArtCod = GXv_char3[0] ;
         tmezcol_impl.this.A5824MmezColor = GXv_char2[0] ;
         tmezcol_impl.this.A5825MmezColNum = GXv_int6[0] ;
         tmezcol_impl.this.A5826MmezColTip = GXv_int7[0] ;
         tmezcol_impl.this.AV75OkColor = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV75OkColor", GXutil.str( AV75OkColor, 1, 0));
      }
      if ( true /* After */ && ( AV75OkColor == 0 ) )
      {
         GXCCtl = "MMEZCOLTIP_" + sGXsfl_112_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR: Formula del color inexistente", ""), 0, GXCCtl);
      }
   }

   public void closeExtendedTableCursors1FR1583( )
   {
   }

   public void enableDisable1FR1583( )
   {
   }

   public void getKey1FR1583( )
   {
      /* Using cursor T01FR32 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod, Byte.valueOf(A5822MmezLinCol)});
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1583 = (short)(1) ;
      }
      else
      {
         RcdFound1583 = (short)(0) ;
      }
      pr_default.close(28);
   }

   public void getByPrimaryKey1FR1583( )
   {
      /* Using cursor T01FR3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod, Byte.valueOf(A5822MmezLinCol)});
      if ( (pr_default.getStatus(1) != 101) && ( T01FR3_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FR3_A5809MMezCod[0], A5809MMezCod) == 0 ) && ( GXutil.strcmp(T01FR3_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T01FR3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1FR1583( 31) ;
         RcdFound1583 = (short)(1) ;
         initializeNonKey1FR1583( ) ;
         A5822MmezLinCol = T01FR3_A5822MmezLinCol[0] ;
         A5823MmezColPor = T01FR3_A5823MmezColPor[0] ;
         n5823MmezColPor = T01FR3_n5823MmezColPor[0] ;
         A5824MmezColor = T01FR3_A5824MmezColor[0] ;
         n5824MmezColor = T01FR3_n5824MmezColor[0] ;
         A5825MmezColNum = T01FR3_A5825MmezColNum[0] ;
         n5825MmezColNum = T01FR3_n5825MmezColNum[0] ;
         A5826MmezColTip = T01FR3_A5826MmezColTip[0] ;
         n5826MmezColTip = T01FR3_n5826MmezColTip[0] ;
         O5823MmezColPor = A5823MmezColPor ;
         n5823MmezColPor = false ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z5809MMezCod = A5809MMezCod ;
         Z65ArtCod = A65ArtCod ;
         Z5822MmezLinCol = A5822MmezLinCol ;
         sMode1583 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FR1583( ) ;
         load1FR1583( ) ;
         Gx_mode = sMode1583 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1583 = (short)(0) ;
         initializeNonKey1FR1583( ) ;
         sMode1583 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FR1583( ) ;
         Gx_mode = sMode1583 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1FR1583( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1FR1583( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FR2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod, Byte.valueOf(A5822MmezLinCol)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMEZCOL"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z5823MmezColPor, T01FR2_A5823MmezColPor[0]) != 0 ) || ( GXutil.strcmp(Z5824MmezColor, T01FR2_A5824MmezColor[0]) != 0 ) || ( Z5825MmezColNum != T01FR2_A5825MmezColNum[0] ) || ( Z5826MmezColTip != T01FR2_A5826MmezColTip[0] ) )
         {
            if ( DecimalUtil.compareTo(Z5823MmezColPor, T01FR2_A5823MmezColPor[0]) != 0 )
            {
               GXutil.writeLogln("tmezcol:[seudo value changed for attri]"+"MmezColPor");
               GXutil.writeLogRaw("Old: ",Z5823MmezColPor);
               GXutil.writeLogRaw("Current: ",T01FR2_A5823MmezColPor[0]);
            }
            if ( GXutil.strcmp(Z5824MmezColor, T01FR2_A5824MmezColor[0]) != 0 )
            {
               GXutil.writeLogln("tmezcol:[seudo value changed for attri]"+"MmezColor");
               GXutil.writeLogRaw("Old: ",Z5824MmezColor);
               GXutil.writeLogRaw("Current: ",T01FR2_A5824MmezColor[0]);
            }
            if ( Z5825MmezColNum != T01FR2_A5825MmezColNum[0] )
            {
               GXutil.writeLogln("tmezcol:[seudo value changed for attri]"+"MmezColNum");
               GXutil.writeLogRaw("Old: ",Z5825MmezColNum);
               GXutil.writeLogRaw("Current: ",T01FR2_A5825MmezColNum[0]);
            }
            if ( Z5826MmezColTip != T01FR2_A5826MmezColTip[0] )
            {
               GXutil.writeLogln("tmezcol:[seudo value changed for attri]"+"MmezColTip");
               GXutil.writeLogRaw("Old: ",Z5826MmezColTip);
               GXutil.writeLogRaw("Current: ",T01FR2_A5826MmezColTip[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMEZCOL"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FR1583( )
   {
      beforeValidate1FR1583( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FR1583( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FR1583( 0) ;
         checkOptimisticConcurrency1FR1583( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FR1583( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FR1583( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FR33 */
                  pr_default.execute(29, new Object[] {Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod, Byte.valueOf(A5822MmezLinCol), Boolean.valueOf(n5823MmezColPor), A5823MmezColPor, Boolean.valueOf(n5824MmezColor), A5824MmezColor, Boolean.valueOf(n5825MmezColNum), Integer.valueOf(A5825MmezColNum), Boolean.valueOf(n5826MmezColTip), Byte.valueOf(A5826MmezColTip), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZCOL");
                  if ( (pr_default.getStatus(29) == 1) )
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
            load1FR1583( ) ;
         }
         endLevel1FR1583( ) ;
      }
      closeExtendedTableCursors1FR1583( ) ;
   }

   public void update1FR1583( )
   {
      beforeValidate1FR1583( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FR1583( ) ;
      }
      if ( ( nIsMod_1583 != 0 ) || ( nIsDirty_1583 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1FR1583( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1FR1583( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1FR1583( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01FR34 */
                     pr_default.execute(30, new Object[] {Boolean.valueOf(n5823MmezColPor), A5823MmezColPor, Boolean.valueOf(n5824MmezColor), A5824MmezColor, Boolean.valueOf(n5825MmezColNum), Integer.valueOf(A5825MmezColNum), Boolean.valueOf(n5826MmezColTip), Byte.valueOf(A5826MmezColTip), A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod, Byte.valueOf(A5822MmezLinCol)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZCOL");
                     if ( (pr_default.getStatus(30) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMEZCOL"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1FR1583( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1FR1583( ) ;
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
            endLevel1FR1583( ) ;
         }
      }
      closeExtendedTableCursors1FR1583( ) ;
   }

   public void deferredUpdate1FR1583( )
   {
   }

   public void delete1FR1583( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FR1583( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FR1583( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FR1583( ) ;
         afterConfirm1FR1583( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FR1583( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01FR35 */
               pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod, Byte.valueOf(A5822MmezLinCol)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZCOL");
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
      sMode1583 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FR1583( ) ;
      Gx_mode = sMode1583 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FR1583( )
   {
      standaloneModal1FR1583( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A5827MmezColKil = GXutil.roundDecimal( (A5820MmezArtKil.multiply(A5823MmezColPor).divide(A5819MmezArtPor, 18, java.math.RoundingMode.DOWN)), 2) ;
         if ( isIns( )  )
         {
            A5821MmezArtPCT = O5821MmezArtPCT.add(A5823MmezColPor) ;
            n5821MmezArtPCT = false ;
         }
         else
         {
            if ( isUpd( )  )
            {
               A5821MmezArtPCT = O5821MmezArtPCT.add(A5823MmezColPor).subtract(O5823MmezColPor) ;
               n5821MmezArtPCT = false ;
            }
            else
            {
               if ( isDlt( )  )
               {
                  A5821MmezArtPCT = O5821MmezArtPCT.subtract(O5823MmezColPor) ;
                  n5821MmezArtPCT = false ;
               }
            }
         }
      }
   }

   public void endLevel1FR1583( )
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

   public void scanStart1FR1583( )
   {
      /* Scan By routine */
      /* Using cursor T01FR36 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod});
      RcdFound1583 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound1583 = (short)(1) ;
         A5822MmezLinCol = T01FR36_A5822MmezLinCol[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FR1583( )
   {
      /* Scan next routine */
      pr_default.readNext(32);
      RcdFound1583 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound1583 = (short)(1) ;
         A5822MmezLinCol = T01FR36_A5822MmezLinCol[0] ;
      }
   }

   public void scanEnd1FR1583( )
   {
      pr_default.close(32);
   }

   public void afterConfirm1FR1583( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FR1583( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FR1583( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FR1583( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FR1583( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FR1583( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FR1583( )
   {
      edtMmezLinCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezLinCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezLinCol_Enabled), 5, 0), !bGXsfl_112_Refreshing);
      edtMmezColPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezColPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezColPor_Enabled), 5, 0), !bGXsfl_112_Refreshing);
      edtMmezColor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezColor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezColor_Enabled), 5, 0), !bGXsfl_112_Refreshing);
      edtMmezColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezColNum_Enabled), 5, 0), !bGXsfl_112_Refreshing);
      edtMmezColTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezColTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezColTip_Enabled), 5, 0), !bGXsfl_112_Refreshing);
      edtMmezColKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezColKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezColKil_Enabled), 5, 0), !bGXsfl_112_Refreshing);
   }

   public void send_integrity_lvl_hashes1FR1583( )
   {
   }

   public void send_integrity_lvl_hashes1FR1582( )
   {
   }

   public void send_integrity_lvl_hashes1FR1581( )
   {
   }

   public void subsflControlProps_701582( )
   {
      lblTextblock11_Internalname = "TEXTBLOCK11_"+sGXsfl_70_idx ;
      edtArtCod_Internalname = "ARTCOD_"+sGXsfl_70_idx ;
      lblTextblock12_Internalname = "TEXTBLOCK12_"+sGXsfl_70_idx ;
      edtMMezArtDsc_Internalname = "MMEZARTDSC_"+sGXsfl_70_idx ;
      lblTextblock13_Internalname = "TEXTBLOCK13_"+sGXsfl_70_idx ;
      edtMmezUltCol_Internalname = "MMEZULTCOL_"+sGXsfl_70_idx ;
      lblTextblock14_Internalname = "TEXTBLOCK14_"+sGXsfl_70_idx ;
      edtMmezUltPar_Internalname = "MMEZULTPAR_"+sGXsfl_70_idx ;
      lblTextblock15_Internalname = "TEXTBLOCK15_"+sGXsfl_70_idx ;
      edtMmezArtPor_Internalname = "MMEZARTPOR_"+sGXsfl_70_idx ;
      lblTextblock16_Internalname = "TEXTBLOCK16_"+sGXsfl_70_idx ;
      edtMmezArtKil_Internalname = "MMEZARTKIL_"+sGXsfl_70_idx ;
      lblTextblock17_Internalname = "TEXTBLOCK17_"+sGXsfl_70_idx ;
      edtMmezArtPCT_Internalname = "MMEZARTPCT_"+sGXsfl_70_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_70_idx ;
   }

   public void subsflControlProps_fel_701582( )
   {
      lblTextblock11_Internalname = "TEXTBLOCK11_"+sGXsfl_70_fel_idx ;
      edtArtCod_Internalname = "ARTCOD_"+sGXsfl_70_fel_idx ;
      lblTextblock12_Internalname = "TEXTBLOCK12_"+sGXsfl_70_fel_idx ;
      edtMMezArtDsc_Internalname = "MMEZARTDSC_"+sGXsfl_70_fel_idx ;
      lblTextblock13_Internalname = "TEXTBLOCK13_"+sGXsfl_70_fel_idx ;
      edtMmezUltCol_Internalname = "MMEZULTCOL_"+sGXsfl_70_fel_idx ;
      lblTextblock14_Internalname = "TEXTBLOCK14_"+sGXsfl_70_fel_idx ;
      edtMmezUltPar_Internalname = "MMEZULTPAR_"+sGXsfl_70_fel_idx ;
      lblTextblock15_Internalname = "TEXTBLOCK15_"+sGXsfl_70_fel_idx ;
      edtMmezArtPor_Internalname = "MMEZARTPOR_"+sGXsfl_70_fel_idx ;
      lblTextblock16_Internalname = "TEXTBLOCK16_"+sGXsfl_70_fel_idx ;
      edtMmezArtKil_Internalname = "MMEZARTKIL_"+sGXsfl_70_fel_idx ;
      lblTextblock17_Internalname = "TEXTBLOCK17_"+sGXsfl_70_fel_idx ;
      edtMmezArtPCT_Internalname = "MMEZARTPCT_"+sGXsfl_70_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_70_fel_idx ;
   }

   public void addRow1FR1582( )
   {
      nRC_GXsfl_112 = 0 ;
      nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701582( ) ;
      sendRow1FR1582( ) ;
   }

   public void sendRow1FR1582( )
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
         if ( ((int)((nGXsfl_70_idx) % (2))) == 0 )
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
         httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_70_idx+"\">") ;
      }
      if ( GRID1_IsPaging == 0 )
      {
         GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_70_idx ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable3_Internalname+"_"+sGXsfl_70_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock11_Internalname,httpContext.getMessage( "Codigo Articulo", ""),"","",lblTextblock11_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtCod_Internalname,GXutil.rtrim( A65ArtCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtCod_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtArtCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(16),"chr",Integer.valueOf(1),"row",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock12_Internalname,httpContext.getMessage( "Descripcion Articulo Mezcla", ""),"","",lblTextblock12_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMMezArtDsc_Internalname,GXutil.rtrim( A5816MMezArtDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMMezArtDsc_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtMMezArtDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(26),"chr",Integer.valueOf(1),"row",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock13_Internalname,httpContext.getMessage( "Ultima linea Mezcla Color", ""),"","",lblTextblock13_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMmezUltCol_Internalname,GXutil.ltrim( localUtil.ntoc( A5817MmezUltCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMmezUltCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5817MmezUltCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A5817MmezUltCol), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMmezUltCol_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtMmezUltCol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(2),"chr",Integer.valueOf(1),"row",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock14_Internalname,httpContext.getMessage( "Ultima Linea Mezcla Partido", ""),"","",lblTextblock14_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1582_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMmezUltPar_Internalname,GXutil.ltrim( localUtil.ntoc( A5818MmezUltPar, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMmezUltPar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5818MmezUltPar), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A5818MmezUltPar), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,93);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMmezUltPar_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtMmezUltPar_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(2),"chr",Integer.valueOf(1),"row",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock15_Internalname,httpContext.getMessage( "Porcentaje Materia", ""),"","",lblTextblock15_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMmezArtPor_Internalname,GXutil.ltrim( localUtil.ntoc( A5819MmezArtPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMmezArtPor_Enabled!=0) ? localUtil.format( A5819MmezArtPor, "ZZ9.99") : localUtil.format( A5819MmezArtPor, "ZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMmezArtPor_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtMmezArtPor_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock16_Internalname,httpContext.getMessage( "Kilos Materia Mezcla", ""),"","",lblTextblock16_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMmezArtKil_Internalname,GXutil.ltrim( localUtil.ntoc( A5820MmezArtKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMmezArtKil_Enabled!=0) ? localUtil.format( A5820MmezArtKil, "ZZZZZ9.99") : localUtil.format( A5820MmezArtKil, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMmezArtKil_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtMmezArtKil_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(9),"chr",Integer.valueOf(1),"row",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock17_Internalname,httpContext.getMessage( "Suma Porcentaje Color Articulo", ""),"","",lblTextblock17_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMmezArtPCT_Internalname,GXutil.ltrim( localUtil.ntoc( A5821MmezArtPCT, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMmezArtPCT_Enabled!=0) ? localUtil.format( A5821MmezArtPCT, "ZZ9.99") : localUtil.format( A5821MmezArtPCT, "ZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMmezArtPCT_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtMmezArtPCT_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
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
      startgridcontrol112( ) ;
      nGXsfl_112_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1583 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1583 = (short)(1) ;
            scanStart1FR1583( ) ;
            while ( RcdFound1583 != 0 )
            {
               init_level_properties1583( ) ;
               getByPrimaryKey1FR1583( ) ;
               addRow1FR1583( ) ;
               scanNext1FR1583( ) ;
            }
            scanEnd1FR1583( ) ;
            nBlankRcdCount1583 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B5817MmezUltCol = A5817MmezUltCol ;
         n5817MmezUltCol = false ;
         B5821MmezArtPCT = A5821MmezArtPCT ;
         n5821MmezArtPCT = false ;
         B5820MmezArtKil = A5820MmezArtKil ;
         standaloneNotModal1FR1583( ) ;
         standaloneModal1FR1583( ) ;
         sMode1583 = Gx_mode ;
         while ( nGXsfl_112_idx < nRC_GXsfl_112 )
         {
            bGXsfl_112_Refreshing = true ;
            readRow1FR1583( ) ;
            edtavnRcdDeleted_1583_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1583_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1583_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1583_Enabled), 5, 0), !bGXsfl_112_Refreshing);
            edtMmezLinCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZLINCOL_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMmezLinCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezLinCol_Enabled), 5, 0), !bGXsfl_112_Refreshing);
            edtMmezColPor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZCOLPOR_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMmezColPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezColPor_Enabled), 5, 0), !bGXsfl_112_Refreshing);
            edtMmezColor_Title = httpContext.cgiGet( "MMEZCOLOR_"+sGXsfl_112_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtMmezColor_Internalname, "Title", edtMmezColor_Title, !bGXsfl_112_Refreshing);
            edtMmezColor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZCOLOR_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMmezColor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezColor_Enabled), 5, 0), !bGXsfl_112_Refreshing);
            edtMmezColNum_Title = httpContext.cgiGet( "MMEZCOLNUM_"+sGXsfl_112_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtMmezColNum_Internalname, "Title", edtMmezColNum_Title, !bGXsfl_112_Refreshing);
            edtMmezColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZCOLNUM_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMmezColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezColNum_Enabled), 5, 0), !bGXsfl_112_Refreshing);
            edtMmezColTip_Title = httpContext.cgiGet( "MMEZCOLTIP_"+sGXsfl_112_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtMmezColTip_Internalname, "Title", edtMmezColTip_Title, !bGXsfl_112_Refreshing);
            edtMmezColTip_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZCOLTIP_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMmezColTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezColTip_Enabled), 5, 0), !bGXsfl_112_Refreshing);
            edtMmezColKil_Title = httpContext.cgiGet( "MMEZCOLKIL_"+sGXsfl_112_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtMmezColKil_Internalname, "Title", edtMmezColKil_Title, !bGXsfl_112_Refreshing);
            edtMmezColKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZCOLKIL_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMmezColKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezColKil_Enabled), 5, 0), !bGXsfl_112_Refreshing);
            if ( ( nRcdExists_1583 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1FR1583( ) ;
            }
            sendRow1FR1583( ) ;
            bGXsfl_112_Refreshing = false ;
         }
         Gx_mode = sMode1583 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A5817MmezUltCol = B5817MmezUltCol ;
         n5817MmezUltCol = false ;
         A5821MmezArtPCT = B5821MmezArtPCT ;
         n5821MmezArtPCT = false ;
         A5820MmezArtKil = B5820MmezArtKil ;
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1583 = (short)(5) ;
         nRcdExists_1583 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1FR1583( ) ;
            while ( RcdFound1583 != 0 )
            {
               sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx+1), 4, 0), (short)(4), "0") + sGXsfl_70_idx ;
               subsflControlProps_1121583( ) ;
               init_level_properties1583( ) ;
               standaloneNotModal1FR1583( ) ;
               getByPrimaryKey1FR1583( ) ;
               standaloneModal1FR1583( ) ;
               addRow1FR1583( ) ;
               scanNext1FR1583( ) ;
            }
            scanEnd1FR1583( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1583 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx+1), 4, 0), (short)(4), "0") + sGXsfl_70_idx ;
      subsflControlProps_1121583( ) ;
      initAll1FR1583( ) ;
      init_level_properties1583( ) ;
      B5817MmezUltCol = A5817MmezUltCol ;
      n5817MmezUltCol = false ;
      B5821MmezArtPCT = A5821MmezArtPCT ;
      n5821MmezArtPCT = false ;
      B5820MmezArtKil = A5820MmezArtKil ;
      nRcdExists_1583 = (short)(0) ;
      nIsMod_1583 = (short)(0) ;
      nRcdDeleted_1583 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 70 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_70_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1583 = (short)(nBlankRcdUsr1583+nBlankRcdCount1583) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1583 > 0 )
      {
         standaloneNotModal1FR1583( ) ;
         standaloneModal1FR1583( ) ;
         addRow1FR1583( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMmezLinCol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1583 = (short)(nBlankRcdCount1583-1) ;
      }
      Gx_mode = sMode1583 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A5817MmezUltCol = B5817MmezUltCol ;
      n5817MmezUltCol = false ;
      A5821MmezArtPCT = B5821MmezArtPCT ;
      n5821MmezArtPCT = false ;
      A5820MmezArtKil = B5820MmezArtKil ;
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_70_idx, Grid2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid1Row.AddGrid("Grid2", Grid2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_70_idx, Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_70_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      /* End of table */
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1FR1582( ) ;
      GXCCtl = "Z5816MMezArtDsc_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5816MMezArtDsc));
      GXCCtl = "Z5817MmezUltCol_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5817MmezUltCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5818MmezUltPar_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5818MmezUltPar, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O5817MmezUltCol_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O5817MmezUltCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O5821MmezArtPCT_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O5821MmezArtPCT, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_112_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_112_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1582_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1582, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1582_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1582, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1582_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1582, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vGXBSCREEN_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vOKCOLOR_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV75OkColor, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTCOD_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZARTDSC_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMezArtDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZULTCOL_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezUltCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZULTPAR_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezUltPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZARTPOR_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezArtPor_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZARTKIL_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezArtKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZARTPCT_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezArtPCT_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_70_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1FR1582( )
   {
      nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701582( ) ;
      edtArtCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTCOD_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMMezArtDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZARTDSC_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMmezUltCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZULTCOL_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMmezUltPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZULTPAR_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMmezArtPor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZARTPOR_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMmezArtKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZARTKIL_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMmezArtPCT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZARTPCT_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
      A5816MMezArtDsc = httpContext.cgiGet( edtMMezArtDsc_Internalname) ;
      n5816MMezArtDsc = false ;
      A5817MmezUltCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtMmezUltCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n5817MmezUltCol = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMmezUltPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMmezUltPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "MMEZULTPAR_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMmezUltPar_Internalname ;
         wbErr = true ;
         A5818MmezUltPar = (byte)(0) ;
         n5818MmezUltPar = false ;
      }
      else
      {
         A5818MmezUltPar = (byte)(localUtil.ctol( httpContext.cgiGet( edtMmezUltPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5818MmezUltPar = false ;
      }
      A5819MmezArtPor = localUtil.ctond( httpContext.cgiGet( edtMmezArtPor_Internalname)) ;
      n5819MmezArtPor = false ;
      A5820MmezArtKil = localUtil.ctond( httpContext.cgiGet( edtMmezArtKil_Internalname)) ;
      A5821MmezArtPCT = localUtil.ctond( httpContext.cgiGet( edtMmezArtPCT_Internalname)) ;
      n5821MmezArtPCT = false ;
      GXCCtl = "Z5816MMezArtDsc_" + sGXsfl_70_idx ;
      Z5816MMezArtDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5817MmezUltCol_" + sGXsfl_70_idx ;
      Z5817MmezUltCol = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5818MmezUltPar_" + sGXsfl_70_idx ;
      Z5818MmezUltPar = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O5817MmezUltCol_" + sGXsfl_70_idx ;
      O5817MmezUltCol = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O5821MmezArtPCT_" + sGXsfl_70_idx ;
      O5821MmezArtPCT = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRC_GXsfl_112_" + sGXsfl_70_idx ;
      nRC_GXsfl_112 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1582_" + sGXsfl_70_idx ;
      nRcdDeleted_1582 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1582_" + sGXsfl_70_idx ;
      nRcdExists_1582 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1582_" + sGXsfl_70_idx ;
      nIsMod_1582 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "vGXBSCREEN_" + sGXsfl_70_idx ;
      Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "vOKCOLOR_" + sGXsfl_70_idx ;
      AV75OkColor = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_112_" + sGXsfl_70_idx ;
      nRC_GXsfl_112 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_1121583( )
   {
      edtavnRcdDeleted_1583_Internalname = "vNRCDDELETED_1583_"+sGXsfl_112_idx ;
      edtMmezLinCol_Internalname = "MMEZLINCOL_"+sGXsfl_112_idx ;
      edtMmezColPor_Internalname = "MMEZCOLPOR_"+sGXsfl_112_idx ;
      edtMmezColor_Internalname = "MMEZCOLOR_"+sGXsfl_112_idx ;
      edtMmezColNum_Internalname = "MMEZCOLNUM_"+sGXsfl_112_idx ;
      edtMmezColTip_Internalname = "MMEZCOLTIP_"+sGXsfl_112_idx ;
      edtMmezColKil_Internalname = "MMEZCOLKIL_"+sGXsfl_112_idx ;
   }

   public void subsflControlProps_fel_1121583( )
   {
      edtavnRcdDeleted_1583_Internalname = "vNRCDDELETED_1583_"+sGXsfl_112_fel_idx ;
      edtMmezLinCol_Internalname = "MMEZLINCOL_"+sGXsfl_112_fel_idx ;
      edtMmezColPor_Internalname = "MMEZCOLPOR_"+sGXsfl_112_fel_idx ;
      edtMmezColor_Internalname = "MMEZCOLOR_"+sGXsfl_112_fel_idx ;
      edtMmezColNum_Internalname = "MMEZCOLNUM_"+sGXsfl_112_fel_idx ;
      edtMmezColTip_Internalname = "MMEZCOLTIP_"+sGXsfl_112_fel_idx ;
      edtMmezColKil_Internalname = "MMEZCOLKIL_"+sGXsfl_112_fel_idx ;
   }

   public void addRow1FR1583( )
   {
      nGXsfl_112_idx = (int)(nGXsfl_112_idx+1) ;
      sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx), 4, 0), (short)(4), "0") + sGXsfl_70_idx ;
      subsflControlProps_1121583( ) ;
      sendRow1FR1583( ) ;
   }

   public void sendRow1FR1583( )
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
         if ( ((int)((nGXsfl_112_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1583_" + sGXsfl_112_idx + "',1);gx.fn.setControlValue('nIsMod_1582_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_112_idx + "',112)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1583_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1583, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1583_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1583), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1583), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,113);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1583_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1583_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(112),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1583_" + sGXsfl_112_idx + "',1);gx.fn.setControlValue('nIsMod_1582_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 114,'',false,'" + sGXsfl_112_idx + "',112)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMmezLinCol_Internalname,GXutil.ltrim( localUtil.ntoc( A5822MmezLinCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5822MmezLinCol), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,114);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMmezLinCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMmezLinCol_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(112),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1583_" + sGXsfl_112_idx + "',1);gx.fn.setControlValue('nIsMod_1582_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 115,'',false,'" + sGXsfl_112_idx + "',112)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMmezColPor_Internalname,GXutil.ltrim( localUtil.ntoc( A5823MmezColPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMmezColPor_Enabled!=0) ? localUtil.format( A5823MmezColPor, "ZZ9.99") : localUtil.format( A5823MmezColPor, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,115);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMmezColPor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMmezColPor_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(112),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1583_" + sGXsfl_112_idx + "',1);gx.fn.setControlValue('nIsMod_1582_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 116,'',false,'" + sGXsfl_112_idx + "',112)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMmezColor_Internalname,GXutil.rtrim( A5824MmezColor),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMmezColor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMmezColor_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(112),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1583_" + sGXsfl_112_idx + "',1);gx.fn.setControlValue('nIsMod_1582_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 117,'',false,'" + sGXsfl_112_idx + "',112)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMmezColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A5825MmezColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMmezColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5825MmezColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5825MmezColNum), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,117);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMmezColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMmezColNum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(112),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1583_" + sGXsfl_112_idx + "',1);gx.fn.setControlValue('nIsMod_1582_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 118,'',false,'" + sGXsfl_112_idx + "',112)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMmezColTip_Internalname,GXutil.ltrim( localUtil.ntoc( A5826MmezColTip, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMmezColTip_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5826MmezColTip), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A5826MmezColTip), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,118);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMmezColTip_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMmezColTip_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(112),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMmezColKil_Internalname,GXutil.ltrim( localUtil.ntoc( A5827MmezColKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMmezColKil_Enabled!=0) ? localUtil.format( A5827MmezColKil, "ZZZZZ9.99") : localUtil.format( A5827MmezColKil, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMmezColKil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMmezColKil_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(112),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashes1FR1583( ) ;
      GXCCtl = "Z5822MmezLinCol_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5822MmezLinCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5823MmezColPor_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5823MmezColPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5824MmezColor_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5824MmezColor));
      GXCCtl = "Z5825MmezColNum_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5825MmezColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5826MmezColTip_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5826MmezColTip, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O5823MmezColPor_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O5823MmezColPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1583_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1583, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1583_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1583, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1583_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1583, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1583_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1583_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZLINCOL_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezLinCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZCOLPOR_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezColPor_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZCOLOR_"+sGXsfl_112_idx+"Title", GXutil.rtrim( edtMmezColor_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZCOLOR_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezColor_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZCOLNUM_"+sGXsfl_112_idx+"Title", GXutil.rtrim( edtMmezColNum_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZCOLNUM_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZCOLTIP_"+sGXsfl_112_idx+"Title", GXutil.rtrim( edtMmezColTip_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZCOLTIP_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezColTip_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZCOLKIL_"+sGXsfl_112_idx+"Title", GXutil.rtrim( edtMmezColKil_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZCOLKIL_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezColKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRow1FR1583( )
   {
      nGXsfl_112_idx = (int)(nGXsfl_112_idx+1) ;
      sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx), 4, 0), (short)(4), "0") + sGXsfl_70_idx ;
      subsflControlProps_1121583( ) ;
      edtavnRcdDeleted_1583_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1583_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMmezLinCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZLINCOL_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMmezColPor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZCOLPOR_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMmezColor_Title = httpContext.cgiGet( "MMEZCOLOR_"+sGXsfl_112_idx+"Title") ;
      edtMmezColor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZCOLOR_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMmezColNum_Title = httpContext.cgiGet( "MMEZCOLNUM_"+sGXsfl_112_idx+"Title") ;
      edtMmezColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZCOLNUM_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMmezColTip_Title = httpContext.cgiGet( "MMEZCOLTIP_"+sGXsfl_112_idx+"Title") ;
      edtMmezColTip_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZCOLTIP_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMmezColKil_Title = httpContext.cgiGet( "MMEZCOLKIL_"+sGXsfl_112_idx+"Title") ;
      edtMmezColKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZCOLKIL_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1583_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1583_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1583");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1583_Internalname ;
         wbErr = true ;
         nRcdDeleted_1583 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1583 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1583_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMmezLinCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMmezLinCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "MMEZLINCOL_" + sGXsfl_112_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMmezLinCol_Internalname ;
         wbErr = true ;
         A5822MmezLinCol = (byte)(0) ;
      }
      else
      {
         A5822MmezLinCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtMmezLinCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMmezColPor_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMmezColPor_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "MMEZCOLPOR_" + sGXsfl_112_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMmezColPor_Internalname ;
         wbErr = true ;
         A5823MmezColPor = DecimalUtil.ZERO ;
         n5823MmezColPor = false ;
      }
      else
      {
         A5823MmezColPor = localUtil.ctond( httpContext.cgiGet( edtMmezColPor_Internalname)) ;
         n5823MmezColPor = false ;
      }
      A5824MmezColor = httpContext.cgiGet( edtMmezColor_Internalname) ;
      n5824MmezColor = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMmezColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMmezColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "MMEZCOLNUM_" + sGXsfl_112_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMmezColNum_Internalname ;
         wbErr = true ;
         A5825MmezColNum = 0 ;
         n5825MmezColNum = false ;
      }
      else
      {
         A5825MmezColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtMmezColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5825MmezColNum = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMmezColTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMmezColTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "MMEZCOLTIP_" + sGXsfl_112_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMmezColTip_Internalname ;
         wbErr = true ;
         A5826MmezColTip = (byte)(0) ;
         n5826MmezColTip = false ;
      }
      else
      {
         A5826MmezColTip = (byte)(localUtil.ctol( httpContext.cgiGet( edtMmezColTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5826MmezColTip = false ;
      }
      A5827MmezColKil = localUtil.ctond( httpContext.cgiGet( edtMmezColKil_Internalname)) ;
      GXCCtl = "Z5822MmezLinCol_" + sGXsfl_112_idx ;
      Z5822MmezLinCol = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5823MmezColPor_" + sGXsfl_112_idx ;
      Z5823MmezColPor = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5824MmezColor_" + sGXsfl_112_idx ;
      Z5824MmezColor = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5825MmezColNum_" + sGXsfl_112_idx ;
      Z5825MmezColNum = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5826MmezColTip_" + sGXsfl_112_idx ;
      Z5826MmezColTip = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O5823MmezColPor_" + sGXsfl_112_idx ;
      O5823MmezColPor = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1583_" + sGXsfl_112_idx ;
      nRcdDeleted_1583 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1583_" + sGXsfl_112_idx ;
      nRcdExists_1583 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1583_" + sGXsfl_112_idx ;
      nIsMod_1583 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMmezLinCol_Enabled = edtMmezLinCol_Enabled ;
      defedtMmezUltCol_Enabled = edtMmezUltCol_Enabled ;
      defedtMMezArtDsc_Enabled = edtMMezArtDsc_Enabled ;
      defedtArtCod_Enabled = edtArtCod_Enabled ;
   }

   public void confirmValues1FR0( )
   {
      nGXsfl_70_idx = 0 ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701582( ) ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_701582( ) ;
         httpContext.changePostValue( "Z5816MMezArtDsc_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z5816MMezArtDsc_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5816MMezArtDsc_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z5817MmezUltCol_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z5817MmezUltCol_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5817MmezUltCol_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z5818MmezUltPar_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z5818MmezUltPar_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5818MmezUltPar_"+sGXsfl_70_idx) ;
      }
      nGXsfl_112_idx = 0 ;
      sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx), 4, 0), (short)(4), "0") + sGXsfl_70_idx ;
      subsflControlProps_1121583( ) ;
      while ( nGXsfl_112_idx < nRC_GXsfl_112 )
      {
         nGXsfl_112_idx = (int)(nGXsfl_112_idx+1) ;
         sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx), 4, 0), (short)(4), "0") + sGXsfl_70_idx ;
         subsflControlProps_1121583( ) ;
         httpContext.changePostValue( "Z5822MmezLinCol_"+sGXsfl_112_idx, httpContext.cgiGet( "ZT_"+"Z5822MmezLinCol_"+sGXsfl_112_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5822MmezLinCol_"+sGXsfl_112_idx) ;
         httpContext.changePostValue( "Z5823MmezColPor_"+sGXsfl_112_idx, httpContext.cgiGet( "ZT_"+"Z5823MmezColPor_"+sGXsfl_112_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5823MmezColPor_"+sGXsfl_112_idx) ;
         httpContext.changePostValue( "Z5824MmezColor_"+sGXsfl_112_idx, httpContext.cgiGet( "ZT_"+"Z5824MmezColor_"+sGXsfl_112_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5824MmezColor_"+sGXsfl_112_idx) ;
         httpContext.changePostValue( "Z5825MmezColNum_"+sGXsfl_112_idx, httpContext.cgiGet( "ZT_"+"Z5825MmezColNum_"+sGXsfl_112_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5825MmezColNum_"+sGXsfl_112_idx) ;
         httpContext.changePostValue( "Z5826MmezColTip_"+sGXsfl_112_idx, httpContext.cgiGet( "ZT_"+"Z5826MmezColTip_"+sGXsfl_112_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5826MmezColTip_"+sGXsfl_112_idx) ;
      }
      httpContext.changePostValue( "O5817MmezUltCol", httpContext.cgiGet( "T5817MmezUltCol")) ;
      httpContext.deletePostValue( "T5817MmezUltCol") ;
      httpContext.changePostValue( "O5821MmezArtPCT", httpContext.cgiGet( "T5821MmezArtPCT")) ;
      httpContext.deletePostValue( "T5821MmezArtPCT") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tmezcol", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A5809MMezCod)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(DecimalUtil.decToString(A5819MmezArtPor)),GXutil.URLEncode(DecimalUtil.decToString(A5820MmezArtKil))}, new String[] {"EmprCod","CliCod","MMezCod","ArtCod","MmezArtPor","MmezArtKil"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TMEZCOL");
      forbiddenHiddens.add("MMezPorTot", localUtil.format( A5814MMezPorTot, "ZZ9.99"));
      forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV19Modo, "")));
      forbiddenHiddens.add("MMezKgs", localUtil.format( A5810MMezKgs, "ZZZZZ9.99"));
      forbiddenHiddens.add("MMezPda", GXutil.rtrim( localUtil.format( A5811MMezPda, "")));
      forbiddenHiddens.add("MMezFecPda", localUtil.format(A5812MMezFecPda, "99/99/99"));
      forbiddenHiddens.add("MMezFecEnt", localUtil.format(A5813MMezFecEnt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tmezcol:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5809MMezCod", GXutil.rtrim( Z5809MMezCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5810MMezKgs", GXutil.ltrim( localUtil.ntoc( Z5810MMezKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5811MMezPda", GXutil.rtrim( Z5811MMezPda));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5812MMezFecPda", localUtil.dtoc( Z5812MMezFecPda, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5813MMezFecEnt", localUtil.dtoc( Z5813MMezFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5814MMezPorTot", GXutil.ltrim( localUtil.ntoc( Z5814MMezPorTot, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_70", GXutil.ltrim( localUtil.ntoc( nGXsfl_70_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MODO", GXutil.rtrim( AV19Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODO", GXutil.rtrim( AV19Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT10", GXutil.rtrim( AV30Lit10));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT11", GXutil.rtrim( AV31Lit11));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT12", GXutil.rtrim( AV32Lit12));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT13", GXutil.rtrim( AV33Lit13));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV80Pgmname));
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
      return formatLink("app.tmezcol", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A5809MMezCod)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(DecimalUtil.decToString(A5819MmezArtPor)),GXutil.URLEncode(DecimalUtil.decToString(A5820MmezArtKil))}, new String[] {"EmprCod","CliCod","MMezCod","ArtCod","MmezArtPor","MmezArtKil"})  ;
   }

   public String getPgmname( )
   {
      return "TMEZCOL" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "COMPOSICION COLORES MEZCLAS", "") ;
   }

   public void initializeNonKey1FR1581( )
   {
      AV19Modo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Modo", AV19Modo);
      A5810MMezKgs = DecimalUtil.ZERO ;
      n5810MMezKgs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5810MMezKgs", GXutil.ltrimstr( A5810MMezKgs, 9, 2));
      A5811MMezPda = "" ;
      n5811MMezPda = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5811MMezPda", A5811MMezPda);
      A5812MMezFecPda = GXutil.nullDate() ;
      n5812MMezFecPda = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5812MMezFecPda", localUtil.format(A5812MMezFecPda, "99/99/99"));
      A5813MMezFecEnt = GXutil.nullDate() ;
      n5813MMezFecEnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5813MMezFecEnt", localUtil.format(A5813MMezFecEnt, "99/99/99"));
      A5814MMezPorTot = DecimalUtil.ZERO ;
      n5814MMezPorTot = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5814MMezPorTot", GXutil.ltrimstr( A5814MMezPorTot, 6, 2));
      Z5810MMezKgs = DecimalUtil.ZERO ;
      Z5811MMezPda = "" ;
      Z5812MMezFecPda = GXutil.nullDate() ;
      Z5813MMezFecEnt = GXutil.nullDate() ;
      Z5814MMezPorTot = DecimalUtil.ZERO ;
   }

   public void initAll1FR1581( )
   {
      initializeNonKey1FR1581( ) ;
   }

   public void standaloneModalInsert( )
   {
      AV19Modo = iV19Modo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Modo", AV19Modo);
   }

   public void initializeNonKey1FR1582( )
   {
      A5816MMezArtDsc = "" ;
      n5816MMezArtDsc = false ;
      A5817MmezUltCol = (byte)(0) ;
      n5817MmezUltCol = false ;
      A5818MmezUltPar = (byte)(0) ;
      n5818MmezUltPar = false ;
      O5817MmezUltCol = A5817MmezUltCol ;
      n5817MmezUltCol = false ;
      O5821MmezArtPCT = A5821MmezArtPCT ;
      n5821MmezArtPCT = false ;
      Z5816MMezArtDsc = "" ;
      Z5817MmezUltCol = (byte)(0) ;
      Z5818MmezUltPar = (byte)(0) ;
   }

   public void initAll1FR1582( )
   {
      initializeNonKey1FR1582( ) ;
   }

   public void standaloneModalInsert1FR1582( )
   {
   }

   public void initializeNonKey1FR1583( )
   {
      AV75OkColor = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75OkColor", GXutil.str( AV75OkColor, 1, 0));
      A5827MmezColKil = DecimalUtil.ZERO ;
      A5823MmezColPor = DecimalUtil.ZERO ;
      n5823MmezColPor = false ;
      A5824MmezColor = "" ;
      n5824MmezColor = false ;
      A5825MmezColNum = 0 ;
      n5825MmezColNum = false ;
      A5826MmezColTip = (byte)(0) ;
      n5826MmezColTip = false ;
      O5823MmezColPor = A5823MmezColPor ;
      n5823MmezColPor = false ;
      Z5823MmezColPor = DecimalUtil.ZERO ;
      Z5824MmezColor = "" ;
      Z5825MmezColNum = 0 ;
      Z5826MmezColTip = (byte)(0) ;
   }

   public void initAll1FR1583( )
   {
      A5822MmezLinCol = (byte)(0) ;
      initializeNonKey1FR1583( ) ;
   }

   public void standaloneModalInsert1FR1583( )
   {
      A5817MmezUltCol = i5817MmezUltCol ;
      n5817MmezUltCol = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241574196", true, true);
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
      httpContext.AddJavascriptSource("tmezcol.js", "?20268241574196", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1582( )
   {
      edtMmezUltCol_Enabled = defedtMmezUltCol_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezUltCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezUltCol_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtMMezArtDsc_Enabled = defedtMMezArtDsc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezArtDsc_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtArtCod_Enabled = defedtArtCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), !bGXsfl_70_Refreshing);
   }

   public void init_level_properties1583( )
   {
      edtMmezLinCol_Enabled = defedtMmezLinCol_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezLinCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezLinCol_Enabled), 5, 0), !bGXsfl_112_Refreshing);
   }

   public void startgridcontrol70( )
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
      Grid1Column.AddObjectProperty("Value", lblTextblock11_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A65ArtCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtArtCod_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5816MMezArtDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMMezArtDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5817MmezUltCol, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezUltCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock14_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5818MmezUltPar, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezUltPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock15_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5819MmezArtPor, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezArtPor_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock16_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5820MmezArtKil, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezArtKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock17_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5821MmezArtPCT, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezArtPCT_Enabled, (byte)(5), (byte)(0), ".", "")));
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

   public void startgridcontrol112( )
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
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1583, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1583_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5822MmezLinCol, (byte)(2), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezLinCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5823MmezColPor, (byte)(6), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezColPor_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A5824MmezColor));
      Grid2Column.AddObjectProperty("Title", GXutil.rtrim( edtMmezColor_Title));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezColor_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5825MmezColNum, (byte)(6), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Title", GXutil.rtrim( edtMmezColNum_Title));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5826MmezColTip, (byte)(2), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Title", GXutil.rtrim( edtMmezColTip_Title));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezColTip_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5827MmezColKil, (byte)(9), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Title", GXutil.rtrim( edtMmezColKil_Title));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezColKil_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtMMezCod_Internalname = "MMEZCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtMMezKgs_Internalname = "MMEZKGS" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtMMezPda_Internalname = "MMEZPDA" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtMMezFecPda_Internalname = "MMEZFECPDA" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtMMezFecEnt_Internalname = "MMEZFECENT" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtMMezPorTot_Internalname = "MMEZPORTOT" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtArtCod_Internalname = "ARTCOD" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtMMezArtDsc_Internalname = "MMEZARTDSC" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtMmezUltCol_Internalname = "MMEZULTCOL" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtMmezUltPar_Internalname = "MMEZULTPAR" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtMmezArtPor_Internalname = "MMEZARTPOR" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtMmezArtKil_Internalname = "MMEZARTKIL" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtMmezArtPCT_Internalname = "MMEZARTPCT" ;
      edtavnRcdDeleted_1583_Internalname = "vNRCDDELETED_1583" ;
      edtMmezLinCol_Internalname = "MMEZLINCOL" ;
      edtMmezColPor_Internalname = "MMEZCOLPOR" ;
      edtMmezColor_Internalname = "MMEZCOLOR" ;
      edtMmezColNum_Internalname = "MMEZCOLNUM" ;
      edtMmezColTip_Internalname = "MMEZCOLTIP" ;
      edtMmezColKil_Internalname = "MMEZCOLKIL" ;
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
      lblTextblock17_Caption = httpContext.getMessage( "Suma Porcentaje Color Articulo", "") ;
      lblTextblock16_Caption = httpContext.getMessage( "Kilos Materia Mezcla", "") ;
      lblTextblock15_Caption = httpContext.getMessage( "Porcentaje Materia", "") ;
      lblTextblock14_Caption = httpContext.getMessage( "Ultima Linea Mezcla Partido", "") ;
      lblTextblock13_Caption = httpContext.getMessage( "Ultima linea Mezcla Color", "") ;
      lblTextblock12_Caption = httpContext.getMessage( "Descripcion Articulo Mezcla", "") ;
      lblTextblock11_Caption = httpContext.getMessage( "Codigo Articulo", "") ;
      subGrid1_Borderwidth = (short)(1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "COMPOSICION COLORES MEZCLAS", "") );
      edtMmezColKil_Jsonclick = "" ;
      edtMmezColTip_Jsonclick = "" ;
      edtMmezColNum_Jsonclick = "" ;
      edtMmezColor_Jsonclick = "" ;
      edtMmezColPor_Jsonclick = "" ;
      edtMmezLinCol_Jsonclick = "" ;
      edtavnRcdDeleted_1583_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtMmezArtPCT_Jsonclick = "" ;
      edtMmezArtKil_Jsonclick = "" ;
      edtMmezArtPor_Jsonclick = "" ;
      edtMmezUltPar_Jsonclick = "" ;
      edtMmezUltCol_Jsonclick = "" ;
      edtMMezArtDsc_Jsonclick = "" ;
      edtArtCod_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtMmezColKil_Enabled = 0 ;
      edtMmezColKil_Title = httpContext.getMessage( "Kilos por color. Mezclas", "") ;
      edtMmezColTip_Enabled = 1 ;
      edtMmezColTip_Title = httpContext.getMessage( "Tipo Colorante Color Mezcla", "") ;
      edtMmezColNum_Enabled = 1 ;
      edtMmezColNum_Title = httpContext.getMessage( "Numero Color Mezcla", "") ;
      edtMmezColor_Enabled = 1 ;
      edtMmezColor_Title = httpContext.getMessage( "Nombre Color Mezcla", "") ;
      edtMmezColPor_Enabled = 1 ;
      edtMmezLinCol_Enabled = 1 ;
      edtavnRcdDeleted_1583_Enabled = 1 ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMmezArtPCT_Enabled = 0 ;
      edtMmezArtKil_Enabled = 0 ;
      edtMmezArtPor_Enabled = 0 ;
      edtMmezUltPar_Enabled = 1 ;
      edtMmezUltCol_Enabled = 0 ;
      edtMMezArtDsc_Enabled = 0 ;
      edtArtCod_Enabled = 0 ;
      edtMMezPorTot_Jsonclick = "" ;
      edtMMezPorTot_Backcolor = (int)(0xFFFFFF) ;
      edtMMezPorTot_Enabled = 0 ;
      edtMMezFecEnt_Jsonclick = "" ;
      edtMMezFecEnt_Backcolor = (int)(0xFFFFFF) ;
      edtMMezFecEnt_Enabled = 0 ;
      edtMMezFecPda_Jsonclick = "" ;
      edtMMezFecPda_Backcolor = (int)(0xFFFFFF) ;
      edtMMezFecPda_Enabled = 0 ;
      edtMMezPda_Jsonclick = "" ;
      edtMMezPda_Backcolor = (int)(0xFFFFFF) ;
      edtMMezPda_Enabled = 0 ;
      edtMMezKgs_Jsonclick = "" ;
      edtMMezKgs_Backcolor = (int)(0xFFFFFF) ;
      edtMMezKgs_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtMMezCod_Jsonclick = "" ;
      edtMMezCod_Backcolor = (int)(0xFFFFFF) ;
      edtMMezCod_Enabled = 0 ;
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

   public void xc_23_1FR1583( String A396EmprCod ,
                              int A252CliCod ,
                              String A65ArtCod ,
                              String A5824MmezColor ,
                              int A5825MmezColNum ,
                              byte A5826MmezColTip ,
                              byte AV75OkColor )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A252CliCod ;
         GXv_char3[0] = A65ArtCod ;
         GXv_char2[0] = A5824MmezColor ;
         GXv_int5[0] = A5825MmezColNum ;
         GXv_int8[0] = A5826MmezColTip ;
         GXv_int7[0] = AV75OkColor ;
         new app.pbuscol(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_char2, GXv_int5, GXv_int8, GXv_int7) ;
         A396EmprCod = GXv_char4[0] ;
         A252CliCod = GXv_int6[0] ;
         A65ArtCod = GXv_char3[0] ;
         A5824MmezColor = GXv_char2[0] ;
         A5825MmezColNum = GXv_int5[0] ;
         A5826MmezColTip = GXv_int8[0] ;
         AV75OkColor = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV75OkColor", GXutil.str( AV75OkColor, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A65ArtCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5824MmezColor))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5825MmezColNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5826MmezColTip, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV75OkColor, (byte)(1), (byte)(0), ".", "")))+"\"") ;
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
      subsflControlProps_701582( ) ;
      while ( nGXsfl_70_idx <= nRC_GXsfl_70 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1FR1582( ) ;
         standaloneModal1FR1582( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1FR1582( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_701582( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1121583( ) ;
      while ( nGXsfl_112_idx <= nRC_GXsfl_112 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1FR1582( ) ;
         standaloneModal1FR1582( ) ;
         standaloneNotModal1FR1583( ) ;
         standaloneModal1FR1583( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1FR1583( ) ;
         nGXsfl_112_idx = (int)(nGXsfl_112_idx+1) ;
         sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx), 4, 0), (short)(4), "0") + sGXsfl_70_idx ;
         subsflControlProps_1121583( ) ;
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
      /* Using cursor T01FR37 */
      pr_default.execute(33, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(33) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FR37_A407EmprNom[0] ;
      n407EmprNom = T01FR37_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(33);
      /* Using cursor T01FR38 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(34) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01FR38_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(34);
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

   public void valid_Mmezcod( )
   {
      n5813MMezFecEnt = false ;
      n5812MMezFecPda = false ;
      n5811MMezPda = false ;
      n5814MMezPorTot = false ;
      n5810MMezKgs = false ;
      n5819MmezArtPor = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A5810MMezKgs", GXutil.ltrim( localUtil.ntoc( A5810MMezKgs, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5811MMezPda", GXutil.rtrim( A5811MMezPda));
      httpContext.ajax_rsp_assign_attri("", false, "A5812MMezFecPda", localUtil.format(A5812MMezFecPda, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A5813MMezFecEnt", localUtil.format(A5813MMezFecEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A5814MMezPorTot", GXutil.ltrim( localUtil.ntoc( A5814MMezPorTot, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", GXutil.rtrim( A65ArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A5819MmezArtPor", GXutil.ltrim( localUtil.ntoc( A5819MmezArtPor, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", GXutil.rtrim( AV17UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "A5820MmezArtKil", GXutil.ltrim( localUtil.ntoc( A5820MmezArtKil, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5809MMezCod", GXutil.rtrim( Z5809MMezCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5810MMezKgs", GXutil.ltrim( localUtil.ntoc( Z5810MMezKgs, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5811MMezPda", GXutil.rtrim( Z5811MMezPda));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5812MMezFecPda", localUtil.format(Z5812MMezFecPda, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5813MMezFecEnt", localUtil.format(Z5813MMezFecEnt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5814MMezPorTot", GXutil.ltrim( localUtil.ntoc( Z5814MMezPorTot, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5819MmezArtPor", GXutil.ltrim( localUtil.ntoc( Z5819MmezArtPor, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV17UsurCod", GXutil.rtrim( ZV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5820MmezArtKil", GXutil.ltrim( localUtil.ntoc( Z5820MmezArtKil, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Mmezcoltip( )
   {
      n5825MmezColNum = false ;
      n5824MmezColor = false ;
      n5826MmezColTip = false ;
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A252CliCod ;
         GXv_char3[0] = A65ArtCod ;
         GXv_char2[0] = A5824MmezColor ;
         GXv_int5[0] = A5825MmezColNum ;
         GXv_int8[0] = A5826MmezColTip ;
         GXv_int7[0] = AV75OkColor ;
         new app.pbuscol(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_char2, GXv_int5, GXv_int8, GXv_int7) ;
         tmezcol_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         tmezcol_impl.this.A252CliCod = GXv_int6[0] ;
         A252CliCod = this.A252CliCod ;
         tmezcol_impl.this.A65ArtCod = GXv_char3[0] ;
         A65ArtCod = this.A65ArtCod ;
         tmezcol_impl.this.A5824MmezColor = GXv_char2[0] ;
         A5824MmezColor = this.A5824MmezColor ;
         tmezcol_impl.this.A5825MmezColNum = GXv_int5[0] ;
         A5825MmezColNum = this.A5825MmezColNum ;
         tmezcol_impl.this.A5826MmezColTip = GXv_int8[0] ;
         A5826MmezColTip = this.A5826MmezColTip ;
         tmezcol_impl.this.AV75OkColor = GXv_int7[0] ;
         AV75OkColor = this.AV75OkColor ;
      }
      if ( true /* After */ && ( AV75OkColor == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR: Formula del color inexistente", ""), 0, "MMEZCOLTIP");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", GXutil.rtrim( A65ArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A5824MmezColor", GXutil.rtrim( A5824MmezColor));
      httpContext.ajax_rsp_assign_attri("", false, "A5825MmezColNum", GXutil.ltrim( localUtil.ntoc( A5825MmezColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5826MmezColTip", GXutil.ltrim( localUtil.ntoc( A5826MmezColTip, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV75OkColor", GXutil.ltrim( localUtil.ntoc( AV75OkColor, (byte)(1), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A5809MMezCod',fld:'MMEZCOD',pic:''},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A5819MmezArtPor',fld:'MMEZARTPOR',pic:'ZZ9.99'},{av:'A5820MmezArtKil',fld:'MMEZARTKIL',pic:'ZZZZZ9.99'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A5814MMezPorTot',fld:'MMEZPORTOT',pic:'ZZ9.99'},{av:'AV19Modo',fld:'vMODO',pic:''},{av:'A5810MMezKgs',fld:'MMEZKGS',pic:'ZZZZZ9.99'},{av:'A5811MMezPda',fld:'MMEZPDA',pic:''},{av:'A5812MMezFecPda',fld:'MMEZFECPDA',pic:''},{av:'A5813MMezFecEnt',fld:'MMEZFECENT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_MMEZCOD","{handler:'valid_Mmezcod',iparms:[{av:'A5813MMezFecEnt',fld:'MMEZFECENT',pic:''},{av:'A5812MMezFecPda',fld:'MMEZFECPDA',pic:''},{av:'A5811MMezPda',fld:'MMEZPDA',pic:''},{av:'A5814MMezPorTot',fld:'MMEZPORTOT',pic:'ZZ9.99'},{av:'A5810MMezKgs',fld:'MMEZKGS',pic:'ZZZZZ9.99'},{av:'A5820MmezArtKil',fld:'MMEZARTKIL',pic:'ZZZZZ9.99'},{av:'A5819MmezArtPor',fld:'MMEZARTPOR',pic:'ZZ9.99'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A5809MMezCod',fld:'MMEZCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV30Lit10',fld:'vLIT10',pic:''},{av:'AV31Lit11',fld:'vLIT11',pic:''},{av:'AV32Lit12',fld:'vLIT12',pic:''},{av:'AV33Lit13',fld:'vLIT13',pic:''},{av:'AV19Modo',fld:'vMODO',pic:''},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("VALID_MMEZCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A5810MMezKgs',fld:'MMEZKGS',pic:'ZZZZZ9.99'},{av:'A5811MMezPda',fld:'MMEZPDA',pic:''},{av:'A5812MMezFecPda',fld:'MMEZFECPDA',pic:''},{av:'A5813MMezFecEnt',fld:'MMEZFECENT',pic:''},{av:'A5814MMezPorTot',fld:'MMEZPORTOT',pic:'ZZ9.99'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A5819MmezArtPor',fld:'MMEZARTPOR',pic:'ZZ9.99'},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A5820MmezArtKil',fld:'MMEZARTKIL',pic:'ZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z5809MMezCod'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z5810MMezKgs'},{av:'Z5811MMezPda'},{av:'Z5812MMezFecPda'},{av:'Z5813MMezFecEnt'},{av:'Z5814MMezPorTot'},{av:'Z65ArtCod'},{av:'Z5819MmezArtPor'},{av:'ZV17UsurCod'},{av:'Z5820MmezArtKil'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MMEZKGS","{handler:'valid_Mmezkgs',iparms:[]");
      setEventMetadata("VALID_MMEZKGS",",oparms:[]}");
      setEventMetadata("VALID_MMEZPORTOT","{handler:'valid_Mmezportot',iparms:[]");
      setEventMetadata("VALID_MMEZPORTOT",",oparms:[]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[]");
      setEventMetadata("VALID_ARTCOD",",oparms:[]}");
      setEventMetadata("VALID_MMEZULTCOL","{handler:'valid_Mmezultcol',iparms:[]");
      setEventMetadata("VALID_MMEZULTCOL",",oparms:[]}");
      setEventMetadata("VALID_MMEZARTPOR","{handler:'valid_Mmezartpor',iparms:[]");
      setEventMetadata("VALID_MMEZARTPOR",",oparms:[]}");
      setEventMetadata("VALID_MMEZARTKIL","{handler:'valid_Mmezartkil',iparms:[]");
      setEventMetadata("VALID_MMEZARTKIL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Mmezartpct',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_MMEZLINCOL","{handler:'valid_Mmezlincol',iparms:[]");
      setEventMetadata("VALID_MMEZLINCOL",",oparms:[]}");
      setEventMetadata("VALID_MMEZCOLPOR","{handler:'valid_Mmezcolpor',iparms:[]");
      setEventMetadata("VALID_MMEZCOLPOR",",oparms:[]}");
      setEventMetadata("VALID_MMEZCOLTIP","{handler:'valid_Mmezcoltip',iparms:[{av:'A5825MmezColNum',fld:'MMEZCOLNUM',pic:'ZZZZZ9'},{av:'A5824MmezColor',fld:'MMEZCOLOR',pic:''},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5826MmezColTip',fld:'MMEZCOLTIP',pic:'Z9'},{av:'AV75OkColor',fld:'vOKCOLOR',pic:'9'}]");
      setEventMetadata("VALID_MMEZCOLTIP",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A5824MmezColor',fld:'MMEZCOLOR',pic:''},{av:'A5825MmezColNum',fld:'MMEZCOLNUM',pic:'ZZZZZ9'},{av:'A5826MmezColTip',fld:'MMEZCOLTIP',pic:'Z9'},{av:'AV75OkColor',fld:'vOKCOLOR',pic:'9'}]}");
      setEventMetadata("NULL","{handler:'valid_Mmezcolkil',iparms:[]");
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
      pr_default.close(34);
      pr_default.close(33);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA5809MMezCod = "" ;
      wcpOA65ArtCod = "" ;
      wcpOA5819MmezArtPor = DecimalUtil.ZERO ;
      wcpOA5820MmezArtKil = DecimalUtil.ZERO ;
      Z396EmprCod = "" ;
      Z5809MMezCod = "" ;
      Z5810MMezKgs = DecimalUtil.ZERO ;
      Z5811MMezPda = "" ;
      Z5812MMezFecPda = GXutil.nullDate() ;
      Z5813MMezFecEnt = GXutil.nullDate() ;
      Z5814MMezPorTot = DecimalUtil.ZERO ;
      Z5816MMezArtDsc = "" ;
      O5821MmezArtPCT = DecimalUtil.ZERO ;
      Z5823MmezColPor = DecimalUtil.ZERO ;
      Z5824MmezColor = "" ;
      O5823MmezColPor = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      A5824MmezColor = "" ;
      A5809MMezCod = "" ;
      A5819MmezArtPor = DecimalUtil.ZERO ;
      A5820MmezArtKil = DecimalUtil.ZERO ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      Gx_mode = "" ;
      A5810MMezKgs = DecimalUtil.ZERO ;
      A5814MMezPorTot = DecimalUtil.ZERO ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A5811MMezPda = "" ;
      lblTextblock8_Jsonclick = "" ;
      A5812MMezFecPda = GXutil.nullDate() ;
      lblTextblock9_Jsonclick = "" ;
      A5813MMezFecEnt = GXutil.nullDate() ;
      lblTextblock10_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1582 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV19Modo = "" ;
      AV17UsurCod = "" ;
      AV30Lit10 = "" ;
      AV31Lit11 = "" ;
      AV32Lit12 = "" ;
      AV33Lit13 = "" ;
      AV80Pgmname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1581 = "" ;
      s5821MmezArtPCT = DecimalUtil.ZERO ;
      A5821MmezArtPCT = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A5823MmezColPor = DecimalUtil.ZERO ;
      A5827MmezColKil = DecimalUtil.ZERO ;
      T5823MmezColPor = DecimalUtil.ZERO ;
      s5820MmezArtKil = DecimalUtil.ZERO ;
      A5816MMezArtDsc = "" ;
      T5821MmezArtPCT = DecimalUtil.ZERO ;
      AV63LitFe = "" ;
      AV20Lit0 = "" ;
      AV21Lit1 = "" ;
      AV22Lit2 = "" ;
      AV23Lit3 = "" ;
      AV24Lit4 = "" ;
      AV25Lit5 = "" ;
      AV26Lit6 = "" ;
      AV27Lit7 = "" ;
      AV28Lit8 = "" ;
      AV29Lit9 = "" ;
      AV34Lit14 = "" ;
      GXt_char1 = "" ;
      AV35Lit15 = "" ;
      AV36Lit16 = "" ;
      AV18Station = "" ;
      AV16EmprNom = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T01FR11_A407EmprNom = new String[] {""} ;
      T01FR11_n407EmprNom = new boolean[] {false} ;
      T01FR12_A279CliNom = new String[] {""} ;
      T01FR13_A5809MMezCod = new String[] {""} ;
      T01FR13_A407EmprNom = new String[] {""} ;
      T01FR13_n407EmprNom = new boolean[] {false} ;
      T01FR13_A279CliNom = new String[] {""} ;
      T01FR13_A5810MMezKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FR13_n5810MMezKgs = new boolean[] {false} ;
      T01FR13_A5811MMezPda = new String[] {""} ;
      T01FR13_n5811MMezPda = new boolean[] {false} ;
      T01FR13_A5812MMezFecPda = new java.util.Date[] {GXutil.nullDate()} ;
      T01FR13_n5812MMezFecPda = new boolean[] {false} ;
      T01FR13_A5813MMezFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01FR13_n5813MMezFecEnt = new boolean[] {false} ;
      T01FR13_A5814MMezPorTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FR13_n5814MMezPorTot = new boolean[] {false} ;
      T01FR13_A396EmprCod = new String[] {""} ;
      T01FR13_A252CliCod = new int[1] ;
      T01FR14_A396EmprCod = new String[] {""} ;
      T01FR14_A252CliCod = new int[1] ;
      T01FR14_A5809MMezCod = new String[] {""} ;
      T01FR10_A5809MMezCod = new String[] {""} ;
      T01FR10_A5810MMezKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FR10_n5810MMezKgs = new boolean[] {false} ;
      T01FR10_A5811MMezPda = new String[] {""} ;
      T01FR10_n5811MMezPda = new boolean[] {false} ;
      T01FR10_A5812MMezFecPda = new java.util.Date[] {GXutil.nullDate()} ;
      T01FR10_n5812MMezFecPda = new boolean[] {false} ;
      T01FR10_A5813MMezFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01FR10_n5813MMezFecEnt = new boolean[] {false} ;
      T01FR10_A5814MMezPorTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FR10_n5814MMezPorTot = new boolean[] {false} ;
      T01FR10_A396EmprCod = new String[] {""} ;
      T01FR10_A252CliCod = new int[1] ;
      T01FR15_A396EmprCod = new String[] {""} ;
      T01FR15_A252CliCod = new int[1] ;
      T01FR15_A5809MMezCod = new String[] {""} ;
      T01FR16_A396EmprCod = new String[] {""} ;
      T01FR16_A252CliCod = new int[1] ;
      T01FR16_A5809MMezCod = new String[] {""} ;
      T01FR9_A5809MMezCod = new String[] {""} ;
      T01FR9_A5810MMezKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FR9_n5810MMezKgs = new boolean[] {false} ;
      T01FR9_A5811MMezPda = new String[] {""} ;
      T01FR9_n5811MMezPda = new boolean[] {false} ;
      T01FR9_A5812MMezFecPda = new java.util.Date[] {GXutil.nullDate()} ;
      T01FR9_n5812MMezFecPda = new boolean[] {false} ;
      T01FR9_A5813MMezFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01FR9_n5813MMezFecEnt = new boolean[] {false} ;
      T01FR9_A5814MMezPorTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FR9_n5814MMezPorTot = new boolean[] {false} ;
      T01FR9_A396EmprCod = new String[] {""} ;
      T01FR9_A252CliCod = new int[1] ;
      T01FR20_A396EmprCod = new String[] {""} ;
      T01FR20_A252CliCod = new int[1] ;
      T01FR20_A5809MMezCod = new String[] {""} ;
      T01FR20_A65ArtCod = new String[] {""} ;
      T01FR21_A396EmprCod = new String[] {""} ;
      T01FR21_A252CliCod = new int[1] ;
      T01FR21_A5809MMezCod = new String[] {""} ;
      Z5819MmezArtPor = DecimalUtil.ZERO ;
      Z65ArtCod = "" ;
      Z5821MmezArtPCT = DecimalUtil.ZERO ;
      T01FR6_A396EmprCod = new String[] {""} ;
      T01FR8_A5821MmezArtPCT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FR8_n5821MmezArtPCT = new boolean[] {false} ;
      T01FR23_A5809MMezCod = new String[] {""} ;
      T01FR23_A5816MMezArtDsc = new String[] {""} ;
      T01FR23_n5816MMezArtDsc = new boolean[] {false} ;
      T01FR23_A5817MmezUltCol = new byte[1] ;
      T01FR23_n5817MmezUltCol = new boolean[] {false} ;
      T01FR23_A5818MmezUltPar = new byte[1] ;
      T01FR23_n5818MmezUltPar = new boolean[] {false} ;
      T01FR23_A5819MmezArtPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FR23_n5819MmezArtPor = new boolean[] {false} ;
      T01FR23_A396EmprCod = new String[] {""} ;
      T01FR23_A252CliCod = new int[1] ;
      T01FR23_A65ArtCod = new String[] {""} ;
      T01FR23_A5821MmezArtPCT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FR23_n5821MmezArtPCT = new boolean[] {false} ;
      T01FR24_A396EmprCod = new String[] {""} ;
      T01FR24_A252CliCod = new int[1] ;
      T01FR24_A5809MMezCod = new String[] {""} ;
      T01FR24_A65ArtCod = new String[] {""} ;
      T01FR5_A5809MMezCod = new String[] {""} ;
      T01FR5_A5816MMezArtDsc = new String[] {""} ;
      T01FR5_n5816MMezArtDsc = new boolean[] {false} ;
      T01FR5_A5817MmezUltCol = new byte[1] ;
      T01FR5_n5817MmezUltCol = new boolean[] {false} ;
      T01FR5_A5818MmezUltPar = new byte[1] ;
      T01FR5_n5818MmezUltPar = new boolean[] {false} ;
      T01FR5_A5819MmezArtPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FR5_n5819MmezArtPor = new boolean[] {false} ;
      T01FR5_A396EmprCod = new String[] {""} ;
      T01FR5_A252CliCod = new int[1] ;
      T01FR5_A65ArtCod = new String[] {""} ;
      T01FR4_A5809MMezCod = new String[] {""} ;
      T01FR4_A5816MMezArtDsc = new String[] {""} ;
      T01FR4_n5816MMezArtDsc = new boolean[] {false} ;
      T01FR4_A5817MmezUltCol = new byte[1] ;
      T01FR4_n5817MmezUltCol = new boolean[] {false} ;
      T01FR4_A5818MmezUltPar = new byte[1] ;
      T01FR4_n5818MmezUltPar = new boolean[] {false} ;
      T01FR4_A5819MmezArtPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FR4_n5819MmezArtPor = new boolean[] {false} ;
      T01FR4_A396EmprCod = new String[] {""} ;
      T01FR4_A252CliCod = new int[1] ;
      T01FR4_A65ArtCod = new String[] {""} ;
      T01FR28_A396EmprCod = new String[] {""} ;
      T01FR28_A252CliCod = new int[1] ;
      T01FR28_A5809MMezCod = new String[] {""} ;
      T01FR28_A65ArtCod = new String[] {""} ;
      T01FR28_A5829MmezLinPar = new byte[1] ;
      T01FR30_A396EmprCod = new String[] {""} ;
      T01FR30_A252CliCod = new int[1] ;
      T01FR30_A5809MMezCod = new String[] {""} ;
      T01FR30_A65ArtCod = new String[] {""} ;
      T01FR31_A252CliCod = new int[1] ;
      T01FR31_A5809MMezCod = new String[] {""} ;
      T01FR31_A65ArtCod = new String[] {""} ;
      T01FR31_A5822MmezLinCol = new byte[1] ;
      T01FR31_A5823MmezColPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FR31_n5823MmezColPor = new boolean[] {false} ;
      T01FR31_A5824MmezColor = new String[] {""} ;
      T01FR31_n5824MmezColor = new boolean[] {false} ;
      T01FR31_A5825MmezColNum = new int[1] ;
      T01FR31_n5825MmezColNum = new boolean[] {false} ;
      T01FR31_A5826MmezColTip = new byte[1] ;
      T01FR31_n5826MmezColTip = new boolean[] {false} ;
      T01FR31_A396EmprCod = new String[] {""} ;
      T01FR32_A396EmprCod = new String[] {""} ;
      T01FR32_A252CliCod = new int[1] ;
      T01FR32_A5809MMezCod = new String[] {""} ;
      T01FR32_A65ArtCod = new String[] {""} ;
      T01FR32_A5822MmezLinCol = new byte[1] ;
      T01FR3_A252CliCod = new int[1] ;
      T01FR3_A5809MMezCod = new String[] {""} ;
      T01FR3_A65ArtCod = new String[] {""} ;
      T01FR3_A5822MmezLinCol = new byte[1] ;
      T01FR3_A5823MmezColPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FR3_n5823MmezColPor = new boolean[] {false} ;
      T01FR3_A5824MmezColor = new String[] {""} ;
      T01FR3_n5824MmezColor = new boolean[] {false} ;
      T01FR3_A5825MmezColNum = new int[1] ;
      T01FR3_n5825MmezColNum = new boolean[] {false} ;
      T01FR3_A5826MmezColTip = new byte[1] ;
      T01FR3_n5826MmezColTip = new boolean[] {false} ;
      T01FR3_A396EmprCod = new String[] {""} ;
      sMode1583 = "" ;
      T01FR2_A252CliCod = new int[1] ;
      T01FR2_A5809MMezCod = new String[] {""} ;
      T01FR2_A65ArtCod = new String[] {""} ;
      T01FR2_A5822MmezLinCol = new byte[1] ;
      T01FR2_A5823MmezColPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FR2_n5823MmezColPor = new boolean[] {false} ;
      T01FR2_A5824MmezColor = new String[] {""} ;
      T01FR2_n5824MmezColor = new boolean[] {false} ;
      T01FR2_A5825MmezColNum = new int[1] ;
      T01FR2_n5825MmezColNum = new boolean[] {false} ;
      T01FR2_A5826MmezColTip = new byte[1] ;
      T01FR2_n5826MmezColTip = new boolean[] {false} ;
      T01FR2_A396EmprCod = new String[] {""} ;
      T01FR36_A396EmprCod = new String[] {""} ;
      T01FR36_A252CliCod = new int[1] ;
      T01FR36_A5809MMezCod = new String[] {""} ;
      T01FR36_A65ArtCod = new String[] {""} ;
      T01FR36_A5822MmezLinCol = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblTextblock11_Jsonclick = "" ;
      ROClassString = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      B5821MmezArtPCT = DecimalUtil.ZERO ;
      B5820MmezArtKil = DecimalUtil.ZERO ;
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      iV19Modo = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      T01FR37_A407EmprNom = new String[] {""} ;
      T01FR37_n407EmprNom = new boolean[] {false} ;
      T01FR38_A279CliNom = new String[] {""} ;
      ZV17UsurCod = "" ;
      Z5820MmezArtKil = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ5809MMezCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ5810MMezKgs = DecimalUtil.ZERO ;
      ZZ5811MMezPda = "" ;
      ZZ5812MMezFecPda = GXutil.nullDate() ;
      ZZ5813MMezFecEnt = GXutil.nullDate() ;
      ZZ5814MMezPorTot = DecimalUtil.ZERO ;
      ZZ65ArtCod = "" ;
      ZZ5819MmezArtPor = DecimalUtil.ZERO ;
      ZZV17UsurCod = "" ;
      ZZ5820MmezArtKil = DecimalUtil.ZERO ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int7 = new byte[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tmezcol__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmezcol__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmezcol__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmezcol__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmezcol__default(),
         new Object[] {
             new Object[] {
            T01FR2_A252CliCod, T01FR2_A5809MMezCod, T01FR2_A65ArtCod, T01FR2_A5822MmezLinCol, T01FR2_A5823MmezColPor, T01FR2_n5823MmezColPor, T01FR2_A5824MmezColor, T01FR2_n5824MmezColor, T01FR2_A5825MmezColNum, T01FR2_n5825MmezColNum,
            T01FR2_A5826MmezColTip, T01FR2_n5826MmezColTip, T01FR2_A396EmprCod
            }
            , new Object[] {
            T01FR3_A252CliCod, T01FR3_A5809MMezCod, T01FR3_A65ArtCod, T01FR3_A5822MmezLinCol, T01FR3_A5823MmezColPor, T01FR3_n5823MmezColPor, T01FR3_A5824MmezColor, T01FR3_n5824MmezColor, T01FR3_A5825MmezColNum, T01FR3_n5825MmezColNum,
            T01FR3_A5826MmezColTip, T01FR3_n5826MmezColTip, T01FR3_A396EmprCod
            }
            , new Object[] {
            T01FR4_A5809MMezCod, T01FR4_A5816MMezArtDsc, T01FR4_n5816MMezArtDsc, T01FR4_A5817MmezUltCol, T01FR4_n5817MmezUltCol, T01FR4_A5818MmezUltPar, T01FR4_n5818MmezUltPar, T01FR4_A5819MmezArtPor, T01FR4_n5819MmezArtPor, T01FR4_A396EmprCod,
            T01FR4_A252CliCod, T01FR4_A65ArtCod
            }
            , new Object[] {
            T01FR5_A5809MMezCod, T01FR5_A5816MMezArtDsc, T01FR5_n5816MMezArtDsc, T01FR5_A5817MmezUltCol, T01FR5_n5817MmezUltCol, T01FR5_A5818MmezUltPar, T01FR5_n5818MmezUltPar, T01FR5_A5819MmezArtPor, T01FR5_n5819MmezArtPor, T01FR5_A396EmprCod,
            T01FR5_A252CliCod, T01FR5_A65ArtCod
            }
            , new Object[] {
            T01FR6_A396EmprCod
            }
            , new Object[] {
            T01FR8_A5821MmezArtPCT, T01FR8_n5821MmezArtPCT
            }
            , new Object[] {
            T01FR9_A5809MMezCod, T01FR9_A5810MMezKgs, T01FR9_n5810MMezKgs, T01FR9_A5811MMezPda, T01FR9_n5811MMezPda, T01FR9_A5812MMezFecPda, T01FR9_n5812MMezFecPda, T01FR9_A5813MMezFecEnt, T01FR9_n5813MMezFecEnt, T01FR9_A5814MMezPorTot,
            T01FR9_n5814MMezPorTot, T01FR9_A396EmprCod, T01FR9_A252CliCod
            }
            , new Object[] {
            T01FR10_A5809MMezCod, T01FR10_A5810MMezKgs, T01FR10_n5810MMezKgs, T01FR10_A5811MMezPda, T01FR10_n5811MMezPda, T01FR10_A5812MMezFecPda, T01FR10_n5812MMezFecPda, T01FR10_A5813MMezFecEnt, T01FR10_n5813MMezFecEnt, T01FR10_A5814MMezPorTot,
            T01FR10_n5814MMezPorTot, T01FR10_A396EmprCod, T01FR10_A252CliCod
            }
            , new Object[] {
            T01FR11_A407EmprNom, T01FR11_n407EmprNom
            }
            , new Object[] {
            T01FR12_A279CliNom
            }
            , new Object[] {
            T01FR13_A5809MMezCod, T01FR13_A407EmprNom, T01FR13_n407EmprNom, T01FR13_A279CliNom, T01FR13_A5810MMezKgs, T01FR13_n5810MMezKgs, T01FR13_A5811MMezPda, T01FR13_n5811MMezPda, T01FR13_A5812MMezFecPda, T01FR13_n5812MMezFecPda,
            T01FR13_A5813MMezFecEnt, T01FR13_n5813MMezFecEnt, T01FR13_A5814MMezPorTot, T01FR13_n5814MMezPorTot, T01FR13_A396EmprCod, T01FR13_A252CliCod
            }
            , new Object[] {
            T01FR14_A396EmprCod, T01FR14_A252CliCod, T01FR14_A5809MMezCod
            }
            , new Object[] {
            T01FR15_A396EmprCod, T01FR15_A252CliCod, T01FR15_A5809MMezCod
            }
            , new Object[] {
            T01FR16_A396EmprCod, T01FR16_A252CliCod, T01FR16_A5809MMezCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FR20_A396EmprCod, T01FR20_A252CliCod, T01FR20_A5809MMezCod, T01FR20_A65ArtCod
            }
            , new Object[] {
            T01FR21_A396EmprCod, T01FR21_A252CliCod, T01FR21_A5809MMezCod
            }
            , new Object[] {
            T01FR23_A5809MMezCod, T01FR23_A5816MMezArtDsc, T01FR23_n5816MMezArtDsc, T01FR23_A5817MmezUltCol, T01FR23_n5817MmezUltCol, T01FR23_A5818MmezUltPar, T01FR23_n5818MmezUltPar, T01FR23_A5819MmezArtPor, T01FR23_n5819MmezArtPor, T01FR23_A396EmprCod,
            T01FR23_A252CliCod, T01FR23_A65ArtCod, T01FR23_A5821MmezArtPCT, T01FR23_n5821MmezArtPCT
            }
            , new Object[] {
            T01FR24_A396EmprCod, T01FR24_A252CliCod, T01FR24_A5809MMezCod, T01FR24_A65ArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FR28_A396EmprCod, T01FR28_A252CliCod, T01FR28_A5809MMezCod, T01FR28_A65ArtCod, T01FR28_A5829MmezLinPar
            }
            , new Object[] {
            }
            , new Object[] {
            T01FR30_A396EmprCod, T01FR30_A252CliCod, T01FR30_A5809MMezCod, T01FR30_A65ArtCod
            }
            , new Object[] {
            T01FR31_A252CliCod, T01FR31_A5809MMezCod, T01FR31_A65ArtCod, T01FR31_A5822MmezLinCol, T01FR31_A5823MmezColPor, T01FR31_n5823MmezColPor, T01FR31_A5824MmezColor, T01FR31_n5824MmezColor, T01FR31_A5825MmezColNum, T01FR31_n5825MmezColNum,
            T01FR31_A5826MmezColTip, T01FR31_n5826MmezColTip, T01FR31_A396EmprCod
            }
            , new Object[] {
            T01FR32_A396EmprCod, T01FR32_A252CliCod, T01FR32_A5809MMezCod, T01FR32_A65ArtCod, T01FR32_A5822MmezLinCol
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FR36_A396EmprCod, T01FR36_A252CliCod, T01FR36_A5809MMezCod, T01FR36_A65ArtCod, T01FR36_A5822MmezLinCol
            }
            , new Object[] {
            T01FR37_A407EmprNom, T01FR37_n407EmprNom
            }
            , new Object[] {
            T01FR38_A279CliNom
            }
         }
      );
      O5820MmezArtKil = DecimalUtil.ZERO ;
      Z5820MmezArtKil = DecimalUtil.ZERO ;
      A5820MmezArtKil = DecimalUtil.ZERO ;
      Z5819MmezArtPor = DecimalUtil.ZERO ;
      n5819MmezArtPor = false ;
      A5819MmezArtPor = DecimalUtil.ZERO ;
      n5819MmezArtPor = false ;
      Z65ArtCod = "" ;
      A65ArtCod = "" ;
      Z5809MMezCod = "" ;
      A5809MMezCod = "" ;
      Z252CliCod = 0 ;
      A252CliCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV80Pgmname = "TMEZCOL" ;
   }

   private byte Z5817MmezUltCol ;
   private byte Z5818MmezUltPar ;
   private byte O5817MmezUltCol ;
   private byte Z5822MmezLinCol ;
   private byte Z5826MmezColTip ;
   private byte GxWebError ;
   private byte A5826MmezColTip ;
   private byte AV75OkColor ;
   private byte nKeyPressed ;
   private byte A5817MmezUltCol ;
   private byte Gx_BScreen ;
   private byte s5817MmezUltCol ;
   private byte A5822MmezLinCol ;
   private byte A5818MmezUltPar ;
   private byte T5817MmezUltCol ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte B5817MmezUltCol ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i5817MmezUltCol ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private byte GXv_int8[] ;
   private byte GXv_int7[] ;
   private byte ZV75OkColor ;
   private short nRcdDeleted_1582 ;
   private short nRcdExists_1582 ;
   private short nIsMod_1582 ;
   private short nRcdDeleted_1583 ;
   private short nRcdExists_1583 ;
   private short nIsMod_1583 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1582 ;
   private short RcdFound1582 ;
   private short nBlankRcdUsr1582 ;
   private short RcdFound1583 ;
   private short RcdFound1581 ;
   private short nIsDirty_1581 ;
   private short nIsDirty_1582 ;
   private short nIsDirty_1583 ;
   private short nBlankRcdCount1583 ;
   private short nBlankRcdUsr1583 ;
   private short subGrid1_Borderwidth ;
   private int wcpOA252CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_70 ;
   private int nGXsfl_70_idx=1 ;
   private int nRC_GXsfl_112 ;
   private int nGXsfl_112_idx=1 ;
   private int Z5825MmezColNum ;
   private int A252CliCod ;
   private int A5825MmezColNum ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtMMezCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtMMezKgs_Enabled ;
   private int edtMMezPda_Enabled ;
   private int edtMMezFecPda_Enabled ;
   private int edtMMezFecEnt_Enabled ;
   private int edtMMezPorTot_Enabled ;
   private int edtArtCod_Enabled ;
   private int edtMMezArtDsc_Enabled ;
   private int edtMmezUltCol_Enabled ;
   private int edtMmezUltPar_Enabled ;
   private int edtMmezArtPor_Enabled ;
   private int edtMmezArtKil_Enabled ;
   private int edtMmezArtPCT_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int edtavnRcdDeleted_1583_Enabled ;
   private int edtMmezLinCol_Enabled ;
   private int edtMmezColPor_Enabled ;
   private int edtMmezColor_Enabled ;
   private int edtMmezColNum_Enabled ;
   private int edtMmezColTip_Enabled ;
   private int edtMmezColKil_Enabled ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtMmezLinCol_Enabled ;
   private int defedtMmezUltCol_Enabled ;
   private int defedtMMezArtDsc_Enabled ;
   private int defedtArtCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtMMezPorTot_Backcolor ;
   private int edtMMezFecEnt_Backcolor ;
   private int edtMMezFecPda_Backcolor ;
   private int edtMMezPda_Backcolor ;
   private int edtMMezKgs_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtMMezCod_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int GXv_int6[] ;
   private int GXv_int5[] ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private java.math.BigDecimal wcpOA5819MmezArtPor ;
   private java.math.BigDecimal wcpOA5820MmezArtKil ;
   private java.math.BigDecimal Z5810MMezKgs ;
   private java.math.BigDecimal Z5814MMezPorTot ;
   private java.math.BigDecimal O5821MmezArtPCT ;
   private java.math.BigDecimal Z5823MmezColPor ;
   private java.math.BigDecimal O5823MmezColPor ;
   private java.math.BigDecimal A5819MmezArtPor ;
   private java.math.BigDecimal A5820MmezArtKil ;
   private java.math.BigDecimal A5810MMezKgs ;
   private java.math.BigDecimal A5814MMezPorTot ;
   private java.math.BigDecimal s5821MmezArtPCT ;
   private java.math.BigDecimal A5821MmezArtPCT ;
   private java.math.BigDecimal A5823MmezColPor ;
   private java.math.BigDecimal A5827MmezColKil ;
   private java.math.BigDecimal T5823MmezColPor ;
   private java.math.BigDecimal s5820MmezArtKil ;
   private java.math.BigDecimal O5820MmezArtKil ;
   private java.math.BigDecimal T5821MmezArtPCT ;
   private java.math.BigDecimal Z5819MmezArtPor ;
   private java.math.BigDecimal Z5821MmezArtPCT ;
   private java.math.BigDecimal B5821MmezArtPCT ;
   private java.math.BigDecimal B5820MmezArtKil ;
   private java.math.BigDecimal Z5820MmezArtKil ;
   private java.math.BigDecimal ZZ5810MMezKgs ;
   private java.math.BigDecimal ZZ5814MMezPorTot ;
   private java.math.BigDecimal ZZ5819MmezArtPor ;
   private java.math.BigDecimal ZZ5820MmezArtKil ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA5809MMezCod ;
   private String wcpOA65ArtCod ;
   private String Z396EmprCod ;
   private String Z5809MMezCod ;
   private String Z5811MMezPda ;
   private String Z5816MMezArtDsc ;
   private String Z5824MmezColor ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A5824MmezColor ;
   private String A5809MMezCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_70_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_112_idx="0001" ;
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
   private String edtMMezCod_Internalname ;
   private String edtMMezCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtMMezKgs_Internalname ;
   private String edtMMezKgs_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtMMezPda_Internalname ;
   private String A5811MMezPda ;
   private String edtMMezPda_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtMMezFecPda_Internalname ;
   private String edtMMezFecPda_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtMMezFecEnt_Internalname ;
   private String edtMMezFecEnt_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtMMezPorTot_Internalname ;
   private String edtMMezPorTot_Jsonclick ;
   private String sMode1582 ;
   private String edtArtCod_Internalname ;
   private String edtMMezArtDsc_Internalname ;
   private String edtMmezUltCol_Internalname ;
   private String edtMmezUltPar_Internalname ;
   private String edtMmezArtPor_Internalname ;
   private String edtMmezArtKil_Internalname ;
   private String edtMmezArtPCT_Internalname ;
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
   private String AV19Modo ;
   private String AV17UsurCod ;
   private String AV30Lit10 ;
   private String AV31Lit11 ;
   private String AV32Lit12 ;
   private String AV33Lit13 ;
   private String AV80Pgmname ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String edtavnRcdDeleted_1583_Internalname ;
   private String sMode1581 ;
   private String GXCCtl ;
   private String edtMmezLinCol_Internalname ;
   private String edtMmezColPor_Internalname ;
   private String edtMmezColor_Internalname ;
   private String edtMmezColNum_Internalname ;
   private String edtMmezColTip_Internalname ;
   private String edtMmezColKil_Internalname ;
   private String edtMmezColor_Title ;
   private String edtMmezColNum_Title ;
   private String edtMmezColTip_Title ;
   private String edtMmezColKil_Title ;
   private String A5816MMezArtDsc ;
   private String AV63LitFe ;
   private String AV20Lit0 ;
   private String AV21Lit1 ;
   private String AV22Lit2 ;
   private String AV23Lit3 ;
   private String AV24Lit4 ;
   private String AV25Lit5 ;
   private String AV26Lit6 ;
   private String AV27Lit7 ;
   private String AV28Lit8 ;
   private String AV29Lit9 ;
   private String AV34Lit14 ;
   private String GXt_char1 ;
   private String AV35Lit15 ;
   private String AV36Lit16 ;
   private String AV18Station ;
   private String AV16EmprNom ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z65ArtCod ;
   private String sMode1583 ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock17_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_70_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable3_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String ROClassString ;
   private String edtArtCod_Jsonclick ;
   private String lblTextblock12_Jsonclick ;
   private String edtMMezArtDsc_Jsonclick ;
   private String lblTextblock13_Jsonclick ;
   private String edtMmezUltCol_Jsonclick ;
   private String lblTextblock14_Jsonclick ;
   private String edtMmezUltPar_Jsonclick ;
   private String lblTextblock15_Jsonclick ;
   private String edtMmezArtPor_Jsonclick ;
   private String lblTextblock16_Jsonclick ;
   private String edtMmezArtKil_Jsonclick ;
   private String lblTextblock17_Jsonclick ;
   private String edtMmezArtPCT_Jsonclick ;
   private String sGXsfl_112_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_1583_Jsonclick ;
   private String edtMmezLinCol_Jsonclick ;
   private String edtMmezColPor_Jsonclick ;
   private String edtMmezColor_Jsonclick ;
   private String edtMmezColNum_Jsonclick ;
   private String edtMmezColTip_Jsonclick ;
   private String edtMmezColKil_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String iV19Modo ;
   private String subGrid1_Header ;
   private String lblTextblock11_Caption ;
   private String lblTextblock12_Caption ;
   private String lblTextblock13_Caption ;
   private String lblTextblock14_Caption ;
   private String lblTextblock15_Caption ;
   private String lblTextblock16_Caption ;
   private String lblTextblock17_Caption ;
   private String subGrid2_Header ;
   private String ZV17UsurCod ;
   private String ZZ396EmprCod ;
   private String ZZ5809MMezCod ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ5811MMezPda ;
   private String ZZ65ArtCod ;
   private String ZZV17UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private java.util.Date Z5812MMezFecPda ;
   private java.util.Date Z5813MMezFecEnt ;
   private java.util.Date A5812MMezFecPda ;
   private java.util.Date A5813MMezFecEnt ;
   private java.util.Date ZZ5812MMezFecPda ;
   private java.util.Date ZZ5813MMezFecEnt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n5824MmezColor ;
   private boolean n5825MmezColNum ;
   private boolean n5826MmezColTip ;
   private boolean n5819MmezArtPor ;
   private boolean wbErr ;
   private boolean n5810MMezKgs ;
   private boolean n5814MMezPorTot ;
   private boolean n5817MmezUltCol ;
   private boolean bGXsfl_70_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n5811MMezPda ;
   private boolean n5812MMezFecPda ;
   private boolean n5813MMezFecEnt ;
   private boolean bGXsfl_112_Refreshing=false ;
   private boolean n5821MmezArtPCT ;
   private boolean returnInSub ;
   private boolean n5816MMezArtDsc ;
   private boolean n5818MmezUltPar ;
   private boolean n5823MmezColPor ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01FR11_A407EmprNom ;
   private boolean[] T01FR11_n407EmprNom ;
   private String[] T01FR12_A279CliNom ;
   private String[] T01FR13_A5809MMezCod ;
   private String[] T01FR13_A407EmprNom ;
   private boolean[] T01FR13_n407EmprNom ;
   private String[] T01FR13_A279CliNom ;
   private java.math.BigDecimal[] T01FR13_A5810MMezKgs ;
   private boolean[] T01FR13_n5810MMezKgs ;
   private String[] T01FR13_A5811MMezPda ;
   private boolean[] T01FR13_n5811MMezPda ;
   private java.util.Date[] T01FR13_A5812MMezFecPda ;
   private boolean[] T01FR13_n5812MMezFecPda ;
   private java.util.Date[] T01FR13_A5813MMezFecEnt ;
   private boolean[] T01FR13_n5813MMezFecEnt ;
   private java.math.BigDecimal[] T01FR13_A5814MMezPorTot ;
   private boolean[] T01FR13_n5814MMezPorTot ;
   private String[] T01FR13_A396EmprCod ;
   private int[] T01FR13_A252CliCod ;
   private String[] T01FR14_A396EmprCod ;
   private int[] T01FR14_A252CliCod ;
   private String[] T01FR14_A5809MMezCod ;
   private String[] T01FR10_A5809MMezCod ;
   private java.math.BigDecimal[] T01FR10_A5810MMezKgs ;
   private boolean[] T01FR10_n5810MMezKgs ;
   private String[] T01FR10_A5811MMezPda ;
   private boolean[] T01FR10_n5811MMezPda ;
   private java.util.Date[] T01FR10_A5812MMezFecPda ;
   private boolean[] T01FR10_n5812MMezFecPda ;
   private java.util.Date[] T01FR10_A5813MMezFecEnt ;
   private boolean[] T01FR10_n5813MMezFecEnt ;
   private java.math.BigDecimal[] T01FR10_A5814MMezPorTot ;
   private boolean[] T01FR10_n5814MMezPorTot ;
   private String[] T01FR10_A396EmprCod ;
   private int[] T01FR10_A252CliCod ;
   private String[] T01FR15_A396EmprCod ;
   private int[] T01FR15_A252CliCod ;
   private String[] T01FR15_A5809MMezCod ;
   private String[] T01FR16_A396EmprCod ;
   private int[] T01FR16_A252CliCod ;
   private String[] T01FR16_A5809MMezCod ;
   private String[] T01FR9_A5809MMezCod ;
   private java.math.BigDecimal[] T01FR9_A5810MMezKgs ;
   private boolean[] T01FR9_n5810MMezKgs ;
   private String[] T01FR9_A5811MMezPda ;
   private boolean[] T01FR9_n5811MMezPda ;
   private java.util.Date[] T01FR9_A5812MMezFecPda ;
   private boolean[] T01FR9_n5812MMezFecPda ;
   private java.util.Date[] T01FR9_A5813MMezFecEnt ;
   private boolean[] T01FR9_n5813MMezFecEnt ;
   private java.math.BigDecimal[] T01FR9_A5814MMezPorTot ;
   private boolean[] T01FR9_n5814MMezPorTot ;
   private String[] T01FR9_A396EmprCod ;
   private int[] T01FR9_A252CliCod ;
   private String[] T01FR20_A396EmprCod ;
   private int[] T01FR20_A252CliCod ;
   private String[] T01FR20_A5809MMezCod ;
   private String[] T01FR20_A65ArtCod ;
   private String[] T01FR21_A396EmprCod ;
   private int[] T01FR21_A252CliCod ;
   private String[] T01FR21_A5809MMezCod ;
   private String[] T01FR6_A396EmprCod ;
   private java.math.BigDecimal[] T01FR8_A5821MmezArtPCT ;
   private boolean[] T01FR8_n5821MmezArtPCT ;
   private String[] T01FR23_A5809MMezCod ;
   private String[] T01FR23_A5816MMezArtDsc ;
   private boolean[] T01FR23_n5816MMezArtDsc ;
   private byte[] T01FR23_A5817MmezUltCol ;
   private boolean[] T01FR23_n5817MmezUltCol ;
   private byte[] T01FR23_A5818MmezUltPar ;
   private boolean[] T01FR23_n5818MmezUltPar ;
   private java.math.BigDecimal[] T01FR23_A5819MmezArtPor ;
   private boolean[] T01FR23_n5819MmezArtPor ;
   private String[] T01FR23_A396EmprCod ;
   private int[] T01FR23_A252CliCod ;
   private String[] T01FR23_A65ArtCod ;
   private java.math.BigDecimal[] T01FR23_A5821MmezArtPCT ;
   private boolean[] T01FR23_n5821MmezArtPCT ;
   private String[] T01FR24_A396EmprCod ;
   private int[] T01FR24_A252CliCod ;
   private String[] T01FR24_A5809MMezCod ;
   private String[] T01FR24_A65ArtCod ;
   private String[] T01FR5_A5809MMezCod ;
   private String[] T01FR5_A5816MMezArtDsc ;
   private boolean[] T01FR5_n5816MMezArtDsc ;
   private byte[] T01FR5_A5817MmezUltCol ;
   private boolean[] T01FR5_n5817MmezUltCol ;
   private byte[] T01FR5_A5818MmezUltPar ;
   private boolean[] T01FR5_n5818MmezUltPar ;
   private java.math.BigDecimal[] T01FR5_A5819MmezArtPor ;
   private boolean[] T01FR5_n5819MmezArtPor ;
   private String[] T01FR5_A396EmprCod ;
   private int[] T01FR5_A252CliCod ;
   private String[] T01FR5_A65ArtCod ;
   private String[] T01FR4_A5809MMezCod ;
   private String[] T01FR4_A5816MMezArtDsc ;
   private boolean[] T01FR4_n5816MMezArtDsc ;
   private byte[] T01FR4_A5817MmezUltCol ;
   private boolean[] T01FR4_n5817MmezUltCol ;
   private byte[] T01FR4_A5818MmezUltPar ;
   private boolean[] T01FR4_n5818MmezUltPar ;
   private java.math.BigDecimal[] T01FR4_A5819MmezArtPor ;
   private boolean[] T01FR4_n5819MmezArtPor ;
   private String[] T01FR4_A396EmprCod ;
   private int[] T01FR4_A252CliCod ;
   private String[] T01FR4_A65ArtCod ;
   private String[] T01FR28_A396EmprCod ;
   private int[] T01FR28_A252CliCod ;
   private String[] T01FR28_A5809MMezCod ;
   private String[] T01FR28_A65ArtCod ;
   private byte[] T01FR28_A5829MmezLinPar ;
   private String[] T01FR30_A396EmprCod ;
   private int[] T01FR30_A252CliCod ;
   private String[] T01FR30_A5809MMezCod ;
   private String[] T01FR30_A65ArtCod ;
   private int[] T01FR31_A252CliCod ;
   private String[] T01FR31_A5809MMezCod ;
   private String[] T01FR31_A65ArtCod ;
   private byte[] T01FR31_A5822MmezLinCol ;
   private java.math.BigDecimal[] T01FR31_A5823MmezColPor ;
   private boolean[] T01FR31_n5823MmezColPor ;
   private String[] T01FR31_A5824MmezColor ;
   private boolean[] T01FR31_n5824MmezColor ;
   private int[] T01FR31_A5825MmezColNum ;
   private boolean[] T01FR31_n5825MmezColNum ;
   private byte[] T01FR31_A5826MmezColTip ;
   private boolean[] T01FR31_n5826MmezColTip ;
   private String[] T01FR31_A396EmprCod ;
   private String[] T01FR32_A396EmprCod ;
   private int[] T01FR32_A252CliCod ;
   private String[] T01FR32_A5809MMezCod ;
   private String[] T01FR32_A65ArtCod ;
   private byte[] T01FR32_A5822MmezLinCol ;
   private int[] T01FR3_A252CliCod ;
   private String[] T01FR3_A5809MMezCod ;
   private String[] T01FR3_A65ArtCod ;
   private byte[] T01FR3_A5822MmezLinCol ;
   private java.math.BigDecimal[] T01FR3_A5823MmezColPor ;
   private boolean[] T01FR3_n5823MmezColPor ;
   private String[] T01FR3_A5824MmezColor ;
   private boolean[] T01FR3_n5824MmezColor ;
   private int[] T01FR3_A5825MmezColNum ;
   private boolean[] T01FR3_n5825MmezColNum ;
   private byte[] T01FR3_A5826MmezColTip ;
   private boolean[] T01FR3_n5826MmezColTip ;
   private String[] T01FR3_A396EmprCod ;
   private int[] T01FR2_A252CliCod ;
   private String[] T01FR2_A5809MMezCod ;
   private String[] T01FR2_A65ArtCod ;
   private byte[] T01FR2_A5822MmezLinCol ;
   private java.math.BigDecimal[] T01FR2_A5823MmezColPor ;
   private boolean[] T01FR2_n5823MmezColPor ;
   private String[] T01FR2_A5824MmezColor ;
   private boolean[] T01FR2_n5824MmezColor ;
   private int[] T01FR2_A5825MmezColNum ;
   private boolean[] T01FR2_n5825MmezColNum ;
   private byte[] T01FR2_A5826MmezColTip ;
   private boolean[] T01FR2_n5826MmezColTip ;
   private String[] T01FR2_A396EmprCod ;
   private String[] T01FR36_A396EmprCod ;
   private int[] T01FR36_A252CliCod ;
   private String[] T01FR36_A5809MMezCod ;
   private String[] T01FR36_A65ArtCod ;
   private byte[] T01FR36_A5822MmezLinCol ;
   private String[] T01FR37_A407EmprNom ;
   private boolean[] T01FR37_n407EmprNom ;
   private String[] T01FR38_A279CliNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmezcol__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmezcol__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmezcol__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmezcol__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmezcol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01FR2", "SELECT CliCod, MMezCod, ArtCod, MmezLinCol, MmezColPor, MmezColor, MmezColNum, MmezColTip, EmprCod FROM TXPMEZCOL WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ? AND MmezLinCol = ?  FOR UPDATE OF MmezColPor, MmezColor, MmezColNum, MmezColTip NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FR3", "SELECT CliCod, MMezCod, ArtCod, MmezLinCol, MmezColPor, MmezColor, MmezColNum, MmezColTip, EmprCod FROM TXPMEZCOL WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ? AND MmezLinCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FR4", "SELECT MMezCod, MMezArtDsc, MmezUltCol, MmezUltPar, MmezArtPor, EmprCod, CliCod, ArtCod FROM TXPMEZCL1 WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ?  FOR UPDATE OF MMezArtDsc, MmezUltCol, MmezUltPar, MmezArtPor NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FR5", "SELECT MMezCod, MMezArtDsc, MmezUltCol, MmezUltPar, MmezArtPor, EmprCod, CliCod, ArtCod FROM TXPMEZCL1 WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FR6", "SELECT EmprCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FR8", "SELECT COALESCE( T1.MmezArtPCT, 0) AS MmezArtPCT FROM (SELECT SUM(MmezColPor) AS MmezArtPCT, EmprCod, CliCod, MMezCod, ArtCod FROM TXPMEZCOL GROUP BY EmprCod, CliCod, MMezCod, ArtCod ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.MMezCod = ? AND T1.ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FR9", "SELECT MMezCod, MMezKgs, MMezPda, MMezFecPda, MMezFecEnt, MMezPorTot, EmprCod, CliCod FROM TXPMEZCLI WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ?  FOR UPDATE OF MMezKgs, MMezPda, MMezFecPda, MMezFecEnt, MMezPorTot NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FR10", "SELECT MMezCod, MMezKgs, MMezPda, MMezFecPda, MMezFecEnt, MMezPorTot, EmprCod, CliCod FROM TXPMEZCLI WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FR11", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FR12", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FR13", "SELECT /*+ FIRST_ROWS(1) */ TM1.MMezCod, T2.EmprNom, T3.CliNom, TM1.MMezKgs, TM1.MMezPda, TM1.MMezFecPda, TM1.MMezFecEnt, TM1.MMezPorTot, TM1.EmprCod, TM1.CliCod FROM ((TXPMEZCLI TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.MMezCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.MMezCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FR14", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, MMezCod FROM TXPMEZCLI WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FR15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, MMezCod FROM TXPMEZCLI WHERE EmprCod = ? and CliCod = ? and MMezCod = ? ORDER BY EmprCod, CliCod, MMezCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FR16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, MMezCod FROM TXPMEZCLI WHERE EmprCod = ? and CliCod = ? and MMezCod = ? ORDER BY EmprCod DESC, CliCod DESC, MMezCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01FR17", "INSERT INTO TXPMEZCLI(MMezCod, MMezKgs, MMezPda, MMezFecPda, MMezFecEnt, MMezPorTot, EmprCod, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMEZCLI")
         ,new UpdateCursor("T01FR18", "UPDATE TXPMEZCLI SET MMezKgs=?, MMezPda=?, MMezFecPda=?, MMezFecEnt=?, MMezPorTot=?  WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ?", GX_NOMASK, "TXPMEZCLI")
         ,new UpdateCursor("T01FR19", "DELETE FROM TXPMEZCLI  WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ?", GX_NOMASK, "TXPMEZCLI")
         ,new ForEachCursor("T01FR20", "SELECT * FROM (SELECT EmprCod, CliCod, MMezCod, ArtCod FROM TXPMEZCL1 WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FR21", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, MMezCod FROM TXPMEZCLI WHERE EmprCod = ? and CliCod = ? and MMezCod = ? ORDER BY EmprCod, CliCod, MMezCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FR23", "SELECT T1.MMezCod, T1.MMezArtDsc, T1.MmezUltCol, T1.MmezUltPar, T1.MmezArtPor, T1.EmprCod, T1.CliCod, T1.ArtCod, COALESCE( T2.MmezArtPCT, 0) AS MmezArtPCT FROM (TXPMEZCL1 T1 LEFT JOIN (SELECT SUM(MmezColPor) AS MmezArtPCT, EmprCod, CliCod, MMezCod, ArtCod FROM TXPMEZCOL GROUP BY EmprCod, CliCod, MMezCod, ArtCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.MMezCod = T1.MMezCod AND T2.ArtCod = T1.ArtCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.MMezCod = ? and T1.ArtCod = ? and T1.MmezArtPor = ? ORDER BY T1.EmprCod, T1.CliCod, T1.MMezCod, T1.ArtCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FR24", "SELECT EmprCod, CliCod, MMezCod, ArtCod FROM TXPMEZCL1 WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01FR25", "INSERT INTO TXPMEZCL1(MMezCod, MMezArtDsc, MmezUltCol, MmezUltPar, MmezArtPor, EmprCod, CliCod, ArtCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMEZCL1")
         ,new UpdateCursor("T01FR26", "UPDATE TXPMEZCL1 SET MMezArtDsc=?, MmezUltCol=?, MmezUltPar=?, MmezArtPor=?  WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ?", GX_NOMASK, "TXPMEZCL1")
         ,new UpdateCursor("T01FR27", "DELETE FROM TXPMEZCL1  WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ?", GX_NOMASK, "TXPMEZCL1")
         ,new ForEachCursor("T01FR28", "SELECT * FROM (SELECT EmprCod, CliCod, MMezCod, ArtCod, MmezLinPar FROM TXPMEZPAR WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01FR29", "UPDATE TXPMEZCL1 SET MmezUltCol=?  WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ?", GX_NOMASK, "TXPMEZCL1")
         ,new ForEachCursor("T01FR30", "SELECT EmprCod, CliCod, MMezCod, ArtCod FROM TXPMEZCL1 WHERE EmprCod = ? and CliCod = ? and MMezCod = ? and ArtCod = ? and MmezArtPor = ? ORDER BY EmprCod, CliCod, MMezCod, ArtCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FR31", "SELECT CliCod, MMezCod, ArtCod, MmezLinCol, MmezColPor, MmezColor, MmezColNum, MmezColTip, EmprCod FROM TXPMEZCOL WHERE EmprCod = ? and CliCod = ? and MMezCod = ? and ArtCod = ? and MmezLinCol = ? ORDER BY EmprCod, CliCod, MMezCod, ArtCod, MmezLinCol ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FR32", "SELECT EmprCod, CliCod, MMezCod, ArtCod, MmezLinCol FROM TXPMEZCOL WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ? AND MmezLinCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01FR33", "INSERT INTO TXPMEZCOL(CliCod, MMezCod, ArtCod, MmezLinCol, MmezColPor, MmezColor, MmezColNum, MmezColTip, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMEZCOL")
         ,new UpdateCursor("T01FR34", "UPDATE TXPMEZCOL SET MmezColPor=?, MmezColor=?, MmezColNum=?, MmezColTip=?  WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ? AND MmezLinCol = ?", GX_NOMASK, "TXPMEZCOL")
         ,new UpdateCursor("T01FR35", "DELETE FROM TXPMEZCOL  WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ? AND MmezLinCol = ?", GX_NOMASK, "TXPMEZCOL")
         ,new ForEachCursor("T01FR36", "SELECT EmprCod, CliCod, MMezCod, ArtCod, MmezLinCol FROM TXPMEZCOL WHERE EmprCod = ? and CliCod = ? and MMezCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, MMezCod, ArtCod, MmezLinCol ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FR37", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FR38", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((String[]) buf[11])[0] = rslt.getString(8, 16);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((String[]) buf[11])[0] = rslt.getString(8, 16);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 3);
               ((int[]) buf[15])[0] = rslt.getInt(10);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
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
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((String[]) buf[11])[0] = rslt.getString(8, 16);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 27 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 34 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 20);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[6]);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[8]);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[10], 2);
               }
               stmt.setString(7, (String)parms[11], 3);
               stmt.setInt(8, ((Number) parms[12]).intValue());
               return;
            case 15 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 8);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[7]);
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
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setString(8, (String)parms[12], 20);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 20);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 26);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 2);
               }
               stmt.setString(6, (String)parms[9], 3);
               stmt.setInt(7, ((Number) parms[10]).intValue());
               stmt.setString(8, (String)parms[11], 16);
               return;
            case 22 :
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
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setString(7, (String)parms[10], 20);
               stmt.setString(8, (String)parms[11], 16);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 25 :
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
               stmt.setString(4, (String)parms[4], 20);
               stmt.setString(5, (String)parms[5], 16);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 29 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 20);
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
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 13);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[11]).byteValue());
               }
               stmt.setString(9, (String)parms[12], 3);
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 13);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setString(7, (String)parms[10], 20);
               stmt.setString(8, (String)parms[11], 16);
               stmt.setByte(9, ((Number) parms[12]).byteValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

