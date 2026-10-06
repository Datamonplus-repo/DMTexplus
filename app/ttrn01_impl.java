package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrn01_impl extends GXDataArea
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
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A758ProCod = httpContext.GetPar( "ProCod") ;
         n758ProCod = false ;
         A212BarSer = httpContext.GetPar( "BarSer") ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         AV32PreMtr = CommonUtil.decimalVal( httpContext.GetPar( "PreMtr"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32PreMtr", GXutil.ltrimstr( AV32PreMtr, 13, 5));
         AV33PreKgm = CommonUtil.decimalVal( httpContext.GetPar( "PreKgm"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33PreKgm", GXutil.ltrimstr( AV33PreKgm, 13, 5));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_11_1KR210( A396EmprCod, A252CliCod, A758ProCod, A212BarSer, AV32PreMtr, AV33PreKgm) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         n758ProCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_19( A396EmprCod, A758ProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_21") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         n758ProCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_21( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Creacion Linea ALBPRD", ""), (short)(0)) ;
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
      nRC_GXsfl_75 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_75"))) ;
      nGXsfl_75_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_75_idx"))) ;
      sGXsfl_75_idx = httpContext.GetPar( "sGXsfl_75_idx") ;
      A1467AlbPrdULin = (short)(GXutil.lval( httpContext.GetPar( "AlbPrdULin"))) ;
      n1467AlbPrdULin = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      A1261BarAlbKgmE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbKgmE"), ".") ;
      A1263BarAlbMtrE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbMtrE"), ".") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public ttrn01_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrn01_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn01_impl.class ));
   }

   public ttrn01_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTrn01.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Numero Albaran Produccion", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "", "", "", "", "", 1, edtAlbProCod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Ultima Linea Procesos", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPrdULin_Internalname, GXutil.ltrim( localUtil.ntoc( A1467AlbPrdULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPrdULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1467AlbPrdULin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1467AlbPrdULin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPrdULin_Jsonclick, 0, "", "", "", "", "", 1, edtAlbPrdULin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Kilos Entregados", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAlbKgmE_Internalname, GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAlbKgmE_Enabled!=0) ? localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99") : localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAlbKgmE_Jsonclick, 0, "", "", "", "", "", 1, edtBarAlbKgmE_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Metros Entregados H. Ruta", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAlbMtrE_Internalname, GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAlbMtrE_Enabled!=0) ? localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99") : localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAlbMtrE_Jsonclick, 0, "", "", "", "", "", 1, edtBarAlbMtrE_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSer_Internalname, GXutil.rtrim( A212BarSer), GXutil.rtrim( localUtil.format( A212BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSer_Jsonclick, 0, "", "", "", "", "", 1, edtBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol75( ) ;
      nGXsfl_75_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount210 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_210 = (short)(1) ;
            scanStart1KR210( ) ;
            while ( RcdFound210 != 0 )
            {
               init_level_properties210( ) ;
               getByPrimaryKey1KR210( ) ;
               addRow1KR210( ) ;
               scanNext1KR210( ) ;
            }
            scanEnd1KR210( ) ;
            nBlankRcdCount210 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B1467AlbPrdULin = A1467AlbPrdULin ;
         n1467AlbPrdULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
         standaloneNotModal1KR210( ) ;
         standaloneModal1KR210( ) ;
         sMode210 = Gx_mode ;
         while ( nGXsfl_75_idx < nRC_GXsfl_75 )
         {
            bGXsfl_75_Refreshing = true ;
            readRow1KR210( ) ;
            edtavnRcdDeleted_210_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_210_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_210_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_210_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtAlbPrdLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPRDLIN_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPrdLin_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROCOD_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRODSC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtAlbPrdPKg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPRDPKG_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPrdPKg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPrdPKg_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtAlbPrdPMt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPRDPMT_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPrdPMt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPrdPMt_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtPrdKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDKGM_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdKgm_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtPrdMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDMTR_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdMtr_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtPrdImp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDIMP_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdImp_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtProPreRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROPREREC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProPreRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProPreRec_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtProPorRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROPORREC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProPorRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProPorRec_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            if ( ( nRcdExists_210 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1KR210( ) ;
            }
            sendRow1KR210( ) ;
            bGXsfl_75_Refreshing = false ;
         }
         Gx_mode = sMode210 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1467AlbPrdULin = B1467AlbPrdULin ;
         n1467AlbPrdULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount210 = (short)(5) ;
         nRcdExists_210 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1KR210( ) ;
            while ( RcdFound210 != 0 )
            {
               sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_75210( ) ;
               init_level_properties210( ) ;
               standaloneNotModal1KR210( ) ;
               getByPrimaryKey1KR210( ) ;
               standaloneModal1KR210( ) ;
               addRow1KR210( ) ;
               scanNext1KR210( ) ;
            }
            scanEnd1KR210( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode210 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_75210( ) ;
      initAll1KR210( ) ;
      init_level_properties210( ) ;
      B1467AlbPrdULin = A1467AlbPrdULin ;
      n1467AlbPrdULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
      nRcdExists_210 = (short)(0) ;
      nIsMod_210 = (short)(0) ;
      nRcdDeleted_210 = (short)(0) ;
      nBlankRcdCount210 = (short)(nBlankRcdUsr210+nBlankRcdCount210) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount210 > 0 )
      {
         standaloneNotModal1KR210( ) ;
         standaloneModal1KR210( ) ;
         addRow1KR210( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtAlbPrdLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount210 = (short)(nBlankRcdCount210-1) ;
      }
      Gx_mode = sMode210 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A1467AlbPrdULin = B1467AlbPrdULin ;
      n1467AlbPrdULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTrn01.htm");
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
      e111KR2 ();
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
            Z1467AlbPrdULin = (short)(localUtil.ctol( httpContext.cgiGet( "Z1467AlbPrdULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( "Z1261BarAlbKgmE")) ;
            Z1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( "Z1263BarAlbMtrE")) ;
            O1467AlbPrdULin = (short)(localUtil.ctol( httpContext.cgiGet( "O1467AlbPrdULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_75 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_75"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV35Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33PreKgm = localUtil.ctond( httpContext.cgiGet( "vPREKGM")) ;
            AV32PreMtr = localUtil.ctond( httpContext.cgiGet( "vPREMTR")) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A1467AlbPrdULin = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbPrdULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1467AlbPrdULin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
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
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
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
                        e111KR2 ();
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
            initAll1KR195( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_210_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_210_Enabled), 5, 0), !bGXsfl_75_Refreshing);
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
      disableAttributes1KR195( ) ;
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

   public void confirm_1KR0( )
   {
      beforeValidate1KR195( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1KR195( ) ;
         }
         else
         {
            checkExtendedTable1KR195( ) ;
            if ( AnyError == 0 )
            {
               zm1KR195( 15) ;
               zm1KR195( 16) ;
               zm1KR195( 17) ;
            }
            closeExtendedTableCursors1KR195( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode195 = Gx_mode ;
         confirm_1KR210( ) ;
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
         confirmValues1KR0( ) ;
      }
   }

   public void confirm_1KR210( )
   {
      s1467AlbPrdULin = O1467AlbPrdULin ;
      n1467AlbPrdULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
      nGXsfl_75_idx = 0 ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         readRow1KR210( ) ;
         if ( ( nRcdExists_210 != 0 ) || ( nIsMod_210 != 0 ) )
         {
            getKey1KR210( ) ;
            if ( ( nRcdExists_210 == 0 ) && ( nRcdDeleted_210 == 0 ) )
            {
               if ( RcdFound210 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1KR210( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1KR210( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1KR210( 19) ;
                        zm1KR210( 20) ;
                        zm1KR210( 21) ;
                     }
                     closeExtendedTableCursors1KR210( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O1467AlbPrdULin = A1467AlbPrdULin ;
                     n1467AlbPrdULin = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "ALBPRDLIN_" + sGXsfl_75_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbPrdLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound210 != 0 )
               {
                  if ( nRcdDeleted_210 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1KR210( ) ;
                     load1KR210( ) ;
                     beforeValidate1KR210( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1KR210( ) ;
                        O1467AlbPrdULin = A1467AlbPrdULin ;
                        n1467AlbPrdULin = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_210 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1KR210( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1KR210( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1KR210( 19) ;
                              zm1KR210( 20) ;
                              zm1KR210( 21) ;
                           }
                           closeExtendedTableCursors1KR210( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O1467AlbPrdULin = A1467AlbPrdULin ;
                           n1467AlbPrdULin = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_210 == 0 )
                  {
                     GXCCtl = "ALBPRDLIN_" + sGXsfl_75_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbPrdLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_210_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_210, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1468AlbPrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProCod_Internalname, GXutil.rtrim( A758ProCod)) ;
         httpContext.changePostValue( edtProDsc_Internalname, GXutil.rtrim( A759ProDsc)) ;
         httpContext.changePostValue( edtAlbPrdPKg_Internalname, GXutil.ltrim( localUtil.ntoc( A1469AlbPrdPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPrdPMt_Internalname, GXutil.ltrim( localUtil.ntoc( A1470AlbPrdPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A1471PrdKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1472PrdMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdImp_Internalname, GXutil.ltrim( localUtil.ntoc( A1473PrdImp, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProPreRec_Internalname, GXutil.ltrim( localUtil.ntoc( A4332ProPreRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProPorRec_Internalname, GXutil.ltrim( localUtil.ntoc( A4333ProPorRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1468AlbPrdLin_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z1468AlbPrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1469AlbPrdPKg_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z1469AlbPrdPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1470AlbPrdPMt_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z1470AlbPrdPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1471PrdKgm_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z1471PrdKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1472PrdMtr_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z1472PrdMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4332ProPreRec_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4332ProPreRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4333ProPorRec_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4333ProPorRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z758ProCod_"+sGXsfl_75_idx, GXutil.rtrim( Z758ProCod)) ;
         httpContext.changePostValue( "nRcdDeleted_210_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_210, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_210_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_210, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_210_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_210, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_210 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_210_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_210_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPRDLIN_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPrdLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROCOD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRODSC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPRDPKG_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPrdPKg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPRDPMT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPrdPMt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDKGM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDMTR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDIMP_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdImp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROPREREC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProPreRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROPORREC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProPorRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O1467AlbPrdULin = s1467AlbPrdULin ;
      n1467AlbPrdULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1KR0( )
   {
   }

   public void e111KR2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttrn01_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV35Pgmname, (byte)(99), GXv_char2) ;
      ttrn01_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttrn01_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttrn01_impl.this.A396EmprCod = GXv_char2[0] ;
      ttrn01_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttrn01_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1KR195( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1467AlbPrdULin = T01KR8_A1467AlbPrdULin[0] ;
            Z1261BarAlbKgmE = T01KR8_A1261BarAlbKgmE[0] ;
            Z1263BarAlbMtrE = T01KR8_A1263BarAlbMtrE[0] ;
         }
         else
         {
            Z1467AlbPrdULin = A1467AlbPrdULin ;
            Z1261BarAlbKgmE = A1261BarAlbKgmE ;
            Z1263BarAlbMtrE = A1263BarAlbMtrE ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z1467AlbPrdULin = A1467AlbPrdULin ;
         Z1261BarAlbKgmE = A1261BarAlbKgmE ;
         Z1263BarAlbMtrE = A1263BarAlbMtrE ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z30AlbProCod = A30AlbProCod ;
         Z407EmprNom = A407EmprNom ;
         Z212BarSer = A212BarSer ;
         Z252CliCod = A252CliCod ;
      }
   }

   public void standaloneNotModal( )
   {
      edtAlbPrdULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPrdULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPrdULin_Enabled), 5, 0), true);
      AV35Pgmname = "TTrn01" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmname", AV35Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtAlbPrdULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPrdULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPrdULin_Enabled), 5, 0), true);
      /* Using cursor T01KR9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01KR9_A407EmprNom[0] ;
      n407EmprNom = T01KR9_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(7);
      /* Using cursor T01KR10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(8);
      /* Using cursor T01KR5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A252CliCod = T01KR5_A252CliCod[0] ;
      n252CliCod = T01KR5_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A212BarSer = T01KR5_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      pr_default.close(3);
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

   public void load1KR195( )
   {
      /* Using cursor T01KR11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound195 = (short)(1) ;
         A407EmprNom = T01KR11_A407EmprNom[0] ;
         n407EmprNom = T01KR11_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A1467AlbPrdULin = T01KR11_A1467AlbPrdULin[0] ;
         n1467AlbPrdULin = T01KR11_n1467AlbPrdULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
         A1261BarAlbKgmE = T01KR11_A1261BarAlbKgmE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
         A1263BarAlbMtrE = T01KR11_A1263BarAlbMtrE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
         A212BarSer = T01KR11_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A252CliCod = T01KR11_A252CliCod[0] ;
         n252CliCod = T01KR11_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         zm1KR195( -14) ;
      }
      pr_default.close(9);
      onLoadActions1KR195( ) ;
   }

   public void onLoadActions1KR195( )
   {
   }

   public void checkExtendedTable1KR195( )
   {
      nIsDirty_195 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1KR195( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1KR195( )
   {
      /* Using cursor T01KR12 */
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
      /* Using cursor T01KR8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(T01KR8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01KR8_A129BarCod[0] == A129BarCod ) && ( T01KR8_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01KR8_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01KR8_A30AlbProCod[0] == A30AlbProCod ) )
      {
         zm1KR195( 14) ;
         RcdFound195 = (short)(1) ;
         A1467AlbPrdULin = T01KR8_A1467AlbPrdULin[0] ;
         n1467AlbPrdULin = T01KR8_n1467AlbPrdULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
         A1261BarAlbKgmE = T01KR8_A1261BarAlbKgmE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
         A1263BarAlbMtrE = T01KR8_A1263BarAlbMtrE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
         O1467AlbPrdULin = A1467AlbPrdULin ;
         n1467AlbPrdULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode195 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1KR195( ) ;
         if ( AnyError == 1 )
         {
            RcdFound195 = (short)(0) ;
            initializeNonKey1KR195( ) ;
         }
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound195 = (short)(0) ;
         initializeNonKey1KR195( ) ;
         sMode195 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey1KR195( ) ;
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
      /* Using cursor T01KR13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T01KR13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01KR13_A129BarCod[0] == A129BarCod ) && ( T01KR13_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01KR13_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01KR13_A30AlbProCod[0] == A30AlbProCod ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T01KR13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01KR13_A129BarCod[0] == A129BarCod ) && ( T01KR13_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01KR13_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01KR13_A30AlbProCod[0] == A30AlbProCod ) )
         {
            RcdFound195 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound195 = (short)(0) ;
      /* Using cursor T01KR14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T01KR14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01KR14_A129BarCod[0] == A129BarCod ) && ( T01KR14_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01KR14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01KR14_A30AlbProCod[0] == A30AlbProCod ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T01KR14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01KR14_A129BarCod[0] == A129BarCod ) && ( T01KR14_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01KR14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01KR14_A30AlbProCod[0] == A30AlbProCod ) )
         {
            RcdFound195 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1KR195( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A1467AlbPrdULin = O1467AlbPrdULin ;
         n1467AlbPrdULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
         GX_FocusControl = edtBarAlbKgmE_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1KR195( ) ;
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
               A1467AlbPrdULin = O1467AlbPrdULin ;
               n1467AlbPrdULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
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
               A1467AlbPrdULin = O1467AlbPrdULin ;
               n1467AlbPrdULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
               update1KR195( ) ;
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
               A1467AlbPrdULin = O1467AlbPrdULin ;
               n1467AlbPrdULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
               GX_FocusControl = edtBarAlbKgmE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1KR195( ) ;
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
                  A1467AlbPrdULin = O1467AlbPrdULin ;
                  n1467AlbPrdULin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
                  GX_FocusControl = edtBarAlbKgmE_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1KR195( ) ;
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
         A1467AlbPrdULin = O1467AlbPrdULin ;
         n1467AlbPrdULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
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
      getKey1KR195( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn01");
      GX_FocusControl = edtBarAlbKgmE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1KR0( ) ;
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
      scanStart1KR195( ) ;
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
      scanEnd1KR195( ) ;
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
      scanStart1KR195( ) ;
      if ( RcdFound195 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound195 != 0 )
         {
            scanNext1KR195( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarAlbKgmE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1KR195( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1KR195( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01KR7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) || ( Z1467AlbPrdULin != T01KR7_A1467AlbPrdULin[0] ) || ( DecimalUtil.compareTo(Z1261BarAlbKgmE, T01KR7_A1261BarAlbKgmE[0]) != 0 ) || ( DecimalUtil.compareTo(Z1263BarAlbMtrE, T01KR7_A1263BarAlbMtrE[0]) != 0 ) )
         {
            if ( Z1467AlbPrdULin != T01KR7_A1467AlbPrdULin[0] )
            {
               GXutil.writeLogln("ttrn01:[seudo value changed for attri]"+"AlbPrdULin");
               GXutil.writeLogRaw("Old: ",Z1467AlbPrdULin);
               GXutil.writeLogRaw("Current: ",T01KR7_A1467AlbPrdULin[0]);
            }
            if ( DecimalUtil.compareTo(Z1261BarAlbKgmE, T01KR7_A1261BarAlbKgmE[0]) != 0 )
            {
               GXutil.writeLogln("ttrn01:[seudo value changed for attri]"+"BarAlbKgmE");
               GXutil.writeLogRaw("Old: ",Z1261BarAlbKgmE);
               GXutil.writeLogRaw("Current: ",T01KR7_A1261BarAlbKgmE[0]);
            }
            if ( DecimalUtil.compareTo(Z1263BarAlbMtrE, T01KR7_A1263BarAlbMtrE[0]) != 0 )
            {
               GXutil.writeLogln("ttrn01:[seudo value changed for attri]"+"BarAlbMtrE");
               GXutil.writeLogRaw("Old: ",Z1263BarAlbMtrE);
               GXutil.writeLogRaw("Current: ",T01KR7_A1263BarAlbMtrE[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBBAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1KR195( )
   {
      beforeValidate1KR195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KR195( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1KR195( 0) ;
         checkOptimisticConcurrency1KR195( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KR195( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1KR195( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KR15 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n1467AlbPrdULin), Short.valueOf(A1467AlbPrdULin), A1261BarAlbKgmE, A1263BarAlbMtrE, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
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
                        processLevel1KR195( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1KR0( ) ;
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
            load1KR195( ) ;
         }
         endLevel1KR195( ) ;
      }
      closeExtendedTableCursors1KR195( ) ;
   }

   public void update1KR195( )
   {
      beforeValidate1KR195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KR195( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KR195( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KR195( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1KR195( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KR16 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n1467AlbPrdULin), Short.valueOf(A1467AlbPrdULin), A1261BarAlbKgmE, A1263BarAlbMtrE, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1KR195( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1KR195( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1KR0( ) ;
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
         endLevel1KR195( ) ;
      }
      closeExtendedTableCursors1KR195( ) ;
   }

   public void deferredUpdate1KR195( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1KR195( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KR195( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1KR195( ) ;
         afterConfirm1KR195( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1KR195( ) ;
            if ( AnyError == 0 )
            {
               A1467AlbPrdULin = O1467AlbPrdULin ;
               n1467AlbPrdULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
               scanStart1KR210( ) ;
               while ( RcdFound210 != 0 )
               {
                  getByPrimaryKey1KR210( ) ;
                  delete1KR210( ) ;
                  scanNext1KR210( ) ;
                  O1467AlbPrdULin = A1467AlbPrdULin ;
                  n1467AlbPrdULin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
               }
               scanEnd1KR210( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KR17 */
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
                           initAll1KR195( ) ;
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
                        resetCaption1KR0( ) ;
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
      endLevel1KR195( ) ;
      Gx_mode = sMode195 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1KR195( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01KR18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "METCAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01KR19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EDIETI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01KR20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREPg", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01KR21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01KR22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBEST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01KR23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALBTRA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01KR24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBPCK", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01KR25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01KR26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01KR27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
      }
   }

   public void processNestedLevel1KR210( )
   {
      s1467AlbPrdULin = O1467AlbPrdULin ;
      n1467AlbPrdULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
      nGXsfl_75_idx = 0 ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         readRow1KR210( ) ;
         if ( ( nRcdExists_210 != 0 ) || ( nIsMod_210 != 0 ) )
         {
            standaloneNotModal1KR210( ) ;
            getKey1KR210( ) ;
            if ( ( nRcdExists_210 == 0 ) && ( nRcdDeleted_210 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1KR210( ) ;
            }
            else
            {
               if ( RcdFound210 != 0 )
               {
                  if ( ( nRcdDeleted_210 != 0 ) && ( nRcdExists_210 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1KR210( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_210 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1KR210( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_210 == 0 )
                  {
                     GXCCtl = "ALBPRDLIN_" + sGXsfl_75_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbPrdLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O1467AlbPrdULin = A1467AlbPrdULin ;
            n1467AlbPrdULin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_210_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_210, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1468AlbPrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProCod_Internalname, GXutil.rtrim( A758ProCod)) ;
         httpContext.changePostValue( edtProDsc_Internalname, GXutil.rtrim( A759ProDsc)) ;
         httpContext.changePostValue( edtAlbPrdPKg_Internalname, GXutil.ltrim( localUtil.ntoc( A1469AlbPrdPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPrdPMt_Internalname, GXutil.ltrim( localUtil.ntoc( A1470AlbPrdPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A1471PrdKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1472PrdMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdImp_Internalname, GXutil.ltrim( localUtil.ntoc( A1473PrdImp, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProPreRec_Internalname, GXutil.ltrim( localUtil.ntoc( A4332ProPreRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProPorRec_Internalname, GXutil.ltrim( localUtil.ntoc( A4333ProPorRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1468AlbPrdLin_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z1468AlbPrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1469AlbPrdPKg_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z1469AlbPrdPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1470AlbPrdPMt_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z1470AlbPrdPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1471PrdKgm_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z1471PrdKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1472PrdMtr_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z1472PrdMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4332ProPreRec_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4332ProPreRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4333ProPorRec_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4333ProPorRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z758ProCod_"+sGXsfl_75_idx, GXutil.rtrim( Z758ProCod)) ;
         httpContext.changePostValue( "nRcdDeleted_210_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_210, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_210_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_210, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_210_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_210, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_210 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_210_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_210_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPRDLIN_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPrdLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROCOD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRODSC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPRDPKG_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPrdPKg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPRDPMT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPrdPMt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDKGM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDMTR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDIMP_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdImp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROPREREC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProPreRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROPORREC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProPorRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1KR210( ) ;
      if ( AnyError != 0 )
      {
         O1467AlbPrdULin = s1467AlbPrdULin ;
         n1467AlbPrdULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
      }
      nRcdExists_210 = (short)(0) ;
      nIsMod_210 = (short)(0) ;
      nRcdDeleted_210 = (short)(0) ;
   }

   public void processLevel1KR195( )
   {
      /* Save parent mode. */
      sMode195 = Gx_mode ;
      processNestedLevel1KR210( ) ;
      if ( AnyError != 0 )
      {
         O1467AlbPrdULin = s1467AlbPrdULin ;
         n1467AlbPrdULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode195 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01KR28 */
      pr_default.execute(26, new Object[] {Boolean.valueOf(n1467AlbPrdULin), Short.valueOf(A1467AlbPrdULin), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
   }

   public void endLevel1KR195( )
   {
      pr_default.close(5);
      if ( AnyError == 0 )
      {
         beforeComplete1KR195( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrn01");
         if ( AnyError == 0 )
         {
            confirmValues1KR0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn01");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1KR195( )
   {
      /* Scan By routine */
      /* Using cursor T01KR29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
      RcdFound195 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound195 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1KR195( )
   {
      /* Scan next routine */
      pr_default.readNext(27);
      RcdFound195 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound195 = (short)(1) ;
      }
   }

   public void scanEnd1KR195( )
   {
      pr_default.close(27);
   }

   public void afterConfirm1KR195( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1KR195( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1KR195( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1KR195( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1KR195( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1KR195( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1KR195( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtAlbPrdULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPrdULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPrdULin_Enabled), 5, 0), true);
      edtBarAlbKgmE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbKgmE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbKgmE_Enabled), 5, 0), true);
      edtBarAlbMtrE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbMtrE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbMtrE_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
   }

   public void zm1KR210( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1469AlbPrdPKg = T01KR3_A1469AlbPrdPKg[0] ;
            Z1470AlbPrdPMt = T01KR3_A1470AlbPrdPMt[0] ;
            Z1471PrdKgm = T01KR3_A1471PrdKgm[0] ;
            Z1472PrdMtr = T01KR3_A1472PrdMtr[0] ;
            Z4332ProPreRec = T01KR3_A4332ProPreRec[0] ;
            Z4333ProPorRec = T01KR3_A4333ProPorRec[0] ;
            Z758ProCod = T01KR3_A758ProCod[0] ;
         }
         else
         {
            Z1469AlbPrdPKg = A1469AlbPrdPKg ;
            Z1470AlbPrdPMt = A1470AlbPrdPMt ;
            Z1471PrdKgm = A1471PrdKgm ;
            Z1472PrdMtr = A1472PrdMtr ;
            Z4332ProPreRec = A4332ProPreRec ;
            Z4333ProPorRec = A4333ProPorRec ;
            Z758ProCod = A758ProCod ;
         }
      }
      if ( GX_JID == -18 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z1468AlbPrdLin = A1468AlbPrdLin ;
         Z1469AlbPrdPKg = A1469AlbPrdPKg ;
         Z1470AlbPrdPMt = A1470AlbPrdPMt ;
         Z1471PrdKgm = A1471PrdKgm ;
         Z1472PrdMtr = A1472PrdMtr ;
         Z4332ProPreRec = A4332ProPreRec ;
         Z4333ProPorRec = A4333ProPorRec ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z252CliCod = A252CliCod ;
         Z759ProDsc = A759ProDsc ;
      }
   }

   public void standaloneNotModal1KR210( )
   {
      edtAlbPrdULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPrdULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPrdULin_Enabled), 5, 0), true);
      edtAlbPrdULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPrdULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPrdULin_Enabled), 5, 0), true);
      /* Using cursor T01KR30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A252CliCod = T01KR30_A252CliCod[0] ;
      n252CliCod = T01KR30_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(28);
   }

   public void standaloneModal1KR210( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Función incorrecta. Pulsar F3 para borrar Proceso", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  )
      {
         A1467AlbPrdULin = (short)(O1467AlbPrdULin+1) ;
         n1467AlbPrdULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A1468AlbPrdLin = A1467AlbPrdULin ;
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1471PrdKgm)==0) && ( Gx_BScreen == 0 ) )
      {
         A1471PrdKgm = A1261BarAlbKgmE ;
         n1471PrdKgm = false ;
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1472PrdMtr)==0) && ( Gx_BScreen == 0 ) )
      {
         A1472PrdMtr = A1263BarAlbMtrE ;
         n1472PrdMtr = false ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbPrdLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbPrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPrdLin_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
      else
      {
         edtAlbPrdLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbPrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPrdLin_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
   }

   public void load1KR210( )
   {
      /* Using cursor T01KR31 */
      pr_default.execute(29, new Object[] {Long.valueOf(A30AlbProCod), Short.valueOf(A1468AlbPrdLin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound210 = (short)(1) ;
         A252CliCod = T01KR31_A252CliCod[0] ;
         n252CliCod = T01KR31_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1469AlbPrdPKg = T01KR31_A1469AlbPrdPKg[0] ;
         n1469AlbPrdPKg = T01KR31_n1469AlbPrdPKg[0] ;
         A1470AlbPrdPMt = T01KR31_A1470AlbPrdPMt[0] ;
         n1470AlbPrdPMt = T01KR31_n1470AlbPrdPMt[0] ;
         A1471PrdKgm = T01KR31_A1471PrdKgm[0] ;
         n1471PrdKgm = T01KR31_n1471PrdKgm[0] ;
         A1472PrdMtr = T01KR31_A1472PrdMtr[0] ;
         n1472PrdMtr = T01KR31_n1472PrdMtr[0] ;
         A759ProDsc = T01KR31_A759ProDsc[0] ;
         A4332ProPreRec = T01KR31_A4332ProPreRec[0] ;
         n4332ProPreRec = T01KR31_n4332ProPreRec[0] ;
         A4333ProPorRec = T01KR31_A4333ProPorRec[0] ;
         n4333ProPorRec = T01KR31_n4333ProPorRec[0] ;
         A758ProCod = T01KR31_A758ProCod[0] ;
         n758ProCod = T01KR31_n758ProCod[0] ;
         zm1KR210( -18) ;
      }
      pr_default.close(29);
      onLoadActions1KR210( ) ;
   }

   public void onLoadActions1KR210( )
   {
      A1473PrdImp = (A1470AlbPrdPMt.multiply(A1472PrdMtr)).add((A1469AlbPrdPKg.multiply(A1471PrdKgm))) ;
   }

   public void checkExtendedTable1KR210( )
   {
      nIsDirty_210 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1KR210( ) ;
      /* Using cursor T01KR4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PROCOD_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01KR4_A759ProDsc[0] ;
      pr_default.close(2);
      /* Using cursor T01KR6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         GXCCtl = "PROCOD_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(4);
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A252CliCod ;
         GXv_char3[0] = A758ProCod ;
         GXv_char2[0] = A212BarSer ;
         GXv_int6[0] = (byte)(99) ;
         GXv_decimal7[0] = AV32PreMtr ;
         GXv_decimal8[0] = AV33PreKgm ;
         new app.pclipro2(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_char2, GXv_int6, GXv_decimal7, GXv_decimal8) ;
         ttrn01_impl.this.A396EmprCod = GXv_char4[0] ;
         ttrn01_impl.this.A252CliCod = GXv_int5[0] ;
         ttrn01_impl.this.A758ProCod = GXv_char3[0] ;
         ttrn01_impl.this.A212BarSer = GXv_char2[0] ;
         ttrn01_impl.this.AV32PreMtr = GXv_decimal7[0] ;
         ttrn01_impl.this.AV33PreKgm = GXv_decimal8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         httpContext.ajax_rsp_assign_attri("", false, "AV32PreMtr", GXutil.ltrimstr( AV32PreMtr, 13, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV33PreKgm", GXutil.ltrimstr( AV33PreKgm, 13, 5));
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1471PrdKgm)==0) && true /* After */ )
      {
         GXCCtl = "PROCOD_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Este Proceso no tiene precio Kilo", ""), 0, GXCCtl);
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1471PrdKgm)==0) && true /* After */ )
      {
         GXCCtl = "PROCOD_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Este Proceso no tiene precio Metro", ""), 0, GXCCtl);
      }
      nIsDirty_210 = (short)(1) ;
      A1473PrdImp = (A1470AlbPrdPMt.multiply(A1472PrdMtr)).add((A1469AlbPrdPKg.multiply(A1471PrdKgm))) ;
   }

   public void closeExtendedTableCursors1KR210( )
   {
      pr_default.close(2);
      pr_default.close(4);
   }

   public void enableDisable1KR210( )
   {
   }

   public void gxload_19( String A396EmprCod ,
                          String A758ProCod )
   {
      /* Using cursor T01KR32 */
      pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(30) == 101) )
      {
         GXCCtl = "PROCOD_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01KR32_A759ProDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A759ProDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(30) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(30);
   }

   public void gxload_21( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar ,
                          String A758ProCod )
   {
      /* Using cursor T01KR33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(31) == 101) )
      {
         GXCCtl = "PROCOD_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(31) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(31);
   }

   public void getKey1KR210( )
   {
      /* Using cursor T01KR34 */
      pr_default.execute(32, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1468AlbPrdLin)});
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound210 = (short)(1) ;
      }
      else
      {
         RcdFound210 = (short)(0) ;
      }
      pr_default.close(32);
   }

   public void getByPrimaryKey1KR210( )
   {
      /* Using cursor T01KR3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1468AlbPrdLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T01KR3_A30AlbProCod[0] == A30AlbProCod ) && ( GXutil.strcmp(T01KR3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01KR3_A129BarCod[0] == A129BarCod ) && ( T01KR3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01KR3_A130BarCodPar[0], A130BarCodPar) == 0 ) )
      {
         zm1KR210( 18) ;
         RcdFound210 = (short)(1) ;
         initializeNonKey1KR210( ) ;
         A1468AlbPrdLin = T01KR3_A1468AlbPrdLin[0] ;
         A1469AlbPrdPKg = T01KR3_A1469AlbPrdPKg[0] ;
         n1469AlbPrdPKg = T01KR3_n1469AlbPrdPKg[0] ;
         A1470AlbPrdPMt = T01KR3_A1470AlbPrdPMt[0] ;
         n1470AlbPrdPMt = T01KR3_n1470AlbPrdPMt[0] ;
         A1471PrdKgm = T01KR3_A1471PrdKgm[0] ;
         n1471PrdKgm = T01KR3_n1471PrdKgm[0] ;
         A1472PrdMtr = T01KR3_A1472PrdMtr[0] ;
         n1472PrdMtr = T01KR3_n1472PrdMtr[0] ;
         A4332ProPreRec = T01KR3_A4332ProPreRec[0] ;
         n4332ProPreRec = T01KR3_n4332ProPreRec[0] ;
         A4333ProPorRec = T01KR3_A4333ProPorRec[0] ;
         n4333ProPorRec = T01KR3_n4333ProPorRec[0] ;
         A758ProCod = T01KR3_A758ProCod[0] ;
         n758ProCod = T01KR3_n758ProCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z1468AlbPrdLin = A1468AlbPrdLin ;
         sMode210 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1KR210( ) ;
         load1KR210( ) ;
         Gx_mode = sMode210 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound210 = (short)(0) ;
         initializeNonKey1KR210( ) ;
         sMode210 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1KR210( ) ;
         Gx_mode = sMode210 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1KR210( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1KR210( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01KR2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1468AlbPrdLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBPRD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z1469AlbPrdPKg, T01KR2_A1469AlbPrdPKg[0]) != 0 ) || ( DecimalUtil.compareTo(Z1470AlbPrdPMt, T01KR2_A1470AlbPrdPMt[0]) != 0 ) || ( DecimalUtil.compareTo(Z1471PrdKgm, T01KR2_A1471PrdKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z1472PrdMtr, T01KR2_A1472PrdMtr[0]) != 0 ) || ( DecimalUtil.compareTo(Z4332ProPreRec, T01KR2_A4332ProPreRec[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z4333ProPorRec, T01KR2_A4333ProPorRec[0]) != 0 ) || ( GXutil.strcmp(Z758ProCod, T01KR2_A758ProCod[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z1469AlbPrdPKg, T01KR2_A1469AlbPrdPKg[0]) != 0 )
            {
               GXutil.writeLogln("ttrn01:[seudo value changed for attri]"+"AlbPrdPKg");
               GXutil.writeLogRaw("Old: ",Z1469AlbPrdPKg);
               GXutil.writeLogRaw("Current: ",T01KR2_A1469AlbPrdPKg[0]);
            }
            if ( DecimalUtil.compareTo(Z1470AlbPrdPMt, T01KR2_A1470AlbPrdPMt[0]) != 0 )
            {
               GXutil.writeLogln("ttrn01:[seudo value changed for attri]"+"AlbPrdPMt");
               GXutil.writeLogRaw("Old: ",Z1470AlbPrdPMt);
               GXutil.writeLogRaw("Current: ",T01KR2_A1470AlbPrdPMt[0]);
            }
            if ( DecimalUtil.compareTo(Z1471PrdKgm, T01KR2_A1471PrdKgm[0]) != 0 )
            {
               GXutil.writeLogln("ttrn01:[seudo value changed for attri]"+"PrdKgm");
               GXutil.writeLogRaw("Old: ",Z1471PrdKgm);
               GXutil.writeLogRaw("Current: ",T01KR2_A1471PrdKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z1472PrdMtr, T01KR2_A1472PrdMtr[0]) != 0 )
            {
               GXutil.writeLogln("ttrn01:[seudo value changed for attri]"+"PrdMtr");
               GXutil.writeLogRaw("Old: ",Z1472PrdMtr);
               GXutil.writeLogRaw("Current: ",T01KR2_A1472PrdMtr[0]);
            }
            if ( DecimalUtil.compareTo(Z4332ProPreRec, T01KR2_A4332ProPreRec[0]) != 0 )
            {
               GXutil.writeLogln("ttrn01:[seudo value changed for attri]"+"ProPreRec");
               GXutil.writeLogRaw("Old: ",Z4332ProPreRec);
               GXutil.writeLogRaw("Current: ",T01KR2_A4332ProPreRec[0]);
            }
            if ( DecimalUtil.compareTo(Z4333ProPorRec, T01KR2_A4333ProPorRec[0]) != 0 )
            {
               GXutil.writeLogln("ttrn01:[seudo value changed for attri]"+"ProPorRec");
               GXutil.writeLogRaw("Old: ",Z4333ProPorRec);
               GXutil.writeLogRaw("Current: ",T01KR2_A4333ProPorRec[0]);
            }
            if ( GXutil.strcmp(Z758ProCod, T01KR2_A758ProCod[0]) != 0 )
            {
               GXutil.writeLogln("ttrn01:[seudo value changed for attri]"+"ProCod");
               GXutil.writeLogRaw("Old: ",Z758ProCod);
               GXutil.writeLogRaw("Current: ",T01KR2_A758ProCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBPRD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1KR210( )
   {
      beforeValidate1KR210( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KR210( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1KR210( 0) ;
         checkOptimisticConcurrency1KR210( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KR210( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1KR210( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KR35 */
                  pr_default.execute(33, new Object[] {Long.valueOf(A30AlbProCod), Short.valueOf(A1468AlbPrdLin), Boolean.valueOf(n1469AlbPrdPKg), A1469AlbPrdPKg, Boolean.valueOf(n1470AlbPrdPMt), A1470AlbPrdPMt, Boolean.valueOf(n1471PrdKgm), A1471PrdKgm, Boolean.valueOf(n1472PrdMtr), A1472PrdMtr, Boolean.valueOf(n4332ProPreRec), A4332ProPreRec, Boolean.valueOf(n4333ProPorRec), A4333ProPorRec, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBPRD");
                  if ( (pr_default.getStatus(33) == 1) )
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
            load1KR210( ) ;
         }
         endLevel1KR210( ) ;
      }
      closeExtendedTableCursors1KR210( ) ;
   }

   public void update1KR210( )
   {
      beforeValidate1KR210( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KR210( ) ;
      }
      if ( ( nIsMod_210 != 0 ) || ( nIsDirty_210 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1KR210( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1KR210( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1KR210( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01KR36 */
                     pr_default.execute(34, new Object[] {Boolean.valueOf(n1469AlbPrdPKg), A1469AlbPrdPKg, Boolean.valueOf(n1470AlbPrdPMt), A1470AlbPrdPMt, Boolean.valueOf(n1471PrdKgm), A1471PrdKgm, Boolean.valueOf(n1472PrdMtr), A1472PrdMtr, Boolean.valueOf(n4332ProPreRec), A4332ProPreRec, Boolean.valueOf(n4333ProPorRec), A4333ProPorRec, Boolean.valueOf(n758ProCod), A758ProCod, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1468AlbPrdLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBPRD");
                     if ( (pr_default.getStatus(34) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBPRD"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1KR210( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1KR210( ) ;
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
            endLevel1KR210( ) ;
         }
      }
      closeExtendedTableCursors1KR210( ) ;
   }

   public void deferredUpdate1KR210( )
   {
   }

   public void delete1KR210( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1KR210( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KR210( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1KR210( ) ;
         afterConfirm1KR210( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1KR210( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01KR37 */
               pr_default.execute(35, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1468AlbPrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBPRD");
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
      sMode210 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1KR210( ) ;
      Gx_mode = sMode210 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1KR210( )
   {
      standaloneModal1KR210( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01KR38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
         A759ProDsc = T01KR38_A759ProDsc[0] ;
         pr_default.close(36);
         A1473PrdImp = (A1470AlbPrdPMt.multiply(A1472PrdMtr)).add((A1469AlbPrdPKg.multiply(A1471PrdKgm))) ;
      }
   }

   public void endLevel1KR210( )
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

   public void scanStart1KR210( )
   {
      /* Scan By routine */
      /* Using cursor T01KR39 */
      pr_default.execute(37, new Object[] {Long.valueOf(A30AlbProCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound210 = (short)(0) ;
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound210 = (short)(1) ;
         A1468AlbPrdLin = T01KR39_A1468AlbPrdLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1KR210( )
   {
      /* Scan next routine */
      pr_default.readNext(37);
      RcdFound210 = (short)(0) ;
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound210 = (short)(1) ;
         A1468AlbPrdLin = T01KR39_A1468AlbPrdLin[0] ;
      }
   }

   public void scanEnd1KR210( )
   {
      pr_default.close(37);
   }

   public void afterConfirm1KR210( )
   {
      /* After Confirm Rules */
      if ( true /* After */ && isIns( )  && true /* Level */ )
      {
         A1469AlbPrdPKg = AV33PreKgm ;
         n1469AlbPrdPKg = false ;
      }
      if ( true /* After */ && isIns( )  && true /* Level */ )
      {
         A1470AlbPrdPMt = AV32PreMtr ;
         n1470AlbPrdPMt = false ;
      }
   }

   public void beforeInsert1KR210( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1KR210( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1KR210( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1KR210( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1KR210( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1KR210( )
   {
      edtAlbPrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPrdLin_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtAlbPrdPKg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPrdPKg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPrdPKg_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtAlbPrdPMt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPrdPMt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPrdPMt_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtPrdKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdKgm_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtPrdMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdMtr_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtPrdImp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdImp_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtProPreRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProPreRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProPreRec_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtProPorRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProPorRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProPorRec_Enabled), 5, 0), !bGXsfl_75_Refreshing);
   }

   public void send_integrity_lvl_hashes1KR210( )
   {
   }

   public void send_integrity_lvl_hashes1KR195( )
   {
   }

   public void subsflControlProps_75210( )
   {
      edtavnRcdDeleted_210_Internalname = "vNRCDDELETED_210_"+sGXsfl_75_idx ;
      edtAlbPrdLin_Internalname = "ALBPRDLIN_"+sGXsfl_75_idx ;
      edtProCod_Internalname = "PROCOD_"+sGXsfl_75_idx ;
      edtProDsc_Internalname = "PRODSC_"+sGXsfl_75_idx ;
      edtAlbPrdPKg_Internalname = "ALBPRDPKG_"+sGXsfl_75_idx ;
      edtAlbPrdPMt_Internalname = "ALBPRDPMT_"+sGXsfl_75_idx ;
      edtPrdKgm_Internalname = "PRDKGM_"+sGXsfl_75_idx ;
      edtPrdMtr_Internalname = "PRDMTR_"+sGXsfl_75_idx ;
      edtPrdImp_Internalname = "PRDIMP_"+sGXsfl_75_idx ;
      edtProPreRec_Internalname = "PROPREREC_"+sGXsfl_75_idx ;
      edtProPorRec_Internalname = "PROPORREC_"+sGXsfl_75_idx ;
   }

   public void subsflControlProps_fel_75210( )
   {
      edtavnRcdDeleted_210_Internalname = "vNRCDDELETED_210_"+sGXsfl_75_fel_idx ;
      edtAlbPrdLin_Internalname = "ALBPRDLIN_"+sGXsfl_75_fel_idx ;
      edtProCod_Internalname = "PROCOD_"+sGXsfl_75_fel_idx ;
      edtProDsc_Internalname = "PRODSC_"+sGXsfl_75_fel_idx ;
      edtAlbPrdPKg_Internalname = "ALBPRDPKG_"+sGXsfl_75_fel_idx ;
      edtAlbPrdPMt_Internalname = "ALBPRDPMT_"+sGXsfl_75_fel_idx ;
      edtPrdKgm_Internalname = "PRDKGM_"+sGXsfl_75_fel_idx ;
      edtPrdMtr_Internalname = "PRDMTR_"+sGXsfl_75_fel_idx ;
      edtPrdImp_Internalname = "PRDIMP_"+sGXsfl_75_fel_idx ;
      edtProPreRec_Internalname = "PROPREREC_"+sGXsfl_75_fel_idx ;
      edtProPorRec_Internalname = "PROPORREC_"+sGXsfl_75_fel_idx ;
   }

   public void addRow1KR210( )
   {
      nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_75210( ) ;
      sendRow1KR210( ) ;
   }

   public void sendRow1KR210( )
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
         if ( ((int)((nGXsfl_75_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_210_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_210_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_210, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_210_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_210), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_210), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_210_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_210_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_210_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A1468AlbPrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1468AlbPrdLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPrdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPrdLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_210_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProCod_Internalname,GXutil.rtrim( A758ProCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProDsc_Internalname,GXutil.rtrim( A759ProDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_210_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPrdPKg_Internalname,GXutil.ltrim( localUtil.ntoc( A1469AlbPrdPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbPrdPKg_Enabled!=0) ? localUtil.format( A1469AlbPrdPKg, "ZZZZZZ9.999") : localUtil.format( A1469AlbPrdPKg, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,80);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPrdPKg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPrdPKg_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_210_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPrdPMt_Internalname,GXutil.ltrim( localUtil.ntoc( A1470AlbPrdPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbPrdPMt_Enabled!=0) ? localUtil.format( A1470AlbPrdPMt, "ZZZZZZ9.999") : localUtil.format( A1470AlbPrdPMt, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPrdPMt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPrdPMt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_210_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A1471PrdKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdKgm_Enabled!=0) ? localUtil.format( A1471PrdKgm, "ZZZZZ9.99") : localUtil.format( A1471PrdKgm, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_210_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1472PrdMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdMtr_Enabled!=0) ? localUtil.format( A1472PrdMtr, "ZZZZZ9.99") : localUtil.format( A1472PrdMtr, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdImp_Internalname,GXutil.ltrim( localUtil.ntoc( A1473PrdImp, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdImp_Enabled!=0) ? localUtil.format( A1473PrdImp, "ZZZZZZZZ9.99") : localUtil.format( A1473PrdImp, "ZZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdImp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdImp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_210_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProPreRec_Internalname,GXutil.ltrim( localUtil.ntoc( A4332ProPreRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProPreRec_Enabled!=0) ? localUtil.format( A4332ProPreRec, "ZZZZZZZ.ZZZZZ") : localUtil.format( A4332ProPreRec, "ZZZZZZZ.ZZZZZ"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProPreRec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProPreRec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_210_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProPorRec_Internalname,GXutil.ltrim( localUtil.ntoc( A4333ProPorRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProPorRec_Enabled!=0) ? localUtil.format( A4333ProPorRec, "ZZZ.ZZ") : localUtil.format( A4333ProPorRec, "ZZZ.ZZ"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProPorRec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProPorRec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1KR210( ) ;
      GXCCtl = "Z1468AlbPrdLin_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1468AlbPrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1469AlbPrdPKg_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1469AlbPrdPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1470AlbPrdPMt_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1470AlbPrdPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1471PrdKgm_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1471PrdKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1472PrdMtr_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1472PrdMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4332ProPreRec_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4332ProPreRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4333ProPorRec_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4333ProPorRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z758ProCod_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z758ProCod));
      GXCCtl = "nRcdDeleted_210_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_210, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_210_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_210, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_210_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_210, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_210_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_210_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPRDLIN_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPrdLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRODSC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPRDPKG_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPrdPKg_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPRDPMT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPrdPMt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDKGM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDMTR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDIMP_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdImp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROPREREC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProPreRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROPORREC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProPorRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1KR210( )
   {
      nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_75210( ) ;
      edtavnRcdDeleted_210_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_210_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPrdLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPRDLIN_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROCOD_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRODSC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPrdPKg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPRDPKG_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPrdPMt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPRDPMT_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDKGM_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDMTR_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdImp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDIMP_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProPreRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROPREREC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProPorRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROPORREC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_210_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_210_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_210");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_210_Internalname ;
         wbErr = true ;
         nRcdDeleted_210 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_210 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_210_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ALBPRDLIN_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPrdLin_Internalname ;
         wbErr = true ;
         A1468AlbPrdLin = (short)(0) ;
      }
      else
      {
         A1468AlbPrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbPrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
      n758ProCod = false ;
      A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbPrdPKg_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbPrdPKg_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "ALBPRDPKG_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPrdPKg_Internalname ;
         wbErr = true ;
         A1469AlbPrdPKg = DecimalUtil.ZERO ;
         n1469AlbPrdPKg = false ;
      }
      else
      {
         A1469AlbPrdPKg = localUtil.ctond( httpContext.cgiGet( edtAlbPrdPKg_Internalname)) ;
         n1469AlbPrdPKg = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbPrdPMt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbPrdPMt_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "ALBPRDPMT_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPrdPMt_Internalname ;
         wbErr = true ;
         A1470AlbPrdPMt = DecimalUtil.ZERO ;
         n1470AlbPrdPMt = false ;
      }
      else
      {
         A1470AlbPrdPMt = localUtil.ctond( httpContext.cgiGet( edtAlbPrdPMt_Internalname)) ;
         n1470AlbPrdPMt = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "PRDKGM_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdKgm_Internalname ;
         wbErr = true ;
         A1471PrdKgm = DecimalUtil.ZERO ;
         n1471PrdKgm = false ;
      }
      else
      {
         A1471PrdKgm = localUtil.ctond( httpContext.cgiGet( edtPrdKgm_Internalname)) ;
         n1471PrdKgm = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdMtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "PRDMTR_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdMtr_Internalname ;
         wbErr = true ;
         A1472PrdMtr = DecimalUtil.ZERO ;
         n1472PrdMtr = false ;
      }
      else
      {
         A1472PrdMtr = localUtil.ctond( httpContext.cgiGet( edtPrdMtr_Internalname)) ;
         n1472PrdMtr = false ;
      }
      A1473PrdImp = localUtil.ctond( httpContext.cgiGet( edtPrdImp_Internalname)) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProPreRec_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProPreRec_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "PROPREREC_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProPreRec_Internalname ;
         wbErr = true ;
         A4332ProPreRec = DecimalUtil.ZERO ;
         n4332ProPreRec = false ;
      }
      else
      {
         A4332ProPreRec = localUtil.ctond( httpContext.cgiGet( edtProPreRec_Internalname)) ;
         n4332ProPreRec = false ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProPorRec_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProPorRec_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "PROPORREC_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProPorRec_Internalname ;
         wbErr = true ;
         A4333ProPorRec = DecimalUtil.ZERO ;
         n4333ProPorRec = false ;
      }
      else
      {
         A4333ProPorRec = localUtil.ctond( httpContext.cgiGet( edtProPorRec_Internalname)) ;
         n4333ProPorRec = false ;
      }
      GXCCtl = "Z1468AlbPrdLin_" + sGXsfl_75_idx ;
      Z1468AlbPrdLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1469AlbPrdPKg_" + sGXsfl_75_idx ;
      Z1469AlbPrdPKg = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1470AlbPrdPMt_" + sGXsfl_75_idx ;
      Z1470AlbPrdPMt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1471PrdKgm_" + sGXsfl_75_idx ;
      Z1471PrdKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1472PrdMtr_" + sGXsfl_75_idx ;
      Z1472PrdMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4332ProPreRec_" + sGXsfl_75_idx ;
      Z4332ProPreRec = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4333ProPorRec_" + sGXsfl_75_idx ;
      Z4333ProPorRec = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z758ProCod_" + sGXsfl_75_idx ;
      Z758ProCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_210_" + sGXsfl_75_idx ;
      nRcdDeleted_210 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_210_" + sGXsfl_75_idx ;
      nRcdExists_210 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_210_" + sGXsfl_75_idx ;
      nIsMod_210 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAlbPrdLin_Enabled = edtAlbPrdLin_Enabled ;
   }

   public void confirmValues1KR0( )
   {
      nGXsfl_75_idx = 0 ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_75210( ) ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_75210( ) ;
         httpContext.changePostValue( "Z1468AlbPrdLin_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z1468AlbPrdLin_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1468AlbPrdLin_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z1469AlbPrdPKg_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z1469AlbPrdPKg_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1469AlbPrdPKg_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z1470AlbPrdPMt_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z1470AlbPrdPMt_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1470AlbPrdPMt_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z1471PrdKgm_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z1471PrdKgm_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1471PrdKgm_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z1472PrdMtr_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z1472PrdMtr_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1472PrdMtr_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4332ProPreRec_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4332ProPreRec_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4332ProPreRec_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4333ProPorRec_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4333ProPorRec_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4333ProPorRec_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z758ProCod_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z758ProCod_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z758ProCod_"+sGXsfl_75_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttrn01", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z1467AlbPrdULin", GXutil.ltrim( localUtil.ntoc( Z1467AlbPrdULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1261BarAlbKgmE", GXutil.ltrim( localUtil.ntoc( Z1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1263BarAlbMtrE", GXutil.ltrim( localUtil.ntoc( Z1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1467AlbPrdULin", GXutil.ltrim( localUtil.ntoc( O1467AlbPrdULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_75", GXutil.ltrim( localUtil.ntoc( nGXsfl_75_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV35Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPREKGM", GXutil.ltrim( localUtil.ntoc( AV33PreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPREMTR", GXutil.ltrim( localUtil.ntoc( AV32PreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.ttrn01", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"})  ;
   }

   public String getPgmname( )
   {
      return "TTrn01" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Creacion Linea ALBPRD", "") ;
   }

   public void initializeNonKey1KR195( )
   {
      A1467AlbPrdULin = (short)(0) ;
      n1467AlbPrdULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
      O1467AlbPrdULin = A1467AlbPrdULin ;
      n1467AlbPrdULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
      Z1467AlbPrdULin = (short)(0) ;
      Z1261BarAlbKgmE = DecimalUtil.ZERO ;
      Z1263BarAlbMtrE = DecimalUtil.ZERO ;
   }

   public void initAll1KR195( )
   {
      initializeNonKey1KR195( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1KR210( )
   {
      AV33PreKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33PreKgm", GXutil.ltrimstr( AV33PreKgm, 13, 5));
      AV32PreMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32PreMtr", GXutil.ltrimstr( AV32PreMtr, 13, 5));
      A1469AlbPrdPKg = DecimalUtil.ZERO ;
      n1469AlbPrdPKg = false ;
      A1470AlbPrdPMt = DecimalUtil.ZERO ;
      n1470AlbPrdPMt = false ;
      A1473PrdImp = DecimalUtil.ZERO ;
      A758ProCod = "" ;
      n758ProCod = false ;
      A759ProDsc = "" ;
      A4332ProPreRec = DecimalUtil.ZERO ;
      n4332ProPreRec = false ;
      A4333ProPorRec = DecimalUtil.ZERO ;
      n4333ProPorRec = false ;
      A1471PrdKgm = A1261BarAlbKgmE ;
      n1471PrdKgm = false ;
      A1472PrdMtr = A1263BarAlbMtrE ;
      n1472PrdMtr = false ;
      Z1469AlbPrdPKg = DecimalUtil.ZERO ;
      Z1470AlbPrdPMt = DecimalUtil.ZERO ;
      Z1471PrdKgm = DecimalUtil.ZERO ;
      Z1472PrdMtr = DecimalUtil.ZERO ;
      Z4332ProPreRec = DecimalUtil.ZERO ;
      Z4333ProPorRec = DecimalUtil.ZERO ;
      Z758ProCod = "" ;
   }

   public void initAll1KR210( )
   {
      A1468AlbPrdLin = (short)(0) ;
      initializeNonKey1KR210( ) ;
   }

   public void standaloneModalInsert1KR210( )
   {
      A1467AlbPrdULin = i1467AlbPrdULin ;
      n1467AlbPrdULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1467AlbPrdULin), 4, 0));
      A1471PrdKgm = i1471PrdKgm ;
      n1471PrdKgm = false ;
      A1472PrdMtr = i1472PrdMtr ;
      n1472PrdMtr = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824158564", true, true);
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
      httpContext.AddJavascriptSource("ttrn01.js", "?2026824158564", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties210( )
   {
      edtAlbPrdLin_Enabled = defedtAlbPrdLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPrdLin_Enabled), 5, 0), !bGXsfl_75_Refreshing);
   }

   public void startgridcontrol75( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("DeleteMethod", "none");
      Grid1Container.AddObjectProperty("Class", "");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_210, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_210_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1468AlbPrdLin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPrdLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A758ProCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A759ProDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1469AlbPrdPKg, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPrdPKg_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1470AlbPrdPMt, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPrdPMt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1471PrdKgm, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1472PrdMtr, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1473PrdImp, (byte)(12), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdImp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4332ProPreRec, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProPreRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4333ProPorRec, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProPorRec_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtAlbPrdULin_Internalname = "ALBPRDULIN" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtBarAlbKgmE_Internalname = "BARALBKGME" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtBarAlbMtrE_Internalname = "BARALBMTRE" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtBarSer_Internalname = "BARSER" ;
      edtavnRcdDeleted_210_Internalname = "vNRCDDELETED_210" ;
      edtAlbPrdLin_Internalname = "ALBPRDLIN" ;
      edtProCod_Internalname = "PROCOD" ;
      edtProDsc_Internalname = "PRODSC" ;
      edtAlbPrdPKg_Internalname = "ALBPRDPKG" ;
      edtAlbPrdPMt_Internalname = "ALBPRDPMT" ;
      edtPrdKgm_Internalname = "PRDKGM" ;
      edtPrdMtr_Internalname = "PRDMTR" ;
      edtPrdImp_Internalname = "PRDIMP" ;
      edtProPreRec_Internalname = "PROPREREC" ;
      edtProPorRec_Internalname = "PROPORREC" ;
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
      Form.setCaption( httpContext.getMessage( "Creacion Linea ALBPRD", "") );
      edtProPorRec_Jsonclick = "" ;
      edtProPreRec_Jsonclick = "" ;
      edtPrdImp_Jsonclick = "" ;
      edtPrdMtr_Jsonclick = "" ;
      edtPrdKgm_Jsonclick = "" ;
      edtAlbPrdPMt_Jsonclick = "" ;
      edtAlbPrdPKg_Jsonclick = "" ;
      edtProDsc_Jsonclick = "" ;
      edtProCod_Jsonclick = "" ;
      edtAlbPrdLin_Jsonclick = "" ;
      edtavnRcdDeleted_210_Jsonclick = "" ;
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
      edtProPorRec_Enabled = 1 ;
      edtProPreRec_Enabled = 1 ;
      edtPrdImp_Enabled = 0 ;
      edtPrdMtr_Enabled = 1 ;
      edtPrdKgm_Enabled = 1 ;
      edtAlbPrdPMt_Enabled = 1 ;
      edtAlbPrdPKg_Enabled = 1 ;
      edtProDsc_Enabled = 0 ;
      edtProCod_Enabled = 1 ;
      edtAlbPrdLin_Enabled = 1 ;
      edtavnRcdDeleted_210_Enabled = 1 ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Backcolor = (int)(0xFFFFFF) ;
      edtBarSer_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
      edtBarAlbMtrE_Jsonclick = "" ;
      edtBarAlbMtrE_Backcolor = (int)(0xFFFFFF) ;
      edtBarAlbMtrE_Enabled = 1 ;
      edtBarAlbKgmE_Jsonclick = "" ;
      edtBarAlbKgmE_Backcolor = (int)(0xFFFFFF) ;
      edtBarAlbKgmE_Enabled = 1 ;
      edtAlbPrdULin_Jsonclick = "" ;
      edtAlbPrdULin_Backcolor = (int)(0xFFFFFF) ;
      edtAlbPrdULin_Enabled = 0 ;
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
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
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

   public void xc_11_1KR210( String A396EmprCod ,
                             int A252CliCod ,
                             String A758ProCod ,
                             String A212BarSer ,
                             java.math.BigDecimal AV32PreMtr ,
                             java.math.BigDecimal AV33PreKgm )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A252CliCod ;
         GXv_char3[0] = A758ProCod ;
         GXv_char2[0] = A212BarSer ;
         GXv_int6[0] = (byte)(99) ;
         GXv_decimal8[0] = AV32PreMtr ;
         GXv_decimal7[0] = AV33PreKgm ;
         new app.pclipro2(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_char2, GXv_int6, GXv_decimal8, GXv_decimal7) ;
         A396EmprCod = GXv_char4[0] ;
         A252CliCod = GXv_int5[0] ;
         A758ProCod = GXv_char3[0] ;
         A212BarSer = GXv_char2[0] ;
         AV32PreMtr = GXv_decimal8[0] ;
         AV33PreKgm = GXv_decimal7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         httpContext.ajax_rsp_assign_attri("", false, "AV32PreMtr", GXutil.ltrimstr( AV32PreMtr, 13, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV33PreKgm", GXutil.ltrimstr( AV33PreKgm, 13, 5));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A758ProCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A212BarSer))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV32PreMtr, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV33PreKgm, (byte)(13), (byte)(5), ".", "")))+"\"") ;
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
      subsflControlProps_75210( ) ;
      while ( nGXsfl_75_idx <= nRC_GXsfl_75 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1KR210( ) ;
         standaloneModal1KR210( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1KR210( ) ;
         nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_75210( ) ;
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
      /* Using cursor T01KR40 */
      pr_default.execute(38, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(38) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01KR40_A407EmprNom[0] ;
      n407EmprNom = T01KR40_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(38);
      /* Using cursor T01KR41 */
      pr_default.execute(39, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(39) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(39);
      /* Using cursor T01KR42 */
      pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(40) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A212BarSer = T01KR42_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A252CliCod = T01KR42_A252CliCod[0] ;
      n252CliCod = T01KR42_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
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

   public void valid_Barcodpar( )
   {
      n1467AlbPrdULin = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1467AlbPrdULin", GXutil.ltrim( localUtil.ntoc( A1467AlbPrdULin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1467AlbPrdULin", GXutil.ltrim( localUtil.ntoc( Z1467AlbPrdULin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1261BarAlbKgmE", GXutil.ltrim( localUtil.ntoc( Z1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1263BarAlbMtrE", GXutil.ltrim( localUtil.ntoc( Z1263BarAlbMtrE, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z212BarSer", GXutil.rtrim( Z212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "O1467AlbPrdULin", GXutil.ltrim( localUtil.ntoc( O1467AlbPrdULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Procod( )
   {
      n252CliCod = false ;
      n758ProCod = false ;
      /* Using cursor T01KR38 */
      pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(36) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
      }
      A759ProDsc = T01KR38_A759ProDsc[0] ;
      pr_default.close(36);
      /* Using cursor T01KR43 */
      pr_default.execute(41, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(41) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
      }
      pr_default.close(41);
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A252CliCod ;
         GXv_char3[0] = A758ProCod ;
         GXv_char2[0] = A212BarSer ;
         GXv_int6[0] = (byte)(99) ;
         GXv_decimal8[0] = AV32PreMtr ;
         GXv_decimal7[0] = AV33PreKgm ;
         new app.pclipro2(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_char2, GXv_int6, GXv_decimal8, GXv_decimal7) ;
         ttrn01_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         ttrn01_impl.this.A252CliCod = GXv_int5[0] ;
         A252CliCod = this.A252CliCod ;
         ttrn01_impl.this.A758ProCod = GXv_char3[0] ;
         A758ProCod = this.A758ProCod ;
         ttrn01_impl.this.A212BarSer = GXv_char2[0] ;
         A212BarSer = this.A212BarSer ;
         ttrn01_impl.this.AV32PreMtr = GXv_decimal8[0] ;
         AV32PreMtr = this.AV32PreMtr ;
         ttrn01_impl.this.AV33PreKgm = GXv_decimal7[0] ;
         AV33PreKgm = this.AV33PreKgm ;
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1471PrdKgm)==0) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Este Proceso no tiene precio Kilo", ""), 0, "PROCOD");
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1471PrdKgm)==0) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Este Proceso no tiene precio Metro", ""), 0, "PROCOD");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", GXutil.rtrim( A758ProCod));
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "AV32PreMtr", GXutil.ltrim( localUtil.ntoc( AV32PreMtr, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV33PreKgm", GXutil.ltrim( localUtil.ntoc( AV33PreKgm, (byte)(13), (byte)(5), ".", "")));
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
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A1467AlbPrdULin',fld:'ALBPRDULIN',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A1467AlbPrdULin',fld:'ALBPRDULIN',pic:'ZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z30AlbProCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z407EmprNom'},{av:'Z1467AlbPrdULin'},{av:'Z1261BarAlbKgmE'},{av:'Z1263BarAlbMtrE'},{av:'Z252CliCod'},{av:'Z212BarSer'},{av:'O1467AlbPrdULin'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_ALBPRDULIN","{handler:'valid_Albprdulin',iparms:[]");
      setEventMetadata("VALID_ALBPRDULIN",",oparms:[]}");
      setEventMetadata("VALID_BARALBKGME","{handler:'valid_Baralbkgme',iparms:[]");
      setEventMetadata("VALID_BARALBKGME",",oparms:[]}");
      setEventMetadata("VALID_BARALBMTRE","{handler:'valid_Baralbmtre',iparms:[]");
      setEventMetadata("VALID_BARALBMTRE",",oparms:[]}");
      setEventMetadata("VALID_ALBPRDLIN","{handler:'valid_Albprdlin',iparms:[]");
      setEventMetadata("VALID_ALBPRDLIN",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'AV33PreKgm',fld:'vPREKGM',pic:'ZZZZZZ9.999'},{av:'AV32PreMtr',fld:'vPREMTR',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'AV32PreMtr',fld:'vPREMTR',pic:'ZZZZZZ9.999'},{av:'AV33PreKgm',fld:'vPREKGM',pic:'ZZZZZZ9.999'}]}");
      setEventMetadata("VALID_ALBPRDPKG","{handler:'valid_Albprdpkg',iparms:[]");
      setEventMetadata("VALID_ALBPRDPKG",",oparms:[]}");
      setEventMetadata("VALID_ALBPRDPMT","{handler:'valid_Albprdpmt',iparms:[]");
      setEventMetadata("VALID_ALBPRDPMT",",oparms:[]}");
      setEventMetadata("VALID_PRDKGM","{handler:'valid_Prdkgm',iparms:[]");
      setEventMetadata("VALID_PRDKGM",",oparms:[]}");
      setEventMetadata("VALID_PRDMTR","{handler:'valid_Prdmtr',iparms:[]");
      setEventMetadata("VALID_PRDMTR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Proporrec',iparms:[]");
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
      pr_default.close(36);
      pr_default.close(40);
      pr_default.close(38);
      pr_default.close(39);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z1261BarAlbKgmE = DecimalUtil.ZERO ;
      Z1263BarAlbMtrE = DecimalUtil.ZERO ;
      Z1469AlbPrdPKg = DecimalUtil.ZERO ;
      Z1470AlbPrdPMt = DecimalUtil.ZERO ;
      Z1471PrdKgm = DecimalUtil.ZERO ;
      Z1472PrdMtr = DecimalUtil.ZERO ;
      Z4332ProPreRec = DecimalUtil.ZERO ;
      Z4333ProPorRec = DecimalUtil.ZERO ;
      Z758ProCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
      A212BarSer = "" ;
      AV32PreMtr = DecimalUtil.ZERO ;
      AV33PreKgm = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
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
      A407EmprNom = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode210 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV35Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode195 = "" ;
      GXCCtl = "" ;
      A759ProDsc = "" ;
      A1469AlbPrdPKg = DecimalUtil.ZERO ;
      A1470AlbPrdPMt = DecimalUtil.ZERO ;
      A1471PrdKgm = DecimalUtil.ZERO ;
      A1472PrdMtr = DecimalUtil.ZERO ;
      A1473PrdImp = DecimalUtil.ZERO ;
      A4332ProPreRec = DecimalUtil.ZERO ;
      A4333ProPorRec = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      Z212BarSer = "" ;
      T01KR9_A407EmprNom = new String[] {""} ;
      T01KR9_n407EmprNom = new boolean[] {false} ;
      T01KR10_A396EmprCod = new String[] {""} ;
      T01KR5_A252CliCod = new int[1] ;
      T01KR5_n252CliCod = new boolean[] {false} ;
      T01KR5_A212BarSer = new String[] {""} ;
      T01KR11_A407EmprNom = new String[] {""} ;
      T01KR11_n407EmprNom = new boolean[] {false} ;
      T01KR11_A1467AlbPrdULin = new short[1] ;
      T01KR11_n1467AlbPrdULin = new boolean[] {false} ;
      T01KR11_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KR11_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KR11_A212BarSer = new String[] {""} ;
      T01KR11_A396EmprCod = new String[] {""} ;
      T01KR11_A129BarCod = new int[1] ;
      T01KR11_A132BarCodReo = new byte[1] ;
      T01KR11_A130BarCodPar = new String[] {""} ;
      T01KR11_A30AlbProCod = new long[1] ;
      T01KR11_A252CliCod = new int[1] ;
      T01KR11_n252CliCod = new boolean[] {false} ;
      T01KR12_A396EmprCod = new String[] {""} ;
      T01KR12_A30AlbProCod = new long[1] ;
      T01KR12_A129BarCod = new int[1] ;
      T01KR12_A132BarCodReo = new byte[1] ;
      T01KR12_A130BarCodPar = new String[] {""} ;
      T01KR8_A1467AlbPrdULin = new short[1] ;
      T01KR8_n1467AlbPrdULin = new boolean[] {false} ;
      T01KR8_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KR8_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KR8_A396EmprCod = new String[] {""} ;
      T01KR8_A129BarCod = new int[1] ;
      T01KR8_A132BarCodReo = new byte[1] ;
      T01KR8_A130BarCodPar = new String[] {""} ;
      T01KR8_A30AlbProCod = new long[1] ;
      T01KR13_A396EmprCod = new String[] {""} ;
      T01KR13_A129BarCod = new int[1] ;
      T01KR13_A132BarCodReo = new byte[1] ;
      T01KR13_A130BarCodPar = new String[] {""} ;
      T01KR13_A30AlbProCod = new long[1] ;
      T01KR14_A396EmprCod = new String[] {""} ;
      T01KR14_A129BarCod = new int[1] ;
      T01KR14_A132BarCodReo = new byte[1] ;
      T01KR14_A130BarCodPar = new String[] {""} ;
      T01KR14_A30AlbProCod = new long[1] ;
      T01KR7_A1467AlbPrdULin = new short[1] ;
      T01KR7_n1467AlbPrdULin = new boolean[] {false} ;
      T01KR7_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KR7_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KR7_A396EmprCod = new String[] {""} ;
      T01KR7_A129BarCod = new int[1] ;
      T01KR7_A132BarCodReo = new byte[1] ;
      T01KR7_A130BarCodPar = new String[] {""} ;
      T01KR7_A30AlbProCod = new long[1] ;
      T01KR18_A396EmprCod = new String[] {""} ;
      T01KR18_A30AlbProCod = new long[1] ;
      T01KR18_A129BarCod = new int[1] ;
      T01KR18_A132BarCodReo = new byte[1] ;
      T01KR18_A130BarCodPar = new String[] {""} ;
      T01KR18_A6648AlbMetLin = new short[1] ;
      T01KR19_A396EmprCod = new String[] {""} ;
      T01KR19_A30AlbProCod = new long[1] ;
      T01KR19_A129BarCod = new int[1] ;
      T01KR19_A132BarCodReo = new byte[1] ;
      T01KR19_A130BarCodPar = new String[] {""} ;
      T01KR19_A9639Et_Numero = new short[1] ;
      T01KR20_A396EmprCod = new String[] {""} ;
      T01KR20_A30AlbProCod = new long[1] ;
      T01KR20_A129BarCod = new int[1] ;
      T01KR20_A132BarCodReo = new byte[1] ;
      T01KR20_A130BarCodPar = new String[] {""} ;
      T01KR20_A6622AlbHdRLn = new short[1] ;
      T01KR21_A396EmprCod = new String[] {""} ;
      T01KR21_A30AlbProCod = new long[1] ;
      T01KR21_A129BarCod = new int[1] ;
      T01KR21_A132BarCodReo = new byte[1] ;
      T01KR21_A130BarCodPar = new String[] {""} ;
      T01KR21_A5456P_ForLin = new short[1] ;
      T01KR22_A396EmprCod = new String[] {""} ;
      T01KR22_A30AlbProCod = new long[1] ;
      T01KR22_A129BarCod = new int[1] ;
      T01KR22_A132BarCodReo = new byte[1] ;
      T01KR22_A130BarCodPar = new String[] {""} ;
      T01KR22_A2524DisComLin = new byte[1] ;
      T01KR22_A1056DisComCod = new String[] {""} ;
      T01KR22_A1032FonCod = new String[] {""} ;
      T01KR23_A396EmprCod = new String[] {""} ;
      T01KR23_A3617AlbTrnCod = new long[1] ;
      T01KR23_A30AlbProCod = new long[1] ;
      T01KR23_A129BarCod = new int[1] ;
      T01KR23_A132BarCodReo = new byte[1] ;
      T01KR23_A130BarCodPar = new String[] {""} ;
      T01KR24_A396EmprCod = new String[] {""} ;
      T01KR24_A30AlbProCod = new long[1] ;
      T01KR24_A129BarCod = new int[1] ;
      T01KR24_A132BarCodReo = new byte[1] ;
      T01KR24_A130BarCodPar = new String[] {""} ;
      T01KR24_A3621AlbPckLin = new short[1] ;
      T01KR25_A396EmprCod = new String[] {""} ;
      T01KR25_A30AlbProCod = new long[1] ;
      T01KR25_A129BarCod = new int[1] ;
      T01KR25_A132BarCodReo = new byte[1] ;
      T01KR25_A130BarCodPar = new String[] {""} ;
      T01KR25_A2764AlbHdrLin = new short[1] ;
      T01KR26_A396EmprCod = new String[] {""} ;
      T01KR26_A30AlbProCod = new long[1] ;
      T01KR26_A129BarCod = new int[1] ;
      T01KR26_A132BarCodReo = new byte[1] ;
      T01KR26_A130BarCodPar = new String[] {""} ;
      T01KR26_A200BarPieCod = new String[] {""} ;
      T01KR27_A396EmprCod = new String[] {""} ;
      T01KR27_A30AlbProCod = new long[1] ;
      T01KR27_A129BarCod = new int[1] ;
      T01KR27_A132BarCodReo = new byte[1] ;
      T01KR27_A130BarCodPar = new String[] {""} ;
      T01KR27_A1240GuiFasLin = new short[1] ;
      T01KR29_A396EmprCod = new String[] {""} ;
      T01KR29_A30AlbProCod = new long[1] ;
      T01KR29_A129BarCod = new int[1] ;
      T01KR29_A132BarCodReo = new byte[1] ;
      T01KR29_A130BarCodPar = new String[] {""} ;
      Z759ProDsc = "" ;
      T01KR30_A252CliCod = new int[1] ;
      T01KR30_n252CliCod = new boolean[] {false} ;
      T01KR31_A252CliCod = new int[1] ;
      T01KR31_n252CliCod = new boolean[] {false} ;
      T01KR31_A30AlbProCod = new long[1] ;
      T01KR31_A1468AlbPrdLin = new short[1] ;
      T01KR31_A1469AlbPrdPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KR31_n1469AlbPrdPKg = new boolean[] {false} ;
      T01KR31_A1470AlbPrdPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KR31_n1470AlbPrdPMt = new boolean[] {false} ;
      T01KR31_A1471PrdKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KR31_n1471PrdKgm = new boolean[] {false} ;
      T01KR31_A1472PrdMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KR31_n1472PrdMtr = new boolean[] {false} ;
      T01KR31_A759ProDsc = new String[] {""} ;
      T01KR31_A4332ProPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KR31_n4332ProPreRec = new boolean[] {false} ;
      T01KR31_A4333ProPorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KR31_n4333ProPorRec = new boolean[] {false} ;
      T01KR31_A396EmprCod = new String[] {""} ;
      T01KR31_A129BarCod = new int[1] ;
      T01KR31_A132BarCodReo = new byte[1] ;
      T01KR31_A130BarCodPar = new String[] {""} ;
      T01KR31_A758ProCod = new String[] {""} ;
      T01KR31_n758ProCod = new boolean[] {false} ;
      T01KR4_A759ProDsc = new String[] {""} ;
      T01KR6_A396EmprCod = new String[] {""} ;
      T01KR32_A759ProDsc = new String[] {""} ;
      T01KR33_A396EmprCod = new String[] {""} ;
      T01KR34_A396EmprCod = new String[] {""} ;
      T01KR34_A30AlbProCod = new long[1] ;
      T01KR34_A129BarCod = new int[1] ;
      T01KR34_A132BarCodReo = new byte[1] ;
      T01KR34_A130BarCodPar = new String[] {""} ;
      T01KR34_A1468AlbPrdLin = new short[1] ;
      T01KR3_A30AlbProCod = new long[1] ;
      T01KR3_A1468AlbPrdLin = new short[1] ;
      T01KR3_A1469AlbPrdPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KR3_n1469AlbPrdPKg = new boolean[] {false} ;
      T01KR3_A1470AlbPrdPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KR3_n1470AlbPrdPMt = new boolean[] {false} ;
      T01KR3_A1471PrdKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KR3_n1471PrdKgm = new boolean[] {false} ;
      T01KR3_A1472PrdMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KR3_n1472PrdMtr = new boolean[] {false} ;
      T01KR3_A4332ProPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KR3_n4332ProPreRec = new boolean[] {false} ;
      T01KR3_A4333ProPorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KR3_n4333ProPorRec = new boolean[] {false} ;
      T01KR3_A396EmprCod = new String[] {""} ;
      T01KR3_A129BarCod = new int[1] ;
      T01KR3_A132BarCodReo = new byte[1] ;
      T01KR3_A130BarCodPar = new String[] {""} ;
      T01KR3_A758ProCod = new String[] {""} ;
      T01KR3_n758ProCod = new boolean[] {false} ;
      T01KR2_A30AlbProCod = new long[1] ;
      T01KR2_A1468AlbPrdLin = new short[1] ;
      T01KR2_A1469AlbPrdPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KR2_n1469AlbPrdPKg = new boolean[] {false} ;
      T01KR2_A1470AlbPrdPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KR2_n1470AlbPrdPMt = new boolean[] {false} ;
      T01KR2_A1471PrdKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KR2_n1471PrdKgm = new boolean[] {false} ;
      T01KR2_A1472PrdMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KR2_n1472PrdMtr = new boolean[] {false} ;
      T01KR2_A4332ProPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KR2_n4332ProPreRec = new boolean[] {false} ;
      T01KR2_A4333ProPorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KR2_n4333ProPorRec = new boolean[] {false} ;
      T01KR2_A396EmprCod = new String[] {""} ;
      T01KR2_A129BarCod = new int[1] ;
      T01KR2_A132BarCodReo = new byte[1] ;
      T01KR2_A130BarCodPar = new String[] {""} ;
      T01KR2_A758ProCod = new String[] {""} ;
      T01KR2_n758ProCod = new boolean[] {false} ;
      T01KR38_A759ProDsc = new String[] {""} ;
      T01KR39_A396EmprCod = new String[] {""} ;
      T01KR39_A30AlbProCod = new long[1] ;
      T01KR39_A129BarCod = new int[1] ;
      T01KR39_A132BarCodReo = new byte[1] ;
      T01KR39_A130BarCodPar = new String[] {""} ;
      T01KR39_A1468AlbPrdLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i1471PrdKgm = DecimalUtil.ZERO ;
      i1472PrdMtr = DecimalUtil.ZERO ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01KR40_A407EmprNom = new String[] {""} ;
      T01KR40_n407EmprNom = new boolean[] {false} ;
      T01KR41_A396EmprCod = new String[] {""} ;
      T01KR42_A212BarSer = new String[] {""} ;
      T01KR42_A252CliCod = new int[1] ;
      T01KR42_n252CliCod = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ407EmprNom = "" ;
      ZZ1261BarAlbKgmE = DecimalUtil.ZERO ;
      ZZ1263BarAlbMtrE = DecimalUtil.ZERO ;
      ZZ212BarSer = "" ;
      T01KR43_A396EmprCod = new String[] {""} ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new byte[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      ZV32PreMtr = DecimalUtil.ZERO ;
      ZV33PreKgm = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttrn01__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrn01__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrn01__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrn01__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn01__default(),
         new Object[] {
             new Object[] {
            T01KR2_A30AlbProCod, T01KR2_A1468AlbPrdLin, T01KR2_A1469AlbPrdPKg, T01KR2_n1469AlbPrdPKg, T01KR2_A1470AlbPrdPMt, T01KR2_n1470AlbPrdPMt, T01KR2_A1471PrdKgm, T01KR2_n1471PrdKgm, T01KR2_A1472PrdMtr, T01KR2_n1472PrdMtr,
            T01KR2_A4332ProPreRec, T01KR2_n4332ProPreRec, T01KR2_A4333ProPorRec, T01KR2_n4333ProPorRec, T01KR2_A396EmprCod, T01KR2_A129BarCod, T01KR2_A132BarCodReo, T01KR2_A130BarCodPar, T01KR2_A758ProCod, T01KR2_n758ProCod
            }
            , new Object[] {
            T01KR3_A30AlbProCod, T01KR3_A1468AlbPrdLin, T01KR3_A1469AlbPrdPKg, T01KR3_n1469AlbPrdPKg, T01KR3_A1470AlbPrdPMt, T01KR3_n1470AlbPrdPMt, T01KR3_A1471PrdKgm, T01KR3_n1471PrdKgm, T01KR3_A1472PrdMtr, T01KR3_n1472PrdMtr,
            T01KR3_A4332ProPreRec, T01KR3_n4332ProPreRec, T01KR3_A4333ProPorRec, T01KR3_n4333ProPorRec, T01KR3_A396EmprCod, T01KR3_A129BarCod, T01KR3_A132BarCodReo, T01KR3_A130BarCodPar, T01KR3_A758ProCod, T01KR3_n758ProCod
            }
            , new Object[] {
            T01KR4_A759ProDsc
            }
            , new Object[] {
            T01KR5_A252CliCod, T01KR5_n252CliCod, T01KR5_A212BarSer
            }
            , new Object[] {
            T01KR6_A396EmprCod
            }
            , new Object[] {
            T01KR7_A1467AlbPrdULin, T01KR7_n1467AlbPrdULin, T01KR7_A1261BarAlbKgmE, T01KR7_A1263BarAlbMtrE, T01KR7_A396EmprCod, T01KR7_A129BarCod, T01KR7_A132BarCodReo, T01KR7_A130BarCodPar, T01KR7_A30AlbProCod
            }
            , new Object[] {
            T01KR8_A1467AlbPrdULin, T01KR8_n1467AlbPrdULin, T01KR8_A1261BarAlbKgmE, T01KR8_A1263BarAlbMtrE, T01KR8_A396EmprCod, T01KR8_A129BarCod, T01KR8_A132BarCodReo, T01KR8_A130BarCodPar, T01KR8_A30AlbProCod
            }
            , new Object[] {
            T01KR9_A407EmprNom, T01KR9_n407EmprNom
            }
            , new Object[] {
            T01KR10_A396EmprCod
            }
            , new Object[] {
            T01KR11_A407EmprNom, T01KR11_n407EmprNom, T01KR11_A1467AlbPrdULin, T01KR11_n1467AlbPrdULin, T01KR11_A1261BarAlbKgmE, T01KR11_A1263BarAlbMtrE, T01KR11_A212BarSer, T01KR11_A396EmprCod, T01KR11_A129BarCod, T01KR11_A132BarCodReo,
            T01KR11_A130BarCodPar, T01KR11_A30AlbProCod, T01KR11_A252CliCod, T01KR11_n252CliCod
            }
            , new Object[] {
            T01KR12_A396EmprCod, T01KR12_A30AlbProCod, T01KR12_A129BarCod, T01KR12_A132BarCodReo, T01KR12_A130BarCodPar
            }
            , new Object[] {
            T01KR13_A396EmprCod, T01KR13_A129BarCod, T01KR13_A132BarCodReo, T01KR13_A130BarCodPar, T01KR13_A30AlbProCod
            }
            , new Object[] {
            T01KR14_A396EmprCod, T01KR14_A129BarCod, T01KR14_A132BarCodReo, T01KR14_A130BarCodPar, T01KR14_A30AlbProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01KR18_A396EmprCod, T01KR18_A30AlbProCod, T01KR18_A129BarCod, T01KR18_A132BarCodReo, T01KR18_A130BarCodPar, T01KR18_A6648AlbMetLin
            }
            , new Object[] {
            T01KR19_A396EmprCod, T01KR19_A30AlbProCod, T01KR19_A129BarCod, T01KR19_A132BarCodReo, T01KR19_A130BarCodPar, T01KR19_A9639Et_Numero
            }
            , new Object[] {
            T01KR20_A396EmprCod, T01KR20_A30AlbProCod, T01KR20_A129BarCod, T01KR20_A132BarCodReo, T01KR20_A130BarCodPar, T01KR20_A6622AlbHdRLn
            }
            , new Object[] {
            T01KR21_A396EmprCod, T01KR21_A30AlbProCod, T01KR21_A129BarCod, T01KR21_A132BarCodReo, T01KR21_A130BarCodPar, T01KR21_A5456P_ForLin
            }
            , new Object[] {
            T01KR22_A396EmprCod, T01KR22_A30AlbProCod, T01KR22_A129BarCod, T01KR22_A132BarCodReo, T01KR22_A130BarCodPar, T01KR22_A2524DisComLin, T01KR22_A1056DisComCod, T01KR22_A1032FonCod
            }
            , new Object[] {
            T01KR23_A396EmprCod, T01KR23_A3617AlbTrnCod, T01KR23_A30AlbProCod, T01KR23_A129BarCod, T01KR23_A132BarCodReo, T01KR23_A130BarCodPar
            }
            , new Object[] {
            T01KR24_A396EmprCod, T01KR24_A30AlbProCod, T01KR24_A129BarCod, T01KR24_A132BarCodReo, T01KR24_A130BarCodPar, T01KR24_A3621AlbPckLin
            }
            , new Object[] {
            T01KR25_A396EmprCod, T01KR25_A30AlbProCod, T01KR25_A129BarCod, T01KR25_A132BarCodReo, T01KR25_A130BarCodPar, T01KR25_A2764AlbHdrLin
            }
            , new Object[] {
            T01KR26_A396EmprCod, T01KR26_A30AlbProCod, T01KR26_A129BarCod, T01KR26_A132BarCodReo, T01KR26_A130BarCodPar, T01KR26_A200BarPieCod
            }
            , new Object[] {
            T01KR27_A396EmprCod, T01KR27_A30AlbProCod, T01KR27_A129BarCod, T01KR27_A132BarCodReo, T01KR27_A130BarCodPar, T01KR27_A1240GuiFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            T01KR29_A396EmprCod, T01KR29_A30AlbProCod, T01KR29_A129BarCod, T01KR29_A132BarCodReo, T01KR29_A130BarCodPar
            }
            , new Object[] {
            T01KR30_A252CliCod, T01KR30_n252CliCod
            }
            , new Object[] {
            T01KR31_A252CliCod, T01KR31_n252CliCod, T01KR31_A30AlbProCod, T01KR31_A1468AlbPrdLin, T01KR31_A1469AlbPrdPKg, T01KR31_n1469AlbPrdPKg, T01KR31_A1470AlbPrdPMt, T01KR31_n1470AlbPrdPMt, T01KR31_A1471PrdKgm, T01KR31_n1471PrdKgm,
            T01KR31_A1472PrdMtr, T01KR31_n1472PrdMtr, T01KR31_A759ProDsc, T01KR31_A4332ProPreRec, T01KR31_n4332ProPreRec, T01KR31_A4333ProPorRec, T01KR31_n4333ProPorRec, T01KR31_A396EmprCod, T01KR31_A129BarCod, T01KR31_A132BarCodReo,
            T01KR31_A130BarCodPar, T01KR31_A758ProCod, T01KR31_n758ProCod
            }
            , new Object[] {
            T01KR32_A759ProDsc
            }
            , new Object[] {
            T01KR33_A396EmprCod
            }
            , new Object[] {
            T01KR34_A396EmprCod, T01KR34_A30AlbProCod, T01KR34_A129BarCod, T01KR34_A132BarCodReo, T01KR34_A130BarCodPar, T01KR34_A1468AlbPrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01KR38_A759ProDsc
            }
            , new Object[] {
            T01KR39_A396EmprCod, T01KR39_A30AlbProCod, T01KR39_A129BarCod, T01KR39_A132BarCodReo, T01KR39_A130BarCodPar, T01KR39_A1468AlbPrdLin
            }
            , new Object[] {
            T01KR40_A407EmprNom, T01KR40_n407EmprNom
            }
            , new Object[] {
            T01KR41_A396EmprCod
            }
            , new Object[] {
            T01KR42_A212BarSer, T01KR42_A252CliCod, T01KR42_n252CliCod
            }
            , new Object[] {
            T01KR43_A396EmprCod
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
      AV35Pgmname = "TTrn01" ;
      Z1472PrdMtr = DecimalUtil.ZERO ;
      n1472PrdMtr = false ;
      A1472PrdMtr = DecimalUtil.ZERO ;
      n1472PrdMtr = false ;
      i1472PrdMtr = DecimalUtil.ZERO ;
      n1472PrdMtr = false ;
      Z1471PrdKgm = DecimalUtil.ZERO ;
      n1471PrdKgm = false ;
      A1471PrdKgm = DecimalUtil.ZERO ;
      n1471PrdKgm = false ;
      i1471PrdKgm = DecimalUtil.ZERO ;
      n1471PrdKgm = false ;
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
   private byte GXv_int6[] ;
   private short Z1467AlbPrdULin ;
   private short O1467AlbPrdULin ;
   private short Z1468AlbPrdLin ;
   private short nRcdDeleted_210 ;
   private short nRcdExists_210 ;
   private short nIsMod_210 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A1467AlbPrdULin ;
   private short nBlankRcdCount210 ;
   private short RcdFound210 ;
   private short B1467AlbPrdULin ;
   private short nBlankRcdUsr210 ;
   private short s1467AlbPrdULin ;
   private short A1468AlbPrdLin ;
   private short RcdFound195 ;
   private short nIsDirty_195 ;
   private short nIsDirty_210 ;
   private short i1467AlbPrdULin ;
   private short ZZ1467AlbPrdULin ;
   private short ZO1467AlbPrdULin ;
   private int wcpOA129BarCod ;
   private int Z129BarCod ;
   private int nRC_GXsfl_75 ;
   private int nGXsfl_75_idx=1 ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtAlbProCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtAlbPrdULin_Enabled ;
   private int edtBarAlbKgmE_Enabled ;
   private int edtBarAlbMtrE_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtavnRcdDeleted_210_Enabled ;
   private int edtAlbPrdLin_Enabled ;
   private int edtProCod_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtAlbPrdPKg_Enabled ;
   private int edtAlbPrdPMt_Enabled ;
   private int edtPrdKgm_Enabled ;
   private int edtPrdMtr_Enabled ;
   private int edtPrdImp_Enabled ;
   private int edtProPreRec_Enabled ;
   private int edtProPorRec_Enabled ;
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
   private int defedtAlbPrdLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtBarSer_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtBarAlbMtrE_Backcolor ;
   private int edtBarAlbKgmE_Backcolor ;
   private int edtAlbPrdULin_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtAlbProCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int ZZ252CliCod ;
   private int GXv_int5[] ;
   private long wcpOA30AlbProCod ;
   private long Z30AlbProCod ;
   private long A30AlbProCod ;
   private long GRID1_nFirstRecordOnPage ;
   private long ZZ30AlbProCod ;
   private java.math.BigDecimal Z1261BarAlbKgmE ;
   private java.math.BigDecimal Z1263BarAlbMtrE ;
   private java.math.BigDecimal Z1469AlbPrdPKg ;
   private java.math.BigDecimal Z1470AlbPrdPMt ;
   private java.math.BigDecimal Z1471PrdKgm ;
   private java.math.BigDecimal Z1472PrdMtr ;
   private java.math.BigDecimal Z4332ProPreRec ;
   private java.math.BigDecimal Z4333ProPorRec ;
   private java.math.BigDecimal AV32PreMtr ;
   private java.math.BigDecimal AV33PreKgm ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1469AlbPrdPKg ;
   private java.math.BigDecimal A1470AlbPrdPMt ;
   private java.math.BigDecimal A1471PrdKgm ;
   private java.math.BigDecimal A1472PrdMtr ;
   private java.math.BigDecimal A1473PrdImp ;
   private java.math.BigDecimal A4332ProPreRec ;
   private java.math.BigDecimal A4333ProPorRec ;
   private java.math.BigDecimal i1471PrdKgm ;
   private java.math.BigDecimal i1472PrdMtr ;
   private java.math.BigDecimal ZZ1261BarAlbKgmE ;
   private java.math.BigDecimal ZZ1263BarAlbMtrE ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal ZV32PreMtr ;
   private java.math.BigDecimal ZV33PreKgm ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z758ProCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String A212BarSer ;
   private String A130BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBarAlbKgmE_Internalname ;
   private String sGXsfl_75_idx="0001" ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtAlbPrdULin_Internalname ;
   private String edtAlbPrdULin_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtBarAlbKgmE_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtBarAlbMtrE_Internalname ;
   private String edtBarAlbMtrE_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtBarSer_Internalname ;
   private String edtBarSer_Jsonclick ;
   private String sMode210 ;
   private String edtavnRcdDeleted_210_Internalname ;
   private String edtAlbPrdLin_Internalname ;
   private String edtProCod_Internalname ;
   private String edtProDsc_Internalname ;
   private String edtAlbPrdPKg_Internalname ;
   private String edtAlbPrdPMt_Internalname ;
   private String edtPrdKgm_Internalname ;
   private String edtPrdMtr_Internalname ;
   private String edtPrdImp_Internalname ;
   private String edtProPreRec_Internalname ;
   private String edtProPorRec_Internalname ;
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
   private String AV35Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode195 ;
   private String GXCCtl ;
   private String A759ProDsc ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z212BarSer ;
   private String Z759ProDsc ;
   private String sGXsfl_75_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_210_Jsonclick ;
   private String edtAlbPrdLin_Jsonclick ;
   private String edtProCod_Jsonclick ;
   private String edtProDsc_Jsonclick ;
   private String edtAlbPrdPKg_Jsonclick ;
   private String edtAlbPrdPMt_Jsonclick ;
   private String edtPrdKgm_Jsonclick ;
   private String edtPrdMtr_Jsonclick ;
   private String edtPrdImp_Jsonclick ;
   private String edtProPreRec_Jsonclick ;
   private String edtProPorRec_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ407EmprNom ;
   private String ZZ212BarSer ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean n758ProCod ;
   private boolean wbErr ;
   private boolean n1467AlbPrdULin ;
   private boolean bGXsfl_75_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n1471PrdKgm ;
   private boolean n1472PrdMtr ;
   private boolean n1469AlbPrdPKg ;
   private boolean n1470AlbPrdPMt ;
   private boolean n4332ProPreRec ;
   private boolean n4333ProPorRec ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01KR9_A407EmprNom ;
   private boolean[] T01KR9_n407EmprNom ;
   private String[] T01KR10_A396EmprCod ;
   private int[] T01KR5_A252CliCod ;
   private boolean[] T01KR5_n252CliCod ;
   private String[] T01KR5_A212BarSer ;
   private String[] T01KR11_A407EmprNom ;
   private boolean[] T01KR11_n407EmprNom ;
   private short[] T01KR11_A1467AlbPrdULin ;
   private boolean[] T01KR11_n1467AlbPrdULin ;
   private java.math.BigDecimal[] T01KR11_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T01KR11_A1263BarAlbMtrE ;
   private String[] T01KR11_A212BarSer ;
   private String[] T01KR11_A396EmprCod ;
   private int[] T01KR11_A129BarCod ;
   private byte[] T01KR11_A132BarCodReo ;
   private String[] T01KR11_A130BarCodPar ;
   private long[] T01KR11_A30AlbProCod ;
   private int[] T01KR11_A252CliCod ;
   private boolean[] T01KR11_n252CliCod ;
   private String[] T01KR12_A396EmprCod ;
   private long[] T01KR12_A30AlbProCod ;
   private int[] T01KR12_A129BarCod ;
   private byte[] T01KR12_A132BarCodReo ;
   private String[] T01KR12_A130BarCodPar ;
   private short[] T01KR8_A1467AlbPrdULin ;
   private boolean[] T01KR8_n1467AlbPrdULin ;
   private java.math.BigDecimal[] T01KR8_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T01KR8_A1263BarAlbMtrE ;
   private String[] T01KR8_A396EmprCod ;
   private int[] T01KR8_A129BarCod ;
   private byte[] T01KR8_A132BarCodReo ;
   private String[] T01KR8_A130BarCodPar ;
   private long[] T01KR8_A30AlbProCod ;
   private String[] T01KR13_A396EmprCod ;
   private int[] T01KR13_A129BarCod ;
   private byte[] T01KR13_A132BarCodReo ;
   private String[] T01KR13_A130BarCodPar ;
   private long[] T01KR13_A30AlbProCod ;
   private String[] T01KR14_A396EmprCod ;
   private int[] T01KR14_A129BarCod ;
   private byte[] T01KR14_A132BarCodReo ;
   private String[] T01KR14_A130BarCodPar ;
   private long[] T01KR14_A30AlbProCod ;
   private short[] T01KR7_A1467AlbPrdULin ;
   private boolean[] T01KR7_n1467AlbPrdULin ;
   private java.math.BigDecimal[] T01KR7_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T01KR7_A1263BarAlbMtrE ;
   private String[] T01KR7_A396EmprCod ;
   private int[] T01KR7_A129BarCod ;
   private byte[] T01KR7_A132BarCodReo ;
   private String[] T01KR7_A130BarCodPar ;
   private long[] T01KR7_A30AlbProCod ;
   private String[] T01KR18_A396EmprCod ;
   private long[] T01KR18_A30AlbProCod ;
   private int[] T01KR18_A129BarCod ;
   private byte[] T01KR18_A132BarCodReo ;
   private String[] T01KR18_A130BarCodPar ;
   private short[] T01KR18_A6648AlbMetLin ;
   private String[] T01KR19_A396EmprCod ;
   private long[] T01KR19_A30AlbProCod ;
   private int[] T01KR19_A129BarCod ;
   private byte[] T01KR19_A132BarCodReo ;
   private String[] T01KR19_A130BarCodPar ;
   private short[] T01KR19_A9639Et_Numero ;
   private String[] T01KR20_A396EmprCod ;
   private long[] T01KR20_A30AlbProCod ;
   private int[] T01KR20_A129BarCod ;
   private byte[] T01KR20_A132BarCodReo ;
   private String[] T01KR20_A130BarCodPar ;
   private short[] T01KR20_A6622AlbHdRLn ;
   private String[] T01KR21_A396EmprCod ;
   private long[] T01KR21_A30AlbProCod ;
   private int[] T01KR21_A129BarCod ;
   private byte[] T01KR21_A132BarCodReo ;
   private String[] T01KR21_A130BarCodPar ;
   private short[] T01KR21_A5456P_ForLin ;
   private String[] T01KR22_A396EmprCod ;
   private long[] T01KR22_A30AlbProCod ;
   private int[] T01KR22_A129BarCod ;
   private byte[] T01KR22_A132BarCodReo ;
   private String[] T01KR22_A130BarCodPar ;
   private byte[] T01KR22_A2524DisComLin ;
   private String[] T01KR22_A1056DisComCod ;
   private String[] T01KR22_A1032FonCod ;
   private String[] T01KR23_A396EmprCod ;
   private long[] T01KR23_A3617AlbTrnCod ;
   private long[] T01KR23_A30AlbProCod ;
   private int[] T01KR23_A129BarCod ;
   private byte[] T01KR23_A132BarCodReo ;
   private String[] T01KR23_A130BarCodPar ;
   private String[] T01KR24_A396EmprCod ;
   private long[] T01KR24_A30AlbProCod ;
   private int[] T01KR24_A129BarCod ;
   private byte[] T01KR24_A132BarCodReo ;
   private String[] T01KR24_A130BarCodPar ;
   private short[] T01KR24_A3621AlbPckLin ;
   private String[] T01KR25_A396EmprCod ;
   private long[] T01KR25_A30AlbProCod ;
   private int[] T01KR25_A129BarCod ;
   private byte[] T01KR25_A132BarCodReo ;
   private String[] T01KR25_A130BarCodPar ;
   private short[] T01KR25_A2764AlbHdrLin ;
   private String[] T01KR26_A396EmprCod ;
   private long[] T01KR26_A30AlbProCod ;
   private int[] T01KR26_A129BarCod ;
   private byte[] T01KR26_A132BarCodReo ;
   private String[] T01KR26_A130BarCodPar ;
   private String[] T01KR26_A200BarPieCod ;
   private String[] T01KR27_A396EmprCod ;
   private long[] T01KR27_A30AlbProCod ;
   private int[] T01KR27_A129BarCod ;
   private byte[] T01KR27_A132BarCodReo ;
   private String[] T01KR27_A130BarCodPar ;
   private short[] T01KR27_A1240GuiFasLin ;
   private String[] T01KR29_A396EmprCod ;
   private long[] T01KR29_A30AlbProCod ;
   private int[] T01KR29_A129BarCod ;
   private byte[] T01KR29_A132BarCodReo ;
   private String[] T01KR29_A130BarCodPar ;
   private int[] T01KR30_A252CliCod ;
   private boolean[] T01KR30_n252CliCod ;
   private int[] T01KR31_A252CliCod ;
   private boolean[] T01KR31_n252CliCod ;
   private long[] T01KR31_A30AlbProCod ;
   private short[] T01KR31_A1468AlbPrdLin ;
   private java.math.BigDecimal[] T01KR31_A1469AlbPrdPKg ;
   private boolean[] T01KR31_n1469AlbPrdPKg ;
   private java.math.BigDecimal[] T01KR31_A1470AlbPrdPMt ;
   private boolean[] T01KR31_n1470AlbPrdPMt ;
   private java.math.BigDecimal[] T01KR31_A1471PrdKgm ;
   private boolean[] T01KR31_n1471PrdKgm ;
   private java.math.BigDecimal[] T01KR31_A1472PrdMtr ;
   private boolean[] T01KR31_n1472PrdMtr ;
   private String[] T01KR31_A759ProDsc ;
   private java.math.BigDecimal[] T01KR31_A4332ProPreRec ;
   private boolean[] T01KR31_n4332ProPreRec ;
   private java.math.BigDecimal[] T01KR31_A4333ProPorRec ;
   private boolean[] T01KR31_n4333ProPorRec ;
   private String[] T01KR31_A396EmprCod ;
   private int[] T01KR31_A129BarCod ;
   private byte[] T01KR31_A132BarCodReo ;
   private String[] T01KR31_A130BarCodPar ;
   private String[] T01KR31_A758ProCod ;
   private boolean[] T01KR31_n758ProCod ;
   private String[] T01KR4_A759ProDsc ;
   private String[] T01KR6_A396EmprCod ;
   private String[] T01KR32_A759ProDsc ;
   private String[] T01KR33_A396EmprCod ;
   private String[] T01KR34_A396EmprCod ;
   private long[] T01KR34_A30AlbProCod ;
   private int[] T01KR34_A129BarCod ;
   private byte[] T01KR34_A132BarCodReo ;
   private String[] T01KR34_A130BarCodPar ;
   private short[] T01KR34_A1468AlbPrdLin ;
   private long[] T01KR3_A30AlbProCod ;
   private short[] T01KR3_A1468AlbPrdLin ;
   private java.math.BigDecimal[] T01KR3_A1469AlbPrdPKg ;
   private boolean[] T01KR3_n1469AlbPrdPKg ;
   private java.math.BigDecimal[] T01KR3_A1470AlbPrdPMt ;
   private boolean[] T01KR3_n1470AlbPrdPMt ;
   private java.math.BigDecimal[] T01KR3_A1471PrdKgm ;
   private boolean[] T01KR3_n1471PrdKgm ;
   private java.math.BigDecimal[] T01KR3_A1472PrdMtr ;
   private boolean[] T01KR3_n1472PrdMtr ;
   private java.math.BigDecimal[] T01KR3_A4332ProPreRec ;
   private boolean[] T01KR3_n4332ProPreRec ;
   private java.math.BigDecimal[] T01KR3_A4333ProPorRec ;
   private boolean[] T01KR3_n4333ProPorRec ;
   private String[] T01KR3_A396EmprCod ;
   private int[] T01KR3_A129BarCod ;
   private byte[] T01KR3_A132BarCodReo ;
   private String[] T01KR3_A130BarCodPar ;
   private String[] T01KR3_A758ProCod ;
   private boolean[] T01KR3_n758ProCod ;
   private long[] T01KR2_A30AlbProCod ;
   private short[] T01KR2_A1468AlbPrdLin ;
   private java.math.BigDecimal[] T01KR2_A1469AlbPrdPKg ;
   private boolean[] T01KR2_n1469AlbPrdPKg ;
   private java.math.BigDecimal[] T01KR2_A1470AlbPrdPMt ;
   private boolean[] T01KR2_n1470AlbPrdPMt ;
   private java.math.BigDecimal[] T01KR2_A1471PrdKgm ;
   private boolean[] T01KR2_n1471PrdKgm ;
   private java.math.BigDecimal[] T01KR2_A1472PrdMtr ;
   private boolean[] T01KR2_n1472PrdMtr ;
   private java.math.BigDecimal[] T01KR2_A4332ProPreRec ;
   private boolean[] T01KR2_n4332ProPreRec ;
   private java.math.BigDecimal[] T01KR2_A4333ProPorRec ;
   private boolean[] T01KR2_n4333ProPorRec ;
   private String[] T01KR2_A396EmprCod ;
   private int[] T01KR2_A129BarCod ;
   private byte[] T01KR2_A132BarCodReo ;
   private String[] T01KR2_A130BarCodPar ;
   private String[] T01KR2_A758ProCod ;
   private boolean[] T01KR2_n758ProCod ;
   private String[] T01KR38_A759ProDsc ;
   private String[] T01KR39_A396EmprCod ;
   private long[] T01KR39_A30AlbProCod ;
   private int[] T01KR39_A129BarCod ;
   private byte[] T01KR39_A132BarCodReo ;
   private String[] T01KR39_A130BarCodPar ;
   private short[] T01KR39_A1468AlbPrdLin ;
   private String[] T01KR40_A407EmprNom ;
   private boolean[] T01KR40_n407EmprNom ;
   private String[] T01KR41_A396EmprCod ;
   private String[] T01KR42_A212BarSer ;
   private int[] T01KR42_A252CliCod ;
   private boolean[] T01KR42_n252CliCod ;
   private String[] T01KR43_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttrn01__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn01__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn01__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn01__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01KR2", "SELECT AlbProCod, AlbPrdLin, AlbPrdPKg, AlbPrdPMt, PrdKgm, PrdMtr, ProPreRec, ProPorRec, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPALBPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbPrdLin = ?  FOR UPDATE OF AlbPrdPKg, AlbPrdPMt, PrdKgm, PrdMtr, ProPreRec, ProPorRec, ProCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KR3", "SELECT AlbProCod, AlbPrdLin, AlbPrdPKg, AlbPrdPMt, PrdKgm, PrdMtr, ProPreRec, ProPorRec, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPALBPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbPrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KR4", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KR5", "SELECT CliCod, BarSer FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KR6", "SELECT EmprCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KR7", "SELECT AlbPrdULin, BarAlbKgmE, BarAlbMtrE, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF AlbPrdULin, BarAlbKgmE, BarAlbMtrE NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KR8", "SELECT AlbPrdULin, BarAlbKgmE, BarAlbMtrE, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KR9", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KR10", "SELECT EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KR11", "SELECT /*+ FIRST_ROWS(1) */ T2.EmprNom, TM1.AlbPrdULin, TM1.BarAlbKgmE, TM1.BarAlbMtrE, T3.BarSer, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.AlbProCod, T3.CliCod FROM ((TXPALBBAR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.AlbProCod = ? ORDER BY TM1.EmprCod, TM1.AlbProCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KR12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KR13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KR14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and AlbProCod = ? ORDER BY EmprCod DESC, AlbProCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01KR15", "INSERT INTO TXPALBBAR(AlbPrdULin, BarAlbKgmE, BarAlbMtrE, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod, AlbProEsp, AlbProRec, TubCod, BarAlbPie, BarAlbTub, GuiFasULin, BarPreKgm, BarPreMtr, AlbPConPie, BarAlbBul, BarAlbTar, BarAlbFor, BarAlbTip, BarAlbPN, IntCod, BarAlbPbr, ManCod, BarFasExt, BarFasExtD, BarAlbObs, BarAlbExt, BarAlbTin, AlbHdrObs, AlbBarRec, AlbBarDto, AlbHdrUlin, AlbProVal, AlbTipCon, AlbHdrAnc, CodCod, AlbSer, AlbColNom, AlbColNum, AlbTipCol, AlbPckUlin, AlbEncCli, AlbHdrgm2, TipAcaCod, AlbTipEnt, AlbImpMan, P_ForULin, PlasCod, BarAlbPlas, AlbHdRUl, AlbObsM, BarPreFKg, BarPreFMt, BarPreTKg, BarPreTMt, AlbEncL, AlbEncA, AlbCald, AlbDf1, AlbDf2, AlbDf3, AlbMqTj, AlbDto, AlbSerD, Et_UltNum, BarKgsCli, AlbMetULi, AlbCliCod, BarPreUnd, BarAlbUnd, AlbNomCli, AlbNumcli, AlbTipArt, AlbCadEnc, AlbTiras, AlbTirasKg, AlbSinTest) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPALBBAR")
         ,new UpdateCursor("T01KR16", "UPDATE TXPALBBAR SET AlbPrdULin=?, BarAlbKgmE=?, BarAlbMtrE=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new UpdateCursor("T01KR17", "DELETE FROM TXPALBBAR  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new ForEachCursor("T01KR18", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbMetLin FROM TXPMETCAL WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KR19", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, Et_Numero FROM TXPEDIETI WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KR20", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KR21", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, P_ForLin FROM TXPALBQUI WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KR22", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPALBEST WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KR23", "SELECT * FROM (SELECT EmprCod, AlbTrnCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPLALBTR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KR24", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPckLin FROM TXPALBPCK WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KR25", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin FROM TXPALBTXT WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KR26", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KR27", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01KR28", "UPDATE TXPALBBAR SET AlbPrdULin=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new ForEachCursor("T01KR29", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KR30", "SELECT CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KR31", "SELECT T2.CliCod, T1.AlbProCod, T1.AlbPrdLin, T1.AlbPrdPKg, T1.AlbPrdPMt, T1.PrdKgm, T1.PrdMtr, T3.ProDsc, T1.ProPreRec, T1.ProPorRec, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod FROM ((TXPALBPRD T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ProCod) WHERE T1.AlbProCod = ? and T1.AlbPrdLin = ? and T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbPrdLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KR32", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KR33", "SELECT EmprCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KR34", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPrdLin FROM TXPALBPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbPrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01KR35", "INSERT INTO TXPALBPRD(AlbProCod, AlbPrdLin, AlbPrdPKg, AlbPrdPMt, PrdKgm, PrdMtr, ProPreRec, ProPorRec, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, AlbPrdDcK, AlbPrdDcM, AlbPrdCli) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0)", GX_NOMASK, "TXPALBPRD")
         ,new UpdateCursor("T01KR36", "UPDATE TXPALBPRD SET AlbPrdPKg=?, AlbPrdPMt=?, PrdKgm=?, PrdMtr=?, ProPreRec=?, ProPorRec=?, ProCod=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbPrdLin = ?", GX_NOMASK, "TXPALBPRD")
         ,new UpdateCursor("T01KR37", "DELETE FROM TXPALBPRD  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbPrdLin = ?", GX_NOMASK, "TXPALBPRD")
         ,new ForEachCursor("T01KR38", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KR39", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPrdLin FROM TXPALBPRD WHERE AlbProCod = ? and EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPrdLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KR40", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KR41", "SELECT EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KR42", "SELECT BarSer, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KR43", "SELECT EmprCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 3);
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((byte[]) buf[16])[0] = rslt.getByte(11);
               ((String[]) buf[17])[0] = rslt.getString(12, 1);
               ((String[]) buf[18])[0] = rslt.getString(13, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 3);
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((byte[]) buf[16])[0] = rslt.getByte(11);
               ((String[]) buf[17])[0] = rslt.getString(12, 1);
               ((String[]) buf[18])[0] = rslt.getString(13, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((long[]) buf[8])[0] = rslt.getLong(8);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((long[]) buf[8])[0] = rslt.getLong(8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((long[]) buf[11])[0] = rslt.getLong(10);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
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
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 28 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 40);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 3);
               ((int[]) buf[18])[0] = rslt.getInt(12);
               ((byte[]) buf[19])[0] = rslt.getByte(13);
               ((String[]) buf[20])[0] = rslt.getString(14, 1);
               ((String[]) buf[21])[0] = rslt.getString(15, 8);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
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
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 41 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
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
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(4, (String)parms[4], 3);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 1);
               stmt.setLong(8, ((Number) parms[8]).longValue());
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
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(4, (String)parms[4], 3);
               stmt.setLong(5, ((Number) parms[5]).longValue());
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setString(8, (String)parms[8], 1);
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
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 29 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 33 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 5);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 5);
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
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[11], 5);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[13], 2);
               }
               stmt.setString(9, (String)parms[14], 3);
               stmt.setInt(10, ((Number) parms[15]).intValue());
               stmt.setByte(11, ((Number) parms[16]).byteValue());
               stmt.setString(12, (String)parms[17], 1);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[19], 8);
               }
               return;
            case 34 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
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
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 5);
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
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 8);
               }
               stmt.setString(8, (String)parms[14], 3);
               stmt.setLong(9, ((Number) parms[15]).longValue());
               stmt.setInt(10, ((Number) parms[16]).intValue());
               stmt.setByte(11, ((Number) parms[17]).byteValue());
               stmt.setString(12, (String)parms[18], 1);
               stmt.setShort(13, ((Number) parms[19]).shortValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 37 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               return;
      }
   }

}

