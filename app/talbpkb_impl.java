package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talbpkb_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action11") == 0 )
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
         xc_11_TB507( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A3622AlbPckCaj, AV26SumCaj) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ALBARAN PACKING LIST S.A.BROS", ""), (short)(0)) ;
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
      nRC_GXsfl_60 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_60"))) ;
      nGXsfl_60_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_60_idx"))) ;
      sGXsfl_60_idx = httpContext.GetPar( "sGXsfl_60_idx") ;
      A3829AlbPckUlin = (short)(GXutil.lval( httpContext.GetPar( "AlbPckUlin"))) ;
      n3829AlbPckUlin = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      AV27Med1 = CommonUtil.decimalVal( httpContext.GetPar( "Med1"), ".") ;
      AV28Med2 = CommonUtil.decimalVal( httpContext.GetPar( "Med2"), ".") ;
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

   public talbpkb_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public talbpkb_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talbpkb_impl.class ));
   }

   public talbpkb_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBPKB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBPKB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBPKB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBPKB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TALBPKB.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBPKB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBPKB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Numero Albaran Produccion", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBPKB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "", "", "", "", "", 1, edtAlbProCod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBPKB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBPKB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBPKB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBPKB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBPKB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBPKB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBPKB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBPKB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Ultima Linea Packing List", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBPKB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPckUlin_Internalname, GXutil.ltrim( localUtil.ntoc( A3829AlbPckUlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPckUlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3829AlbPckUlin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3829AlbPckUlin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPckUlin_Jsonclick, 0, "", "", "", "", "", 1, edtAlbPckUlin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBPKB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBPKB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBPKB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Volumen Total", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBPKB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPckVolT_Internalname, GXutil.ltrim( localUtil.ntoc( A10021AlbPckVolT, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPckVolT_Enabled!=0) ? localUtil.format( A10021AlbPckVolT, "ZZ9.99") : localUtil.format( A10021AlbPckVolT, "ZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPckVolT_Jsonclick, 0, "", "", "", "", "", 1, edtAlbPckVolT_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBPKB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol60( ) ;
      nGXsfl_60_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount507 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_507 = (short)(1) ;
            scanStartTB507( ) ;
            while ( RcdFound507 != 0 )
            {
               init_level_properties507( ) ;
               getByPrimaryKeyTB507( ) ;
               addRowTB507( ) ;
               scanNextTB507( ) ;
            }
            scanEndTB507( ) ;
            nBlankRcdCount507 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B3829AlbPckUlin = A3829AlbPckUlin ;
         n3829AlbPckUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
         B10021AlbPckVolT = A10021AlbPckVolT ;
         n10021AlbPckVolT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
         standaloneNotModalTB507( ) ;
         standaloneModalTB507( ) ;
         sMode507 = Gx_mode ;
         while ( nGXsfl_60_idx < nRC_GXsfl_60 )
         {
            bGXsfl_60_Refreshing = true ;
            readRowTB507( ) ;
            edtavnRcdDeleted_507_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_507_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_507_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_507_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtAlbPckLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKLIN_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPckLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtAlbPckCaj_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKCAJ_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPckCaj_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckCaj_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtAlbPckKn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKKN_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPckKn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckKn_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtAlbPckKb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKKB_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPckKb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckKb_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtAlbPckTar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKTAR_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPckTar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckTar_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtAlbPckUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKUNI_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPckUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckUni_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtAlbPckM1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKM1_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPckM1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckM1_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtAlbPckM2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKM2_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPckM2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckM2_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtAlbPckM3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKM3_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPckM3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckM3_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtAlbPckVol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKVOL_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPckVol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckVol_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            if ( ( nRcdExists_507 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalTB507( ) ;
            }
            sendRowTB507( ) ;
            bGXsfl_60_Refreshing = false ;
         }
         Gx_mode = sMode507 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A3829AlbPckUlin = B3829AlbPckUlin ;
         n3829AlbPckUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
         A10021AlbPckVolT = B10021AlbPckVolT ;
         n10021AlbPckVolT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount507 = (short)(5) ;
         nRcdExists_507 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartTB507( ) ;
            while ( RcdFound507 != 0 )
            {
               sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_60507( ) ;
               init_level_properties507( ) ;
               standaloneNotModalTB507( ) ;
               getByPrimaryKeyTB507( ) ;
               standaloneModalTB507( ) ;
               addRowTB507( ) ;
               scanNextTB507( ) ;
            }
            scanEndTB507( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode507 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_60507( ) ;
      initAllTB507( ) ;
      init_level_properties507( ) ;
      B3829AlbPckUlin = A3829AlbPckUlin ;
      n3829AlbPckUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
      B10021AlbPckVolT = A10021AlbPckVolT ;
      n10021AlbPckVolT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
      nRcdExists_507 = (short)(0) ;
      nIsMod_507 = (short)(0) ;
      nRcdDeleted_507 = (short)(0) ;
      nBlankRcdCount507 = (short)(nBlankRcdUsr507+nBlankRcdCount507) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount507 > 0 )
      {
         standaloneNotModalTB507( ) ;
         standaloneModalTB507( ) ;
         addRowTB507( ) ;
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
      A10021AlbPckVolT = B10021AlbPckVolT ;
      n10021AlbPckVolT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBPKB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBPKB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBPKB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBPKB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TALBPKB.htm");
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
      e11TB2 ();
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
            Z3829AlbPckUlin = (short)(localUtil.ctol( httpContext.cgiGet( "Z3829AlbPckUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O3829AlbPckUlin = (short)(localUtil.ctol( httpContext.cgiGet( "O3829AlbPckUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O10021AlbPckVolT = localUtil.ctond( httpContext.cgiGet( "O10021AlbPckVolT")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_60 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_60"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV26SumCaj = (byte)(localUtil.ctol( httpContext.cgiGet( "vSUMCAJ"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV27Med1 = localUtil.ctond( httpContext.cgiGet( "vMED1")) ;
            AV28Med2 = localUtil.ctond( httpContext.cgiGet( "vMED2")) ;
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
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A10021AlbPckVolT = localUtil.ctond( httpContext.cgiGet( edtAlbPckVolT_Internalname)) ;
            n10021AlbPckVolT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
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
                        e11TB2 ();
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
            initAllTB195( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_507_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_507_Enabled), 5, 0), !bGXsfl_60_Refreshing);
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
      disableAttributesTB195( ) ;
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

   public void confirm_TB0( )
   {
      beforeValidateTB195( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsTB195( ) ;
         }
         else
         {
            checkExtendedTableTB195( ) ;
            if ( AnyError == 0 )
            {
               zmTB195( 13) ;
               zmTB195( 14) ;
               zmTB195( 15) ;
               zmTB195( 16) ;
            }
            closeExtendedTableCursorsTB195( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode195 = Gx_mode ;
         confirm_TB507( ) ;
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
         confirmValuesTB0( ) ;
      }
   }

   public void confirm_TB507( )
   {
      s3829AlbPckUlin = O3829AlbPckUlin ;
      n3829AlbPckUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
      s10021AlbPckVolT = O10021AlbPckVolT ;
      n10021AlbPckVolT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRowTB507( ) ;
         if ( ( nRcdExists_507 != 0 ) || ( nIsMod_507 != 0 ) )
         {
            getKeyTB507( ) ;
            if ( ( nRcdExists_507 == 0 ) && ( nRcdDeleted_507 == 0 ) )
            {
               if ( RcdFound507 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateTB507( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableTB507( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsTB507( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O3829AlbPckUlin = A3829AlbPckUlin ;
                     n3829AlbPckUlin = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
                     O10021AlbPckVolT = A10021AlbPckVolT ;
                     n10021AlbPckVolT = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
                  }
               }
               else
               {
                  GXCCtl = "ALBPCKLIN_" + sGXsfl_60_idx ;
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
                     getByPrimaryKeyTB507( ) ;
                     loadTB507( ) ;
                     beforeValidateTB507( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsTB507( ) ;
                        O3829AlbPckUlin = A3829AlbPckUlin ;
                        n3829AlbPckUlin = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
                        O10021AlbPckVolT = A10021AlbPckVolT ;
                        n10021AlbPckVolT = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_507 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateTB507( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableTB507( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsTB507( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O3829AlbPckUlin = A3829AlbPckUlin ;
                           n3829AlbPckUlin = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
                           O10021AlbPckVolT = A10021AlbPckVolT ;
                           n10021AlbPckVolT = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_507 == 0 )
                  {
                     GXCCtl = "ALBPCKLIN_" + sGXsfl_60_idx ;
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
         httpContext.changePostValue( edtAlbPckM1_Internalname, GXutil.ltrim( localUtil.ntoc( A10022AlbPckM1, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPckM2_Internalname, GXutil.ltrim( localUtil.ntoc( A10023AlbPckM2, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPckM3_Internalname, GXutil.ltrim( localUtil.ntoc( A10024AlbPckM3, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPckVol_Internalname, GXutil.ltrim( localUtil.ntoc( A10025AlbPckVol, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3621AlbPckLin_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3621AlbPckLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3625AlbPckTar_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3625AlbPckTar, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10022AlbPckM1_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z10022AlbPckM1, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10023AlbPckM2_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z10023AlbPckM2, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3622AlbPckCaj_"+sGXsfl_60_idx, GXutil.rtrim( Z3622AlbPckCaj)) ;
         httpContext.changePostValue( "ZT_"+"Z3623AlbPckKn_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3623AlbPckKn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3624AlbPckKb_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3624AlbPckKb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3626AlbPckUni_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3626AlbPckUni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10024AlbPckM3_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z10024AlbPckM3, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T10025AlbPckVol_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O10025AlbPckVol, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_507_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_507, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_507_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_507, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_507_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_507, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_507 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_507_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_507_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKLIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKCAJ_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckCaj_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKKN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckKn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKKB_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckKb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKTAR_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckTar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKUNI_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKM1_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckM1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKM2_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckM2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKM3_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckM3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKVOL_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckVol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O3829AlbPckUlin = s3829AlbPckUlin ;
      n3829AlbPckUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
      O10021AlbPckVolT = s10021AlbPckVolT ;
      n10021AlbPckVolT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionTB0( )
   {
   }

   public void e11TB2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV18LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      talbpkb_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18LitFe", AV18LitFe);
      GXt_char1 = AV16Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      talbpkb_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit0", AV16Lit0);
      GXt_char1 = AV22Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1017_", ""), (byte)(99), GXv_char2) ;
      talbpkb_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit3", AV22Lit3);
      GXt_char1 = AV23Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1120_", ""), (byte)(99), GXv_char2) ;
      talbpkb_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit4", AV23Lit4);
      AV24Lit5 = httpContext.getMessage( "Materia Packing", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit5", AV24Lit5);
      AV19Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Station", AV19Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV20EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char2, GXv_char3, GXv_char4) ;
      talbpkb_impl.this.A396EmprCod = GXv_char2[0] ;
      talbpkb_impl.this.AV20EmprNom = GXv_char3[0] ;
      talbpkb_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprNom", AV20EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      AV26SumCaj = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26SumCaj", GXutil.str( AV26SumCaj, 1, 0));
      GXv_int5[0] = AV26SumCaj ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SUMCAJ", ""), GXv_int5) ;
      talbpkb_impl.this.AV26SumCaj = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26SumCaj", GXutil.str( AV26SumCaj, 1, 0));
      GXt_int6 = AV29ContVal ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "MED1", "") ;
      GXv_int7[0] = GXt_int6 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7) ;
      talbpkb_impl.this.A396EmprCod = GXv_char4[0] ;
      talbpkb_impl.this.GXt_int6 = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV29ContVal = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29ContVal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29ContVal), 8, 0));
      AV27Med1 = DecimalUtil.doubleToDec(AV29ContVal/ (double) (100)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Med1", GXutil.ltrimstr( AV27Med1, 6, 2));
      GXt_int6 = AV29ContVal ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "MED2", "") ;
      GXv_int7[0] = GXt_int6 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7) ;
      talbpkb_impl.this.A396EmprCod = GXv_char4[0] ;
      talbpkb_impl.this.GXt_int6 = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV29ContVal = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29ContVal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29ContVal), 8, 0));
      AV28Med2 = DecimalUtil.doubleToDec(AV29ContVal/ (double) (100)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Med2", GXutil.ltrimstr( AV28Med2, 6, 2));
   }

   public void zmTB195( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3829AlbPckUlin = T00TB5_A3829AlbPckUlin[0] ;
         }
         else
         {
            Z3829AlbPckUlin = A3829AlbPckUlin ;
         }
      }
      if ( GX_JID == -12 )
      {
         Z3829AlbPckUlin = A3829AlbPckUlin ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z30AlbProCod = A30AlbProCod ;
         Z407EmprNom = A407EmprNom ;
         Z10021AlbPckVolT = A10021AlbPckVolT ;
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
      /* Using cursor T00TB6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00TB6_A407EmprNom[0] ;
      n407EmprNom = T00TB6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T00TB8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(6);
      /* Using cursor T00TB7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      pr_default.close(5);
      /* Using cursor T00TB10 */
      pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A10021AlbPckVolT = T00TB10_A10021AlbPckVolT[0] ;
         n10021AlbPckVolT = T00TB10_n10021AlbPckVolT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
      }
      else
      {
         A10021AlbPckVolT = DecimalUtil.doubleToDec(0) ;
         n10021AlbPckVolT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
      }
      O10021AlbPckVolT = A10021AlbPckVolT ;
      n10021AlbPckVolT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
      pr_default.close(7);
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

   public void loadTB195( )
   {
      /* Using cursor T00TB12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound195 = (short)(1) ;
         A3829AlbPckUlin = T00TB12_A3829AlbPckUlin[0] ;
         n3829AlbPckUlin = T00TB12_n3829AlbPckUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
         A407EmprNom = T00TB12_A407EmprNom[0] ;
         n407EmprNom = T00TB12_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10021AlbPckVolT = T00TB12_A10021AlbPckVolT[0] ;
         n10021AlbPckVolT = T00TB12_n10021AlbPckVolT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
         zmTB195( -12) ;
      }
      pr_default.close(8);
      onLoadActionsTB195( ) ;
   }

   public void onLoadActionsTB195( )
   {
      O10021AlbPckVolT = A10021AlbPckVolT ;
      n10021AlbPckVolT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
   }

   public void checkExtendedTableTB195( )
   {
      nIsDirty_195 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursorsTB195( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyTB195( )
   {
      /* Using cursor T00TB13 */
      pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound195 = (short)(1) ;
      }
      else
      {
         RcdFound195 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00TB5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T00TB5_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00TB5_A129BarCod[0] == A129BarCod ) && ( T00TB5_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00TB5_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00TB5_A30AlbProCod[0] == A30AlbProCod ) )
      {
         zmTB195( 12) ;
         RcdFound195 = (short)(1) ;
         A3829AlbPckUlin = T00TB5_A3829AlbPckUlin[0] ;
         n3829AlbPckUlin = T00TB5_n3829AlbPckUlin[0] ;
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
         loadTB195( ) ;
         if ( AnyError == 1 )
         {
            RcdFound195 = (short)(0) ;
            initializeNonKeyTB195( ) ;
         }
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound195 = (short)(0) ;
         initializeNonKeyTB195( ) ;
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
      getKeyTB195( ) ;
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
      /* Using cursor T00TB14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T00TB14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00TB14_A30AlbProCod[0] == A30AlbProCod ) && ( T00TB14_A129BarCod[0] == A129BarCod ) && ( T00TB14_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00TB14_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T00TB14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00TB14_A30AlbProCod[0] == A30AlbProCod ) && ( T00TB14_A129BarCod[0] == A129BarCod ) && ( T00TB14_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00TB14_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound195 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound195 = (short)(0) ;
      /* Using cursor T00TB15 */
      pr_default.execute(11, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T00TB15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00TB15_A30AlbProCod[0] == A30AlbProCod ) && ( T00TB15_A129BarCod[0] == A129BarCod ) && ( T00TB15_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00TB15_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T00TB15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00TB15_A30AlbProCod[0] == A30AlbProCod ) && ( T00TB15_A129BarCod[0] == A129BarCod ) && ( T00TB15_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00TB15_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound195 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyTB195( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A3829AlbPckUlin = O3829AlbPckUlin ;
         n3829AlbPckUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
         A10021AlbPckVolT = O10021AlbPckVolT ;
         n10021AlbPckVolT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
         insertTB195( ) ;
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
               A10021AlbPckVolT = O10021AlbPckVolT ;
               n10021AlbPckVolT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A3829AlbPckUlin = O3829AlbPckUlin ;
               n3829AlbPckUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
               A10021AlbPckVolT = O10021AlbPckVolT ;
               n10021AlbPckVolT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
               updateTB195( ) ;
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
               A10021AlbPckVolT = O10021AlbPckVolT ;
               n10021AlbPckVolT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
               insertTB195( ) ;
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
                  A10021AlbPckVolT = O10021AlbPckVolT ;
                  n10021AlbPckVolT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
                  insertTB195( ) ;
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
         A10021AlbPckVolT = O10021AlbPckVolT ;
         n10021AlbPckVolT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
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
      getKeyTB195( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "talbpkb");
   }

   public void insert_check( )
   {
      confirm_TB0( ) ;
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
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartTB195( ) ;
      if ( RcdFound195 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndTB195( ) ;
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
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartTB195( ) ;
      if ( RcdFound195 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound195 != 0 )
         {
            scanNextTB195( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndTB195( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyTB195( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00TB4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z3829AlbPckUlin != T00TB4_A3829AlbPckUlin[0] ) )
         {
            if ( Z3829AlbPckUlin != T00TB4_A3829AlbPckUlin[0] )
            {
               GXutil.writeLogln("talbpkb:[seudo value changed for attri]"+"AlbPckUlin");
               GXutil.writeLogRaw("Old: ",Z3829AlbPckUlin);
               GXutil.writeLogRaw("Current: ",T00TB4_A3829AlbPckUlin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBBAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertTB195( )
   {
      beforeValidateTB195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableTB195( ) ;
      }
      if ( AnyError == 0 )
      {
         zmTB195( 0) ;
         checkOptimisticConcurrencyTB195( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmTB195( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertTB195( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00TB16 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n3829AlbPckUlin), Short.valueOf(A3829AlbPckUlin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
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
                        processLevelTB195( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionTB0( ) ;
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
            loadTB195( ) ;
         }
         endLevelTB195( ) ;
      }
      closeExtendedTableCursorsTB195( ) ;
   }

   public void updateTB195( )
   {
      beforeValidateTB195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableTB195( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyTB195( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmTB195( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateTB195( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00TB17 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n3829AlbPckUlin), Short.valueOf(A3829AlbPckUlin), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateTB195( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelTB195( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionTB0( ) ;
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
         endLevelTB195( ) ;
      }
      closeExtendedTableCursorsTB195( ) ;
   }

   public void deferredUpdateTB195( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateTB195( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyTB195( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsTB195( ) ;
         afterConfirmTB195( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteTB195( ) ;
            if ( AnyError == 0 )
            {
               A3829AlbPckUlin = O3829AlbPckUlin ;
               n3829AlbPckUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
               A10021AlbPckVolT = O10021AlbPckVolT ;
               n10021AlbPckVolT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
               scanStartTB507( ) ;
               while ( RcdFound507 != 0 )
               {
                  getByPrimaryKeyTB507( ) ;
                  deleteTB507( ) ;
                  scanNextTB507( ) ;
                  O3829AlbPckUlin = A3829AlbPckUlin ;
                  n3829AlbPckUlin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
                  O10021AlbPckVolT = A10021AlbPckVolT ;
                  n10021AlbPckVolT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
               }
               scanEndTB507( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00TB18 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
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
                           initAllTB195( ) ;
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
                        resetCaptionTB0( ) ;
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
      endLevelTB195( ) ;
      Gx_mode = sMode195 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsTB195( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00TB19 */
         pr_default.execute(15, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "METCAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T00TB20 */
         pr_default.execute(16, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EDIETI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T00TB21 */
         pr_default.execute(17, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREPg", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T00TB22 */
         pr_default.execute(18, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T00TB23 */
         pr_default.execute(19, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBEST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T00TB24 */
         pr_default.execute(20, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALBTRA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T00TB25 */
         pr_default.execute(21, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T00TB26 */
         pr_default.execute(22, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T00TB27 */
         pr_default.execute(23, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T00TB28 */
         pr_default.execute(24, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
      }
   }

   public void processNestedLevelTB507( )
   {
      s3829AlbPckUlin = O3829AlbPckUlin ;
      n3829AlbPckUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
      s10021AlbPckVolT = O10021AlbPckVolT ;
      n10021AlbPckVolT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRowTB507( ) ;
         if ( ( nRcdExists_507 != 0 ) || ( nIsMod_507 != 0 ) )
         {
            standaloneNotModalTB507( ) ;
            getKeyTB507( ) ;
            if ( ( nRcdExists_507 == 0 ) && ( nRcdDeleted_507 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertTB507( ) ;
            }
            else
            {
               if ( RcdFound507 != 0 )
               {
                  if ( ( nRcdDeleted_507 != 0 ) && ( nRcdExists_507 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteTB507( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_507 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateTB507( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_507 == 0 )
                  {
                     GXCCtl = "ALBPCKLIN_" + sGXsfl_60_idx ;
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
            O10021AlbPckVolT = A10021AlbPckVolT ;
            n10021AlbPckVolT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
         }
         httpContext.changePostValue( edtavnRcdDeleted_507_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_507, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPckLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3621AlbPckLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPckCaj_Internalname, GXutil.rtrim( A3622AlbPckCaj)) ;
         httpContext.changePostValue( edtAlbPckKn_Internalname, GXutil.ltrim( localUtil.ntoc( A3623AlbPckKn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPckKb_Internalname, GXutil.ltrim( localUtil.ntoc( A3624AlbPckKb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPckTar_Internalname, GXutil.ltrim( localUtil.ntoc( A3625AlbPckTar, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPckUni_Internalname, GXutil.ltrim( localUtil.ntoc( A3626AlbPckUni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPckM1_Internalname, GXutil.ltrim( localUtil.ntoc( A10022AlbPckM1, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPckM2_Internalname, GXutil.ltrim( localUtil.ntoc( A10023AlbPckM2, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPckM3_Internalname, GXutil.ltrim( localUtil.ntoc( A10024AlbPckM3, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPckVol_Internalname, GXutil.ltrim( localUtil.ntoc( A10025AlbPckVol, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3621AlbPckLin_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3621AlbPckLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3625AlbPckTar_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3625AlbPckTar, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10022AlbPckM1_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z10022AlbPckM1, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10023AlbPckM2_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z10023AlbPckM2, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3622AlbPckCaj_"+sGXsfl_60_idx, GXutil.rtrim( Z3622AlbPckCaj)) ;
         httpContext.changePostValue( "ZT_"+"Z3623AlbPckKn_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3623AlbPckKn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3624AlbPckKb_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3624AlbPckKb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3626AlbPckUni_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3626AlbPckUni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10024AlbPckM3_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z10024AlbPckM3, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T10025AlbPckVol_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O10025AlbPckVol, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_507_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_507, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_507_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_507, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_507_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_507, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_507 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_507_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_507_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKLIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKCAJ_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckCaj_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKKN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckKn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKKB_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckKb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKTAR_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckTar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKUNI_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKM1_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckM1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKM2_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckM2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKM3_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckM3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCKVOL_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckVol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllTB507( ) ;
      if ( AnyError != 0 )
      {
         O3829AlbPckUlin = s3829AlbPckUlin ;
         n3829AlbPckUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
         O10021AlbPckVolT = s10021AlbPckVolT ;
         n10021AlbPckVolT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
      }
      nRcdExists_507 = (short)(0) ;
      nIsMod_507 = (short)(0) ;
      nRcdDeleted_507 = (short)(0) ;
   }

   public void processLevelTB195( )
   {
      /* Save parent mode. */
      sMode195 = Gx_mode ;
      processNestedLevelTB507( ) ;
      if ( AnyError != 0 )
      {
         O3829AlbPckUlin = s3829AlbPckUlin ;
         n3829AlbPckUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
         O10021AlbPckVolT = s10021AlbPckVolT ;
         n10021AlbPckVolT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode195 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T00TB29 */
      pr_default.execute(25, new Object[] {Boolean.valueOf(n3829AlbPckUlin), Short.valueOf(A3829AlbPckUlin), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
   }

   public void endLevelTB195( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeCompleteTB195( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "talbpkb");
         if ( AnyError == 0 )
         {
            confirmValuesTB0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "talbpkb");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartTB195( )
   {
      /* Scan By routine */
      /* Using cursor T00TB30 */
      pr_default.execute(26, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound195 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound195 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextTB195( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound195 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound195 = (short)(1) ;
      }
   }

   public void scanEndTB195( )
   {
      pr_default.close(26);
   }

   public void afterConfirmTB195( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertTB195( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateTB195( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteTB195( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteTB195( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateTB195( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesTB195( )
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
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtAlbPckVolT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckVolT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckVolT_Enabled), 5, 0), true);
   }

   public void zmTB507( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3625AlbPckTar = T00TB3_A3625AlbPckTar[0] ;
            Z10022AlbPckM1 = T00TB3_A10022AlbPckM1[0] ;
            Z10023AlbPckM2 = T00TB3_A10023AlbPckM2[0] ;
            Z3622AlbPckCaj = T00TB3_A3622AlbPckCaj[0] ;
            Z3623AlbPckKn = T00TB3_A3623AlbPckKn[0] ;
            Z3624AlbPckKb = T00TB3_A3624AlbPckKb[0] ;
            Z3626AlbPckUni = T00TB3_A3626AlbPckUni[0] ;
            Z10024AlbPckM3 = T00TB3_A10024AlbPckM3[0] ;
         }
         else
         {
            Z3625AlbPckTar = A3625AlbPckTar ;
            Z10022AlbPckM1 = A10022AlbPckM1 ;
            Z10023AlbPckM2 = A10023AlbPckM2 ;
            Z3622AlbPckCaj = A3622AlbPckCaj ;
            Z3623AlbPckKn = A3623AlbPckKn ;
            Z3624AlbPckKb = A3624AlbPckKb ;
            Z3626AlbPckUni = A3626AlbPckUni ;
            Z10024AlbPckM3 = A10024AlbPckM3 ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z3621AlbPckLin = A3621AlbPckLin ;
         Z3625AlbPckTar = A3625AlbPckTar ;
         Z10022AlbPckM1 = A10022AlbPckM1 ;
         Z10023AlbPckM2 = A10023AlbPckM2 ;
         Z3622AlbPckCaj = A3622AlbPckCaj ;
         Z3623AlbPckKn = A3623AlbPckKn ;
         Z3624AlbPckKb = A3624AlbPckKb ;
         Z3626AlbPckUni = A3626AlbPckUni ;
         Z10024AlbPckM3 = A10024AlbPckM3 ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
      }
   }

   public void standaloneNotModalTB507( )
   {
      edtAlbPckUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckUlin_Enabled), 5, 0), true);
      edtAlbPckUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckUlin_Enabled), 5, 0), true);
   }

   public void standaloneModalTB507( )
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
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A10022AlbPckM1)==0) && ( Gx_BScreen == 0 ) )
      {
         A10022AlbPckM1 = AV27Med1 ;
         n10022AlbPckM1 = false ;
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A10023AlbPckM2)==0) && ( Gx_BScreen == 0 ) )
      {
         A10023AlbPckM2 = AV28Med2 ;
         n10023AlbPckM2 = false ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbPckLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbPckLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtAlbPckLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbPckLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
   }

   public void loadTB507( )
   {
      /* Using cursor T00TB31 */
      pr_default.execute(27, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A3621AlbPckLin)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound507 = (short)(1) ;
         A3625AlbPckTar = T00TB31_A3625AlbPckTar[0] ;
         n3625AlbPckTar = T00TB31_n3625AlbPckTar[0] ;
         A10022AlbPckM1 = T00TB31_A10022AlbPckM1[0] ;
         n10022AlbPckM1 = T00TB31_n10022AlbPckM1[0] ;
         A10023AlbPckM2 = T00TB31_A10023AlbPckM2[0] ;
         n10023AlbPckM2 = T00TB31_n10023AlbPckM2[0] ;
         A3622AlbPckCaj = T00TB31_A3622AlbPckCaj[0] ;
         n3622AlbPckCaj = T00TB31_n3622AlbPckCaj[0] ;
         A3623AlbPckKn = T00TB31_A3623AlbPckKn[0] ;
         n3623AlbPckKn = T00TB31_n3623AlbPckKn[0] ;
         A3624AlbPckKb = T00TB31_A3624AlbPckKb[0] ;
         n3624AlbPckKb = T00TB31_n3624AlbPckKb[0] ;
         A3626AlbPckUni = T00TB31_A3626AlbPckUni[0] ;
         n3626AlbPckUni = T00TB31_n3626AlbPckUni[0] ;
         A10024AlbPckM3 = T00TB31_A10024AlbPckM3[0] ;
         n10024AlbPckM3 = T00TB31_n10024AlbPckM3[0] ;
         zmTB507( -17) ;
      }
      pr_default.close(27);
      onLoadActionsTB507( ) ;
   }

   public void onLoadActionsTB507( )
   {
      A3625AlbPckTar = A3624AlbPckKb.subtract(A3623AlbPckKn) ;
      n3625AlbPckTar = false ;
      A10025AlbPckVol = (A10022AlbPckM1.multiply(A10023AlbPckM2).multiply(A10024AlbPckM3)) ;
      O10025AlbPckVol = A10025AlbPckVol ;
      if ( isIns( )  )
      {
         A10021AlbPckVolT = O10021AlbPckVolT.add(A10025AlbPckVol) ;
         n10021AlbPckVolT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A10021AlbPckVolT = O10021AlbPckVolT.add(A10025AlbPckVol).subtract(O10025AlbPckVol) ;
            n10021AlbPckVolT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A10021AlbPckVolT = O10021AlbPckVolT.subtract(O10025AlbPckVol) ;
               n10021AlbPckVolT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
            }
         }
      }
   }

   public void checkExtendedTableTB507( )
   {
      nIsDirty_507 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalTB507( ) ;
      if ( true /* Level */ && true /* After */ && (GXutil.strcmp("", A3622AlbPckCaj)==0) && ( AV26SumCaj == 1 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A30AlbProCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_char2[0] = A3622AlbPckCaj ;
         new app.pultpck(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int7, GXv_int5, GXv_char3, GXv_char2) ;
         talbpkb_impl.this.A396EmprCod = GXv_char4[0] ;
         talbpkb_impl.this.A30AlbProCod = GXv_int8[0] ;
         talbpkb_impl.this.A129BarCod = GXv_int7[0] ;
         talbpkb_impl.this.A132BarCodReo = GXv_int5[0] ;
         talbpkb_impl.this.A130BarCodPar = GXv_char3[0] ;
         talbpkb_impl.this.A3622AlbPckCaj = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      nIsDirty_507 = (short)(1) ;
      A3625AlbPckTar = A3624AlbPckKb.subtract(A3623AlbPckKn) ;
      n3625AlbPckTar = false ;
      nIsDirty_507 = (short)(1) ;
      A10025AlbPckVol = (A10022AlbPckM1.multiply(A10023AlbPckM2).multiply(A10024AlbPckM3)) ;
      if ( isIns( )  )
      {
         nIsDirty_507 = (short)(1) ;
         A10021AlbPckVolT = O10021AlbPckVolT.add(A10025AlbPckVol) ;
         n10021AlbPckVolT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_507 = (short)(1) ;
            A10021AlbPckVolT = O10021AlbPckVolT.add(A10025AlbPckVol).subtract(O10025AlbPckVol) ;
            n10021AlbPckVolT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_507 = (short)(1) ;
               A10021AlbPckVolT = O10021AlbPckVolT.subtract(O10025AlbPckVol) ;
               n10021AlbPckVolT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
            }
         }
      }
   }

   public void closeExtendedTableCursorsTB507( )
   {
   }

   public void enableDisableTB507( )
   {
   }

   public void getKeyTB507( )
   {
      /* Using cursor T00TB32 */
      pr_default.execute(28, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A3621AlbPckLin)});
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound507 = (short)(1) ;
      }
      else
      {
         RcdFound507 = (short)(0) ;
      }
      pr_default.close(28);
   }

   public void getByPrimaryKeyTB507( )
   {
      /* Using cursor T00TB3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A3621AlbPckLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T00TB3_A30AlbProCod[0] == A30AlbProCod ) && ( GXutil.strcmp(T00TB3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00TB3_A129BarCod[0] == A129BarCod ) && ( T00TB3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00TB3_A130BarCodPar[0], A130BarCodPar) == 0 ) )
      {
         zmTB507( 17) ;
         RcdFound507 = (short)(1) ;
         initializeNonKeyTB507( ) ;
         A3621AlbPckLin = T00TB3_A3621AlbPckLin[0] ;
         A3625AlbPckTar = T00TB3_A3625AlbPckTar[0] ;
         n3625AlbPckTar = T00TB3_n3625AlbPckTar[0] ;
         A10022AlbPckM1 = T00TB3_A10022AlbPckM1[0] ;
         n10022AlbPckM1 = T00TB3_n10022AlbPckM1[0] ;
         A10023AlbPckM2 = T00TB3_A10023AlbPckM2[0] ;
         n10023AlbPckM2 = T00TB3_n10023AlbPckM2[0] ;
         A3622AlbPckCaj = T00TB3_A3622AlbPckCaj[0] ;
         n3622AlbPckCaj = T00TB3_n3622AlbPckCaj[0] ;
         A3623AlbPckKn = T00TB3_A3623AlbPckKn[0] ;
         n3623AlbPckKn = T00TB3_n3623AlbPckKn[0] ;
         A3624AlbPckKb = T00TB3_A3624AlbPckKb[0] ;
         n3624AlbPckKb = T00TB3_n3624AlbPckKb[0] ;
         A3626AlbPckUni = T00TB3_A3626AlbPckUni[0] ;
         n3626AlbPckUni = T00TB3_n3626AlbPckUni[0] ;
         A10024AlbPckM3 = T00TB3_A10024AlbPckM3[0] ;
         n10024AlbPckM3 = T00TB3_n10024AlbPckM3[0] ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z3621AlbPckLin = A3621AlbPckLin ;
         sMode507 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalTB507( ) ;
         loadTB507( ) ;
         Gx_mode = sMode507 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound507 = (short)(0) ;
         initializeNonKeyTB507( ) ;
         sMode507 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalTB507( ) ;
         Gx_mode = sMode507 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesTB507( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyTB507( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00TB2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A3621AlbPckLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBPCK"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z3625AlbPckTar, T00TB2_A3625AlbPckTar[0]) != 0 ) || ( DecimalUtil.compareTo(Z10022AlbPckM1, T00TB2_A10022AlbPckM1[0]) != 0 ) || ( DecimalUtil.compareTo(Z10023AlbPckM2, T00TB2_A10023AlbPckM2[0]) != 0 ) || ( GXutil.strcmp(Z3622AlbPckCaj, T00TB2_A3622AlbPckCaj[0]) != 0 ) || ( DecimalUtil.compareTo(Z3623AlbPckKn, T00TB2_A3623AlbPckKn[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z3624AlbPckKb, T00TB2_A3624AlbPckKb[0]) != 0 ) || ( Z3626AlbPckUni != T00TB2_A3626AlbPckUni[0] ) || ( DecimalUtil.compareTo(Z10024AlbPckM3, T00TB2_A10024AlbPckM3[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z3625AlbPckTar, T00TB2_A3625AlbPckTar[0]) != 0 )
            {
               GXutil.writeLogln("talbpkb:[seudo value changed for attri]"+"AlbPckTar");
               GXutil.writeLogRaw("Old: ",Z3625AlbPckTar);
               GXutil.writeLogRaw("Current: ",T00TB2_A3625AlbPckTar[0]);
            }
            if ( DecimalUtil.compareTo(Z10022AlbPckM1, T00TB2_A10022AlbPckM1[0]) != 0 )
            {
               GXutil.writeLogln("talbpkb:[seudo value changed for attri]"+"AlbPckM1");
               GXutil.writeLogRaw("Old: ",Z10022AlbPckM1);
               GXutil.writeLogRaw("Current: ",T00TB2_A10022AlbPckM1[0]);
            }
            if ( DecimalUtil.compareTo(Z10023AlbPckM2, T00TB2_A10023AlbPckM2[0]) != 0 )
            {
               GXutil.writeLogln("talbpkb:[seudo value changed for attri]"+"AlbPckM2");
               GXutil.writeLogRaw("Old: ",Z10023AlbPckM2);
               GXutil.writeLogRaw("Current: ",T00TB2_A10023AlbPckM2[0]);
            }
            if ( GXutil.strcmp(Z3622AlbPckCaj, T00TB2_A3622AlbPckCaj[0]) != 0 )
            {
               GXutil.writeLogln("talbpkb:[seudo value changed for attri]"+"AlbPckCaj");
               GXutil.writeLogRaw("Old: ",Z3622AlbPckCaj);
               GXutil.writeLogRaw("Current: ",T00TB2_A3622AlbPckCaj[0]);
            }
            if ( DecimalUtil.compareTo(Z3623AlbPckKn, T00TB2_A3623AlbPckKn[0]) != 0 )
            {
               GXutil.writeLogln("talbpkb:[seudo value changed for attri]"+"AlbPckKn");
               GXutil.writeLogRaw("Old: ",Z3623AlbPckKn);
               GXutil.writeLogRaw("Current: ",T00TB2_A3623AlbPckKn[0]);
            }
            if ( DecimalUtil.compareTo(Z3624AlbPckKb, T00TB2_A3624AlbPckKb[0]) != 0 )
            {
               GXutil.writeLogln("talbpkb:[seudo value changed for attri]"+"AlbPckKb");
               GXutil.writeLogRaw("Old: ",Z3624AlbPckKb);
               GXutil.writeLogRaw("Current: ",T00TB2_A3624AlbPckKb[0]);
            }
            if ( Z3626AlbPckUni != T00TB2_A3626AlbPckUni[0] )
            {
               GXutil.writeLogln("talbpkb:[seudo value changed for attri]"+"AlbPckUni");
               GXutil.writeLogRaw("Old: ",Z3626AlbPckUni);
               GXutil.writeLogRaw("Current: ",T00TB2_A3626AlbPckUni[0]);
            }
            if ( DecimalUtil.compareTo(Z10024AlbPckM3, T00TB2_A10024AlbPckM3[0]) != 0 )
            {
               GXutil.writeLogln("talbpkb:[seudo value changed for attri]"+"AlbPckM3");
               GXutil.writeLogRaw("Old: ",Z10024AlbPckM3);
               GXutil.writeLogRaw("Current: ",T00TB2_A10024AlbPckM3[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBPCK"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertTB507( )
   {
      beforeValidateTB507( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableTB507( ) ;
      }
      if ( AnyError == 0 )
      {
         zmTB507( 0) ;
         checkOptimisticConcurrencyTB507( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmTB507( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertTB507( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00TB33 */
                  pr_default.execute(29, new Object[] {Long.valueOf(A30AlbProCod), Short.valueOf(A3621AlbPckLin), Boolean.valueOf(n3625AlbPckTar), A3625AlbPckTar, Boolean.valueOf(n10022AlbPckM1), A10022AlbPckM1, Boolean.valueOf(n10023AlbPckM2), A10023AlbPckM2, Boolean.valueOf(n3622AlbPckCaj), A3622AlbPckCaj, Boolean.valueOf(n3623AlbPckKn), A3623AlbPckKn, Boolean.valueOf(n3624AlbPckKb), A3624AlbPckKb, Boolean.valueOf(n3626AlbPckUni), Short.valueOf(A3626AlbPckUni), Boolean.valueOf(n10024AlbPckM3), A10024AlbPckM3, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBPCK");
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
            loadTB507( ) ;
         }
         endLevelTB507( ) ;
      }
      closeExtendedTableCursorsTB507( ) ;
   }

   public void updateTB507( )
   {
      beforeValidateTB507( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableTB507( ) ;
      }
      if ( ( nIsMod_507 != 0 ) || ( nIsDirty_507 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyTB507( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmTB507( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateTB507( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00TB34 */
                     pr_default.execute(30, new Object[] {Boolean.valueOf(n3625AlbPckTar), A3625AlbPckTar, Boolean.valueOf(n10022AlbPckM1), A10022AlbPckM1, Boolean.valueOf(n10023AlbPckM2), A10023AlbPckM2, Boolean.valueOf(n3622AlbPckCaj), A3622AlbPckCaj, Boolean.valueOf(n3623AlbPckKn), A3623AlbPckKn, Boolean.valueOf(n3624AlbPckKb), A3624AlbPckKb, Boolean.valueOf(n3626AlbPckUni), Short.valueOf(A3626AlbPckUni), Boolean.valueOf(n10024AlbPckM3), A10024AlbPckM3, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A3621AlbPckLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBPCK");
                     if ( (pr_default.getStatus(30) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBPCK"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateTB507( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyTB507( ) ;
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
            endLevelTB507( ) ;
         }
      }
      closeExtendedTableCursorsTB507( ) ;
   }

   public void deferredUpdateTB507( )
   {
   }

   public void deleteTB507( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateTB507( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyTB507( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsTB507( ) ;
         afterConfirmTB507( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteTB507( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00TB35 */
               pr_default.execute(31, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A3621AlbPckLin)});
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
      endLevelTB507( ) ;
      Gx_mode = sMode507 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsTB507( )
   {
      standaloneModalTB507( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A10025AlbPckVol = (A10022AlbPckM1.multiply(A10023AlbPckM2).multiply(A10024AlbPckM3)) ;
         if ( isIns( )  )
         {
            A10021AlbPckVolT = O10021AlbPckVolT.add(A10025AlbPckVol) ;
            n10021AlbPckVolT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A10021AlbPckVolT = O10021AlbPckVolT.add(A10025AlbPckVol).subtract(O10025AlbPckVol) ;
               n10021AlbPckVolT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A10021AlbPckVolT = O10021AlbPckVolT.subtract(O10025AlbPckVol) ;
                  n10021AlbPckVolT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
               }
            }
         }
      }
   }

   public void endLevelTB507( )
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

   public void scanStartTB507( )
   {
      /* Scan By routine */
      /* Using cursor T00TB36 */
      pr_default.execute(32, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound507 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound507 = (short)(1) ;
         A3621AlbPckLin = T00TB36_A3621AlbPckLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextTB507( )
   {
      /* Scan next routine */
      pr_default.readNext(32);
      RcdFound507 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound507 = (short)(1) ;
         A3621AlbPckLin = T00TB36_A3621AlbPckLin[0] ;
      }
   }

   public void scanEndTB507( )
   {
      pr_default.close(32);
   }

   public void afterConfirmTB507( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertTB507( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateTB507( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteTB507( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteTB507( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateTB507( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesTB507( )
   {
      edtAlbPckLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtAlbPckCaj_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckCaj_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckCaj_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtAlbPckKn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckKn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckKn_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtAlbPckKb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckKb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckKb_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtAlbPckTar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckTar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckTar_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtAlbPckUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckUni_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtAlbPckM1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckM1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckM1_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtAlbPckM2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckM2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckM2_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtAlbPckM3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckM3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckM3_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtAlbPckVol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckVol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckVol_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void send_integrity_lvl_hashesTB507( )
   {
   }

   public void send_integrity_lvl_hashesTB195( )
   {
   }

   public void subsflControlProps_60507( )
   {
      edtavnRcdDeleted_507_Internalname = "vNRCDDELETED_507_"+sGXsfl_60_idx ;
      edtAlbPckLin_Internalname = "ALBPCKLIN_"+sGXsfl_60_idx ;
      edtAlbPckCaj_Internalname = "ALBPCKCAJ_"+sGXsfl_60_idx ;
      edtAlbPckKn_Internalname = "ALBPCKKN_"+sGXsfl_60_idx ;
      edtAlbPckKb_Internalname = "ALBPCKKB_"+sGXsfl_60_idx ;
      edtAlbPckTar_Internalname = "ALBPCKTAR_"+sGXsfl_60_idx ;
      edtAlbPckUni_Internalname = "ALBPCKUNI_"+sGXsfl_60_idx ;
      edtAlbPckM1_Internalname = "ALBPCKM1_"+sGXsfl_60_idx ;
      edtAlbPckM2_Internalname = "ALBPCKM2_"+sGXsfl_60_idx ;
      edtAlbPckM3_Internalname = "ALBPCKM3_"+sGXsfl_60_idx ;
      edtAlbPckVol_Internalname = "ALBPCKVOL_"+sGXsfl_60_idx ;
   }

   public void subsflControlProps_fel_60507( )
   {
      edtavnRcdDeleted_507_Internalname = "vNRCDDELETED_507_"+sGXsfl_60_fel_idx ;
      edtAlbPckLin_Internalname = "ALBPCKLIN_"+sGXsfl_60_fel_idx ;
      edtAlbPckCaj_Internalname = "ALBPCKCAJ_"+sGXsfl_60_fel_idx ;
      edtAlbPckKn_Internalname = "ALBPCKKN_"+sGXsfl_60_fel_idx ;
      edtAlbPckKb_Internalname = "ALBPCKKB_"+sGXsfl_60_fel_idx ;
      edtAlbPckTar_Internalname = "ALBPCKTAR_"+sGXsfl_60_fel_idx ;
      edtAlbPckUni_Internalname = "ALBPCKUNI_"+sGXsfl_60_fel_idx ;
      edtAlbPckM1_Internalname = "ALBPCKM1_"+sGXsfl_60_fel_idx ;
      edtAlbPckM2_Internalname = "ALBPCKM2_"+sGXsfl_60_fel_idx ;
      edtAlbPckM3_Internalname = "ALBPCKM3_"+sGXsfl_60_fel_idx ;
      edtAlbPckVol_Internalname = "ALBPCKVOL_"+sGXsfl_60_fel_idx ;
   }

   public void addRowTB507( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60507( ) ;
      sendRowTB507( ) ;
   }

   public void sendRowTB507( )
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
         if ( ((int)((nGXsfl_60_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_507_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_507_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_507, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_507_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_507), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_507), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_507_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_507_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_507_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPckLin_Internalname,GXutil.ltrim( localUtil.ntoc( A3621AlbPckLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3621AlbPckLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPckLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPckLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_507_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPckCaj_Internalname,GXutil.rtrim( A3622AlbPckCaj),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPckCaj_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPckCaj_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_507_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPckKn_Internalname,GXutil.ltrim( localUtil.ntoc( A3623AlbPckKn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbPckKn_Enabled!=0) ? localUtil.format( A3623AlbPckKn, "ZZZZZ9.99") : localUtil.format( A3623AlbPckKn, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPckKn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPckKn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_507_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPckKb_Internalname,GXutil.ltrim( localUtil.ntoc( A3624AlbPckKb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbPckKb_Enabled!=0) ? localUtil.format( A3624AlbPckKb, "ZZZZZ9.99") : localUtil.format( A3624AlbPckKb, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPckKb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPckKb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_507_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPckTar_Internalname,GXutil.ltrim( localUtil.ntoc( A3625AlbPckTar, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbPckTar_Enabled!=0) ? localUtil.format( A3625AlbPckTar, "ZZZZZ9.99") : localUtil.format( A3625AlbPckTar, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPckTar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPckTar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_507_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPckUni_Internalname,GXutil.ltrim( localUtil.ntoc( A3626AlbPckUni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbPckUni_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3626AlbPckUni), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3626AlbPckUni), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPckUni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPckUni_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_507_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPckM1_Internalname,GXutil.ltrim( localUtil.ntoc( A10022AlbPckM1, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbPckM1_Enabled!=0) ? localUtil.format( A10022AlbPckM1, "ZZ9.99") : localUtil.format( A10022AlbPckM1, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPckM1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPckM1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_507_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPckM2_Internalname,GXutil.ltrim( localUtil.ntoc( A10023AlbPckM2, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbPckM2_Enabled!=0) ? localUtil.format( A10023AlbPckM2, "ZZ9.99") : localUtil.format( A10023AlbPckM2, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPckM2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPckM2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_507_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPckM3_Internalname,GXutil.ltrim( localUtil.ntoc( A10024AlbPckM3, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbPckM3_Enabled!=0) ? localUtil.format( A10024AlbPckM3, "ZZ9.99") : localUtil.format( A10024AlbPckM3, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,70);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPckM3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPckM3_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPckVol_Internalname,GXutil.ltrim( localUtil.ntoc( A10025AlbPckVol, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbPckVol_Enabled!=0) ? localUtil.format( A10025AlbPckVol, "ZZ9.99") : localUtil.format( A10025AlbPckVol, "ZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPckVol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPckVol_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesTB507( ) ;
      GXCCtl = "Z3621AlbPckLin_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3621AlbPckLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3625AlbPckTar_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3625AlbPckTar, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10022AlbPckM1_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10022AlbPckM1, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10023AlbPckM2_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10023AlbPckM2, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3622AlbPckCaj_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3622AlbPckCaj));
      GXCCtl = "Z3623AlbPckKn_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3623AlbPckKn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3624AlbPckKb_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3624AlbPckKb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3626AlbPckUni_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3626AlbPckUni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10024AlbPckM3_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10024AlbPckM3, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O10025AlbPckVol_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O10025AlbPckVol, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_507_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_507, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_507_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_507, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_507_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_507, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_507_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_507_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPCKLIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPCKCAJ_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckCaj_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPCKKN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckKn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPCKKB_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckKb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPCKTAR_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckTar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPCKUNI_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPCKM1_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckM1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPCKM2_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckM2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPCKM3_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckM3_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPCKVOL_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckVol_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowTB507( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60507( ) ;
      edtavnRcdDeleted_507_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_507_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPckLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKLIN_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPckCaj_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKCAJ_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPckKn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKKN_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPckKb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKKB_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPckTar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKTAR_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPckUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKUNI_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPckM1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKM1_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPckM2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKM2_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPckM3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKM3_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPckVol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCKVOL_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         GXCCtl = "ALBPCKLIN_" + sGXsfl_60_idx ;
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
         GXCCtl = "ALBPCKKN_" + sGXsfl_60_idx ;
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
         GXCCtl = "ALBPCKKB_" + sGXsfl_60_idx ;
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
         GXCCtl = "ALBPCKTAR_" + sGXsfl_60_idx ;
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
         GXCCtl = "ALBPCKUNI_" + sGXsfl_60_idx ;
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
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbPckM1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbPckM1_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBPCKM1_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPckM1_Internalname ;
         wbErr = true ;
         A10022AlbPckM1 = DecimalUtil.ZERO ;
         n10022AlbPckM1 = false ;
      }
      else
      {
         A10022AlbPckM1 = localUtil.ctond( httpContext.cgiGet( edtAlbPckM1_Internalname)) ;
         n10022AlbPckM1 = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbPckM2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbPckM2_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBPCKM2_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPckM2_Internalname ;
         wbErr = true ;
         A10023AlbPckM2 = DecimalUtil.ZERO ;
         n10023AlbPckM2 = false ;
      }
      else
      {
         A10023AlbPckM2 = localUtil.ctond( httpContext.cgiGet( edtAlbPckM2_Internalname)) ;
         n10023AlbPckM2 = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbPckM3_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbPckM3_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBPCKM3_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPckM3_Internalname ;
         wbErr = true ;
         A10024AlbPckM3 = DecimalUtil.ZERO ;
         n10024AlbPckM3 = false ;
      }
      else
      {
         A10024AlbPckM3 = localUtil.ctond( httpContext.cgiGet( edtAlbPckM3_Internalname)) ;
         n10024AlbPckM3 = false ;
      }
      A10025AlbPckVol = localUtil.ctond( httpContext.cgiGet( edtAlbPckVol_Internalname)) ;
      GXCCtl = "Z3621AlbPckLin_" + sGXsfl_60_idx ;
      Z3621AlbPckLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3625AlbPckTar_" + sGXsfl_60_idx ;
      Z3625AlbPckTar = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10022AlbPckM1_" + sGXsfl_60_idx ;
      Z10022AlbPckM1 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10023AlbPckM2_" + sGXsfl_60_idx ;
      Z10023AlbPckM2 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3622AlbPckCaj_" + sGXsfl_60_idx ;
      Z3622AlbPckCaj = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3623AlbPckKn_" + sGXsfl_60_idx ;
      Z3623AlbPckKn = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3624AlbPckKb_" + sGXsfl_60_idx ;
      Z3624AlbPckKb = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3626AlbPckUni_" + sGXsfl_60_idx ;
      Z3626AlbPckUni = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10024AlbPckM3_" + sGXsfl_60_idx ;
      Z10024AlbPckM3 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O10025AlbPckVol_" + sGXsfl_60_idx ;
      O10025AlbPckVol = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_507_" + sGXsfl_60_idx ;
      nRcdDeleted_507 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_507_" + sGXsfl_60_idx ;
      nRcdExists_507 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_507_" + sGXsfl_60_idx ;
      nIsMod_507 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAlbPckLin_Enabled = edtAlbPckLin_Enabled ;
   }

   public void confirmValuesTB0( )
   {
      nGXsfl_60_idx = 0 ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60507( ) ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_60507( ) ;
         httpContext.changePostValue( "Z3621AlbPckLin_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3621AlbPckLin_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3621AlbPckLin_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z3625AlbPckTar_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3625AlbPckTar_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3625AlbPckTar_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z10022AlbPckM1_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z10022AlbPckM1_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10022AlbPckM1_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z10023AlbPckM2_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z10023AlbPckM2_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10023AlbPckM2_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z3622AlbPckCaj_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3622AlbPckCaj_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3622AlbPckCaj_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z3623AlbPckKn_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3623AlbPckKn_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3623AlbPckKn_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z3624AlbPckKb_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3624AlbPckKb_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3624AlbPckKb_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z3626AlbPckUni_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3626AlbPckUni_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3626AlbPckUni_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z10024AlbPckM3_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z10024AlbPckM3_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10024AlbPckM3_"+sGXsfl_60_idx) ;
      }
      httpContext.changePostValue( "O10025AlbPckVol", httpContext.cgiGet( "T10025AlbPckVol")) ;
      httpContext.deletePostValue( "T10025AlbPckVol") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.talbpkb", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z3829AlbPckUlin", GXutil.ltrim( localUtil.ntoc( Z3829AlbPckUlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O3829AlbPckUlin", GXutil.ltrim( localUtil.ntoc( O3829AlbPckUlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O10021AlbPckVolT", GXutil.ltrim( localUtil.ntoc( O10021AlbPckVolT, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_60", GXutil.ltrim( localUtil.ntoc( nGXsfl_60_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSUMCAJ", GXutil.ltrim( localUtil.ntoc( AV26SumCaj, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMED1", GXutil.ltrim( localUtil.ntoc( AV27Med1, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMED2", GXutil.ltrim( localUtil.ntoc( AV28Med2, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.talbpkb", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"})  ;
   }

   public String getPgmname( )
   {
      return "TALBPKB" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ALBARAN PACKING LIST S.A.BROS", "") ;
   }

   public void initializeNonKeyTB195( )
   {
      A3829AlbPckUlin = (short)(0) ;
      n3829AlbPckUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
      O3829AlbPckUlin = A3829AlbPckUlin ;
      n3829AlbPckUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
      O10021AlbPckVolT = A10021AlbPckVolT ;
      n10021AlbPckVolT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
      Z3829AlbPckUlin = (short)(0) ;
   }

   public void initAllTB195( )
   {
      initializeNonKeyTB195( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyTB507( )
   {
      A3625AlbPckTar = DecimalUtil.ZERO ;
      n3625AlbPckTar = false ;
      A10025AlbPckVol = DecimalUtil.ZERO ;
      A3622AlbPckCaj = "" ;
      n3622AlbPckCaj = false ;
      A3623AlbPckKn = DecimalUtil.ZERO ;
      n3623AlbPckKn = false ;
      A3624AlbPckKb = DecimalUtil.ZERO ;
      n3624AlbPckKb = false ;
      A3626AlbPckUni = (short)(0) ;
      n3626AlbPckUni = false ;
      A10024AlbPckM3 = DecimalUtil.ZERO ;
      n10024AlbPckM3 = false ;
      A10022AlbPckM1 = AV27Med1 ;
      n10022AlbPckM1 = false ;
      A10023AlbPckM2 = AV28Med2 ;
      n10023AlbPckM2 = false ;
      O10025AlbPckVol = A10025AlbPckVol ;
      Z3625AlbPckTar = DecimalUtil.ZERO ;
      Z10022AlbPckM1 = DecimalUtil.ZERO ;
      Z10023AlbPckM2 = DecimalUtil.ZERO ;
      Z3622AlbPckCaj = "" ;
      Z3623AlbPckKn = DecimalUtil.ZERO ;
      Z3624AlbPckKb = DecimalUtil.ZERO ;
      Z3626AlbPckUni = (short)(0) ;
      Z10024AlbPckM3 = DecimalUtil.ZERO ;
   }

   public void initAllTB507( )
   {
      A3621AlbPckLin = (short)(0) ;
      initializeNonKeyTB507( ) ;
   }

   public void standaloneModalInsertTB507( )
   {
      A3829AlbPckUlin = i3829AlbPckUlin ;
      n3829AlbPckUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3829AlbPckUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3829AlbPckUlin), 4, 0));
      A10022AlbPckM1 = i10022AlbPckM1 ;
      n10022AlbPckM1 = false ;
      A10023AlbPckM2 = i10023AlbPckM2 ;
      n10023AlbPckM2 = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824153433", true, true);
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
      httpContext.AddJavascriptSource("talbpkb.js", "?2026824153433", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties507( )
   {
      edtAlbPckLin_Enabled = defedtAlbPckLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPckLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPckLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void startgridcontrol60( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10022AlbPckM1, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckM1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10023AlbPckM2, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckM2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10024AlbPckM3, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckM3_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10025AlbPckVol, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPckVol_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtAlbPckVolT_Internalname = "ALBPCKVOLT" ;
      edtavnRcdDeleted_507_Internalname = "vNRCDDELETED_507" ;
      edtAlbPckLin_Internalname = "ALBPCKLIN" ;
      edtAlbPckCaj_Internalname = "ALBPCKCAJ" ;
      edtAlbPckKn_Internalname = "ALBPCKKN" ;
      edtAlbPckKb_Internalname = "ALBPCKKB" ;
      edtAlbPckTar_Internalname = "ALBPCKTAR" ;
      edtAlbPckUni_Internalname = "ALBPCKUNI" ;
      edtAlbPckM1_Internalname = "ALBPCKM1" ;
      edtAlbPckM2_Internalname = "ALBPCKM2" ;
      edtAlbPckM3_Internalname = "ALBPCKM3" ;
      edtAlbPckVol_Internalname = "ALBPCKVOL" ;
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
      Form.setCaption( httpContext.getMessage( "ALBARAN PACKING LIST S.A.BROS", "") );
      edtAlbPckVol_Jsonclick = "" ;
      edtAlbPckM3_Jsonclick = "" ;
      edtAlbPckM2_Jsonclick = "" ;
      edtAlbPckM1_Jsonclick = "" ;
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
      edtAlbPckVol_Enabled = 0 ;
      edtAlbPckM3_Enabled = 1 ;
      edtAlbPckM2_Enabled = 1 ;
      edtAlbPckM1_Enabled = 1 ;
      edtAlbPckUni_Enabled = 1 ;
      edtAlbPckTar_Enabled = 1 ;
      edtAlbPckKb_Enabled = 1 ;
      edtAlbPckKn_Enabled = 1 ;
      edtAlbPckCaj_Enabled = 1 ;
      edtAlbPckLin_Enabled = 1 ;
      edtavnRcdDeleted_507_Enabled = 1 ;
      edtAlbPckVolT_Jsonclick = "" ;
      edtAlbPckVolT_Backcolor = (int)(0xFFFFFF) ;
      edtAlbPckVolT_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
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

   public void xc_11_TB507( String A396EmprCod ,
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
         GXv_int8[0] = A30AlbProCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_char2[0] = A3622AlbPckCaj ;
         new app.pultpck(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int7, GXv_int5, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A30AlbProCod = GXv_int8[0] ;
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
      subsflControlProps_60507( ) ;
      while ( nGXsfl_60_idx <= nRC_GXsfl_60 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalTB507( ) ;
         standaloneModalTB507( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowTB507( ) ;
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_60507( ) ;
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
      /* Using cursor T00TB37 */
      pr_default.execute(33, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(33) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00TB37_A407EmprNom[0] ;
      n407EmprNom = T00TB37_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(33);
      /* Using cursor T00TB38 */
      pr_default.execute(34, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(34) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(34);
      /* Using cursor T00TB39 */
      pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(35) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      pr_default.close(35);
      /* Using cursor T00TB41 */
      pr_default.execute(36, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(36) != 101) )
      {
         A10021AlbPckVolT = T00TB41_A10021AlbPckVolT[0] ;
         n10021AlbPckVolT = T00TB41_n10021AlbPckVolT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
      }
      else
      {
         A10021AlbPckVolT = DecimalUtil.doubleToDec(0) ;
         n10021AlbPckVolT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrimstr( A10021AlbPckVolT, 6, 2));
      }
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
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10021AlbPckVolT", GXutil.ltrim( localUtil.ntoc( A10021AlbPckVolT, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3829AlbPckUlin", GXutil.ltrim( localUtil.ntoc( Z3829AlbPckUlin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10021AlbPckVolT", GXutil.ltrim( localUtil.ntoc( Z10021AlbPckVolT, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O3829AlbPckUlin", GXutil.ltrim( localUtil.ntoc( O3829AlbPckUlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O10021AlbPckVolT", GXutil.ltrim( localUtil.ntoc( O10021AlbPckVolT, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
         GXv_int8[0] = A30AlbProCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_char2[0] = A3622AlbPckCaj ;
         new app.pultpck(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int7, GXv_int5, GXv_char3, GXv_char2) ;
         talbpkb_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         talbpkb_impl.this.A30AlbProCod = GXv_int8[0] ;
         A30AlbProCod = this.A30AlbProCod ;
         talbpkb_impl.this.A129BarCod = GXv_int7[0] ;
         A129BarCod = this.A129BarCod ;
         talbpkb_impl.this.A132BarCodReo = GXv_int5[0] ;
         A132BarCodReo = this.A132BarCodReo ;
         talbpkb_impl.this.A130BarCodPar = GXv_char3[0] ;
         A130BarCodPar = this.A130BarCodPar ;
         talbpkb_impl.this.A3622AlbPckCaj = GXv_char2[0] ;
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
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A3829AlbPckUlin',fld:'ALBPCKULIN',pic:'ZZZ9'},{av:'AV28Med2',fld:'vMED2',pic:'ZZ9.99'},{av:'AV27Med1',fld:'vMED1',pic:'ZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV26SumCaj',fld:'vSUMCAJ',pic:'9'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A3829AlbPckUlin',fld:'ALBPCKULIN',pic:'ZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A10021AlbPckVolT',fld:'ALBPCKVOLT',pic:'ZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z30AlbProCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z3829AlbPckUlin'},{av:'Z407EmprNom'},{av:'Z10021AlbPckVolT'},{av:'O3829AlbPckUlin'},{av:'O10021AlbPckVolT'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_ALBPCKULIN","{handler:'valid_Albpckulin',iparms:[]");
      setEventMetadata("VALID_ALBPCKULIN",",oparms:[]}");
      setEventMetadata("VALID_ALBPCKLIN","{handler:'valid_Albpcklin',iparms:[]");
      setEventMetadata("VALID_ALBPCKLIN",",oparms:[]}");
      setEventMetadata("VALID_ALBPCKCAJ","{handler:'valid_Albpckcaj',iparms:[{av:'AV26SumCaj',fld:'vSUMCAJ',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3622AlbPckCaj',fld:'ALBPCKCAJ',pic:''}]");
      setEventMetadata("VALID_ALBPCKCAJ",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A3622AlbPckCaj',fld:'ALBPCKCAJ',pic:''}]}");
      setEventMetadata("VALID_ALBPCKKN","{handler:'valid_Albpckkn',iparms:[]");
      setEventMetadata("VALID_ALBPCKKN",",oparms:[]}");
      setEventMetadata("VALID_ALBPCKKB","{handler:'valid_Albpckkb',iparms:[]");
      setEventMetadata("VALID_ALBPCKKB",",oparms:[]}");
      setEventMetadata("VALID_ALBPCKM1","{handler:'valid_Albpckm1',iparms:[]");
      setEventMetadata("VALID_ALBPCKM1",",oparms:[]}");
      setEventMetadata("VALID_ALBPCKM2","{handler:'valid_Albpckm2',iparms:[]");
      setEventMetadata("VALID_ALBPCKM2",",oparms:[]}");
      setEventMetadata("VALID_ALBPCKM3","{handler:'valid_Albpckm3',iparms:[]");
      setEventMetadata("VALID_ALBPCKM3",",oparms:[]}");
      setEventMetadata("VALID_ALBPCKVOL","{handler:'valid_Albpckvol',iparms:[]");
      setEventMetadata("VALID_ALBPCKVOL",",oparms:[]}");
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
      pr_default.close(35);
      pr_default.close(33);
      pr_default.close(34);
      pr_default.close(36);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      O10021AlbPckVolT = DecimalUtil.ZERO ;
      Z3625AlbPckTar = DecimalUtil.ZERO ;
      Z10022AlbPckM1 = DecimalUtil.ZERO ;
      Z10023AlbPckM2 = DecimalUtil.ZERO ;
      Z3622AlbPckCaj = "" ;
      Z3623AlbPckKn = DecimalUtil.ZERO ;
      Z3624AlbPckKb = DecimalUtil.ZERO ;
      Z10024AlbPckM3 = DecimalUtil.ZERO ;
      O10025AlbPckVol = DecimalUtil.ZERO ;
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
      AV27Med1 = DecimalUtil.ZERO ;
      AV28Med2 = DecimalUtil.ZERO ;
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
      A407EmprNom = "" ;
      lblTextblock8_Jsonclick = "" ;
      A10021AlbPckVolT = DecimalUtil.ZERO ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B10021AlbPckVolT = DecimalUtil.ZERO ;
      sMode507 = "" ;
      GX_FocusControl = "" ;
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
      s10021AlbPckVolT = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A3623AlbPckKn = DecimalUtil.ZERO ;
      A3624AlbPckKb = DecimalUtil.ZERO ;
      A3625AlbPckTar = DecimalUtil.ZERO ;
      A10022AlbPckM1 = DecimalUtil.ZERO ;
      A10023AlbPckM2 = DecimalUtil.ZERO ;
      A10024AlbPckM3 = DecimalUtil.ZERO ;
      A10025AlbPckVol = DecimalUtil.ZERO ;
      T10025AlbPckVol = DecimalUtil.ZERO ;
      AV18LitFe = "" ;
      AV16Lit0 = "" ;
      AV22Lit3 = "" ;
      AV23Lit4 = "" ;
      GXt_char1 = "" ;
      AV24Lit5 = "" ;
      AV19Station = "" ;
      AV20EmprNom = "" ;
      AV17UsurCod = "" ;
      Z407EmprNom = "" ;
      Z10021AlbPckVolT = DecimalUtil.ZERO ;
      T00TB6_A407EmprNom = new String[] {""} ;
      T00TB6_n407EmprNom = new boolean[] {false} ;
      T00TB8_A396EmprCod = new String[] {""} ;
      T00TB7_A396EmprCod = new String[] {""} ;
      T00TB10_A10021AlbPckVolT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TB10_n10021AlbPckVolT = new boolean[] {false} ;
      edtAlbPckCaj_Inputmask = "" ;
      T00TB12_A3829AlbPckUlin = new short[1] ;
      T00TB12_n3829AlbPckUlin = new boolean[] {false} ;
      T00TB12_A407EmprNom = new String[] {""} ;
      T00TB12_n407EmprNom = new boolean[] {false} ;
      T00TB12_A396EmprCod = new String[] {""} ;
      T00TB12_A129BarCod = new int[1] ;
      T00TB12_A132BarCodReo = new byte[1] ;
      T00TB12_A130BarCodPar = new String[] {""} ;
      T00TB12_A30AlbProCod = new long[1] ;
      T00TB12_A10021AlbPckVolT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TB12_n10021AlbPckVolT = new boolean[] {false} ;
      T00TB13_A396EmprCod = new String[] {""} ;
      T00TB13_A30AlbProCod = new long[1] ;
      T00TB13_A129BarCod = new int[1] ;
      T00TB13_A132BarCodReo = new byte[1] ;
      T00TB13_A130BarCodPar = new String[] {""} ;
      T00TB5_A3829AlbPckUlin = new short[1] ;
      T00TB5_n3829AlbPckUlin = new boolean[] {false} ;
      T00TB5_A396EmprCod = new String[] {""} ;
      T00TB5_A129BarCod = new int[1] ;
      T00TB5_A132BarCodReo = new byte[1] ;
      T00TB5_A130BarCodPar = new String[] {""} ;
      T00TB5_A30AlbProCod = new long[1] ;
      T00TB14_A396EmprCod = new String[] {""} ;
      T00TB14_A30AlbProCod = new long[1] ;
      T00TB14_A129BarCod = new int[1] ;
      T00TB14_A132BarCodReo = new byte[1] ;
      T00TB14_A130BarCodPar = new String[] {""} ;
      T00TB15_A396EmprCod = new String[] {""} ;
      T00TB15_A30AlbProCod = new long[1] ;
      T00TB15_A129BarCod = new int[1] ;
      T00TB15_A132BarCodReo = new byte[1] ;
      T00TB15_A130BarCodPar = new String[] {""} ;
      T00TB4_A3829AlbPckUlin = new short[1] ;
      T00TB4_n3829AlbPckUlin = new boolean[] {false} ;
      T00TB4_A396EmprCod = new String[] {""} ;
      T00TB4_A129BarCod = new int[1] ;
      T00TB4_A132BarCodReo = new byte[1] ;
      T00TB4_A130BarCodPar = new String[] {""} ;
      T00TB4_A30AlbProCod = new long[1] ;
      T00TB19_A396EmprCod = new String[] {""} ;
      T00TB19_A30AlbProCod = new long[1] ;
      T00TB19_A129BarCod = new int[1] ;
      T00TB19_A132BarCodReo = new byte[1] ;
      T00TB19_A130BarCodPar = new String[] {""} ;
      T00TB19_A6648AlbMetLin = new short[1] ;
      T00TB20_A396EmprCod = new String[] {""} ;
      T00TB20_A30AlbProCod = new long[1] ;
      T00TB20_A129BarCod = new int[1] ;
      T00TB20_A132BarCodReo = new byte[1] ;
      T00TB20_A130BarCodPar = new String[] {""} ;
      T00TB20_A9639Et_Numero = new short[1] ;
      T00TB21_A396EmprCod = new String[] {""} ;
      T00TB21_A30AlbProCod = new long[1] ;
      T00TB21_A129BarCod = new int[1] ;
      T00TB21_A132BarCodReo = new byte[1] ;
      T00TB21_A130BarCodPar = new String[] {""} ;
      T00TB21_A6622AlbHdRLn = new short[1] ;
      T00TB22_A396EmprCod = new String[] {""} ;
      T00TB22_A30AlbProCod = new long[1] ;
      T00TB22_A129BarCod = new int[1] ;
      T00TB22_A132BarCodReo = new byte[1] ;
      T00TB22_A130BarCodPar = new String[] {""} ;
      T00TB22_A5456P_ForLin = new short[1] ;
      T00TB23_A396EmprCod = new String[] {""} ;
      T00TB23_A30AlbProCod = new long[1] ;
      T00TB23_A129BarCod = new int[1] ;
      T00TB23_A132BarCodReo = new byte[1] ;
      T00TB23_A130BarCodPar = new String[] {""} ;
      T00TB23_A2524DisComLin = new byte[1] ;
      T00TB23_A1056DisComCod = new String[] {""} ;
      T00TB23_A1032FonCod = new String[] {""} ;
      T00TB24_A396EmprCod = new String[] {""} ;
      T00TB24_A3617AlbTrnCod = new long[1] ;
      T00TB24_A30AlbProCod = new long[1] ;
      T00TB24_A129BarCod = new int[1] ;
      T00TB24_A132BarCodReo = new byte[1] ;
      T00TB24_A130BarCodPar = new String[] {""} ;
      T00TB25_A396EmprCod = new String[] {""} ;
      T00TB25_A30AlbProCod = new long[1] ;
      T00TB25_A129BarCod = new int[1] ;
      T00TB25_A132BarCodReo = new byte[1] ;
      T00TB25_A130BarCodPar = new String[] {""} ;
      T00TB25_A2764AlbHdrLin = new short[1] ;
      T00TB26_A396EmprCod = new String[] {""} ;
      T00TB26_A30AlbProCod = new long[1] ;
      T00TB26_A129BarCod = new int[1] ;
      T00TB26_A132BarCodReo = new byte[1] ;
      T00TB26_A130BarCodPar = new String[] {""} ;
      T00TB26_A1468AlbPrdLin = new short[1] ;
      T00TB27_A396EmprCod = new String[] {""} ;
      T00TB27_A30AlbProCod = new long[1] ;
      T00TB27_A129BarCod = new int[1] ;
      T00TB27_A132BarCodReo = new byte[1] ;
      T00TB27_A130BarCodPar = new String[] {""} ;
      T00TB27_A200BarPieCod = new String[] {""} ;
      T00TB28_A396EmprCod = new String[] {""} ;
      T00TB28_A30AlbProCod = new long[1] ;
      T00TB28_A129BarCod = new int[1] ;
      T00TB28_A132BarCodReo = new byte[1] ;
      T00TB28_A130BarCodPar = new String[] {""} ;
      T00TB28_A1240GuiFasLin = new short[1] ;
      T00TB30_A396EmprCod = new String[] {""} ;
      T00TB30_A30AlbProCod = new long[1] ;
      T00TB30_A129BarCod = new int[1] ;
      T00TB30_A132BarCodReo = new byte[1] ;
      T00TB30_A130BarCodPar = new String[] {""} ;
      T00TB31_A30AlbProCod = new long[1] ;
      T00TB31_A3621AlbPckLin = new short[1] ;
      T00TB31_A3625AlbPckTar = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TB31_n3625AlbPckTar = new boolean[] {false} ;
      T00TB31_A10022AlbPckM1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TB31_n10022AlbPckM1 = new boolean[] {false} ;
      T00TB31_A10023AlbPckM2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TB31_n10023AlbPckM2 = new boolean[] {false} ;
      T00TB31_A3622AlbPckCaj = new String[] {""} ;
      T00TB31_n3622AlbPckCaj = new boolean[] {false} ;
      T00TB31_A3623AlbPckKn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TB31_n3623AlbPckKn = new boolean[] {false} ;
      T00TB31_A3624AlbPckKb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TB31_n3624AlbPckKb = new boolean[] {false} ;
      T00TB31_A3626AlbPckUni = new short[1] ;
      T00TB31_n3626AlbPckUni = new boolean[] {false} ;
      T00TB31_A10024AlbPckM3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TB31_n10024AlbPckM3 = new boolean[] {false} ;
      T00TB31_A396EmprCod = new String[] {""} ;
      T00TB31_A129BarCod = new int[1] ;
      T00TB31_A132BarCodReo = new byte[1] ;
      T00TB31_A130BarCodPar = new String[] {""} ;
      T00TB32_A396EmprCod = new String[] {""} ;
      T00TB32_A30AlbProCod = new long[1] ;
      T00TB32_A129BarCod = new int[1] ;
      T00TB32_A132BarCodReo = new byte[1] ;
      T00TB32_A130BarCodPar = new String[] {""} ;
      T00TB32_A3621AlbPckLin = new short[1] ;
      T00TB3_A30AlbProCod = new long[1] ;
      T00TB3_A3621AlbPckLin = new short[1] ;
      T00TB3_A3625AlbPckTar = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TB3_n3625AlbPckTar = new boolean[] {false} ;
      T00TB3_A10022AlbPckM1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TB3_n10022AlbPckM1 = new boolean[] {false} ;
      T00TB3_A10023AlbPckM2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TB3_n10023AlbPckM2 = new boolean[] {false} ;
      T00TB3_A3622AlbPckCaj = new String[] {""} ;
      T00TB3_n3622AlbPckCaj = new boolean[] {false} ;
      T00TB3_A3623AlbPckKn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TB3_n3623AlbPckKn = new boolean[] {false} ;
      T00TB3_A3624AlbPckKb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TB3_n3624AlbPckKb = new boolean[] {false} ;
      T00TB3_A3626AlbPckUni = new short[1] ;
      T00TB3_n3626AlbPckUni = new boolean[] {false} ;
      T00TB3_A10024AlbPckM3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TB3_n10024AlbPckM3 = new boolean[] {false} ;
      T00TB3_A396EmprCod = new String[] {""} ;
      T00TB3_A129BarCod = new int[1] ;
      T00TB3_A132BarCodReo = new byte[1] ;
      T00TB3_A130BarCodPar = new String[] {""} ;
      T00TB2_A30AlbProCod = new long[1] ;
      T00TB2_A3621AlbPckLin = new short[1] ;
      T00TB2_A3625AlbPckTar = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TB2_n3625AlbPckTar = new boolean[] {false} ;
      T00TB2_A10022AlbPckM1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TB2_n10022AlbPckM1 = new boolean[] {false} ;
      T00TB2_A10023AlbPckM2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TB2_n10023AlbPckM2 = new boolean[] {false} ;
      T00TB2_A3622AlbPckCaj = new String[] {""} ;
      T00TB2_n3622AlbPckCaj = new boolean[] {false} ;
      T00TB2_A3623AlbPckKn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TB2_n3623AlbPckKn = new boolean[] {false} ;
      T00TB2_A3624AlbPckKb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TB2_n3624AlbPckKb = new boolean[] {false} ;
      T00TB2_A3626AlbPckUni = new short[1] ;
      T00TB2_n3626AlbPckUni = new boolean[] {false} ;
      T00TB2_A10024AlbPckM3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TB2_n10024AlbPckM3 = new boolean[] {false} ;
      T00TB2_A396EmprCod = new String[] {""} ;
      T00TB2_A129BarCod = new int[1] ;
      T00TB2_A132BarCodReo = new byte[1] ;
      T00TB2_A130BarCodPar = new String[] {""} ;
      T00TB36_A396EmprCod = new String[] {""} ;
      T00TB36_A30AlbProCod = new long[1] ;
      T00TB36_A129BarCod = new int[1] ;
      T00TB36_A132BarCodReo = new byte[1] ;
      T00TB36_A130BarCodPar = new String[] {""} ;
      T00TB36_A3621AlbPckLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i10022AlbPckM1 = DecimalUtil.ZERO ;
      i10023AlbPckM2 = DecimalUtil.ZERO ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00TB37_A407EmprNom = new String[] {""} ;
      T00TB37_n407EmprNom = new boolean[] {false} ;
      T00TB38_A396EmprCod = new String[] {""} ;
      T00TB39_A396EmprCod = new String[] {""} ;
      T00TB41_A10021AlbPckVolT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TB41_n10021AlbPckVolT = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ407EmprNom = "" ;
      ZZ10021AlbPckVolT = DecimalUtil.ZERO ;
      ZO10021AlbPckVolT = DecimalUtil.ZERO ;
      GXv_char4 = new String[1] ;
      GXv_int8 = new long[1] ;
      GXv_int7 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.talbpkb__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.talbpkb__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.talbpkb__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.talbpkb__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbpkb__default(),
         new Object[] {
             new Object[] {
            T00TB2_A30AlbProCod, T00TB2_A3621AlbPckLin, T00TB2_A3625AlbPckTar, T00TB2_n3625AlbPckTar, T00TB2_A10022AlbPckM1, T00TB2_n10022AlbPckM1, T00TB2_A10023AlbPckM2, T00TB2_n10023AlbPckM2, T00TB2_A3622AlbPckCaj, T00TB2_n3622AlbPckCaj,
            T00TB2_A3623AlbPckKn, T00TB2_n3623AlbPckKn, T00TB2_A3624AlbPckKb, T00TB2_n3624AlbPckKb, T00TB2_A3626AlbPckUni, T00TB2_n3626AlbPckUni, T00TB2_A10024AlbPckM3, T00TB2_n10024AlbPckM3, T00TB2_A396EmprCod, T00TB2_A129BarCod,
            T00TB2_A132BarCodReo, T00TB2_A130BarCodPar
            }
            , new Object[] {
            T00TB3_A30AlbProCod, T00TB3_A3621AlbPckLin, T00TB3_A3625AlbPckTar, T00TB3_n3625AlbPckTar, T00TB3_A10022AlbPckM1, T00TB3_n10022AlbPckM1, T00TB3_A10023AlbPckM2, T00TB3_n10023AlbPckM2, T00TB3_A3622AlbPckCaj, T00TB3_n3622AlbPckCaj,
            T00TB3_A3623AlbPckKn, T00TB3_n3623AlbPckKn, T00TB3_A3624AlbPckKb, T00TB3_n3624AlbPckKb, T00TB3_A3626AlbPckUni, T00TB3_n3626AlbPckUni, T00TB3_A10024AlbPckM3, T00TB3_n10024AlbPckM3, T00TB3_A396EmprCod, T00TB3_A129BarCod,
            T00TB3_A132BarCodReo, T00TB3_A130BarCodPar
            }
            , new Object[] {
            T00TB4_A3829AlbPckUlin, T00TB4_n3829AlbPckUlin, T00TB4_A396EmprCod, T00TB4_A129BarCod, T00TB4_A132BarCodReo, T00TB4_A130BarCodPar, T00TB4_A30AlbProCod
            }
            , new Object[] {
            T00TB5_A3829AlbPckUlin, T00TB5_n3829AlbPckUlin, T00TB5_A396EmprCod, T00TB5_A129BarCod, T00TB5_A132BarCodReo, T00TB5_A130BarCodPar, T00TB5_A30AlbProCod
            }
            , new Object[] {
            T00TB6_A407EmprNom, T00TB6_n407EmprNom
            }
            , new Object[] {
            T00TB7_A396EmprCod
            }
            , new Object[] {
            T00TB8_A396EmprCod
            }
            , new Object[] {
            T00TB10_A10021AlbPckVolT, T00TB10_n10021AlbPckVolT
            }
            , new Object[] {
            T00TB12_A3829AlbPckUlin, T00TB12_n3829AlbPckUlin, T00TB12_A407EmprNom, T00TB12_n407EmprNom, T00TB12_A396EmprCod, T00TB12_A129BarCod, T00TB12_A132BarCodReo, T00TB12_A130BarCodPar, T00TB12_A30AlbProCod, T00TB12_A10021AlbPckVolT,
            T00TB12_n10021AlbPckVolT
            }
            , new Object[] {
            T00TB13_A396EmprCod, T00TB13_A30AlbProCod, T00TB13_A129BarCod, T00TB13_A132BarCodReo, T00TB13_A130BarCodPar
            }
            , new Object[] {
            T00TB14_A396EmprCod, T00TB14_A30AlbProCod, T00TB14_A129BarCod, T00TB14_A132BarCodReo, T00TB14_A130BarCodPar
            }
            , new Object[] {
            T00TB15_A396EmprCod, T00TB15_A30AlbProCod, T00TB15_A129BarCod, T00TB15_A132BarCodReo, T00TB15_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00TB19_A396EmprCod, T00TB19_A30AlbProCod, T00TB19_A129BarCod, T00TB19_A132BarCodReo, T00TB19_A130BarCodPar, T00TB19_A6648AlbMetLin
            }
            , new Object[] {
            T00TB20_A396EmprCod, T00TB20_A30AlbProCod, T00TB20_A129BarCod, T00TB20_A132BarCodReo, T00TB20_A130BarCodPar, T00TB20_A9639Et_Numero
            }
            , new Object[] {
            T00TB21_A396EmprCod, T00TB21_A30AlbProCod, T00TB21_A129BarCod, T00TB21_A132BarCodReo, T00TB21_A130BarCodPar, T00TB21_A6622AlbHdRLn
            }
            , new Object[] {
            T00TB22_A396EmprCod, T00TB22_A30AlbProCod, T00TB22_A129BarCod, T00TB22_A132BarCodReo, T00TB22_A130BarCodPar, T00TB22_A5456P_ForLin
            }
            , new Object[] {
            T00TB23_A396EmprCod, T00TB23_A30AlbProCod, T00TB23_A129BarCod, T00TB23_A132BarCodReo, T00TB23_A130BarCodPar, T00TB23_A2524DisComLin, T00TB23_A1056DisComCod, T00TB23_A1032FonCod
            }
            , new Object[] {
            T00TB24_A396EmprCod, T00TB24_A3617AlbTrnCod, T00TB24_A30AlbProCod, T00TB24_A129BarCod, T00TB24_A132BarCodReo, T00TB24_A130BarCodPar
            }
            , new Object[] {
            T00TB25_A396EmprCod, T00TB25_A30AlbProCod, T00TB25_A129BarCod, T00TB25_A132BarCodReo, T00TB25_A130BarCodPar, T00TB25_A2764AlbHdrLin
            }
            , new Object[] {
            T00TB26_A396EmprCod, T00TB26_A30AlbProCod, T00TB26_A129BarCod, T00TB26_A132BarCodReo, T00TB26_A130BarCodPar, T00TB26_A1468AlbPrdLin
            }
            , new Object[] {
            T00TB27_A396EmprCod, T00TB27_A30AlbProCod, T00TB27_A129BarCod, T00TB27_A132BarCodReo, T00TB27_A130BarCodPar, T00TB27_A200BarPieCod
            }
            , new Object[] {
            T00TB28_A396EmprCod, T00TB28_A30AlbProCod, T00TB28_A129BarCod, T00TB28_A132BarCodReo, T00TB28_A130BarCodPar, T00TB28_A1240GuiFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            T00TB30_A396EmprCod, T00TB30_A30AlbProCod, T00TB30_A129BarCod, T00TB30_A132BarCodReo, T00TB30_A130BarCodPar
            }
            , new Object[] {
            T00TB31_A30AlbProCod, T00TB31_A3621AlbPckLin, T00TB31_A3625AlbPckTar, T00TB31_n3625AlbPckTar, T00TB31_A10022AlbPckM1, T00TB31_n10022AlbPckM1, T00TB31_A10023AlbPckM2, T00TB31_n10023AlbPckM2, T00TB31_A3622AlbPckCaj, T00TB31_n3622AlbPckCaj,
            T00TB31_A3623AlbPckKn, T00TB31_n3623AlbPckKn, T00TB31_A3624AlbPckKb, T00TB31_n3624AlbPckKb, T00TB31_A3626AlbPckUni, T00TB31_n3626AlbPckUni, T00TB31_A10024AlbPckM3, T00TB31_n10024AlbPckM3, T00TB31_A396EmprCod, T00TB31_A129BarCod,
            T00TB31_A132BarCodReo, T00TB31_A130BarCodPar
            }
            , new Object[] {
            T00TB32_A396EmprCod, T00TB32_A30AlbProCod, T00TB32_A129BarCod, T00TB32_A132BarCodReo, T00TB32_A130BarCodPar, T00TB32_A3621AlbPckLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00TB36_A396EmprCod, T00TB36_A30AlbProCod, T00TB36_A129BarCod, T00TB36_A132BarCodReo, T00TB36_A130BarCodPar, T00TB36_A3621AlbPckLin
            }
            , new Object[] {
            T00TB37_A407EmprNom, T00TB37_n407EmprNom
            }
            , new Object[] {
            T00TB38_A396EmprCod
            }
            , new Object[] {
            T00TB39_A396EmprCod
            }
            , new Object[] {
            T00TB41_A10021AlbPckVolT, T00TB41_n10021AlbPckVolT
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
      Z10023AlbPckM2 = DecimalUtil.ZERO ;
      n10023AlbPckM2 = false ;
      A10023AlbPckM2 = DecimalUtil.ZERO ;
      n10023AlbPckM2 = false ;
      i10023AlbPckM2 = DecimalUtil.ZERO ;
      n10023AlbPckM2 = false ;
      Z10022AlbPckM1 = DecimalUtil.ZERO ;
      n10022AlbPckM1 = false ;
      A10022AlbPckM1 = DecimalUtil.ZERO ;
      n10022AlbPckM1 = false ;
      i10022AlbPckM1 = DecimalUtil.ZERO ;
      n10022AlbPckM1 = false ;
   }

   private byte wcpOA132BarCodReo ;
   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV26SumCaj ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
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
   private int nRC_GXsfl_60 ;
   private int nGXsfl_60_idx=1 ;
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
   private int edtEmprNom_Enabled ;
   private int edtAlbPckVolT_Enabled ;
   private int edtavnRcdDeleted_507_Enabled ;
   private int edtAlbPckLin_Enabled ;
   private int edtAlbPckCaj_Enabled ;
   private int edtAlbPckKn_Enabled ;
   private int edtAlbPckKb_Enabled ;
   private int edtAlbPckTar_Enabled ;
   private int edtAlbPckUni_Enabled ;
   private int edtAlbPckM1_Enabled ;
   private int edtAlbPckM2_Enabled ;
   private int edtAlbPckM3_Enabled ;
   private int edtAlbPckVol_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int AV29ContVal ;
   private int GXt_int6 ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtAlbPckLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtAlbPckVolT_Backcolor ;
   private int edtEmprNom_Backcolor ;
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
   private long GXv_int8[] ;
   private java.math.BigDecimal O10021AlbPckVolT ;
   private java.math.BigDecimal Z3625AlbPckTar ;
   private java.math.BigDecimal Z10022AlbPckM1 ;
   private java.math.BigDecimal Z10023AlbPckM2 ;
   private java.math.BigDecimal Z3623AlbPckKn ;
   private java.math.BigDecimal Z3624AlbPckKb ;
   private java.math.BigDecimal Z10024AlbPckM3 ;
   private java.math.BigDecimal O10025AlbPckVol ;
   private java.math.BigDecimal AV27Med1 ;
   private java.math.BigDecimal AV28Med2 ;
   private java.math.BigDecimal A10021AlbPckVolT ;
   private java.math.BigDecimal B10021AlbPckVolT ;
   private java.math.BigDecimal s10021AlbPckVolT ;
   private java.math.BigDecimal A3623AlbPckKn ;
   private java.math.BigDecimal A3624AlbPckKb ;
   private java.math.BigDecimal A3625AlbPckTar ;
   private java.math.BigDecimal A10022AlbPckM1 ;
   private java.math.BigDecimal A10023AlbPckM2 ;
   private java.math.BigDecimal A10024AlbPckM3 ;
   private java.math.BigDecimal A10025AlbPckVol ;
   private java.math.BigDecimal T10025AlbPckVol ;
   private java.math.BigDecimal Z10021AlbPckVolT ;
   private java.math.BigDecimal i10022AlbPckM1 ;
   private java.math.BigDecimal i10023AlbPckM2 ;
   private java.math.BigDecimal ZZ10021AlbPckVolT ;
   private java.math.BigDecimal ZO10021AlbPckVolT ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z3622AlbPckCaj ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A3622AlbPckCaj ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_60_idx="0001" ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtAlbPckVolT_Internalname ;
   private String edtAlbPckVolT_Jsonclick ;
   private String sMode507 ;
   private String edtavnRcdDeleted_507_Internalname ;
   private String edtAlbPckLin_Internalname ;
   private String edtAlbPckCaj_Internalname ;
   private String edtAlbPckKn_Internalname ;
   private String edtAlbPckKb_Internalname ;
   private String edtAlbPckTar_Internalname ;
   private String edtAlbPckUni_Internalname ;
   private String edtAlbPckM1_Internalname ;
   private String edtAlbPckM2_Internalname ;
   private String edtAlbPckM3_Internalname ;
   private String edtAlbPckVol_Internalname ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode195 ;
   private String GXCCtl ;
   private String AV18LitFe ;
   private String AV16Lit0 ;
   private String AV22Lit3 ;
   private String AV23Lit4 ;
   private String GXt_char1 ;
   private String AV24Lit5 ;
   private String AV19Station ;
   private String AV20EmprNom ;
   private String AV17UsurCod ;
   private String Z407EmprNom ;
   private String edtAlbPckCaj_Inputmask ;
   private String sGXsfl_60_fel_idx="0001" ;
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
   private String edtAlbPckM1_Jsonclick ;
   private String edtAlbPckM2_Jsonclick ;
   private String edtAlbPckM3_Jsonclick ;
   private String edtAlbPckVol_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ407EmprNom ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n3622AlbPckCaj ;
   private boolean wbErr ;
   private boolean n3829AlbPckUlin ;
   private boolean n10021AlbPckVolT ;
   private boolean bGXsfl_60_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n10022AlbPckM1 ;
   private boolean n10023AlbPckM2 ;
   private boolean n3625AlbPckTar ;
   private boolean n3623AlbPckKn ;
   private boolean n3624AlbPckKb ;
   private boolean n3626AlbPckUni ;
   private boolean n10024AlbPckM3 ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00TB6_A407EmprNom ;
   private boolean[] T00TB6_n407EmprNom ;
   private String[] T00TB8_A396EmprCod ;
   private String[] T00TB7_A396EmprCod ;
   private java.math.BigDecimal[] T00TB10_A10021AlbPckVolT ;
   private boolean[] T00TB10_n10021AlbPckVolT ;
   private short[] T00TB12_A3829AlbPckUlin ;
   private boolean[] T00TB12_n3829AlbPckUlin ;
   private String[] T00TB12_A407EmprNom ;
   private boolean[] T00TB12_n407EmprNom ;
   private String[] T00TB12_A396EmprCod ;
   private int[] T00TB12_A129BarCod ;
   private byte[] T00TB12_A132BarCodReo ;
   private String[] T00TB12_A130BarCodPar ;
   private long[] T00TB12_A30AlbProCod ;
   private java.math.BigDecimal[] T00TB12_A10021AlbPckVolT ;
   private boolean[] T00TB12_n10021AlbPckVolT ;
   private String[] T00TB13_A396EmprCod ;
   private long[] T00TB13_A30AlbProCod ;
   private int[] T00TB13_A129BarCod ;
   private byte[] T00TB13_A132BarCodReo ;
   private String[] T00TB13_A130BarCodPar ;
   private short[] T00TB5_A3829AlbPckUlin ;
   private boolean[] T00TB5_n3829AlbPckUlin ;
   private String[] T00TB5_A396EmprCod ;
   private int[] T00TB5_A129BarCod ;
   private byte[] T00TB5_A132BarCodReo ;
   private String[] T00TB5_A130BarCodPar ;
   private long[] T00TB5_A30AlbProCod ;
   private String[] T00TB14_A396EmprCod ;
   private long[] T00TB14_A30AlbProCod ;
   private int[] T00TB14_A129BarCod ;
   private byte[] T00TB14_A132BarCodReo ;
   private String[] T00TB14_A130BarCodPar ;
   private String[] T00TB15_A396EmprCod ;
   private long[] T00TB15_A30AlbProCod ;
   private int[] T00TB15_A129BarCod ;
   private byte[] T00TB15_A132BarCodReo ;
   private String[] T00TB15_A130BarCodPar ;
   private short[] T00TB4_A3829AlbPckUlin ;
   private boolean[] T00TB4_n3829AlbPckUlin ;
   private String[] T00TB4_A396EmprCod ;
   private int[] T00TB4_A129BarCod ;
   private byte[] T00TB4_A132BarCodReo ;
   private String[] T00TB4_A130BarCodPar ;
   private long[] T00TB4_A30AlbProCod ;
   private String[] T00TB19_A396EmprCod ;
   private long[] T00TB19_A30AlbProCod ;
   private int[] T00TB19_A129BarCod ;
   private byte[] T00TB19_A132BarCodReo ;
   private String[] T00TB19_A130BarCodPar ;
   private short[] T00TB19_A6648AlbMetLin ;
   private String[] T00TB20_A396EmprCod ;
   private long[] T00TB20_A30AlbProCod ;
   private int[] T00TB20_A129BarCod ;
   private byte[] T00TB20_A132BarCodReo ;
   private String[] T00TB20_A130BarCodPar ;
   private short[] T00TB20_A9639Et_Numero ;
   private String[] T00TB21_A396EmprCod ;
   private long[] T00TB21_A30AlbProCod ;
   private int[] T00TB21_A129BarCod ;
   private byte[] T00TB21_A132BarCodReo ;
   private String[] T00TB21_A130BarCodPar ;
   private short[] T00TB21_A6622AlbHdRLn ;
   private String[] T00TB22_A396EmprCod ;
   private long[] T00TB22_A30AlbProCod ;
   private int[] T00TB22_A129BarCod ;
   private byte[] T00TB22_A132BarCodReo ;
   private String[] T00TB22_A130BarCodPar ;
   private short[] T00TB22_A5456P_ForLin ;
   private String[] T00TB23_A396EmprCod ;
   private long[] T00TB23_A30AlbProCod ;
   private int[] T00TB23_A129BarCod ;
   private byte[] T00TB23_A132BarCodReo ;
   private String[] T00TB23_A130BarCodPar ;
   private byte[] T00TB23_A2524DisComLin ;
   private String[] T00TB23_A1056DisComCod ;
   private String[] T00TB23_A1032FonCod ;
   private String[] T00TB24_A396EmprCod ;
   private long[] T00TB24_A3617AlbTrnCod ;
   private long[] T00TB24_A30AlbProCod ;
   private int[] T00TB24_A129BarCod ;
   private byte[] T00TB24_A132BarCodReo ;
   private String[] T00TB24_A130BarCodPar ;
   private String[] T00TB25_A396EmprCod ;
   private long[] T00TB25_A30AlbProCod ;
   private int[] T00TB25_A129BarCod ;
   private byte[] T00TB25_A132BarCodReo ;
   private String[] T00TB25_A130BarCodPar ;
   private short[] T00TB25_A2764AlbHdrLin ;
   private String[] T00TB26_A396EmprCod ;
   private long[] T00TB26_A30AlbProCod ;
   private int[] T00TB26_A129BarCod ;
   private byte[] T00TB26_A132BarCodReo ;
   private String[] T00TB26_A130BarCodPar ;
   private short[] T00TB26_A1468AlbPrdLin ;
   private String[] T00TB27_A396EmprCod ;
   private long[] T00TB27_A30AlbProCod ;
   private int[] T00TB27_A129BarCod ;
   private byte[] T00TB27_A132BarCodReo ;
   private String[] T00TB27_A130BarCodPar ;
   private String[] T00TB27_A200BarPieCod ;
   private String[] T00TB28_A396EmprCod ;
   private long[] T00TB28_A30AlbProCod ;
   private int[] T00TB28_A129BarCod ;
   private byte[] T00TB28_A132BarCodReo ;
   private String[] T00TB28_A130BarCodPar ;
   private short[] T00TB28_A1240GuiFasLin ;
   private String[] T00TB30_A396EmprCod ;
   private long[] T00TB30_A30AlbProCod ;
   private int[] T00TB30_A129BarCod ;
   private byte[] T00TB30_A132BarCodReo ;
   private String[] T00TB30_A130BarCodPar ;
   private long[] T00TB31_A30AlbProCod ;
   private short[] T00TB31_A3621AlbPckLin ;
   private java.math.BigDecimal[] T00TB31_A3625AlbPckTar ;
   private boolean[] T00TB31_n3625AlbPckTar ;
   private java.math.BigDecimal[] T00TB31_A10022AlbPckM1 ;
   private boolean[] T00TB31_n10022AlbPckM1 ;
   private java.math.BigDecimal[] T00TB31_A10023AlbPckM2 ;
   private boolean[] T00TB31_n10023AlbPckM2 ;
   private String[] T00TB31_A3622AlbPckCaj ;
   private boolean[] T00TB31_n3622AlbPckCaj ;
   private java.math.BigDecimal[] T00TB31_A3623AlbPckKn ;
   private boolean[] T00TB31_n3623AlbPckKn ;
   private java.math.BigDecimal[] T00TB31_A3624AlbPckKb ;
   private boolean[] T00TB31_n3624AlbPckKb ;
   private short[] T00TB31_A3626AlbPckUni ;
   private boolean[] T00TB31_n3626AlbPckUni ;
   private java.math.BigDecimal[] T00TB31_A10024AlbPckM3 ;
   private boolean[] T00TB31_n10024AlbPckM3 ;
   private String[] T00TB31_A396EmprCod ;
   private int[] T00TB31_A129BarCod ;
   private byte[] T00TB31_A132BarCodReo ;
   private String[] T00TB31_A130BarCodPar ;
   private String[] T00TB32_A396EmprCod ;
   private long[] T00TB32_A30AlbProCod ;
   private int[] T00TB32_A129BarCod ;
   private byte[] T00TB32_A132BarCodReo ;
   private String[] T00TB32_A130BarCodPar ;
   private short[] T00TB32_A3621AlbPckLin ;
   private long[] T00TB3_A30AlbProCod ;
   private short[] T00TB3_A3621AlbPckLin ;
   private java.math.BigDecimal[] T00TB3_A3625AlbPckTar ;
   private boolean[] T00TB3_n3625AlbPckTar ;
   private java.math.BigDecimal[] T00TB3_A10022AlbPckM1 ;
   private boolean[] T00TB3_n10022AlbPckM1 ;
   private java.math.BigDecimal[] T00TB3_A10023AlbPckM2 ;
   private boolean[] T00TB3_n10023AlbPckM2 ;
   private String[] T00TB3_A3622AlbPckCaj ;
   private boolean[] T00TB3_n3622AlbPckCaj ;
   private java.math.BigDecimal[] T00TB3_A3623AlbPckKn ;
   private boolean[] T00TB3_n3623AlbPckKn ;
   private java.math.BigDecimal[] T00TB3_A3624AlbPckKb ;
   private boolean[] T00TB3_n3624AlbPckKb ;
   private short[] T00TB3_A3626AlbPckUni ;
   private boolean[] T00TB3_n3626AlbPckUni ;
   private java.math.BigDecimal[] T00TB3_A10024AlbPckM3 ;
   private boolean[] T00TB3_n10024AlbPckM3 ;
   private String[] T00TB3_A396EmprCod ;
   private int[] T00TB3_A129BarCod ;
   private byte[] T00TB3_A132BarCodReo ;
   private String[] T00TB3_A130BarCodPar ;
   private long[] T00TB2_A30AlbProCod ;
   private short[] T00TB2_A3621AlbPckLin ;
   private java.math.BigDecimal[] T00TB2_A3625AlbPckTar ;
   private boolean[] T00TB2_n3625AlbPckTar ;
   private java.math.BigDecimal[] T00TB2_A10022AlbPckM1 ;
   private boolean[] T00TB2_n10022AlbPckM1 ;
   private java.math.BigDecimal[] T00TB2_A10023AlbPckM2 ;
   private boolean[] T00TB2_n10023AlbPckM2 ;
   private String[] T00TB2_A3622AlbPckCaj ;
   private boolean[] T00TB2_n3622AlbPckCaj ;
   private java.math.BigDecimal[] T00TB2_A3623AlbPckKn ;
   private boolean[] T00TB2_n3623AlbPckKn ;
   private java.math.BigDecimal[] T00TB2_A3624AlbPckKb ;
   private boolean[] T00TB2_n3624AlbPckKb ;
   private short[] T00TB2_A3626AlbPckUni ;
   private boolean[] T00TB2_n3626AlbPckUni ;
   private java.math.BigDecimal[] T00TB2_A10024AlbPckM3 ;
   private boolean[] T00TB2_n10024AlbPckM3 ;
   private String[] T00TB2_A396EmprCod ;
   private int[] T00TB2_A129BarCod ;
   private byte[] T00TB2_A132BarCodReo ;
   private String[] T00TB2_A130BarCodPar ;
   private String[] T00TB36_A396EmprCod ;
   private long[] T00TB36_A30AlbProCod ;
   private int[] T00TB36_A129BarCod ;
   private byte[] T00TB36_A132BarCodReo ;
   private String[] T00TB36_A130BarCodPar ;
   private short[] T00TB36_A3621AlbPckLin ;
   private String[] T00TB37_A407EmprNom ;
   private boolean[] T00TB37_n407EmprNom ;
   private String[] T00TB38_A396EmprCod ;
   private String[] T00TB39_A396EmprCod ;
   private java.math.BigDecimal[] T00TB41_A10021AlbPckVolT ;
   private boolean[] T00TB41_n10021AlbPckVolT ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class talbpkb__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbpkb__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbpkb__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbpkb__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbpkb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00TB2", "SELECT AlbProCod, AlbPckLin, AlbPckTar, AlbPckM1, AlbPckM2, AlbPckCaj, AlbPckKn, AlbPckKb, AlbPckUni, AlbPckM3, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPALBPCK WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbPckLin = ?  FOR UPDATE OF AlbPckTar, AlbPckM1, AlbPckM2, AlbPckCaj, AlbPckKn, AlbPckKb, AlbPckUni, AlbPckM3 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TB3", "SELECT AlbProCod, AlbPckLin, AlbPckTar, AlbPckM1, AlbPckM2, AlbPckCaj, AlbPckKn, AlbPckKb, AlbPckUni, AlbPckM3, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPALBPCK WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbPckLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TB4", "SELECT AlbPckUlin, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF AlbPckUlin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TB5", "SELECT AlbPckUlin, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TB6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TB7", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TB8", "SELECT EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TB10", "SELECT COALESCE( T1.AlbPckVolT, 0) AS AlbPckVolT FROM (SELECT SUM(( COALESCE( AlbPckM1, 0) * CAST(COALESCE( AlbPckM2, 0) AS NUMERIC(16,10)) * CAST(COALESCE( AlbPckM3, 0) AS NUMERIC(20,10)))) AS AlbPckVolT, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBPCK GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.AlbProCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TB12", "SELECT /*+ FIRST_ROWS(1) */ TM1.AlbPckUlin, T2.EmprNom, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.AlbProCod, COALESCE( T3.AlbPckVolT, 0) AS AlbPckVolT FROM ((TXPALBBAR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(( COALESCE( AlbPckM1, 0) * CAST(COALESCE( AlbPckM2, 0) AS NUMERIC(16,10)) * CAST(COALESCE( AlbPckM3, 0) AS NUMERIC(20,10)))) AS AlbPckVolT, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBPCK GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.AlbProCod = TM1.AlbProCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) WHERE TM1.EmprCod = ? and TM1.AlbProCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.AlbProCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TB13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TB14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TB15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod DESC, AlbProCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00TB16", "INSERT INTO TXPALBBAR(AlbPckUlin, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod, AlbProEsp, AlbProRec, TubCod, BarAlbKgmE, BarAlbMtrE, BarAlbPie, BarAlbTub, GuiFasULin, BarPreKgm, BarPreMtr, AlbPConPie, BarAlbBul, BarAlbTar, BarAlbFor, BarAlbTip, BarAlbPN, AlbPrdULin, IntCod, BarAlbPbr, ManCod, BarFasExt, BarFasExtD, BarAlbObs, BarAlbExt, BarAlbTin, AlbHdrObs, AlbBarRec, AlbBarDto, AlbHdrUlin, AlbProVal, AlbTipCon, AlbHdrAnc, CodCod, AlbSer, AlbColNom, AlbColNum, AlbTipCol, AlbEncCli, AlbHdrgm2, TipAcaCod, AlbTipEnt, AlbImpMan, P_ForULin, PlasCod, BarAlbPlas, AlbHdRUl, AlbObsM, BarPreFKg, BarPreFMt, BarPreTKg, BarPreTMt, AlbEncL, AlbEncA, AlbCald, AlbDf1, AlbDf2, AlbDf3, AlbMqTj, AlbDto, AlbSerD, Et_UltNum, BarKgsCli, AlbMetULi, AlbCliCod, BarPreUnd, BarAlbUnd, AlbNomCli, AlbNumcli, AlbTipArt, AlbCadEnc, AlbTiras, AlbTirasKg, AlbSinTest) VALUES(?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPALBBAR")
         ,new UpdateCursor("T00TB17", "UPDATE TXPALBBAR SET AlbPckUlin=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new UpdateCursor("T00TB18", "DELETE FROM TXPALBBAR  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new ForEachCursor("T00TB19", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbMetLin FROM TXPMETCAL WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TB20", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, Et_Numero FROM TXPEDIETI WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TB21", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TB22", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, P_ForLin FROM TXPALBQUI WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TB23", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPALBEST WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TB24", "SELECT * FROM (SELECT EmprCod, AlbTrnCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPLALBTR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TB25", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin FROM TXPALBTXT WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TB26", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPrdLin FROM TXPALBPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TB27", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TB28", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00TB29", "UPDATE TXPALBBAR SET AlbPckUlin=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new ForEachCursor("T00TB30", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TB31", "SELECT AlbProCod, AlbPckLin, AlbPckTar, AlbPckM1, AlbPckM2, AlbPckCaj, AlbPckKn, AlbPckKb, AlbPckUni, AlbPckM3, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPALBPCK WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and AlbPckLin = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPckLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TB32", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPckLin FROM TXPALBPCK WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbPckLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00TB33", "INSERT INTO TXPALBPCK(AlbProCod, AlbPckLin, AlbPckTar, AlbPckM1, AlbPckM2, AlbPckCaj, AlbPckKn, AlbPckKb, AlbPckUni, AlbPckM3, EmprCod, BarCod, BarCodReo, BarCodPar, AlbPckCal) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK, "TXPALBPCK")
         ,new UpdateCursor("T00TB34", "UPDATE TXPALBPCK SET AlbPckTar=?, AlbPckM1=?, AlbPckM2=?, AlbPckCaj=?, AlbPckKn=?, AlbPckKb=?, AlbPckUni=?, AlbPckM3=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbPckLin = ?", GX_NOMASK, "TXPALBPCK")
         ,new UpdateCursor("T00TB35", "DELETE FROM TXPALBPCK  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbPckLin = ?", GX_NOMASK, "TXPALBPCK")
         ,new ForEachCursor("T00TB36", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPckLin FROM TXPALBPCK WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPckLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TB37", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TB38", "SELECT EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TB39", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TB41", "SELECT COALESCE( T1.AlbPckVolT, 0) AS AlbPckVolT FROM (SELECT SUM(( COALESCE( AlbPckM1, 0) * CAST(COALESCE( AlbPckM2, 0) AS NUMERIC(16,10)) * CAST(COALESCE( AlbPckM3, 0) AS NUMERIC(20,10)))) AS AlbPckVolT, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBPCK GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.AlbProCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 12);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 3);
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((byte[]) buf[20])[0] = rslt.getByte(13);
               ((String[]) buf[21])[0] = rslt.getString(14, 1);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 12);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 3);
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((byte[]) buf[20])[0] = rslt.getByte(13);
               ((String[]) buf[21])[0] = rslt.getString(14, 1);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((long[]) buf[6])[0] = rslt.getLong(6);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((long[]) buf[6])[0] = rslt.getLong(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((long[]) buf[8])[0] = rslt.getLong(7);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
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
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 27 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 12);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 3);
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((byte[]) buf[20])[0] = rslt.getByte(13);
               ((String[]) buf[21])[0] = rslt.getString(14, 1);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 36 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setLong(6, ((Number) parms[6]).longValue());
               return;
            case 13 :
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 25 :
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
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 29 :
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
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 12);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[17], 2);
               }
               stmt.setString(11, (String)parms[18], 3);
               stmt.setInt(12, ((Number) parms[19]).intValue());
               stmt.setByte(13, ((Number) parms[20]).byteValue());
               stmt.setString(14, (String)parms[21], 1);
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
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 12);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
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
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 2);
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setLong(10, ((Number) parms[17]).longValue());
               stmt.setInt(11, ((Number) parms[18]).intValue());
               stmt.setByte(12, ((Number) parms[19]).byteValue());
               stmt.setString(13, (String)parms[20], 1);
               stmt.setShort(14, ((Number) parms[21]).shortValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

