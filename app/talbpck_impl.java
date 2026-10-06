package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talbpck_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A3622AlbPckCaj = httpContext.GetPar( "AlbPckCaj") ;
         n3622AlbPckCaj = false ;
         AV26SumCaj = (byte)(GXutil.lval( httpContext.GetPar( "SumCaj"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26SumCaj", GXutil.str( AV26SumCaj, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_12_DM507( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A3622AlbPckCaj, AV26SumCaj) ;
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
            A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PACKING LIST", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBarFasExtD_Internalname ;
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
      A3829AlbPckUlin = (short)(GXutil.lval( httpContext.GetPar( "AlbPckUlin"))) ;
      n3829AlbPckUlin = false ;
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

   public talbpck_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public talbpck_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talbpck_impl.class ));
   }

   public talbpck_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBPCK.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBPCK.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBPCK.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBPCK.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TALBPCK.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBPCK.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBPCK.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Numero Albaran Produccion", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBPCK.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "", "", "", "", "", 1, edtAlbProCod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBPCK.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBPCK.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBPCK.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBPCK.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBPCK.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBPCK.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBPCK.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBPCK.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Ultima Linea Packing List", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBPCK.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPckUlin_Internalname, GXutil.ltrim( localUtil.ntoc( A3829AlbPckUlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPckUlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3829AlbPckUlin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3829AlbPckUlin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPckUlin_Jsonclick, 0, "", "", "", "", "", 1, edtAlbPckUlin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBPCK.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Descripcion Fase Externa", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBPCK.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasExtD_Internalname, GXutil.rtrim( A2399BarFasExtD), GXutil.rtrim( localUtil.format( A2399BarFasExtD, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasExtD_Jsonclick, 0, "", "", "", "", "", edtBarFasExtD_Visible, edtBarFasExtD_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBPCK.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Disposicion Cliente nueva", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBPCK.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbEncCli_Internalname, GXutil.rtrim( A4815AlbEncCli), GXutil.rtrim( localUtil.format( A4815AlbEncCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbEncCli_Jsonclick, 0, "", "", "", "", "", edtAlbEncCli_Visible, edtAlbEncCli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBPCK.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Descripción Serie", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBPCK.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSerDsc_Internalname, GXutil.rtrim( A1652BarSerDsc), GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSerDsc_Jsonclick, 0, "", "", "", "", "", 1, edtBarSerDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBPCK.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Numero de Mezcla", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBPCK.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNMez_Internalname, GXutil.rtrim( A1499BarNMez), GXutil.rtrim( localUtil.format( A1499BarNMez, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNMez_Jsonclick, 0, "", "", "", "", "", 1, edtBarNMez_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBPCK.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBPCK.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom), GXutil.rtrim( localUtil.format( A135BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNom_Jsonclick, 0, "", "", "", "", "", 1, edtBarColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBPCK.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBPCK.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBPCK.htm");
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
         nBlankRcdCount507 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_507 = (short)(1) ;
            scanStartDM507( ) ;
            while ( RcdFound507 != 0 )
            {
               init_level_properties507( ) ;
               getByPrimaryKeyDM507( ) ;
               addRowDM507( ) ;
               scanNextDM507( ) ;
            }
            scanEndDM507( ) ;
            nBlankRcdCount507 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B3829AlbPckUlin = A3829AlbPckUlin ;
         n3829AlbPckUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
         standaloneNotModalDM507( ) ;
         standaloneModalDM507( ) ;
         sMode507 = Gx_mode ;
         while ( nGXsfl_80_idx < nRC_GXsfl_80 )
         {
            bGXsfl_80_Refreshing = true ;
            readRowDM507( ) ;
            edtavnRcdDeleted_507_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_507_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_507_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_507_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtAlbPckLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKLIN_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPckLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckLin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtAlbPckCaj_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKCAJ_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPckCaj_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckCaj_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtAlbPckKn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKKN_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPckKn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckKn_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtAlbPckKb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKKB_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPckKb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckKb_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtAlbPckTar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKTAR_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPckTar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckTar_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtAlbPckUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKUNI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPckUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckUni_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtAlbPckCal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKCAL_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPckCal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckCal_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            if ( ( nRcdExists_507 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalDM507( ) ;
            }
            sendRowDM507( ) ;
            bGXsfl_80_Refreshing = false ;
         }
         Gx_mode = sMode507 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A3829AlbPckUlin = B3829AlbPckUlin ;
         n3829AlbPckUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount507 = (short)(5) ;
         nRcdExists_507 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartDM507( ) ;
            while ( RcdFound507 != 0 )
            {
               sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_80507( ) ;
               init_level_properties507( ) ;
               standaloneNotModalDM507( ) ;
               getByPrimaryKeyDM507( ) ;
               standaloneModalDM507( ) ;
               addRowDM507( ) ;
               scanNextDM507( ) ;
            }
            scanEndDM507( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode507 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_80507( ) ;
      initAllDM507( ) ;
      init_level_properties507( ) ;
      B3829AlbPckUlin = A3829AlbPckUlin ;
      n3829AlbPckUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
      nRcdExists_507 = (short)(0) ;
      nIsMod_507 = (short)(0) ;
      nRcdDeleted_507 = (short)(0) ;
      nBlankRcdCount507 = (short)(nBlankRcdUsr507+nBlankRcdCount507) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount507 > 0 )
      {
         standaloneNotModalDM507( ) ;
         standaloneModalDM507( ) ;
         addRowDM507( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtAlbPckLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount507 = (short)(nBlankRcdCount507-1) ;
      }
      Gx_mode = sMode507 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A3829AlbPckUlin = B3829AlbPckUlin ;
      n3829AlbPckUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBPCK.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBPCK.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBPCK.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBPCK.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TALBPCK.htm");
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
      e11DM2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z30AlbProCod = localUtil.ctol( httpContext.cgiGet( "Z30AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z2399BarFasExtD = httpContext.cgiGet( "Z2399BarFasExtD") ;
            Z4815AlbEncCli = httpContext.cgiGet( "Z4815AlbEncCli") ;
            Z3829AlbPckUlin = (short)(localUtil.ctol( httpContext.cgiGet( "Z3829AlbPckUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O3829AlbPckUlin = (short)(localUtil.ctol( httpContext.cgiGet( "O3829AlbPckUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_80 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_80"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV25FlagHss = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGHSS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV26SumCaj = (byte)(localUtil.ctol( httpContext.cgiGet( "vSUMCAJ"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A3829AlbPckUlin = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbPckUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3829AlbPckUlin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
            A2399BarFasExtD = httpContext.cgiGet( edtBarFasExtD_Internalname) ;
            n2399BarFasExtD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2399BarFasExtD", A2399BarFasExtD);
            A4815AlbEncCli = httpContext.cgiGet( edtAlbEncCli_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4815AlbEncCli", A4815AlbEncCli);
            A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
            A1499BarNMez = httpContext.cgiGet( edtBarNMez_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1499BarNMez", A1499BarNMez);
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
               A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
                        e11DM2 ();
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
            initAllDM195( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_507_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_507_Enabled), 5, 0), !bGXsfl_80_Refreshing);
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
      disableAttributesDM195( ) ;
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

   public void confirm_DM0( )
   {
      beforeValidateDM195( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsDM195( ) ;
         }
         else
         {
            checkExtendedTableDM195( ) ;
            if ( AnyError == 0 )
            {
               zmDM195( 14) ;
               zmDM195( 15) ;
               zmDM195( 16) ;
            }
            closeExtendedTableCursorsDM195( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode195 = Gx_mode ;
         confirm_DM507( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode195 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesDM0( ) ;
      }
   }

   public void confirm_DM507( )
   {
      s3829AlbPckUlin = O3829AlbPckUlin ;
      n3829AlbPckUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRowDM507( ) ;
         if ( ( nRcdExists_507 != 0 ) || ( nIsMod_507 != 0 ) )
         {
            getKeyDM507( ) ;
            if ( ( nRcdExists_507 == 0 ) && ( nRcdDeleted_507 == 0 ) )
            {
               if ( RcdFound507 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateDM507( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableDM507( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsDM507( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O3829AlbPckUlin = A3829AlbPckUlin ;
                     n3829AlbPckUlin = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "ALBPCKLIN_" + sGXsfl_80_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbPckLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound507 != 0 )
               {
                  if ( nRcdDeleted_507 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyDM507( ) ;
                     loadDM507( ) ;
                     beforeValidateDM507( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsDM507( ) ;
                        O3829AlbPckUlin = A3829AlbPckUlin ;
                        n3829AlbPckUlin = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_507 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateDM507( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableDM507( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsDM507( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O3829AlbPckUlin = A3829AlbPckUlin ;
                           n3829AlbPckUlin = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_507 == 0 )
                  {
                     GXCCtl = "ALBPCKLIN_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbPckLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_507_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_507, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPckLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3621AlbPckLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPckCaj_Internalname, GXutil.rtrim( A3622AlbPckCaj)) ;
         httpContext.changePostValue( edtAlbPckKn_Internalname, GXutil.ltrim( localUtil.ntoc( A3623AlbPckKn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPckKb_Internalname, GXutil.ltrim( localUtil.ntoc( A3624AlbPckKb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPckTar_Internalname, GXutil.ltrim( localUtil.ntoc( A3625AlbPckTar, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPckUni_Internalname, GXutil.ltrim( localUtil.ntoc( A3626AlbPckUni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPckCal_Internalname, GXutil.rtrim( A7393AlbPckCal)) ;
         httpContext.changePostValue( "ZT_"+"Z3621AlbPckLin_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z3621AlbPckLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3625AlbPckTar_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z3625AlbPckTar, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3623AlbPckKn_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z3623AlbPckKn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3622AlbPckCaj_"+sGXsfl_80_idx, GXutil.rtrim( Z3622AlbPckCaj)) ;
         httpContext.changePostValue( "ZT_"+"Z3624AlbPckKb_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z3624AlbPckKb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3626AlbPckUni_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z3626AlbPckUni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7393AlbPckCal_"+sGXsfl_80_idx, GXutil.rtrim( Z7393AlbPckCal)) ;
         httpContext.changePostValue( "nRcdDeleted_507_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_507, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_507_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_507, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_507_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_507, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_507 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_507_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_507_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKLIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKCAJ_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckCaj_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKKN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckKn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKKB_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckKb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKTAR_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckTar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKUNI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKCAL_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckCal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O3829AlbPckUlin = s3829AlbPckUlin ;
      n3829AlbPckUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionDM0( )
   {
   }

   public void e11DM2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV18LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      talbpck_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18LitFe", AV18LitFe);
      GXt_char1 = AV16Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      talbpck_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit0", AV16Lit0);
      GXt_char1 = AV22Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1017_", ""), (byte)(99), GXv_char2) ;
      talbpck_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit3", AV22Lit3);
      GXt_char1 = AV23Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1120_", ""), (byte)(99), GXv_char2) ;
      talbpck_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit4", AV23Lit4);
      AV24Lit5 = httpContext.getMessage( "Materia Packing", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit5", AV24Lit5);
      AV27Lit6 = httpContext.getMessage( "Mezcla / Color", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Lit6", AV27Lit6);
      AV19Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Station", AV19Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV20EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char2, GXv_char3, GXv_char4) ;
      talbpck_impl.this.A396EmprCod = GXv_char2[0] ;
      talbpck_impl.this.AV20EmprNom = GXv_char3[0] ;
      talbpck_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprNom", AV20EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      AV25FlagHss = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25FlagHss", GXutil.str( AV25FlagHss, 1, 0));
      GXv_int5[0] = AV25FlagHss ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HSS", ""), GXv_int5) ;
      talbpck_impl.this.AV25FlagHss = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25FlagHss", GXutil.str( AV25FlagHss, 1, 0));
      AV26SumCaj = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26SumCaj", GXutil.str( AV26SumCaj, 1, 0));
      GXv_int5[0] = AV26SumCaj ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SUMCAJ", ""), GXv_int5) ;
      talbpck_impl.this.AV26SumCaj = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26SumCaj", GXutil.str( AV26SumCaj, 1, 0));
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('Flaghss',23) ]
         Target    : [ t('Lit5',23),t('Visible',3) ]
         ForType   : 29
         Type      : []
      */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('Flaghss',23) ]
         Target    : [ t('Lit6',23),t('Visible',3) ]
         ForType   : 29
         Type      : []
      */
      edtBarFasExtD_Visible = AV25FlagHss ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasExtD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasExtD_Visible), 5, 0), true);
      edtAlbEncCli_Visible = AV25FlagHss ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEncCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEncCli_Visible), 5, 0), true);
   }

   public void zmDM195( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2399BarFasExtD = T00DM5_A2399BarFasExtD[0] ;
            Z4815AlbEncCli = T00DM5_A4815AlbEncCli[0] ;
            Z3829AlbPckUlin = T00DM5_A3829AlbPckUlin[0] ;
         }
         else
         {
            Z2399BarFasExtD = A2399BarFasExtD ;
            Z4815AlbEncCli = A4815AlbEncCli ;
            Z3829AlbPckUlin = A3829AlbPckUlin ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z2399BarFasExtD = A2399BarFasExtD ;
         Z4815AlbEncCli = A4815AlbEncCli ;
         Z3829AlbPckUlin = A3829AlbPckUlin ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z30AlbProCod = A30AlbProCod ;
         Z407EmprNom = A407EmprNom ;
         Z1652BarSerDsc = A1652BarSerDsc ;
         Z1499BarNMez = A1499BarNMez ;
         Z135BarColNom = A135BarColNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtAlbPckUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckUlin_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtAlbPckUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckUlin_Enabled), 5, 0), true);
      /* Using cursor T00DM6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00DM6_A407EmprNom[0] ;
      n407EmprNom = T00DM6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T00DM8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(6);
      /* Using cursor T00DM7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A1652BarSerDsc = T00DM7_A1652BarSerDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
      A1499BarNMez = T00DM7_A1499BarNMez[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1499BarNMez", A1499BarNMez);
      A135BarColNom = T00DM7_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      pr_default.close(5);
      edtBarFasExtD_Visible = AV25FlagHss ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasExtD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasExtD_Visible), 5, 0), true);
      edtAlbEncCli_Visible = AV25FlagHss ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEncCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEncCli_Visible), 5, 0), true);
      if ( AV26SumCaj == 1 )
      {
         edtAlbPckCaj_Inputmask = "999999999999" ;
      }
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

   public void loadDM195( )
   {
      /* Using cursor T00DM9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound195 = (short)(1) ;
         A2399BarFasExtD = T00DM9_A2399BarFasExtD[0] ;
         n2399BarFasExtD = T00DM9_n2399BarFasExtD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2399BarFasExtD", A2399BarFasExtD);
         A4815AlbEncCli = T00DM9_A4815AlbEncCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4815AlbEncCli", A4815AlbEncCli);
         A3829AlbPckUlin = T00DM9_A3829AlbPckUlin[0] ;
         n3829AlbPckUlin = T00DM9_n3829AlbPckUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
         A1652BarSerDsc = T00DM9_A1652BarSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
         A1499BarNMez = T00DM9_A1499BarNMez[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1499BarNMez", A1499BarNMez);
         A135BarColNom = T00DM9_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A407EmprNom = T00DM9_A407EmprNom[0] ;
         n407EmprNom = T00DM9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zmDM195( -13) ;
      }
      pr_default.close(7);
      onLoadActionsDM195( ) ;
   }

   public void onLoadActionsDM195( )
   {
      if ( (GXutil.strcmp("", A2399BarFasExtD)==0) )
      {
         A2399BarFasExtD = A1652BarSerDsc ;
         n2399BarFasExtD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2399BarFasExtD", A2399BarFasExtD);
      }
      if ( ! (GXutil.strcmp("", A1499BarNMez)==0) && (GXutil.strcmp("", A4815AlbEncCli)==0) )
      {
         A4815AlbEncCli = A1499BarNMez ;
         httpContext.ajax_rsp_assign_attri("", false, "A4815AlbEncCli", A4815AlbEncCli);
      }
      else
      {
         if ( ! (GXutil.strcmp("", A135BarColNom)==0) && (GXutil.strcmp("", A4815AlbEncCli)==0) )
         {
            A4815AlbEncCli = A135BarColNom ;
            httpContext.ajax_rsp_assign_attri("", false, "A4815AlbEncCli", A4815AlbEncCli);
         }
      }
   }

   public void checkExtendedTableDM195( )
   {
      nIsDirty_195 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", A2399BarFasExtD)==0) )
      {
         nIsDirty_195 = (short)(1) ;
         A2399BarFasExtD = A1652BarSerDsc ;
         n2399BarFasExtD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2399BarFasExtD", A2399BarFasExtD);
      }
      if ( ! (GXutil.strcmp("", A1499BarNMez)==0) && (GXutil.strcmp("", A4815AlbEncCli)==0) )
      {
         nIsDirty_195 = (short)(1) ;
         A4815AlbEncCli = A1499BarNMez ;
         httpContext.ajax_rsp_assign_attri("", false, "A4815AlbEncCli", A4815AlbEncCli);
      }
      else
      {
         if ( ! (GXutil.strcmp("", A135BarColNom)==0) && (GXutil.strcmp("", A4815AlbEncCli)==0) )
         {
            nIsDirty_195 = (short)(1) ;
            A4815AlbEncCli = A135BarColNom ;
            httpContext.ajax_rsp_assign_attri("", false, "A4815AlbEncCli", A4815AlbEncCli);
         }
      }
   }

   public void closeExtendedTableCursorsDM195( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyDM195( )
   {
      /* Using cursor T00DM10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound195 = (short)(1) ;
      }
      else
      {
         RcdFound195 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00DM5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T00DM5_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00DM5_A129BarCod[0] == A129BarCod ) && ( T00DM5_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00DM5_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00DM5_A30AlbProCod[0] == A30AlbProCod ) )
      {
         zmDM195( 13) ;
         RcdFound195 = (short)(1) ;
         A2399BarFasExtD = T00DM5_A2399BarFasExtD[0] ;
         n2399BarFasExtD = T00DM5_n2399BarFasExtD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2399BarFasExtD", A2399BarFasExtD);
         A4815AlbEncCli = T00DM5_A4815AlbEncCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4815AlbEncCli", A4815AlbEncCli);
         A3829AlbPckUlin = T00DM5_A3829AlbPckUlin[0] ;
         n3829AlbPckUlin = T00DM5_n3829AlbPckUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
         O3829AlbPckUlin = A3829AlbPckUlin ;
         n3829AlbPckUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode195 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadDM195( ) ;
         if ( AnyError == 1 )
         {
            RcdFound195 = (short)(0) ;
            initializeNonKeyDM195( ) ;
         }
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound195 = (short)(0) ;
         initializeNonKeyDM195( ) ;
         sMode195 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyDM195( ) ;
      if ( RcdFound195 == 0 )
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
      RcdFound195 = (short)(0) ;
      /* Using cursor T00DM11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T00DM11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00DM11_A30AlbProCod[0] == A30AlbProCod ) && ( T00DM11_A129BarCod[0] == A129BarCod ) && ( T00DM11_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00DM11_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T00DM11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00DM11_A30AlbProCod[0] == A30AlbProCod ) && ( T00DM11_A129BarCod[0] == A129BarCod ) && ( T00DM11_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00DM11_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound195 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound195 = (short)(0) ;
      /* Using cursor T00DM12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T00DM12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00DM12_A30AlbProCod[0] == A30AlbProCod ) && ( T00DM12_A129BarCod[0] == A129BarCod ) && ( T00DM12_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00DM12_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T00DM12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00DM12_A30AlbProCod[0] == A30AlbProCod ) && ( T00DM12_A129BarCod[0] == A129BarCod ) && ( T00DM12_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00DM12_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound195 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyDM195( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A3829AlbPckUlin = O3829AlbPckUlin ;
         n3829AlbPckUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
         GX_FocusControl = edtBarFasExtD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertDM195( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound195 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A3829AlbPckUlin = O3829AlbPckUlin ;
               n3829AlbPckUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBarFasExtD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A3829AlbPckUlin = O3829AlbPckUlin ;
               n3829AlbPckUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
               updateDM195( ) ;
               GX_FocusControl = edtBarFasExtD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A3829AlbPckUlin = O3829AlbPckUlin ;
               n3829AlbPckUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
               GX_FocusControl = edtBarFasExtD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertDM195( ) ;
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
                  A3829AlbPckUlin = O3829AlbPckUlin ;
                  n3829AlbPckUlin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
                  GX_FocusControl = edtBarFasExtD_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertDM195( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A3829AlbPckUlin = O3829AlbPckUlin ;
         n3829AlbPckUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBarFasExtD_Internalname ;
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
      getKeyDM195( ) ;
      if ( RcdFound195 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "talbpck");
      GX_FocusControl = edtBarFasExtD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_DM0( ) ;
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
      if ( RcdFound195 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtBarFasExtD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartDM195( ) ;
      if ( RcdFound195 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarFasExtD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndDM195( ) ;
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
      if ( RcdFound195 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarFasExtD_Internalname ;
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
      if ( RcdFound195 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarFasExtD_Internalname ;
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
      scanStartDM195( ) ;
      if ( RcdFound195 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound195 != 0 )
         {
            scanNextDM195( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarFasExtD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndDM195( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyDM195( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00DM4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z2399BarFasExtD, T00DM4_A2399BarFasExtD[0]) != 0 ) || ( GXutil.strcmp(Z4815AlbEncCli, T00DM4_A4815AlbEncCli[0]) != 0 ) || ( Z3829AlbPckUlin != T00DM4_A3829AlbPckUlin[0] ) )
         {
            if ( GXutil.strcmp(Z2399BarFasExtD, T00DM4_A2399BarFasExtD[0]) != 0 )
            {
               GXutil.writeLogln("talbpck:[seudo value changed for attri]"+"BarFasExtD");
               GXutil.writeLogRaw("Old: ",Z2399BarFasExtD);
               GXutil.writeLogRaw("Current: ",T00DM4_A2399BarFasExtD[0]);
            }
            if ( GXutil.strcmp(Z4815AlbEncCli, T00DM4_A4815AlbEncCli[0]) != 0 )
            {
               GXutil.writeLogln("talbpck:[seudo value changed for attri]"+"AlbEncCli");
               GXutil.writeLogRaw("Old: ",Z4815AlbEncCli);
               GXutil.writeLogRaw("Current: ",T00DM4_A4815AlbEncCli[0]);
            }
            if ( Z3829AlbPckUlin != T00DM4_A3829AlbPckUlin[0] )
            {
               GXutil.writeLogln("talbpck:[seudo value changed for attri]"+"AlbPckUlin");
               GXutil.writeLogRaw("Old: ",Z3829AlbPckUlin);
               GXutil.writeLogRaw("Current: ",T00DM4_A3829AlbPckUlin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBBAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertDM195( )
   {
      beforeValidateDM195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableDM195( ) ;
      }
      if ( AnyError == 0 )
      {
         zmDM195( 0) ;
         checkOptimisticConcurrencyDM195( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmDM195( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertDM195( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00DM13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n2399BarFasExtD), A2399BarFasExtD, A4815AlbEncCli, Boolean.valueOf(n3829AlbPckUlin), Short.valueOf(A3829AlbPckUlin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
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
                        processLevelDM195( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionDM0( ) ;
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
            loadDM195( ) ;
         }
         endLevelDM195( ) ;
      }
      closeExtendedTableCursorsDM195( ) ;
   }

   public void updateDM195( )
   {
      beforeValidateDM195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableDM195( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyDM195( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmDM195( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateDM195( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00DM14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n2399BarFasExtD), A2399BarFasExtD, A4815AlbEncCli, Boolean.valueOf(n3829AlbPckUlin), Short.valueOf(A3829AlbPckUlin), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateDM195( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelDM195( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionDM0( ) ;
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
         endLevelDM195( ) ;
      }
      closeExtendedTableCursorsDM195( ) ;
   }

   public void deferredUpdateDM195( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateDM195( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyDM195( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsDM195( ) ;
         afterConfirmDM195( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteDM195( ) ;
            if ( AnyError == 0 )
            {
               A3829AlbPckUlin = O3829AlbPckUlin ;
               n3829AlbPckUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
               scanStartDM507( ) ;
               while ( RcdFound507 != 0 )
               {
                  getByPrimaryKeyDM507( ) ;
                  deleteDM507( ) ;
                  scanNextDM507( ) ;
                  O3829AlbPckUlin = A3829AlbPckUlin ;
                  n3829AlbPckUlin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
               }
               scanEndDM507( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00DM15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound195 == 0 )
                        {
                           initAllDM195( ) ;
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
                        resetCaptionDM0( ) ;
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
      sMode195 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelDM195( ) ;
      Gx_mode = sMode195 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsDM195( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00DM16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "METCAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T00DM17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EDIETI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T00DM18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREPg", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T00DM19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T00DM20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBEST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T00DM21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALBTRA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T00DM22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T00DM23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T00DM24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T00DM25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
      }
   }

   public void processNestedLevelDM507( )
   {
      s3829AlbPckUlin = O3829AlbPckUlin ;
      n3829AlbPckUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRowDM507( ) ;
         if ( ( nRcdExists_507 != 0 ) || ( nIsMod_507 != 0 ) )
         {
            standaloneNotModalDM507( ) ;
            getKeyDM507( ) ;
            if ( ( nRcdExists_507 == 0 ) && ( nRcdDeleted_507 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertDM507( ) ;
            }
            else
            {
               if ( RcdFound507 != 0 )
               {
                  if ( ( nRcdDeleted_507 != 0 ) && ( nRcdExists_507 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteDM507( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_507 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateDM507( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_507 == 0 )
                  {
                     GXCCtl = "ALBPCKLIN_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbPckLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O3829AlbPckUlin = A3829AlbPckUlin ;
            n3829AlbPckUlin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_507_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_507, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPckLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3621AlbPckLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPckCaj_Internalname, GXutil.rtrim( A3622AlbPckCaj)) ;
         httpContext.changePostValue( edtAlbPckKn_Internalname, GXutil.ltrim( localUtil.ntoc( A3623AlbPckKn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPckKb_Internalname, GXutil.ltrim( localUtil.ntoc( A3624AlbPckKb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPckTar_Internalname, GXutil.ltrim( localUtil.ntoc( A3625AlbPckTar, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPckUni_Internalname, GXutil.ltrim( localUtil.ntoc( A3626AlbPckUni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPckCal_Internalname, GXutil.rtrim( A7393AlbPckCal)) ;
         httpContext.changePostValue( "ZT_"+"Z3621AlbPckLin_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z3621AlbPckLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3625AlbPckTar_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z3625AlbPckTar, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3623AlbPckKn_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z3623AlbPckKn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3622AlbPckCaj_"+sGXsfl_80_idx, GXutil.rtrim( Z3622AlbPckCaj)) ;
         httpContext.changePostValue( "ZT_"+"Z3624AlbPckKb_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z3624AlbPckKb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3626AlbPckUni_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z3626AlbPckUni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7393AlbPckCal_"+sGXsfl_80_idx, GXutil.rtrim( Z7393AlbPckCal)) ;
         httpContext.changePostValue( "nRcdDeleted_507_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_507, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_507_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_507, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_507_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_507, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_507 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_507_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_507_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKLIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKCAJ_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckCaj_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKKN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckKn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKKB_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckKb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKTAR_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckTar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKUNI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKCAL_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckCal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllDM507( ) ;
      if ( AnyError != 0 )
      {
         O3829AlbPckUlin = s3829AlbPckUlin ;
         n3829AlbPckUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
      }
      nRcdExists_507 = (short)(0) ;
      nIsMod_507 = (short)(0) ;
      nRcdDeleted_507 = (short)(0) ;
   }

   public void processLevelDM195( )
   {
      /* Save parent mode. */
      sMode195 = Gx_mode ;
      processNestedLevelDM507( ) ;
      if ( AnyError != 0 )
      {
         O3829AlbPckUlin = s3829AlbPckUlin ;
         n3829AlbPckUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode195 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T00DM26 */
      pr_default.execute(24, new Object[] {Boolean.valueOf(n3829AlbPckUlin), Short.valueOf(A3829AlbPckUlin), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
   }

   public void endLevelDM195( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeCompleteDM195( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "talbpck");
         if ( AnyError == 0 )
         {
            confirmValuesDM0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "talbpck");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartDM195( )
   {
      /* Scan By routine */
      /* Using cursor T00DM27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound195 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound195 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextDM195( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound195 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound195 = (short)(1) ;
      }
   }

   public void scanEndDM195( )
   {
      pr_default.close(25);
   }

   public void afterConfirmDM195( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertDM195( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateDM195( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteDM195( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteDM195( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateDM195( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesDM195( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtAlbPckUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckUlin_Enabled), 5, 0), true);
      edtBarFasExtD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasExtD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasExtD_Enabled), 5, 0), true);
      edtAlbEncCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEncCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEncCli_Enabled), 5, 0), true);
      edtBarSerDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Enabled), 5, 0), true);
      edtBarNMez_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNMez_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNMez_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zmDM507( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3625AlbPckTar = T00DM3_A3625AlbPckTar[0] ;
            Z3623AlbPckKn = T00DM3_A3623AlbPckKn[0] ;
            Z3622AlbPckCaj = T00DM3_A3622AlbPckCaj[0] ;
            Z3624AlbPckKb = T00DM3_A3624AlbPckKb[0] ;
            Z3626AlbPckUni = T00DM3_A3626AlbPckUni[0] ;
            Z7393AlbPckCal = T00DM3_A7393AlbPckCal[0] ;
         }
         else
         {
            Z3625AlbPckTar = A3625AlbPckTar ;
            Z3623AlbPckKn = A3623AlbPckKn ;
            Z3622AlbPckCaj = A3622AlbPckCaj ;
            Z3624AlbPckKb = A3624AlbPckKb ;
            Z3626AlbPckUni = A3626AlbPckUni ;
            Z7393AlbPckCal = A7393AlbPckCal ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z3621AlbPckLin = A3621AlbPckLin ;
         Z3625AlbPckTar = A3625AlbPckTar ;
         Z3623AlbPckKn = A3623AlbPckKn ;
         Z3622AlbPckCaj = A3622AlbPckCaj ;
         Z3624AlbPckKb = A3624AlbPckKb ;
         Z3626AlbPckUni = A3626AlbPckUni ;
         Z7393AlbPckCal = A7393AlbPckCal ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
      }
   }

   public void standaloneNotModalDM507( )
   {
      edtAlbPckUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckUlin_Enabled), 5, 0), true);
      edtAlbPckUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckUlin_Enabled), 5, 0), true);
   }

   public void standaloneModalDM507( )
   {
      if ( isIns( )  )
      {
         A3829AlbPckUlin = (short)(O3829AlbPckUlin+1) ;
         n3829AlbPckUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A3621AlbPckLin = A3829AlbPckUlin ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbPckLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbPckLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckLin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
      else
      {
         edtAlbPckLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbPckLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckLin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
   }

   public void loadDM507( )
   {
      /* Using cursor T00DM28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A3621AlbPckLin)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound507 = (short)(1) ;
         A3625AlbPckTar = T00DM28_A3625AlbPckTar[0] ;
         n3625AlbPckTar = T00DM28_n3625AlbPckTar[0] ;
         A3623AlbPckKn = T00DM28_A3623AlbPckKn[0] ;
         n3623AlbPckKn = T00DM28_n3623AlbPckKn[0] ;
         A3622AlbPckCaj = T00DM28_A3622AlbPckCaj[0] ;
         n3622AlbPckCaj = T00DM28_n3622AlbPckCaj[0] ;
         A3624AlbPckKb = T00DM28_A3624AlbPckKb[0] ;
         n3624AlbPckKb = T00DM28_n3624AlbPckKb[0] ;
         A3626AlbPckUni = T00DM28_A3626AlbPckUni[0] ;
         n3626AlbPckUni = T00DM28_n3626AlbPckUni[0] ;
         A7393AlbPckCal = T00DM28_A7393AlbPckCal[0] ;
         n7393AlbPckCal = T00DM28_n7393AlbPckCal[0] ;
         zmDM507( -17) ;
      }
      pr_default.close(26);
      onLoadActionsDM507( ) ;
   }

   public void onLoadActionsDM507( )
   {
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A3625AlbPckTar)==0) && isIns( )  && ( AV25FlagHss == 1 ) )
      {
         A3625AlbPckTar = E3625AlbPckTar ;
         n3625AlbPckTar = false ;
      }
      A3623AlbPckKn = A3624AlbPckKb.subtract(A3625AlbPckTar) ;
      n3623AlbPckKn = false ;
   }

   public void checkExtendedTableDM507( )
   {
      nIsDirty_507 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalDM507( ) ;
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A3625AlbPckTar)==0) && isIns( )  && ( AV25FlagHss == 1 ) )
      {
         nIsDirty_507 = (short)(1) ;
         A3625AlbPckTar = E3625AlbPckTar ;
         n3625AlbPckTar = false ;
      }
      if ( true /* Level */ && true /* After */ && (GXutil.strcmp("", A3622AlbPckCaj)==0) && ( AV26SumCaj == 1 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A30AlbProCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_char2[0] = A3622AlbPckCaj ;
         new app.pultpck(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int7, GXv_int5, GXv_char3, GXv_char2) ;
         talbpck_impl.this.A396EmprCod = GXv_char4[0] ;
         talbpck_impl.this.A30AlbProCod = GXv_int6[0] ;
         talbpck_impl.this.A129BarCod = GXv_int7[0] ;
         talbpck_impl.this.A132BarCodReo = GXv_int5[0] ;
         talbpck_impl.this.A130BarCodPar = GXv_char3[0] ;
         talbpck_impl.this.A3622AlbPckCaj = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      nIsDirty_507 = (short)(1) ;
      A3623AlbPckKn = A3624AlbPckKb.subtract(A3625AlbPckTar) ;
      n3623AlbPckKn = false ;
   }

   public void closeExtendedTableCursorsDM507( )
   {
   }

   public void enableDisableDM507( )
   {
   }

   public void getKeyDM507( )
   {
      /* Using cursor T00DM29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A3621AlbPckLin)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound507 = (short)(1) ;
      }
      else
      {
         RcdFound507 = (short)(0) ;
      }
      pr_default.close(27);
   }

   public void getByPrimaryKeyDM507( )
   {
      /* Using cursor T00DM3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A3621AlbPckLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T00DM3_A30AlbProCod[0] == A30AlbProCod ) && ( GXutil.strcmp(T00DM3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00DM3_A129BarCod[0] == A129BarCod ) && ( T00DM3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00DM3_A130BarCodPar[0], A130BarCodPar) == 0 ) )
      {
         zmDM507( 17) ;
         RcdFound507 = (short)(1) ;
         initializeNonKeyDM507( ) ;
         A3621AlbPckLin = T00DM3_A3621AlbPckLin[0] ;
         A3625AlbPckTar = T00DM3_A3625AlbPckTar[0] ;
         n3625AlbPckTar = T00DM3_n3625AlbPckTar[0] ;
         A3623AlbPckKn = T00DM3_A3623AlbPckKn[0] ;
         n3623AlbPckKn = T00DM3_n3623AlbPckKn[0] ;
         A3622AlbPckCaj = T00DM3_A3622AlbPckCaj[0] ;
         n3622AlbPckCaj = T00DM3_n3622AlbPckCaj[0] ;
         A3624AlbPckKb = T00DM3_A3624AlbPckKb[0] ;
         n3624AlbPckKb = T00DM3_n3624AlbPckKb[0] ;
         A3626AlbPckUni = T00DM3_A3626AlbPckUni[0] ;
         n3626AlbPckUni = T00DM3_n3626AlbPckUni[0] ;
         A7393AlbPckCal = T00DM3_A7393AlbPckCal[0] ;
         n7393AlbPckCal = T00DM3_n7393AlbPckCal[0] ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z3621AlbPckLin = A3621AlbPckLin ;
         sMode507 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalDM507( ) ;
         loadDM507( ) ;
         Gx_mode = sMode507 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound507 = (short)(0) ;
         initializeNonKeyDM507( ) ;
         sMode507 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalDM507( ) ;
         Gx_mode = sMode507 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesDM507( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyDM507( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00DM2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A3621AlbPckLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBPCK"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z3625AlbPckTar, T00DM2_A3625AlbPckTar[0]) != 0 ) || ( DecimalUtil.compareTo(Z3623AlbPckKn, T00DM2_A3623AlbPckKn[0]) != 0 ) || ( GXutil.strcmp(Z3622AlbPckCaj, T00DM2_A3622AlbPckCaj[0]) != 0 ) || ( DecimalUtil.compareTo(Z3624AlbPckKb, T00DM2_A3624AlbPckKb[0]) != 0 ) || ( Z3626AlbPckUni != T00DM2_A3626AlbPckUni[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7393AlbPckCal, T00DM2_A7393AlbPckCal[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z3625AlbPckTar, T00DM2_A3625AlbPckTar[0]) != 0 )
            {
               GXutil.writeLogln("talbpck:[seudo value changed for attri]"+"AlbPckTar");
               GXutil.writeLogRaw("Old: ",Z3625AlbPckTar);
               GXutil.writeLogRaw("Current: ",T00DM2_A3625AlbPckTar[0]);
            }
            if ( DecimalUtil.compareTo(Z3623AlbPckKn, T00DM2_A3623AlbPckKn[0]) != 0 )
            {
               GXutil.writeLogln("talbpck:[seudo value changed for attri]"+"AlbPckKn");
               GXutil.writeLogRaw("Old: ",Z3623AlbPckKn);
               GXutil.writeLogRaw("Current: ",T00DM2_A3623AlbPckKn[0]);
            }
            if ( GXutil.strcmp(Z3622AlbPckCaj, T00DM2_A3622AlbPckCaj[0]) != 0 )
            {
               GXutil.writeLogln("talbpck:[seudo value changed for attri]"+"AlbPckCaj");
               GXutil.writeLogRaw("Old: ",Z3622AlbPckCaj);
               GXutil.writeLogRaw("Current: ",T00DM2_A3622AlbPckCaj[0]);
            }
            if ( DecimalUtil.compareTo(Z3624AlbPckKb, T00DM2_A3624AlbPckKb[0]) != 0 )
            {
               GXutil.writeLogln("talbpck:[seudo value changed for attri]"+"AlbPckKb");
               GXutil.writeLogRaw("Old: ",Z3624AlbPckKb);
               GXutil.writeLogRaw("Current: ",T00DM2_A3624AlbPckKb[0]);
            }
            if ( Z3626AlbPckUni != T00DM2_A3626AlbPckUni[0] )
            {
               GXutil.writeLogln("talbpck:[seudo value changed for attri]"+"AlbPckUni");
               GXutil.writeLogRaw("Old: ",Z3626AlbPckUni);
               GXutil.writeLogRaw("Current: ",T00DM2_A3626AlbPckUni[0]);
            }
            if ( GXutil.strcmp(Z7393AlbPckCal, T00DM2_A7393AlbPckCal[0]) != 0 )
            {
               GXutil.writeLogln("talbpck:[seudo value changed for attri]"+"AlbPckCal");
               GXutil.writeLogRaw("Old: ",Z7393AlbPckCal);
               GXutil.writeLogRaw("Current: ",T00DM2_A7393AlbPckCal[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBPCK"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertDM507( )
   {
      beforeValidateDM507( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableDM507( ) ;
      }
      if ( AnyError == 0 )
      {
         zmDM507( 0) ;
         checkOptimisticConcurrencyDM507( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmDM507( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertDM507( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00DM30 */
                  pr_default.execute(28, new Object[] {Long.valueOf(A30AlbProCod), Short.valueOf(A3621AlbPckLin), Boolean.valueOf(n3625AlbPckTar), A3625AlbPckTar, Boolean.valueOf(n3623AlbPckKn), A3623AlbPckKn, Boolean.valueOf(n3622AlbPckCaj), A3622AlbPckCaj, Boolean.valueOf(n3624AlbPckKb), A3624AlbPckKb, Boolean.valueOf(n3626AlbPckUni), Short.valueOf(A3626AlbPckUni), Boolean.valueOf(n7393AlbPckCal), A7393AlbPckCal, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBPCK");
                  if ( (pr_default.getStatus(28) == 1) )
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
                        E3625AlbPckTar = A3625AlbPckTar ;
                        n3625AlbPckTar = false ;
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
            loadDM507( ) ;
         }
         endLevelDM507( ) ;
      }
      closeExtendedTableCursorsDM507( ) ;
   }

   public void updateDM507( )
   {
      beforeValidateDM507( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableDM507( ) ;
      }
      if ( ( nIsMod_507 != 0 ) || ( nIsDirty_507 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyDM507( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmDM507( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateDM507( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00DM31 */
                     pr_default.execute(29, new Object[] {Boolean.valueOf(n3625AlbPckTar), A3625AlbPckTar, Boolean.valueOf(n3623AlbPckKn), A3623AlbPckKn, Boolean.valueOf(n3622AlbPckCaj), A3622AlbPckCaj, Boolean.valueOf(n3624AlbPckKb), A3624AlbPckKb, Boolean.valueOf(n3626AlbPckUni), Short.valueOf(A3626AlbPckUni), Boolean.valueOf(n7393AlbPckCal), A7393AlbPckCal, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A3621AlbPckLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBPCK");
                     if ( (pr_default.getStatus(29) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBPCK"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateDM507( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyDM507( ) ;
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
            endLevelDM507( ) ;
         }
      }
      closeExtendedTableCursorsDM507( ) ;
   }

   public void deferredUpdateDM507( )
   {
   }

   public void deleteDM507( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateDM507( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyDM507( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsDM507( ) ;
         afterConfirmDM507( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteDM507( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00DM32 */
               pr_default.execute(30, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A3621AlbPckLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBPCK");
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
      sMode507 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelDM507( ) ;
      Gx_mode = sMode507 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsDM507( )
   {
      standaloneModalDM507( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelDM507( )
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

   public void scanStartDM507( )
   {
      /* Scan By routine */
      /* Using cursor T00DM33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound507 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound507 = (short)(1) ;
         A3621AlbPckLin = T00DM33_A3621AlbPckLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextDM507( )
   {
      /* Scan next routine */
      pr_default.readNext(31);
      RcdFound507 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound507 = (short)(1) ;
         A3621AlbPckLin = T00DM33_A3621AlbPckLin[0] ;
      }
   }

   public void scanEndDM507( )
   {
      pr_default.close(31);
   }

   public void afterConfirmDM507( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertDM507( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateDM507( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteDM507( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteDM507( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateDM507( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesDM507( )
   {
      edtAlbPckLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckLin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtAlbPckCaj_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckCaj_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckCaj_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtAlbPckKn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckKn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckKn_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtAlbPckKb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckKb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckKb_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtAlbPckTar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckTar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckTar_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtAlbPckUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckUni_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtAlbPckCal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckCal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckCal_Enabled), 5, 0), !bGXsfl_80_Refreshing);
   }

   public void send_integrity_lvl_hashesDM507( )
   {
   }

   public void send_integrity_lvl_hashesDM195( )
   {
   }

   public void subsflControlProps_80507( )
   {
      edtavnRcdDeleted_507_Internalname = "vNRCDDELETED_507_"+sGXsfl_80_idx ;
      edtAlbPckLin_Internalname = "ALBPCKLIN_"+sGXsfl_80_idx ;
      edtAlbPckCaj_Internalname = "ALBPCKCAJ_"+sGXsfl_80_idx ;
      edtAlbPckKn_Internalname = "ALBPCKKN_"+sGXsfl_80_idx ;
      edtAlbPckKb_Internalname = "ALBPCKKB_"+sGXsfl_80_idx ;
      edtAlbPckTar_Internalname = "ALBPCKTAR_"+sGXsfl_80_idx ;
      edtAlbPckUni_Internalname = "ALBPCKUNI_"+sGXsfl_80_idx ;
      edtAlbPckCal_Internalname = "ALBPCKCAL_"+sGXsfl_80_idx ;
   }

   public void subsflControlProps_fel_80507( )
   {
      edtavnRcdDeleted_507_Internalname = "vNRCDDELETED_507_"+sGXsfl_80_fel_idx ;
      edtAlbPckLin_Internalname = "ALBPCKLIN_"+sGXsfl_80_fel_idx ;
      edtAlbPckCaj_Internalname = "ALBPCKCAJ_"+sGXsfl_80_fel_idx ;
      edtAlbPckKn_Internalname = "ALBPCKKN_"+sGXsfl_80_fel_idx ;
      edtAlbPckKb_Internalname = "ALBPCKKB_"+sGXsfl_80_fel_idx ;
      edtAlbPckTar_Internalname = "ALBPCKTAR_"+sGXsfl_80_fel_idx ;
      edtAlbPckUni_Internalname = "ALBPCKUNI_"+sGXsfl_80_fel_idx ;
      edtAlbPckCal_Internalname = "ALBPCKCAL_"+sGXsfl_80_fel_idx ;
   }

   public void addRowDM507( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_80507( ) ;
      sendRowDM507( ) ;
   }

   public void sendRowDM507( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_507_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_507_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_507, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_507_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_507), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_507), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_507_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_507_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_507_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPckLin_Internalname,GXutil.ltrim( localUtil.ntoc( A3621AlbPckLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3621AlbPckLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPckLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPckLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_507_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPckCaj_Internalname,GXutil.rtrim( A3622AlbPckCaj),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPckCaj_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPckCaj_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_507_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPckKn_Internalname,GXutil.ltrim( localUtil.ntoc( A3623AlbPckKn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbPckKn_Enabled!=0) ? localUtil.format( A3623AlbPckKn, "ZZZZZ9.99") : localUtil.format( A3623AlbPckKn, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,84);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPckKn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPckKn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_507_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPckKb_Internalname,GXutil.ltrim( localUtil.ntoc( A3624AlbPckKb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbPckKb_Enabled!=0) ? localUtil.format( A3624AlbPckKb, "ZZZZZ9.99") : localUtil.format( A3624AlbPckKb, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPckKb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPckKb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_507_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPckTar_Internalname,GXutil.ltrim( localUtil.ntoc( A3625AlbPckTar, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbPckTar_Enabled!=0) ? localUtil.format( A3625AlbPckTar, "ZZZZZ9.99") : localUtil.format( A3625AlbPckTar, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPckTar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPckTar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_507_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPckUni_Internalname,GXutil.ltrim( localUtil.ntoc( A3626AlbPckUni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbPckUni_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3626AlbPckUni), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3626AlbPckUni), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,87);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPckUni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPckUni_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_507_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPckCal_Internalname,GXutil.rtrim( A7393AlbPckCal),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPckCal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPckCal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesDM507( ) ;
      GXCCtl = "Z3621AlbPckLin_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3621AlbPckLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3625AlbPckTar_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3625AlbPckTar, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3623AlbPckKn_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3623AlbPckKn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3622AlbPckCaj_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3622AlbPckCaj));
      GXCCtl = "Z3624AlbPckKb_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3624AlbPckKb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3626AlbPckUni_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3626AlbPckUni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7393AlbPckCal_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7393AlbPckCal));
      GXCCtl = "nRcdDeleted_507_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_507, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_507_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_507, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_507_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_507, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_507_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_507_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPCKLIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPCKCAJ_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckCaj_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPCKKN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckKn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPCKKB_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckKb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPCKTAR_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckTar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPCKUNI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPCKCAL_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckCal_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowDM507( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_80507( ) ;
      edtavnRcdDeleted_507_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_507_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPckLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKLIN_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPckCaj_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKCAJ_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPckKn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKKN_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPckKb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKKB_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPckTar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKTAR_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPckUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKUNI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPckCal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKCAL_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_507_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_507_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_507");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_507_Internalname ;
         wbErr = true ;
         nRcdDeleted_507 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_507 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_507_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPckLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPckLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ALBPCKLIN_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPckLin_Internalname ;
         wbErr = true ;
         A3621AlbPckLin = (short)(0) ;
      }
      else
      {
         A3621AlbPckLin = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbPckLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A3622AlbPckCaj = httpContext.cgiGet( edtAlbPckCaj_Internalname) ;
      n3622AlbPckCaj = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbPckKn_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbPckKn_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBPCKKN_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPckKn_Internalname ;
         wbErr = true ;
         A3623AlbPckKn = DecimalUtil.ZERO ;
         n3623AlbPckKn = false ;
      }
      else
      {
         A3623AlbPckKn = localUtil.ctond( httpContext.cgiGet( edtAlbPckKn_Internalname)) ;
         n3623AlbPckKn = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbPckKb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbPckKb_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBPCKKB_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPckKb_Internalname ;
         wbErr = true ;
         A3624AlbPckKb = DecimalUtil.ZERO ;
         n3624AlbPckKb = false ;
      }
      else
      {
         A3624AlbPckKb = localUtil.ctond( httpContext.cgiGet( edtAlbPckKb_Internalname)) ;
         n3624AlbPckKb = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbPckTar_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbPckTar_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBPCKTAR_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPckTar_Internalname ;
         wbErr = true ;
         A3625AlbPckTar = DecimalUtil.ZERO ;
         n3625AlbPckTar = false ;
      }
      else
      {
         A3625AlbPckTar = localUtil.ctond( httpContext.cgiGet( edtAlbPckTar_Internalname)) ;
         n3625AlbPckTar = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPckUni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPckUni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ALBPCKUNI_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPckUni_Internalname ;
         wbErr = true ;
         A3626AlbPckUni = (short)(0) ;
         n3626AlbPckUni = false ;
      }
      else
      {
         A3626AlbPckUni = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbPckUni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3626AlbPckUni = false ;
      }
      A7393AlbPckCal = httpContext.cgiGet( edtAlbPckCal_Internalname) ;
      n7393AlbPckCal = false ;
      GXCCtl = "Z3621AlbPckLin_" + sGXsfl_80_idx ;
      Z3621AlbPckLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3625AlbPckTar_" + sGXsfl_80_idx ;
      Z3625AlbPckTar = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3623AlbPckKn_" + sGXsfl_80_idx ;
      Z3623AlbPckKn = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3622AlbPckCaj_" + sGXsfl_80_idx ;
      Z3622AlbPckCaj = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3624AlbPckKb_" + sGXsfl_80_idx ;
      Z3624AlbPckKb = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3626AlbPckUni_" + sGXsfl_80_idx ;
      Z3626AlbPckUni = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7393AlbPckCal_" + sGXsfl_80_idx ;
      Z7393AlbPckCal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_507_" + sGXsfl_80_idx ;
      nRcdDeleted_507 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_507_" + sGXsfl_80_idx ;
      nRcdExists_507 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_507_" + sGXsfl_80_idx ;
      nIsMod_507 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAlbPckLin_Enabled = edtAlbPckLin_Enabled ;
   }

   public void confirmValuesDM0( )
   {
      nGXsfl_80_idx = 0 ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_80507( ) ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_80507( ) ;
         httpContext.changePostValue( "Z3621AlbPckLin_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z3621AlbPckLin_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3621AlbPckLin_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z3625AlbPckTar_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z3625AlbPckTar_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3625AlbPckTar_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z3623AlbPckKn_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z3623AlbPckKn_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3623AlbPckKn_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z3622AlbPckCaj_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z3622AlbPckCaj_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3622AlbPckCaj_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z3624AlbPckKb_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z3624AlbPckKb_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3624AlbPckKb_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z3626AlbPckUni_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z3626AlbPckUni_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3626AlbPckUni_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z7393AlbPckCal_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z7393AlbPckCal_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7393AlbPckCal_"+sGXsfl_80_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.talbpck", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2399BarFasExtD", GXutil.rtrim( Z2399BarFasExtD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4815AlbEncCli", GXutil.rtrim( Z4815AlbEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3829AlbPckUlin", GXutil.ltrim( localUtil.ntoc( Z3829AlbPckUlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O3829AlbPckUlin", GXutil.ltrim( localUtil.ntoc( O3829AlbPckUlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_80", GXutil.ltrim( localUtil.ntoc( nGXsfl_80_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGHSS", GXutil.ltrim( localUtil.ntoc( AV25FlagHss, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSUMCAJ", GXutil.ltrim( localUtil.ntoc( AV26SumCaj, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.talbpck", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"})  ;
   }

   public String getPgmname( )
   {
      return "TALBPCK" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PACKING LIST", "") ;
   }

   public void initializeNonKeyDM195( )
   {
      A2399BarFasExtD = "" ;
      n2399BarFasExtD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2399BarFasExtD", A2399BarFasExtD);
      A4815AlbEncCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4815AlbEncCli", A4815AlbEncCli);
      A3829AlbPckUlin = (short)(0) ;
      n3829AlbPckUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
      O3829AlbPckUlin = A3829AlbPckUlin ;
      n3829AlbPckUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
      Z2399BarFasExtD = "" ;
      Z4815AlbEncCli = "" ;
      Z3829AlbPckUlin = (short)(0) ;
   }

   public void initAllDM195( )
   {
      initializeNonKeyDM195( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyDM507( )
   {
      A3625AlbPckTar = DecimalUtil.ZERO ;
      n3625AlbPckTar = false ;
      A3623AlbPckKn = DecimalUtil.ZERO ;
      n3623AlbPckKn = false ;
      A3622AlbPckCaj = "" ;
      n3622AlbPckCaj = false ;
      A3624AlbPckKb = DecimalUtil.ZERO ;
      n3624AlbPckKb = false ;
      A3626AlbPckUni = (short)(0) ;
      n3626AlbPckUni = false ;
      A7393AlbPckCal = "" ;
      n7393AlbPckCal = false ;
      Z3625AlbPckTar = DecimalUtil.ZERO ;
      Z3623AlbPckKn = DecimalUtil.ZERO ;
      Z3622AlbPckCaj = "" ;
      Z3624AlbPckKb = DecimalUtil.ZERO ;
      Z3626AlbPckUni = (short)(0) ;
      Z7393AlbPckCal = "" ;
   }

   public void initAllDM507( )
   {
      A3621AlbPckLin = (short)(0) ;
      initializeNonKeyDM507( ) ;
   }

   public void standaloneModalInsertDM507( )
   {
      A3829AlbPckUlin = i3829AlbPckUlin ;
      n3829AlbPckUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241514494", true, true);
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
      httpContext.AddJavascriptSource("talbpck.js", "?20268241514494", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties507( )
   {
      edtAlbPckLin_Enabled = defedtAlbPckLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckLin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_507, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_507_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3621AlbPckLin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3622AlbPckCaj));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckCaj_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3623AlbPckKn, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckKn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3624AlbPckKb, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckKb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3625AlbPckTar, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckTar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3626AlbPckUni, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7393AlbPckCal));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckCal_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtAlbPckUlin_Internalname = "ALBPCKULIN" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtBarFasExtD_Internalname = "BARFASEXTD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtAlbEncCli_Internalname = "ALBENCCLI" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtBarSerDsc_Internalname = "BARSERDSC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtBarNMez_Internalname = "BARNMEZ" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtavnRcdDeleted_507_Internalname = "vNRCDDELETED_507" ;
      edtAlbPckLin_Internalname = "ALBPCKLIN" ;
      edtAlbPckCaj_Internalname = "ALBPCKCAJ" ;
      edtAlbPckKn_Internalname = "ALBPCKKN" ;
      edtAlbPckKb_Internalname = "ALBPCKKB" ;
      edtAlbPckTar_Internalname = "ALBPCKTAR" ;
      edtAlbPckUni_Internalname = "ALBPCKUNI" ;
      edtAlbPckCal_Internalname = "ALBPCKCAL" ;
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
      Form.setCaption( httpContext.getMessage( "PACKING LIST", "") );
      edtAlbPckCal_Jsonclick = "" ;
      edtAlbPckUni_Jsonclick = "" ;
      edtAlbPckTar_Jsonclick = "" ;
      edtAlbPckKb_Jsonclick = "" ;
      edtAlbPckKn_Jsonclick = "" ;
      edtAlbPckCaj_Jsonclick = "" ;
      edtAlbPckLin_Jsonclick = "" ;
      edtavnRcdDeleted_507_Jsonclick = "" ;
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
      edtAlbPckCal_Enabled = 1 ;
      edtAlbPckUni_Enabled = 1 ;
      edtAlbPckTar_Enabled = 1 ;
      edtAlbPckKb_Enabled = 1 ;
      edtAlbPckKn_Enabled = 1 ;
      edtAlbPckCaj_Enabled = 1 ;
      edtAlbPckLin_Enabled = 1 ;
      edtavnRcdDeleted_507_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Backcolor = (int)(0xFFFFFF) ;
      edtBarColNom_Enabled = 0 ;
      edtBarNMez_Jsonclick = "" ;
      edtBarNMez_Backcolor = (int)(0xFFFFFF) ;
      edtBarNMez_Enabled = 0 ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSerDsc_Backcolor = (int)(0xFFFFFF) ;
      edtBarSerDsc_Enabled = 0 ;
      edtAlbEncCli_Jsonclick = "" ;
      edtAlbEncCli_Backcolor = (int)(0xFFFFFF) ;
      edtAlbEncCli_Enabled = 1 ;
      edtAlbEncCli_Visible = 1 ;
      edtBarFasExtD_Jsonclick = "" ;
      edtBarFasExtD_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasExtD_Enabled = 1 ;
      edtBarFasExtD_Visible = 1 ;
      edtAlbPckUlin_Jsonclick = "" ;
      edtAlbPckUlin_Backcolor = (int)(0xFFFFFF) ;
      edtAlbPckUlin_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 0 ;
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Backcolor = (int)(0xFFFFFF) ;
      edtAlbProCod_Enabled = 0 ;
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

   public void xc_12_DM507( String A396EmprCod ,
                            long A30AlbProCod ,
                            int A129BarCod ,
                            byte A132BarCodReo ,
                            String A130BarCodPar ,
                            String A3622AlbPckCaj ,
                            byte AV26SumCaj )
   {
      if ( true /* Level */ && true /* After */ && (GXutil.strcmp("", A3622AlbPckCaj)==0) && ( AV26SumCaj == 1 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A30AlbProCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_char2[0] = A3622AlbPckCaj ;
         new app.pultpck(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int7, GXv_int5, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A30AlbProCod = GXv_int6[0] ;
         A129BarCod = GXv_int7[0] ;
         A132BarCodReo = GXv_int5[0] ;
         A130BarCodPar = GXv_char3[0] ;
         A3622AlbPckCaj = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3622AlbPckCaj))+"\"") ;
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
      subsflControlProps_80507( ) ;
      while ( nGXsfl_80_idx <= nRC_GXsfl_80 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalDM507( ) ;
         standaloneModalDM507( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowDM507( ) ;
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_80507( ) ;
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
      /* Using cursor T00DM34 */
      pr_default.execute(32, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00DM34_A407EmprNom[0] ;
      n407EmprNom = T00DM34_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(32);
      /* Using cursor T00DM35 */
      pr_default.execute(33, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(33) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(33);
      /* Using cursor T00DM36 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(34) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A1652BarSerDsc = T00DM36_A1652BarSerDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
      A1499BarNMez = T00DM36_A1499BarNMez[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1499BarNMez", A1499BarNMez);
      A135BarColNom = T00DM36_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      pr_default.close(34);
      GX_FocusControl = edtBarFasExtD_Internalname ;
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

   public void valid_Barcodpar( )
   {
      n3829AlbPckUlin = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrim( localUtil.ntoc( A3829AlbPckUlin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", GXutil.rtrim( A1652BarSerDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A1499BarNMez", GXutil.rtrim( A1499BarNMez));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A2399BarFasExtD", GXutil.rtrim( A2399BarFasExtD));
      httpContext.ajax_rsp_assign_attri("", false, "A4815AlbEncCli", GXutil.rtrim( A4815AlbEncCli));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3829AlbPckUlin", GXutil.ltrim( localUtil.ntoc( Z3829AlbPckUlin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1652BarSerDsc", GXutil.rtrim( Z1652BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1499BarNMez", GXutil.rtrim( Z1499BarNMez));
      app.GxWebStd.gx_hidden_field( httpContext, "Z135BarColNom", GXutil.rtrim( Z135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2399BarFasExtD", GXutil.rtrim( Z2399BarFasExtD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4815AlbEncCli", GXutil.rtrim( Z4815AlbEncCli));
      httpContext.ajax_rsp_assign_attri("", false, "O3829AlbPckUlin", GXutil.ltrim( localUtil.ntoc( O3829AlbPckUlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Albpckcaj( )
   {
      n3622AlbPckCaj = false ;
      if ( true /* Level */ && true /* After */ && (GXutil.strcmp("", A3622AlbPckCaj)==0) && ( AV26SumCaj == 1 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A30AlbProCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_char2[0] = A3622AlbPckCaj ;
         new app.pultpck(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int7, GXv_int5, GXv_char3, GXv_char2) ;
         talbpck_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         talbpck_impl.this.A30AlbProCod = GXv_int6[0] ;
         A30AlbProCod = this.A30AlbProCod ;
         talbpck_impl.this.A129BarCod = GXv_int7[0] ;
         A129BarCod = this.A129BarCod ;
         talbpck_impl.this.A132BarCodReo = GXv_int5[0] ;
         A132BarCodReo = this.A132BarCodReo ;
         talbpck_impl.this.A130BarCodPar = GXv_char3[0] ;
         A130BarCodPar = this.A130BarCodPar ;
         talbpck_impl.this.A3622AlbPckCaj = GXv_char2[0] ;
         A3622AlbPckCaj = this.A3622AlbPckCaj ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "A3622AlbPckCaj", GXutil.rtrim( A3622AlbPckCaj));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A3829AlbPckUlin',fld:'ALBPCKULIN',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV25FlagHss',fld:'vFLAGHSS',pic:'9'},{av:'AV26SumCaj',fld:'vSUMCAJ',pic:'9'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A3829AlbPckUlin',fld:'ALBPCKULIN',pic:'ZZZ9'},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A1499BarNMez',fld:'BARNMEZ',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A2399BarFasExtD',fld:'BARFASEXTD',pic:''},{av:'A4815AlbEncCli',fld:'ALBENCCLI',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z30AlbProCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z3829AlbPckUlin'},{av:'Z1652BarSerDsc'},{av:'Z1499BarNMez'},{av:'Z135BarColNom'},{av:'Z407EmprNom'},{av:'Z2399BarFasExtD'},{av:'Z4815AlbEncCli'},{av:'O3829AlbPckUlin'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_ALBPCKULIN","{handler:'valid_Albpckulin',iparms:[]");
      setEventMetadata("VALID_ALBPCKULIN",",oparms:[]}");
      setEventMetadata("VALID_BARFASEXTD","{handler:'valid_Barfasextd',iparms:[]");
      setEventMetadata("VALID_BARFASEXTD",",oparms:[]}");
      setEventMetadata("VALID_ALBENCCLI","{handler:'valid_Albenccli',iparms:[]");
      setEventMetadata("VALID_ALBENCCLI",",oparms:[]}");
      setEventMetadata("VALID_BARSERDSC","{handler:'valid_Barserdsc',iparms:[]");
      setEventMetadata("VALID_BARSERDSC",",oparms:[]}");
      setEventMetadata("VALID_BARNMEZ","{handler:'valid_Barnmez',iparms:[]");
      setEventMetadata("VALID_BARNMEZ",",oparms:[]}");
      setEventMetadata("VALID_BARCOLNOM","{handler:'valid_Barcolnom',iparms:[]");
      setEventMetadata("VALID_BARCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_ALBPCKLIN","{handler:'valid_Albpcklin',iparms:[]");
      setEventMetadata("VALID_ALBPCKLIN",",oparms:[]}");
      setEventMetadata("VALID_ALBPCKCAJ","{handler:'valid_Albpckcaj',iparms:[{av:'AV26SumCaj',fld:'vSUMCAJ',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3622AlbPckCaj',fld:'ALBPCKCAJ',pic:''}]");
      setEventMetadata("VALID_ALBPCKCAJ",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A3622AlbPckCaj',fld:'ALBPCKCAJ',pic:''}]}");
      setEventMetadata("VALID_ALBPCKKB","{handler:'valid_Albpckkb',iparms:[]");
      setEventMetadata("VALID_ALBPCKKB",",oparms:[]}");
      setEventMetadata("VALID_ALBPCKTAR","{handler:'valid_Albpcktar',iparms:[]");
      setEventMetadata("VALID_ALBPCKTAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albpckcal',iparms:[]");
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
      pr_default.close(32);
      pr_default.close(33);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z2399BarFasExtD = "" ;
      Z4815AlbEncCli = "" ;
      Z3625AlbPckTar = DecimalUtil.ZERO ;
      Z3623AlbPckKn = DecimalUtil.ZERO ;
      Z3622AlbPckCaj = "" ;
      Z3624AlbPckKb = DecimalUtil.ZERO ;
      Z7393AlbPckCal = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A3622AlbPckCaj = "" ;
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
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A2399BarFasExtD = "" ;
      lblTextblock8_Jsonclick = "" ;
      A4815AlbEncCli = "" ;
      lblTextblock9_Jsonclick = "" ;
      A1652BarSerDsc = "" ;
      lblTextblock10_Jsonclick = "" ;
      A1499BarNMez = "" ;
      lblTextblock11_Jsonclick = "" ;
      A135BarColNom = "" ;
      lblTextblock12_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode507 = "" ;
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
      sMode195 = "" ;
      GXCCtl = "" ;
      A3623AlbPckKn = DecimalUtil.ZERO ;
      A3624AlbPckKb = DecimalUtil.ZERO ;
      A3625AlbPckTar = DecimalUtil.ZERO ;
      A7393AlbPckCal = "" ;
      AV18LitFe = "" ;
      AV16Lit0 = "" ;
      AV22Lit3 = "" ;
      AV23Lit4 = "" ;
      GXt_char1 = "" ;
      AV24Lit5 = "" ;
      AV27Lit6 = "" ;
      AV19Station = "" ;
      AV20EmprNom = "" ;
      AV17UsurCod = "" ;
      Z407EmprNom = "" ;
      Z1652BarSerDsc = "" ;
      Z1499BarNMez = "" ;
      Z135BarColNom = "" ;
      T00DM6_A407EmprNom = new String[] {""} ;
      T00DM6_n407EmprNom = new boolean[] {false} ;
      T00DM8_A396EmprCod = new String[] {""} ;
      T00DM7_A1652BarSerDsc = new String[] {""} ;
      T00DM7_A1499BarNMez = new String[] {""} ;
      T00DM7_A135BarColNom = new String[] {""} ;
      edtAlbPckCaj_Inputmask = "" ;
      T00DM9_A2399BarFasExtD = new String[] {""} ;
      T00DM9_n2399BarFasExtD = new boolean[] {false} ;
      T00DM9_A4815AlbEncCli = new String[] {""} ;
      T00DM9_A3829AlbPckUlin = new short[1] ;
      T00DM9_n3829AlbPckUlin = new boolean[] {false} ;
      T00DM9_A1652BarSerDsc = new String[] {""} ;
      T00DM9_A1499BarNMez = new String[] {""} ;
      T00DM9_A135BarColNom = new String[] {""} ;
      T00DM9_A407EmprNom = new String[] {""} ;
      T00DM9_n407EmprNom = new boolean[] {false} ;
      T00DM9_A396EmprCod = new String[] {""} ;
      T00DM9_A129BarCod = new int[1] ;
      T00DM9_A132BarCodReo = new byte[1] ;
      T00DM9_A130BarCodPar = new String[] {""} ;
      T00DM9_A30AlbProCod = new long[1] ;
      T00DM10_A396EmprCod = new String[] {""} ;
      T00DM10_A30AlbProCod = new long[1] ;
      T00DM10_A129BarCod = new int[1] ;
      T00DM10_A132BarCodReo = new byte[1] ;
      T00DM10_A130BarCodPar = new String[] {""} ;
      T00DM5_A2399BarFasExtD = new String[] {""} ;
      T00DM5_n2399BarFasExtD = new boolean[] {false} ;
      T00DM5_A4815AlbEncCli = new String[] {""} ;
      T00DM5_A3829AlbPckUlin = new short[1] ;
      T00DM5_n3829AlbPckUlin = new boolean[] {false} ;
      T00DM5_A396EmprCod = new String[] {""} ;
      T00DM5_A129BarCod = new int[1] ;
      T00DM5_A132BarCodReo = new byte[1] ;
      T00DM5_A130BarCodPar = new String[] {""} ;
      T00DM5_A30AlbProCod = new long[1] ;
      T00DM11_A396EmprCod = new String[] {""} ;
      T00DM11_A30AlbProCod = new long[1] ;
      T00DM11_A129BarCod = new int[1] ;
      T00DM11_A132BarCodReo = new byte[1] ;
      T00DM11_A130BarCodPar = new String[] {""} ;
      T00DM12_A396EmprCod = new String[] {""} ;
      T00DM12_A30AlbProCod = new long[1] ;
      T00DM12_A129BarCod = new int[1] ;
      T00DM12_A132BarCodReo = new byte[1] ;
      T00DM12_A130BarCodPar = new String[] {""} ;
      T00DM4_A2399BarFasExtD = new String[] {""} ;
      T00DM4_n2399BarFasExtD = new boolean[] {false} ;
      T00DM4_A4815AlbEncCli = new String[] {""} ;
      T00DM4_A3829AlbPckUlin = new short[1] ;
      T00DM4_n3829AlbPckUlin = new boolean[] {false} ;
      T00DM4_A396EmprCod = new String[] {""} ;
      T00DM4_A129BarCod = new int[1] ;
      T00DM4_A132BarCodReo = new byte[1] ;
      T00DM4_A130BarCodPar = new String[] {""} ;
      T00DM4_A30AlbProCod = new long[1] ;
      T00DM16_A396EmprCod = new String[] {""} ;
      T00DM16_A30AlbProCod = new long[1] ;
      T00DM16_A129BarCod = new int[1] ;
      T00DM16_A132BarCodReo = new byte[1] ;
      T00DM16_A130BarCodPar = new String[] {""} ;
      T00DM16_A6648AlbMetLin = new short[1] ;
      T00DM17_A396EmprCod = new String[] {""} ;
      T00DM17_A30AlbProCod = new long[1] ;
      T00DM17_A129BarCod = new int[1] ;
      T00DM17_A132BarCodReo = new byte[1] ;
      T00DM17_A130BarCodPar = new String[] {""} ;
      T00DM17_A9639Et_Numero = new short[1] ;
      T00DM18_A396EmprCod = new String[] {""} ;
      T00DM18_A30AlbProCod = new long[1] ;
      T00DM18_A129BarCod = new int[1] ;
      T00DM18_A132BarCodReo = new byte[1] ;
      T00DM18_A130BarCodPar = new String[] {""} ;
      T00DM18_A6622AlbHdRLn = new short[1] ;
      T00DM19_A396EmprCod = new String[] {""} ;
      T00DM19_A30AlbProCod = new long[1] ;
      T00DM19_A129BarCod = new int[1] ;
      T00DM19_A132BarCodReo = new byte[1] ;
      T00DM19_A130BarCodPar = new String[] {""} ;
      T00DM19_A5456P_ForLin = new short[1] ;
      T00DM20_A396EmprCod = new String[] {""} ;
      T00DM20_A30AlbProCod = new long[1] ;
      T00DM20_A129BarCod = new int[1] ;
      T00DM20_A132BarCodReo = new byte[1] ;
      T00DM20_A130BarCodPar = new String[] {""} ;
      T00DM20_A2524DisComLin = new byte[1] ;
      T00DM20_A1056DisComCod = new String[] {""} ;
      T00DM20_A1032FonCod = new String[] {""} ;
      T00DM21_A396EmprCod = new String[] {""} ;
      T00DM21_A3617AlbTrnCod = new long[1] ;
      T00DM21_A30AlbProCod = new long[1] ;
      T00DM21_A129BarCod = new int[1] ;
      T00DM21_A132BarCodReo = new byte[1] ;
      T00DM21_A130BarCodPar = new String[] {""} ;
      T00DM22_A396EmprCod = new String[] {""} ;
      T00DM22_A30AlbProCod = new long[1] ;
      T00DM22_A129BarCod = new int[1] ;
      T00DM22_A132BarCodReo = new byte[1] ;
      T00DM22_A130BarCodPar = new String[] {""} ;
      T00DM22_A2764AlbHdrLin = new short[1] ;
      T00DM23_A396EmprCod = new String[] {""} ;
      T00DM23_A30AlbProCod = new long[1] ;
      T00DM23_A129BarCod = new int[1] ;
      T00DM23_A132BarCodReo = new byte[1] ;
      T00DM23_A130BarCodPar = new String[] {""} ;
      T00DM23_A1468AlbPrdLin = new short[1] ;
      T00DM24_A396EmprCod = new String[] {""} ;
      T00DM24_A30AlbProCod = new long[1] ;
      T00DM24_A129BarCod = new int[1] ;
      T00DM24_A132BarCodReo = new byte[1] ;
      T00DM24_A130BarCodPar = new String[] {""} ;
      T00DM24_A200BarPieCod = new String[] {""} ;
      T00DM25_A396EmprCod = new String[] {""} ;
      T00DM25_A30AlbProCod = new long[1] ;
      T00DM25_A129BarCod = new int[1] ;
      T00DM25_A132BarCodReo = new byte[1] ;
      T00DM25_A130BarCodPar = new String[] {""} ;
      T00DM25_A1240GuiFasLin = new short[1] ;
      T00DM27_A396EmprCod = new String[] {""} ;
      T00DM27_A30AlbProCod = new long[1] ;
      T00DM27_A129BarCod = new int[1] ;
      T00DM27_A132BarCodReo = new byte[1] ;
      T00DM27_A130BarCodPar = new String[] {""} ;
      T00DM28_A30AlbProCod = new long[1] ;
      T00DM28_A3621AlbPckLin = new short[1] ;
      T00DM28_A3625AlbPckTar = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DM28_n3625AlbPckTar = new boolean[] {false} ;
      T00DM28_A3623AlbPckKn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DM28_n3623AlbPckKn = new boolean[] {false} ;
      T00DM28_A3622AlbPckCaj = new String[] {""} ;
      T00DM28_n3622AlbPckCaj = new boolean[] {false} ;
      T00DM28_A3624AlbPckKb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DM28_n3624AlbPckKb = new boolean[] {false} ;
      T00DM28_A3626AlbPckUni = new short[1] ;
      T00DM28_n3626AlbPckUni = new boolean[] {false} ;
      T00DM28_A7393AlbPckCal = new String[] {""} ;
      T00DM28_n7393AlbPckCal = new boolean[] {false} ;
      T00DM28_A396EmprCod = new String[] {""} ;
      T00DM28_A129BarCod = new int[1] ;
      T00DM28_A132BarCodReo = new byte[1] ;
      T00DM28_A130BarCodPar = new String[] {""} ;
      E3625AlbPckTar = DecimalUtil.ZERO ;
      T00DM29_A396EmprCod = new String[] {""} ;
      T00DM29_A30AlbProCod = new long[1] ;
      T00DM29_A129BarCod = new int[1] ;
      T00DM29_A132BarCodReo = new byte[1] ;
      T00DM29_A130BarCodPar = new String[] {""} ;
      T00DM29_A3621AlbPckLin = new short[1] ;
      T00DM3_A30AlbProCod = new long[1] ;
      T00DM3_A3621AlbPckLin = new short[1] ;
      T00DM3_A3625AlbPckTar = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DM3_n3625AlbPckTar = new boolean[] {false} ;
      T00DM3_A3623AlbPckKn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DM3_n3623AlbPckKn = new boolean[] {false} ;
      T00DM3_A3622AlbPckCaj = new String[] {""} ;
      T00DM3_n3622AlbPckCaj = new boolean[] {false} ;
      T00DM3_A3624AlbPckKb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DM3_n3624AlbPckKb = new boolean[] {false} ;
      T00DM3_A3626AlbPckUni = new short[1] ;
      T00DM3_n3626AlbPckUni = new boolean[] {false} ;
      T00DM3_A7393AlbPckCal = new String[] {""} ;
      T00DM3_n7393AlbPckCal = new boolean[] {false} ;
      T00DM3_A396EmprCod = new String[] {""} ;
      T00DM3_A129BarCod = new int[1] ;
      T00DM3_A132BarCodReo = new byte[1] ;
      T00DM3_A130BarCodPar = new String[] {""} ;
      T00DM2_A30AlbProCod = new long[1] ;
      T00DM2_A3621AlbPckLin = new short[1] ;
      T00DM2_A3625AlbPckTar = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DM2_n3625AlbPckTar = new boolean[] {false} ;
      T00DM2_A3623AlbPckKn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DM2_n3623AlbPckKn = new boolean[] {false} ;
      T00DM2_A3622AlbPckCaj = new String[] {""} ;
      T00DM2_n3622AlbPckCaj = new boolean[] {false} ;
      T00DM2_A3624AlbPckKb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DM2_n3624AlbPckKb = new boolean[] {false} ;
      T00DM2_A3626AlbPckUni = new short[1] ;
      T00DM2_n3626AlbPckUni = new boolean[] {false} ;
      T00DM2_A7393AlbPckCal = new String[] {""} ;
      T00DM2_n7393AlbPckCal = new boolean[] {false} ;
      T00DM2_A396EmprCod = new String[] {""} ;
      T00DM2_A129BarCod = new int[1] ;
      T00DM2_A132BarCodReo = new byte[1] ;
      T00DM2_A130BarCodPar = new String[] {""} ;
      T00DM33_A396EmprCod = new String[] {""} ;
      T00DM33_A30AlbProCod = new long[1] ;
      T00DM33_A129BarCod = new int[1] ;
      T00DM33_A132BarCodReo = new byte[1] ;
      T00DM33_A130BarCodPar = new String[] {""} ;
      T00DM33_A3621AlbPckLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00DM34_A407EmprNom = new String[] {""} ;
      T00DM34_n407EmprNom = new boolean[] {false} ;
      T00DM35_A396EmprCod = new String[] {""} ;
      T00DM36_A1652BarSerDsc = new String[] {""} ;
      T00DM36_A1499BarNMez = new String[] {""} ;
      T00DM36_A135BarColNom = new String[] {""} ;
      Gx_restmethod = "" ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ1652BarSerDsc = "" ;
      ZZ1499BarNMez = "" ;
      ZZ135BarColNom = "" ;
      ZZ407EmprNom = "" ;
      ZZ2399BarFasExtD = "" ;
      ZZ4815AlbEncCli = "" ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new long[1] ;
      GXv_int7 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.talbpck__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.talbpck__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.talbpck__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.talbpck__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbpck__default(),
         new Object[] {
             new Object[] {
            T00DM2_A30AlbProCod, T00DM2_A3621AlbPckLin, T00DM2_A3625AlbPckTar, T00DM2_n3625AlbPckTar, T00DM2_A3623AlbPckKn, T00DM2_n3623AlbPckKn, T00DM2_A3622AlbPckCaj, T00DM2_n3622AlbPckCaj, T00DM2_A3624AlbPckKb, T00DM2_n3624AlbPckKb,
            T00DM2_A3626AlbPckUni, T00DM2_n3626AlbPckUni, T00DM2_A7393AlbPckCal, T00DM2_n7393AlbPckCal, T00DM2_A396EmprCod, T00DM2_A129BarCod, T00DM2_A132BarCodReo, T00DM2_A130BarCodPar
            }
            , new Object[] {
            T00DM3_A30AlbProCod, T00DM3_A3621AlbPckLin, T00DM3_A3625AlbPckTar, T00DM3_n3625AlbPckTar, T00DM3_A3623AlbPckKn, T00DM3_n3623AlbPckKn, T00DM3_A3622AlbPckCaj, T00DM3_n3622AlbPckCaj, T00DM3_A3624AlbPckKb, T00DM3_n3624AlbPckKb,
            T00DM3_A3626AlbPckUni, T00DM3_n3626AlbPckUni, T00DM3_A7393AlbPckCal, T00DM3_n7393AlbPckCal, T00DM3_A396EmprCod, T00DM3_A129BarCod, T00DM3_A132BarCodReo, T00DM3_A130BarCodPar
            }
            , new Object[] {
            T00DM4_A2399BarFasExtD, T00DM4_n2399BarFasExtD, T00DM4_A4815AlbEncCli, T00DM4_A3829AlbPckUlin, T00DM4_n3829AlbPckUlin, T00DM4_A396EmprCod, T00DM4_A129BarCod, T00DM4_A132BarCodReo, T00DM4_A130BarCodPar, T00DM4_A30AlbProCod
            }
            , new Object[] {
            T00DM5_A2399BarFasExtD, T00DM5_n2399BarFasExtD, T00DM5_A4815AlbEncCli, T00DM5_A3829AlbPckUlin, T00DM5_n3829AlbPckUlin, T00DM5_A396EmprCod, T00DM5_A129BarCod, T00DM5_A132BarCodReo, T00DM5_A130BarCodPar, T00DM5_A30AlbProCod
            }
            , new Object[] {
            T00DM6_A407EmprNom, T00DM6_n407EmprNom
            }
            , new Object[] {
            T00DM7_A1652BarSerDsc, T00DM7_A1499BarNMez, T00DM7_A135BarColNom
            }
            , new Object[] {
            T00DM8_A396EmprCod
            }
            , new Object[] {
            T00DM9_A2399BarFasExtD, T00DM9_n2399BarFasExtD, T00DM9_A4815AlbEncCli, T00DM9_A3829AlbPckUlin, T00DM9_n3829AlbPckUlin, T00DM9_A1652BarSerDsc, T00DM9_A1499BarNMez, T00DM9_A135BarColNom, T00DM9_A407EmprNom, T00DM9_n407EmprNom,
            T00DM9_A396EmprCod, T00DM9_A129BarCod, T00DM9_A132BarCodReo, T00DM9_A130BarCodPar, T00DM9_A30AlbProCod
            }
            , new Object[] {
            T00DM10_A396EmprCod, T00DM10_A30AlbProCod, T00DM10_A129BarCod, T00DM10_A132BarCodReo, T00DM10_A130BarCodPar
            }
            , new Object[] {
            T00DM11_A396EmprCod, T00DM11_A30AlbProCod, T00DM11_A129BarCod, T00DM11_A132BarCodReo, T00DM11_A130BarCodPar
            }
            , new Object[] {
            T00DM12_A396EmprCod, T00DM12_A30AlbProCod, T00DM12_A129BarCod, T00DM12_A132BarCodReo, T00DM12_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00DM16_A396EmprCod, T00DM16_A30AlbProCod, T00DM16_A129BarCod, T00DM16_A132BarCodReo, T00DM16_A130BarCodPar, T00DM16_A6648AlbMetLin
            }
            , new Object[] {
            T00DM17_A396EmprCod, T00DM17_A30AlbProCod, T00DM17_A129BarCod, T00DM17_A132BarCodReo, T00DM17_A130BarCodPar, T00DM17_A9639Et_Numero
            }
            , new Object[] {
            T00DM18_A396EmprCod, T00DM18_A30AlbProCod, T00DM18_A129BarCod, T00DM18_A132BarCodReo, T00DM18_A130BarCodPar, T00DM18_A6622AlbHdRLn
            }
            , new Object[] {
            T00DM19_A396EmprCod, T00DM19_A30AlbProCod, T00DM19_A129BarCod, T00DM19_A132BarCodReo, T00DM19_A130BarCodPar, T00DM19_A5456P_ForLin
            }
            , new Object[] {
            T00DM20_A396EmprCod, T00DM20_A30AlbProCod, T00DM20_A129BarCod, T00DM20_A132BarCodReo, T00DM20_A130BarCodPar, T00DM20_A2524DisComLin, T00DM20_A1056DisComCod, T00DM20_A1032FonCod
            }
            , new Object[] {
            T00DM21_A396EmprCod, T00DM21_A3617AlbTrnCod, T00DM21_A30AlbProCod, T00DM21_A129BarCod, T00DM21_A132BarCodReo, T00DM21_A130BarCodPar
            }
            , new Object[] {
            T00DM22_A396EmprCod, T00DM22_A30AlbProCod, T00DM22_A129BarCod, T00DM22_A132BarCodReo, T00DM22_A130BarCodPar, T00DM22_A2764AlbHdrLin
            }
            , new Object[] {
            T00DM23_A396EmprCod, T00DM23_A30AlbProCod, T00DM23_A129BarCod, T00DM23_A132BarCodReo, T00DM23_A130BarCodPar, T00DM23_A1468AlbPrdLin
            }
            , new Object[] {
            T00DM24_A396EmprCod, T00DM24_A30AlbProCod, T00DM24_A129BarCod, T00DM24_A132BarCodReo, T00DM24_A130BarCodPar, T00DM24_A200BarPieCod
            }
            , new Object[] {
            T00DM25_A396EmprCod, T00DM25_A30AlbProCod, T00DM25_A129BarCod, T00DM25_A132BarCodReo, T00DM25_A130BarCodPar, T00DM25_A1240GuiFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            T00DM27_A396EmprCod, T00DM27_A30AlbProCod, T00DM27_A129BarCod, T00DM27_A132BarCodReo, T00DM27_A130BarCodPar
            }
            , new Object[] {
            T00DM28_A30AlbProCod, T00DM28_A3621AlbPckLin, T00DM28_A3625AlbPckTar, T00DM28_n3625AlbPckTar, T00DM28_A3623AlbPckKn, T00DM28_n3623AlbPckKn, T00DM28_A3622AlbPckCaj, T00DM28_n3622AlbPckCaj, T00DM28_A3624AlbPckKb, T00DM28_n3624AlbPckKb,
            T00DM28_A3626AlbPckUni, T00DM28_n3626AlbPckUni, T00DM28_A7393AlbPckCal, T00DM28_n7393AlbPckCal, T00DM28_A396EmprCod, T00DM28_A129BarCod, T00DM28_A132BarCodReo, T00DM28_A130BarCodPar
            }
            , new Object[] {
            T00DM29_A396EmprCod, T00DM29_A30AlbProCod, T00DM29_A129BarCod, T00DM29_A132BarCodReo, T00DM29_A130BarCodPar, T00DM29_A3621AlbPckLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00DM33_A396EmprCod, T00DM33_A30AlbProCod, T00DM33_A129BarCod, T00DM33_A132BarCodReo, T00DM33_A130BarCodPar, T00DM33_A3621AlbPckLin
            }
            , new Object[] {
            T00DM34_A407EmprNom, T00DM34_n407EmprNom
            }
            , new Object[] {
            T00DM35_A396EmprCod
            }
            , new Object[] {
            T00DM36_A1652BarSerDsc, T00DM36_A1499BarNMez, T00DM36_A135BarColNom
            }
         }
      );
      Z130BarCodPar = "" ;
      A130BarCodPar = "" ;
      Z132BarCodReo = (byte)(0) ;
      A132BarCodReo = (byte)(0) ;
      Z129BarCod = 0 ;
      A129BarCod = 0 ;
      Z30AlbProCod = 0 ;
      A30AlbProCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte wcpOA132BarCodReo ;
   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV26SumCaj ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte AV25FlagHss ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private byte GXv_int5[] ;
   private short Z3829AlbPckUlin ;
   private short O3829AlbPckUlin ;
   private short Z3621AlbPckLin ;
   private short Z3626AlbPckUni ;
   private short nRcdDeleted_507 ;
   private short nRcdExists_507 ;
   private short nIsMod_507 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A3829AlbPckUlin ;
   private short nBlankRcdCount507 ;
   private short RcdFound507 ;
   private short B3829AlbPckUlin ;
   private short nBlankRcdUsr507 ;
   private short s3829AlbPckUlin ;
   private short A3621AlbPckLin ;
   private short A3626AlbPckUni ;
   private short RcdFound195 ;
   private short nIsDirty_195 ;
   private short nIsDirty_507 ;
   private short i3829AlbPckUlin ;
   private short ZZ3829AlbPckUlin ;
   private short ZO3829AlbPckUlin ;
   private int wcpOA129BarCod ;
   private int Z129BarCod ;
   private int nRC_GXsfl_80 ;
   private int nGXsfl_80_idx=1 ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtAlbProCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtAlbPckUlin_Enabled ;
   private int edtBarFasExtD_Visible ;
   private int edtBarFasExtD_Enabled ;
   private int edtAlbEncCli_Visible ;
   private int edtAlbEncCli_Enabled ;
   private int edtBarSerDsc_Enabled ;
   private int edtBarNMez_Enabled ;
   private int edtBarColNom_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtavnRcdDeleted_507_Enabled ;
   private int edtAlbPckLin_Enabled ;
   private int edtAlbPckCaj_Enabled ;
   private int edtAlbPckKn_Enabled ;
   private int edtAlbPckKb_Enabled ;
   private int edtAlbPckTar_Enabled ;
   private int edtAlbPckUni_Enabled ;
   private int edtAlbPckCal_Enabled ;
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
   private int defedtAlbPckLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtBarColNom_Backcolor ;
   private int edtBarNMez_Backcolor ;
   private int edtBarSerDsc_Backcolor ;
   private int edtAlbEncCli_Backcolor ;
   private int edtBarFasExtD_Backcolor ;
   private int edtAlbPckUlin_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtAlbProCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int GXv_int7[] ;
   private long wcpOA30AlbProCod ;
   private long Z30AlbProCod ;
   private long A30AlbProCod ;
   private long GRID1_nFirstRecordOnPage ;
   private long ZZ30AlbProCod ;
   private long GXv_int6[] ;
   private java.math.BigDecimal Z3625AlbPckTar ;
   private java.math.BigDecimal Z3623AlbPckKn ;
   private java.math.BigDecimal Z3624AlbPckKb ;
   private java.math.BigDecimal A3623AlbPckKn ;
   private java.math.BigDecimal A3624AlbPckKb ;
   private java.math.BigDecimal A3625AlbPckTar ;
   private java.math.BigDecimal E3625AlbPckTar ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z2399BarFasExtD ;
   private String Z4815AlbEncCli ;
   private String Z3622AlbPckCaj ;
   private String Z7393AlbPckCal ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A3622AlbPckCaj ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBarFasExtD_Internalname ;
   private String sGXsfl_80_idx="0001" ;
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
   private String edtAlbProCod_Internalname ;
   private String edtAlbProCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtAlbPckUlin_Internalname ;
   private String edtAlbPckUlin_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String A2399BarFasExtD ;
   private String edtBarFasExtD_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtAlbEncCli_Internalname ;
   private String A4815AlbEncCli ;
   private String edtAlbEncCli_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtBarSerDsc_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtBarNMez_Internalname ;
   private String A1499BarNMez ;
   private String edtBarNMez_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtBarColNom_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode507 ;
   private String edtavnRcdDeleted_507_Internalname ;
   private String edtAlbPckLin_Internalname ;
   private String edtAlbPckCaj_Internalname ;
   private String edtAlbPckKn_Internalname ;
   private String edtAlbPckKb_Internalname ;
   private String edtAlbPckTar_Internalname ;
   private String edtAlbPckUni_Internalname ;
   private String edtAlbPckCal_Internalname ;
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
   private String sMode195 ;
   private String GXCCtl ;
   private String A7393AlbPckCal ;
   private String AV18LitFe ;
   private String AV16Lit0 ;
   private String AV22Lit3 ;
   private String AV23Lit4 ;
   private String GXt_char1 ;
   private String AV24Lit5 ;
   private String AV27Lit6 ;
   private String AV19Station ;
   private String AV20EmprNom ;
   private String AV17UsurCod ;
   private String Z407EmprNom ;
   private String Z1652BarSerDsc ;
   private String Z1499BarNMez ;
   private String Z135BarColNom ;
   private String edtAlbPckCaj_Inputmask ;
   private String sGXsfl_80_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_507_Jsonclick ;
   private String edtAlbPckLin_Jsonclick ;
   private String edtAlbPckCaj_Jsonclick ;
   private String edtAlbPckKn_Jsonclick ;
   private String edtAlbPckKb_Jsonclick ;
   private String edtAlbPckTar_Jsonclick ;
   private String edtAlbPckUni_Jsonclick ;
   private String edtAlbPckCal_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String Gx_restmethod ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ1652BarSerDsc ;
   private String ZZ1499BarNMez ;
   private String ZZ135BarColNom ;
   private String ZZ407EmprNom ;
   private String ZZ2399BarFasExtD ;
   private String ZZ4815AlbEncCli ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n3622AlbPckCaj ;
   private boolean wbErr ;
   private boolean n3829AlbPckUlin ;
   private boolean bGXsfl_80_Refreshing=false ;
   private boolean n2399BarFasExtD ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n3625AlbPckTar ;
   private boolean n3623AlbPckKn ;
   private boolean n3624AlbPckKb ;
   private boolean n3626AlbPckUni ;
   private boolean n7393AlbPckCal ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00DM6_A407EmprNom ;
   private boolean[] T00DM6_n407EmprNom ;
   private String[] T00DM8_A396EmprCod ;
   private String[] T00DM7_A1652BarSerDsc ;
   private String[] T00DM7_A1499BarNMez ;
   private String[] T00DM7_A135BarColNom ;
   private String[] T00DM9_A2399BarFasExtD ;
   private boolean[] T00DM9_n2399BarFasExtD ;
   private String[] T00DM9_A4815AlbEncCli ;
   private short[] T00DM9_A3829AlbPckUlin ;
   private boolean[] T00DM9_n3829AlbPckUlin ;
   private String[] T00DM9_A1652BarSerDsc ;
   private String[] T00DM9_A1499BarNMez ;
   private String[] T00DM9_A135BarColNom ;
   private String[] T00DM9_A407EmprNom ;
   private boolean[] T00DM9_n407EmprNom ;
   private String[] T00DM9_A396EmprCod ;
   private int[] T00DM9_A129BarCod ;
   private byte[] T00DM9_A132BarCodReo ;
   private String[] T00DM9_A130BarCodPar ;
   private long[] T00DM9_A30AlbProCod ;
   private String[] T00DM10_A396EmprCod ;
   private long[] T00DM10_A30AlbProCod ;
   private int[] T00DM10_A129BarCod ;
   private byte[] T00DM10_A132BarCodReo ;
   private String[] T00DM10_A130BarCodPar ;
   private String[] T00DM5_A2399BarFasExtD ;
   private boolean[] T00DM5_n2399BarFasExtD ;
   private String[] T00DM5_A4815AlbEncCli ;
   private short[] T00DM5_A3829AlbPckUlin ;
   private boolean[] T00DM5_n3829AlbPckUlin ;
   private String[] T00DM5_A396EmprCod ;
   private int[] T00DM5_A129BarCod ;
   private byte[] T00DM5_A132BarCodReo ;
   private String[] T00DM5_A130BarCodPar ;
   private long[] T00DM5_A30AlbProCod ;
   private String[] T00DM11_A396EmprCod ;
   private long[] T00DM11_A30AlbProCod ;
   private int[] T00DM11_A129BarCod ;
   private byte[] T00DM11_A132BarCodReo ;
   private String[] T00DM11_A130BarCodPar ;
   private String[] T00DM12_A396EmprCod ;
   private long[] T00DM12_A30AlbProCod ;
   private int[] T00DM12_A129BarCod ;
   private byte[] T00DM12_A132BarCodReo ;
   private String[] T00DM12_A130BarCodPar ;
   private String[] T00DM4_A2399BarFasExtD ;
   private boolean[] T00DM4_n2399BarFasExtD ;
   private String[] T00DM4_A4815AlbEncCli ;
   private short[] T00DM4_A3829AlbPckUlin ;
   private boolean[] T00DM4_n3829AlbPckUlin ;
   private String[] T00DM4_A396EmprCod ;
   private int[] T00DM4_A129BarCod ;
   private byte[] T00DM4_A132BarCodReo ;
   private String[] T00DM4_A130BarCodPar ;
   private long[] T00DM4_A30AlbProCod ;
   private String[] T00DM16_A396EmprCod ;
   private long[] T00DM16_A30AlbProCod ;
   private int[] T00DM16_A129BarCod ;
   private byte[] T00DM16_A132BarCodReo ;
   private String[] T00DM16_A130BarCodPar ;
   private short[] T00DM16_A6648AlbMetLin ;
   private String[] T00DM17_A396EmprCod ;
   private long[] T00DM17_A30AlbProCod ;
   private int[] T00DM17_A129BarCod ;
   private byte[] T00DM17_A132BarCodReo ;
   private String[] T00DM17_A130BarCodPar ;
   private short[] T00DM17_A9639Et_Numero ;
   private String[] T00DM18_A396EmprCod ;
   private long[] T00DM18_A30AlbProCod ;
   private int[] T00DM18_A129BarCod ;
   private byte[] T00DM18_A132BarCodReo ;
   private String[] T00DM18_A130BarCodPar ;
   private short[] T00DM18_A6622AlbHdRLn ;
   private String[] T00DM19_A396EmprCod ;
   private long[] T00DM19_A30AlbProCod ;
   private int[] T00DM19_A129BarCod ;
   private byte[] T00DM19_A132BarCodReo ;
   private String[] T00DM19_A130BarCodPar ;
   private short[] T00DM19_A5456P_ForLin ;
   private String[] T00DM20_A396EmprCod ;
   private long[] T00DM20_A30AlbProCod ;
   private int[] T00DM20_A129BarCod ;
   private byte[] T00DM20_A132BarCodReo ;
   private String[] T00DM20_A130BarCodPar ;
   private byte[] T00DM20_A2524DisComLin ;
   private String[] T00DM20_A1056DisComCod ;
   private String[] T00DM20_A1032FonCod ;
   private String[] T00DM21_A396EmprCod ;
   private long[] T00DM21_A3617AlbTrnCod ;
   private long[] T00DM21_A30AlbProCod ;
   private int[] T00DM21_A129BarCod ;
   private byte[] T00DM21_A132BarCodReo ;
   private String[] T00DM21_A130BarCodPar ;
   private String[] T00DM22_A396EmprCod ;
   private long[] T00DM22_A30AlbProCod ;
   private int[] T00DM22_A129BarCod ;
   private byte[] T00DM22_A132BarCodReo ;
   private String[] T00DM22_A130BarCodPar ;
   private short[] T00DM22_A2764AlbHdrLin ;
   private String[] T00DM23_A396EmprCod ;
   private long[] T00DM23_A30AlbProCod ;
   private int[] T00DM23_A129BarCod ;
   private byte[] T00DM23_A132BarCodReo ;
   private String[] T00DM23_A130BarCodPar ;
   private short[] T00DM23_A1468AlbPrdLin ;
   private String[] T00DM24_A396EmprCod ;
   private long[] T00DM24_A30AlbProCod ;
   private int[] T00DM24_A129BarCod ;
   private byte[] T00DM24_A132BarCodReo ;
   private String[] T00DM24_A130BarCodPar ;
   private String[] T00DM24_A200BarPieCod ;
   private String[] T00DM25_A396EmprCod ;
   private long[] T00DM25_A30AlbProCod ;
   private int[] T00DM25_A129BarCod ;
   private byte[] T00DM25_A132BarCodReo ;
   private String[] T00DM25_A130BarCodPar ;
   private short[] T00DM25_A1240GuiFasLin ;
   private String[] T00DM27_A396EmprCod ;
   private long[] T00DM27_A30AlbProCod ;
   private int[] T00DM27_A129BarCod ;
   private byte[] T00DM27_A132BarCodReo ;
   private String[] T00DM27_A130BarCodPar ;
   private long[] T00DM28_A30AlbProCod ;
   private short[] T00DM28_A3621AlbPckLin ;
   private java.math.BigDecimal[] T00DM28_A3625AlbPckTar ;
   private boolean[] T00DM28_n3625AlbPckTar ;
   private java.math.BigDecimal[] T00DM28_A3623AlbPckKn ;
   private boolean[] T00DM28_n3623AlbPckKn ;
   private String[] T00DM28_A3622AlbPckCaj ;
   private boolean[] T00DM28_n3622AlbPckCaj ;
   private java.math.BigDecimal[] T00DM28_A3624AlbPckKb ;
   private boolean[] T00DM28_n3624AlbPckKb ;
   private short[] T00DM28_A3626AlbPckUni ;
   private boolean[] T00DM28_n3626AlbPckUni ;
   private String[] T00DM28_A7393AlbPckCal ;
   private boolean[] T00DM28_n7393AlbPckCal ;
   private String[] T00DM28_A396EmprCod ;
   private int[] T00DM28_A129BarCod ;
   private byte[] T00DM28_A132BarCodReo ;
   private String[] T00DM28_A130BarCodPar ;
   private String[] T00DM29_A396EmprCod ;
   private long[] T00DM29_A30AlbProCod ;
   private int[] T00DM29_A129BarCod ;
   private byte[] T00DM29_A132BarCodReo ;
   private String[] T00DM29_A130BarCodPar ;
   private short[] T00DM29_A3621AlbPckLin ;
   private long[] T00DM3_A30AlbProCod ;
   private short[] T00DM3_A3621AlbPckLin ;
   private java.math.BigDecimal[] T00DM3_A3625AlbPckTar ;
   private boolean[] T00DM3_n3625AlbPckTar ;
   private java.math.BigDecimal[] T00DM3_A3623AlbPckKn ;
   private boolean[] T00DM3_n3623AlbPckKn ;
   private String[] T00DM3_A3622AlbPckCaj ;
   private boolean[] T00DM3_n3622AlbPckCaj ;
   private java.math.BigDecimal[] T00DM3_A3624AlbPckKb ;
   private boolean[] T00DM3_n3624AlbPckKb ;
   private short[] T00DM3_A3626AlbPckUni ;
   private boolean[] T00DM3_n3626AlbPckUni ;
   private String[] T00DM3_A7393AlbPckCal ;
   private boolean[] T00DM3_n7393AlbPckCal ;
   private String[] T00DM3_A396EmprCod ;
   private int[] T00DM3_A129BarCod ;
   private byte[] T00DM3_A132BarCodReo ;
   private String[] T00DM3_A130BarCodPar ;
   private long[] T00DM2_A30AlbProCod ;
   private short[] T00DM2_A3621AlbPckLin ;
   private java.math.BigDecimal[] T00DM2_A3625AlbPckTar ;
   private boolean[] T00DM2_n3625AlbPckTar ;
   private java.math.BigDecimal[] T00DM2_A3623AlbPckKn ;
   private boolean[] T00DM2_n3623AlbPckKn ;
   private String[] T00DM2_A3622AlbPckCaj ;
   private boolean[] T00DM2_n3622AlbPckCaj ;
   private java.math.BigDecimal[] T00DM2_A3624AlbPckKb ;
   private boolean[] T00DM2_n3624AlbPckKb ;
   private short[] T00DM2_A3626AlbPckUni ;
   private boolean[] T00DM2_n3626AlbPckUni ;
   private String[] T00DM2_A7393AlbPckCal ;
   private boolean[] T00DM2_n7393AlbPckCal ;
   private String[] T00DM2_A396EmprCod ;
   private int[] T00DM2_A129BarCod ;
   private byte[] T00DM2_A132BarCodReo ;
   private String[] T00DM2_A130BarCodPar ;
   private String[] T00DM33_A396EmprCod ;
   private long[] T00DM33_A30AlbProCod ;
   private int[] T00DM33_A129BarCod ;
   private byte[] T00DM33_A132BarCodReo ;
   private String[] T00DM33_A130BarCodPar ;
   private short[] T00DM33_A3621AlbPckLin ;
   private String[] T00DM34_A407EmprNom ;
   private boolean[] T00DM34_n407EmprNom ;
   private String[] T00DM35_A396EmprCod ;
   private String[] T00DM36_A1652BarSerDsc ;
   private String[] T00DM36_A1499BarNMez ;
   private String[] T00DM36_A135BarColNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class talbpck__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbpck__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbpck__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbpck__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbpck__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00DM2", "SELECT AlbProCod, AlbPckLin, AlbPckTar, AlbPckKn, AlbPckCaj, AlbPckKb, AlbPckUni, AlbPckCal, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPALBPCK WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbPckLin = ?  FOR UPDATE OF AlbPckTar, AlbPckKn, AlbPckCaj, AlbPckKb, AlbPckUni, AlbPckCal NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DM3", "SELECT AlbProCod, AlbPckLin, AlbPckTar, AlbPckKn, AlbPckCaj, AlbPckKb, AlbPckUni, AlbPckCal, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPALBPCK WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbPckLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DM4", "SELECT BarFasExtD, AlbEncCli, AlbPckUlin, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF BarFasExtD, AlbEncCli, AlbPckUlin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00DM5", "SELECT BarFasExtD, AlbEncCli, AlbPckUlin, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00DM6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00DM7", "SELECT BarSerDsc, BarNMez, BarColNom FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00DM8", "SELECT EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00DM9", "SELECT /*+ FIRST_ROWS(1) */ TM1.BarFasExtD, TM1.AlbEncCli, TM1.AlbPckUlin, T3.BarSerDsc, T3.BarNMez, T3.BarColNom, T2.EmprNom, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.AlbProCod FROM ((TXPALBBAR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) WHERE TM1.EmprCod = ? and TM1.AlbProCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.AlbProCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00DM10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00DM11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00DM12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod DESC, AlbProCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00DM13", "INSERT INTO TXPALBBAR(BarFasExtD, AlbEncCli, AlbPckUlin, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod, AlbProEsp, AlbProRec, TubCod, BarAlbKgmE, BarAlbMtrE, BarAlbPie, BarAlbTub, GuiFasULin, BarPreKgm, BarPreMtr, AlbPConPie, BarAlbBul, BarAlbTar, BarAlbFor, BarAlbTip, BarAlbPN, AlbPrdULin, IntCod, BarAlbPbr, ManCod, BarFasExt, BarAlbObs, BarAlbExt, BarAlbTin, AlbHdrObs, AlbBarRec, AlbBarDto, AlbHdrUlin, AlbProVal, AlbTipCon, AlbHdrAnc, CodCod, AlbSer, AlbColNom, AlbColNum, AlbTipCol, AlbHdrgm2, TipAcaCod, AlbTipEnt, AlbImpMan, P_ForULin, PlasCod, BarAlbPlas, AlbHdRUl, AlbObsM, BarPreFKg, BarPreFMt, BarPreTKg, BarPreTMt, AlbEncL, AlbEncA, AlbCald, AlbDf1, AlbDf2, AlbDf3, AlbMqTj, AlbDto, AlbSerD, Et_UltNum, BarKgsCli, AlbMetULi, AlbCliCod, BarPreUnd, BarAlbUnd, AlbNomCli, AlbNumcli, AlbTipArt, AlbCadEnc, AlbTiras, AlbTirasKg, AlbSinTest) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPALBBAR")
         ,new UpdateCursor("T00DM14", "UPDATE TXPALBBAR SET BarFasExtD=?, AlbEncCli=?, AlbPckUlin=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new UpdateCursor("T00DM15", "DELETE FROM TXPALBBAR  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new ForEachCursor("T00DM16", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbMetLin FROM TXPMETCAL WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00DM17", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, Et_Numero FROM TXPEDIETI WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00DM18", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00DM19", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, P_ForLin FROM TXPALBQUI WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00DM20", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPALBEST WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00DM21", "SELECT * FROM (SELECT EmprCod, AlbTrnCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPLALBTR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00DM22", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin FROM TXPALBTXT WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00DM23", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPrdLin FROM TXPALBPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00DM24", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00DM25", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00DM26", "UPDATE TXPALBBAR SET AlbPckUlin=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new ForEachCursor("T00DM27", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00DM28", "SELECT AlbProCod, AlbPckLin, AlbPckTar, AlbPckKn, AlbPckCaj, AlbPckKb, AlbPckUni, AlbPckCal, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPALBPCK WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and AlbPckLin = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPckLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DM29", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPckLin FROM TXPALBPCK WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbPckLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00DM30", "INSERT INTO TXPALBPCK(AlbProCod, AlbPckLin, AlbPckTar, AlbPckKn, AlbPckCaj, AlbPckKb, AlbPckUni, AlbPckCal, EmprCod, BarCod, BarCodReo, BarCodPar, AlbPckM1, AlbPckM2, AlbPckM3) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK, "TXPALBPCK")
         ,new UpdateCursor("T00DM31", "UPDATE TXPALBPCK SET AlbPckTar=?, AlbPckKn=?, AlbPckCaj=?, AlbPckKb=?, AlbPckUni=?, AlbPckCal=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbPckLin = ?", GX_NOMASK, "TXPALBPCK")
         ,new UpdateCursor("T00DM32", "DELETE FROM TXPALBPCK  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbPckLin = ?", GX_NOMASK, "TXPALBPCK")
         ,new ForEachCursor("T00DM33", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPckLin FROM TXPALBPCK WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPckLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DM34", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DM35", "SELECT EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DM36", "SELECT BarSerDsc, BarNMez, BarColNom FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 12);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 3);
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((byte[]) buf[16])[0] = rslt.getByte(11);
               ((String[]) buf[17])[0] = rslt.getString(12, 1);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 12);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 3);
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((byte[]) buf[16])[0] = rslt.getByte(11);
               ((String[]) buf[17])[0] = rslt.getString(12, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((long[]) buf[9])[0] = rslt.getLong(8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((long[]) buf[9])[0] = rslt.getLong(8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 26);
               ((String[]) buf[6])[0] = rslt.getString(5, 10);
               ((String[]) buf[7])[0] = rslt.getString(6, 13);
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 3);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               ((long[]) buf[14])[0] = rslt.getLong(12);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 26 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 12);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 3);
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((byte[]) buf[16])[0] = rslt.getByte(11);
               ((String[]) buf[17])[0] = rslt.getString(12, 1);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 28);
               }
               stmt.setString(2, (String)parms[2], 20);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[4]).shortValue());
               }
               stmt.setString(4, (String)parms[5], 3);
               stmt.setInt(5, ((Number) parms[6]).intValue());
               stmt.setByte(6, ((Number) parms[7]).byteValue());
               stmt.setString(7, (String)parms[8], 1);
               stmt.setLong(8, ((Number) parms[9]).longValue());
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 28);
               }
               stmt.setString(2, (String)parms[2], 20);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[4]).shortValue());
               }
               stmt.setString(4, (String)parms[5], 3);
               stmt.setLong(5, ((Number) parms[6]).longValue());
               stmt.setInt(6, ((Number) parms[7]).intValue());
               stmt.setByte(7, ((Number) parms[8]).byteValue());
               stmt.setString(8, (String)parms[9], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 24 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setLong(3, ((Number) parms[3]).longValue());
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 28 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
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
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 12);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[13], 6);
               }
               stmt.setString(9, (String)parms[14], 3);
               stmt.setInt(10, ((Number) parms[15]).intValue());
               stmt.setByte(11, ((Number) parms[16]).byteValue());
               stmt.setString(12, (String)parms[17], 1);
               return;
            case 29 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 12);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 6);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setLong(8, ((Number) parms[13]).longValue());
               stmt.setInt(9, ((Number) parms[14]).intValue());
               stmt.setByte(10, ((Number) parms[15]).byteValue());
               stmt.setString(11, (String)parms[16], 1);
               stmt.setShort(12, ((Number) parms[17]).shortValue());
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

