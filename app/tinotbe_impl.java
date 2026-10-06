package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tinotbe_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action21") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8867Be_TipDfC = (short)(GXutil.lval( httpContext.GetPar( "Be_TipDfC"))) ;
         n8867Be_TipDfC = false ;
         AV41Tipdefdsc = httpContext.GetPar( "Tipdefdsc") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41Tipdefdsc", AV41Tipdefdsc);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_21_12R1195( A396EmprCod, A8867Be_TipDfC, AV41Tipdefdsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action23") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8735Be_hdr = (int)(GXutil.lval( httpContext.GetPar( "Be_hdr"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8735Be_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8735Be_hdr), 8, 0));
         A8736Be_hdrr = (byte)(GXutil.lval( httpContext.GetPar( "Be_hdrr"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8736Be_hdrr", GXutil.str( A8736Be_hdrr, 1, 0));
         A8737Be_hdrp = httpContext.GetPar( "Be_hdrp") ;
         httpContext.ajax_rsp_assign_attri("", false, "A8737Be_hdrp", A8737Be_hdrp);
         A8742Be_Dib = httpContext.GetPar( "Be_Dib") ;
         n8742Be_Dib = false ;
         A8741Be_Ped = httpContext.GetPar( "Be_Ped") ;
         n8741Be_Ped = false ;
         A8745Be_Col = httpContext.GetPar( "Be_Col") ;
         n8745Be_Col = false ;
         A8866Be_ColN = (int)(GXutil.lval( httpContext.GetPar( "Be_ColN"))) ;
         n8866Be_ColN = false ;
         A8740Be_Pza = httpContext.GetPar( "Be_Pza") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_23_12R1195( Gx_mode, A396EmprCod, A8735Be_hdr, A8736Be_hdrr, A8737Be_hdrp, A8742Be_Dib, A8741Be_Ped, A8745Be_Col, A8866Be_ColN, A8740Be_Pza) ;
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
            A8735Be_hdr = (int)(GXutil.lval( httpContext.GetPar( "Be_hdr"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8735Be_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8735Be_hdr), 8, 0));
            A8736Be_hdrr = (byte)(GXutil.lval( httpContext.GetPar( "Be_hdrr"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8736Be_hdrr", GXutil.str( A8736Be_hdrr, 1, 0));
            A8737Be_hdrp = httpContext.GetPar( "Be_hdrp") ;
            httpContext.ajax_rsp_assign_attri("", false, "A8737Be_hdrp", A8737Be_hdrp);
            AV33Barordlin = (short)(GXutil.lval( httpContext.GetPar( "Barordlin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33Barordlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Barordlin), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33Barordlin), "ZZZ9")));
            AV34Maqcod = httpContext.GetPar( "Maqcod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34Maqcod", AV34Maqcod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34Maqcod, ""))));
            AV35Maqloc = httpContext.GetPar( "Maqloc") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35Maqloc", AV35Maqloc);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQLOC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35Maqloc, ""))));
            AV36Barser = httpContext.GetPar( "Barser") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36Barser", AV36Barser);
            AV37Barserdsc = httpContext.GetPar( "Barserdsc") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37Barserdsc", AV37Barserdsc);
            AV38Barcolnom = httpContext.GetPar( "Barcolnom") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38Barcolnom", AV38Barcolnom);
            AV39Barcolnum = (int)(GXutil.lval( httpContext.GetPar( "Barcolnum"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39Barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Barcolnum), 6, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ENTRADA OT EN BODEGA ESTAMPA", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBe_FecE_Internalname ;
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

   public tinotbe_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tinotbe_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tinotbe_impl.class ));
   }

   public tinotbe_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINOTBE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINOTBE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINOTBE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINOTBE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TINOTBE.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINOTBE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINOTBE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINOTBE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINOTBE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "OT", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINOTBE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBe_hdr_Internalname, GXutil.ltrim( localUtil.ntoc( A8735Be_hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBe_hdr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8735Be_hdr), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8735Be_hdr), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBe_hdr_Jsonclick, 0, "", "", "", "", "", 1, edtBe_hdr_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINOTBE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "R", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINOTBE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBe_hdrr_Internalname, GXutil.ltrim( localUtil.ntoc( A8736Be_hdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBe_hdrr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8736Be_hdrr), "9") : localUtil.format( DecimalUtil.doubleToDec(A8736Be_hdrr), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBe_hdrr_Jsonclick, 0, "", "", "", "", "", 1, edtBe_hdrr_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINOTBE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "P", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINOTBE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBe_hdrp_Internalname, GXutil.rtrim( A8737Be_hdrp), GXutil.rtrim( localUtil.format( A8737Be_hdrp, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBe_hdrp_Jsonclick, 0, "", "", "", "", "", 1, edtBe_hdrp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINOTBE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINOTBE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINOTBE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBe_FecE_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBe_FecE_Internalname, localUtil.ttoc( A8738Be_FecE, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A8738Be_FecE, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBe_FecE_Jsonclick, 0, "", "", "", "", "", 1, edtBe_FecE_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINOTBE.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBe_FecE_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBe_FecE_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TINOTBE.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Usuario", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINOTBE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBe_Usu_Internalname, GXutil.rtrim( A8739Be_Usu), GXutil.rtrim( localUtil.format( A8739Be_Usu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBe_Usu_Jsonclick, 0, "", "", "", "", "", 1, edtBe_Usu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINOTBE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINOTBE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBe_Sta_Internalname, GXutil.ltrim( localUtil.ntoc( A8748Be_Sta, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBe_Sta_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8748Be_Sta), "9") : localUtil.format( DecimalUtil.doubleToDec(A8748Be_Sta), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBe_Sta_Jsonclick, 0, "", "", "", "", "", 1, edtBe_Sta_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINOTBE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Kgs Totales", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINOTBE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBe_KgsT_Internalname, GXutil.ltrim( localUtil.ntoc( A8749Be_KgsT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBe_KgsT_Enabled!=0) ? localUtil.format( A8749Be_KgsT, "ZZZZZ9.99") : localUtil.format( A8749Be_KgsT, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBe_KgsT_Jsonclick, 0, "", "", "", "", "", 1, edtBe_KgsT_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINOTBE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Mts Totales", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINOTBE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBe_MtsT_Internalname, GXutil.ltrim( localUtil.ntoc( A8750Be_MtsT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBe_MtsT_Enabled!=0) ? localUtil.format( A8750Be_MtsT, "ZZZZZ9.99") : localUtil.format( A8750Be_MtsT, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBe_MtsT_Jsonclick, 0, "", "", "", "", "", 1, edtBe_MtsT_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINOTBE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Total Piezas", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINOTBE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBe_PzsT_Internalname, GXutil.ltrim( localUtil.ntoc( A8751Be_PzsT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBe_PzsT_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8751Be_PzsT), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8751Be_PzsT), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBe_PzsT_Jsonclick, 0, "", "", "", "", "", 1, edtBe_PzsT_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINOTBE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Programacion o Stock", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINOTBE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBe_PoS_Internalname, GXutil.rtrim( A9591Be_PoS), GXutil.rtrim( localUtil.format( A9591Be_PoS, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBe_PoS_Jsonclick, 0, "", "", "", "", "", 1, edtBe_PoS_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINOTBE.htm");
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
         nBlankRcdCount1195 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1195 = (short)(1) ;
            scanStart12R1195( ) ;
            while ( RcdFound1195 != 0 )
            {
               init_level_properties1195( ) ;
               getByPrimaryKey12R1195( ) ;
               addRow12R1195( ) ;
               scanNext12R1195( ) ;
            }
            scanEnd12R1195( ) ;
            nBlankRcdCount1195 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B8750Be_MtsT = A8750Be_MtsT ;
         httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
         B8749Be_KgsT = A8749Be_KgsT ;
         httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
         B8751Be_PzsT = A8751Be_PzsT ;
         httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
         standaloneNotModal12R1195( ) ;
         standaloneModal12R1195( ) ;
         sMode1195 = Gx_mode ;
         while ( nGXsfl_80_idx < nRC_GXsfl_80 )
         {
            bGXsfl_80_Refreshing = true ;
            readRow12R1195( ) ;
            edtavnRcdDeleted_1195_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1195_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1195_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1195_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtBe_Pza_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BE_PZA_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBe_Pza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Pza_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtBe_Ped_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BE_PED_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBe_Ped_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Ped_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtBe_Dib_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BE_DIB_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBe_Dib_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Dib_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtBe_Kgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BE_KGS_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBe_Kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Kgs_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtBe_Mts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BE_MTS_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBe_Mts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Mts_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtBe_Col_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BE_COL_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBe_Col_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Col_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtBe_Ubi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BE_UBI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBe_Ubi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Ubi_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtBe_Rack_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BE_RACK_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBe_Rack_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Rack_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtBe_ColN_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BE_COLN_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBe_ColN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_ColN_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtBe_TipDfC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BE_TIPDFC_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBe_TipDfC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_TipDfC_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            if ( ( nRcdExists_1195 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal12R1195( ) ;
            }
            sendRow12R1195( ) ;
            bGXsfl_80_Refreshing = false ;
         }
         Gx_mode = sMode1195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A8750Be_MtsT = B8750Be_MtsT ;
         httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
         A8749Be_KgsT = B8749Be_KgsT ;
         httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
         A8751Be_PzsT = B8751Be_PzsT ;
         httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1195 = (short)(5) ;
         nRcdExists_1195 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart12R1195( ) ;
            while ( RcdFound1195 != 0 )
            {
               sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_801195( ) ;
               init_level_properties1195( ) ;
               standaloneNotModal12R1195( ) ;
               getByPrimaryKey12R1195( ) ;
               standaloneModal12R1195( ) ;
               addRow12R1195( ) ;
               scanNext12R1195( ) ;
            }
            scanEnd12R1195( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1195 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_801195( ) ;
      initAll12R1195( ) ;
      init_level_properties1195( ) ;
      B8750Be_MtsT = A8750Be_MtsT ;
      httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
      B8749Be_KgsT = A8749Be_KgsT ;
      httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
      B8751Be_PzsT = A8751Be_PzsT ;
      httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
      nRcdExists_1195 = (short)(0) ;
      nIsMod_1195 = (short)(0) ;
      nRcdDeleted_1195 = (short)(0) ;
      nBlankRcdCount1195 = (short)(nBlankRcdUsr1195+nBlankRcdCount1195) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1195 > 0 )
      {
         standaloneNotModal12R1195( ) ;
         standaloneModal12R1195( ) ;
         addRow12R1195( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtBe_Pza_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1195 = (short)(nBlankRcdCount1195-1) ;
      }
      Gx_mode = sMode1195 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A8750Be_MtsT = B8750Be_MtsT ;
      httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
      A8749Be_KgsT = B8749Be_KgsT ;
      httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
      A8751Be_PzsT = B8751Be_PzsT ;
      httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINOTBE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINOTBE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINOTBE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINOTBE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TINOTBE.htm");
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
      e1112R2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z8735Be_hdr = (int)(localUtil.ctol( httpContext.cgiGet( "Z8735Be_hdr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8736Be_hdrr = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8736Be_hdrr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8737Be_hdrp = httpContext.cgiGet( "Z8737Be_hdrp") ;
            Z8738Be_FecE = localUtil.ctot( httpContext.cgiGet( "Z8738Be_FecE"), 0) ;
            Z8739Be_Usu = httpContext.cgiGet( "Z8739Be_Usu") ;
            Z8748Be_Sta = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8748Be_Sta"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9591Be_PoS = httpContext.cgiGet( "Z9591Be_PoS") ;
            O8750Be_MtsT = localUtil.ctond( httpContext.cgiGet( "O8750Be_MtsT")) ;
            O8749Be_KgsT = localUtil.ctond( httpContext.cgiGet( "O8749Be_KgsT")) ;
            O8751Be_PzsT = (int)(localUtil.ctol( httpContext.cgiGet( "O8751Be_PzsT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_80 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_80"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV40Textoi = httpContext.cgiGet( "vTEXTOI") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV43Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV41Tipdefdsc = httpContext.cgiGet( "vTIPDEFDSC") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A8735Be_hdr = (int)(localUtil.ctol( httpContext.cgiGet( edtBe_hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8735Be_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8735Be_hdr), 8, 0));
            A8736Be_hdrr = (byte)(localUtil.ctol( httpContext.cgiGet( edtBe_hdrr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8736Be_hdrr", GXutil.str( A8736Be_hdrr, 1, 0));
            A8737Be_hdrp = httpContext.cgiGet( edtBe_hdrp_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8737Be_hdrp", A8737Be_hdrp);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtBe_FecE_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "BE_FECE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBe_FecE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8738Be_FecE = GXutil.resetTime( GXutil.nullDate() );
               n8738Be_FecE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8738Be_FecE", localUtil.ttoc( A8738Be_FecE, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A8738Be_FecE = localUtil.ctot( httpContext.cgiGet( edtBe_FecE_Internalname)) ;
               n8738Be_FecE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8738Be_FecE", localUtil.ttoc( A8738Be_FecE, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            A8739Be_Usu = httpContext.cgiGet( edtBe_Usu_Internalname) ;
            n8739Be_Usu = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8739Be_Usu", A8739Be_Usu);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBe_Sta_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBe_Sta_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BE_STA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBe_Sta_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8748Be_Sta = (byte)(0) ;
               n8748Be_Sta = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8748Be_Sta", GXutil.str( A8748Be_Sta, 1, 0));
            }
            else
            {
               A8748Be_Sta = (byte)(localUtil.ctol( httpContext.cgiGet( edtBe_Sta_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n8748Be_Sta = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8748Be_Sta", GXutil.str( A8748Be_Sta, 1, 0));
            }
            A8749Be_KgsT = localUtil.ctond( httpContext.cgiGet( edtBe_KgsT_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
            A8750Be_MtsT = localUtil.ctond( httpContext.cgiGet( edtBe_MtsT_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
            A8751Be_PzsT = (int)(localUtil.ctol( httpContext.cgiGet( edtBe_PzsT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
            A9591Be_PoS = httpContext.cgiGet( edtBe_PoS_Internalname) ;
            n9591Be_PoS = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9591Be_PoS", A9591Be_PoS);
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
               A8735Be_hdr = (int)(GXutil.lval( httpContext.GetPar( "Be_hdr"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8735Be_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8735Be_hdr), 8, 0));
               A8736Be_hdrr = (byte)(GXutil.lval( httpContext.GetPar( "Be_hdrr"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8736Be_hdrr", GXutil.str( A8736Be_hdrr, 1, 0));
               A8737Be_hdrp = httpContext.GetPar( "Be_hdrp") ;
               httpContext.ajax_rsp_assign_attri("", false, "A8737Be_hdrp", A8737Be_hdrp);
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
                        e1112R2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e1212R2 ();
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
         /* Execute user event: After Trn */
         e1212R2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll12R1194( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1195_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1195_Enabled), 5, 0), !bGXsfl_80_Refreshing);
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
      disableAttributes12R1194( ) ;
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

   public void confirm_12R0( )
   {
      beforeValidate12R1194( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls12R1194( ) ;
         }
         else
         {
            checkExtendedTable12R1194( ) ;
            if ( AnyError == 0 )
            {
               zm12R1194( 25) ;
               zm12R1194( 26) ;
            }
            closeExtendedTableCursors12R1194( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1194 = Gx_mode ;
         confirm_12R1195( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1194 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1194 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues12R0( ) ;
      }
   }

   public void confirm_12R1195( )
   {
      s8750Be_MtsT = O8750Be_MtsT ;
      httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
      s8749Be_KgsT = O8749Be_KgsT ;
      httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
      s8751Be_PzsT = O8751Be_PzsT ;
      httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRow12R1195( ) ;
         if ( ( nRcdExists_1195 != 0 ) || ( nIsMod_1195 != 0 ) )
         {
            getKey12R1195( ) ;
            if ( ( nRcdExists_1195 == 0 ) && ( nRcdDeleted_1195 == 0 ) )
            {
               if ( RcdFound1195 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate12R1195( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable12R1195( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors12R1195( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O8750Be_MtsT = A8750Be_MtsT ;
                     httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
                     O8749Be_KgsT = A8749Be_KgsT ;
                     httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
                     O8751Be_PzsT = A8751Be_PzsT ;
                     httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
                  }
               }
               else
               {
                  GXCCtl = "BE_PZA_" + sGXsfl_80_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBe_Pza_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1195 != 0 )
               {
                  if ( nRcdDeleted_1195 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey12R1195( ) ;
                     load12R1195( ) ;
                     beforeValidate12R1195( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls12R1195( ) ;
                        O8750Be_MtsT = A8750Be_MtsT ;
                        httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
                        O8749Be_KgsT = A8749Be_KgsT ;
                        httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
                        O8751Be_PzsT = A8751Be_PzsT ;
                        httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1195 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate12R1195( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable12R1195( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors12R1195( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O8750Be_MtsT = A8750Be_MtsT ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
                           O8749Be_KgsT = A8749Be_KgsT ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
                           O8751Be_PzsT = A8751Be_PzsT ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1195 == 0 )
                  {
                     GXCCtl = "BE_PZA_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBe_Pza_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1195_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBe_Pza_Internalname, GXutil.rtrim( A8740Be_Pza)) ;
         httpContext.changePostValue( edtBe_Ped_Internalname, GXutil.rtrim( A8741Be_Ped)) ;
         httpContext.changePostValue( edtBe_Dib_Internalname, GXutil.rtrim( A8742Be_Dib)) ;
         httpContext.changePostValue( edtBe_Kgs_Internalname, GXutil.ltrim( localUtil.ntoc( A8743Be_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBe_Mts_Internalname, GXutil.ltrim( localUtil.ntoc( A8744Be_Mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBe_Col_Internalname, GXutil.rtrim( A8745Be_Col)) ;
         httpContext.changePostValue( edtBe_Ubi_Internalname, GXutil.rtrim( A8746Be_Ubi)) ;
         httpContext.changePostValue( edtBe_Rack_Internalname, GXutil.rtrim( A8747Be_Rack)) ;
         httpContext.changePostValue( edtBe_ColN_Internalname, GXutil.ltrim( localUtil.ntoc( A8866Be_ColN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBe_TipDfC_Internalname, GXutil.ltrim( localUtil.ntoc( A8867Be_TipDfC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8740Be_Pza_"+sGXsfl_80_idx, GXutil.rtrim( Z8740Be_Pza)) ;
         httpContext.changePostValue( "ZT_"+"Z8741Be_Ped_"+sGXsfl_80_idx, GXutil.rtrim( Z8741Be_Ped)) ;
         httpContext.changePostValue( "ZT_"+"Z8742Be_Dib_"+sGXsfl_80_idx, GXutil.rtrim( Z8742Be_Dib)) ;
         httpContext.changePostValue( "ZT_"+"Z8745Be_Col_"+sGXsfl_80_idx, GXutil.rtrim( Z8745Be_Col)) ;
         httpContext.changePostValue( "ZT_"+"Z8747Be_Rack_"+sGXsfl_80_idx, GXutil.rtrim( Z8747Be_Rack)) ;
         httpContext.changePostValue( "ZT_"+"Z8746Be_Ubi_"+sGXsfl_80_idx, GXutil.rtrim( Z8746Be_Ubi)) ;
         httpContext.changePostValue( "ZT_"+"Z8743Be_Kgs_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z8743Be_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8744Be_Mts_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z8744Be_Mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8866Be_ColN_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z8866Be_ColN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8867Be_TipDfC_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z8867Be_TipDfC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T8744Be_Mts_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( O8744Be_Mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T8743Be_Kgs_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( O8743Be_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1195_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1195_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1195_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1195 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1195_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1195_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BE_PZA_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Pza_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BE_PED_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Ped_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BE_DIB_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Dib_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BE_KGS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Kgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BE_MTS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Mts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BE_COL_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Col_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BE_UBI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Ubi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BE_RACK_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Rack_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BE_COLN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_ColN_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BE_TIPDFC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_TipDfC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O8750Be_MtsT = s8750Be_MtsT ;
      httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
      O8749Be_KgsT = s8749Be_KgsT ;
      httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
      O8751Be_PzsT = s8751Be_PzsT ;
      httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption12R0( )
   {
   }

   public void e1112R2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tinotbe_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV43Pgmname, (byte)(99), GXv_char2) ;
      tinotbe_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tinotbe_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Station, ""))));
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tinotbe_impl.this.A396EmprCod = GXv_char2[0] ;
      tinotbe_impl.this.AV11EmprNom = GXv_char3[0] ;
      tinotbe_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurCod, ""))));
   }

   public void e1212R2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( A8748Be_Sta == 0 )
      {
         Gx_msg = httpContext.getMessage( "Desea entrar esta OT= ", "") + GXutil.str( A8735Be_hdr, 8, 0) + "-" + GXutil.str( A8736Be_hdrr, 1, 0) + A8737Be_hdrp + GXutil.newLine( ) + httpContext.getMessage( "en BODEGA de ESTAMPACION?", "") ;
         GXutil.Confirmed = true;
         if ( GXutil.Confirmed )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int5[0] = A8735Be_hdr ;
            GXv_int6[0] = A8736Be_hdrr ;
            GXv_char3[0] = A8737Be_hdrp ;
            GXv_char2[0] = Gx_msg ;
            new app.pctrlinbd(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_char2) ;
            tinotbe_impl.this.A396EmprCod = GXv_char4[0] ;
            tinotbe_impl.this.A8735Be_hdr = GXv_int5[0] ;
            tinotbe_impl.this.A8736Be_hdrr = GXv_int6[0] ;
            tinotbe_impl.this.A8737Be_hdrp = GXv_char3[0] ;
            tinotbe_impl.this.Gx_msg = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A8735Be_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8735Be_hdr), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A8736Be_hdrr", GXutil.str( A8736Be_hdrr, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A8737Be_hdrp", A8737Be_hdrp);
            if ( GXutil.strcmp(Gx_msg, "") != 0 )
            {
               httpContext.GX_msglist.addItem(Gx_msg);
            }
            else
            {
               GXv_char4[0] = A396EmprCod ;
               GXv_int5[0] = A8735Be_hdr ;
               GXv_int6[0] = A8736Be_hdrr ;
               GXv_char3[0] = A8737Be_hdrp ;
               new app.pinotbe(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3) ;
               tinotbe_impl.this.A396EmprCod = GXv_char4[0] ;
               tinotbe_impl.this.A8735Be_hdr = GXv_int5[0] ;
               tinotbe_impl.this.A8736Be_hdrr = GXv_int6[0] ;
               tinotbe_impl.this.A8737Be_hdrp = GXv_char3[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "A8735Be_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8735Be_hdr), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "A8736Be_hdrr", GXutil.str( A8736Be_hdrr, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "A8737Be_hdrp", A8737Be_hdrp);
               GXv_char4[0] = A396EmprCod ;
               GXv_int5[0] = A8735Be_hdr ;
               GXv_int6[0] = A8736Be_hdrr ;
               GXv_char3[0] = A8737Be_hdrp ;
               GXv_int7[0] = AV33Barordlin ;
               GXv_char2[0] = AV35Maqloc ;
               GXv_char8[0] = AV34Maqcod ;
               GXv_char9[0] = AV8UsurCod ;
               GXv_char10[0] = AV12Station ;
               new app.pctrfis(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_int7, GXv_char2, GXv_char8, GXv_char9, GXv_char10) ;
               tinotbe_impl.this.A396EmprCod = GXv_char4[0] ;
               tinotbe_impl.this.A8735Be_hdr = GXv_int5[0] ;
               tinotbe_impl.this.A8736Be_hdrr = GXv_int6[0] ;
               tinotbe_impl.this.A8737Be_hdrp = GXv_char3[0] ;
               tinotbe_impl.this.AV33Barordlin = GXv_int7[0] ;
               tinotbe_impl.this.AV35Maqloc = GXv_char2[0] ;
               tinotbe_impl.this.AV34Maqcod = GXv_char8[0] ;
               tinotbe_impl.this.AV8UsurCod = GXv_char9[0] ;
               tinotbe_impl.this.AV12Station = GXv_char10[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "A8735Be_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8735Be_hdr), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "A8736Be_hdrr", GXutil.str( A8736Be_hdrr, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "A8737Be_hdrp", A8737Be_hdrp);
               httpContext.ajax_rsp_assign_attri("", false, "AV33Barordlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Barordlin), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33Barordlin), "ZZZ9")));
               httpContext.ajax_rsp_assign_attri("", false, "AV35Maqloc", AV35Maqloc);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQLOC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35Maqloc, ""))));
               httpContext.ajax_rsp_assign_attri("", false, "AV34Maqcod", AV34Maqcod);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34Maqcod, ""))));
               httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurCod, ""))));
               httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Station, ""))));
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void zm12R1194( int GX_JID )
   {
      if ( ( GX_JID == 24 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8738Be_FecE = T012R5_A8738Be_FecE[0] ;
            Z8739Be_Usu = T012R5_A8739Be_Usu[0] ;
            Z8748Be_Sta = T012R5_A8748Be_Sta[0] ;
            Z9591Be_PoS = T012R5_A9591Be_PoS[0] ;
         }
         else
         {
            Z8738Be_FecE = A8738Be_FecE ;
            Z8739Be_Usu = A8739Be_Usu ;
            Z8748Be_Sta = A8748Be_Sta ;
            Z9591Be_PoS = A9591Be_PoS ;
         }
      }
      if ( GX_JID == -24 )
      {
         Z8735Be_hdr = A8735Be_hdr ;
         Z8736Be_hdrr = A8736Be_hdrr ;
         Z8737Be_hdrp = A8737Be_hdrp ;
         Z8738Be_FecE = A8738Be_FecE ;
         Z8739Be_Usu = A8739Be_Usu ;
         Z8748Be_Sta = A8748Be_Sta ;
         Z9591Be_PoS = A9591Be_PoS ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z8749Be_KgsT = A8749Be_KgsT ;
         Z8750Be_MtsT = A8750Be_MtsT ;
         Z8751Be_PzsT = A8751Be_PzsT ;
      }
   }

   public void standaloneNotModal( )
   {
      AV43Pgmname = "TINOTBE" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Pgmname", AV43Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      /* Using cursor T012R6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T012R6_A407EmprNom[0] ;
      n407EmprNom = T012R6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T012R8 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A8735Be_hdr), Byte.valueOf(A8736Be_hdrr), A8737Be_hdrp});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A8749Be_KgsT = T012R8_A8749Be_KgsT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
         A8750Be_MtsT = T012R8_A8750Be_MtsT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
         A8751Be_PzsT = T012R8_A8751Be_PzsT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
      }
      else
      {
         A8749Be_KgsT = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
         A8750Be_MtsT = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
         A8751Be_PzsT = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
      }
      O8749Be_KgsT = A8749Be_KgsT ;
      httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
      O8750Be_MtsT = A8750Be_MtsT ;
      httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
      O8751Be_PzsT = A8751Be_PzsT ;
      httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A8738Be_FecE) && ( Gx_BScreen == 0 ) )
      {
         A8738Be_FecE = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n8738Be_FecE = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8738Be_FecE", localUtil.ttoc( A8738Be_FecE, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( isIns( )  && (GXutil.strcmp("", A8739Be_Usu)==0) && ( Gx_BScreen == 0 ) )
      {
         A8739Be_Usu = AV8UsurCod ;
         n8739Be_Usu = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8739Be_Usu", A8739Be_Usu);
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

   public void load12R1194( )
   {
      /* Using cursor T012R10 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A8735Be_hdr), Byte.valueOf(A8736Be_hdrr), A8737Be_hdrp});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1194 = (short)(1) ;
         A407EmprNom = T012R10_A407EmprNom[0] ;
         n407EmprNom = T012R10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A8738Be_FecE = T012R10_A8738Be_FecE[0] ;
         n8738Be_FecE = T012R10_n8738Be_FecE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8738Be_FecE", localUtil.ttoc( A8738Be_FecE, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A8739Be_Usu = T012R10_A8739Be_Usu[0] ;
         n8739Be_Usu = T012R10_n8739Be_Usu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8739Be_Usu", A8739Be_Usu);
         A8748Be_Sta = T012R10_A8748Be_Sta[0] ;
         n8748Be_Sta = T012R10_n8748Be_Sta[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8748Be_Sta", GXutil.str( A8748Be_Sta, 1, 0));
         A9591Be_PoS = T012R10_A9591Be_PoS[0] ;
         n9591Be_PoS = T012R10_n9591Be_PoS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9591Be_PoS", A9591Be_PoS);
         A8749Be_KgsT = T012R10_A8749Be_KgsT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
         A8750Be_MtsT = T012R10_A8750Be_MtsT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
         A8751Be_PzsT = T012R10_A8751Be_PzsT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
         zm12R1194( -24) ;
      }
      pr_default.close(6);
      onLoadActions12R1194( ) ;
   }

   public void onLoadActions12R1194( )
   {
      O8750Be_MtsT = A8750Be_MtsT ;
      httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
      O8749Be_KgsT = A8749Be_KgsT ;
      httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
      O8751Be_PzsT = A8751Be_PzsT ;
      httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
      if ( true )
      {
         AV40Textoi = "XXXXXXXXXX" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Textoi", AV40Textoi);
      }
      else
      {
         if ( GXutil.strcmp(A9591Be_PoS, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
         {
            AV40Textoi = httpContext.getMessage( httpContext.getMessage( "STOCK", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40Textoi", AV40Textoi);
         }
         else
         {
            if ( GXutil.strcmp(A9591Be_PoS, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 )
            {
               AV40Textoi = httpContext.getMessage( httpContext.getMessage( "PROGRAMACION", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV40Textoi", AV40Textoi);
            }
         }
      }
   }

   public void checkExtendedTable12R1194( )
   {
      nIsDirty_1194 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( true )
      {
         AV40Textoi = "XXXXXXXXXX" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Textoi", AV40Textoi);
      }
      else
      {
         if ( GXutil.strcmp(A9591Be_PoS, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
         {
            AV40Textoi = httpContext.getMessage( httpContext.getMessage( "STOCK", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40Textoi", AV40Textoi);
         }
         else
         {
            if ( GXutil.strcmp(A9591Be_PoS, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 )
            {
               AV40Textoi = httpContext.getMessage( httpContext.getMessage( "PROGRAMACION", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV40Textoi", AV40Textoi);
            }
         }
      }
   }

   public void closeExtendedTableCursors12R1194( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey12R1194( )
   {
      /* Using cursor T012R11 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A8735Be_hdr), Byte.valueOf(A8736Be_hdrr), A8737Be_hdrp});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1194 = (short)(1) ;
      }
      else
      {
         RcdFound1194 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T012R5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A8735Be_hdr), Byte.valueOf(A8736Be_hdrr), A8737Be_hdrp});
      if ( (pr_default.getStatus(3) != 101) && ( T012R5_A8735Be_hdr[0] == A8735Be_hdr ) && ( T012R5_A8736Be_hdrr[0] == A8736Be_hdrr ) && ( GXutil.strcmp(T012R5_A8737Be_hdrp[0], A8737Be_hdrp) == 0 ) && ( GXutil.strcmp(T012R5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm12R1194( 24) ;
         RcdFound1194 = (short)(1) ;
         A8738Be_FecE = T012R5_A8738Be_FecE[0] ;
         n8738Be_FecE = T012R5_n8738Be_FecE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8738Be_FecE", localUtil.ttoc( A8738Be_FecE, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A8739Be_Usu = T012R5_A8739Be_Usu[0] ;
         n8739Be_Usu = T012R5_n8739Be_Usu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8739Be_Usu", A8739Be_Usu);
         A8748Be_Sta = T012R5_A8748Be_Sta[0] ;
         n8748Be_Sta = T012R5_n8748Be_Sta[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8748Be_Sta", GXutil.str( A8748Be_Sta, 1, 0));
         A9591Be_PoS = T012R5_A9591Be_PoS[0] ;
         n9591Be_PoS = T012R5_n9591Be_PoS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9591Be_PoS", A9591Be_PoS);
         Z396EmprCod = A396EmprCod ;
         Z8735Be_hdr = A8735Be_hdr ;
         Z8736Be_hdrr = A8736Be_hdrr ;
         Z8737Be_hdrp = A8737Be_hdrp ;
         sMode1194 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load12R1194( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1194 = (short)(0) ;
            initializeNonKey12R1194( ) ;
         }
         Gx_mode = sMode1194 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1194 = (short)(0) ;
         initializeNonKey12R1194( ) ;
         sMode1194 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1194 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey12R1194( ) ;
      if ( RcdFound1194 == 0 )
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
      RcdFound1194 = (short)(0) ;
      /* Using cursor T012R12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A8735Be_hdr), Byte.valueOf(A8736Be_hdrr), A8737Be_hdrp});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T012R12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T012R12_A8735Be_hdr[0] == A8735Be_hdr ) && ( T012R12_A8736Be_hdrr[0] == A8736Be_hdrr ) && ( GXutil.strcmp(T012R12_A8737Be_hdrp[0], A8737Be_hdrp) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T012R12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T012R12_A8735Be_hdr[0] == A8735Be_hdr ) && ( T012R12_A8736Be_hdrr[0] == A8736Be_hdrr ) && ( GXutil.strcmp(T012R12_A8737Be_hdrp[0], A8737Be_hdrp) == 0 ) )
         {
            RcdFound1194 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1194 = (short)(0) ;
      /* Using cursor T012R13 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A8735Be_hdr), Byte.valueOf(A8736Be_hdrr), A8737Be_hdrp});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T012R13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T012R13_A8735Be_hdr[0] == A8735Be_hdr ) && ( T012R13_A8736Be_hdrr[0] == A8736Be_hdrr ) && ( GXutil.strcmp(T012R13_A8737Be_hdrp[0], A8737Be_hdrp) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T012R13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T012R13_A8735Be_hdr[0] == A8735Be_hdr ) && ( T012R13_A8736Be_hdrr[0] == A8736Be_hdrr ) && ( GXutil.strcmp(T012R13_A8737Be_hdrp[0], A8737Be_hdrp) == 0 ) )
         {
            RcdFound1194 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey12R1194( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A8750Be_MtsT = O8750Be_MtsT ;
         httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
         A8749Be_KgsT = O8749Be_KgsT ;
         httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
         A8751Be_PzsT = O8751Be_PzsT ;
         httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
         GX_FocusControl = edtBe_FecE_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert12R1194( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1194 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A8735Be_hdr != Z8735Be_hdr ) || ( A8736Be_hdrr != Z8736Be_hdrr ) || ( GXutil.strcmp(A8737Be_hdrp, Z8737Be_hdrp) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A8750Be_MtsT = O8750Be_MtsT ;
               httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
               A8749Be_KgsT = O8749Be_KgsT ;
               httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
               A8751Be_PzsT = O8751Be_PzsT ;
               httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBe_FecE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A8750Be_MtsT = O8750Be_MtsT ;
               httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
               A8749Be_KgsT = O8749Be_KgsT ;
               httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
               A8751Be_PzsT = O8751Be_PzsT ;
               httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
               update12R1194( ) ;
               GX_FocusControl = edtBe_FecE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A8735Be_hdr != Z8735Be_hdr ) || ( A8736Be_hdrr != Z8736Be_hdrr ) || ( GXutil.strcmp(A8737Be_hdrp, Z8737Be_hdrp) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A8750Be_MtsT = O8750Be_MtsT ;
               httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
               A8749Be_KgsT = O8749Be_KgsT ;
               httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
               A8751Be_PzsT = O8751Be_PzsT ;
               httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
               GX_FocusControl = edtBe_FecE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert12R1194( ) ;
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
                  A8750Be_MtsT = O8750Be_MtsT ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
                  A8749Be_KgsT = O8749Be_KgsT ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
                  A8751Be_PzsT = O8751Be_PzsT ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
                  GX_FocusControl = edtBe_FecE_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert12R1194( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A8735Be_hdr != Z8735Be_hdr ) || ( A8736Be_hdrr != Z8736Be_hdrr ) || ( GXutil.strcmp(A8737Be_hdrp, Z8737Be_hdrp) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A8750Be_MtsT = O8750Be_MtsT ;
         httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
         A8749Be_KgsT = O8749Be_KgsT ;
         httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
         A8751Be_PzsT = O8751Be_PzsT ;
         httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBe_FecE_Internalname ;
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
      getKey12R1194( ) ;
      if ( RcdFound1194 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A8735Be_hdr != Z8735Be_hdr ) || ( A8736Be_hdrr != Z8736Be_hdrr ) || ( GXutil.strcmp(A8737Be_hdrp, Z8737Be_hdrp) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A8735Be_hdr != Z8735Be_hdr ) || ( A8736Be_hdrr != Z8736Be_hdrr ) || ( GXutil.strcmp(A8737Be_hdrp, Z8737Be_hdrp) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tinotbe");
      GX_FocusControl = edtBe_FecE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_12R0( ) ;
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
      if ( RcdFound1194 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtBe_FecE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart12R1194( ) ;
      if ( RcdFound1194 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBe_FecE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd12R1194( ) ;
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
      if ( RcdFound1194 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBe_FecE_Internalname ;
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
      if ( RcdFound1194 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBe_FecE_Internalname ;
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
      scanStart12R1194( ) ;
      if ( RcdFound1194 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1194 != 0 )
         {
            scanNext12R1194( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBe_FecE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd12R1194( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency12R1194( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T012R4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A8735Be_hdr), Byte.valueOf(A8736Be_hdrr), A8737Be_hdrp});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPINOTBE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || !( GXutil.dateCompare(Z8738Be_FecE, T012R4_A8738Be_FecE[0]) ) || ( GXutil.strcmp(Z8739Be_Usu, T012R4_A8739Be_Usu[0]) != 0 ) || ( Z8748Be_Sta != T012R4_A8748Be_Sta[0] ) || ( GXutil.strcmp(Z9591Be_PoS, T012R4_A9591Be_PoS[0]) != 0 ) )
         {
            if ( !( GXutil.dateCompare(Z8738Be_FecE, T012R4_A8738Be_FecE[0]) ) )
            {
               GXutil.writeLogln("tinotbe:[seudo value changed for attri]"+"Be_FecE");
               GXutil.writeLogRaw("Old: ",Z8738Be_FecE);
               GXutil.writeLogRaw("Current: ",T012R4_A8738Be_FecE[0]);
            }
            if ( GXutil.strcmp(Z8739Be_Usu, T012R4_A8739Be_Usu[0]) != 0 )
            {
               GXutil.writeLogln("tinotbe:[seudo value changed for attri]"+"Be_Usu");
               GXutil.writeLogRaw("Old: ",Z8739Be_Usu);
               GXutil.writeLogRaw("Current: ",T012R4_A8739Be_Usu[0]);
            }
            if ( Z8748Be_Sta != T012R4_A8748Be_Sta[0] )
            {
               GXutil.writeLogln("tinotbe:[seudo value changed for attri]"+"Be_Sta");
               GXutil.writeLogRaw("Old: ",Z8748Be_Sta);
               GXutil.writeLogRaw("Current: ",T012R4_A8748Be_Sta[0]);
            }
            if ( GXutil.strcmp(Z9591Be_PoS, T012R4_A9591Be_PoS[0]) != 0 )
            {
               GXutil.writeLogln("tinotbe:[seudo value changed for attri]"+"Be_PoS");
               GXutil.writeLogRaw("Old: ",Z9591Be_PoS);
               GXutil.writeLogRaw("Current: ",T012R4_A9591Be_PoS[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPINOTBE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert12R1194( )
   {
      beforeValidate12R1194( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable12R1194( ) ;
      }
      if ( AnyError == 0 )
      {
         zm12R1194( 0) ;
         checkOptimisticConcurrency12R1194( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm12R1194( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert12R1194( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T012R14 */
                  pr_default.execute(10, new Object[] {Integer.valueOf(A8735Be_hdr), Byte.valueOf(A8736Be_hdrr), A8737Be_hdrp, Boolean.valueOf(n8738Be_FecE), A8738Be_FecE, Boolean.valueOf(n8739Be_Usu), A8739Be_Usu, Boolean.valueOf(n8748Be_Sta), Byte.valueOf(A8748Be_Sta), Boolean.valueOf(n9591Be_PoS), A9591Be_PoS, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINOTBE");
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
                        processLevel12R1194( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption12R0( ) ;
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
            load12R1194( ) ;
         }
         endLevel12R1194( ) ;
      }
      closeExtendedTableCursors12R1194( ) ;
   }

   public void update12R1194( )
   {
      beforeValidate12R1194( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable12R1194( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency12R1194( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm12R1194( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate12R1194( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T012R15 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n8738Be_FecE), A8738Be_FecE, Boolean.valueOf(n8739Be_Usu), A8739Be_Usu, Boolean.valueOf(n8748Be_Sta), Byte.valueOf(A8748Be_Sta), Boolean.valueOf(n9591Be_PoS), A9591Be_PoS, A396EmprCod, Integer.valueOf(A8735Be_hdr), Byte.valueOf(A8736Be_hdrr), A8737Be_hdrp});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINOTBE");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPINOTBE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate12R1194( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel12R1194( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption12R0( ) ;
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
         endLevel12R1194( ) ;
      }
      closeExtendedTableCursors12R1194( ) ;
   }

   public void deferredUpdate12R1194( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate12R1194( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency12R1194( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls12R1194( ) ;
         afterConfirm12R1194( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete12R1194( ) ;
            if ( AnyError == 0 )
            {
               A8750Be_MtsT = O8750Be_MtsT ;
               httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
               A8749Be_KgsT = O8749Be_KgsT ;
               httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
               A8751Be_PzsT = O8751Be_PzsT ;
               httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
               scanStart12R1195( ) ;
               while ( RcdFound1195 != 0 )
               {
                  getByPrimaryKey12R1195( ) ;
                  delete12R1195( ) ;
                  scanNext12R1195( ) ;
                  O8750Be_MtsT = A8750Be_MtsT ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
                  O8749Be_KgsT = A8749Be_KgsT ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
                  O8751Be_PzsT = A8751Be_PzsT ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
               }
               scanEnd12R1195( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T012R16 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A8735Be_hdr), Byte.valueOf(A8736Be_hdrr), A8737Be_hdrp});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINOTBE");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1194 == 0 )
                        {
                           initAll12R1194( ) ;
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
                        resetCaption12R0( ) ;
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
      sMode1194 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel12R1194( ) ;
      Gx_mode = sMode1194 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls12R1194( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( true )
         {
            AV40Textoi = "XXXXXXXXXX" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40Textoi", AV40Textoi);
         }
         else
         {
            if ( GXutil.strcmp(A9591Be_PoS, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
            {
               AV40Textoi = httpContext.getMessage( httpContext.getMessage( "STOCK", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV40Textoi", AV40Textoi);
            }
            else
            {
               if ( GXutil.strcmp(A9591Be_PoS, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 )
               {
                  AV40Textoi = httpContext.getMessage( httpContext.getMessage( "PROGRAMACION", ""), "") ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV40Textoi", AV40Textoi);
               }
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T012R17 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A8735Be_hdr), Byte.valueOf(A8736Be_hdrr), A8737Be_hdrp});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INOTBd", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void processNestedLevel12R1195( )
   {
      s8750Be_MtsT = O8750Be_MtsT ;
      httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
      s8749Be_KgsT = O8749Be_KgsT ;
      httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
      s8751Be_PzsT = O8751Be_PzsT ;
      httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRow12R1195( ) ;
         if ( ( nRcdExists_1195 != 0 ) || ( nIsMod_1195 != 0 ) )
         {
            standaloneNotModal12R1195( ) ;
            getKey12R1195( ) ;
            if ( ( nRcdExists_1195 == 0 ) && ( nRcdDeleted_1195 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert12R1195( ) ;
            }
            else
            {
               if ( RcdFound1195 != 0 )
               {
                  if ( ( nRcdDeleted_1195 != 0 ) && ( nRcdExists_1195 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete12R1195( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1195 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update12R1195( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1195 == 0 )
                  {
                     GXCCtl = "BE_PZA_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBe_Pza_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O8750Be_MtsT = A8750Be_MtsT ;
            httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
            O8749Be_KgsT = A8749Be_KgsT ;
            httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
            O8751Be_PzsT = A8751Be_PzsT ;
            httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1195_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBe_Pza_Internalname, GXutil.rtrim( A8740Be_Pza)) ;
         httpContext.changePostValue( edtBe_Ped_Internalname, GXutil.rtrim( A8741Be_Ped)) ;
         httpContext.changePostValue( edtBe_Dib_Internalname, GXutil.rtrim( A8742Be_Dib)) ;
         httpContext.changePostValue( edtBe_Kgs_Internalname, GXutil.ltrim( localUtil.ntoc( A8743Be_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBe_Mts_Internalname, GXutil.ltrim( localUtil.ntoc( A8744Be_Mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBe_Col_Internalname, GXutil.rtrim( A8745Be_Col)) ;
         httpContext.changePostValue( edtBe_Ubi_Internalname, GXutil.rtrim( A8746Be_Ubi)) ;
         httpContext.changePostValue( edtBe_Rack_Internalname, GXutil.rtrim( A8747Be_Rack)) ;
         httpContext.changePostValue( edtBe_ColN_Internalname, GXutil.ltrim( localUtil.ntoc( A8866Be_ColN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBe_TipDfC_Internalname, GXutil.ltrim( localUtil.ntoc( A8867Be_TipDfC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8740Be_Pza_"+sGXsfl_80_idx, GXutil.rtrim( Z8740Be_Pza)) ;
         httpContext.changePostValue( "ZT_"+"Z8741Be_Ped_"+sGXsfl_80_idx, GXutil.rtrim( Z8741Be_Ped)) ;
         httpContext.changePostValue( "ZT_"+"Z8742Be_Dib_"+sGXsfl_80_idx, GXutil.rtrim( Z8742Be_Dib)) ;
         httpContext.changePostValue( "ZT_"+"Z8745Be_Col_"+sGXsfl_80_idx, GXutil.rtrim( Z8745Be_Col)) ;
         httpContext.changePostValue( "ZT_"+"Z8747Be_Rack_"+sGXsfl_80_idx, GXutil.rtrim( Z8747Be_Rack)) ;
         httpContext.changePostValue( "ZT_"+"Z8746Be_Ubi_"+sGXsfl_80_idx, GXutil.rtrim( Z8746Be_Ubi)) ;
         httpContext.changePostValue( "ZT_"+"Z8743Be_Kgs_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z8743Be_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8744Be_Mts_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z8744Be_Mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8866Be_ColN_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z8866Be_ColN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8867Be_TipDfC_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z8867Be_TipDfC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T8744Be_Mts_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( O8744Be_Mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T8743Be_Kgs_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( O8743Be_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1195_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1195_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1195_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1195 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1195_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1195_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BE_PZA_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Pza_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BE_PED_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Ped_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BE_DIB_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Dib_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BE_KGS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Kgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BE_MTS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Mts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BE_COL_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Col_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BE_UBI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Ubi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BE_RACK_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Rack_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BE_COLN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_ColN_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BE_TIPDFC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_TipDfC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll12R1195( ) ;
      if ( AnyError != 0 )
      {
         O8750Be_MtsT = s8750Be_MtsT ;
         httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
         O8749Be_KgsT = s8749Be_KgsT ;
         httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
         O8751Be_PzsT = s8751Be_PzsT ;
         httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
      }
      nRcdExists_1195 = (short)(0) ;
      nIsMod_1195 = (short)(0) ;
      nRcdDeleted_1195 = (short)(0) ;
   }

   public void processLevel12R1194( )
   {
      /* Save parent mode. */
      sMode1194 = Gx_mode ;
      processNestedLevel12R1195( ) ;
      if ( AnyError != 0 )
      {
         O8750Be_MtsT = s8750Be_MtsT ;
         httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
         O8749Be_KgsT = s8749Be_KgsT ;
         httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
         O8751Be_PzsT = s8751Be_PzsT ;
         httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1194 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel12R1194( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete12R1194( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tinotbe");
         if ( AnyError == 0 )
         {
            confirmValues12R0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tinotbe");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart12R1194( )
   {
      /* Scan By routine */
      /* Using cursor T012R18 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A8735Be_hdr), Byte.valueOf(A8736Be_hdrr), A8737Be_hdrp});
      RcdFound1194 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1194 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext12R1194( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1194 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1194 = (short)(1) ;
      }
   }

   public void scanEnd12R1194( )
   {
      pr_default.close(14);
   }

   public void afterConfirm12R1194( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert12R1194( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate12R1194( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete12R1194( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete12R1194( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate12R1194( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes12R1194( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBe_hdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_hdr_Enabled), 5, 0), true);
      edtBe_hdrr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_hdrr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_hdrr_Enabled), 5, 0), true);
      edtBe_hdrp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_hdrp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_hdrp_Enabled), 5, 0), true);
      edtBe_FecE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_FecE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_FecE_Enabled), 5, 0), true);
      edtBe_Usu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_Usu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Usu_Enabled), 5, 0), true);
      edtBe_Sta_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_Sta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Sta_Enabled), 5, 0), true);
      edtBe_KgsT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_KgsT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_KgsT_Enabled), 5, 0), true);
      edtBe_MtsT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_MtsT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_MtsT_Enabled), 5, 0), true);
      edtBe_PzsT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_PzsT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_PzsT_Enabled), 5, 0), true);
      edtBe_PoS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_PoS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_PoS_Enabled), 5, 0), true);
   }

   public void zm12R1195( int GX_JID )
   {
      if ( ( GX_JID == 27 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8741Be_Ped = T012R3_A8741Be_Ped[0] ;
            Z8742Be_Dib = T012R3_A8742Be_Dib[0] ;
            Z8745Be_Col = T012R3_A8745Be_Col[0] ;
            Z8747Be_Rack = T012R3_A8747Be_Rack[0] ;
            Z8746Be_Ubi = T012R3_A8746Be_Ubi[0] ;
            Z8743Be_Kgs = T012R3_A8743Be_Kgs[0] ;
            Z8744Be_Mts = T012R3_A8744Be_Mts[0] ;
            Z8866Be_ColN = T012R3_A8866Be_ColN[0] ;
            Z8867Be_TipDfC = T012R3_A8867Be_TipDfC[0] ;
         }
         else
         {
            Z8741Be_Ped = A8741Be_Ped ;
            Z8742Be_Dib = A8742Be_Dib ;
            Z8745Be_Col = A8745Be_Col ;
            Z8747Be_Rack = A8747Be_Rack ;
            Z8746Be_Ubi = A8746Be_Ubi ;
            Z8743Be_Kgs = A8743Be_Kgs ;
            Z8744Be_Mts = A8744Be_Mts ;
            Z8866Be_ColN = A8866Be_ColN ;
            Z8867Be_TipDfC = A8867Be_TipDfC ;
         }
      }
      if ( GX_JID == -27 )
      {
         Z396EmprCod = A396EmprCod ;
         Z8735Be_hdr = A8735Be_hdr ;
         Z8736Be_hdrr = A8736Be_hdrr ;
         Z8737Be_hdrp = A8737Be_hdrp ;
         Z8740Be_Pza = A8740Be_Pza ;
         Z8741Be_Ped = A8741Be_Ped ;
         Z8742Be_Dib = A8742Be_Dib ;
         Z8745Be_Col = A8745Be_Col ;
         Z8747Be_Rack = A8747Be_Rack ;
         Z8746Be_Ubi = A8746Be_Ubi ;
         Z8743Be_Kgs = A8743Be_Kgs ;
         Z8744Be_Mts = A8744Be_Mts ;
         Z8866Be_ColN = A8866Be_ColN ;
         Z8867Be_TipDfC = A8867Be_TipDfC ;
      }
   }

   public void standaloneNotModal12R1195( )
   {
      edtBe_Ped_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_Ped_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Ped_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtBe_Dib_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_Dib_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Dib_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtBe_Col_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_Col_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Col_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtBe_Ubi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_Ubi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Ubi_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtBe_Rack_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_Rack_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Rack_Enabled), 5, 0), !bGXsfl_80_Refreshing);
   }

   public void standaloneModal12R1195( )
   {
      if ( isIns( )  && (GXutil.strcmp("", A8741Be_Ped)==0) && ( Gx_BScreen == 0 ) )
      {
         A8741Be_Ped = E8741Be_Ped ;
         n8741Be_Ped = false ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A8742Be_Dib)==0) && ( Gx_BScreen == 0 ) )
      {
         A8742Be_Dib = E8742Be_Dib ;
         n8742Be_Dib = false ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A8745Be_Col)==0) && ( Gx_BScreen == 0 ) )
      {
         A8745Be_Col = E8745Be_Col ;
         n8745Be_Col = false ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A8747Be_Rack)==0) && ( Gx_BScreen == 0 ) )
      {
         A8747Be_Rack = E8747Be_Rack ;
         n8747Be_Rack = false ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A8746Be_Ubi)==0) && ( Gx_BScreen == 0 ) )
      {
         A8746Be_Ubi = E8746Be_Ubi ;
         n8746Be_Ubi = false ;
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A8743Be_Kgs)==0) && ( Gx_BScreen == 0 ) )
      {
         A8743Be_Kgs = E8743Be_Kgs ;
         n8743Be_Kgs = false ;
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A8744Be_Mts)==0) && ( Gx_BScreen == 0 ) )
      {
         A8744Be_Mts = E8744Be_Mts ;
         n8744Be_Mts = false ;
      }
      if ( isIns( )  && (0==A8866Be_ColN) && ( Gx_BScreen == 0 ) )
      {
         A8866Be_ColN = E8866Be_ColN ;
         n8866Be_ColN = false ;
      }
      if ( isIns( )  )
      {
         A8751Be_PzsT = (int)(O8751Be_PzsT+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A8751Be_PzsT = O8751Be_PzsT ;
            httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A8751Be_PzsT = (int)(O8751Be_PzsT-1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
            }
         }
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBe_Pza_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBe_Pza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Pza_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
      else
      {
         edtBe_Pza_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBe_Pza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Pza_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
   }

   public void load12R1195( )
   {
      /* Using cursor T012R19 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A8735Be_hdr), Byte.valueOf(A8736Be_hdrr), A8737Be_hdrp, A8740Be_Pza});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1195 = (short)(1) ;
         A8741Be_Ped = T012R19_A8741Be_Ped[0] ;
         n8741Be_Ped = T012R19_n8741Be_Ped[0] ;
         A8742Be_Dib = T012R19_A8742Be_Dib[0] ;
         n8742Be_Dib = T012R19_n8742Be_Dib[0] ;
         A8745Be_Col = T012R19_A8745Be_Col[0] ;
         n8745Be_Col = T012R19_n8745Be_Col[0] ;
         A8747Be_Rack = T012R19_A8747Be_Rack[0] ;
         n8747Be_Rack = T012R19_n8747Be_Rack[0] ;
         A8746Be_Ubi = T012R19_A8746Be_Ubi[0] ;
         n8746Be_Ubi = T012R19_n8746Be_Ubi[0] ;
         A8743Be_Kgs = T012R19_A8743Be_Kgs[0] ;
         n8743Be_Kgs = T012R19_n8743Be_Kgs[0] ;
         A8744Be_Mts = T012R19_A8744Be_Mts[0] ;
         n8744Be_Mts = T012R19_n8744Be_Mts[0] ;
         A8866Be_ColN = T012R19_A8866Be_ColN[0] ;
         n8866Be_ColN = T012R19_n8866Be_ColN[0] ;
         A8867Be_TipDfC = T012R19_A8867Be_TipDfC[0] ;
         n8867Be_TipDfC = T012R19_n8867Be_TipDfC[0] ;
         zm12R1195( -27) ;
      }
      pr_default.close(15);
      onLoadActions12R1195( ) ;
   }

   public void onLoadActions12R1195( )
   {
      if ( isIns( )  )
      {
         A8749Be_KgsT = O8749Be_KgsT.add(A8743Be_Kgs) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A8749Be_KgsT = O8749Be_KgsT.add(A8743Be_Kgs).subtract(O8743Be_Kgs) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A8749Be_KgsT = O8749Be_KgsT.subtract(O8743Be_Kgs) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         A8750Be_MtsT = O8750Be_MtsT.add(A8744Be_Mts) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A8750Be_MtsT = O8750Be_MtsT.add(A8744Be_Mts).subtract(O8744Be_Mts) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A8750Be_MtsT = O8750Be_MtsT.subtract(O8744Be_Mts) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
            }
         }
      }
   }

   public void checkExtendedTable12R1195( )
   {
      nIsDirty_1195 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal12R1195( ) ;
      if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A8740Be_Pza, " ") != 0 ) )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int5[0] = A8735Be_hdr ;
         GXv_int6[0] = A8736Be_hdrr ;
         GXv_char9[0] = A8737Be_hdrp ;
         GXv_char8[0] = A8742Be_Dib ;
         GXv_char4[0] = A8741Be_Ped ;
         GXv_char3[0] = A8745Be_Col ;
         GXv_int11[0] = A8866Be_ColN ;
         new app.pmasinotbe(remoteHandle, context).execute( GXv_char10, GXv_int5, GXv_int6, GXv_char9, GXv_char8, GXv_char4, GXv_char3, GXv_int11) ;
         tinotbe_impl.this.A396EmprCod = GXv_char10[0] ;
         tinotbe_impl.this.A8735Be_hdr = GXv_int5[0] ;
         tinotbe_impl.this.A8736Be_hdrr = GXv_int6[0] ;
         tinotbe_impl.this.A8737Be_hdrp = GXv_char9[0] ;
         tinotbe_impl.this.A8742Be_Dib = GXv_char8[0] ;
         tinotbe_impl.this.A8741Be_Ped = GXv_char4[0] ;
         tinotbe_impl.this.A8745Be_Col = GXv_char3[0] ;
         tinotbe_impl.this.A8866Be_ColN = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A8735Be_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8735Be_hdr), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A8736Be_hdrr", GXutil.str( A8736Be_hdrr, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A8737Be_hdrp", A8737Be_hdrp);
      }
      if ( isIns( )  )
      {
         nIsDirty_1195 = (short)(1) ;
         A8749Be_KgsT = O8749Be_KgsT.add(A8743Be_Kgs) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1195 = (short)(1) ;
            A8749Be_KgsT = O8749Be_KgsT.add(A8743Be_Kgs).subtract(O8743Be_Kgs) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1195 = (short)(1) ;
               A8749Be_KgsT = O8749Be_KgsT.subtract(O8743Be_Kgs) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_1195 = (short)(1) ;
         A8750Be_MtsT = O8750Be_MtsT.add(A8744Be_Mts) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1195 = (short)(1) ;
            A8750Be_MtsT = O8750Be_MtsT.add(A8744Be_Mts).subtract(O8744Be_Mts) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1195 = (short)(1) ;
               A8750Be_MtsT = O8750Be_MtsT.subtract(O8744Be_Mts) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
            }
         }
      }
      if ( ( A8867Be_TipDfC > 0 ) && true /* After */ )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int7[0] = A8867Be_TipDfC ;
         GXv_char9[0] = AV41Tipdefdsc ;
         new app.pdescdef(remoteHandle, context).execute( GXv_char10, GXv_int7, GXv_char9) ;
         tinotbe_impl.this.A396EmprCod = GXv_char10[0] ;
         tinotbe_impl.this.A8867Be_TipDfC = GXv_int7[0] ;
         tinotbe_impl.this.AV41Tipdefdsc = GXv_char9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV41Tipdefdsc", AV41Tipdefdsc);
      }
      if ( ( GXutil.strcmp(AV41Tipdefdsc, httpContext.getMessage( "Error", "")) == 0 ) && ( A8867Be_TipDfC > 0 ) && true /* After */ )
      {
         GXCCtl = "BE_TIPDFC_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Tipo Defecto", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBe_TipDfC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors12R1195( )
   {
   }

   public void enableDisable12R1195( )
   {
   }

   public void getKey12R1195( )
   {
      /* Using cursor T012R20 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A8735Be_hdr), Byte.valueOf(A8736Be_hdrr), A8737Be_hdrp, A8740Be_Pza});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1195 = (short)(1) ;
      }
      else
      {
         RcdFound1195 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey12R1195( )
   {
      /* Using cursor T012R3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A8735Be_hdr), Byte.valueOf(A8736Be_hdrr), A8737Be_hdrp, A8740Be_Pza});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T012R3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T012R3_A8735Be_hdr[0] == A8735Be_hdr ) && ( T012R3_A8736Be_hdrr[0] == A8736Be_hdrr ) && ( GXutil.strcmp(T012R3_A8737Be_hdrp[0], A8737Be_hdrp) == 0 ) )
      {
         zm12R1195( 27) ;
         RcdFound1195 = (short)(1) ;
         initializeNonKey12R1195( ) ;
         A8740Be_Pza = T012R3_A8740Be_Pza[0] ;
         A8741Be_Ped = T012R3_A8741Be_Ped[0] ;
         n8741Be_Ped = T012R3_n8741Be_Ped[0] ;
         A8742Be_Dib = T012R3_A8742Be_Dib[0] ;
         n8742Be_Dib = T012R3_n8742Be_Dib[0] ;
         A8745Be_Col = T012R3_A8745Be_Col[0] ;
         n8745Be_Col = T012R3_n8745Be_Col[0] ;
         A8747Be_Rack = T012R3_A8747Be_Rack[0] ;
         n8747Be_Rack = T012R3_n8747Be_Rack[0] ;
         A8746Be_Ubi = T012R3_A8746Be_Ubi[0] ;
         n8746Be_Ubi = T012R3_n8746Be_Ubi[0] ;
         A8743Be_Kgs = T012R3_A8743Be_Kgs[0] ;
         n8743Be_Kgs = T012R3_n8743Be_Kgs[0] ;
         A8744Be_Mts = T012R3_A8744Be_Mts[0] ;
         n8744Be_Mts = T012R3_n8744Be_Mts[0] ;
         A8866Be_ColN = T012R3_A8866Be_ColN[0] ;
         n8866Be_ColN = T012R3_n8866Be_ColN[0] ;
         A8867Be_TipDfC = T012R3_A8867Be_TipDfC[0] ;
         n8867Be_TipDfC = T012R3_n8867Be_TipDfC[0] ;
         O8744Be_Mts = A8744Be_Mts ;
         n8744Be_Mts = false ;
         O8743Be_Kgs = A8743Be_Kgs ;
         n8743Be_Kgs = false ;
         Z396EmprCod = A396EmprCod ;
         Z8735Be_hdr = A8735Be_hdr ;
         Z8736Be_hdrr = A8736Be_hdrr ;
         Z8737Be_hdrp = A8737Be_hdrp ;
         Z8740Be_Pza = A8740Be_Pza ;
         sMode1195 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal12R1195( ) ;
         load12R1195( ) ;
         Gx_mode = sMode1195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1195 = (short)(0) ;
         initializeNonKey12R1195( ) ;
         sMode1195 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal12R1195( ) ;
         Gx_mode = sMode1195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes12R1195( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency12R1195( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T012R2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A8735Be_hdr), Byte.valueOf(A8736Be_hdrr), A8737Be_hdrp, A8740Be_Pza});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPINOTB1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z8741Be_Ped, T012R2_A8741Be_Ped[0]) != 0 ) || ( GXutil.strcmp(Z8742Be_Dib, T012R2_A8742Be_Dib[0]) != 0 ) || ( GXutil.strcmp(Z8745Be_Col, T012R2_A8745Be_Col[0]) != 0 ) || ( GXutil.strcmp(Z8747Be_Rack, T012R2_A8747Be_Rack[0]) != 0 ) || ( GXutil.strcmp(Z8746Be_Ubi, T012R2_A8746Be_Ubi[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z8743Be_Kgs, T012R2_A8743Be_Kgs[0]) != 0 ) || ( DecimalUtil.compareTo(Z8744Be_Mts, T012R2_A8744Be_Mts[0]) != 0 ) || ( Z8866Be_ColN != T012R2_A8866Be_ColN[0] ) || ( Z8867Be_TipDfC != T012R2_A8867Be_TipDfC[0] ) )
         {
            if ( GXutil.strcmp(Z8741Be_Ped, T012R2_A8741Be_Ped[0]) != 0 )
            {
               GXutil.writeLogln("tinotbe:[seudo value changed for attri]"+"Be_Ped");
               GXutil.writeLogRaw("Old: ",Z8741Be_Ped);
               GXutil.writeLogRaw("Current: ",T012R2_A8741Be_Ped[0]);
            }
            if ( GXutil.strcmp(Z8742Be_Dib, T012R2_A8742Be_Dib[0]) != 0 )
            {
               GXutil.writeLogln("tinotbe:[seudo value changed for attri]"+"Be_Dib");
               GXutil.writeLogRaw("Old: ",Z8742Be_Dib);
               GXutil.writeLogRaw("Current: ",T012R2_A8742Be_Dib[0]);
            }
            if ( GXutil.strcmp(Z8745Be_Col, T012R2_A8745Be_Col[0]) != 0 )
            {
               GXutil.writeLogln("tinotbe:[seudo value changed for attri]"+"Be_Col");
               GXutil.writeLogRaw("Old: ",Z8745Be_Col);
               GXutil.writeLogRaw("Current: ",T012R2_A8745Be_Col[0]);
            }
            if ( GXutil.strcmp(Z8747Be_Rack, T012R2_A8747Be_Rack[0]) != 0 )
            {
               GXutil.writeLogln("tinotbe:[seudo value changed for attri]"+"Be_Rack");
               GXutil.writeLogRaw("Old: ",Z8747Be_Rack);
               GXutil.writeLogRaw("Current: ",T012R2_A8747Be_Rack[0]);
            }
            if ( GXutil.strcmp(Z8746Be_Ubi, T012R2_A8746Be_Ubi[0]) != 0 )
            {
               GXutil.writeLogln("tinotbe:[seudo value changed for attri]"+"Be_Ubi");
               GXutil.writeLogRaw("Old: ",Z8746Be_Ubi);
               GXutil.writeLogRaw("Current: ",T012R2_A8746Be_Ubi[0]);
            }
            if ( DecimalUtil.compareTo(Z8743Be_Kgs, T012R2_A8743Be_Kgs[0]) != 0 )
            {
               GXutil.writeLogln("tinotbe:[seudo value changed for attri]"+"Be_Kgs");
               GXutil.writeLogRaw("Old: ",Z8743Be_Kgs);
               GXutil.writeLogRaw("Current: ",T012R2_A8743Be_Kgs[0]);
            }
            if ( DecimalUtil.compareTo(Z8744Be_Mts, T012R2_A8744Be_Mts[0]) != 0 )
            {
               GXutil.writeLogln("tinotbe:[seudo value changed for attri]"+"Be_Mts");
               GXutil.writeLogRaw("Old: ",Z8744Be_Mts);
               GXutil.writeLogRaw("Current: ",T012R2_A8744Be_Mts[0]);
            }
            if ( Z8866Be_ColN != T012R2_A8866Be_ColN[0] )
            {
               GXutil.writeLogln("tinotbe:[seudo value changed for attri]"+"Be_ColN");
               GXutil.writeLogRaw("Old: ",Z8866Be_ColN);
               GXutil.writeLogRaw("Current: ",T012R2_A8866Be_ColN[0]);
            }
            if ( Z8867Be_TipDfC != T012R2_A8867Be_TipDfC[0] )
            {
               GXutil.writeLogln("tinotbe:[seudo value changed for attri]"+"Be_TipDfC");
               GXutil.writeLogRaw("Old: ",Z8867Be_TipDfC);
               GXutil.writeLogRaw("Current: ",T012R2_A8867Be_TipDfC[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPINOTB1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert12R1195( )
   {
      beforeValidate12R1195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable12R1195( ) ;
      }
      if ( AnyError == 0 )
      {
         zm12R1195( 0) ;
         checkOptimisticConcurrency12R1195( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm12R1195( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert12R1195( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T012R21 */
                  pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A8735Be_hdr), Byte.valueOf(A8736Be_hdrr), A8737Be_hdrp, A8740Be_Pza, Boolean.valueOf(n8741Be_Ped), A8741Be_Ped, Boolean.valueOf(n8742Be_Dib), A8742Be_Dib, Boolean.valueOf(n8745Be_Col), A8745Be_Col, Boolean.valueOf(n8747Be_Rack), A8747Be_Rack, Boolean.valueOf(n8746Be_Ubi), A8746Be_Ubi, Boolean.valueOf(n8743Be_Kgs), A8743Be_Kgs, Boolean.valueOf(n8744Be_Mts), A8744Be_Mts, Boolean.valueOf(n8866Be_ColN), Integer.valueOf(A8866Be_ColN), Boolean.valueOf(n8867Be_TipDfC), Short.valueOf(A8867Be_TipDfC)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINOTB1");
                  if ( (pr_default.getStatus(17) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( ( A8744Be_Mts.doubleValue() == 0 ) && ( true /* After */ || true /* After */ ) )
                     {
                        GXCCtl = "BE_MTS_" + sGXsfl_80_idx ;
                        httpContext.GX_msglist.addItem(httpContext.getMessage( "Faltan Metros", ""), 1, GXCCtl);
                        AnyError = (short)(1) ;
                        GX_FocusControl = edtBe_Mts_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        E8866Be_ColN = A8866Be_ColN ;
                        n8866Be_ColN = false ;
                        E8744Be_Mts = A8744Be_Mts ;
                        n8744Be_Mts = false ;
                        E8743Be_Kgs = A8743Be_Kgs ;
                        n8743Be_Kgs = false ;
                        E8746Be_Ubi = A8746Be_Ubi ;
                        n8746Be_Ubi = false ;
                        E8747Be_Rack = A8747Be_Rack ;
                        n8747Be_Rack = false ;
                        E8745Be_Col = A8745Be_Col ;
                        n8745Be_Col = false ;
                        E8742Be_Dib = A8742Be_Dib ;
                        n8742Be_Dib = false ;
                        E8741Be_Ped = A8741Be_Ped ;
                        n8741Be_Ped = false ;
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
            load12R1195( ) ;
         }
         endLevel12R1195( ) ;
      }
      closeExtendedTableCursors12R1195( ) ;
   }

   public void update12R1195( )
   {
      beforeValidate12R1195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable12R1195( ) ;
      }
      if ( ( nIsMod_1195 != 0 ) || ( nIsDirty_1195 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency12R1195( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm12R1195( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate12R1195( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T012R22 */
                     pr_default.execute(18, new Object[] {Boolean.valueOf(n8741Be_Ped), A8741Be_Ped, Boolean.valueOf(n8742Be_Dib), A8742Be_Dib, Boolean.valueOf(n8745Be_Col), A8745Be_Col, Boolean.valueOf(n8747Be_Rack), A8747Be_Rack, Boolean.valueOf(n8746Be_Ubi), A8746Be_Ubi, Boolean.valueOf(n8743Be_Kgs), A8743Be_Kgs, Boolean.valueOf(n8744Be_Mts), A8744Be_Mts, Boolean.valueOf(n8866Be_ColN), Integer.valueOf(A8866Be_ColN), Boolean.valueOf(n8867Be_TipDfC), Short.valueOf(A8867Be_TipDfC), A396EmprCod, Integer.valueOf(A8735Be_hdr), Byte.valueOf(A8736Be_hdrr), A8737Be_hdrp, A8740Be_Pza});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINOTB1");
                     if ( (pr_default.getStatus(18) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPINOTB1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate12R1195( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( ( A8744Be_Mts.doubleValue() == 0 ) && ( true /* After */ || true /* After */ ) )
                        {
                           GXCCtl = "BE_MTS_" + sGXsfl_80_idx ;
                           httpContext.GX_msglist.addItem(httpContext.getMessage( "Faltan Metros", ""), 1, GXCCtl);
                           AnyError = (short)(1) ;
                           GX_FocusControl = edtBe_Mts_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey12R1195( ) ;
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
            endLevel12R1195( ) ;
         }
      }
      closeExtendedTableCursors12R1195( ) ;
   }

   public void deferredUpdate12R1195( )
   {
   }

   public void delete12R1195( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate12R1195( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency12R1195( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls12R1195( ) ;
         afterConfirm12R1195( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete12R1195( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T012R23 */
               pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A8735Be_hdr), Byte.valueOf(A8736Be_hdrr), A8737Be_hdrp, A8740Be_Pza});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINOTB1");
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
      sMode1195 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel12R1195( ) ;
      Gx_mode = sMode1195 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls12R1195( )
   {
      standaloneModal12R1195( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A8740Be_Pza, " ") != 0 ) )
         {
            GXv_char10[0] = A396EmprCod ;
            GXv_int11[0] = A8735Be_hdr ;
            GXv_int6[0] = A8736Be_hdrr ;
            GXv_char9[0] = A8737Be_hdrp ;
            GXv_char8[0] = A8742Be_Dib ;
            GXv_char4[0] = A8741Be_Ped ;
            GXv_char3[0] = A8745Be_Col ;
            GXv_int5[0] = A8866Be_ColN ;
            new app.pmasinotbe(remoteHandle, context).execute( GXv_char10, GXv_int11, GXv_int6, GXv_char9, GXv_char8, GXv_char4, GXv_char3, GXv_int5) ;
            tinotbe_impl.this.A396EmprCod = GXv_char10[0] ;
            tinotbe_impl.this.A8735Be_hdr = GXv_int11[0] ;
            tinotbe_impl.this.A8736Be_hdrr = GXv_int6[0] ;
            tinotbe_impl.this.A8737Be_hdrp = GXv_char9[0] ;
            tinotbe_impl.this.A8742Be_Dib = GXv_char8[0] ;
            tinotbe_impl.this.A8741Be_Ped = GXv_char4[0] ;
            tinotbe_impl.this.A8745Be_Col = GXv_char3[0] ;
            tinotbe_impl.this.A8866Be_ColN = GXv_int5[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A8735Be_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8735Be_hdr), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A8736Be_hdrr", GXutil.str( A8736Be_hdrr, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A8737Be_hdrp", A8737Be_hdrp);
         }
         if ( isIns( )  )
         {
            A8749Be_KgsT = O8749Be_KgsT.add(A8743Be_Kgs) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A8749Be_KgsT = O8749Be_KgsT.add(A8743Be_Kgs).subtract(O8743Be_Kgs) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A8749Be_KgsT = O8749Be_KgsT.subtract(O8743Be_Kgs) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            A8750Be_MtsT = O8750Be_MtsT.add(A8744Be_Mts) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A8750Be_MtsT = O8750Be_MtsT.add(A8744Be_Mts).subtract(O8744Be_Mts) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A8750Be_MtsT = O8750Be_MtsT.subtract(O8744Be_Mts) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
               }
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T012R24 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A8735Be_hdr), Byte.valueOf(A8736Be_hdrr), A8737Be_hdrp, A8740Be_Pza});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INOTBd", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
      }
   }

   public void endLevel12R1195( )
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

   public void scanStart12R1195( )
   {
      /* Scan By routine */
      /* Using cursor T012R25 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A8735Be_hdr), Byte.valueOf(A8736Be_hdrr), A8737Be_hdrp});
      RcdFound1195 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1195 = (short)(1) ;
         A8740Be_Pza = T012R25_A8740Be_Pza[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext12R1195( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound1195 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1195 = (short)(1) ;
         A8740Be_Pza = T012R25_A8740Be_Pza[0] ;
      }
   }

   public void scanEnd12R1195( )
   {
      pr_default.close(21);
   }

   public void afterConfirm12R1195( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert12R1195( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate12R1195( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete12R1195( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete12R1195( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate12R1195( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes12R1195( )
   {
      edtBe_Pza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_Pza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Pza_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtBe_Ped_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_Ped_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Ped_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtBe_Dib_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_Dib_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Dib_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtBe_Kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_Kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Kgs_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtBe_Mts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_Mts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Mts_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtBe_Col_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_Col_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Col_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtBe_Ubi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_Ubi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Ubi_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtBe_Rack_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_Rack_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Rack_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtBe_ColN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_ColN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_ColN_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtBe_TipDfC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_TipDfC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_TipDfC_Enabled), 5, 0), !bGXsfl_80_Refreshing);
   }

   public void send_integrity_lvl_hashes12R1195( )
   {
   }

   public void send_integrity_lvl_hashes12R1194( )
   {
   }

   public void subsflControlProps_801195( )
   {
      edtavnRcdDeleted_1195_Internalname = "vNRCDDELETED_1195_"+sGXsfl_80_idx ;
      edtBe_Pza_Internalname = "BE_PZA_"+sGXsfl_80_idx ;
      edtBe_Ped_Internalname = "BE_PED_"+sGXsfl_80_idx ;
      edtBe_Dib_Internalname = "BE_DIB_"+sGXsfl_80_idx ;
      edtBe_Kgs_Internalname = "BE_KGS_"+sGXsfl_80_idx ;
      edtBe_Mts_Internalname = "BE_MTS_"+sGXsfl_80_idx ;
      edtBe_Col_Internalname = "BE_COL_"+sGXsfl_80_idx ;
      edtBe_Ubi_Internalname = "BE_UBI_"+sGXsfl_80_idx ;
      edtBe_Rack_Internalname = "BE_RACK_"+sGXsfl_80_idx ;
      edtBe_ColN_Internalname = "BE_COLN_"+sGXsfl_80_idx ;
      edtBe_TipDfC_Internalname = "BE_TIPDFC_"+sGXsfl_80_idx ;
   }

   public void subsflControlProps_fel_801195( )
   {
      edtavnRcdDeleted_1195_Internalname = "vNRCDDELETED_1195_"+sGXsfl_80_fel_idx ;
      edtBe_Pza_Internalname = "BE_PZA_"+sGXsfl_80_fel_idx ;
      edtBe_Ped_Internalname = "BE_PED_"+sGXsfl_80_fel_idx ;
      edtBe_Dib_Internalname = "BE_DIB_"+sGXsfl_80_fel_idx ;
      edtBe_Kgs_Internalname = "BE_KGS_"+sGXsfl_80_fel_idx ;
      edtBe_Mts_Internalname = "BE_MTS_"+sGXsfl_80_fel_idx ;
      edtBe_Col_Internalname = "BE_COL_"+sGXsfl_80_fel_idx ;
      edtBe_Ubi_Internalname = "BE_UBI_"+sGXsfl_80_fel_idx ;
      edtBe_Rack_Internalname = "BE_RACK_"+sGXsfl_80_fel_idx ;
      edtBe_ColN_Internalname = "BE_COLN_"+sGXsfl_80_fel_idx ;
      edtBe_TipDfC_Internalname = "BE_TIPDFC_"+sGXsfl_80_fel_idx ;
   }

   public void addRow12R1195( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801195( ) ;
      sendRow12R1195( ) ;
   }

   public void sendRow12R1195( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1195_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1195_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1195_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1195), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1195), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1195_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1195_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1195_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBe_Pza_Internalname,GXutil.rtrim( A8740Be_Pza),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBe_Pza_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBe_Pza_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBe_Ped_Internalname,GXutil.rtrim( A8741Be_Ped),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBe_Ped_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBe_Ped_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBe_Dib_Internalname,GXutil.rtrim( A8742Be_Dib),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBe_Dib_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBe_Dib_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1195_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBe_Kgs_Internalname,GXutil.ltrim( localUtil.ntoc( A8743Be_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBe_Kgs_Enabled!=0) ? localUtil.format( A8743Be_Kgs, "ZZZZZ9.99") : localUtil.format( A8743Be_Kgs, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBe_Kgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBe_Kgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1195_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBe_Mts_Internalname,GXutil.ltrim( localUtil.ntoc( A8744Be_Mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBe_Mts_Enabled!=0) ? localUtil.format( A8744Be_Mts, "ZZZZZ9.99") : localUtil.format( A8744Be_Mts, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBe_Mts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBe_Mts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBe_Col_Internalname,GXutil.rtrim( A8745Be_Col),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBe_Col_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBe_Col_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBe_Ubi_Internalname,GXutil.rtrim( A8746Be_Ubi),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBe_Ubi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBe_Ubi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBe_Rack_Internalname,GXutil.rtrim( A8747Be_Rack),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBe_Rack_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBe_Rack_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1195_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBe_ColN_Internalname,GXutil.ltrim( localUtil.ntoc( A8866Be_ColN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBe_ColN_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8866Be_ColN), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8866Be_ColN), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,90);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBe_ColN_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBe_ColN_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1195_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBe_TipDfC_Internalname,GXutil.ltrim( localUtil.ntoc( A8867Be_TipDfC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBe_TipDfC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8867Be_TipDfC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8867Be_TipDfC), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBe_TipDfC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBe_TipDfC_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes12R1195( ) ;
      GXCCtl = "Z8740Be_Pza_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8740Be_Pza));
      GXCCtl = "Z8741Be_Ped_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8741Be_Ped));
      GXCCtl = "Z8742Be_Dib_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8742Be_Dib));
      GXCCtl = "Z8745Be_Col_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8745Be_Col));
      GXCCtl = "Z8747Be_Rack_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8747Be_Rack));
      GXCCtl = "Z8746Be_Ubi_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8746Be_Ubi));
      GXCCtl = "Z8743Be_Kgs_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8743Be_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8744Be_Mts_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8744Be_Mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8866Be_ColN_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8866Be_ColN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8867Be_TipDfC_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8867Be_TipDfC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O8744Be_Mts_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O8744Be_Mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O8743Be_Kgs_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O8743Be_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1195_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1195_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1195_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARORDLIN_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV33Barordlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMAQLOC_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV35Maqloc));
      GXCCtl = "vMAQCOD_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV34Maqcod));
      GXCCtl = "vUSURCOD_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV8UsurCod));
      GXCCtl = "vSTATION_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV12Station));
      GXCCtl = "vBARSER_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV36Barser));
      GXCCtl = "vBARSERDSC_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV37Barserdsc));
      GXCCtl = "vBARCOLNOM_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV38Barcolnom));
      GXCCtl = "vBARCOLNUM_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV39Barcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1195_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1195_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BE_PZA_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Pza_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BE_PED_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Ped_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BE_DIB_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Dib_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BE_KGS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Kgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BE_MTS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Mts_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BE_COL_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Col_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BE_UBI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Ubi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BE_RACK_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Rack_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BE_COLN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_ColN_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BE_TIPDFC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_TipDfC_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow12R1195( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801195( ) ;
      edtavnRcdDeleted_1195_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1195_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBe_Pza_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BE_PZA_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBe_Ped_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BE_PED_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBe_Dib_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BE_DIB_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBe_Kgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BE_KGS_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBe_Mts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BE_MTS_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBe_Col_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BE_COL_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBe_Ubi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BE_UBI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBe_Rack_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BE_RACK_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBe_ColN_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BE_COLN_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBe_TipDfC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BE_TIPDFC_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1195_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1195_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1195");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1195_Internalname ;
         wbErr = true ;
         nRcdDeleted_1195 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1195 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1195_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A8740Be_Pza = httpContext.cgiGet( edtBe_Pza_Internalname) ;
      A8741Be_Ped = httpContext.cgiGet( edtBe_Ped_Internalname) ;
      n8741Be_Ped = false ;
      A8742Be_Dib = httpContext.cgiGet( edtBe_Dib_Internalname) ;
      n8742Be_Dib = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBe_Kgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBe_Kgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BE_KGS_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBe_Kgs_Internalname ;
         wbErr = true ;
         A8743Be_Kgs = DecimalUtil.ZERO ;
         n8743Be_Kgs = false ;
      }
      else
      {
         A8743Be_Kgs = localUtil.ctond( httpContext.cgiGet( edtBe_Kgs_Internalname)) ;
         n8743Be_Kgs = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBe_Mts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBe_Mts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BE_MTS_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBe_Mts_Internalname ;
         wbErr = true ;
         A8744Be_Mts = DecimalUtil.ZERO ;
         n8744Be_Mts = false ;
      }
      else
      {
         A8744Be_Mts = localUtil.ctond( httpContext.cgiGet( edtBe_Mts_Internalname)) ;
         n8744Be_Mts = false ;
      }
      A8745Be_Col = httpContext.cgiGet( edtBe_Col_Internalname) ;
      n8745Be_Col = false ;
      A8746Be_Ubi = httpContext.cgiGet( edtBe_Ubi_Internalname) ;
      n8746Be_Ubi = false ;
      A8747Be_Rack = httpContext.cgiGet( edtBe_Rack_Internalname) ;
      n8747Be_Rack = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBe_ColN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBe_ColN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "BE_COLN_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBe_ColN_Internalname ;
         wbErr = true ;
         A8866Be_ColN = 0 ;
         n8866Be_ColN = false ;
      }
      else
      {
         A8866Be_ColN = (int)(localUtil.ctol( httpContext.cgiGet( edtBe_ColN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n8866Be_ColN = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBe_TipDfC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBe_TipDfC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BE_TIPDFC_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBe_TipDfC_Internalname ;
         wbErr = true ;
         A8867Be_TipDfC = (short)(0) ;
         n8867Be_TipDfC = false ;
      }
      else
      {
         A8867Be_TipDfC = (short)(localUtil.ctol( httpContext.cgiGet( edtBe_TipDfC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n8867Be_TipDfC = false ;
      }
      GXCCtl = "Z8740Be_Pza_" + sGXsfl_80_idx ;
      Z8740Be_Pza = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8741Be_Ped_" + sGXsfl_80_idx ;
      Z8741Be_Ped = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8742Be_Dib_" + sGXsfl_80_idx ;
      Z8742Be_Dib = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8745Be_Col_" + sGXsfl_80_idx ;
      Z8745Be_Col = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8747Be_Rack_" + sGXsfl_80_idx ;
      Z8747Be_Rack = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8746Be_Ubi_" + sGXsfl_80_idx ;
      Z8746Be_Ubi = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8743Be_Kgs_" + sGXsfl_80_idx ;
      Z8743Be_Kgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8744Be_Mts_" + sGXsfl_80_idx ;
      Z8744Be_Mts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8866Be_ColN_" + sGXsfl_80_idx ;
      Z8866Be_ColN = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8867Be_TipDfC_" + sGXsfl_80_idx ;
      Z8867Be_TipDfC = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O8744Be_Mts_" + sGXsfl_80_idx ;
      O8744Be_Mts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O8743Be_Kgs_" + sGXsfl_80_idx ;
      O8743Be_Kgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1195_" + sGXsfl_80_idx ;
      nRcdDeleted_1195 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1195_" + sGXsfl_80_idx ;
      nRcdExists_1195 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1195_" + sGXsfl_80_idx ;
      nIsMod_1195 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtBe_Rack_Enabled = edtBe_Rack_Enabled ;
      defedtBe_Ubi_Enabled = edtBe_Ubi_Enabled ;
      defedtBe_Col_Enabled = edtBe_Col_Enabled ;
      defedtBe_Dib_Enabled = edtBe_Dib_Enabled ;
      defedtBe_Ped_Enabled = edtBe_Ped_Enabled ;
      defedtBe_Pza_Enabled = edtBe_Pza_Enabled ;
   }

   public void confirmValues12R0( )
   {
      nGXsfl_80_idx = 0 ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801195( ) ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_801195( ) ;
         httpContext.changePostValue( "Z8740Be_Pza_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z8740Be_Pza_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8740Be_Pza_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z8741Be_Ped_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z8741Be_Ped_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8741Be_Ped_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z8742Be_Dib_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z8742Be_Dib_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8742Be_Dib_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z8745Be_Col_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z8745Be_Col_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8745Be_Col_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z8747Be_Rack_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z8747Be_Rack_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8747Be_Rack_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z8746Be_Ubi_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z8746Be_Ubi_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8746Be_Ubi_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z8743Be_Kgs_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z8743Be_Kgs_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8743Be_Kgs_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z8744Be_Mts_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z8744Be_Mts_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8744Be_Mts_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z8866Be_ColN_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z8866Be_ColN_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8866Be_ColN_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z8867Be_TipDfC_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z8867Be_TipDfC_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8867Be_TipDfC_"+sGXsfl_80_idx) ;
      }
      httpContext.changePostValue( "O8744Be_Mts", httpContext.cgiGet( "T8744Be_Mts")) ;
      httpContext.deletePostValue( "T8744Be_Mts") ;
      httpContext.changePostValue( "O8743Be_Kgs", httpContext.cgiGet( "T8743Be_Kgs")) ;
      httpContext.deletePostValue( "T8743Be_Kgs") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tinotbe", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A8735Be_hdr,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A8736Be_hdrr,1,0)),GXutil.URLEncode(GXutil.rtrim(A8737Be_hdrp)),GXutil.URLEncode(GXutil.ltrimstr(AV33Barordlin,4,0)),GXutil.URLEncode(GXutil.rtrim(AV34Maqcod)),GXutil.URLEncode(GXutil.rtrim(AV35Maqloc)),GXutil.URLEncode(GXutil.rtrim(AV36Barser)),GXutil.URLEncode(GXutil.rtrim(AV37Barserdsc)),GXutil.URLEncode(GXutil.rtrim(AV38Barcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV39Barcolnum,6,0))}, new String[] {"EmprCod","Be_hdr","Be_hdrr","Be_hdrp","Barordlin","Maqcod","Maqloc","Barser","Barserdsc","Barcolnom","Barcolnum"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z8735Be_hdr", GXutil.ltrim( localUtil.ntoc( Z8735Be_hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8736Be_hdrr", GXutil.ltrim( localUtil.ntoc( Z8736Be_hdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8737Be_hdrp", GXutil.rtrim( Z8737Be_hdrp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8738Be_FecE", localUtil.ttoc( Z8738Be_FecE, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8739Be_Usu", GXutil.rtrim( Z8739Be_Usu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8748Be_Sta", GXutil.ltrim( localUtil.ntoc( Z8748Be_Sta, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9591Be_PoS", GXutil.rtrim( Z9591Be_PoS));
      app.GxWebStd.gx_hidden_field( httpContext, "O8750Be_MtsT", GXutil.ltrim( localUtil.ntoc( O8750Be_MtsT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8749Be_KgsT", GXutil.ltrim( localUtil.ntoc( O8749Be_KgsT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8751Be_PzsT", GXutil.ltrim( localUtil.ntoc( O8751Be_PzsT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_80", GXutil.ltrim( localUtil.ntoc( nGXsfl_80_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV33Barordlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33Barordlin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQLOC", GXutil.rtrim( AV35Maqloc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQLOC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35Maqloc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD", GXutil.rtrim( AV34Maqcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34Maqcod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV12Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSER", GXutil.rtrim( AV36Barser));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSERDSC", GXutil.rtrim( AV37Barserdsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNOM", GXutil.rtrim( AV38Barcolnom));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV39Barcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTOI", GXutil.rtrim( AV40Textoi));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV43Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPDEFDSC", GXutil.rtrim( AV41Tipdefdsc));
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
      return formatLink("app.tinotbe", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A8735Be_hdr,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A8736Be_hdrr,1,0)),GXutil.URLEncode(GXutil.rtrim(A8737Be_hdrp)),GXutil.URLEncode(GXutil.ltrimstr(AV33Barordlin,4,0)),GXutil.URLEncode(GXutil.rtrim(AV34Maqcod)),GXutil.URLEncode(GXutil.rtrim(AV35Maqloc)),GXutil.URLEncode(GXutil.rtrim(AV36Barser)),GXutil.URLEncode(GXutil.rtrim(AV37Barserdsc)),GXutil.URLEncode(GXutil.rtrim(AV38Barcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV39Barcolnum,6,0))}, new String[] {"EmprCod","Be_hdr","Be_hdrr","Be_hdrp","Barordlin","Maqcod","Maqloc","Barser","Barserdsc","Barcolnom","Barcolnum"})  ;
   }

   public String getPgmname( )
   {
      return "TINOTBE" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ENTRADA OT EN BODEGA ESTAMPA", "") ;
   }

   public void initializeNonKey12R1194( )
   {
      AV40Textoi = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Textoi", AV40Textoi);
      A8748Be_Sta = (byte)(0) ;
      n8748Be_Sta = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8748Be_Sta", GXutil.str( A8748Be_Sta, 1, 0));
      A9591Be_PoS = "" ;
      n9591Be_PoS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9591Be_PoS", A9591Be_PoS);
      A8738Be_FecE = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n8738Be_FecE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8738Be_FecE", localUtil.ttoc( A8738Be_FecE, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A8739Be_Usu = AV8UsurCod ;
      n8739Be_Usu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8739Be_Usu", A8739Be_Usu);
      O8750Be_MtsT = A8750Be_MtsT ;
      httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
      O8749Be_KgsT = A8749Be_KgsT ;
      httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
      O8751Be_PzsT = A8751Be_PzsT ;
      httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
      Z8738Be_FecE = GXutil.resetTime( GXutil.nullDate() );
      Z8739Be_Usu = "" ;
      Z8748Be_Sta = (byte)(0) ;
      Z9591Be_PoS = "" ;
   }

   public void initAll12R1194( )
   {
      initializeNonKey12R1194( ) ;
   }

   public void standaloneModalInsert( )
   {
      A8738Be_FecE = i8738Be_FecE ;
      n8738Be_FecE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8738Be_FecE", localUtil.ttoc( A8738Be_FecE, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A8739Be_Usu = i8739Be_Usu ;
      n8739Be_Usu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8739Be_Usu", A8739Be_Usu);
   }

   public void initializeNonKey12R1195( )
   {
      AV41Tipdefdsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Tipdefdsc", AV41Tipdefdsc);
      A8867Be_TipDfC = (short)(0) ;
      n8867Be_TipDfC = false ;
      A8741Be_Ped = E8741Be_Ped ;
      n8741Be_Ped = false ;
      A8742Be_Dib = E8742Be_Dib ;
      n8742Be_Dib = false ;
      A8745Be_Col = E8745Be_Col ;
      n8745Be_Col = false ;
      A8747Be_Rack = E8747Be_Rack ;
      n8747Be_Rack = false ;
      A8746Be_Ubi = E8746Be_Ubi ;
      n8746Be_Ubi = false ;
      A8743Be_Kgs = E8743Be_Kgs ;
      n8743Be_Kgs = false ;
      A8744Be_Mts = E8744Be_Mts ;
      n8744Be_Mts = false ;
      A8866Be_ColN = E8866Be_ColN ;
      n8866Be_ColN = false ;
      O8744Be_Mts = A8744Be_Mts ;
      n8744Be_Mts = false ;
      O8743Be_Kgs = A8743Be_Kgs ;
      n8743Be_Kgs = false ;
      Z8741Be_Ped = "" ;
      Z8742Be_Dib = "" ;
      Z8745Be_Col = "" ;
      Z8747Be_Rack = "" ;
      Z8746Be_Ubi = "" ;
      Z8743Be_Kgs = DecimalUtil.ZERO ;
      Z8744Be_Mts = DecimalUtil.ZERO ;
      Z8866Be_ColN = 0 ;
      Z8867Be_TipDfC = (short)(0) ;
   }

   public void initAll12R1195( )
   {
      A8740Be_Pza = "" ;
      initializeNonKey12R1195( ) ;
   }

   public void standaloneModalInsert12R1195( )
   {
      A8741Be_Ped = i8741Be_Ped ;
      n8741Be_Ped = false ;
      A8742Be_Dib = i8742Be_Dib ;
      n8742Be_Dib = false ;
      A8745Be_Col = i8745Be_Col ;
      n8745Be_Col = false ;
      A8747Be_Rack = i8747Be_Rack ;
      n8747Be_Rack = false ;
      A8746Be_Ubi = i8746Be_Ubi ;
      n8746Be_Ubi = false ;
      A8743Be_Kgs = i8743Be_Kgs ;
      n8743Be_Kgs = false ;
      A8744Be_Mts = i8744Be_Mts ;
      n8744Be_Mts = false ;
      A8866Be_ColN = i8866Be_ColN ;
      n8866Be_ColN = false ;
      A8751Be_PzsT = i8751Be_PzsT ;
      httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241535612", true, true);
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
      httpContext.AddJavascriptSource("tinotbe.js", "?20268241535613", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1195( )
   {
      edtBe_Rack_Enabled = defedtBe_Rack_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_Rack_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Rack_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtBe_Ubi_Enabled = defedtBe_Ubi_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_Ubi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Ubi_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtBe_Col_Enabled = defedtBe_Col_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_Col_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Col_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtBe_Dib_Enabled = defedtBe_Dib_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_Dib_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Dib_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtBe_Ped_Enabled = defedtBe_Ped_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_Ped_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Ped_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtBe_Pza_Enabled = defedtBe_Pza_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBe_Pza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBe_Pza_Enabled), 5, 0), !bGXsfl_80_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1195, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1195_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8740Be_Pza));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Pza_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8741Be_Ped));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Ped_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8742Be_Dib));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Dib_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8743Be_Kgs, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Kgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8744Be_Mts, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Mts_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8745Be_Col));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Col_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8746Be_Ubi));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Ubi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8747Be_Rack));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_Rack_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8866Be_ColN, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_ColN_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8867Be_TipDfC, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBe_TipDfC_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtBe_hdr_Internalname = "BE_HDR" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBe_hdrr_Internalname = "BE_HDRR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBe_hdrp_Internalname = "BE_HDRP" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBe_FecE_Internalname = "BE_FECE" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtBe_Usu_Internalname = "BE_USU" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtBe_Sta_Internalname = "BE_STA" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtBe_KgsT_Internalname = "BE_KGST" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtBe_MtsT_Internalname = "BE_MTST" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtBe_PzsT_Internalname = "BE_PZST" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtBe_PoS_Internalname = "BE_POS" ;
      edtavnRcdDeleted_1195_Internalname = "vNRCDDELETED_1195" ;
      edtBe_Pza_Internalname = "BE_PZA" ;
      edtBe_Ped_Internalname = "BE_PED" ;
      edtBe_Dib_Internalname = "BE_DIB" ;
      edtBe_Kgs_Internalname = "BE_KGS" ;
      edtBe_Mts_Internalname = "BE_MTS" ;
      edtBe_Col_Internalname = "BE_COL" ;
      edtBe_Ubi_Internalname = "BE_UBI" ;
      edtBe_Rack_Internalname = "BE_RACK" ;
      edtBe_ColN_Internalname = "BE_COLN" ;
      edtBe_TipDfC_Internalname = "BE_TIPDFC" ;
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
      Form.setCaption( httpContext.getMessage( "ENTRADA OT EN BODEGA ESTAMPA", "") );
      edtBe_TipDfC_Jsonclick = "" ;
      edtBe_ColN_Jsonclick = "" ;
      edtBe_Rack_Jsonclick = "" ;
      edtBe_Ubi_Jsonclick = "" ;
      edtBe_Col_Jsonclick = "" ;
      edtBe_Mts_Jsonclick = "" ;
      edtBe_Kgs_Jsonclick = "" ;
      edtBe_Dib_Jsonclick = "" ;
      edtBe_Ped_Jsonclick = "" ;
      edtBe_Pza_Jsonclick = "" ;
      edtavnRcdDeleted_1195_Jsonclick = "" ;
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
      edtBe_TipDfC_Enabled = 1 ;
      edtBe_ColN_Enabled = 1 ;
      edtBe_Rack_Enabled = 0 ;
      edtBe_Ubi_Enabled = 0 ;
      edtBe_Col_Enabled = 0 ;
      edtBe_Mts_Enabled = 1 ;
      edtBe_Kgs_Enabled = 1 ;
      edtBe_Dib_Enabled = 0 ;
      edtBe_Ped_Enabled = 0 ;
      edtBe_Pza_Enabled = 1 ;
      edtavnRcdDeleted_1195_Enabled = 1 ;
      edtBe_PoS_Jsonclick = "" ;
      edtBe_PoS_Backcolor = (int)(0xFFFFFF) ;
      edtBe_PoS_Enabled = 1 ;
      edtBe_PzsT_Jsonclick = "" ;
      edtBe_PzsT_Backcolor = (int)(0xFFFFFF) ;
      edtBe_PzsT_Enabled = 0 ;
      edtBe_MtsT_Jsonclick = "" ;
      edtBe_MtsT_Backcolor = (int)(0xFFFFFF) ;
      edtBe_MtsT_Enabled = 0 ;
      edtBe_KgsT_Jsonclick = "" ;
      edtBe_KgsT_Backcolor = (int)(0xFFFFFF) ;
      edtBe_KgsT_Enabled = 0 ;
      edtBe_Sta_Jsonclick = "" ;
      edtBe_Sta_Backcolor = (int)(0xFFFFFF) ;
      edtBe_Sta_Enabled = 1 ;
      edtBe_Usu_Jsonclick = "" ;
      edtBe_Usu_Backcolor = (int)(0xFFFFFF) ;
      edtBe_Usu_Enabled = 1 ;
      edtBe_FecE_Jsonclick = "" ;
      edtBe_FecE_Backcolor = (int)(0xFFFFFF) ;
      edtBe_FecE_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtBe_hdrp_Jsonclick = "" ;
      edtBe_hdrp_Backcolor = (int)(0xFFFFFF) ;
      edtBe_hdrp_Enabled = 0 ;
      edtBe_hdrr_Jsonclick = "" ;
      edtBe_hdrr_Backcolor = (int)(0xFFFFFF) ;
      edtBe_hdrr_Enabled = 0 ;
      edtBe_hdr_Jsonclick = "" ;
      edtBe_hdr_Backcolor = (int)(0xFFFFFF) ;
      edtBe_hdr_Enabled = 0 ;
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

   public void xc_21_12R1195( String A396EmprCod ,
                              short A8867Be_TipDfC ,
                              String AV41Tipdefdsc )
   {
      if ( ( A8867Be_TipDfC > 0 ) && true /* After */ )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int7[0] = A8867Be_TipDfC ;
         GXv_char9[0] = AV41Tipdefdsc ;
         new app.pdescdef(remoteHandle, context).execute( GXv_char10, GXv_int7, GXv_char9) ;
         A396EmprCod = GXv_char10[0] ;
         A8867Be_TipDfC = GXv_int7[0] ;
         AV41Tipdefdsc = GXv_char9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV41Tipdefdsc", AV41Tipdefdsc);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8867Be_TipDfC, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV41Tipdefdsc))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_23_12R1195( String Gx_mode ,
                              String A396EmprCod ,
                              int A8735Be_hdr ,
                              byte A8736Be_hdrr ,
                              String A8737Be_hdrp ,
                              String A8742Be_Dib ,
                              String A8741Be_Ped ,
                              String A8745Be_Col ,
                              int A8866Be_ColN ,
                              String A8740Be_Pza )
   {
      if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A8740Be_Pza, " ") != 0 ) )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int11[0] = A8735Be_hdr ;
         GXv_int6[0] = A8736Be_hdrr ;
         GXv_char9[0] = A8737Be_hdrp ;
         GXv_char8[0] = A8742Be_Dib ;
         GXv_char4[0] = A8741Be_Ped ;
         GXv_char3[0] = A8745Be_Col ;
         GXv_int5[0] = A8866Be_ColN ;
         new app.pmasinotbe(remoteHandle, context).execute( GXv_char10, GXv_int11, GXv_int6, GXv_char9, GXv_char8, GXv_char4, GXv_char3, GXv_int5) ;
         A396EmprCod = GXv_char10[0] ;
         A8735Be_hdr = GXv_int11[0] ;
         A8736Be_hdrr = GXv_int6[0] ;
         A8737Be_hdrp = GXv_char9[0] ;
         A8742Be_Dib = GXv_char8[0] ;
         A8741Be_Ped = GXv_char4[0] ;
         A8745Be_Col = GXv_char3[0] ;
         A8866Be_ColN = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A8735Be_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8735Be_hdr), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A8736Be_hdrr", GXutil.str( A8736Be_hdrr, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A8737Be_hdrp", A8737Be_hdrp);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8735Be_hdr, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8736Be_hdrr, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8737Be_hdrp))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8742Be_Dib))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8741Be_Ped))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8745Be_Col))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8866Be_ColN, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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
      subsflControlProps_801195( ) ;
      while ( nGXsfl_80_idx <= nRC_GXsfl_80 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal12R1195( ) ;
         standaloneModal12R1195( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow12R1195( ) ;
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_801195( ) ;
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
      /* Using cursor T012R26 */
      pr_default.execute(22, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T012R26_A407EmprNom[0] ;
      n407EmprNom = T012R26_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(22);
      /* Using cursor T012R28 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A8735Be_hdr), Byte.valueOf(A8736Be_hdrr), A8737Be_hdrp});
      if ( (pr_default.getStatus(23) != 101) )
      {
         A8749Be_KgsT = T012R28_A8749Be_KgsT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
         A8750Be_MtsT = T012R28_A8750Be_MtsT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
         A8751Be_PzsT = T012R28_A8751Be_PzsT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
      }
      else
      {
         A8749Be_KgsT = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrimstr( A8749Be_KgsT, 9, 2));
         A8750Be_MtsT = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrimstr( A8750Be_MtsT, 9, 2));
         A8751Be_PzsT = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8751Be_PzsT), 6, 0));
      }
      pr_default.close(23);
      GX_FocusControl = edtBe_FecE_Internalname ;
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

   public void valid_Be_hdrp( )
   {
      n8741Be_Ped = false ;
      n8738Be_FecE = false ;
      n8739Be_Usu = false ;
      E8741Be_Ped = A8741Be_Ped ;
      n8741Be_Ped = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A8738Be_FecE", localUtil.ttoc( A8738Be_FecE, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A8739Be_Usu", GXutil.rtrim( A8739Be_Usu));
      httpContext.ajax_rsp_assign_attri("", false, "A8748Be_Sta", GXutil.ltrim( localUtil.ntoc( A8748Be_Sta, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8749Be_KgsT", GXutil.ltrim( localUtil.ntoc( A8749Be_KgsT, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8750Be_MtsT", GXutil.ltrim( localUtil.ntoc( A8750Be_MtsT, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8751Be_PzsT", GXutil.ltrim( localUtil.ntoc( A8751Be_PzsT, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9591Be_PoS", GXutil.rtrim( A9591Be_PoS));
      httpContext.ajax_rsp_assign_attri("", false, "AV40Textoi", GXutil.rtrim( AV40Textoi));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8735Be_hdr", GXutil.ltrim( localUtil.ntoc( Z8735Be_hdr, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8736Be_hdrr", GXutil.ltrim( localUtil.ntoc( Z8736Be_hdrr, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8737Be_hdrp", GXutil.rtrim( Z8737Be_hdrp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8738Be_FecE", localUtil.ttoc( Z8738Be_FecE, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8739Be_Usu", GXutil.rtrim( Z8739Be_Usu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8748Be_Sta", GXutil.ltrim( localUtil.ntoc( Z8748Be_Sta, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8749Be_KgsT", GXutil.ltrim( localUtil.ntoc( Z8749Be_KgsT, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8750Be_MtsT", GXutil.ltrim( localUtil.ntoc( Z8750Be_MtsT, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8751Be_PzsT", GXutil.ltrim( localUtil.ntoc( Z8751Be_PzsT, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9591Be_PoS", GXutil.rtrim( Z9591Be_PoS));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV40Textoi", GXutil.rtrim( ZV40Textoi));
      httpContext.ajax_rsp_assign_attri("", false, "O8750Be_MtsT", GXutil.ltrim( localUtil.ntoc( O8750Be_MtsT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O8749Be_KgsT", GXutil.ltrim( localUtil.ntoc( O8749Be_KgsT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O8751Be_PzsT", GXutil.ltrim( localUtil.ntoc( O8751Be_PzsT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Be_pos( )
   {
      n9591Be_PoS = false ;
      if ( true )
      {
         AV40Textoi = "XXXXXXXXXX" ;
      }
      else
      {
         if ( GXutil.strcmp(A9591Be_PoS, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
         {
            AV40Textoi = httpContext.getMessage( httpContext.getMessage( "STOCK", ""), "") ;
         }
         else
         {
            if ( GXutil.strcmp(A9591Be_PoS, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 )
            {
               AV40Textoi = httpContext.getMessage( httpContext.getMessage( "PROGRAMACION", ""), "") ;
            }
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV40Textoi", GXutil.rtrim( AV40Textoi));
   }

   public void valid_Be_pza( )
   {
      n8866Be_ColN = false ;
      n8745Be_Col = false ;
      n8741Be_Ped = false ;
      n8742Be_Dib = false ;
      if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A8740Be_Pza, " ") != 0 ) )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int11[0] = A8735Be_hdr ;
         GXv_int6[0] = A8736Be_hdrr ;
         GXv_char9[0] = A8737Be_hdrp ;
         GXv_char8[0] = A8742Be_Dib ;
         GXv_char4[0] = A8741Be_Ped ;
         GXv_char3[0] = A8745Be_Col ;
         GXv_int5[0] = A8866Be_ColN ;
         new app.pmasinotbe(remoteHandle, context).execute( GXv_char10, GXv_int11, GXv_int6, GXv_char9, GXv_char8, GXv_char4, GXv_char3, GXv_int5) ;
         tinotbe_impl.this.A396EmprCod = GXv_char10[0] ;
         A396EmprCod = this.A396EmprCod ;
         tinotbe_impl.this.A8735Be_hdr = GXv_int11[0] ;
         A8735Be_hdr = this.A8735Be_hdr ;
         tinotbe_impl.this.A8736Be_hdrr = GXv_int6[0] ;
         A8736Be_hdrr = this.A8736Be_hdrr ;
         tinotbe_impl.this.A8737Be_hdrp = GXv_char9[0] ;
         A8737Be_hdrp = this.A8737Be_hdrp ;
         tinotbe_impl.this.A8742Be_Dib = GXv_char8[0] ;
         A8742Be_Dib = this.A8742Be_Dib ;
         tinotbe_impl.this.A8741Be_Ped = GXv_char4[0] ;
         A8741Be_Ped = this.A8741Be_Ped ;
         tinotbe_impl.this.A8745Be_Col = GXv_char3[0] ;
         A8745Be_Col = this.A8745Be_Col ;
         tinotbe_impl.this.A8866Be_ColN = GXv_int5[0] ;
         A8866Be_ColN = this.A8866Be_ColN ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A8735Be_hdr", GXutil.ltrim( localUtil.ntoc( A8735Be_hdr, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8736Be_hdrr", GXutil.ltrim( localUtil.ntoc( A8736Be_hdrr, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8737Be_hdrp", GXutil.rtrim( A8737Be_hdrp));
      httpContext.ajax_rsp_assign_attri("", false, "A8742Be_Dib", GXutil.rtrim( A8742Be_Dib));
      httpContext.ajax_rsp_assign_attri("", false, "A8741Be_Ped", GXutil.rtrim( A8741Be_Ped));
      httpContext.ajax_rsp_assign_attri("", false, "A8745Be_Col", GXutil.rtrim( A8745Be_Col));
      httpContext.ajax_rsp_assign_attri("", false, "A8866Be_ColN", GXutil.ltrim( localUtil.ntoc( A8866Be_ColN, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Be_tipdfc( )
   {
      n8743Be_Kgs = false ;
      n8744Be_Mts = false ;
      n8867Be_TipDfC = false ;
      if ( ( A8867Be_TipDfC > 0 ) && true /* After */ )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int7[0] = A8867Be_TipDfC ;
         GXv_char9[0] = AV41Tipdefdsc ;
         new app.pdescdef(remoteHandle, context).execute( GXv_char10, GXv_int7, GXv_char9) ;
         tinotbe_impl.this.A396EmprCod = GXv_char10[0] ;
         A396EmprCod = this.A396EmprCod ;
         tinotbe_impl.this.A8867Be_TipDfC = GXv_int7[0] ;
         A8867Be_TipDfC = this.A8867Be_TipDfC ;
         tinotbe_impl.this.AV41Tipdefdsc = GXv_char9[0] ;
         AV41Tipdefdsc = this.AV41Tipdefdsc ;
      }
      if ( ( GXutil.strcmp(AV41Tipdefdsc, httpContext.getMessage( "Error", "")) == 0 ) && ( A8867Be_TipDfC > 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Tipo Defecto", ""), 1, "BE_TIPDFC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBe_TipDfC_Internalname ;
      }
      O8744Be_Mts = A8744Be_Mts ;
      n8744Be_Mts = false ;
      O8750Be_MtsT = A8750Be_MtsT ;
      O8743Be_Kgs = A8743Be_Kgs ;
      n8743Be_Kgs = false ;
      O8749Be_KgsT = A8749Be_KgsT ;
      O8751Be_PzsT = A8751Be_PzsT ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A8867Be_TipDfC", GXutil.ltrim( localUtil.ntoc( A8867Be_TipDfC, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV41Tipdefdsc", GXutil.rtrim( AV41Tipdefdsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8735Be_hdr',fld:'BE_HDR',pic:'ZZZZZZZ9'},{av:'A8736Be_hdrr',fld:'BE_HDRR',pic:'9'},{av:'A8737Be_hdrp',fld:'BE_HDRP',pic:''},{av:'AV33Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV34Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV35Maqloc',fld:'vMAQLOC',pic:'',hsh:true},{av:'AV36Barser',fld:'vBARSER',pic:''},{av:'AV37Barserdsc',fld:'vBARSERDSC',pic:''},{av:'AV38Barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV39Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV33Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV35Maqloc',fld:'vMAQLOC',pic:'',hsh:true},{av:'AV34Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV12Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e1212R2',iparms:[{av:'A8748Be_Sta',fld:'BE_STA',pic:'9'},{av:'A8735Be_hdr',fld:'BE_HDR',pic:'ZZZZZZZ9'},{av:'A8736Be_hdrr',fld:'BE_HDRR',pic:'9'},{av:'A8737Be_hdrp',fld:'BE_HDRP',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV33Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV35Maqloc',fld:'vMAQLOC',pic:'',hsh:true},{av:'AV34Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'',hsh:true},{av:'AV12Station',fld:'vSTATION',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A8737Be_hdrp',fld:'BE_HDRP',pic:''},{av:'A8736Be_hdrr',fld:'BE_HDRR',pic:'9'},{av:'A8735Be_hdr',fld:'BE_HDR',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV12Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'',hsh:true},{av:'AV34Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV35Maqloc',fld:'vMAQLOC',pic:'',hsh:true},{av:'AV33Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BE_HDR","{handler:'valid_Be_hdr',iparms:[]");
      setEventMetadata("VALID_BE_HDR",",oparms:[]}");
      setEventMetadata("VALID_BE_HDRR","{handler:'valid_Be_hdrr',iparms:[]");
      setEventMetadata("VALID_BE_HDRR",",oparms:[]}");
      setEventMetadata("VALID_BE_HDRP","{handler:'valid_Be_hdrp',iparms:[{av:'AV12Station',fld:'vSTATION',pic:''},{av:'AV34Maqcod',fld:'vMAQCOD',pic:''},{av:'AV35Maqloc',fld:'vMAQLOC',pic:''},{av:'AV33Barordlin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'A8741Be_Ped',fld:'BE_PED',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8735Be_hdr',fld:'BE_HDR',pic:'ZZZZZZZ9'},{av:'A8736Be_hdrr',fld:'BE_HDRR',pic:'9'},{av:'A8737Be_hdrp',fld:'BE_HDRP',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A8738Be_FecE',fld:'BE_FECE',pic:'99/99/99 99:99'},{av:'A8739Be_Usu',fld:'BE_USU',pic:''},{av:'AV40Textoi',fld:'vTEXTOI',pic:''}]");
      setEventMetadata("VALID_BE_HDRP",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A8738Be_FecE',fld:'BE_FECE',pic:'99/99/99 99:99'},{av:'A8739Be_Usu',fld:'BE_USU',pic:''},{av:'A8748Be_Sta',fld:'BE_STA',pic:'9'},{av:'A8749Be_KgsT',fld:'BE_KGST',pic:'ZZZZZ9.99'},{av:'A8750Be_MtsT',fld:'BE_MTST',pic:'ZZZZZ9.99'},{av:'A8751Be_PzsT',fld:'BE_PZST',pic:'ZZZZZ9'},{av:'A9591Be_PoS',fld:'BE_POS',pic:''},{av:'AV40Textoi',fld:'vTEXTOI',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z8735Be_hdr'},{av:'Z8736Be_hdrr'},{av:'Z8737Be_hdrp'},{av:'Z407EmprNom'},{av:'Z8738Be_FecE'},{av:'Z8739Be_Usu'},{av:'Z8748Be_Sta'},{av:'Z8749Be_KgsT'},{av:'Z8750Be_MtsT'},{av:'Z8751Be_PzsT'},{av:'Z9591Be_PoS'},{av:'ZV40Textoi'},{av:'O8750Be_MtsT'},{av:'O8749Be_KgsT'},{av:'O8751Be_PzsT'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_BE_POS","{handler:'valid_Be_pos',iparms:[{av:'A9591Be_PoS',fld:'BE_POS',pic:''},{av:'AV40Textoi',fld:'vTEXTOI',pic:''}]");
      setEventMetadata("VALID_BE_POS",",oparms:[{av:'AV40Textoi',fld:'vTEXTOI',pic:''}]}");
      setEventMetadata("VALID_BE_PZA","{handler:'valid_Be_pza',iparms:[{av:'A8866Be_ColN',fld:'BE_COLN',pic:'ZZZZZ9'},{av:'A8745Be_Col',fld:'BE_COL',pic:''},{av:'A8741Be_Ped',fld:'BE_PED',pic:''},{av:'A8742Be_Dib',fld:'BE_DIB',pic:''},{av:'A8737Be_hdrp',fld:'BE_HDRP',pic:''},{av:'A8736Be_hdrr',fld:'BE_HDRR',pic:'9'},{av:'A8735Be_hdr',fld:'BE_HDR',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A8740Be_Pza',fld:'BE_PZA',pic:''}]");
      setEventMetadata("VALID_BE_PZA",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8735Be_hdr',fld:'BE_HDR',pic:'ZZZZZZZ9'},{av:'A8736Be_hdrr',fld:'BE_HDRR',pic:'9'},{av:'A8737Be_hdrp',fld:'BE_HDRP',pic:''},{av:'A8742Be_Dib',fld:'BE_DIB',pic:''},{av:'A8741Be_Ped',fld:'BE_PED',pic:''},{av:'A8745Be_Col',fld:'BE_COL',pic:''},{av:'A8866Be_ColN',fld:'BE_COLN',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_BE_PED","{handler:'valid_Be_ped',iparms:[]");
      setEventMetadata("VALID_BE_PED",",oparms:[]}");
      setEventMetadata("VALID_BE_KGS","{handler:'valid_Be_kgs',iparms:[]");
      setEventMetadata("VALID_BE_KGS",",oparms:[]}");
      setEventMetadata("VALID_BE_MTS","{handler:'valid_Be_mts',iparms:[]");
      setEventMetadata("VALID_BE_MTS",",oparms:[]}");
      setEventMetadata("VALID_BE_TIPDFC","{handler:'valid_Be_tipdfc',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8751Be_PzsT',fld:'BE_PZST',pic:'ZZZZZ9'},{av:'A8749Be_KgsT',fld:'BE_KGST',pic:'ZZZZZ9.99'},{av:'A8743Be_Kgs',fld:'BE_KGS',pic:'ZZZZZ9.99'},{av:'A8750Be_MtsT',fld:'BE_MTST',pic:'ZZZZZ9.99'},{av:'A8744Be_Mts',fld:'BE_MTS',pic:'ZZZZZ9.99'},{av:'A8867Be_TipDfC',fld:'BE_TIPDFC',pic:'ZZZ9'},{av:'AV41Tipdefdsc',fld:'vTIPDEFDSC',pic:''}]");
      setEventMetadata("VALID_BE_TIPDFC",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8867Be_TipDfC',fld:'BE_TIPDFC',pic:'ZZZ9'},{av:'AV41Tipdefdsc',fld:'vTIPDEFDSC',pic:''}]}");
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
      pr_default.close(22);
      pr_default.close(23);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      E8866Be_ColN = 0 ;
      E8744Be_Mts = DecimalUtil.ZERO ;
      E8743Be_Kgs = DecimalUtil.ZERO ;
      E8746Be_Ubi = "" ;
      E8747Be_Rack = "" ;
      E8745Be_Col = "" ;
      E8742Be_Dib = "" ;
      E8741Be_Ped = "" ;
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA8737Be_hdrp = "" ;
      wcpOAV34Maqcod = "" ;
      wcpOAV35Maqloc = "" ;
      wcpOAV36Barser = "" ;
      wcpOAV37Barserdsc = "" ;
      wcpOAV38Barcolnom = "" ;
      Z396EmprCod = "" ;
      Z8737Be_hdrp = "" ;
      Z8738Be_FecE = GXutil.resetTime( GXutil.nullDate() );
      Z8739Be_Usu = "" ;
      Z9591Be_PoS = "" ;
      O8750Be_MtsT = DecimalUtil.ZERO ;
      O8749Be_KgsT = DecimalUtil.ZERO ;
      Z8740Be_Pza = "" ;
      Z8741Be_Ped = "" ;
      Z8742Be_Dib = "" ;
      Z8745Be_Col = "" ;
      Z8747Be_Rack = "" ;
      Z8746Be_Ubi = "" ;
      Z8743Be_Kgs = DecimalUtil.ZERO ;
      Z8744Be_Mts = DecimalUtil.ZERO ;
      O8744Be_Mts = DecimalUtil.ZERO ;
      O8743Be_Kgs = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV41Tipdefdsc = "" ;
      Gx_mode = "" ;
      A8737Be_hdrp = "" ;
      A8742Be_Dib = "" ;
      A8741Be_Ped = "" ;
      A8745Be_Col = "" ;
      A8740Be_Pza = "" ;
      AV34Maqcod = "" ;
      AV35Maqloc = "" ;
      AV36Barser = "" ;
      AV37Barserdsc = "" ;
      AV38Barcolnom = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
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
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A8738Be_FecE = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock7_Jsonclick = "" ;
      A8739Be_Usu = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A8749Be_KgsT = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      A8750Be_MtsT = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A9591Be_PoS = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B8750Be_MtsT = DecimalUtil.ZERO ;
      B8749Be_KgsT = DecimalUtil.ZERO ;
      sMode1195 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV40Textoi = "" ;
      AV8UsurCod = "" ;
      AV43Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1194 = "" ;
      s8750Be_MtsT = DecimalUtil.ZERO ;
      s8749Be_KgsT = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A8743Be_Kgs = DecimalUtil.ZERO ;
      A8744Be_Mts = DecimalUtil.ZERO ;
      A8746Be_Ubi = "" ;
      A8747Be_Rack = "" ;
      T8744Be_Mts = DecimalUtil.ZERO ;
      T8743Be_Kgs = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      Gx_msg = "" ;
      GXv_char2 = new String[1] ;
      Z407EmprNom = "" ;
      Z8749Be_KgsT = DecimalUtil.ZERO ;
      Z8750Be_MtsT = DecimalUtil.ZERO ;
      T012R6_A407EmprNom = new String[] {""} ;
      T012R6_n407EmprNom = new boolean[] {false} ;
      T012R8_A8749Be_KgsT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012R8_A8750Be_MtsT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012R8_A8751Be_PzsT = new int[1] ;
      T012R10_A8735Be_hdr = new int[1] ;
      T012R10_A8736Be_hdrr = new byte[1] ;
      T012R10_A8737Be_hdrp = new String[] {""} ;
      T012R10_A407EmprNom = new String[] {""} ;
      T012R10_n407EmprNom = new boolean[] {false} ;
      T012R10_A8738Be_FecE = new java.util.Date[] {GXutil.nullDate()} ;
      T012R10_n8738Be_FecE = new boolean[] {false} ;
      T012R10_A8739Be_Usu = new String[] {""} ;
      T012R10_n8739Be_Usu = new boolean[] {false} ;
      T012R10_A8748Be_Sta = new byte[1] ;
      T012R10_n8748Be_Sta = new boolean[] {false} ;
      T012R10_A9591Be_PoS = new String[] {""} ;
      T012R10_n9591Be_PoS = new boolean[] {false} ;
      T012R10_A396EmprCod = new String[] {""} ;
      T012R10_A8749Be_KgsT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012R10_A8750Be_MtsT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012R10_A8751Be_PzsT = new int[1] ;
      T012R11_A396EmprCod = new String[] {""} ;
      T012R11_A8735Be_hdr = new int[1] ;
      T012R11_A8736Be_hdrr = new byte[1] ;
      T012R11_A8737Be_hdrp = new String[] {""} ;
      T012R5_A8735Be_hdr = new int[1] ;
      T012R5_A8736Be_hdrr = new byte[1] ;
      T012R5_A8737Be_hdrp = new String[] {""} ;
      T012R5_A8738Be_FecE = new java.util.Date[] {GXutil.nullDate()} ;
      T012R5_n8738Be_FecE = new boolean[] {false} ;
      T012R5_A8739Be_Usu = new String[] {""} ;
      T012R5_n8739Be_Usu = new boolean[] {false} ;
      T012R5_A8748Be_Sta = new byte[1] ;
      T012R5_n8748Be_Sta = new boolean[] {false} ;
      T012R5_A9591Be_PoS = new String[] {""} ;
      T012R5_n9591Be_PoS = new boolean[] {false} ;
      T012R5_A396EmprCod = new String[] {""} ;
      T012R12_A396EmprCod = new String[] {""} ;
      T012R12_A8735Be_hdr = new int[1] ;
      T012R12_A8736Be_hdrr = new byte[1] ;
      T012R12_A8737Be_hdrp = new String[] {""} ;
      T012R13_A396EmprCod = new String[] {""} ;
      T012R13_A8735Be_hdr = new int[1] ;
      T012R13_A8736Be_hdrr = new byte[1] ;
      T012R13_A8737Be_hdrp = new String[] {""} ;
      T012R4_A8735Be_hdr = new int[1] ;
      T012R4_A8736Be_hdrr = new byte[1] ;
      T012R4_A8737Be_hdrp = new String[] {""} ;
      T012R4_A8738Be_FecE = new java.util.Date[] {GXutil.nullDate()} ;
      T012R4_n8738Be_FecE = new boolean[] {false} ;
      T012R4_A8739Be_Usu = new String[] {""} ;
      T012R4_n8739Be_Usu = new boolean[] {false} ;
      T012R4_A8748Be_Sta = new byte[1] ;
      T012R4_n8748Be_Sta = new boolean[] {false} ;
      T012R4_A9591Be_PoS = new String[] {""} ;
      T012R4_n9591Be_PoS = new boolean[] {false} ;
      T012R4_A396EmprCod = new String[] {""} ;
      T012R17_A396EmprCod = new String[] {""} ;
      T012R17_A8735Be_hdr = new int[1] ;
      T012R17_A8736Be_hdrr = new byte[1] ;
      T012R17_A8737Be_hdrp = new String[] {""} ;
      T012R17_A8740Be_Pza = new String[] {""} ;
      T012R17_A833TipDefCod = new short[1] ;
      T012R18_A396EmprCod = new String[] {""} ;
      T012R18_A8735Be_hdr = new int[1] ;
      T012R18_A8736Be_hdrr = new byte[1] ;
      T012R18_A8737Be_hdrp = new String[] {""} ;
      E8741Be_Ped = "" ;
      E8742Be_Dib = "" ;
      E8745Be_Col = "" ;
      E8747Be_Rack = "" ;
      E8746Be_Ubi = "" ;
      E8743Be_Kgs = DecimalUtil.ZERO ;
      E8744Be_Mts = DecimalUtil.ZERO ;
      T012R19_A396EmprCod = new String[] {""} ;
      T012R19_A8735Be_hdr = new int[1] ;
      T012R19_A8736Be_hdrr = new byte[1] ;
      T012R19_A8737Be_hdrp = new String[] {""} ;
      T012R19_A8740Be_Pza = new String[] {""} ;
      T012R19_A8741Be_Ped = new String[] {""} ;
      T012R19_n8741Be_Ped = new boolean[] {false} ;
      T012R19_A8742Be_Dib = new String[] {""} ;
      T012R19_n8742Be_Dib = new boolean[] {false} ;
      T012R19_A8745Be_Col = new String[] {""} ;
      T012R19_n8745Be_Col = new boolean[] {false} ;
      T012R19_A8747Be_Rack = new String[] {""} ;
      T012R19_n8747Be_Rack = new boolean[] {false} ;
      T012R19_A8746Be_Ubi = new String[] {""} ;
      T012R19_n8746Be_Ubi = new boolean[] {false} ;
      T012R19_A8743Be_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012R19_n8743Be_Kgs = new boolean[] {false} ;
      T012R19_A8744Be_Mts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012R19_n8744Be_Mts = new boolean[] {false} ;
      T012R19_A8866Be_ColN = new int[1] ;
      T012R19_n8866Be_ColN = new boolean[] {false} ;
      T012R19_A8867Be_TipDfC = new short[1] ;
      T012R19_n8867Be_TipDfC = new boolean[] {false} ;
      T012R20_A396EmprCod = new String[] {""} ;
      T012R20_A8735Be_hdr = new int[1] ;
      T012R20_A8736Be_hdrr = new byte[1] ;
      T012R20_A8737Be_hdrp = new String[] {""} ;
      T012R20_A8740Be_Pza = new String[] {""} ;
      T012R3_A396EmprCod = new String[] {""} ;
      T012R3_A8735Be_hdr = new int[1] ;
      T012R3_A8736Be_hdrr = new byte[1] ;
      T012R3_A8737Be_hdrp = new String[] {""} ;
      T012R3_A8740Be_Pza = new String[] {""} ;
      T012R3_A8741Be_Ped = new String[] {""} ;
      T012R3_n8741Be_Ped = new boolean[] {false} ;
      T012R3_A8742Be_Dib = new String[] {""} ;
      T012R3_n8742Be_Dib = new boolean[] {false} ;
      T012R3_A8745Be_Col = new String[] {""} ;
      T012R3_n8745Be_Col = new boolean[] {false} ;
      T012R3_A8747Be_Rack = new String[] {""} ;
      T012R3_n8747Be_Rack = new boolean[] {false} ;
      T012R3_A8746Be_Ubi = new String[] {""} ;
      T012R3_n8746Be_Ubi = new boolean[] {false} ;
      T012R3_A8743Be_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012R3_n8743Be_Kgs = new boolean[] {false} ;
      T012R3_A8744Be_Mts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012R3_n8744Be_Mts = new boolean[] {false} ;
      T012R3_A8866Be_ColN = new int[1] ;
      T012R3_n8866Be_ColN = new boolean[] {false} ;
      T012R3_A8867Be_TipDfC = new short[1] ;
      T012R3_n8867Be_TipDfC = new boolean[] {false} ;
      T012R2_A396EmprCod = new String[] {""} ;
      T012R2_A8735Be_hdr = new int[1] ;
      T012R2_A8736Be_hdrr = new byte[1] ;
      T012R2_A8737Be_hdrp = new String[] {""} ;
      T012R2_A8740Be_Pza = new String[] {""} ;
      T012R2_A8741Be_Ped = new String[] {""} ;
      T012R2_n8741Be_Ped = new boolean[] {false} ;
      T012R2_A8742Be_Dib = new String[] {""} ;
      T012R2_n8742Be_Dib = new boolean[] {false} ;
      T012R2_A8745Be_Col = new String[] {""} ;
      T012R2_n8745Be_Col = new boolean[] {false} ;
      T012R2_A8747Be_Rack = new String[] {""} ;
      T012R2_n8747Be_Rack = new boolean[] {false} ;
      T012R2_A8746Be_Ubi = new String[] {""} ;
      T012R2_n8746Be_Ubi = new boolean[] {false} ;
      T012R2_A8743Be_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012R2_n8743Be_Kgs = new boolean[] {false} ;
      T012R2_A8744Be_Mts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012R2_n8744Be_Mts = new boolean[] {false} ;
      T012R2_A8866Be_ColN = new int[1] ;
      T012R2_n8866Be_ColN = new boolean[] {false} ;
      T012R2_A8867Be_TipDfC = new short[1] ;
      T012R2_n8867Be_TipDfC = new boolean[] {false} ;
      T012R24_A396EmprCod = new String[] {""} ;
      T012R24_A8735Be_hdr = new int[1] ;
      T012R24_A8736Be_hdrr = new byte[1] ;
      T012R24_A8737Be_hdrp = new String[] {""} ;
      T012R24_A8740Be_Pza = new String[] {""} ;
      T012R24_A833TipDefCod = new short[1] ;
      T012R25_A396EmprCod = new String[] {""} ;
      T012R25_A8735Be_hdr = new int[1] ;
      T012R25_A8736Be_hdrr = new byte[1] ;
      T012R25_A8737Be_hdrp = new String[] {""} ;
      T012R25_A8740Be_Pza = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i8738Be_FecE = GXutil.resetTime( GXutil.nullDate() );
      i8739Be_Usu = "" ;
      i8741Be_Ped = "" ;
      i8742Be_Dib = "" ;
      i8745Be_Col = "" ;
      i8747Be_Rack = "" ;
      i8746Be_Ubi = "" ;
      i8743Be_Kgs = DecimalUtil.ZERO ;
      i8744Be_Mts = DecimalUtil.ZERO ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T012R26_A407EmprNom = new String[] {""} ;
      T012R26_n407EmprNom = new boolean[] {false} ;
      T012R28_A8749Be_KgsT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012R28_A8750Be_MtsT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012R28_A8751Be_PzsT = new int[1] ;
      ZV40Textoi = "" ;
      ZZ396EmprCod = "" ;
      ZZ8737Be_hdrp = "" ;
      ZZ407EmprNom = "" ;
      ZZ8738Be_FecE = GXutil.resetTime( GXutil.nullDate() );
      ZZ8739Be_Usu = "" ;
      ZZ8749Be_KgsT = DecimalUtil.ZERO ;
      ZZ8750Be_MtsT = DecimalUtil.ZERO ;
      ZZ9591Be_PoS = "" ;
      ZZV40Textoi = "" ;
      ZO8750Be_MtsT = DecimalUtil.ZERO ;
      ZO8749Be_KgsT = DecimalUtil.ZERO ;
      GXv_int11 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char8 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char10 = new String[1] ;
      GXv_int7 = new short[1] ;
      GXv_char9 = new String[1] ;
      ZV41Tipdefdsc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tinotbe__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tinotbe__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tinotbe__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tinotbe__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tinotbe__default(),
         new Object[] {
             new Object[] {
            T012R2_A396EmprCod, T012R2_A8735Be_hdr, T012R2_A8736Be_hdrr, T012R2_A8737Be_hdrp, T012R2_A8740Be_Pza, T012R2_A8741Be_Ped, T012R2_n8741Be_Ped, T012R2_A8742Be_Dib, T012R2_n8742Be_Dib, T012R2_A8745Be_Col,
            T012R2_n8745Be_Col, T012R2_A8747Be_Rack, T012R2_n8747Be_Rack, T012R2_A8746Be_Ubi, T012R2_n8746Be_Ubi, T012R2_A8743Be_Kgs, T012R2_n8743Be_Kgs, T012R2_A8744Be_Mts, T012R2_n8744Be_Mts, T012R2_A8866Be_ColN,
            T012R2_n8866Be_ColN, T012R2_A8867Be_TipDfC, T012R2_n8867Be_TipDfC
            }
            , new Object[] {
            T012R3_A396EmprCod, T012R3_A8735Be_hdr, T012R3_A8736Be_hdrr, T012R3_A8737Be_hdrp, T012R3_A8740Be_Pza, T012R3_A8741Be_Ped, T012R3_n8741Be_Ped, T012R3_A8742Be_Dib, T012R3_n8742Be_Dib, T012R3_A8745Be_Col,
            T012R3_n8745Be_Col, T012R3_A8747Be_Rack, T012R3_n8747Be_Rack, T012R3_A8746Be_Ubi, T012R3_n8746Be_Ubi, T012R3_A8743Be_Kgs, T012R3_n8743Be_Kgs, T012R3_A8744Be_Mts, T012R3_n8744Be_Mts, T012R3_A8866Be_ColN,
            T012R3_n8866Be_ColN, T012R3_A8867Be_TipDfC, T012R3_n8867Be_TipDfC
            }
            , new Object[] {
            T012R4_A8735Be_hdr, T012R4_A8736Be_hdrr, T012R4_A8737Be_hdrp, T012R4_A8738Be_FecE, T012R4_n8738Be_FecE, T012R4_A8739Be_Usu, T012R4_n8739Be_Usu, T012R4_A8748Be_Sta, T012R4_n8748Be_Sta, T012R4_A9591Be_PoS,
            T012R4_n9591Be_PoS, T012R4_A396EmprCod
            }
            , new Object[] {
            T012R5_A8735Be_hdr, T012R5_A8736Be_hdrr, T012R5_A8737Be_hdrp, T012R5_A8738Be_FecE, T012R5_n8738Be_FecE, T012R5_A8739Be_Usu, T012R5_n8739Be_Usu, T012R5_A8748Be_Sta, T012R5_n8748Be_Sta, T012R5_A9591Be_PoS,
            T012R5_n9591Be_PoS, T012R5_A396EmprCod
            }
            , new Object[] {
            T012R6_A407EmprNom, T012R6_n407EmprNom
            }
            , new Object[] {
            T012R8_A8749Be_KgsT, T012R8_A8750Be_MtsT, T012R8_A8751Be_PzsT
            }
            , new Object[] {
            T012R10_A8735Be_hdr, T012R10_A8736Be_hdrr, T012R10_A8737Be_hdrp, T012R10_A407EmprNom, T012R10_n407EmprNom, T012R10_A8738Be_FecE, T012R10_n8738Be_FecE, T012R10_A8739Be_Usu, T012R10_n8739Be_Usu, T012R10_A8748Be_Sta,
            T012R10_n8748Be_Sta, T012R10_A9591Be_PoS, T012R10_n9591Be_PoS, T012R10_A396EmprCod, T012R10_A8749Be_KgsT, T012R10_A8750Be_MtsT, T012R10_A8751Be_PzsT
            }
            , new Object[] {
            T012R11_A396EmprCod, T012R11_A8735Be_hdr, T012R11_A8736Be_hdrr, T012R11_A8737Be_hdrp
            }
            , new Object[] {
            T012R12_A396EmprCod, T012R12_A8735Be_hdr, T012R12_A8736Be_hdrr, T012R12_A8737Be_hdrp
            }
            , new Object[] {
            T012R13_A396EmprCod, T012R13_A8735Be_hdr, T012R13_A8736Be_hdrr, T012R13_A8737Be_hdrp
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T012R17_A396EmprCod, T012R17_A8735Be_hdr, T012R17_A8736Be_hdrr, T012R17_A8737Be_hdrp, T012R17_A8740Be_Pza, T012R17_A833TipDefCod
            }
            , new Object[] {
            T012R18_A396EmprCod, T012R18_A8735Be_hdr, T012R18_A8736Be_hdrr, T012R18_A8737Be_hdrp
            }
            , new Object[] {
            T012R19_A396EmprCod, T012R19_A8735Be_hdr, T012R19_A8736Be_hdrr, T012R19_A8737Be_hdrp, T012R19_A8740Be_Pza, T012R19_A8741Be_Ped, T012R19_n8741Be_Ped, T012R19_A8742Be_Dib, T012R19_n8742Be_Dib, T012R19_A8745Be_Col,
            T012R19_n8745Be_Col, T012R19_A8747Be_Rack, T012R19_n8747Be_Rack, T012R19_A8746Be_Ubi, T012R19_n8746Be_Ubi, T012R19_A8743Be_Kgs, T012R19_n8743Be_Kgs, T012R19_A8744Be_Mts, T012R19_n8744Be_Mts, T012R19_A8866Be_ColN,
            T012R19_n8866Be_ColN, T012R19_A8867Be_TipDfC, T012R19_n8867Be_TipDfC
            }
            , new Object[] {
            T012R20_A396EmprCod, T012R20_A8735Be_hdr, T012R20_A8736Be_hdrr, T012R20_A8737Be_hdrp, T012R20_A8740Be_Pza
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T012R24_A396EmprCod, T012R24_A8735Be_hdr, T012R24_A8736Be_hdrr, T012R24_A8737Be_hdrp, T012R24_A8740Be_Pza, T012R24_A833TipDefCod
            }
            , new Object[] {
            T012R25_A396EmprCod, T012R25_A8735Be_hdr, T012R25_A8736Be_hdrr, T012R25_A8737Be_hdrp, T012R25_A8740Be_Pza
            }
            , new Object[] {
            T012R26_A407EmprNom, T012R26_n407EmprNom
            }
            , new Object[] {
            T012R28_A8749Be_KgsT, T012R28_A8750Be_MtsT, T012R28_A8751Be_PzsT
            }
         }
      );
      Z8737Be_hdrp = "" ;
      A8737Be_hdrp = "" ;
      Z8736Be_hdrr = (byte)(0) ;
      A8736Be_hdrr = (byte)(0) ;
      Z8735Be_hdr = 0 ;
      A8735Be_hdr = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV43Pgmname = "TINOTBE" ;
      Z8866Be_ColN = 0 ;
      n8866Be_ColN = false ;
      E8866Be_ColN = 0 ;
      n8866Be_ColN = false ;
      i8866Be_ColN = 0 ;
      n8866Be_ColN = false ;
      A8866Be_ColN = 0 ;
      n8866Be_ColN = false ;
      Z8744Be_Mts = DecimalUtil.ZERO ;
      n8744Be_Mts = false ;
      O8744Be_Mts = DecimalUtil.ZERO ;
      n8744Be_Mts = false ;
      A8744Be_Mts = DecimalUtil.ZERO ;
      n8744Be_Mts = false ;
      T8744Be_Mts = DecimalUtil.ZERO ;
      n8744Be_Mts = false ;
      E8744Be_Mts = DecimalUtil.ZERO ;
      n8744Be_Mts = false ;
      i8744Be_Mts = DecimalUtil.ZERO ;
      n8744Be_Mts = false ;
      Z8743Be_Kgs = DecimalUtil.ZERO ;
      n8743Be_Kgs = false ;
      O8743Be_Kgs = DecimalUtil.ZERO ;
      n8743Be_Kgs = false ;
      A8743Be_Kgs = DecimalUtil.ZERO ;
      n8743Be_Kgs = false ;
      T8743Be_Kgs = DecimalUtil.ZERO ;
      n8743Be_Kgs = false ;
      E8743Be_Kgs = DecimalUtil.ZERO ;
      n8743Be_Kgs = false ;
      i8743Be_Kgs = DecimalUtil.ZERO ;
      n8743Be_Kgs = false ;
      Z8746Be_Ubi = "" ;
      n8746Be_Ubi = false ;
      A8746Be_Ubi = "" ;
      n8746Be_Ubi = false ;
      E8746Be_Ubi = "" ;
      n8746Be_Ubi = false ;
      i8746Be_Ubi = "" ;
      n8746Be_Ubi = false ;
      Z8747Be_Rack = "" ;
      n8747Be_Rack = false ;
      A8747Be_Rack = "" ;
      n8747Be_Rack = false ;
      E8747Be_Rack = "" ;
      n8747Be_Rack = false ;
      i8747Be_Rack = "" ;
      n8747Be_Rack = false ;
      Z8745Be_Col = "" ;
      n8745Be_Col = false ;
      E8745Be_Col = "" ;
      n8745Be_Col = false ;
      i8745Be_Col = "" ;
      n8745Be_Col = false ;
      A8745Be_Col = "" ;
      n8745Be_Col = false ;
      Z8742Be_Dib = "" ;
      n8742Be_Dib = false ;
      E8742Be_Dib = "" ;
      n8742Be_Dib = false ;
      i8742Be_Dib = "" ;
      n8742Be_Dib = false ;
      A8742Be_Dib = "" ;
      n8742Be_Dib = false ;
      Z8741Be_Ped = "" ;
      n8741Be_Ped = false ;
      E8741Be_Ped = "" ;
      n8741Be_Ped = false ;
      i8741Be_Ped = "" ;
      n8741Be_Ped = false ;
      A8741Be_Ped = "" ;
      n8741Be_Ped = false ;
      Z8739Be_Usu = "" ;
      n8739Be_Usu = false ;
      A8739Be_Usu = "" ;
      n8739Be_Usu = false ;
      i8739Be_Usu = "" ;
      n8739Be_Usu = false ;
      Z8738Be_FecE = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n8738Be_FecE = false ;
      A8738Be_FecE = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n8738Be_FecE = false ;
      i8738Be_FecE = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n8738Be_FecE = false ;
   }

   private byte wcpOA8736Be_hdrr ;
   private byte Z8736Be_hdrr ;
   private byte Z8748Be_Sta ;
   private byte GxWebError ;
   private byte A8736Be_hdrr ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A8748Be_Sta ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ8736Be_hdrr ;
   private byte ZZ8748Be_Sta ;
   private byte GXv_int6[] ;
   private short wcpOAV33Barordlin ;
   private short Z8867Be_TipDfC ;
   private short nRcdDeleted_1195 ;
   private short nRcdExists_1195 ;
   private short nIsMod_1195 ;
   private short A8867Be_TipDfC ;
   private short AV33Barordlin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1195 ;
   private short RcdFound1195 ;
   private short nBlankRcdUsr1195 ;
   private short RcdFound1194 ;
   private short nIsDirty_1194 ;
   private short nIsDirty_1195 ;
   private short GXv_int7[] ;
   private int wcpOA8735Be_hdr ;
   private int wcpOAV39Barcolnum ;
   private int Z8735Be_hdr ;
   private int O8751Be_PzsT ;
   private int nRC_GXsfl_80 ;
   private int nGXsfl_80_idx=1 ;
   private int Z8866Be_ColN ;
   private int A8735Be_hdr ;
   private int A8866Be_ColN ;
   private int AV39Barcolnum ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBe_hdr_Enabled ;
   private int edtBe_hdrr_Enabled ;
   private int edtBe_hdrp_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtBe_FecE_Enabled ;
   private int edtBe_Usu_Enabled ;
   private int edtBe_Sta_Enabled ;
   private int edtBe_KgsT_Enabled ;
   private int edtBe_MtsT_Enabled ;
   private int A8751Be_PzsT ;
   private int edtBe_PzsT_Enabled ;
   private int edtBe_PoS_Enabled ;
   private int B8751Be_PzsT ;
   private int edtavnRcdDeleted_1195_Enabled ;
   private int edtBe_Pza_Enabled ;
   private int edtBe_Ped_Enabled ;
   private int edtBe_Dib_Enabled ;
   private int edtBe_Kgs_Enabled ;
   private int edtBe_Mts_Enabled ;
   private int edtBe_Col_Enabled ;
   private int edtBe_Ubi_Enabled ;
   private int edtBe_Rack_Enabled ;
   private int edtBe_ColN_Enabled ;
   private int edtBe_TipDfC_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int s8751Be_PzsT ;
   private int GX_JID ;
   private int Z8751Be_PzsT ;
   private int E8866Be_ColN ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtBe_Rack_Enabled ;
   private int defedtBe_Ubi_Enabled ;
   private int defedtBe_Col_Enabled ;
   private int defedtBe_Dib_Enabled ;
   private int defedtBe_Ped_Enabled ;
   private int defedtBe_Pza_Enabled ;
   private int i8866Be_ColN ;
   private int i8751Be_PzsT ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtBe_PoS_Backcolor ;
   private int edtBe_PzsT_Backcolor ;
   private int edtBe_MtsT_Backcolor ;
   private int edtBe_KgsT_Backcolor ;
   private int edtBe_Sta_Backcolor ;
   private int edtBe_Usu_Backcolor ;
   private int edtBe_FecE_Backcolor ;
   private int edtBe_hdrp_Backcolor ;
   private int edtBe_hdrr_Backcolor ;
   private int edtBe_hdr_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ8735Be_hdr ;
   private int ZZ8751Be_PzsT ;
   private int ZO8751Be_PzsT ;
   private int GXv_int11[] ;
   private int GXv_int5[] ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal O8750Be_MtsT ;
   private java.math.BigDecimal O8749Be_KgsT ;
   private java.math.BigDecimal Z8743Be_Kgs ;
   private java.math.BigDecimal Z8744Be_Mts ;
   private java.math.BigDecimal O8744Be_Mts ;
   private java.math.BigDecimal O8743Be_Kgs ;
   private java.math.BigDecimal A8749Be_KgsT ;
   private java.math.BigDecimal A8750Be_MtsT ;
   private java.math.BigDecimal B8750Be_MtsT ;
   private java.math.BigDecimal B8749Be_KgsT ;
   private java.math.BigDecimal s8750Be_MtsT ;
   private java.math.BigDecimal s8749Be_KgsT ;
   private java.math.BigDecimal A8743Be_Kgs ;
   private java.math.BigDecimal A8744Be_Mts ;
   private java.math.BigDecimal T8744Be_Mts ;
   private java.math.BigDecimal T8743Be_Kgs ;
   private java.math.BigDecimal Z8749Be_KgsT ;
   private java.math.BigDecimal Z8750Be_MtsT ;
   private java.math.BigDecimal E8743Be_Kgs ;
   private java.math.BigDecimal E8744Be_Mts ;
   private java.math.BigDecimal i8743Be_Kgs ;
   private java.math.BigDecimal i8744Be_Mts ;
   private java.math.BigDecimal ZZ8749Be_KgsT ;
   private java.math.BigDecimal ZZ8750Be_MtsT ;
   private java.math.BigDecimal ZO8750Be_MtsT ;
   private java.math.BigDecimal ZO8749Be_KgsT ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA8737Be_hdrp ;
   private String wcpOAV34Maqcod ;
   private String wcpOAV35Maqloc ;
   private String wcpOAV36Barser ;
   private String wcpOAV37Barserdsc ;
   private String wcpOAV38Barcolnom ;
   private String Z396EmprCod ;
   private String Z8737Be_hdrp ;
   private String Z8739Be_Usu ;
   private String Z9591Be_PoS ;
   private String Z8740Be_Pza ;
   private String Z8741Be_Ped ;
   private String Z8742Be_Dib ;
   private String Z8745Be_Col ;
   private String Z8747Be_Rack ;
   private String Z8746Be_Ubi ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV41Tipdefdsc ;
   private String Gx_mode ;
   private String A8737Be_hdrp ;
   private String A8742Be_Dib ;
   private String A8741Be_Ped ;
   private String A8745Be_Col ;
   private String A8740Be_Pza ;
   private String AV34Maqcod ;
   private String AV35Maqloc ;
   private String AV36Barser ;
   private String AV37Barserdsc ;
   private String AV38Barcolnom ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBe_FecE_Internalname ;
   private String sGXsfl_80_idx="0001" ;
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
   private String edtBe_hdr_Internalname ;
   private String edtBe_hdr_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBe_hdrr_Internalname ;
   private String edtBe_hdrr_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBe_hdrp_Internalname ;
   private String edtBe_hdrp_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtBe_FecE_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtBe_Usu_Internalname ;
   private String A8739Be_Usu ;
   private String edtBe_Usu_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtBe_Sta_Internalname ;
   private String edtBe_Sta_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtBe_KgsT_Internalname ;
   private String edtBe_KgsT_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtBe_MtsT_Internalname ;
   private String edtBe_MtsT_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtBe_PzsT_Internalname ;
   private String edtBe_PzsT_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtBe_PoS_Internalname ;
   private String A9591Be_PoS ;
   private String edtBe_PoS_Jsonclick ;
   private String sMode1195 ;
   private String edtavnRcdDeleted_1195_Internalname ;
   private String edtBe_Pza_Internalname ;
   private String edtBe_Ped_Internalname ;
   private String edtBe_Dib_Internalname ;
   private String edtBe_Kgs_Internalname ;
   private String edtBe_Mts_Internalname ;
   private String edtBe_Col_Internalname ;
   private String edtBe_Ubi_Internalname ;
   private String edtBe_Rack_Internalname ;
   private String edtBe_ColN_Internalname ;
   private String edtBe_TipDfC_Internalname ;
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
   private String AV40Textoi ;
   private String AV8UsurCod ;
   private String AV43Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1194 ;
   private String GXCCtl ;
   private String A8746Be_Ubi ;
   private String A8747Be_Rack ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String Gx_msg ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String E8741Be_Ped ;
   private String E8742Be_Dib ;
   private String E8745Be_Col ;
   private String E8747Be_Rack ;
   private String E8746Be_Ubi ;
   private String sGXsfl_80_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1195_Jsonclick ;
   private String edtBe_Pza_Jsonclick ;
   private String edtBe_Ped_Jsonclick ;
   private String edtBe_Dib_Jsonclick ;
   private String edtBe_Kgs_Jsonclick ;
   private String edtBe_Mts_Jsonclick ;
   private String edtBe_Col_Jsonclick ;
   private String edtBe_Ubi_Jsonclick ;
   private String edtBe_Rack_Jsonclick ;
   private String edtBe_ColN_Jsonclick ;
   private String edtBe_TipDfC_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i8739Be_Usu ;
   private String i8741Be_Ped ;
   private String i8742Be_Dib ;
   private String i8745Be_Col ;
   private String i8747Be_Rack ;
   private String i8746Be_Ubi ;
   private String subGrid1_Header ;
   private String ZV40Textoi ;
   private String ZZ396EmprCod ;
   private String ZZ8737Be_hdrp ;
   private String ZZ407EmprNom ;
   private String ZZ8739Be_Usu ;
   private String ZZ9591Be_PoS ;
   private String ZZV40Textoi ;
   private String GXv_char8[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char10[] ;
   private String GXv_char9[] ;
   private String ZV41Tipdefdsc ;
   private java.util.Date Z8738Be_FecE ;
   private java.util.Date A8738Be_FecE ;
   private java.util.Date i8738Be_FecE ;
   private java.util.Date ZZ8738Be_FecE ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n8867Be_TipDfC ;
   private boolean n8742Be_Dib ;
   private boolean n8741Be_Ped ;
   private boolean n8745Be_Col ;
   private boolean n8866Be_ColN ;
   private boolean wbErr ;
   private boolean bGXsfl_80_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n8738Be_FecE ;
   private boolean n8739Be_Usu ;
   private boolean n8748Be_Sta ;
   private boolean n9591Be_PoS ;
   private boolean returnInSub ;
   private boolean n8747Be_Rack ;
   private boolean n8746Be_Ubi ;
   private boolean n8743Be_Kgs ;
   private boolean n8744Be_Mts ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T012R6_A407EmprNom ;
   private boolean[] T012R6_n407EmprNom ;
   private java.math.BigDecimal[] T012R8_A8749Be_KgsT ;
   private java.math.BigDecimal[] T012R8_A8750Be_MtsT ;
   private int[] T012R8_A8751Be_PzsT ;
   private int[] T012R10_A8735Be_hdr ;
   private byte[] T012R10_A8736Be_hdrr ;
   private String[] T012R10_A8737Be_hdrp ;
   private String[] T012R10_A407EmprNom ;
   private boolean[] T012R10_n407EmprNom ;
   private java.util.Date[] T012R10_A8738Be_FecE ;
   private boolean[] T012R10_n8738Be_FecE ;
   private String[] T012R10_A8739Be_Usu ;
   private boolean[] T012R10_n8739Be_Usu ;
   private byte[] T012R10_A8748Be_Sta ;
   private boolean[] T012R10_n8748Be_Sta ;
   private String[] T012R10_A9591Be_PoS ;
   private boolean[] T012R10_n9591Be_PoS ;
   private String[] T012R10_A396EmprCod ;
   private java.math.BigDecimal[] T012R10_A8749Be_KgsT ;
   private java.math.BigDecimal[] T012R10_A8750Be_MtsT ;
   private int[] T012R10_A8751Be_PzsT ;
   private String[] T012R11_A396EmprCod ;
   private int[] T012R11_A8735Be_hdr ;
   private byte[] T012R11_A8736Be_hdrr ;
   private String[] T012R11_A8737Be_hdrp ;
   private int[] T012R5_A8735Be_hdr ;
   private byte[] T012R5_A8736Be_hdrr ;
   private String[] T012R5_A8737Be_hdrp ;
   private java.util.Date[] T012R5_A8738Be_FecE ;
   private boolean[] T012R5_n8738Be_FecE ;
   private String[] T012R5_A8739Be_Usu ;
   private boolean[] T012R5_n8739Be_Usu ;
   private byte[] T012R5_A8748Be_Sta ;
   private boolean[] T012R5_n8748Be_Sta ;
   private String[] T012R5_A9591Be_PoS ;
   private boolean[] T012R5_n9591Be_PoS ;
   private String[] T012R5_A396EmprCod ;
   private String[] T012R12_A396EmprCod ;
   private int[] T012R12_A8735Be_hdr ;
   private byte[] T012R12_A8736Be_hdrr ;
   private String[] T012R12_A8737Be_hdrp ;
   private String[] T012R13_A396EmprCod ;
   private int[] T012R13_A8735Be_hdr ;
   private byte[] T012R13_A8736Be_hdrr ;
   private String[] T012R13_A8737Be_hdrp ;
   private int[] T012R4_A8735Be_hdr ;
   private byte[] T012R4_A8736Be_hdrr ;
   private String[] T012R4_A8737Be_hdrp ;
   private java.util.Date[] T012R4_A8738Be_FecE ;
   private boolean[] T012R4_n8738Be_FecE ;
   private String[] T012R4_A8739Be_Usu ;
   private boolean[] T012R4_n8739Be_Usu ;
   private byte[] T012R4_A8748Be_Sta ;
   private boolean[] T012R4_n8748Be_Sta ;
   private String[] T012R4_A9591Be_PoS ;
   private boolean[] T012R4_n9591Be_PoS ;
   private String[] T012R4_A396EmprCod ;
   private String[] T012R17_A396EmprCod ;
   private int[] T012R17_A8735Be_hdr ;
   private byte[] T012R17_A8736Be_hdrr ;
   private String[] T012R17_A8737Be_hdrp ;
   private String[] T012R17_A8740Be_Pza ;
   private short[] T012R17_A833TipDefCod ;
   private String[] T012R18_A396EmprCod ;
   private int[] T012R18_A8735Be_hdr ;
   private byte[] T012R18_A8736Be_hdrr ;
   private String[] T012R18_A8737Be_hdrp ;
   private String[] T012R19_A396EmprCod ;
   private int[] T012R19_A8735Be_hdr ;
   private byte[] T012R19_A8736Be_hdrr ;
   private String[] T012R19_A8737Be_hdrp ;
   private String[] T012R19_A8740Be_Pza ;
   private String[] T012R19_A8741Be_Ped ;
   private boolean[] T012R19_n8741Be_Ped ;
   private String[] T012R19_A8742Be_Dib ;
   private boolean[] T012R19_n8742Be_Dib ;
   private String[] T012R19_A8745Be_Col ;
   private boolean[] T012R19_n8745Be_Col ;
   private String[] T012R19_A8747Be_Rack ;
   private boolean[] T012R19_n8747Be_Rack ;
   private String[] T012R19_A8746Be_Ubi ;
   private boolean[] T012R19_n8746Be_Ubi ;
   private java.math.BigDecimal[] T012R19_A8743Be_Kgs ;
   private boolean[] T012R19_n8743Be_Kgs ;
   private java.math.BigDecimal[] T012R19_A8744Be_Mts ;
   private boolean[] T012R19_n8744Be_Mts ;
   private int[] T012R19_A8866Be_ColN ;
   private boolean[] T012R19_n8866Be_ColN ;
   private short[] T012R19_A8867Be_TipDfC ;
   private boolean[] T012R19_n8867Be_TipDfC ;
   private String[] T012R20_A396EmprCod ;
   private int[] T012R20_A8735Be_hdr ;
   private byte[] T012R20_A8736Be_hdrr ;
   private String[] T012R20_A8737Be_hdrp ;
   private String[] T012R20_A8740Be_Pza ;
   private String[] T012R3_A396EmprCod ;
   private int[] T012R3_A8735Be_hdr ;
   private byte[] T012R3_A8736Be_hdrr ;
   private String[] T012R3_A8737Be_hdrp ;
   private String[] T012R3_A8740Be_Pza ;
   private String[] T012R3_A8741Be_Ped ;
   private boolean[] T012R3_n8741Be_Ped ;
   private String[] T012R3_A8742Be_Dib ;
   private boolean[] T012R3_n8742Be_Dib ;
   private String[] T012R3_A8745Be_Col ;
   private boolean[] T012R3_n8745Be_Col ;
   private String[] T012R3_A8747Be_Rack ;
   private boolean[] T012R3_n8747Be_Rack ;
   private String[] T012R3_A8746Be_Ubi ;
   private boolean[] T012R3_n8746Be_Ubi ;
   private java.math.BigDecimal[] T012R3_A8743Be_Kgs ;
   private boolean[] T012R3_n8743Be_Kgs ;
   private java.math.BigDecimal[] T012R3_A8744Be_Mts ;
   private boolean[] T012R3_n8744Be_Mts ;
   private int[] T012R3_A8866Be_ColN ;
   private boolean[] T012R3_n8866Be_ColN ;
   private short[] T012R3_A8867Be_TipDfC ;
   private boolean[] T012R3_n8867Be_TipDfC ;
   private String[] T012R2_A396EmprCod ;
   private int[] T012R2_A8735Be_hdr ;
   private byte[] T012R2_A8736Be_hdrr ;
   private String[] T012R2_A8737Be_hdrp ;
   private String[] T012R2_A8740Be_Pza ;
   private String[] T012R2_A8741Be_Ped ;
   private boolean[] T012R2_n8741Be_Ped ;
   private String[] T012R2_A8742Be_Dib ;
   private boolean[] T012R2_n8742Be_Dib ;
   private String[] T012R2_A8745Be_Col ;
   private boolean[] T012R2_n8745Be_Col ;
   private String[] T012R2_A8747Be_Rack ;
   private boolean[] T012R2_n8747Be_Rack ;
   private String[] T012R2_A8746Be_Ubi ;
   private boolean[] T012R2_n8746Be_Ubi ;
   private java.math.BigDecimal[] T012R2_A8743Be_Kgs ;
   private boolean[] T012R2_n8743Be_Kgs ;
   private java.math.BigDecimal[] T012R2_A8744Be_Mts ;
   private boolean[] T012R2_n8744Be_Mts ;
   private int[] T012R2_A8866Be_ColN ;
   private boolean[] T012R2_n8866Be_ColN ;
   private short[] T012R2_A8867Be_TipDfC ;
   private boolean[] T012R2_n8867Be_TipDfC ;
   private String[] T012R24_A396EmprCod ;
   private int[] T012R24_A8735Be_hdr ;
   private byte[] T012R24_A8736Be_hdrr ;
   private String[] T012R24_A8737Be_hdrp ;
   private String[] T012R24_A8740Be_Pza ;
   private short[] T012R24_A833TipDefCod ;
   private String[] T012R25_A396EmprCod ;
   private int[] T012R25_A8735Be_hdr ;
   private byte[] T012R25_A8736Be_hdrr ;
   private String[] T012R25_A8737Be_hdrp ;
   private String[] T012R25_A8740Be_Pza ;
   private String[] T012R26_A407EmprNom ;
   private boolean[] T012R26_n407EmprNom ;
   private java.math.BigDecimal[] T012R28_A8749Be_KgsT ;
   private java.math.BigDecimal[] T012R28_A8750Be_MtsT ;
   private int[] T012R28_A8751Be_PzsT ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tinotbe__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tinotbe__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tinotbe__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tinotbe__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tinotbe__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T012R2", "SELECT EmprCod, Be_hdr, Be_hdrr, Be_hdrp, Be_Pza, Be_Ped, Be_Dib, Be_Col, Be_Rack, Be_Ubi, Be_Kgs, Be_Mts, Be_ColN, Be_TipDfC FROM TXPINOTB1 WHERE EmprCod = ? AND Be_hdr = ? AND Be_hdrr = ? AND Be_hdrp = ? AND Be_Pza = ?  FOR UPDATE OF Be_Ped, Be_Dib, Be_Col, Be_Rack, Be_Ubi, Be_Kgs, Be_Mts, Be_ColN, Be_TipDfC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012R3", "SELECT EmprCod, Be_hdr, Be_hdrr, Be_hdrp, Be_Pza, Be_Ped, Be_Dib, Be_Col, Be_Rack, Be_Ubi, Be_Kgs, Be_Mts, Be_ColN, Be_TipDfC FROM TXPINOTB1 WHERE EmprCod = ? AND Be_hdr = ? AND Be_hdrr = ? AND Be_hdrp = ? AND Be_Pza = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012R4", "SELECT Be_hdr, Be_hdrr, Be_hdrp, Be_FecE, Be_Usu, Be_Sta, Be_PoS, EmprCod FROM TXPINOTBE WHERE EmprCod = ? AND Be_hdr = ? AND Be_hdrr = ? AND Be_hdrp = ?  FOR UPDATE OF Be_FecE, Be_Usu, Be_Sta, Be_PoS NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012R5", "SELECT Be_hdr, Be_hdrr, Be_hdrp, Be_FecE, Be_Usu, Be_Sta, Be_PoS, EmprCod FROM TXPINOTBE WHERE EmprCod = ? AND Be_hdr = ? AND Be_hdrr = ? AND Be_hdrp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012R6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012R8", "SELECT COALESCE( T1.Be_KgsT, 0) AS Be_KgsT, COALESCE( T1.Be_MtsT, 0) AS Be_MtsT, COALESCE( T1.Be_PzsT, 0) AS Be_PzsT FROM (SELECT SUM(Be_Kgs) AS Be_KgsT, EmprCod, Be_hdr, Be_hdrr, Be_hdrp, SUM(Be_Mts) AS Be_MtsT, COUNT(*) AS Be_PzsT FROM TXPINOTB1 GROUP BY EmprCod, Be_hdr, Be_hdrr, Be_hdrp ) T1 WHERE T1.EmprCod = ? AND T1.Be_hdr = ? AND T1.Be_hdrr = ? AND T1.Be_hdrp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012R10", "SELECT /*+ FIRST_ROWS(1) */ TM1.Be_hdr, TM1.Be_hdrr, TM1.Be_hdrp, T2.EmprNom, TM1.Be_FecE, TM1.Be_Usu, TM1.Be_Sta, TM1.Be_PoS, TM1.EmprCod, COALESCE( T3.Be_KgsT, 0) AS Be_KgsT, COALESCE( T3.Be_MtsT, 0) AS Be_MtsT, COALESCE( T3.Be_PzsT, 0) AS Be_PzsT FROM ((TXPINOTBE TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(Be_Kgs) AS Be_KgsT, EmprCod, Be_hdr, Be_hdrr, Be_hdrp, SUM(Be_Mts) AS Be_MtsT, COUNT(*) AS Be_PzsT FROM TXPINOTB1 GROUP BY EmprCod, Be_hdr, Be_hdrr, Be_hdrp ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.Be_hdr = TM1.Be_hdr AND T3.Be_hdrr = TM1.Be_hdrr AND T3.Be_hdrp = TM1.Be_hdrp) WHERE TM1.EmprCod = ? and TM1.Be_hdr = ? and TM1.Be_hdrr = ? and TM1.Be_hdrp = ? ORDER BY TM1.EmprCod, TM1.Be_hdr, TM1.Be_hdrr, TM1.Be_hdrp ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012R11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Be_hdr, Be_hdrr, Be_hdrp FROM TXPINOTBE WHERE EmprCod = ? AND Be_hdr = ? AND Be_hdrr = ? AND Be_hdrp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012R12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Be_hdr, Be_hdrr, Be_hdrp FROM TXPINOTBE WHERE EmprCod = ? and Be_hdr = ? and Be_hdrr = ? and Be_hdrp = ? ORDER BY EmprCod, Be_hdr, Be_hdrr, Be_hdrp) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012R13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Be_hdr, Be_hdrr, Be_hdrp FROM TXPINOTBE WHERE EmprCod = ? and Be_hdr = ? and Be_hdrr = ? and Be_hdrp = ? ORDER BY EmprCod DESC, Be_hdr DESC, Be_hdrr DESC, Be_hdrp DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T012R14", "INSERT INTO TXPINOTBE(Be_hdr, Be_hdrr, Be_hdrp, Be_FecE, Be_Usu, Be_Sta, Be_PoS, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPINOTBE")
         ,new UpdateCursor("T012R15", "UPDATE TXPINOTBE SET Be_FecE=?, Be_Usu=?, Be_Sta=?, Be_PoS=?  WHERE EmprCod = ? AND Be_hdr = ? AND Be_hdrr = ? AND Be_hdrp = ?", GX_NOMASK, "TXPINOTBE")
         ,new UpdateCursor("T012R16", "DELETE FROM TXPINOTBE  WHERE EmprCod = ? AND Be_hdr = ? AND Be_hdrr = ? AND Be_hdrp = ?", GX_NOMASK, "TXPINOTBE")
         ,new ForEachCursor("T012R17", "SELECT * FROM (SELECT EmprCod, Be_hdr, Be_hdrr, Be_hdrp, Be_Pza, TipDefCod FROM TXPINOTBd WHERE EmprCod = ? AND Be_hdr = ? AND Be_hdrr = ? AND Be_hdrp = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012R18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Be_hdr, Be_hdrr, Be_hdrp FROM TXPINOTBE WHERE EmprCod = ? and Be_hdr = ? and Be_hdrr = ? and Be_hdrp = ? ORDER BY EmprCod, Be_hdr, Be_hdrr, Be_hdrp ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012R19", "SELECT EmprCod, Be_hdr, Be_hdrr, Be_hdrp, Be_Pza, Be_Ped, Be_Dib, Be_Col, Be_Rack, Be_Ubi, Be_Kgs, Be_Mts, Be_ColN, Be_TipDfC FROM TXPINOTB1 WHERE EmprCod = ? and Be_hdr = ? and Be_hdrr = ? and Be_hdrp = ? and Be_Pza = ? ORDER BY EmprCod, Be_hdr, Be_hdrr, Be_hdrp, Be_Pza ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012R20", "SELECT EmprCod, Be_hdr, Be_hdrr, Be_hdrp, Be_Pza FROM TXPINOTB1 WHERE EmprCod = ? AND Be_hdr = ? AND Be_hdrr = ? AND Be_hdrp = ? AND Be_Pza = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T012R21", "INSERT INTO TXPINOTB1(EmprCod, Be_hdr, Be_hdrr, Be_hdrp, Be_Pza, Be_Ped, Be_Dib, Be_Col, Be_Rack, Be_Ubi, Be_Kgs, Be_Mts, Be_ColN, Be_TipDfC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPINOTB1")
         ,new UpdateCursor("T012R22", "UPDATE TXPINOTB1 SET Be_Ped=?, Be_Dib=?, Be_Col=?, Be_Rack=?, Be_Ubi=?, Be_Kgs=?, Be_Mts=?, Be_ColN=?, Be_TipDfC=?  WHERE EmprCod = ? AND Be_hdr = ? AND Be_hdrr = ? AND Be_hdrp = ? AND Be_Pza = ?", GX_NOMASK, "TXPINOTB1")
         ,new UpdateCursor("T012R23", "DELETE FROM TXPINOTB1  WHERE EmprCod = ? AND Be_hdr = ? AND Be_hdrr = ? AND Be_hdrp = ? AND Be_Pza = ?", GX_NOMASK, "TXPINOTB1")
         ,new ForEachCursor("T012R24", "SELECT * FROM (SELECT EmprCod, Be_hdr, Be_hdrr, Be_hdrp, Be_Pza, TipDefCod FROM TXPINOTBd WHERE EmprCod = ? AND Be_hdr = ? AND Be_hdrr = ? AND Be_hdrp = ? AND Be_Pza = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012R25", "SELECT EmprCod, Be_hdr, Be_hdrr, Be_hdrp, Be_Pza FROM TXPINOTB1 WHERE EmprCod = ? and Be_hdr = ? and Be_hdrr = ? and Be_hdrp = ? ORDER BY EmprCod, Be_hdr, Be_hdrr, Be_hdrp, Be_Pza ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012R26", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012R28", "SELECT COALESCE( T1.Be_KgsT, 0) AS Be_KgsT, COALESCE( T1.Be_MtsT, 0) AS Be_MtsT, COALESCE( T1.Be_PzsT, 0) AS Be_PzsT FROM (SELECT SUM(Be_Kgs) AS Be_KgsT, EmprCod, Be_hdr, Be_hdrr, Be_hdrp, SUM(Be_Mts) AS Be_MtsT, COUNT(*) AS Be_PzsT FROM TXPINOTB1 GROUP BY EmprCod, Be_hdr, Be_hdrr, Be_hdrp ) T1 WHERE T1.EmprCod = ? AND T1.Be_hdr = ? AND T1.Be_hdrr = ? AND T1.Be_hdrp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 3);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((int[]) buf[16])[0] = rslt.getInt(12);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[4], false);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 8);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[8]).byteValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 1);
               }
               stmt.setString(8, (String)parms[11], 3);
               return;
            case 11 :
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
                  stmt.setString(2, (String)parms[3], 8);
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setByte(7, ((Number) parms[10]).byteValue());
               stmt.setString(8, (String)parms[11], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 20);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 16);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[10], 13);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 10);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[14], 10);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[20]).intValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[22]).shortValue());
               }
               return;
            case 18 :
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
                  stmt.setString(2, (String)parms[3], 16);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 13);
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
                  stmt.setString(5, (String)parms[9], 10);
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
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               stmt.setString(10, (String)parms[18], 3);
               stmt.setInt(11, ((Number) parms[19]).intValue());
               stmt.setByte(12, ((Number) parms[20]).byteValue());
               stmt.setString(13, (String)parms[21], 1);
               stmt.setString(14, (String)parms[22], 9);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

