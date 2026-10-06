package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttaes02_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_12( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A2144UniEstCod = httpContext.GetPar( "UniEstCod") ;
         n2144UniEstCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A2144UniEstCod) ;
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
            A11634TaesId = httpContext.GetPar( "TaesId") ;
            httpContext.ajax_rsp_assign_attri("", false, "A11634TaesId", A11634TaesId);
            A11635TaesDc = httpContext.GetPar( "TaesDc") ;
            n11635TaesDc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11635TaesDc", A11635TaesDc);
            A11637TaesLn = (short)(GXutil.lval( httpContext.GetPar( "TaesLn"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11637TaesLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11637TaesLn), 4, 0));
            A11638TaesVi = CommonUtil.decimalVal( httpContext.GetPar( "TaesVi"), ".") ;
            n11638TaesVi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11638TaesVi", GXutil.ltrimstr( A11638TaesVi, 10, 3));
            A11639TaesVf = CommonUtil.decimalVal( httpContext.GetPar( "TaesVf"), ".") ;
            n11639TaesVf = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11639TaesVf", GXutil.ltrimstr( A11639TaesVf, 10, 3));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TABLAS DE DOSIFICACION Productos", ""), (short)(0)) ;
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
      A11640TaesUltLnP = (short)(GXutil.lval( httpContext.GetPar( "TaesUltLnP"))) ;
      n11640TaesUltLnP = false ;
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

   public ttaes02_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttaes02_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttaes02_impl.class ));
   }

   public ttaes02_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTAES02.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTAES02.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTAES02.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTAES02.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTAES02.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTAES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTAES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTAES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTAES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTAES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTaesId_Internalname, GXutil.rtrim( A11634TaesId), GXutil.rtrim( localUtil.format( A11634TaesId, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTaesId_Jsonclick, 0, "", "", "", "", "", 1, edtTaesId_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTAES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTAES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTaesDc_Internalname, GXutil.rtrim( A11635TaesDc), GXutil.rtrim( localUtil.format( A11635TaesDc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTaesDc_Jsonclick, 0, "", "", "", "", "", 1, edtTaesDc_Enabled, 0, "text", "", 80, "chr", 1, "row", 80, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTAES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Lineas", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTAES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTaesLn_Internalname, GXutil.ltrim( localUtil.ntoc( A11637TaesLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTaesLn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11637TaesLn), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11637TaesLn), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTaesLn_Jsonclick, 0, "", "", "", "", "", 1, edtTaesLn_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTAES02.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTAES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Valor Inicial (GRAMOS)", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTAES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTaesVi_Internalname, GXutil.ltrim( localUtil.ntoc( A11638TaesVi, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTaesVi_Enabled!=0) ? localUtil.format( A11638TaesVi, "ZZZZZ9.999") : localUtil.format( A11638TaesVi, "ZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTaesVi_Jsonclick, 0, "", "", "", "", "", 1, edtTaesVi_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTAES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Valor Final (GRAMOS)", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTAES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTaesVf_Internalname, GXutil.ltrim( localUtil.ntoc( A11639TaesVf, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTaesVf_Enabled!=0) ? localUtil.format( A11639TaesVf, "ZZZZZ9.999") : localUtil.format( A11639TaesVf, "ZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTaesVf_Jsonclick, 0, "", "", "", "", "", 1, edtTaesVf_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTAES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Ultima Linea Productos", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTAES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTaesUltLnP_Internalname, GXutil.ltrim( localUtil.ntoc( A11640TaesUltLnP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTaesUltLnP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11640TaesUltLnP), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11640TaesUltLnP), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTaesUltLnP_Jsonclick, 0, "", "", "", "", "", 1, edtTaesUltLnP_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTAES02.htm");
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
         nBlankRcdCount1546 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1546 = (short)(1) ;
            scanStart1EM1546( ) ;
            while ( RcdFound1546 != 0 )
            {
               init_level_properties1546( ) ;
               getByPrimaryKey1EM1546( ) ;
               addRow1EM1546( ) ;
               scanNext1EM1546( ) ;
            }
            scanEnd1EM1546( ) ;
            nBlankRcdCount1546 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B11640TaesUltLnP = A11640TaesUltLnP ;
         n11640TaesUltLnP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
         standaloneNotModal1EM1546( ) ;
         standaloneModal1EM1546( ) ;
         sMode1546 = Gx_mode ;
         while ( nGXsfl_60_idx < nRC_GXsfl_60 )
         {
            bGXsfl_60_Refreshing = true ;
            readRow1EM1546( ) ;
            edtavnRcdDeleted_1546_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1546_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1546_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1546_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtTaesLnP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAESLNP_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTaesLnP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesLnP_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtTaesCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAESCANT_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTaesCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesCant_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtUniEstCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UNIESTCOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtUniEstCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUniEstCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            if ( ( nRcdExists_1546 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1EM1546( ) ;
            }
            sendRow1EM1546( ) ;
            bGXsfl_60_Refreshing = false ;
         }
         Gx_mode = sMode1546 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A11640TaesUltLnP = B11640TaesUltLnP ;
         n11640TaesUltLnP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1546 = (short)(5) ;
         nRcdExists_1546 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1EM1546( ) ;
            while ( RcdFound1546 != 0 )
            {
               sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_601546( ) ;
               init_level_properties1546( ) ;
               standaloneNotModal1EM1546( ) ;
               getByPrimaryKey1EM1546( ) ;
               standaloneModal1EM1546( ) ;
               addRow1EM1546( ) ;
               scanNext1EM1546( ) ;
            }
            scanEnd1EM1546( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1546 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_601546( ) ;
      initAll1EM1546( ) ;
      init_level_properties1546( ) ;
      B11640TaesUltLnP = A11640TaesUltLnP ;
      n11640TaesUltLnP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
      nRcdExists_1546 = (short)(0) ;
      nIsMod_1546 = (short)(0) ;
      nRcdDeleted_1546 = (short)(0) ;
      nBlankRcdCount1546 = (short)(nBlankRcdUsr1546+nBlankRcdCount1546) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1546 > 0 )
      {
         standaloneNotModal1EM1546( ) ;
         standaloneModal1EM1546( ) ;
         addRow1EM1546( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtTaesLnP_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1546 = (short)(nBlankRcdCount1546-1) ;
      }
      Gx_mode = sMode1546 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A11640TaesUltLnP = B11640TaesUltLnP ;
      n11640TaesUltLnP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTAES02.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTAES02.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTAES02.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTAES02.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTAES02.htm");
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
      e111EM2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z11634TaesId = httpContext.cgiGet( "Z11634TaesId") ;
            Z11637TaesLn = (short)(localUtil.ctol( httpContext.cgiGet( "Z11637TaesLn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11640TaesUltLnP = (short)(localUtil.ctol( httpContext.cgiGet( "Z11640TaesUltLnP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O11640TaesUltLnP = (short)(localUtil.ctol( httpContext.cgiGet( "O11640TaesUltLnP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_60 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_60"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV34Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Modif = httpContext.cgiGet( "vMODIF") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A11634TaesId = httpContext.cgiGet( edtTaesId_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11634TaesId", A11634TaesId);
            A11635TaesDc = httpContext.cgiGet( edtTaesDc_Internalname) ;
            n11635TaesDc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11635TaesDc", A11635TaesDc);
            A11637TaesLn = (short)(localUtil.ctol( httpContext.cgiGet( edtTaesLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11637TaesLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11637TaesLn), 4, 0));
            A11638TaesVi = localUtil.ctond( httpContext.cgiGet( edtTaesVi_Internalname)) ;
            n11638TaesVi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11638TaesVi", GXutil.ltrimstr( A11638TaesVi, 10, 3));
            A11639TaesVf = localUtil.ctond( httpContext.cgiGet( edtTaesVf_Internalname)) ;
            n11639TaesVf = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11639TaesVf", GXutil.ltrimstr( A11639TaesVf, 10, 3));
            A11640TaesUltLnP = (short)(localUtil.ctol( httpContext.cgiGet( edtTaesUltLnP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11640TaesUltLnP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
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
               A11634TaesId = httpContext.GetPar( "TaesId") ;
               httpContext.ajax_rsp_assign_attri("", false, "A11634TaesId", A11634TaesId);
               A11637TaesLn = (short)(GXutil.lval( httpContext.GetPar( "TaesLn"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11637TaesLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11637TaesLn), 4, 0));
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
                        e111EM2 ();
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
            initAll1EM1545( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1546_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1546_Enabled), 5, 0), !bGXsfl_60_Refreshing);
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
      disableAttributes1EM1545( ) ;
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

   public void confirm_1EM0( )
   {
      beforeValidate1EM1545( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1EM1545( ) ;
         }
         else
         {
            checkExtendedTable1EM1545( ) ;
            if ( AnyError == 0 )
            {
               zm1EM1545( 9) ;
               zm1EM1545( 10) ;
            }
            closeExtendedTableCursors1EM1545( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1545 = Gx_mode ;
         confirm_1EM1546( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1545 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1545 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1EM0( ) ;
      }
   }

   public void confirm_1EM1546( )
   {
      s11640TaesUltLnP = O11640TaesUltLnP ;
      n11640TaesUltLnP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow1EM1546( ) ;
         if ( ( nRcdExists_1546 != 0 ) || ( nIsMod_1546 != 0 ) )
         {
            getKey1EM1546( ) ;
            if ( ( nRcdExists_1546 == 0 ) && ( nRcdDeleted_1546 == 0 ) )
            {
               if ( RcdFound1546 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1EM1546( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1EM1546( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1EM1546( 12) ;
                        zm1EM1546( 13) ;
                     }
                     closeExtendedTableCursors1EM1546( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O11640TaesUltLnP = A11640TaesUltLnP ;
                     n11640TaesUltLnP = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "TAESLNP_" + sGXsfl_60_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTaesLnP_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1546 != 0 )
               {
                  if ( nRcdDeleted_1546 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1EM1546( ) ;
                     load1EM1546( ) ;
                     beforeValidate1EM1546( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1EM1546( ) ;
                        O11640TaesUltLnP = A11640TaesUltLnP ;
                        n11640TaesUltLnP = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1546 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1EM1546( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1EM1546( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1EM1546( 12) ;
                              zm1EM1546( 13) ;
                           }
                           closeExtendedTableCursors1EM1546( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O11640TaesUltLnP = A11640TaesUltLnP ;
                           n11640TaesUltLnP = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1546 == 0 )
                  {
                     GXCCtl = "TAESLNP_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTaesLnP_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1546_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1546, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTaesLnP_Internalname, GXutil.ltrim( localUtil.ntoc( A11641TaesLnP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtTaesCant_Internalname, GXutil.ltrim( localUtil.ntoc( A11642TaesCant, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtUniEstCod_Internalname, GXutil.rtrim( A2144UniEstCod)) ;
         httpContext.changePostValue( "ZT_"+"Z11641TaesLnP_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z11641TaesLnP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11642TaesCant_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z11642TaesCant, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_60_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z2144UniEstCod_"+sGXsfl_60_idx, GXutil.rtrim( Z2144UniEstCod)) ;
         httpContext.changePostValue( "T11642TaesCant_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O11642TaesCant, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T719PrdNum_"+sGXsfl_60_idx, GXutil.rtrim( O719PrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_1546_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1546, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1546_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1546, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1546_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1546, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1546 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1546_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1546_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAESLNP_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesLnP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAESCANT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UNIESTCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUniEstCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O11640TaesUltLnP = s11640TaesUltLnP ;
      n11640TaesUltLnP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1EM0( )
   {
   }

   public void e111EM2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttaes02_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV34Pgmname, (byte)(99), GXv_char2) ;
      ttaes02_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttaes02_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttaes02_impl.this.A396EmprCod = GXv_char2[0] ;
      ttaes02_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttaes02_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1EM1545( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11640TaesUltLnP = T01EM7_A11640TaesUltLnP[0] ;
         }
         else
         {
            Z11640TaesUltLnP = A11640TaesUltLnP ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z11637TaesLn = A11637TaesLn ;
         Z11638TaesVi = A11638TaesVi ;
         Z11639TaesVf = A11639TaesVf ;
         Z11640TaesUltLnP = A11640TaesUltLnP ;
         Z396EmprCod = A396EmprCod ;
         Z11634TaesId = A11634TaesId ;
         Z407EmprNom = A407EmprNom ;
         Z11635TaesDc = A11635TaesDc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtTaesUltLnP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesUltLnP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesUltLnP_Enabled), 5, 0), true);
      AV34Pgmname = "TTAES02" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtTaesUltLnP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesUltLnP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesUltLnP_Enabled), 5, 0), true);
      /* Using cursor T01EM8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01EM8_A407EmprNom[0] ;
      n407EmprNom = T01EM8_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(6);
      /* Using cursor T01EM9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A11634TaesId});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TABLAS DE DOSIFICACION", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TAESID");
         AnyError = (short)(1) ;
      }
      pr_default.close(7);
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

   public void load1EM1545( )
   {
      /* Using cursor T01EM10 */
      pr_default.execute(8, new Object[] {Short.valueOf(A11637TaesLn), Boolean.valueOf(n11638TaesVi), A11638TaesVi, Boolean.valueOf(n11639TaesVf), A11639TaesVf, A396EmprCod, A11634TaesId});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1545 = (short)(1) ;
         A407EmprNom = T01EM10_A407EmprNom[0] ;
         n407EmprNom = T01EM10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A11640TaesUltLnP = T01EM10_A11640TaesUltLnP[0] ;
         n11640TaesUltLnP = T01EM10_n11640TaesUltLnP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
         zm1EM1545( -8) ;
      }
      pr_default.close(8);
      onLoadActions1EM1545( ) ;
   }

   public void onLoadActions1EM1545( )
   {
      if ( 1 < 0 )
      {
         AV8UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      }
   }

   public void checkExtendedTable1EM1545( )
   {
      nIsDirty_1545 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( 1 < 0 )
      {
         AV8UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      }
   }

   public void closeExtendedTableCursors1EM1545( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1EM1545( )
   {
      /* Using cursor T01EM11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A11634TaesId, Short.valueOf(A11637TaesLn)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1545 = (short)(1) ;
      }
      else
      {
         RcdFound1545 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01EM7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A11634TaesId, Short.valueOf(A11637TaesLn)});
      if ( (pr_default.getStatus(5) != 101) && ( T01EM7_A11637TaesLn[0] == A11637TaesLn ) && ( DecimalUtil.compareTo(T01EM7_A11638TaesVi[0], A11638TaesVi) == 0 ) && ( DecimalUtil.compareTo(T01EM7_A11639TaesVf[0], A11639TaesVf) == 0 ) && ( GXutil.strcmp(T01EM7_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01EM7_A11634TaesId[0], A11634TaesId) == 0 ) )
      {
         zm1EM1545( 8) ;
         RcdFound1545 = (short)(1) ;
         A11640TaesUltLnP = T01EM7_A11640TaesUltLnP[0] ;
         n11640TaesUltLnP = T01EM7_n11640TaesUltLnP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
         O11640TaesUltLnP = A11640TaesUltLnP ;
         n11640TaesUltLnP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z11634TaesId = A11634TaesId ;
         Z11637TaesLn = A11637TaesLn ;
         sMode1545 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1EM1545( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1545 = (short)(0) ;
            initializeNonKey1EM1545( ) ;
         }
         Gx_mode = sMode1545 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1545 = (short)(0) ;
         initializeNonKey1EM1545( ) ;
         sMode1545 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1545 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey1EM1545( ) ;
      if ( RcdFound1545 == 0 )
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
      RcdFound1545 = (short)(0) ;
      /* Using cursor T01EM12 */
      pr_default.execute(10, new Object[] {Short.valueOf(A11637TaesLn), Boolean.valueOf(n11638TaesVi), A11638TaesVi, Boolean.valueOf(n11639TaesVf), A11639TaesVf, A396EmprCod, A11634TaesId});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( T01EM12_A11637TaesLn[0] == A11637TaesLn ) && ( DecimalUtil.compareTo(T01EM12_A11638TaesVi[0], A11638TaesVi) == 0 ) && ( DecimalUtil.compareTo(T01EM12_A11639TaesVf[0], A11639TaesVf) == 0 ) && ( GXutil.strcmp(T01EM12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01EM12_A11634TaesId[0], A11634TaesId) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( T01EM12_A11637TaesLn[0] == A11637TaesLn ) && ( DecimalUtil.compareTo(T01EM12_A11638TaesVi[0], A11638TaesVi) == 0 ) && ( DecimalUtil.compareTo(T01EM12_A11639TaesVf[0], A11639TaesVf) == 0 ) && ( GXutil.strcmp(T01EM12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01EM12_A11634TaesId[0], A11634TaesId) == 0 ) )
         {
            RcdFound1545 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound1545 = (short)(0) ;
      /* Using cursor T01EM13 */
      pr_default.execute(11, new Object[] {Short.valueOf(A11637TaesLn), Boolean.valueOf(n11638TaesVi), A11638TaesVi, Boolean.valueOf(n11639TaesVf), A11639TaesVf, A396EmprCod, A11634TaesId});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( T01EM13_A11637TaesLn[0] == A11637TaesLn ) && ( DecimalUtil.compareTo(T01EM13_A11638TaesVi[0], A11638TaesVi) == 0 ) && ( DecimalUtil.compareTo(T01EM13_A11639TaesVf[0], A11639TaesVf) == 0 ) && ( GXutil.strcmp(T01EM13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01EM13_A11634TaesId[0], A11634TaesId) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( T01EM13_A11637TaesLn[0] == A11637TaesLn ) && ( DecimalUtil.compareTo(T01EM13_A11638TaesVi[0], A11638TaesVi) == 0 ) && ( DecimalUtil.compareTo(T01EM13_A11639TaesVf[0], A11639TaesVf) == 0 ) && ( GXutil.strcmp(T01EM13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01EM13_A11634TaesId[0], A11634TaesId) == 0 ) )
         {
            RcdFound1545 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1EM1545( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A11640TaesUltLnP = O11640TaesUltLnP ;
         n11640TaesUltLnP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
         insert1EM1545( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1545 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11634TaesId, Z11634TaesId) != 0 ) || ( A11637TaesLn != Z11637TaesLn ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A11640TaesUltLnP = O11640TaesUltLnP ;
               n11640TaesUltLnP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A11640TaesUltLnP = O11640TaesUltLnP ;
               n11640TaesUltLnP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
               update1EM1545( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11634TaesId, Z11634TaesId) != 0 ) || ( A11637TaesLn != Z11637TaesLn ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A11640TaesUltLnP = O11640TaesUltLnP ;
               n11640TaesUltLnP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
               insert1EM1545( ) ;
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
                  A11640TaesUltLnP = O11640TaesUltLnP ;
                  n11640TaesUltLnP = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
                  insert1EM1545( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11634TaesId, Z11634TaesId) != 0 ) || ( A11637TaesLn != Z11637TaesLn ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A11640TaesUltLnP = O11640TaesUltLnP ;
         n11640TaesUltLnP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
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
      getKey1EM1545( ) ;
      if ( RcdFound1545 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11634TaesId, Z11634TaesId) != 0 ) || ( A11637TaesLn != Z11637TaesLn ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11634TaesId, Z11634TaesId) != 0 ) || ( A11637TaesLn != Z11637TaesLn ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttaes02");
   }

   public void insert_check( )
   {
      confirm_1EM0( ) ;
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
      if ( RcdFound1545 == 0 )
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
      scanStart1EM1545( ) ;
      if ( RcdFound1545 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1EM1545( ) ;
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
      if ( RcdFound1545 == 0 )
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
      if ( RcdFound1545 == 0 )
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
      scanStart1EM1545( ) ;
      if ( RcdFound1545 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1545 != 0 )
         {
            scanNext1EM1545( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1EM1545( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1EM1545( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01EM6 */
         pr_default.execute(4, new Object[] {A396EmprCod, A11634TaesId, Short.valueOf(A11637TaesLn)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTAES01"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) || ( Z11640TaesUltLnP != T01EM6_A11640TaesUltLnP[0] ) )
         {
            if ( Z11640TaesUltLnP != T01EM6_A11640TaesUltLnP[0] )
            {
               GXutil.writeLogln("ttaes02:[seudo value changed for attri]"+"TaesUltLnP");
               GXutil.writeLogRaw("Old: ",Z11640TaesUltLnP);
               GXutil.writeLogRaw("Current: ",T01EM6_A11640TaesUltLnP[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTAES01"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1EM1545( )
   {
      beforeValidate1EM1545( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EM1545( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1EM1545( 0) ;
         checkOptimisticConcurrency1EM1545( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1EM1545( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1EM1545( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EM14 */
                  pr_default.execute(12, new Object[] {Short.valueOf(A11637TaesLn), Boolean.valueOf(n11638TaesVi), A11638TaesVi, Boolean.valueOf(n11639TaesVf), A11639TaesVf, Boolean.valueOf(n11640TaesUltLnP), Short.valueOf(A11640TaesUltLnP), A396EmprCod, A11634TaesId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTAES01");
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
                        processLevel1EM1545( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1EM0( ) ;
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
            load1EM1545( ) ;
         }
         endLevel1EM1545( ) ;
      }
      closeExtendedTableCursors1EM1545( ) ;
   }

   public void update1EM1545( )
   {
      beforeValidate1EM1545( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EM1545( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1EM1545( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1EM1545( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1EM1545( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EM15 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n11638TaesVi), A11638TaesVi, Boolean.valueOf(n11639TaesVf), A11639TaesVf, Boolean.valueOf(n11640TaesUltLnP), Short.valueOf(A11640TaesUltLnP), A396EmprCod, A11634TaesId, Short.valueOf(A11637TaesLn)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTAES01");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTAES01"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1EM1545( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1EM1545( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1EM0( ) ;
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
         endLevel1EM1545( ) ;
      }
      closeExtendedTableCursors1EM1545( ) ;
   }

   public void deferredUpdate1EM1545( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1EM1545( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1EM1545( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1EM1545( ) ;
         afterConfirm1EM1545( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1EM1545( ) ;
            if ( AnyError == 0 )
            {
               A11640TaesUltLnP = O11640TaesUltLnP ;
               n11640TaesUltLnP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
               scanStart1EM1546( ) ;
               while ( RcdFound1546 != 0 )
               {
                  getByPrimaryKey1EM1546( ) ;
                  delete1EM1546( ) ;
                  scanNext1EM1546( ) ;
                  O11640TaesUltLnP = A11640TaesUltLnP ;
                  n11640TaesUltLnP = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
               }
               scanEnd1EM1546( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EM16 */
                  pr_default.execute(14, new Object[] {A396EmprCod, A11634TaesId, Short.valueOf(A11637TaesLn)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTAES01");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1545 == 0 )
                        {
                           initAll1EM1545( ) ;
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
                        resetCaption1EM0( ) ;
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
      sMode1545 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1EM1545( ) ;
      Gx_mode = sMode1545 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1EM1545( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( 1 < 0 )
         {
            AV8UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
         }
      }
   }

   public void processNestedLevel1EM1546( )
   {
      s11640TaesUltLnP = O11640TaesUltLnP ;
      n11640TaesUltLnP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow1EM1546( ) ;
         if ( ( nRcdExists_1546 != 0 ) || ( nIsMod_1546 != 0 ) )
         {
            standaloneNotModal1EM1546( ) ;
            getKey1EM1546( ) ;
            if ( ( nRcdExists_1546 == 0 ) && ( nRcdDeleted_1546 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1EM1546( ) ;
            }
            else
            {
               if ( RcdFound1546 != 0 )
               {
                  if ( ( nRcdDeleted_1546 != 0 ) && ( nRcdExists_1546 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1EM1546( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1546 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1EM1546( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1546 == 0 )
                  {
                     GXCCtl = "TAESLNP_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTaesLnP_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O11640TaesUltLnP = A11640TaesUltLnP ;
            n11640TaesUltLnP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1546_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1546, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTaesLnP_Internalname, GXutil.ltrim( localUtil.ntoc( A11641TaesLnP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtTaesCant_Internalname, GXutil.ltrim( localUtil.ntoc( A11642TaesCant, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtUniEstCod_Internalname, GXutil.rtrim( A2144UniEstCod)) ;
         httpContext.changePostValue( "ZT_"+"Z11641TaesLnP_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z11641TaesLnP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11642TaesCant_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z11642TaesCant, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_60_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z2144UniEstCod_"+sGXsfl_60_idx, GXutil.rtrim( Z2144UniEstCod)) ;
         httpContext.changePostValue( "T11642TaesCant_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O11642TaesCant, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T719PrdNum_"+sGXsfl_60_idx, GXutil.rtrim( O719PrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_1546_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1546, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1546_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1546, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1546_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1546, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1546 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1546_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1546_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAESLNP_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesLnP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAESCANT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UNIESTCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUniEstCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1EM1546( ) ;
      if ( AnyError != 0 )
      {
         O11640TaesUltLnP = s11640TaesUltLnP ;
         n11640TaesUltLnP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
      }
      nRcdExists_1546 = (short)(0) ;
      nIsMod_1546 = (short)(0) ;
      nRcdDeleted_1546 = (short)(0) ;
   }

   public void processLevel1EM1545( )
   {
      /* Save parent mode. */
      sMode1545 = Gx_mode ;
      processNestedLevel1EM1546( ) ;
      if ( AnyError != 0 )
      {
         O11640TaesUltLnP = s11640TaesUltLnP ;
         n11640TaesUltLnP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1545 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01EM17 */
      pr_default.execute(15, new Object[] {Boolean.valueOf(n11640TaesUltLnP), Short.valueOf(A11640TaesUltLnP), A396EmprCod, A11634TaesId, Short.valueOf(A11637TaesLn)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTAES01");
   }

   public void endLevel1EM1545( )
   {
      pr_default.close(4);
      if ( AnyError == 0 )
      {
         beforeComplete1EM1545( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttaes02");
         if ( AnyError == 0 )
         {
            confirmValues1EM0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttaes02");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1EM1545( )
   {
      /* Scan By routine */
      /* Using cursor T01EM18 */
      pr_default.execute(16, new Object[] {Short.valueOf(A11637TaesLn), Boolean.valueOf(n11638TaesVi), A11638TaesVi, Boolean.valueOf(n11639TaesVf), A11639TaesVf, A396EmprCod, A11634TaesId});
      RcdFound1545 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1545 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1EM1545( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound1545 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1545 = (short)(1) ;
      }
   }

   public void scanEnd1EM1545( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1EM1545( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1EM1545( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1EM1545( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1EM1545( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1EM1545( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1EM1545( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1EM1545( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtTaesId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesId_Enabled), 5, 0), true);
      edtTaesDc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesDc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesDc_Enabled), 5, 0), true);
      edtTaesLn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesLn_Enabled), 5, 0), true);
      edtTaesVi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesVi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesVi_Enabled), 5, 0), true);
      edtTaesVf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesVf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesVf_Enabled), 5, 0), true);
      edtTaesUltLnP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesUltLnP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesUltLnP_Enabled), 5, 0), true);
   }

   public void zm1EM1546( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11642TaesCant = T01EM3_A11642TaesCant[0] ;
            Z719PrdNum = T01EM3_A719PrdNum[0] ;
            Z2144UniEstCod = T01EM3_A2144UniEstCod[0] ;
         }
         else
         {
            Z11642TaesCant = A11642TaesCant ;
            Z719PrdNum = A719PrdNum ;
            Z2144UniEstCod = A2144UniEstCod ;
         }
      }
      if ( GX_JID == -11 )
      {
         Z11634TaesId = A11634TaesId ;
         Z11637TaesLn = A11637TaesLn ;
         Z11641TaesLnP = A11641TaesLnP ;
         Z11642TaesCant = A11642TaesCant ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z2144UniEstCod = A2144UniEstCod ;
         Z718PrdNom = A718PrdNom ;
      }
   }

   public void standaloneNotModal1EM1546( )
   {
      edtTaesUltLnP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesUltLnP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesUltLnP_Enabled), 5, 0), true);
      edtTaesUltLnP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesUltLnP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesUltLnP_Enabled), 5, 0), true);
   }

   public void standaloneModal1EM1546( )
   {
      if ( isIns( )  )
      {
         A11640TaesUltLnP = (short)(O11640TaesUltLnP+1) ;
         n11640TaesUltLnP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A11641TaesLnP = A11640TaesUltLnP ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTaesLnP_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTaesLnP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesLnP_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtTaesLnP_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTaesLnP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesLnP_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
   }

   public void load1EM1546( )
   {
      /* Using cursor T01EM19 */
      pr_default.execute(17, new Object[] {A396EmprCod, A11634TaesId, Short.valueOf(A11637TaesLn), Short.valueOf(A11641TaesLnP)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1546 = (short)(1) ;
         A718PrdNom = T01EM19_A718PrdNom[0] ;
         A11642TaesCant = T01EM19_A11642TaesCant[0] ;
         n11642TaesCant = T01EM19_n11642TaesCant[0] ;
         A719PrdNum = T01EM19_A719PrdNum[0] ;
         n719PrdNum = T01EM19_n719PrdNum[0] ;
         A2144UniEstCod = T01EM19_A2144UniEstCod[0] ;
         n2144UniEstCod = T01EM19_n2144UniEstCod[0] ;
         zm1EM1546( -11) ;
      }
      pr_default.close(17);
      onLoadActions1EM1546( ) ;
   }

   public void onLoadActions1EM1546( )
   {
   }

   public void checkExtendedTable1EM1546( )
   {
      nIsDirty_1546 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1EM1546( ) ;
      /* Using cursor T01EM4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01EM4_A718PrdNom[0] ;
      pr_default.close(2);
      /* Using cursor T01EM5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "UNIESTCOD_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIEST", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtUniEstCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1EM1546( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable1EM1546( )
   {
   }

   public void gxload_12( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01EM20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(18) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01EM20_A718PrdNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void gxload_13( String A2144UniEstCod )
   {
      /* Using cursor T01EM21 */
      pr_default.execute(19, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         GXCCtl = "UNIESTCOD_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIEST", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtUniEstCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void getKey1EM1546( )
   {
      /* Using cursor T01EM22 */
      pr_default.execute(20, new Object[] {A396EmprCod, A11634TaesId, Short.valueOf(A11637TaesLn), Short.valueOf(A11641TaesLnP)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1546 = (short)(1) ;
      }
      else
      {
         RcdFound1546 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey1EM1546( )
   {
      /* Using cursor T01EM3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A11634TaesId, Short.valueOf(A11637TaesLn), Short.valueOf(A11641TaesLnP)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01EM3_A11634TaesId[0], A11634TaesId) == 0 ) && ( T01EM3_A11637TaesLn[0] == A11637TaesLn ) && ( GXutil.strcmp(T01EM3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1EM1546( 11) ;
         RcdFound1546 = (short)(1) ;
         initializeNonKey1EM1546( ) ;
         A11641TaesLnP = T01EM3_A11641TaesLnP[0] ;
         A11642TaesCant = T01EM3_A11642TaesCant[0] ;
         n11642TaesCant = T01EM3_n11642TaesCant[0] ;
         A719PrdNum = T01EM3_A719PrdNum[0] ;
         n719PrdNum = T01EM3_n719PrdNum[0] ;
         A2144UniEstCod = T01EM3_A2144UniEstCod[0] ;
         n2144UniEstCod = T01EM3_n2144UniEstCod[0] ;
         O11642TaesCant = A11642TaesCant ;
         n11642TaesCant = false ;
         O719PrdNum = A719PrdNum ;
         n719PrdNum = false ;
         Z396EmprCod = A396EmprCod ;
         Z11634TaesId = A11634TaesId ;
         Z11637TaesLn = A11637TaesLn ;
         Z11641TaesLnP = A11641TaesLnP ;
         sMode1546 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1EM1546( ) ;
         load1EM1546( ) ;
         Gx_mode = sMode1546 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1546 = (short)(0) ;
         initializeNonKey1EM1546( ) ;
         sMode1546 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1EM1546( ) ;
         Gx_mode = sMode1546 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1EM1546( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1EM1546( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01EM2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A11634TaesId, Short.valueOf(A11637TaesLn), Short.valueOf(A11641TaesLnP)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTAES02"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z11642TaesCant, T01EM2_A11642TaesCant[0]) != 0 ) || ( GXutil.strcmp(Z719PrdNum, T01EM2_A719PrdNum[0]) != 0 ) || ( GXutil.strcmp(Z2144UniEstCod, T01EM2_A2144UniEstCod[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z11642TaesCant, T01EM2_A11642TaesCant[0]) != 0 )
            {
               GXutil.writeLogln("ttaes02:[seudo value changed for attri]"+"TaesCant");
               GXutil.writeLogRaw("Old: ",Z11642TaesCant);
               GXutil.writeLogRaw("Current: ",T01EM2_A11642TaesCant[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T01EM2_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("ttaes02:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T01EM2_A719PrdNum[0]);
            }
            if ( GXutil.strcmp(Z2144UniEstCod, T01EM2_A2144UniEstCod[0]) != 0 )
            {
               GXutil.writeLogln("ttaes02:[seudo value changed for attri]"+"UniEstCod");
               GXutil.writeLogRaw("Old: ",Z2144UniEstCod);
               GXutil.writeLogRaw("Current: ",T01EM2_A2144UniEstCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTAES02"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1EM1546( )
   {
      beforeValidate1EM1546( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EM1546( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1EM1546( 0) ;
         checkOptimisticConcurrency1EM1546( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1EM1546( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1EM1546( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EM23 */
                  pr_default.execute(21, new Object[] {A11634TaesId, Short.valueOf(A11637TaesLn), Short.valueOf(A11641TaesLnP), Boolean.valueOf(n11642TaesCant), A11642TaesCant, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTAES02");
                  if ( (pr_default.getStatus(21) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( ( ( GXutil.strcmp(A719PrdNum, O719PrdNum) != 0 ) ) || ( ( DecimalUtil.compareTo(A11642TaesCant, O11642TaesCant) != 0 ) ) && true /* After */ || true /* After */ || isDlt( )  )
                     {
                        AV32Modif = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
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
            load1EM1546( ) ;
         }
         endLevel1EM1546( ) ;
      }
      closeExtendedTableCursors1EM1546( ) ;
   }

   public void update1EM1546( )
   {
      beforeValidate1EM1546( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EM1546( ) ;
      }
      if ( ( nIsMod_1546 != 0 ) || ( nIsDirty_1546 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1EM1546( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1EM1546( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1EM1546( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01EM24 */
                     pr_default.execute(22, new Object[] {Boolean.valueOf(n11642TaesCant), A11642TaesCant, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n2144UniEstCod), A2144UniEstCod, A396EmprCod, A11634TaesId, Short.valueOf(A11637TaesLn), Short.valueOf(A11641TaesLnP)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTAES02");
                     if ( (pr_default.getStatus(22) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTAES02"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1EM1546( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( ( ( GXutil.strcmp(A719PrdNum, O719PrdNum) != 0 ) ) || ( ( DecimalUtil.compareTo(A11642TaesCant, O11642TaesCant) != 0 ) ) && true /* After */ || true /* After */ || isDlt( )  )
                        {
                           AV32Modif = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1EM1546( ) ;
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
            endLevel1EM1546( ) ;
         }
      }
      closeExtendedTableCursors1EM1546( ) ;
   }

   public void deferredUpdate1EM1546( )
   {
   }

   public void delete1EM1546( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1EM1546( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1EM1546( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1EM1546( ) ;
         afterConfirm1EM1546( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1EM1546( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01EM25 */
               pr_default.execute(23, new Object[] {A396EmprCod, A11634TaesId, Short.valueOf(A11637TaesLn), Short.valueOf(A11641TaesLnP)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTAES02");
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
      sMode1546 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1EM1546( ) ;
      Gx_mode = sMode1546 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1EM1546( )
   {
      standaloneModal1EM1546( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01EM26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         A718PrdNom = T01EM26_A718PrdNom[0] ;
         pr_default.close(24);
      }
   }

   public void endLevel1EM1546( )
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

   public void scanStart1EM1546( )
   {
      /* Scan By routine */
      /* Using cursor T01EM27 */
      pr_default.execute(25, new Object[] {A396EmprCod, A11634TaesId, Short.valueOf(A11637TaesLn)});
      RcdFound1546 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1546 = (short)(1) ;
         A11641TaesLnP = T01EM27_A11641TaesLnP[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1EM1546( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound1546 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1546 = (short)(1) ;
         A11641TaesLnP = T01EM27_A11641TaesLnP[0] ;
      }
   }

   public void scanEnd1EM1546( )
   {
      pr_default.close(25);
   }

   public void afterConfirm1EM1546( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1EM1546( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1EM1546( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1EM1546( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1EM1546( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1EM1546( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1EM1546( )
   {
      edtTaesLnP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesLnP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesLnP_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtTaesCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesCant_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtUniEstCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUniEstCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUniEstCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void send_integrity_lvl_hashes1EM1546( )
   {
   }

   public void send_integrity_lvl_hashes1EM1545( )
   {
   }

   public void subsflControlProps_601546( )
   {
      edtavnRcdDeleted_1546_Internalname = "vNRCDDELETED_1546_"+sGXsfl_60_idx ;
      edtTaesLnP_Internalname = "TAESLNP_"+sGXsfl_60_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_60_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_60_idx ;
      edtTaesCant_Internalname = "TAESCANT_"+sGXsfl_60_idx ;
      edtUniEstCod_Internalname = "UNIESTCOD_"+sGXsfl_60_idx ;
   }

   public void subsflControlProps_fel_601546( )
   {
      edtavnRcdDeleted_1546_Internalname = "vNRCDDELETED_1546_"+sGXsfl_60_fel_idx ;
      edtTaesLnP_Internalname = "TAESLNP_"+sGXsfl_60_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_60_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_60_fel_idx ;
      edtTaesCant_Internalname = "TAESCANT_"+sGXsfl_60_fel_idx ;
      edtUniEstCod_Internalname = "UNIESTCOD_"+sGXsfl_60_fel_idx ;
   }

   public void addRow1EM1546( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601546( ) ;
      sendRow1EM1546( ) ;
   }

   public void sendRow1EM1546( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1546_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1546_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1546, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1546_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1546), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1546), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1546_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1546_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1546_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTaesLnP_Internalname,GXutil.ltrim( localUtil.ntoc( A11641TaesLnP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11641TaesLnP), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTaesLnP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTaesLnP_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1546_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1546_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTaesCant_Internalname,GXutil.ltrim( localUtil.ntoc( A11642TaesCant, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTaesCant_Enabled!=0) ? localUtil.format( A11642TaesCant, "ZZZZZ9.999") : localUtil.format( A11642TaesCant, "ZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTaesCant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTaesCant_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1546_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUniEstCod_Internalname,GXutil.rtrim( A2144UniEstCod),GXutil.rtrim( localUtil.format( A2144UniEstCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUniEstCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtUniEstCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1EM1546( ) ;
      GXCCtl = "Z11641TaesLnP_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11641TaesLnP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11642TaesCant_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11642TaesCant, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z719PrdNum_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "Z2144UniEstCod_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2144UniEstCod));
      GXCCtl = "O11642TaesCant_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O11642TaesCant, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O719PrdNum_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O719PrdNum));
      GXCCtl = "nRcdDeleted_1546_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1546, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1546_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1546, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1546_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1546, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1546_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1546_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TAESLNP_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesLnP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TAESCANT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UNIESTCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUniEstCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1EM1546( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601546( ) ;
      edtavnRcdDeleted_1546_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1546_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTaesLnP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAESLNP_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTaesCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAESCANT_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtUniEstCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UNIESTCOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1546_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1546_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1546");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1546_Internalname ;
         wbErr = true ;
         nRcdDeleted_1546 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1546 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1546_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTaesLnP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTaesLnP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "TAESLNP_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTaesLnP_Internalname ;
         wbErr = true ;
         A11641TaesLnP = (short)(0) ;
      }
      else
      {
         A11641TaesLnP = (short)(localUtil.ctol( httpContext.cgiGet( edtTaesLnP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      n719PrdNum = false ;
      A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTaesCant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTaesCant_Internalname)), DecimalUtil.stringToDec("999999.999")) > 0 ) ) )
      {
         GXCCtl = "TAESCANT_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTaesCant_Internalname ;
         wbErr = true ;
         A11642TaesCant = DecimalUtil.ZERO ;
         n11642TaesCant = false ;
      }
      else
      {
         A11642TaesCant = localUtil.ctond( httpContext.cgiGet( edtTaesCant_Internalname)) ;
         n11642TaesCant = false ;
      }
      A2144UniEstCod = GXutil.upper( httpContext.cgiGet( edtUniEstCod_Internalname)) ;
      n2144UniEstCod = false ;
      GXCCtl = "Z11641TaesLnP_" + sGXsfl_60_idx ;
      Z11641TaesLnP = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11642TaesCant_" + sGXsfl_60_idx ;
      Z11642TaesCant = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_60_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2144UniEstCod_" + sGXsfl_60_idx ;
      Z2144UniEstCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O11642TaesCant_" + sGXsfl_60_idx ;
      O11642TaesCant = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O719PrdNum_" + sGXsfl_60_idx ;
      O719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1546_" + sGXsfl_60_idx ;
      nRcdDeleted_1546 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1546_" + sGXsfl_60_idx ;
      nRcdExists_1546 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1546_" + sGXsfl_60_idx ;
      nIsMod_1546 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtTaesLnP_Enabled = edtTaesLnP_Enabled ;
   }

   public void confirmValues1EM0( )
   {
      nGXsfl_60_idx = 0 ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601546( ) ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_601546( ) ;
         httpContext.changePostValue( "Z11641TaesLnP_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z11641TaesLnP_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11641TaesLnP_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z11642TaesCant_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z11642TaesCant_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11642TaesCant_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z2144UniEstCod_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z2144UniEstCod_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2144UniEstCod_"+sGXsfl_60_idx) ;
      }
      httpContext.changePostValue( "O11642TaesCant", httpContext.cgiGet( "T11642TaesCant")) ;
      httpContext.deletePostValue( "T11642TaesCant") ;
      httpContext.changePostValue( "O719PrdNum", httpContext.cgiGet( "T719PrdNum")) ;
      httpContext.deletePostValue( "T719PrdNum") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttaes02", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A11634TaesId)),GXutil.URLEncode(GXutil.rtrim(A11635TaesDc)),GXutil.URLEncode(GXutil.ltrimstr(A11637TaesLn,4,0)),GXutil.URLEncode(DecimalUtil.decToString(A11638TaesVi)),GXutil.URLEncode(DecimalUtil.decToString(A11639TaesVf))}, new String[] {"EmprCod","TaesId","TaesDc","TaesLn","TaesVi","TaesVf"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11634TaesId", GXutil.rtrim( Z11634TaesId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11637TaesLn", GXutil.ltrim( localUtil.ntoc( Z11637TaesLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11640TaesUltLnP", GXutil.ltrim( localUtil.ntoc( Z11640TaesUltLnP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O11640TaesUltLnP", GXutil.ltrim( localUtil.ntoc( O11640TaesUltLnP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_60", GXutil.ltrim( localUtil.ntoc( nGXsfl_60_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV34Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODIF", GXutil.rtrim( AV32Modif));
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
      return formatLink("app.ttaes02", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A11634TaesId)),GXutil.URLEncode(GXutil.rtrim(A11635TaesDc)),GXutil.URLEncode(GXutil.ltrimstr(A11637TaesLn,4,0)),GXutil.URLEncode(DecimalUtil.decToString(A11638TaesVi)),GXutil.URLEncode(DecimalUtil.decToString(A11639TaesVf))}, new String[] {"EmprCod","TaesId","TaesDc","TaesLn","TaesVi","TaesVf"})  ;
   }

   public String getPgmname( )
   {
      return "TTAES02" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TABLAS DE DOSIFICACION Productos", "") ;
   }

   public void initializeNonKey1EM1545( )
   {
      A11640TaesUltLnP = (short)(0) ;
      n11640TaesUltLnP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
      O11640TaesUltLnP = A11640TaesUltLnP ;
      n11640TaesUltLnP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
      Z11640TaesUltLnP = (short)(0) ;
   }

   public void initAll1EM1545( )
   {
      initializeNonKey1EM1545( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1EM1546( )
   {
      AV32Modif = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
      A719PrdNum = "" ;
      n719PrdNum = false ;
      A718PrdNom = "" ;
      A11642TaesCant = DecimalUtil.ZERO ;
      n11642TaesCant = false ;
      A2144UniEstCod = "" ;
      n2144UniEstCod = false ;
      O11642TaesCant = A11642TaesCant ;
      n11642TaesCant = false ;
      O719PrdNum = A719PrdNum ;
      n719PrdNum = false ;
      Z11642TaesCant = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      Z2144UniEstCod = "" ;
   }

   public void initAll1EM1546( )
   {
      A11641TaesLnP = (short)(0) ;
      initializeNonKey1EM1546( ) ;
   }

   public void standaloneModalInsert1EM1546( )
   {
      A11640TaesUltLnP = i11640TaesUltLnP ;
      n11640TaesUltLnP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11640TaesUltLnP), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241565487", true, true);
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
      httpContext.AddJavascriptSource("ttaes02.js", "?20268241565487", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1546( )
   {
      edtTaesLnP_Enabled = defedtTaesLnP_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesLnP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesLnP_Enabled), 5, 0), !bGXsfl_60_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1546, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1546_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11641TaesLnP, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesLnP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11642TaesCant, (byte)(10), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2144UniEstCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtUniEstCod_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtTaesId_Internalname = "TAESID" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtTaesDc_Internalname = "TAESDC" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtTaesLn_Internalname = "TAESLN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtTaesVi_Internalname = "TAESVI" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtTaesVf_Internalname = "TAESVF" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtTaesUltLnP_Internalname = "TAESULTLNP" ;
      edtavnRcdDeleted_1546_Internalname = "vNRCDDELETED_1546" ;
      edtTaesLnP_Internalname = "TAESLNP" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtTaesCant_Internalname = "TAESCANT" ;
      edtUniEstCod_Internalname = "UNIESTCOD" ;
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
      Form.setCaption( httpContext.getMessage( "TABLAS DE DOSIFICACION Productos", "") );
      edtUniEstCod_Jsonclick = "" ;
      edtTaesCant_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtTaesLnP_Jsonclick = "" ;
      edtavnRcdDeleted_1546_Jsonclick = "" ;
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
      edtUniEstCod_Enabled = 1 ;
      edtTaesCant_Enabled = 1 ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Enabled = 1 ;
      edtTaesLnP_Enabled = 1 ;
      edtavnRcdDeleted_1546_Enabled = 1 ;
      edtTaesUltLnP_Jsonclick = "" ;
      edtTaesUltLnP_Backcolor = (int)(0xFFFFFF) ;
      edtTaesUltLnP_Enabled = 0 ;
      edtTaesVf_Jsonclick = "" ;
      edtTaesVf_Backcolor = (int)(0xFFFFFF) ;
      edtTaesVf_Enabled = 0 ;
      edtTaesVi_Jsonclick = "" ;
      edtTaesVi_Backcolor = (int)(0xFFFFFF) ;
      edtTaesVi_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtTaesLn_Jsonclick = "" ;
      edtTaesLn_Backcolor = (int)(0xFFFFFF) ;
      edtTaesLn_Enabled = 0 ;
      edtTaesDc_Jsonclick = "" ;
      edtTaesDc_Backcolor = (int)(0xFFFFFF) ;
      edtTaesDc_Enabled = 0 ;
      edtTaesId_Jsonclick = "" ;
      edtTaesId_Backcolor = (int)(0xFFFFFF) ;
      edtTaesId_Enabled = 0 ;
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
      subsflControlProps_601546( ) ;
      while ( nGXsfl_60_idx <= nRC_GXsfl_60 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1EM1546( ) ;
         standaloneModal1EM1546( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1EM1546( ) ;
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_601546( ) ;
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
      /* Using cursor T01EM28 */
      pr_default.execute(26, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01EM28_A407EmprNom[0] ;
      n407EmprNom = T01EM28_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(26);
      /* Using cursor T01EM29 */
      pr_default.execute(27, new Object[] {A396EmprCod, A11634TaesId});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TABLAS DE DOSIFICACION", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TAESID");
         AnyError = (short)(1) ;
      }
      A11635TaesDc = T01EM29_A11635TaesDc[0] ;
      n11635TaesDc = T01EM29_n11635TaesDc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11635TaesDc", A11635TaesDc);
      pr_default.close(27);
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

   public void valid_Taesln( )
   {
      n11640TaesUltLnP = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A11640TaesUltLnP", GXutil.ltrim( localUtil.ntoc( A11640TaesUltLnP, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11635TaesDc", GXutil.rtrim( A11635TaesDc));
      httpContext.ajax_rsp_assign_attri("", false, "A11638TaesVi", GXutil.ltrim( localUtil.ntoc( A11638TaesVi, (byte)(10), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11639TaesVf", GXutil.ltrim( localUtil.ntoc( A11639TaesVf, (byte)(10), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", GXutil.rtrim( AV8UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11634TaesId", GXutil.rtrim( Z11634TaesId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11637TaesLn", GXutil.ltrim( localUtil.ntoc( Z11637TaesLn, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11640TaesUltLnP", GXutil.ltrim( localUtil.ntoc( Z11640TaesUltLnP, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11635TaesDc", GXutil.rtrim( Z11635TaesDc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11638TaesVi", GXutil.ltrim( localUtil.ntoc( Z11638TaesVi, (byte)(10), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11639TaesVf", GXutil.ltrim( localUtil.ntoc( Z11639TaesVf, (byte)(10), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV8UsurCod", GXutil.rtrim( ZV8UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "O11640TaesUltLnP", GXutil.ltrim( localUtil.ntoc( O11640TaesUltLnP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Prdnum( )
   {
      n719PrdNum = false ;
      /* Using cursor T01EM26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A718PrdNom = T01EM26_A718PrdNom[0] ;
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
   }

   public void valid_Uniestcod( )
   {
      n11640TaesUltLnP = false ;
      n719PrdNum = false ;
      n11642TaesCant = false ;
      n2144UniEstCod = false ;
      /* Using cursor T01EM30 */
      pr_default.execute(28, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIEST", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "UNIESTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUniEstCod_Internalname ;
      }
      pr_default.close(28);
      O11642TaesCant = A11642TaesCant ;
      n11642TaesCant = false ;
      O719PrdNum = A719PrdNum ;
      n719PrdNum = false ;
      O11640TaesUltLnP = A11640TaesUltLnP ;
      n11640TaesUltLnP = false ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11634TaesId',fld:'TAESID',pic:''},{av:'A11635TaesDc',fld:'TAESDC',pic:''},{av:'A11637TaesLn',fld:'TAESLN',pic:'ZZZ9'},{av:'A11638TaesVi',fld:'TAESVI',pic:'ZZZZZ9.999'},{av:'A11639TaesVf',fld:'TAESVF',pic:'ZZZZZ9.999'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_TAESID","{handler:'valid_Taesid',iparms:[]");
      setEventMetadata("VALID_TAESID",",oparms:[]}");
      setEventMetadata("VALID_TAESLN","{handler:'valid_Taesln',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A11640TaesUltLnP',fld:'TAESULTLNP',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11634TaesId',fld:'TAESID',pic:''},{av:'A11637TaesLn',fld:'TAESLN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''}]");
      setEventMetadata("VALID_TAESLN",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A11640TaesUltLnP',fld:'TAESULTLNP',pic:'ZZZ9'},{av:'A11635TaesDc',fld:'TAESDC',pic:''},{av:'A11638TaesVi',fld:'TAESVI',pic:'ZZZZZ9.999'},{av:'A11639TaesVf',fld:'TAESVF',pic:'ZZZZZ9.999'},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z11634TaesId'},{av:'Z11637TaesLn'},{av:'Z407EmprNom'},{av:'Z11640TaesUltLnP'},{av:'Z11635TaesDc'},{av:'Z11638TaesVi'},{av:'Z11639TaesVf'},{av:'ZV8UsurCod'},{av:'O11640TaesUltLnP'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_TAESULTLNP","{handler:'valid_Taesultlnp',iparms:[]");
      setEventMetadata("VALID_TAESULTLNP",",oparms:[]}");
      setEventMetadata("VALID_TAESLNP","{handler:'valid_Taeslnp',iparms:[]");
      setEventMetadata("VALID_TAESLNP",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''}]}");
      setEventMetadata("VALID_TAESCANT","{handler:'valid_Taescant',iparms:[]");
      setEventMetadata("VALID_TAESCANT",",oparms:[]}");
      setEventMetadata("VALID_UNIESTCOD","{handler:'valid_Uniestcod',iparms:[{av:'A11640TaesUltLnP',fld:'TAESULTLNP',pic:'ZZZ9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A11642TaesCant',fld:'TAESCANT',pic:'ZZZZZ9.999'},{av:'A2144UniEstCod',fld:'UNIESTCOD',pic:'@!'}]");
      setEventMetadata("VALID_UNIESTCOD",",oparms:[]}");
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
      pr_default.close(24);
      pr_default.close(28);
      pr_default.close(26);
      pr_default.close(27);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA11634TaesId = "" ;
      wcpOA11635TaesDc = "" ;
      wcpOA11638TaesVi = DecimalUtil.ZERO ;
      wcpOA11639TaesVf = DecimalUtil.ZERO ;
      Z396EmprCod = "" ;
      Z11634TaesId = "" ;
      Z11642TaesCant = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      Z2144UniEstCod = "" ;
      O11642TaesCant = DecimalUtil.ZERO ;
      O719PrdNum = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A2144UniEstCod = "" ;
      A11634TaesId = "" ;
      A11635TaesDc = "" ;
      A11638TaesVi = DecimalUtil.ZERO ;
      A11639TaesVf = DecimalUtil.ZERO ;
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
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1546 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV8UsurCod = "" ;
      AV34Pgmname = "" ;
      AV32Modif = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1545 = "" ;
      GXCCtl = "" ;
      A718PrdNom = "" ;
      A11642TaesCant = DecimalUtil.ZERO ;
      T11642TaesCant = DecimalUtil.ZERO ;
      T719PrdNum = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      Z11638TaesVi = DecimalUtil.ZERO ;
      Z11639TaesVf = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      Z11635TaesDc = "" ;
      T01EM8_A407EmprNom = new String[] {""} ;
      T01EM8_n407EmprNom = new boolean[] {false} ;
      T01EM9_A11635TaesDc = new String[] {""} ;
      T01EM9_n11635TaesDc = new boolean[] {false} ;
      T01EM10_A11635TaesDc = new String[] {""} ;
      T01EM10_n11635TaesDc = new boolean[] {false} ;
      T01EM10_A11637TaesLn = new short[1] ;
      T01EM10_A11638TaesVi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EM10_n11638TaesVi = new boolean[] {false} ;
      T01EM10_A11639TaesVf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EM10_n11639TaesVf = new boolean[] {false} ;
      T01EM10_A407EmprNom = new String[] {""} ;
      T01EM10_n407EmprNom = new boolean[] {false} ;
      T01EM10_A11640TaesUltLnP = new short[1] ;
      T01EM10_n11640TaesUltLnP = new boolean[] {false} ;
      T01EM10_A396EmprCod = new String[] {""} ;
      T01EM10_A11634TaesId = new String[] {""} ;
      T01EM11_A396EmprCod = new String[] {""} ;
      T01EM11_A11634TaesId = new String[] {""} ;
      T01EM11_A11637TaesLn = new short[1] ;
      T01EM7_A11637TaesLn = new short[1] ;
      T01EM7_A11638TaesVi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EM7_n11638TaesVi = new boolean[] {false} ;
      T01EM7_A11639TaesVf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EM7_n11639TaesVf = new boolean[] {false} ;
      T01EM7_A11640TaesUltLnP = new short[1] ;
      T01EM7_n11640TaesUltLnP = new boolean[] {false} ;
      T01EM7_A396EmprCod = new String[] {""} ;
      T01EM7_A11634TaesId = new String[] {""} ;
      T01EM12_A11637TaesLn = new short[1] ;
      T01EM12_A11638TaesVi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EM12_n11638TaesVi = new boolean[] {false} ;
      T01EM12_A11639TaesVf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EM12_n11639TaesVf = new boolean[] {false} ;
      T01EM12_A396EmprCod = new String[] {""} ;
      T01EM12_A11634TaesId = new String[] {""} ;
      T01EM13_A11637TaesLn = new short[1] ;
      T01EM13_A11638TaesVi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EM13_n11638TaesVi = new boolean[] {false} ;
      T01EM13_A11639TaesVf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EM13_n11639TaesVf = new boolean[] {false} ;
      T01EM13_A396EmprCod = new String[] {""} ;
      T01EM13_A11634TaesId = new String[] {""} ;
      T01EM6_A11637TaesLn = new short[1] ;
      T01EM6_A11638TaesVi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EM6_n11638TaesVi = new boolean[] {false} ;
      T01EM6_A11639TaesVf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EM6_n11639TaesVf = new boolean[] {false} ;
      T01EM6_A11640TaesUltLnP = new short[1] ;
      T01EM6_n11640TaesUltLnP = new boolean[] {false} ;
      T01EM6_A396EmprCod = new String[] {""} ;
      T01EM6_A11634TaesId = new String[] {""} ;
      T01EM18_A396EmprCod = new String[] {""} ;
      T01EM18_A11634TaesId = new String[] {""} ;
      T01EM18_A11637TaesLn = new short[1] ;
      Z718PrdNom = "" ;
      T01EM19_A11634TaesId = new String[] {""} ;
      T01EM19_A11637TaesLn = new short[1] ;
      T01EM19_A11641TaesLnP = new short[1] ;
      T01EM19_A718PrdNom = new String[] {""} ;
      T01EM19_A11642TaesCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EM19_n11642TaesCant = new boolean[] {false} ;
      T01EM19_A396EmprCod = new String[] {""} ;
      T01EM19_A719PrdNum = new String[] {""} ;
      T01EM19_n719PrdNum = new boolean[] {false} ;
      T01EM19_A2144UniEstCod = new String[] {""} ;
      T01EM19_n2144UniEstCod = new boolean[] {false} ;
      T01EM4_A718PrdNom = new String[] {""} ;
      T01EM5_A2144UniEstCod = new String[] {""} ;
      T01EM5_n2144UniEstCod = new boolean[] {false} ;
      T01EM20_A718PrdNom = new String[] {""} ;
      T01EM21_A2144UniEstCod = new String[] {""} ;
      T01EM21_n2144UniEstCod = new boolean[] {false} ;
      T01EM22_A396EmprCod = new String[] {""} ;
      T01EM22_A11634TaesId = new String[] {""} ;
      T01EM22_A11637TaesLn = new short[1] ;
      T01EM22_A11641TaesLnP = new short[1] ;
      T01EM3_A11634TaesId = new String[] {""} ;
      T01EM3_A11637TaesLn = new short[1] ;
      T01EM3_A11641TaesLnP = new short[1] ;
      T01EM3_A11642TaesCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EM3_n11642TaesCant = new boolean[] {false} ;
      T01EM3_A396EmprCod = new String[] {""} ;
      T01EM3_A719PrdNum = new String[] {""} ;
      T01EM3_n719PrdNum = new boolean[] {false} ;
      T01EM3_A2144UniEstCod = new String[] {""} ;
      T01EM3_n2144UniEstCod = new boolean[] {false} ;
      T01EM2_A11634TaesId = new String[] {""} ;
      T01EM2_A11637TaesLn = new short[1] ;
      T01EM2_A11641TaesLnP = new short[1] ;
      T01EM2_A11642TaesCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EM2_n11642TaesCant = new boolean[] {false} ;
      T01EM2_A396EmprCod = new String[] {""} ;
      T01EM2_A719PrdNum = new String[] {""} ;
      T01EM2_n719PrdNum = new boolean[] {false} ;
      T01EM2_A2144UniEstCod = new String[] {""} ;
      T01EM2_n2144UniEstCod = new boolean[] {false} ;
      T01EM26_A718PrdNom = new String[] {""} ;
      T01EM27_A396EmprCod = new String[] {""} ;
      T01EM27_A11634TaesId = new String[] {""} ;
      T01EM27_A11637TaesLn = new short[1] ;
      T01EM27_A11641TaesLnP = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01EM28_A407EmprNom = new String[] {""} ;
      T01EM28_n407EmprNom = new boolean[] {false} ;
      T01EM29_A11635TaesDc = new String[] {""} ;
      T01EM29_n11635TaesDc = new boolean[] {false} ;
      ZV8UsurCod = "" ;
      ZZ396EmprCod = "" ;
      ZZ11634TaesId = "" ;
      ZZ407EmprNom = "" ;
      ZZ11635TaesDc = "" ;
      ZZ11638TaesVi = DecimalUtil.ZERO ;
      ZZ11639TaesVf = DecimalUtil.ZERO ;
      ZZV8UsurCod = "" ;
      T01EM30_A2144UniEstCod = new String[] {""} ;
      T01EM30_n2144UniEstCod = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttaes02__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttaes02__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttaes02__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttaes02__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttaes02__default(),
         new Object[] {
             new Object[] {
            T01EM2_A11634TaesId, T01EM2_A11637TaesLn, T01EM2_A11641TaesLnP, T01EM2_A11642TaesCant, T01EM2_n11642TaesCant, T01EM2_A396EmprCod, T01EM2_A719PrdNum, T01EM2_n719PrdNum, T01EM2_A2144UniEstCod, T01EM2_n2144UniEstCod
            }
            , new Object[] {
            T01EM3_A11634TaesId, T01EM3_A11637TaesLn, T01EM3_A11641TaesLnP, T01EM3_A11642TaesCant, T01EM3_n11642TaesCant, T01EM3_A396EmprCod, T01EM3_A719PrdNum, T01EM3_n719PrdNum, T01EM3_A2144UniEstCod, T01EM3_n2144UniEstCod
            }
            , new Object[] {
            T01EM4_A718PrdNom
            }
            , new Object[] {
            T01EM5_A2144UniEstCod
            }
            , new Object[] {
            T01EM6_A11637TaesLn, T01EM6_A11638TaesVi, T01EM6_n11638TaesVi, T01EM6_A11639TaesVf, T01EM6_n11639TaesVf, T01EM6_A11640TaesUltLnP, T01EM6_n11640TaesUltLnP, T01EM6_A396EmprCod, T01EM6_A11634TaesId
            }
            , new Object[] {
            T01EM7_A11637TaesLn, T01EM7_A11638TaesVi, T01EM7_n11638TaesVi, T01EM7_A11639TaesVf, T01EM7_n11639TaesVf, T01EM7_A11640TaesUltLnP, T01EM7_n11640TaesUltLnP, T01EM7_A396EmprCod, T01EM7_A11634TaesId
            }
            , new Object[] {
            T01EM8_A407EmprNom, T01EM8_n407EmprNom
            }
            , new Object[] {
            T01EM9_A11635TaesDc, T01EM9_n11635TaesDc
            }
            , new Object[] {
            T01EM10_A11635TaesDc, T01EM10_n11635TaesDc, T01EM10_A11637TaesLn, T01EM10_A11638TaesVi, T01EM10_n11638TaesVi, T01EM10_A11639TaesVf, T01EM10_n11639TaesVf, T01EM10_A407EmprNom, T01EM10_n407EmprNom, T01EM10_A11640TaesUltLnP,
            T01EM10_n11640TaesUltLnP, T01EM10_A396EmprCod, T01EM10_A11634TaesId
            }
            , new Object[] {
            T01EM11_A396EmprCod, T01EM11_A11634TaesId, T01EM11_A11637TaesLn
            }
            , new Object[] {
            T01EM12_A11637TaesLn, T01EM12_A11638TaesVi, T01EM12_n11638TaesVi, T01EM12_A11639TaesVf, T01EM12_n11639TaesVf, T01EM12_A396EmprCod, T01EM12_A11634TaesId
            }
            , new Object[] {
            T01EM13_A11637TaesLn, T01EM13_A11638TaesVi, T01EM13_n11638TaesVi, T01EM13_A11639TaesVf, T01EM13_n11639TaesVf, T01EM13_A396EmprCod, T01EM13_A11634TaesId
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
            T01EM18_A396EmprCod, T01EM18_A11634TaesId, T01EM18_A11637TaesLn
            }
            , new Object[] {
            T01EM19_A11634TaesId, T01EM19_A11637TaesLn, T01EM19_A11641TaesLnP, T01EM19_A718PrdNom, T01EM19_A11642TaesCant, T01EM19_n11642TaesCant, T01EM19_A396EmprCod, T01EM19_A719PrdNum, T01EM19_n719PrdNum, T01EM19_A2144UniEstCod,
            T01EM19_n2144UniEstCod
            }
            , new Object[] {
            T01EM20_A718PrdNom
            }
            , new Object[] {
            T01EM21_A2144UniEstCod
            }
            , new Object[] {
            T01EM22_A396EmprCod, T01EM22_A11634TaesId, T01EM22_A11637TaesLn, T01EM22_A11641TaesLnP
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01EM26_A718PrdNom
            }
            , new Object[] {
            T01EM27_A396EmprCod, T01EM27_A11634TaesId, T01EM27_A11637TaesLn, T01EM27_A11641TaesLnP
            }
            , new Object[] {
            T01EM28_A407EmprNom, T01EM28_n407EmprNom
            }
            , new Object[] {
            T01EM29_A11635TaesDc, T01EM29_n11635TaesDc
            }
            , new Object[] {
            T01EM30_A2144UniEstCod
            }
         }
      );
      Z11639TaesVf = DecimalUtil.ZERO ;
      n11639TaesVf = false ;
      A11639TaesVf = DecimalUtil.ZERO ;
      n11639TaesVf = false ;
      Z11638TaesVi = DecimalUtil.ZERO ;
      n11638TaesVi = false ;
      A11638TaesVi = DecimalUtil.ZERO ;
      n11638TaesVi = false ;
      Z11637TaesLn = (short)(0) ;
      A11637TaesLn = (short)(0) ;
      Z11635TaesDc = "" ;
      n11635TaesDc = false ;
      A11635TaesDc = "" ;
      n11635TaesDc = false ;
      Z11634TaesId = "" ;
      A11634TaesId = "" ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV34Pgmname = "TTAES02" ;
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
   private short wcpOA11637TaesLn ;
   private short Z11637TaesLn ;
   private short Z11640TaesUltLnP ;
   private short O11640TaesUltLnP ;
   private short Z11641TaesLnP ;
   private short nRcdDeleted_1546 ;
   private short nRcdExists_1546 ;
   private short nIsMod_1546 ;
   private short A11637TaesLn ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A11640TaesUltLnP ;
   private short nBlankRcdCount1546 ;
   private short RcdFound1546 ;
   private short B11640TaesUltLnP ;
   private short nBlankRcdUsr1546 ;
   private short s11640TaesUltLnP ;
   private short A11641TaesLnP ;
   private short RcdFound1545 ;
   private short nIsDirty_1545 ;
   private short nIsDirty_1546 ;
   private short i11640TaesUltLnP ;
   private short ZZ11637TaesLn ;
   private short ZZ11640TaesUltLnP ;
   private short ZO11640TaesUltLnP ;
   private int nRC_GXsfl_60 ;
   private int nGXsfl_60_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtTaesId_Enabled ;
   private int edtTaesDc_Enabled ;
   private int edtTaesLn_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtTaesVi_Enabled ;
   private int edtTaesVf_Enabled ;
   private int edtTaesUltLnP_Enabled ;
   private int edtavnRcdDeleted_1546_Enabled ;
   private int edtTaesLnP_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtTaesCant_Enabled ;
   private int edtUniEstCod_Enabled ;
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
   private int defedtTaesLnP_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtTaesUltLnP_Backcolor ;
   private int edtTaesVf_Backcolor ;
   private int edtTaesVi_Backcolor ;
   private int edtTaesLn_Backcolor ;
   private int edtTaesDc_Backcolor ;
   private int edtTaesId_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal wcpOA11638TaesVi ;
   private java.math.BigDecimal wcpOA11639TaesVf ;
   private java.math.BigDecimal Z11642TaesCant ;
   private java.math.BigDecimal O11642TaesCant ;
   private java.math.BigDecimal A11638TaesVi ;
   private java.math.BigDecimal A11639TaesVf ;
   private java.math.BigDecimal A11642TaesCant ;
   private java.math.BigDecimal T11642TaesCant ;
   private java.math.BigDecimal Z11638TaesVi ;
   private java.math.BigDecimal Z11639TaesVf ;
   private java.math.BigDecimal ZZ11638TaesVi ;
   private java.math.BigDecimal ZZ11639TaesVf ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA11634TaesId ;
   private String wcpOA11635TaesDc ;
   private String Z396EmprCod ;
   private String Z11634TaesId ;
   private String Z719PrdNum ;
   private String Z2144UniEstCod ;
   private String O719PrdNum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A2144UniEstCod ;
   private String A11634TaesId ;
   private String A11635TaesDc ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtTaesId_Internalname ;
   private String edtTaesId_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtTaesDc_Internalname ;
   private String edtTaesDc_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtTaesLn_Internalname ;
   private String edtTaesLn_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtTaesVi_Internalname ;
   private String edtTaesVi_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtTaesVf_Internalname ;
   private String edtTaesVf_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtTaesUltLnP_Internalname ;
   private String edtTaesUltLnP_Jsonclick ;
   private String sMode1546 ;
   private String edtavnRcdDeleted_1546_Internalname ;
   private String edtTaesLnP_Internalname ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNom_Internalname ;
   private String edtTaesCant_Internalname ;
   private String edtUniEstCod_Internalname ;
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
   private String AV8UsurCod ;
   private String AV34Pgmname ;
   private String AV32Modif ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1545 ;
   private String GXCCtl ;
   private String A718PrdNom ;
   private String T719PrdNum ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z11635TaesDc ;
   private String Z718PrdNom ;
   private String sGXsfl_60_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1546_Jsonclick ;
   private String edtTaesLnP_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtTaesCant_Jsonclick ;
   private String edtUniEstCod_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZV8UsurCod ;
   private String ZZ396EmprCod ;
   private String ZZ11634TaesId ;
   private String ZZ407EmprNom ;
   private String ZZ11635TaesDc ;
   private String ZZV8UsurCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n719PrdNum ;
   private boolean n2144UniEstCod ;
   private boolean n11635TaesDc ;
   private boolean n11638TaesVi ;
   private boolean n11639TaesVf ;
   private boolean wbErr ;
   private boolean n11640TaesUltLnP ;
   private boolean bGXsfl_60_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n11642TaesCant ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01EM8_A407EmprNom ;
   private boolean[] T01EM8_n407EmprNom ;
   private String[] T01EM9_A11635TaesDc ;
   private boolean[] T01EM9_n11635TaesDc ;
   private String[] T01EM10_A11635TaesDc ;
   private boolean[] T01EM10_n11635TaesDc ;
   private short[] T01EM10_A11637TaesLn ;
   private java.math.BigDecimal[] T01EM10_A11638TaesVi ;
   private boolean[] T01EM10_n11638TaesVi ;
   private java.math.BigDecimal[] T01EM10_A11639TaesVf ;
   private boolean[] T01EM10_n11639TaesVf ;
   private String[] T01EM10_A407EmprNom ;
   private boolean[] T01EM10_n407EmprNom ;
   private short[] T01EM10_A11640TaesUltLnP ;
   private boolean[] T01EM10_n11640TaesUltLnP ;
   private String[] T01EM10_A396EmprCod ;
   private String[] T01EM10_A11634TaesId ;
   private String[] T01EM11_A396EmprCod ;
   private String[] T01EM11_A11634TaesId ;
   private short[] T01EM11_A11637TaesLn ;
   private short[] T01EM7_A11637TaesLn ;
   private java.math.BigDecimal[] T01EM7_A11638TaesVi ;
   private boolean[] T01EM7_n11638TaesVi ;
   private java.math.BigDecimal[] T01EM7_A11639TaesVf ;
   private boolean[] T01EM7_n11639TaesVf ;
   private short[] T01EM7_A11640TaesUltLnP ;
   private boolean[] T01EM7_n11640TaesUltLnP ;
   private String[] T01EM7_A396EmprCod ;
   private String[] T01EM7_A11634TaesId ;
   private short[] T01EM12_A11637TaesLn ;
   private java.math.BigDecimal[] T01EM12_A11638TaesVi ;
   private boolean[] T01EM12_n11638TaesVi ;
   private java.math.BigDecimal[] T01EM12_A11639TaesVf ;
   private boolean[] T01EM12_n11639TaesVf ;
   private String[] T01EM12_A396EmprCod ;
   private String[] T01EM12_A11634TaesId ;
   private short[] T01EM13_A11637TaesLn ;
   private java.math.BigDecimal[] T01EM13_A11638TaesVi ;
   private boolean[] T01EM13_n11638TaesVi ;
   private java.math.BigDecimal[] T01EM13_A11639TaesVf ;
   private boolean[] T01EM13_n11639TaesVf ;
   private String[] T01EM13_A396EmprCod ;
   private String[] T01EM13_A11634TaesId ;
   private short[] T01EM6_A11637TaesLn ;
   private java.math.BigDecimal[] T01EM6_A11638TaesVi ;
   private boolean[] T01EM6_n11638TaesVi ;
   private java.math.BigDecimal[] T01EM6_A11639TaesVf ;
   private boolean[] T01EM6_n11639TaesVf ;
   private short[] T01EM6_A11640TaesUltLnP ;
   private boolean[] T01EM6_n11640TaesUltLnP ;
   private String[] T01EM6_A396EmprCod ;
   private String[] T01EM6_A11634TaesId ;
   private String[] T01EM18_A396EmprCod ;
   private String[] T01EM18_A11634TaesId ;
   private short[] T01EM18_A11637TaesLn ;
   private String[] T01EM19_A11634TaesId ;
   private short[] T01EM19_A11637TaesLn ;
   private short[] T01EM19_A11641TaesLnP ;
   private String[] T01EM19_A718PrdNom ;
   private java.math.BigDecimal[] T01EM19_A11642TaesCant ;
   private boolean[] T01EM19_n11642TaesCant ;
   private String[] T01EM19_A396EmprCod ;
   private String[] T01EM19_A719PrdNum ;
   private boolean[] T01EM19_n719PrdNum ;
   private String[] T01EM19_A2144UniEstCod ;
   private boolean[] T01EM19_n2144UniEstCod ;
   private String[] T01EM4_A718PrdNom ;
   private String[] T01EM5_A2144UniEstCod ;
   private boolean[] T01EM5_n2144UniEstCod ;
   private String[] T01EM20_A718PrdNom ;
   private String[] T01EM21_A2144UniEstCod ;
   private boolean[] T01EM21_n2144UniEstCod ;
   private String[] T01EM22_A396EmprCod ;
   private String[] T01EM22_A11634TaesId ;
   private short[] T01EM22_A11637TaesLn ;
   private short[] T01EM22_A11641TaesLnP ;
   private String[] T01EM3_A11634TaesId ;
   private short[] T01EM3_A11637TaesLn ;
   private short[] T01EM3_A11641TaesLnP ;
   private java.math.BigDecimal[] T01EM3_A11642TaesCant ;
   private boolean[] T01EM3_n11642TaesCant ;
   private String[] T01EM3_A396EmprCod ;
   private String[] T01EM3_A719PrdNum ;
   private boolean[] T01EM3_n719PrdNum ;
   private String[] T01EM3_A2144UniEstCod ;
   private boolean[] T01EM3_n2144UniEstCod ;
   private String[] T01EM2_A11634TaesId ;
   private short[] T01EM2_A11637TaesLn ;
   private short[] T01EM2_A11641TaesLnP ;
   private java.math.BigDecimal[] T01EM2_A11642TaesCant ;
   private boolean[] T01EM2_n11642TaesCant ;
   private String[] T01EM2_A396EmprCod ;
   private String[] T01EM2_A719PrdNum ;
   private boolean[] T01EM2_n719PrdNum ;
   private String[] T01EM2_A2144UniEstCod ;
   private boolean[] T01EM2_n2144UniEstCod ;
   private String[] T01EM26_A718PrdNom ;
   private String[] T01EM27_A396EmprCod ;
   private String[] T01EM27_A11634TaesId ;
   private short[] T01EM27_A11637TaesLn ;
   private short[] T01EM27_A11641TaesLnP ;
   private String[] T01EM28_A407EmprNom ;
   private boolean[] T01EM28_n407EmprNom ;
   private String[] T01EM29_A11635TaesDc ;
   private boolean[] T01EM29_n11635TaesDc ;
   private String[] T01EM30_A2144UniEstCod ;
   private boolean[] T01EM30_n2144UniEstCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttaes02__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttaes02__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttaes02__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttaes02__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttaes02__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01EM2", "SELECT TaesId, TaesLn, TaesLnP, TaesCant, EmprCod, PrdNum, UniEstCod FROM TXPTAES02 WHERE EmprCod = ? AND TaesId = ? AND TaesLn = ? AND TaesLnP = ?  FOR UPDATE OF TaesCant, PrdNum, UniEstCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EM3", "SELECT TaesId, TaesLn, TaesLnP, TaesCant, EmprCod, PrdNum, UniEstCod FROM TXPTAES02 WHERE EmprCod = ? AND TaesId = ? AND TaesLn = ? AND TaesLnP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EM4", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EM5", "SELECT UniEstCod FROM TXPUNIEST WHERE UniEstCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EM6", "SELECT TaesLn, TaesVi, TaesVf, TaesUltLnP, EmprCod, TaesId FROM TXPTAES01 WHERE EmprCod = ? AND TaesId = ? AND TaesLn = ?  FOR UPDATE OF TaesVi, TaesVf, TaesUltLnP NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EM7", "SELECT TaesLn, TaesVi, TaesVf, TaesUltLnP, EmprCod, TaesId FROM TXPTAES01 WHERE EmprCod = ? AND TaesId = ? AND TaesLn = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EM8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EM9", "SELECT TaesDc FROM TXPTAES00 WHERE EmprCod = ? AND TaesId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EM10", "SELECT /*+ FIRST_ROWS(1) */ T3.TaesDc, TM1.TaesLn, TM1.TaesVi, TM1.TaesVf, T2.EmprNom, TM1.TaesUltLnP, TM1.EmprCod, TM1.TaesId FROM ((TXPTAES01 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPTAES00 T3 ON T3.EmprCod = TM1.EmprCod AND T3.TaesId = TM1.TaesId) WHERE TM1.TaesLn = ? and TM1.TaesVi = ? and TM1.TaesVf = ? and TM1.EmprCod = ? and TM1.TaesId = ? ORDER BY TM1.EmprCod, TM1.TaesId, TM1.TaesLn ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EM11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, TaesId, TaesLn FROM TXPTAES01 WHERE EmprCod = ? AND TaesId = ? AND TaesLn = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EM12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ TaesLn, TaesVi, TaesVf, EmprCod, TaesId FROM TXPTAES01 WHERE TaesLn = ? and TaesVi = ? and TaesVf = ? and EmprCod = ? and TaesId = ? ORDER BY EmprCod, TaesId, TaesLn) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EM13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ TaesLn, TaesVi, TaesVf, EmprCod, TaesId FROM TXPTAES01 WHERE TaesLn = ? and TaesVi = ? and TaesVf = ? and EmprCod = ? and TaesId = ? ORDER BY EmprCod DESC, TaesId DESC, TaesLn DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01EM14", "INSERT INTO TXPTAES01(TaesLn, TaesVi, TaesVf, TaesUltLnP, EmprCod, TaesId) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTAES01")
         ,new UpdateCursor("T01EM15", "UPDATE TXPTAES01 SET TaesVi=?, TaesVf=?, TaesUltLnP=?  WHERE EmprCod = ? AND TaesId = ? AND TaesLn = ?", GX_NOMASK, "TXPTAES01")
         ,new UpdateCursor("T01EM16", "DELETE FROM TXPTAES01  WHERE EmprCod = ? AND TaesId = ? AND TaesLn = ?", GX_NOMASK, "TXPTAES01")
         ,new UpdateCursor("T01EM17", "UPDATE TXPTAES01 SET TaesUltLnP=?  WHERE EmprCod = ? AND TaesId = ? AND TaesLn = ?", GX_NOMASK, "TXPTAES01")
         ,new ForEachCursor("T01EM18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, TaesId, TaesLn FROM TXPTAES01 WHERE TaesLn = ? and TaesVi = ? and TaesVf = ? and EmprCod = ? and TaesId = ? ORDER BY EmprCod, TaesId, TaesLn ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EM19", "SELECT T1.TaesId, T1.TaesLn, T1.TaesLnP, T2.PrdNom, T1.TaesCant, T1.EmprCod, T1.PrdNum, T1.UniEstCod FROM (TXPTAES02 T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.TaesId = ? and T1.TaesLn = ? and T1.TaesLnP = ? ORDER BY T1.EmprCod, T1.TaesId, T1.TaesLn, T1.TaesLnP ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EM20", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EM21", "SELECT UniEstCod FROM TXPUNIEST WHERE UniEstCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EM22", "SELECT EmprCod, TaesId, TaesLn, TaesLnP FROM TXPTAES02 WHERE EmprCod = ? AND TaesId = ? AND TaesLn = ? AND TaesLnP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01EM23", "INSERT INTO TXPTAES02(TaesId, TaesLn, TaesLnP, TaesCant, EmprCod, PrdNum, UniEstCod) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTAES02")
         ,new UpdateCursor("T01EM24", "UPDATE TXPTAES02 SET TaesCant=?, PrdNum=?, UniEstCod=?  WHERE EmprCod = ? AND TaesId = ? AND TaesLn = ? AND TaesLnP = ?", GX_NOMASK, "TXPTAES02")
         ,new UpdateCursor("T01EM25", "DELETE FROM TXPTAES02  WHERE EmprCod = ? AND TaesId = ? AND TaesLn = ? AND TaesLnP = ?", GX_NOMASK, "TXPTAES02")
         ,new ForEachCursor("T01EM26", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EM27", "SELECT EmprCod, TaesId, TaesLn, TaesLnP FROM TXPTAES02 WHERE EmprCod = ? and TaesId = ? and TaesLn = ? ORDER BY EmprCod, TaesId, TaesLn, TaesLnP ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EM28", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EM29", "SELECT TaesDc FROM TXPTAES00 WHERE EmprCod = ? AND TaesId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EM30", "SELECT UniEstCod FROM TXPUNIEST WHERE UniEstCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((String[]) buf[8])[0] = rslt.getString(6, 6);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((String[]) buf[8])[0] = rslt.getString(6, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 80);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 80);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((String[]) buf[12])[0] = rslt.getString(8, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               return;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 80);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 3);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 3);
               }
               stmt.setString(4, (String)parms[5], 3);
               stmt.setString(5, (String)parms[6], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 3);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 3);
               }
               stmt.setString(4, (String)parms[5], 3);
               stmt.setString(5, (String)parms[6], 6);
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 3);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 3);
               }
               stmt.setString(4, (String)parms[5], 3);
               stmt.setString(5, (String)parms[6], 6);
               return;
            case 12 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 3);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 3);
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
               stmt.setString(6, (String)parms[8], 6);
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 3);
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
               stmt.setString(5, (String)parms[7], 6);
               stmt.setShort(6, ((Number) parms[8]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
            case 16 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 3);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 3);
               }
               stmt.setString(4, (String)parms[5], 3);
               stmt.setString(5, (String)parms[6], 6);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 3);
               }
               stmt.setString(5, (String)parms[5], 3);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 6);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 3);
               }
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 6);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 3);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setString(5, (String)parms[7], 6);
               stmt.setShort(6, ((Number) parms[8]).shortValue());
               stmt.setShort(7, ((Number) parms[9]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 28 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
      }
   }

}

