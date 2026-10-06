package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrn23_impl extends GXDataArea
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
            A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            Gx_mode = httpContext.GetPar( "Mode") ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Lineas Libres", ""), (short)(0)) ;
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
      A2763AlbHdrUlin = (short)(GXutil.lval( httpContext.GetPar( "AlbHdrUlin"))) ;
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

   public ttrn23_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrn23_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn23_impl.class ));
   }

   public ttrn23_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn23.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn23.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn23.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn23.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTrn23.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn23.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn23.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Numero Albaran Produccion", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn23.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "", "", "", "", "", 1, edtAlbProCod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn23.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn23.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn23.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn23.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn23.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn23.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn23.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn23.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Ultima Linea Entrada", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn23.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHdrUlin_Internalname, GXutil.ltrim( localUtil.ntoc( A2763AlbHdrUlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbHdrUlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2763AlbHdrUlin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2763AlbHdrUlin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHdrUlin_Jsonclick, 0, "", "", "", "", "", 1, edtAlbHdrUlin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn23.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Peso Neto Calculado", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn23.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAlbPne_Internalname, GXutil.ltrim( localUtil.ntoc( A2027BarAlbPne, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAlbPne_Enabled!=0) ? localUtil.format( A2027BarAlbPne, "ZZZZZ9.99") : localUtil.format( A2027BarAlbPne, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAlbPne_Jsonclick, 0, "", "", "", "", "", 1, edtBarAlbPne_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn23.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "EmpNumDec", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn23.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpNumDec_Internalname, GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEmpNumDec_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3915EmpNumDec), "9") : localUtil.format( DecimalUtil.doubleToDec(A3915EmpNumDec), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpNumDec_Jsonclick, 0, "", "", "", "", "", 1, edtEmpNumDec_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn23.htm");
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
         nBlankRcdCount402 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_402 = (short)(1) ;
            scanStart1M7402( ) ;
            while ( RcdFound402 != 0 )
            {
               init_level_properties402( ) ;
               getByPrimaryKey1M7402( ) ;
               addRow1M7402( ) ;
               scanNext1M7402( ) ;
            }
            scanEnd1M7402( ) ;
            nBlankRcdCount402 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B2763AlbHdrUlin = A2763AlbHdrUlin ;
         httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
         standaloneNotModal1M7402( ) ;
         standaloneModal1M7402( ) ;
         sMode402 = Gx_mode ;
         while ( nGXsfl_60_idx < nRC_GXsfl_60 )
         {
            bGXsfl_60_Refreshing = true ;
            readRow1M7402( ) ;
            edtavnRcdDeleted_402_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_402_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_402_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_402_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtAlbHdrLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRLIN_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtAlbHdrTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRTXT_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrTxt_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtAlbHdrRD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRRD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrRD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrRD_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtAlbHdrPKg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRPKG_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrPKg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrPKg_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtAlbHdrKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRKGS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrKgs_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtAlbHdrPMt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRPMT_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrPMt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrPMt_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtALbHdrMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRMTS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtALbHdrMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALbHdrMts_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtALbHdrImp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRIMP_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtALbHdrImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALbHdrImp_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtAlbHdrTip_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRTIP_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrTip_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtAlbTxtCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBTXTCOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbTxtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTxtCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            if ( ( nRcdExists_402 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1M7402( ) ;
            }
            sendRow1M7402( ) ;
            bGXsfl_60_Refreshing = false ;
         }
         Gx_mode = sMode402 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A2763AlbHdrUlin = B2763AlbHdrUlin ;
         httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount402 = (short)(5) ;
         nRcdExists_402 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1M7402( ) ;
            while ( RcdFound402 != 0 )
            {
               sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_60402( ) ;
               init_level_properties402( ) ;
               standaloneNotModal1M7402( ) ;
               getByPrimaryKey1M7402( ) ;
               standaloneModal1M7402( ) ;
               addRow1M7402( ) ;
               scanNext1M7402( ) ;
            }
            scanEnd1M7402( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode402 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_60402( ) ;
         initAll1M7402( ) ;
         init_level_properties402( ) ;
         B2763AlbHdrUlin = A2763AlbHdrUlin ;
         httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
         nRcdExists_402 = (short)(0) ;
         nIsMod_402 = (short)(0) ;
         nRcdDeleted_402 = (short)(0) ;
         nBlankRcdCount402 = (short)(nBlankRcdUsr402+nBlankRcdCount402) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount402 > 0 )
         {
            standaloneNotModal1M7402( ) ;
            standaloneModal1M7402( ) ;
            addRow1M7402( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtAlbHdrLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount402 = (short)(nBlankRcdCount402-1) ;
         }
         Gx_mode = sMode402 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A2763AlbHdrUlin = B2763AlbHdrUlin ;
         httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
      }
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn23.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn23.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn23.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn23.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTrn23.htm");
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
      e111M72 ();
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
            Z2763AlbHdrUlin = (short)(localUtil.ctol( httpContext.cgiGet( "Z2763AlbHdrUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2026BarAlbPbr = localUtil.ctond( httpContext.cgiGet( "Z2026BarAlbPbr")) ;
            Z1462BarAlbTar = localUtil.ctond( httpContext.cgiGet( "Z1462BarAlbTar")) ;
            A2026BarAlbPbr = localUtil.ctond( httpContext.cgiGet( "Z2026BarAlbPbr")) ;
            n2026BarAlbPbr = false ;
            A1462BarAlbTar = localUtil.ctond( httpContext.cgiGet( "Z1462BarAlbTar")) ;
            n1462BarAlbTar = false ;
            O2763AlbHdrUlin = (short)(localUtil.ctol( httpContext.cgiGet( "O2763AlbHdrUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_60 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_60"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2026BarAlbPbr = localUtil.ctond( httpContext.cgiGet( "BARALBPBR")) ;
            A1462BarAlbTar = localUtil.ctond( httpContext.cgiGet( "BARALBTAR")) ;
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
            A2763AlbHdrUlin = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdrUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
            A2027BarAlbPne = localUtil.ctond( httpContext.cgiGet( edtBarAlbPne_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2027BarAlbPne", GXutil.ltrimstr( A2027BarAlbPne, 9, 2));
            A3915EmpNumDec = (byte)(localUtil.ctol( httpContext.cgiGet( edtEmpNumDec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3915EmpNumDec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TTrn23");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("BarAlbPbr", localUtil.format( A2026BarAlbPbr, "ZZZZZ9.99"));
            forbiddenHiddens.add("BarAlbTar", localUtil.format( A1462BarAlbTar, "ZZZZZ9.99"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ttrn23:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               disable_std_buttons( ) ;
               standaloneModal( ) ;
            }
            else
            {
               if ( isDsp( ) )
               {
                  sMode195 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode195 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound195 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1M70( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "EMPRCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEmprCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
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
                        e111M72 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! isDsp( ) )
                        {
                           btn_enter( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "CHECK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! isDsp( ) )
                        {
                           btn_check( ) ;
                        }
                        /* No code required for Help button. It is implemented at the Browser level. */
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
            initAll1M7195( ) ;
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
      if ( isDsp( ) || isDlt( ) )
      {
         bttBtn_delete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
         if ( isDsp( ) )
         {
            bttBtn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
         }
         disableAttributes1M7195( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_402_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_402_Enabled), 5, 0), !bGXsfl_60_Refreshing);
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

   public void confirm_1M70( )
   {
      beforeValidate1M7195( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1M7195( ) ;
         }
         else
         {
            checkExtendedTable1M7195( ) ;
            if ( AnyError == 0 )
            {
               zm1M7195( 8) ;
               zm1M7195( 9) ;
               zm1M7195( 10) ;
            }
            closeExtendedTableCursors1M7195( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode195 = Gx_mode ;
         confirm_1M7402( ) ;
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
         confirmValues1M70( ) ;
      }
   }

   public void confirm_1M7402( )
   {
      s2763AlbHdrUlin = O2763AlbHdrUlin ;
      httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow1M7402( ) ;
         if ( ( nRcdExists_402 != 0 ) || ( nIsMod_402 != 0 ) )
         {
            getKey1M7402( ) ;
            if ( ( nRcdExists_402 == 0 ) && ( nRcdDeleted_402 == 0 ) )
            {
               if ( RcdFound402 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1M7402( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1M7402( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1M7402( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O2763AlbHdrUlin = A2763AlbHdrUlin ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "ALBHDRLIN_" + sGXsfl_60_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbHdrLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound402 != 0 )
               {
                  if ( nRcdDeleted_402 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1M7402( ) ;
                     load1M7402( ) ;
                     beforeValidate1M7402( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1M7402( ) ;
                        O2763AlbHdrUlin = A2763AlbHdrUlin ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_402 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1M7402( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1M7402( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1M7402( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O2763AlbHdrUlin = A2763AlbHdrUlin ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_402 == 0 )
                  {
                     GXCCtl = "ALBHDRLIN_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbHdrLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_402_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_402, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdrLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2764AlbHdrLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdrTxt_Internalname, GXutil.rtrim( A2765AlbHdrTxt)) ;
         httpContext.changePostValue( edtAlbHdrRD_Internalname, GXutil.ltrim( localUtil.ntoc( A2766AlbHdrRD, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdrPKg_Internalname, GXutil.ltrim( localUtil.ntoc( A2767AlbHdrPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdrKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A2768AlbHdrKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdrPMt_Internalname, GXutil.ltrim( localUtil.ntoc( A2769AlbHdrPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtALbHdrMts_Internalname, GXutil.ltrim( localUtil.ntoc( A2770ALbHdrMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtALbHdrImp_Internalname, GXutil.ltrim( localUtil.ntoc( A2771ALbHdrImp, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdrTip_Internalname, GXutil.rtrim( A2772AlbHdrTip)) ;
         httpContext.changePostValue( edtAlbTxtCod_Internalname, GXutil.rtrim( A3614AlbTxtCod)) ;
         httpContext.changePostValue( "ZT_"+"Z2764AlbHdrLin_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z2764AlbHdrLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2771ALbHdrImp_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z2771ALbHdrImp, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2765AlbHdrTxt_"+sGXsfl_60_idx, GXutil.rtrim( Z2765AlbHdrTxt)) ;
         httpContext.changePostValue( "ZT_"+"Z2766AlbHdrRD_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z2766AlbHdrRD, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2767AlbHdrPKg_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z2767AlbHdrPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2768AlbHdrKgs_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z2768AlbHdrKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2769AlbHdrPMt_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z2769AlbHdrPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2770ALbHdrMts_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z2770ALbHdrMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2772AlbHdrTip_"+sGXsfl_60_idx, GXutil.rtrim( Z2772AlbHdrTip)) ;
         httpContext.changePostValue( "ZT_"+"Z3614AlbTxtCod_"+sGXsfl_60_idx, GXutil.rtrim( Z3614AlbTxtCod)) ;
         httpContext.changePostValue( "T2769AlbHdrPMt_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O2769AlbHdrPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2770ALbHdrMts_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O2770ALbHdrMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2767AlbHdrPKg_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O2767AlbHdrPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2768AlbHdrKgs_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O2768AlbHdrKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2771ALbHdrImp_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O2771ALbHdrImp, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_402_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_402, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_402_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_402, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_402_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_402, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_402 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_402_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_402_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRLIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRTXT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRRD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrRD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRPKG_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrPKg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRKGS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRPMT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrPMt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRMTS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALbHdrMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRIMP_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALbHdrImp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRTIP_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrTip_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBTXTCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbTxtCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O2763AlbHdrUlin = s2763AlbHdrUlin ;
      httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1M70( )
   {
   }

   public void e111M72( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(8), GXv_char2) ;
      ttrn23_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      ttrn23_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV10EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttrn23_impl.this.AV10EmprCod = GXv_char2[0] ;
      ttrn23_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttrn23_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1M7195( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2763AlbHdrUlin = T01M75_A2763AlbHdrUlin[0] ;
            Z2026BarAlbPbr = T01M75_A2026BarAlbPbr[0] ;
            Z1462BarAlbTar = T01M75_A1462BarAlbTar[0] ;
         }
         else
         {
            Z2763AlbHdrUlin = A2763AlbHdrUlin ;
            Z2026BarAlbPbr = A2026BarAlbPbr ;
            Z1462BarAlbTar = A1462BarAlbTar ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z2763AlbHdrUlin = A2763AlbHdrUlin ;
         Z2026BarAlbPbr = A2026BarAlbPbr ;
         Z1462BarAlbTar = A1462BarAlbTar ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z30AlbProCod = A30AlbProCod ;
         Z3915EmpNumDec = A3915EmpNumDec ;
      }
   }

   public void standaloneNotModal( )
   {
      edtAlbHdrUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrUlin_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtAlbHdrUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrUlin_Enabled), 5, 0), true);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      /* Using cursor T01M76 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A3915EmpNumDec = T01M76_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T01M76_n3915EmpNumDec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
      pr_default.close(4);
      /* Using cursor T01M78 */
      pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(6);
      /* Using cursor T01M77 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      pr_default.close(5);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  || isUpd( )  || isDsp( ) || isDlt( )  )
      {
         bttBtn_get_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_get_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
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

   public void load1M7195( )
   {
      /* Using cursor T01M79 */
      pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound195 = (short)(1) ;
         A2763AlbHdrUlin = T01M79_A2763AlbHdrUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
         A3915EmpNumDec = T01M79_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T01M79_n3915EmpNumDec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
         A2026BarAlbPbr = T01M79_A2026BarAlbPbr[0] ;
         n2026BarAlbPbr = T01M79_n2026BarAlbPbr[0] ;
         A1462BarAlbTar = T01M79_A1462BarAlbTar[0] ;
         n1462BarAlbTar = T01M79_n1462BarAlbTar[0] ;
         zm1M7195( -7) ;
      }
      pr_default.close(7);
      onLoadActions1M7195( ) ;
   }

   public void onLoadActions1M7195( )
   {
      A2027BarAlbPne = (A2026BarAlbPbr.subtract(A1462BarAlbTar)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2027BarAlbPne", GXutil.ltrimstr( A2027BarAlbPne, 9, 2));
   }

   public void checkExtendedTable1M7195( )
   {
      nIsDirty_195 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      nIsDirty_195 = (short)(1) ;
      A2027BarAlbPne = (A2026BarAlbPbr.subtract(A1462BarAlbTar)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2027BarAlbPne", GXutil.ltrimstr( A2027BarAlbPne, 9, 2));
   }

   public void closeExtendedTableCursors1M7195( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1M7195( )
   {
      /* Using cursor T01M710 */
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
      /* Using cursor T01M75 */
      pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01M75_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01M75_A129BarCod[0] == A129BarCod ) && ( T01M75_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01M75_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01M75_A30AlbProCod[0] == A30AlbProCod ) )
      {
         zm1M7195( 7) ;
         RcdFound195 = (short)(1) ;
         A2763AlbHdrUlin = T01M75_A2763AlbHdrUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
         A2026BarAlbPbr = T01M75_A2026BarAlbPbr[0] ;
         n2026BarAlbPbr = T01M75_n2026BarAlbPbr[0] ;
         A1462BarAlbTar = T01M75_A1462BarAlbTar[0] ;
         n1462BarAlbTar = T01M75_n1462BarAlbTar[0] ;
         O2763AlbHdrUlin = A2763AlbHdrUlin ;
         httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode195 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1M7195( ) ;
         if ( AnyError == 1 )
         {
            RcdFound195 = (short)(0) ;
            initializeNonKey1M7195( ) ;
         }
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound195 = (short)(0) ;
         initializeNonKey1M7195( ) ;
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
      getKey1M7195( ) ;
      if ( RcdFound195 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound195 = (short)(0) ;
      /* Using cursor T01M711 */
      pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01M711_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01M711_A30AlbProCod[0] == A30AlbProCod ) && ( T01M711_A129BarCod[0] == A129BarCod ) && ( T01M711_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01M711_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01M711_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01M711_A30AlbProCod[0] == A30AlbProCod ) && ( T01M711_A129BarCod[0] == A129BarCod ) && ( T01M711_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01M711_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound195 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound195 = (short)(0) ;
      /* Using cursor T01M712 */
      pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01M712_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01M712_A30AlbProCod[0] == A30AlbProCod ) && ( T01M712_A129BarCod[0] == A129BarCod ) && ( T01M712_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01M712_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01M712_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01M712_A30AlbProCod[0] == A30AlbProCod ) && ( T01M712_A129BarCod[0] == A129BarCod ) && ( T01M712_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01M712_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound195 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1M7195( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A2763AlbHdrUlin = O2763AlbHdrUlin ;
         httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
         insert1M7195( ) ;
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
               A2763AlbHdrUlin = O2763AlbHdrUlin ;
               httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               /* Update record */
               A2763AlbHdrUlin = O2763AlbHdrUlin ;
               httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
               update1M7195( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               /* Insert record */
               A2763AlbHdrUlin = O2763AlbHdrUlin ;
               httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
               insert1M7195( ) ;
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
                  /* Insert record */
                  A2763AlbHdrUlin = O2763AlbHdrUlin ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
                  insert1M7195( ) ;
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
      if ( isIns( ) || isUpd( ) || isDlt( ) )
      {
         if ( AnyError == 0 )
         {
            httpContext.nUserReturn = (byte)(1) ;
         }
      }
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
         A2763AlbHdrUlin = O2763AlbHdrUlin ;
         httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
         delete( ) ;
         afterTrn( ) ;
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void btn_check( )
   {
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getKey1M7195( ) ;
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
            update_check( ) ;
         }
      }
      else
      {
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
         {
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
               insert_check( ) ;
            }
         }
      }
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn23");
   }

   public void insert_check( )
   {
      confirm_1M70( ) ;
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

   public void checkOptimisticConcurrency1M7195( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01M74 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z2763AlbHdrUlin != T01M74_A2763AlbHdrUlin[0] ) || ( DecimalUtil.compareTo(Z2026BarAlbPbr, T01M74_A2026BarAlbPbr[0]) != 0 ) || ( DecimalUtil.compareTo(Z1462BarAlbTar, T01M74_A1462BarAlbTar[0]) != 0 ) )
         {
            if ( Z2763AlbHdrUlin != T01M74_A2763AlbHdrUlin[0] )
            {
               GXutil.writeLogln("ttrn23:[seudo value changed for attri]"+"AlbHdrUlin");
               GXutil.writeLogRaw("Old: ",Z2763AlbHdrUlin);
               GXutil.writeLogRaw("Current: ",T01M74_A2763AlbHdrUlin[0]);
            }
            if ( DecimalUtil.compareTo(Z2026BarAlbPbr, T01M74_A2026BarAlbPbr[0]) != 0 )
            {
               GXutil.writeLogln("ttrn23:[seudo value changed for attri]"+"BarAlbPbr");
               GXutil.writeLogRaw("Old: ",Z2026BarAlbPbr);
               GXutil.writeLogRaw("Current: ",T01M74_A2026BarAlbPbr[0]);
            }
            if ( DecimalUtil.compareTo(Z1462BarAlbTar, T01M74_A1462BarAlbTar[0]) != 0 )
            {
               GXutil.writeLogln("ttrn23:[seudo value changed for attri]"+"BarAlbTar");
               GXutil.writeLogRaw("Old: ",Z1462BarAlbTar);
               GXutil.writeLogRaw("Current: ",T01M74_A1462BarAlbTar[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBBAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1M7195( )
   {
      beforeValidate1M7195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M7195( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1M7195( 0) ;
         checkOptimisticConcurrency1M7195( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1M7195( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1M7195( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01M713 */
                  pr_default.execute(11, new Object[] {Short.valueOf(A2763AlbHdrUlin), Boolean.valueOf(n2026BarAlbPbr), A2026BarAlbPbr, Boolean.valueOf(n1462BarAlbTar), A1462BarAlbTar, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
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
                        processLevel1M7195( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isIns( ) || isUpd( ) || isDlt( ) )
                           {
                              if ( AnyError == 0 )
                              {
                                 httpContext.nUserReturn = (byte)(1) ;
                              }
                           }
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
            load1M7195( ) ;
         }
         endLevel1M7195( ) ;
      }
      closeExtendedTableCursors1M7195( ) ;
   }

   public void update1M7195( )
   {
      beforeValidate1M7195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M7195( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1M7195( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1M7195( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1M7195( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01M714 */
                  pr_default.execute(12, new Object[] {Short.valueOf(A2763AlbHdrUlin), Boolean.valueOf(n2026BarAlbPbr), A2026BarAlbPbr, Boolean.valueOf(n1462BarAlbTar), A1462BarAlbTar, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1M7195( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1M7195( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isIns( ) || isUpd( ) || isDlt( ) )
                           {
                              if ( AnyError == 0 )
                              {
                                 httpContext.nUserReturn = (byte)(1) ;
                              }
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
         }
         endLevel1M7195( ) ;
      }
      closeExtendedTableCursors1M7195( ) ;
   }

   public void deferredUpdate1M7195( )
   {
   }

   public void delete( )
   {
      beforeValidate1M7195( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1M7195( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1M7195( ) ;
         afterConfirm1M7195( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1M7195( ) ;
            if ( AnyError == 0 )
            {
               A2763AlbHdrUlin = O2763AlbHdrUlin ;
               httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
               scanStart1M7402( ) ;
               while ( RcdFound402 != 0 )
               {
                  getByPrimaryKey1M7402( ) ;
                  delete1M7402( ) ;
                  scanNext1M7402( ) ;
                  O2763AlbHdrUlin = A2763AlbHdrUlin ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
               }
               scanEnd1M7402( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01M715 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        if ( isIns( ) || isUpd( ) || isDlt( ) )
                        {
                           if ( AnyError == 0 )
                           {
                              httpContext.nUserReturn = (byte)(1) ;
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
         }
      }
      sMode195 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1M7195( ) ;
      Gx_mode = sMode195 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1M7195( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A2027BarAlbPne = (A2026BarAlbPbr.subtract(A1462BarAlbTar)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2027BarAlbPne", GXutil.ltrimstr( A2027BarAlbPne, 9, 2));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01M716 */
         pr_default.execute(14, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "METCAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01M717 */
         pr_default.execute(15, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EDIETI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01M718 */
         pr_default.execute(16, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREPg", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01M719 */
         pr_default.execute(17, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01M720 */
         pr_default.execute(18, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBEST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01M721 */
         pr_default.execute(19, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALBTRA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01M722 */
         pr_default.execute(20, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBPCK", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01M723 */
         pr_default.execute(21, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01M724 */
         pr_default.execute(22, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01M725 */
         pr_default.execute(23, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
      }
   }

   public void processNestedLevel1M7402( )
   {
      s2763AlbHdrUlin = O2763AlbHdrUlin ;
      httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow1M7402( ) ;
         if ( ( nRcdExists_402 != 0 ) || ( nIsMod_402 != 0 ) )
         {
            standaloneNotModal1M7402( ) ;
            getKey1M7402( ) ;
            if ( ( nRcdExists_402 == 0 ) && ( nRcdDeleted_402 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1M7402( ) ;
            }
            else
            {
               if ( RcdFound402 != 0 )
               {
                  if ( ( nRcdDeleted_402 != 0 ) && ( nRcdExists_402 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1M7402( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_402 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1M7402( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_402 == 0 )
                  {
                     GXCCtl = "ALBHDRLIN_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbHdrLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O2763AlbHdrUlin = A2763AlbHdrUlin ;
            httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_402_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_402, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdrLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2764AlbHdrLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdrTxt_Internalname, GXutil.rtrim( A2765AlbHdrTxt)) ;
         httpContext.changePostValue( edtAlbHdrRD_Internalname, GXutil.ltrim( localUtil.ntoc( A2766AlbHdrRD, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdrPKg_Internalname, GXutil.ltrim( localUtil.ntoc( A2767AlbHdrPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdrKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A2768AlbHdrKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdrPMt_Internalname, GXutil.ltrim( localUtil.ntoc( A2769AlbHdrPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtALbHdrMts_Internalname, GXutil.ltrim( localUtil.ntoc( A2770ALbHdrMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtALbHdrImp_Internalname, GXutil.ltrim( localUtil.ntoc( A2771ALbHdrImp, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdrTip_Internalname, GXutil.rtrim( A2772AlbHdrTip)) ;
         httpContext.changePostValue( edtAlbTxtCod_Internalname, GXutil.rtrim( A3614AlbTxtCod)) ;
         httpContext.changePostValue( "ZT_"+"Z2764AlbHdrLin_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z2764AlbHdrLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2771ALbHdrImp_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z2771ALbHdrImp, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2765AlbHdrTxt_"+sGXsfl_60_idx, GXutil.rtrim( Z2765AlbHdrTxt)) ;
         httpContext.changePostValue( "ZT_"+"Z2766AlbHdrRD_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z2766AlbHdrRD, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2767AlbHdrPKg_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z2767AlbHdrPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2768AlbHdrKgs_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z2768AlbHdrKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2769AlbHdrPMt_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z2769AlbHdrPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2770ALbHdrMts_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z2770ALbHdrMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2772AlbHdrTip_"+sGXsfl_60_idx, GXutil.rtrim( Z2772AlbHdrTip)) ;
         httpContext.changePostValue( "ZT_"+"Z3614AlbTxtCod_"+sGXsfl_60_idx, GXutil.rtrim( Z3614AlbTxtCod)) ;
         httpContext.changePostValue( "T2769AlbHdrPMt_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O2769AlbHdrPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2770ALbHdrMts_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O2770ALbHdrMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2767AlbHdrPKg_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O2767AlbHdrPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2768AlbHdrKgs_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O2768AlbHdrKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2771ALbHdrImp_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O2771ALbHdrImp, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_402_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_402, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_402_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_402, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_402_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_402, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_402 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_402_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_402_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRLIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRTXT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRRD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrRD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRPKG_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrPKg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRKGS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRPMT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrPMt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRMTS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALbHdrMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRIMP_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALbHdrImp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRTIP_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrTip_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBTXTCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbTxtCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1M7402( ) ;
      if ( AnyError != 0 )
      {
         O2763AlbHdrUlin = s2763AlbHdrUlin ;
         httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
      }
      nRcdExists_402 = (short)(0) ;
      nIsMod_402 = (short)(0) ;
      nRcdDeleted_402 = (short)(0) ;
   }

   public void processLevel1M7195( )
   {
      /* Save parent mode. */
      sMode195 = Gx_mode ;
      processNestedLevel1M7402( ) ;
      if ( AnyError != 0 )
      {
         O2763AlbHdrUlin = s2763AlbHdrUlin ;
         httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode195 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01M726 */
      pr_default.execute(24, new Object[] {Short.valueOf(A2763AlbHdrUlin), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
   }

   public void endLevel1M7195( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1M7195( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrn23");
         if ( AnyError == 0 )
         {
            confirmValues1M70( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn23");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1M7195( )
   {
      /* Scan By routine */
      /* Using cursor T01M727 */
      pr_default.execute(25, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound195 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound195 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1M7195( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound195 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound195 = (short)(1) ;
      }
   }

   public void scanEnd1M7195( )
   {
      pr_default.close(25);
   }

   public void afterConfirm1M7195( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1M7195( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1M7195( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1M7195( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1M7195( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1M7195( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1M7195( )
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
      edtAlbHdrUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrUlin_Enabled), 5, 0), true);
      edtBarAlbPne_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPne_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPne_Enabled), 5, 0), true);
      edtEmpNumDec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpNumDec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpNumDec_Enabled), 5, 0), true);
   }

   public void zm1M7402( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2771ALbHdrImp = T01M73_A2771ALbHdrImp[0] ;
            Z2765AlbHdrTxt = T01M73_A2765AlbHdrTxt[0] ;
            Z2766AlbHdrRD = T01M73_A2766AlbHdrRD[0] ;
            Z2767AlbHdrPKg = T01M73_A2767AlbHdrPKg[0] ;
            Z2768AlbHdrKgs = T01M73_A2768AlbHdrKgs[0] ;
            Z2769AlbHdrPMt = T01M73_A2769AlbHdrPMt[0] ;
            Z2770ALbHdrMts = T01M73_A2770ALbHdrMts[0] ;
            Z2772AlbHdrTip = T01M73_A2772AlbHdrTip[0] ;
            Z3614AlbTxtCod = T01M73_A3614AlbTxtCod[0] ;
         }
         else
         {
            Z2771ALbHdrImp = A2771ALbHdrImp ;
            Z2765AlbHdrTxt = A2765AlbHdrTxt ;
            Z2766AlbHdrRD = A2766AlbHdrRD ;
            Z2767AlbHdrPKg = A2767AlbHdrPKg ;
            Z2768AlbHdrKgs = A2768AlbHdrKgs ;
            Z2769AlbHdrPMt = A2769AlbHdrPMt ;
            Z2770ALbHdrMts = A2770ALbHdrMts ;
            Z2772AlbHdrTip = A2772AlbHdrTip ;
            Z3614AlbTxtCod = A3614AlbTxtCod ;
         }
      }
      if ( GX_JID == -11 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z2764AlbHdrLin = A2764AlbHdrLin ;
         Z2771ALbHdrImp = A2771ALbHdrImp ;
         Z2765AlbHdrTxt = A2765AlbHdrTxt ;
         Z2766AlbHdrRD = A2766AlbHdrRD ;
         Z2767AlbHdrPKg = A2767AlbHdrPKg ;
         Z2768AlbHdrKgs = A2768AlbHdrKgs ;
         Z2769AlbHdrPMt = A2769AlbHdrPMt ;
         Z2770ALbHdrMts = A2770ALbHdrMts ;
         Z2772AlbHdrTip = A2772AlbHdrTip ;
         Z3614AlbTxtCod = A3614AlbTxtCod ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
      }
   }

   public void standaloneNotModal1M7402( )
   {
      edtAlbHdrUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrUlin_Enabled), 5, 0), true);
      edtAlbHdrUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrUlin_Enabled), 5, 0), true);
   }

   public void standaloneModal1M7402( )
   {
      if ( isIns( )  )
      {
         A2763AlbHdrUlin = (short)(O2763AlbHdrUlin+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A2764AlbHdrLin = A2763AlbHdrUlin ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbHdrLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtAlbHdrLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
   }

   public void load1M7402( )
   {
      /* Using cursor T01M728 */
      pr_default.execute(26, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2764AlbHdrLin)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound402 = (short)(1) ;
         A2771ALbHdrImp = T01M728_A2771ALbHdrImp[0] ;
         A2765AlbHdrTxt = T01M728_A2765AlbHdrTxt[0] ;
         A2766AlbHdrRD = T01M728_A2766AlbHdrRD[0] ;
         A2767AlbHdrPKg = T01M728_A2767AlbHdrPKg[0] ;
         A2768AlbHdrKgs = T01M728_A2768AlbHdrKgs[0] ;
         A2769AlbHdrPMt = T01M728_A2769AlbHdrPMt[0] ;
         A2770ALbHdrMts = T01M728_A2770ALbHdrMts[0] ;
         A2772AlbHdrTip = T01M728_A2772AlbHdrTip[0] ;
         A3614AlbTxtCod = T01M728_A3614AlbTxtCod[0] ;
         zm1M7402( -11) ;
      }
      pr_default.close(26);
      onLoadActions1M7402( ) ;
   }

   public void onLoadActions1M7402( )
   {
      if ( ( DecimalUtil.compareTo(A2771ALbHdrImp, O2771ALbHdrImp) == 0 ) && ( ( DecimalUtil.compareTo(A2768AlbHdrKgs, O2768AlbHdrKgs) != 0 ) || ( DecimalUtil.compareTo(A2767AlbHdrPKg, O2767AlbHdrPKg) != 0 ) || ( DecimalUtil.compareTo(A2770ALbHdrMts, O2770ALbHdrMts) != 0 ) || ( DecimalUtil.compareTo(A2769AlbHdrPMt, O2769AlbHdrPMt) != 0 ) ) )
      {
         A2771ALbHdrImp = GXutil.roundDecimal( A2768AlbHdrKgs.multiply(A2767AlbHdrPKg), 2).add(GXutil.roundDecimal( A2770ALbHdrMts.multiply(A2769AlbHdrPMt), 2)) ;
      }
   }

   public void checkExtendedTable1M7402( )
   {
      nIsDirty_402 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1M7402( ) ;
      if ( ( DecimalUtil.compareTo(A2771ALbHdrImp, O2771ALbHdrImp) == 0 ) && ( ( DecimalUtil.compareTo(A2768AlbHdrKgs, O2768AlbHdrKgs) != 0 ) || ( DecimalUtil.compareTo(A2767AlbHdrPKg, O2767AlbHdrPKg) != 0 ) || ( DecimalUtil.compareTo(A2770ALbHdrMts, O2770ALbHdrMts) != 0 ) || ( DecimalUtil.compareTo(A2769AlbHdrPMt, O2769AlbHdrPMt) != 0 ) ) )
      {
         nIsDirty_402 = (short)(1) ;
         A2771ALbHdrImp = GXutil.roundDecimal( A2768AlbHdrKgs.multiply(A2767AlbHdrPKg), 2).add(GXutil.roundDecimal( A2770ALbHdrMts.multiply(A2769AlbHdrPMt), 2)) ;
      }
   }

   public void closeExtendedTableCursors1M7402( )
   {
   }

   public void enableDisable1M7402( )
   {
   }

   public void getKey1M7402( )
   {
      /* Using cursor T01M729 */
      pr_default.execute(27, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2764AlbHdrLin)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound402 = (short)(1) ;
      }
      else
      {
         RcdFound402 = (short)(0) ;
      }
      pr_default.close(27);
   }

   public void getByPrimaryKey1M7402( )
   {
      /* Using cursor T01M73 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2764AlbHdrLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T01M73_A30AlbProCod[0] == A30AlbProCod ) && ( GXutil.strcmp(T01M73_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01M73_A129BarCod[0] == A129BarCod ) && ( T01M73_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01M73_A130BarCodPar[0], A130BarCodPar) == 0 ) )
      {
         zm1M7402( 11) ;
         RcdFound402 = (short)(1) ;
         initializeNonKey1M7402( ) ;
         A2764AlbHdrLin = T01M73_A2764AlbHdrLin[0] ;
         A2771ALbHdrImp = T01M73_A2771ALbHdrImp[0] ;
         A2765AlbHdrTxt = T01M73_A2765AlbHdrTxt[0] ;
         A2766AlbHdrRD = T01M73_A2766AlbHdrRD[0] ;
         A2767AlbHdrPKg = T01M73_A2767AlbHdrPKg[0] ;
         A2768AlbHdrKgs = T01M73_A2768AlbHdrKgs[0] ;
         A2769AlbHdrPMt = T01M73_A2769AlbHdrPMt[0] ;
         A2770ALbHdrMts = T01M73_A2770ALbHdrMts[0] ;
         A2772AlbHdrTip = T01M73_A2772AlbHdrTip[0] ;
         A3614AlbTxtCod = T01M73_A3614AlbTxtCod[0] ;
         O2769AlbHdrPMt = A2769AlbHdrPMt ;
         O2770ALbHdrMts = A2770ALbHdrMts ;
         O2767AlbHdrPKg = A2767AlbHdrPKg ;
         O2768AlbHdrKgs = A2768AlbHdrKgs ;
         O2771ALbHdrImp = A2771ALbHdrImp ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2764AlbHdrLin = A2764AlbHdrLin ;
         sMode402 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1M7402( ) ;
         Gx_mode = sMode402 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound402 = (short)(0) ;
         initializeNonKey1M7402( ) ;
         sMode402 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1M7402( ) ;
         Gx_mode = sMode402 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1M7402( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1M7402( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01M72 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2764AlbHdrLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBTXT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z2771ALbHdrImp, T01M72_A2771ALbHdrImp[0]) != 0 ) || ( GXutil.strcmp(Z2765AlbHdrTxt, T01M72_A2765AlbHdrTxt[0]) != 0 ) || ( DecimalUtil.compareTo(Z2766AlbHdrRD, T01M72_A2766AlbHdrRD[0]) != 0 ) || ( DecimalUtil.compareTo(Z2767AlbHdrPKg, T01M72_A2767AlbHdrPKg[0]) != 0 ) || ( DecimalUtil.compareTo(Z2768AlbHdrKgs, T01M72_A2768AlbHdrKgs[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z2769AlbHdrPMt, T01M72_A2769AlbHdrPMt[0]) != 0 ) || ( DecimalUtil.compareTo(Z2770ALbHdrMts, T01M72_A2770ALbHdrMts[0]) != 0 ) || ( GXutil.strcmp(Z2772AlbHdrTip, T01M72_A2772AlbHdrTip[0]) != 0 ) || ( GXutil.strcmp(Z3614AlbTxtCod, T01M72_A3614AlbTxtCod[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z2771ALbHdrImp, T01M72_A2771ALbHdrImp[0]) != 0 )
            {
               GXutil.writeLogln("ttrn23:[seudo value changed for attri]"+"ALbHdrImp");
               GXutil.writeLogRaw("Old: ",Z2771ALbHdrImp);
               GXutil.writeLogRaw("Current: ",T01M72_A2771ALbHdrImp[0]);
            }
            if ( GXutil.strcmp(Z2765AlbHdrTxt, T01M72_A2765AlbHdrTxt[0]) != 0 )
            {
               GXutil.writeLogln("ttrn23:[seudo value changed for attri]"+"AlbHdrTxt");
               GXutil.writeLogRaw("Old: ",Z2765AlbHdrTxt);
               GXutil.writeLogRaw("Current: ",T01M72_A2765AlbHdrTxt[0]);
            }
            if ( DecimalUtil.compareTo(Z2766AlbHdrRD, T01M72_A2766AlbHdrRD[0]) != 0 )
            {
               GXutil.writeLogln("ttrn23:[seudo value changed for attri]"+"AlbHdrRD");
               GXutil.writeLogRaw("Old: ",Z2766AlbHdrRD);
               GXutil.writeLogRaw("Current: ",T01M72_A2766AlbHdrRD[0]);
            }
            if ( DecimalUtil.compareTo(Z2767AlbHdrPKg, T01M72_A2767AlbHdrPKg[0]) != 0 )
            {
               GXutil.writeLogln("ttrn23:[seudo value changed for attri]"+"AlbHdrPKg");
               GXutil.writeLogRaw("Old: ",Z2767AlbHdrPKg);
               GXutil.writeLogRaw("Current: ",T01M72_A2767AlbHdrPKg[0]);
            }
            if ( DecimalUtil.compareTo(Z2768AlbHdrKgs, T01M72_A2768AlbHdrKgs[0]) != 0 )
            {
               GXutil.writeLogln("ttrn23:[seudo value changed for attri]"+"AlbHdrKgs");
               GXutil.writeLogRaw("Old: ",Z2768AlbHdrKgs);
               GXutil.writeLogRaw("Current: ",T01M72_A2768AlbHdrKgs[0]);
            }
            if ( DecimalUtil.compareTo(Z2769AlbHdrPMt, T01M72_A2769AlbHdrPMt[0]) != 0 )
            {
               GXutil.writeLogln("ttrn23:[seudo value changed for attri]"+"AlbHdrPMt");
               GXutil.writeLogRaw("Old: ",Z2769AlbHdrPMt);
               GXutil.writeLogRaw("Current: ",T01M72_A2769AlbHdrPMt[0]);
            }
            if ( DecimalUtil.compareTo(Z2770ALbHdrMts, T01M72_A2770ALbHdrMts[0]) != 0 )
            {
               GXutil.writeLogln("ttrn23:[seudo value changed for attri]"+"ALbHdrMts");
               GXutil.writeLogRaw("Old: ",Z2770ALbHdrMts);
               GXutil.writeLogRaw("Current: ",T01M72_A2770ALbHdrMts[0]);
            }
            if ( GXutil.strcmp(Z2772AlbHdrTip, T01M72_A2772AlbHdrTip[0]) != 0 )
            {
               GXutil.writeLogln("ttrn23:[seudo value changed for attri]"+"AlbHdrTip");
               GXutil.writeLogRaw("Old: ",Z2772AlbHdrTip);
               GXutil.writeLogRaw("Current: ",T01M72_A2772AlbHdrTip[0]);
            }
            if ( GXutil.strcmp(Z3614AlbTxtCod, T01M72_A3614AlbTxtCod[0]) != 0 )
            {
               GXutil.writeLogln("ttrn23:[seudo value changed for attri]"+"AlbTxtCod");
               GXutil.writeLogRaw("Old: ",Z3614AlbTxtCod);
               GXutil.writeLogRaw("Current: ",T01M72_A3614AlbTxtCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBTXT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1M7402( )
   {
      beforeValidate1M7402( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M7402( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1M7402( 0) ;
         checkOptimisticConcurrency1M7402( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1M7402( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1M7402( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01M730 */
                  pr_default.execute(28, new Object[] {Long.valueOf(A30AlbProCod), Short.valueOf(A2764AlbHdrLin), A2771ALbHdrImp, A2765AlbHdrTxt, A2766AlbHdrRD, A2767AlbHdrPKg, A2768AlbHdrKgs, A2769AlbHdrPMt, A2770ALbHdrMts, A2772AlbHdrTip, A3614AlbTxtCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBTXT");
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
            load1M7402( ) ;
         }
         endLevel1M7402( ) ;
      }
      closeExtendedTableCursors1M7402( ) ;
   }

   public void update1M7402( )
   {
      beforeValidate1M7402( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M7402( ) ;
      }
      if ( ( nIsMod_402 != 0 ) || ( nIsDirty_402 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1M7402( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1M7402( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1M7402( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01M731 */
                     pr_default.execute(29, new Object[] {A2771ALbHdrImp, A2765AlbHdrTxt, A2766AlbHdrRD, A2767AlbHdrPKg, A2768AlbHdrKgs, A2769AlbHdrPMt, A2770ALbHdrMts, A2772AlbHdrTip, A3614AlbTxtCod, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2764AlbHdrLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBTXT");
                     if ( (pr_default.getStatus(29) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBTXT"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1M7402( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1M7402( ) ;
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
            endLevel1M7402( ) ;
         }
      }
      closeExtendedTableCursors1M7402( ) ;
   }

   public void deferredUpdate1M7402( )
   {
   }

   public void delete1M7402( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1M7402( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1M7402( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1M7402( ) ;
         afterConfirm1M7402( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1M7402( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01M732 */
               pr_default.execute(30, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2764AlbHdrLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBTXT");
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
      sMode402 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1M7402( ) ;
      Gx_mode = sMode402 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1M7402( )
   {
      standaloneModal1M7402( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1M7402( )
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

   public void scanStart1M7402( )
   {
      /* Scan By routine */
      /* Using cursor T01M733 */
      pr_default.execute(31, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound402 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound402 = (short)(1) ;
         A2764AlbHdrLin = T01M733_A2764AlbHdrLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1M7402( )
   {
      /* Scan next routine */
      pr_default.readNext(31);
      RcdFound402 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound402 = (short)(1) ;
         A2764AlbHdrLin = T01M733_A2764AlbHdrLin[0] ;
      }
   }

   public void scanEnd1M7402( )
   {
      pr_default.close(31);
   }

   public void afterConfirm1M7402( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1M7402( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1M7402( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1M7402( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1M7402( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1M7402( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1M7402( )
   {
      edtAlbHdrLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtAlbHdrTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrTxt_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtAlbHdrRD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrRD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrRD_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtAlbHdrPKg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrPKg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrPKg_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtAlbHdrKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrKgs_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtAlbHdrPMt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrPMt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrPMt_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtALbHdrMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtALbHdrMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALbHdrMts_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtALbHdrImp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtALbHdrImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALbHdrImp_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtAlbHdrTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrTip_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtAlbTxtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTxtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTxtCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void send_integrity_lvl_hashes1M7402( )
   {
   }

   public void send_integrity_lvl_hashes1M7195( )
   {
   }

   public void subsflControlProps_60402( )
   {
      edtavnRcdDeleted_402_Internalname = "vNRCDDELETED_402_"+sGXsfl_60_idx ;
      edtAlbHdrLin_Internalname = "ALBHDRLIN_"+sGXsfl_60_idx ;
      edtAlbHdrTxt_Internalname = "ALBHDRTXT_"+sGXsfl_60_idx ;
      edtAlbHdrRD_Internalname = "ALBHDRRD_"+sGXsfl_60_idx ;
      edtAlbHdrPKg_Internalname = "ALBHDRPKG_"+sGXsfl_60_idx ;
      edtAlbHdrKgs_Internalname = "ALBHDRKGS_"+sGXsfl_60_idx ;
      edtAlbHdrPMt_Internalname = "ALBHDRPMT_"+sGXsfl_60_idx ;
      edtALbHdrMts_Internalname = "ALBHDRMTS_"+sGXsfl_60_idx ;
      edtALbHdrImp_Internalname = "ALBHDRIMP_"+sGXsfl_60_idx ;
      edtAlbHdrTip_Internalname = "ALBHDRTIP_"+sGXsfl_60_idx ;
      edtAlbTxtCod_Internalname = "ALBTXTCOD_"+sGXsfl_60_idx ;
   }

   public void subsflControlProps_fel_60402( )
   {
      edtavnRcdDeleted_402_Internalname = "vNRCDDELETED_402_"+sGXsfl_60_fel_idx ;
      edtAlbHdrLin_Internalname = "ALBHDRLIN_"+sGXsfl_60_fel_idx ;
      edtAlbHdrTxt_Internalname = "ALBHDRTXT_"+sGXsfl_60_fel_idx ;
      edtAlbHdrRD_Internalname = "ALBHDRRD_"+sGXsfl_60_fel_idx ;
      edtAlbHdrPKg_Internalname = "ALBHDRPKG_"+sGXsfl_60_fel_idx ;
      edtAlbHdrKgs_Internalname = "ALBHDRKGS_"+sGXsfl_60_fel_idx ;
      edtAlbHdrPMt_Internalname = "ALBHDRPMT_"+sGXsfl_60_fel_idx ;
      edtALbHdrMts_Internalname = "ALBHDRMTS_"+sGXsfl_60_fel_idx ;
      edtALbHdrImp_Internalname = "ALBHDRIMP_"+sGXsfl_60_fel_idx ;
      edtAlbHdrTip_Internalname = "ALBHDRTIP_"+sGXsfl_60_fel_idx ;
      edtAlbTxtCod_Internalname = "ALBTXTCOD_"+sGXsfl_60_fel_idx ;
   }

   public void addRow1M7402( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60402( ) ;
      sendRow1M7402( ) ;
   }

   public void sendRow1M7402( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_402_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_402_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_402, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_402_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_402), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_402), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_402_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_402_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_402_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrLin_Internalname,GXutil.ltrim( localUtil.ntoc( A2764AlbHdrLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2764AlbHdrLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbHdrLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_402_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrTxt_Internalname,GXutil.rtrim( A2765AlbHdrTxt),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrTxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbHdrTxt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_402_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrRD_Internalname,GXutil.ltrim( localUtil.ntoc( A2766AlbHdrRD, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbHdrRD_Enabled!=0) ? localUtil.format( A2766AlbHdrRD, "ZZ9.99") : localUtil.format( A2766AlbHdrRD, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrRD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbHdrRD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_402_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrPKg_Internalname,GXutil.ltrim( localUtil.ntoc( A2767AlbHdrPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbHdrPKg_Enabled!=0) ? localUtil.format( A2767AlbHdrPKg, "ZZZZZZ9.999") : localUtil.format( A2767AlbHdrPKg, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrPKg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbHdrPKg_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_402_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrKgs_Internalname,GXutil.ltrim( localUtil.ntoc( A2768AlbHdrKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbHdrKgs_Enabled!=0) ? localUtil.format( A2768AlbHdrKgs, "ZZZZZ9.99") : localUtil.format( A2768AlbHdrKgs, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrKgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbHdrKgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_402_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrPMt_Internalname,GXutil.ltrim( localUtil.ntoc( A2769AlbHdrPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbHdrPMt_Enabled!=0) ? localUtil.format( A2769AlbHdrPMt, "ZZZZZZ9.999") : localUtil.format( A2769AlbHdrPMt, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrPMt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbHdrPMt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_402_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtALbHdrMts_Internalname,GXutil.ltrim( localUtil.ntoc( A2770ALbHdrMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtALbHdrMts_Enabled!=0) ? localUtil.format( A2770ALbHdrMts, "ZZZZZ9.99") : localUtil.format( A2770ALbHdrMts, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtALbHdrMts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtALbHdrMts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_402_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtALbHdrImp_Internalname,GXutil.ltrim( localUtil.ntoc( A2771ALbHdrImp, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtALbHdrImp_Enabled!=0) ? localUtil.format( A2771ALbHdrImp, "ZZZZZZ9.99") : localUtil.format( A2771ALbHdrImp, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtALbHdrImp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtALbHdrImp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_402_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrTip_Internalname,GXutil.rtrim( A2772AlbHdrTip),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,70);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrTip_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbHdrTip_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_402_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbTxtCod_Internalname,GXutil.rtrim( A3614AlbTxtCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbTxtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbTxtCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1M7402( ) ;
      GXCCtl = "Z2764AlbHdrLin_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2764AlbHdrLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2771ALbHdrImp_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2771ALbHdrImp, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2765AlbHdrTxt_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2765AlbHdrTxt));
      GXCCtl = "Z2766AlbHdrRD_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2766AlbHdrRD, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2767AlbHdrPKg_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2767AlbHdrPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2768AlbHdrKgs_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2768AlbHdrKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2769AlbHdrPMt_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2769AlbHdrPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2770ALbHdrMts_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2770ALbHdrMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2772AlbHdrTip_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2772AlbHdrTip));
      GXCCtl = "Z3614AlbTxtCod_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3614AlbTxtCod));
      GXCCtl = "O2769AlbHdrPMt_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2769AlbHdrPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O2770ALbHdrMts_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2770ALbHdrMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O2767AlbHdrPKg_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2767AlbHdrPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O2768AlbHdrKgs_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2768AlbHdrKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O2771ALbHdrImp_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2771ALbHdrImp, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_402_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_402, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_402_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_402, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_402_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_402, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_402_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_402_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDRLIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDRTXT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDRRD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrRD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDRPKG_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrPKg_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDRKGS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDRPMT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrPMt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDRMTS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALbHdrMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDRIMP_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALbHdrImp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDRTIP_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrTip_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBTXTCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbTxtCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1M7402( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60402( ) ;
      edtavnRcdDeleted_402_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_402_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbHdrLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRLIN_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbHdrTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRTXT_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbHdrRD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRRD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbHdrPKg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRPKG_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbHdrKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRKGS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbHdrPMt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRPMT_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtALbHdrMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRMTS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtALbHdrImp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRIMP_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbHdrTip_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRTIP_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbTxtCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBTXTCOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_402_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_402_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_402");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_402_Internalname ;
         wbErr = true ;
         nRcdDeleted_402 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_402 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_402_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbHdrLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbHdrLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ALBHDRLIN_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbHdrLin_Internalname ;
         wbErr = true ;
         A2764AlbHdrLin = (short)(0) ;
      }
      else
      {
         A2764AlbHdrLin = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdrLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A2765AlbHdrTxt = httpContext.cgiGet( edtAlbHdrTxt_Internalname) ;
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbHdrRD_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbHdrRD_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBHDRRD_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbHdrRD_Internalname ;
         wbErr = true ;
         A2766AlbHdrRD = DecimalUtil.ZERO ;
      }
      else
      {
         A2766AlbHdrRD = localUtil.ctond( httpContext.cgiGet( edtAlbHdrRD_Internalname)) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbHdrPKg_Internalname)), DecimalUtil.stringToDec("-999999.99999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbHdrPKg_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "ALBHDRPKG_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbHdrPKg_Internalname ;
         wbErr = true ;
         A2767AlbHdrPKg = DecimalUtil.ZERO ;
      }
      else
      {
         A2767AlbHdrPKg = localUtil.ctond( httpContext.cgiGet( edtAlbHdrPKg_Internalname)) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbHdrKgs_Internalname)), DecimalUtil.stringToDec("-99999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbHdrKgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBHDRKGS_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbHdrKgs_Internalname ;
         wbErr = true ;
         A2768AlbHdrKgs = DecimalUtil.ZERO ;
      }
      else
      {
         A2768AlbHdrKgs = localUtil.ctond( httpContext.cgiGet( edtAlbHdrKgs_Internalname)) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbHdrPMt_Internalname)), DecimalUtil.stringToDec("-999999.99999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbHdrPMt_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "ALBHDRPMT_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbHdrPMt_Internalname ;
         wbErr = true ;
         A2769AlbHdrPMt = DecimalUtil.ZERO ;
      }
      else
      {
         A2769AlbHdrPMt = localUtil.ctond( httpContext.cgiGet( edtAlbHdrPMt_Internalname)) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtALbHdrMts_Internalname)), DecimalUtil.stringToDec("-99999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtALbHdrMts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBHDRMTS_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtALbHdrMts_Internalname ;
         wbErr = true ;
         A2770ALbHdrMts = DecimalUtil.ZERO ;
      }
      else
      {
         A2770ALbHdrMts = localUtil.ctond( httpContext.cgiGet( edtALbHdrMts_Internalname)) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtALbHdrImp_Internalname)), DecimalUtil.stringToDec("-999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtALbHdrImp_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBHDRIMP_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtALbHdrImp_Internalname ;
         wbErr = true ;
         A2771ALbHdrImp = DecimalUtil.ZERO ;
      }
      else
      {
         A2771ALbHdrImp = localUtil.ctond( httpContext.cgiGet( edtALbHdrImp_Internalname)) ;
      }
      A2772AlbHdrTip = httpContext.cgiGet( edtAlbHdrTip_Internalname) ;
      A3614AlbTxtCod = httpContext.cgiGet( edtAlbTxtCod_Internalname) ;
      GXCCtl = "Z2764AlbHdrLin_" + sGXsfl_60_idx ;
      Z2764AlbHdrLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2771ALbHdrImp_" + sGXsfl_60_idx ;
      Z2771ALbHdrImp = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2765AlbHdrTxt_" + sGXsfl_60_idx ;
      Z2765AlbHdrTxt = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2766AlbHdrRD_" + sGXsfl_60_idx ;
      Z2766AlbHdrRD = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2767AlbHdrPKg_" + sGXsfl_60_idx ;
      Z2767AlbHdrPKg = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2768AlbHdrKgs_" + sGXsfl_60_idx ;
      Z2768AlbHdrKgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2769AlbHdrPMt_" + sGXsfl_60_idx ;
      Z2769AlbHdrPMt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2770ALbHdrMts_" + sGXsfl_60_idx ;
      Z2770ALbHdrMts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2772AlbHdrTip_" + sGXsfl_60_idx ;
      Z2772AlbHdrTip = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3614AlbTxtCod_" + sGXsfl_60_idx ;
      Z3614AlbTxtCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O2769AlbHdrPMt_" + sGXsfl_60_idx ;
      O2769AlbHdrPMt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O2770ALbHdrMts_" + sGXsfl_60_idx ;
      O2770ALbHdrMts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O2767AlbHdrPKg_" + sGXsfl_60_idx ;
      O2767AlbHdrPKg = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O2768AlbHdrKgs_" + sGXsfl_60_idx ;
      O2768AlbHdrKgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O2771ALbHdrImp_" + sGXsfl_60_idx ;
      O2771ALbHdrImp = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_402_" + sGXsfl_60_idx ;
      nRcdDeleted_402 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_402_" + sGXsfl_60_idx ;
      nRcdExists_402 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_402_" + sGXsfl_60_idx ;
      nIsMod_402 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAlbHdrLin_Enabled = edtAlbHdrLin_Enabled ;
   }

   public void confirmValues1M70( )
   {
      nGXsfl_60_idx = 0 ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60402( ) ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_60402( ) ;
         httpContext.changePostValue( "Z2764AlbHdrLin_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z2764AlbHdrLin_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2764AlbHdrLin_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z2771ALbHdrImp_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z2771ALbHdrImp_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2771ALbHdrImp_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z2765AlbHdrTxt_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z2765AlbHdrTxt_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2765AlbHdrTxt_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z2766AlbHdrRD_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z2766AlbHdrRD_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2766AlbHdrRD_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z2767AlbHdrPKg_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z2767AlbHdrPKg_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2767AlbHdrPKg_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z2768AlbHdrKgs_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z2768AlbHdrKgs_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2768AlbHdrKgs_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z2769AlbHdrPMt_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z2769AlbHdrPMt_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2769AlbHdrPMt_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z2770ALbHdrMts_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z2770ALbHdrMts_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2770ALbHdrMts_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z2772AlbHdrTip_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z2772AlbHdrTip_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2772AlbHdrTip_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z3614AlbTxtCod_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3614AlbTxtCod_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3614AlbTxtCod_"+sGXsfl_60_idx) ;
      }
      httpContext.changePostValue( "O2769AlbHdrPMt", httpContext.cgiGet( "T2769AlbHdrPMt")) ;
      httpContext.deletePostValue( "T2769AlbHdrPMt") ;
      httpContext.changePostValue( "O2770ALbHdrMts", httpContext.cgiGet( "T2770ALbHdrMts")) ;
      httpContext.deletePostValue( "T2770ALbHdrMts") ;
      httpContext.changePostValue( "O2767AlbHdrPKg", httpContext.cgiGet( "T2767AlbHdrPKg")) ;
      httpContext.deletePostValue( "T2767AlbHdrPKg") ;
      httpContext.changePostValue( "O2768AlbHdrKgs", httpContext.cgiGet( "T2768AlbHdrKgs")) ;
      httpContext.deletePostValue( "T2768AlbHdrKgs") ;
      httpContext.changePostValue( "O2771ALbHdrImp", httpContext.cgiGet( "T2771ALbHdrImp")) ;
      httpContext.deletePostValue( "T2771ALbHdrImp") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttrn23", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","Gx_mode"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TTrn23");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("BarAlbPbr", localUtil.format( A2026BarAlbPbr, "ZZZZZ9.99"));
      forbiddenHiddens.add("BarAlbTar", localUtil.format( A1462BarAlbTar, "ZZZZZ9.99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ttrn23:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z2763AlbHdrUlin", GXutil.ltrim( localUtil.ntoc( Z2763AlbHdrUlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2026BarAlbPbr", GXutil.ltrim( localUtil.ntoc( Z2026BarAlbPbr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1462BarAlbTar", GXutil.ltrim( localUtil.ntoc( Z1462BarAlbTar, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O2763AlbHdrUlin", GXutil.ltrim( localUtil.ntoc( O2763AlbHdrUlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_60", GXutil.ltrim( localUtil.ntoc( nGXsfl_60_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBPBR", GXutil.ltrim( localUtil.ntoc( A2026BarAlbPbr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBTAR", GXutil.ltrim( localUtil.ntoc( A1462BarAlbTar, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.ttrn23", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","Gx_mode"})  ;
   }

   public String getPgmname( )
   {
      return "TTrn23" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Lineas Libres", "") ;
   }

   public void initializeNonKey1M7195( )
   {
      A2763AlbHdrUlin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
      A2027BarAlbPne = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2027BarAlbPne", GXutil.ltrimstr( A2027BarAlbPne, 9, 2));
      A2026BarAlbPbr = DecimalUtil.ZERO ;
      n2026BarAlbPbr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2026BarAlbPbr", GXutil.ltrimstr( A2026BarAlbPbr, 9, 2));
      A1462BarAlbTar = DecimalUtil.ZERO ;
      n1462BarAlbTar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1462BarAlbTar", GXutil.ltrimstr( A1462BarAlbTar, 9, 2));
      O2763AlbHdrUlin = A2763AlbHdrUlin ;
      httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
      Z2763AlbHdrUlin = (short)(0) ;
      Z2026BarAlbPbr = DecimalUtil.ZERO ;
      Z1462BarAlbTar = DecimalUtil.ZERO ;
   }

   public void initAll1M7195( )
   {
      initializeNonKey1M7195( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1M7402( )
   {
      A2771ALbHdrImp = DecimalUtil.ZERO ;
      A2765AlbHdrTxt = "" ;
      A2766AlbHdrRD = DecimalUtil.ZERO ;
      A2767AlbHdrPKg = DecimalUtil.ZERO ;
      A2768AlbHdrKgs = DecimalUtil.ZERO ;
      A2769AlbHdrPMt = DecimalUtil.ZERO ;
      A2770ALbHdrMts = DecimalUtil.ZERO ;
      A2772AlbHdrTip = "" ;
      A3614AlbTxtCod = "" ;
      O2769AlbHdrPMt = A2769AlbHdrPMt ;
      O2770ALbHdrMts = A2770ALbHdrMts ;
      O2767AlbHdrPKg = A2767AlbHdrPKg ;
      O2768AlbHdrKgs = A2768AlbHdrKgs ;
      O2771ALbHdrImp = A2771ALbHdrImp ;
      Z2771ALbHdrImp = DecimalUtil.ZERO ;
      Z2765AlbHdrTxt = "" ;
      Z2766AlbHdrRD = DecimalUtil.ZERO ;
      Z2767AlbHdrPKg = DecimalUtil.ZERO ;
      Z2768AlbHdrKgs = DecimalUtil.ZERO ;
      Z2769AlbHdrPMt = DecimalUtil.ZERO ;
      Z2770ALbHdrMts = DecimalUtil.ZERO ;
      Z2772AlbHdrTip = "" ;
      Z3614AlbTxtCod = "" ;
   }

   public void initAll1M7402( )
   {
      A2764AlbHdrLin = (short)(0) ;
      initializeNonKey1M7402( ) ;
   }

   public void standaloneModalInsert1M7402( )
   {
      A2763AlbHdrUlin = i2763AlbHdrUlin ;
      httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241594285", true, true);
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
      httpContext.AddJavascriptSource("ttrn23.js", "?20268241594285", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties402( )
   {
      edtAlbHdrLin_Enabled = defedtAlbHdrLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_402, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_402_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2764AlbHdrLin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2765AlbHdrTxt));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2766AlbHdrRD, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrRD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2767AlbHdrPKg, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrPKg_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2768AlbHdrKgs, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2769AlbHdrPMt, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrPMt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2770ALbHdrMts, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtALbHdrMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2771ALbHdrImp, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtALbHdrImp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2772AlbHdrTip));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrTip_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3614AlbTxtCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbTxtCod_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtAlbHdrUlin_Internalname = "ALBHDRULIN" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtBarAlbPne_Internalname = "BARALBPNE" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtEmpNumDec_Internalname = "EMPNUMDEC" ;
      edtavnRcdDeleted_402_Internalname = "vNRCDDELETED_402" ;
      edtAlbHdrLin_Internalname = "ALBHDRLIN" ;
      edtAlbHdrTxt_Internalname = "ALBHDRTXT" ;
      edtAlbHdrRD_Internalname = "ALBHDRRD" ;
      edtAlbHdrPKg_Internalname = "ALBHDRPKG" ;
      edtAlbHdrKgs_Internalname = "ALBHDRKGS" ;
      edtAlbHdrPMt_Internalname = "ALBHDRPMT" ;
      edtALbHdrMts_Internalname = "ALBHDRMTS" ;
      edtALbHdrImp_Internalname = "ALBHDRIMP" ;
      edtAlbHdrTip_Internalname = "ALBHDRTIP" ;
      edtAlbTxtCod_Internalname = "ALBTXTCOD" ;
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
      Form.setCaption( httpContext.getMessage( "Lineas Libres", "") );
      edtAlbTxtCod_Jsonclick = "" ;
      edtAlbHdrTip_Jsonclick = "" ;
      edtALbHdrImp_Jsonclick = "" ;
      edtALbHdrMts_Jsonclick = "" ;
      edtAlbHdrPMt_Jsonclick = "" ;
      edtAlbHdrKgs_Jsonclick = "" ;
      edtAlbHdrPKg_Jsonclick = "" ;
      edtAlbHdrRD_Jsonclick = "" ;
      edtAlbHdrTxt_Jsonclick = "" ;
      edtAlbHdrLin_Jsonclick = "" ;
      edtavnRcdDeleted_402_Jsonclick = "" ;
      subGrid1_Class = "" ;
      subGrid1_Backcolorstyle = (byte)(2) ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtAlbTxtCod_Enabled = 1 ;
      edtAlbHdrTip_Enabled = 1 ;
      edtALbHdrImp_Enabled = 1 ;
      edtALbHdrMts_Enabled = 1 ;
      edtAlbHdrPMt_Enabled = 1 ;
      edtAlbHdrKgs_Enabled = 1 ;
      edtAlbHdrPKg_Enabled = 1 ;
      edtAlbHdrRD_Enabled = 1 ;
      edtAlbHdrTxt_Enabled = 1 ;
      edtAlbHdrLin_Enabled = 1 ;
      edtavnRcdDeleted_402_Enabled = 1 ;
      edtEmpNumDec_Jsonclick = "" ;
      edtEmpNumDec_Backcolor = (int)(0xFFFFFF) ;
      edtEmpNumDec_Enabled = 0 ;
      edtBarAlbPne_Jsonclick = "" ;
      edtBarAlbPne_Backcolor = (int)(0xFFFFFF) ;
      edtBarAlbPne_Enabled = 0 ;
      edtAlbHdrUlin_Jsonclick = "" ;
      edtAlbHdrUlin_Backcolor = (int)(0xFFFFFF) ;
      edtAlbHdrUlin_Enabled = 0 ;
      bttBtn_get_Enabled = 0 ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_60402( ) ;
      while ( nGXsfl_60_idx <= nRC_GXsfl_60 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1M7402( ) ;
         standaloneModal1M7402( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1M7402( ) ;
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_60402( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A2026BarAlbPbr',fld:'BARALBPBR',pic:'ZZZZZ9.99'},{av:'A1462BarAlbTar',fld:'BARALBTAR',pic:'ZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_ALBHDRULIN","{handler:'valid_Albhdrulin',iparms:[]");
      setEventMetadata("VALID_ALBHDRULIN",",oparms:[]}");
      setEventMetadata("VALID_ALBHDRLIN","{handler:'valid_Albhdrlin',iparms:[]");
      setEventMetadata("VALID_ALBHDRLIN",",oparms:[]}");
      setEventMetadata("VALID_ALBHDRPKG","{handler:'valid_Albhdrpkg',iparms:[]");
      setEventMetadata("VALID_ALBHDRPKG",",oparms:[]}");
      setEventMetadata("VALID_ALBHDRKGS","{handler:'valid_Albhdrkgs',iparms:[]");
      setEventMetadata("VALID_ALBHDRKGS",",oparms:[]}");
      setEventMetadata("VALID_ALBHDRPMT","{handler:'valid_Albhdrpmt',iparms:[]");
      setEventMetadata("VALID_ALBHDRPMT",",oparms:[]}");
      setEventMetadata("VALID_ALBHDRMTS","{handler:'valid_Albhdrmts',iparms:[]");
      setEventMetadata("VALID_ALBHDRMTS",",oparms:[]}");
      setEventMetadata("VALID_ALBHDRIMP","{handler:'valid_Albhdrimp',iparms:[]");
      setEventMetadata("VALID_ALBHDRIMP",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albtxtcod',iparms:[]");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      wcpOGx_mode = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z2026BarAlbPbr = DecimalUtil.ZERO ;
      Z1462BarAlbTar = DecimalUtil.ZERO ;
      Z2771ALbHdrImp = DecimalUtil.ZERO ;
      Z2765AlbHdrTxt = "" ;
      Z2766AlbHdrRD = DecimalUtil.ZERO ;
      Z2767AlbHdrPKg = DecimalUtil.ZERO ;
      Z2768AlbHdrKgs = DecimalUtil.ZERO ;
      Z2769AlbHdrPMt = DecimalUtil.ZERO ;
      Z2770ALbHdrMts = DecimalUtil.ZERO ;
      Z2772AlbHdrTip = "" ;
      Z3614AlbTxtCod = "" ;
      O2769AlbHdrPMt = DecimalUtil.ZERO ;
      O2770ALbHdrMts = DecimalUtil.ZERO ;
      O2767AlbHdrPKg = DecimalUtil.ZERO ;
      O2768AlbHdrKgs = DecimalUtil.ZERO ;
      O2771ALbHdrImp = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      Gx_mode = "" ;
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
      A2027BarAlbPne = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode402 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A2026BarAlbPbr = DecimalUtil.ZERO ;
      A1462BarAlbTar = DecimalUtil.ZERO ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode195 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A2765AlbHdrTxt = "" ;
      A2766AlbHdrRD = DecimalUtil.ZERO ;
      A2767AlbHdrPKg = DecimalUtil.ZERO ;
      A2768AlbHdrKgs = DecimalUtil.ZERO ;
      A2769AlbHdrPMt = DecimalUtil.ZERO ;
      A2770ALbHdrMts = DecimalUtil.ZERO ;
      A2771ALbHdrImp = DecimalUtil.ZERO ;
      A2772AlbHdrTip = "" ;
      A3614AlbTxtCod = "" ;
      T2769AlbHdrPMt = DecimalUtil.ZERO ;
      T2770ALbHdrMts = DecimalUtil.ZERO ;
      T2767AlbHdrPKg = DecimalUtil.ZERO ;
      T2768AlbHdrKgs = DecimalUtil.ZERO ;
      T2771ALbHdrImp = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      AV10EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      T01M76_A3915EmpNumDec = new byte[1] ;
      T01M76_n3915EmpNumDec = new boolean[] {false} ;
      T01M78_A396EmprCod = new String[] {""} ;
      T01M77_A396EmprCod = new String[] {""} ;
      T01M79_A2763AlbHdrUlin = new short[1] ;
      T01M79_A3915EmpNumDec = new byte[1] ;
      T01M79_n3915EmpNumDec = new boolean[] {false} ;
      T01M79_A2026BarAlbPbr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M79_n2026BarAlbPbr = new boolean[] {false} ;
      T01M79_A1462BarAlbTar = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M79_n1462BarAlbTar = new boolean[] {false} ;
      T01M79_A396EmprCod = new String[] {""} ;
      T01M79_A129BarCod = new int[1] ;
      T01M79_A132BarCodReo = new byte[1] ;
      T01M79_A130BarCodPar = new String[] {""} ;
      T01M79_A30AlbProCod = new long[1] ;
      T01M710_A396EmprCod = new String[] {""} ;
      T01M710_A30AlbProCod = new long[1] ;
      T01M710_A129BarCod = new int[1] ;
      T01M710_A132BarCodReo = new byte[1] ;
      T01M710_A130BarCodPar = new String[] {""} ;
      T01M75_A2763AlbHdrUlin = new short[1] ;
      T01M75_A2026BarAlbPbr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M75_n2026BarAlbPbr = new boolean[] {false} ;
      T01M75_A1462BarAlbTar = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M75_n1462BarAlbTar = new boolean[] {false} ;
      T01M75_A396EmprCod = new String[] {""} ;
      T01M75_A129BarCod = new int[1] ;
      T01M75_A132BarCodReo = new byte[1] ;
      T01M75_A130BarCodPar = new String[] {""} ;
      T01M75_A30AlbProCod = new long[1] ;
      T01M711_A396EmprCod = new String[] {""} ;
      T01M711_A30AlbProCod = new long[1] ;
      T01M711_A129BarCod = new int[1] ;
      T01M711_A132BarCodReo = new byte[1] ;
      T01M711_A130BarCodPar = new String[] {""} ;
      T01M712_A396EmprCod = new String[] {""} ;
      T01M712_A30AlbProCod = new long[1] ;
      T01M712_A129BarCod = new int[1] ;
      T01M712_A132BarCodReo = new byte[1] ;
      T01M712_A130BarCodPar = new String[] {""} ;
      T01M74_A2763AlbHdrUlin = new short[1] ;
      T01M74_A2026BarAlbPbr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M74_n2026BarAlbPbr = new boolean[] {false} ;
      T01M74_A1462BarAlbTar = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M74_n1462BarAlbTar = new boolean[] {false} ;
      T01M74_A396EmprCod = new String[] {""} ;
      T01M74_A129BarCod = new int[1] ;
      T01M74_A132BarCodReo = new byte[1] ;
      T01M74_A130BarCodPar = new String[] {""} ;
      T01M74_A30AlbProCod = new long[1] ;
      T01M716_A396EmprCod = new String[] {""} ;
      T01M716_A30AlbProCod = new long[1] ;
      T01M716_A129BarCod = new int[1] ;
      T01M716_A132BarCodReo = new byte[1] ;
      T01M716_A130BarCodPar = new String[] {""} ;
      T01M716_A6648AlbMetLin = new short[1] ;
      T01M717_A396EmprCod = new String[] {""} ;
      T01M717_A30AlbProCod = new long[1] ;
      T01M717_A129BarCod = new int[1] ;
      T01M717_A132BarCodReo = new byte[1] ;
      T01M717_A130BarCodPar = new String[] {""} ;
      T01M717_A9639Et_Numero = new short[1] ;
      T01M718_A396EmprCod = new String[] {""} ;
      T01M718_A30AlbProCod = new long[1] ;
      T01M718_A129BarCod = new int[1] ;
      T01M718_A132BarCodReo = new byte[1] ;
      T01M718_A130BarCodPar = new String[] {""} ;
      T01M718_A6622AlbHdRLn = new short[1] ;
      T01M719_A396EmprCod = new String[] {""} ;
      T01M719_A30AlbProCod = new long[1] ;
      T01M719_A129BarCod = new int[1] ;
      T01M719_A132BarCodReo = new byte[1] ;
      T01M719_A130BarCodPar = new String[] {""} ;
      T01M719_A5456P_ForLin = new short[1] ;
      T01M720_A396EmprCod = new String[] {""} ;
      T01M720_A30AlbProCod = new long[1] ;
      T01M720_A129BarCod = new int[1] ;
      T01M720_A132BarCodReo = new byte[1] ;
      T01M720_A130BarCodPar = new String[] {""} ;
      T01M720_A2524DisComLin = new byte[1] ;
      T01M720_A1056DisComCod = new String[] {""} ;
      T01M720_A1032FonCod = new String[] {""} ;
      T01M721_A396EmprCod = new String[] {""} ;
      T01M721_A3617AlbTrnCod = new long[1] ;
      T01M721_A30AlbProCod = new long[1] ;
      T01M721_A129BarCod = new int[1] ;
      T01M721_A132BarCodReo = new byte[1] ;
      T01M721_A130BarCodPar = new String[] {""} ;
      T01M722_A396EmprCod = new String[] {""} ;
      T01M722_A30AlbProCod = new long[1] ;
      T01M722_A129BarCod = new int[1] ;
      T01M722_A132BarCodReo = new byte[1] ;
      T01M722_A130BarCodPar = new String[] {""} ;
      T01M722_A3621AlbPckLin = new short[1] ;
      T01M723_A396EmprCod = new String[] {""} ;
      T01M723_A30AlbProCod = new long[1] ;
      T01M723_A129BarCod = new int[1] ;
      T01M723_A132BarCodReo = new byte[1] ;
      T01M723_A130BarCodPar = new String[] {""} ;
      T01M723_A1468AlbPrdLin = new short[1] ;
      T01M724_A396EmprCod = new String[] {""} ;
      T01M724_A30AlbProCod = new long[1] ;
      T01M724_A129BarCod = new int[1] ;
      T01M724_A132BarCodReo = new byte[1] ;
      T01M724_A130BarCodPar = new String[] {""} ;
      T01M724_A200BarPieCod = new String[] {""} ;
      T01M725_A396EmprCod = new String[] {""} ;
      T01M725_A30AlbProCod = new long[1] ;
      T01M725_A129BarCod = new int[1] ;
      T01M725_A132BarCodReo = new byte[1] ;
      T01M725_A130BarCodPar = new String[] {""} ;
      T01M725_A1240GuiFasLin = new short[1] ;
      T01M727_A396EmprCod = new String[] {""} ;
      T01M727_A30AlbProCod = new long[1] ;
      T01M727_A129BarCod = new int[1] ;
      T01M727_A132BarCodReo = new byte[1] ;
      T01M727_A130BarCodPar = new String[] {""} ;
      T01M728_A30AlbProCod = new long[1] ;
      T01M728_A2764AlbHdrLin = new short[1] ;
      T01M728_A2771ALbHdrImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M728_A2765AlbHdrTxt = new String[] {""} ;
      T01M728_A2766AlbHdrRD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M728_A2767AlbHdrPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M728_A2768AlbHdrKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M728_A2769AlbHdrPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M728_A2770ALbHdrMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M728_A2772AlbHdrTip = new String[] {""} ;
      T01M728_A3614AlbTxtCod = new String[] {""} ;
      T01M728_A396EmprCod = new String[] {""} ;
      T01M728_A129BarCod = new int[1] ;
      T01M728_A132BarCodReo = new byte[1] ;
      T01M728_A130BarCodPar = new String[] {""} ;
      T01M729_A396EmprCod = new String[] {""} ;
      T01M729_A30AlbProCod = new long[1] ;
      T01M729_A129BarCod = new int[1] ;
      T01M729_A132BarCodReo = new byte[1] ;
      T01M729_A130BarCodPar = new String[] {""} ;
      T01M729_A2764AlbHdrLin = new short[1] ;
      T01M73_A30AlbProCod = new long[1] ;
      T01M73_A2764AlbHdrLin = new short[1] ;
      T01M73_A2771ALbHdrImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M73_A2765AlbHdrTxt = new String[] {""} ;
      T01M73_A2766AlbHdrRD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M73_A2767AlbHdrPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M73_A2768AlbHdrKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M73_A2769AlbHdrPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M73_A2770ALbHdrMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M73_A2772AlbHdrTip = new String[] {""} ;
      T01M73_A3614AlbTxtCod = new String[] {""} ;
      T01M73_A396EmprCod = new String[] {""} ;
      T01M73_A129BarCod = new int[1] ;
      T01M73_A132BarCodReo = new byte[1] ;
      T01M73_A130BarCodPar = new String[] {""} ;
      T01M72_A30AlbProCod = new long[1] ;
      T01M72_A2764AlbHdrLin = new short[1] ;
      T01M72_A2771ALbHdrImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M72_A2765AlbHdrTxt = new String[] {""} ;
      T01M72_A2766AlbHdrRD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M72_A2767AlbHdrPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M72_A2768AlbHdrKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M72_A2769AlbHdrPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M72_A2770ALbHdrMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M72_A2772AlbHdrTip = new String[] {""} ;
      T01M72_A3614AlbTxtCod = new String[] {""} ;
      T01M72_A396EmprCod = new String[] {""} ;
      T01M72_A129BarCod = new int[1] ;
      T01M72_A132BarCodReo = new byte[1] ;
      T01M72_A130BarCodPar = new String[] {""} ;
      T01M733_A396EmprCod = new String[] {""} ;
      T01M733_A30AlbProCod = new long[1] ;
      T01M733_A129BarCod = new int[1] ;
      T01M733_A132BarCodReo = new byte[1] ;
      T01M733_A130BarCodPar = new String[] {""} ;
      T01M733_A2764AlbHdrLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttrn23__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrn23__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrn23__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrn23__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn23__default(),
         new Object[] {
             new Object[] {
            T01M72_A30AlbProCod, T01M72_A2764AlbHdrLin, T01M72_A2771ALbHdrImp, T01M72_A2765AlbHdrTxt, T01M72_A2766AlbHdrRD, T01M72_A2767AlbHdrPKg, T01M72_A2768AlbHdrKgs, T01M72_A2769AlbHdrPMt, T01M72_A2770ALbHdrMts, T01M72_A2772AlbHdrTip,
            T01M72_A3614AlbTxtCod, T01M72_A396EmprCod, T01M72_A129BarCod, T01M72_A132BarCodReo, T01M72_A130BarCodPar
            }
            , new Object[] {
            T01M73_A30AlbProCod, T01M73_A2764AlbHdrLin, T01M73_A2771ALbHdrImp, T01M73_A2765AlbHdrTxt, T01M73_A2766AlbHdrRD, T01M73_A2767AlbHdrPKg, T01M73_A2768AlbHdrKgs, T01M73_A2769AlbHdrPMt, T01M73_A2770ALbHdrMts, T01M73_A2772AlbHdrTip,
            T01M73_A3614AlbTxtCod, T01M73_A396EmprCod, T01M73_A129BarCod, T01M73_A132BarCodReo, T01M73_A130BarCodPar
            }
            , new Object[] {
            T01M74_A2763AlbHdrUlin, T01M74_A2026BarAlbPbr, T01M74_n2026BarAlbPbr, T01M74_A1462BarAlbTar, T01M74_n1462BarAlbTar, T01M74_A396EmprCod, T01M74_A129BarCod, T01M74_A132BarCodReo, T01M74_A130BarCodPar, T01M74_A30AlbProCod
            }
            , new Object[] {
            T01M75_A2763AlbHdrUlin, T01M75_A2026BarAlbPbr, T01M75_n2026BarAlbPbr, T01M75_A1462BarAlbTar, T01M75_n1462BarAlbTar, T01M75_A396EmprCod, T01M75_A129BarCod, T01M75_A132BarCodReo, T01M75_A130BarCodPar, T01M75_A30AlbProCod
            }
            , new Object[] {
            T01M76_A3915EmpNumDec, T01M76_n3915EmpNumDec
            }
            , new Object[] {
            T01M77_A396EmprCod
            }
            , new Object[] {
            T01M78_A396EmprCod
            }
            , new Object[] {
            T01M79_A2763AlbHdrUlin, T01M79_A3915EmpNumDec, T01M79_n3915EmpNumDec, T01M79_A2026BarAlbPbr, T01M79_n2026BarAlbPbr, T01M79_A1462BarAlbTar, T01M79_n1462BarAlbTar, T01M79_A396EmprCod, T01M79_A129BarCod, T01M79_A132BarCodReo,
            T01M79_A130BarCodPar, T01M79_A30AlbProCod
            }
            , new Object[] {
            T01M710_A396EmprCod, T01M710_A30AlbProCod, T01M710_A129BarCod, T01M710_A132BarCodReo, T01M710_A130BarCodPar
            }
            , new Object[] {
            T01M711_A396EmprCod, T01M711_A30AlbProCod, T01M711_A129BarCod, T01M711_A132BarCodReo, T01M711_A130BarCodPar
            }
            , new Object[] {
            T01M712_A396EmprCod, T01M712_A30AlbProCod, T01M712_A129BarCod, T01M712_A132BarCodReo, T01M712_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01M716_A396EmprCod, T01M716_A30AlbProCod, T01M716_A129BarCod, T01M716_A132BarCodReo, T01M716_A130BarCodPar, T01M716_A6648AlbMetLin
            }
            , new Object[] {
            T01M717_A396EmprCod, T01M717_A30AlbProCod, T01M717_A129BarCod, T01M717_A132BarCodReo, T01M717_A130BarCodPar, T01M717_A9639Et_Numero
            }
            , new Object[] {
            T01M718_A396EmprCod, T01M718_A30AlbProCod, T01M718_A129BarCod, T01M718_A132BarCodReo, T01M718_A130BarCodPar, T01M718_A6622AlbHdRLn
            }
            , new Object[] {
            T01M719_A396EmprCod, T01M719_A30AlbProCod, T01M719_A129BarCod, T01M719_A132BarCodReo, T01M719_A130BarCodPar, T01M719_A5456P_ForLin
            }
            , new Object[] {
            T01M720_A396EmprCod, T01M720_A30AlbProCod, T01M720_A129BarCod, T01M720_A132BarCodReo, T01M720_A130BarCodPar, T01M720_A2524DisComLin, T01M720_A1056DisComCod, T01M720_A1032FonCod
            }
            , new Object[] {
            T01M721_A396EmprCod, T01M721_A3617AlbTrnCod, T01M721_A30AlbProCod, T01M721_A129BarCod, T01M721_A132BarCodReo, T01M721_A130BarCodPar
            }
            , new Object[] {
            T01M722_A396EmprCod, T01M722_A30AlbProCod, T01M722_A129BarCod, T01M722_A132BarCodReo, T01M722_A130BarCodPar, T01M722_A3621AlbPckLin
            }
            , new Object[] {
            T01M723_A396EmprCod, T01M723_A30AlbProCod, T01M723_A129BarCod, T01M723_A132BarCodReo, T01M723_A130BarCodPar, T01M723_A1468AlbPrdLin
            }
            , new Object[] {
            T01M724_A396EmprCod, T01M724_A30AlbProCod, T01M724_A129BarCod, T01M724_A132BarCodReo, T01M724_A130BarCodPar, T01M724_A200BarPieCod
            }
            , new Object[] {
            T01M725_A396EmprCod, T01M725_A30AlbProCod, T01M725_A129BarCod, T01M725_A132BarCodReo, T01M725_A130BarCodPar, T01M725_A1240GuiFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            T01M727_A396EmprCod, T01M727_A30AlbProCod, T01M727_A129BarCod, T01M727_A132BarCodReo, T01M727_A130BarCodPar
            }
            , new Object[] {
            T01M728_A30AlbProCod, T01M728_A2764AlbHdrLin, T01M728_A2771ALbHdrImp, T01M728_A2765AlbHdrTxt, T01M728_A2766AlbHdrRD, T01M728_A2767AlbHdrPKg, T01M728_A2768AlbHdrKgs, T01M728_A2769AlbHdrPMt, T01M728_A2770ALbHdrMts, T01M728_A2772AlbHdrTip,
            T01M728_A3614AlbTxtCod, T01M728_A396EmprCod, T01M728_A129BarCod, T01M728_A132BarCodReo, T01M728_A130BarCodPar
            }
            , new Object[] {
            T01M729_A396EmprCod, T01M729_A30AlbProCod, T01M729_A129BarCod, T01M729_A132BarCodReo, T01M729_A130BarCodPar, T01M729_A2764AlbHdrLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01M733_A396EmprCod, T01M733_A30AlbProCod, T01M733_A129BarCod, T01M733_A132BarCodReo, T01M733_A130BarCodPar, T01M733_A2764AlbHdrLin
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
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A3915EmpNumDec ;
   private byte Z3915EmpNumDec ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z2763AlbHdrUlin ;
   private short O2763AlbHdrUlin ;
   private short Z2764AlbHdrLin ;
   private short nRcdDeleted_402 ;
   private short nRcdExists_402 ;
   private short nIsMod_402 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A2763AlbHdrUlin ;
   private short nBlankRcdCount402 ;
   private short RcdFound402 ;
   private short B2763AlbHdrUlin ;
   private short nBlankRcdUsr402 ;
   private short RcdFound195 ;
   private short s2763AlbHdrUlin ;
   private short A2764AlbHdrLin ;
   private short nIsDirty_195 ;
   private short nIsDirty_402 ;
   private short i2763AlbHdrUlin ;
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
   private int edtAlbHdrUlin_Enabled ;
   private int edtBarAlbPne_Enabled ;
   private int edtEmpNumDec_Enabled ;
   private int edtavnRcdDeleted_402_Enabled ;
   private int edtAlbHdrLin_Enabled ;
   private int edtAlbHdrTxt_Enabled ;
   private int edtAlbHdrRD_Enabled ;
   private int edtAlbHdrPKg_Enabled ;
   private int edtAlbHdrKgs_Enabled ;
   private int edtAlbHdrPMt_Enabled ;
   private int edtALbHdrMts_Enabled ;
   private int edtALbHdrImp_Enabled ;
   private int edtAlbHdrTip_Enabled ;
   private int edtAlbTxtCod_Enabled ;
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
   private int defedtAlbHdrLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmpNumDec_Backcolor ;
   private int edtBarAlbPne_Backcolor ;
   private int edtAlbHdrUlin_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtAlbProCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long wcpOA30AlbProCod ;
   private long Z30AlbProCod ;
   private long A30AlbProCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z2026BarAlbPbr ;
   private java.math.BigDecimal Z1462BarAlbTar ;
   private java.math.BigDecimal Z2771ALbHdrImp ;
   private java.math.BigDecimal Z2766AlbHdrRD ;
   private java.math.BigDecimal Z2767AlbHdrPKg ;
   private java.math.BigDecimal Z2768AlbHdrKgs ;
   private java.math.BigDecimal Z2769AlbHdrPMt ;
   private java.math.BigDecimal Z2770ALbHdrMts ;
   private java.math.BigDecimal O2769AlbHdrPMt ;
   private java.math.BigDecimal O2770ALbHdrMts ;
   private java.math.BigDecimal O2767AlbHdrPKg ;
   private java.math.BigDecimal O2768AlbHdrKgs ;
   private java.math.BigDecimal O2771ALbHdrImp ;
   private java.math.BigDecimal A2027BarAlbPne ;
   private java.math.BigDecimal A2026BarAlbPbr ;
   private java.math.BigDecimal A1462BarAlbTar ;
   private java.math.BigDecimal A2766AlbHdrRD ;
   private java.math.BigDecimal A2767AlbHdrPKg ;
   private java.math.BigDecimal A2768AlbHdrKgs ;
   private java.math.BigDecimal A2769AlbHdrPMt ;
   private java.math.BigDecimal A2770ALbHdrMts ;
   private java.math.BigDecimal A2771ALbHdrImp ;
   private java.math.BigDecimal T2769AlbHdrPMt ;
   private java.math.BigDecimal T2770ALbHdrMts ;
   private java.math.BigDecimal T2767AlbHdrPKg ;
   private java.math.BigDecimal T2768AlbHdrKgs ;
   private java.math.BigDecimal T2771ALbHdrImp ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOGx_mode ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z2765AlbHdrTxt ;
   private String Z2772AlbHdrTip ;
   private String Z3614AlbTxtCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_60_idx="0001" ;
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
   private String edtAlbHdrUlin_Internalname ;
   private String edtAlbHdrUlin_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtBarAlbPne_Internalname ;
   private String edtBarAlbPne_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtEmpNumDec_Internalname ;
   private String edtEmpNumDec_Jsonclick ;
   private String sMode402 ;
   private String edtavnRcdDeleted_402_Internalname ;
   private String edtAlbHdrLin_Internalname ;
   private String edtAlbHdrTxt_Internalname ;
   private String edtAlbHdrRD_Internalname ;
   private String edtAlbHdrPKg_Internalname ;
   private String edtAlbHdrKgs_Internalname ;
   private String edtAlbHdrPMt_Internalname ;
   private String edtALbHdrMts_Internalname ;
   private String edtALbHdrImp_Internalname ;
   private String edtAlbHdrTip_Internalname ;
   private String edtAlbTxtCod_Internalname ;
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
   private String hsh ;
   private String sMode195 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A2765AlbHdrTxt ;
   private String A2772AlbHdrTip ;
   private String A3614AlbTxtCod ;
   private String AV7Lit0 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String AV10EmprCod ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String sGXsfl_60_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_402_Jsonclick ;
   private String edtAlbHdrLin_Jsonclick ;
   private String edtAlbHdrTxt_Jsonclick ;
   private String edtAlbHdrRD_Jsonclick ;
   private String edtAlbHdrPKg_Jsonclick ;
   private String edtAlbHdrKgs_Jsonclick ;
   private String edtAlbHdrPMt_Jsonclick ;
   private String edtALbHdrMts_Jsonclick ;
   private String edtALbHdrImp_Jsonclick ;
   private String edtAlbHdrTip_Jsonclick ;
   private String edtAlbTxtCod_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_60_Refreshing=false ;
   private boolean n2026BarAlbPbr ;
   private boolean n1462BarAlbTar ;
   private boolean n3915EmpNumDec ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private byte[] T01M76_A3915EmpNumDec ;
   private boolean[] T01M76_n3915EmpNumDec ;
   private String[] T01M78_A396EmprCod ;
   private String[] T01M77_A396EmprCod ;
   private short[] T01M79_A2763AlbHdrUlin ;
   private byte[] T01M79_A3915EmpNumDec ;
   private boolean[] T01M79_n3915EmpNumDec ;
   private java.math.BigDecimal[] T01M79_A2026BarAlbPbr ;
   private boolean[] T01M79_n2026BarAlbPbr ;
   private java.math.BigDecimal[] T01M79_A1462BarAlbTar ;
   private boolean[] T01M79_n1462BarAlbTar ;
   private String[] T01M79_A396EmprCod ;
   private int[] T01M79_A129BarCod ;
   private byte[] T01M79_A132BarCodReo ;
   private String[] T01M79_A130BarCodPar ;
   private long[] T01M79_A30AlbProCod ;
   private String[] T01M710_A396EmprCod ;
   private long[] T01M710_A30AlbProCod ;
   private int[] T01M710_A129BarCod ;
   private byte[] T01M710_A132BarCodReo ;
   private String[] T01M710_A130BarCodPar ;
   private short[] T01M75_A2763AlbHdrUlin ;
   private java.math.BigDecimal[] T01M75_A2026BarAlbPbr ;
   private boolean[] T01M75_n2026BarAlbPbr ;
   private java.math.BigDecimal[] T01M75_A1462BarAlbTar ;
   private boolean[] T01M75_n1462BarAlbTar ;
   private String[] T01M75_A396EmprCod ;
   private int[] T01M75_A129BarCod ;
   private byte[] T01M75_A132BarCodReo ;
   private String[] T01M75_A130BarCodPar ;
   private long[] T01M75_A30AlbProCod ;
   private String[] T01M711_A396EmprCod ;
   private long[] T01M711_A30AlbProCod ;
   private int[] T01M711_A129BarCod ;
   private byte[] T01M711_A132BarCodReo ;
   private String[] T01M711_A130BarCodPar ;
   private String[] T01M712_A396EmprCod ;
   private long[] T01M712_A30AlbProCod ;
   private int[] T01M712_A129BarCod ;
   private byte[] T01M712_A132BarCodReo ;
   private String[] T01M712_A130BarCodPar ;
   private short[] T01M74_A2763AlbHdrUlin ;
   private java.math.BigDecimal[] T01M74_A2026BarAlbPbr ;
   private boolean[] T01M74_n2026BarAlbPbr ;
   private java.math.BigDecimal[] T01M74_A1462BarAlbTar ;
   private boolean[] T01M74_n1462BarAlbTar ;
   private String[] T01M74_A396EmprCod ;
   private int[] T01M74_A129BarCod ;
   private byte[] T01M74_A132BarCodReo ;
   private String[] T01M74_A130BarCodPar ;
   private long[] T01M74_A30AlbProCod ;
   private String[] T01M716_A396EmprCod ;
   private long[] T01M716_A30AlbProCod ;
   private int[] T01M716_A129BarCod ;
   private byte[] T01M716_A132BarCodReo ;
   private String[] T01M716_A130BarCodPar ;
   private short[] T01M716_A6648AlbMetLin ;
   private String[] T01M717_A396EmprCod ;
   private long[] T01M717_A30AlbProCod ;
   private int[] T01M717_A129BarCod ;
   private byte[] T01M717_A132BarCodReo ;
   private String[] T01M717_A130BarCodPar ;
   private short[] T01M717_A9639Et_Numero ;
   private String[] T01M718_A396EmprCod ;
   private long[] T01M718_A30AlbProCod ;
   private int[] T01M718_A129BarCod ;
   private byte[] T01M718_A132BarCodReo ;
   private String[] T01M718_A130BarCodPar ;
   private short[] T01M718_A6622AlbHdRLn ;
   private String[] T01M719_A396EmprCod ;
   private long[] T01M719_A30AlbProCod ;
   private int[] T01M719_A129BarCod ;
   private byte[] T01M719_A132BarCodReo ;
   private String[] T01M719_A130BarCodPar ;
   private short[] T01M719_A5456P_ForLin ;
   private String[] T01M720_A396EmprCod ;
   private long[] T01M720_A30AlbProCod ;
   private int[] T01M720_A129BarCod ;
   private byte[] T01M720_A132BarCodReo ;
   private String[] T01M720_A130BarCodPar ;
   private byte[] T01M720_A2524DisComLin ;
   private String[] T01M720_A1056DisComCod ;
   private String[] T01M720_A1032FonCod ;
   private String[] T01M721_A396EmprCod ;
   private long[] T01M721_A3617AlbTrnCod ;
   private long[] T01M721_A30AlbProCod ;
   private int[] T01M721_A129BarCod ;
   private byte[] T01M721_A132BarCodReo ;
   private String[] T01M721_A130BarCodPar ;
   private String[] T01M722_A396EmprCod ;
   private long[] T01M722_A30AlbProCod ;
   private int[] T01M722_A129BarCod ;
   private byte[] T01M722_A132BarCodReo ;
   private String[] T01M722_A130BarCodPar ;
   private short[] T01M722_A3621AlbPckLin ;
   private String[] T01M723_A396EmprCod ;
   private long[] T01M723_A30AlbProCod ;
   private int[] T01M723_A129BarCod ;
   private byte[] T01M723_A132BarCodReo ;
   private String[] T01M723_A130BarCodPar ;
   private short[] T01M723_A1468AlbPrdLin ;
   private String[] T01M724_A396EmprCod ;
   private long[] T01M724_A30AlbProCod ;
   private int[] T01M724_A129BarCod ;
   private byte[] T01M724_A132BarCodReo ;
   private String[] T01M724_A130BarCodPar ;
   private String[] T01M724_A200BarPieCod ;
   private String[] T01M725_A396EmprCod ;
   private long[] T01M725_A30AlbProCod ;
   private int[] T01M725_A129BarCod ;
   private byte[] T01M725_A132BarCodReo ;
   private String[] T01M725_A130BarCodPar ;
   private short[] T01M725_A1240GuiFasLin ;
   private String[] T01M727_A396EmprCod ;
   private long[] T01M727_A30AlbProCod ;
   private int[] T01M727_A129BarCod ;
   private byte[] T01M727_A132BarCodReo ;
   private String[] T01M727_A130BarCodPar ;
   private long[] T01M728_A30AlbProCod ;
   private short[] T01M728_A2764AlbHdrLin ;
   private java.math.BigDecimal[] T01M728_A2771ALbHdrImp ;
   private String[] T01M728_A2765AlbHdrTxt ;
   private java.math.BigDecimal[] T01M728_A2766AlbHdrRD ;
   private java.math.BigDecimal[] T01M728_A2767AlbHdrPKg ;
   private java.math.BigDecimal[] T01M728_A2768AlbHdrKgs ;
   private java.math.BigDecimal[] T01M728_A2769AlbHdrPMt ;
   private java.math.BigDecimal[] T01M728_A2770ALbHdrMts ;
   private String[] T01M728_A2772AlbHdrTip ;
   private String[] T01M728_A3614AlbTxtCod ;
   private String[] T01M728_A396EmprCod ;
   private int[] T01M728_A129BarCod ;
   private byte[] T01M728_A132BarCodReo ;
   private String[] T01M728_A130BarCodPar ;
   private String[] T01M729_A396EmprCod ;
   private long[] T01M729_A30AlbProCod ;
   private int[] T01M729_A129BarCod ;
   private byte[] T01M729_A132BarCodReo ;
   private String[] T01M729_A130BarCodPar ;
   private short[] T01M729_A2764AlbHdrLin ;
   private long[] T01M73_A30AlbProCod ;
   private short[] T01M73_A2764AlbHdrLin ;
   private java.math.BigDecimal[] T01M73_A2771ALbHdrImp ;
   private String[] T01M73_A2765AlbHdrTxt ;
   private java.math.BigDecimal[] T01M73_A2766AlbHdrRD ;
   private java.math.BigDecimal[] T01M73_A2767AlbHdrPKg ;
   private java.math.BigDecimal[] T01M73_A2768AlbHdrKgs ;
   private java.math.BigDecimal[] T01M73_A2769AlbHdrPMt ;
   private java.math.BigDecimal[] T01M73_A2770ALbHdrMts ;
   private String[] T01M73_A2772AlbHdrTip ;
   private String[] T01M73_A3614AlbTxtCod ;
   private String[] T01M73_A396EmprCod ;
   private int[] T01M73_A129BarCod ;
   private byte[] T01M73_A132BarCodReo ;
   private String[] T01M73_A130BarCodPar ;
   private long[] T01M72_A30AlbProCod ;
   private short[] T01M72_A2764AlbHdrLin ;
   private java.math.BigDecimal[] T01M72_A2771ALbHdrImp ;
   private String[] T01M72_A2765AlbHdrTxt ;
   private java.math.BigDecimal[] T01M72_A2766AlbHdrRD ;
   private java.math.BigDecimal[] T01M72_A2767AlbHdrPKg ;
   private java.math.BigDecimal[] T01M72_A2768AlbHdrKgs ;
   private java.math.BigDecimal[] T01M72_A2769AlbHdrPMt ;
   private java.math.BigDecimal[] T01M72_A2770ALbHdrMts ;
   private String[] T01M72_A2772AlbHdrTip ;
   private String[] T01M72_A3614AlbTxtCod ;
   private String[] T01M72_A396EmprCod ;
   private int[] T01M72_A129BarCod ;
   private byte[] T01M72_A132BarCodReo ;
   private String[] T01M72_A130BarCodPar ;
   private String[] T01M733_A396EmprCod ;
   private long[] T01M733_A30AlbProCod ;
   private int[] T01M733_A129BarCod ;
   private byte[] T01M733_A132BarCodReo ;
   private String[] T01M733_A130BarCodPar ;
   private short[] T01M733_A2764AlbHdrLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttrn23__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn23__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn23__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn23__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn23__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01M72", "SELECT AlbProCod, AlbHdrLin, ALbHdrImp, AlbHdrTxt, AlbHdrRD, AlbHdrPKg, AlbHdrKgs, AlbHdrPMt, ALbHdrMts, AlbHdrTip, AlbTxtCod, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPALBTXT WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbHdrLin = ?  FOR UPDATE OF ALbHdrImp, AlbHdrTxt, AlbHdrRD, AlbHdrPKg, AlbHdrKgs, AlbHdrPMt, ALbHdrMts, AlbHdrTip, AlbTxtCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M73", "SELECT AlbProCod, AlbHdrLin, ALbHdrImp, AlbHdrTxt, AlbHdrRD, AlbHdrPKg, AlbHdrKgs, AlbHdrPMt, ALbHdrMts, AlbHdrTip, AlbTxtCod, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPALBTXT WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbHdrLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M74", "SELECT AlbHdrUlin, BarAlbPbr, BarAlbTar, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF AlbHdrUlin, BarAlbPbr, BarAlbTar NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M75", "SELECT AlbHdrUlin, BarAlbPbr, BarAlbTar, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M76", "SELECT EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M77", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M78", "SELECT EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M79", "SELECT /*+ FIRST_ROWS(1) */ TM1.AlbHdrUlin, T2.EmpNumDec, TM1.BarAlbPbr, TM1.BarAlbTar, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.AlbProCod FROM (TXPALBBAR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.AlbProCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.AlbProCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M710", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M711", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M712", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod DESC, AlbProCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01M713", "INSERT INTO TXPALBBAR(AlbHdrUlin, BarAlbPbr, BarAlbTar, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod, AlbProEsp, AlbProRec, TubCod, BarAlbKgmE, BarAlbMtrE, BarAlbPie, BarAlbTub, GuiFasULin, BarPreKgm, BarPreMtr, AlbPConPie, BarAlbBul, BarAlbFor, BarAlbTip, BarAlbPN, AlbPrdULin, IntCod, ManCod, BarFasExt, BarFasExtD, BarAlbObs, BarAlbExt, BarAlbTin, AlbHdrObs, AlbBarRec, AlbBarDto, AlbProVal, AlbTipCon, AlbHdrAnc, CodCod, AlbSer, AlbColNom, AlbColNum, AlbTipCol, AlbPckUlin, AlbEncCli, AlbHdrgm2, TipAcaCod, AlbTipEnt, AlbImpMan, P_ForULin, PlasCod, BarAlbPlas, AlbHdRUl, AlbObsM, BarPreFKg, BarPreFMt, BarPreTKg, BarPreTMt, AlbEncL, AlbEncA, AlbCald, AlbDf1, AlbDf2, AlbDf3, AlbMqTj, AlbDto, AlbSerD, Et_UltNum, BarKgsCli, AlbMetULi, AlbCliCod, BarPreUnd, BarAlbUnd, AlbNomCli, AlbNumcli, AlbTipArt, AlbCadEnc, AlbTiras, AlbTirasKg, AlbSinTest) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPALBBAR")
         ,new UpdateCursor("T01M714", "UPDATE TXPALBBAR SET AlbHdrUlin=?, BarAlbPbr=?, BarAlbTar=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new UpdateCursor("T01M715", "DELETE FROM TXPALBBAR  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new ForEachCursor("T01M716", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbMetLin FROM TXPMETCAL WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M717", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, Et_Numero FROM TXPEDIETI WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M718", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M719", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, P_ForLin FROM TXPALBQUI WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M720", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPALBEST WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M721", "SELECT * FROM (SELECT EmprCod, AlbTrnCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPLALBTR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M722", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPckLin FROM TXPALBPCK WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M723", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPrdLin FROM TXPALBPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M724", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M725", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01M726", "UPDATE TXPALBBAR SET AlbHdrUlin=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new ForEachCursor("T01M727", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M728", "SELECT AlbProCod, AlbHdrLin, ALbHdrImp, AlbHdrTxt, AlbHdrRD, AlbHdrPKg, AlbHdrKgs, AlbHdrPMt, ALbHdrMts, AlbHdrTip, AlbTxtCod, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPALBTXT WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and AlbHdrLin = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M729", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin FROM TXPALBTXT WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbHdrLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01M730", "INSERT INTO TXPALBTXT(AlbProCod, AlbHdrLin, ALbHdrImp, AlbHdrTxt, AlbHdrRD, AlbHdrPKg, AlbHdrKgs, AlbHdrPMt, ALbHdrMts, AlbHdrTip, AlbTxtCod, EmprCod, BarCod, BarCodReo, BarCodPar, AlbHdrPzs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPALBTXT")
         ,new UpdateCursor("T01M731", "UPDATE TXPALBTXT SET ALbHdrImp=?, AlbHdrTxt=?, AlbHdrRD=?, AlbHdrPKg=?, AlbHdrKgs=?, AlbHdrPMt=?, ALbHdrMts=?, AlbHdrTip=?, AlbTxtCod=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbHdrLin = ?", GX_NOMASK, "TXPALBTXT")
         ,new UpdateCursor("T01M732", "DELETE FROM TXPALBTXT  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbHdrLin = ?", GX_NOMASK, "TXPALBTXT")
         ,new ForEachCursor("T01M733", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin FROM TXPALBTXT WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((long[]) buf[9])[0] = rslt.getLong(8);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((long[]) buf[9])[0] = rslt.getLong(8);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((long[]) buf[11])[0] = rslt.getLong(9);
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
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
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
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               }
               stmt.setString(4, (String)parms[5], 3);
               stmt.setInt(5, ((Number) parms[6]).intValue());
               stmt.setByte(6, ((Number) parms[7]).byteValue());
               stmt.setString(7, (String)parms[8], 1);
               stmt.setLong(8, ((Number) parms[9]).longValue());
               return;
            case 12 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
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
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
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
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 30);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 5);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 6);
               stmt.setString(12, (String)parms[11], 3);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 1);
               return;
            case 29 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 30);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 6);
               stmt.setString(10, (String)parms[9], 3);
               stmt.setLong(11, ((Number) parms[10]).longValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setString(14, (String)parms[13], 1);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
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
      }
   }

}

