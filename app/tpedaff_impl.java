package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpedaff_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"ARTADICOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxdlaartadicod1CE1542( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"PAFADIPRE") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11604PArtId = (int)(GXutil.lval( httpContext.GetPar( "PArtId"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11604PArtId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11604PArtId), 8, 0));
         A11611PAFOrd = (short)(GXutil.lval( httpContext.GetPar( "PAFOrd"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11611PAFOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11611PAFOrd), 4, 0));
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A7727ArtAdiCod = (short)(GXutil.lval( httpContext.GetPar( "ArtAdiCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx5asapafadipre1CE1542( Gx_mode, A396EmprCod, A11604PArtId, A11611PAFOrd, A457FasCod, A7727ArtAdiCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"vPRECIO") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11604PArtId = (int)(GXutil.lval( httpContext.GetPar( "PArtId"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11604PArtId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11604PArtId), 8, 0));
         A11611PAFOrd = (short)(GXutil.lval( httpContext.GetPar( "PAFOrd"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11611PAFOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11611PAFOrd), 4, 0));
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A7727ArtAdiCod = (short)(GXutil.lval( httpContext.GetPar( "ArtAdiCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asaprecio1CE1542( Gx_mode, A396EmprCod, A11604PArtId, A11611PAFOrd, A457FasCod, A7727ArtAdiCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7727ArtAdiCod = (short)(GXutil.lval( httpContext.GetPar( "ArtAdiCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_19( A396EmprCod, A7727ArtAdiCod) ;
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
            A11604PArtId = (int)(GXutil.lval( httpContext.GetPar( "PArtId"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11604PArtId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11604PArtId), 8, 0));
            A11611PAFOrd = (short)(GXutil.lval( httpContext.GetPar( "PAFOrd"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11611PAFOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11611PAFOrd), 4, 0));
            A457FasCod = httpContext.GetPar( "FasCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            A460FasDsc = httpContext.GetPar( "FasDsc") ;
            httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Adicionales p/Fases", ""), (short)(0)) ;
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
      Gx_mode = httpContext.GetPar( "Mode") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public tpedaff_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpedaff_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpedaff_impl.class ));
   }

   public tpedaff_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      dynArtAdiCod = new HTMLChoice();
      cmbPAFAdiUni = new HTMLChoice();
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
      /* Execute user event: Exit */
      e111CE2 ();
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDAFF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDAFF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDAFF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDAFF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPEDAFF.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDAFF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDAFF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDAFF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDAFF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Pedido Artextil", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDAFF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPArtId_Internalname, GXutil.ltrim( localUtil.ntoc( A11604PArtId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPArtId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11604PArtId), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11604PArtId), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPArtId_Jsonclick, 0, "", "", "", "", "", 1, edtPArtId_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDAFF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDAFF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDAFF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDAFF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDAFF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDAFF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDAFF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, "#", "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDAFF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPAFOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A11611PAFOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPAFOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11611PAFOrd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11611PAFOrd), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPAFOrd_Jsonclick, 0, "", "", "", "", "", 1, edtPAFOrd_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDAFF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDAFF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Codigo Fase", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDAFF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDAFF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Descripcion de Fase", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDAFF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDAFF.htm");
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
         nBlankRcdCount1542 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1542 = (short)(1) ;
            scanStart1CE1542( ) ;
            while ( RcdFound1542 != 0 )
            {
               init_level_properties1542( ) ;
               getByPrimaryKey1CE1542( ) ;
               addRow1CE1542( ) ;
               scanNext1CE1542( ) ;
            }
            scanEnd1CE1542( ) ;
            nBlankRcdCount1542 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1CE1542( ) ;
         standaloneModal1CE1542( ) ;
         sMode1542 = Gx_mode ;
         while ( nGXsfl_65_idx < nRC_GXsfl_65 )
         {
            bGXsfl_65_Refreshing = true ;
            readRow1CE1542( ) ;
            edtavnRcdDeleted_1542_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1542_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1542_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1542_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            dynArtAdiCod.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ARTADICOD_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, dynArtAdiCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynArtAdiCod.getEnabled(), 5, 0), !bGXsfl_65_Refreshing);
            edtPAFAdiPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAFADIPRE_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPAFAdiPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPAFAdiPre_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            cmbPAFAdiUni.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "PAFADIUNI_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbPAFAdiUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPAFAdiUni.getEnabled(), 5, 0), !bGXsfl_65_Refreshing);
            if ( ( nRcdExists_1542 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1CE1542( ) ;
            }
            sendRow1CE1542( ) ;
            bGXsfl_65_Refreshing = false ;
         }
         Gx_mode = sMode1542 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1542 = (short)(5) ;
         nRcdExists_1542 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1CE1542( ) ;
            while ( RcdFound1542 != 0 )
            {
               sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_651542( ) ;
               init_level_properties1542( ) ;
               standaloneNotModal1CE1542( ) ;
               getByPrimaryKey1CE1542( ) ;
               standaloneModal1CE1542( ) ;
               addRow1CE1542( ) ;
               scanNext1CE1542( ) ;
            }
            scanEnd1CE1542( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1542 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_651542( ) ;
      initAll1CE1542( ) ;
      init_level_properties1542( ) ;
      nRcdExists_1542 = (short)(0) ;
      nIsMod_1542 = (short)(0) ;
      nRcdDeleted_1542 = (short)(0) ;
      nBlankRcdCount1542 = (short)(nBlankRcdUsr1542+nBlankRcdCount1542) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1542 > 0 )
      {
         standaloneNotModal1CE1542( ) ;
         standaloneModal1CE1542( ) ;
         addRow1CE1542( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = dynArtAdiCod.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1542 = (short)(nBlankRcdCount1542-1) ;
      }
      Gx_mode = sMode1542 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDAFF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDAFF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDAFF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDAFF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPEDAFF.htm");
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
      e121CE2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z11604PArtId = (int)(localUtil.ctol( httpContext.cgiGet( "Z11604PArtId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11611PAFOrd = (short)(localUtil.ctol( httpContext.cgiGet( "Z11611PAFOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_65 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_65"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_msg = httpContext.cgiGet( "vMSG") ;
            AV32Precio = localUtil.ctond( httpContext.cgiGet( "vPRECIO")) ;
            A7728ArtAdiDsc = httpContext.cgiGet( "ARTADIDSC") ;
            n7728ArtAdiDsc = false ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A11604PArtId = (int)(localUtil.ctol( httpContext.cgiGet( edtPArtId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11604PArtId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11604PArtId), 8, 0));
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
            n65ArtCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            n758ProCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A11611PAFOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtPAFOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11611PAFOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11611PAFOrd), 4, 0));
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
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
               A11604PArtId = (int)(GXutil.lval( httpContext.GetPar( "PArtId"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11604PArtId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11604PArtId), 8, 0));
               A11611PAFOrd = (short)(GXutil.lval( httpContext.GetPar( "PAFOrd"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11611PAFOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11611PAFOrd), 4, 0));
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
                        e121CE2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "EXIT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Exit */
                        e111CE2 ();
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
            initAll1CE1541( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1542_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1542_Enabled), 5, 0), !bGXsfl_65_Refreshing);
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
      disableAttributes1CE1541( ) ;
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

   public void confirm_1CE0( )
   {
      beforeValidate1CE1541( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1CE1541( ) ;
         }
         else
         {
            checkExtendedTable1CE1541( ) ;
            if ( AnyError == 0 )
            {
               zm1CE1541( 15) ;
               zm1CE1541( 16) ;
               zm1CE1541( 17) ;
            }
            closeExtendedTableCursors1CE1541( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1541 = Gx_mode ;
         confirm_1CE1542( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1541 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1541 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1CE0( ) ;
      }
   }

   public void confirm_1CE1542( )
   {
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRow1CE1542( ) ;
         if ( ( nRcdExists_1542 != 0 ) || ( nIsMod_1542 != 0 ) )
         {
            getKey1CE1542( ) ;
            if ( ( nRcdExists_1542 == 0 ) && ( nRcdDeleted_1542 == 0 ) )
            {
               if ( RcdFound1542 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1CE1542( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1CE1542( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1CE1542( 19) ;
                     }
                     closeExtendedTableCursors1CE1542( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "ARTADICOD_" + sGXsfl_65_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = dynArtAdiCod.getInternalname() ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1542 != 0 )
               {
                  if ( nRcdDeleted_1542 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1CE1542( ) ;
                     load1CE1542( ) ;
                     beforeValidate1CE1542( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1CE1542( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1542 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1CE1542( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1CE1542( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1CE1542( 19) ;
                           }
                           closeExtendedTableCursors1CE1542( ) ;
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
                  if ( nRcdDeleted_1542 == 0 )
                  {
                     GXCCtl = "ARTADICOD_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = dynArtAdiCod.getInternalname() ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1542_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1542, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( dynArtAdiCod.getInternalname(), GXutil.ltrim( localUtil.ntoc( A7727ArtAdiCod, (byte)(3), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtPAFAdiPre_Internalname, GXutil.ltrim( localUtil.ntoc( A11612PAFAdiPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbPAFAdiUni.getInternalname(), GXutil.rtrim( A11613PAFAdiUni)) ;
         httpContext.changePostValue( "ZT_"+"Z7727ArtAdiCod_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7727ArtAdiCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11612PAFAdiPre_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z11612PAFAdiPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11613PAFAdiUni_"+sGXsfl_65_idx, GXutil.rtrim( Z11613PAFAdiUni)) ;
         httpContext.changePostValue( "T11613PAFAdiUni_"+sGXsfl_65_idx, GXutil.rtrim( O11613PAFAdiUni)) ;
         httpContext.changePostValue( "T11612PAFAdiPre_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( O11612PAFAdiPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1542_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1542, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1542_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1542, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1542_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1542, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N11612PAFAdiPre_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( A11612PAFAdiPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N11613PAFAdiUni_"+sGXsfl_65_idx, GXutil.rtrim( A11613PAFAdiUni)) ;
         if ( nIsMod_1542 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1542_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1542_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTADICOD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( dynArtAdiCod.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAFADIPRE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPAFAdiPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAFADIUNI_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbPAFAdiUni.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1CE0( )
   {
   }

   public void e121CE2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tpedaff_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV34Pgmname, (byte)(99), GXv_char2) ;
      tpedaff_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tpedaff_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tpedaff_impl.this.A396EmprCod = GXv_char2[0] ;
      tpedaff_impl.this.AV11EmprNom = GXv_char3[0] ;
      tpedaff_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   protected void GXExit( )
   {
      /* Execute user event: Exit */
      e111CE2 ();
      if ( returnInSub )
      {
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e111CE2( )
   {
      /* Exit Routine */
      returnInSub = false ;
   }

   public void zm1CE1541( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -14 )
      {
         Z11611PAFOrd = A11611PAFOrd ;
         Z457FasCod = A457FasCod ;
         Z396EmprCod = A396EmprCod ;
         Z11604PArtId = A11604PArtId ;
         Z407EmprNom = A407EmprNom ;
         Z460FasDsc = A460FasDsc ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
      }
   }

   public void standaloneNotModal( )
   {
      AV34Pgmname = "TPEDAFF" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      /* Using cursor T01CE7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01CE7_A407EmprNom[0] ;
      n407EmprNom = T01CE7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T01CE9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Pedidos Estampación", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARTID");
         AnyError = (short)(1) ;
      }
      A252CliCod = T01CE9_A252CliCod[0] ;
      n252CliCod = T01CE9_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A65ArtCod = T01CE9_A65ArtCod[0] ;
      n65ArtCod = T01CE9_n65ArtCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      A758ProCod = T01CE9_A758ProCod[0] ;
      n758ProCod = T01CE9_n758ProCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      pr_default.close(7);
      /* Using cursor T01CE8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
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

   public void load1CE1541( )
   {
      /* Using cursor T01CE10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId), Short.valueOf(A11611PAFOrd), A457FasCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1541 = (short)(1) ;
         A407EmprNom = T01CE10_A407EmprNom[0] ;
         n407EmprNom = T01CE10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A252CliCod = T01CE10_A252CliCod[0] ;
         n252CliCod = T01CE10_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01CE10_A65ArtCod[0] ;
         n65ArtCod = T01CE10_n65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A758ProCod = T01CE10_A758ProCod[0] ;
         n758ProCod = T01CE10_n758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         zm1CE1541( -14) ;
      }
      pr_default.close(8);
      onLoadActions1CE1541( ) ;
   }

   public void onLoadActions1CE1541( )
   {
   }

   public void checkExtendedTable1CE1541( )
   {
      nIsDirty_1541 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1CE1541( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1CE1541( )
   {
      /* Using cursor T01CE11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId), Short.valueOf(A11611PAFOrd)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1541 = (short)(1) ;
      }
      else
      {
         RcdFound1541 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01CE6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId), Short.valueOf(A11611PAFOrd)});
      if ( (pr_default.getStatus(4) != 101) && ( T01CE6_A11611PAFOrd[0] == A11611PAFOrd ) && ( GXutil.strcmp(T01CE6_A457FasCod[0], A457FasCod) == 0 ) && ( GXutil.strcmp(T01CE6_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01CE6_A11604PArtId[0] == A11604PArtId ) )
      {
         zm1CE1541( 14) ;
         RcdFound1541 = (short)(1) ;
         Z396EmprCod = A396EmprCod ;
         Z11604PArtId = A11604PArtId ;
         Z11611PAFOrd = A11611PAFOrd ;
         sMode1541 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1CE1541( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1541 = (short)(0) ;
            initializeNonKey1CE1541( ) ;
         }
         Gx_mode = sMode1541 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1541 = (short)(0) ;
         initializeNonKey1CE1541( ) ;
         sMode1541 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1541 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1CE1541( ) ;
      if ( RcdFound1541 == 0 )
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
      RcdFound1541 = (short)(0) ;
      /* Using cursor T01CE12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId), Short.valueOf(A11611PAFOrd), A457FasCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01CE12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01CE12_A11604PArtId[0] == A11604PArtId ) && ( T01CE12_A11611PAFOrd[0] == A11611PAFOrd ) && ( GXutil.strcmp(T01CE12_A457FasCod[0], A457FasCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01CE12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01CE12_A11604PArtId[0] == A11604PArtId ) && ( T01CE12_A11611PAFOrd[0] == A11611PAFOrd ) && ( GXutil.strcmp(T01CE12_A457FasCod[0], A457FasCod) == 0 ) )
         {
            RcdFound1541 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound1541 = (short)(0) ;
      /* Using cursor T01CE13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId), Short.valueOf(A11611PAFOrd), A457FasCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T01CE13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01CE13_A11604PArtId[0] == A11604PArtId ) && ( T01CE13_A11611PAFOrd[0] == A11611PAFOrd ) && ( GXutil.strcmp(T01CE13_A457FasCod[0], A457FasCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T01CE13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01CE13_A11604PArtId[0] == A11604PArtId ) && ( T01CE13_A11611PAFOrd[0] == A11611PAFOrd ) && ( GXutil.strcmp(T01CE13_A457FasCod[0], A457FasCod) == 0 ) )
         {
            RcdFound1541 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1CE1541( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1CE1541( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1541 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11604PArtId != Z11604PArtId ) || ( A11611PAFOrd != Z11611PAFOrd ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1CE1541( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11604PArtId != Z11604PArtId ) || ( A11611PAFOrd != Z11611PAFOrd ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               insert1CE1541( ) ;
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
                  insert1CE1541( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11604PArtId != Z11604PArtId ) || ( A11611PAFOrd != Z11611PAFOrd ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
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
      getKey1CE1541( ) ;
      if ( RcdFound1541 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11604PArtId != Z11604PArtId ) || ( A11611PAFOrd != Z11611PAFOrd ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11604PArtId != Z11604PArtId ) || ( A11611PAFOrd != Z11611PAFOrd ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpedaff");
   }

   public void insert_check( )
   {
      confirm_1CE0( ) ;
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
      if ( RcdFound1541 == 0 )
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
      scanStart1CE1541( ) ;
      if ( RcdFound1541 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1CE1541( ) ;
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
      if ( RcdFound1541 == 0 )
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
      if ( RcdFound1541 == 0 )
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
      scanStart1CE1541( ) ;
      if ( RcdFound1541 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1541 != 0 )
         {
            scanNext1CE1541( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1CE1541( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1CE1541( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01CE5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId), Short.valueOf(A11611PAFOrd)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPedAFa"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPedAFa"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1CE1541( )
   {
      beforeValidate1CE1541( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1CE1541( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1CE1541( 0) ;
         checkOptimisticConcurrency1CE1541( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1CE1541( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1CE1541( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01CE14 */
                  pr_default.execute(12, new Object[] {Short.valueOf(A11611PAFOrd), A457FasCod, A396EmprCod, Integer.valueOf(A11604PArtId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAFa");
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
                        processLevel1CE1541( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1CE0( ) ;
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
            load1CE1541( ) ;
         }
         endLevel1CE1541( ) ;
      }
      closeExtendedTableCursors1CE1541( ) ;
   }

   public void update1CE1541( )
   {
      beforeValidate1CE1541( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1CE1541( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1CE1541( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1CE1541( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1CE1541( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01CE15 */
                  pr_default.execute(13, new Object[] {A457FasCod, A396EmprCod, Integer.valueOf(A11604PArtId), Short.valueOf(A11611PAFOrd)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAFa");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPedAFa"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1CE1541( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1CE1541( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1CE0( ) ;
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
         endLevel1CE1541( ) ;
      }
      closeExtendedTableCursors1CE1541( ) ;
   }

   public void deferredUpdate1CE1541( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1CE1541( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1CE1541( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1CE1541( ) ;
         afterConfirm1CE1541( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1CE1541( ) ;
            if ( AnyError == 0 )
            {
               scanStart1CE1542( ) ;
               while ( RcdFound1542 != 0 )
               {
                  getByPrimaryKey1CE1542( ) ;
                  delete1CE1542( ) ;
                  scanNext1CE1542( ) ;
               }
               scanEnd1CE1542( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01CE16 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId), Short.valueOf(A11611PAFOrd)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAFa");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1541 == 0 )
                        {
                           initAll1CE1541( ) ;
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
                        resetCaption1CE0( ) ;
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
      sMode1541 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1CE1541( ) ;
      Gx_mode = sMode1541 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1CE1541( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1CE1542( )
   {
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRow1CE1542( ) ;
         if ( ( nRcdExists_1542 != 0 ) || ( nIsMod_1542 != 0 ) )
         {
            standaloneNotModal1CE1542( ) ;
            getKey1CE1542( ) ;
            if ( ( nRcdExists_1542 == 0 ) && ( nRcdDeleted_1542 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1CE1542( ) ;
            }
            else
            {
               if ( RcdFound1542 != 0 )
               {
                  if ( ( nRcdDeleted_1542 != 0 ) && ( nRcdExists_1542 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1CE1542( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1542 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1CE1542( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1542 == 0 )
                  {
                     GXCCtl = "ARTADICOD_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = dynArtAdiCod.getInternalname() ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1542_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1542, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( dynArtAdiCod.getInternalname(), GXutil.ltrim( localUtil.ntoc( A7727ArtAdiCod, (byte)(3), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtPAFAdiPre_Internalname, GXutil.ltrim( localUtil.ntoc( A11612PAFAdiPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbPAFAdiUni.getInternalname(), GXutil.rtrim( A11613PAFAdiUni)) ;
         httpContext.changePostValue( "ZT_"+"Z7727ArtAdiCod_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7727ArtAdiCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11612PAFAdiPre_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z11612PAFAdiPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11613PAFAdiUni_"+sGXsfl_65_idx, GXutil.rtrim( Z11613PAFAdiUni)) ;
         httpContext.changePostValue( "T11613PAFAdiUni_"+sGXsfl_65_idx, GXutil.rtrim( O11613PAFAdiUni)) ;
         httpContext.changePostValue( "T11612PAFAdiPre_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( O11612PAFAdiPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1542_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1542, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1542_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1542, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1542_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1542, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N11612PAFAdiPre_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( A11612PAFAdiPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N11613PAFAdiUni_"+sGXsfl_65_idx, GXutil.rtrim( A11613PAFAdiUni)) ;
         if ( nIsMod_1542 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1542_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1542_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTADICOD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( dynArtAdiCod.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAFADIPRE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPAFAdiPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAFADIUNI_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbPAFAdiUni.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1CE1542( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1542 = (short)(0) ;
      nIsMod_1542 = (short)(0) ;
      nRcdDeleted_1542 = (short)(0) ;
   }

   public void processLevel1CE1541( )
   {
      /* Save parent mode. */
      sMode1541 = Gx_mode ;
      processNestedLevel1CE1542( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1541 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1CE1541( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1CE1541( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpedaff");
         if ( AnyError == 0 )
         {
            confirmValues1CE0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpedaff");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1CE1541( )
   {
      /* Scan By routine */
      /* Using cursor T01CE17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId), Short.valueOf(A11611PAFOrd), A457FasCod});
      RcdFound1541 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1541 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1CE1541( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1541 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1541 = (short)(1) ;
      }
   }

   public void scanEnd1CE1541( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1CE1541( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1CE1541( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1CE1541( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1CE1541( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1CE1541( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1CE1541( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1CE1541( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPArtId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPArtId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPArtId_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtPAFOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPAFOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPAFOrd_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
   }

   public void zm1CE1542( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11612PAFAdiPre = T01CE3_A11612PAFAdiPre[0] ;
            Z11613PAFAdiUni = T01CE3_A11613PAFAdiUni[0] ;
         }
         else
         {
            Z11612PAFAdiPre = A11612PAFAdiPre ;
            Z11613PAFAdiUni = A11613PAFAdiUni ;
         }
      }
      if ( GX_JID == -18 )
      {
         Z11604PArtId = A11604PArtId ;
         Z11611PAFOrd = A11611PAFOrd ;
         Z11612PAFAdiPre = A11612PAFAdiPre ;
         Z11613PAFAdiUni = A11613PAFAdiUni ;
         Z396EmprCod = A396EmprCod ;
         Z7727ArtAdiCod = A7727ArtAdiCod ;
         Z7728ArtAdiDsc = A7728ArtAdiDsc ;
      }
   }

   public void standaloneNotModal1CE1542( )
   {
      gxaartadicod_html1CE1542( A396EmprCod) ;
   }

   public void standaloneModal1CE1542( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         dynArtAdiCod.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, dynArtAdiCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynArtAdiCod.getEnabled(), 5, 0), !bGXsfl_65_Refreshing);
      }
      else
      {
         dynArtAdiCod.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, dynArtAdiCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynArtAdiCod.getEnabled(), 5, 0), !bGXsfl_65_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01CE4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A7727ArtAdiCod)});
         A7728ArtAdiDsc = T01CE4_A7728ArtAdiDsc[0] ;
         n7728ArtAdiDsc = T01CE4_n7728ArtAdiDsc[0] ;
         pr_default.close(2);
      }
   }

   public void load1CE1542( )
   {
      /* Using cursor T01CE18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId), Short.valueOf(A11611PAFOrd), Short.valueOf(A7727ArtAdiCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1542 = (short)(1) ;
         A11612PAFAdiPre = T01CE18_A11612PAFAdiPre[0] ;
         n11612PAFAdiPre = T01CE18_n11612PAFAdiPre[0] ;
         A7728ArtAdiDsc = T01CE18_A7728ArtAdiDsc[0] ;
         n7728ArtAdiDsc = T01CE18_n7728ArtAdiDsc[0] ;
         A11613PAFAdiUni = T01CE18_A11613PAFAdiUni[0] ;
         n11613PAFAdiUni = T01CE18_n11613PAFAdiUni[0] ;
         zm1CE1542( -18) ;
      }
      pr_default.close(16);
      onLoadActions1CE1542( ) ;
   }

   public void onLoadActions1CE1542( )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXt_int5 = (short)(DecimalUtil.decToDouble(A11612PAFAdiPre)) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A11604PArtId ;
         GXv_int7[0] = A11611PAFOrd ;
         GXv_char3[0] = A457FasCod ;
         GXv_int8[0] = A7727ArtAdiCod ;
         GXv_char2[0] = httpContext.getMessage( httpContext.getMessage( "P", ""), "") ;
         GXv_int9[0] = GXt_int5 ;
         new app.ppedaesartpre(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int7, GXv_char3, GXv_int8, GXv_char2, GXv_int9) ;
         tpedaff_impl.this.A396EmprCod = GXv_char4[0] ;
         tpedaff_impl.this.A11604PArtId = GXv_int6[0] ;
         tpedaff_impl.this.A11611PAFOrd = GXv_int7[0] ;
         tpedaff_impl.this.A457FasCod = GXv_char3[0] ;
         tpedaff_impl.this.A7727ArtAdiCod = GXv_int8[0] ;
         tpedaff_impl.this.GXt_int5 = GXv_int9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A11604PArtId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11604PArtId), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11611PAFOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11611PAFOrd), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A11612PAFAdiPre = DecimalUtil.doubleToDec(GXt_int5) ;
         n11612PAFAdiPre = false ;
      }
      if ( isIns( )  && true /* After */ )
      {
         GXt_int5 = (short)(DecimalUtil.decToDouble(AV32Precio)) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A11604PArtId ;
         GXv_int9[0] = A11611PAFOrd ;
         GXv_char3[0] = A457FasCod ;
         GXv_int8[0] = A7727ArtAdiCod ;
         GXv_char2[0] = httpContext.getMessage( httpContext.getMessage( "P", ""), "") ;
         GXv_int7[0] = GXt_int5 ;
         new app.ppedaesartpre(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int9, GXv_char3, GXv_int8, GXv_char2, GXv_int7) ;
         tpedaff_impl.this.A396EmprCod = GXv_char4[0] ;
         tpedaff_impl.this.A11604PArtId = GXv_int6[0] ;
         tpedaff_impl.this.A11611PAFOrd = GXv_int9[0] ;
         tpedaff_impl.this.A457FasCod = GXv_char3[0] ;
         tpedaff_impl.this.A7727ArtAdiCod = GXv_int8[0] ;
         tpedaff_impl.this.GXt_int5 = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A11604PArtId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11604PArtId), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11611PAFOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11611PAFOrd), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         AV32Precio = DecimalUtil.doubleToDec(GXt_int5) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Precio", GXutil.ltrimstr( AV32Precio, 10, 2));
      }
      if ( AV32Precio.doubleValue() > 0 )
      {
         edtPAFAdiPre_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPAFAdiPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPAFAdiPre_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      else
      {
         edtPAFAdiPre_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPAFAdiPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPAFAdiPre_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      if ( AV32Precio.doubleValue() > 0 )
      {
         cmbPAFAdiUni.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbPAFAdiUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPAFAdiUni.getEnabled(), 5, 0), !bGXsfl_65_Refreshing);
      }
      else
      {
         cmbPAFAdiUni.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbPAFAdiUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPAFAdiUni.getEnabled(), 5, 0), !bGXsfl_65_Refreshing);
      }
   }

   public void checkExtendedTable1CE1542( )
   {
      nIsDirty_1542 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1CE1542( ) ;
      /* Using cursor T01CE4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A7727ArtAdiCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "ARTADICOD_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ArtAdi", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = dynArtAdiCod.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A7728ArtAdiDsc = T01CE4_A7728ArtAdiDsc[0] ;
      n7728ArtAdiDsc = T01CE4_n7728ArtAdiDsc[0] ;
      pr_default.close(2);
      if ( isIns( )  && true /* After */ )
      {
         nIsDirty_1542 = (short)(1) ;
         GXt_int5 = (short)(DecimalUtil.decToDouble(A11612PAFAdiPre)) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A11604PArtId ;
         GXv_int9[0] = A11611PAFOrd ;
         GXv_char3[0] = A457FasCod ;
         GXv_int8[0] = A7727ArtAdiCod ;
         GXv_char2[0] = httpContext.getMessage( httpContext.getMessage( "P", ""), "") ;
         GXv_int7[0] = GXt_int5 ;
         new app.ppedaesartpre(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int9, GXv_char3, GXv_int8, GXv_char2, GXv_int7) ;
         tpedaff_impl.this.A396EmprCod = GXv_char4[0] ;
         tpedaff_impl.this.A11604PArtId = GXv_int6[0] ;
         tpedaff_impl.this.A11611PAFOrd = GXv_int9[0] ;
         tpedaff_impl.this.A457FasCod = GXv_char3[0] ;
         tpedaff_impl.this.A7727ArtAdiCod = GXv_int8[0] ;
         tpedaff_impl.this.GXt_int5 = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A11604PArtId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11604PArtId), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11611PAFOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11611PAFOrd), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A11612PAFAdiPre = DecimalUtil.doubleToDec(GXt_int5) ;
         n11612PAFAdiPre = false ;
      }
      if ( isIns( )  && true /* After */ )
      {
         GXt_int5 = (short)(DecimalUtil.decToDouble(AV32Precio)) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A11604PArtId ;
         GXv_int9[0] = A11611PAFOrd ;
         GXv_char3[0] = A457FasCod ;
         GXv_int8[0] = A7727ArtAdiCod ;
         GXv_char2[0] = httpContext.getMessage( httpContext.getMessage( "P", ""), "") ;
         GXv_int7[0] = GXt_int5 ;
         new app.ppedaesartpre(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int9, GXv_char3, GXv_int8, GXv_char2, GXv_int7) ;
         tpedaff_impl.this.A396EmprCod = GXv_char4[0] ;
         tpedaff_impl.this.A11604PArtId = GXv_int6[0] ;
         tpedaff_impl.this.A11611PAFOrd = GXv_int9[0] ;
         tpedaff_impl.this.A457FasCod = GXv_char3[0] ;
         tpedaff_impl.this.A7727ArtAdiCod = GXv_int8[0] ;
         tpedaff_impl.this.GXt_int5 = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A11604PArtId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11604PArtId), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11611PAFOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11611PAFOrd), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         AV32Precio = DecimalUtil.doubleToDec(GXt_int5) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Precio", GXutil.ltrimstr( AV32Precio, 10, 2));
      }
      if ( AV32Precio.doubleValue() > 0 )
      {
         edtPAFAdiPre_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPAFAdiPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPAFAdiPre_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      else
      {
         edtPAFAdiPre_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPAFAdiPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPAFAdiPre_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      if ( AV32Precio.doubleValue() > 0 )
      {
         cmbPAFAdiUni.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbPAFAdiUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPAFAdiUni.getEnabled(), 5, 0), !bGXsfl_65_Refreshing);
      }
      else
      {
         cmbPAFAdiUni.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbPAFAdiUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPAFAdiUni.getEnabled(), 5, 0), !bGXsfl_65_Refreshing);
      }
      if ( ( DecimalUtil.compareTo(O11612PAFAdiPre, A11612PAFAdiPre) != 0 ) && ( AV32Precio.doubleValue() > 0 ) && ( O11612PAFAdiPre.doubleValue() > 0 ) )
      {
         GXCCtl = "PAFADIPRE_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atención el precio de lista a cambiado, se actualizará la disposición.", ""), 0, GXCCtl);
      }
      if ( A11612PAFAdiPre.doubleValue() <= 0 )
      {
         GXCCtl = "PAFADIPRE_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe ingresar un precio", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPAFAdiPre_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A11613PAFAdiUni, "K") == 0 ) || ( GXutil.strcmp(A11613PAFAdiUni, "M") == 0 ) || ( GXutil.strcmp(A11613PAFAdiUni, "F") == 0 ) || ( GXutil.strcmp(A11613PAFAdiUni, "C") == 0 ) ) )
      {
         GXCCtl = "PAFADIUNI_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = cmbPAFAdiUni.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1CE1542( )
   {
      pr_default.close(2);
   }

   public void enableDisable1CE1542( )
   {
   }

   public void gxload_19( String A396EmprCod ,
                          short A7727ArtAdiCod )
   {
      /* Using cursor T01CE19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Short.valueOf(A7727ArtAdiCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         GXCCtl = "ARTADICOD_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ArtAdi", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = dynArtAdiCod.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A7728ArtAdiDsc = T01CE19_A7728ArtAdiDsc[0] ;
      n7728ArtAdiDsc = T01CE19_n7728ArtAdiDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7728ArtAdiDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void getKey1CE1542( )
   {
      /* Using cursor T01CE20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId), Short.valueOf(A11611PAFOrd), Short.valueOf(A7727ArtAdiCod)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1542 = (short)(1) ;
      }
      else
      {
         RcdFound1542 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey1CE1542( )
   {
      /* Using cursor T01CE3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId), Short.valueOf(A11611PAFOrd), Short.valueOf(A7727ArtAdiCod)});
      if ( (pr_default.getStatus(1) != 101) && ( T01CE3_A11604PArtId[0] == A11604PArtId ) && ( T01CE3_A11611PAFOrd[0] == A11611PAFOrd ) && ( GXutil.strcmp(T01CE3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1CE1542( 18) ;
         RcdFound1542 = (short)(1) ;
         initializeNonKey1CE1542( ) ;
         A11612PAFAdiPre = T01CE3_A11612PAFAdiPre[0] ;
         n11612PAFAdiPre = T01CE3_n11612PAFAdiPre[0] ;
         A11613PAFAdiUni = T01CE3_A11613PAFAdiUni[0] ;
         n11613PAFAdiUni = T01CE3_n11613PAFAdiUni[0] ;
         A7727ArtAdiCod = T01CE3_A7727ArtAdiCod[0] ;
         O11613PAFAdiUni = A11613PAFAdiUni ;
         n11613PAFAdiUni = false ;
         O11612PAFAdiPre = A11612PAFAdiPre ;
         n11612PAFAdiPre = false ;
         Z396EmprCod = A396EmprCod ;
         Z11604PArtId = A11604PArtId ;
         Z11611PAFOrd = A11611PAFOrd ;
         Z7727ArtAdiCod = A7727ArtAdiCod ;
         sMode1542 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1CE1542( ) ;
         load1CE1542( ) ;
         Gx_mode = sMode1542 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1542 = (short)(0) ;
         initializeNonKey1CE1542( ) ;
         sMode1542 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1CE1542( ) ;
         Gx_mode = sMode1542 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1CE1542( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1CE1542( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01CE2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId), Short.valueOf(A11611PAFOrd), Short.valueOf(A7727ArtAdiCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPEDAFF"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z11612PAFAdiPre, T01CE2_A11612PAFAdiPre[0]) != 0 ) || ( GXutil.strcmp(Z11613PAFAdiUni, T01CE2_A11613PAFAdiUni[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z11612PAFAdiPre, T01CE2_A11612PAFAdiPre[0]) != 0 )
            {
               GXutil.writeLogln("tpedaff:[seudo value changed for attri]"+"PAFAdiPre");
               GXutil.writeLogRaw("Old: ",Z11612PAFAdiPre);
               GXutil.writeLogRaw("Current: ",T01CE2_A11612PAFAdiPre[0]);
            }
            if ( GXutil.strcmp(Z11613PAFAdiUni, T01CE2_A11613PAFAdiUni[0]) != 0 )
            {
               GXutil.writeLogln("tpedaff:[seudo value changed for attri]"+"PAFAdiUni");
               GXutil.writeLogRaw("Old: ",Z11613PAFAdiUni);
               GXutil.writeLogRaw("Current: ",T01CE2_A11613PAFAdiUni[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPEDAFF"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1CE1542( )
   {
      beforeValidate1CE1542( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1CE1542( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1CE1542( 0) ;
         checkOptimisticConcurrency1CE1542( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1CE1542( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1CE1542( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01CE21 */
                  pr_default.execute(19, new Object[] {Integer.valueOf(A11604PArtId), Short.valueOf(A11611PAFOrd), Boolean.valueOf(n11612PAFAdiPre), A11612PAFAdiPre, Boolean.valueOf(n11613PAFAdiUni), A11613PAFAdiUni, A396EmprCod, Short.valueOf(A7727ArtAdiCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDAFF");
                  if ( (pr_default.getStatus(19) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ && true /* Level */ )
                     {
                        Gx_msg += GXutil.trim( GXutil.str( A7727ArtAdiCod, 10, 0)) + httpContext.getMessage( httpContext.getMessage( ".Creacion ", ""), "") + GXutil.newLine( ) ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
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
            load1CE1542( ) ;
         }
         endLevel1CE1542( ) ;
      }
      closeExtendedTableCursors1CE1542( ) ;
   }

   public void update1CE1542( )
   {
      beforeValidate1CE1542( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1CE1542( ) ;
      }
      if ( ( nIsMod_1542 != 0 ) || ( nIsDirty_1542 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1CE1542( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1CE1542( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1CE1542( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01CE22 */
                     pr_default.execute(20, new Object[] {Boolean.valueOf(n11612PAFAdiPre), A11612PAFAdiPre, Boolean.valueOf(n11613PAFAdiUni), A11613PAFAdiUni, A396EmprCod, Integer.valueOf(A11604PArtId), Short.valueOf(A11611PAFOrd), Short.valueOf(A7727ArtAdiCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDAFF");
                     if ( (pr_default.getStatus(20) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPEDAFF"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1CE1542( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( true /* After */ && true /* Level */ && ( DecimalUtil.compareTo(A11612PAFAdiPre, O11612PAFAdiPre) != 0 ) )
                        {
                           Gx_msg += GXutil.trim( GXutil.str( A7727ArtAdiCod, 10, 0)) + httpContext.getMessage( httpContext.getMessage( ".Mod.Pre ", ""), "") + GXutil.trim( GXutil.str( O11612PAFAdiPre, 10, 0)) + "=>" + GXutil.trim( GXutil.str( A11612PAFAdiPre, 10, 0)) + GXutil.newLine( ) ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
                        }
                        else
                        {
                           if ( true /* After */ && true /* Level */ && ( GXutil.strcmp(A11613PAFAdiUni, O11613PAFAdiUni) != 0 ) )
                           {
                              Gx_msg += GXutil.trim( GXutil.str( A7727ArtAdiCod, 10, 0)) + httpContext.getMessage( httpContext.getMessage( ".Mod.Uni ", ""), "") + GXutil.trim( O11613PAFAdiUni) + "=>" + GXutil.trim( A11613PAFAdiUni) + GXutil.newLine( ) ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
                           }
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1CE1542( ) ;
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
            endLevel1CE1542( ) ;
         }
      }
      closeExtendedTableCursors1CE1542( ) ;
   }

   public void deferredUpdate1CE1542( )
   {
   }

   public void delete1CE1542( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1CE1542( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1CE1542( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1CE1542( ) ;
         afterConfirm1CE1542( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1CE1542( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01CE23 */
               pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId), Short.valueOf(A11611PAFOrd), Short.valueOf(A7727ArtAdiCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDAFF");
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
      sMode1542 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1CE1542( ) ;
      Gx_mode = sMode1542 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1CE1542( )
   {
      standaloneModal1CE1542( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01CE24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Short.valueOf(A7727ArtAdiCod)});
         A7728ArtAdiDsc = T01CE24_A7728ArtAdiDsc[0] ;
         n7728ArtAdiDsc = T01CE24_n7728ArtAdiDsc[0] ;
         pr_default.close(22);
         if ( isIns( )  && true /* After */ )
         {
            GXt_int5 = (short)(DecimalUtil.decToDouble(AV32Precio)) ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int6[0] = A11604PArtId ;
            GXv_int9[0] = A11611PAFOrd ;
            GXv_char3[0] = A457FasCod ;
            GXv_int8[0] = A7727ArtAdiCod ;
            GXv_char2[0] = httpContext.getMessage( httpContext.getMessage( "P", ""), "") ;
            GXv_int7[0] = GXt_int5 ;
            new app.ppedaesartpre(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int9, GXv_char3, GXv_int8, GXv_char2, GXv_int7) ;
            tpedaff_impl.this.A396EmprCod = GXv_char4[0] ;
            tpedaff_impl.this.A11604PArtId = GXv_int6[0] ;
            tpedaff_impl.this.A11611PAFOrd = GXv_int9[0] ;
            tpedaff_impl.this.A457FasCod = GXv_char3[0] ;
            tpedaff_impl.this.A7727ArtAdiCod = GXv_int8[0] ;
            tpedaff_impl.this.GXt_int5 = GXv_int7[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A11604PArtId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11604PArtId), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A11611PAFOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11611PAFOrd), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            AV32Precio = DecimalUtil.doubleToDec(GXt_int5) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32Precio", GXutil.ltrimstr( AV32Precio, 10, 2));
         }
         if ( AV32Precio.doubleValue() > 0 )
         {
            edtPAFAdiPre_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtPAFAdiPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPAFAdiPre_Enabled), 5, 0), !bGXsfl_65_Refreshing);
         }
         else
         {
            edtPAFAdiPre_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtPAFAdiPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPAFAdiPre_Enabled), 5, 0), !bGXsfl_65_Refreshing);
         }
         if ( AV32Precio.doubleValue() > 0 )
         {
            cmbPAFAdiUni.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbPAFAdiUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPAFAdiUni.getEnabled(), 5, 0), !bGXsfl_65_Refreshing);
         }
         else
         {
            cmbPAFAdiUni.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbPAFAdiUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPAFAdiUni.getEnabled(), 5, 0), !bGXsfl_65_Refreshing);
         }
      }
   }

   public void endLevel1CE1542( )
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

   public void scanStart1CE1542( )
   {
      /* Scan By routine */
      /* Using cursor T01CE25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId), Short.valueOf(A11611PAFOrd)});
      RcdFound1542 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1542 = (short)(1) ;
         A7727ArtAdiCod = T01CE25_A7727ArtAdiCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1CE1542( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound1542 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1542 = (short)(1) ;
         A7727ArtAdiCod = T01CE25_A7727ArtAdiCod[0] ;
      }
   }

   public void scanEnd1CE1542( )
   {
      pr_default.close(23);
   }

   public void afterConfirm1CE1542( )
   {
      /* After Confirm Rules */
      if ( true /* After */ && isDlt( )  && true /* Level */ )
      {
         Gx_msg += GXutil.trim( GXutil.str( A7727ArtAdiCod, 10, 0)) + httpContext.getMessage( httpContext.getMessage( ".Eliminacion ", ""), "") + GXutil.newLine( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      }
   }

   public void beforeInsert1CE1542( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1CE1542( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1CE1542( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1CE1542( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1CE1542( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1CE1542( )
   {
      dynArtAdiCod.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynArtAdiCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynArtAdiCod.getEnabled(), 5, 0), !bGXsfl_65_Refreshing);
      edtPAFAdiPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPAFAdiPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPAFAdiPre_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      cmbPAFAdiUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbPAFAdiUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPAFAdiUni.getEnabled(), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void send_integrity_lvl_hashes1CE1542( )
   {
   }

   public void send_integrity_lvl_hashes1CE1541( )
   {
   }

   public void subsflControlProps_651542( )
   {
      edtavnRcdDeleted_1542_Internalname = "vNRCDDELETED_1542_"+sGXsfl_65_idx ;
      dynArtAdiCod.setInternalname( "ARTADICOD_"+sGXsfl_65_idx );
      edtPAFAdiPre_Internalname = "PAFADIPRE_"+sGXsfl_65_idx ;
      cmbPAFAdiUni.setInternalname( "PAFADIUNI_"+sGXsfl_65_idx );
   }

   public void subsflControlProps_fel_651542( )
   {
      edtavnRcdDeleted_1542_Internalname = "vNRCDDELETED_1542_"+sGXsfl_65_fel_idx ;
      dynArtAdiCod.setInternalname( "ARTADICOD_"+sGXsfl_65_fel_idx );
      edtPAFAdiPre_Internalname = "PAFADIPRE_"+sGXsfl_65_fel_idx ;
      cmbPAFAdiUni.setInternalname( "PAFADIUNI_"+sGXsfl_65_fel_idx );
   }

   public void addRow1CE1542( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651542( ) ;
      sendRow1CE1542( ) ;
   }

   public void sendRow1CE1542( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1542_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1542_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1542, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1542_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1542), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1542), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1542_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1542_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      gxaartadicod_html1CE1542( A396EmprCod) ;
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1542_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      GXCCtl = "ARTADICOD_" + sGXsfl_65_idx ;
      dynArtAdiCod.setName( GXCCtl );
      dynArtAdiCod.setWebtags( "" );
      /* ComboBox */
      Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {dynArtAdiCod,dynArtAdiCod.getInternalname(),GXutil.trim( GXutil.str( A7727ArtAdiCod, 3, 0)),Integer.valueOf(1),dynArtAdiCod.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(dynArtAdiCod.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      dynArtAdiCod.setValue( GXutil.trim( GXutil.str( A7727ArtAdiCod, 3, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynArtAdiCod.getInternalname(), "Values", dynArtAdiCod.ToJavascriptSource(), !bGXsfl_65_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1542_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPAFAdiPre_Internalname,GXutil.ltrim( localUtil.ntoc( A11612PAFAdiPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A11612PAFAdiPre, "ZZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPAFAdiPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPAFAdiPre_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1542_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      GXCCtl = "PAFADIUNI_" + sGXsfl_65_idx ;
      cmbPAFAdiUni.setName( GXCCtl );
      cmbPAFAdiUni.setWebtags( "" );
      cmbPAFAdiUni.addItem("K", httpContext.getMessage( "Kilo", ""), (short)(0));
      cmbPAFAdiUni.addItem("M", httpContext.getMessage( "Metro", ""), (short)(0));
      cmbPAFAdiUni.addItem("F", httpContext.getMessage( "Fijo", ""), (short)(0));
      cmbPAFAdiUni.addItem("C", httpContext.getMessage( "Color", ""), (short)(0));
      if ( cmbPAFAdiUni.getItemCount() > 0 )
      {
         A11613PAFAdiUni = cmbPAFAdiUni.getValidValue(A11613PAFAdiUni) ;
         n11613PAFAdiUni = false ;
      }
      /* ComboBox */
      Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbPAFAdiUni,cmbPAFAdiUni.getInternalname(),GXutil.rtrim( A11613PAFAdiUni),Integer.valueOf(1),cmbPAFAdiUni.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbPAFAdiUni.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbPAFAdiUni.setValue( GXutil.rtrim( A11613PAFAdiUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPAFAdiUni.getInternalname(), "Values", cmbPAFAdiUni.ToJavascriptSource(), !bGXsfl_65_Refreshing);
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1CE1542( ) ;
      GXCCtl = "Z7727ArtAdiCod_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7727ArtAdiCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11612PAFAdiPre_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11612PAFAdiPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11613PAFAdiUni_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11613PAFAdiUni));
      GXCCtl = "O11613PAFAdiUni_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O11613PAFAdiUni));
      GXCCtl = "O11612PAFAdiPre_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O11612PAFAdiPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1542_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1542, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1542_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1542, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1542_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1542, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N11612PAFAdiPre_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A11612PAFAdiPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N11613PAFAdiUni_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A11613PAFAdiUni));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1542_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1542_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTADICOD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( dynArtAdiCod.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAFADIPRE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPAFAdiPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAFADIUNI_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbPAFAdiUni.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1CE1542( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651542( ) ;
      edtavnRcdDeleted_1542_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1542_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      dynArtAdiCod.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ARTADICOD_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtPAFAdiPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAFADIPRE_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbPAFAdiUni.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "PAFADIUNI_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1542_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1542_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1542");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1542_Internalname ;
         wbErr = true ;
         nRcdDeleted_1542 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1542 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1542_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      dynArtAdiCod.setName( dynArtAdiCod.getInternalname() );
      dynArtAdiCod.setValue( httpContext.cgiGet( dynArtAdiCod.getInternalname()) );
      A7727ArtAdiCod = (short)(GXutil.lval( httpContext.cgiGet( dynArtAdiCod.getInternalname()))) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPAFAdiPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPAFAdiPre_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "PAFADIPRE_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPAFAdiPre_Internalname ;
         wbErr = true ;
         A11612PAFAdiPre = DecimalUtil.ZERO ;
         n11612PAFAdiPre = false ;
      }
      else
      {
         A11612PAFAdiPre = localUtil.ctond( httpContext.cgiGet( edtPAFAdiPre_Internalname)) ;
         n11612PAFAdiPre = false ;
      }
      cmbPAFAdiUni.setName( cmbPAFAdiUni.getInternalname() );
      cmbPAFAdiUni.setValue( httpContext.cgiGet( cmbPAFAdiUni.getInternalname()) );
      A11613PAFAdiUni = httpContext.cgiGet( cmbPAFAdiUni.getInternalname()) ;
      n11613PAFAdiUni = false ;
      GXCCtl = "Z7727ArtAdiCod_" + sGXsfl_65_idx ;
      Z7727ArtAdiCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11612PAFAdiPre_" + sGXsfl_65_idx ;
      Z11612PAFAdiPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11613PAFAdiUni_" + sGXsfl_65_idx ;
      Z11613PAFAdiUni = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O11613PAFAdiUni_" + sGXsfl_65_idx ;
      O11613PAFAdiUni = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O11612PAFAdiPre_" + sGXsfl_65_idx ;
      O11612PAFAdiPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1542_" + sGXsfl_65_idx ;
      nRcdDeleted_1542 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1542_" + sGXsfl_65_idx ;
      nRcdExists_1542 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1542_" + sGXsfl_65_idx ;
      nIsMod_1542 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N11612PAFAdiPre_" + sGXsfl_65_idx ;
      N11612PAFAdiPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "N11613PAFAdiUni_" + sGXsfl_65_idx ;
      N11613PAFAdiUni = httpContext.cgiGet( GXCCtl) ;
   }

   public void assign_properties_default( )
   {
      defcmbPAFAdiUni_Enabled = cmbPAFAdiUni.getEnabled() ;
      defedtPAFAdiPre_Enabled = edtPAFAdiPre_Enabled ;
      defdynArtAdiCod_Enabled = dynArtAdiCod.getEnabled() ;
   }

   public void confirmValues1CE0( )
   {
      nGXsfl_65_idx = 0 ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651542( ) ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_651542( ) ;
         httpContext.changePostValue( "Z7727ArtAdiCod_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z7727ArtAdiCod_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7727ArtAdiCod_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z11612PAFAdiPre_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z11612PAFAdiPre_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11612PAFAdiPre_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z11613PAFAdiUni_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z11613PAFAdiUni_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11613PAFAdiUni_"+sGXsfl_65_idx) ;
      }
      httpContext.changePostValue( "O11613PAFAdiUni", httpContext.cgiGet( "T11613PAFAdiUni")) ;
      httpContext.deletePostValue( "T11613PAFAdiUni") ;
      httpContext.changePostValue( "O11612PAFAdiPre", httpContext.cgiGet( "T11612PAFAdiPre")) ;
      httpContext.deletePostValue( "T11612PAFAdiPre") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpedaff", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11604PArtId,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A11611PAFOrd,4,0)),GXutil.URLEncode(GXutil.rtrim(A457FasCod)),GXutil.URLEncode(GXutil.rtrim(A460FasDsc))}, new String[] {"EmprCod","PArtId","PAFOrd","FasCod","FasDsc"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11604PArtId", GXutil.ltrim( localUtil.ntoc( Z11604PArtId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11611PAFOrd", GXutil.ltrim( localUtil.ntoc( Z11611PAFOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_65", GXutil.ltrim( localUtil.ntoc( nGXsfl_65_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV34Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG", GXutil.rtrim( Gx_msg));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRECIO", GXutil.ltrim( localUtil.ntoc( AV32Precio, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTADIDSC", GXutil.rtrim( A7728ArtAdiDsc));
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
      return formatLink("app.tpedaff", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11604PArtId,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A11611PAFOrd,4,0)),GXutil.URLEncode(GXutil.rtrim(A457FasCod)),GXutil.URLEncode(GXutil.rtrim(A460FasDsc))}, new String[] {"EmprCod","PArtId","PAFOrd","FasCod","FasDsc"})  ;
   }

   public String getPgmname( )
   {
      return "TPEDAFF" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Adicionales p/Fases", "") ;
   }

   public void initializeNonKey1CE1541( )
   {
   }

   public void initAll1CE1541( )
   {
      initializeNonKey1CE1541( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1CE1542( )
   {
      Gx_msg = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      A11612PAFAdiPre = DecimalUtil.ZERO ;
      n11612PAFAdiPre = false ;
      AV32Precio = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Precio", GXutil.ltrimstr( AV32Precio, 10, 2));
      A7728ArtAdiDsc = "" ;
      n7728ArtAdiDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7728ArtAdiDsc", A7728ArtAdiDsc);
      A11613PAFAdiUni = "" ;
      n11613PAFAdiUni = false ;
      O11613PAFAdiUni = A11613PAFAdiUni ;
      n11613PAFAdiUni = false ;
      O11612PAFAdiPre = A11612PAFAdiPre ;
      n11612PAFAdiPre = false ;
      Z11612PAFAdiPre = DecimalUtil.ZERO ;
      Z11613PAFAdiUni = "" ;
   }

   public void initAll1CE1542( )
   {
      A7727ArtAdiCod = (short)(0) ;
      initializeNonKey1CE1542( ) ;
   }

   public void standaloneModalInsert1CE1542( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241565632", true, true);
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
      httpContext.AddJavascriptSource("tpedaff.js", "?20268241565632", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1542( )
   {
      cmbPAFAdiUni.setEnabled( defcmbPAFAdiUni_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, cmbPAFAdiUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPAFAdiUni.getEnabled(), 5, 0), !bGXsfl_65_Refreshing);
      edtPAFAdiPre_Enabled = defedtPAFAdiPre_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPAFAdiPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPAFAdiPre_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      dynArtAdiCod.setEnabled( defdynArtAdiCod_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, dynArtAdiCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynArtAdiCod.getEnabled(), 5, 0), !bGXsfl_65_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1542, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1542_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7727ArtAdiCod, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( dynArtAdiCod.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11612PAFAdiPre, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPAFAdiPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11613PAFAdiUni));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbPAFAdiUni.getEnabled(), (byte)(5), (byte)(0), ".", "")));
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
      edtPArtId_Internalname = "PARTID" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtArtCod_Internalname = "ARTCOD" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtProCod_Internalname = "PROCOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtPAFOrd_Internalname = "PAFORD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtFasCod_Internalname = "FASCOD" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtavnRcdDeleted_1542_Internalname = "vNRCDDELETED_1542" ;
      dynArtAdiCod.setInternalname( "ARTADICOD" );
      edtPAFAdiPre_Internalname = "PAFADIPRE" ;
      cmbPAFAdiUni.setInternalname( "PAFADIUNI" );
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
      Form.setCaption( httpContext.getMessage( "Adicionales p/Fases", "") );
      cmbPAFAdiUni.setJsonclick( "" );
      edtPAFAdiPre_Jsonclick = "" ;
      dynArtAdiCod.setJsonclick( "" );
      edtavnRcdDeleted_1542_Jsonclick = "" ;
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
      cmbPAFAdiUni.setEnabled( 1 );
      edtPAFAdiPre_Enabled = 1 ;
      dynArtAdiCod.setEnabled( 1 );
      edtavnRcdDeleted_1542_Enabled = 1 ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Backcolor = (int)(0xFFFFFF) ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Backcolor = (int)(0xFFFFFF) ;
      edtFasCod_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPAFOrd_Jsonclick = "" ;
      edtPAFOrd_Backcolor = (int)(0xFFFFFF) ;
      edtPAFOrd_Enabled = 0 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Backcolor = (int)(0xFFFFFF) ;
      edtProCod_Enabled = 0 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtArtCod_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
      edtPArtId_Jsonclick = "" ;
      edtPArtId_Backcolor = (int)(0xFFFFFF) ;
      edtPArtId_Enabled = 0 ;
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

   public void gxdlaartadicod1CE1542( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlaartadicod_data1CE1542( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   public void gxaartadicod_html1CE1542( String A396EmprCod )
   {
      short gxdynajaxvalue;
      gxdlaartadicod_data1CE1542( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynArtAdiCod.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (short)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynArtAdiCod.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 3, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlaartadicod_data1CE1542( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor T01CE26 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(24) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( T01CE26_A7727ArtAdiCod[0], (byte)(3), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( T01CE26_A7728ArtAdiDsc[0]));
         pr_default.readNext(24);
      }
      pr_default.close(24);
   }

   public void gx5asapafadipre1CE1542( String Gx_mode ,
                                       String A396EmprCod ,
                                       int A11604PArtId ,
                                       short A11611PAFOrd ,
                                       String A457FasCod ,
                                       short A7727ArtAdiCod )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXt_int5 = (short)(DecimalUtil.decToDouble(A11612PAFAdiPre)) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A11604PArtId ;
         GXv_int9[0] = A11611PAFOrd ;
         GXv_char3[0] = A457FasCod ;
         GXv_int8[0] = A7727ArtAdiCod ;
         GXv_char2[0] = httpContext.getMessage( httpContext.getMessage( "P", ""), "") ;
         GXv_int7[0] = GXt_int5 ;
         new app.ppedaesartpre(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int9, GXv_char3, GXv_int8, GXv_char2, GXv_int7) ;
         tpedaff_impl.this.A396EmprCod = GXv_char4[0] ;
         tpedaff_impl.this.A11604PArtId = GXv_int6[0] ;
         tpedaff_impl.this.A11611PAFOrd = GXv_int9[0] ;
         tpedaff_impl.this.A457FasCod = GXv_char3[0] ;
         tpedaff_impl.this.A7727ArtAdiCod = GXv_int8[0] ;
         tpedaff_impl.this.GXt_int5 = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A11604PArtId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11604PArtId), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11611PAFOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11611PAFOrd), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A11612PAFAdiPre = DecimalUtil.doubleToDec(GXt_int5) ;
         n11612PAFAdiPre = false ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11612PAFAdiPre, (byte)(10), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx6asaprecio1CE1542( String Gx_mode ,
                                    String A396EmprCod ,
                                    int A11604PArtId ,
                                    short A11611PAFOrd ,
                                    String A457FasCod ,
                                    short A7727ArtAdiCod )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXt_int5 = (short)(DecimalUtil.decToDouble(AV32Precio)) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A11604PArtId ;
         GXv_int9[0] = A11611PAFOrd ;
         GXv_char3[0] = A457FasCod ;
         GXv_int8[0] = A7727ArtAdiCod ;
         GXv_char2[0] = httpContext.getMessage( httpContext.getMessage( "P", ""), "") ;
         GXv_int7[0] = GXt_int5 ;
         new app.ppedaesartpre(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int9, GXv_char3, GXv_int8, GXv_char2, GXv_int7) ;
         tpedaff_impl.this.A396EmprCod = GXv_char4[0] ;
         tpedaff_impl.this.A11604PArtId = GXv_int6[0] ;
         tpedaff_impl.this.A11611PAFOrd = GXv_int9[0] ;
         tpedaff_impl.this.A457FasCod = GXv_char3[0] ;
         tpedaff_impl.this.A7727ArtAdiCod = GXv_int8[0] ;
         tpedaff_impl.this.GXt_int5 = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A11604PArtId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11604PArtId), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11611PAFOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11611PAFOrd), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         AV32Precio = DecimalUtil.doubleToDec(GXt_int5) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Precio", GXutil.ltrimstr( AV32Precio, 10, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV32Precio, (byte)(10), (byte)(2), ".", "")))+"\"") ;
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
      subsflControlProps_651542( ) ;
      while ( nGXsfl_65_idx <= nRC_GXsfl_65 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1CE1542( ) ;
         standaloneModal1CE1542( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1CE1542( ) ;
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_651542( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "ARTADICOD_" + sGXsfl_65_idx ;
      dynArtAdiCod.setName( GXCCtl );
      dynArtAdiCod.setWebtags( "" );
      GXCCtl = "PAFADIUNI_" + sGXsfl_65_idx ;
      cmbPAFAdiUni.setName( GXCCtl );
      cmbPAFAdiUni.setWebtags( "" );
      cmbPAFAdiUni.addItem("K", httpContext.getMessage( "Kilo", ""), (short)(0));
      cmbPAFAdiUni.addItem("M", httpContext.getMessage( "Metro", ""), (short)(0));
      cmbPAFAdiUni.addItem("F", httpContext.getMessage( "Fijo", ""), (short)(0));
      cmbPAFAdiUni.addItem("C", httpContext.getMessage( "Color", ""), (short)(0));
      if ( cmbPAFAdiUni.getItemCount() > 0 )
      {
         A11613PAFAdiUni = cmbPAFAdiUni.getValidValue(A11613PAFAdiUni) ;
         n11613PAFAdiUni = false ;
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01CE27 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01CE27_A407EmprNom[0] ;
      n407EmprNom = T01CE27_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(25);
      /* Using cursor T01CE28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Pedidos Estampación", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARTID");
         AnyError = (short)(1) ;
      }
      A252CliCod = T01CE28_A252CliCod[0] ;
      n252CliCod = T01CE28_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A65ArtCod = T01CE28_A65ArtCod[0] ;
      n65ArtCod = T01CE28_n65ArtCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      A758ProCod = T01CE28_A758ProCod[0] ;
      n758ProCod = T01CE28_n758ProCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
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

   public void valid_Emprcod( )
   {
      A7727ArtAdiCod = (short)(GXutil.lval( dynArtAdiCod.getValue())) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Paford( )
   {
      A7727ArtAdiCod = (short)(GXutil.lval( dynArtAdiCod.getValue())) ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", GXutil.rtrim( A65ArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", GXutil.rtrim( A758ProCod));
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", GXutil.rtrim( A457FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11604PArtId", GXutil.ltrim( localUtil.ntoc( Z11604PArtId, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11611PAFOrd", GXutil.ltrim( localUtil.ntoc( Z11611PAFOrd, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z460FasDsc", GXutil.rtrim( Z460FasDsc));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Artadicod( )
   {
      A7727ArtAdiCod = (short)(GXutil.lval( dynArtAdiCod.getValue())) ;
      n7728ArtAdiDsc = false ;
      n11612PAFAdiPre = false ;
      /* Using cursor T01CE29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Short.valueOf(A7727ArtAdiCod)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ArtAdi", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTADICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = dynArtAdiCod.getInternalname() ;
      }
      A7728ArtAdiDsc = T01CE29_A7728ArtAdiDsc[0] ;
      n7728ArtAdiDsc = T01CE29_n7728ArtAdiDsc[0] ;
      pr_default.close(27);
      if ( isIns( )  && true /* After */ )
      {
         GXt_int5 = (short)(DecimalUtil.decToDouble(A11612PAFAdiPre)) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A11604PArtId ;
         GXv_int9[0] = A11611PAFOrd ;
         GXv_char3[0] = A457FasCod ;
         GXv_int8[0] = A7727ArtAdiCod ;
         GXv_char2[0] = httpContext.getMessage( httpContext.getMessage( "P", ""), "") ;
         GXv_int7[0] = GXt_int5 ;
         new app.ppedaesartpre(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int9, GXv_char3, GXv_int8, GXv_char2, GXv_int7) ;
         tpedaff_impl.this.A396EmprCod = GXv_char4[0] ;
         tpedaff_impl.this.A11604PArtId = GXv_int6[0] ;
         tpedaff_impl.this.A11611PAFOrd = GXv_int9[0] ;
         tpedaff_impl.this.A457FasCod = GXv_char3[0] ;
         tpedaff_impl.this.A7727ArtAdiCod = GXv_int8[0] ;
         tpedaff_impl.this.GXt_int5 = GXv_int7[0] ;
         A11612PAFAdiPre = DecimalUtil.doubleToDec(GXt_int5) ;
         n11612PAFAdiPre = false ;
      }
      if ( isIns( )  && true /* After */ )
      {
         GXt_int5 = (short)(DecimalUtil.decToDouble(AV32Precio)) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A11604PArtId ;
         GXv_int9[0] = A11611PAFOrd ;
         GXv_char3[0] = A457FasCod ;
         GXv_int8[0] = A7727ArtAdiCod ;
         GXv_char2[0] = httpContext.getMessage( httpContext.getMessage( "P", ""), "") ;
         GXv_int7[0] = GXt_int5 ;
         new app.ppedaesartpre(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int9, GXv_char3, GXv_int8, GXv_char2, GXv_int7) ;
         tpedaff_impl.this.A396EmprCod = GXv_char4[0] ;
         tpedaff_impl.this.A11604PArtId = GXv_int6[0] ;
         tpedaff_impl.this.A11611PAFOrd = GXv_int9[0] ;
         tpedaff_impl.this.A457FasCod = GXv_char3[0] ;
         tpedaff_impl.this.A7727ArtAdiCod = GXv_int8[0] ;
         tpedaff_impl.this.GXt_int5 = GXv_int7[0] ;
         AV32Precio = DecimalUtil.doubleToDec(GXt_int5) ;
      }
      if ( AV32Precio.doubleValue() > 0 )
      {
         edtPAFAdiPre_Enabled = 0 ;
      }
      else
      {
         edtPAFAdiPre_Enabled = 1 ;
      }
      if ( AV32Precio.doubleValue() > 0 )
      {
         cmbPAFAdiUni.setEnabled( 0 );
      }
      else
      {
         cmbPAFAdiUni.setEnabled( 1 );
      }
      dynload_actions( ) ;
      if ( dynArtAdiCod.getItemCount() > 0 )
      {
         A7727ArtAdiCod = (short)(GXutil.lval( dynArtAdiCod.getValidValue(GXutil.trim( GXutil.str( A7727ArtAdiCod, 3, 0))))) ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynArtAdiCod.setValue( GXutil.trim( GXutil.str( A7727ArtAdiCod, 3, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7728ArtAdiDsc", GXutil.rtrim( A7728ArtAdiDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A11612PAFAdiPre", GXutil.ltrim( localUtil.ntoc( A11612PAFAdiPre, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV32Precio", GXutil.ltrim( localUtil.ntoc( AV32Precio, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, edtPAFAdiPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPAFAdiPre_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, cmbPAFAdiUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPAFAdiUni.getEnabled(), 5, 0), !bGXsfl_65_Refreshing);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11604PArtId',fld:'PARTID',pic:'ZZZZZZZ9'},{av:'A11611PAFOrd',fld:'PAFORD',pic:'ZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("EXIT","{handler:'e111CE2',iparms:[]");
      setEventMetadata("EXIT",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynArtAdiCod'},{av:'A7727ArtAdiCod',fld:'ARTADICOD',pic:'ZZ9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PARTID","{handler:'valid_Partid',iparms:[]");
      setEventMetadata("VALID_PARTID",",oparms:[]}");
      setEventMetadata("VALID_PAFORD","{handler:'valid_Paford',iparms:[{av:'A11604PArtId',fld:'PARTID',pic:'ZZZZZZZ9'},{av:'A11611PAFOrd',fld:'PAFORD',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynArtAdiCod'},{av:'A7727ArtAdiCod',fld:'ARTADICOD',pic:'ZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'}]");
      setEventMetadata("VALID_PAFORD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z11604PArtId'},{av:'Z11611PAFOrd'},{av:'Z407EmprNom'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z758ProCod'},{av:'Z457FasCod'},{av:'Z460FasDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("VALID_ARTADICOD","{handler:'valid_Artadicod',iparms:[{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A11611PAFOrd',fld:'PAFORD',pic:'ZZZ9'},{av:'A11604PArtId',fld:'PARTID',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV32Precio',fld:'vPRECIO',pic:'ZZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynArtAdiCod'},{av:'A7727ArtAdiCod',fld:'ARTADICOD',pic:'ZZ9'},{av:'A7728ArtAdiDsc',fld:'ARTADIDSC',pic:''},{av:'A11612PAFAdiPre',fld:'PAFADIPRE',pic:'ZZZZZZ9.99'}]");
      setEventMetadata("VALID_ARTADICOD",",oparms:[{av:'A7728ArtAdiDsc',fld:'ARTADIDSC',pic:''},{av:'A11612PAFAdiPre',fld:'PAFADIPRE',pic:'ZZZZZZ9.99'},{av:'AV32Precio',fld:'vPRECIO',pic:'ZZZZZZ9.99'},{av:'edtPAFAdiPre_Enabled',ctrl:'PAFADIPRE',prop:'Enabled'},{av:'cmbPAFAdiUni'}]}");
      setEventMetadata("VALID_PAFADIPRE","{handler:'valid_Pafadipre',iparms:[]");
      setEventMetadata("VALID_PAFADIPRE",",oparms:[]}");
      setEventMetadata("VALID_PAFADIUNI","{handler:'valid_Pafadiuni',iparms:[]");
      setEventMetadata("VALID_PAFADIUNI",",oparms:[]}");
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
      pr_default.close(22);
      pr_default.close(25);
      pr_default.close(26);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA457FasCod = "" ;
      wcpOA460FasDsc = "" ;
      Z396EmprCod = "" ;
      Z11612PAFAdiPre = DecimalUtil.ZERO ;
      Z11613PAFAdiUni = "" ;
      O11613PAFAdiUni = "" ;
      O11612PAFAdiPre = DecimalUtil.ZERO ;
      N11612PAFAdiPre = DecimalUtil.ZERO ;
      N11613PAFAdiUni = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A65ArtCod = "" ;
      lblTextblock6_Jsonclick = "" ;
      A758ProCod = "" ;
      lblTextblock7_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1542 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV34Pgmname = "" ;
      Gx_msg = "" ;
      AV32Precio = DecimalUtil.ZERO ;
      A7728ArtAdiDsc = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1541 = "" ;
      GXCCtl = "" ;
      A11612PAFAdiPre = DecimalUtil.ZERO ;
      A11613PAFAdiUni = "" ;
      T11613PAFAdiUni = "" ;
      T11612PAFAdiPre = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z457FasCod = "" ;
      Z407EmprNom = "" ;
      Z460FasDsc = "" ;
      Z65ArtCod = "" ;
      Z758ProCod = "" ;
      T01CE7_A407EmprNom = new String[] {""} ;
      T01CE7_n407EmprNom = new boolean[] {false} ;
      T01CE9_A252CliCod = new int[1] ;
      T01CE9_n252CliCod = new boolean[] {false} ;
      T01CE9_A65ArtCod = new String[] {""} ;
      T01CE9_n65ArtCod = new boolean[] {false} ;
      T01CE9_A758ProCod = new String[] {""} ;
      T01CE9_n758ProCod = new boolean[] {false} ;
      T01CE8_A460FasDsc = new String[] {""} ;
      T01CE10_A11611PAFOrd = new short[1] ;
      T01CE10_A457FasCod = new String[] {""} ;
      T01CE10_A460FasDsc = new String[] {""} ;
      T01CE10_A407EmprNom = new String[] {""} ;
      T01CE10_n407EmprNom = new boolean[] {false} ;
      T01CE10_A396EmprCod = new String[] {""} ;
      T01CE10_A11604PArtId = new int[1] ;
      T01CE10_A252CliCod = new int[1] ;
      T01CE10_n252CliCod = new boolean[] {false} ;
      T01CE10_A65ArtCod = new String[] {""} ;
      T01CE10_n65ArtCod = new boolean[] {false} ;
      T01CE10_A758ProCod = new String[] {""} ;
      T01CE10_n758ProCod = new boolean[] {false} ;
      T01CE11_A396EmprCod = new String[] {""} ;
      T01CE11_A11604PArtId = new int[1] ;
      T01CE11_A11611PAFOrd = new short[1] ;
      T01CE6_A11611PAFOrd = new short[1] ;
      T01CE6_A457FasCod = new String[] {""} ;
      T01CE6_A396EmprCod = new String[] {""} ;
      T01CE6_A11604PArtId = new int[1] ;
      T01CE12_A396EmprCod = new String[] {""} ;
      T01CE12_A11604PArtId = new int[1] ;
      T01CE12_A11611PAFOrd = new short[1] ;
      T01CE12_A457FasCod = new String[] {""} ;
      T01CE13_A396EmprCod = new String[] {""} ;
      T01CE13_A11604PArtId = new int[1] ;
      T01CE13_A11611PAFOrd = new short[1] ;
      T01CE13_A457FasCod = new String[] {""} ;
      T01CE5_A11611PAFOrd = new short[1] ;
      T01CE5_A457FasCod = new String[] {""} ;
      T01CE5_A396EmprCod = new String[] {""} ;
      T01CE5_A11604PArtId = new int[1] ;
      T01CE17_A396EmprCod = new String[] {""} ;
      T01CE17_A11604PArtId = new int[1] ;
      T01CE17_A11611PAFOrd = new short[1] ;
      Z7728ArtAdiDsc = "" ;
      T01CE4_A7728ArtAdiDsc = new String[] {""} ;
      T01CE4_n7728ArtAdiDsc = new boolean[] {false} ;
      T01CE18_A11604PArtId = new int[1] ;
      T01CE18_A11611PAFOrd = new short[1] ;
      T01CE18_A11612PAFAdiPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01CE18_n11612PAFAdiPre = new boolean[] {false} ;
      T01CE18_A7728ArtAdiDsc = new String[] {""} ;
      T01CE18_n7728ArtAdiDsc = new boolean[] {false} ;
      T01CE18_A11613PAFAdiUni = new String[] {""} ;
      T01CE18_n11613PAFAdiUni = new boolean[] {false} ;
      T01CE18_A396EmprCod = new String[] {""} ;
      T01CE18_A7727ArtAdiCod = new short[1] ;
      T01CE19_A7728ArtAdiDsc = new String[] {""} ;
      T01CE19_n7728ArtAdiDsc = new boolean[] {false} ;
      T01CE20_A396EmprCod = new String[] {""} ;
      T01CE20_A11604PArtId = new int[1] ;
      T01CE20_A11611PAFOrd = new short[1] ;
      T01CE20_A7727ArtAdiCod = new short[1] ;
      T01CE3_A11604PArtId = new int[1] ;
      T01CE3_A11611PAFOrd = new short[1] ;
      T01CE3_A11612PAFAdiPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01CE3_n11612PAFAdiPre = new boolean[] {false} ;
      T01CE3_A11613PAFAdiUni = new String[] {""} ;
      T01CE3_n11613PAFAdiUni = new boolean[] {false} ;
      T01CE3_A396EmprCod = new String[] {""} ;
      T01CE3_A7727ArtAdiCod = new short[1] ;
      T01CE2_A11604PArtId = new int[1] ;
      T01CE2_A11611PAFOrd = new short[1] ;
      T01CE2_A11612PAFAdiPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01CE2_n11612PAFAdiPre = new boolean[] {false} ;
      T01CE2_A11613PAFAdiUni = new String[] {""} ;
      T01CE2_n11613PAFAdiUni = new boolean[] {false} ;
      T01CE2_A396EmprCod = new String[] {""} ;
      T01CE2_A7727ArtAdiCod = new short[1] ;
      T01CE24_A7728ArtAdiDsc = new String[] {""} ;
      T01CE24_n7728ArtAdiDsc = new boolean[] {false} ;
      T01CE25_A396EmprCod = new String[] {""} ;
      T01CE25_A11604PArtId = new int[1] ;
      T01CE25_A11611PAFOrd = new short[1] ;
      T01CE25_A7727ArtAdiCod = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      T01CE26_A396EmprCod = new String[] {""} ;
      T01CE26_A7727ArtAdiCod = new short[1] ;
      T01CE26_A7728ArtAdiDsc = new String[] {""} ;
      T01CE26_n7728ArtAdiDsc = new boolean[] {false} ;
      T01CE27_A407EmprNom = new String[] {""} ;
      T01CE27_n407EmprNom = new boolean[] {false} ;
      T01CE28_A252CliCod = new int[1] ;
      T01CE28_n252CliCod = new boolean[] {false} ;
      T01CE28_A65ArtCod = new String[] {""} ;
      T01CE28_n65ArtCod = new boolean[] {false} ;
      T01CE28_A758ProCod = new String[] {""} ;
      T01CE28_n758ProCod = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ65ArtCod = "" ;
      ZZ758ProCod = "" ;
      ZZ457FasCod = "" ;
      ZZ460FasDsc = "" ;
      T01CE29_A7728ArtAdiDsc = new String[] {""} ;
      T01CE29_n7728ArtAdiDsc = new boolean[] {false} ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int9 = new short[1] ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_int7 = new short[1] ;
      ZV32Precio = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tpedaff__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpedaff__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpedaff__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpedaff__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpedaff__default(),
         new Object[] {
             new Object[] {
            T01CE2_A11604PArtId, T01CE2_A11611PAFOrd, T01CE2_A11612PAFAdiPre, T01CE2_n11612PAFAdiPre, T01CE2_A11613PAFAdiUni, T01CE2_n11613PAFAdiUni, T01CE2_A396EmprCod, T01CE2_A7727ArtAdiCod
            }
            , new Object[] {
            T01CE3_A11604PArtId, T01CE3_A11611PAFOrd, T01CE3_A11612PAFAdiPre, T01CE3_n11612PAFAdiPre, T01CE3_A11613PAFAdiUni, T01CE3_n11613PAFAdiUni, T01CE3_A396EmprCod, T01CE3_A7727ArtAdiCod
            }
            , new Object[] {
            T01CE4_A7728ArtAdiDsc, T01CE4_n7728ArtAdiDsc
            }
            , new Object[] {
            T01CE5_A11611PAFOrd, T01CE5_A457FasCod, T01CE5_A396EmprCod, T01CE5_A11604PArtId
            }
            , new Object[] {
            T01CE6_A11611PAFOrd, T01CE6_A457FasCod, T01CE6_A396EmprCod, T01CE6_A11604PArtId
            }
            , new Object[] {
            T01CE7_A407EmprNom, T01CE7_n407EmprNom
            }
            , new Object[] {
            T01CE8_A460FasDsc
            }
            , new Object[] {
            T01CE9_A252CliCod, T01CE9_n252CliCod, T01CE9_A65ArtCod, T01CE9_n65ArtCod, T01CE9_A758ProCod, T01CE9_n758ProCod
            }
            , new Object[] {
            T01CE10_A11611PAFOrd, T01CE10_A457FasCod, T01CE10_A460FasDsc, T01CE10_A407EmprNom, T01CE10_n407EmprNom, T01CE10_A396EmprCod, T01CE10_A11604PArtId, T01CE10_A252CliCod, T01CE10_n252CliCod, T01CE10_A65ArtCod,
            T01CE10_n65ArtCod, T01CE10_A758ProCod, T01CE10_n758ProCod
            }
            , new Object[] {
            T01CE11_A396EmprCod, T01CE11_A11604PArtId, T01CE11_A11611PAFOrd
            }
            , new Object[] {
            T01CE12_A396EmprCod, T01CE12_A11604PArtId, T01CE12_A11611PAFOrd, T01CE12_A457FasCod
            }
            , new Object[] {
            T01CE13_A396EmprCod, T01CE13_A11604PArtId, T01CE13_A11611PAFOrd, T01CE13_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01CE17_A396EmprCod, T01CE17_A11604PArtId, T01CE17_A11611PAFOrd
            }
            , new Object[] {
            T01CE18_A11604PArtId, T01CE18_A11611PAFOrd, T01CE18_A11612PAFAdiPre, T01CE18_n11612PAFAdiPre, T01CE18_A7728ArtAdiDsc, T01CE18_n7728ArtAdiDsc, T01CE18_A11613PAFAdiUni, T01CE18_n11613PAFAdiUni, T01CE18_A396EmprCod, T01CE18_A7727ArtAdiCod
            }
            , new Object[] {
            T01CE19_A7728ArtAdiDsc, T01CE19_n7728ArtAdiDsc
            }
            , new Object[] {
            T01CE20_A396EmprCod, T01CE20_A11604PArtId, T01CE20_A11611PAFOrd, T01CE20_A7727ArtAdiCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01CE24_A7728ArtAdiDsc, T01CE24_n7728ArtAdiDsc
            }
            , new Object[] {
            T01CE25_A396EmprCod, T01CE25_A11604PArtId, T01CE25_A11611PAFOrd, T01CE25_A7727ArtAdiCod
            }
            , new Object[] {
            T01CE26_A396EmprCod, T01CE26_A7727ArtAdiCod, T01CE26_A7728ArtAdiDsc, T01CE26_n7728ArtAdiDsc
            }
            , new Object[] {
            T01CE27_A407EmprNom, T01CE27_n407EmprNom
            }
            , new Object[] {
            T01CE28_A252CliCod, T01CE28_n252CliCod, T01CE28_A65ArtCod, T01CE28_n65ArtCod, T01CE28_A758ProCod, T01CE28_n758ProCod
            }
            , new Object[] {
            T01CE29_A7728ArtAdiDsc, T01CE29_n7728ArtAdiDsc
            }
         }
      );
      Z460FasDsc = "" ;
      A460FasDsc = "" ;
      Z457FasCod = "" ;
      A457FasCod = "" ;
      Z11611PAFOrd = (short)(0) ;
      A11611PAFOrd = (short)(0) ;
      Z11604PArtId = 0 ;
      A11604PArtId = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV34Pgmname = "TPEDAFF" ;
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
   private short wcpOA11611PAFOrd ;
   private short Z11611PAFOrd ;
   private short Z7727ArtAdiCod ;
   private short nRcdDeleted_1542 ;
   private short nRcdExists_1542 ;
   private short nIsMod_1542 ;
   private short A11611PAFOrd ;
   private short A7727ArtAdiCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1542 ;
   private short RcdFound1542 ;
   private short nBlankRcdUsr1542 ;
   private short RcdFound1541 ;
   private short nIsDirty_1541 ;
   private short nIsDirty_1542 ;
   private short ZZ11611PAFOrd ;
   private short GXt_int5 ;
   private short GXv_int9[] ;
   private short GXv_int8[] ;
   private short GXv_int7[] ;
   private int wcpOA11604PArtId ;
   private int Z11604PArtId ;
   private int nRC_GXsfl_65 ;
   private int nGXsfl_65_idx=1 ;
   private int A11604PArtId ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtPArtId_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtArtCod_Enabled ;
   private int edtProCod_Enabled ;
   private int edtPAFOrd_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtavnRcdDeleted_1542_Enabled ;
   private int edtPAFAdiPre_Enabled ;
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
   private int Z252CliCod ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defcmbPAFAdiUni_Enabled ;
   private int defedtPAFAdiPre_Enabled ;
   private int defdynArtAdiCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtFasDsc_Backcolor ;
   private int edtFasCod_Backcolor ;
   private int edtPAFOrd_Backcolor ;
   private int edtProCod_Backcolor ;
   private int edtArtCod_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtPArtId_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int gxdynajaxindex ;
   private int ZZ11604PArtId ;
   private int ZZ252CliCod ;
   private int GXv_int6[] ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z11612PAFAdiPre ;
   private java.math.BigDecimal O11612PAFAdiPre ;
   private java.math.BigDecimal N11612PAFAdiPre ;
   private java.math.BigDecimal AV32Precio ;
   private java.math.BigDecimal A11612PAFAdiPre ;
   private java.math.BigDecimal T11612PAFAdiPre ;
   private java.math.BigDecimal ZV32Precio ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA457FasCod ;
   private String wcpOA460FasDsc ;
   private String Z396EmprCod ;
   private String Z11613PAFAdiUni ;
   private String O11613PAFAdiUni ;
   private String N11613PAFAdiUni ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String A457FasCod ;
   private String A460FasDsc ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtPArtId_Internalname ;
   private String edtPArtId_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtArtCod_Internalname ;
   private String A65ArtCod ;
   private String edtArtCod_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtProCod_Internalname ;
   private String A758ProCod ;
   private String edtProCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtPAFOrd_Internalname ;
   private String edtPAFOrd_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtFasCod_Internalname ;
   private String edtFasCod_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtFasDsc_Internalname ;
   private String edtFasDsc_Jsonclick ;
   private String sMode1542 ;
   private String edtavnRcdDeleted_1542_Internalname ;
   private String edtPAFAdiPre_Internalname ;
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
   private String Gx_msg ;
   private String A7728ArtAdiDsc ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1541 ;
   private String GXCCtl ;
   private String A11613PAFAdiUni ;
   private String T11613PAFAdiUni ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z457FasCod ;
   private String Z407EmprNom ;
   private String Z460FasDsc ;
   private String Z65ArtCod ;
   private String Z758ProCod ;
   private String Z7728ArtAdiDsc ;
   private String sGXsfl_65_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1542_Jsonclick ;
   private String edtPAFAdiPre_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String gxwrpcisep ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ65ArtCod ;
   private String ZZ758ProCod ;
   private String ZZ457FasCod ;
   private String ZZ460FasDsc ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_65_Refreshing=false ;
   private boolean n7728ArtAdiDsc ;
   private boolean n407EmprNom ;
   private boolean n252CliCod ;
   private boolean n65ArtCod ;
   private boolean n758ProCod ;
   private boolean returnInSub ;
   private boolean n11612PAFAdiPre ;
   private boolean n11613PAFAdiUni ;
   private boolean gxdyncontrolsrefreshing ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private HTMLChoice dynArtAdiCod ;
   private HTMLChoice cmbPAFAdiUni ;
   private IDataStoreProvider pr_default ;
   private String[] T01CE7_A407EmprNom ;
   private boolean[] T01CE7_n407EmprNom ;
   private int[] T01CE9_A252CliCod ;
   private boolean[] T01CE9_n252CliCod ;
   private String[] T01CE9_A65ArtCod ;
   private boolean[] T01CE9_n65ArtCod ;
   private String[] T01CE9_A758ProCod ;
   private boolean[] T01CE9_n758ProCod ;
   private String[] T01CE8_A460FasDsc ;
   private short[] T01CE10_A11611PAFOrd ;
   private String[] T01CE10_A457FasCod ;
   private String[] T01CE10_A460FasDsc ;
   private String[] T01CE10_A407EmprNom ;
   private boolean[] T01CE10_n407EmprNom ;
   private String[] T01CE10_A396EmprCod ;
   private int[] T01CE10_A11604PArtId ;
   private int[] T01CE10_A252CliCod ;
   private boolean[] T01CE10_n252CliCod ;
   private String[] T01CE10_A65ArtCod ;
   private boolean[] T01CE10_n65ArtCod ;
   private String[] T01CE10_A758ProCod ;
   private boolean[] T01CE10_n758ProCod ;
   private String[] T01CE11_A396EmprCod ;
   private int[] T01CE11_A11604PArtId ;
   private short[] T01CE11_A11611PAFOrd ;
   private short[] T01CE6_A11611PAFOrd ;
   private String[] T01CE6_A457FasCod ;
   private String[] T01CE6_A396EmprCod ;
   private int[] T01CE6_A11604PArtId ;
   private String[] T01CE12_A396EmprCod ;
   private int[] T01CE12_A11604PArtId ;
   private short[] T01CE12_A11611PAFOrd ;
   private String[] T01CE12_A457FasCod ;
   private String[] T01CE13_A396EmprCod ;
   private int[] T01CE13_A11604PArtId ;
   private short[] T01CE13_A11611PAFOrd ;
   private String[] T01CE13_A457FasCod ;
   private short[] T01CE5_A11611PAFOrd ;
   private String[] T01CE5_A457FasCod ;
   private String[] T01CE5_A396EmprCod ;
   private int[] T01CE5_A11604PArtId ;
   private String[] T01CE17_A396EmprCod ;
   private int[] T01CE17_A11604PArtId ;
   private short[] T01CE17_A11611PAFOrd ;
   private String[] T01CE4_A7728ArtAdiDsc ;
   private boolean[] T01CE4_n7728ArtAdiDsc ;
   private int[] T01CE18_A11604PArtId ;
   private short[] T01CE18_A11611PAFOrd ;
   private java.math.BigDecimal[] T01CE18_A11612PAFAdiPre ;
   private boolean[] T01CE18_n11612PAFAdiPre ;
   private String[] T01CE18_A7728ArtAdiDsc ;
   private boolean[] T01CE18_n7728ArtAdiDsc ;
   private String[] T01CE18_A11613PAFAdiUni ;
   private boolean[] T01CE18_n11613PAFAdiUni ;
   private String[] T01CE18_A396EmprCod ;
   private short[] T01CE18_A7727ArtAdiCod ;
   private String[] T01CE19_A7728ArtAdiDsc ;
   private boolean[] T01CE19_n7728ArtAdiDsc ;
   private String[] T01CE20_A396EmprCod ;
   private int[] T01CE20_A11604PArtId ;
   private short[] T01CE20_A11611PAFOrd ;
   private short[] T01CE20_A7727ArtAdiCod ;
   private int[] T01CE3_A11604PArtId ;
   private short[] T01CE3_A11611PAFOrd ;
   private java.math.BigDecimal[] T01CE3_A11612PAFAdiPre ;
   private boolean[] T01CE3_n11612PAFAdiPre ;
   private String[] T01CE3_A11613PAFAdiUni ;
   private boolean[] T01CE3_n11613PAFAdiUni ;
   private String[] T01CE3_A396EmprCod ;
   private short[] T01CE3_A7727ArtAdiCod ;
   private int[] T01CE2_A11604PArtId ;
   private short[] T01CE2_A11611PAFOrd ;
   private java.math.BigDecimal[] T01CE2_A11612PAFAdiPre ;
   private boolean[] T01CE2_n11612PAFAdiPre ;
   private String[] T01CE2_A11613PAFAdiUni ;
   private boolean[] T01CE2_n11613PAFAdiUni ;
   private String[] T01CE2_A396EmprCod ;
   private short[] T01CE2_A7727ArtAdiCod ;
   private String[] T01CE24_A7728ArtAdiDsc ;
   private boolean[] T01CE24_n7728ArtAdiDsc ;
   private String[] T01CE25_A396EmprCod ;
   private int[] T01CE25_A11604PArtId ;
   private short[] T01CE25_A11611PAFOrd ;
   private short[] T01CE25_A7727ArtAdiCod ;
   private String[] T01CE26_A396EmprCod ;
   private short[] T01CE26_A7727ArtAdiCod ;
   private String[] T01CE26_A7728ArtAdiDsc ;
   private boolean[] T01CE26_n7728ArtAdiDsc ;
   private String[] T01CE27_A407EmprNom ;
   private boolean[] T01CE27_n407EmprNom ;
   private int[] T01CE28_A252CliCod ;
   private boolean[] T01CE28_n252CliCod ;
   private String[] T01CE28_A65ArtCod ;
   private boolean[] T01CE28_n65ArtCod ;
   private String[] T01CE28_A758ProCod ;
   private boolean[] T01CE28_n758ProCod ;
   private String[] T01CE29_A7728ArtAdiDsc ;
   private boolean[] T01CE29_n7728ArtAdiDsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpedaff__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpedaff__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpedaff__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpedaff__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpedaff__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01CE2", "SELECT PArtId, PAFOrd, PAFAdiPre, PAFAdiUni, EmprCod, ArtAdiCod FROM TXPPEDAFF WHERE EmprCod = ? AND PArtId = ? AND PAFOrd = ? AND ArtAdiCod = ?  FOR UPDATE OF PAFAdiPre, PAFAdiUni NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01CE3", "SELECT PArtId, PAFOrd, PAFAdiPre, PAFAdiUni, EmprCod, ArtAdiCod FROM TXPPEDAFF WHERE EmprCod = ? AND PArtId = ? AND PAFOrd = ? AND ArtAdiCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01CE4", "SELECT ArtAdiDsc FROM TXPArtAdi WHERE EmprCod = ? AND ArtAdiCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01CE5", "SELECT PAFOrd, FasCod, EmprCod, PArtId FROM TXPPedAFa WHERE EmprCod = ? AND PArtId = ? AND PAFOrd = ?  FOR UPDATE OF FasCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01CE6", "SELECT PAFOrd, FasCod, EmprCod, PArtId FROM TXPPedAFa WHERE EmprCod = ? AND PArtId = ? AND PAFOrd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01CE7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01CE8", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01CE9", "SELECT CliCod, ArtCod, ProCod FROM TXPPedAEs WHERE EmprCod = ? AND PArtId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01CE10", "SELECT /*+ FIRST_ROWS(1) */ TM1.PAFOrd, TM1.FasCod, T3.FasDsc, T2.EmprNom, TM1.EmprCod, TM1.PArtId, T4.CliCod, T4.ArtCod, T4.ProCod FROM (((TXPPedAFa TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = TM1.EmprCod AND T3.FasCod = TM1.FasCod) INNER JOIN TXPPedAEs T4 ON T4.EmprCod = TM1.EmprCod AND T4.PArtId = TM1.PArtId) WHERE TM1.EmprCod = ? and TM1.PArtId = ? and TM1.PAFOrd = ? and TM1.FasCod = ? ORDER BY TM1.EmprCod, TM1.PArtId, TM1.PAFOrd ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01CE11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PArtId, PAFOrd FROM TXPPedAFa WHERE EmprCod = ? AND PArtId = ? AND PAFOrd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01CE12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PArtId, PAFOrd, FasCod FROM TXPPedAFa WHERE EmprCod = ? and PArtId = ? and PAFOrd = ? and FasCod = ? ORDER BY EmprCod, PArtId, PAFOrd) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01CE13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PArtId, PAFOrd, FasCod FROM TXPPedAFa WHERE EmprCod = ? and PArtId = ? and PAFOrd = ? and FasCod = ? ORDER BY EmprCod DESC, PArtId DESC, PAFOrd DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01CE14", "INSERT INTO TXPPedAFa(PAFOrd, FasCod, EmprCod, PArtId, PAFPre, PAFDto, PAFRec, PAFUni, PAFAut) VALUES(?, ?, ?, ?, 0, 0, 0, ' ', 0)", GX_NOMASK, "TXPPedAFa")
         ,new UpdateCursor("T01CE15", "UPDATE TXPPedAFa SET FasCod=?  WHERE EmprCod = ? AND PArtId = ? AND PAFOrd = ?", GX_NOMASK, "TXPPedAFa")
         ,new UpdateCursor("T01CE16", "DELETE FROM TXPPedAFa  WHERE EmprCod = ? AND PArtId = ? AND PAFOrd = ?", GX_NOMASK, "TXPPedAFa")
         ,new ForEachCursor("T01CE17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PArtId, PAFOrd FROM TXPPedAFa WHERE EmprCod = ? and PArtId = ? and PAFOrd = ? and FasCod = ? ORDER BY EmprCod, PArtId, PAFOrd ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01CE18", "SELECT T1.PArtId, T1.PAFOrd, T1.PAFAdiPre, T2.ArtAdiDsc, T1.PAFAdiUni, T1.EmprCod, T1.ArtAdiCod FROM (TXPPEDAFF T1 INNER JOIN TXPArtAdi T2 ON T2.EmprCod = T1.EmprCod AND T2.ArtAdiCod = T1.ArtAdiCod) WHERE T1.EmprCod = ? and T1.PArtId = ? and T1.PAFOrd = ? and T1.ArtAdiCod = ? ORDER BY T1.EmprCod, T1.PArtId, T1.PAFOrd, T1.ArtAdiCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01CE19", "SELECT ArtAdiDsc FROM TXPArtAdi WHERE EmprCod = ? AND ArtAdiCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01CE20", "SELECT EmprCod, PArtId, PAFOrd, ArtAdiCod FROM TXPPEDAFF WHERE EmprCod = ? AND PArtId = ? AND PAFOrd = ? AND ArtAdiCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01CE21", "INSERT INTO TXPPEDAFF(PArtId, PAFOrd, PAFAdiPre, PAFAdiUni, EmprCod, ArtAdiCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPEDAFF")
         ,new UpdateCursor("T01CE22", "UPDATE TXPPEDAFF SET PAFAdiPre=?, PAFAdiUni=?  WHERE EmprCod = ? AND PArtId = ? AND PAFOrd = ? AND ArtAdiCod = ?", GX_NOMASK, "TXPPEDAFF")
         ,new UpdateCursor("T01CE23", "DELETE FROM TXPPEDAFF  WHERE EmprCod = ? AND PArtId = ? AND PAFOrd = ? AND ArtAdiCod = ?", GX_NOMASK, "TXPPEDAFF")
         ,new ForEachCursor("T01CE24", "SELECT ArtAdiDsc FROM TXPArtAdi WHERE EmprCod = ? AND ArtAdiCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01CE25", "SELECT EmprCod, PArtId, PAFOrd, ArtAdiCod FROM TXPPEDAFF WHERE EmprCod = ? and PArtId = ? and PAFOrd = ? ORDER BY EmprCod, PArtId, PAFOrd, ArtAdiCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01CE26", "SELECT EmprCod, ArtAdiCod, ArtAdiDsc FROM TXPArtAdi WHERE EmprCod = ? ORDER BY ArtAdiDsc ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01CE27", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01CE28", "SELECT CliCod, ArtCod, ProCod FROM TXPPedAEs WHERE EmprCod = ? AND PArtId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01CE29", "SELECT ArtAdiDsc FROM TXPArtAdi WHERE EmprCod = ? AND ArtAdiCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((short[]) buf[7])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((short[]) buf[7])[0] = rslt.getShort(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               ((short[]) buf[9])[0] = rslt.getShort(7);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 27 :
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 12 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 19 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 1);
               }
               stmt.setString(5, (String)parms[6], 3);
               stmt.setShort(6, ((Number) parms[7]).shortValue());
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               stmt.setShort(6, ((Number) parms[7]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

