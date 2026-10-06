package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmezpar_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_29") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A966PartCod = httpContext.GetPar( "PartCod") ;
         n966PartCod = false ;
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_29( A396EmprCod, A966PartCod, A252CliCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "COMPOSICION PARTIDOS MEZCLAS", ""), (short)(0)) ;
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
      A5818MmezUltPar = (byte)(GXutil.lval( httpContext.GetPar( "MmezUltPar"))) ;
      n5818MmezUltPar = false ;
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

   public tmezpar_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmezpar_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmezpar_impl.class ));
   }

   public tmezpar_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TMEZPAR.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMEZPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEZPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo de Mezcla", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMezCod_Internalname, GXutil.rtrim( A5809MMezCod), GXutil.rtrim( localUtil.format( A5809MMezCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMezCod_Jsonclick, 0, "", "", "", "", "", 1, edtMMezCod_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMEZPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMEZPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMEZPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Kgs necesarios Materia Mezcla", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMezKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A5810MMezKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMMezKgs_Enabled!=0) ? localUtil.format( A5810MMezKgs, "ZZZZZ9.99") : localUtil.format( A5810MMezKgs, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMezKgs_Jsonclick, 0, "", "", "", "", "", 1, edtMMezKgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEZPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Numero Partida Mezcla", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMezPda_Internalname, GXutil.rtrim( A5811MMezPda), GXutil.rtrim( localUtil.format( A5811MMezPda, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMezPda_Jsonclick, 0, "", "", "", "", "", 1, edtMMezPda_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMEZPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Fecha Partida Mezcla", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtMMezFecPda_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMezFecPda_Internalname, localUtil.format(A5812MMezFecPda, "99/99/99"), localUtil.format( A5812MMezFecPda, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMezFecPda_Jsonclick, 0, "", "", "", "", "", 1, edtMMezFecPda_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEZPAR.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMMezFecPda_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMMezFecPda_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMEZPAR.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Fecha Entrega Cli. Mezclas", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtMMezFecEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMezFecEnt_Internalname, localUtil.format(A5813MMezFecEnt, "99/99/99"), localUtil.format( A5813MMezFecEnt, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMezFecEnt_Jsonclick, 0, "", "", "", "", "", 1, edtMMezFecEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEZPAR.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMMezFecEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMMezFecEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMEZPAR.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Porcentaje Total Mezcla HSS", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMezPorTot_Internalname, GXutil.ltrim( localUtil.ntoc( A5814MMezPorTot, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMMezPorTot_Enabled!=0) ? localUtil.format( A5814MMezPorTot, "ZZ9.99") : localUtil.format( A5814MMezPorTot, "ZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMezPorTot_Jsonclick, 0, "", "", "", "", "", 1, edtMMezPorTot_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEZPAR.htm");
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
            scanStart1FS1582( ) ;
            while ( RcdFound1582 != 0 )
            {
               init_level_properties1582( ) ;
               getByPrimaryKey1FS1582( ) ;
               addRow1FS1582( ) ;
               scanNext1FS1582( ) ;
            }
            scanEnd1FS1582( ) ;
            nBlankRcdCount1582 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1FS1582( ) ;
         standaloneModal1FS1582( ) ;
         sMode1582 = Gx_mode ;
         while ( nGXsfl_70_idx < nRC_GXsfl_70 )
         {
            bGXsfl_70_Refreshing = true ;
            readRow1FS1582( ) ;
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
            edtMmezArtPPT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZARTPPT_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMmezArtPPT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezArtPPT_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            if ( ( nRcdExists_1582 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1FS1582( ) ;
            }
            sendRow1FS1582( ) ;
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
            scanStart1FS1582( ) ;
            while ( RcdFound1582 != 0 )
            {
               sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_701582( ) ;
               init_level_properties1582( ) ;
               standaloneNotModal1FS1582( ) ;
               getByPrimaryKey1FS1582( ) ;
               standaloneModal1FS1582( ) ;
               addRow1FS1582( ) ;
               scanNext1FS1582( ) ;
            }
            scanEnd1FS1582( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1582 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_701582( ) ;
      initAll1FS1582( ) ;
      init_level_properties1582( ) ;
      nRcdExists_1582 = (short)(0) ;
      nIsMod_1582 = (short)(0) ;
      nRcdDeleted_1582 = (short)(0) ;
      nBlankRcdCount1582 = (short)(nBlankRcdUsr1582+nBlankRcdCount1582) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1582 > 0 )
      {
         standaloneNotModal1FS1582( ) ;
         standaloneModal1FS1582( ) ;
         addRow1FS1582( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMmezUltCol_Internalname ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TMEZPAR.htm");
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
      e111FS2 ();
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
            AV29Lit9 = httpContext.cgiGet( "vLIT9") ;
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
            forbiddenHiddens.add("hshsalt", "hsh"+"TMEZPAR");
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
               GXutil.writeLogError("tmezpar:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                        e111FS2 ();
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
            initAll1FS1581( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1584_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1584_Enabled), 5, 0), !bGXsfl_112_Refreshing);
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
      disableAttributes1FS1581( ) ;
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

   public void confirm_1FS0( )
   {
      beforeValidate1FS1581( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1FS1581( ) ;
         }
         else
         {
            checkExtendedTable1FS1581( ) ;
            if ( AnyError == 0 )
            {
               zm1FS1581( 23) ;
               zm1FS1581( 24) ;
            }
            closeExtendedTableCursors1FS1581( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1581 = Gx_mode ;
         confirm_1FS1582( ) ;
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
         confirmValues1FS0( ) ;
      }
   }

   public void confirm_1FS1584( )
   {
      s5818MmezUltPar = O5818MmezUltPar ;
      n5818MmezUltPar = false ;
      s5828MmezArtPPT = O5828MmezArtPPT ;
      n5828MmezArtPPT = false ;
      nGXsfl_112_idx = 0 ;
      while ( nGXsfl_112_idx < nRC_GXsfl_112 )
      {
         readRow1FS1584( ) ;
         if ( ( nRcdExists_1584 != 0 ) || ( nIsMod_1584 != 0 ) )
         {
            getKey1FS1584( ) ;
            if ( ( nRcdExists_1584 == 0 ) && ( nRcdDeleted_1584 == 0 ) )
            {
               if ( RcdFound1584 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1FS1584( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1FS1584( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1FS1584( 29) ;
                     }
                     closeExtendedTableCursors1FS1584( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O5818MmezUltPar = A5818MmezUltPar ;
                     n5818MmezUltPar = false ;
                     O5828MmezArtPPT = A5828MmezArtPPT ;
                     n5828MmezArtPPT = false ;
                  }
               }
               else
               {
                  GXCCtl = "MMEZLINPAR_" + sGXsfl_112_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMmezLinPar_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1584 != 0 )
               {
                  if ( nRcdDeleted_1584 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1FS1584( ) ;
                     load1FS1584( ) ;
                     beforeValidate1FS1584( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1FS1584( ) ;
                        O5818MmezUltPar = A5818MmezUltPar ;
                        n5818MmezUltPar = false ;
                        O5828MmezArtPPT = A5828MmezArtPPT ;
                        n5828MmezArtPPT = false ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1584 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1FS1584( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1FS1584( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1FS1584( 29) ;
                           }
                           closeExtendedTableCursors1FS1584( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O5818MmezUltPar = A5818MmezUltPar ;
                           n5818MmezUltPar = false ;
                           O5828MmezArtPPT = A5828MmezArtPPT ;
                           n5828MmezArtPPT = false ;
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1584 == 0 )
                  {
                     GXCCtl = "MMEZLINPAR_" + sGXsfl_112_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMmezLinPar_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1584_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1584, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezLinPar_Internalname, GXutil.ltrim( localUtil.ntoc( A5829MmezLinPar, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezParPor_Internalname, GXutil.ltrim( localUtil.ntoc( A5830MmezParPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPartCod_Internalname, GXutil.rtrim( A966PartCod)) ;
         httpContext.changePostValue( edtMmezParKil_Internalname, GXutil.ltrim( localUtil.ntoc( A5831MmezParKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezParObs_Internalname, GXutil.rtrim( A5832MmezParObs)) ;
         httpContext.changePostValue( "ZT_"+"Z5829MmezLinPar_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( Z5829MmezLinPar, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5830MmezParPor_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( Z5830MmezParPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5832MmezParObs_"+sGXsfl_112_idx, GXutil.rtrim( Z5832MmezParObs)) ;
         httpContext.changePostValue( "ZT_"+"Z966PartCod_"+sGXsfl_112_idx, GXutil.rtrim( Z966PartCod)) ;
         httpContext.changePostValue( "T5830MmezParPor_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( O5830MmezParPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1584_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1584, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1584_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1584, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1584_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1584, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1584 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1584_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1584_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZLINPAR_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezLinPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZPARPOR_"+sGXsfl_112_idx+"Title", GXutil.rtrim( edtMmezParPor_Title)) ;
            httpContext.changePostValue( "MMEZPARPOR_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezParPor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARTCOD_"+sGXsfl_112_idx+"Title", GXutil.rtrim( edtPartCod_Title)) ;
            httpContext.changePostValue( "PARTCOD_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPartCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZPARKIL_"+sGXsfl_112_idx+"Title", GXutil.rtrim( edtMmezParKil_Title)) ;
            httpContext.changePostValue( "MMEZPARKIL_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezParKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZPAROBS_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezParObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O5818MmezUltPar = s5818MmezUltPar ;
      n5818MmezUltPar = false ;
      O5828MmezArtPPT = s5828MmezArtPPT ;
      n5828MmezArtPPT = false ;
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1FS1582( )
   {
      s5820MmezArtKil = O5820MmezArtKil ;
      nGXsfl_70_idx = 0 ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRow1FS1582( ) ;
         if ( ( nRcdExists_1582 != 0 ) || ( nIsMod_1582 != 0 ) )
         {
            getKey1FS1582( ) ;
            if ( ( nRcdExists_1582 == 0 ) && ( nRcdDeleted_1582 == 0 ) )
            {
               if ( RcdFound1582 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1FS1582( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1FS1582( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1FS1582( 26) ;
                        zm1FS1582( 27) ;
                     }
                     closeExtendedTableCursors1FS1582( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode1582 = Gx_mode ;
                        confirm_1FS1584( ) ;
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
                     getByPrimaryKey1FS1582( ) ;
                     load1FS1582( ) ;
                     beforeValidate1FS1582( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1FS1582( ) ;
                        O5820MmezArtKil = A5820MmezArtKil ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1582 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1FS1582( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1FS1582( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1FS1582( 26) ;
                              zm1FS1582( 27) ;
                           }
                           closeExtendedTableCursors1FS1582( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode1582 = Gx_mode ;
                              confirm_1FS1584( ) ;
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
         httpContext.changePostValue( edtMmezArtPPT_Internalname, GXutil.ltrim( localUtil.ntoc( A5828MmezArtPPT, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5816MMezArtDsc_"+sGXsfl_70_idx, GXutil.rtrim( Z5816MMezArtDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z5817MmezUltCol_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z5817MmezUltCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5818MmezUltPar_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z5818MmezUltPar, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T5818MmezUltPar_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( O5818MmezUltPar, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T5828MmezArtPPT_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( O5828MmezArtPPT, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
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
            httpContext.changePostValue( "MMEZARTPPT_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezArtPPT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O5820MmezArtKil = s5820MmezArtKil ;
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1FS0( )
   {
   }

   public void e111FS2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV63LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tmezpar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV63LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63LitFe", AV63LitFe);
      GXt_char1 = AV20Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      tmezpar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit0", AV20Lit0);
      GXt_char1 = AV21Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV80Pgmname, (byte)(99), GXv_char2) ;
      tmezpar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit1", AV21Lit1);
      GXt_char1 = AV22Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      tmezpar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit2", AV22Lit2);
      GXt_char1 = AV23Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1273_", ""), (byte)(99), GXv_char2) ;
      tmezpar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit3", AV23Lit3);
      GXt_char1 = AV24Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT5_", ""), (byte)(99), GXv_char2) ;
      tmezpar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit4", AV24Lit4);
      GXt_char1 = AV25Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tmezpar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lit5", AV25Lit5);
      GXt_char1 = AV26Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1205_", ""), (byte)(99), GXv_char2) ;
      tmezpar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lit6", AV26Lit6);
      GXt_char1 = AV27Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN557_", ""), (byte)(99), GXv_char2) ;
      tmezpar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Lit7", AV27Lit7);
      GXt_char1 = AV28Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN198_", ""), (byte)(99), GXv_char2) ;
      tmezpar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Lit8", AV28Lit8);
      GXt_char1 = AV29Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1301_", ""), (byte)(99), GXv_char2) ;
      tmezpar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV29Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Lit9", AV29Lit9);
      GXt_char1 = AV30Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char2) ;
      tmezpar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV30Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Lit10", AV30Lit10);
      GXt_char1 = AV31Lit11 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN244_", ""), (byte)(99), GXv_char2) ;
      tmezpar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31Lit11 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Lit11", AV31Lit11);
      GXt_char1 = AV32Lit12 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN410_", ""), (byte)(99), GXv_char2) ;
      tmezpar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32Lit12 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Lit12", AV32Lit12);
      GXt_char1 = AV33Lit13 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char2) ;
      tmezpar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV33Lit13 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Lit13", AV33Lit13);
      GXt_char1 = AV34Lit14 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1120_", ""), (byte)(99), GXv_char2) ;
      tmezpar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV34Lit14 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Lit14", AV34Lit14);
      AV35Lit15 = httpContext.getMessage( "Fec.Ent.", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Lit15", AV35Lit15);
      AV36Lit16 = httpContext.getMessage( "% Total", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Lit16", AV36Lit16);
      if ( ( GXutil.strcmp(AV21Lit1, httpContext.getMessage( "TMEZPAR", "")) == 0 ) || ( GXutil.strcmp(AV21Lit1, httpContext.getMessage( "NMEZPAR", "")) == 0 ) )
      {
         AV21Lit1 = httpContext.getMessage( "COMPOSICION PARTIDOS MEZCLAS", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Lit1", AV21Lit1);
      }
      AV18Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmezpar_impl.this.A396EmprCod = GXv_char2[0] ;
      tmezpar_impl.this.AV16EmprNom = GXv_char3[0] ;
      tmezpar_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
   }

   public void zm1FS1581( int GX_JID )
   {
      if ( ( GX_JID == 22 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5810MMezKgs = T01FS11_A5810MMezKgs[0] ;
            Z5811MMezPda = T01FS11_A5811MMezPda[0] ;
            Z5812MMezFecPda = T01FS11_A5812MMezFecPda[0] ;
            Z5813MMezFecEnt = T01FS11_A5813MMezFecEnt[0] ;
            Z5814MMezPorTot = T01FS11_A5814MMezPorTot[0] ;
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
      if ( GX_JID == -22 )
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
      AV80Pgmname = "TMEZPAR" ;
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
      /* Using cursor T01FS12 */
      pr_default.execute(9, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FS12_A407EmprNom[0] ;
      n407EmprNom = T01FS12_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(9);
      /* Using cursor T01FS13 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01FS13_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(10);
      edtMmezParPor_Title = "% "+GXutil.trim( AV29Lit9) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezParPor_Internalname, "Title", edtMmezParPor_Title, !bGXsfl_112_Refreshing);
      edtPartCod_Title = AV29Lit9 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPartCod_Internalname, "Title", edtPartCod_Title, !bGXsfl_112_Refreshing);
      edtMmezParKil_Title = AV33Lit13 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezParKil_Internalname, "Title", edtMmezParKil_Title, !bGXsfl_112_Refreshing);
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

   public void load1FS1581( )
   {
      /* Using cursor T01FS14 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1581 = (short)(1) ;
         A407EmprNom = T01FS14_A407EmprNom[0] ;
         n407EmprNom = T01FS14_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01FS14_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A5810MMezKgs = T01FS14_A5810MMezKgs[0] ;
         n5810MMezKgs = T01FS14_n5810MMezKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5810MMezKgs", GXutil.ltrimstr( A5810MMezKgs, 9, 2));
         A5811MMezPda = T01FS14_A5811MMezPda[0] ;
         n5811MMezPda = T01FS14_n5811MMezPda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5811MMezPda", A5811MMezPda);
         A5812MMezFecPda = T01FS14_A5812MMezFecPda[0] ;
         n5812MMezFecPda = T01FS14_n5812MMezFecPda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5812MMezFecPda", localUtil.format(A5812MMezFecPda, "99/99/99"));
         A5813MMezFecEnt = T01FS14_A5813MMezFecEnt[0] ;
         n5813MMezFecEnt = T01FS14_n5813MMezFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5813MMezFecEnt", localUtil.format(A5813MMezFecEnt, "99/99/99"));
         A5814MMezPorTot = T01FS14_A5814MMezPorTot[0] ;
         n5814MMezPorTot = T01FS14_n5814MMezPorTot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5814MMezPorTot", GXutil.ltrimstr( A5814MMezPorTot, 6, 2));
         zm1FS1581( -22) ;
      }
      pr_default.close(11);
      onLoadActions1FS1581( ) ;
   }

   public void onLoadActions1FS1581( )
   {
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
      A5820MmezArtKil = GXutil.roundDecimal( (A5810MMezKgs.multiply(A5819MmezArtPor).divide(A5814MMezPorTot, 18, java.math.RoundingMode.DOWN)), 2) ;
   }

   public void checkExtendedTable1FS1581( )
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

   public void closeExtendedTableCursors1FS1581( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1FS1581( )
   {
      /* Using cursor T01FS15 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1581 = (short)(1) ;
      }
      else
      {
         RcdFound1581 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01FS11 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
      if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01FS11_A5809MMezCod[0], A5809MMezCod) == 0 ) && ( GXutil.strcmp(T01FS11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FS11_A252CliCod[0] == A252CliCod ) )
      {
         zm1FS1581( 22) ;
         RcdFound1581 = (short)(1) ;
         A5810MMezKgs = T01FS11_A5810MMezKgs[0] ;
         n5810MMezKgs = T01FS11_n5810MMezKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5810MMezKgs", GXutil.ltrimstr( A5810MMezKgs, 9, 2));
         A5811MMezPda = T01FS11_A5811MMezPda[0] ;
         n5811MMezPda = T01FS11_n5811MMezPda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5811MMezPda", A5811MMezPda);
         A5812MMezFecPda = T01FS11_A5812MMezFecPda[0] ;
         n5812MMezFecPda = T01FS11_n5812MMezFecPda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5812MMezFecPda", localUtil.format(A5812MMezFecPda, "99/99/99"));
         A5813MMezFecEnt = T01FS11_A5813MMezFecEnt[0] ;
         n5813MMezFecEnt = T01FS11_n5813MMezFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5813MMezFecEnt", localUtil.format(A5813MMezFecEnt, "99/99/99"));
         A5814MMezPorTot = T01FS11_A5814MMezPorTot[0] ;
         n5814MMezPorTot = T01FS11_n5814MMezPorTot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5814MMezPorTot", GXutil.ltrimstr( A5814MMezPorTot, 6, 2));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z5809MMezCod = A5809MMezCod ;
         sMode1581 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1FS1581( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1581 = (short)(0) ;
            initializeNonKey1FS1581( ) ;
         }
         Gx_mode = sMode1581 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1581 = (short)(0) ;
         initializeNonKey1FS1581( ) ;
         sMode1581 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1581 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(8);
   }

   public void getEqualNoModal( )
   {
      getKey1FS1581( ) ;
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
      /* Using cursor T01FS16 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( GXutil.strcmp(T01FS16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FS16_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FS16_A5809MMezCod[0], A5809MMezCod) == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( GXutil.strcmp(T01FS16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FS16_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FS16_A5809MMezCod[0], A5809MMezCod) == 0 ) )
         {
            RcdFound1581 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound1581 = (short)(0) ;
      /* Using cursor T01FS17 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( GXutil.strcmp(T01FS17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FS17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FS17_A5809MMezCod[0], A5809MMezCod) == 0 ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( GXutil.strcmp(T01FS17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FS17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FS17_A5809MMezCod[0], A5809MMezCod) == 0 ) )
         {
            RcdFound1581 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1FS1581( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A5820MmezArtKil = O5820MmezArtKil ;
         insert1FS1581( ) ;
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
               update1FS1581( ) ;
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
               insert1FS1581( ) ;
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
                  insert1FS1581( ) ;
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
      getKey1FS1581( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tmezpar");
   }

   public void insert_check( )
   {
      confirm_1FS0( ) ;
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
      scanStart1FS1581( ) ;
      if ( RcdFound1581 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1FS1581( ) ;
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
      scanStart1FS1581( ) ;
      if ( RcdFound1581 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1581 != 0 )
         {
            scanNext1FS1581( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1FS1581( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1FS1581( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FS10 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
         if ( (pr_default.getStatus(7) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMEZCLI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(7) == 101) || ( DecimalUtil.compareTo(Z5810MMezKgs, T01FS10_A5810MMezKgs[0]) != 0 ) || ( GXutil.strcmp(Z5811MMezPda, T01FS10_A5811MMezPda[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z5812MMezFecPda), GXutil.resetTime(T01FS10_A5812MMezFecPda[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z5813MMezFecEnt), GXutil.resetTime(T01FS10_A5813MMezFecEnt[0])) ) || ( DecimalUtil.compareTo(Z5814MMezPorTot, T01FS10_A5814MMezPorTot[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z5810MMezKgs, T01FS10_A5810MMezKgs[0]) != 0 )
            {
               GXutil.writeLogln("tmezpar:[seudo value changed for attri]"+"MMezKgs");
               GXutil.writeLogRaw("Old: ",Z5810MMezKgs);
               GXutil.writeLogRaw("Current: ",T01FS10_A5810MMezKgs[0]);
            }
            if ( GXutil.strcmp(Z5811MMezPda, T01FS10_A5811MMezPda[0]) != 0 )
            {
               GXutil.writeLogln("tmezpar:[seudo value changed for attri]"+"MMezPda");
               GXutil.writeLogRaw("Old: ",Z5811MMezPda);
               GXutil.writeLogRaw("Current: ",T01FS10_A5811MMezPda[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5812MMezFecPda), GXutil.resetTime(T01FS10_A5812MMezFecPda[0])) ) )
            {
               GXutil.writeLogln("tmezpar:[seudo value changed for attri]"+"MMezFecPda");
               GXutil.writeLogRaw("Old: ",Z5812MMezFecPda);
               GXutil.writeLogRaw("Current: ",T01FS10_A5812MMezFecPda[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5813MMezFecEnt), GXutil.resetTime(T01FS10_A5813MMezFecEnt[0])) ) )
            {
               GXutil.writeLogln("tmezpar:[seudo value changed for attri]"+"MMezFecEnt");
               GXutil.writeLogRaw("Old: ",Z5813MMezFecEnt);
               GXutil.writeLogRaw("Current: ",T01FS10_A5813MMezFecEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z5814MMezPorTot, T01FS10_A5814MMezPorTot[0]) != 0 )
            {
               GXutil.writeLogln("tmezpar:[seudo value changed for attri]"+"MMezPorTot");
               GXutil.writeLogRaw("Old: ",Z5814MMezPorTot);
               GXutil.writeLogRaw("Current: ",T01FS10_A5814MMezPorTot[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMEZCLI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FS1581( )
   {
      beforeValidate1FS1581( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FS1581( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FS1581( 0) ;
         checkOptimisticConcurrency1FS1581( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FS1581( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FS1581( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FS18 */
                  pr_default.execute(15, new Object[] {A5809MMezCod, Boolean.valueOf(n5810MMezKgs), A5810MMezKgs, Boolean.valueOf(n5811MMezPda), A5811MMezPda, Boolean.valueOf(n5812MMezFecPda), A5812MMezFecPda, Boolean.valueOf(n5813MMezFecEnt), A5813MMezFecEnt, Boolean.valueOf(n5814MMezPorTot), A5814MMezPorTot, A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZCLI");
                  if ( (pr_default.getStatus(15) == 1) )
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
                        processLevel1FS1581( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1FS0( ) ;
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
            load1FS1581( ) ;
         }
         endLevel1FS1581( ) ;
      }
      closeExtendedTableCursors1FS1581( ) ;
   }

   public void update1FS1581( )
   {
      beforeValidate1FS1581( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FS1581( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FS1581( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FS1581( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1FS1581( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FS19 */
                  pr_default.execute(16, new Object[] {Boolean.valueOf(n5810MMezKgs), A5810MMezKgs, Boolean.valueOf(n5811MMezPda), A5811MMezPda, Boolean.valueOf(n5812MMezFecPda), A5812MMezFecPda, Boolean.valueOf(n5813MMezFecEnt), A5813MMezFecEnt, Boolean.valueOf(n5814MMezPorTot), A5814MMezPorTot, A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZCLI");
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMEZCLI"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1FS1581( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1FS1581( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1FS0( ) ;
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
         endLevel1FS1581( ) ;
      }
      closeExtendedTableCursors1FS1581( ) ;
   }

   public void deferredUpdate1FS1581( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FS1581( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FS1581( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FS1581( ) ;
         afterConfirm1FS1581( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FS1581( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01FS20 */
               pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
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
                        initAll1FS1581( ) ;
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
                     resetCaption1FS0( ) ;
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
      endLevel1FS1581( ) ;
      Gx_mode = sMode1581 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FS1581( )
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
         /* Using cursor T01FS21 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MEZCLAS CLIENTE MATERIAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
      }
   }

   public void processNestedLevel1FS1582( )
   {
      s5820MmezArtKil = O5820MmezArtKil ;
      nGXsfl_70_idx = 0 ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRow1FS1582( ) ;
         if ( ( nRcdExists_1582 != 0 ) || ( nIsMod_1582 != 0 ) )
         {
            standaloneNotModal1FS1582( ) ;
            getKey1FS1582( ) ;
            if ( ( nRcdExists_1582 == 0 ) && ( nRcdDeleted_1582 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1FS1582( ) ;
            }
            else
            {
               if ( RcdFound1582 != 0 )
               {
                  if ( ( nRcdDeleted_1582 != 0 ) && ( nRcdExists_1582 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1FS1582( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1582 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1FS1582( ) ;
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
         httpContext.changePostValue( edtMmezArtPPT_Internalname, GXutil.ltrim( localUtil.ntoc( A5828MmezArtPPT, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5816MMezArtDsc_"+sGXsfl_70_idx, GXutil.rtrim( Z5816MMezArtDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z5817MmezUltCol_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z5817MmezUltCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5818MmezUltPar_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z5818MmezUltPar, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T5818MmezUltPar_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( O5818MmezUltPar, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T5828MmezArtPPT_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( O5828MmezArtPPT, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
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
            httpContext.changePostValue( "MMEZARTPPT_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezArtPPT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1FS1582( ) ;
      if ( AnyError != 0 )
      {
         O5820MmezArtKil = s5820MmezArtKil ;
      }
      nRcdExists_1582 = (short)(0) ;
      nIsMod_1582 = (short)(0) ;
      nRcdDeleted_1582 = (short)(0) ;
   }

   public void processLevel1FS1581( )
   {
      /* Save parent mode. */
      sMode1581 = Gx_mode ;
      processNestedLevel1FS1582( ) ;
      if ( AnyError != 0 )
      {
         O5820MmezArtKil = s5820MmezArtKil ;
      }
      /* Restore parent mode. */
      Gx_mode = sMode1581 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1FS1581( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(7);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1FS1581( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmezpar");
         if ( AnyError == 0 )
         {
            confirmValues1FS0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmezpar");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1FS1581( )
   {
      /* Scan By routine */
      /* Using cursor T01FS22 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
      RcdFound1581 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1581 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FS1581( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound1581 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1581 = (short)(1) ;
      }
   }

   public void scanEnd1FS1581( )
   {
      pr_default.close(19);
   }

   public void afterConfirm1FS1581( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FS1581( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FS1581( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FS1581( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FS1581( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FS1581( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FS1581( )
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

   public void zm1FS1582( int GX_JID )
   {
      if ( ( GX_JID == 25 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5816MMezArtDsc = T01FS6_A5816MMezArtDsc[0] ;
            Z5817MmezUltCol = T01FS6_A5817MmezUltCol[0] ;
            Z5818MmezUltPar = T01FS6_A5818MmezUltPar[0] ;
         }
         else
         {
            Z5816MMezArtDsc = A5816MMezArtDsc ;
            Z5817MmezUltCol = A5817MmezUltCol ;
            Z5818MmezUltPar = A5818MmezUltPar ;
         }
      }
      if ( GX_JID == -25 )
      {
         Z5809MMezCod = A5809MMezCod ;
         Z5816MMezArtDsc = A5816MMezArtDsc ;
         Z5817MmezUltCol = A5817MmezUltCol ;
         Z5818MmezUltPar = A5818MmezUltPar ;
         Z5819MmezArtPor = A5819MmezArtPor ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z5828MmezArtPPT = A5828MmezArtPPT ;
      }
   }

   public void standaloneNotModal1FS1582( )
   {
      edtMMezArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezArtDsc_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtMmezUltPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezUltPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezUltPar_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      /* Using cursor T01FS7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         GXCCtl = "ARTCOD_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
      }
      pr_default.close(5);
      /* Using cursor T01FS9 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A5828MmezArtPPT = T01FS9_A5828MmezArtPPT[0] ;
         n5828MmezArtPPT = T01FS9_n5828MmezArtPPT[0] ;
      }
      else
      {
         A5828MmezArtPPT = DecimalUtil.doubleToDec(0) ;
         n5828MmezArtPPT = false ;
      }
      O5828MmezArtPPT = A5828MmezArtPPT ;
      n5828MmezArtPPT = false ;
      pr_default.close(6);
      A5820MmezArtKil = GXutil.roundDecimal( (A5810MMezKgs.multiply(A5819MmezArtPor).divide(A5814MMezPorTot, 18, java.math.RoundingMode.DOWN)), 2) ;
   }

   public void standaloneModal1FS1582( )
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

   public void load1FS1582( )
   {
      /* Using cursor T01FS24 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod, Boolean.valueOf(n5819MmezArtPor), A5819MmezArtPor});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1582 = (short)(1) ;
         A5816MMezArtDsc = T01FS24_A5816MMezArtDsc[0] ;
         n5816MMezArtDsc = T01FS24_n5816MMezArtDsc[0] ;
         A5817MmezUltCol = T01FS24_A5817MmezUltCol[0] ;
         n5817MmezUltCol = T01FS24_n5817MmezUltCol[0] ;
         A5818MmezUltPar = T01FS24_A5818MmezUltPar[0] ;
         n5818MmezUltPar = T01FS24_n5818MmezUltPar[0] ;
         A5828MmezArtPPT = T01FS24_A5828MmezArtPPT[0] ;
         n5828MmezArtPPT = T01FS24_n5828MmezArtPPT[0] ;
         zm1FS1582( -25) ;
      }
      pr_default.close(20);
      onLoadActions1FS1582( ) ;
   }

   public void onLoadActions1FS1582( )
   {
   }

   public void checkExtendedTable1FS1582( )
   {
      nIsDirty_1582 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1FS1582( ) ;
   }

   public void closeExtendedTableCursors1FS1582( )
   {
   }

   public void enableDisable1FS1582( )
   {
   }

   public void getKey1FS1582( )
   {
      /* Using cursor T01FS25 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1582 = (short)(1) ;
      }
      else
      {
         RcdFound1582 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKey1FS1582( )
   {
      /* Using cursor T01FS6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01FS6_A5809MMezCod[0], A5809MMezCod) == 0 ) && ( DecimalUtil.compareTo(T01FS6_A5819MmezArtPor[0], A5819MmezArtPor) == 0 ) && ( GXutil.strcmp(T01FS6_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FS6_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FS6_A65ArtCod[0], A65ArtCod) == 0 ) )
      {
         zm1FS1582( 25) ;
         RcdFound1582 = (short)(1) ;
         initializeNonKey1FS1582( ) ;
         A5816MMezArtDsc = T01FS6_A5816MMezArtDsc[0] ;
         n5816MMezArtDsc = T01FS6_n5816MMezArtDsc[0] ;
         A5817MmezUltCol = T01FS6_A5817MmezUltCol[0] ;
         n5817MmezUltCol = T01FS6_n5817MmezUltCol[0] ;
         A5818MmezUltPar = T01FS6_A5818MmezUltPar[0] ;
         n5818MmezUltPar = T01FS6_n5818MmezUltPar[0] ;
         O5818MmezUltPar = A5818MmezUltPar ;
         n5818MmezUltPar = false ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z5809MMezCod = A5809MMezCod ;
         Z65ArtCod = A65ArtCod ;
         sMode1582 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FS1582( ) ;
         load1FS1582( ) ;
         Gx_mode = sMode1582 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1582 = (short)(0) ;
         initializeNonKey1FS1582( ) ;
         sMode1582 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FS1582( ) ;
         Gx_mode = sMode1582 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1FS1582( ) ;
      }
      pr_default.close(4);
   }

   public void checkOptimisticConcurrency1FS1582( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FS5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMEZCL1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z5816MMezArtDsc, T01FS5_A5816MMezArtDsc[0]) != 0 ) || ( Z5817MmezUltCol != T01FS5_A5817MmezUltCol[0] ) || ( Z5818MmezUltPar != T01FS5_A5818MmezUltPar[0] ) )
         {
            if ( GXutil.strcmp(Z5816MMezArtDsc, T01FS5_A5816MMezArtDsc[0]) != 0 )
            {
               GXutil.writeLogln("tmezpar:[seudo value changed for attri]"+"MMezArtDsc");
               GXutil.writeLogRaw("Old: ",Z5816MMezArtDsc);
               GXutil.writeLogRaw("Current: ",T01FS5_A5816MMezArtDsc[0]);
            }
            if ( Z5817MmezUltCol != T01FS5_A5817MmezUltCol[0] )
            {
               GXutil.writeLogln("tmezpar:[seudo value changed for attri]"+"MmezUltCol");
               GXutil.writeLogRaw("Old: ",Z5817MmezUltCol);
               GXutil.writeLogRaw("Current: ",T01FS5_A5817MmezUltCol[0]);
            }
            if ( Z5818MmezUltPar != T01FS5_A5818MmezUltPar[0] )
            {
               GXutil.writeLogln("tmezpar:[seudo value changed for attri]"+"MmezUltPar");
               GXutil.writeLogRaw("Old: ",Z5818MmezUltPar);
               GXutil.writeLogRaw("Current: ",T01FS5_A5818MmezUltPar[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMEZCL1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FS1582( )
   {
      beforeValidate1FS1582( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FS1582( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FS1582( 0) ;
         checkOptimisticConcurrency1FS1582( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FS1582( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FS1582( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FS26 */
                  pr_default.execute(22, new Object[] {A5809MMezCod, Boolean.valueOf(n5816MMezArtDsc), A5816MMezArtDsc, Boolean.valueOf(n5817MmezUltCol), Byte.valueOf(A5817MmezUltCol), Boolean.valueOf(n5818MmezUltPar), Byte.valueOf(A5818MmezUltPar), Boolean.valueOf(n5819MmezArtPor), A5819MmezArtPor, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZCL1");
                  if ( (pr_default.getStatus(22) == 1) )
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
                        processLevel1FS1582( ) ;
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
            load1FS1582( ) ;
         }
         endLevel1FS1582( ) ;
      }
      closeExtendedTableCursors1FS1582( ) ;
   }

   public void update1FS1582( )
   {
      beforeValidate1FS1582( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FS1582( ) ;
      }
      if ( ( nIsMod_1582 != 0 ) || ( nIsDirty_1582 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1FS1582( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1FS1582( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1FS1582( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01FS27 */
                     pr_default.execute(23, new Object[] {Boolean.valueOf(n5816MMezArtDsc), A5816MMezArtDsc, Boolean.valueOf(n5817MmezUltCol), Byte.valueOf(A5817MmezUltCol), Boolean.valueOf(n5818MmezUltPar), Byte.valueOf(A5818MmezUltPar), Boolean.valueOf(n5819MmezArtPor), A5819MmezArtPor, A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZCL1");
                     if ( (pr_default.getStatus(23) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMEZCL1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1FS1582( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel1FS1582( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey1FS1582( ) ;
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
            endLevel1FS1582( ) ;
         }
      }
      closeExtendedTableCursors1FS1582( ) ;
   }

   public void deferredUpdate1FS1582( )
   {
   }

   public void delete1FS1582( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FS1582( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FS1582( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FS1582( ) ;
         afterConfirm1FS1582( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FS1582( ) ;
            if ( AnyError == 0 )
            {
               A5818MmezUltPar = O5818MmezUltPar ;
               n5818MmezUltPar = false ;
               A5828MmezArtPPT = O5828MmezArtPPT ;
               n5828MmezArtPPT = false ;
               scanStart1FS1584( ) ;
               while ( RcdFound1584 != 0 )
               {
                  getByPrimaryKey1FS1584( ) ;
                  delete1FS1584( ) ;
                  scanNext1FS1584( ) ;
                  O5818MmezUltPar = A5818MmezUltPar ;
                  n5818MmezUltPar = false ;
                  O5828MmezArtPPT = A5828MmezArtPPT ;
                  n5828MmezArtPPT = false ;
               }
               scanEnd1FS1584( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FS28 */
                  pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod});
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
      endLevel1FS1582( ) ;
      Gx_mode = sMode1582 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FS1582( )
   {
      standaloneModal1FS1582( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01FS29 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MEZCLAS COLORES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
      }
   }

   public void processNestedLevel1FS1584( )
   {
      s5818MmezUltPar = O5818MmezUltPar ;
      n5818MmezUltPar = false ;
      s5828MmezArtPPT = O5828MmezArtPPT ;
      n5828MmezArtPPT = false ;
      nGXsfl_112_idx = 0 ;
      while ( nGXsfl_112_idx < nRC_GXsfl_112 )
      {
         readRow1FS1584( ) ;
         if ( ( nRcdExists_1584 != 0 ) || ( nIsMod_1584 != 0 ) )
         {
            standaloneNotModal1FS1584( ) ;
            getKey1FS1584( ) ;
            if ( ( nRcdExists_1584 == 0 ) && ( nRcdDeleted_1584 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1FS1584( ) ;
            }
            else
            {
               if ( RcdFound1584 != 0 )
               {
                  if ( ( nRcdDeleted_1584 != 0 ) && ( nRcdExists_1584 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1FS1584( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1584 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1FS1584( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1584 == 0 )
                  {
                     GXCCtl = "MMEZLINPAR_" + sGXsfl_112_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMmezLinPar_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O5818MmezUltPar = A5818MmezUltPar ;
            n5818MmezUltPar = false ;
            O5828MmezArtPPT = A5828MmezArtPPT ;
            n5828MmezArtPPT = false ;
         }
         httpContext.changePostValue( edtavnRcdDeleted_1584_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1584, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezLinPar_Internalname, GXutil.ltrim( localUtil.ntoc( A5829MmezLinPar, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezParPor_Internalname, GXutil.ltrim( localUtil.ntoc( A5830MmezParPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPartCod_Internalname, GXutil.rtrim( A966PartCod)) ;
         httpContext.changePostValue( edtMmezParKil_Internalname, GXutil.ltrim( localUtil.ntoc( A5831MmezParKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezParObs_Internalname, GXutil.rtrim( A5832MmezParObs)) ;
         httpContext.changePostValue( "ZT_"+"Z5829MmezLinPar_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( Z5829MmezLinPar, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5830MmezParPor_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( Z5830MmezParPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5832MmezParObs_"+sGXsfl_112_idx, GXutil.rtrim( Z5832MmezParObs)) ;
         httpContext.changePostValue( "ZT_"+"Z966PartCod_"+sGXsfl_112_idx, GXutil.rtrim( Z966PartCod)) ;
         httpContext.changePostValue( "T5830MmezParPor_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( O5830MmezParPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1584_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1584, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1584_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1584, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1584_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1584, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1584 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1584_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1584_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZLINPAR_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezLinPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZPARPOR_"+sGXsfl_112_idx+"Title", GXutil.rtrim( edtMmezParPor_Title)) ;
            httpContext.changePostValue( "MMEZPARPOR_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezParPor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARTCOD_"+sGXsfl_112_idx+"Title", GXutil.rtrim( edtPartCod_Title)) ;
            httpContext.changePostValue( "PARTCOD_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPartCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZPARKIL_"+sGXsfl_112_idx+"Title", GXutil.rtrim( edtMmezParKil_Title)) ;
            httpContext.changePostValue( "MMEZPARKIL_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezParKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZPAROBS_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezParObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1FS1584( ) ;
      if ( AnyError != 0 )
      {
         O5818MmezUltPar = s5818MmezUltPar ;
         n5818MmezUltPar = false ;
         O5828MmezArtPPT = s5828MmezArtPPT ;
         n5828MmezArtPPT = false ;
      }
      nRcdExists_1584 = (short)(0) ;
      nIsMod_1584 = (short)(0) ;
      nRcdDeleted_1584 = (short)(0) ;
   }

   public void processLevel1FS1582( )
   {
      /* Save parent mode. */
      sMode1582 = Gx_mode ;
      processNestedLevel1FS1584( ) ;
      if ( AnyError != 0 )
      {
         O5818MmezUltPar = s5818MmezUltPar ;
         n5818MmezUltPar = false ;
         O5828MmezArtPPT = s5828MmezArtPPT ;
         n5828MmezArtPPT = false ;
      }
      /* Restore parent mode. */
      Gx_mode = sMode1582 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01FS30 */
      pr_default.execute(26, new Object[] {Boolean.valueOf(n5818MmezUltPar), Byte.valueOf(A5818MmezUltPar), A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZCL1");
   }

   public void endLevel1FS1582( )
   {
      pr_default.close(3);
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1FS1582( )
   {
      /* Scan By routine */
      /* Using cursor T01FS31 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod, Boolean.valueOf(n5819MmezArtPor), A5819MmezArtPor});
      RcdFound1582 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1582 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FS1582( )
   {
      /* Scan next routine */
      pr_default.readNext(27);
      RcdFound1582 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1582 = (short)(1) ;
      }
   }

   public void scanEnd1FS1582( )
   {
      pr_default.close(27);
   }

   public void afterConfirm1FS1582( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FS1582( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FS1582( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FS1582( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FS1582( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FS1582( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FS1582( )
   {
      edtMMezArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezArtDsc_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtMmezUltCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezUltCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezUltCol_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtMmezUltPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezUltPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezUltPar_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtMmezArtPPT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezArtPPT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezArtPPT_Enabled), 5, 0), !bGXsfl_70_Refreshing);
   }

   public void zm1FS1584( int GX_JID )
   {
      if ( ( GX_JID == 28 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5830MmezParPor = T01FS3_A5830MmezParPor[0] ;
            Z5832MmezParObs = T01FS3_A5832MmezParObs[0] ;
            Z966PartCod = T01FS3_A966PartCod[0] ;
         }
         else
         {
            Z5830MmezParPor = A5830MmezParPor ;
            Z5832MmezParObs = A5832MmezParObs ;
            Z966PartCod = A966PartCod ;
         }
      }
      if ( GX_JID == -28 )
      {
         Z5809MMezCod = A5809MMezCod ;
         Z65ArtCod = A65ArtCod ;
         Z5829MmezLinPar = A5829MmezLinPar ;
         Z5830MmezParPor = A5830MmezParPor ;
         Z5832MmezParObs = A5832MmezParObs ;
         Z396EmprCod = A396EmprCod ;
         Z966PartCod = A966PartCod ;
         Z252CliCod = A252CliCod ;
      }
   }

   public void standaloneNotModal1FS1584( )
   {
      edtMmezUltPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezUltPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezUltPar_Enabled), 5, 0), !bGXsfl_70_Refreshing);
   }

   public void standaloneModal1FS1584( )
   {
      if ( isIns( )  )
      {
         A5818MmezUltPar = (byte)(O5818MmezUltPar+1) ;
         n5818MmezUltPar = false ;
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A5829MmezLinPar = A5818MmezUltPar ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMmezLinPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMmezLinPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezLinPar_Enabled), 5, 0), !bGXsfl_112_Refreshing);
      }
      else
      {
         edtMmezLinPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMmezLinPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezLinPar_Enabled), 5, 0), !bGXsfl_112_Refreshing);
      }
   }

   public void load1FS1584( )
   {
      /* Using cursor T01FS32 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod, Byte.valueOf(A5829MmezLinPar)});
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1584 = (short)(1) ;
         A5830MmezParPor = T01FS32_A5830MmezParPor[0] ;
         n5830MmezParPor = T01FS32_n5830MmezParPor[0] ;
         A5832MmezParObs = T01FS32_A5832MmezParObs[0] ;
         n5832MmezParObs = T01FS32_n5832MmezParObs[0] ;
         A966PartCod = T01FS32_A966PartCod[0] ;
         n966PartCod = T01FS32_n966PartCod[0] ;
         zm1FS1584( -28) ;
      }
      pr_default.close(28);
      onLoadActions1FS1584( ) ;
   }

   public void onLoadActions1FS1584( )
   {
      A5831MmezParKil = GXutil.roundDecimal( (A5820MmezArtKil.multiply(A5830MmezParPor).divide(A5819MmezArtPor, 18, java.math.RoundingMode.DOWN)), 2) ;
      if ( isIns( )  )
      {
         A5828MmezArtPPT = O5828MmezArtPPT.add(A5830MmezParPor) ;
         n5828MmezArtPPT = false ;
      }
      else
      {
         if ( isUpd( )  )
         {
            A5828MmezArtPPT = O5828MmezArtPPT.add(A5830MmezParPor).subtract(O5830MmezParPor) ;
            n5828MmezArtPPT = false ;
         }
         else
         {
            if ( isDlt( )  )
            {
               A5828MmezArtPPT = O5828MmezArtPPT.subtract(O5830MmezParPor) ;
               n5828MmezArtPPT = false ;
            }
         }
      }
   }

   public void checkExtendedTable1FS1584( )
   {
      nIsDirty_1584 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1FS1584( ) ;
      /* Using cursor T01FS4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPARTI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPartCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      if ( DecimalUtil.compareTo(A5830MmezParPor, A5819MmezArtPor) > 0 )
      {
         GXCCtl = "MMEZPARPOR_" + sGXsfl_112_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. El porcentaje no puede ser superior al % de Materia", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMmezParPor_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      nIsDirty_1584 = (short)(1) ;
      A5831MmezParKil = GXutil.roundDecimal( (A5820MmezArtKil.multiply(A5830MmezParPor).divide(A5819MmezArtPor, 18, java.math.RoundingMode.DOWN)), 2) ;
      if ( isIns( )  )
      {
         nIsDirty_1584 = (short)(1) ;
         A5828MmezArtPPT = O5828MmezArtPPT.add(A5830MmezParPor) ;
         n5828MmezArtPPT = false ;
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1584 = (short)(1) ;
            A5828MmezArtPPT = O5828MmezArtPPT.add(A5830MmezParPor).subtract(O5830MmezParPor) ;
            n5828MmezArtPPT = false ;
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1584 = (short)(1) ;
               A5828MmezArtPPT = O5828MmezArtPPT.subtract(O5830MmezParPor) ;
               n5828MmezArtPPT = false ;
            }
         }
      }
      if ( ( DecimalUtil.compareTo(A5828MmezArtPPT, A5819MmezArtPor) > 0 ) && true /* After */ )
      {
         GXCCtl = "MMEZPARPOR_" + sGXsfl_112_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. La suma de porcentajes no puede ser superior al % de Materia", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMmezParPor_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1FS1584( )
   {
      pr_default.close(2);
   }

   public void enableDisable1FS1584( )
   {
   }

   public void gxload_29( String A396EmprCod ,
                          String A966PartCod ,
                          int A252CliCod )
   {
      /* Using cursor T01FS33 */
      pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPARTI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPartCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(29) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(29);
   }

   public void getKey1FS1584( )
   {
      /* Using cursor T01FS34 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod, Byte.valueOf(A5829MmezLinPar)});
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1584 = (short)(1) ;
      }
      else
      {
         RcdFound1584 = (short)(0) ;
      }
      pr_default.close(30);
   }

   public void getByPrimaryKey1FS1584( )
   {
      /* Using cursor T01FS3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod, Byte.valueOf(A5829MmezLinPar)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01FS3_A5809MMezCod[0], A5809MMezCod) == 0 ) && ( GXutil.strcmp(T01FS3_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T01FS3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FS3_A252CliCod[0] == A252CliCod ) )
      {
         zm1FS1584( 28) ;
         RcdFound1584 = (short)(1) ;
         initializeNonKey1FS1584( ) ;
         A5829MmezLinPar = T01FS3_A5829MmezLinPar[0] ;
         A5830MmezParPor = T01FS3_A5830MmezParPor[0] ;
         n5830MmezParPor = T01FS3_n5830MmezParPor[0] ;
         A5832MmezParObs = T01FS3_A5832MmezParObs[0] ;
         n5832MmezParObs = T01FS3_n5832MmezParObs[0] ;
         A966PartCod = T01FS3_A966PartCod[0] ;
         n966PartCod = T01FS3_n966PartCod[0] ;
         O5830MmezParPor = A5830MmezParPor ;
         n5830MmezParPor = false ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z5809MMezCod = A5809MMezCod ;
         Z65ArtCod = A65ArtCod ;
         Z5829MmezLinPar = A5829MmezLinPar ;
         sMode1584 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FS1584( ) ;
         load1FS1584( ) ;
         Gx_mode = sMode1584 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1584 = (short)(0) ;
         initializeNonKey1FS1584( ) ;
         sMode1584 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FS1584( ) ;
         Gx_mode = sMode1584 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1FS1584( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1FS1584( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FS2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod, Byte.valueOf(A5829MmezLinPar)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMEZPAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z5830MmezParPor, T01FS2_A5830MmezParPor[0]) != 0 ) || ( GXutil.strcmp(Z5832MmezParObs, T01FS2_A5832MmezParObs[0]) != 0 ) || ( GXutil.strcmp(Z966PartCod, T01FS2_A966PartCod[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z5830MmezParPor, T01FS2_A5830MmezParPor[0]) != 0 )
            {
               GXutil.writeLogln("tmezpar:[seudo value changed for attri]"+"MmezParPor");
               GXutil.writeLogRaw("Old: ",Z5830MmezParPor);
               GXutil.writeLogRaw("Current: ",T01FS2_A5830MmezParPor[0]);
            }
            if ( GXutil.strcmp(Z5832MmezParObs, T01FS2_A5832MmezParObs[0]) != 0 )
            {
               GXutil.writeLogln("tmezpar:[seudo value changed for attri]"+"MmezParObs");
               GXutil.writeLogRaw("Old: ",Z5832MmezParObs);
               GXutil.writeLogRaw("Current: ",T01FS2_A5832MmezParObs[0]);
            }
            if ( GXutil.strcmp(Z966PartCod, T01FS2_A966PartCod[0]) != 0 )
            {
               GXutil.writeLogln("tmezpar:[seudo value changed for attri]"+"PartCod");
               GXutil.writeLogRaw("Old: ",Z966PartCod);
               GXutil.writeLogRaw("Current: ",T01FS2_A966PartCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMEZPAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FS1584( )
   {
      beforeValidate1FS1584( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FS1584( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FS1584( 0) ;
         checkOptimisticConcurrency1FS1584( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FS1584( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FS1584( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FS35 */
                  pr_default.execute(31, new Object[] {A5809MMezCod, A65ArtCod, Byte.valueOf(A5829MmezLinPar), Boolean.valueOf(n5830MmezParPor), A5830MmezParPor, Boolean.valueOf(n5832MmezParObs), A5832MmezParObs, A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZPAR");
                  if ( (pr_default.getStatus(31) == 1) )
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
            load1FS1584( ) ;
         }
         endLevel1FS1584( ) ;
      }
      closeExtendedTableCursors1FS1584( ) ;
   }

   public void update1FS1584( )
   {
      beforeValidate1FS1584( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FS1584( ) ;
      }
      if ( ( nIsMod_1584 != 0 ) || ( nIsDirty_1584 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1FS1584( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1FS1584( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1FS1584( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01FS36 */
                     pr_default.execute(32, new Object[] {Boolean.valueOf(n5830MmezParPor), A5830MmezParPor, Boolean.valueOf(n5832MmezParObs), A5832MmezParObs, Boolean.valueOf(n966PartCod), A966PartCod, A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod, Byte.valueOf(A5829MmezLinPar)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZPAR");
                     if ( (pr_default.getStatus(32) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMEZPAR"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1FS1584( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1FS1584( ) ;
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
            endLevel1FS1584( ) ;
         }
      }
      closeExtendedTableCursors1FS1584( ) ;
   }

   public void deferredUpdate1FS1584( )
   {
   }

   public void delete1FS1584( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FS1584( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FS1584( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FS1584( ) ;
         afterConfirm1FS1584( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FS1584( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01FS37 */
               pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod, Byte.valueOf(A5829MmezLinPar)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZPAR");
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
      sMode1584 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FS1584( ) ;
      Gx_mode = sMode1584 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FS1584( )
   {
      standaloneModal1FS1584( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A5831MmezParKil = GXutil.roundDecimal( (A5820MmezArtKil.multiply(A5830MmezParPor).divide(A5819MmezArtPor, 18, java.math.RoundingMode.DOWN)), 2) ;
         if ( isIns( )  )
         {
            A5828MmezArtPPT = O5828MmezArtPPT.add(A5830MmezParPor) ;
            n5828MmezArtPPT = false ;
         }
         else
         {
            if ( isUpd( )  )
            {
               A5828MmezArtPPT = O5828MmezArtPPT.add(A5830MmezParPor).subtract(O5830MmezParPor) ;
               n5828MmezArtPPT = false ;
            }
            else
            {
               if ( isDlt( )  )
               {
                  A5828MmezArtPPT = O5828MmezArtPPT.subtract(O5830MmezParPor) ;
                  n5828MmezArtPPT = false ;
               }
            }
         }
      }
   }

   public void endLevel1FS1584( )
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

   public void scanStart1FS1584( )
   {
      /* Scan By routine */
      /* Using cursor T01FS38 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod});
      RcdFound1584 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound1584 = (short)(1) ;
         A5829MmezLinPar = T01FS38_A5829MmezLinPar[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FS1584( )
   {
      /* Scan next routine */
      pr_default.readNext(34);
      RcdFound1584 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound1584 = (short)(1) ;
         A5829MmezLinPar = T01FS38_A5829MmezLinPar[0] ;
      }
   }

   public void scanEnd1FS1584( )
   {
      pr_default.close(34);
   }

   public void afterConfirm1FS1584( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FS1584( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FS1584( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FS1584( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FS1584( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FS1584( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FS1584( )
   {
      edtMmezLinPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezLinPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezLinPar_Enabled), 5, 0), !bGXsfl_112_Refreshing);
      edtMmezParPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezParPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezParPor_Enabled), 5, 0), !bGXsfl_112_Refreshing);
      edtPartCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPartCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPartCod_Enabled), 5, 0), !bGXsfl_112_Refreshing);
      edtMmezParKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezParKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezParKil_Enabled), 5, 0), !bGXsfl_112_Refreshing);
      edtMmezParObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezParObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezParObs_Enabled), 5, 0), !bGXsfl_112_Refreshing);
   }

   public void send_integrity_lvl_hashes1FS1584( )
   {
   }

   public void send_integrity_lvl_hashes1FS1582( )
   {
   }

   public void send_integrity_lvl_hashes1FS1581( )
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
      edtMmezArtPPT_Internalname = "MMEZARTPPT_"+sGXsfl_70_idx ;
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
      edtMmezArtPPT_Internalname = "MMEZARTPPT_"+sGXsfl_70_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_70_fel_idx ;
   }

   public void addRow1FS1582( )
   {
      nRC_GXsfl_112 = 0 ;
      nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701582( ) ;
      sendRow1FS1582( ) ;
   }

   public void sendRow1FS1582( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1582_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMmezUltCol_Internalname,GXutil.ltrim( localUtil.ntoc( A5817MmezUltCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMmezUltCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5817MmezUltCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A5817MmezUltCol), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMmezUltCol_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtMmezUltCol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(2),"chr",Integer.valueOf(1),"row",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock14_Internalname,httpContext.getMessage( "Ultima Linea Mezcla Partido", ""),"","",lblTextblock14_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMmezUltPar_Internalname,GXutil.ltrim( localUtil.ntoc( A5818MmezUltPar, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMmezUltPar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5818MmezUltPar), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A5818MmezUltPar), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMmezUltPar_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtMmezUltPar_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(2),"chr",Integer.valueOf(1),"row",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
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
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock17_Internalname,httpContext.getMessage( "Suma Porcent.Partido por Artic", ""),"","",lblTextblock17_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMmezArtPPT_Internalname,GXutil.ltrim( localUtil.ntoc( A5828MmezArtPPT, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMmezArtPPT_Enabled!=0) ? localUtil.format( A5828MmezArtPPT, "ZZ9.99") : localUtil.format( A5828MmezArtPPT, "ZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMmezArtPPT_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtMmezArtPPT_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
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
         nBlankRcdCount1584 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1584 = (short)(1) ;
            scanStart1FS1584( ) ;
            while ( RcdFound1584 != 0 )
            {
               init_level_properties1584( ) ;
               getByPrimaryKey1FS1584( ) ;
               addRow1FS1584( ) ;
               scanNext1FS1584( ) ;
            }
            scanEnd1FS1584( ) ;
            nBlankRcdCount1584 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B5818MmezUltPar = A5818MmezUltPar ;
         n5818MmezUltPar = false ;
         B5828MmezArtPPT = A5828MmezArtPPT ;
         n5828MmezArtPPT = false ;
         B5820MmezArtKil = A5820MmezArtKil ;
         standaloneNotModal1FS1584( ) ;
         standaloneModal1FS1584( ) ;
         sMode1584 = Gx_mode ;
         while ( nGXsfl_112_idx < nRC_GXsfl_112 )
         {
            bGXsfl_112_Refreshing = true ;
            readRow1FS1584( ) ;
            edtavnRcdDeleted_1584_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1584_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1584_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1584_Enabled), 5, 0), !bGXsfl_112_Refreshing);
            edtMmezLinPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZLINPAR_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMmezLinPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezLinPar_Enabled), 5, 0), !bGXsfl_112_Refreshing);
            edtMmezParPor_Title = httpContext.cgiGet( "MMEZPARPOR_"+sGXsfl_112_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtMmezParPor_Internalname, "Title", edtMmezParPor_Title, !bGXsfl_112_Refreshing);
            edtMmezParPor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZPARPOR_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMmezParPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezParPor_Enabled), 5, 0), !bGXsfl_112_Refreshing);
            edtPartCod_Title = httpContext.cgiGet( "PARTCOD_"+sGXsfl_112_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtPartCod_Internalname, "Title", edtPartCod_Title, !bGXsfl_112_Refreshing);
            edtPartCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARTCOD_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPartCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPartCod_Enabled), 5, 0), !bGXsfl_112_Refreshing);
            edtMmezParKil_Title = httpContext.cgiGet( "MMEZPARKIL_"+sGXsfl_112_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtMmezParKil_Internalname, "Title", edtMmezParKil_Title, !bGXsfl_112_Refreshing);
            edtMmezParKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZPARKIL_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMmezParKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezParKil_Enabled), 5, 0), !bGXsfl_112_Refreshing);
            edtMmezParObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZPAROBS_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMmezParObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezParObs_Enabled), 5, 0), !bGXsfl_112_Refreshing);
            if ( ( nRcdExists_1584 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1FS1584( ) ;
            }
            sendRow1FS1584( ) ;
            bGXsfl_112_Refreshing = false ;
         }
         Gx_mode = sMode1584 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A5818MmezUltPar = B5818MmezUltPar ;
         n5818MmezUltPar = false ;
         A5828MmezArtPPT = B5828MmezArtPPT ;
         n5828MmezArtPPT = false ;
         A5820MmezArtKil = B5820MmezArtKil ;
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1584 = (short)(5) ;
         nRcdExists_1584 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1FS1584( ) ;
            while ( RcdFound1584 != 0 )
            {
               sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx+1), 4, 0), (short)(4), "0") + sGXsfl_70_idx ;
               subsflControlProps_1121584( ) ;
               init_level_properties1584( ) ;
               standaloneNotModal1FS1584( ) ;
               getByPrimaryKey1FS1584( ) ;
               standaloneModal1FS1584( ) ;
               addRow1FS1584( ) ;
               scanNext1FS1584( ) ;
            }
            scanEnd1FS1584( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1584 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx+1), 4, 0), (short)(4), "0") + sGXsfl_70_idx ;
      subsflControlProps_1121584( ) ;
      initAll1FS1584( ) ;
      init_level_properties1584( ) ;
      B5818MmezUltPar = A5818MmezUltPar ;
      n5818MmezUltPar = false ;
      B5828MmezArtPPT = A5828MmezArtPPT ;
      n5828MmezArtPPT = false ;
      B5820MmezArtKil = A5820MmezArtKil ;
      nRcdExists_1584 = (short)(0) ;
      nIsMod_1584 = (short)(0) ;
      nRcdDeleted_1584 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 70 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_70_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1584 = (short)(nBlankRcdUsr1584+nBlankRcdCount1584) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1584 > 0 )
      {
         standaloneNotModal1FS1584( ) ;
         standaloneModal1FS1584( ) ;
         addRow1FS1584( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMmezLinPar_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1584 = (short)(nBlankRcdCount1584-1) ;
      }
      Gx_mode = sMode1584 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A5818MmezUltPar = B5818MmezUltPar ;
      n5818MmezUltPar = false ;
      A5828MmezArtPPT = B5828MmezArtPPT ;
      n5828MmezArtPPT = false ;
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
      send_integrity_lvl_hashes1FS1582( ) ;
      GXCCtl = "Z5816MMezArtDsc_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5816MMezArtDsc));
      GXCCtl = "Z5817MmezUltCol_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5817MmezUltCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5818MmezUltPar_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5818MmezUltPar, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O5818MmezUltPar_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O5818MmezUltPar, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O5828MmezArtPPT_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O5828MmezArtPPT, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "ARTCOD_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZARTDSC_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMezArtDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZULTCOL_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezUltCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZULTPAR_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezUltPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZARTPOR_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezArtPor_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZARTKIL_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezArtKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZARTPPT_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezArtPPT_Enabled, (byte)(5), (byte)(0), ".", "")));
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

   public void readRow1FS1582( )
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
      edtMmezArtPPT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZARTPPT_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
      A5816MMezArtDsc = httpContext.cgiGet( edtMMezArtDsc_Internalname) ;
      n5816MMezArtDsc = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMmezUltCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMmezUltCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "MMEZULTCOL_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMmezUltCol_Internalname ;
         wbErr = true ;
         A5817MmezUltCol = (byte)(0) ;
         n5817MmezUltCol = false ;
      }
      else
      {
         A5817MmezUltCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtMmezUltCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5817MmezUltCol = false ;
      }
      A5818MmezUltPar = (byte)(localUtil.ctol( httpContext.cgiGet( edtMmezUltPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n5818MmezUltPar = false ;
      A5819MmezArtPor = localUtil.ctond( httpContext.cgiGet( edtMmezArtPor_Internalname)) ;
      n5819MmezArtPor = false ;
      A5820MmezArtKil = localUtil.ctond( httpContext.cgiGet( edtMmezArtKil_Internalname)) ;
      A5828MmezArtPPT = localUtil.ctond( httpContext.cgiGet( edtMmezArtPPT_Internalname)) ;
      n5828MmezArtPPT = false ;
      GXCCtl = "Z5816MMezArtDsc_" + sGXsfl_70_idx ;
      Z5816MMezArtDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5817MmezUltCol_" + sGXsfl_70_idx ;
      Z5817MmezUltCol = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5818MmezUltPar_" + sGXsfl_70_idx ;
      Z5818MmezUltPar = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O5818MmezUltPar_" + sGXsfl_70_idx ;
      O5818MmezUltPar = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O5828MmezArtPPT_" + sGXsfl_70_idx ;
      O5828MmezArtPPT = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
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
      GXCCtl = "nRC_GXsfl_112_" + sGXsfl_70_idx ;
      nRC_GXsfl_112 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_1121584( )
   {
      edtavnRcdDeleted_1584_Internalname = "vNRCDDELETED_1584_"+sGXsfl_112_idx ;
      edtMmezLinPar_Internalname = "MMEZLINPAR_"+sGXsfl_112_idx ;
      edtMmezParPor_Internalname = "MMEZPARPOR_"+sGXsfl_112_idx ;
      edtPartCod_Internalname = "PARTCOD_"+sGXsfl_112_idx ;
      edtMmezParKil_Internalname = "MMEZPARKIL_"+sGXsfl_112_idx ;
      edtMmezParObs_Internalname = "MMEZPAROBS_"+sGXsfl_112_idx ;
   }

   public void subsflControlProps_fel_1121584( )
   {
      edtavnRcdDeleted_1584_Internalname = "vNRCDDELETED_1584_"+sGXsfl_112_fel_idx ;
      edtMmezLinPar_Internalname = "MMEZLINPAR_"+sGXsfl_112_fel_idx ;
      edtMmezParPor_Internalname = "MMEZPARPOR_"+sGXsfl_112_fel_idx ;
      edtPartCod_Internalname = "PARTCOD_"+sGXsfl_112_fel_idx ;
      edtMmezParKil_Internalname = "MMEZPARKIL_"+sGXsfl_112_fel_idx ;
      edtMmezParObs_Internalname = "MMEZPAROBS_"+sGXsfl_112_fel_idx ;
   }

   public void addRow1FS1584( )
   {
      nGXsfl_112_idx = (int)(nGXsfl_112_idx+1) ;
      sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx), 4, 0), (short)(4), "0") + sGXsfl_70_idx ;
      subsflControlProps_1121584( ) ;
      sendRow1FS1584( ) ;
   }

   public void sendRow1FS1584( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1584_" + sGXsfl_112_idx + "',1);gx.fn.setControlValue('nIsMod_1582_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_112_idx + "',112)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1584_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1584, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1584_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1584), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1584), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,113);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1584_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1584_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(112),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1584_" + sGXsfl_112_idx + "',1);gx.fn.setControlValue('nIsMod_1582_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 114,'',false,'" + sGXsfl_112_idx + "',112)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMmezLinPar_Internalname,GXutil.ltrim( localUtil.ntoc( A5829MmezLinPar, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5829MmezLinPar), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,114);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMmezLinPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMmezLinPar_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(112),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1584_" + sGXsfl_112_idx + "',1);gx.fn.setControlValue('nIsMod_1582_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 115,'',false,'" + sGXsfl_112_idx + "',112)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMmezParPor_Internalname,GXutil.ltrim( localUtil.ntoc( A5830MmezParPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMmezParPor_Enabled!=0) ? localUtil.format( A5830MmezParPor, "ZZ9.99") : localUtil.format( A5830MmezParPor, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,115);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMmezParPor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMmezParPor_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(112),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1584_" + sGXsfl_112_idx + "',1);gx.fn.setControlValue('nIsMod_1582_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 116,'',false,'" + sGXsfl_112_idx + "',112)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPartCod_Internalname,GXutil.rtrim( A966PartCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPartCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPartCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(112),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMmezParKil_Internalname,GXutil.ltrim( localUtil.ntoc( A5831MmezParKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMmezParKil_Enabled!=0) ? localUtil.format( A5831MmezParKil, "ZZZZZ9.99") : localUtil.format( A5831MmezParKil, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMmezParKil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMmezParKil_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(112),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1584_" + sGXsfl_112_idx + "',1);gx.fn.setControlValue('nIsMod_1582_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 118,'',false,'" + sGXsfl_112_idx + "',112)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMmezParObs_Internalname,GXutil.rtrim( A5832MmezParObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,118);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMmezParObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMmezParObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(112),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashes1FS1584( ) ;
      GXCCtl = "Z5829MmezLinPar_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5829MmezLinPar, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5830MmezParPor_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5830MmezParPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5832MmezParObs_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5832MmezParObs));
      GXCCtl = "Z966PartCod_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z966PartCod));
      GXCCtl = "O5830MmezParPor_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O5830MmezParPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1584_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1584, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1584_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1584, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1584_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1584, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1584_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1584_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZLINPAR_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezLinPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZPARPOR_"+sGXsfl_112_idx+"Title", GXutil.rtrim( edtMmezParPor_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZPARPOR_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezParPor_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARTCOD_"+sGXsfl_112_idx+"Title", GXutil.rtrim( edtPartCod_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "PARTCOD_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPartCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZPARKIL_"+sGXsfl_112_idx+"Title", GXutil.rtrim( edtMmezParKil_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZPARKIL_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezParKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZPAROBS_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezParObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRow1FS1584( )
   {
      nGXsfl_112_idx = (int)(nGXsfl_112_idx+1) ;
      sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx), 4, 0), (short)(4), "0") + sGXsfl_70_idx ;
      subsflControlProps_1121584( ) ;
      edtavnRcdDeleted_1584_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1584_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMmezLinPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZLINPAR_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMmezParPor_Title = httpContext.cgiGet( "MMEZPARPOR_"+sGXsfl_112_idx+"Title") ;
      edtMmezParPor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZPARPOR_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPartCod_Title = httpContext.cgiGet( "PARTCOD_"+sGXsfl_112_idx+"Title") ;
      edtPartCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARTCOD_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMmezParKil_Title = httpContext.cgiGet( "MMEZPARKIL_"+sGXsfl_112_idx+"Title") ;
      edtMmezParKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZPARKIL_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMmezParObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZPAROBS_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1584_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1584_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1584");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1584_Internalname ;
         wbErr = true ;
         nRcdDeleted_1584 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1584 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1584_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMmezLinPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMmezLinPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "MMEZLINPAR_" + sGXsfl_112_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMmezLinPar_Internalname ;
         wbErr = true ;
         A5829MmezLinPar = (byte)(0) ;
      }
      else
      {
         A5829MmezLinPar = (byte)(localUtil.ctol( httpContext.cgiGet( edtMmezLinPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMmezParPor_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMmezParPor_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "MMEZPARPOR_" + sGXsfl_112_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMmezParPor_Internalname ;
         wbErr = true ;
         A5830MmezParPor = DecimalUtil.ZERO ;
         n5830MmezParPor = false ;
      }
      else
      {
         A5830MmezParPor = localUtil.ctond( httpContext.cgiGet( edtMmezParPor_Internalname)) ;
         n5830MmezParPor = false ;
      }
      A966PartCod = httpContext.cgiGet( edtPartCod_Internalname) ;
      n966PartCod = false ;
      A5831MmezParKil = localUtil.ctond( httpContext.cgiGet( edtMmezParKil_Internalname)) ;
      A5832MmezParObs = httpContext.cgiGet( edtMmezParObs_Internalname) ;
      n5832MmezParObs = false ;
      GXCCtl = "Z5829MmezLinPar_" + sGXsfl_112_idx ;
      Z5829MmezLinPar = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5830MmezParPor_" + sGXsfl_112_idx ;
      Z5830MmezParPor = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5832MmezParObs_" + sGXsfl_112_idx ;
      Z5832MmezParObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z966PartCod_" + sGXsfl_112_idx ;
      Z966PartCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O5830MmezParPor_" + sGXsfl_112_idx ;
      O5830MmezParPor = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1584_" + sGXsfl_112_idx ;
      nRcdDeleted_1584 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1584_" + sGXsfl_112_idx ;
      nRcdExists_1584 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1584_" + sGXsfl_112_idx ;
      nIsMod_1584 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMmezLinPar_Enabled = edtMmezLinPar_Enabled ;
      defedtMmezUltPar_Enabled = edtMmezUltPar_Enabled ;
      defedtMMezArtDsc_Enabled = edtMMezArtDsc_Enabled ;
      defedtArtCod_Enabled = edtArtCod_Enabled ;
   }

   public void confirmValues1FS0( )
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
      subsflControlProps_1121584( ) ;
      while ( nGXsfl_112_idx < nRC_GXsfl_112 )
      {
         nGXsfl_112_idx = (int)(nGXsfl_112_idx+1) ;
         sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx), 4, 0), (short)(4), "0") + sGXsfl_70_idx ;
         subsflControlProps_1121584( ) ;
         httpContext.changePostValue( "Z5829MmezLinPar_"+sGXsfl_112_idx, httpContext.cgiGet( "ZT_"+"Z5829MmezLinPar_"+sGXsfl_112_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5829MmezLinPar_"+sGXsfl_112_idx) ;
         httpContext.changePostValue( "Z5830MmezParPor_"+sGXsfl_112_idx, httpContext.cgiGet( "ZT_"+"Z5830MmezParPor_"+sGXsfl_112_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5830MmezParPor_"+sGXsfl_112_idx) ;
         httpContext.changePostValue( "Z5832MmezParObs_"+sGXsfl_112_idx, httpContext.cgiGet( "ZT_"+"Z5832MmezParObs_"+sGXsfl_112_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5832MmezParObs_"+sGXsfl_112_idx) ;
         httpContext.changePostValue( "Z966PartCod_"+sGXsfl_112_idx, httpContext.cgiGet( "ZT_"+"Z966PartCod_"+sGXsfl_112_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z966PartCod_"+sGXsfl_112_idx) ;
      }
      httpContext.changePostValue( "O5818MmezUltPar", httpContext.cgiGet( "T5818MmezUltPar")) ;
      httpContext.deletePostValue( "T5818MmezUltPar") ;
      httpContext.changePostValue( "O5828MmezArtPPT", httpContext.cgiGet( "T5828MmezArtPPT")) ;
      httpContext.deletePostValue( "T5828MmezArtPPT") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tmezpar", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A5809MMezCod)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(DecimalUtil.decToString(A5819MmezArtPor)),GXutil.URLEncode(DecimalUtil.decToString(A5820MmezArtKil))}, new String[] {"EmprCod","CliCod","MMezCod","ArtCod","MmezArtPor","MmezArtKil"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TMEZPAR");
      forbiddenHiddens.add("MMezPorTot", localUtil.format( A5814MMezPorTot, "ZZ9.99"));
      forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV19Modo, "")));
      forbiddenHiddens.add("MMezKgs", localUtil.format( A5810MMezKgs, "ZZZZZ9.99"));
      forbiddenHiddens.add("MMezPda", GXutil.rtrim( localUtil.format( A5811MMezPda, "")));
      forbiddenHiddens.add("MMezFecPda", localUtil.format(A5812MMezFecPda, "99/99/99"));
      forbiddenHiddens.add("MMezFecEnt", localUtil.format(A5813MMezFecEnt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tmezpar:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT9", GXutil.rtrim( AV29Lit9));
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
      return formatLink("app.tmezpar", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A5809MMezCod)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(DecimalUtil.decToString(A5819MmezArtPor)),GXutil.URLEncode(DecimalUtil.decToString(A5820MmezArtKil))}, new String[] {"EmprCod","CliCod","MMezCod","ArtCod","MmezArtPor","MmezArtKil"})  ;
   }

   public String getPgmname( )
   {
      return "TMEZPAR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "COMPOSICION PARTIDOS MEZCLAS", "") ;
   }

   public void initializeNonKey1FS1581( )
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

   public void initAll1FS1581( )
   {
      initializeNonKey1FS1581( ) ;
   }

   public void standaloneModalInsert( )
   {
      AV19Modo = iV19Modo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Modo", AV19Modo);
   }

   public void initializeNonKey1FS1582( )
   {
      A5816MMezArtDsc = "" ;
      n5816MMezArtDsc = false ;
      A5817MmezUltCol = (byte)(0) ;
      n5817MmezUltCol = false ;
      A5818MmezUltPar = (byte)(0) ;
      n5818MmezUltPar = false ;
      O5818MmezUltPar = A5818MmezUltPar ;
      n5818MmezUltPar = false ;
      O5828MmezArtPPT = A5828MmezArtPPT ;
      n5828MmezArtPPT = false ;
      Z5816MMezArtDsc = "" ;
      Z5817MmezUltCol = (byte)(0) ;
      Z5818MmezUltPar = (byte)(0) ;
   }

   public void initAll1FS1582( )
   {
      initializeNonKey1FS1582( ) ;
   }

   public void standaloneModalInsert1FS1582( )
   {
   }

   public void initializeNonKey1FS1584( )
   {
      A5831MmezParKil = DecimalUtil.ZERO ;
      A5830MmezParPor = DecimalUtil.ZERO ;
      n5830MmezParPor = false ;
      A966PartCod = "" ;
      n966PartCod = false ;
      A5832MmezParObs = "" ;
      n5832MmezParObs = false ;
      O5830MmezParPor = A5830MmezParPor ;
      n5830MmezParPor = false ;
      Z5830MmezParPor = DecimalUtil.ZERO ;
      Z5832MmezParObs = "" ;
      Z966PartCod = "" ;
   }

   public void initAll1FS1584( )
   {
      A5829MmezLinPar = (byte)(0) ;
      initializeNonKey1FS1584( ) ;
   }

   public void standaloneModalInsert1FS1584( )
   {
      A5818MmezUltPar = i5818MmezUltPar ;
      n5818MmezUltPar = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241573722", true, true);
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
      httpContext.AddJavascriptSource("tmezpar.js", "?20268241573722", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1582( )
   {
      edtMmezUltPar_Enabled = defedtMmezUltPar_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezUltPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezUltPar_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtMMezArtDsc_Enabled = defedtMMezArtDsc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezArtDsc_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtArtCod_Enabled = defedtArtCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), !bGXsfl_70_Refreshing);
   }

   public void init_level_properties1584( )
   {
      edtMmezLinPar_Enabled = defedtMmezLinPar_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezLinPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezLinPar_Enabled), 5, 0), !bGXsfl_112_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5828MmezArtPPT, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezArtPPT_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1584, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1584_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5829MmezLinPar, (byte)(2), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezLinPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5830MmezParPor, (byte)(6), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Title", GXutil.rtrim( edtMmezParPor_Title));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezParPor_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A966PartCod));
      Grid2Column.AddObjectProperty("Title", GXutil.rtrim( edtPartCod_Title));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPartCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5831MmezParKil, (byte)(9), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Title", GXutil.rtrim( edtMmezParKil_Title));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezParKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A5832MmezParObs));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezParObs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtMmezArtPPT_Internalname = "MMEZARTPPT" ;
      edtavnRcdDeleted_1584_Internalname = "vNRCDDELETED_1584" ;
      edtMmezLinPar_Internalname = "MMEZLINPAR" ;
      edtMmezParPor_Internalname = "MMEZPARPOR" ;
      edtPartCod_Internalname = "PARTCOD" ;
      edtMmezParKil_Internalname = "MMEZPARKIL" ;
      edtMmezParObs_Internalname = "MMEZPAROBS" ;
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
      lblTextblock17_Caption = httpContext.getMessage( "Suma Porcent.Partido por Artic", "") ;
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
      Form.setCaption( httpContext.getMessage( "COMPOSICION PARTIDOS MEZCLAS", "") );
      edtMmezParObs_Jsonclick = "" ;
      edtMmezParKil_Jsonclick = "" ;
      edtPartCod_Jsonclick = "" ;
      edtMmezParPor_Jsonclick = "" ;
      edtMmezLinPar_Jsonclick = "" ;
      edtavnRcdDeleted_1584_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtMmezArtPPT_Jsonclick = "" ;
      edtMmezArtKil_Jsonclick = "" ;
      edtMmezArtPor_Jsonclick = "" ;
      edtMmezUltPar_Jsonclick = "" ;
      edtMmezUltCol_Jsonclick = "" ;
      edtMMezArtDsc_Jsonclick = "" ;
      edtArtCod_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtMmezParObs_Enabled = 1 ;
      edtMmezParKil_Enabled = 0 ;
      edtMmezParKil_Title = httpContext.getMessage( "Kilos por Partido", "") ;
      edtPartCod_Enabled = 1 ;
      edtPartCod_Title = httpContext.getMessage( "Código de Partido", "") ;
      edtMmezParPor_Enabled = 1 ;
      edtMmezParPor_Title = httpContext.getMessage( "Porcentaje Partido", "") ;
      edtMmezLinPar_Enabled = 1 ;
      edtavnRcdDeleted_1584_Enabled = 1 ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMmezArtPPT_Enabled = 0 ;
      edtMmezArtKil_Enabled = 0 ;
      edtMmezArtPor_Enabled = 0 ;
      edtMmezUltPar_Enabled = 0 ;
      edtMmezUltCol_Enabled = 1 ;
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
         standaloneNotModal1FS1582( ) ;
         standaloneModal1FS1582( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1FS1582( ) ;
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
      subsflControlProps_1121584( ) ;
      while ( nGXsfl_112_idx <= nRC_GXsfl_112 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1FS1582( ) ;
         standaloneModal1FS1582( ) ;
         standaloneNotModal1FS1584( ) ;
         standaloneModal1FS1584( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1FS1584( ) ;
         nGXsfl_112_idx = (int)(nGXsfl_112_idx+1) ;
         sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx), 4, 0), (short)(4), "0") + sGXsfl_70_idx ;
         subsflControlProps_1121584( ) ;
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
      /* Using cursor T01FS39 */
      pr_default.execute(35, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(35) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FS39_A407EmprNom[0] ;
      n407EmprNom = T01FS39_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(35);
      /* Using cursor T01FS40 */
      pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(36) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01FS40_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(36);
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

   public void valid_Partcod( )
   {
      n966PartCod = false ;
      /* Using cursor T01FS41 */
      pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(37) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPARTI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPartCod_Internalname ;
      }
      pr_default.close(37);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A5809MMezCod',fld:'MMEZCOD',pic:''},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A5819MmezArtPor',fld:'MMEZARTPOR',pic:'ZZ9.99'},{av:'A5820MmezArtKil',fld:'MMEZARTKIL',pic:'ZZZZZ9.99'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A5814MMezPorTot',fld:'MMEZPORTOT',pic:'ZZ9.99'},{av:'AV19Modo',fld:'vMODO',pic:''},{av:'A5810MMezKgs',fld:'MMEZKGS',pic:'ZZZZZ9.99'},{av:'A5811MMezPda',fld:'MMEZPDA',pic:''},{av:'A5812MMezFecPda',fld:'MMEZFECPDA',pic:''},{av:'A5813MMezFecEnt',fld:'MMEZFECENT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_MMEZCOD","{handler:'valid_Mmezcod',iparms:[{av:'A5813MMezFecEnt',fld:'MMEZFECENT',pic:''},{av:'A5812MMezFecPda',fld:'MMEZFECPDA',pic:''},{av:'A5811MMezPda',fld:'MMEZPDA',pic:''},{av:'A5814MMezPorTot',fld:'MMEZPORTOT',pic:'ZZ9.99'},{av:'A5810MMezKgs',fld:'MMEZKGS',pic:'ZZZZZ9.99'},{av:'A5820MmezArtKil',fld:'MMEZARTKIL',pic:'ZZZZZ9.99'},{av:'A5819MmezArtPor',fld:'MMEZARTPOR',pic:'ZZ9.99'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A5809MMezCod',fld:'MMEZCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV29Lit9',fld:'vLIT9',pic:''},{av:'AV33Lit13',fld:'vLIT13',pic:''},{av:'AV19Modo',fld:'vMODO',pic:''},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("VALID_MMEZCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A5810MMezKgs',fld:'MMEZKGS',pic:'ZZZZZ9.99'},{av:'A5811MMezPda',fld:'MMEZPDA',pic:''},{av:'A5812MMezFecPda',fld:'MMEZFECPDA',pic:''},{av:'A5813MMezFecEnt',fld:'MMEZFECENT',pic:''},{av:'A5814MMezPorTot',fld:'MMEZPORTOT',pic:'ZZ9.99'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A5819MmezArtPor',fld:'MMEZARTPOR',pic:'ZZ9.99'},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A5820MmezArtKil',fld:'MMEZARTKIL',pic:'ZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z5809MMezCod'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z5810MMezKgs'},{av:'Z5811MMezPda'},{av:'Z5812MMezFecPda'},{av:'Z5813MMezFecEnt'},{av:'Z5814MMezPorTot'},{av:'Z65ArtCod'},{av:'Z5819MmezArtPor'},{av:'ZV17UsurCod'},{av:'Z5820MmezArtKil'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MMEZKGS","{handler:'valid_Mmezkgs',iparms:[]");
      setEventMetadata("VALID_MMEZKGS",",oparms:[]}");
      setEventMetadata("VALID_MMEZPORTOT","{handler:'valid_Mmezportot',iparms:[]");
      setEventMetadata("VALID_MMEZPORTOT",",oparms:[]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[]");
      setEventMetadata("VALID_ARTCOD",",oparms:[]}");
      setEventMetadata("VALID_MMEZULTPAR","{handler:'valid_Mmezultpar',iparms:[]");
      setEventMetadata("VALID_MMEZULTPAR",",oparms:[]}");
      setEventMetadata("VALID_MMEZARTPOR","{handler:'valid_Mmezartpor',iparms:[]");
      setEventMetadata("VALID_MMEZARTPOR",",oparms:[]}");
      setEventMetadata("VALID_MMEZARTKIL","{handler:'valid_Mmezartkil',iparms:[]");
      setEventMetadata("VALID_MMEZARTKIL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Mmezartppt',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_MMEZLINPAR","{handler:'valid_Mmezlinpar',iparms:[]");
      setEventMetadata("VALID_MMEZLINPAR",",oparms:[]}");
      setEventMetadata("VALID_MMEZPARPOR","{handler:'valid_Mmezparpor',iparms:[]");
      setEventMetadata("VALID_MMEZPARPOR",",oparms:[]}");
      setEventMetadata("VALID_PARTCOD","{handler:'valid_Partcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A966PartCod',fld:'PARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_PARTCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Mmezparobs',iparms:[]");
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
      pr_default.close(37);
      pr_default.close(36);
      pr_default.close(35);
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
      O5828MmezArtPPT = DecimalUtil.ZERO ;
      Z5830MmezParPor = DecimalUtil.ZERO ;
      Z5832MmezParObs = "" ;
      Z966PartCod = "" ;
      O5830MmezParPor = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A966PartCod = "" ;
      A5809MMezCod = "" ;
      A65ArtCod = "" ;
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
      AV29Lit9 = "" ;
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
      s5828MmezArtPPT = DecimalUtil.ZERO ;
      A5828MmezArtPPT = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A5830MmezParPor = DecimalUtil.ZERO ;
      A5831MmezParKil = DecimalUtil.ZERO ;
      A5832MmezParObs = "" ;
      T5830MmezParPor = DecimalUtil.ZERO ;
      s5820MmezArtKil = DecimalUtil.ZERO ;
      A5816MMezArtDsc = "" ;
      T5828MmezArtPPT = DecimalUtil.ZERO ;
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
      AV30Lit10 = "" ;
      AV31Lit11 = "" ;
      AV32Lit12 = "" ;
      AV34Lit14 = "" ;
      GXt_char1 = "" ;
      AV35Lit15 = "" ;
      AV36Lit16 = "" ;
      AV18Station = "" ;
      GXv_char2 = new String[1] ;
      AV16EmprNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T01FS12_A407EmprNom = new String[] {""} ;
      T01FS12_n407EmprNom = new boolean[] {false} ;
      T01FS13_A279CliNom = new String[] {""} ;
      T01FS14_A5809MMezCod = new String[] {""} ;
      T01FS14_A407EmprNom = new String[] {""} ;
      T01FS14_n407EmprNom = new boolean[] {false} ;
      T01FS14_A279CliNom = new String[] {""} ;
      T01FS14_A5810MMezKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FS14_n5810MMezKgs = new boolean[] {false} ;
      T01FS14_A5811MMezPda = new String[] {""} ;
      T01FS14_n5811MMezPda = new boolean[] {false} ;
      T01FS14_A5812MMezFecPda = new java.util.Date[] {GXutil.nullDate()} ;
      T01FS14_n5812MMezFecPda = new boolean[] {false} ;
      T01FS14_A5813MMezFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01FS14_n5813MMezFecEnt = new boolean[] {false} ;
      T01FS14_A5814MMezPorTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FS14_n5814MMezPorTot = new boolean[] {false} ;
      T01FS14_A396EmprCod = new String[] {""} ;
      T01FS14_A252CliCod = new int[1] ;
      T01FS15_A396EmprCod = new String[] {""} ;
      T01FS15_A252CliCod = new int[1] ;
      T01FS15_A5809MMezCod = new String[] {""} ;
      T01FS11_A5809MMezCod = new String[] {""} ;
      T01FS11_A5810MMezKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FS11_n5810MMezKgs = new boolean[] {false} ;
      T01FS11_A5811MMezPda = new String[] {""} ;
      T01FS11_n5811MMezPda = new boolean[] {false} ;
      T01FS11_A5812MMezFecPda = new java.util.Date[] {GXutil.nullDate()} ;
      T01FS11_n5812MMezFecPda = new boolean[] {false} ;
      T01FS11_A5813MMezFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01FS11_n5813MMezFecEnt = new boolean[] {false} ;
      T01FS11_A5814MMezPorTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FS11_n5814MMezPorTot = new boolean[] {false} ;
      T01FS11_A396EmprCod = new String[] {""} ;
      T01FS11_A252CliCod = new int[1] ;
      T01FS16_A396EmprCod = new String[] {""} ;
      T01FS16_A252CliCod = new int[1] ;
      T01FS16_A5809MMezCod = new String[] {""} ;
      T01FS17_A396EmprCod = new String[] {""} ;
      T01FS17_A252CliCod = new int[1] ;
      T01FS17_A5809MMezCod = new String[] {""} ;
      T01FS10_A5809MMezCod = new String[] {""} ;
      T01FS10_A5810MMezKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FS10_n5810MMezKgs = new boolean[] {false} ;
      T01FS10_A5811MMezPda = new String[] {""} ;
      T01FS10_n5811MMezPda = new boolean[] {false} ;
      T01FS10_A5812MMezFecPda = new java.util.Date[] {GXutil.nullDate()} ;
      T01FS10_n5812MMezFecPda = new boolean[] {false} ;
      T01FS10_A5813MMezFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01FS10_n5813MMezFecEnt = new boolean[] {false} ;
      T01FS10_A5814MMezPorTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FS10_n5814MMezPorTot = new boolean[] {false} ;
      T01FS10_A396EmprCod = new String[] {""} ;
      T01FS10_A252CliCod = new int[1] ;
      T01FS21_A396EmprCod = new String[] {""} ;
      T01FS21_A252CliCod = new int[1] ;
      T01FS21_A5809MMezCod = new String[] {""} ;
      T01FS21_A65ArtCod = new String[] {""} ;
      T01FS22_A396EmprCod = new String[] {""} ;
      T01FS22_A252CliCod = new int[1] ;
      T01FS22_A5809MMezCod = new String[] {""} ;
      Z5819MmezArtPor = DecimalUtil.ZERO ;
      Z65ArtCod = "" ;
      Z5828MmezArtPPT = DecimalUtil.ZERO ;
      T01FS7_A396EmprCod = new String[] {""} ;
      T01FS9_A5828MmezArtPPT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FS9_n5828MmezArtPPT = new boolean[] {false} ;
      T01FS24_A5809MMezCod = new String[] {""} ;
      T01FS24_A5816MMezArtDsc = new String[] {""} ;
      T01FS24_n5816MMezArtDsc = new boolean[] {false} ;
      T01FS24_A5817MmezUltCol = new byte[1] ;
      T01FS24_n5817MmezUltCol = new boolean[] {false} ;
      T01FS24_A5818MmezUltPar = new byte[1] ;
      T01FS24_n5818MmezUltPar = new boolean[] {false} ;
      T01FS24_A5819MmezArtPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FS24_n5819MmezArtPor = new boolean[] {false} ;
      T01FS24_A396EmprCod = new String[] {""} ;
      T01FS24_A252CliCod = new int[1] ;
      T01FS24_A65ArtCod = new String[] {""} ;
      T01FS24_A5828MmezArtPPT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FS24_n5828MmezArtPPT = new boolean[] {false} ;
      T01FS25_A396EmprCod = new String[] {""} ;
      T01FS25_A252CliCod = new int[1] ;
      T01FS25_A5809MMezCod = new String[] {""} ;
      T01FS25_A65ArtCod = new String[] {""} ;
      T01FS6_A5809MMezCod = new String[] {""} ;
      T01FS6_A5816MMezArtDsc = new String[] {""} ;
      T01FS6_n5816MMezArtDsc = new boolean[] {false} ;
      T01FS6_A5817MmezUltCol = new byte[1] ;
      T01FS6_n5817MmezUltCol = new boolean[] {false} ;
      T01FS6_A5818MmezUltPar = new byte[1] ;
      T01FS6_n5818MmezUltPar = new boolean[] {false} ;
      T01FS6_A5819MmezArtPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FS6_n5819MmezArtPor = new boolean[] {false} ;
      T01FS6_A396EmprCod = new String[] {""} ;
      T01FS6_A252CliCod = new int[1] ;
      T01FS6_A65ArtCod = new String[] {""} ;
      T01FS5_A5809MMezCod = new String[] {""} ;
      T01FS5_A5816MMezArtDsc = new String[] {""} ;
      T01FS5_n5816MMezArtDsc = new boolean[] {false} ;
      T01FS5_A5817MmezUltCol = new byte[1] ;
      T01FS5_n5817MmezUltCol = new boolean[] {false} ;
      T01FS5_A5818MmezUltPar = new byte[1] ;
      T01FS5_n5818MmezUltPar = new boolean[] {false} ;
      T01FS5_A5819MmezArtPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FS5_n5819MmezArtPor = new boolean[] {false} ;
      T01FS5_A396EmprCod = new String[] {""} ;
      T01FS5_A252CliCod = new int[1] ;
      T01FS5_A65ArtCod = new String[] {""} ;
      T01FS29_A396EmprCod = new String[] {""} ;
      T01FS29_A252CliCod = new int[1] ;
      T01FS29_A5809MMezCod = new String[] {""} ;
      T01FS29_A65ArtCod = new String[] {""} ;
      T01FS29_A5822MmezLinCol = new byte[1] ;
      T01FS31_A396EmprCod = new String[] {""} ;
      T01FS31_A252CliCod = new int[1] ;
      T01FS31_A5809MMezCod = new String[] {""} ;
      T01FS31_A65ArtCod = new String[] {""} ;
      T01FS32_A5809MMezCod = new String[] {""} ;
      T01FS32_A65ArtCod = new String[] {""} ;
      T01FS32_A5829MmezLinPar = new byte[1] ;
      T01FS32_A5830MmezParPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FS32_n5830MmezParPor = new boolean[] {false} ;
      T01FS32_A5832MmezParObs = new String[] {""} ;
      T01FS32_n5832MmezParObs = new boolean[] {false} ;
      T01FS32_A396EmprCod = new String[] {""} ;
      T01FS32_A966PartCod = new String[] {""} ;
      T01FS32_n966PartCod = new boolean[] {false} ;
      T01FS32_A252CliCod = new int[1] ;
      T01FS4_A396EmprCod = new String[] {""} ;
      T01FS33_A396EmprCod = new String[] {""} ;
      T01FS34_A396EmprCod = new String[] {""} ;
      T01FS34_A252CliCod = new int[1] ;
      T01FS34_A5809MMezCod = new String[] {""} ;
      T01FS34_A65ArtCod = new String[] {""} ;
      T01FS34_A5829MmezLinPar = new byte[1] ;
      T01FS3_A5809MMezCod = new String[] {""} ;
      T01FS3_A65ArtCod = new String[] {""} ;
      T01FS3_A5829MmezLinPar = new byte[1] ;
      T01FS3_A5830MmezParPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FS3_n5830MmezParPor = new boolean[] {false} ;
      T01FS3_A5832MmezParObs = new String[] {""} ;
      T01FS3_n5832MmezParObs = new boolean[] {false} ;
      T01FS3_A396EmprCod = new String[] {""} ;
      T01FS3_A966PartCod = new String[] {""} ;
      T01FS3_n966PartCod = new boolean[] {false} ;
      T01FS3_A252CliCod = new int[1] ;
      sMode1584 = "" ;
      T01FS2_A5809MMezCod = new String[] {""} ;
      T01FS2_A65ArtCod = new String[] {""} ;
      T01FS2_A5829MmezLinPar = new byte[1] ;
      T01FS2_A5830MmezParPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FS2_n5830MmezParPor = new boolean[] {false} ;
      T01FS2_A5832MmezParObs = new String[] {""} ;
      T01FS2_n5832MmezParObs = new boolean[] {false} ;
      T01FS2_A396EmprCod = new String[] {""} ;
      T01FS2_A966PartCod = new String[] {""} ;
      T01FS2_n966PartCod = new boolean[] {false} ;
      T01FS2_A252CliCod = new int[1] ;
      T01FS38_A396EmprCod = new String[] {""} ;
      T01FS38_A252CliCod = new int[1] ;
      T01FS38_A5809MMezCod = new String[] {""} ;
      T01FS38_A65ArtCod = new String[] {""} ;
      T01FS38_A5829MmezLinPar = new byte[1] ;
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
      B5828MmezArtPPT = DecimalUtil.ZERO ;
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
      T01FS39_A407EmprNom = new String[] {""} ;
      T01FS39_n407EmprNom = new boolean[] {false} ;
      T01FS40_A279CliNom = new String[] {""} ;
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
      T01FS41_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tmezpar__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmezpar__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmezpar__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmezpar__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmezpar__default(),
         new Object[] {
             new Object[] {
            T01FS2_A5809MMezCod, T01FS2_A65ArtCod, T01FS2_A5829MmezLinPar, T01FS2_A5830MmezParPor, T01FS2_n5830MmezParPor, T01FS2_A5832MmezParObs, T01FS2_n5832MmezParObs, T01FS2_A396EmprCod, T01FS2_A966PartCod, T01FS2_n966PartCod,
            T01FS2_A252CliCod
            }
            , new Object[] {
            T01FS3_A5809MMezCod, T01FS3_A65ArtCod, T01FS3_A5829MmezLinPar, T01FS3_A5830MmezParPor, T01FS3_n5830MmezParPor, T01FS3_A5832MmezParObs, T01FS3_n5832MmezParObs, T01FS3_A396EmprCod, T01FS3_A966PartCod, T01FS3_n966PartCod,
            T01FS3_A252CliCod
            }
            , new Object[] {
            T01FS4_A396EmprCod
            }
            , new Object[] {
            T01FS5_A5809MMezCod, T01FS5_A5816MMezArtDsc, T01FS5_n5816MMezArtDsc, T01FS5_A5817MmezUltCol, T01FS5_n5817MmezUltCol, T01FS5_A5818MmezUltPar, T01FS5_n5818MmezUltPar, T01FS5_A5819MmezArtPor, T01FS5_n5819MmezArtPor, T01FS5_A396EmprCod,
            T01FS5_A252CliCod, T01FS5_A65ArtCod
            }
            , new Object[] {
            T01FS6_A5809MMezCod, T01FS6_A5816MMezArtDsc, T01FS6_n5816MMezArtDsc, T01FS6_A5817MmezUltCol, T01FS6_n5817MmezUltCol, T01FS6_A5818MmezUltPar, T01FS6_n5818MmezUltPar, T01FS6_A5819MmezArtPor, T01FS6_n5819MmezArtPor, T01FS6_A396EmprCod,
            T01FS6_A252CliCod, T01FS6_A65ArtCod
            }
            , new Object[] {
            T01FS7_A396EmprCod
            }
            , new Object[] {
            T01FS9_A5828MmezArtPPT, T01FS9_n5828MmezArtPPT
            }
            , new Object[] {
            T01FS10_A5809MMezCod, T01FS10_A5810MMezKgs, T01FS10_n5810MMezKgs, T01FS10_A5811MMezPda, T01FS10_n5811MMezPda, T01FS10_A5812MMezFecPda, T01FS10_n5812MMezFecPda, T01FS10_A5813MMezFecEnt, T01FS10_n5813MMezFecEnt, T01FS10_A5814MMezPorTot,
            T01FS10_n5814MMezPorTot, T01FS10_A396EmprCod, T01FS10_A252CliCod
            }
            , new Object[] {
            T01FS11_A5809MMezCod, T01FS11_A5810MMezKgs, T01FS11_n5810MMezKgs, T01FS11_A5811MMezPda, T01FS11_n5811MMezPda, T01FS11_A5812MMezFecPda, T01FS11_n5812MMezFecPda, T01FS11_A5813MMezFecEnt, T01FS11_n5813MMezFecEnt, T01FS11_A5814MMezPorTot,
            T01FS11_n5814MMezPorTot, T01FS11_A396EmprCod, T01FS11_A252CliCod
            }
            , new Object[] {
            T01FS12_A407EmprNom, T01FS12_n407EmprNom
            }
            , new Object[] {
            T01FS13_A279CliNom
            }
            , new Object[] {
            T01FS14_A5809MMezCod, T01FS14_A407EmprNom, T01FS14_n407EmprNom, T01FS14_A279CliNom, T01FS14_A5810MMezKgs, T01FS14_n5810MMezKgs, T01FS14_A5811MMezPda, T01FS14_n5811MMezPda, T01FS14_A5812MMezFecPda, T01FS14_n5812MMezFecPda,
            T01FS14_A5813MMezFecEnt, T01FS14_n5813MMezFecEnt, T01FS14_A5814MMezPorTot, T01FS14_n5814MMezPorTot, T01FS14_A396EmprCod, T01FS14_A252CliCod
            }
            , new Object[] {
            T01FS15_A396EmprCod, T01FS15_A252CliCod, T01FS15_A5809MMezCod
            }
            , new Object[] {
            T01FS16_A396EmprCod, T01FS16_A252CliCod, T01FS16_A5809MMezCod
            }
            , new Object[] {
            T01FS17_A396EmprCod, T01FS17_A252CliCod, T01FS17_A5809MMezCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FS21_A396EmprCod, T01FS21_A252CliCod, T01FS21_A5809MMezCod, T01FS21_A65ArtCod
            }
            , new Object[] {
            T01FS22_A396EmprCod, T01FS22_A252CliCod, T01FS22_A5809MMezCod
            }
            , new Object[] {
            T01FS24_A5809MMezCod, T01FS24_A5816MMezArtDsc, T01FS24_n5816MMezArtDsc, T01FS24_A5817MmezUltCol, T01FS24_n5817MmezUltCol, T01FS24_A5818MmezUltPar, T01FS24_n5818MmezUltPar, T01FS24_A5819MmezArtPor, T01FS24_n5819MmezArtPor, T01FS24_A396EmprCod,
            T01FS24_A252CliCod, T01FS24_A65ArtCod, T01FS24_A5828MmezArtPPT, T01FS24_n5828MmezArtPPT
            }
            , new Object[] {
            T01FS25_A396EmprCod, T01FS25_A252CliCod, T01FS25_A5809MMezCod, T01FS25_A65ArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FS29_A396EmprCod, T01FS29_A252CliCod, T01FS29_A5809MMezCod, T01FS29_A65ArtCod, T01FS29_A5822MmezLinCol
            }
            , new Object[] {
            }
            , new Object[] {
            T01FS31_A396EmprCod, T01FS31_A252CliCod, T01FS31_A5809MMezCod, T01FS31_A65ArtCod
            }
            , new Object[] {
            T01FS32_A5809MMezCod, T01FS32_A65ArtCod, T01FS32_A5829MmezLinPar, T01FS32_A5830MmezParPor, T01FS32_n5830MmezParPor, T01FS32_A5832MmezParObs, T01FS32_n5832MmezParObs, T01FS32_A396EmprCod, T01FS32_A966PartCod, T01FS32_n966PartCod,
            T01FS32_A252CliCod
            }
            , new Object[] {
            T01FS33_A396EmprCod
            }
            , new Object[] {
            T01FS34_A396EmprCod, T01FS34_A252CliCod, T01FS34_A5809MMezCod, T01FS34_A65ArtCod, T01FS34_A5829MmezLinPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FS38_A396EmprCod, T01FS38_A252CliCod, T01FS38_A5809MMezCod, T01FS38_A65ArtCod, T01FS38_A5829MmezLinPar
            }
            , new Object[] {
            T01FS39_A407EmprNom, T01FS39_n407EmprNom
            }
            , new Object[] {
            T01FS40_A279CliNom
            }
            , new Object[] {
            T01FS41_A396EmprCod
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
      AV80Pgmname = "TMEZPAR" ;
   }

   private byte Z5817MmezUltCol ;
   private byte Z5818MmezUltPar ;
   private byte O5818MmezUltPar ;
   private byte Z5829MmezLinPar ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A5818MmezUltPar ;
   private byte Gx_BScreen ;
   private byte s5818MmezUltPar ;
   private byte A5829MmezLinPar ;
   private byte A5817MmezUltCol ;
   private byte T5818MmezUltPar ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte B5818MmezUltPar ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i5818MmezUltPar ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private short nRcdDeleted_1582 ;
   private short nRcdExists_1582 ;
   private short nIsMod_1582 ;
   private short nRcdDeleted_1584 ;
   private short nRcdExists_1584 ;
   private short nIsMod_1584 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1582 ;
   private short RcdFound1582 ;
   private short nBlankRcdUsr1582 ;
   private short RcdFound1584 ;
   private short RcdFound1581 ;
   private short nIsDirty_1581 ;
   private short nIsDirty_1582 ;
   private short nIsDirty_1584 ;
   private short nBlankRcdCount1584 ;
   private short nBlankRcdUsr1584 ;
   private short subGrid1_Borderwidth ;
   private int wcpOA252CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_70 ;
   private int nGXsfl_70_idx=1 ;
   private int nRC_GXsfl_112 ;
   private int nGXsfl_112_idx=1 ;
   private int A252CliCod ;
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
   private int edtMmezArtPPT_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int edtavnRcdDeleted_1584_Enabled ;
   private int edtMmezLinPar_Enabled ;
   private int edtMmezParPor_Enabled ;
   private int edtPartCod_Enabled ;
   private int edtMmezParKil_Enabled ;
   private int edtMmezParObs_Enabled ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtMmezLinPar_Enabled ;
   private int defedtMmezUltPar_Enabled ;
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
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private java.math.BigDecimal wcpOA5819MmezArtPor ;
   private java.math.BigDecimal wcpOA5820MmezArtKil ;
   private java.math.BigDecimal Z5810MMezKgs ;
   private java.math.BigDecimal Z5814MMezPorTot ;
   private java.math.BigDecimal O5828MmezArtPPT ;
   private java.math.BigDecimal Z5830MmezParPor ;
   private java.math.BigDecimal O5830MmezParPor ;
   private java.math.BigDecimal A5819MmezArtPor ;
   private java.math.BigDecimal A5820MmezArtKil ;
   private java.math.BigDecimal A5810MMezKgs ;
   private java.math.BigDecimal A5814MMezPorTot ;
   private java.math.BigDecimal s5828MmezArtPPT ;
   private java.math.BigDecimal A5828MmezArtPPT ;
   private java.math.BigDecimal A5830MmezParPor ;
   private java.math.BigDecimal A5831MmezParKil ;
   private java.math.BigDecimal T5830MmezParPor ;
   private java.math.BigDecimal s5820MmezArtKil ;
   private java.math.BigDecimal O5820MmezArtKil ;
   private java.math.BigDecimal T5828MmezArtPPT ;
   private java.math.BigDecimal Z5819MmezArtPor ;
   private java.math.BigDecimal Z5828MmezArtPPT ;
   private java.math.BigDecimal B5828MmezArtPPT ;
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
   private String Z5832MmezParObs ;
   private String Z966PartCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A966PartCod ;
   private String A5809MMezCod ;
   private String A65ArtCod ;
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
   private String edtMmezArtPPT_Internalname ;
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
   private String AV29Lit9 ;
   private String AV33Lit13 ;
   private String AV80Pgmname ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String edtavnRcdDeleted_1584_Internalname ;
   private String sMode1581 ;
   private String GXCCtl ;
   private String edtMmezLinPar_Internalname ;
   private String edtMmezParPor_Internalname ;
   private String edtPartCod_Internalname ;
   private String edtMmezParKil_Internalname ;
   private String edtMmezParObs_Internalname ;
   private String A5832MmezParObs ;
   private String edtMmezParPor_Title ;
   private String edtPartCod_Title ;
   private String edtMmezParKil_Title ;
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
   private String AV30Lit10 ;
   private String AV31Lit11 ;
   private String AV32Lit12 ;
   private String AV34Lit14 ;
   private String GXt_char1 ;
   private String AV35Lit15 ;
   private String AV36Lit16 ;
   private String AV18Station ;
   private String GXv_char2[] ;
   private String AV16EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z65ArtCod ;
   private String sMode1584 ;
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
   private String edtMmezArtPPT_Jsonclick ;
   private String sGXsfl_112_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_1584_Jsonclick ;
   private String edtMmezLinPar_Jsonclick ;
   private String edtMmezParPor_Jsonclick ;
   private String edtPartCod_Jsonclick ;
   private String edtMmezParKil_Jsonclick ;
   private String edtMmezParObs_Jsonclick ;
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
   private java.util.Date Z5812MMezFecPda ;
   private java.util.Date Z5813MMezFecEnt ;
   private java.util.Date A5812MMezFecPda ;
   private java.util.Date A5813MMezFecEnt ;
   private java.util.Date ZZ5812MMezFecPda ;
   private java.util.Date ZZ5813MMezFecEnt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n966PartCod ;
   private boolean n5819MmezArtPor ;
   private boolean wbErr ;
   private boolean n5810MMezKgs ;
   private boolean n5814MMezPorTot ;
   private boolean n5818MmezUltPar ;
   private boolean bGXsfl_70_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n5811MMezPda ;
   private boolean n5812MMezFecPda ;
   private boolean n5813MMezFecEnt ;
   private boolean bGXsfl_112_Refreshing=false ;
   private boolean n5828MmezArtPPT ;
   private boolean returnInSub ;
   private boolean n5816MMezArtDsc ;
   private boolean n5817MmezUltCol ;
   private boolean n5830MmezParPor ;
   private boolean n5832MmezParObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01FS12_A407EmprNom ;
   private boolean[] T01FS12_n407EmprNom ;
   private String[] T01FS13_A279CliNom ;
   private String[] T01FS14_A5809MMezCod ;
   private String[] T01FS14_A407EmprNom ;
   private boolean[] T01FS14_n407EmprNom ;
   private String[] T01FS14_A279CliNom ;
   private java.math.BigDecimal[] T01FS14_A5810MMezKgs ;
   private boolean[] T01FS14_n5810MMezKgs ;
   private String[] T01FS14_A5811MMezPda ;
   private boolean[] T01FS14_n5811MMezPda ;
   private java.util.Date[] T01FS14_A5812MMezFecPda ;
   private boolean[] T01FS14_n5812MMezFecPda ;
   private java.util.Date[] T01FS14_A5813MMezFecEnt ;
   private boolean[] T01FS14_n5813MMezFecEnt ;
   private java.math.BigDecimal[] T01FS14_A5814MMezPorTot ;
   private boolean[] T01FS14_n5814MMezPorTot ;
   private String[] T01FS14_A396EmprCod ;
   private int[] T01FS14_A252CliCod ;
   private String[] T01FS15_A396EmprCod ;
   private int[] T01FS15_A252CliCod ;
   private String[] T01FS15_A5809MMezCod ;
   private String[] T01FS11_A5809MMezCod ;
   private java.math.BigDecimal[] T01FS11_A5810MMezKgs ;
   private boolean[] T01FS11_n5810MMezKgs ;
   private String[] T01FS11_A5811MMezPda ;
   private boolean[] T01FS11_n5811MMezPda ;
   private java.util.Date[] T01FS11_A5812MMezFecPda ;
   private boolean[] T01FS11_n5812MMezFecPda ;
   private java.util.Date[] T01FS11_A5813MMezFecEnt ;
   private boolean[] T01FS11_n5813MMezFecEnt ;
   private java.math.BigDecimal[] T01FS11_A5814MMezPorTot ;
   private boolean[] T01FS11_n5814MMezPorTot ;
   private String[] T01FS11_A396EmprCod ;
   private int[] T01FS11_A252CliCod ;
   private String[] T01FS16_A396EmprCod ;
   private int[] T01FS16_A252CliCod ;
   private String[] T01FS16_A5809MMezCod ;
   private String[] T01FS17_A396EmprCod ;
   private int[] T01FS17_A252CliCod ;
   private String[] T01FS17_A5809MMezCod ;
   private String[] T01FS10_A5809MMezCod ;
   private java.math.BigDecimal[] T01FS10_A5810MMezKgs ;
   private boolean[] T01FS10_n5810MMezKgs ;
   private String[] T01FS10_A5811MMezPda ;
   private boolean[] T01FS10_n5811MMezPda ;
   private java.util.Date[] T01FS10_A5812MMezFecPda ;
   private boolean[] T01FS10_n5812MMezFecPda ;
   private java.util.Date[] T01FS10_A5813MMezFecEnt ;
   private boolean[] T01FS10_n5813MMezFecEnt ;
   private java.math.BigDecimal[] T01FS10_A5814MMezPorTot ;
   private boolean[] T01FS10_n5814MMezPorTot ;
   private String[] T01FS10_A396EmprCod ;
   private int[] T01FS10_A252CliCod ;
   private String[] T01FS21_A396EmprCod ;
   private int[] T01FS21_A252CliCod ;
   private String[] T01FS21_A5809MMezCod ;
   private String[] T01FS21_A65ArtCod ;
   private String[] T01FS22_A396EmprCod ;
   private int[] T01FS22_A252CliCod ;
   private String[] T01FS22_A5809MMezCod ;
   private String[] T01FS7_A396EmprCod ;
   private java.math.BigDecimal[] T01FS9_A5828MmezArtPPT ;
   private boolean[] T01FS9_n5828MmezArtPPT ;
   private String[] T01FS24_A5809MMezCod ;
   private String[] T01FS24_A5816MMezArtDsc ;
   private boolean[] T01FS24_n5816MMezArtDsc ;
   private byte[] T01FS24_A5817MmezUltCol ;
   private boolean[] T01FS24_n5817MmezUltCol ;
   private byte[] T01FS24_A5818MmezUltPar ;
   private boolean[] T01FS24_n5818MmezUltPar ;
   private java.math.BigDecimal[] T01FS24_A5819MmezArtPor ;
   private boolean[] T01FS24_n5819MmezArtPor ;
   private String[] T01FS24_A396EmprCod ;
   private int[] T01FS24_A252CliCod ;
   private String[] T01FS24_A65ArtCod ;
   private java.math.BigDecimal[] T01FS24_A5828MmezArtPPT ;
   private boolean[] T01FS24_n5828MmezArtPPT ;
   private String[] T01FS25_A396EmprCod ;
   private int[] T01FS25_A252CliCod ;
   private String[] T01FS25_A5809MMezCod ;
   private String[] T01FS25_A65ArtCod ;
   private String[] T01FS6_A5809MMezCod ;
   private String[] T01FS6_A5816MMezArtDsc ;
   private boolean[] T01FS6_n5816MMezArtDsc ;
   private byte[] T01FS6_A5817MmezUltCol ;
   private boolean[] T01FS6_n5817MmezUltCol ;
   private byte[] T01FS6_A5818MmezUltPar ;
   private boolean[] T01FS6_n5818MmezUltPar ;
   private java.math.BigDecimal[] T01FS6_A5819MmezArtPor ;
   private boolean[] T01FS6_n5819MmezArtPor ;
   private String[] T01FS6_A396EmprCod ;
   private int[] T01FS6_A252CliCod ;
   private String[] T01FS6_A65ArtCod ;
   private String[] T01FS5_A5809MMezCod ;
   private String[] T01FS5_A5816MMezArtDsc ;
   private boolean[] T01FS5_n5816MMezArtDsc ;
   private byte[] T01FS5_A5817MmezUltCol ;
   private boolean[] T01FS5_n5817MmezUltCol ;
   private byte[] T01FS5_A5818MmezUltPar ;
   private boolean[] T01FS5_n5818MmezUltPar ;
   private java.math.BigDecimal[] T01FS5_A5819MmezArtPor ;
   private boolean[] T01FS5_n5819MmezArtPor ;
   private String[] T01FS5_A396EmprCod ;
   private int[] T01FS5_A252CliCod ;
   private String[] T01FS5_A65ArtCod ;
   private String[] T01FS29_A396EmprCod ;
   private int[] T01FS29_A252CliCod ;
   private String[] T01FS29_A5809MMezCod ;
   private String[] T01FS29_A65ArtCod ;
   private byte[] T01FS29_A5822MmezLinCol ;
   private String[] T01FS31_A396EmprCod ;
   private int[] T01FS31_A252CliCod ;
   private String[] T01FS31_A5809MMezCod ;
   private String[] T01FS31_A65ArtCod ;
   private String[] T01FS32_A5809MMezCod ;
   private String[] T01FS32_A65ArtCod ;
   private byte[] T01FS32_A5829MmezLinPar ;
   private java.math.BigDecimal[] T01FS32_A5830MmezParPor ;
   private boolean[] T01FS32_n5830MmezParPor ;
   private String[] T01FS32_A5832MmezParObs ;
   private boolean[] T01FS32_n5832MmezParObs ;
   private String[] T01FS32_A396EmprCod ;
   private String[] T01FS32_A966PartCod ;
   private boolean[] T01FS32_n966PartCod ;
   private int[] T01FS32_A252CliCod ;
   private String[] T01FS4_A396EmprCod ;
   private String[] T01FS33_A396EmprCod ;
   private String[] T01FS34_A396EmprCod ;
   private int[] T01FS34_A252CliCod ;
   private String[] T01FS34_A5809MMezCod ;
   private String[] T01FS34_A65ArtCod ;
   private byte[] T01FS34_A5829MmezLinPar ;
   private String[] T01FS3_A5809MMezCod ;
   private String[] T01FS3_A65ArtCod ;
   private byte[] T01FS3_A5829MmezLinPar ;
   private java.math.BigDecimal[] T01FS3_A5830MmezParPor ;
   private boolean[] T01FS3_n5830MmezParPor ;
   private String[] T01FS3_A5832MmezParObs ;
   private boolean[] T01FS3_n5832MmezParObs ;
   private String[] T01FS3_A396EmprCod ;
   private String[] T01FS3_A966PartCod ;
   private boolean[] T01FS3_n966PartCod ;
   private int[] T01FS3_A252CliCod ;
   private String[] T01FS2_A5809MMezCod ;
   private String[] T01FS2_A65ArtCod ;
   private byte[] T01FS2_A5829MmezLinPar ;
   private java.math.BigDecimal[] T01FS2_A5830MmezParPor ;
   private boolean[] T01FS2_n5830MmezParPor ;
   private String[] T01FS2_A5832MmezParObs ;
   private boolean[] T01FS2_n5832MmezParObs ;
   private String[] T01FS2_A396EmprCod ;
   private String[] T01FS2_A966PartCod ;
   private boolean[] T01FS2_n966PartCod ;
   private int[] T01FS2_A252CliCod ;
   private String[] T01FS38_A396EmprCod ;
   private int[] T01FS38_A252CliCod ;
   private String[] T01FS38_A5809MMezCod ;
   private String[] T01FS38_A65ArtCod ;
   private byte[] T01FS38_A5829MmezLinPar ;
   private String[] T01FS39_A407EmprNom ;
   private boolean[] T01FS39_n407EmprNom ;
   private String[] T01FS40_A279CliNom ;
   private String[] T01FS41_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmezpar__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmezpar__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmezpar__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmezpar__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmezpar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01FS2", "SELECT MMezCod, ArtCod, MmezLinPar, MmezParPor, MmezParObs, EmprCod, PartCod, CliCod FROM TXPMEZPAR WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ? AND MmezLinPar = ?  FOR UPDATE OF MmezParPor, MmezParObs, PartCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FS3", "SELECT MMezCod, ArtCod, MmezLinPar, MmezParPor, MmezParObs, EmprCod, PartCod, CliCod FROM TXPMEZPAR WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ? AND MmezLinPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FS4", "SELECT EmprCod FROM TXPCPARTI WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FS5", "SELECT MMezCod, MMezArtDsc, MmezUltCol, MmezUltPar, MmezArtPor, EmprCod, CliCod, ArtCod FROM TXPMEZCL1 WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ?  FOR UPDATE OF MMezArtDsc, MmezUltCol, MmezUltPar, MmezArtPor NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FS6", "SELECT MMezCod, MMezArtDsc, MmezUltCol, MmezUltPar, MmezArtPor, EmprCod, CliCod, ArtCod FROM TXPMEZCL1 WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FS7", "SELECT EmprCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FS9", "SELECT COALESCE( T1.MmezArtPPT, 0) AS MmezArtPPT FROM (SELECT SUM(MmezParPor) AS MmezArtPPT, EmprCod, CliCod, MMezCod, ArtCod FROM TXPMEZPAR GROUP BY EmprCod, CliCod, MMezCod, ArtCod ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.MMezCod = ? AND T1.ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FS10", "SELECT MMezCod, MMezKgs, MMezPda, MMezFecPda, MMezFecEnt, MMezPorTot, EmprCod, CliCod FROM TXPMEZCLI WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ?  FOR UPDATE OF MMezKgs, MMezPda, MMezFecPda, MMezFecEnt, MMezPorTot NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FS11", "SELECT MMezCod, MMezKgs, MMezPda, MMezFecPda, MMezFecEnt, MMezPorTot, EmprCod, CliCod FROM TXPMEZCLI WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FS12", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FS13", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FS14", "SELECT /*+ FIRST_ROWS(1) */ TM1.MMezCod, T2.EmprNom, T3.CliNom, TM1.MMezKgs, TM1.MMezPda, TM1.MMezFecPda, TM1.MMezFecEnt, TM1.MMezPorTot, TM1.EmprCod, TM1.CliCod FROM ((TXPMEZCLI TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.MMezCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.MMezCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FS15", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, MMezCod FROM TXPMEZCLI WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FS16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, MMezCod FROM TXPMEZCLI WHERE EmprCod = ? and CliCod = ? and MMezCod = ? ORDER BY EmprCod, CliCod, MMezCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FS17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, MMezCod FROM TXPMEZCLI WHERE EmprCod = ? and CliCod = ? and MMezCod = ? ORDER BY EmprCod DESC, CliCod DESC, MMezCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01FS18", "INSERT INTO TXPMEZCLI(MMezCod, MMezKgs, MMezPda, MMezFecPda, MMezFecEnt, MMezPorTot, EmprCod, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMEZCLI")
         ,new UpdateCursor("T01FS19", "UPDATE TXPMEZCLI SET MMezKgs=?, MMezPda=?, MMezFecPda=?, MMezFecEnt=?, MMezPorTot=?  WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ?", GX_NOMASK, "TXPMEZCLI")
         ,new UpdateCursor("T01FS20", "DELETE FROM TXPMEZCLI  WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ?", GX_NOMASK, "TXPMEZCLI")
         ,new ForEachCursor("T01FS21", "SELECT * FROM (SELECT EmprCod, CliCod, MMezCod, ArtCod FROM TXPMEZCL1 WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FS22", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, MMezCod FROM TXPMEZCLI WHERE EmprCod = ? and CliCod = ? and MMezCod = ? ORDER BY EmprCod, CliCod, MMezCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FS24", "SELECT T1.MMezCod, T1.MMezArtDsc, T1.MmezUltCol, T1.MmezUltPar, T1.MmezArtPor, T1.EmprCod, T1.CliCod, T1.ArtCod, COALESCE( T2.MmezArtPPT, 0) AS MmezArtPPT FROM (TXPMEZCL1 T1 LEFT JOIN (SELECT SUM(MmezParPor) AS MmezArtPPT, EmprCod, CliCod, MMezCod, ArtCod FROM TXPMEZPAR GROUP BY EmprCod, CliCod, MMezCod, ArtCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.MMezCod = T1.MMezCod AND T2.ArtCod = T1.ArtCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.MMezCod = ? and T1.ArtCod = ? and T1.MmezArtPor = ? ORDER BY T1.EmprCod, T1.CliCod, T1.MMezCod, T1.ArtCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FS25", "SELECT EmprCod, CliCod, MMezCod, ArtCod FROM TXPMEZCL1 WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01FS26", "INSERT INTO TXPMEZCL1(MMezCod, MMezArtDsc, MmezUltCol, MmezUltPar, MmezArtPor, EmprCod, CliCod, ArtCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMEZCL1")
         ,new UpdateCursor("T01FS27", "UPDATE TXPMEZCL1 SET MMezArtDsc=?, MmezUltCol=?, MmezUltPar=?, MmezArtPor=?  WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ?", GX_NOMASK, "TXPMEZCL1")
         ,new UpdateCursor("T01FS28", "DELETE FROM TXPMEZCL1  WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ?", GX_NOMASK, "TXPMEZCL1")
         ,new ForEachCursor("T01FS29", "SELECT * FROM (SELECT EmprCod, CliCod, MMezCod, ArtCod, MmezLinCol FROM TXPMEZCOL WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01FS30", "UPDATE TXPMEZCL1 SET MmezUltPar=?  WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ?", GX_NOMASK, "TXPMEZCL1")
         ,new ForEachCursor("T01FS31", "SELECT EmprCod, CliCod, MMezCod, ArtCod FROM TXPMEZCL1 WHERE EmprCod = ? and CliCod = ? and MMezCod = ? and ArtCod = ? and MmezArtPor = ? ORDER BY EmprCod, CliCod, MMezCod, ArtCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FS32", "SELECT MMezCod, ArtCod, MmezLinPar, MmezParPor, MmezParObs, EmprCod, PartCod, CliCod FROM TXPMEZPAR WHERE EmprCod = ? and CliCod = ? and MMezCod = ? and ArtCod = ? and MmezLinPar = ? ORDER BY EmprCod, CliCod, MMezCod, ArtCod, MmezLinPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FS33", "SELECT EmprCod FROM TXPCPARTI WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FS34", "SELECT EmprCod, CliCod, MMezCod, ArtCod, MmezLinPar FROM TXPMEZPAR WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ? AND MmezLinPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01FS35", "INSERT INTO TXPMEZPAR(MMezCod, ArtCod, MmezLinPar, MmezParPor, MmezParObs, EmprCod, PartCod, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMEZPAR")
         ,new UpdateCursor("T01FS36", "UPDATE TXPMEZPAR SET MmezParPor=?, MmezParObs=?, PartCod=?  WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ? AND MmezLinPar = ?", GX_NOMASK, "TXPMEZPAR")
         ,new UpdateCursor("T01FS37", "DELETE FROM TXPMEZPAR  WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ? AND MmezLinPar = ?", GX_NOMASK, "TXPMEZPAR")
         ,new ForEachCursor("T01FS38", "SELECT EmprCod, CliCod, MMezCod, ArtCod, MmezLinPar FROM TXPMEZPAR WHERE EmprCod = ? and CliCod = ? and MMezCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, MMezCod, ArtCod, MmezLinPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FS39", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FS40", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FS41", "SELECT EmprCod FROM TXPCPARTI WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 11 :
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
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
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
               return;
            case 20 :
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
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 37 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
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
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 15 :
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
            case 16 :
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
               return;
            case 20 :
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
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 22 :
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
            case 23 :
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
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 26 :
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
            case 27 :
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
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 30);
               }
               stmt.setString(6, (String)parms[7], 3);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 16);
               }
               stmt.setInt(8, ((Number) parms[10]).intValue());
               return;
            case 32 :
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
                  stmt.setString(2, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 16);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setString(6, (String)parms[8], 20);
               stmt.setString(7, (String)parms[9], 16);
               stmt.setByte(8, ((Number) parms[10]).byteValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
      }
   }

}

