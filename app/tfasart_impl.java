package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tfasart_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action17") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV27Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
         AV17UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         AV25Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Station", AV25Station);
         AV24Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24Inc_obs", AV24Inc_obs);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A1242GuiFasPMt = CommonUtil.decimalVal( httpContext.GetPar( "GuiFasPMt"), ".") ;
         AV22Pmt = CommonUtil.decimalVal( httpContext.GetPar( "Pmt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Pmt", GXutil.ltrimstr( AV22Pmt, 13, 5));
         A1241GuiFasPKg = CommonUtil.decimalVal( httpContext.GetPar( "GuiFasPKg"), ".") ;
         AV23Pkg = CommonUtil.decimalVal( httpContext.GetPar( "Pkg"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Pkg", GXutil.ltrimstr( AV23Pkg, 13, 5));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_17_XY194( A396EmprCod, AV27Pgmname, AV17UsurCod, AV25Station, AV24Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar, A1242GuiFasPMt, AV22Pmt, A1241GuiFasPKg, AV23Pkg) ;
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
         gxdlaartadicodXY194( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_24") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_24( A396EmprCod, A457FasCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Precios/Fases Artextil", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBarAlbKgmE_Internalname ;
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
      nRC_GXsfl_85 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_85"))) ;
      nGXsfl_85_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_85_idx"))) ;
      sGXsfl_85_idx = httpContext.GetPar( "sGXsfl_85_idx") ;
      A1248GuiFasULin = (short)(GXutil.lval( httpContext.GetPar( "GuiFasULin"))) ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      A1263BarAlbMtrE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbMtrE"), ".") ;
      A1261BarAlbKgmE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbKgmE"), ".") ;
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

   public tfasart_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tfasart_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfasart_impl.class ));
   }

   public tfasart_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      dynArtAdiCod = new HTMLChoice();
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TFASART.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Numero Albaran Produccion", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "", "", "", "", "", 1, edtAlbProCod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Ultima Linea Fase", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiFasULin_Internalname, GXutil.ltrim( localUtil.ntoc( A1248GuiFasULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGuiFasULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1248GuiFasULin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1248GuiFasULin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiFasULin_Jsonclick, 0, "", "", "", "", "", 1, edtGuiFasULin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Kilos Entregados", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAlbKgmE_Internalname, GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAlbKgmE_Enabled!=0) ? localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99") : localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAlbKgmE_Jsonclick, 0, "", "", "", "", "", 1, edtBarAlbKgmE_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Metros Entregados H. Ruta", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAlbMtrE_Internalname, GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAlbMtrE_Enabled!=0) ? localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99") : localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAlbMtrE_Jsonclick, 0, "", "", "", "", "", 1, edtBarAlbMtrE_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Entregar a...", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisEnt_Internalname, GXutil.rtrim( A366DisEnt), GXutil.rtrim( localUtil.format( A366DisEnt, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisEnt_Jsonclick, 0, "", "", "", "", "", 1, edtDisEnt_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Tipo de Cono", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTipCon_Internalname, GXutil.ltrim( localUtil.ntoc( A3139AlbTipCon, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbTipCon_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3139AlbTipCon), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3139AlbTipCon), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTipCon_Jsonclick, 0, "", "", "", "", "", 1, edtAlbTipCon_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Codigo Fase Externa", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasExt_Internalname, GXutil.rtrim( A2398BarFasExt), GXutil.rtrim( localUtil.format( A2398BarFasExt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasExt_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasExt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Descripcion Fase Externa", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasExtD_Internalname, GXutil.rtrim( A2399BarFasExtD), GXutil.rtrim( localUtil.format( A2399BarFasExtD, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasExtD_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasExtD_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol85( ) ;
      nGXsfl_85_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount194 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_194 = (short)(1) ;
            scanStartXY194( ) ;
            while ( RcdFound194 != 0 )
            {
               init_level_properties194( ) ;
               getByPrimaryKeyXY194( ) ;
               addRowXY194( ) ;
               scanNextXY194( ) ;
            }
            scanEndXY194( ) ;
            nBlankRcdCount194 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B1248GuiFasULin = A1248GuiFasULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
         B3139AlbTipCon = A3139AlbTipCon ;
         n3139AlbTipCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3139AlbTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3139AlbTipCon), 4, 0));
         standaloneNotModalXY194( ) ;
         standaloneModalXY194( ) ;
         sMode194 = Gx_mode ;
         while ( nGXsfl_85_idx < nRC_GXsfl_85 )
         {
            bGXsfl_85_Refreshing = true ;
            readRowXY194( ) ;
            edtavnRcdDeleted_194_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_194_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_194_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_194_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtGuiFasLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASLIN_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGuiFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasLin_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            dynArtAdiCod.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ARTADICOD_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, dynArtAdiCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynArtAdiCod.getEnabled(), 5, 0), !bGXsfl_85_Refreshing);
            edtFasFacMaqC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASFACMAQC_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasFacMaqC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasFacMaqC_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtGuiFasPKg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASPKG_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGuiFasPKg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPKg_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtGuiFasPMt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASPMT_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGuiFasPMt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPMt_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtGuiFasPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASPRE_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGuiFasPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPre_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtFasKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASKGM_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasKgm_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtFasMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASMTR_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasMtr_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtFasPreDsK_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREDSK_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasPreDsK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreDsK_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtFasPreDsM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREDSM_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasPreDsM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreDsM_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtGuiFasDto_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASDTO_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGuiFasDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasDto_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtGuiFasRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASREC_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGuiFasRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasRec_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtGuiFasCCo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASCCO_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGuiFasCCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasCCo_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtGuiFasPBK_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASPBK_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGuiFasPBK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPBK_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtGuiFasPBM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASPBM_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGuiFasPBM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPBM_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtGuiFasPB_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASPB_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGuiFasPB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPB_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            if ( ( nRcdExists_194 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalXY194( ) ;
            }
            sendRowXY194( ) ;
            bGXsfl_85_Refreshing = false ;
         }
         Gx_mode = sMode194 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1248GuiFasULin = B1248GuiFasULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
         A3139AlbTipCon = B3139AlbTipCon ;
         n3139AlbTipCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3139AlbTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3139AlbTipCon), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount194 = (short)(5) ;
         nRcdExists_194 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartXY194( ) ;
            while ( RcdFound194 != 0 )
            {
               sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_85194( ) ;
               init_level_properties194( ) ;
               standaloneNotModalXY194( ) ;
               getByPrimaryKeyXY194( ) ;
               standaloneModalXY194( ) ;
               addRowXY194( ) ;
               scanNextXY194( ) ;
            }
            scanEndXY194( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode194 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_85194( ) ;
      initAllXY194( ) ;
      init_level_properties194( ) ;
      B1248GuiFasULin = A1248GuiFasULin ;
      httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
      B3139AlbTipCon = A3139AlbTipCon ;
      n3139AlbTipCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3139AlbTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3139AlbTipCon), 4, 0));
      nRcdExists_194 = (short)(0) ;
      nIsMod_194 = (short)(0) ;
      nRcdDeleted_194 = (short)(0) ;
      nBlankRcdCount194 = (short)(nBlankRcdUsr194+nBlankRcdCount194) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount194 > 0 )
      {
         standaloneNotModalXY194( ) ;
         standaloneModalXY194( ) ;
         addRowXY194( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtGuiFasLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount194 = (short)(nBlankRcdCount194-1) ;
      }
      Gx_mode = sMode194 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A1248GuiFasULin = B1248GuiFasULin ;
      httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
      A3139AlbTipCon = B3139AlbTipCon ;
      n3139AlbTipCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3139AlbTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3139AlbTipCon), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TFASART.htm");
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
      e11XY2 ();
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
            Z2398BarFasExt = httpContext.cgiGet( "Z2398BarFasExt") ;
            Z1248GuiFasULin = (short)(localUtil.ctol( httpContext.cgiGet( "Z1248GuiFasULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( "Z1261BarAlbKgmE")) ;
            Z1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( "Z1263BarAlbMtrE")) ;
            Z3139AlbTipCon = (short)(localUtil.ctol( httpContext.cgiGet( "Z3139AlbTipCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O1248GuiFasULin = (short)(localUtil.ctol( httpContext.cgiGet( "O1248GuiFasULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O3139AlbTipCon = (short)(localUtil.ctol( httpContext.cgiGet( "O3139AlbTipCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_85 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_85"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV27Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV22Pmt = localUtil.ctond( httpContext.cgiGet( "vPMT")) ;
            AV23Pkg = localUtil.ctond( httpContext.cgiGet( "vPKG")) ;
            AV24Inc_obs = httpContext.cgiGet( "vINC_OBS") ;
            AV25Station = httpContext.cgiGet( "vSTATION") ;
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
            A1248GuiFasULin = (short)(localUtil.ctol( httpContext.cgiGet( edtGuiFasULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARALBKGME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarAlbKgmE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1261BarAlbKgmE = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
            }
            else
            {
               A1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARALBMTRE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarAlbMtrE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1263BarAlbMtrE = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
            }
            else
            {
               A1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
            }
            A366DisEnt = httpContext.cgiGet( edtDisEnt_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A366DisEnt", A366DisEnt);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbTipCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbTipCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBTIPCON");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbTipCon_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3139AlbTipCon = (short)(0) ;
               n3139AlbTipCon = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3139AlbTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3139AlbTipCon), 4, 0));
            }
            else
            {
               A3139AlbTipCon = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbTipCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3139AlbTipCon = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3139AlbTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3139AlbTipCon), 4, 0));
            }
            A2398BarFasExt = httpContext.cgiGet( edtBarFasExt_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2398BarFasExt", A2398BarFasExt);
            A2399BarFasExtD = httpContext.cgiGet( edtBarFasExtD_Internalname) ;
            n2399BarFasExtD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2399BarFasExtD", A2399BarFasExtD);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens2 = new com.genexus.util.GXProperties() ;
            if ( ! isIns( )  )
            {
               forbiddenHiddens2.add("FasCod", GXutil.rtrim( localUtil.format( A457FasCod, "@!")));
            }
            hsh2 = httpContext.cgiGet( "hsh2") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens2.toString(), hsh2, GXKey) )
            {
               GXutil.writeLogError("tfasart:[ CondSecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens2.toJSonString());
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
                        e11XY2 ();
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
            initAllXY195( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_194_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_194_Enabled), 5, 0), !bGXsfl_85_Refreshing);
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
      disableAttributesXY195( ) ;
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

   public void confirm_XY0( )
   {
      beforeValidateXY195( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsXY195( ) ;
         }
         else
         {
            checkExtendedTableXY195( ) ;
            if ( AnyError == 0 )
            {
               zmXY195( 19) ;
               zmXY195( 20) ;
               zmXY195( 21) ;
               zmXY195( 22) ;
            }
            closeExtendedTableCursorsXY195( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode195 = Gx_mode ;
         confirm_XY194( ) ;
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
         confirmValuesXY0( ) ;
      }
   }

   public void confirm_XY194( )
   {
      s1248GuiFasULin = O1248GuiFasULin ;
      httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
      nGXsfl_85_idx = 0 ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         readRowXY194( ) ;
         if ( ( nRcdExists_194 != 0 ) || ( nIsMod_194 != 0 ) )
         {
            getKeyXY194( ) ;
            if ( ( nRcdExists_194 == 0 ) && ( nRcdDeleted_194 == 0 ) )
            {
               if ( RcdFound194 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateXY194( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableXY194( ) ;
                     if ( AnyError == 0 )
                     {
                        zmXY194( 24) ;
                     }
                     closeExtendedTableCursorsXY194( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O1248GuiFasULin = A1248GuiFasULin ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "GUIFASLIN_" + sGXsfl_85_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtGuiFasLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound194 != 0 )
               {
                  if ( nRcdDeleted_194 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyXY194( ) ;
                     loadXY194( ) ;
                     beforeValidateXY194( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsXY194( ) ;
                        O1248GuiFasULin = A1248GuiFasULin ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_194 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateXY194( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableXY194( ) ;
                           if ( AnyError == 0 )
                           {
                              zmXY194( 24) ;
                           }
                           closeExtendedTableCursorsXY194( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O1248GuiFasULin = A1248GuiFasULin ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_194 == 0 )
                  {
                     GXCCtl = "GUIFASLIN_" + sGXsfl_85_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtGuiFasLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_194_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_194, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGuiFasLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1240GuiFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( dynArtAdiCod.getInternalname(), GXutil.ltrim( localUtil.ntoc( A7727ArtAdiCod, (byte)(3), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtFasFacMaqC_Internalname, GXutil.rtrim( A7392FasFacMaqC)) ;
         httpContext.changePostValue( edtGuiFasPKg_Internalname, GXutil.ltrim( localUtil.ntoc( A1241GuiFasPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGuiFasPMt_Internalname, GXutil.ltrim( localUtil.ntoc( A1242GuiFasPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGuiFasPre_Internalname, GXutil.ltrim( localUtil.ntoc( A7750GuiFasPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A1275FasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1276FasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPreDsK_Internalname, GXutil.rtrim( A4390FasPreDsK)) ;
         httpContext.changePostValue( edtFasPreDsM_Internalname, GXutil.rtrim( A4391FasPreDsM)) ;
         httpContext.changePostValue( edtGuiFasDto_Internalname, GXutil.ltrim( localUtil.ntoc( A7751GuiFasDto, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGuiFasRec_Internalname, GXutil.ltrim( localUtil.ntoc( A7752GuiFasRec, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGuiFasCCo_Internalname, GXutil.ltrim( localUtil.ntoc( A7753GuiFasCCo, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGuiFasPBK_Internalname, GXutil.ltrim( localUtil.ntoc( A8194GuiFasPBK, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGuiFasPBM_Internalname, GXutil.ltrim( localUtil.ntoc( A8195GuiFasPBM, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGuiFasPB_Internalname, GXutil.ltrim( localUtil.ntoc( A8196GuiFasPB, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1240GuiFasLin_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z1240GuiFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1276FasMtr_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z1276FasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1275FasKgm_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z1275FasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7727ArtAdiCod_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z7727ArtAdiCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7392FasFacMaqC_"+sGXsfl_85_idx, GXutil.rtrim( Z7392FasFacMaqC)) ;
         httpContext.changePostValue( "ZT_"+"Z1241GuiFasPKg_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z1241GuiFasPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1242GuiFasPMt_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z1242GuiFasPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7750GuiFasPre_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z7750GuiFasPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4390FasPreDsK_"+sGXsfl_85_idx, GXutil.rtrim( Z4390FasPreDsK)) ;
         httpContext.changePostValue( "ZT_"+"Z4391FasPreDsM_"+sGXsfl_85_idx, GXutil.rtrim( Z4391FasPreDsM)) ;
         httpContext.changePostValue( "ZT_"+"Z7751GuiFasDto_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z7751GuiFasDto, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7752GuiFasRec_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z7752GuiFasRec, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7753GuiFasCCo_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z7753GuiFasCCo, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8194GuiFasPBK_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z8194GuiFasPBK, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8195GuiFasPBM_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z8195GuiFasPBM, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8196GuiFasPB_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z8196GuiFasPB, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_85_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "T1241GuiFasPKg_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O1241GuiFasPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1242GuiFasPMt_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O1242GuiFasPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_194_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_194, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_194_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_194, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_194_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_194, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_194 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_194_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_194_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GUIFASLIN_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTADICOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( dynArtAdiCod.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASFACMAQC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasFacMaqC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GUIFASPKG_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPKg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GUIFASPMT_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPMt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GUIFASPRE_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASKGM_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASMTR_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREDSK_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreDsK_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREDSM_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreDsM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GUIFASDTO_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasDto_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GUIFASREC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GUIFASCCO_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasCCo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GUIFASPBK_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPBK_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GUIFASPBM_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPBM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GUIFASPB_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPB_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O1248GuiFasULin = s1248GuiFasULin ;
      httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionXY0( )
   {
   }

   public void e11XY2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV21Lit ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1640_", ""), (byte)(99), GXv_char2) ;
      tfasart_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Lit = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit", AV21Lit);
      GXt_char1 = AV16Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      tfasart_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit0", AV16Lit0);
      GXt_char1 = AV19Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1017_", ""), (byte)(99), GXv_char2) ;
      tfasart_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit1", AV19Lit1);
      GXt_char1 = AV20Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char2) ;
      tfasart_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit2", AV20Lit2);
      GXt_char1 = AV18LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tfasart_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18LitFe", AV18LitFe);
      AV25Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Station", AV25Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV28Emprnom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV25Station, GXv_char2, GXv_char3, GXv_char4) ;
      tfasart_impl.this.A396EmprCod = GXv_char2[0] ;
      tfasart_impl.this.AV28Emprnom = GXv_char3[0] ;
      tfasart_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV28Emprnom", AV28Emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
   }

   public void zmXY195( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2399BarFasExtD = T00XY6_A2399BarFasExtD[0] ;
            Z2398BarFasExt = T00XY6_A2398BarFasExt[0] ;
            Z1248GuiFasULin = T00XY6_A1248GuiFasULin[0] ;
            Z1261BarAlbKgmE = T00XY6_A1261BarAlbKgmE[0] ;
            Z1263BarAlbMtrE = T00XY6_A1263BarAlbMtrE[0] ;
            Z3139AlbTipCon = T00XY6_A3139AlbTipCon[0] ;
         }
         else
         {
            Z2399BarFasExtD = A2399BarFasExtD ;
            Z2398BarFasExt = A2398BarFasExt ;
            Z1248GuiFasULin = A1248GuiFasULin ;
            Z1261BarAlbKgmE = A1261BarAlbKgmE ;
            Z1263BarAlbMtrE = A1263BarAlbMtrE ;
            Z3139AlbTipCon = A3139AlbTipCon ;
         }
      }
      if ( GX_JID == -18 )
      {
         Z2399BarFasExtD = A2399BarFasExtD ;
         Z2398BarFasExt = A2398BarFasExt ;
         Z1248GuiFasULin = A1248GuiFasULin ;
         Z1261BarAlbKgmE = A1261BarAlbKgmE ;
         Z1263BarAlbMtrE = A1263BarAlbMtrE ;
         Z3139AlbTipCon = A3139AlbTipCon ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z30AlbProCod = A30AlbProCod ;
         Z407EmprNom = A407EmprNom ;
         Z361DisCod = A361DisCod ;
         Z366DisEnt = A366DisEnt ;
      }
   }

   public void standaloneNotModal( )
   {
      edtGuiFasULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasULin_Enabled), 5, 0), true);
      AV27Pgmname = "TFASART" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtGuiFasULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasULin_Enabled), 5, 0), true);
      /* Using cursor T00XY7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00XY7_A407EmprNom[0] ;
      n407EmprNom = T00XY7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T00XY9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(7);
      /* Using cursor T00XY8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A361DisCod = T00XY8_A361DisCod[0] ;
      pr_default.close(6);
      /* Using cursor T00XY10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A366DisEnt = T00XY10_A366DisEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A366DisEnt", A366DisEnt);
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

   public void loadXY195( )
   {
      /* Using cursor T00XY11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound195 = (short)(1) ;
         A361DisCod = T00XY11_A361DisCod[0] ;
         A2399BarFasExtD = T00XY11_A2399BarFasExtD[0] ;
         n2399BarFasExtD = T00XY11_n2399BarFasExtD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2399BarFasExtD", A2399BarFasExtD);
         A2398BarFasExt = T00XY11_A2398BarFasExt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2398BarFasExt", A2398BarFasExt);
         A1248GuiFasULin = T00XY11_A1248GuiFasULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
         A1261BarAlbKgmE = T00XY11_A1261BarAlbKgmE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
         A1263BarAlbMtrE = T00XY11_A1263BarAlbMtrE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
         A366DisEnt = T00XY11_A366DisEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A366DisEnt", A366DisEnt);
         A407EmprNom = T00XY11_A407EmprNom[0] ;
         n407EmprNom = T00XY11_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A3139AlbTipCon = T00XY11_A3139AlbTipCon[0] ;
         n3139AlbTipCon = T00XY11_n3139AlbTipCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3139AlbTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3139AlbTipCon), 4, 0));
         zmXY195( -18) ;
      }
      pr_default.close(9);
      onLoadActionsXY195( ) ;
   }

   public void onLoadActionsXY195( )
   {
   }

   public void checkExtendedTableXY195( )
   {
      nIsDirty_195 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursorsXY195( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyXY195( )
   {
      /* Using cursor T00XY12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound195 = (short)(1) ;
      }
      else
      {
         RcdFound195 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00XY6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T00XY6_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00XY6_A129BarCod[0] == A129BarCod ) && ( T00XY6_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00XY6_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00XY6_A30AlbProCod[0] == A30AlbProCod ) )
      {
         zmXY195( 18) ;
         RcdFound195 = (short)(1) ;
         A2399BarFasExtD = T00XY6_A2399BarFasExtD[0] ;
         n2399BarFasExtD = T00XY6_n2399BarFasExtD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2399BarFasExtD", A2399BarFasExtD);
         A2398BarFasExt = T00XY6_A2398BarFasExt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2398BarFasExt", A2398BarFasExt);
         A1248GuiFasULin = T00XY6_A1248GuiFasULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
         A1261BarAlbKgmE = T00XY6_A1261BarAlbKgmE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
         A1263BarAlbMtrE = T00XY6_A1263BarAlbMtrE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
         A3139AlbTipCon = T00XY6_A3139AlbTipCon[0] ;
         n3139AlbTipCon = T00XY6_n3139AlbTipCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3139AlbTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3139AlbTipCon), 4, 0));
         O1248GuiFasULin = A1248GuiFasULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
         O3139AlbTipCon = A3139AlbTipCon ;
         n3139AlbTipCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3139AlbTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3139AlbTipCon), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode195 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadXY195( ) ;
         if ( AnyError == 1 )
         {
            RcdFound195 = (short)(0) ;
            initializeNonKeyXY195( ) ;
         }
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound195 = (short)(0) ;
         initializeNonKeyXY195( ) ;
         sMode195 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKeyXY195( ) ;
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
      /* Using cursor T00XY13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T00XY13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00XY13_A129BarCod[0] == A129BarCod ) && ( T00XY13_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00XY13_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00XY13_A30AlbProCod[0] == A30AlbProCod ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T00XY13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00XY13_A129BarCod[0] == A129BarCod ) && ( T00XY13_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00XY13_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00XY13_A30AlbProCod[0] == A30AlbProCod ) )
         {
            RcdFound195 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound195 = (short)(0) ;
      /* Using cursor T00XY14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T00XY14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00XY14_A129BarCod[0] == A129BarCod ) && ( T00XY14_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00XY14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00XY14_A30AlbProCod[0] == A30AlbProCod ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T00XY14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00XY14_A129BarCod[0] == A129BarCod ) && ( T00XY14_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00XY14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00XY14_A30AlbProCod[0] == A30AlbProCod ) )
         {
            RcdFound195 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyXY195( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A1248GuiFasULin = O1248GuiFasULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
         GX_FocusControl = edtBarAlbKgmE_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertXY195( ) ;
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
               A1248GuiFasULin = O1248GuiFasULin ;
               httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBarAlbKgmE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A1248GuiFasULin = O1248GuiFasULin ;
               httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
               updateXY195( ) ;
               GX_FocusControl = edtBarAlbKgmE_Internalname ;
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
               A1248GuiFasULin = O1248GuiFasULin ;
               httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
               GX_FocusControl = edtBarAlbKgmE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertXY195( ) ;
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
                  A1248GuiFasULin = O1248GuiFasULin ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
                  GX_FocusControl = edtBarAlbKgmE_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertXY195( ) ;
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
         A1248GuiFasULin = O1248GuiFasULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBarAlbKgmE_Internalname ;
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
      getKeyXY195( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tfasart");
      GX_FocusControl = edtBarAlbKgmE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_XY0( ) ;
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
      GX_FocusControl = edtBarAlbKgmE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartXY195( ) ;
      if ( RcdFound195 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarAlbKgmE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndXY195( ) ;
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
      GX_FocusControl = edtBarAlbKgmE_Internalname ;
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
      GX_FocusControl = edtBarAlbKgmE_Internalname ;
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
      scanStartXY195( ) ;
      if ( RcdFound195 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound195 != 0 )
         {
            scanNextXY195( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarAlbKgmE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndXY195( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyXY195( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00XY5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z2399BarFasExtD, T00XY5_A2399BarFasExtD[0]) != 0 ) || ( GXutil.strcmp(Z2398BarFasExt, T00XY5_A2398BarFasExt[0]) != 0 ) || ( Z1248GuiFasULin != T00XY5_A1248GuiFasULin[0] ) || ( DecimalUtil.compareTo(Z1261BarAlbKgmE, T00XY5_A1261BarAlbKgmE[0]) != 0 ) || ( DecimalUtil.compareTo(Z1263BarAlbMtrE, T00XY5_A1263BarAlbMtrE[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3139AlbTipCon != T00XY5_A3139AlbTipCon[0] ) )
         {
            if ( GXutil.strcmp(Z2399BarFasExtD, T00XY5_A2399BarFasExtD[0]) != 0 )
            {
               GXutil.writeLogln("tfasart:[seudo value changed for attri]"+"BarFasExtD");
               GXutil.writeLogRaw("Old: ",Z2399BarFasExtD);
               GXutil.writeLogRaw("Current: ",T00XY5_A2399BarFasExtD[0]);
            }
            if ( GXutil.strcmp(Z2398BarFasExt, T00XY5_A2398BarFasExt[0]) != 0 )
            {
               GXutil.writeLogln("tfasart:[seudo value changed for attri]"+"BarFasExt");
               GXutil.writeLogRaw("Old: ",Z2398BarFasExt);
               GXutil.writeLogRaw("Current: ",T00XY5_A2398BarFasExt[0]);
            }
            if ( Z1248GuiFasULin != T00XY5_A1248GuiFasULin[0] )
            {
               GXutil.writeLogln("tfasart:[seudo value changed for attri]"+"GuiFasULin");
               GXutil.writeLogRaw("Old: ",Z1248GuiFasULin);
               GXutil.writeLogRaw("Current: ",T00XY5_A1248GuiFasULin[0]);
            }
            if ( DecimalUtil.compareTo(Z1261BarAlbKgmE, T00XY5_A1261BarAlbKgmE[0]) != 0 )
            {
               GXutil.writeLogln("tfasart:[seudo value changed for attri]"+"BarAlbKgmE");
               GXutil.writeLogRaw("Old: ",Z1261BarAlbKgmE);
               GXutil.writeLogRaw("Current: ",T00XY5_A1261BarAlbKgmE[0]);
            }
            if ( DecimalUtil.compareTo(Z1263BarAlbMtrE, T00XY5_A1263BarAlbMtrE[0]) != 0 )
            {
               GXutil.writeLogln("tfasart:[seudo value changed for attri]"+"BarAlbMtrE");
               GXutil.writeLogRaw("Old: ",Z1263BarAlbMtrE);
               GXutil.writeLogRaw("Current: ",T00XY5_A1263BarAlbMtrE[0]);
            }
            if ( Z3139AlbTipCon != T00XY5_A3139AlbTipCon[0] )
            {
               GXutil.writeLogln("tfasart:[seudo value changed for attri]"+"AlbTipCon");
               GXutil.writeLogRaw("Old: ",Z3139AlbTipCon);
               GXutil.writeLogRaw("Current: ",T00XY5_A3139AlbTipCon[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBBAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertXY195( )
   {
      beforeValidateXY195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableXY195( ) ;
      }
      if ( AnyError == 0 )
      {
         zmXY195( 0) ;
         checkOptimisticConcurrencyXY195( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmXY195( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertXY195( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00XY15 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n2399BarFasExtD), A2399BarFasExtD, A2398BarFasExt, Short.valueOf(A1248GuiFasULin), A1261BarAlbKgmE, A1263BarAlbMtrE, Boolean.valueOf(n3139AlbTipCon), Short.valueOf(A3139AlbTipCon), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
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
                        processLevelXY195( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionXY0( ) ;
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
            loadXY195( ) ;
         }
         endLevelXY195( ) ;
      }
      closeExtendedTableCursorsXY195( ) ;
   }

   public void updateXY195( )
   {
      beforeValidateXY195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableXY195( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyXY195( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmXY195( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateXY195( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00XY16 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n2399BarFasExtD), A2399BarFasExtD, A2398BarFasExt, Short.valueOf(A1248GuiFasULin), A1261BarAlbKgmE, A1263BarAlbMtrE, Boolean.valueOf(n3139AlbTipCon), Short.valueOf(A3139AlbTipCon), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateXY195( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelXY195( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionXY0( ) ;
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
         endLevelXY195( ) ;
      }
      closeExtendedTableCursorsXY195( ) ;
   }

   public void deferredUpdateXY195( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateXY195( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyXY195( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsXY195( ) ;
         afterConfirmXY195( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteXY195( ) ;
            if ( AnyError == 0 )
            {
               A1248GuiFasULin = O1248GuiFasULin ;
               httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
               scanStartXY194( ) ;
               while ( RcdFound194 != 0 )
               {
                  getByPrimaryKeyXY194( ) ;
                  deleteXY194( ) ;
                  scanNextXY194( ) ;
                  O1248GuiFasULin = A1248GuiFasULin ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
               }
               scanEndXY194( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00XY17 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
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
                           initAllXY195( ) ;
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
                        resetCaptionXY0( ) ;
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
      endLevelXY195( ) ;
      Gx_mode = sMode195 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsXY195( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00XY18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "METCAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T00XY19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EDIETI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T00XY20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREPg", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T00XY21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T00XY22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBEST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T00XY23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALBTRA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T00XY24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBPCK", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T00XY25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T00XY26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T00XY27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
      }
   }

   public void processNestedLevelXY194( )
   {
      s1248GuiFasULin = O1248GuiFasULin ;
      httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
      nGXsfl_85_idx = 0 ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         readRowXY194( ) ;
         if ( ( nRcdExists_194 != 0 ) || ( nIsMod_194 != 0 ) )
         {
            standaloneNotModalXY194( ) ;
            getKeyXY194( ) ;
            if ( ( nRcdExists_194 == 0 ) && ( nRcdDeleted_194 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertXY194( ) ;
            }
            else
            {
               if ( RcdFound194 != 0 )
               {
                  if ( ( nRcdDeleted_194 != 0 ) && ( nRcdExists_194 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteXY194( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_194 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateXY194( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_194 == 0 )
                  {
                     GXCCtl = "GUIFASLIN_" + sGXsfl_85_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtGuiFasLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O1248GuiFasULin = A1248GuiFasULin ;
            httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_194_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_194, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGuiFasLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1240GuiFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( dynArtAdiCod.getInternalname(), GXutil.ltrim( localUtil.ntoc( A7727ArtAdiCod, (byte)(3), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtFasFacMaqC_Internalname, GXutil.rtrim( A7392FasFacMaqC)) ;
         httpContext.changePostValue( edtGuiFasPKg_Internalname, GXutil.ltrim( localUtil.ntoc( A1241GuiFasPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGuiFasPMt_Internalname, GXutil.ltrim( localUtil.ntoc( A1242GuiFasPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGuiFasPre_Internalname, GXutil.ltrim( localUtil.ntoc( A7750GuiFasPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A1275FasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1276FasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPreDsK_Internalname, GXutil.rtrim( A4390FasPreDsK)) ;
         httpContext.changePostValue( edtFasPreDsM_Internalname, GXutil.rtrim( A4391FasPreDsM)) ;
         httpContext.changePostValue( edtGuiFasDto_Internalname, GXutil.ltrim( localUtil.ntoc( A7751GuiFasDto, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGuiFasRec_Internalname, GXutil.ltrim( localUtil.ntoc( A7752GuiFasRec, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGuiFasCCo_Internalname, GXutil.ltrim( localUtil.ntoc( A7753GuiFasCCo, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGuiFasPBK_Internalname, GXutil.ltrim( localUtil.ntoc( A8194GuiFasPBK, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGuiFasPBM_Internalname, GXutil.ltrim( localUtil.ntoc( A8195GuiFasPBM, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGuiFasPB_Internalname, GXutil.ltrim( localUtil.ntoc( A8196GuiFasPB, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1240GuiFasLin_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z1240GuiFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1276FasMtr_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z1276FasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1275FasKgm_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z1275FasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7727ArtAdiCod_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z7727ArtAdiCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7392FasFacMaqC_"+sGXsfl_85_idx, GXutil.rtrim( Z7392FasFacMaqC)) ;
         httpContext.changePostValue( "ZT_"+"Z1241GuiFasPKg_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z1241GuiFasPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1242GuiFasPMt_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z1242GuiFasPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7750GuiFasPre_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z7750GuiFasPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4390FasPreDsK_"+sGXsfl_85_idx, GXutil.rtrim( Z4390FasPreDsK)) ;
         httpContext.changePostValue( "ZT_"+"Z4391FasPreDsM_"+sGXsfl_85_idx, GXutil.rtrim( Z4391FasPreDsM)) ;
         httpContext.changePostValue( "ZT_"+"Z7751GuiFasDto_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z7751GuiFasDto, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7752GuiFasRec_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z7752GuiFasRec, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7753GuiFasCCo_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z7753GuiFasCCo, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8194GuiFasPBK_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z8194GuiFasPBK, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8195GuiFasPBM_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z8195GuiFasPBM, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8196GuiFasPB_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z8196GuiFasPB, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_85_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "T1241GuiFasPKg_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O1241GuiFasPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1242GuiFasPMt_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O1242GuiFasPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_194_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_194, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_194_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_194, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_194_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_194, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_194 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_194_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_194_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GUIFASLIN_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTADICOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( dynArtAdiCod.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASFACMAQC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasFacMaqC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GUIFASPKG_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPKg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GUIFASPMT_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPMt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GUIFASPRE_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASKGM_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASMTR_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREDSK_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreDsK_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREDSM_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreDsM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GUIFASDTO_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasDto_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GUIFASREC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GUIFASCCO_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasCCo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GUIFASPBK_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPBK_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GUIFASPBM_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPBM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GUIFASPB_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPB_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllXY194( ) ;
      if ( AnyError != 0 )
      {
         O1248GuiFasULin = s1248GuiFasULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
      }
      nRcdExists_194 = (short)(0) ;
      nIsMod_194 = (short)(0) ;
      nRcdDeleted_194 = (short)(0) ;
   }

   public void processLevelXY195( )
   {
      /* Save parent mode. */
      sMode195 = Gx_mode ;
      processNestedLevelXY194( ) ;
      if ( AnyError != 0 )
      {
         O1248GuiFasULin = s1248GuiFasULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode195 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T00XY28 */
      pr_default.execute(26, new Object[] {Short.valueOf(A1248GuiFasULin), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
   }

   public void endLevelXY195( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeCompleteXY195( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tfasart");
         if ( AnyError == 0 )
         {
            confirmValuesXY0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tfasart");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartXY195( )
   {
      /* Scan By routine */
      /* Using cursor T00XY29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
      RcdFound195 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound195 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextXY195( )
   {
      /* Scan next routine */
      pr_default.readNext(27);
      RcdFound195 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound195 = (short)(1) ;
      }
   }

   public void scanEndXY195( )
   {
      pr_default.close(27);
   }

   public void afterConfirmXY195( )
   {
      /* After Confirm Rules */
      if ( true /* After */ && ( O3139AlbTipCon == 1 ) && ( A3139AlbTipCon == 0 ) )
      {
         A2399BarFasExtD = AV17UsurCod ;
         n2399BarFasExtD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2399BarFasExtD", A2399BarFasExtD);
      }
      if ( true /* After */ && ( O3139AlbTipCon == 1 ) && ( A3139AlbTipCon == 0 ) )
      {
         A2398BarFasExt = localUtil.dtoc( GXutil.today( ), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2398BarFasExt", A2398BarFasExt);
      }
   }

   public void beforeInsertXY195( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateXY195( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteXY195( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteXY195( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateXY195( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesXY195( )
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
      edtGuiFasULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasULin_Enabled), 5, 0), true);
      edtBarAlbKgmE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbKgmE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbKgmE_Enabled), 5, 0), true);
      edtBarAlbMtrE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbMtrE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbMtrE_Enabled), 5, 0), true);
      edtDisEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisEnt_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtAlbTipCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTipCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTipCon_Enabled), 5, 0), true);
      edtBarFasExt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasExt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasExt_Enabled), 5, 0), true);
      edtBarFasExtD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasExtD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasExtD_Enabled), 5, 0), true);
   }

   public void zmXY194( int GX_JID )
   {
      if ( ( GX_JID == 23 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1276FasMtr = T00XY3_A1276FasMtr[0] ;
            Z1275FasKgm = T00XY3_A1275FasKgm[0] ;
            Z7727ArtAdiCod = T00XY3_A7727ArtAdiCod[0] ;
            Z7392FasFacMaqC = T00XY3_A7392FasFacMaqC[0] ;
            Z1241GuiFasPKg = T00XY3_A1241GuiFasPKg[0] ;
            Z1242GuiFasPMt = T00XY3_A1242GuiFasPMt[0] ;
            Z7750GuiFasPre = T00XY3_A7750GuiFasPre[0] ;
            Z4390FasPreDsK = T00XY3_A4390FasPreDsK[0] ;
            Z4391FasPreDsM = T00XY3_A4391FasPreDsM[0] ;
            Z7751GuiFasDto = T00XY3_A7751GuiFasDto[0] ;
            Z7752GuiFasRec = T00XY3_A7752GuiFasRec[0] ;
            Z7753GuiFasCCo = T00XY3_A7753GuiFasCCo[0] ;
            Z8194GuiFasPBK = T00XY3_A8194GuiFasPBK[0] ;
            Z8195GuiFasPBM = T00XY3_A8195GuiFasPBM[0] ;
            Z8196GuiFasPB = T00XY3_A8196GuiFasPB[0] ;
            Z457FasCod = T00XY3_A457FasCod[0] ;
         }
         else
         {
            Z1276FasMtr = A1276FasMtr ;
            Z1275FasKgm = A1275FasKgm ;
            Z7727ArtAdiCod = A7727ArtAdiCod ;
            Z7392FasFacMaqC = A7392FasFacMaqC ;
            Z1241GuiFasPKg = A1241GuiFasPKg ;
            Z1242GuiFasPMt = A1242GuiFasPMt ;
            Z7750GuiFasPre = A7750GuiFasPre ;
            Z4390FasPreDsK = A4390FasPreDsK ;
            Z4391FasPreDsM = A4391FasPreDsM ;
            Z7751GuiFasDto = A7751GuiFasDto ;
            Z7752GuiFasRec = A7752GuiFasRec ;
            Z7753GuiFasCCo = A7753GuiFasCCo ;
            Z8194GuiFasPBK = A8194GuiFasPBK ;
            Z8195GuiFasPBM = A8195GuiFasPBM ;
            Z8196GuiFasPB = A8196GuiFasPB ;
            Z457FasCod = A457FasCod ;
         }
      }
      if ( GX_JID == -23 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z1240GuiFasLin = A1240GuiFasLin ;
         Z1276FasMtr = A1276FasMtr ;
         Z1275FasKgm = A1275FasKgm ;
         Z7727ArtAdiCod = A7727ArtAdiCod ;
         Z7392FasFacMaqC = A7392FasFacMaqC ;
         Z1241GuiFasPKg = A1241GuiFasPKg ;
         Z1242GuiFasPMt = A1242GuiFasPMt ;
         Z7750GuiFasPre = A7750GuiFasPre ;
         Z4390FasPreDsK = A4390FasPreDsK ;
         Z4391FasPreDsM = A4391FasPreDsM ;
         Z7751GuiFasDto = A7751GuiFasDto ;
         Z7752GuiFasRec = A7752GuiFasRec ;
         Z7753GuiFasCCo = A7753GuiFasCCo ;
         Z8194GuiFasPBK = A8194GuiFasPBK ;
         Z8195GuiFasPBM = A8195GuiFasPBM ;
         Z8196GuiFasPB = A8196GuiFasPB ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z460FasDsc = A460FasDsc ;
      }
   }

   public void standaloneNotModalXY194( )
   {
      edtGuiFasULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasULin_Enabled), 5, 0), true);
      edtGuiFasULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasULin_Enabled), 5, 0), true);
      gxaartadicod_htmlXY194( A396EmprCod) ;
   }

   public void standaloneModalXY194( )
   {
      if ( ! isIns( )  )
      {
         edtFasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      else
      {
         edtFasCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      if ( ! isIns( )  )
      {
         dynArtAdiCod.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, dynArtAdiCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynArtAdiCod.getEnabled(), 5, 0), !bGXsfl_85_Refreshing);
      }
      else
      {
         dynArtAdiCod.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, dynArtAdiCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynArtAdiCod.getEnabled(), 5, 0), !bGXsfl_85_Refreshing);
      }
      if ( isIns( )  )
      {
         A1248GuiFasULin = (short)(O1248GuiFasULin+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A1240GuiFasLin = A1248GuiFasULin ;
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1276FasMtr)==0) && ( Gx_BScreen == 0 ) )
      {
         A1276FasMtr = A1263BarAlbMtrE ;
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1275FasKgm)==0) && ( Gx_BScreen == 0 ) )
      {
         A1275FasKgm = A1261BarAlbKgmE ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtGuiFasLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGuiFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasLin_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      else
      {
         edtGuiFasLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGuiFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasLin_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
   }

   public void loadXY194( )
   {
      /* Using cursor T00XY30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound194 = (short)(1) ;
         A1276FasMtr = T00XY30_A1276FasMtr[0] ;
         A1275FasKgm = T00XY30_A1275FasKgm[0] ;
         A460FasDsc = T00XY30_A460FasDsc[0] ;
         A7727ArtAdiCod = T00XY30_A7727ArtAdiCod[0] ;
         n7727ArtAdiCod = T00XY30_n7727ArtAdiCod[0] ;
         A7392FasFacMaqC = T00XY30_A7392FasFacMaqC[0] ;
         n7392FasFacMaqC = T00XY30_n7392FasFacMaqC[0] ;
         A1241GuiFasPKg = T00XY30_A1241GuiFasPKg[0] ;
         A1242GuiFasPMt = T00XY30_A1242GuiFasPMt[0] ;
         A7750GuiFasPre = T00XY30_A7750GuiFasPre[0] ;
         n7750GuiFasPre = T00XY30_n7750GuiFasPre[0] ;
         A4390FasPreDsK = T00XY30_A4390FasPreDsK[0] ;
         n4390FasPreDsK = T00XY30_n4390FasPreDsK[0] ;
         A4391FasPreDsM = T00XY30_A4391FasPreDsM[0] ;
         n4391FasPreDsM = T00XY30_n4391FasPreDsM[0] ;
         A7751GuiFasDto = T00XY30_A7751GuiFasDto[0] ;
         n7751GuiFasDto = T00XY30_n7751GuiFasDto[0] ;
         A7752GuiFasRec = T00XY30_A7752GuiFasRec[0] ;
         n7752GuiFasRec = T00XY30_n7752GuiFasRec[0] ;
         A7753GuiFasCCo = T00XY30_A7753GuiFasCCo[0] ;
         n7753GuiFasCCo = T00XY30_n7753GuiFasCCo[0] ;
         A8194GuiFasPBK = T00XY30_A8194GuiFasPBK[0] ;
         n8194GuiFasPBK = T00XY30_n8194GuiFasPBK[0] ;
         A8195GuiFasPBM = T00XY30_A8195GuiFasPBM[0] ;
         n8195GuiFasPBM = T00XY30_n8195GuiFasPBM[0] ;
         A8196GuiFasPB = T00XY30_A8196GuiFasPB[0] ;
         n8196GuiFasPB = T00XY30_n8196GuiFasPB[0] ;
         A457FasCod = T00XY30_A457FasCod[0] ;
         zmXY194( -23) ;
      }
      pr_default.close(28);
      onLoadActionsXY194( ) ;
   }

   public void onLoadActionsXY194( )
   {
      AV23Pkg = O1241GuiFasPKg ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Pkg", GXutil.ltrimstr( AV23Pkg, 13, 5));
      AV22Pmt = O1242GuiFasPMt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Pmt", GXutil.ltrimstr( AV22Pmt, 13, 5));
   }

   public void checkExtendedTableXY194( )
   {
      nIsDirty_194 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalXY194( ) ;
      /* Using cursor T00XY4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T00XY4_A460FasDsc[0] ;
      pr_default.close(2);
      AV23Pkg = O1241GuiFasPKg ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Pkg", GXutil.ltrimstr( AV23Pkg, 13, 5));
      AV22Pmt = O1242GuiFasPMt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Pmt", GXutil.ltrimstr( AV22Pmt, 13, 5));
   }

   public void closeExtendedTableCursorsXY194( )
   {
      pr_default.close(2);
   }

   public void enableDisableXY194( )
   {
   }

   public void gxload_24( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T00XY31 */
      pr_default.execute(29, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(29) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T00XY31_A460FasDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(29) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(29);
   }

   public void getKeyXY194( )
   {
      /* Using cursor T00XY32 */
      pr_default.execute(30, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound194 = (short)(1) ;
      }
      else
      {
         RcdFound194 = (short)(0) ;
      }
      pr_default.close(30);
   }

   public void getByPrimaryKeyXY194( )
   {
      /* Using cursor T00XY3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T00XY3_A30AlbProCod[0] == A30AlbProCod ) && ( GXutil.strcmp(T00XY3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00XY3_A129BarCod[0] == A129BarCod ) && ( T00XY3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00XY3_A130BarCodPar[0], A130BarCodPar) == 0 ) )
      {
         zmXY194( 23) ;
         RcdFound194 = (short)(1) ;
         initializeNonKeyXY194( ) ;
         A1240GuiFasLin = T00XY3_A1240GuiFasLin[0] ;
         A1276FasMtr = T00XY3_A1276FasMtr[0] ;
         A1275FasKgm = T00XY3_A1275FasKgm[0] ;
         A7727ArtAdiCod = T00XY3_A7727ArtAdiCod[0] ;
         n7727ArtAdiCod = T00XY3_n7727ArtAdiCod[0] ;
         A7392FasFacMaqC = T00XY3_A7392FasFacMaqC[0] ;
         n7392FasFacMaqC = T00XY3_n7392FasFacMaqC[0] ;
         A1241GuiFasPKg = T00XY3_A1241GuiFasPKg[0] ;
         A1242GuiFasPMt = T00XY3_A1242GuiFasPMt[0] ;
         A7750GuiFasPre = T00XY3_A7750GuiFasPre[0] ;
         n7750GuiFasPre = T00XY3_n7750GuiFasPre[0] ;
         A4390FasPreDsK = T00XY3_A4390FasPreDsK[0] ;
         n4390FasPreDsK = T00XY3_n4390FasPreDsK[0] ;
         A4391FasPreDsM = T00XY3_A4391FasPreDsM[0] ;
         n4391FasPreDsM = T00XY3_n4391FasPreDsM[0] ;
         A7751GuiFasDto = T00XY3_A7751GuiFasDto[0] ;
         n7751GuiFasDto = T00XY3_n7751GuiFasDto[0] ;
         A7752GuiFasRec = T00XY3_A7752GuiFasRec[0] ;
         n7752GuiFasRec = T00XY3_n7752GuiFasRec[0] ;
         A7753GuiFasCCo = T00XY3_A7753GuiFasCCo[0] ;
         n7753GuiFasCCo = T00XY3_n7753GuiFasCCo[0] ;
         A8194GuiFasPBK = T00XY3_A8194GuiFasPBK[0] ;
         n8194GuiFasPBK = T00XY3_n8194GuiFasPBK[0] ;
         A8195GuiFasPBM = T00XY3_A8195GuiFasPBM[0] ;
         n8195GuiFasPBM = T00XY3_n8195GuiFasPBM[0] ;
         A8196GuiFasPB = T00XY3_A8196GuiFasPB[0] ;
         n8196GuiFasPB = T00XY3_n8196GuiFasPB[0] ;
         A457FasCod = T00XY3_A457FasCod[0] ;
         O1241GuiFasPKg = A1241GuiFasPKg ;
         O1242GuiFasPMt = A1242GuiFasPMt ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z1240GuiFasLin = A1240GuiFasLin ;
         sMode194 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalXY194( ) ;
         loadXY194( ) ;
         Gx_mode = sMode194 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound194 = (short)(0) ;
         initializeNonKeyXY194( ) ;
         sMode194 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalXY194( ) ;
         Gx_mode = sMode194 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesXY194( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyXY194( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00XY2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z1276FasMtr, T00XY2_A1276FasMtr[0]) != 0 ) || ( DecimalUtil.compareTo(Z1275FasKgm, T00XY2_A1275FasKgm[0]) != 0 ) || ( Z7727ArtAdiCod != T00XY2_A7727ArtAdiCod[0] ) || ( GXutil.strcmp(Z7392FasFacMaqC, T00XY2_A7392FasFacMaqC[0]) != 0 ) || ( DecimalUtil.compareTo(Z1241GuiFasPKg, T00XY2_A1241GuiFasPKg[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z1242GuiFasPMt, T00XY2_A1242GuiFasPMt[0]) != 0 ) || ( DecimalUtil.compareTo(Z7750GuiFasPre, T00XY2_A7750GuiFasPre[0]) != 0 ) || ( GXutil.strcmp(Z4390FasPreDsK, T00XY2_A4390FasPreDsK[0]) != 0 ) || ( GXutil.strcmp(Z4391FasPreDsM, T00XY2_A4391FasPreDsM[0]) != 0 ) || ( DecimalUtil.compareTo(Z7751GuiFasDto, T00XY2_A7751GuiFasDto[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z7752GuiFasRec, T00XY2_A7752GuiFasRec[0]) != 0 ) || ( Z7753GuiFasCCo != T00XY2_A7753GuiFasCCo[0] ) || ( DecimalUtil.compareTo(Z8194GuiFasPBK, T00XY2_A8194GuiFasPBK[0]) != 0 ) || ( DecimalUtil.compareTo(Z8195GuiFasPBM, T00XY2_A8195GuiFasPBM[0]) != 0 ) || ( DecimalUtil.compareTo(Z8196GuiFasPB, T00XY2_A8196GuiFasPB[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z457FasCod, T00XY2_A457FasCod[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z1276FasMtr, T00XY2_A1276FasMtr[0]) != 0 )
            {
               GXutil.writeLogln("tfasart:[seudo value changed for attri]"+"FasMtr");
               GXutil.writeLogRaw("Old: ",Z1276FasMtr);
               GXutil.writeLogRaw("Current: ",T00XY2_A1276FasMtr[0]);
            }
            if ( DecimalUtil.compareTo(Z1275FasKgm, T00XY2_A1275FasKgm[0]) != 0 )
            {
               GXutil.writeLogln("tfasart:[seudo value changed for attri]"+"FasKgm");
               GXutil.writeLogRaw("Old: ",Z1275FasKgm);
               GXutil.writeLogRaw("Current: ",T00XY2_A1275FasKgm[0]);
            }
            if ( Z7727ArtAdiCod != T00XY2_A7727ArtAdiCod[0] )
            {
               GXutil.writeLogln("tfasart:[seudo value changed for attri]"+"ArtAdiCod");
               GXutil.writeLogRaw("Old: ",Z7727ArtAdiCod);
               GXutil.writeLogRaw("Current: ",T00XY2_A7727ArtAdiCod[0]);
            }
            if ( GXutil.strcmp(Z7392FasFacMaqC, T00XY2_A7392FasFacMaqC[0]) != 0 )
            {
               GXutil.writeLogln("tfasart:[seudo value changed for attri]"+"FasFacMaqC");
               GXutil.writeLogRaw("Old: ",Z7392FasFacMaqC);
               GXutil.writeLogRaw("Current: ",T00XY2_A7392FasFacMaqC[0]);
            }
            if ( DecimalUtil.compareTo(Z1241GuiFasPKg, T00XY2_A1241GuiFasPKg[0]) != 0 )
            {
               GXutil.writeLogln("tfasart:[seudo value changed for attri]"+"GuiFasPKg");
               GXutil.writeLogRaw("Old: ",Z1241GuiFasPKg);
               GXutil.writeLogRaw("Current: ",T00XY2_A1241GuiFasPKg[0]);
            }
            if ( DecimalUtil.compareTo(Z1242GuiFasPMt, T00XY2_A1242GuiFasPMt[0]) != 0 )
            {
               GXutil.writeLogln("tfasart:[seudo value changed for attri]"+"GuiFasPMt");
               GXutil.writeLogRaw("Old: ",Z1242GuiFasPMt);
               GXutil.writeLogRaw("Current: ",T00XY2_A1242GuiFasPMt[0]);
            }
            if ( DecimalUtil.compareTo(Z7750GuiFasPre, T00XY2_A7750GuiFasPre[0]) != 0 )
            {
               GXutil.writeLogln("tfasart:[seudo value changed for attri]"+"GuiFasPre");
               GXutil.writeLogRaw("Old: ",Z7750GuiFasPre);
               GXutil.writeLogRaw("Current: ",T00XY2_A7750GuiFasPre[0]);
            }
            if ( GXutil.strcmp(Z4390FasPreDsK, T00XY2_A4390FasPreDsK[0]) != 0 )
            {
               GXutil.writeLogln("tfasart:[seudo value changed for attri]"+"FasPreDsK");
               GXutil.writeLogRaw("Old: ",Z4390FasPreDsK);
               GXutil.writeLogRaw("Current: ",T00XY2_A4390FasPreDsK[0]);
            }
            if ( GXutil.strcmp(Z4391FasPreDsM, T00XY2_A4391FasPreDsM[0]) != 0 )
            {
               GXutil.writeLogln("tfasart:[seudo value changed for attri]"+"FasPreDsM");
               GXutil.writeLogRaw("Old: ",Z4391FasPreDsM);
               GXutil.writeLogRaw("Current: ",T00XY2_A4391FasPreDsM[0]);
            }
            if ( DecimalUtil.compareTo(Z7751GuiFasDto, T00XY2_A7751GuiFasDto[0]) != 0 )
            {
               GXutil.writeLogln("tfasart:[seudo value changed for attri]"+"GuiFasDto");
               GXutil.writeLogRaw("Old: ",Z7751GuiFasDto);
               GXutil.writeLogRaw("Current: ",T00XY2_A7751GuiFasDto[0]);
            }
            if ( DecimalUtil.compareTo(Z7752GuiFasRec, T00XY2_A7752GuiFasRec[0]) != 0 )
            {
               GXutil.writeLogln("tfasart:[seudo value changed for attri]"+"GuiFasRec");
               GXutil.writeLogRaw("Old: ",Z7752GuiFasRec);
               GXutil.writeLogRaw("Current: ",T00XY2_A7752GuiFasRec[0]);
            }
            if ( Z7753GuiFasCCo != T00XY2_A7753GuiFasCCo[0] )
            {
               GXutil.writeLogln("tfasart:[seudo value changed for attri]"+"GuiFasCCo");
               GXutil.writeLogRaw("Old: ",Z7753GuiFasCCo);
               GXutil.writeLogRaw("Current: ",T00XY2_A7753GuiFasCCo[0]);
            }
            if ( DecimalUtil.compareTo(Z8194GuiFasPBK, T00XY2_A8194GuiFasPBK[0]) != 0 )
            {
               GXutil.writeLogln("tfasart:[seudo value changed for attri]"+"GuiFasPBK");
               GXutil.writeLogRaw("Old: ",Z8194GuiFasPBK);
               GXutil.writeLogRaw("Current: ",T00XY2_A8194GuiFasPBK[0]);
            }
            if ( DecimalUtil.compareTo(Z8195GuiFasPBM, T00XY2_A8195GuiFasPBM[0]) != 0 )
            {
               GXutil.writeLogln("tfasart:[seudo value changed for attri]"+"GuiFasPBM");
               GXutil.writeLogRaw("Old: ",Z8195GuiFasPBM);
               GXutil.writeLogRaw("Current: ",T00XY2_A8195GuiFasPBM[0]);
            }
            if ( DecimalUtil.compareTo(Z8196GuiFasPB, T00XY2_A8196GuiFasPB[0]) != 0 )
            {
               GXutil.writeLogln("tfasart:[seudo value changed for attri]"+"GuiFasPB");
               GXutil.writeLogRaw("Old: ",Z8196GuiFasPB);
               GXutil.writeLogRaw("Current: ",T00XY2_A8196GuiFasPB[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T00XY2_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("tfasart:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T00XY2_A457FasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertXY194( )
   {
      beforeValidateXY194( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableXY194( ) ;
      }
      if ( AnyError == 0 )
      {
         zmXY194( 0) ;
         checkOptimisticConcurrencyXY194( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmXY194( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertXY194( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00XY33 */
                  pr_default.execute(31, new Object[] {Long.valueOf(A30AlbProCod), Short.valueOf(A1240GuiFasLin), A1276FasMtr, A1275FasKgm, Boolean.valueOf(n7727ArtAdiCod), Short.valueOf(A7727ArtAdiCod), Boolean.valueOf(n7392FasFacMaqC), A7392FasFacMaqC, A1241GuiFasPKg, A1242GuiFasPMt, Boolean.valueOf(n7750GuiFasPre), A7750GuiFasPre, Boolean.valueOf(n4390FasPreDsK), A4390FasPreDsK, Boolean.valueOf(n4391FasPreDsM), A4391FasPreDsM, Boolean.valueOf(n7751GuiFasDto), A7751GuiFasDto, Boolean.valueOf(n7752GuiFasRec), A7752GuiFasRec, Boolean.valueOf(n7753GuiFasCCo), Short.valueOf(A7753GuiFasCCo), Boolean.valueOf(n8194GuiFasPBK), A8194GuiFasPBK, Boolean.valueOf(n8195GuiFasPBM), A8195GuiFasPBM, Boolean.valueOf(n8196GuiFasPB), A8196GuiFasPB, A396EmprCod, A457FasCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
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
            loadXY194( ) ;
         }
         endLevelXY194( ) ;
      }
      closeExtendedTableCursorsXY194( ) ;
   }

   public void updateXY194( )
   {
      beforeValidateXY194( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableXY194( ) ;
      }
      if ( ( nIsMod_194 != 0 ) || ( nIsDirty_194 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyXY194( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmXY194( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateXY194( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00XY34 */
                     pr_default.execute(32, new Object[] {A1276FasMtr, A1275FasKgm, Boolean.valueOf(n7727ArtAdiCod), Short.valueOf(A7727ArtAdiCod), Boolean.valueOf(n7392FasFacMaqC), A7392FasFacMaqC, A1241GuiFasPKg, A1242GuiFasPMt, Boolean.valueOf(n7750GuiFasPre), A7750GuiFasPre, Boolean.valueOf(n4390FasPreDsK), A4390FasPreDsK, Boolean.valueOf(n4391FasPreDsM), A4391FasPreDsM, Boolean.valueOf(n7751GuiFasDto), A7751GuiFasDto, Boolean.valueOf(n7752GuiFasRec), A7752GuiFasRec, Boolean.valueOf(n7753GuiFasCCo), Short.valueOf(A7753GuiFasCCo), Boolean.valueOf(n8194GuiFasPBK), A8194GuiFasPBK, Boolean.valueOf(n8195GuiFasPBM), A8195GuiFasPBM, Boolean.valueOf(n8196GuiFasPB), A8196GuiFasPB, A457FasCod, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
                     if ( (pr_default.getStatus(32) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBFAS"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateXY194( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( ( ( DecimalUtil.compareTo(A1242GuiFasPMt, AV22Pmt) != 0 ) || ( DecimalUtil.compareTo(A1241GuiFasPKg, AV23Pkg) != 0 ) ) && true /* After */ )
                        {
                           AV24Inc_obs = httpContext.getMessage( httpContext.getMessage( "Modif. Precio ->", ""), "") + httpContext.getMessage( httpContext.getMessage( " Precio Kg=", ""), "") + GXutil.str( A1241GuiFasPKg, 13, 5) + httpContext.getMessage( httpContext.getMessage( " Precio Old=", ""), "") + GXutil.str( AV23Pkg, 13, 5) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( " Precio Mt=", ""), "") + GXutil.str( A1242GuiFasPMt, 13, 5) + httpContext.getMessage( httpContext.getMessage( " Precio Old=", ""), "") + GXutil.str( AV22Pmt, 13, 5) + GXutil.newLine( ) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV24Inc_obs", AV24Inc_obs);
                        }
                        if ( ( ( DecimalUtil.compareTo(A1242GuiFasPMt, AV22Pmt) != 0 ) || ( DecimalUtil.compareTo(A1241GuiFasPKg, AV23Pkg) != 0 ) ) && true /* After */ )
                        {
                           new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV27Pgmname, AV17UsurCod, AV25Station, AV24Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyXY194( ) ;
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
            endLevelXY194( ) ;
         }
      }
      closeExtendedTableCursorsXY194( ) ;
   }

   public void deferredUpdateXY194( )
   {
   }

   public void deleteXY194( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateXY194( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyXY194( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsXY194( ) ;
         afterConfirmXY194( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteXY194( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00XY35 */
               pr_default.execute(33, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
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
      sMode194 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelXY194( ) ;
      Gx_mode = sMode194 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsXY194( )
   {
      standaloneModalXY194( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00XY36 */
         pr_default.execute(34, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T00XY36_A460FasDsc[0] ;
         pr_default.close(34);
         AV23Pkg = O1241GuiFasPKg ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Pkg", GXutil.ltrimstr( AV23Pkg, 13, 5));
         AV22Pmt = O1242GuiFasPMt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Pmt", GXutil.ltrimstr( AV22Pmt, 13, 5));
      }
   }

   public void endLevelXY194( )
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

   public void scanStartXY194( )
   {
      /* Scan By routine */
      /* Using cursor T00XY37 */
      pr_default.execute(35, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound194 = (short)(0) ;
      if ( (pr_default.getStatus(35) != 101) )
      {
         RcdFound194 = (short)(1) ;
         A1240GuiFasLin = T00XY37_A1240GuiFasLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextXY194( )
   {
      /* Scan next routine */
      pr_default.readNext(35);
      RcdFound194 = (short)(0) ;
      if ( (pr_default.getStatus(35) != 101) )
      {
         RcdFound194 = (short)(1) ;
         A1240GuiFasLin = T00XY37_A1240GuiFasLin[0] ;
      }
   }

   public void scanEndXY194( )
   {
      pr_default.close(35);
   }

   public void afterConfirmXY194( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertXY194( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateXY194( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteXY194( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteXY194( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateXY194( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesXY194( )
   {
      edtGuiFasLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasLin_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      dynArtAdiCod.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynArtAdiCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynArtAdiCod.getEnabled(), 5, 0), !bGXsfl_85_Refreshing);
      edtFasFacMaqC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasFacMaqC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasFacMaqC_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtGuiFasPKg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasPKg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPKg_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtGuiFasPMt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasPMt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPMt_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtGuiFasPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPre_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtFasKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasKgm_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtFasMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasMtr_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtFasPreDsK_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreDsK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreDsK_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtFasPreDsM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreDsM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreDsM_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtGuiFasDto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasDto_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtGuiFasRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasRec_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtGuiFasCCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasCCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasCCo_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtGuiFasPBK_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasPBK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPBK_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtGuiFasPBM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasPBM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPBM_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtGuiFasPB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasPB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPB_Enabled), 5, 0), !bGXsfl_85_Refreshing);
   }

   public void send_integrity_lvl_hashesXY194( )
   {
   }

   public void send_integrity_lvl_hashesXY195( )
   {
   }

   public void subsflControlProps_85194( )
   {
      edtavnRcdDeleted_194_Internalname = "vNRCDDELETED_194_"+sGXsfl_85_idx ;
      edtGuiFasLin_Internalname = "GUIFASLIN_"+sGXsfl_85_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_85_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_85_idx ;
      dynArtAdiCod.setInternalname( "ARTADICOD_"+sGXsfl_85_idx );
      edtFasFacMaqC_Internalname = "FASFACMAQC_"+sGXsfl_85_idx ;
      edtGuiFasPKg_Internalname = "GUIFASPKG_"+sGXsfl_85_idx ;
      edtGuiFasPMt_Internalname = "GUIFASPMT_"+sGXsfl_85_idx ;
      edtGuiFasPre_Internalname = "GUIFASPRE_"+sGXsfl_85_idx ;
      edtFasKgm_Internalname = "FASKGM_"+sGXsfl_85_idx ;
      edtFasMtr_Internalname = "FASMTR_"+sGXsfl_85_idx ;
      edtFasPreDsK_Internalname = "FASPREDSK_"+sGXsfl_85_idx ;
      edtFasPreDsM_Internalname = "FASPREDSM_"+sGXsfl_85_idx ;
      edtGuiFasDto_Internalname = "GUIFASDTO_"+sGXsfl_85_idx ;
      edtGuiFasRec_Internalname = "GUIFASREC_"+sGXsfl_85_idx ;
      edtGuiFasCCo_Internalname = "GUIFASCCO_"+sGXsfl_85_idx ;
      edtGuiFasPBK_Internalname = "GUIFASPBK_"+sGXsfl_85_idx ;
      edtGuiFasPBM_Internalname = "GUIFASPBM_"+sGXsfl_85_idx ;
      edtGuiFasPB_Internalname = "GUIFASPB_"+sGXsfl_85_idx ;
   }

   public void subsflControlProps_fel_85194( )
   {
      edtavnRcdDeleted_194_Internalname = "vNRCDDELETED_194_"+sGXsfl_85_fel_idx ;
      edtGuiFasLin_Internalname = "GUIFASLIN_"+sGXsfl_85_fel_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_85_fel_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_85_fel_idx ;
      dynArtAdiCod.setInternalname( "ARTADICOD_"+sGXsfl_85_fel_idx );
      edtFasFacMaqC_Internalname = "FASFACMAQC_"+sGXsfl_85_fel_idx ;
      edtGuiFasPKg_Internalname = "GUIFASPKG_"+sGXsfl_85_fel_idx ;
      edtGuiFasPMt_Internalname = "GUIFASPMT_"+sGXsfl_85_fel_idx ;
      edtGuiFasPre_Internalname = "GUIFASPRE_"+sGXsfl_85_fel_idx ;
      edtFasKgm_Internalname = "FASKGM_"+sGXsfl_85_fel_idx ;
      edtFasMtr_Internalname = "FASMTR_"+sGXsfl_85_fel_idx ;
      edtFasPreDsK_Internalname = "FASPREDSK_"+sGXsfl_85_fel_idx ;
      edtFasPreDsM_Internalname = "FASPREDSM_"+sGXsfl_85_fel_idx ;
      edtGuiFasDto_Internalname = "GUIFASDTO_"+sGXsfl_85_fel_idx ;
      edtGuiFasRec_Internalname = "GUIFASREC_"+sGXsfl_85_fel_idx ;
      edtGuiFasCCo_Internalname = "GUIFASCCO_"+sGXsfl_85_fel_idx ;
      edtGuiFasPBK_Internalname = "GUIFASPBK_"+sGXsfl_85_fel_idx ;
      edtGuiFasPBM_Internalname = "GUIFASPBM_"+sGXsfl_85_fel_idx ;
      edtGuiFasPB_Internalname = "GUIFASPB_"+sGXsfl_85_fel_idx ;
   }

   public void addRowXY194( )
   {
      nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_85194( ) ;
      sendRowXY194( ) ;
   }

   public void sendRowXY194( )
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
         if ( ((int)((nGXsfl_85_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_194_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_194_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_194, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_194_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_194), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_194), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_194_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_194_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_194_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiFasLin_Internalname,GXutil.ltrim( localUtil.ntoc( A1240GuiFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1240GuiFasLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,87);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiFasLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGuiFasLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_194_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      gxaartadicod_htmlXY194( A396EmprCod) ;
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_194_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      GXCCtl = "ARTADICOD_" + sGXsfl_85_idx ;
      dynArtAdiCod.setName( GXCCtl );
      dynArtAdiCod.setWebtags( "" );
      /* ComboBox */
      Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {dynArtAdiCod,dynArtAdiCod.getInternalname(),GXutil.trim( GXutil.str( A7727ArtAdiCod, 3, 0)),Integer.valueOf(1),dynArtAdiCod.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(dynArtAdiCod.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,90);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      dynArtAdiCod.setValue( GXutil.trim( GXutil.str( A7727ArtAdiCod, 3, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynArtAdiCod.getInternalname(), "Values", dynArtAdiCod.ToJavascriptSource(), !bGXsfl_85_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_194_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasFacMaqC_Internalname,GXutil.rtrim( A7392FasFacMaqC),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasFacMaqC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasFacMaqC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_194_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 92,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiFasPKg_Internalname,GXutil.ltrim( localUtil.ntoc( A1241GuiFasPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtGuiFasPKg_Enabled!=0) ? localUtil.format( A1241GuiFasPKg, "ZZZZZZ9.999") : localUtil.format( A1241GuiFasPKg, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,92);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiFasPKg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGuiFasPKg_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_194_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiFasPMt_Internalname,GXutil.ltrim( localUtil.ntoc( A1242GuiFasPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtGuiFasPMt_Enabled!=0) ? localUtil.format( A1242GuiFasPMt, "ZZZZZZ9.999") : localUtil.format( A1242GuiFasPMt, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,93);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiFasPMt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGuiFasPMt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_194_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiFasPre_Internalname,GXutil.ltrim( localUtil.ntoc( A7750GuiFasPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtGuiFasPre_Enabled!=0) ? localUtil.format( A7750GuiFasPre, "Z,ZZZ,ZZ9.999") : localUtil.format( A7750GuiFasPre, "Z,ZZZ,ZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,94);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiFasPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGuiFasPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_194_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A1275FasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasKgm_Enabled!=0) ? localUtil.format( A1275FasKgm, "ZZZZZ9.99") : localUtil.format( A1275FasKgm, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,95);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_194_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1276FasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasMtr_Enabled!=0) ? localUtil.format( A1276FasMtr, "ZZZZZ9.99") : localUtil.format( A1276FasMtr, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,96);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_194_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreDsK_Internalname,GXutil.rtrim( A4390FasPreDsK),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreDsK_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasPreDsK_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_194_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreDsM_Internalname,GXutil.rtrim( A4391FasPreDsM),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,98);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreDsM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasPreDsM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_194_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiFasDto_Internalname,GXutil.ltrim( localUtil.ntoc( A7751GuiFasDto, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtGuiFasDto_Enabled!=0) ? localUtil.format( A7751GuiFasDto, "ZZZZZZ9.99") : localUtil.format( A7751GuiFasDto, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,99);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiFasDto_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGuiFasDto_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_194_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiFasRec_Internalname,GXutil.ltrim( localUtil.ntoc( A7752GuiFasRec, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtGuiFasRec_Enabled!=0) ? localUtil.format( A7752GuiFasRec, "ZZZZZZ9.99") : localUtil.format( A7752GuiFasRec, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,100);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiFasRec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGuiFasRec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_194_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiFasCCo_Internalname,GXutil.ltrim( localUtil.ntoc( A7753GuiFasCCo, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtGuiFasCCo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7753GuiFasCCo), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7753GuiFasCCo), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiFasCCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGuiFasCCo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_194_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiFasPBK_Internalname,GXutil.ltrim( localUtil.ntoc( A8194GuiFasPBK, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtGuiFasPBK_Enabled!=0) ? localUtil.format( A8194GuiFasPBK, "ZZZZZZ9.99999") : localUtil.format( A8194GuiFasPBK, "ZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,102);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiFasPBK_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGuiFasPBK_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_194_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiFasPBM_Internalname,GXutil.ltrim( localUtil.ntoc( A8195GuiFasPBM, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtGuiFasPBM_Enabled!=0) ? localUtil.format( A8195GuiFasPBM, "ZZZZZZ9.99999") : localUtil.format( A8195GuiFasPBM, "ZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,103);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiFasPBM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGuiFasPBM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_194_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 104,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiFasPB_Internalname,GXutil.ltrim( localUtil.ntoc( A8196GuiFasPB, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtGuiFasPB_Enabled!=0) ? localUtil.format( A8196GuiFasPB, "ZZZZZZ9.99999") : localUtil.format( A8196GuiFasPB, "ZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,104);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiFasPB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGuiFasPB_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesXY194( ) ;
      GXCCtl = "Z1240GuiFasLin_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1240GuiFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1276FasMtr_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1276FasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1275FasKgm_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1275FasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7727ArtAdiCod_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7727ArtAdiCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7392FasFacMaqC_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7392FasFacMaqC));
      GXCCtl = "Z1241GuiFasPKg_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1241GuiFasPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1242GuiFasPMt_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1242GuiFasPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7750GuiFasPre_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7750GuiFasPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4390FasPreDsK_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4390FasPreDsK));
      GXCCtl = "Z4391FasPreDsM_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4391FasPreDsM));
      GXCCtl = "Z7751GuiFasDto_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7751GuiFasDto, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7752GuiFasRec_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7752GuiFasRec, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7753GuiFasCCo_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7753GuiFasCCo, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8194GuiFasPBK_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8194GuiFasPBK, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8195GuiFasPBM_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8195GuiFasPBM, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8196GuiFasPB_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8196GuiFasPB, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z457FasCod_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z457FasCod));
      GXCCtl = "O1241GuiFasPKg_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1241GuiFasPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O1242GuiFasPMt_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1242GuiFasPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_194_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_194, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_194_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_194, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_194_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_194, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_194_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_194_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIFASLIN_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTADICOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( dynArtAdiCod.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASFACMAQC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasFacMaqC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIFASPKG_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPKg_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIFASPMT_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPMt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIFASPRE_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASKGM_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASMTR_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREDSK_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreDsK_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREDSM_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreDsM_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIFASDTO_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasDto_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIFASREC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIFASCCO_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasCCo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIFASPBK_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPBK_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIFASPBM_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPBM_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIFASPB_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPB_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowXY194( )
   {
      nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_85194( ) ;
      edtavnRcdDeleted_194_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_194_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGuiFasLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASLIN_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      dynArtAdiCod.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ARTADICOD_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtFasFacMaqC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASFACMAQC_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGuiFasPKg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASPKG_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGuiFasPMt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASPMT_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGuiFasPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASPRE_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASKGM_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASMTR_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasPreDsK_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREDSK_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasPreDsM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREDSM_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGuiFasDto_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASDTO_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGuiFasRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASREC_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGuiFasCCo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASCCO_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGuiFasPBK_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASPBK_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGuiFasPBM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASPBM_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGuiFasPB_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASPB_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_194_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_194_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_194");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_194_Internalname ;
         wbErr = true ;
         nRcdDeleted_194 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_194 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_194_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGuiFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGuiFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "GUIFASLIN_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiFasLin_Internalname ;
         wbErr = true ;
         A1240GuiFasLin = (short)(0) ;
      }
      else
      {
         A1240GuiFasLin = (short)(localUtil.ctol( httpContext.cgiGet( edtGuiFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
      A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
      dynArtAdiCod.setName( dynArtAdiCod.getInternalname() );
      dynArtAdiCod.setValue( httpContext.cgiGet( dynArtAdiCod.getInternalname()) );
      A7727ArtAdiCod = (short)(GXutil.lval( httpContext.cgiGet( dynArtAdiCod.getInternalname()))) ;
      n7727ArtAdiCod = false ;
      A7392FasFacMaqC = httpContext.cgiGet( edtFasFacMaqC_Internalname) ;
      n7392FasFacMaqC = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtGuiFasPKg_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtGuiFasPKg_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "GUIFASPKG_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiFasPKg_Internalname ;
         wbErr = true ;
         A1241GuiFasPKg = DecimalUtil.ZERO ;
      }
      else
      {
         A1241GuiFasPKg = localUtil.ctond( httpContext.cgiGet( edtGuiFasPKg_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtGuiFasPMt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtGuiFasPMt_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "GUIFASPMT_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiFasPMt_Internalname ;
         wbErr = true ;
         A1242GuiFasPMt = DecimalUtil.ZERO ;
      }
      else
      {
         A1242GuiFasPMt = localUtil.ctond( httpContext.cgiGet( edtGuiFasPMt_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtGuiFasPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtGuiFasPre_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "GUIFASPRE_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiFasPre_Internalname ;
         wbErr = true ;
         A7750GuiFasPre = DecimalUtil.ZERO ;
         n7750GuiFasPre = false ;
      }
      else
      {
         A7750GuiFasPre = localUtil.ctond( httpContext.cgiGet( edtGuiFasPre_Internalname)) ;
         n7750GuiFasPre = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "FASKGM_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasKgm_Internalname ;
         wbErr = true ;
         A1275FasKgm = DecimalUtil.ZERO ;
      }
      else
      {
         A1275FasKgm = localUtil.ctond( httpContext.cgiGet( edtFasKgm_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasMtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "FASMTR_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasMtr_Internalname ;
         wbErr = true ;
         A1276FasMtr = DecimalUtil.ZERO ;
      }
      else
      {
         A1276FasMtr = localUtil.ctond( httpContext.cgiGet( edtFasMtr_Internalname)) ;
      }
      A4390FasPreDsK = httpContext.cgiGet( edtFasPreDsK_Internalname) ;
      n4390FasPreDsK = false ;
      A4391FasPreDsM = httpContext.cgiGet( edtFasPreDsM_Internalname) ;
      n4391FasPreDsM = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtGuiFasDto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtGuiFasDto_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "GUIFASDTO_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiFasDto_Internalname ;
         wbErr = true ;
         A7751GuiFasDto = DecimalUtil.ZERO ;
         n7751GuiFasDto = false ;
      }
      else
      {
         A7751GuiFasDto = localUtil.ctond( httpContext.cgiGet( edtGuiFasDto_Internalname)) ;
         n7751GuiFasDto = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtGuiFasRec_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtGuiFasRec_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "GUIFASREC_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiFasRec_Internalname ;
         wbErr = true ;
         A7752GuiFasRec = DecimalUtil.ZERO ;
         n7752GuiFasRec = false ;
      }
      else
      {
         A7752GuiFasRec = localUtil.ctond( httpContext.cgiGet( edtGuiFasRec_Internalname)) ;
         n7752GuiFasRec = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGuiFasCCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGuiFasCCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "GUIFASCCO_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiFasCCo_Internalname ;
         wbErr = true ;
         A7753GuiFasCCo = (short)(0) ;
         n7753GuiFasCCo = false ;
      }
      else
      {
         A7753GuiFasCCo = (short)(localUtil.ctol( httpContext.cgiGet( edtGuiFasCCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7753GuiFasCCo = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtGuiFasPBK_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtGuiFasPBK_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "GUIFASPBK_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiFasPBK_Internalname ;
         wbErr = true ;
         A8194GuiFasPBK = DecimalUtil.ZERO ;
         n8194GuiFasPBK = false ;
      }
      else
      {
         A8194GuiFasPBK = localUtil.ctond( httpContext.cgiGet( edtGuiFasPBK_Internalname)) ;
         n8194GuiFasPBK = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtGuiFasPBM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtGuiFasPBM_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "GUIFASPBM_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiFasPBM_Internalname ;
         wbErr = true ;
         A8195GuiFasPBM = DecimalUtil.ZERO ;
         n8195GuiFasPBM = false ;
      }
      else
      {
         A8195GuiFasPBM = localUtil.ctond( httpContext.cgiGet( edtGuiFasPBM_Internalname)) ;
         n8195GuiFasPBM = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtGuiFasPB_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtGuiFasPB_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "GUIFASPB_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiFasPB_Internalname ;
         wbErr = true ;
         A8196GuiFasPB = DecimalUtil.ZERO ;
         n8196GuiFasPB = false ;
      }
      else
      {
         A8196GuiFasPB = localUtil.ctond( httpContext.cgiGet( edtGuiFasPB_Internalname)) ;
         n8196GuiFasPB = false ;
      }
      GXCCtl = "Z1240GuiFasLin_" + sGXsfl_85_idx ;
      Z1240GuiFasLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1276FasMtr_" + sGXsfl_85_idx ;
      Z1276FasMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1275FasKgm_" + sGXsfl_85_idx ;
      Z1275FasKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7727ArtAdiCod_" + sGXsfl_85_idx ;
      Z7727ArtAdiCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7392FasFacMaqC_" + sGXsfl_85_idx ;
      Z7392FasFacMaqC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1241GuiFasPKg_" + sGXsfl_85_idx ;
      Z1241GuiFasPKg = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1242GuiFasPMt_" + sGXsfl_85_idx ;
      Z1242GuiFasPMt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7750GuiFasPre_" + sGXsfl_85_idx ;
      Z7750GuiFasPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4390FasPreDsK_" + sGXsfl_85_idx ;
      Z4390FasPreDsK = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4391FasPreDsM_" + sGXsfl_85_idx ;
      Z4391FasPreDsM = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7751GuiFasDto_" + sGXsfl_85_idx ;
      Z7751GuiFasDto = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7752GuiFasRec_" + sGXsfl_85_idx ;
      Z7752GuiFasRec = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7753GuiFasCCo_" + sGXsfl_85_idx ;
      Z7753GuiFasCCo = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8194GuiFasPBK_" + sGXsfl_85_idx ;
      Z8194GuiFasPBK = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8195GuiFasPBM_" + sGXsfl_85_idx ;
      Z8195GuiFasPBM = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8196GuiFasPB_" + sGXsfl_85_idx ;
      Z8196GuiFasPB = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z457FasCod_" + sGXsfl_85_idx ;
      Z457FasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O1241GuiFasPKg_" + sGXsfl_85_idx ;
      O1241GuiFasPKg = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O1242GuiFasPMt_" + sGXsfl_85_idx ;
      O1242GuiFasPMt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_194_" + sGXsfl_85_idx ;
      nRcdDeleted_194 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_194_" + sGXsfl_85_idx ;
      nRcdExists_194 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_194_" + sGXsfl_85_idx ;
      nIsMod_194 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defdynArtAdiCod_Enabled = dynArtAdiCod.getEnabled() ;
      defedtFasCod_Enabled = edtFasCod_Enabled ;
      defedtGuiFasLin_Enabled = edtGuiFasLin_Enabled ;
   }

   public void confirmValuesXY0( )
   {
      nGXsfl_85_idx = 0 ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_85194( ) ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
         sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_85194( ) ;
         httpContext.changePostValue( "Z1240GuiFasLin_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z1240GuiFasLin_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1240GuiFasLin_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z1276FasMtr_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z1276FasMtr_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1276FasMtr_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z1275FasKgm_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z1275FasKgm_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1275FasKgm_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z7727ArtAdiCod_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z7727ArtAdiCod_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7727ArtAdiCod_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z7392FasFacMaqC_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z7392FasFacMaqC_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7392FasFacMaqC_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z1241GuiFasPKg_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z1241GuiFasPKg_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1241GuiFasPKg_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z1242GuiFasPMt_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z1242GuiFasPMt_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1242GuiFasPMt_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z7750GuiFasPre_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z7750GuiFasPre_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7750GuiFasPre_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z4390FasPreDsK_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z4390FasPreDsK_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4390FasPreDsK_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z4391FasPreDsM_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z4391FasPreDsM_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4391FasPreDsM_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z7751GuiFasDto_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z7751GuiFasDto_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7751GuiFasDto_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z7752GuiFasRec_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z7752GuiFasRec_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7752GuiFasRec_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z7753GuiFasCCo_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z7753GuiFasCCo_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7753GuiFasCCo_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z8194GuiFasPBK_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z8194GuiFasPBK_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8194GuiFasPBK_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z8195GuiFasPBM_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z8195GuiFasPBM_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8195GuiFasPBM_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z8196GuiFasPB_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z8196GuiFasPB_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8196GuiFasPB_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z457FasCod_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z457FasCod_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_85_idx) ;
      }
      httpContext.changePostValue( "O1241GuiFasPKg", httpContext.cgiGet( "T1241GuiFasPKg")) ;
      httpContext.deletePostValue( "T1241GuiFasPKg") ;
      httpContext.changePostValue( "O1242GuiFasPMt", httpContext.cgiGet( "T1242GuiFasPMt")) ;
      httpContext.deletePostValue( "T1242GuiFasPMt") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tfasart", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"}) +"\">") ;
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
      forbiddenHiddens2 = new com.genexus.util.GXProperties() ;
      if ( ! isIns( )  )
      {
         forbiddenHiddens2.add("FasCod", GXutil.rtrim( localUtil.format( A457FasCod, "@!")));
      }
      app.GxWebStd.gx_hidden_field( httpContext, "hsh2", httpContext.getEncryptedSignature( forbiddenHiddens2.toString(), GXKey));
      GXutil.writeLogInfo("tfasart:[ SendCondSecurityCheck value for]"+forbiddenHiddens2.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z2398BarFasExt", GXutil.rtrim( Z2398BarFasExt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1248GuiFasULin", GXutil.ltrim( localUtil.ntoc( Z1248GuiFasULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1261BarAlbKgmE", GXutil.ltrim( localUtil.ntoc( Z1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1263BarAlbMtrE", GXutil.ltrim( localUtil.ntoc( Z1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3139AlbTipCon", GXutil.ltrim( localUtil.ntoc( Z3139AlbTipCon, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1248GuiFasULin", GXutil.ltrim( localUtil.ntoc( O1248GuiFasULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O3139AlbTipCon", GXutil.ltrim( localUtil.ntoc( O3139AlbTipCon, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_85", GXutil.ltrim( localUtil.ntoc( nGXsfl_85_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV27Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPMT", GXutil.ltrim( localUtil.ntoc( AV22Pmt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPKG", GXutil.ltrim( localUtil.ntoc( AV23Pkg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS", AV24Inc_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV25Station));
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
      return formatLink("app.tfasart", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"})  ;
   }

   public String getPgmname( )
   {
      return "TFASART" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Precios/Fases Artextil", "") ;
   }

   public void initializeNonKeyXY195( )
   {
      A2399BarFasExtD = "" ;
      n2399BarFasExtD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2399BarFasExtD", A2399BarFasExtD);
      A2398BarFasExt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2398BarFasExt", A2398BarFasExt);
      A1248GuiFasULin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
      A3139AlbTipCon = (short)(0) ;
      n3139AlbTipCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3139AlbTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3139AlbTipCon), 4, 0));
      O1248GuiFasULin = A1248GuiFasULin ;
      httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
      O3139AlbTipCon = A3139AlbTipCon ;
      n3139AlbTipCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3139AlbTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3139AlbTipCon), 4, 0));
      Z2399BarFasExtD = "" ;
      Z2398BarFasExt = "" ;
      Z1248GuiFasULin = (short)(0) ;
      Z1261BarAlbKgmE = DecimalUtil.ZERO ;
      Z1263BarAlbMtrE = DecimalUtil.ZERO ;
      Z3139AlbTipCon = (short)(0) ;
   }

   public void initAllXY195( )
   {
      initializeNonKeyXY195( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyXY194( )
   {
      AV22Pmt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Pmt", GXutil.ltrimstr( AV22Pmt, 13, 5));
      AV23Pkg = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Pkg", GXutil.ltrimstr( AV23Pkg, 13, 5));
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A7727ArtAdiCod = (short)(0) ;
      n7727ArtAdiCod = false ;
      A7728ArtAdiDsc = "" ;
      n7728ArtAdiDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7728ArtAdiDsc", A7728ArtAdiDsc);
      A7392FasFacMaqC = "" ;
      n7392FasFacMaqC = false ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A7750GuiFasPre = DecimalUtil.ZERO ;
      n7750GuiFasPre = false ;
      A4390FasPreDsK = "" ;
      n4390FasPreDsK = false ;
      A4391FasPreDsM = "" ;
      n4391FasPreDsM = false ;
      A7751GuiFasDto = DecimalUtil.ZERO ;
      n7751GuiFasDto = false ;
      A7752GuiFasRec = DecimalUtil.ZERO ;
      n7752GuiFasRec = false ;
      A7753GuiFasCCo = (short)(0) ;
      n7753GuiFasCCo = false ;
      A8194GuiFasPBK = DecimalUtil.ZERO ;
      n8194GuiFasPBK = false ;
      A8195GuiFasPBM = DecimalUtil.ZERO ;
      n8195GuiFasPBM = false ;
      A8196GuiFasPB = DecimalUtil.ZERO ;
      n8196GuiFasPB = false ;
      AV24Inc_obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Inc_obs", AV24Inc_obs);
      A1276FasMtr = A1263BarAlbMtrE ;
      A1275FasKgm = A1261BarAlbKgmE ;
      O1241GuiFasPKg = A1241GuiFasPKg ;
      O1242GuiFasPMt = A1242GuiFasPMt ;
      Z1276FasMtr = DecimalUtil.ZERO ;
      Z1275FasKgm = DecimalUtil.ZERO ;
      Z7727ArtAdiCod = (short)(0) ;
      Z7392FasFacMaqC = "" ;
      Z1241GuiFasPKg = DecimalUtil.ZERO ;
      Z1242GuiFasPMt = DecimalUtil.ZERO ;
      Z7750GuiFasPre = DecimalUtil.ZERO ;
      Z4390FasPreDsK = "" ;
      Z4391FasPreDsM = "" ;
      Z7751GuiFasDto = DecimalUtil.ZERO ;
      Z7752GuiFasRec = DecimalUtil.ZERO ;
      Z7753GuiFasCCo = (short)(0) ;
      Z8194GuiFasPBK = DecimalUtil.ZERO ;
      Z8195GuiFasPBM = DecimalUtil.ZERO ;
      Z8196GuiFasPB = DecimalUtil.ZERO ;
      Z457FasCod = "" ;
   }

   public void initAllXY194( )
   {
      A1240GuiFasLin = (short)(0) ;
      initializeNonKeyXY194( ) ;
   }

   public void standaloneModalInsertXY194( )
   {
      A1248GuiFasULin = i1248GuiFasULin ;
      httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
      A1276FasMtr = i1276FasMtr ;
      A1275FasKgm = i1275FasKgm ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241533378", true, true);
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
      httpContext.AddJavascriptSource("tfasart.js", "?20268241533378", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties194( )
   {
      dynArtAdiCod.setEnabled( defdynArtAdiCod_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, dynArtAdiCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynArtAdiCod.getEnabled(), 5, 0), !bGXsfl_85_Refreshing);
      edtFasCod_Enabled = defedtFasCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtGuiFasLin_Enabled = defedtGuiFasLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasLin_Enabled), 5, 0), !bGXsfl_85_Refreshing);
   }

   public void startgridcontrol85( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_194, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_194_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1240GuiFasLin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7727ArtAdiCod, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( dynArtAdiCod.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7392FasFacMaqC));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasFacMaqC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1241GuiFasPKg, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPKg_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1242GuiFasPMt, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPMt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7750GuiFasPre, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1275FasKgm, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1276FasMtr, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4390FasPreDsK));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreDsK_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4391FasPreDsM));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreDsM_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7751GuiFasDto, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasDto_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7752GuiFasRec, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7753GuiFasCCo, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasCCo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8194GuiFasPBK, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPBK_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8195GuiFasPBM, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPBM_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8196GuiFasPB, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPB_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtGuiFasULin_Internalname = "GUIFASULIN" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtBarAlbKgmE_Internalname = "BARALBKGME" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtBarAlbMtrE_Internalname = "BARALBMTRE" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtDisEnt_Internalname = "DISENT" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtAlbTipCon_Internalname = "ALBTIPCON" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtBarFasExt_Internalname = "BARFASEXT" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtBarFasExtD_Internalname = "BARFASEXTD" ;
      edtavnRcdDeleted_194_Internalname = "vNRCDDELETED_194" ;
      edtGuiFasLin_Internalname = "GUIFASLIN" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      dynArtAdiCod.setInternalname( "ARTADICOD" );
      edtFasFacMaqC_Internalname = "FASFACMAQC" ;
      edtGuiFasPKg_Internalname = "GUIFASPKG" ;
      edtGuiFasPMt_Internalname = "GUIFASPMT" ;
      edtGuiFasPre_Internalname = "GUIFASPRE" ;
      edtFasKgm_Internalname = "FASKGM" ;
      edtFasMtr_Internalname = "FASMTR" ;
      edtFasPreDsK_Internalname = "FASPREDSK" ;
      edtFasPreDsM_Internalname = "FASPREDSM" ;
      edtGuiFasDto_Internalname = "GUIFASDTO" ;
      edtGuiFasRec_Internalname = "GUIFASREC" ;
      edtGuiFasCCo_Internalname = "GUIFASCCO" ;
      edtGuiFasPBK_Internalname = "GUIFASPBK" ;
      edtGuiFasPBM_Internalname = "GUIFASPBM" ;
      edtGuiFasPB_Internalname = "GUIFASPB" ;
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
      Form.setCaption( httpContext.getMessage( "Precios/Fases Artextil", "") );
      edtGuiFasPB_Jsonclick = "" ;
      edtGuiFasPBM_Jsonclick = "" ;
      edtGuiFasPBK_Jsonclick = "" ;
      edtGuiFasCCo_Jsonclick = "" ;
      edtGuiFasRec_Jsonclick = "" ;
      edtGuiFasDto_Jsonclick = "" ;
      edtFasPreDsM_Jsonclick = "" ;
      edtFasPreDsK_Jsonclick = "" ;
      edtFasMtr_Jsonclick = "" ;
      edtFasKgm_Jsonclick = "" ;
      edtGuiFasPre_Jsonclick = "" ;
      edtGuiFasPMt_Jsonclick = "" ;
      edtGuiFasPKg_Jsonclick = "" ;
      edtFasFacMaqC_Jsonclick = "" ;
      dynArtAdiCod.setJsonclick( "" );
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtGuiFasLin_Jsonclick = "" ;
      edtavnRcdDeleted_194_Jsonclick = "" ;
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
      edtGuiFasPB_Enabled = 1 ;
      edtGuiFasPBM_Enabled = 1 ;
      edtGuiFasPBK_Enabled = 1 ;
      edtGuiFasCCo_Enabled = 1 ;
      edtGuiFasRec_Enabled = 1 ;
      edtGuiFasDto_Enabled = 1 ;
      edtFasPreDsM_Enabled = 1 ;
      edtFasPreDsK_Enabled = 1 ;
      edtFasMtr_Enabled = 1 ;
      edtFasKgm_Enabled = 1 ;
      edtGuiFasPre_Enabled = 1 ;
      edtGuiFasPMt_Enabled = 1 ;
      edtGuiFasPKg_Enabled = 1 ;
      edtFasFacMaqC_Enabled = 1 ;
      dynArtAdiCod.setEnabled( 1 );
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Enabled = 1 ;
      edtGuiFasLin_Enabled = 1 ;
      edtavnRcdDeleted_194_Enabled = 1 ;
      edtBarFasExtD_Jsonclick = "" ;
      edtBarFasExtD_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasExtD_Enabled = 1 ;
      edtBarFasExt_Jsonclick = "" ;
      edtBarFasExt_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasExt_Enabled = 1 ;
      edtAlbTipCon_Jsonclick = "" ;
      edtAlbTipCon_Backcolor = (int)(0xFFFFFF) ;
      edtAlbTipCon_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtDisEnt_Jsonclick = "" ;
      edtDisEnt_Backcolor = (int)(0xFFFFFF) ;
      edtDisEnt_Enabled = 0 ;
      edtBarAlbMtrE_Jsonclick = "" ;
      edtBarAlbMtrE_Backcolor = (int)(0xFFFFFF) ;
      edtBarAlbMtrE_Enabled = 1 ;
      edtBarAlbKgmE_Jsonclick = "" ;
      edtBarAlbKgmE_Backcolor = (int)(0xFFFFFF) ;
      edtBarAlbKgmE_Enabled = 1 ;
      edtGuiFasULin_Jsonclick = "" ;
      edtGuiFasULin_Backcolor = (int)(0xFFFFFF) ;
      edtGuiFasULin_Enabled = 0 ;
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

   public void gxdlaartadicodXY194( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlaartadicod_dataXY194( A396EmprCod) ;
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

   public void gxaartadicod_htmlXY194( String A396EmprCod )
   {
      short gxdynajaxvalue;
      gxdlaartadicod_dataXY194( A396EmprCod) ;
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

   protected void gxdlaartadicod_dataXY194( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor T00XY38 */
      pr_default.execute(36, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(36) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( T00XY38_A7727ArtAdiCod[0], (byte)(3), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( T00XY38_A7728ArtAdiDsc[0]));
         pr_default.readNext(36);
      }
      pr_default.close(36);
   }

   public void xc_17_XY194( String A396EmprCod ,
                            String AV27Pgmname ,
                            String AV17UsurCod ,
                            String AV25Station ,
                            String AV24Inc_obs ,
                            int A129BarCod ,
                            byte A132BarCodReo ,
                            String A130BarCodPar ,
                            java.math.BigDecimal A1242GuiFasPMt ,
                            java.math.BigDecimal AV22Pmt ,
                            java.math.BigDecimal A1241GuiFasPKg ,
                            java.math.BigDecimal AV23Pkg )
   {
      if ( ( ( DecimalUtil.compareTo(A1242GuiFasPMt, AV22Pmt) != 0 ) || ( DecimalUtil.compareTo(A1241GuiFasPKg, AV23Pkg) != 0 ) ) && true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV27Pgmname, AV17UsurCod, AV25Station, AV24Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
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
      subsflControlProps_85194( ) ;
      while ( nGXsfl_85_idx <= nRC_GXsfl_85 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalXY194( ) ;
         standaloneModalXY194( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowXY194( ) ;
         nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
         sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_85194( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "ARTADICOD_" + sGXsfl_85_idx ;
      dynArtAdiCod.setName( GXCCtl );
      dynArtAdiCod.setWebtags( "" );
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T00XY39 */
      pr_default.execute(37, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(37) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00XY39_A407EmprNom[0] ;
      n407EmprNom = T00XY39_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(37);
      /* Using cursor T00XY40 */
      pr_default.execute(38, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(38) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(38);
      /* Using cursor T00XY41 */
      pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(39) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A361DisCod = T00XY41_A361DisCod[0] ;
      pr_default.close(39);
      /* Using cursor T00XY42 */
      pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(40) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A366DisEnt = T00XY42_A366DisEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A366DisEnt", A366DisEnt);
      pr_default.close(40);
      GX_FocusControl = edtBarAlbKgmE_Internalname ;
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

   public void valid_Emprcod( )
   {
      n7727ArtAdiCod = false ;
      A7727ArtAdiCod = (short)(GXutil.lval( dynArtAdiCod.getValue())) ;
      n7727ArtAdiCod = false ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Barcodpar( )
   {
      n7727ArtAdiCod = false ;
      A7727ArtAdiCod = (short)(GXutil.lval( dynArtAdiCod.getValue())) ;
      n7727ArtAdiCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2399BarFasExtD", GXutil.rtrim( A2399BarFasExtD));
      httpContext.ajax_rsp_assign_attri("", false, "A2398BarFasExt", GXutil.rtrim( A2398BarFasExt));
      httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrim( localUtil.ntoc( A1248GuiFasULin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A366DisEnt", GXutil.rtrim( A366DisEnt));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3139AlbTipCon", GXutil.ltrim( localUtil.ntoc( A3139AlbTipCon, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2399BarFasExtD", GXutil.rtrim( Z2399BarFasExtD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2398BarFasExt", GXutil.rtrim( Z2398BarFasExt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1248GuiFasULin", GXutil.ltrim( localUtil.ntoc( Z1248GuiFasULin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1261BarAlbKgmE", GXutil.ltrim( localUtil.ntoc( Z1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1263BarAlbMtrE", GXutil.ltrim( localUtil.ntoc( Z1263BarAlbMtrE, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z366DisEnt", GXutil.rtrim( Z366DisEnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3139AlbTipCon", GXutil.ltrim( localUtil.ntoc( Z3139AlbTipCon, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O1248GuiFasULin", GXutil.ltrim( localUtil.ntoc( O1248GuiFasULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O3139AlbTipCon", GXutil.ltrim( localUtil.ntoc( O3139AlbTipCon, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Fascod( )
   {
      n7727ArtAdiCod = false ;
      A7727ArtAdiCod = (short)(GXutil.lval( dynArtAdiCod.getValue())) ;
      n7727ArtAdiCod = false ;
      /* Using cursor T00XY43 */
      pr_default.execute(41, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(41) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      A460FasDsc = T00XY43_A460FasDsc[0] ;
      pr_default.close(41);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
   }

   public void valid_Guifaspkg( )
   {
      n7727ArtAdiCod = false ;
      A7727ArtAdiCod = (short)(GXutil.lval( dynArtAdiCod.getValue())) ;
      n7727ArtAdiCod = false ;
      AV23Pkg = O1241GuiFasPKg ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV23Pkg", GXutil.ltrim( localUtil.ntoc( AV23Pkg, (byte)(13), (byte)(5), ".", "")));
   }

   public void valid_Guifaspmt( )
   {
      n7727ArtAdiCod = false ;
      A7727ArtAdiCod = (short)(GXutil.lval( dynArtAdiCod.getValue())) ;
      n7727ArtAdiCod = false ;
      AV22Pmt = O1242GuiFasPMt ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV22Pmt", GXutil.ltrim( localUtil.ntoc( AV22Pmt, (byte)(13), (byte)(5), ".", "")));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynArtAdiCod'},{av:'A7727ArtAdiCod',fld:'ARTADICOD',pic:'ZZ9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A1248GuiFasULin',fld:'GUIFASULIN',pic:'ZZZ9'},{av:'AV17UsurCod',fld:'vUSURCOD',pic:''},{av:'AV25Station',fld:'vSTATION',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynArtAdiCod'},{av:'A7727ArtAdiCod',fld:'ARTADICOD',pic:'ZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A2399BarFasExtD',fld:'BARFASEXTD',pic:''},{av:'A2398BarFasExt',fld:'BARFASEXT',pic:''},{av:'A1248GuiFasULin',fld:'GUIFASULIN',pic:'ZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'A366DisEnt',fld:'DISENT',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A3139AlbTipCon',fld:'ALBTIPCON',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z30AlbProCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z361DisCod'},{av:'Z2399BarFasExtD'},{av:'Z2398BarFasExt'},{av:'Z1248GuiFasULin'},{av:'Z1261BarAlbKgmE'},{av:'Z1263BarAlbMtrE'},{av:'Z366DisEnt'},{av:'Z407EmprNom'},{av:'Z3139AlbTipCon'},{av:'O1248GuiFasULin'},{av:'O3139AlbTipCon'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_GUIFASULIN","{handler:'valid_Guifasulin',iparms:[]");
      setEventMetadata("VALID_GUIFASULIN",",oparms:[]}");
      setEventMetadata("VALID_BARALBKGME","{handler:'valid_Baralbkgme',iparms:[]");
      setEventMetadata("VALID_BARALBKGME",",oparms:[]}");
      setEventMetadata("VALID_BARALBMTRE","{handler:'valid_Baralbmtre',iparms:[]");
      setEventMetadata("VALID_BARALBMTRE",",oparms:[]}");
      setEventMetadata("VALID_ALBTIPCON","{handler:'valid_Albtipcon',iparms:[]");
      setEventMetadata("VALID_ALBTIPCON",",oparms:[]}");
      setEventMetadata("VALID_GUIFASLIN","{handler:'valid_Guifaslin',iparms:[]");
      setEventMetadata("VALID_GUIFASLIN",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynArtAdiCod'},{av:'A7727ArtAdiCod',fld:'ARTADICOD',pic:'ZZ9'},{av:'A460FasDsc',fld:'FASDSC',pic:''}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''}]}");
      setEventMetadata("VALID_GUIFASPKG","{handler:'valid_Guifaspkg',iparms:[{av:'O1241GuiFasPKg'},{av:'A1241GuiFasPKg',fld:'GUIFASPKG',pic:'ZZZZZZ9.999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynArtAdiCod'},{av:'A7727ArtAdiCod',fld:'ARTADICOD',pic:'ZZ9'},{av:'AV23Pkg',fld:'vPKG',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("VALID_GUIFASPKG",",oparms:[{av:'AV23Pkg',fld:'vPKG',pic:'ZZZZZZ9.999'}]}");
      setEventMetadata("VALID_GUIFASPMT","{handler:'valid_Guifaspmt',iparms:[{av:'O1242GuiFasPMt'},{av:'A1242GuiFasPMt',fld:'GUIFASPMT',pic:'ZZZZZZ9.999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynArtAdiCod'},{av:'A7727ArtAdiCod',fld:'ARTADICOD',pic:'ZZ9'},{av:'AV22Pmt',fld:'vPMT',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("VALID_GUIFASPMT",",oparms:[{av:'AV22Pmt',fld:'vPMT',pic:'ZZZZZZ9.999'}]}");
      setEventMetadata("NULL","{handler:'valid_Guifaspb',iparms:[]");
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
      pr_default.close(41);
      pr_default.close(34);
      pr_default.close(39);
      pr_default.close(37);
      pr_default.close(38);
      pr_default.close(40);
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
      Z2398BarFasExt = "" ;
      Z1261BarAlbKgmE = DecimalUtil.ZERO ;
      Z1263BarAlbMtrE = DecimalUtil.ZERO ;
      Z1276FasMtr = DecimalUtil.ZERO ;
      Z1275FasKgm = DecimalUtil.ZERO ;
      Z7392FasFacMaqC = "" ;
      Z1241GuiFasPKg = DecimalUtil.ZERO ;
      Z1242GuiFasPMt = DecimalUtil.ZERO ;
      Z7750GuiFasPre = DecimalUtil.ZERO ;
      Z4390FasPreDsK = "" ;
      Z4391FasPreDsM = "" ;
      Z7751GuiFasDto = DecimalUtil.ZERO ;
      Z7752GuiFasRec = DecimalUtil.ZERO ;
      Z8194GuiFasPBK = DecimalUtil.ZERO ;
      Z8195GuiFasPBM = DecimalUtil.ZERO ;
      Z8196GuiFasPB = DecimalUtil.ZERO ;
      Z457FasCod = "" ;
      O1241GuiFasPKg = DecimalUtil.ZERO ;
      O1242GuiFasPMt = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV27Pgmname = "" ;
      AV17UsurCod = "" ;
      AV25Station = "" ;
      AV24Inc_obs = "" ;
      A130BarCodPar = "" ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      AV22Pmt = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      AV23Pkg = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
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
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A366DisEnt = "" ;
      lblTextblock10_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A2398BarFasExt = "" ;
      lblTextblock13_Jsonclick = "" ;
      A2399BarFasExtD = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode194 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      forbiddenHiddens2 = new com.genexus.util.GXProperties();
      hsh2 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode195 = "" ;
      GXCCtl = "" ;
      A460FasDsc = "" ;
      A7392FasFacMaqC = "" ;
      A7750GuiFasPre = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A4390FasPreDsK = "" ;
      A4391FasPreDsM = "" ;
      A7751GuiFasDto = DecimalUtil.ZERO ;
      A7752GuiFasRec = DecimalUtil.ZERO ;
      A8194GuiFasPBK = DecimalUtil.ZERO ;
      A8195GuiFasPBM = DecimalUtil.ZERO ;
      A8196GuiFasPB = DecimalUtil.ZERO ;
      T1241GuiFasPKg = DecimalUtil.ZERO ;
      T1242GuiFasPMt = DecimalUtil.ZERO ;
      AV21Lit = "" ;
      AV16Lit0 = "" ;
      AV19Lit1 = "" ;
      AV20Lit2 = "" ;
      AV18LitFe = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV28Emprnom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      Z366DisEnt = "" ;
      T00XY7_A407EmprNom = new String[] {""} ;
      T00XY7_n407EmprNom = new boolean[] {false} ;
      T00XY9_A396EmprCod = new String[] {""} ;
      T00XY8_A361DisCod = new int[1] ;
      T00XY10_A366DisEnt = new String[] {""} ;
      T00XY11_A361DisCod = new int[1] ;
      T00XY11_A2399BarFasExtD = new String[] {""} ;
      T00XY11_n2399BarFasExtD = new boolean[] {false} ;
      T00XY11_A2398BarFasExt = new String[] {""} ;
      T00XY11_A1248GuiFasULin = new short[1] ;
      T00XY11_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY11_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY11_A366DisEnt = new String[] {""} ;
      T00XY11_A407EmprNom = new String[] {""} ;
      T00XY11_n407EmprNom = new boolean[] {false} ;
      T00XY11_A3139AlbTipCon = new short[1] ;
      T00XY11_n3139AlbTipCon = new boolean[] {false} ;
      T00XY11_A396EmprCod = new String[] {""} ;
      T00XY11_A129BarCod = new int[1] ;
      T00XY11_A132BarCodReo = new byte[1] ;
      T00XY11_A130BarCodPar = new String[] {""} ;
      T00XY11_A30AlbProCod = new long[1] ;
      T00XY12_A396EmprCod = new String[] {""} ;
      T00XY12_A30AlbProCod = new long[1] ;
      T00XY12_A129BarCod = new int[1] ;
      T00XY12_A132BarCodReo = new byte[1] ;
      T00XY12_A130BarCodPar = new String[] {""} ;
      T00XY6_A2399BarFasExtD = new String[] {""} ;
      T00XY6_n2399BarFasExtD = new boolean[] {false} ;
      T00XY6_A2398BarFasExt = new String[] {""} ;
      T00XY6_A1248GuiFasULin = new short[1] ;
      T00XY6_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY6_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY6_A3139AlbTipCon = new short[1] ;
      T00XY6_n3139AlbTipCon = new boolean[] {false} ;
      T00XY6_A396EmprCod = new String[] {""} ;
      T00XY6_A129BarCod = new int[1] ;
      T00XY6_A132BarCodReo = new byte[1] ;
      T00XY6_A130BarCodPar = new String[] {""} ;
      T00XY6_A30AlbProCod = new long[1] ;
      T00XY13_A396EmprCod = new String[] {""} ;
      T00XY13_A129BarCod = new int[1] ;
      T00XY13_A132BarCodReo = new byte[1] ;
      T00XY13_A130BarCodPar = new String[] {""} ;
      T00XY13_A30AlbProCod = new long[1] ;
      T00XY14_A396EmprCod = new String[] {""} ;
      T00XY14_A129BarCod = new int[1] ;
      T00XY14_A132BarCodReo = new byte[1] ;
      T00XY14_A130BarCodPar = new String[] {""} ;
      T00XY14_A30AlbProCod = new long[1] ;
      T00XY5_A2399BarFasExtD = new String[] {""} ;
      T00XY5_n2399BarFasExtD = new boolean[] {false} ;
      T00XY5_A2398BarFasExt = new String[] {""} ;
      T00XY5_A1248GuiFasULin = new short[1] ;
      T00XY5_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY5_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY5_A3139AlbTipCon = new short[1] ;
      T00XY5_n3139AlbTipCon = new boolean[] {false} ;
      T00XY5_A396EmprCod = new String[] {""} ;
      T00XY5_A129BarCod = new int[1] ;
      T00XY5_A132BarCodReo = new byte[1] ;
      T00XY5_A130BarCodPar = new String[] {""} ;
      T00XY5_A30AlbProCod = new long[1] ;
      T00XY18_A396EmprCod = new String[] {""} ;
      T00XY18_A30AlbProCod = new long[1] ;
      T00XY18_A129BarCod = new int[1] ;
      T00XY18_A132BarCodReo = new byte[1] ;
      T00XY18_A130BarCodPar = new String[] {""} ;
      T00XY18_A6648AlbMetLin = new short[1] ;
      T00XY19_A396EmprCod = new String[] {""} ;
      T00XY19_A30AlbProCod = new long[1] ;
      T00XY19_A129BarCod = new int[1] ;
      T00XY19_A132BarCodReo = new byte[1] ;
      T00XY19_A130BarCodPar = new String[] {""} ;
      T00XY19_A9639Et_Numero = new short[1] ;
      T00XY20_A396EmprCod = new String[] {""} ;
      T00XY20_A30AlbProCod = new long[1] ;
      T00XY20_A129BarCod = new int[1] ;
      T00XY20_A132BarCodReo = new byte[1] ;
      T00XY20_A130BarCodPar = new String[] {""} ;
      T00XY20_A6622AlbHdRLn = new short[1] ;
      T00XY21_A396EmprCod = new String[] {""} ;
      T00XY21_A30AlbProCod = new long[1] ;
      T00XY21_A129BarCod = new int[1] ;
      T00XY21_A132BarCodReo = new byte[1] ;
      T00XY21_A130BarCodPar = new String[] {""} ;
      T00XY21_A5456P_ForLin = new short[1] ;
      T00XY22_A396EmprCod = new String[] {""} ;
      T00XY22_A30AlbProCod = new long[1] ;
      T00XY22_A129BarCod = new int[1] ;
      T00XY22_A132BarCodReo = new byte[1] ;
      T00XY22_A130BarCodPar = new String[] {""} ;
      T00XY22_A2524DisComLin = new byte[1] ;
      T00XY22_A1056DisComCod = new String[] {""} ;
      T00XY22_A1032FonCod = new String[] {""} ;
      T00XY23_A396EmprCod = new String[] {""} ;
      T00XY23_A3617AlbTrnCod = new long[1] ;
      T00XY23_A30AlbProCod = new long[1] ;
      T00XY23_A129BarCod = new int[1] ;
      T00XY23_A132BarCodReo = new byte[1] ;
      T00XY23_A130BarCodPar = new String[] {""} ;
      T00XY24_A396EmprCod = new String[] {""} ;
      T00XY24_A30AlbProCod = new long[1] ;
      T00XY24_A129BarCod = new int[1] ;
      T00XY24_A132BarCodReo = new byte[1] ;
      T00XY24_A130BarCodPar = new String[] {""} ;
      T00XY24_A3621AlbPckLin = new short[1] ;
      T00XY25_A396EmprCod = new String[] {""} ;
      T00XY25_A30AlbProCod = new long[1] ;
      T00XY25_A129BarCod = new int[1] ;
      T00XY25_A132BarCodReo = new byte[1] ;
      T00XY25_A130BarCodPar = new String[] {""} ;
      T00XY25_A2764AlbHdrLin = new short[1] ;
      T00XY26_A396EmprCod = new String[] {""} ;
      T00XY26_A30AlbProCod = new long[1] ;
      T00XY26_A129BarCod = new int[1] ;
      T00XY26_A132BarCodReo = new byte[1] ;
      T00XY26_A130BarCodPar = new String[] {""} ;
      T00XY26_A1468AlbPrdLin = new short[1] ;
      T00XY27_A396EmprCod = new String[] {""} ;
      T00XY27_A30AlbProCod = new long[1] ;
      T00XY27_A129BarCod = new int[1] ;
      T00XY27_A132BarCodReo = new byte[1] ;
      T00XY27_A130BarCodPar = new String[] {""} ;
      T00XY27_A200BarPieCod = new String[] {""} ;
      T00XY29_A396EmprCod = new String[] {""} ;
      T00XY29_A30AlbProCod = new long[1] ;
      T00XY29_A129BarCod = new int[1] ;
      T00XY29_A132BarCodReo = new byte[1] ;
      T00XY29_A130BarCodPar = new String[] {""} ;
      Z460FasDsc = "" ;
      T00XY30_A30AlbProCod = new long[1] ;
      T00XY30_A1240GuiFasLin = new short[1] ;
      T00XY30_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY30_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY30_A460FasDsc = new String[] {""} ;
      T00XY30_A7727ArtAdiCod = new short[1] ;
      T00XY30_n7727ArtAdiCod = new boolean[] {false} ;
      T00XY30_A7392FasFacMaqC = new String[] {""} ;
      T00XY30_n7392FasFacMaqC = new boolean[] {false} ;
      T00XY30_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY30_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY30_A7750GuiFasPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY30_n7750GuiFasPre = new boolean[] {false} ;
      T00XY30_A4390FasPreDsK = new String[] {""} ;
      T00XY30_n4390FasPreDsK = new boolean[] {false} ;
      T00XY30_A4391FasPreDsM = new String[] {""} ;
      T00XY30_n4391FasPreDsM = new boolean[] {false} ;
      T00XY30_A7751GuiFasDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY30_n7751GuiFasDto = new boolean[] {false} ;
      T00XY30_A7752GuiFasRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY30_n7752GuiFasRec = new boolean[] {false} ;
      T00XY30_A7753GuiFasCCo = new short[1] ;
      T00XY30_n7753GuiFasCCo = new boolean[] {false} ;
      T00XY30_A8194GuiFasPBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY30_n8194GuiFasPBK = new boolean[] {false} ;
      T00XY30_A8195GuiFasPBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY30_n8195GuiFasPBM = new boolean[] {false} ;
      T00XY30_A8196GuiFasPB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY30_n8196GuiFasPB = new boolean[] {false} ;
      T00XY30_A396EmprCod = new String[] {""} ;
      T00XY30_A457FasCod = new String[] {""} ;
      T00XY30_A129BarCod = new int[1] ;
      T00XY30_A132BarCodReo = new byte[1] ;
      T00XY30_A130BarCodPar = new String[] {""} ;
      T00XY4_A460FasDsc = new String[] {""} ;
      T00XY31_A460FasDsc = new String[] {""} ;
      T00XY32_A396EmprCod = new String[] {""} ;
      T00XY32_A30AlbProCod = new long[1] ;
      T00XY32_A129BarCod = new int[1] ;
      T00XY32_A132BarCodReo = new byte[1] ;
      T00XY32_A130BarCodPar = new String[] {""} ;
      T00XY32_A1240GuiFasLin = new short[1] ;
      T00XY3_A30AlbProCod = new long[1] ;
      T00XY3_A1240GuiFasLin = new short[1] ;
      T00XY3_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY3_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY3_A7727ArtAdiCod = new short[1] ;
      T00XY3_n7727ArtAdiCod = new boolean[] {false} ;
      T00XY3_A7392FasFacMaqC = new String[] {""} ;
      T00XY3_n7392FasFacMaqC = new boolean[] {false} ;
      T00XY3_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY3_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY3_A7750GuiFasPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY3_n7750GuiFasPre = new boolean[] {false} ;
      T00XY3_A4390FasPreDsK = new String[] {""} ;
      T00XY3_n4390FasPreDsK = new boolean[] {false} ;
      T00XY3_A4391FasPreDsM = new String[] {""} ;
      T00XY3_n4391FasPreDsM = new boolean[] {false} ;
      T00XY3_A7751GuiFasDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY3_n7751GuiFasDto = new boolean[] {false} ;
      T00XY3_A7752GuiFasRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY3_n7752GuiFasRec = new boolean[] {false} ;
      T00XY3_A7753GuiFasCCo = new short[1] ;
      T00XY3_n7753GuiFasCCo = new boolean[] {false} ;
      T00XY3_A8194GuiFasPBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY3_n8194GuiFasPBK = new boolean[] {false} ;
      T00XY3_A8195GuiFasPBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY3_n8195GuiFasPBM = new boolean[] {false} ;
      T00XY3_A8196GuiFasPB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY3_n8196GuiFasPB = new boolean[] {false} ;
      T00XY3_A396EmprCod = new String[] {""} ;
      T00XY3_A457FasCod = new String[] {""} ;
      T00XY3_A129BarCod = new int[1] ;
      T00XY3_A132BarCodReo = new byte[1] ;
      T00XY3_A130BarCodPar = new String[] {""} ;
      T00XY2_A30AlbProCod = new long[1] ;
      T00XY2_A1240GuiFasLin = new short[1] ;
      T00XY2_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY2_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY2_A7727ArtAdiCod = new short[1] ;
      T00XY2_n7727ArtAdiCod = new boolean[] {false} ;
      T00XY2_A7392FasFacMaqC = new String[] {""} ;
      T00XY2_n7392FasFacMaqC = new boolean[] {false} ;
      T00XY2_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY2_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY2_A7750GuiFasPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY2_n7750GuiFasPre = new boolean[] {false} ;
      T00XY2_A4390FasPreDsK = new String[] {""} ;
      T00XY2_n4390FasPreDsK = new boolean[] {false} ;
      T00XY2_A4391FasPreDsM = new String[] {""} ;
      T00XY2_n4391FasPreDsM = new boolean[] {false} ;
      T00XY2_A7751GuiFasDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY2_n7751GuiFasDto = new boolean[] {false} ;
      T00XY2_A7752GuiFasRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY2_n7752GuiFasRec = new boolean[] {false} ;
      T00XY2_A7753GuiFasCCo = new short[1] ;
      T00XY2_n7753GuiFasCCo = new boolean[] {false} ;
      T00XY2_A8194GuiFasPBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY2_n8194GuiFasPBK = new boolean[] {false} ;
      T00XY2_A8195GuiFasPBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY2_n8195GuiFasPBM = new boolean[] {false} ;
      T00XY2_A8196GuiFasPB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XY2_n8196GuiFasPB = new boolean[] {false} ;
      T00XY2_A396EmprCod = new String[] {""} ;
      T00XY2_A457FasCod = new String[] {""} ;
      T00XY2_A129BarCod = new int[1] ;
      T00XY2_A132BarCodReo = new byte[1] ;
      T00XY2_A130BarCodPar = new String[] {""} ;
      T00XY36_A460FasDsc = new String[] {""} ;
      T00XY37_A396EmprCod = new String[] {""} ;
      T00XY37_A30AlbProCod = new long[1] ;
      T00XY37_A129BarCod = new int[1] ;
      T00XY37_A132BarCodReo = new byte[1] ;
      T00XY37_A130BarCodPar = new String[] {""} ;
      T00XY37_A1240GuiFasLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      A7728ArtAdiDsc = "" ;
      i1276FasMtr = DecimalUtil.ZERO ;
      i1275FasKgm = DecimalUtil.ZERO ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      T00XY38_A396EmprCod = new String[] {""} ;
      T00XY38_A7727ArtAdiCod = new short[1] ;
      T00XY38_n7727ArtAdiCod = new boolean[] {false} ;
      T00XY38_A7728ArtAdiDsc = new String[] {""} ;
      T00XY38_n7728ArtAdiDsc = new boolean[] {false} ;
      T00XY39_A407EmprNom = new String[] {""} ;
      T00XY39_n407EmprNom = new boolean[] {false} ;
      T00XY40_A396EmprCod = new String[] {""} ;
      T00XY41_A361DisCod = new int[1] ;
      T00XY42_A366DisEnt = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ2399BarFasExtD = "" ;
      ZZ2398BarFasExt = "" ;
      ZZ1261BarAlbKgmE = DecimalUtil.ZERO ;
      ZZ1263BarAlbMtrE = DecimalUtil.ZERO ;
      ZZ366DisEnt = "" ;
      ZZ407EmprNom = "" ;
      T00XY43_A460FasDsc = new String[] {""} ;
      ZV23Pkg = DecimalUtil.ZERO ;
      ZV22Pmt = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tfasart__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tfasart__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tfasart__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tfasart__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tfasart__default(),
         new Object[] {
             new Object[] {
            T00XY2_A30AlbProCod, T00XY2_A1240GuiFasLin, T00XY2_A1276FasMtr, T00XY2_A1275FasKgm, T00XY2_A7727ArtAdiCod, T00XY2_n7727ArtAdiCod, T00XY2_A7392FasFacMaqC, T00XY2_n7392FasFacMaqC, T00XY2_A1241GuiFasPKg, T00XY2_A1242GuiFasPMt,
            T00XY2_A7750GuiFasPre, T00XY2_n7750GuiFasPre, T00XY2_A4390FasPreDsK, T00XY2_n4390FasPreDsK, T00XY2_A4391FasPreDsM, T00XY2_n4391FasPreDsM, T00XY2_A7751GuiFasDto, T00XY2_n7751GuiFasDto, T00XY2_A7752GuiFasRec, T00XY2_n7752GuiFasRec,
            T00XY2_A7753GuiFasCCo, T00XY2_n7753GuiFasCCo, T00XY2_A8194GuiFasPBK, T00XY2_n8194GuiFasPBK, T00XY2_A8195GuiFasPBM, T00XY2_n8195GuiFasPBM, T00XY2_A8196GuiFasPB, T00XY2_n8196GuiFasPB, T00XY2_A396EmprCod, T00XY2_A457FasCod,
            T00XY2_A129BarCod, T00XY2_A132BarCodReo, T00XY2_A130BarCodPar
            }
            , new Object[] {
            T00XY3_A30AlbProCod, T00XY3_A1240GuiFasLin, T00XY3_A1276FasMtr, T00XY3_A1275FasKgm, T00XY3_A7727ArtAdiCod, T00XY3_n7727ArtAdiCod, T00XY3_A7392FasFacMaqC, T00XY3_n7392FasFacMaqC, T00XY3_A1241GuiFasPKg, T00XY3_A1242GuiFasPMt,
            T00XY3_A7750GuiFasPre, T00XY3_n7750GuiFasPre, T00XY3_A4390FasPreDsK, T00XY3_n4390FasPreDsK, T00XY3_A4391FasPreDsM, T00XY3_n4391FasPreDsM, T00XY3_A7751GuiFasDto, T00XY3_n7751GuiFasDto, T00XY3_A7752GuiFasRec, T00XY3_n7752GuiFasRec,
            T00XY3_A7753GuiFasCCo, T00XY3_n7753GuiFasCCo, T00XY3_A8194GuiFasPBK, T00XY3_n8194GuiFasPBK, T00XY3_A8195GuiFasPBM, T00XY3_n8195GuiFasPBM, T00XY3_A8196GuiFasPB, T00XY3_n8196GuiFasPB, T00XY3_A396EmprCod, T00XY3_A457FasCod,
            T00XY3_A129BarCod, T00XY3_A132BarCodReo, T00XY3_A130BarCodPar
            }
            , new Object[] {
            T00XY4_A460FasDsc
            }
            , new Object[] {
            T00XY5_A2399BarFasExtD, T00XY5_n2399BarFasExtD, T00XY5_A2398BarFasExt, T00XY5_A1248GuiFasULin, T00XY5_A1261BarAlbKgmE, T00XY5_A1263BarAlbMtrE, T00XY5_A3139AlbTipCon, T00XY5_n3139AlbTipCon, T00XY5_A396EmprCod, T00XY5_A129BarCod,
            T00XY5_A132BarCodReo, T00XY5_A130BarCodPar, T00XY5_A30AlbProCod
            }
            , new Object[] {
            T00XY6_A2399BarFasExtD, T00XY6_n2399BarFasExtD, T00XY6_A2398BarFasExt, T00XY6_A1248GuiFasULin, T00XY6_A1261BarAlbKgmE, T00XY6_A1263BarAlbMtrE, T00XY6_A3139AlbTipCon, T00XY6_n3139AlbTipCon, T00XY6_A396EmprCod, T00XY6_A129BarCod,
            T00XY6_A132BarCodReo, T00XY6_A130BarCodPar, T00XY6_A30AlbProCod
            }
            , new Object[] {
            T00XY7_A407EmprNom, T00XY7_n407EmprNom
            }
            , new Object[] {
            T00XY8_A361DisCod
            }
            , new Object[] {
            T00XY9_A396EmprCod
            }
            , new Object[] {
            T00XY10_A366DisEnt
            }
            , new Object[] {
            T00XY11_A361DisCod, T00XY11_A2399BarFasExtD, T00XY11_n2399BarFasExtD, T00XY11_A2398BarFasExt, T00XY11_A1248GuiFasULin, T00XY11_A1261BarAlbKgmE, T00XY11_A1263BarAlbMtrE, T00XY11_A366DisEnt, T00XY11_A407EmprNom, T00XY11_n407EmprNom,
            T00XY11_A3139AlbTipCon, T00XY11_n3139AlbTipCon, T00XY11_A396EmprCod, T00XY11_A129BarCod, T00XY11_A132BarCodReo, T00XY11_A130BarCodPar, T00XY11_A30AlbProCod
            }
            , new Object[] {
            T00XY12_A396EmprCod, T00XY12_A30AlbProCod, T00XY12_A129BarCod, T00XY12_A132BarCodReo, T00XY12_A130BarCodPar
            }
            , new Object[] {
            T00XY13_A396EmprCod, T00XY13_A129BarCod, T00XY13_A132BarCodReo, T00XY13_A130BarCodPar, T00XY13_A30AlbProCod
            }
            , new Object[] {
            T00XY14_A396EmprCod, T00XY14_A129BarCod, T00XY14_A132BarCodReo, T00XY14_A130BarCodPar, T00XY14_A30AlbProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00XY18_A396EmprCod, T00XY18_A30AlbProCod, T00XY18_A129BarCod, T00XY18_A132BarCodReo, T00XY18_A130BarCodPar, T00XY18_A6648AlbMetLin
            }
            , new Object[] {
            T00XY19_A396EmprCod, T00XY19_A30AlbProCod, T00XY19_A129BarCod, T00XY19_A132BarCodReo, T00XY19_A130BarCodPar, T00XY19_A9639Et_Numero
            }
            , new Object[] {
            T00XY20_A396EmprCod, T00XY20_A30AlbProCod, T00XY20_A129BarCod, T00XY20_A132BarCodReo, T00XY20_A130BarCodPar, T00XY20_A6622AlbHdRLn
            }
            , new Object[] {
            T00XY21_A396EmprCod, T00XY21_A30AlbProCod, T00XY21_A129BarCod, T00XY21_A132BarCodReo, T00XY21_A130BarCodPar, T00XY21_A5456P_ForLin
            }
            , new Object[] {
            T00XY22_A396EmprCod, T00XY22_A30AlbProCod, T00XY22_A129BarCod, T00XY22_A132BarCodReo, T00XY22_A130BarCodPar, T00XY22_A2524DisComLin, T00XY22_A1056DisComCod, T00XY22_A1032FonCod
            }
            , new Object[] {
            T00XY23_A396EmprCod, T00XY23_A3617AlbTrnCod, T00XY23_A30AlbProCod, T00XY23_A129BarCod, T00XY23_A132BarCodReo, T00XY23_A130BarCodPar
            }
            , new Object[] {
            T00XY24_A396EmprCod, T00XY24_A30AlbProCod, T00XY24_A129BarCod, T00XY24_A132BarCodReo, T00XY24_A130BarCodPar, T00XY24_A3621AlbPckLin
            }
            , new Object[] {
            T00XY25_A396EmprCod, T00XY25_A30AlbProCod, T00XY25_A129BarCod, T00XY25_A132BarCodReo, T00XY25_A130BarCodPar, T00XY25_A2764AlbHdrLin
            }
            , new Object[] {
            T00XY26_A396EmprCod, T00XY26_A30AlbProCod, T00XY26_A129BarCod, T00XY26_A132BarCodReo, T00XY26_A130BarCodPar, T00XY26_A1468AlbPrdLin
            }
            , new Object[] {
            T00XY27_A396EmprCod, T00XY27_A30AlbProCod, T00XY27_A129BarCod, T00XY27_A132BarCodReo, T00XY27_A130BarCodPar, T00XY27_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            T00XY29_A396EmprCod, T00XY29_A30AlbProCod, T00XY29_A129BarCod, T00XY29_A132BarCodReo, T00XY29_A130BarCodPar
            }
            , new Object[] {
            T00XY30_A30AlbProCod, T00XY30_A1240GuiFasLin, T00XY30_A1276FasMtr, T00XY30_A1275FasKgm, T00XY30_A460FasDsc, T00XY30_A7727ArtAdiCod, T00XY30_n7727ArtAdiCod, T00XY30_A7392FasFacMaqC, T00XY30_n7392FasFacMaqC, T00XY30_A1241GuiFasPKg,
            T00XY30_A1242GuiFasPMt, T00XY30_A7750GuiFasPre, T00XY30_n7750GuiFasPre, T00XY30_A4390FasPreDsK, T00XY30_n4390FasPreDsK, T00XY30_A4391FasPreDsM, T00XY30_n4391FasPreDsM, T00XY30_A7751GuiFasDto, T00XY30_n7751GuiFasDto, T00XY30_A7752GuiFasRec,
            T00XY30_n7752GuiFasRec, T00XY30_A7753GuiFasCCo, T00XY30_n7753GuiFasCCo, T00XY30_A8194GuiFasPBK, T00XY30_n8194GuiFasPBK, T00XY30_A8195GuiFasPBM, T00XY30_n8195GuiFasPBM, T00XY30_A8196GuiFasPB, T00XY30_n8196GuiFasPB, T00XY30_A396EmprCod,
            T00XY30_A457FasCod, T00XY30_A129BarCod, T00XY30_A132BarCodReo, T00XY30_A130BarCodPar
            }
            , new Object[] {
            T00XY31_A460FasDsc
            }
            , new Object[] {
            T00XY32_A396EmprCod, T00XY32_A30AlbProCod, T00XY32_A129BarCod, T00XY32_A132BarCodReo, T00XY32_A130BarCodPar, T00XY32_A1240GuiFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00XY36_A460FasDsc
            }
            , new Object[] {
            T00XY37_A396EmprCod, T00XY37_A30AlbProCod, T00XY37_A129BarCod, T00XY37_A132BarCodReo, T00XY37_A130BarCodPar, T00XY37_A1240GuiFasLin
            }
            , new Object[] {
            T00XY38_A396EmprCod, T00XY38_A7727ArtAdiCod, T00XY38_A7728ArtAdiDsc, T00XY38_n7728ArtAdiDsc
            }
            , new Object[] {
            T00XY39_A407EmprNom, T00XY39_n407EmprNom
            }
            , new Object[] {
            T00XY40_A396EmprCod
            }
            , new Object[] {
            T00XY41_A361DisCod
            }
            , new Object[] {
            T00XY42_A366DisEnt
            }
            , new Object[] {
            T00XY43_A460FasDsc
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
      AV27Pgmname = "TFASART" ;
      Z1275FasKgm = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      i1275FasKgm = DecimalUtil.ZERO ;
      Z1276FasMtr = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      i1276FasMtr = DecimalUtil.ZERO ;
   }

   private byte wcpOA132BarCodReo ;
   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
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
   private short Z1248GuiFasULin ;
   private short Z3139AlbTipCon ;
   private short O1248GuiFasULin ;
   private short O3139AlbTipCon ;
   private short Z1240GuiFasLin ;
   private short Z7727ArtAdiCod ;
   private short Z7753GuiFasCCo ;
   private short nRcdDeleted_194 ;
   private short nRcdExists_194 ;
   private short nIsMod_194 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A1248GuiFasULin ;
   private short A3139AlbTipCon ;
   private short nBlankRcdCount194 ;
   private short RcdFound194 ;
   private short B1248GuiFasULin ;
   private short B3139AlbTipCon ;
   private short nBlankRcdUsr194 ;
   private short s1248GuiFasULin ;
   private short A1240GuiFasLin ;
   private short A7727ArtAdiCod ;
   private short A7753GuiFasCCo ;
   private short RcdFound195 ;
   private short nIsDirty_195 ;
   private short nIsDirty_194 ;
   private short i1248GuiFasULin ;
   private short ZZ1248GuiFasULin ;
   private short ZZ3139AlbTipCon ;
   private short ZO1248GuiFasULin ;
   private short ZO3139AlbTipCon ;
   private int wcpOA129BarCod ;
   private int Z129BarCod ;
   private int nRC_GXsfl_85 ;
   private int nGXsfl_85_idx=1 ;
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
   private int edtGuiFasULin_Enabled ;
   private int edtBarAlbKgmE_Enabled ;
   private int edtBarAlbMtrE_Enabled ;
   private int edtDisEnt_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtAlbTipCon_Enabled ;
   private int edtBarFasExt_Enabled ;
   private int edtBarFasExtD_Enabled ;
   private int edtavnRcdDeleted_194_Enabled ;
   private int edtGuiFasLin_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtFasFacMaqC_Enabled ;
   private int edtGuiFasPKg_Enabled ;
   private int edtGuiFasPMt_Enabled ;
   private int edtGuiFasPre_Enabled ;
   private int edtFasKgm_Enabled ;
   private int edtFasMtr_Enabled ;
   private int edtFasPreDsK_Enabled ;
   private int edtFasPreDsM_Enabled ;
   private int edtGuiFasDto_Enabled ;
   private int edtGuiFasRec_Enabled ;
   private int edtGuiFasCCo_Enabled ;
   private int edtGuiFasPBK_Enabled ;
   private int edtGuiFasPBM_Enabled ;
   private int edtGuiFasPB_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A361DisCod ;
   private int GX_JID ;
   private int Z361DisCod ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defdynArtAdiCod_Enabled ;
   private int defedtFasCod_Enabled ;
   private int defedtGuiFasLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtBarFasExtD_Backcolor ;
   private int edtBarFasExt_Backcolor ;
   private int edtAlbTipCon_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtDisEnt_Backcolor ;
   private int edtBarAlbMtrE_Backcolor ;
   private int edtBarAlbKgmE_Backcolor ;
   private int edtGuiFasULin_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtAlbProCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int gxdynajaxindex ;
   private int ZZ129BarCod ;
   private int ZZ361DisCod ;
   private long wcpOA30AlbProCod ;
   private long Z30AlbProCod ;
   private long A30AlbProCod ;
   private long GRID1_nFirstRecordOnPage ;
   private long ZZ30AlbProCod ;
   private java.math.BigDecimal Z1261BarAlbKgmE ;
   private java.math.BigDecimal Z1263BarAlbMtrE ;
   private java.math.BigDecimal Z1276FasMtr ;
   private java.math.BigDecimal Z1275FasKgm ;
   private java.math.BigDecimal Z1241GuiFasPKg ;
   private java.math.BigDecimal Z1242GuiFasPMt ;
   private java.math.BigDecimal Z7750GuiFasPre ;
   private java.math.BigDecimal Z7751GuiFasDto ;
   private java.math.BigDecimal Z7752GuiFasRec ;
   private java.math.BigDecimal Z8194GuiFasPBK ;
   private java.math.BigDecimal Z8195GuiFasPBM ;
   private java.math.BigDecimal Z8196GuiFasPB ;
   private java.math.BigDecimal O1241GuiFasPKg ;
   private java.math.BigDecimal O1242GuiFasPMt ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal AV22Pmt ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal AV23Pkg ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A7750GuiFasPre ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A7751GuiFasDto ;
   private java.math.BigDecimal A7752GuiFasRec ;
   private java.math.BigDecimal A8194GuiFasPBK ;
   private java.math.BigDecimal A8195GuiFasPBM ;
   private java.math.BigDecimal A8196GuiFasPB ;
   private java.math.BigDecimal T1241GuiFasPKg ;
   private java.math.BigDecimal T1242GuiFasPMt ;
   private java.math.BigDecimal i1276FasMtr ;
   private java.math.BigDecimal i1275FasKgm ;
   private java.math.BigDecimal ZZ1261BarAlbKgmE ;
   private java.math.BigDecimal ZZ1263BarAlbMtrE ;
   private java.math.BigDecimal ZV23Pkg ;
   private java.math.BigDecimal ZV22Pmt ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z2399BarFasExtD ;
   private String Z2398BarFasExt ;
   private String Z7392FasFacMaqC ;
   private String Z4390FasPreDsK ;
   private String Z4391FasPreDsM ;
   private String Z457FasCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV27Pgmname ;
   private String AV17UsurCod ;
   private String AV25Station ;
   private String A130BarCodPar ;
   private String A457FasCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBarAlbKgmE_Internalname ;
   private String sGXsfl_85_idx="0001" ;
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
   private String edtGuiFasULin_Internalname ;
   private String edtGuiFasULin_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtBarAlbKgmE_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtBarAlbMtrE_Internalname ;
   private String edtBarAlbMtrE_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtDisEnt_Internalname ;
   private String A366DisEnt ;
   private String edtDisEnt_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtAlbTipCon_Internalname ;
   private String edtAlbTipCon_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtBarFasExt_Internalname ;
   private String A2398BarFasExt ;
   private String edtBarFasExt_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtBarFasExtD_Internalname ;
   private String A2399BarFasExtD ;
   private String edtBarFasExtD_Jsonclick ;
   private String sMode194 ;
   private String edtavnRcdDeleted_194_Internalname ;
   private String edtGuiFasLin_Internalname ;
   private String edtFasCod_Internalname ;
   private String edtFasDsc_Internalname ;
   private String edtFasFacMaqC_Internalname ;
   private String edtGuiFasPKg_Internalname ;
   private String edtGuiFasPMt_Internalname ;
   private String edtGuiFasPre_Internalname ;
   private String edtFasKgm_Internalname ;
   private String edtFasMtr_Internalname ;
   private String edtFasPreDsK_Internalname ;
   private String edtFasPreDsM_Internalname ;
   private String edtGuiFasDto_Internalname ;
   private String edtGuiFasRec_Internalname ;
   private String edtGuiFasCCo_Internalname ;
   private String edtGuiFasPBK_Internalname ;
   private String edtGuiFasPBM_Internalname ;
   private String edtGuiFasPB_Internalname ;
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
   private String hsh2 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode195 ;
   private String GXCCtl ;
   private String A460FasDsc ;
   private String A7392FasFacMaqC ;
   private String A4390FasPreDsK ;
   private String A4391FasPreDsM ;
   private String AV21Lit ;
   private String AV16Lit0 ;
   private String AV19Lit1 ;
   private String AV20Lit2 ;
   private String AV18LitFe ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV28Emprnom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z366DisEnt ;
   private String Z460FasDsc ;
   private String sGXsfl_85_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_194_Jsonclick ;
   private String edtGuiFasLin_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtFasFacMaqC_Jsonclick ;
   private String edtGuiFasPKg_Jsonclick ;
   private String edtGuiFasPMt_Jsonclick ;
   private String edtGuiFasPre_Jsonclick ;
   private String edtFasKgm_Jsonclick ;
   private String edtFasMtr_Jsonclick ;
   private String edtFasPreDsK_Jsonclick ;
   private String edtFasPreDsM_Jsonclick ;
   private String edtGuiFasDto_Jsonclick ;
   private String edtGuiFasRec_Jsonclick ;
   private String edtGuiFasCCo_Jsonclick ;
   private String edtGuiFasPBK_Jsonclick ;
   private String edtGuiFasPBM_Jsonclick ;
   private String edtGuiFasPB_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A7728ArtAdiDsc ;
   private String subGrid1_Header ;
   private String gxwrpcisep ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ2399BarFasExtD ;
   private String ZZ2398BarFasExt ;
   private String ZZ366DisEnt ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n3139AlbTipCon ;
   private boolean bGXsfl_85_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n2399BarFasExtD ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n7727ArtAdiCod ;
   private boolean n7392FasFacMaqC ;
   private boolean n7750GuiFasPre ;
   private boolean n4390FasPreDsK ;
   private boolean n4391FasPreDsM ;
   private boolean n7751GuiFasDto ;
   private boolean n7752GuiFasRec ;
   private boolean n7753GuiFasCCo ;
   private boolean n8194GuiFasPBK ;
   private boolean n8195GuiFasPBM ;
   private boolean n8196GuiFasPB ;
   private boolean n7728ArtAdiDsc ;
   private boolean gxdyncontrolsrefreshing ;
   private String AV24Inc_obs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.util.GXProperties forbiddenHiddens2 ;
   private HTMLChoice dynArtAdiCod ;
   private IDataStoreProvider pr_default ;
   private String[] T00XY7_A407EmprNom ;
   private boolean[] T00XY7_n407EmprNom ;
   private String[] T00XY9_A396EmprCod ;
   private int[] T00XY8_A361DisCod ;
   private String[] T00XY10_A366DisEnt ;
   private int[] T00XY11_A361DisCod ;
   private String[] T00XY11_A2399BarFasExtD ;
   private boolean[] T00XY11_n2399BarFasExtD ;
   private String[] T00XY11_A2398BarFasExt ;
   private short[] T00XY11_A1248GuiFasULin ;
   private java.math.BigDecimal[] T00XY11_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T00XY11_A1263BarAlbMtrE ;
   private String[] T00XY11_A366DisEnt ;
   private String[] T00XY11_A407EmprNom ;
   private boolean[] T00XY11_n407EmprNom ;
   private short[] T00XY11_A3139AlbTipCon ;
   private boolean[] T00XY11_n3139AlbTipCon ;
   private String[] T00XY11_A396EmprCod ;
   private int[] T00XY11_A129BarCod ;
   private byte[] T00XY11_A132BarCodReo ;
   private String[] T00XY11_A130BarCodPar ;
   private long[] T00XY11_A30AlbProCod ;
   private String[] T00XY12_A396EmprCod ;
   private long[] T00XY12_A30AlbProCod ;
   private int[] T00XY12_A129BarCod ;
   private byte[] T00XY12_A132BarCodReo ;
   private String[] T00XY12_A130BarCodPar ;
   private String[] T00XY6_A2399BarFasExtD ;
   private boolean[] T00XY6_n2399BarFasExtD ;
   private String[] T00XY6_A2398BarFasExt ;
   private short[] T00XY6_A1248GuiFasULin ;
   private java.math.BigDecimal[] T00XY6_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T00XY6_A1263BarAlbMtrE ;
   private short[] T00XY6_A3139AlbTipCon ;
   private boolean[] T00XY6_n3139AlbTipCon ;
   private String[] T00XY6_A396EmprCod ;
   private int[] T00XY6_A129BarCod ;
   private byte[] T00XY6_A132BarCodReo ;
   private String[] T00XY6_A130BarCodPar ;
   private long[] T00XY6_A30AlbProCod ;
   private String[] T00XY13_A396EmprCod ;
   private int[] T00XY13_A129BarCod ;
   private byte[] T00XY13_A132BarCodReo ;
   private String[] T00XY13_A130BarCodPar ;
   private long[] T00XY13_A30AlbProCod ;
   private String[] T00XY14_A396EmprCod ;
   private int[] T00XY14_A129BarCod ;
   private byte[] T00XY14_A132BarCodReo ;
   private String[] T00XY14_A130BarCodPar ;
   private long[] T00XY14_A30AlbProCod ;
   private String[] T00XY5_A2399BarFasExtD ;
   private boolean[] T00XY5_n2399BarFasExtD ;
   private String[] T00XY5_A2398BarFasExt ;
   private short[] T00XY5_A1248GuiFasULin ;
   private java.math.BigDecimal[] T00XY5_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T00XY5_A1263BarAlbMtrE ;
   private short[] T00XY5_A3139AlbTipCon ;
   private boolean[] T00XY5_n3139AlbTipCon ;
   private String[] T00XY5_A396EmprCod ;
   private int[] T00XY5_A129BarCod ;
   private byte[] T00XY5_A132BarCodReo ;
   private String[] T00XY5_A130BarCodPar ;
   private long[] T00XY5_A30AlbProCod ;
   private String[] T00XY18_A396EmprCod ;
   private long[] T00XY18_A30AlbProCod ;
   private int[] T00XY18_A129BarCod ;
   private byte[] T00XY18_A132BarCodReo ;
   private String[] T00XY18_A130BarCodPar ;
   private short[] T00XY18_A6648AlbMetLin ;
   private String[] T00XY19_A396EmprCod ;
   private long[] T00XY19_A30AlbProCod ;
   private int[] T00XY19_A129BarCod ;
   private byte[] T00XY19_A132BarCodReo ;
   private String[] T00XY19_A130BarCodPar ;
   private short[] T00XY19_A9639Et_Numero ;
   private String[] T00XY20_A396EmprCod ;
   private long[] T00XY20_A30AlbProCod ;
   private int[] T00XY20_A129BarCod ;
   private byte[] T00XY20_A132BarCodReo ;
   private String[] T00XY20_A130BarCodPar ;
   private short[] T00XY20_A6622AlbHdRLn ;
   private String[] T00XY21_A396EmprCod ;
   private long[] T00XY21_A30AlbProCod ;
   private int[] T00XY21_A129BarCod ;
   private byte[] T00XY21_A132BarCodReo ;
   private String[] T00XY21_A130BarCodPar ;
   private short[] T00XY21_A5456P_ForLin ;
   private String[] T00XY22_A396EmprCod ;
   private long[] T00XY22_A30AlbProCod ;
   private int[] T00XY22_A129BarCod ;
   private byte[] T00XY22_A132BarCodReo ;
   private String[] T00XY22_A130BarCodPar ;
   private byte[] T00XY22_A2524DisComLin ;
   private String[] T00XY22_A1056DisComCod ;
   private String[] T00XY22_A1032FonCod ;
   private String[] T00XY23_A396EmprCod ;
   private long[] T00XY23_A3617AlbTrnCod ;
   private long[] T00XY23_A30AlbProCod ;
   private int[] T00XY23_A129BarCod ;
   private byte[] T00XY23_A132BarCodReo ;
   private String[] T00XY23_A130BarCodPar ;
   private String[] T00XY24_A396EmprCod ;
   private long[] T00XY24_A30AlbProCod ;
   private int[] T00XY24_A129BarCod ;
   private byte[] T00XY24_A132BarCodReo ;
   private String[] T00XY24_A130BarCodPar ;
   private short[] T00XY24_A3621AlbPckLin ;
   private String[] T00XY25_A396EmprCod ;
   private long[] T00XY25_A30AlbProCod ;
   private int[] T00XY25_A129BarCod ;
   private byte[] T00XY25_A132BarCodReo ;
   private String[] T00XY25_A130BarCodPar ;
   private short[] T00XY25_A2764AlbHdrLin ;
   private String[] T00XY26_A396EmprCod ;
   private long[] T00XY26_A30AlbProCod ;
   private int[] T00XY26_A129BarCod ;
   private byte[] T00XY26_A132BarCodReo ;
   private String[] T00XY26_A130BarCodPar ;
   private short[] T00XY26_A1468AlbPrdLin ;
   private String[] T00XY27_A396EmprCod ;
   private long[] T00XY27_A30AlbProCod ;
   private int[] T00XY27_A129BarCod ;
   private byte[] T00XY27_A132BarCodReo ;
   private String[] T00XY27_A130BarCodPar ;
   private String[] T00XY27_A200BarPieCod ;
   private String[] T00XY29_A396EmprCod ;
   private long[] T00XY29_A30AlbProCod ;
   private int[] T00XY29_A129BarCod ;
   private byte[] T00XY29_A132BarCodReo ;
   private String[] T00XY29_A130BarCodPar ;
   private long[] T00XY30_A30AlbProCod ;
   private short[] T00XY30_A1240GuiFasLin ;
   private java.math.BigDecimal[] T00XY30_A1276FasMtr ;
   private java.math.BigDecimal[] T00XY30_A1275FasKgm ;
   private String[] T00XY30_A460FasDsc ;
   private short[] T00XY30_A7727ArtAdiCod ;
   private boolean[] T00XY30_n7727ArtAdiCod ;
   private String[] T00XY30_A7392FasFacMaqC ;
   private boolean[] T00XY30_n7392FasFacMaqC ;
   private java.math.BigDecimal[] T00XY30_A1241GuiFasPKg ;
   private java.math.BigDecimal[] T00XY30_A1242GuiFasPMt ;
   private java.math.BigDecimal[] T00XY30_A7750GuiFasPre ;
   private boolean[] T00XY30_n7750GuiFasPre ;
   private String[] T00XY30_A4390FasPreDsK ;
   private boolean[] T00XY30_n4390FasPreDsK ;
   private String[] T00XY30_A4391FasPreDsM ;
   private boolean[] T00XY30_n4391FasPreDsM ;
   private java.math.BigDecimal[] T00XY30_A7751GuiFasDto ;
   private boolean[] T00XY30_n7751GuiFasDto ;
   private java.math.BigDecimal[] T00XY30_A7752GuiFasRec ;
   private boolean[] T00XY30_n7752GuiFasRec ;
   private short[] T00XY30_A7753GuiFasCCo ;
   private boolean[] T00XY30_n7753GuiFasCCo ;
   private java.math.BigDecimal[] T00XY30_A8194GuiFasPBK ;
   private boolean[] T00XY30_n8194GuiFasPBK ;
   private java.math.BigDecimal[] T00XY30_A8195GuiFasPBM ;
   private boolean[] T00XY30_n8195GuiFasPBM ;
   private java.math.BigDecimal[] T00XY30_A8196GuiFasPB ;
   private boolean[] T00XY30_n8196GuiFasPB ;
   private String[] T00XY30_A396EmprCod ;
   private String[] T00XY30_A457FasCod ;
   private int[] T00XY30_A129BarCod ;
   private byte[] T00XY30_A132BarCodReo ;
   private String[] T00XY30_A130BarCodPar ;
   private String[] T00XY4_A460FasDsc ;
   private String[] T00XY31_A460FasDsc ;
   private String[] T00XY32_A396EmprCod ;
   private long[] T00XY32_A30AlbProCod ;
   private int[] T00XY32_A129BarCod ;
   private byte[] T00XY32_A132BarCodReo ;
   private String[] T00XY32_A130BarCodPar ;
   private short[] T00XY32_A1240GuiFasLin ;
   private long[] T00XY3_A30AlbProCod ;
   private short[] T00XY3_A1240GuiFasLin ;
   private java.math.BigDecimal[] T00XY3_A1276FasMtr ;
   private java.math.BigDecimal[] T00XY3_A1275FasKgm ;
   private short[] T00XY3_A7727ArtAdiCod ;
   private boolean[] T00XY3_n7727ArtAdiCod ;
   private String[] T00XY3_A7392FasFacMaqC ;
   private boolean[] T00XY3_n7392FasFacMaqC ;
   private java.math.BigDecimal[] T00XY3_A1241GuiFasPKg ;
   private java.math.BigDecimal[] T00XY3_A1242GuiFasPMt ;
   private java.math.BigDecimal[] T00XY3_A7750GuiFasPre ;
   private boolean[] T00XY3_n7750GuiFasPre ;
   private String[] T00XY3_A4390FasPreDsK ;
   private boolean[] T00XY3_n4390FasPreDsK ;
   private String[] T00XY3_A4391FasPreDsM ;
   private boolean[] T00XY3_n4391FasPreDsM ;
   private java.math.BigDecimal[] T00XY3_A7751GuiFasDto ;
   private boolean[] T00XY3_n7751GuiFasDto ;
   private java.math.BigDecimal[] T00XY3_A7752GuiFasRec ;
   private boolean[] T00XY3_n7752GuiFasRec ;
   private short[] T00XY3_A7753GuiFasCCo ;
   private boolean[] T00XY3_n7753GuiFasCCo ;
   private java.math.BigDecimal[] T00XY3_A8194GuiFasPBK ;
   private boolean[] T00XY3_n8194GuiFasPBK ;
   private java.math.BigDecimal[] T00XY3_A8195GuiFasPBM ;
   private boolean[] T00XY3_n8195GuiFasPBM ;
   private java.math.BigDecimal[] T00XY3_A8196GuiFasPB ;
   private boolean[] T00XY3_n8196GuiFasPB ;
   private String[] T00XY3_A396EmprCod ;
   private String[] T00XY3_A457FasCod ;
   private int[] T00XY3_A129BarCod ;
   private byte[] T00XY3_A132BarCodReo ;
   private String[] T00XY3_A130BarCodPar ;
   private long[] T00XY2_A30AlbProCod ;
   private short[] T00XY2_A1240GuiFasLin ;
   private java.math.BigDecimal[] T00XY2_A1276FasMtr ;
   private java.math.BigDecimal[] T00XY2_A1275FasKgm ;
   private short[] T00XY2_A7727ArtAdiCod ;
   private boolean[] T00XY2_n7727ArtAdiCod ;
   private String[] T00XY2_A7392FasFacMaqC ;
   private boolean[] T00XY2_n7392FasFacMaqC ;
   private java.math.BigDecimal[] T00XY2_A1241GuiFasPKg ;
   private java.math.BigDecimal[] T00XY2_A1242GuiFasPMt ;
   private java.math.BigDecimal[] T00XY2_A7750GuiFasPre ;
   private boolean[] T00XY2_n7750GuiFasPre ;
   private String[] T00XY2_A4390FasPreDsK ;
   private boolean[] T00XY2_n4390FasPreDsK ;
   private String[] T00XY2_A4391FasPreDsM ;
   private boolean[] T00XY2_n4391FasPreDsM ;
   private java.math.BigDecimal[] T00XY2_A7751GuiFasDto ;
   private boolean[] T00XY2_n7751GuiFasDto ;
   private java.math.BigDecimal[] T00XY2_A7752GuiFasRec ;
   private boolean[] T00XY2_n7752GuiFasRec ;
   private short[] T00XY2_A7753GuiFasCCo ;
   private boolean[] T00XY2_n7753GuiFasCCo ;
   private java.math.BigDecimal[] T00XY2_A8194GuiFasPBK ;
   private boolean[] T00XY2_n8194GuiFasPBK ;
   private java.math.BigDecimal[] T00XY2_A8195GuiFasPBM ;
   private boolean[] T00XY2_n8195GuiFasPBM ;
   private java.math.BigDecimal[] T00XY2_A8196GuiFasPB ;
   private boolean[] T00XY2_n8196GuiFasPB ;
   private String[] T00XY2_A396EmprCod ;
   private String[] T00XY2_A457FasCod ;
   private int[] T00XY2_A129BarCod ;
   private byte[] T00XY2_A132BarCodReo ;
   private String[] T00XY2_A130BarCodPar ;
   private String[] T00XY36_A460FasDsc ;
   private String[] T00XY37_A396EmprCod ;
   private long[] T00XY37_A30AlbProCod ;
   private int[] T00XY37_A129BarCod ;
   private byte[] T00XY37_A132BarCodReo ;
   private String[] T00XY37_A130BarCodPar ;
   private short[] T00XY37_A1240GuiFasLin ;
   private String[] T00XY38_A396EmprCod ;
   private short[] T00XY38_A7727ArtAdiCod ;
   private boolean[] T00XY38_n7727ArtAdiCod ;
   private String[] T00XY38_A7728ArtAdiDsc ;
   private boolean[] T00XY38_n7728ArtAdiDsc ;
   private String[] T00XY39_A407EmprNom ;
   private boolean[] T00XY39_n407EmprNom ;
   private String[] T00XY40_A396EmprCod ;
   private int[] T00XY41_A361DisCod ;
   private String[] T00XY42_A366DisEnt ;
   private String[] T00XY43_A460FasDsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tfasart__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfasart__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfasart__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfasart__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfasart__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00XY2", "SELECT AlbProCod, GuiFasLin, FasMtr, FasKgm, ArtAdiCod, FasFacMaqC, GuiFasPKg, GuiFasPMt, GuiFasPre, FasPreDsK, FasPreDsM, GuiFasDto, GuiFasRec, GuiFasCCo, GuiFasPBK, GuiFasPBM, GuiFasPB, EmprCod, FasCod, BarCod, BarCodReo, BarCodPar FROM TXPALBFAS WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?  FOR UPDATE OF FasMtr, FasKgm, ArtAdiCod, FasFacMaqC, GuiFasPKg, GuiFasPMt, GuiFasPre, FasPreDsK, FasPreDsM, GuiFasDto, GuiFasRec, GuiFasCCo, GuiFasPBK, GuiFasPBM, GuiFasPB, FasCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XY3", "SELECT AlbProCod, GuiFasLin, FasMtr, FasKgm, ArtAdiCod, FasFacMaqC, GuiFasPKg, GuiFasPMt, GuiFasPre, FasPreDsK, FasPreDsM, GuiFasDto, GuiFasRec, GuiFasCCo, GuiFasPBK, GuiFasPBM, GuiFasPB, EmprCod, FasCod, BarCod, BarCodReo, BarCodPar FROM TXPALBFAS WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XY4", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XY5", "SELECT BarFasExtD, BarFasExt, GuiFasULin, BarAlbKgmE, BarAlbMtrE, AlbTipCon, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF BarFasExtD, BarFasExt, GuiFasULin, BarAlbKgmE, BarAlbMtrE, AlbTipCon NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XY6", "SELECT BarFasExtD, BarFasExt, GuiFasULin, BarAlbKgmE, BarAlbMtrE, AlbTipCon, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XY7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XY8", "SELECT DisCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XY9", "SELECT EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XY10", "SELECT DisEnt FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XY11", "SELECT /*+ FIRST_ROWS(1) */ T3.DisCod, TM1.BarFasExtD, TM1.BarFasExt, TM1.GuiFasULin, TM1.BarAlbKgmE, TM1.BarAlbMtrE, T4.DisEnt, T2.EmprNom, TM1.AlbTipCon, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.AlbProCod FROM (((TXPALBBAR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) LEFT JOIN TXPDISPOS T4 ON T4.EmprCod = TM1.EmprCod AND T4.DisCod = T3.DisCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.AlbProCod = ? ORDER BY TM1.EmprCod, TM1.AlbProCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XY12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XY13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XY14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and AlbProCod = ? ORDER BY EmprCod DESC, AlbProCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00XY15", "INSERT INTO TXPALBBAR(BarFasExtD, BarFasExt, GuiFasULin, BarAlbKgmE, BarAlbMtrE, AlbTipCon, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod, AlbProEsp, AlbProRec, TubCod, BarAlbPie, BarAlbTub, BarPreKgm, BarPreMtr, AlbPConPie, BarAlbBul, BarAlbTar, BarAlbFor, BarAlbTip, BarAlbPN, AlbPrdULin, IntCod, BarAlbPbr, ManCod, BarAlbObs, BarAlbExt, BarAlbTin, AlbHdrObs, AlbBarRec, AlbBarDto, AlbHdrUlin, AlbProVal, AlbHdrAnc, CodCod, AlbSer, AlbColNom, AlbColNum, AlbTipCol, AlbPckUlin, AlbEncCli, AlbHdrgm2, TipAcaCod, AlbTipEnt, AlbImpMan, P_ForULin, PlasCod, BarAlbPlas, AlbHdRUl, AlbObsM, BarPreFKg, BarPreFMt, BarPreTKg, BarPreTMt, AlbEncL, AlbEncA, AlbCald, AlbDf1, AlbDf2, AlbDf3, AlbMqTj, AlbDto, AlbSerD, Et_UltNum, BarKgsCli, AlbMetULi, AlbCliCod, BarPreUnd, BarAlbUnd, AlbNomCli, AlbNumcli, AlbTipArt, AlbCadEnc, AlbTiras, AlbTirasKg, AlbSinTest) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPALBBAR")
         ,new UpdateCursor("T00XY16", "UPDATE TXPALBBAR SET BarFasExtD=?, BarFasExt=?, GuiFasULin=?, BarAlbKgmE=?, BarAlbMtrE=?, AlbTipCon=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new UpdateCursor("T00XY17", "DELETE FROM TXPALBBAR  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new ForEachCursor("T00XY18", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbMetLin FROM TXPMETCAL WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XY19", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, Et_Numero FROM TXPEDIETI WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XY20", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XY21", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, P_ForLin FROM TXPALBQUI WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XY22", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPALBEST WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XY23", "SELECT * FROM (SELECT EmprCod, AlbTrnCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPLALBTR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XY24", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPckLin FROM TXPALBPCK WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XY25", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin FROM TXPALBTXT WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XY26", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPrdLin FROM TXPALBPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XY27", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00XY28", "UPDATE TXPALBBAR SET GuiFasULin=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new ForEachCursor("T00XY29", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XY30", "SELECT T1.AlbProCod, T1.GuiFasLin, T1.FasMtr, T1.FasKgm, T2.FasDsc, T1.ArtAdiCod, T1.FasFacMaqC, T1.GuiFasPKg, T1.GuiFasPMt, T1.GuiFasPre, T1.FasPreDsK, T1.FasPreDsM, T1.GuiFasDto, T1.GuiFasRec, T1.GuiFasCCo, T1.GuiFasPBK, T1.GuiFasPBM, T1.GuiFasPB, T1.EmprCod, T1.FasCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM (TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.GuiFasLin = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XY31", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XY32", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00XY33", "INSERT INTO TXPALBFAS(AlbProCod, GuiFasLin, FasMtr, FasKgm, ArtAdiCod, FasFacMaqC, GuiFasPKg, GuiFasPMt, GuiFasPre, FasPreDsK, FasPreDsM, GuiFasDto, GuiFasRec, GuiFasCCo, GuiFasPBK, GuiFasPBM, GuiFasPB, EmprCod, FasCod, BarCod, BarCodReo, BarCodPar, FasCodF, F_TipPza, FasUnd, FasPreUnd, GuiFasFecc, GuiFasUsuc, GuiFasHorc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPALBFAS")
         ,new UpdateCursor("T00XY34", "UPDATE TXPALBFAS SET FasMtr=?, FasKgm=?, ArtAdiCod=?, FasFacMaqC=?, GuiFasPKg=?, GuiFasPMt=?, GuiFasPre=?, FasPreDsK=?, FasPreDsM=?, GuiFasDto=?, GuiFasRec=?, GuiFasCCo=?, GuiFasPBK=?, GuiFasPBM=?, GuiFasPB=?, FasCod=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?", GX_NOMASK, "TXPALBFAS")
         ,new UpdateCursor("T00XY35", "DELETE FROM TXPALBFAS  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?", GX_NOMASK, "TXPALBFAS")
         ,new ForEachCursor("T00XY36", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XY37", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XY38", "SELECT EmprCod, ArtAdiCod, ArtAdiDsc FROM TXPArtAdi WHERE EmprCod = ? ORDER BY ArtAdiDsc ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XY39", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XY40", "SELECT EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XY41", "SELECT DisCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XY42", "SELECT DisEnt FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XY43", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(15,5);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(16,5);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(17,5);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(18, 3);
               ((String[]) buf[29])[0] = rslt.getString(19, 8);
               ((int[]) buf[30])[0] = rslt.getInt(20);
               ((byte[]) buf[31])[0] = rslt.getByte(21);
               ((String[]) buf[32])[0] = rslt.getString(22, 1);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(15,5);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(16,5);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(17,5);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(18, 3);
               ((String[]) buf[29])[0] = rslt.getString(19, 8);
               ((int[]) buf[30])[0] = rslt.getInt(20);
               ((byte[]) buf[31])[0] = rslt.getByte(21);
               ((String[]) buf[32])[0] = rslt.getString(22, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((long[]) buf[12])[0] = rslt.getLong(11);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((long[]) buf[12])[0] = rslt.getLong(11);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[7])[0] = rslt.getString(7, 40);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((byte[]) buf[14])[0] = rslt.getByte(12);
               ((String[]) buf[15])[0] = rslt.getString(13, 1);
               ((long[]) buf[16])[0] = rslt.getLong(14);
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((long[]) buf[4])[0] = rslt.getLong(5);
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
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
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
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 24 :
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
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 28 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 28);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 40);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(16,5);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(17,5);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(18,5);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(19, 3);
               ((String[]) buf[30])[0] = rslt.getString(20, 8);
               ((int[]) buf[31])[0] = rslt.getInt(21);
               ((byte[]) buf[32])[0] = rslt.getByte(22);
               ((String[]) buf[33])[0] = rslt.getString(23, 1);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 39 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
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
               stmt.setString(2, (String)parms[1], 8);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setLong(5, ((Number) parms[4]).longValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 28);
               }
               stmt.setString(2, (String)parms[2], 8);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[7]).shortValue());
               }
               stmt.setString(7, (String)parms[8], 3);
               stmt.setInt(8, ((Number) parms[9]).intValue());
               stmt.setByte(9, ((Number) parms[10]).byteValue());
               stmt.setString(10, (String)parms[11], 1);
               stmt.setLong(11, ((Number) parms[12]).longValue());
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 28);
               }
               stmt.setString(2, (String)parms[2], 8);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[7]).shortValue());
               }
               stmt.setString(7, (String)parms[8], 3);
               stmt.setLong(8, ((Number) parms[9]).longValue());
               stmt.setInt(9, ((Number) parms[10]).intValue());
               stmt.setByte(10, ((Number) parms[11]).byteValue());
               stmt.setString(11, (String)parms[12], 1);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 26 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setLong(5, ((Number) parms[4]).longValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 6);
               }
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 5);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 5);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[13], 40);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[15], 40);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[23], 5);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[25], 5);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[27], 5);
               }
               stmt.setString(18, (String)parms[28], 3);
               stmt.setString(19, (String)parms[29], 8);
               stmt.setInt(20, ((Number) parms[30]).intValue());
               stmt.setByte(21, ((Number) parms[31]).byteValue());
               stmt.setString(22, (String)parms[32], 1);
               return;
            case 32 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 6);
               }
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 5);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 5);
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
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 40);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[13], 40);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[23], 5);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[25], 5);
               }
               stmt.setString(16, (String)parms[26], 8);
               stmt.setString(17, (String)parms[27], 3);
               stmt.setLong(18, ((Number) parms[28]).longValue());
               stmt.setInt(19, ((Number) parms[29]).intValue());
               stmt.setByte(20, ((Number) parms[30]).byteValue());
               stmt.setString(21, (String)parms[31], 1);
               stmt.setShort(22, ((Number) parms[32]).shortValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

